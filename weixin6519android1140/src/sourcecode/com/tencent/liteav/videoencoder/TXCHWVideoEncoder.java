package com.tencent.liteav.videoencoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.EncoderCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.tencent.liteav.basic.opengl.EGL10Helper;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.opengl.TXCRotation;
import com.tencent.liteav.basic.opengl.TXCTextureRotationUtil;
import com.tencent.liteav.basic.serverconfig.TXCConfigCenter;
import com.tencent.liteav.basic.util.TXCThread;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.ArrayDeque;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

public class TXCHWVideoEncoder
  extends TXIVideoEncoder
{
  private static final boolean DEBUG = false;
  private static final String TAG = TXCHWVideoEncoder.class.getSimpleName();
  private static final String mMimeType = "video/avc";
  private int countInput = 0;
  private int countOutput = 0;
  private Runnable decodeTask = new Runnable()
  {
    public void run()
    {
      TXCHWVideoEncoder.this.onMsgDequeueEncoder();
    }
  };
  private Runnable endTask = new Runnable()
  {
    public void run()
    {
      TXCHWVideoEncoder.this.onMsgEnd();
    }
  };
  private boolean mAppendSpsPps = true;
  private int mBitrate = 0;
  private volatile long mCurrentPTS = 0L;
  private ArrayDeque<Long> mDtsMSQueue = new ArrayDeque(10);
  private EGL10Helper mEGL10Helper;
  private boolean mEnableAnnexb = false;
  public TXCThread mEncThread = null;
  private long mEncodeBytesForThisGOP = 0L;
  private long mEncodeFrameCountForFPS = 0L;
  private MediaCodec mEncoder = null;
  private int mEncoderInitFPS = 0;
  private Surface mEncoderInputSurface = null;
  private boolean mEndEncoder = true;
  private boolean mEndInput = true;
  private long mFirstDTS = 0L;
  private long mFirstPTS = 0L;
  private long mFrameIndex = 0L;
  private long mGopFrameIndex = 0L;
  private long mGopIndex = 0L;
  private long mLastBitrate = 0L;
  private long mLastDTSMS = 0L;
  private long mLastFPSTickMS = 0L;
  private long mLastIFrameTickMS = 0L;
  private ByteBuffer[] mOutputBuffers = null;
  private long mRealBitrate = 0L;
  private long mRealFPS = 0L;
  private byte[] mSpsPps = null;
  private Runnable renderTask = new Runnable()
  {
    public void run()
    {
      TXCHWVideoEncoder.this.onMsgRend();
    }
  };
  private long tick = 0L;
  
  @TargetApi(16)
  private MediaFormat createFormat(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    int i = 0;
    if ((paramInt1 == 0) || (paramInt2 == 0) || (paramInt3 == 0) || (paramInt4 == 0) || (paramInt7 == 0)) {
      return null;
    }
    MediaFormat localMediaFormat = MediaFormat.createVideoFormat("video/avc", paramInt1, paramInt2);
    localMediaFormat.setInteger("bitrate", paramInt3 * 1024);
    localMediaFormat.setInteger("frame-rate", paramInt4);
    localMediaFormat.setInteger("color-format", 2130708361);
    localMediaFormat.setInteger("i-frame-interval", paramInt5);
    if (Build.VERSION.SDK_INT >= 21)
    {
      Object localObject = selectCodec("video/avc");
      if (localObject == null) {
        return localMediaFormat;
      }
      localObject = ((MediaCodecInfo)localObject).getCapabilitiesForType("video/avc");
      MediaCodecInfo.EncoderCapabilities localEncoderCapabilities = ((MediaCodecInfo.CodecCapabilities)localObject).getEncoderCapabilities();
      if (localEncoderCapabilities.isBitrateModeSupported(paramInt6)) {
        localMediaFormat.setInteger("bitrate-mode", paramInt6);
      }
      for (;;)
      {
        localMediaFormat.setInteger("level", 1024);
        localMediaFormat.setInteger("complexity", ((Integer)localEncoderCapabilities.getComplexityRange().clamp(Integer.valueOf(5))).intValue());
        localObject = ((MediaCodecInfo.CodecCapabilities)localObject).profileLevels;
        paramInt4 = localObject.length;
        paramInt2 = 0;
        paramInt1 = i;
        while (paramInt1 < paramInt4)
        {
          localEncoderCapabilities = localObject[paramInt1];
          paramInt3 = paramInt2;
          if (localEncoderCapabilities.profile <= paramInt7)
          {
            paramInt3 = paramInt2;
            if (localEncoderCapabilities.profile > paramInt2)
            {
              paramInt3 = localEncoderCapabilities.profile;
              localMediaFormat.setInteger("profile", localEncoderCapabilities.profile);
            }
          }
          paramInt1 += 1;
          paramInt2 = paramInt3;
        }
        localMediaFormat.setInteger("bitrate-mode", 2);
      }
    }
    return localMediaFormat;
  }
  
  private long dequeDTSMS()
  {
    Long localLong = (Long)this.mDtsMSQueue.poll();
    if (localLong == null) {
      return 0L;
    }
    return localLong.longValue();
  }
  
  private void destroyGL()
  {
    if (this.mInputFilter != null)
    {
      this.mInputFilter.destroy();
      this.mInputFilter = null;
    }
    if (this.mEncodeFilter != null)
    {
      this.mEncodeFilter.destroy();
      this.mEncodeFilter = null;
    }
    if (this.mEGL10Helper != null)
    {
      this.mEGL10Helper.release();
      this.mEGL10Helper = null;
    }
  }
  
  private void enqueDTSMS(long paramLong)
  {
    this.mDtsMSQueue.add(Long.valueOf(paramLong));
  }
  
  @TargetApi(16)
  private static MediaCodecInfo selectCodec(String paramString)
  {
    int k = MediaCodecList.getCodecCount();
    int i = 0;
    while (i < k)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
      if (localMediaCodecInfo.isEncoder())
      {
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        int m = arrayOfString.length;
        int j = 0;
        while (j < m)
        {
          if (arrayOfString[j].equalsIgnoreCase(paramString)) {
            return localMediaCodecInfo;
          }
          j += 1;
        }
      }
      i += 1;
    }
    return null;
  }
  
  private int setNalData(int paramInt1, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt3)
  {
    int i = paramInt3;
    if (paramInt2 > 0)
    {
      i = paramInt3;
      if (paramInt1 > paramInt2)
      {
        paramInt1 -= paramInt2;
        ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[4]);
        localByteBuffer.asIntBuffer().put(paramInt1);
        localByteBuffer.order(ByteOrder.BIG_ENDIAN);
        System.arraycopy(localByteBuffer.array(), 0, paramArrayOfByte1, paramInt3, 4);
        System.arraycopy(paramArrayOfByte2, paramInt2, paramArrayOfByte1, paramInt3 + 4, paramInt1);
        i = paramInt3 + (paramInt1 + 4);
      }
    }
    return i;
  }
  
  private boolean setupGL(Surface paramSurface)
  {
    if (paramSurface == null) {
      return false;
    }
    EGLContext localEGLContext2 = this.mGLContextExternal;
    EGLContext localEGLContext1 = localEGLContext2;
    if (localEGLContext2 == null) {
      localEGLContext1 = EGL10.EGL_NO_CONTEXT;
    }
    this.mEGL10Helper = EGL10Helper.createEGLSurface(null, localEGLContext1, paramSurface, 1, 1);
    if (this.mEGL10Helper == null) {
      return false;
    }
    this.mEncodeFilter = new TXCGPUFilter();
    this.mEncodeFilter.init();
    return true;
  }
  
  private byte[] transferAnnexbToAvcc(byte[] paramArrayOfByte)
  {
    int i2 = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[i2 + 20];
    int i = 0;
    int n = 0;
    int k;
    for (int m = 0;; m = k)
    {
      int i1 = i;
      int j = n;
      k = m;
      if (i < i2)
      {
        if ((paramArrayOfByte[i] != 0) || (paramArrayOfByte[(i + 1)] != 0) || (paramArrayOfByte[(i + 2)] != 1)) {
          break label151;
        }
        k = setNalData(i, n, arrayOfByte, paramArrayOfByte, m);
        i1 = i + 3;
        j = i1;
      }
      while ((i1 == i2 - 4) && ((paramArrayOfByte[(i1 + 1)] != 0) || (paramArrayOfByte[(i1 + 2)] != 0) || (paramArrayOfByte[(i1 + 3)] != 1)))
      {
        i1 = i2;
        i = setNalData(i1, j, arrayOfByte, paramArrayOfByte, k);
        paramArrayOfByte = new byte[i];
        System.arraycopy(arrayOfByte, 0, paramArrayOfByte, 0, i);
        return paramArrayOfByte;
        label151:
        i1 = i;
        j = n;
        k = m;
        if (paramArrayOfByte[i] == 0)
        {
          i1 = i;
          j = n;
          k = m;
          if (paramArrayOfByte[(i + 1)] == 0)
          {
            i1 = i;
            j = n;
            k = m;
            if (paramArrayOfByte[(i + 2)] == 0)
            {
              i1 = i;
              j = n;
              k = m;
              if (paramArrayOfByte[(i + 3)] == 1)
              {
                k = setNalData(i, n, arrayOfByte, paramArrayOfByte, m);
                i1 = i + 4;
                j = i1;
              }
            }
          }
        }
      }
      i = i1 + 1;
      n = j;
    }
  }
  
  public long getRealBitrate()
  {
    return this.mRealBitrate;
  }
  
  public long getRealFPS()
  {
    return this.mRealFPS;
  }
  
  public void onMsgDequeueEncoder()
  {
    if (this.mEncoder == null) {
      if (!this.mEndEncoder) {
        this.mEncThread.runAsyncDelay(this.decodeTask, 10L);
      }
    }
    MediaCodec.BufferInfo localBufferInfo;
    ByteBuffer localByteBuffer;
    for (;;)
    {
      return;
      localBufferInfo = new MediaCodec.BufferInfo();
      int m;
      try
      {
        m = this.mEncoder.dequeueOutputBuffer(localBufferInfo, 5000L);
        if (m == -1)
        {
          if (this.mEndEncoder) {
            continue;
          }
          this.mEncThread.runAsyncDelay(this.decodeTask, 10L);
          return;
        }
      }
      catch (IllegalStateException localIllegalStateException1)
      {
        this.mEndEncoder = true;
        this.mEncThread.runAsync(this.endTask);
        callDelegate(10000005);
        return;
      }
      if (m == -3) {
        this.mOutputBuffers = this.mEncoder.getOutputBuffers();
      }
      while (!this.mEndEncoder)
      {
        this.mEncThread.runAsync(this.decodeTask);
        return;
        if (m == -2)
        {
          callDelegate(this.mEncoder.getOutputFormat());
        }
        else
        {
          if (m < 0)
          {
            this.mEndEncoder = true;
            this.mEncThread.runAsync(this.endTask);
            callDelegate(10000005);
            return;
          }
          localByteBuffer = this.mOutputBuffers[m];
          if (localByteBuffer != null) {
            break label248;
          }
          this.mEndEncoder = true;
          this.mEncThread.runAsync(this.endTask);
          callDelegate(10000005);
          try
          {
            this.mEncoder.releaseOutputBuffer(m, false);
          }
          catch (IllegalStateException localIllegalStateException2) {}
        }
      }
    }
    label248:
    byte[] arrayOfByte1 = new byte[localBufferInfo.size];
    localByteBuffer.position(localBufferInfo.offset);
    localByteBuffer.limit(localBufferInfo.offset + localBufferInfo.size);
    localByteBuffer.get(arrayOfByte1, 0, localBufferInfo.size);
    int j = arrayOfByte1.length;
    int i;
    label356:
    int k;
    label406:
    Object localObject;
    if ((localBufferInfo.size > 5) && (arrayOfByte1[0] == 0) && (arrayOfByte1[1] == 0) && (arrayOfByte1[2] == 0) && (arrayOfByte1[3] == 0) && (arrayOfByte1[4] == 0) && (arrayOfByte1[5] == 0))
    {
      i = 3;
      if (i < j - 4) {
        if ((arrayOfByte1[i] == 0) && (arrayOfByte1[(i + 1)] == 0) && (arrayOfByte1[(i + 2)] == 0) && (arrayOfByte1[(i + 3)] == 1))
        {
          k = j - i;
          j = i;
          i = k;
          localObject = new byte[i];
          System.arraycopy(arrayOfByte1, j, localObject, 0, i);
        }
      }
    }
    for (;;)
    {
      if (localBufferInfo.size == 0)
      {
        this.mEndEncoder = true;
        this.mEncThread.runAsync(this.endTask);
        callDelegate(10000005);
        break;
        i += 1;
        break label356;
      }
      i = 1;
      if ((localBufferInfo.flags & 0x2) == 2)
      {
        if (this.mEnableAnnexb)
        {
          this.mSpsPps = ((byte[])((byte[])localObject).clone());
          break;
        }
        this.mSpsPps = transferAnnexbToAvcc((byte[])((byte[])localObject).clone());
        break;
      }
      byte[] arrayOfByte2;
      if ((localBufferInfo.flags & 0x1) == 1)
      {
        i = 0;
        if (this.mEnableAnnexb)
        {
          arrayOfByte2 = new byte[this.mSpsPps.length + localObject.length];
          System.arraycopy(this.mSpsPps, 0, arrayOfByte2, 0, this.mSpsPps.length);
          System.arraycopy(localObject, 0, arrayOfByte2, this.mSpsPps.length, localObject.length);
          localObject = arrayOfByte2;
        }
      }
      label585:
      label766:
      label1030:
      label1041:
      label1104:
      for (;;)
      {
        long l2 = dequeDTSMS();
        long l1 = localBufferInfo.presentationTimeUs / 1000L;
        if (this.mFirstDTS == 0L) {
          this.mFirstDTS = l2;
        }
        if (this.mFirstPTS == 0L) {
          this.mFirstPTS = l1;
        }
        long l3 = l1 + (this.mFirstDTS - this.mFirstPTS);
        l1 = l2;
        if (l2 <= this.mLastDTSMS) {
          l1 = this.mLastDTSMS + 1L;
        }
        l2 = l1;
        if (l1 > l3) {
          l2 = l3;
        }
        this.mLastDTSMS = l2;
        l1 = TXCTimeUtil.getTimeTick();
        if (i == 0)
        {
          if (l1 > this.mLastIFrameTickMS + 1000L)
          {
            this.mRealBitrate = ((this.mEncodeBytesForThisGOP * 8000.0D / (l1 - this.mLastIFrameTickMS) / 1024.0D));
            this.mEncodeBytesForThisGOP = 0L;
            this.mLastIFrameTickMS = l1;
          }
          this.mGopIndex += 1L;
          this.mGopFrameIndex = 0L;
          this.mEncodeBytesForThisGOP += localObject.length;
          if (l1 > this.mLastFPSTickMS + 2000L)
          {
            this.mRealFPS = ((this.mEncodeFrameCountForFPS * 1000.0D / (l1 - this.mLastFPSTickMS)));
            this.mEncodeFrameCountForFPS = 0L;
            this.mLastFPSTickMS = l1;
          }
          this.mEncodeFrameCountForFPS += 1L;
          localByteBuffer.position(localBufferInfo.offset);
          if (!this.mAppendSpsPps) {
            break label1041;
          }
          l2 = this.mGopIndex;
          l4 = this.mGopFrameIndex;
          l5 = this.mFrameIndex;
          if (i != 0) {
            break label1030;
          }
        }
        for (l1 = 0L;; l1 = this.mGopFrameIndex - 1L)
        {
          callDelegate((byte[])localObject, i, l2, l4, l5, l1, l3, l3, 0, localByteBuffer, localBufferInfo);
          this.mFrameIndex += 1L;
          if ((localBufferInfo.flags & 0x4) == 0) {
            break;
          }
          this.mEndEncoder = true;
          this.mEncThread.runAsync(this.endTask);
          break;
          arrayOfByte2 = transferAnnexbToAvcc((byte[])localObject);
          localObject = new byte[this.mSpsPps.length + arrayOfByte2.length];
          System.arraycopy(this.mSpsPps, 0, localObject, 0, this.mSpsPps.length);
          System.arraycopy(arrayOfByte2, 0, localObject, this.mSpsPps.length, arrayOfByte2.length);
          break label585;
          if (this.mEnableAnnexb) {
            break label1104;
          }
          localObject = transferAnnexbToAvcc((byte[])localObject);
          break label585;
          this.mGopFrameIndex += 1L;
          break label766;
        }
        l2 = this.mGopIndex;
        long l4 = this.mGopFrameIndex;
        long l5 = this.mFrameIndex;
        if (i == 0) {}
        for (l1 = 0L;; l1 = this.mGopFrameIndex - 1L)
        {
          callDelegate(arrayOfByte1, i, l2, l4, l5, l1, l3, l3, 0, localByteBuffer, localBufferInfo);
          break;
        }
      }
      k = 0;
      i = j;
      j = k;
      break label406;
      localObject = arrayOfByte1;
    }
  }
  
  public void onMsgEnd()
  {
    this.mEndEncoder = true;
    this.mEndInput = true;
    destroyGL();
    try
    {
      if (this.mEncoder != null)
      {
        if (Build.VERSION.SDK_INT >= 18) {
          this.mEncoder.signalEndOfInputStream();
        }
        this.mEncoder.stop();
        this.mEncoder.release();
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
    this.mEncoder = null;
    this.mRealBitrate = 0L;
    this.mRealFPS = 0L;
    this.mLastIFrameTickMS = 0L;
    this.mLastFPSTickMS = 0L;
    this.mEncoderInitFPS = 0;
    this.mLastBitrate = 0L;
    this.mGopIndex = 0L;
    this.mGopFrameIndex = 0L;
    this.mFrameIndex = 0L;
    this.mLastDTSMS = 0L;
    this.mEncodeBytesForThisGOP = 0L;
    this.mEncodeFrameCountForFPS = 0L;
    this.mGLContextExternal = null;
    this.mOutputBuffers = null;
    this.mSpsPps = null;
    this.mCurrentPTS = 0L;
    this.mOutputWidth = 0;
    this.mOutputHeight = 0;
    this.mInit = false;
    this.mDtsMSQueue.clear();
  }
  
  @TargetApi(18)
  public boolean onMsgInitEncoder(TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    int j = 2;
    this.mEndInput = false;
    this.mEndEncoder = false;
    this.mRealBitrate = 0L;
    this.mRealFPS = 0L;
    this.mLastIFrameTickMS = 0L;
    this.mLastFPSTickMS = 0L;
    this.mEncoderInitFPS = 0;
    this.mLastBitrate = 0L;
    this.mGopIndex = 0L;
    this.mGopFrameIndex = 0L;
    this.mFrameIndex = 0L;
    this.mLastDTSMS = 0L;
    this.mEncodeBytesForThisGOP = 0L;
    this.mEncodeFrameCountForFPS = 0L;
    this.mOutputBuffers = null;
    this.mSpsPps = null;
    this.mCurrentPTS = 0L;
    this.mEnableAnnexb = paramTXSVideoEncoderParam.annexb;
    this.mAppendSpsPps = paramTXSVideoEncoderParam.appendSpsPps;
    this.mDtsMSQueue.clear();
    if ((paramTXSVideoEncoderParam == null) || (paramTXSVideoEncoderParam.width == 0) || (paramTXSVideoEncoderParam.height == 0) || (paramTXSVideoEncoderParam.fps == 0) || (paramTXSVideoEncoderParam.gop == 0))
    {
      this.mEndEncoder = true;
      return false;
    }
    if (this.mBitrate == 0) {
      this.mBitrate = ((int)(Math.sqrt(paramTXSVideoEncoderParam.width * paramTXSVideoEncoderParam.width * 1.0D + paramTXSVideoEncoderParam.height * paramTXSVideoEncoderParam.height) * 1.2D));
    }
    this.mLastBitrate = this.mBitrate;
    this.mEncoderInitFPS = paramTXSVideoEncoderParam.fps;
    int i;
    switch (paramTXSVideoEncoderParam.encoderMode)
    {
    default: 
      i = 2;
    }
    for (;;)
    {
      if (TXCConfigCenter.getInstance().getHWEncValue() == 1) {
        paramTXSVideoEncoderParam.encoderProfile = 1;
      }
      try
      {
        paramTXSVideoEncoderParam = createFormat(paramTXSVideoEncoderParam.width, paramTXSVideoEncoderParam.height, this.mBitrate, paramTXSVideoEncoderParam.fps, paramTXSVideoEncoderParam.gop, i, 1);
        if (paramTXSVideoEncoderParam == null)
        {
          this.mEndEncoder = true;
          return false;
        }
        this.mEncoder = MediaCodec.createEncoderByType("video/avc");
        i = j;
        i = 2;
      }
      catch (Exception paramTXSVideoEncoderParam)
      {
        for (;;)
        {
          try
          {
            this.mEncoder.configure(paramTXSVideoEncoderParam, null, null, 1);
            i = 3;
            this.mEncoderInputSurface = this.mEncoder.createInputSurface();
            i = 4;
            this.mEncoder.start();
            i = 5;
            this.mOutputBuffers = this.mEncoder.getOutputBuffers();
            if ((this.mEncoder != null) && (this.mOutputBuffers != null) && (this.mEncoderInputSurface != null)) {
              continue;
            }
            this.mEndEncoder = true;
            return false;
          }
          catch (Exception paramTXSVideoEncoderParam)
          {
            continue;
          }
          paramTXSVideoEncoderParam = paramTXSVideoEncoderParam;
          i = 1;
          if ((i >= 5) && (this.mEncoder != null)) {
            this.mEncoder.stop();
          }
          this.mEncoder = null;
          if (this.mEncoderInputSurface != null) {
            this.mEncoderInputSurface.release();
          }
          this.mEncoderInputSurface = null;
        }
        if (!setupGL(this.mEncoderInputSurface))
        {
          this.mEndEncoder = true;
          return false;
        }
        this.mInit = true;
        this.mEncThread.runAsyncDelay(this.decodeTask, 1L);
        return true;
      }
      continue;
      i = 1;
    }
  }
  
  @TargetApi(18)
  public void onMsgRend()
  {
    if (this.mEndEncoder == true) {}
    while ((this.mCurrentPTS == 0L) || (this.mEGL10Helper == null)) {
      return;
    }
    this.mEGL10Helper.makeCurrent();
    GLES20.glClear(16640);
    if (this.mGLContextExternal == null)
    {
      GLES20.glClearColor(0.1F, 0.3F, (float)(this.mFrameIndex % 255L) / 255.0F, 1.0F);
      GLES20.glEnable(3042);
      GLES20.glBlendFunc(770, 771);
    }
    for (;;)
    {
      GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
      this.mEncodeFilter.onDrawFrame(this.mInputFilter.getOutputTexture());
      GLES20.glDisable(3042);
      enqueDTSMS(this.mCurrentPTS);
      this.mEGL10Helper.swap();
      this.mCurrentPTS = 0L;
      return;
      GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }
  }
  
  public void onMsgSetBitrate(int paramInt)
  {
    if (this.mLastBitrate == this.mBitrate) {}
    do
    {
      return;
      this.mLastBitrate = this.mBitrate;
    } while ((Build.VERSION.SDK_INT < 19) || (this.mEncoder == null));
    Bundle localBundle = new Bundle();
    localBundle.putInt("video-bitrate", this.mBitrate * 1024);
    this.mEncoder.setParameters(localBundle);
  }
  
  public void onMsgSetFPS(int paramInt) {}
  
  public long pushVideoFrame(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    if (this.mEndInput) {
      return 10000004L;
    }
    if (this.mGLContextExternal != null)
    {
      if (this.mInputFilter == null)
      {
        this.mInputFilter = new TXCGPUFilter();
        this.mInputFilter.setHasFrameBuffer(true);
        this.mInputFilter.setAttribPointer(TXCTextureRotationUtil.CUBE, TXCTextureRotationUtil.getRotation(TXCRotation.NORMAL, false, false));
        if (!this.mInputFilter.init())
        {
          this.mInputFilter = null;
          return 0L;
        }
      }
      this.mInputFilter.onOutputSizeChanged(paramInt2, paramInt3);
      GLES20.glViewport(0, 0, paramInt2, paramInt3);
      this.mInputFilter.onDrawToTexture(paramInt1);
    }
    this.mCurrentPTS = paramLong;
    this.mEncThread.runAsync(this.renderTask);
    return 0L;
  }
  
  public void setBitrate(final int paramInt)
  {
    this.mBitrate = paramInt;
    this.mEncThread.runAsync(new Runnable()
    {
      public void run()
      {
        TXCHWVideoEncoder.this.onMsgSetBitrate(paramInt);
      }
    });
  }
  
  public void setFPS(final int paramInt)
  {
    this.mEncThread.runAsync(new Runnable()
    {
      public void run()
      {
        TXCHWVideoEncoder.this.onMsgSetFPS(paramInt);
      }
    });
  }
  
  public int start(final TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    super.start(paramTXSVideoEncoderParam);
    final boolean[] arrayOfBoolean = new boolean[1];
    try
    {
      this.mEncThread.runSync(new Runnable()
      {
        public void run()
        {
          if (TXCHWVideoEncoder.this.mInit) {
            TXCHWVideoEncoder.this.onMsgEnd();
          }
          arrayOfBoolean[0] = TXCHWVideoEncoder.this.onMsgInitEncoder(paramTXSVideoEncoderParam);
        }
      });
      if (arrayOfBoolean[0] == 0) {
        callDelegate(10000004);
      }
      if (arrayOfBoolean[0] != 0) {
        return 0;
      }
    }
    finally {}
    return 10000004;
  }
  
  public void stop()
  {
    this.mEndInput = true;
    try
    {
      this.mEncThread.runSync(new Runnable()
      {
        public void run()
        {
          if (TXCHWVideoEncoder.this.mInit)
          {
            TXCHWVideoEncoder.this.onMsgEnd();
            TXCHWVideoEncoder.this.mEncThread.getHandler().removeCallbacksAndMessages(null);
          }
        }
      });
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\videoencoder\TXCHWVideoEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
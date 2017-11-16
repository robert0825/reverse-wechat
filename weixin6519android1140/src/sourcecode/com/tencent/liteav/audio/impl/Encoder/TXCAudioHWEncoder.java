package com.tencent.liteav.audio.impl.Encoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Environment;
import com.tencent.liteav.audio.TXCAudioRecorder;
import com.tencent.liteav.audio.TXIAudioRecordListener;
import com.tencent.liteav.audio.impl.TXCAudioJNI;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Vector;

public class TXCAudioHWEncoder
  extends Thread
  implements TXIAudioEncoder
{
  private static final int AAC_LC_PROFILE = 2;
  private static final int BIT_RATE = 64000;
  public static final boolean DEBUG = true;
  private static final String MIME_TYPE = "audio/mp4a-latm";
  public static final String TAG = "TXCAudioHWEncoder";
  protected static final int TIMEOUT_USEC = 10000;
  private volatile boolean isExit = false;
  private volatile boolean isStart = false;
  private MediaCodecInfo mAudioCodecInfo;
  private Vector<byte[]> mAudioDatas;
  private MediaFormat mAudioFormat;
  private int mBits = TXCAudioRecorder.DEFAULT_BITS_PER_CHANNEL;
  private MediaCodec.BufferInfo mBufferInfo;
  private int mChannels = TXCAudioRecorder.DEFAULT_CHANNELS_PER_SAMPLE;
  private WeakReference<TXIAudioRecordListener> mListener;
  private final Object mLock = new Object();
  private MediaCodec mMediaCodec;
  private int mSampleRate = TXCAudioRecorder.DEFAULT_SAMPLE_RATE;
  private byte[] mSendEncData;
  private long prevOutputPTSUs = 0L;
  
  static
  {
    TXCSystemUtil.loadLiteAVLibrary();
    TXCAudioJNI.nativeSetTempPath(Environment.getExternalStorageDirectory().getAbsolutePath());
  }
  
  @TargetApi(16)
  public TXCAudioHWEncoder()
  {
    super("TXAudioRecordThread");
  }
  
  private void encode(ByteBuffer paramByteBuffer, int paramInt, long paramLong)
  {
    if (this.isExit) {
      return;
    }
    Object localObject = this.mMediaCodec.getInputBuffers();
    int i = this.mMediaCodec.dequeueInputBuffer(10000L);
    if (i >= 0)
    {
      localObject = localObject[i];
      ((ByteBuffer)localObject).clear();
      if (paramByteBuffer != null) {
        ((ByteBuffer)localObject).put(paramByteBuffer);
      }
      if (paramInt <= 0)
      {
        TXCLog.i("TXCAudioHWEncoder", "send BUFFER_FLAG_END_OF_STREAM");
        this.mMediaCodec.queueInputBuffer(i, 0, 0, paramLong, 4);
      }
    }
    else
    {
      paramByteBuffer = this.mMediaCodec.getOutputBuffers();
      label90:
      paramInt = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, 10000L);
      localObject = paramByteBuffer;
      if (paramInt != -1)
      {
        if (paramInt != -3) {
          break label152;
        }
        localObject = this.mMediaCodec.getOutputBuffers();
      }
    }
    for (;;)
    {
      paramByteBuffer = (ByteBuffer)localObject;
      if (paramInt >= 0) {
        break label90;
      }
      return;
      this.mMediaCodec.queueInputBuffer(i, 0, paramInt, paramLong, 0);
      break;
      label152:
      if (paramInt == -2)
      {
        this.mMediaCodec.getOutputFormat();
        localObject = paramByteBuffer;
      }
      else
      {
        localObject = paramByteBuffer;
        if (paramInt >= 0)
        {
          localObject = paramByteBuffer[paramInt];
          if ((this.mBufferInfo.flags & 0x2) != 0)
          {
            TXCLog.d("TXCAudioHWEncoder", "drain:BUFFER_FLAG_CODEC_CONFIG");
            this.mBufferInfo.size = 0;
          }
          if (this.mBufferInfo.size != 0)
          {
            this.mBufferInfo.presentationTimeUs = getPTSUs();
            this.mSendEncData = new byte[((ByteBuffer)localObject).limit()];
            ((ByteBuffer)localObject).get(this.mSendEncData);
            onEncData(this.mSendEncData, this.mBufferInfo.presentationTimeUs);
            this.prevOutputPTSUs = this.mBufferInfo.presentationTimeUs;
          }
          this.mMediaCodec.releaseOutputBuffer(paramInt, false);
          localObject = paramByteBuffer;
        }
      }
    }
  }
  
  private long getPTSUs()
  {
    long l2 = TXCTimeUtil.getTimeTick();
    long l1 = l2;
    if (l2 < this.prevOutputPTSUs) {
      l1 = l2 + (this.prevOutputPTSUs - l2);
    }
    return l1;
  }
  
  private native byte[] nativeEncode(byte[] paramArrayOfByte);
  
  private void onEncData(byte[] paramArrayOfByte, long paramLong)
  {
    if (this.mListener != null)
    {
      TXIAudioRecordListener localTXIAudioRecordListener = (TXIAudioRecordListener)this.mListener.get();
      if (localTXIAudioRecordListener != null) {
        localTXIAudioRecordListener.onRecordEncData(paramArrayOfByte, paramLong);
      }
    }
  }
  
  private void onEncError(int paramInt, String paramString)
  {
    if (this.mListener != null)
    {
      TXIAudioRecordListener localTXIAudioRecordListener = (TXIAudioRecordListener)this.mListener.get();
      if (localTXIAudioRecordListener != null) {
        localTXIAudioRecordListener.onRecordError(paramInt, paramString);
      }
    }
  }
  
  private static final MediaCodecInfo selectAudioCodec(String paramString)
  {
    TXCLog.v("TXCAudioHWEncoder", "selectAudioCodec:");
    int k = MediaCodecList.getCodecCount();
    int i = 0;
    while (i < k)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
      if (localMediaCodecInfo.isEncoder())
      {
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        int j = 0;
        while (j < arrayOfString.length)
        {
          TXCLog.i("TXCAudioHWEncoder", "supportedType:" + localMediaCodecInfo.getName() + ",MIME=" + arrayOfString[j]);
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
  
  private void startEncode()
  {
    int i = 32000;
    this.mAudioCodecInfo = selectAudioCodec("audio/mp4a-latm");
    if (this.mAudioCodecInfo == null)
    {
      TXCLog.e("TXCAudioHWEncoder", "Unable to find an appropriate codec for audio/mp4a-latm");
      return;
    }
    TXCLog.i("TXCAudioHWEncoder", "selected codec: " + this.mAudioCodecInfo.getName());
    if (this.mSampleRate >= 32000) {
      i = 64000;
    }
    this.mAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.mSampleRate, this.mChannels);
    this.mAudioFormat.setInteger("bitrate", i);
    this.mAudioFormat.setInteger("channel-count", this.mChannels);
    this.mAudioFormat.setInteger("sample-rate", this.mSampleRate);
    this.mAudioFormat.setInteger("aac-profile", 2);
    TXCLog.i("TXCAudioHWEncoder", "format: " + this.mAudioFormat);
    try
    {
      startMediaCodec();
      start();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  @TargetApi(16)
  private void startMediaCodec()
  {
    if (this.mMediaCodec != null) {
      return;
    }
    this.mMediaCodec = MediaCodec.createEncoderByType("audio/mp4a-latm");
    this.mMediaCodec.configure(this.mAudioFormat, null, null, 1);
    this.mMediaCodec.start();
    TXCLog.i("TXCAudioHWEncoder", "prepare finishing");
    this.isStart = true;
  }
  
  private void stopEncode()
  {
    this.isExit = true;
  }
  
  private void stopMediaCodec()
  {
    if (this.mMediaCodec != null)
    {
      this.mMediaCodec.stop();
      this.mMediaCodec.release();
      this.mMediaCodec = null;
    }
    this.isStart = false;
  }
  
  public void doEncodec(byte[] arg1, long paramLong)
  {
    byte[] arrayOfByte = nativeEncode(???);
    if ((this.mAudioDatas != null) && (arrayOfByte != null)) {}
    synchronized (this.mAudioDatas)
    {
      if (this.mAudioDatas == null) {
        return;
      }
      this.mAudioDatas.add(arrayOfByte);
      synchronized (this.mLock)
      {
        this.mLock.notify();
        return;
      }
    }
  }
  
  public void init(int paramInt1, int paramInt2, int paramInt3, int paramInt4, WeakReference<TXIAudioRecordListener> paramWeakReference)
  {
    this.mListener = paramWeakReference;
    this.mBufferInfo = new MediaCodec.BufferInfo();
    this.mAudioDatas = new Vector();
    this.mSampleRate = paramInt2;
    this.mChannels = paramInt3;
    this.mBits = paramInt4;
    startEncode();
  }
  
  public void run()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(1024);
    for (;;)
    {
      if (!this.isExit) {
        if (this.isStart) {
          synchronized (this.mAudioDatas)
          {
            boolean bool = this.mAudioDatas.isEmpty();
            if (bool) {
              try
              {
                Thread.sleep(10L);
              }
              catch (InterruptedException localInterruptedException1) {}
            }
          }
        }
      }
    }
    label215:
    for (;;)
    {
      synchronized (this.mAudioDatas)
      {
        byte[] arrayOfByte = (byte[])this.mAudioDatas.remove(0);
        if (arrayOfByte == null) {
          break label215;
        }
        ??? = localObject1;
        try
        {
          ((ByteBuffer)localObject1).clear();
          Object localObject7 = localObject1;
          ??? = localObject1;
          if (arrayOfByte.length > ((ByteBuffer)localObject1).capacity())
          {
            ??? = localObject1;
            localObject7 = ByteBuffer.allocateDirect(arrayOfByte.length);
          }
          ??? = localObject7;
          ((ByteBuffer)localObject7).clear();
          ??? = localObject7;
          ((ByteBuffer)localObject7).put(arrayOfByte);
          ??? = localObject7;
          ((ByteBuffer)localObject7).flip();
          ??? = localObject7;
          encode((ByteBuffer)localObject7, arrayOfByte.length, getPTSUs());
          Object localObject2 = localObject7;
        }
        catch (Exception localException)
        {
          Object localObject3 = ???;
        }
      }
      try
      {
        synchronized (this.mLock)
        {
          this.mLock.wait();
        }
        stopMediaCodec();
        return;
      }
      catch (InterruptedException localInterruptedException2)
      {
        for (;;) {}
      }
    }
  }
  
  public void setReverbType(int paramInt) {}
  
  public void unInit()
  {
    stopEncode();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\impl\Encoder\TXCAudioHWEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
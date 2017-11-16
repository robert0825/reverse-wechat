package com.tencent.liteav;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.TXCVideoPreprocessor;
import com.tencent.liteav.beauty.TXIVideoPreprocessorListener;
import com.tencent.liteav.videoencoder.TXCVideoEncoder;
import com.tencent.liteav.videoencoder.TXIVideoEncoderListener;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

public class TXCBackgroundPusher
  implements TXIVideoPreprocessorListener, TXIVideoEncoderListener
{
  private static final int DEF_PUBLISH_AUDIO_DELAY_TIME = 3;
  private static final int DEF_PUBLISH_DELAY_TIME = 200;
  private static final int DEF_PUBLISH_END_TIME = 300;
  private static final int MSG_PUSH_AUDIO = 1002;
  private static final int MSG_PUSH_IMG = 1001;
  private static final String TAG = TXCBackgroundPusher.class.getSimpleName();
  private int mDelayTime = 300;
  private HandlerThread mHandlerThread;
  private WeakReference<TXIBackgroudPushListener> mListener = null;
  private long mPublishEndTime = 0L;
  private boolean mPublishStarted = false;
  private TXCPushHandler mPushHandler;
  private TXSNALPacket mPusherNal;
  private TXCVideoEncoder mVideoEncoder;
  private TXCVideoPreprocessor mVideoPreprocessor = null;
  
  public TXCBackgroundPusher(TXIBackgroudPushListener paramTXIBackgroudPushListener)
  {
    this.mListener = new WeakReference(paramTXIBackgroudPushListener);
  }
  
  private void initHandler()
  {
    releaseHandler();
    this.mHandlerThread = new HandlerThread("TXImageCapturer");
    this.mHandlerThread.start();
    this.mPushHandler = new TXCPushHandler(this.mHandlerThread.getLooper(), this.mDelayTime, this.mPublishEndTime);
  }
  
  private void initPublishConfig(int paramInt1, int paramInt2)
  {
    int i;
    if (paramInt1 > 0) {
      if (paramInt1 >= 8) {
        i = 8;
      }
    }
    for (this.mDelayTime = (1000 / i);; this.mDelayTime = 200)
    {
      if (paramInt2 <= 0) {
        break label63;
      }
      this.mPublishEndTime = (System.currentTimeMillis() + paramInt2 * 1000);
      return;
      i = paramInt1;
      if (paramInt1 > 3) {
        break;
      }
      i = 3;
      break;
    }
    label63:
    this.mPublishEndTime = (System.currentTimeMillis() + 300000L);
  }
  
  private void releaseHandler()
  {
    if (this.mPushHandler != null)
    {
      this.mPushHandler.removeCallbacksAndMessages(null);
      this.mPushHandler = null;
    }
    if (this.mHandlerThread != null)
    {
      this.mHandlerThread.quit();
      this.mHandlerThread = null;
    }
  }
  
  public void didDetectFacePoints(float[] paramArrayOfFloat) {}
  
  public void didProcessFrame(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    TXCLog.w(TAG, "bkgpush: got texture");
    if (this.mVideoEncoder != null) {
      this.mVideoEncoder.pushVideoFrame(paramInt1, paramInt2, paramInt3, TXCTimeUtil.getTimeTick());
    }
  }
  
  public void didProcessFrame(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, long paramLong) {}
  
  public void generateNAL(EGLContext paramEGLContext, Context paramContext, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    TXCLog.w(TAG, "bkgpush: generate background push");
    Bitmap localBitmap = paramBitmap;
    if (paramBitmap == null) {}
    try
    {
      TXCLog.w(TAG, "bkgpush: background publish img is empty, add default img");
      paramBitmap = new ColorDrawable(-16777216);
      localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      paramBitmap.draw(new Canvas(localBitmap));
      TXCLog.w(TAG, "bkgpush: generate nal");
      paramBitmap = new TXSVideoEncoderParam();
      paramBitmap.width = paramInt1;
      paramBitmap.height = paramInt2;
      paramBitmap.fps = 1;
      paramBitmap.gop = 1;
      paramBitmap.enableBFrame = false;
      paramBitmap.realTime = true;
      paramBitmap.encoderProfile = 1;
      paramBitmap.encoderMode = 1;
      paramBitmap.glContext = paramEGLContext;
      this.mVideoEncoder = new TXCVideoEncoder(2);
      this.mVideoEncoder.setListener(this);
      this.mVideoEncoder.start(paramBitmap);
      if ((paramInt1 == 720) || (paramInt1 == 1280))
      {
        this.mVideoEncoder.setBitrate(1800);
        int i = localBitmap.getWidth();
        int j = localBitmap.getHeight();
        paramEGLContext = ByteBuffer.allocateDirect(i * j * 4);
        localBitmap.copyPixelsToBuffer(paramEGLContext);
        paramEGLContext.rewind();
        paramBitmap = new byte[paramEGLContext.remaining()];
        paramEGLContext.get(paramBitmap);
        if (this.mVideoPreprocessor != null)
        {
          paramEGLContext = TXCSystemUtil.cropTexture(i, j, paramInt1, paramInt2);
          this.mVideoPreprocessor.setCrop(paramEGLContext);
        }
        if (this.mVideoPreprocessor == null)
        {
          this.mVideoPreprocessor = new TXCVideoPreprocessor(paramContext, true);
          this.mVideoPreprocessor.setListener(this);
        }
        this.mVideoPreprocessor.setMirror(false);
        this.mVideoPreprocessor.setOutputFrameSize(paramInt1, paramInt2);
        this.mVideoPreprocessor.setRotate(0);
        this.mVideoPreprocessor.processFrame(paramBitmap, i, j, 0, 2, 0);
        this.mVideoPreprocessor.release();
        this.mVideoPreprocessor.setListener(null);
        this.mVideoPreprocessor = null;
        return;
      }
      for (;;)
      {
        label344:
        this.mVideoEncoder.setBitrate(1200);
        break;
        do
        {
          this.mVideoEncoder.setBitrate(800);
          break;
          if (paramInt1 == 960) {
            break label344;
          }
        } while (paramInt1 != 544);
      }
      return;
    }
    catch (Exception paramEGLContext) {}
  }
  
  public boolean hasNAL()
  {
    return this.mPusherNal != null;
  }
  
  public void onEncodeFormat(MediaFormat paramMediaFormat) {}
  
  public void onEncodeNAL(TXSNALPacket paramTXSNALPacket, int paramInt)
  {
    this.mPusherNal = paramTXSNALPacket;
    String str = TAG;
    StringBuilder localStringBuilder = new StringBuilder("bkgpush: got nal type: ");
    Object localObject = paramTXSNALPacket;
    if (paramTXSNALPacket != null) {
      localObject = Integer.valueOf(paramTXSNALPacket.nalType);
    }
    TXCLog.w(str, localObject);
    if (this.mVideoEncoder != null)
    {
      this.mVideoEncoder.setListener(null);
      paramTXSNALPacket = this.mVideoEncoder;
      this.mVideoEncoder = null;
    }
    try
    {
      if (this.mListener != null)
      {
        localObject = (TXIBackgroudPushListener)this.mListener.get();
        if (localObject != null) {
          ((TXIBackgroudPushListener)localObject).onReleaseEncoder(paramTXSNALPacket);
        }
      }
      return;
    }
    catch (Exception paramTXSNALPacket) {}
  }
  
  public void publishImg()
  {
    try
    {
      if ((this.mListener != null) && (this.mPublishStarted))
      {
        TXIBackgroudPushListener localTXIBackgroudPushListener = (TXIBackgroudPushListener)this.mListener.get();
        if (localTXIBackgroudPushListener != null) {
          localTXIBackgroudPushListener.onPushNal(this.mPusherNal);
        }
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public void start(int paramInt1, int paramInt2)
  {
    if (this.mPublishStarted)
    {
      TXCLog.w(TAG, "bkgpush:start background publish return when started");
      return;
    }
    this.mPublishStarted = true;
    initPublishConfig(paramInt1, paramInt2);
    initHandler();
    if (this.mPushHandler != null) {
      this.mPushHandler.sendEmptyMessageDelayed(1001, this.mDelayTime);
    }
    TXCLog.e(TAG, "bkgpush:start background publish with time:" + (this.mPublishEndTime - System.currentTimeMillis()) / 1000L + ", interval:" + this.mDelayTime);
  }
  
  public void stop()
  {
    this.mPublishStarted = false;
    TXCLog.e(TAG, "bkgpush:stop background publish");
    releaseHandler();
  }
  
  public int willAddWatermark(int paramInt1, int paramInt2, int paramInt3)
  {
    return 0;
  }
  
  private class TXCPushHandler
    extends Handler
  {
    private int mDelayTime = 300;
    private long mPublishEndTime = 0L;
    
    public TXCPushHandler(Looper paramLooper, int paramInt, long paramLong)
    {
      super();
      this.mDelayTime = paramInt;
      this.mPublishEndTime = paramLong;
    }
    
    public void handleMessage(Message paramMessage)
    {
      if (paramMessage.what == 1001) {}
      try
      {
        TXCBackgroundPusher.this.publishImg();
        if (System.currentTimeMillis() < this.mPublishEndTime) {
          sendEmptyMessageDelayed(1001, this.mDelayTime);
        }
        return;
      }
      catch (Exception paramMessage) {}
    }
  }
  
  public static abstract interface TXIBackgroudPushListener
  {
    public abstract void onPushNal(TXSNALPacket paramTXSNALPacket);
    
    public abstract void onReleaseEncoder(TXCVideoEncoder paramTXCVideoEncoder);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\TXCBackgroundPusher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
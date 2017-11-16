package com.tencent.liteav.capturer;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class TXCImageCapturer
{
  private static final int DEF_PUBLISH_AUDIO_DELAY_TIME = 3;
  private static final int DEF_PUBLISH_DELAY_TIME = 100;
  private static final int DEF_PUBLISH_END_TIME = 300;
  private static final int MSG_PUSH_AUDIO = 1002;
  private static final int MSG_PUSH_IMG = 1001;
  private static final String TAG = TXCImageCapturer.class.getSimpleName();
  private TXCImageCaptureHandler mCaptureHandler;
  private int mDelayTime = 300;
  private HandlerThread mHandlerThread;
  private WeakReference<TXImageCapturerListener> mImgListener = null;
  private long mPublishEndTime = 0L;
  private boolean mPublishStarted = false;
  private Bitmap mVideoBitmap = null;
  private byte[] mVideoBuffer = null;
  
  public TXCImageCapturer(TXImageCapturerListener paramTXImageCapturerListener)
  {
    this.mImgListener = new WeakReference(paramTXImageCapturerListener);
  }
  
  private void initHandler()
  {
    releaseHandler();
    this.mHandlerThread = new HandlerThread("TXImageCapturer");
    this.mHandlerThread.start();
    this.mCaptureHandler = new TXCImageCaptureHandler(this.mHandlerThread.getLooper(), this.mDelayTime, this.mPublishEndTime);
  }
  
  private void initPublishConfig(int paramInt1, int paramInt2)
  {
    int i;
    if (paramInt1 > 0) {
      if (paramInt1 >= 20) {
        i = 20;
      }
    }
    for (this.mDelayTime = (1000 / i);; this.mDelayTime = 100)
    {
      if (paramInt2 <= 0) {
        break label62;
      }
      this.mPublishEndTime = (System.currentTimeMillis() + paramInt2 * 1000);
      return;
      i = paramInt1;
      if (paramInt1 > 5) {
        break;
      }
      i = 5;
      break;
    }
    label62:
    this.mPublishEndTime = (System.currentTimeMillis() + 300000L);
  }
  
  private void initPublishImg(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    this.mVideoBitmap = paramBitmap;
    if (this.mVideoBitmap == null)
    {
      TXCLog.w(TAG, "background publish img is empty, add default img");
      paramBitmap = new ColorDrawable(-16777216);
      this.mVideoBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      paramBitmap.draw(new Canvas(this.mVideoBitmap));
    }
  }
  
  private void releaseHandler()
  {
    if (this.mCaptureHandler != null)
    {
      this.mCaptureHandler.removeCallbacksAndMessages(null);
      this.mCaptureHandler = null;
    }
    if (this.mHandlerThread != null)
    {
      this.mHandlerThread.quit();
      this.mHandlerThread = null;
    }
  }
  
  private void releasePublishImg()
  {
    this.mVideoBitmap = null;
    this.mVideoBuffer = null;
  }
  
  public void publishImg()
  {
    if ((this.mVideoBitmap == null) || (this.mVideoBitmap.isRecycled())) {}
    int i;
    int j;
    Object localObject;
    do
    {
      do
      {
        return;
        i = this.mVideoBitmap.getWidth();
        j = this.mVideoBitmap.getHeight();
        if (this.mVideoBuffer == null)
        {
          localObject = ByteBuffer.allocateDirect(i * j * 4);
          this.mVideoBitmap.copyPixelsToBuffer((Buffer)localObject);
          ((ByteBuffer)localObject).rewind();
          this.mVideoBuffer = new byte[((ByteBuffer)localObject).remaining()];
          ((ByteBuffer)localObject).get(this.mVideoBuffer);
        }
      } while (this.mImgListener == null);
      localObject = (TXImageCapturerListener)this.mImgListener.get();
    } while (localObject == null);
    ((TXImageCapturerListener)localObject).onImageRGBAData(this.mVideoBuffer, i, j);
  }
  
  public void start(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.mPublishStarted)
    {
      TXCLog.w(TAG, "start background publish return when started");
      return;
    }
    this.mPublishStarted = true;
    initPublishConfig(paramInt3, paramInt4);
    try
    {
      initPublishImg(paramBitmap, paramInt1, paramInt2);
      initHandler();
      if (this.mCaptureHandler != null) {
        this.mCaptureHandler.sendEmptyMessageDelayed(1001, this.mDelayTime);
      }
      TXCLog.e(TAG, "start background publish with time:" + (this.mPublishEndTime - System.currentTimeMillis()) / 1000L + ", fps:" + this.mDelayTime);
      return;
    }
    catch (Exception paramBitmap)
    {
      for (;;)
      {
        TXCLog.e(TAG, "init publish img error");
      }
    }
  }
  
  public void stop()
  {
    this.mPublishStarted = false;
    TXCLog.e(TAG, "stop background publish");
    releaseHandler();
    releasePublishImg();
  }
  
  private class TXCImageCaptureHandler
    extends Handler
  {
    private int mDelayTime = 300;
    private long mPublishEndTime = 0L;
    
    public TXCImageCaptureHandler(Looper paramLooper, int paramInt, long paramLong)
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
        TXCImageCapturer.this.publishImg();
        if (System.currentTimeMillis() < this.mPublishEndTime) {
          sendEmptyMessageDelayed(1001, this.mDelayTime);
        }
        return;
      }
      catch (Exception paramMessage) {}
    }
  }
  
  public static abstract interface TXImageCapturerListener
  {
    public abstract void onImageRGBAData(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\liteav\capturer\TXCImageCapturer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
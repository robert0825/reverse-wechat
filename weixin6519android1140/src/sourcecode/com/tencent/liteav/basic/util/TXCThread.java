package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public class TXCThread
{
  public Handler mHandler;
  private Looper mLooper;
  private boolean mNewThread;
  
  public TXCThread(Looper paramLooper)
  {
    this.mHandler = new Handler(paramLooper);
    this.mLooper = paramLooper;
    this.mNewThread = false;
  }
  
  public TXCThread(String paramString)
  {
    paramString = new HandlerThread(paramString);
    this.mNewThread = true;
    paramString.start();
    this.mLooper = paramString.getLooper();
    this.mHandler = new Handler(this.mLooper);
  }
  
  protected void finalize()
  {
    if (this.mNewThread) {
      this.mHandler.getLooper().quit();
    }
    super.finalize();
  }
  
  public Handler getHandler()
  {
    return this.mHandler;
  }
  
  public Looper getLooper()
  {
    return this.mLooper;
  }
  
  public void runAsync(Runnable paramRunnable)
  {
    this.mHandler.post(paramRunnable);
  }
  
  public void runAsyncDelay(Runnable paramRunnable, long paramLong)
  {
    this.mHandler.postDelayed(paramRunnable, paramLong);
  }
  
  public void runSync(final Runnable paramRunnable)
  {
    final boolean[] arrayOfBoolean = new boolean[1];
    Handler localHandler = this.mHandler;
    arrayOfBoolean[0] = false;
    try
    {
      this.mHandler.post(new Runnable()
      {
        public void run()
        {
          paramRunnable.run();
          arrayOfBoolean[0] = true;
          synchronized (TXCThread.this.mHandler)
          {
            TXCThread.this.mHandler.notifyAll();
            return;
          }
        }
      });
      for (;;)
      {
        int i = arrayOfBoolean[0];
        if (i != 0) {
          break;
        }
        try
        {
          this.mHandler.wait();
        }
        catch (Exception paramRunnable) {}
      }
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\util\TXCThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
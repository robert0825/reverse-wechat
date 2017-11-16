package com.tencent.d.b.f;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public class g
{
  private static volatile g ybf = null;
  private Handler ybg = null;
  private Handler ybh = null;
  
  private g()
  {
    HandlerThread localHandlerThread = new HandlerThread("SoterGenKeyHandlerThreadName");
    localHandlerThread.start();
    this.ybg = new Handler(localHandlerThread.getLooper());
    this.ybh = new Handler(Looper.getMainLooper());
  }
  
  public static g cpU()
  {
    if (ybf == null) {
      try
      {
        if (ybf == null) {
          ybf = new g();
        }
        g localg = ybf;
        return localg;
      }
      finally {}
    }
    return ybf;
  }
  
  public final void k(Runnable paramRunnable, long paramLong)
  {
    this.ybg.postDelayed(paramRunnable, paramLong);
  }
  
  public final void t(Runnable paramRunnable)
  {
    this.ybh.post(paramRunnable);
  }
  
  public final void v(Runnable paramRunnable)
  {
    this.ybg.post(paramRunnable);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\b\f\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
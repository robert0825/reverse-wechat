package com.tencent.mm.bv;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;

public class a
{
  private static volatile a vFb;
  private ae fVA;
  private ae mHandler;
  private HandlerThread mHandlerThread;
  
  private a()
  {
    GMTrace.i(17506957787136L, 130437);
    this.mHandlerThread = e.SV("WorkerThread#" + hashCode());
    this.mHandlerThread.start();
    this.mHandler = new ae(this.mHandlerThread.getLooper());
    this.fVA = new ae(Looper.getMainLooper());
    GMTrace.o(17506957787136L, 130437);
  }
  
  public static boolean U(Runnable paramRunnable)
  {
    GMTrace.i(18730486595584L, 139553);
    boolean bool = bVA().fVA.post(paramRunnable);
    GMTrace.o(18730486595584L, 139553);
    return bool;
  }
  
  public static boolean V(Runnable paramRunnable)
  {
    GMTrace.i(18730620813312L, 139554);
    boolean bool = bVA().fVA.postDelayed(paramRunnable, 1000L);
    GMTrace.o(18730620813312L, 139554);
    return bool;
  }
  
  private static a bVA()
  {
    GMTrace.i(17506823569408L, 130436);
    if (vFb == null) {}
    try
    {
      if (vFb == null) {
        vFb = new a();
      }
      a locala = vFb;
      GMTrace.o(17506823569408L, 130436);
      return locala;
    }
    finally {}
  }
  
  public static HandlerThread bVB()
  {
    GMTrace.i(20286070063104L, 151143);
    HandlerThread localHandlerThread = bVA().mHandlerThread;
    GMTrace.o(20286070063104L, 151143);
    return localHandlerThread;
  }
  
  public static boolean e(Runnable paramRunnable)
  {
    GMTrace.i(18730352377856L, 139552);
    boolean bool = bVA().mHandler.postDelayed(paramRunnable, 1000L);
    GMTrace.o(18730352377856L, 139552);
    return bool;
  }
  
  public static boolean post(Runnable paramRunnable)
  {
    GMTrace.i(17507092004864L, 130438);
    boolean bool = bVA().mHandler.post(paramRunnable);
    GMTrace.o(17507092004864L, 130438);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bv\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
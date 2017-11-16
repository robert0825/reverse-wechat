package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class d
  extends ThreadPoolExecutor
{
  private static volatile d ipV;
  
  static
  {
    GMTrace.i(10154510647296L, 75657);
    ipV = null;
    GMTrace.o(10154510647296L, 75657);
  }
  
  private d()
  {
    super(4, 6, 15000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactory()new RejectedExecutionHandler
    {
      public final Thread newThread(Runnable paramAnonymousRunnable)
      {
        GMTrace.i(10156389695488L, 75671);
        paramAnonymousRunnable = e.d(paramAnonymousRunnable, "AppBrandPreparingThread", 5);
        GMTrace.o(10156389695488L, 75671);
        return paramAnonymousRunnable;
      }
    }, new RejectedExecutionHandler()
    {
      public final void rejectedExecution(Runnable paramAnonymousRunnable, ThreadPoolExecutor paramAnonymousThreadPoolExecutor)
      {
        GMTrace.i(10156792348672L, 75674);
        if (paramAnonymousRunnable == null)
        {
          GMTrace.o(10156792348672L, 75674);
          return;
        }
        e.post(paramAnonymousRunnable, "AppBrandPreparingThread");
        GMTrace.o(10156792348672L, 75674);
      }
    });
    GMTrace.i(10154107994112L, 75654);
    GMTrace.o(10154107994112L, 75654);
  }
  
  public static void Ym()
  {
    GMTrace.i(10154242211840L, 75655);
    if (ipV != null) {}
    try
    {
      if (ipV != null) {
        ipV.shutdownNow();
      }
      ipV = null;
      GMTrace.o(10154242211840L, 75655);
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
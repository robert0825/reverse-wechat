package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class as
{
  private static final ConcurrentLinkedQueue<Runnable> vkm;
  private static ExecutorService vkn;
  
  static
  {
    GMTrace.i(13745237524480L, 102410);
    vkm = new ConcurrentLinkedQueue();
    vkn = null;
    GMTrace.o(13745237524480L, 102410);
  }
  
  as()
  {
    GMTrace.i(13744700653568L, 102406);
    GMTrace.o(13744700653568L, 102406);
  }
  
  public static void H(Runnable paramRunnable)
  {
    GMTrace.i(13744969089024L, 102408);
    vkm.add(paramRunnable);
    GMTrace.o(13744969089024L, 102408);
  }
  
  public static void I(Runnable paramRunnable)
  {
    GMTrace.i(13745103306752L, 102409);
    vkm.remove(paramRunnable);
    GMTrace.o(13745103306752L, 102409);
  }
  
  public static ExecutorService bQv()
  {
    GMTrace.i(13744834871296L, 102407);
    try
    {
      if (vkn == null) {
        vkn = Executors.newSingleThreadExecutor();
      }
      ExecutorService localExecutorService = vkn;
      GMTrace.o(13744834871296L, 102407);
      return localExecutorService;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
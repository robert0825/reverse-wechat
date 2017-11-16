package com.tencent.mm.pluginsdk.j.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class t
  implements ThreadFactory
{
  private static final AtomicInteger trG;
  private final AtomicInteger gKf;
  private String gKg;
  
  static
  {
    GMTrace.i(870133530624L, 6483);
    trG = new AtomicInteger(1);
    GMTrace.o(870133530624L, 6483);
  }
  
  public t()
  {
    this("ResDownloaderPool", "ResDownloaderThread");
    GMTrace.i(869730877440L, 6480);
    GMTrace.o(869730877440L, 6480);
  }
  
  public t(String paramString1, String paramString2)
  {
    GMTrace.i(869865095168L, 6481);
    this.gKf = new AtomicInteger(1);
    this.gKg = String.format("%s-%d-%s-", new Object[] { paramString1, Integer.valueOf(trG.getAndIncrement()), paramString2 });
    GMTrace.o(869865095168L, 6481);
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    GMTrace.i(869999312896L, 6482);
    paramRunnable = e.d(paramRunnable, this.gKg + this.gKf.getAndIncrement(), 1);
    if (paramRunnable.isDaemon()) {
      paramRunnable.setDaemon(false);
    }
    GMTrace.o(869999312896L, 6482);
    return paramRunnable;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\d\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
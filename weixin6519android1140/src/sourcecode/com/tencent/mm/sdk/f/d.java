package com.tencent.mm.sdk.f;

import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class d
  implements ThreadFactory
{
  private ThreadGroup gKe;
  private final AtomicInteger vmJ;
  
  d()
  {
    GMTrace.i(13982400249856L, 104177);
    this.vmJ = new AtomicInteger(1);
    this.gKe = new ThreadGroup("MM_THREAD_POOL_GROUP");
    GMTrace.o(13982400249856L, 104177);
  }
  
  public final Thread newThread(Runnable paramRunnable)
  {
    GMTrace.i(13982534467584L, 104178);
    paramRunnable = new Thread(this.gKe, paramRunnable, "MM_Thread_Pool_Thread#" + this.vmJ.getAndIncrement());
    if (paramRunnable.isDaemon()) {
      paramRunnable.setDaemon(false);
    }
    if (paramRunnable.getPriority() != 5) {
      paramRunnable.setPriority(5);
    }
    GMTrace.o(13982534467584L, 104178);
    return paramRunnable;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
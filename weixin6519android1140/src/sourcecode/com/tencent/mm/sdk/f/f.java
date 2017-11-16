package com.tencent.mm.sdk.f;

import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;

final class f
  extends ThreadPoolExecutor
{
  private a vnd;
  
  public f(int paramInt, TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue, a parama)
  {
    super(0, paramInt, 120L, paramTimeUnit, paramBlockingQueue, new d(), new ThreadPoolExecutor.CallerRunsPolicy());
    GMTrace.i(13980386983936L, 104162);
    this.vnd = parama;
    GMTrace.o(13980386983936L, 104162);
  }
  
  protected final void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
    GMTrace.i(13980789637120L, 104165);
    super.afterExecute(paramRunnable, paramThrowable);
    if (this.vnd != null) {
      this.vnd.K(paramRunnable);
    }
    GMTrace.o(13980789637120L, 104165);
  }
  
  protected final void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
    GMTrace.i(13980655419392L, 104164);
    if (this.vnd != null) {
      this.vnd.beforeExecute(paramThread, paramRunnable);
    }
    super.beforeExecute(paramThread, paramRunnable);
    GMTrace.o(13980655419392L, 104164);
  }
  
  public final void execute(Runnable paramRunnable)
  {
    GMTrace.i(13980521201664L, 104163);
    super.execute(paramRunnable);
    GMTrace.o(13980521201664L, 104163);
  }
  
  static abstract interface a
  {
    public abstract void K(Runnable paramRunnable);
    
    public abstract void beforeExecute(Thread paramThread, Runnable paramRunnable);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\f\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
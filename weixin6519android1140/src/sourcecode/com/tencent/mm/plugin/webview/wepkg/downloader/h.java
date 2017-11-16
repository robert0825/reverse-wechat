package com.tencent.mm.plugin.webview.wepkg.downloader;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class h
  extends ThreadPoolExecutor
{
  public h(TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue, ThreadFactory paramThreadFactory)
  {
    super(3, 3, 3000L, paramTimeUnit, paramBlockingQueue, paramThreadFactory);
    GMTrace.i(12376082481152L, 92209);
    GMTrace.o(12376082481152L, 92209);
  }
  
  protected final void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
    GMTrace.i(12376619352064L, 92213);
    if ((paramRunnable instanceof e))
    {
      e locale = (e)paramRunnable;
      if ((locale.rXy != null) && (locale.rXy.rXc != null))
      {
        d.bGh().MR(locale.rXy.rXc.rXz);
        w.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "remove download task");
      }
    }
    w.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "afterExecute");
    super.afterExecute(paramRunnable, paramThrowable);
    GMTrace.o(12376619352064L, 92213);
  }
  
  protected final void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
    GMTrace.i(12376485134336L, 92212);
    super.beforeExecute(paramThread, paramRunnable);
    w.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "beforeExecute");
    GMTrace.o(12376485134336L, 92212);
  }
  
  protected final <V> RunnableFuture<V> newTaskFor(Runnable paramRunnable, V paramV)
  {
    GMTrace.i(12376216698880L, 92210);
    if ((paramRunnable instanceof c))
    {
      paramRunnable = new e(paramRunnable, paramV, (c)paramRunnable);
      GMTrace.o(12376216698880L, 92210);
      return paramRunnable;
    }
    paramRunnable = super.newTaskFor(paramRunnable, paramV);
    GMTrace.o(12376216698880L, 92210);
    return paramRunnable;
  }
  
  protected final void terminated()
  {
    GMTrace.i(12376350916608L, 92211);
    d locald = d.bGh();
    if (locald.rXm != null) {
      locald.rXm.clear();
    }
    super.terminated();
    GMTrace.o(12376350916608L, 92211);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\downloader\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
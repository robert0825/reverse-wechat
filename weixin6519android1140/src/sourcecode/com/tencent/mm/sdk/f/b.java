package com.tencent.mm.sdk.f;

import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.atomic.AtomicInteger;
import junit.framework.Assert;

final class b
{
  private ThreadGroup gKe;
  private final AtomicInteger vmJ;
  private e.b vmK;
  
  b(e.b paramb)
  {
    GMTrace.i(13980118548480L, 104160);
    this.vmJ = new AtomicInteger(1);
    this.vmK = paramb;
    this.gKe = new ThreadGroup("MM_FREE_THREAD_GROUP");
    GMTrace.o(13980118548480L, 104160);
  }
  
  final Thread a(Runnable paramRunnable, String paramString, int paramInt)
  {
    GMTrace.i(13980252766208L, 104161);
    Assert.assertNotNull("newThread arg name is null!", paramString);
    if (paramRunnable != null)
    {
      paramRunnable = new g(paramRunnable, paramString, paramInt, false, this.vmK);
      paramRunnable = new a(this.gKe, paramRunnable, "MM_Thread_Pool_Free_Thread#" + this.vmJ.getAndIncrement() + "#" + paramString);
      paramRunnable.setPriority(paramInt);
    }
    for (;;)
    {
      GMTrace.o(13980252766208L, 104161);
      return paramRunnable;
      paramRunnable = new a(this.gKe, null, "MM_Thread_Pool_Free_Thread#" + this.vmJ.getAndIncrement() + "#" + paramString);
      paramRunnable.setPriority(paramInt);
    }
  }
  
  static final class a
    extends Thread
  {
    private g vmL;
    
    a(ThreadGroup paramThreadGroup, g paramg, String paramString)
    {
      super(paramg, paramString);
      GMTrace.i(13987903176704L, 104218);
      this.vmL = paramg;
      GMTrace.o(13987903176704L, 104218);
    }
    
    public final void run()
    {
      GMTrace.i(13988171612160L, 104220);
      super.run();
      GMTrace.o(13988171612160L, 104220);
    }
    
    public final void start()
    {
      GMTrace.i(13988037394432L, 104219);
      super.start();
      GMTrace.o(13988037394432L, 104219);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
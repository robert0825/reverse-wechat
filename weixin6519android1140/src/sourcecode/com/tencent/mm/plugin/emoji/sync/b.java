package com.tencent.mm.plugin.emoji.sync;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.c.h;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class b
{
  public final int gKh;
  public final int kmk;
  public final Executor kml;
  
  public b(a parama)
  {
    GMTrace.i(11324755017728L, 84376);
    this.kmk = parama.kmk;
    this.gKh = parama.gKh;
    this.kml = parama.kmm;
    GMTrace.o(11324755017728L, 84376);
  }
  
  public static final class a
  {
    public int gKh;
    public int kmk;
    public ExecutorService kmm;
    
    public a()
    {
      GMTrace.i(11325157670912L, 84379);
      GMTrace.o(11325157670912L, 84379);
    }
  }
  
  public static final class b
    extends ThreadPoolExecutor
    implements h
  {
    private ReentrantLock gKi;
    private Condition gKj;
    private boolean isPaused;
    
    public b(int paramInt1, int paramInt2, TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue, ThreadFactory paramThreadFactory)
    {
      super(paramInt2, 0L, paramTimeUnit, paramBlockingQueue, paramThreadFactory);
      GMTrace.i(11322741751808L, 84361);
      this.gKi = new ReentrantLock();
      this.gKj = this.gKi.newCondition();
      GMTrace.o(11322741751808L, 84361);
    }
    
    /* Error */
    protected final void beforeExecute(Thread paramThread, Runnable paramRunnable)
    {
      // Byte code:
      //   0: ldc2_w 53
      //   3: ldc 55
      //   5: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_0
      //   9: aload_1
      //   10: aload_2
      //   11: invokespecial 57	java/util/concurrent/ThreadPoolExecutor:beforeExecute	(Ljava/lang/Thread;Ljava/lang/Runnable;)V
      //   14: aload_0
      //   15: getfield 36	com/tencent/mm/plugin/emoji/sync/b$b:gKi	Ljava/util/concurrent/locks/ReentrantLock;
      //   18: invokevirtual 60	java/util/concurrent/locks/ReentrantLock:lock	()V
      //   21: aload_0
      //   22: getfield 62	com/tencent/mm/plugin/emoji/sync/b$b:isPaused	Z
      //   25: ifeq +54 -> 79
      //   28: aload_0
      //   29: getfield 42	com/tencent/mm/plugin/emoji/sync/b$b:gKj	Ljava/util/concurrent/locks/Condition;
      //   32: invokeinterface 67 1 0
      //   37: goto -16 -> 21
      //   40: astore_2
      //   41: aload_1
      //   42: invokevirtual 72	java/lang/Thread:interrupt	()V
      //   45: ldc 74
      //   47: ldc 76
      //   49: iconst_1
      //   50: anewarray 78	java/lang/Object
      //   53: dup
      //   54: iconst_0
      //   55: aload_2
      //   56: invokevirtual 82	java/lang/Exception:toString	()Ljava/lang/String;
      //   59: aastore
      //   60: invokestatic 88	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   63: aload_0
      //   64: getfield 36	com/tencent/mm/plugin/emoji/sync/b$b:gKi	Ljava/util/concurrent/locks/ReentrantLock;
      //   67: invokevirtual 91	java/util/concurrent/locks/ReentrantLock:unlock	()V
      //   70: ldc2_w 53
      //   73: ldc 55
      //   75: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   78: return
      //   79: aload_0
      //   80: getfield 36	com/tencent/mm/plugin/emoji/sync/b$b:gKi	Ljava/util/concurrent/locks/ReentrantLock;
      //   83: invokevirtual 91	java/util/concurrent/locks/ReentrantLock:unlock	()V
      //   86: ldc2_w 53
      //   89: ldc 55
      //   91: invokestatic 45	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   94: return
      //   95: astore_1
      //   96: aload_0
      //   97: getfield 36	com/tencent/mm/plugin/emoji/sync/b$b:gKi	Ljava/util/concurrent/locks/ReentrantLock;
      //   100: invokevirtual 91	java/util/concurrent/locks/ReentrantLock:unlock	()V
      //   103: aload_1
      //   104: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	105	0	this	b
      //   0	105	1	paramThread	Thread
      //   0	105	2	paramRunnable	Runnable
      // Exception table:
      //   from	to	target	type
      //   21	37	40	java/lang/Exception
      //   21	37	95	finally
      //   41	63	95	finally
    }
    
    public final void execute(Runnable paramRunnable)
    {
      GMTrace.i(11323278622720L, 84365);
      super.execute(paramRunnable);
      GMTrace.o(11323278622720L, 84365);
    }
    
    public final boolean isPause()
    {
      GMTrace.i(11323412840448L, 84366);
      boolean bool = this.isPaused;
      GMTrace.o(11323412840448L, 84366);
      return bool;
    }
    
    public final void pause()
    {
      GMTrace.i(11323010187264L, 84363);
      this.gKi.lock();
      try
      {
        this.isPaused = true;
        this.gKi.unlock();
        GMTrace.o(11323010187264L, 84363);
        return;
      }
      finally
      {
        this.gKi.unlock();
      }
    }
    
    public final void remove(Object paramObject)
    {
      GMTrace.i(11323547058176L, 84367);
      GMTrace.o(11323547058176L, 84367);
    }
    
    public final void resume()
    {
      GMTrace.i(11323144404992L, 84364);
      this.gKi.lock();
      try
      {
        this.isPaused = false;
        this.gKj.signalAll();
        this.gKi.unlock();
        GMTrace.o(11323144404992L, 84364);
        return;
      }
      finally
      {
        this.gKi.unlock();
      }
    }
  }
  
  public static final class c
    implements ThreadFactory
  {
    private static final AtomicInteger gKd;
    private final ThreadGroup gKe;
    private final AtomicInteger gKf;
    private final String gKg;
    private final int gKh;
    
    static
    {
      GMTrace.i(11321936445440L, 84355);
      gKd = new AtomicInteger(1);
      GMTrace.o(11321936445440L, 84355);
    }
    
    c(int paramInt, String paramString)
    {
      GMTrace.i(11321668009984L, 84353);
      this.gKf = new AtomicInteger(1);
      this.gKh = paramInt;
      Object localObject = System.getSecurityManager();
      if (localObject != null) {}
      for (localObject = ((SecurityManager)localObject).getThreadGroup();; localObject = Thread.currentThread().getThreadGroup())
      {
        this.gKe = ((ThreadGroup)localObject);
        this.gKg = (paramString + gKd.getAndIncrement() + "-thread-");
        GMTrace.o(11321668009984L, 84353);
        return;
      }
    }
    
    public final Thread newThread(Runnable paramRunnable)
    {
      GMTrace.i(11321802227712L, 84354);
      paramRunnable = new Thread(this.gKe, paramRunnable, this.gKg + this.gKf.getAndIncrement(), 0L);
      if (paramRunnable.isDaemon()) {
        paramRunnable.setDaemon(false);
      }
      paramRunnable.setPriority(this.gKh);
      GMTrace.o(11321802227712L, 84354);
      return paramRunnable;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\sync\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
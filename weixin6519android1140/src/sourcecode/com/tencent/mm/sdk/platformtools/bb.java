package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;

public abstract class bb<R>
{
  public long goz;
  private final long guG;
  private Object lock;
  private R result;
  private Runnable viN;
  public long vkZ;
  public boolean vla;
  
  public bb()
  {
    this(0L, null);
    GMTrace.i(13868315181056L, 103327);
    GMTrace.o(13868315181056L, 103327);
  }
  
  public bb(long paramLong, R paramR)
  {
    GMTrace.i(13868583616512L, 103329);
    this.lock = new Object();
    this.vla = false;
    this.viN = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13913680773120L, 103665);
        w.i("MicroMsg.SDK.SyncTask", "task run manualFinish = " + bb.this.vla);
        if (bb.this.vla) {
          bb.this.run();
        }
        for (;;)
        {
          bb.this.vkZ = bg.aI(bb.this.goz);
          GMTrace.o(13913680773120L, 103665);
          return;
          bb.this.bF(bb.this.run());
        }
      }
    };
    this.guG = paramLong;
    this.result = paramR;
    GMTrace.o(13868583616512L, 103329);
  }
  
  public bb(long paramLong, R paramR, boolean paramBoolean)
  {
    GMTrace.i(13868449398784L, 103328);
    this.lock = new Object();
    this.vla = false;
    this.viN = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13913680773120L, 103665);
        w.i("MicroMsg.SDK.SyncTask", "task run manualFinish = " + bb.this.vla);
        if (bb.this.vla) {
          bb.this.run();
        }
        for (;;)
        {
          bb.this.vkZ = bg.aI(bb.this.goz);
          GMTrace.o(13913680773120L, 103665);
          return;
          bb.this.bF(bb.this.run());
        }
      }
    };
    this.guG = paramLong;
    this.result = paramR;
    this.vla = true;
    GMTrace.o(13868449398784L, 103328);
  }
  
  /* Error */
  public final R b(ae paramae)
  {
    // Byte code:
    //   0: ldc2_w 67
    //   3: ldc 69
    //   5: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: ifnonnull +25 -> 34
    //   12: ldc 71
    //   14: ldc 73
    //   16: invokestatic 79	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: aload_0
    //   20: invokevirtual 83	com/tencent/mm/sdk/platformtools/bb:run	()Ljava/lang/Object;
    //   23: astore_1
    //   24: ldc2_w 67
    //   27: ldc 69
    //   29: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   32: aload_1
    //   33: areturn
    //   34: ldc 71
    //   36: ldc 85
    //   38: invokestatic 87	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   41: invokestatic 93	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   44: invokevirtual 97	java/lang/Thread:getId	()J
    //   47: aload_1
    //   48: invokevirtual 103	com/tencent/mm/sdk/platformtools/ae:getLooper	()Landroid/os/Looper;
    //   51: invokevirtual 108	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   54: invokevirtual 97	java/lang/Thread:getId	()J
    //   57: lcmp
    //   58: ifne +25 -> 83
    //   61: ldc 71
    //   63: ldc 110
    //   65: invokestatic 87	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: aload_0
    //   69: invokevirtual 83	com/tencent/mm/sdk/platformtools/bb:run	()Ljava/lang/Object;
    //   72: astore_1
    //   73: ldc2_w 67
    //   76: ldc 69
    //   78: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   81: aload_1
    //   82: areturn
    //   83: aload_0
    //   84: invokestatic 115	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   87: putfield 117	com/tencent/mm/sdk/platformtools/bb:goz	J
    //   90: aload_0
    //   91: getfield 44	com/tencent/mm/sdk/platformtools/bb:lock	Ljava/lang/Object;
    //   94: astore 4
    //   96: aload 4
    //   98: monitorenter
    //   99: ldc 71
    //   101: ldc 119
    //   103: invokestatic 87	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: aload_1
    //   107: aload_0
    //   108: getfield 51	com/tencent/mm/sdk/platformtools/bb:viN	Ljava/lang/Runnable;
    //   111: invokevirtual 123	com/tencent/mm/sdk/platformtools/ae:post	(Ljava/lang/Runnable;)Z
    //   114: pop
    //   115: aload_0
    //   116: getfield 44	com/tencent/mm/sdk/platformtools/bb:lock	Ljava/lang/Object;
    //   119: aload_0
    //   120: getfield 53	com/tencent/mm/sdk/platformtools/bb:guG	J
    //   123: invokevirtual 127	java/lang/Object:wait	(J)V
    //   126: aload 4
    //   128: monitorexit
    //   129: aload_0
    //   130: getfield 117	com/tencent/mm/sdk/platformtools/bb:goz	J
    //   133: invokestatic 131	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   136: lstore_2
    //   137: ldc 71
    //   139: ldc -123
    //   141: iconst_4
    //   142: anewarray 5	java/lang/Object
    //   145: dup
    //   146: iconst_0
    //   147: new 135	java/lang/StringBuilder
    //   150: dup
    //   151: invokespecial 136	java/lang/StringBuilder:<init>	()V
    //   154: aload_0
    //   155: getfield 55	com/tencent/mm/sdk/platformtools/bb:result	Ljava/lang/Object;
    //   158: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   161: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: aastore
    //   165: dup
    //   166: iconst_1
    //   167: lload_2
    //   168: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   171: aastore
    //   172: dup
    //   173: iconst_2
    //   174: aload_0
    //   175: getfield 152	com/tencent/mm/sdk/platformtools/bb:vkZ	J
    //   178: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   181: aastore
    //   182: dup
    //   183: iconst_3
    //   184: lload_2
    //   185: aload_0
    //   186: getfield 152	com/tencent/mm/sdk/platformtools/bb:vkZ	J
    //   189: lsub
    //   190: invokestatic 150	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   193: aastore
    //   194: invokestatic 155	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   197: aload_0
    //   198: getfield 55	com/tencent/mm/sdk/platformtools/bb:result	Ljava/lang/Object;
    //   201: astore_1
    //   202: ldc2_w 67
    //   205: ldc 69
    //   207: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   210: aload_1
    //   211: areturn
    //   212: astore_1
    //   213: aload 4
    //   215: monitorexit
    //   216: aload_1
    //   217: athrow
    //   218: astore_1
    //   219: ldc 71
    //   221: aload_1
    //   222: ldc -99
    //   224: iconst_0
    //   225: anewarray 5	java/lang/Object
    //   228: invokestatic 161	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   231: goto -102 -> 129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	bb
    //   0	234	1	paramae	ae
    //   136	49	2	l	long
    // Exception table:
    //   from	to	target	type
    //   99	129	212	finally
    //   213	216	212	finally
    //   90	99	218	java/lang/InterruptedException
    //   216	218	218	java/lang/InterruptedException
  }
  
  public final void bF(R arg1)
  {
    GMTrace.i(13868717834240L, 103330);
    w.i("MicroMsg.SDK.SyncTask", "setResultFinish ");
    this.result = ???;
    synchronized (this.lock)
    {
      w.i("MicroMsg.SDK.SyncTask", "setResultFinish synchronized");
      this.lock.notify();
      GMTrace.o(13868717834240L, 103330);
      return;
    }
  }
  
  public abstract R run();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
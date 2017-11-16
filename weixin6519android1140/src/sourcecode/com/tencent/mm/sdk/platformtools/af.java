package com.tencent.mm.sdk.platformtools;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;

public class af
{
  private static ae vir;
  private ae ldy;
  public HandlerThread ngv;
  private String vis;
  
  static
  {
    GMTrace.i(13875965591552L, 103384);
    vir = null;
    GMTrace.o(13875965591552L, 103384);
  }
  
  public af()
  {
    GMTrace.i(13873818107904L, 103368);
    this.ngv = null;
    this.ldy = null;
    this.vis = null;
    w.i("MicroMsg.MMHandlerThread", "init stack:%s", new Object[] { bg.bQW() });
    RV(null);
    GMTrace.o(13873818107904L, 103368);
  }
  
  public af(String paramString)
  {
    GMTrace.i(13873952325632L, 103369);
    this.ngv = null;
    this.ldy = null;
    this.vis = null;
    RV(paramString);
    GMTrace.o(13873952325632L, 103369);
  }
  
  public static void Am(int paramInt)
  {
    GMTrace.i(13873147019264L, 103363);
    try
    {
      Process.setThreadPriority(paramInt);
      w.i("MicroMsg.MMHandlerThread", "setCurrentPriority to %d ok", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(13873147019264L, 103363);
      return;
    }
    catch (Exception localException)
    {
      w.i("MicroMsg.MMHandlerThread", "setCurrentPriority to %d fail, %s", new Object[] { Integer.valueOf(paramInt), localException.getMessage() });
      w.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
      GMTrace.o(13873147019264L, 103363);
    }
  }
  
  public static void F(Runnable paramRunnable)
  {
    GMTrace.i(13875428720640L, 103380);
    if (paramRunnable == null)
    {
      GMTrace.o(13875428720640L, 103380);
      return;
    }
    bQj().removeCallbacks(paramRunnable);
    GMTrace.o(13875428720640L, 103380);
  }
  
  public static void G(Runnable paramRunnable)
  {
    GMTrace.i(16090289668096L, 119882);
    bQj().postAtFrontOfQueueV2(paramRunnable);
    GMTrace.o(16090289668096L, 119882);
  }
  
  private static ae bQj()
  {
    GMTrace.i(13875026067456L, 103377);
    if (vir == null) {
      vir = new ae(Looper.getMainLooper());
    }
    ae localae = vir;
    GMTrace.o(13875026067456L, 103377);
    return localae;
  }
  
  public static void i(Runnable paramRunnable, long paramLong)
  {
    GMTrace.i(13875294502912L, 103379);
    if (paramRunnable == null)
    {
      GMTrace.o(13875294502912L, 103379);
      return;
    }
    bQj().postDelayed(paramRunnable, paramLong);
    GMTrace.o(13875294502912L, 103379);
  }
  
  public static boolean isMainThread()
  {
    GMTrace.i(13874891849728L, 103376);
    if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId())
    {
      GMTrace.o(13874891849728L, 103376);
      return true;
    }
    GMTrace.o(13874891849728L, 103376);
    return false;
  }
  
  public static void t(Runnable paramRunnable)
  {
    GMTrace.i(13875160285184L, 103378);
    if (paramRunnable == null)
    {
      GMTrace.o(13875160285184L, 103378);
      return;
    }
    bQj().post(paramRunnable);
    GMTrace.o(13875160285184L, 103378);
  }
  
  public int A(Runnable paramRunnable)
  {
    GMTrace.i(13874354978816L, 103372);
    if (paramRunnable == null)
    {
      GMTrace.o(13874354978816L, 103372);
      return -1;
    }
    bQi().post(paramRunnable);
    GMTrace.o(13874354978816L, 103372);
    return 0;
  }
  
  public final int E(Runnable paramRunnable)
  {
    GMTrace.i(13874489196544L, 103373);
    bQi().postAtFrontOfQueueV2(paramRunnable);
    GMTrace.o(13874489196544L, 103373);
    return 0;
  }
  
  public final void RV(String paramString)
  {
    GMTrace.i(13873012801536L, 103362);
    this.ldy = null;
    String str = paramString;
    if (bg.nm(paramString)) {
      str = "MMHandlerThread";
    }
    this.vis = str;
    this.ngv = e.cK(this.vis, 0);
    this.ngv.start();
    GMTrace.o(13873012801536L, 103362);
  }
  
  public final int a(final a parama)
  {
    GMTrace.i(13874757632000L, 103375);
    if (new ae(this.ngv.getLooper()).postAtFrontOfQueueV2(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13867778310144L, 103323);
        parama.Dj();
        af.G(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(13935424045056L, 103827);
            af.2.this.vix.Dk();
            GMTrace.o(13935424045056L, 103827);
          }
        });
        GMTrace.o(13867778310144L, 103323);
      }
      
      public final String toString()
      {
        GMTrace.i(13867912527872L, 103324);
        String str = super.toString() + "|" + parama.toString();
        GMTrace.o(13867912527872L, 103324);
        return str;
      }
    }))
    {
      GMTrace.o(13874757632000L, 103375);
      return 0;
    }
    GMTrace.o(13874757632000L, 103375);
    return -2;
  }
  
  /* Error */
  public final int a(final b paramb)
  {
    // Byte code:
    //   0: ldc2_w 217
    //   3: ldc -37
    //   5: invokestatic 34	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc 54
    //   10: ldc -35
    //   12: iconst_2
    //   13: anewarray 4	java/lang/Object
    //   16: dup
    //   17: iconst_0
    //   18: invokestatic 159	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   21: invokevirtual 163	java/lang/Thread:getId	()J
    //   24: invokestatic 226	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   27: aastore
    //   28: dup
    //   29: iconst_1
    //   30: invokestatic 62	com/tencent/mm/sdk/platformtools/bg:bQW	()Lcom/tencent/mm/sdk/platformtools/ah;
    //   33: aastore
    //   34: invokestatic 67	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   37: ldc -28
    //   39: invokestatic 230	com/tencent/mm/sdk/platformtools/af:isMainThread	()Z
    //   42: invokestatic 236	junit/framework/Assert:assertTrue	(Ljava/lang/String;Z)V
    //   45: aload_0
    //   46: getfield 48	com/tencent/mm/sdk/platformtools/af:ngv	Landroid/os/HandlerThread;
    //   49: invokevirtual 237	android/os/HandlerThread:getId	()J
    //   52: lstore_3
    //   53: iconst_0
    //   54: newarray <illegal type>
    //   56: astore 7
    //   58: new 6	com/tencent/mm/sdk/platformtools/af$1
    //   61: dup
    //   62: aload_0
    //   63: aload_1
    //   64: aload_0
    //   65: getfield 52	com/tencent/mm/sdk/platformtools/af:vis	Ljava/lang/String;
    //   68: aload 7
    //   70: invokespecial 240	com/tencent/mm/sdk/platformtools/af$1:<init>	(Lcom/tencent/mm/sdk/platformtools/af;Lcom/tencent/mm/sdk/platformtools/af$b;Ljava/lang/String;Ljava/lang/Object;)V
    //   73: astore_1
    //   74: aload 7
    //   76: monitorenter
    //   77: aload_0
    //   78: aload_1
    //   79: invokevirtual 242	com/tencent/mm/sdk/platformtools/af:a	(Lcom/tencent/mm/sdk/platformtools/af$a;)I
    //   82: istore_2
    //   83: aload_0
    //   84: getfield 48	com/tencent/mm/sdk/platformtools/af:ngv	Landroid/os/HandlerThread;
    //   87: invokevirtual 237	android/os/HandlerThread:getId	()J
    //   90: lstore 5
    //   92: ldc 54
    //   94: ldc -12
    //   96: iconst_3
    //   97: anewarray 4	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: iload_2
    //   103: invokestatic 94	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   106: aastore
    //   107: dup
    //   108: iconst_1
    //   109: lload_3
    //   110: invokestatic 226	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   113: aastore
    //   114: dup
    //   115: iconst_2
    //   116: lload 5
    //   118: invokestatic 226	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   121: aastore
    //   122: invokestatic 67	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   125: iload_2
    //   126: ifne +15 -> 141
    //   129: lload_3
    //   130: lload 5
    //   132: lcmp
    //   133: ifne +8 -> 141
    //   136: aload 7
    //   138: invokevirtual 247	java/lang/Object:wait	()V
    //   141: aload 7
    //   143: monitorexit
    //   144: ldc2_w 217
    //   147: ldc -37
    //   149: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   152: iload_2
    //   153: ireturn
    //   154: astore_1
    //   155: ldc 54
    //   157: ldc -7
    //   159: iconst_1
    //   160: anewarray 4	java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload_1
    //   166: invokevirtual 100	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   169: aastore
    //   170: invokestatic 252	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: goto -32 -> 141
    //   176: astore_1
    //   177: aload 7
    //   179: monitorexit
    //   180: aload_1
    //   181: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	af
    //   0	182	1	paramb	b
    //   82	71	2	i	int
    //   52	78	3	l1	long
    //   90	41	5	l2	long
    //   56	122	7	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   136	141	154	java/lang/Exception
    //   77	125	176	finally
    //   136	141	176	finally
    //   141	144	176	finally
    //   155	173	176	finally
    //   177	180	176	finally
  }
  
  public final void bQe()
  {
    GMTrace.i(13873281236992L, 103364);
    if ((this.ngv == null) || (!this.ngv.isAlive()))
    {
      w.e("MicroMsg.MMHandlerThread", "setLowestPriority failed thread is dead");
      GMTrace.o(13873281236992L, 103364);
      return;
    }
    int i = this.ngv.getThreadId();
    try
    {
      if (19 == Process.getThreadPriority(i))
      {
        w.w("MicroMsg.MMHandlerThread", "setLowestPriority No Need.");
        GMTrace.o(13873281236992L, 103364);
        return;
      }
      Process.setThreadPriority(i, 19);
      w.i("MicroMsg.MMHandlerThread", "thread:%d setLowestPriority to %d", new Object[] { Integer.valueOf(i), Integer.valueOf(Process.getThreadPriority(i)) });
      GMTrace.o(13873281236992L, 103364);
      return;
    }
    catch (Exception localException)
    {
      w.w("MicroMsg.MMHandlerThread", "thread:%d setLowestPriority failed", new Object[] { Integer.valueOf(i) });
      w.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
      GMTrace.o(13873281236992L, 103364);
    }
  }
  
  public final void bQf()
  {
    GMTrace.i(13873415454720L, 103365);
    if ((this.ngv == null) || (!this.ngv.isAlive()))
    {
      w.e("MicroMsg.MMHandlerThread", "setHighPriority failed thread is dead");
      GMTrace.o(13873415454720L, 103365);
      return;
    }
    int i = this.ngv.getThreadId();
    try
    {
      if (-8 == Process.getThreadPriority(i))
      {
        w.w("MicroMsg.MMHandlerThread", "setHighPriority No Need.");
        GMTrace.o(13873415454720L, 103365);
        return;
      }
      Process.setThreadPriority(i, -8);
      w.i("MicroMsg.MMHandlerThread", "thread:%d setHighPriority to %d", new Object[] { Integer.valueOf(i), Integer.valueOf(Process.getThreadPriority(i)) });
      GMTrace.o(13873415454720L, 103365);
      return;
    }
    catch (Exception localException)
    {
      w.w("MicroMsg.MMHandlerThread", "thread:%d setHighPriority failed", new Object[] { Integer.valueOf(i) });
      w.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
      GMTrace.o(13873415454720L, 103365);
    }
  }
  
  public final boolean bQg()
  {
    GMTrace.i(13873549672448L, 103366);
    if ((this.ngv == null) || (!this.ngv.isAlive()))
    {
      w.e("MicroMsg.MMHandlerThread", "check inHighPriority failed thread is dead");
      GMTrace.o(13873549672448L, 103366);
      return false;
    }
    int i = this.ngv.getThreadId();
    try
    {
      int j = Process.getThreadPriority(i);
      if (-8 == j)
      {
        GMTrace.o(13873549672448L, 103366);
        return true;
      }
    }
    catch (Exception localException)
    {
      w.w("MicroMsg.MMHandlerThread", "thread:%d  check inHighPriority failed", new Object[] { Integer.valueOf(i) });
      w.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
      GMTrace.o(13873549672448L, 103366);
    }
    return false;
  }
  
  public final void bQh()
  {
    GMTrace.i(13873683890176L, 103367);
    if ((this.ngv == null) || (!this.ngv.isAlive()))
    {
      w.e("MicroMsg.MMHandlerThread", "setLowPriority failed thread is dead");
      GMTrace.o(13873683890176L, 103367);
      return;
    }
    int i = this.ngv.getThreadId();
    try
    {
      if (Process.getThreadPriority(i) == 0)
      {
        w.w("MicroMsg.MMHandlerThread", "setLowPriority No Need.");
        GMTrace.o(13873683890176L, 103367);
        return;
      }
      Process.setThreadPriority(i, 0);
      w.i("MicroMsg.MMHandlerThread", "thread:%d setLowPriority to %d", new Object[] { Integer.valueOf(i), Integer.valueOf(Process.getThreadPriority(i)) });
      GMTrace.o(13873683890176L, 103367);
      return;
    }
    catch (Exception localException)
    {
      w.w("MicroMsg.MMHandlerThread", "thread:%d setLowPriority failed", new Object[] { Integer.valueOf(i) });
      w.printErrStackTrace("MicroMsg.MMHandlerThread", localException, "", new Object[0]);
      GMTrace.o(13873683890176L, 103367);
    }
  }
  
  public final ae bQi()
  {
    GMTrace.i(13874086543360L, 103370);
    if (this.ldy == null) {
      this.ldy = new ae(this.ngv.getLooper());
    }
    ae localae = this.ldy;
    GMTrace.o(13874086543360L, 103370);
    return localae;
  }
  
  public final int h(Runnable paramRunnable, long paramLong)
  {
    GMTrace.i(13874623414272L, 103374);
    if (paramRunnable == null)
    {
      GMTrace.o(13874623414272L, 103374);
      return -1;
    }
    bQi().postDelayed(paramRunnable, paramLong);
    GMTrace.o(13874623414272L, 103374);
    return 0;
  }
  
  public static abstract interface a
  {
    public abstract boolean Dj();
    
    public abstract boolean Dk();
  }
  
  public static abstract interface b
  {
    public abstract void xC();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
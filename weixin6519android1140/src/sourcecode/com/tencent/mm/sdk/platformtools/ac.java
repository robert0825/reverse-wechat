package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;

public final class ac
{
  public volatile boolean vip;
  
  public ac()
  {
    GMTrace.i(13925223497728L, 103751);
    this.vip = false;
    GMTrace.o(13925223497728L, 103751);
  }
  
  public ac(boolean paramBoolean)
  {
    GMTrace.i(13925357715456L, 103752);
    this.vip = paramBoolean;
    GMTrace.o(13925357715456L, 103752);
  }
  
  /* Error */
  public final boolean bQd()
  {
    // Byte code:
    //   0: ldc2_w 34
    //   3: ldc 36
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc2_w 37
    //   11: lconst_0
    //   12: lcmp
    //   13: ifeq +72 -> 85
    //   16: aload_0
    //   17: monitorenter
    //   18: invokestatic 44	java/lang/System:currentTimeMillis	()J
    //   21: lstore_1
    //   22: ldc2_w 37
    //   25: lload_1
    //   26: ladd
    //   27: lstore_3
    //   28: aload_0
    //   29: getfield 21	com/tencent/mm/sdk/platformtools/ac:vip	Z
    //   32: istore 5
    //   34: iload 5
    //   36: ifne +23 -> 59
    //   39: lload_1
    //   40: lload_3
    //   41: lcmp
    //   42: ifge +17 -> 59
    //   45: aload_0
    //   46: lload_3
    //   47: lload_1
    //   48: lsub
    //   49: invokevirtual 48	java/lang/Object:wait	(J)V
    //   52: invokestatic 44	java/lang/System:currentTimeMillis	()J
    //   55: lstore_1
    //   56: goto -28 -> 28
    //   59: aload_0
    //   60: getfield 21	com/tencent/mm/sdk/platformtools/ac:vip	Z
    //   63: istore 5
    //   65: aload_0
    //   66: monitorexit
    //   67: ldc2_w 34
    //   70: ldc 36
    //   72: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   75: iload 5
    //   77: ireturn
    //   78: astore 6
    //   80: aload_0
    //   81: monitorexit
    //   82: aload 6
    //   84: athrow
    //   85: aload_0
    //   86: invokevirtual 51	com/tencent/mm/sdk/platformtools/ac:block	()V
    //   89: ldc2_w 34
    //   92: ldc 36
    //   94: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   97: iconst_1
    //   98: ireturn
    //   99: astore 6
    //   101: goto -49 -> 52
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	ac
    //   21	35	1	l1	long
    //   27	20	3	l2	long
    //   32	44	5	bool	boolean
    //   78	5	6	localObject	Object
    //   99	1	6	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   18	22	78	finally
    //   28	34	78	finally
    //   45	52	78	finally
    //   52	56	78	finally
    //   59	67	78	finally
    //   80	82	78	finally
    //   45	52	99	java/lang/InterruptedException
  }
  
  public final void block()
  {
    GMTrace.i(13925760368640L, 103755);
    try
    {
      for (;;)
      {
        boolean bool = this.vip;
        if (bool) {
          break;
        }
        try
        {
          wait();
        }
        catch (InterruptedException localInterruptedException) {}
      }
      GMTrace.o(13925760368640L, 103755);
      return;
    }
    finally {}
  }
  
  public final void close()
  {
    GMTrace.i(13925626150912L, 103754);
    try
    {
      this.vip = false;
      GMTrace.o(13925626150912L, 103754);
      return;
    }
    finally {}
  }
  
  public final void open()
  {
    GMTrace.i(13925491933184L, 103753);
    try
    {
      boolean bool = this.vip;
      this.vip = true;
      if (!bool) {
        notifyAll();
      }
      GMTrace.o(13925491933184L, 103753);
      return;
    }
    finally {}
  }
  
  public final String toString()
  {
    GMTrace.i(13926028804096L, 103757);
    String str = "MMConditionVariable[" + hashCode() + "," + this.vip + "]";
    GMTrace.o(13926028804096L, 103757);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\sdk\platformtools\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
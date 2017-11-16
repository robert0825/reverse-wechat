package com.tencent.mm.plugin.music.a.f;

import com.tencent.gmtrace.GMTrace;

public final class j
{
  public int nsg;
  
  public j()
  {
    GMTrace.i(4864721551360L, 36245);
    this.nsg = 4;
    GMTrace.o(4864721551360L, 36245);
  }
  
  /* Error */
  public final boolean aTp()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 28
    //   5: ldc 30
    //   7: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 21	com/tencent/mm/plugin/music/a/f/j:nsg	I
    //   14: iconst_2
    //   15: if_icmpne +17 -> 32
    //   18: iconst_1
    //   19: istore_1
    //   20: ldc2_w 28
    //   23: ldc 30
    //   25: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   28: aload_0
    //   29: monitorexit
    //   30: iload_1
    //   31: ireturn
    //   32: iconst_0
    //   33: istore_1
    //   34: ldc2_w 28
    //   37: ldc 30
    //   39: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   42: goto -14 -> 28
    //   45: astore_2
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_2
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	j
    //   19	15	1	bool	boolean
    //   45	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	18	45	finally
    //   20	28	45	finally
    //   34	42	45	finally
  }
  
  /* Error */
  public final boolean isPlaying()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 32
    //   5: ldc 34
    //   7: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 21	com/tencent/mm/plugin/music/a/f/j:nsg	I
    //   14: iconst_3
    //   15: if_icmpne +17 -> 32
    //   18: iconst_1
    //   19: istore_1
    //   20: ldc2_w 32
    //   23: ldc 34
    //   25: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   28: aload_0
    //   29: monitorexit
    //   30: iload_1
    //   31: ireturn
    //   32: iconst_0
    //   33: istore_1
    //   34: ldc2_w 32
    //   37: ldc 34
    //   39: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   42: goto -14 -> 28
    //   45: astore_2
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_2
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	j
    //   19	15	1	bool	boolean
    //   45	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	18	45	finally
    //   20	28	45	finally
    //   34	42	45	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\f\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
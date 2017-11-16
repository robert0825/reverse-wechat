package com.d.a.a;

import android.os.Handler;

abstract class c
  extends d
{
  private boolean aDH;
  
  void a(Handler paramHandler, d.a parama)
  {
    try
    {
      this.aDH = false;
      super.a(paramHandler, parama);
      return;
    }
    finally
    {
      paramHandler = finally;
      throw paramHandler;
    }
  }
  
  /* Error */
  final void aj(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 15	com/d/a/a/c:aDH	Z
    //   6: iload_1
    //   7: ixor
    //   8: ifeq +19 -> 27
    //   11: aload_0
    //   12: iload_1
    //   13: putfield 15	com/d/a/a/c:aDH	Z
    //   16: aload_0
    //   17: getfield 15	com/d/a/a/c:aDH	Z
    //   20: ifeq +10 -> 30
    //   23: aload_0
    //   24: invokevirtual 22	com/d/a/a/c:nD	()V
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: aload_0
    //   31: invokevirtual 25	com/d/a/a/c:nE	()V
    //   34: goto -7 -> 27
    //   37: astore_2
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_2
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	c
    //   0	42	1	paramBoolean	boolean
    //   37	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	27	37	finally
    //   30	34	37	finally
  }
  
  abstract void nD();
  
  abstract void nE();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
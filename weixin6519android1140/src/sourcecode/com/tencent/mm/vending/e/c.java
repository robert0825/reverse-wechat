package com.tencent.mm.vending.e;

import com.tencent.gmtrace.GMTrace;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c<_Target extends a>
  implements a, b<_Target>
{
  private List<WeakReference<_Target>> xxM;
  private boolean xxN;
  
  public c()
  {
    GMTrace.i(276891172864L, 2063);
    this.xxM = new ArrayList();
    this.xxN = true;
    GMTrace.o(276891172864L, 2063);
  }
  
  /* Error */
  public final void a(_Target param_Target)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 40
    //   5: sipush 2064
    //   8: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 33	com/tencent/mm/vending/e/c:xxN	Z
    //   15: ifne +25 -> 40
    //   18: aload_1
    //   19: invokestatic 47	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   22: aload_1
    //   23: invokeinterface 50 1 0
    //   28: ldc2_w 40
    //   31: sipush 2064
    //   34: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: aload_0
    //   41: getfield 31	com/tencent/mm/vending/e/c:xxM	Ljava/util/List;
    //   44: new 52	java/lang/ref/WeakReference
    //   47: dup
    //   48: aload_1
    //   49: invokespecial 54	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   52: invokeinterface 60 2 0
    //   57: pop
    //   58: ldc2_w 40
    //   61: sipush 2064
    //   64: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   67: goto -30 -> 37
    //   70: astore_1
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_1
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	c
    //   0	75	1	param_Target	_Target
    // Exception table:
    //   from	to	target	type
    //   2	37	70	finally
    //   40	67	70	finally
  }
  
  public final void dead()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(277159608320L, 2065);
        if (!this.xxN)
        {
          GMTrace.o(277159608320L, 2065);
          return;
        }
        Iterator localIterator = this.xxM.iterator();
        if (localIterator.hasNext())
        {
          a locala = (a)((WeakReference)localIterator.next()).get();
          if (locala == null) {
            continue;
          }
          locala.dead();
          continue;
        }
        this.xxM.clear();
      }
      finally {}
      this.xxN = false;
      GMTrace.o(277159608320L, 2065);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
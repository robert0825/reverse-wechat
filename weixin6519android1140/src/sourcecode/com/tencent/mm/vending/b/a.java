package com.tencent.mm.vending.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.h.d;
import com.tencent.mm.vending.h.f;
import com.tencent.mm.vending.h.g;
import java.util.LinkedList;
import junit.framework.Assert;

public abstract class a<_Callback>
{
  protected d esx;
  private LinkedList<b> xxB;
  public f xxC;
  
  public a()
  {
    this(g.ckr());
    GMTrace.i(271925116928L, 2026);
    GMTrace.o(271925116928L, 2026);
  }
  
  public a(d paramd)
  {
    GMTrace.i(272193552384L, 2028);
    this.xxB = new LinkedList();
    Assert.assertNotNull(paramd);
    this.esx = paramd;
    this.xxC = new f(paramd, null);
    GMTrace.o(272193552384L, 2028);
  }
  
  public final b a(b paramb)
  {
    try
    {
      GMTrace.i(272327770112L, 2029);
      this.xxB.add(paramb);
      GMTrace.o(272327770112L, 2029);
      return paramb;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  /* Error */
  public final void b(b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 70
    //   5: sipush 2030
    //   8: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_1
    //   12: ifnonnull +15 -> 27
    //   15: ldc2_w 70
    //   18: sipush 2030
    //   21: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: aload_0
    //   28: getfield 44	com/tencent/mm/vending/b/a:xxB	Ljava/util/LinkedList;
    //   31: aload_1
    //   32: invokevirtual 74	java/util/LinkedList:remove	(Ljava/lang/Object;)Z
    //   35: pop
    //   36: ldc2_w 70
    //   39: sipush 2030
    //   42: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   45: goto -21 -> 24
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	a
    //   0	53	1	paramb	b
    // Exception table:
    //   from	to	target	type
    //   2	11	48	finally
    //   15	24	48	finally
    //   27	45	48	finally
  }
  
  public final LinkedList<b> ckd()
  {
    try
    {
      GMTrace.i(272596205568L, 2031);
      LinkedList localLinkedList = new LinkedList(this.xxB);
      GMTrace.o(272596205568L, 2031);
      return localLinkedList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean contains(_Callback param_Callback)
  {
    try
    {
      GMTrace.i(272864641024L, 2033);
      boolean bool = this.xxB.contains(new b(param_Callback, this));
      GMTrace.o(272864641024L, 2033);
      return bool;
    }
    finally
    {
      param_Callback = finally;
      throw param_Callback;
    }
  }
  
  public final int size()
  {
    try
    {
      GMTrace.i(272730423296L, 2032);
      int i = this.xxB.size();
      GMTrace.o(272730423296L, 2032);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
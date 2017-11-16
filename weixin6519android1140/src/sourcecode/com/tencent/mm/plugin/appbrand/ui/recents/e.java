package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.SysConfigUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import junit.framework.Assert;

final class e
  extends ArrayList<com.tencent.mm.plugin.appbrand.c.e>
{
  private final ArrayList<com.tencent.mm.plugin.appbrand.c.e> iFu;
  private final ArrayList<com.tencent.mm.plugin.appbrand.c.e> iFv;
  
  e()
  {
    GMTrace.i(16367180840960L, 121945);
    this.iFu = new ArrayList(10);
    this.iFv = new ArrayList(200);
    GMTrace.o(16367180840960L, 121945);
  }
  
  static e c(ArrayList<com.tencent.mm.plugin.appbrand.c.e> paramArrayList1, ArrayList<com.tencent.mm.plugin.appbrand.c.e> paramArrayList2)
  {
    GMTrace.i(16367315058688L, 121946);
    e locale = new e();
    SysConfigUtil.e(locale.iFu, paramArrayList1);
    SysConfigUtil.e(locale.iFv, paramArrayList2);
    GMTrace.o(16367315058688L, 121946);
    return locale;
  }
  
  /* Error */
  private com.tencent.mm.plugin.appbrand.c.e jH(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 51
    //   5: ldc 53
    //   7: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: iload_1
    //   11: aload_0
    //   12: getfield 28	com/tencent/mm/plugin/appbrand/ui/recents/e:iFu	Ljava/util/ArrayList;
    //   15: invokevirtual 57	java/util/ArrayList:size	()I
    //   18: if_icmpge +27 -> 45
    //   21: aload_0
    //   22: getfield 28	com/tencent/mm/plugin/appbrand/ui/recents/e:iFu	Ljava/util/ArrayList;
    //   25: iload_1
    //   26: invokevirtual 61	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   29: checkcast 63	com/tencent/mm/plugin/appbrand/c/e
    //   32: astore_2
    //   33: ldc2_w 51
    //   36: ldc 53
    //   38: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_2
    //   44: areturn
    //   45: aload_0
    //   46: getfield 30	com/tencent/mm/plugin/appbrand/ui/recents/e:iFv	Ljava/util/ArrayList;
    //   49: iload_1
    //   50: aload_0
    //   51: getfield 28	com/tencent/mm/plugin/appbrand/ui/recents/e:iFu	Ljava/util/ArrayList;
    //   54: invokevirtual 57	java/util/ArrayList:size	()I
    //   57: isub
    //   58: invokevirtual 61	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   61: checkcast 63	com/tencent/mm/plugin/appbrand/c/e
    //   64: astore_2
    //   65: ldc2_w 51
    //   68: ldc 53
    //   70: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   73: goto -32 -> 41
    //   76: astore_2
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_2
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	e
    //   0	81	1	paramInt	int
    //   32	33	2	locale	com.tencent.mm.plugin.appbrand.c.e
    //   76	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	41	76	finally
    //   45	73	76	finally
  }
  
  final ArrayList<com.tencent.mm.plugin.appbrand.c.e> abt()
  {
    try
    {
      GMTrace.i(16367449276416L, 121947);
      ArrayList localArrayList = this.iFu;
      GMTrace.o(16367449276416L, 121947);
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final ArrayList<com.tencent.mm.plugin.appbrand.c.e> abu()
  {
    try
    {
      GMTrace.i(16367583494144L, 121948);
      ArrayList localArrayList = this.iFv;
      GMTrace.o(16367583494144L, 121948);
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final e abv()
  {
    try
    {
      GMTrace.i(16367851929600L, 121950);
      e locale = new e();
      locale.iFu.addAll(this.iFu);
      locale.iFv.addAll(this.iFv);
      GMTrace.o(16367851929600L, 121950);
      return locale;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean addAll(Collection<? extends com.tencent.mm.plugin.appbrand.c.e> paramCollection)
  {
    GMTrace.i(16367717711872L, 121949);
    if (e.class.isInstance(paramCollection)) {
      try
      {
        paramCollection = (e)paramCollection;
        this.iFu.addAll(paramCollection.iFu);
        this.iFv.addAll(paramCollection.iFv);
        GMTrace.o(16367717711872L, 121949);
        return true;
      }
      finally {}
    }
    Assert.assertTrue("collection type mismatch!!", false);
    GMTrace.o(16367717711872L, 121949);
    return false;
  }
  
  public final void clear()
  {
    try
    {
      GMTrace.i(16368388800512L, 121954);
      this.iFu.clear();
      this.iFv.clear();
      GMTrace.o(16368388800512L, 121954);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Iterator<com.tencent.mm.plugin.appbrand.c.e> iterator()
  {
    GMTrace.i(16368523018240L, 121955);
    Assert.assertTrue("Why you need this?? call @smoothieli fix it", false);
    Iterator local1 = new Iterator()
    {
      public final boolean hasNext()
      {
        GMTrace.i(16353490632704L, 121843);
        GMTrace.o(16353490632704L, 121843);
        return false;
      }
      
      public final void remove()
      {
        GMTrace.i(16353624850432L, 121844);
        GMTrace.o(16353624850432L, 121844);
      }
    };
    GMTrace.o(16368523018240L, 121955);
    return local1;
  }
  
  /* Error */
  public final com.tencent.mm.plugin.appbrand.c.e jI(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 131
    //   5: ldc -123
    //   7: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: iload_1
    //   11: aload_0
    //   12: getfield 28	com/tencent/mm/plugin/appbrand/ui/recents/e:iFu	Ljava/util/ArrayList;
    //   15: invokevirtual 57	java/util/ArrayList:size	()I
    //   18: if_icmpge +27 -> 45
    //   21: aload_0
    //   22: getfield 28	com/tencent/mm/plugin/appbrand/ui/recents/e:iFu	Ljava/util/ArrayList;
    //   25: iload_1
    //   26: invokevirtual 136	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   29: checkcast 63	com/tencent/mm/plugin/appbrand/c/e
    //   32: astore_2
    //   33: ldc2_w 131
    //   36: ldc -123
    //   38: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_2
    //   44: areturn
    //   45: aload_0
    //   46: getfield 30	com/tencent/mm/plugin/appbrand/ui/recents/e:iFv	Ljava/util/ArrayList;
    //   49: iload_1
    //   50: aload_0
    //   51: getfield 28	com/tencent/mm/plugin/appbrand/ui/recents/e:iFu	Ljava/util/ArrayList;
    //   54: invokevirtual 57	java/util/ArrayList:size	()I
    //   57: isub
    //   58: invokevirtual 136	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   61: checkcast 63	com/tencent/mm/plugin/appbrand/c/e
    //   64: astore_2
    //   65: ldc2_w 131
    //   68: ldc -123
    //   70: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   73: goto -32 -> 41
    //   76: astore_2
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_2
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	e
    //   0	81	1	paramInt	int
    //   32	33	2	locale	com.tencent.mm.plugin.appbrand.c.e
    //   76	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	41	76	finally
    //   45	73	76	finally
  }
  
  public final int size()
  {
    try
    {
      GMTrace.i(16367986147328L, 121951);
      int i = this.iFu.size();
      int j = this.iFv.size();
      GMTrace.o(16367986147328L, 121951);
      return i + j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\recents\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.kernel.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.f;
import com.tencent.mm.kernel.i;
import com.tencent.mm.kernel.j;
import com.tencent.mm.vending.g.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class a
{
  private static Map<Integer, Map> gae;
  private f<com.tencent.mm.kernel.b.a> fYF;
  private boolean gaa;
  private HashMap<Class<? extends com.tencent.mm.kernel.b.a>, com.tencent.mm.kernel.b.a> gab;
  private final HashMap<Class<? extends com.tencent.mm.kernel.b.a>, d> gac;
  public final ArrayList<d> gad;
  public b gaf;
  
  static
  {
    GMTrace.i(13493042413568L, 100531);
    gae = new ConcurrentHashMap();
    GMTrace.o(13493042413568L, 100531);
  }
  
  public a()
  {
    GMTrace.i(13491700236288L, 100521);
    this.gaa = false;
    this.gab = new HashMap();
    this.fYF = new f();
    this.gac = new HashMap();
    this.gad = new ArrayList();
    GMTrace.o(13491700236288L, 100521);
  }
  
  public static String O(long paramLong)
  {
    GMTrace.i(13492773978112L, 100529);
    String str = System.currentTimeMillis() - paramLong + "ms";
    GMTrace.o(13492773978112L, 100529);
    return str;
  }
  
  public static void a(d paramd, e parame)
  {
    GMTrace.i(13492102889472L, 100524);
    if (!gae.containsKey(Integer.valueOf(paramd.hashCode())))
    {
      a("boot task executing [%s] hash %s...", new Object[] { paramd.name(), Integer.valueOf(paramd.hashCode()) });
      paramd.execute(parame);
      gae.put(Integer.valueOf(paramd.hashCode()), gae);
      GMTrace.o(13492102889472L, 100524);
      return;
    }
    a("skip task %s execution hash %s", new Object[] { paramd.name(), Integer.valueOf(paramd.hashCode()) });
    GMTrace.o(13492102889472L, 100524);
  }
  
  public static final void a(String paramString, Object... paramVarArgs)
  {
    GMTrace.i(13492505542656L, 100527);
    if (paramVarArgs.length == 0)
    {
      j.i("MMSkeleton.Boot", paramString, new Object[0]);
      GMTrace.o(13492505542656L, 100527);
      return;
    }
    j.i("MMSkeleton.Boot", paramString, paramVarArgs);
    GMTrace.o(13492505542656L, 100527);
  }
  
  public static long timestamp()
  {
    GMTrace.i(13492639760384L, 100528);
    long l = System.currentTimeMillis();
    GMTrace.o(13492639760384L, 100528);
    return l;
  }
  
  protected final c<Void> a(c<Void> paramc, final long paramLong)
  {
    final ArrayList localArrayList;
    try
    {
      GMTrace.i(13491968671744L, 100523);
      this.gaa = true;
      Object localObject = new f(this.fYF);
      localArrayList = ((f)localObject).xt();
      a("boot task execution chain ... %s", new Object[] { localArrayList });
      localObject = ((f)localObject).xs();
      if (((ArrayList)localObject).size() > 0) {
        throw new RuntimeException("Found cycle dependencies! Between " + localObject);
      }
    }
    finally {}
    a("boot check tasks cycle dependency ok...", new Object[0]);
    paramc.a(new com.tencent.mm.vending.c.a() {});
    GMTrace.o(13491968671744L, 100523);
    return paramc;
  }
  
  /* Error */
  public final void a(d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 213
    //   5: ldc -41
    //   7: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 54	com/tencent/mm/kernel/a/a:gaa	Z
    //   14: ifne +23 -> 37
    //   17: aload_0
    //   18: getfield 71	com/tencent/mm/kernel/a/a:gad	Ljava/util/ArrayList;
    //   21: aload_1
    //   22: invokevirtual 218	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   25: pop
    //   26: ldc2_w 213
    //   29: ldc -41
    //   31: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: ldc -112
    //   39: ldc -36
    //   41: iconst_0
    //   42: anewarray 4	java/lang/Object
    //   45: invokestatic 223	com/tencent/mm/kernel/j:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   48: ldc2_w 213
    //   51: ldc -41
    //   53: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   56: goto -22 -> 34
    //   59: astore_1
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_1
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	a
    //   0	64	1	paramd	d
    // Exception table:
    //   from	to	target	type
    //   2	34	59	finally
    //   37	56	59	finally
  }
  
  public final void a(com.tencent.mm.kernel.b.a parama1, com.tencent.mm.kernel.b.a parama2)
  {
    try
    {
      GMTrace.i(18791958315008L, 140011);
      Assert.assertNotNull(parama1);
      if (!this.gab.containsKey(parama1.getClass())) {
        this.gab.put(parama1.getClass(), parama1);
      }
      this.fYF.p(parama1, parama2);
      GMTrace.o(18791958315008L, 140011);
      return;
    }
    finally {}
  }
  
  /* Error */
  public final <T extends d> void a(Class<? extends com.tencent.mm.kernel.b.a> paramClass, T paramT)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 245
    //   5: ldc -9
    //   7: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_1
    //   11: invokestatic 233	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   14: aload_2
    //   15: invokestatic 233	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   18: aload_0
    //   19: getfield 66	com/tencent/mm/kernel/a/a:gac	Ljava/util/HashMap;
    //   22: aload_1
    //   23: invokevirtual 238	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   26: ifeq +14 -> 40
    //   29: ldc2_w 245
    //   32: ldc -9
    //   34: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: aload_0
    //   41: getfield 66	com/tencent/mm/kernel/a/a:gac	Ljava/util/HashMap;
    //   44: aload_1
    //   45: aload_2
    //   46: invokevirtual 239	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   49: pop
    //   50: ldc2_w 245
    //   53: ldc -9
    //   55: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   58: goto -21 -> 37
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	a
    //   0	66	1	paramClass	Class<? extends com.tencent.mm.kernel.b.a>
    //   0	66	2	paramT	T
    // Exception table:
    //   from	to	target	type
    //   2	37	61	finally
    //   40	58	61	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
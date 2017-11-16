package com.tencent.mm.sdk.b;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.g.g;
import com.tencent.mm.vending.h.d;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import junit.framework.Assert;

public final class a
{
  public static a vgX;
  public a vgW;
  private final HashMap<Integer, LinkedList<c>> vgY;
  private final HashMap<Integer, b> vgZ;
  
  static
  {
    GMTrace.i(13956227792896L, 103982);
    vgX = new a();
    GMTrace.o(13956227792896L, 103982);
  }
  
  private a()
  {
    GMTrace.i(13955019833344L, 103973);
    this.vgW = new a();
    this.vgY = new HashMap();
    this.vgZ = new HashMap();
    GMTrace.o(13955019833344L, 103973);
  }
  
  private void a(LinkedList<c> paramLinkedList, b paramb)
  {
    GMTrace.i(13956093575168L, 103981);
    if (paramb.vhd) {
      Collections.sort(paramLinkedList, new Comparator() {});
    }
    c[] arrayOfc = new c[paramLinkedList.size()];
    paramLinkedList.toArray(arrayOfc);
    int j = arrayOfc.length;
    int i = 0;
    while ((i < j) && ((!arrayOfc[i].a(paramb)) || (!paramb.vhd))) {
      i += 1;
    }
    if (paramb.eDO != null) {
      paramb.eDO.run();
    }
    GMTrace.o(13956093575168L, 103981);
  }
  
  public final com.tencent.mm.vending.b.b<c> a(c paramc)
  {
    GMTrace.i(13955154051072L, 103974);
    try
    {
      Assert.assertNotNull("EventPoolImpl.add", paramc);
      w.v("MicroMsg.EventCenter", "addListener %s(%d)", new Object[] { paramc, Integer.valueOf(paramc.bPt()) });
      Object localObject2 = (b)this.vgZ.get(Integer.valueOf(paramc.bPt()));
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject2 = this.vgZ;
        int i = paramc.bPt();
        localObject1 = new b();
        ((HashMap)localObject2).put(Integer.valueOf(i), localObject1);
      }
      paramc = ((b)localObject1).a(new com.tencent.mm.vending.b.b(paramc, (com.tencent.mm.vending.b.a)localObject1));
      GMTrace.o(13955154051072L, 103974);
      return paramc;
    }
    finally {}
  }
  
  public final void a(final b paramb, Looper paramLooper)
  {
    GMTrace.i(13955690921984L, 103978);
    Assert.assertNotNull("EventPoolImpl.asyncPublish event", paramb);
    Assert.assertNotNull("EventPoolImpl.asyncPublish looper", paramLooper);
    w.v("MicroMsg.EventCenter", "publish %s(%d)", new Object[] { paramb, Integer.valueOf(paramb.bPt()) });
    new ae(paramLooper).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13956496228352L, 103984);
        a.vgX.m(paramb);
        GMTrace.o(13956496228352L, 103984);
      }
    });
    GMTrace.o(13955690921984L, 103978);
  }
  
  @Deprecated
  public final boolean b(c paramc)
  {
    GMTrace.i(13955288268800L, 103975);
    try
    {
      Assert.assertNotNull("EventPoolImpl.add", paramc);
      w.v("MicroMsg.EventCenter", "addListener %s(%d)", new Object[] { paramc, Integer.valueOf(paramc.bPt()) });
      Object localObject2 = (LinkedList)this.vgY.get(Integer.valueOf(paramc.bPt()));
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject2 = this.vgY;
        int i = paramc.bPt();
        localObject1 = new LinkedList();
        ((HashMap)localObject2).put(Integer.valueOf(i), localObject1);
      }
      if (((LinkedList)localObject1).contains(paramc))
      {
        GMTrace.o(13955288268800L, 103975);
        return true;
      }
      ListenerInstanceMonitor.bC(paramc);
      boolean bool = ((LinkedList)localObject1).add(paramc);
      GMTrace.o(13955288268800L, 103975);
      return bool;
    }
    finally {}
  }
  
  @Deprecated
  public final boolean c(c paramc)
  {
    boolean bool = false;
    GMTrace.i(13955422486528L, 103976);
    for (;;)
    {
      try
      {
        Assert.assertNotNull("EventPoolImpl.remove", paramc);
        w.v("MicroMsg.EventCenter", "removeListener %s(%d)", new Object[] { paramc, Integer.valueOf(paramc.bPt()) });
        Object localObject = (LinkedList)this.vgY.get(Integer.valueOf(paramc.bPt()));
        if (localObject != null) {
          bool = ((LinkedList)localObject).remove(paramc);
        }
        localObject = (b)this.vgZ.get(Integer.valueOf(paramc.bPt()));
        if (localObject != null)
        {
          ((b)localObject).b(new com.tencent.mm.vending.b.b(paramc, (com.tencent.mm.vending.b.a)localObject));
          bool = true;
          ListenerInstanceMonitor.bD(paramc);
          GMTrace.o(13955422486528L, 103976);
          return bool;
        }
      }
      finally {}
    }
  }
  
  /* Error */
  public final boolean d(c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 215
    //   5: ldc -39
    //   7: invokestatic 36	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: ldc -37
    //   12: aload_1
    //   13: invokestatic 116	junit/framework/Assert:assertNotNull	(Ljava/lang/String;Ljava/lang/Object;)V
    //   16: aload_0
    //   17: getfield 57	com/tencent/mm/sdk/b/a:vgY	Ljava/util/HashMap;
    //   20: aload_1
    //   21: invokevirtual 123	com/tencent/mm/sdk/b/c:bPt	()I
    //   24: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   27: invokevirtual 139	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   30: checkcast 80	java/util/LinkedList
    //   33: astore_3
    //   34: aload_3
    //   35: ifnull +32 -> 67
    //   38: aload_3
    //   39: invokevirtual 223	java/util/LinkedList:isEmpty	()Z
    //   42: ifne +25 -> 67
    //   45: aload_3
    //   46: aload_1
    //   47: invokevirtual 186	java/util/LinkedList:contains	(Ljava/lang/Object;)Z
    //   50: ifeq +17 -> 67
    //   53: ldc2_w 215
    //   56: ldc -39
    //   58: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   61: iconst_1
    //   62: istore_2
    //   63: aload_0
    //   64: monitorexit
    //   65: iload_2
    //   66: ireturn
    //   67: aload_0
    //   68: getfield 59	com/tencent/mm/sdk/b/a:vgZ	Ljava/util/HashMap;
    //   71: aload_1
    //   72: invokevirtual 123	com/tencent/mm/sdk/b/c:bPt	()I
    //   75: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   78: invokevirtual 139	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   81: checkcast 13	com/tencent/mm/sdk/b/a$b
    //   84: astore_3
    //   85: aload_3
    //   86: ifnull +31 -> 117
    //   89: aload_3
    //   90: invokevirtual 224	com/tencent/mm/sdk/b/a$b:size	()I
    //   93: ifle +24 -> 117
    //   96: aload_3
    //   97: aload_1
    //   98: invokevirtual 225	com/tencent/mm/sdk/b/a$b:contains	(Ljava/lang/Object;)Z
    //   101: ifeq +16 -> 117
    //   104: ldc2_w 215
    //   107: ldc -39
    //   109: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   112: iconst_1
    //   113: istore_2
    //   114: goto -51 -> 63
    //   117: iconst_0
    //   118: istore_2
    //   119: ldc2_w 215
    //   122: ldc -39
    //   124: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   127: goto -64 -> 63
    //   130: astore_1
    //   131: aload_0
    //   132: monitorexit
    //   133: aload_1
    //   134: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	a
    //   0	135	1	paramc	c
    //   62	57	2	bool	boolean
    //   33	64	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	34	130	finally
    //   38	61	130	finally
    //   67	85	130	finally
    //   89	112	130	finally
    //   119	127	130	finally
  }
  
  public final boolean m(b paramb)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    GMTrace.i(13955556704256L, 103977);
    Assert.assertNotNull("EventPoolImpl.publish", paramb);
    w.v("MicroMsg.EventCenter", "publish %s(%d)", new Object[] { paramb, Integer.valueOf(paramb.bPt()) });
    LinkedList localLinkedList = null;
    for (;;)
    {
      try
      {
        int i = paramb.bPt();
        Object localObject = (LinkedList)this.vgY.get(Integer.valueOf(i));
        if (localObject != null)
        {
          localLinkedList = new LinkedList((Collection)localObject);
          bool1 = true;
        }
        localObject = (b)this.vgZ.get(Integer.valueOf(i));
        if (localObject != null)
        {
          bool1 = bool2;
          if (!bool1) {
            w.w("MicroMsg.EventCenter", "No listener for this event %s(%d), Stack: %s.", new Object[] { paramb, Integer.valueOf(i), "" });
          }
          if (localLinkedList != null) {
            a(localLinkedList, paramb);
          }
          if (localObject != null) {
            ((b)localObject).a(g.bZ(paramb));
          }
          GMTrace.o(13955556704256L, 103977);
          return bool1;
        }
      }
      finally {}
    }
  }
  
  /* Error */
  public final boolean u(Class<? extends b> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 255
    //   5: ldc_w 257
    //   8: invokestatic 36	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: ldc_w 259
    //   14: aload_1
    //   15: invokestatic 116	junit/framework/Assert:assertNotNull	(Ljava/lang/String;Ljava/lang/Object;)V
    //   18: aload_0
    //   19: getfield 57	com/tencent/mm/sdk/b/a:vgY	Ljava/util/HashMap;
    //   22: aload_1
    //   23: invokevirtual 265	java/lang/Class:getName	()Ljava/lang/String;
    //   26: invokevirtual 270	java/lang/String:hashCode	()I
    //   29: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   32: invokevirtual 139	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   35: checkcast 80	java/util/LinkedList
    //   38: astore_3
    //   39: aload_3
    //   40: ifnull +25 -> 65
    //   43: aload_3
    //   44: invokevirtual 84	java/util/LinkedList:size	()I
    //   47: ifle +18 -> 65
    //   50: ldc2_w 255
    //   53: ldc_w 257
    //   56: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   59: iconst_1
    //   60: istore_2
    //   61: aload_0
    //   62: monitorexit
    //   63: iload_2
    //   64: ireturn
    //   65: aload_0
    //   66: getfield 59	com/tencent/mm/sdk/b/a:vgZ	Ljava/util/HashMap;
    //   69: aload_1
    //   70: invokevirtual 265	java/lang/Class:getName	()Ljava/lang/String;
    //   73: invokevirtual 270	java/lang/String:hashCode	()I
    //   76: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   79: invokevirtual 139	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   82: checkcast 13	com/tencent/mm/sdk/b/a$b
    //   85: astore_1
    //   86: aload_1
    //   87: ifnull +24 -> 111
    //   90: aload_1
    //   91: invokevirtual 224	com/tencent/mm/sdk/b/a$b:size	()I
    //   94: ifle +17 -> 111
    //   97: ldc2_w 255
    //   100: ldc_w 257
    //   103: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   106: iconst_1
    //   107: istore_2
    //   108: goto -47 -> 61
    //   111: iconst_0
    //   112: istore_2
    //   113: ldc2_w 255
    //   116: ldc_w 257
    //   119: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   122: goto -61 -> 61
    //   125: astore_1
    //   126: aload_0
    //   127: monitorexit
    //   128: aload_1
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	a
    //   0	130	1	paramClass	Class<? extends b>
    //   60	53	2	bool	boolean
    //   38	6	3	localLinkedList	LinkedList
    // Exception table:
    //   from	to	target	type
    //   2	39	125	finally
    //   43	59	125	finally
    //   65	86	125	finally
    //   90	106	125	finally
    //   113	122	125	finally
  }
  
  public static final class a
    extends d
  {
    public a()
    {
      GMTrace.i(19117167869952L, 142434);
      GMTrace.o(19117167869952L, 142434);
    }
    
    public final void D(Runnable paramRunnable)
    {
      GMTrace.i(19117302087680L, 142435);
      paramRunnable.run();
      GMTrace.o(19117302087680L, 142435);
    }
    
    public final void cancel()
    {
      GMTrace.i(19117704740864L, 142438);
      GMTrace.o(19117704740864L, 142438);
    }
    
    public final void g(Runnable paramRunnable, long paramLong)
    {
      GMTrace.i(19117436305408L, 142436);
      paramRunnable.run();
      GMTrace.o(19117436305408L, 142436);
    }
    
    public final String getType()
    {
      GMTrace.i(19117570523136L, 142437);
      String str = Thread.currentThread().toString();
      GMTrace.o(19117570523136L, 142437);
      return str;
    }
  }
  
  private final class b
    extends com.tencent.mm.vending.b.a<c>
  {
    public b()
    {
      super();
      GMTrace.i(13958241058816L, 103997);
      GMTrace.o(13958241058816L, 103997);
    }
    
    public final void a(com.tencent.mm.vending.j.a parama)
    {
      GMTrace.i(13958375276544L, 103998);
      LinkedList localLinkedList = ckd();
      parama = (b)parama.get(0);
      if (parama == null)
      {
        w.e("MicroMsg.EventCenter", "event is null! fatal!");
        GMTrace.o(13958375276544L, 103998);
        return;
      }
      if (parama.vhd) {
        Collections.sort(localLinkedList, new Comparator() {});
      }
      com.tencent.mm.vending.b.b[] arrayOfb = new com.tencent.mm.vending.b.b[localLinkedList.size()];
      localLinkedList.toArray(arrayOfb);
      int j = arrayOfb.length;
      int i = 0;
      while ((i < j) && ((!((c)arrayOfb[i].xxE).a(parama)) || (!parama.vhd))) {
        i += 1;
      }
      if (parama.eDO != null) {
        parama.eDO.run();
      }
      GMTrace.o(13958375276544L, 103998);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
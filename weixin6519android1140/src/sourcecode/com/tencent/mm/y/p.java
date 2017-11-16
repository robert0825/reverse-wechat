package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.kernel.api.bucket.a;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.api.bucket.e;
import com.tencent.mm.kernel.b.b;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public class p
  implements a, c, e, b
{
  private static HashMap<Class<? extends aq>, aq> gmu;
  private Class<? extends aq> gmt;
  
  static
  {
    GMTrace.i(16430263173120L, 122415);
    gmu = new HashMap();
    GMTrace.o(16430263173120L, 122415);
  }
  
  public p(Class<? extends aq> paramClass)
  {
    GMTrace.i(16430128955392L, 122414);
    this.gmt = paramClass;
    o(this.gmt);
    GMTrace.o(16430128955392L, 122414);
  }
  
  /* Error */
  public static <T extends aq> T o(Class<T> paramClass)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 57
    //   6: ldc 59
    //   8: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: getstatic 36	com/tencent/mm/y/p:gmu	Ljava/util/HashMap;
    //   14: aload_0
    //   15: invokevirtual 63	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   18: checkcast 65	com/tencent/mm/y/aq
    //   21: astore_2
    //   22: aload_2
    //   23: astore_1
    //   24: aload_2
    //   25: ifnonnull +42 -> 67
    //   28: aload_0
    //   29: invokevirtual 71	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   32: checkcast 65	com/tencent/mm/y/aq
    //   35: astore_1
    //   36: ldc 73
    //   38: ldc 75
    //   40: iconst_2
    //   41: anewarray 4	java/lang/Object
    //   44: dup
    //   45: iconst_0
    //   46: aload_0
    //   47: aastore
    //   48: dup
    //   49: iconst_1
    //   50: aload_1
    //   51: aastore
    //   52: invokestatic 80	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: getstatic 36	com/tencent/mm/y/p:gmu	Ljava/util/HashMap;
    //   58: aload_1
    //   59: invokevirtual 84	java/lang/Object:getClass	()Ljava/lang/Class;
    //   62: aload_1
    //   63: invokevirtual 88	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   66: pop
    //   67: ldc2_w 57
    //   70: ldc 59
    //   72: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   75: ldc 2
    //   77: monitorexit
    //   78: aload_1
    //   79: areturn
    //   80: astore_0
    //   81: ldc 73
    //   83: aload_0
    //   84: ldc 90
    //   86: iconst_0
    //   87: anewarray 4	java/lang/Object
    //   90: invokestatic 94	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: new 96	java/lang/IllegalAccessError
    //   96: dup
    //   97: aload_0
    //   98: invokevirtual 100	java/lang/InstantiationException:getMessage	()Ljava/lang/String;
    //   101: invokespecial 103	java/lang/IllegalAccessError:<init>	(Ljava/lang/String;)V
    //   104: athrow
    //   105: astore_0
    //   106: ldc 2
    //   108: monitorexit
    //   109: aload_0
    //   110: athrow
    //   111: astore_0
    //   112: ldc 73
    //   114: aload_0
    //   115: ldc 90
    //   117: iconst_0
    //   118: anewarray 4	java/lang/Object
    //   121: invokestatic 94	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: new 96	java/lang/IllegalAccessError
    //   127: dup
    //   128: aload_0
    //   129: invokevirtual 104	java/lang/IllegalAccessException:getMessage	()Ljava/lang/String;
    //   132: invokespecial 103	java/lang/IllegalAccessError:<init>	(Ljava/lang/String;)V
    //   135: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	136	0	paramClass	Class<T>
    //   23	56	1	localaq1	aq
    //   21	4	2	localaq2	aq
    // Exception table:
    //   from	to	target	type
    //   28	55	80	java/lang/InstantiationException
    //   3	22	105	finally
    //   28	55	105	finally
    //   55	67	105	finally
    //   67	75	105	finally
    //   81	105	105	finally
    //   112	136	105	finally
    //   28	55	111	java/lang/IllegalAccessException
  }
  
  public static void zC()
  {
    try
    {
      GMTrace.i(16429860519936L, 122412);
      w.i("MicroMsg.CompatSubCore", "reset subcore %s", new Object[] { Integer.valueOf(gmu.size()) });
      gmu.clear();
      GMTrace.o(16429860519936L, 122412);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void be(boolean paramBoolean)
  {
    GMTrace.i(13265140711424L, 98833);
    GMTrace.o(13265140711424L, 98833);
  }
  
  public HashMap<Integer, g.d> collectDatabaseFactory()
  {
    GMTrace.i(13264738058240L, 98830);
    HashMap localHashMap = o(this.gmt).vH();
    GMTrace.o(13264738058240L, 98830);
    return localHashMap;
  }
  
  public void eO(String paramString)
  {
    GMTrace.i(13265543364608L, 98836);
    GMTrace.o(13265543364608L, 98836);
  }
  
  public void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(13264872275968L, 98831);
    o(this.gmt).aX(paramf.fZo);
    GMTrace.o(13264872275968L, 98831);
  }
  
  public void onAccountRelease()
  {
    GMTrace.i(13265006493696L, 98832);
    o(this.gmt).onAccountRelease();
    GMTrace.o(13265006493696L, 98832);
  }
  
  public void onDataBaseClosed(g paramg1, g paramg2)
  {
    GMTrace.i(13265677582336L, 98837);
    GMTrace.o(13265677582336L, 98837);
  }
  
  public void onDataBaseOpened(g paramg1, g paramg2)
  {
    GMTrace.i(13265274929152L, 98834);
    GMTrace.o(13265274929152L, 98834);
  }
  
  public final void xr()
  {
    GMTrace.i(13265409146880L, 98835);
    o(this.gmt).aY(f.ty());
    GMTrace.o(13265409146880L, 98835);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
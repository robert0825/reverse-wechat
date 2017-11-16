package com.tencent.mm.kernel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.u.b;
import com.tencent.mm.bz.a.a;
import com.tencent.mm.g.a.jx;
import com.tencent.mm.kernel.api.d;
import com.tencent.mm.network.c;
import com.tencent.mm.network.h.a;
import com.tencent.mm.protocal.aa.a;
import com.tencent.mm.protocal.aa.b;
import com.tencent.mm.protocal.ab.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.ah;
import com.tencent.mm.y.bf.a;
import com.tencent.mm.y.bw;
import com.tencent.mm.y.bw.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class b
{
  private static ah fYu;
  public final a fYq;
  public final com.tencent.mm.ad.n fYr;
  public HashSet<com.tencent.mm.network.n> fYs;
  public com.tencent.mm.network.n fYt;
  
  static
  {
    GMTrace.i(13500692824064L, 100588);
    fYu = null;
    GMTrace.o(13500692824064L, 100588);
  }
  
  public b(com.tencent.mm.ad.n.a parama, a parama1)
  {
    GMTrace.i(13499753299968L, 100581);
    this.fYs = new HashSet();
    this.fYt = new com.tencent.mm.network.n.a()
    {
      /* Error */
      public final void db(int paramAnonymousInt)
      {
        // Byte code:
        //   0: ldc2_w 35
        //   3: ldc 37
        //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: new 39	java/util/HashSet
        //   11: dup
        //   12: invokespecial 40	java/util/HashSet:<init>	()V
        //   15: astore_3
        //   16: aload_0
        //   17: getfield 14	com/tencent/mm/kernel/b$2:fYv	Lcom/tencent/mm/kernel/b;
        //   20: getfield 44	com/tencent/mm/kernel/b:fYs	Ljava/util/HashSet;
        //   23: astore_2
        //   24: aload_2
        //   25: monitorenter
        //   26: aload_3
        //   27: aload_0
        //   28: getfield 14	com/tencent/mm/kernel/b$2:fYv	Lcom/tencent/mm/kernel/b;
        //   31: getfield 44	com/tencent/mm/kernel/b:fYs	Ljava/util/HashSet;
        //   34: invokevirtual 48	java/util/HashSet:addAll	(Ljava/util/Collection;)Z
        //   37: pop
        //   38: aload_2
        //   39: monitorexit
        //   40: aload_3
        //   41: invokevirtual 52	java/util/HashSet:iterator	()Ljava/util/Iterator;
        //   44: astore_2
        //   45: aload_2
        //   46: invokeinterface 58 1 0
        //   51: ifeq +68 -> 119
        //   54: aload_2
        //   55: invokeinterface 62 1 0
        //   60: checkcast 64	com/tencent/mm/network/n
        //   63: iload_1
        //   64: invokeinterface 66 2 0
        //   69: goto -24 -> 45
        //   72: astore_2
        //   73: ldc 68
        //   75: aload_2
        //   76: ldc 70
        //   78: iconst_0
        //   79: anewarray 72	java/lang/Object
        //   82: invokestatic 78	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   85: new 80	com/tencent/mm/sdk/platformtools/ae
        //   88: dup
        //   89: invokespecial 81	com/tencent/mm/sdk/platformtools/ae:<init>	()V
        //   92: new 8	com/tencent/mm/kernel/b$2$1
        //   95: dup
        //   96: aload_0
        //   97: aload_2
        //   98: invokespecial 84	com/tencent/mm/kernel/b$2$1:<init>	(Lcom/tencent/mm/kernel/b$2;Ljava/lang/Exception;)V
        //   101: invokevirtual 88	com/tencent/mm/sdk/platformtools/ae:post	(Ljava/lang/Runnable;)Z
        //   104: pop
        //   105: ldc2_w 35
        //   108: ldc 37
        //   110: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   113: return
        //   114: astore_3
        //   115: aload_2
        //   116: monitorexit
        //   117: aload_3
        //   118: athrow
        //   119: ldc2_w 35
        //   122: ldc 37
        //   124: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   127: return
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	128	0	this	2
        //   0	128	1	paramAnonymousInt	int
        //   72	44	2	localException	Exception
        //   15	26	3	localHashSet	HashSet
        //   114	4	3	localObject2	Object
        // Exception table:
        //   from	to	target	type
        //   8	26	72	java/lang/Exception
        //   40	45	72	java/lang/Exception
        //   45	69	72	java/lang/Exception
        //   117	119	72	java/lang/Exception
        //   26	40	114	finally
        //   115	117	114	finally
      }
    };
    this.fYr = com.tencent.mm.ad.n.a(parama);
    this.fYr.gut = h.xB();
    com.tencent.mm.ad.u.gvi = new u.b()
    {
      public final com.tencent.mm.ad.n wT()
      {
        GMTrace.i(13497203163136L, 100562);
        com.tencent.mm.ad.n localn = b.this.fYr;
        GMTrace.o(13497203163136L, 100562);
        return localn;
      }
    };
    this.fYq = parama1;
    GMTrace.o(13499753299968L, 100581);
  }
  
  public static void a(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
  {
    GMTrace.i(21018898857984L, 156603);
    jx localjx = new jx();
    localjx.eOg.status = paramInt1;
    localjx.eOg.eOh = paramInt2;
    localjx.eOg.eOi = paramBoolean;
    localjx.eOg.eOj = paramString;
    com.tencent.mm.sdk.b.a.vgX.m(localjx);
    GMTrace.o(21018898857984L, 156603);
  }
  
  public static void a(ah paramah)
  {
    GMTrace.i(13500155953152L, 100584);
    fYu = paramah;
    GMTrace.o(13500155953152L, 100584);
  }
  
  public static ah wQ()
  {
    GMTrace.i(13500021735424L, 100583);
    ah localah = fYu;
    GMTrace.o(13500021735424L, 100583);
    return localah;
  }
  
  public final void a(com.tencent.mm.network.n paramn)
  {
    GMTrace.i(13499887517696L, 100582);
    synchronized (this.fYs)
    {
      this.fYs.add(paramn);
      GMTrace.o(13499887517696L, 100582);
      return;
    }
  }
  
  public final void b(com.tencent.mm.network.n paramn)
  {
    GMTrace.i(14609868128256L, 108852);
    synchronized (this.fYs)
    {
      this.fYs.remove(paramn);
      GMTrace.o(14609868128256L, 108852);
      return;
    }
  }
  
  public final byte[] wR()
  {
    GMTrace.i(13500290170880L, 100585);
    try
    {
      if ((this.fYr != null) && (this.fYr.gus != null))
      {
        localObject = this.fYr.gus.DY();
        if (localObject != null) {}
      }
      else
      {
        GMTrace.o(13500290170880L, 100585);
        return null;
      }
      Object localObject = this.fYr.gus.DY().wR();
      GMTrace.o(13500290170880L, 100585);
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      w.w("MMKernel.CoreNetwork", "get session key error, %s", new Object[] { localException.getMessage() });
      w.e("MMKernel.CoreNetwork", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13500290170880L, 100585);
    }
    return null;
  }
  
  public final com.tencent.mm.ad.n wS()
  {
    GMTrace.i(15695152676864L, 116938);
    com.tencent.mm.ad.n localn = this.fYr;
    GMTrace.o(15695152676864L, 116938);
    return localn;
  }
  
  public static final class a
    extends com.tencent.mm.bz.a<d>
    implements d
  {
    a()
    {
      GMTrace.i(13508880105472L, 100649);
      GMTrace.o(13508880105472L, 100649);
    }
    
    public final void b(final com.tencent.mm.network.e parame)
    {
      GMTrace.i(13509014323200L, 100650);
      a(new a.a() {});
      GMTrace.o(13509014323200L, 100650);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
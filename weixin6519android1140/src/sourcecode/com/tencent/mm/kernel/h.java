package com.tencent.mm.kernel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.n;
import com.tencent.mm.ad.n.a;
import com.tencent.mm.ad.v;
import com.tencent.mm.bz.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.af.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ag;
import com.tencent.mm.y.bw;
import com.tencent.tinker.loader.app.ApplicationLifeCycle;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

public final class h
{
  private static h fZx;
  public final e.b fYM;
  public final e.c fYN;
  public final e.a fYO;
  public final List<com.tencent.mm.kernel.api.a> fYR;
  public final b.a fYq;
  private bw fZA;
  public e fZB;
  public a fZC;
  public b fZD;
  public final a fZE;
  public final b fZF;
  public final List<ag> fZG;
  private final boolean fZH;
  public volatile boolean fZI;
  public i<com.tencent.mm.kernel.b.f> fZy;
  private af fZz;
  
  private h(final com.tencent.mm.kernel.b.f paramf)
  {
    GMTrace.i(18788602871808L, 139986);
    this.fZA = null;
    this.fZE = new a();
    this.fZF = new b();
    this.fYR = new ArrayList();
    this.fZG = new ArrayList();
    this.fYM = new e.b();
    this.fYN = new e.c();
    this.fYq = new b.a();
    this.fYO = new e.a();
    this.fZI = false;
    this.fZy = i.b(paramf);
    this.fZH = ((com.tencent.mm.kernel.b.f)this.fZy.xv().wZ()).eR("");
    if (this.fZH)
    {
      this.fZA = new bw();
      this.fZz = new af();
      this.fZz.A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13506061533184L, 100628);
          am.ey(ab.getContext());
          GMTrace.o(13506061533184L, 100628);
        }
      });
    }
    i.xu().fYH = new c.a()
    {
      public final void a(com.tencent.mm.kernel.c.a paramAnonymousa)
      {
        GMTrace.i(13491029147648L, 100516);
        h.this.a(paramf, paramAnonymousa);
        GMTrace.o(13491029147648L, 100516);
      }
      
      public final void b(com.tencent.mm.kernel.b.d paramAnonymousd)
      {
        GMTrace.i(13490894929920L, 100515);
        h.this.a(paramf, paramAnonymousd);
        GMTrace.o(13490894929920L, 100515);
      }
      
      public final void b(com.tencent.mm.kernel.c.a paramAnonymousa)
      {
        GMTrace.i(14609062821888L, 108846);
        h localh = h.this;
        com.tencent.mm.kernel.b.f localf = paramf;
        if ((paramAnonymousa instanceof ApplicationLifeCycle))
        {
          ApplicationLifeCycle localApplicationLifeCycle = (ApplicationLifeCycle)paramAnonymousa;
          localf.gar.remove(localApplicationLifeCycle);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.c)) {
          localh.fZE.remove((com.tencent.mm.kernel.api.c)paramAnonymousa);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.a)) {
          localh.fYR.remove(paramAnonymousa);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.b)) {
          localh.fYO.remove((com.tencent.mm.kernel.api.b)paramAnonymousa);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.e)) {
          localh.fYM.remove((com.tencent.mm.kernel.api.e)paramAnonymousa);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.f)) {
          localh.fYN.remove((com.tencent.mm.kernel.api.f)paramAnonymousa);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.d)) {
          localh.fYq.remove((com.tencent.mm.kernel.api.d)paramAnonymousa);
        }
        if ((paramAnonymousa instanceof com.tencent.mm.kernel.api.h)) {
          localh.fZy.b((com.tencent.mm.kernel.api.h)paramAnonymousa);
        }
        if ((paramAnonymousa instanceof ag)) {
          localh.fZG.remove(paramAnonymousa);
        }
        GMTrace.o(14609062821888L, 108846);
      }
    };
    GMTrace.o(18788602871808L, 139986);
  }
  
  public static <T extends com.tencent.mm.kernel.c.a, N extends T> void a(Class<T> paramClass, N paramN)
  {
    GMTrace.i(13514383032320L, 100690);
    xz();
    xu().a(paramClass, new com.tencent.mm.kernel.c.d(paramN));
    GMTrace.o(13514383032320L, 100690);
  }
  
  public static <T extends com.tencent.mm.kernel.c.a, N extends T> void a(Class<T> paramClass, com.tencent.mm.kernel.c.c<N> paramc)
  {
    GMTrace.i(13514517250048L, 100691);
    xz();
    xu().a(paramClass, paramc);
    GMTrace.o(13514517250048L, 100691);
  }
  
  /* Error */
  public static void b(com.tencent.mm.kernel.b.f paramf)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 197
    //   6: ldc -57
    //   8: invokestatic 75	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: getstatic 201	com/tencent/mm/kernel/h:fZx	Lcom/tencent/mm/kernel/h;
    //   14: ifnull +56 -> 70
    //   17: getstatic 201	com/tencent/mm/kernel/h:fZx	Lcom/tencent/mm/kernel/h;
    //   20: getfield 119	com/tencent/mm/kernel/h:fZy	Lcom/tencent/mm/kernel/i;
    //   23: invokevirtual 123	com/tencent/mm/kernel/i:xv	()Lcom/tencent/mm/kernel/d;
    //   26: invokevirtual 129	com/tencent/mm/kernel/d:wZ	()Lcom/tencent/mm/kernel/b/e;
    //   29: checkcast 131	com/tencent/mm/kernel/b/f
    //   32: astore_1
    //   33: aload_0
    //   34: getfield 205	com/tencent/mm/kernel/b/e:gap	Landroid/app/Application;
    //   37: astore_2
    //   38: aload_1
    //   39: aload_0
    //   40: getfield 209	com/tencent/mm/kernel/b/f:gaq	Lcom/tencent/mm/app/MMApplicationLike;
    //   43: putfield 209	com/tencent/mm/kernel/b/f:gaq	Lcom/tencent/mm/app/MMApplicationLike;
    //   46: aload_1
    //   47: aload_2
    //   48: putfield 205	com/tencent/mm/kernel/b/e:gap	Landroid/app/Application;
    //   51: ldc -45
    //   53: ldc -43
    //   55: invokestatic 218	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: ldc2_w 197
    //   61: ldc -57
    //   63: invokestatic 172	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   66: ldc 2
    //   68: monitorexit
    //   69: return
    //   70: new 10	com/tencent/mm/kernel/h$3
    //   73: dup
    //   74: invokespecial 219	com/tencent/mm/kernel/h$3:<init>	()V
    //   77: invokestatic 224	com/tencent/mm/kernel/j:a	(Lcom/tencent/mm/kernel/j$a;)V
    //   80: ldc -45
    //   82: ldc -30
    //   84: invokestatic 218	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: new 2	com/tencent/mm/kernel/h
    //   90: dup
    //   91: aload_0
    //   92: invokespecial 228	com/tencent/mm/kernel/h:<init>	(Lcom/tencent/mm/kernel/b/f;)V
    //   95: putstatic 201	com/tencent/mm/kernel/h:fZx	Lcom/tencent/mm/kernel/h;
    //   98: ldc2_w 197
    //   101: ldc -57
    //   103: invokestatic 172	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   106: goto -40 -> 66
    //   109: astore_0
    //   110: ldc 2
    //   112: monitorexit
    //   113: aload_0
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	paramf	com.tencent.mm.kernel.b.f
    //   32	15	1	localf	com.tencent.mm.kernel.b.f
    //   37	11	2	localApplication	android.app.Application
    // Exception table:
    //   from	to	target	type
    //   3	66	109	finally
    //   70	106	109	finally
  }
  
  public static void fh(int paramInt)
  {
    GMTrace.i(13515188338688L, 100696);
    a locala = xw();
    if ((a.fe(paramInt)) && (a.fXX.ww() == paramInt) && (locala.wL()))
    {
      w.w("MMKernel.CoreAccount", "loginUin, uin not changed, return :%d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(13515188338688L, 100696);
      return;
    }
    synchronized (locala.fXW)
    {
      a.fXX.dp(paramInt);
      locala.wD();
      locala.bc(true);
      GMTrace.o(13515188338688L, 100696);
      return;
    }
  }
  
  public static <T extends com.tencent.mm.kernel.c.a> T h(Class<T> paramClass)
  {
    GMTrace.i(13514248814592L, 100689);
    xz();
    paramClass = xu().h(paramClass);
    GMTrace.o(13514248814592L, 100689);
    return paramClass;
  }
  
  public static <T extends com.tencent.mm.kernel.b.a> T j(Class<T> paramClass)
  {
    GMTrace.i(18788871307264L, 139988);
    xz();
    paramClass = xu().j(paramClass);
    GMTrace.o(18788871307264L, 139988);
    return paramClass;
  }
  
  public static n wS()
  {
    GMTrace.i(13514651467776L, 100692);
    xz();
    n localn = xx().fYr;
    GMTrace.o(13514651467776L, 100692);
    return localn;
  }
  
  public static bw xA()
  {
    GMTrace.i(13514785685504L, 100693);
    Assert.assertTrue(xz().fZH);
    bw localbw = xz().fZA;
    GMTrace.o(13514785685504L, 100693);
    return localbw;
  }
  
  public static af xB()
  {
    GMTrace.i(13514919903232L, 100694);
    Assert.assertTrue(xz().fZH);
    af localaf = xz().fZz;
    GMTrace.o(13514919903232L, 100694);
    return localaf;
  }
  
  public static c xu()
  {
    GMTrace.i(13513309290496L, 100682);
    xz();
    Assert.assertNotNull("mCorePlugins not initialized!", i.xu());
    xz();
    c localc = i.xu();
    GMTrace.o(13513309290496L, 100682);
    return localc;
  }
  
  public static d<com.tencent.mm.kernel.b.f> xv()
  {
    GMTrace.i(13513443508224L, 100683);
    Assert.assertNotNull("mCoreProcess not initialized!", xz().fZy.xv());
    d locald = xz().fZy.xv();
    GMTrace.o(13513443508224L, 100683);
    return locald;
  }
  
  public static a xw()
  {
    GMTrace.i(13513577725952L, 100684);
    Assert.assertNotNull("mCoreAccount not initialized!", xz().fZC);
    a locala = xz().fZC;
    GMTrace.o(13513577725952L, 100684);
    return locala;
  }
  
  public static b xx()
  {
    GMTrace.i(13513711943680L, 100685);
    Assert.assertNotNull("mCoreNetwork not initialized!", xz().fZD);
    b localb = xz().fZD;
    GMTrace.o(13513711943680L, 100685);
    return localb;
  }
  
  public static e xy()
  {
    GMTrace.i(13513846161408L, 100686);
    Assert.assertNotNull("mCoreStorage not initialized!", xz().fZB);
    e locale = xz().fZB;
    GMTrace.o(13513846161408L, 100686);
    return locale;
  }
  
  public static h xz()
  {
    GMTrace.i(13513980379136L, 100687);
    Assert.assertNotNull("Kernel not initialized by MMApplication!", fZx);
    h localh = fZx;
    GMTrace.o(13513980379136L, 100687);
    return localh;
  }
  
  public final com.tencent.mm.vending.b.b a(com.tencent.mm.kernel.api.c paramc)
  {
    GMTrace.i(19116899434496L, 142432);
    paramc = this.fZE.bT(paramc);
    GMTrace.o(19116899434496L, 142432);
    return paramc;
  }
  
  public final void a(com.tencent.mm.kernel.api.h paramh)
  {
    GMTrace.i(13513040855040L, 100680);
    this.fZy.a(paramh);
    GMTrace.o(13513040855040L, 100680);
  }
  
  public final void a(com.tencent.mm.kernel.b.f paramf, Object paramObject)
  {
    GMTrace.i(18788737089536L, 139987);
    if ((paramObject instanceof ApplicationLifeCycle))
    {
      ApplicationLifeCycle localApplicationLifeCycle = (ApplicationLifeCycle)paramObject;
      paramf.gar.bT(localApplicationLifeCycle);
    }
    if ((paramObject instanceof com.tencent.mm.kernel.api.c)) {
      this.fZE.bT((com.tencent.mm.kernel.api.c)paramObject);
    }
    if ((paramObject instanceof com.tencent.mm.kernel.api.a)) {
      this.fYR.add((com.tencent.mm.kernel.api.a)paramObject);
    }
    if ((paramObject instanceof com.tencent.mm.kernel.api.b)) {
      this.fYO.bT((com.tencent.mm.kernel.api.b)paramObject);
    }
    if ((paramObject instanceof com.tencent.mm.kernel.api.e)) {
      this.fYM.bT((com.tencent.mm.kernel.api.e)paramObject);
    }
    if ((paramObject instanceof com.tencent.mm.kernel.api.f)) {
      this.fYN.bT((com.tencent.mm.kernel.api.f)paramObject);
    }
    if ((paramObject instanceof com.tencent.mm.kernel.api.d)) {
      this.fYq.bT((com.tencent.mm.kernel.api.d)paramObject);
    }
    if ((paramObject instanceof com.tencent.mm.kernel.api.h)) {
      this.fZy.a((com.tencent.mm.kernel.api.h)paramObject);
    }
    if ((paramObject instanceof ag)) {
      this.fZG.add((ag)paramObject);
    }
    GMTrace.o(18788737089536L, 139987);
  }
  
  public final void b(com.tencent.mm.kernel.api.h paramh)
  {
    GMTrace.i(13513175072768L, 100681);
    this.fZy.b(paramh);
    GMTrace.o(13513175072768L, 100681);
  }
  
  public final void eP(String paramString)
  {
    GMTrace.i(13515322556416L, 100697);
    w.w("MicroMsg.MMKernel", "logoutAccount uin:%s info:%s stack:%s", new Object[] { o.getString(a.ww()), paramString, bg.bQW() });
    a.eJ(bg.bQW().toString() + paramString);
    this.fZC.fXT.aa(a.ww());
    releaseAll();
    a.wB();
    a.bd(false);
    GMTrace.o(13515322556416L, 100697);
  }
  
  public final void releaseAll()
  {
    GMTrace.i(13515456774144L, 100698);
    if (this.fZC != null) {}
    for (String str = o.getString(a.ww());; str = "-1")
    {
      w.w("MicroMsg.MMKernel", "release uin:%s ", new Object[] { str });
      if (this.fZD.fYr != null) {
        this.fZD.fYr.reset();
      }
      if (this.fZz != null) {
        this.fZz.a(new af.b()
        {
          public final void xC()
          {
            GMTrace.i(18786455388160L, 139970);
            if (h.this.fZC != null) {
              h.this.fZC.release();
            }
            GMTrace.o(18786455388160L, 139970);
          }
        });
      }
      GMTrace.o(13515456774144L, 100698);
      return;
    }
  }
  
  private static final class a
    extends com.tencent.mm.bz.a<com.tencent.mm.kernel.api.c>
    implements com.tencent.mm.kernel.api.c
  {
    public a()
    {
      GMTrace.i(13498411122688L, 100571);
      GMTrace.o(13498411122688L, 100571);
    }
    
    public final void onAccountInitialized(final e.f paramf)
    {
      GMTrace.i(13498545340416L, 100572);
      a(new a.a() {});
      GMTrace.o(13498545340416L, 100572);
    }
    
    public final void onAccountRelease()
    {
      GMTrace.i(13498679558144L, 100573);
      a(new a.a() {});
      GMTrace.o(13498679558144L, 100573);
    }
  }
  
  private static final class b
    extends com.tencent.mm.bz.a<n.a>
    implements n.a
  {
    public b()
    {
      GMTrace.i(13489686970368L, 100506);
      GMTrace.o(13489686970368L, 100506);
    }
    
    public final void a(final n paramn)
    {
      GMTrace.i(13489955405824L, 100508);
      a(new a.a() {});
      GMTrace.o(13489955405824L, 100508);
    }
    
    public final void a(final n paramn, final boolean paramBoolean)
    {
      GMTrace.i(13489821188096L, 100507);
      a(new a.a() {});
      GMTrace.o(13489821188096L, 100507);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
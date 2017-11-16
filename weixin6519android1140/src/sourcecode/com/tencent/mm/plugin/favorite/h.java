package com.tencent.mm.plugin.favorite;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.g.a.qj;
import com.tencent.mm.g.b.ef;
import com.tencent.mm.plugin.favorite.b.ac;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.p;
import com.tencent.mm.plugin.favorite.b.t;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.b.y;
import com.tencent.mm.plugin.fts.a.i;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.bt;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class h
  implements aq
{
  private g laA;
  private d laB;
  public ef laC;
  private com.tencent.mm.plugin.favorite.b.l laD;
  private volatile boolean laE;
  private byte[] laF;
  private y laG;
  private com.tencent.mm.sdk.b.c laH;
  private com.tencent.mm.sdk.b.c laI;
  private k lak;
  private com.tencent.mm.plugin.favorite.b.b lal;
  private com.tencent.mm.plugin.favorite.c.h lam;
  private com.tencent.mm.plugin.favorite.c.c lan;
  private com.tencent.mm.plugin.favorite.c.b lao;
  private p lap;
  private com.tencent.mm.plugin.favorite.b.h laq;
  private com.tencent.mm.plugin.favorite.b.e lar;
  private com.tencent.mm.plugin.favorite.c.f las;
  private com.tencent.mm.plugin.favorite.c.d lau;
  private t lav;
  private a law;
  private b lax;
  private f lay;
  private e laz;
  
  public h()
  {
    GMTrace.i(6257901568000L, 46625);
    this.law = new a();
    this.lax = new b();
    this.lay = new f();
    this.laz = new e();
    this.laA = new g();
    this.laB = new d();
    this.laC = null;
    this.laE = false;
    this.laF = new byte[0];
    this.laG = new y();
    this.laH = new com.tencent.mm.sdk.b.c() {};
    this.laI = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6257901568000L, 46625);
  }
  
  public static p axA()
  {
    GMTrace.i(6259377963008L, 46636);
    if (!at.AU()) {
      throw new com.tencent.mm.y.b();
    }
    if (axq().lap == null) {
      axq().lap = new p(axq().laC);
    }
    p localp = axq().lap;
    GMTrace.o(6259377963008L, 46636);
    return localp;
  }
  
  public static k axB()
  {
    GMTrace.i(6259512180736L, 46637);
    if (!at.AU()) {
      throw new com.tencent.mm.y.b();
    }
    if (axq().lak == null) {
      axq().lak = new k(axq().laC);
    }
    k localk = axq().lak;
    GMTrace.o(6259512180736L, 46637);
    return localk;
  }
  
  public static h axq()
  {
    GMTrace.i(6258035785728L, 46626);
    ??? = (h)at.AK().gZ("plugin.favorite");
    Object localObject1 = ???;
    if (??? == null)
    {
      localObject1 = new h();
      at.AK().a("plugin.favorite", (aq)localObject1);
    }
    if (((h)localObject1).laE) {
      w.w("MicroMsg.SubCoreFav", "getCore need reset DB now, befor synchronized %b", new Object[] { Boolean.valueOf(((h)localObject1).laE) });
    }
    synchronized (((h)localObject1).laF)
    {
      if (((h)localObject1).laE)
      {
        ((h)localObject1).laC = ef.re();
        ((h)localObject1).laE = false;
      }
      w.i("MicroMsg.SubCoreFav", "getCore need reset DB now, after synchronized %b", new Object[] { Boolean.valueOf(((h)localObject1).laE) });
      GMTrace.o(6258035785728L, 46626);
      return (h)localObject1;
    }
  }
  
  public static com.tencent.mm.plugin.favorite.c.h axr()
  {
    GMTrace.i(6258170003456L, 46627);
    if (!at.AU()) {
      throw new com.tencent.mm.y.b();
    }
    if (axq().lam == null) {
      axq().lam = new com.tencent.mm.plugin.favorite.c.h();
    }
    com.tencent.mm.plugin.favorite.c.h localh = axq().lam;
    GMTrace.o(6258170003456L, 46627);
    return localh;
  }
  
  public static com.tencent.mm.plugin.favorite.c.b axs()
  {
    GMTrace.i(6258304221184L, 46628);
    if (!at.AU()) {
      throw new com.tencent.mm.y.b();
    }
    if (axq().lao == null) {
      axq().lao = new com.tencent.mm.plugin.favorite.c.b();
    }
    com.tencent.mm.plugin.favorite.c.b localb = axq().lao;
    GMTrace.o(6258304221184L, 46628);
    return localb;
  }
  
  public static com.tencent.mm.plugin.favorite.c.f axt()
  {
    GMTrace.i(6258438438912L, 46629);
    if (!at.AU()) {
      throw new com.tencent.mm.y.b();
    }
    if (axq().las == null) {
      axq().las = new com.tencent.mm.plugin.favorite.c.f();
    }
    com.tencent.mm.plugin.favorite.c.f localf = axq().las;
    GMTrace.o(6258438438912L, 46629);
    return localf;
  }
  
  public static t axu()
  {
    GMTrace.i(6258572656640L, 46630);
    if (!at.AU()) {
      throw new com.tencent.mm.y.b();
    }
    if (axq().lav == null) {
      axq().lav = new t();
    }
    t localt = axq().lav;
    GMTrace.o(6258572656640L, 46630);
    return localt;
  }
  
  public static com.tencent.mm.plugin.favorite.c.c axv()
  {
    GMTrace.i(6258706874368L, 46631);
    if (!at.AU()) {
      throw new com.tencent.mm.y.b();
    }
    if (axq().lan == null) {
      axq().lan = new com.tencent.mm.plugin.favorite.c.c();
    }
    com.tencent.mm.plugin.favorite.c.c localc = axq().lan;
    GMTrace.o(6258706874368L, 46631);
    return localc;
  }
  
  public static com.tencent.mm.plugin.favorite.b.b axw()
  {
    GMTrace.i(6258841092096L, 46632);
    if (!at.AU()) {
      throw new com.tencent.mm.y.b();
    }
    if (axq().lal == null) {
      axq().lal = new com.tencent.mm.plugin.favorite.b.b(axq().laC);
    }
    com.tencent.mm.plugin.favorite.b.b localb = axq().lal;
    GMTrace.o(6258841092096L, 46632);
    return localb;
  }
  
  public static com.tencent.mm.plugin.favorite.b.h axx()
  {
    GMTrace.i(6258975309824L, 46633);
    if (!at.AU()) {
      throw new com.tencent.mm.y.b();
    }
    if (axq().laq == null) {
      axq().laq = new com.tencent.mm.plugin.favorite.b.h(axq().laC);
    }
    com.tencent.mm.plugin.favorite.b.h localh = axq().laq;
    GMTrace.o(6258975309824L, 46633);
    return localh;
  }
  
  public static com.tencent.mm.plugin.favorite.b.e axy()
  {
    GMTrace.i(6259109527552L, 46634);
    if (!at.AU()) {
      throw new com.tencent.mm.y.b();
    }
    if (axq().lar == null) {
      axq().lar = new com.tencent.mm.plugin.favorite.b.e(axq().laC);
    }
    com.tencent.mm.plugin.favorite.b.e locale = axq().lar;
    GMTrace.o(6259109527552L, 46634);
    return locale;
  }
  
  public static com.tencent.mm.plugin.favorite.c.d axz()
  {
    GMTrace.i(6259243745280L, 46635);
    if (!at.AU()) {
      throw new com.tencent.mm.y.b();
    }
    if (axq().lau == null) {
      axq().lau = new com.tencent.mm.plugin.favorite.c.d();
    }
    com.tencent.mm.plugin.favorite.c.d locald = axq().lau;
    GMTrace.o(6259243745280L, 46635);
    return locald;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6259780616192L, 46639);
    w.i("MicroMsg.SubCoreFav", "onAccountPostReset updated:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.laE = true;
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("uploadfavitem", this.laG);
    com.tencent.mm.sdk.b.a.vgX.b(this.law);
    com.tencent.mm.sdk.b.a.vgX.b(this.lax);
    com.tencent.mm.sdk.b.a.vgX.b(this.laz);
    com.tencent.mm.sdk.b.a.vgX.b(this.lay);
    com.tencent.mm.sdk.b.a.vgX.b(this.laI);
    com.tencent.mm.sdk.b.a.vgX.b(this.laA);
    com.tencent.mm.sdk.b.a.vgX.b(this.laB);
    com.tencent.mm.sdk.b.a.vgX.a(this.laH);
    Object localObject = new File(x.axX());
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      w.d("MicroMsg.SubCoreFav", "fav root dir not exists, try to make it");
      ((File)localObject).mkdirs();
    }
    localObject = new File(x.axY());
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      w.d("MicroMsg.SubCoreFav", "fav web dir not exists, try to make it");
      ((File)localObject).mkdirs();
    }
    localObject = new File(x.aya());
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      w.d("MicroMsg.SubCoreFav", "fav attach dir not exists, try to make it");
      ((File)localObject).mkdirs();
    }
    localObject = new File(x.axZ());
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      w.d("MicroMsg.SubCoreFav", "fav voice dir not exists, try to make it");
      ((File)localObject).mkdirs();
    }
    this.laD = new com.tencent.mm.plugin.favorite.b.l();
    axw().a(this.laD);
    axB().c(this.laD);
    localObject = new com.tencent.mm.plugin.favorite.a.a();
    ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).registerIndexStorage((com.tencent.mm.plugin.fts.a.g)localObject);
    localObject = new com.tencent.mm.plugin.favorite.a.b();
    ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).registerNativeLogic(6, (i)localObject);
    com.tencent.mm.plugin.fts.d.h.a(new com.tencent.mm.plugin.favorite.ui.b.d());
    com.tencent.mm.plugin.fts.d.h.a(new com.tencent.mm.plugin.favorite.ui.b.b());
    GMTrace.o(6259780616192L, 46639);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(6259914833920L, 46640);
    GMTrace.o(6259914833920L, 46640);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6259646398464L, 46638);
    GMTrace.o(6259646398464L, 46638);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6260049051648L, 46641);
    this.laE = false;
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("uploadfavitem", this.laG);
    com.tencent.mm.sdk.b.a.vgX.c(this.law);
    com.tencent.mm.sdk.b.a.vgX.c(this.lax);
    com.tencent.mm.sdk.b.a.vgX.c(this.laz);
    com.tencent.mm.sdk.b.a.vgX.c(this.laI);
    com.tencent.mm.sdk.b.a.vgX.c(this.lay);
    com.tencent.mm.sdk.b.a.vgX.c(this.laA);
    com.tencent.mm.sdk.b.a.vgX.c(this.laB);
    com.tencent.mm.sdk.b.a.vgX.c(this.laH);
    ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).unregisterIndexStorage(256);
    ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).unregisterNativeLogic(6);
    com.tencent.mm.plugin.fts.d.h.od(128);
    com.tencent.mm.plugin.fts.d.h.od(4176);
    axw().b(this.laD);
    axB().j(this.laD);
    this.laD = null;
    Object localObject = axv();
    ((com.tencent.mm.plugin.favorite.c.c)localObject).qH();
    ((com.tencent.mm.plugin.favorite.c.c)localObject).eze.stopTimer();
    ((com.tencent.mm.plugin.favorite.c.c)localObject).eyZ = 0;
    at.b(((com.tencent.mm.plugin.favorite.c.c)localObject).gzE);
    localObject = axs();
    ((com.tencent.mm.plugin.favorite.c.b)localObject).qH();
    ((com.tencent.mm.plugin.favorite.c.b)localObject).eze.stopTimer();
    at.wS().b(404, (com.tencent.mm.ad.e)localObject);
    at.b(((com.tencent.mm.plugin.favorite.c.b)localObject).gzE);
    localObject = axr();
    ((com.tencent.mm.plugin.favorite.c.h)localObject).qH();
    ((com.tencent.mm.plugin.favorite.c.h)localObject).eze.stopTimer();
    ((com.tencent.mm.plugin.favorite.c.h)localObject).eyZ = 0;
    at.wS().b(401, (com.tencent.mm.ad.e)localObject);
    localObject = axt();
    ((com.tencent.mm.plugin.favorite.c.f)localObject).qH();
    ((com.tencent.mm.plugin.favorite.c.f)localObject).eze.stopTimer();
    ((com.tencent.mm.plugin.favorite.c.f)localObject).eyZ = 0;
    at.wS().b(426, (com.tencent.mm.ad.e)localObject);
    localObject = axz();
    at.wS().b(426, (com.tencent.mm.ad.e)localObject);
    at.wS().b(401, (com.tencent.mm.ad.e)localObject);
    ((com.tencent.mm.plugin.favorite.c.d)localObject).lcY.clear();
    ac.ayo();
    if (this.laC != null) {
      this.laC.yE();
    }
    GMTrace.o(6260049051648L, 46641);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(6260183269376L, 46642);
    GMTrace.o(6260183269376L, 46642);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
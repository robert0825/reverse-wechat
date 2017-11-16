package com.tencent.mm.plugin.location.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.bk;
import com.tencent.mm.g.a.ep;
import com.tencent.mm.g.a.fw;
import com.tencent.mm.g.a.hr;
import com.tencent.mm.g.a.ir;
import com.tencent.mm.g.a.it;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.plugin.location.ui.impl.d;
import com.tencent.mm.protocal.c.azz;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.b;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import java.util.HashMap;
import java.util.HashSet;

public final class l
  implements aq
{
  private com.tencent.mm.y.e mxA;
  private com.tencent.mm.y.e mxB;
  private o mxC;
  private p mxD;
  private i mxE;
  private m mxF;
  private d mxG;
  private k mxH;
  private j mxI;
  private com.tencent.mm.ad.e mxJ;
  private com.tencent.mm.sdk.b.c mxK;
  private com.tencent.mm.sdk.b.c mxL;
  private com.tencent.mm.sdk.b.c mxM;
  private com.tencent.mm.sdk.b.c mxN;
  private bt.a mxO;
  private c mxv;
  private a mxw;
  private b mxx;
  private a.a mxy;
  private int mxz;
  
  public l()
  {
    GMTrace.i(9628914024448L, 71741);
    this.mxv = new c((byte)0);
    this.mxw = new a((byte)0);
    this.mxx = new b((byte)0);
    this.mxz = 0;
    this.mxA = new b();
    this.mxB = new n();
    this.mxC = null;
    this.mxD = null;
    this.mxE = null;
    this.mxF = null;
    this.mxG = new d();
    this.mxH = null;
    this.mxI = null;
    this.mxJ = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(9636430217216L, 71797);
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          paramAnonymousString = (aa)paramAnonymousk;
          paramAnonymousk = paramAnonymousString.LJ();
          if (paramAnonymousk.jib == 0)
          {
            long l = paramAnonymousString.eDr;
            paramAnonymousString = aa.lr(paramAnonymousk.tWx);
            at.AR();
            paramAnonymousk = com.tencent.mm.y.c.yM().cM(l);
            if (paramAnonymousk.bTE())
            {
              paramAnonymousk.dd(paramAnonymousString);
              at.AR();
              com.tencent.mm.y.c.yM().a(l, paramAnonymousk);
            }
          }
        }
        GMTrace.o(9636430217216L, 71797);
      }
    };
    this.mxK = new com.tencent.mm.sdk.b.c() {};
    this.mxL = new com.tencent.mm.sdk.b.c() {};
    this.mxM = new com.tencent.mm.sdk.b.c() {};
    this.mxN = new com.tencent.mm.sdk.b.c() {};
    this.mxO = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(9634416951296L, 71782);
        new n().b(paramAnonymousa);
        GMTrace.o(9634416951296L, 71782);
      }
    };
    GMTrace.o(9628914024448L, 71741);
  }
  
  public static void N(au paramau)
  {
    GMTrace.i(9630121984000L, 71750);
    if ((paramau != null) && (paramau.field_msgId != 0L))
    {
      au.b localb = au.b.Ui(paramau.field_content);
      paramau = new aa((float)localb.mwI, (float)localb.mwH, paramau.field_msgId);
      at.wS().a(paramau, 0);
    }
    GMTrace.o(9630121984000L, 71750);
  }
  
  private static l aKj()
  {
    GMTrace.i(9629048242176L, 71742);
    l locall2 = (l)at.AK().gZ("plugin.location");
    l locall1 = locall2;
    if (locall2 == null)
    {
      locall1 = new l();
      at.AK().a("plugin.location", locall1);
    }
    GMTrace.o(9629048242176L, 71742);
    return locall1;
  }
  
  public static a.a aKk()
  {
    GMTrace.i(9629182459904L, 71743);
    h.xw().wG();
    if (aKj().mxy == null) {
      aKj().mxy = new a.a();
    }
    a.a locala = aKj().mxy;
    GMTrace.o(9629182459904L, 71743);
    return locala;
  }
  
  public static k aKl()
  {
    GMTrace.i(9629316677632L, 71744);
    h.xw().wG();
    if (aKj().mxH == null) {
      aKj().mxH = new k();
    }
    k localk = aKj().mxH;
    GMTrace.o(9629316677632L, 71744);
    return localk;
  }
  
  public static j aKm()
  {
    GMTrace.i(9629450895360L, 71745);
    h.xw().wG();
    if (aKj().mxI == null) {
      aKj().mxI = new j();
    }
    j localj = aKj().mxI;
    GMTrace.o(9629450895360L, 71745);
    return localj;
  }
  
  public static o aKn()
  {
    GMTrace.i(9629585113088L, 71746);
    if (aKj().mxC == null) {
      aKj().mxC = new o();
    }
    o localo = aKj().mxC;
    GMTrace.o(9629585113088L, 71746);
    return localo;
  }
  
  public static p aKo()
  {
    GMTrace.i(9629719330816L, 71747);
    if (aKj().mxD == null) {
      aKj().mxD = new p();
    }
    p localp = aKj().mxD;
    GMTrace.o(9629719330816L, 71747);
    return localp;
  }
  
  public static i aKp()
  {
    GMTrace.i(9629853548544L, 71748);
    if (aKj().mxE == null) {
      aKj().mxE = new i();
    }
    i locali = aKj().mxE;
    GMTrace.o(9629853548544L, 71748);
    return locali;
  }
  
  public static m aKq()
  {
    GMTrace.i(9629987766272L, 71749);
    if (aKj().mxF == null) {
      aKj().mxF = new m();
    }
    m localm = aKj().mxF;
    GMTrace.o(9629987766272L, 71749);
    return localm;
  }
  
  public static String aKr()
  {
    GMTrace.i(9630256201728L, 71751);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.zn() + "trackroom/";
    GMTrace.o(9630256201728L, 71751);
    return (String)localObject;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(9630658854912L, 71754);
    d.c.a(Integer.valueOf(48), this.mxA);
    d.c.a(Integer.valueOf(61), this.mxB);
    at.getSysCmdMsgExtension().a("trackmsg", this.mxO, true);
    at.wS().a(424, this.mxJ);
    com.tencent.mm.sdk.b.a.vgX.b(this.mxv);
    com.tencent.mm.sdk.b.a.vgX.b(this.mxw);
    com.tencent.mm.sdk.b.a.vgX.b(this.mxK);
    com.tencent.mm.sdk.b.a.vgX.b(this.mxL);
    com.tencent.mm.sdk.b.a.vgX.b(this.mxM);
    com.tencent.mm.sdk.b.a.vgX.b(this.mxN);
    com.tencent.mm.sdk.b.a.vgX.b(this.mxx);
    com.tencent.mm.pluginsdk.p.a.tmb = aKn();
    com.tencent.mm.pluginsdk.p.a.tmc = aKo();
    com.tencent.mm.bn.a.a.a.vdS = aKq();
    h.xw().wG();
    if (aKj().mxG == null) {
      aKj().mxG = new d();
    }
    com.tencent.mm.plugin.p.c.a.mEV = aKj().mxG;
    GMTrace.o(9630658854912L, 71754);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(9630927290368L, 71756);
    GMTrace.o(9630927290368L, 71756);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(9630524637184L, 71753);
    GMTrace.o(9630524637184L, 71753);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(9630793072640L, 71755);
    if (this.mxC != null)
    {
      this.mxC.myd = null;
      this.mxC.stop();
      this.mxC.pI(1);
    }
    d.c.aE(Integer.valueOf(48));
    d.c.aE(Integer.valueOf(61));
    at.getSysCmdMsgExtension().b("trackmsg", this.mxO, true);
    at.wS().b(424, this.mxJ);
    com.tencent.mm.sdk.b.a.vgX.c(this.mxv);
    com.tencent.mm.sdk.b.a.vgX.c(this.mxw);
    com.tencent.mm.sdk.b.a.vgX.c(this.mxK);
    com.tencent.mm.sdk.b.a.vgX.c(this.mxL);
    com.tencent.mm.sdk.b.a.vgX.c(this.mxM);
    com.tencent.mm.sdk.b.a.vgX.c(this.mxN);
    com.tencent.mm.sdk.b.a.vgX.c(this.mxx);
    Object localObject;
    if (this.mxE != null)
    {
      localObject = this.mxE;
      ((i)localObject).aKi();
      ((i)localObject).hPn.clear();
    }
    if (this.mxH != null) {
      this.mxH.stop();
    }
    if (this.mxI != null)
    {
      localObject = this.mxI;
      aKl().a((com.tencent.mm.pluginsdk.location.a)localObject);
    }
    GMTrace.o(9630793072640L, 71755);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(9630390419456L, 71752);
    GMTrace.o(9630390419456L, 71752);
    return null;
  }
  
  private static final class a
    extends com.tencent.mm.sdk.b.c<fw>
  {
    private a()
    {
      GMTrace.i(9636564434944L, 71798);
      this.vhf = fw.class.getName().hashCode();
      GMTrace.o(9636564434944L, 71798);
    }
  }
  
  private static final class b
    extends com.tencent.mm.sdk.b.c<ir>
  {
    private b()
    {
      GMTrace.i(9644214845440L, 71855);
      this.vhf = ir.class.getName().hashCode();
      GMTrace.o(9644214845440L, 71855);
    }
  }
  
  private static final class c
    extends com.tencent.mm.sdk.b.c<it>
  {
    private volatile boolean Jj;
    
    private c()
    {
      GMTrace.i(9636967088128L, 71801);
      this.Jj = false;
      this.vhf = it.class.getName().hashCode();
      GMTrace.o(9636967088128L, 71801);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
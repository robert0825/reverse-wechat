package com.tencent.mm.plugin.voip_cs.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.bg;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import java.util.HashMap;

public final class b
  implements aq
{
  private static b qQT;
  private com.tencent.mm.plugin.voip_cs.b.b.a qQU;
  private d qQV;
  private c qQW;
  private com.tencent.mm.plugin.voip_cs.a.a qQX;
  private com.tencent.mm.sdk.b.c qQY;
  
  static
  {
    GMTrace.i(11258988331008L, 83886);
    qQT = null;
    GMTrace.o(11258988331008L, 83886);
  }
  
  public b()
  {
    GMTrace.i(11257646153728L, 83876);
    this.qQU = new com.tencent.mm.plugin.voip_cs.b.b.a();
    this.qQV = new d();
    this.qQW = new c();
    this.qQX = new com.tencent.mm.plugin.voip_cs.a.a();
    this.qQY = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(11257646153728L, 83876);
  }
  
  private static b bwn()
  {
    GMTrace.i(11257780371456L, 83877);
    if (qQT == null)
    {
      qQT = new b();
      at.AK().a("plugin.voip_cs", qQT);
    }
    b localb = qQT;
    GMTrace.o(11257780371456L, 83877);
    return localb;
  }
  
  public static com.tencent.mm.plugin.voip_cs.b.b.a bwo()
  {
    GMTrace.i(11257914589184L, 83878);
    com.tencent.mm.plugin.voip_cs.b.b.a locala = bwn().qQU;
    GMTrace.o(11257914589184L, 83878);
    return locala;
  }
  
  public static d bwp()
  {
    GMTrace.i(11258048806912L, 83879);
    h.xw().wG();
    if (bwn().qQV == null) {
      bwn().qQV = new d();
    }
    d locald = bwn().qQV;
    GMTrace.o(11258048806912L, 83879);
    return locald;
  }
  
  public static c bwq()
  {
    GMTrace.i(11258183024640L, 83880);
    c localc = bwn().qQW;
    GMTrace.o(11258183024640L, 83880);
    return localc;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(11258585677824L, 83883);
    w.d("MicroMsg.SubCoreVoipCS", "now account reset!");
    com.tencent.mm.sdk.b.a.vgX.b(this.qQX);
    com.tencent.mm.sdk.b.a.vgX.b(this.qQY);
    GMTrace.o(11258585677824L, 83883);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(11258719895552L, 83884);
    GMTrace.o(11258719895552L, 83884);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(11258451460096L, 83882);
    GMTrace.o(11258451460096L, 83882);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(11258854113280L, 83885);
    com.tencent.mm.sdk.b.a.vgX.c(this.qQX);
    com.tencent.mm.sdk.b.a.vgX.c(this.qQY);
    GMTrace.o(11258854113280L, 83885);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(11258317242368L, 83881);
    GMTrace.o(11258317242368L, 83881);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
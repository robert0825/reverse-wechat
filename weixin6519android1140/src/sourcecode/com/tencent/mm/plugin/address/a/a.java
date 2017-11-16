package com.tencent.mm.plugin.address.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.address.model.j;
import com.tencent.mm.plugin.address.model.k;
import com.tencent.mm.plugin.address.model.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.c;
import java.util.HashMap;

public final class a
  implements aq
{
  private l hue;
  private com.tencent.mm.plugin.address.b.a.a huf;
  private j hug;
  private k huh;
  
  public a()
  {
    GMTrace.i(12820074725376L, 95517);
    this.hue = null;
    this.huf = null;
    this.hug = new j();
    this.huh = new k();
    GMTrace.o(12820074725376L, 95517);
  }
  
  public static a QM()
  {
    GMTrace.i(12820208943104L, 95518);
    a locala2 = (a)at.AK().gZ("plugin.address");
    a locala1 = locala2;
    if (locala2 == null)
    {
      w.w("MicroMsg.SubCoreAddress", "not found in MMCore, new one");
      locala1 = new a();
      at.AK().a("plugin.address", locala1);
    }
    GMTrace.o(12820208943104L, 95518);
    return locala1;
  }
  
  public static com.tencent.mm.plugin.address.b.a.a QN()
  {
    GMTrace.i(15216934912000L, 113375);
    h.xw().wG();
    if (QM().huf == null) {
      QM().huf = new com.tencent.mm.plugin.address.b.a.a();
    }
    com.tencent.mm.plugin.address.b.a.a locala = QM().huf;
    GMTrace.o(15216934912000L, 113375);
    return locala;
  }
  
  public static l QO()
  {
    GMTrace.i(12820343160832L, 95519);
    h.xw().wG();
    if (QM().hue == null) {
      QM().hue = new l();
    }
    l locall = QM().hue;
    GMTrace.o(12820343160832L, 95519);
    return locall;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(12820880031744L, 95523);
    com.tencent.mm.sdk.b.a.vgX.b(this.hug);
    com.tencent.mm.sdk.b.a.vgX.b(this.huh);
    l locall = QO();
    at.AR();
    String str = c.zo();
    locall.path = (str + "addrmgr");
    GMTrace.o(12820880031744L, 95523);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(12820745814016L, 95522);
    GMTrace.o(12820745814016L, 95522);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(12820611596288L, 95521);
    GMTrace.o(12820611596288L, 95521);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(12821014249472L, 95524);
    com.tencent.mm.sdk.b.a.vgX.c(this.hug);
    com.tencent.mm.sdk.b.a.vgX.c(this.huh);
    GMTrace.o(12821014249472L, 95524);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(12820477378560L, 95520);
    GMTrace.o(12820477378560L, 95520);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
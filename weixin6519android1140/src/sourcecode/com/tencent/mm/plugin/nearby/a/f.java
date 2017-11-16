package com.tencent.mm.plugin.nearby.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.bc.i;
import com.tencent.mm.bc.l;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.il;
import com.tencent.mm.g.a.ip;
import com.tencent.mm.g.a.iq;
import com.tencent.mm.g.a.jt;
import com.tencent.mm.g.a.ju;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.e.d;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.ar.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import java.util.HashMap;

public final class f
  implements aq
{
  private com.tencent.mm.sdk.b.c jMK;
  private ar.a ntA;
  private com.tencent.mm.sdk.b.c ntv;
  private com.tencent.mm.sdk.b.c ntw;
  com.tencent.mm.pluginsdk.e.c<jt> ntx;
  com.tencent.mm.pluginsdk.e.c<ju> nty;
  d ntz;
  
  public f()
  {
    GMTrace.i(6678405709824L, 49758);
    this.ntv = new com.tencent.mm.sdk.b.c() {};
    this.ntw = new com.tencent.mm.sdk.b.c() {};
    this.ntx = new com.tencent.mm.pluginsdk.e.c()
    {
      public final int ann()
      {
        GMTrace.i(6679479451648L, 49766);
        GMTrace.o(6679479451648L, 49766);
        return 148;
      }
    };
    this.nty = new com.tencent.mm.pluginsdk.e.c()
    {
      public final int ann()
      {
        GMTrace.i(14548396408832L, 108394);
        GMTrace.o(14548396408832L, 108394);
        return 377;
      }
    };
    this.jMK = new com.tencent.mm.sdk.b.c() {};
    this.ntz = new d()
    {
      public final j aGn()
      {
        GMTrace.i(14548933279744L, 108398);
        i locali = l.MM();
        GMTrace.o(14548933279744L, 108398);
        return locali;
      }
      
      public final b zO(String paramAnonymousString)
      {
        GMTrace.i(14548799062016L, 108397);
        il localil = new il();
        localil.eLR.eBq = paramAnonymousString;
        GMTrace.o(14548799062016L, 108397);
        return localil;
      }
    };
    this.ntA = new ar.a()
    {
      public final void a(ar paramAnonymousar, x paramAnonymousx)
      {
        GMTrace.i(14548262191104L, 108393);
        if ((paramAnonymousar != null) && (paramAnonymousx != null) && (paramAnonymousx.uZ())) {
          l.MM().lR(paramAnonymousx.field_username);
        }
        GMTrace.o(14548262191104L, 108393);
      }
    };
    GMTrace.o(6678405709824L, 49758);
  }
  
  public static void aTI()
  {
    GMTrace.i(6678942580736L, 49762);
    l.MM().MH();
    at.wS().a(new c(2, 0.0F, 0.0F, 0, 0, "", ""), 0);
    GMTrace.o(6678942580736L, 49762);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6679076798464L, 49763);
    at.AR();
    com.tencent.mm.y.c.yK().a(this.ntA);
    a.vgX.b(this.jMK);
    a.vgX.b(this.ntw);
    a.vgX.b(this.ntx);
    a.vgX.b(this.nty);
    this.ntv.bPu();
    GMTrace.o(6679076798464L, 49763);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(6679211016192L, 49764);
    GMTrace.o(6679211016192L, 49764);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6678808363008L, 49761);
    if ((paramInt & 0x200) != 0) {
      aTI();
    }
    GMTrace.o(6678808363008L, 49761);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6678539927552L, 49759);
    at.AR();
    com.tencent.mm.y.c.yK().b(this.ntA);
    a.vgX.c(this.ntw);
    a.vgX.c(this.jMK);
    a.vgX.c(this.ntx);
    a.vgX.c(this.nty);
    this.ntv.dead();
    GMTrace.o(6678539927552L, 49759);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(6678674145280L, 49760);
    GMTrace.o(6678674145280L, 49760);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
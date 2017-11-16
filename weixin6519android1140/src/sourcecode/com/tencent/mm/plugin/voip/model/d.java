package com.tencent.mm.plugin.voip.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.plugin.voip.ui.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.b;
import com.tencent.mm.y.br;
import java.util.HashMap;

public final class d
  implements aq
{
  private m qEI;
  private i qEJ;
  public g qEK;
  private com.tencent.mm.plugin.voip.a qEL;
  
  public d()
  {
    GMTrace.i(5261737590784L, 39203);
    this.qEI = null;
    this.qEJ = new i();
    this.qEL = new com.tencent.mm.plugin.voip.a();
    GMTrace.o(5261737590784L, 39203);
  }
  
  private static d btF()
  {
    GMTrace.i(5261871808512L, 39204);
    d locald2 = (d)at.AK().gZ("plugin.voip");
    d locald1 = locald2;
    if (locald2 == null)
    {
      locald1 = new d();
      at.AK().a("plugin.voip", locald1);
    }
    GMTrace.o(5261871808512L, 39204);
    return locald1;
  }
  
  public static m btG()
  {
    GMTrace.i(5262006026240L, 39205);
    if (!at.AU()) {
      throw new b();
    }
    if (btF().qEI == null) {
      btF().qEI = new m();
    }
    m localm = btF().qEI;
    GMTrace.o(5262006026240L, 39205);
    return localm;
  }
  
  public static g btH()
  {
    GMTrace.i(5262140243968L, 39206);
    if (!at.AU()) {
      throw new b();
    }
    if (btF().qEK == null) {
      btF().qEK = new g();
    }
    g localg = btF().qEK;
    GMTrace.o(5262140243968L, 39206);
    return localg;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5262677114880L, 39210);
    d.c.a(Integer.valueOf(50), this.qEJ);
    btG();
    m.buR();
    com.tencent.mm.sdk.b.a.vgX.b(this.qEL);
    at.getNotification().cancel(40);
    GMTrace.o(5262677114880L, 39210);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(5262811332608L, 39211);
    GMTrace.o(5262811332608L, 39211);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5262542897152L, 39209);
    GMTrace.o(5262542897152L, 39209);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5262274461696L, 39207);
    if (this.qEK != null) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5300123860992L, 39489);
          d.this.qEK.dismiss();
          d.this.qEK = null;
          GMTrace.o(5300123860992L, 39489);
        }
      });
    }
    d.c.aE(Integer.valueOf(50));
    btG();
    m.buS();
    com.tencent.mm.sdk.b.a.vgX.c(this.qEL);
    GMTrace.o(5262274461696L, 39207);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(5262408679424L, 39208);
    GMTrace.o(5262408679424L, 39208);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
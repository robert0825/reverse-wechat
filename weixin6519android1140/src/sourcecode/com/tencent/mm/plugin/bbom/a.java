package com.tencent.mm.plugin.bbom;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.db;
import com.tencent.mm.g.a.gw;
import com.tencent.mm.g.a.ks;
import com.tencent.mm.g.a.qw;
import com.tencent.mm.modelmulti.r;
import com.tencent.mm.modelstat.n;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.protocal.c.ap;
import com.tencent.mm.protocal.c.aqh;
import com.tencent.mm.protocal.c.bki;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.y.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.be;
import com.tencent.mm.y.c;

public final class a
  implements com.tencent.mm.plugin.auth.a.a
{
  public a()
  {
    GMTrace.i(8023804215296L, 59782);
    GMTrace.o(8023804215296L, 59782);
  }
  
  public final void a(i.f paramf, i.g paramg, boolean paramBoolean)
  {
    GMTrace.i(8023938433024L, 59783);
    if ((paramg.tKc.uVb & 0x2) != 0)
    {
      paramf = paramg.tKc.uVd;
      if (!paramBoolean)
      {
        at.AR();
        c.eI(paramf.tOv);
      }
      paramg = com.tencent.mm.ac.b.hQ(com.tencent.mm.y.q.zE());
      as.gnb.gM(paramg);
      if (paramf.tOs != 0)
      {
        at.AR();
        c.yS().bt(paramf.tOs + "@qqim", 3);
      }
      com.tencent.mm.ac.b.c(paramf.tOs, 3);
    }
    for (;;)
    {
      n.hj(1);
      if (!paramBoolean) {
        break;
      }
      paramf = new gw();
      paramf.eJZ.eKa = false;
      com.tencent.mm.sdk.b.a.vgX.m(paramf);
      paramf = new qw();
      paramf.eVI.eVJ = true;
      com.tencent.mm.sdk.b.a.vgX.m(paramf);
      GMTrace.o(8023938433024L, 59783);
      return;
      w.w("MicroMsg.BigBallAuthHandle", "summerauth updateProfile acctsect not set!");
    }
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8024341086208L, 59786);
        be.gW("ver" + d.tJC);
        an.aWA().bX(com.tencent.mm.plugin.x.a.aWy().bJy());
        com.tencent.mm.sdk.b.a locala = com.tencent.mm.sdk.b.a.vgX;
        if (locala == null)
        {
          w.e("MicroMsg.BigBallAuthHandle", "EventPool is null.");
          GMTrace.o(8024341086208L, 59786);
          return;
        }
        Object localObject = new gw();
        ((gw)localObject).eJZ.eKa = true;
        locala.m((com.tencent.mm.sdk.b.b)localObject);
        localObject = new qw();
        ((qw)localObject).eVI.eVJ = true;
        locala.m((com.tencent.mm.sdk.b.b)localObject);
        locala.m(new db());
        locala.m(new ks());
        com.tencent.mm.modelmulti.q.JF().gE(3);
        w.i("MicroMsg.BigBallAuthHandle", "summerbadcr triggerSync bgfg after manual auth");
        GMTrace.o(8024341086208L, 59786);
      }
      
      public final String toString()
      {
        GMTrace.i(8024475303936L, 59787);
        String str = super.toString() + "|onGYNetEnd2";
        GMTrace.o(8024475303936L, 59787);
        return str;
      }
    });
    GMTrace.o(8023938433024L, 59783);
  }
  
  public final void a(y.b paramb, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    GMTrace.i(8024072650752L, 59784);
    paramString1 = com.tencent.mm.ac.b.hQ(com.tencent.mm.y.q.zE());
    as.gnb.gM(paramString1);
    com.tencent.mm.ac.b.c(paramInt1, 3);
    at.AR();
    c.yS().bt(paramb.tKW.uGp, 2);
    if (paramInt1 != 0)
    {
      at.AR();
      c.yS().bt(paramInt1 + "@qqim", 3);
    }
    GMTrace.o(8024072650752L, 59784);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\bbom\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.bt.a;
import java.util.Map;

public final class d
  implements bt.a
{
  public d()
  {
    GMTrace.i(8798777376768L, 65556);
    GMTrace.o(8798777376768L, 65556);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(8798911594496L, 65557);
    w.i("MicroMsg.NewYearSNSAmountLevelCtrl2016NotifyLsn", "receivemsg NewYearSNSAmountLevelCtrl2016NotifyLsn");
    b.nU(67);
    if ((parama == null) || (parama.gtM == null))
    {
      w.e("MicroMsg.NewYearSNSAmountLevelCtrl2016NotifyLsn", "onPreAddMessage cmdAM is null");
      GMTrace.o(8798911594496L, 65557);
      return;
    }
    e locale = new e();
    parama = n.a(parama.gtM.tPY);
    locale.jae = new StringBuffer();
    Map localMap = bh.q(parama, "sysmsg");
    locale.level = 0;
    if (localMap == null)
    {
      w.i("MicroMsg.NewYearSnsAmountLevel", "errr for paser %s", new Object[] { parama });
      b.nU(68);
    }
    for (;;)
    {
      w.i("MicroMsg.NewYearSnsAmountLevel", "dump NewYearSnsAmountLevel " + locale.jae.toString());
      h.xz();
      h.xy().xh().a(w.a.vtF, parama);
      h.xz();
      h.xy().xh().kL(true);
      GMTrace.o(8798911594496L, 65557);
      return;
      locale.level = bg.Sy((String)localMap.get(".sysmsg.NewYearSNSAmountLevelCtrl2016.Level"));
      w.i("MicroMsg.NewYearSnsAmountLevel", "get level %d", new Object[] { Integer.valueOf(locale.level) });
      if (locale.level == 0) {
        b.nU(69);
      } else if (locale.level == 1) {
        b.nU(70);
      } else if (locale.level == 2) {
        b.nU(71);
      } else if (locale.level == 3) {
        b.nU(72);
      } else if (locale.level == 4) {
        b.nU(73);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\lucky\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
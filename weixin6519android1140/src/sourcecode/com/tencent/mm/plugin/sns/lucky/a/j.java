package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.bt.a;
import java.util.LinkedList;
import java.util.Map;

public final class j
  implements bt.a
{
  public static String TAG;
  
  static
  {
    GMTrace.i(8800119554048L, 65566);
    TAG = "MicroMsg.NewYearSnsTips2016NotifyLsn";
    GMTrace.o(8800119554048L, 65566);
  }
  
  public j()
  {
    GMTrace.i(8799851118592L, 65564);
    GMTrace.o(8799851118592L, 65564);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(8799985336320L, 65565);
    w.i(TAG, "receivemsg NewYearSnsTips2016NotifyLsn");
    b.nU(74);
    if ((parama == null) || (parama.gtM == null))
    {
      w.e(TAG, "onPreAddMessage cmdAM is null");
      GMTrace.o(8799985336320L, 65565);
      return;
    }
    i locali = new i();
    String str1 = n.a(parama.gtM.tPY);
    locali.jae = new StringBuffer();
    Map localMap = bh.q(str1, "sysmsg");
    locali.pqq.clear();
    if (localMap == null)
    {
      w.i("MicroMsg.NewYearSnsTips", "errr for paser %s", new Object[] { str1 });
      b.nU(75);
    }
    for (;;)
    {
      w.i("MicroMsg.NewYearSnsTips", "dump NewYearSnsTips " + locali.jae.toString());
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vtu, str1);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().kL(true);
      GMTrace.o(8799985336320L, 65565);
      return;
      int i = 0;
      label203:
      long l1;
      label272:
      long l2;
      label343:
      String str2;
      if (i == 0)
      {
        parama = "";
        l1 = bg.Sz((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "BeginTime" })));
        locali.jae.append("BeginTime:" + l1 + ";");
        if (i != 0) {
          break label549;
        }
        parama = "";
        l2 = bg.Sz((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "EndTime" })));
        locali.jae.append("EndTime:" + l2 + ";");
        if (i != 0) {
          break label557;
        }
        parama = "";
        str2 = bg.aq((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "ActionID" })), "");
        locali.jae.append("ActionID:" + str2 + ";");
        if (bg.nm(str2)) {
          break label573;
        }
        if (i != 0) {
          break label565;
        }
      }
      label549:
      label557:
      label565:
      for (parama = "";; parama = String.valueOf(i))
      {
        parama = bg.aq((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "TipsMessage" })), "");
        locali.jae.append("TipsMessage:" + parama + ";\n");
        h localh = new h();
        localh.pqn = str2;
        localh.ppD = l1;
        localh.jim = l2;
        localh.pqo = parama;
        locali.pqq.add(localh);
        i += 1;
        break;
        parama = String.valueOf(i);
        break label203;
        parama = String.valueOf(i);
        break label272;
        parama = String.valueOf(i);
        break label343;
      }
      label573:
      if (locali.pqq.size() == 0) {
        b.nU(76);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\lucky\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
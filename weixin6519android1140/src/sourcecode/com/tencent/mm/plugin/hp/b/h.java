package com.tencent.mm.plugin.hp.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bt.a;
import java.util.Map;

public final class h
  implements bt.a
{
  public h()
  {
    GMTrace.i(15367392985088L, 114496);
    GMTrace.o(15367392985088L, 114496);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(15367527202816L, 114497);
    parama = parama.gtM;
    if (parama.lQc == 10002)
    {
      parama = n.a(parama.tPY);
      if (bg.nm(parama))
      {
        w.w("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "msg content is null");
        GMTrace.o(15367527202816L, 114497);
        return;
      }
      parama = bh.q(parama, "sysmsg");
      if ((parama != null) && (parama.size() > 0))
      {
        String str = (String)parama.get(".sysmsg.$type");
        if ((!bg.nm(str)) && (str.equalsIgnoreCase("checktinkerupdate")))
        {
          i = bg.Sy((String)parama.get(".sysmsg.tinkerboots.ignorenetwork"));
          w.i("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "ignore:%s start checkout tinker update. try to do update.", new Object[] { Integer.valueOf(i) });
          long l = com.tencent.mm.kernel.a.wM();
          parama = com.tinkerboots.sdk.a.csM().fK("uin", String.valueOf(l & 0xFFFFFFFF));
          if ((!am.isWifi(ab.getContext())) && (i != 1)) {
            break label204;
          }
        }
      }
    }
    label204:
    for (int i = 3;; i = 2)
    {
      parama.fK("network", String.valueOf(i));
      com.tinkerboots.sdk.a.csM().nj(true);
      GMTrace.o(15367527202816L, 114497);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.welab;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bt.a;

public final class c
  implements bt.a
{
  public c()
  {
    GMTrace.i(15680120291328L, 116826);
    GMTrace.o(15680120291328L, 116826);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(15680254509056L, 116827);
    if ((parama == null) || (parama.gtM == null) || (parama.gtM.tPY == null))
    {
      w.i("MicroMsg.WelabNewMsgLsn", "recv null msg");
      GMTrace.o(15680254509056L, 116827);
      return;
    }
    parama = n.a(parama.gtM.tPY);
    w.i("MicroMsg.WelabNewMsgLsn", "recv addMsg " + parama);
    parama = g.Nn(parama);
    if ((parama != null) && (parama.isValid()))
    {
      if (parama.field_status != 1) {
        break label140;
      }
      b.bGu().saK.a(parama, new String[] { "expId" });
    }
    for (;;)
    {
      e.o(parama.field_LabsAppId, 6, false);
      GMTrace.o(15680254509056L, 116827);
      return;
      label140:
      b.bGu().saK.c(parama);
      com.tencent.mm.plugin.welab.d.b.bGI().f(parama);
      com.tencent.mm.plugin.report.service.g.ork.a(parama.field_idkey, parama.field_idkeyValue, 1L, false);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
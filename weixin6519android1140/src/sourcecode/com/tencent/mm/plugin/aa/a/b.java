package com.tencent.mm.plugin.aa.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.aa.a.a.j;
import com.tencent.mm.plugin.aa.a.b.d;
import com.tencent.mm.protocal.c.v;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  implements e
{
  com.tencent.mm.vending.g.b how;
  
  public b()
  {
    GMTrace.i(5601040007168L, 41731);
    GMTrace.o(5601040007168L, 41731);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5601174224896L, 41732);
    w.i("MicroMsg.AAGetPaylistDetailLogic", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((j)paramk).hps;
      w.i("MicroMsg.AAGetPaylistDetailLogic", "AAQueryDetailRes, onSceneEnd, retCode: %s", new Object[] { Integer.valueOf(paramString.jWs) });
      if (paramString.jWs == 0)
      {
        com.tencent.mm.vending.g.g.a(this.how, new Object[] { paramString });
        com.tencent.mm.plugin.report.service.g.ork.a(407L, 6L, 1L, false);
        paramk = com.tencent.mm.plugin.aa.b.PF().nv(paramString.tLZ);
        if (paramk != null)
        {
          paramk.field_status = paramString.state;
          com.tencent.mm.plugin.aa.b.PF().b(paramk);
        }
        GMTrace.o(5601174224896L, 41732);
        return;
      }
      if ((paramString.jWs > 0) && (!bg.nm(paramString.jWt))) {
        this.how.bU(paramString.jWt);
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(407L, 8L, 1L, false);
        GMTrace.o(5601174224896L, 41732);
        return;
        this.how.bU(Boolean.valueOf(false));
      }
    }
    if (this.how != null) {
      this.how.bU(Boolean.valueOf(false));
    }
    com.tencent.mm.plugin.report.service.g.ork.a(407L, 7L, 1L, false);
    GMTrace.o(5601174224896L, 41732);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\aa\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
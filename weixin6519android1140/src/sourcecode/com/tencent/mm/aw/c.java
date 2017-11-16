package com.tencent.mm.aw;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;

public final class c
  implements com.tencent.mm.ad.e
{
  private static c gPL;
  private boolean gqR;
  private int retryTimes;
  
  public c()
  {
    GMTrace.i(12937112584192L, 96389);
    this.gqR = false;
    this.retryTimes = 3;
    GMTrace.o(12937112584192L, 96389);
  }
  
  public static c Kc()
  {
    GMTrace.i(12937246801920L, 96390);
    if (gPL == null) {
      gPL = new c();
    }
    c localc = gPL;
    GMTrace.o(12937246801920L, 96390);
    return localc;
  }
  
  private void release()
  {
    GMTrace.i(12937515237376L, 96392);
    this.gqR = false;
    h.xx().fYr.b(159, this);
    GMTrace.o(12937515237376L, 96392);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(12937649455104L, 96393);
    if (paramk.getType() == 159)
    {
      w.i("MicroMsg.ConfigListUpdater", "getPackageList sceneEnd, %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label82;
      }
      h.xy().xh().set(81938, Long.valueOf(bg.Pu()));
    }
    for (;;)
    {
      release();
      GMTrace.o(12937649455104L, 96393);
      return;
      label82:
      paramInt1 = this.retryTimes - 1;
      this.retryTimes = paramInt1;
      if (paramInt1 < 0)
      {
        h.xy().xh().set(81938, Long.valueOf((bg.Pv() - 86400000L + 3600000L) / 1000L));
        this.retryTimes = 3;
      }
    }
  }
  
  public final void update()
  {
    GMTrace.i(12937381019648L, 96391);
    w.i("MicroMsg.ConfigListUpdater", "isUpdateing : " + this.gqR);
    w.i("MicroMsg.ConfigListUpdater", "isSDCardAvailable : " + h.xy().isSDCardAvailable());
    if ((!this.gqR) && (h.xy().isSDCardAvailable()))
    {
      release();
      this.gqR = true;
      h.xx().fYr.a(159, this);
      k localk = new k(7);
      h.xx().fYr.a(localk, 0);
    }
    GMTrace.o(12937381019648L, 96391);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.aa.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  implements com.tencent.mm.ad.e
{
  long eDr;
  com.tencent.mm.vending.g.b gty;
  
  public i()
  {
    GMTrace.i(5585470750720L, 41615);
    this.eDr = -1L;
    GMTrace.o(5585470750720L, 41615);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5585873403904L, 41618);
    w.i("MicroMsg.CloseAALogic", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((com.tencent.mm.plugin.aa.a.a.e)paramk).hpi;
      w.i("MicroMsg.CloseAALogic", "closeAA, response.retcode: %s", new Object[] { Integer.valueOf(paramString.jWs) });
      w.d("MicroMsg.CloseAALogic", "closeAA, response.msgxml: %s", new Object[] { paramString.tMb });
      if (paramString.jWs == 0)
      {
        com.tencent.mm.vending.g.g.a(this.gty, new Object[] { Boolean.valueOf(true) });
        if ((!bg.nm(paramString.tMb)) && (this.eDr > 0L) && (((com.tencent.mm.plugin.aa.a.a.e)paramk).scene == a.hos)) {
          h.h(this.eDr, paramString.tMb);
        }
        com.tencent.mm.plugin.report.service.g.ork.a(407L, 21L, 1L, false);
        GMTrace.o(5585873403904L, 41618);
        return;
      }
      if ((paramString.jWs > 0) && (!bg.nm(paramString.jWt)))
      {
        this.gty.bU(paramString.jWt);
        com.tencent.mm.plugin.report.service.g.ork.a(407L, 11L, 1L, false);
        GMTrace.o(5585873403904L, 41618);
        return;
      }
      this.gty.bU(Boolean.valueOf(false));
      com.tencent.mm.plugin.report.service.g.ork.a(407L, 23L, 1L, false);
      GMTrace.o(5585873403904L, 41618);
      return;
    }
    this.gty.bU(Boolean.valueOf(false));
    com.tencent.mm.plugin.report.service.g.ork.a(407L, 22L, 1L, false);
    GMTrace.o(5585873403904L, 41618);
  }
  
  public final void init()
  {
    GMTrace.i(5585604968448L, 41616);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(1530, this);
    GMTrace.o(5585604968448L, 41616);
  }
  
  public final void unInit()
  {
    GMTrace.i(5585739186176L, 41617);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(1530, this);
    GMTrace.o(5585739186176L, 41617);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\aa\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
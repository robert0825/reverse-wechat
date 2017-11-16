package com.tencent.mm.plugin.aa.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.aa.a.a.i;
import com.tencent.mm.protocal.c.a;
import com.tencent.mm.protocal.c.o;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.g.b;

public final class f
  implements e
{
  boolean hoK;
  b how;
  
  public f()
  {
    GMTrace.i(5604261232640L, 41755);
    this.hoK = false;
    GMTrace.o(5604261232640L, 41755);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5604395450368L, 41756);
    w.i("MicroMsg.AAPayLogic", "AAPayLogic, onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.hoK = false;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((i)paramk).hpq;
      w.i("MicroMsg.AAPayLogic", "AAPayLogic, onSceneEnd, retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(paramString.jWs), paramString.jWt });
      if (paramString.jWs == 0)
      {
        com.tencent.mm.vending.g.g.a(this.how, new Object[] { paramString });
        com.tencent.mm.plugin.report.service.g.ork.a(407L, 9L, 1L, false);
        GMTrace.o(5604395450368L, 41756);
        return;
      }
      if (this.how != null)
      {
        if ((paramString.tMt == null) || (paramString.tMt.eQl != 1) || (bg.nm(paramString.tMt.jWz)) || (bg.nm(paramString.tMt.mJO)) || (bg.nm(paramString.tMt.mJP)) || (bg.nm(paramString.tMt.eLQ))) {
          break label241;
        }
        this.how.bU(paramString.tMt);
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(407L, 11L, 1L, false);
        GMTrace.o(5604395450368L, 41756);
        return;
        label241:
        if ((paramString.jWs > 0) && (!bg.nm(paramString.jWt))) {
          this.how.bU(paramString.jWt);
        } else {
          this.how.bU(Boolean.valueOf(false));
        }
      }
    }
    if (this.how != null) {
      this.how.bU(Boolean.valueOf(false));
    }
    com.tencent.mm.plugin.report.service.g.ork.a(407L, 10L, 1L, false);
    GMTrace.o(5604395450368L, 41756);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
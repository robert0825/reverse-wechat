package com.tencent.mm.plugin.game.gamewebview.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;

public final class a
{
  public d lHe;
  private String lID;
  private int lIE;
  private int lIF;
  public int lIG;
  public boolean lIH;
  public long lII;
  public long lIJ;
  public long lIK;
  public long lIL;
  public long lIM;
  
  public a(d paramd)
  {
    GMTrace.i(18026246176768L, 134306);
    this.lHe = paramd;
    this.lIE = am.getNetType(ab.getContext());
    if (paramd.lJr.isX5Kernel) {}
    for (int i = 1;; i = 2)
    {
      this.lIF = i;
      this.lII = System.currentTimeMillis();
      this.lID = bg.nl(this.lHe.lID);
      GMTrace.o(18026246176768L, 134306);
      return;
    }
  }
  
  public final void a(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    GMTrace.i(18026514612224L, 134308);
    g.ork.i(14531, new Object[] { this.lHe.aEs(), ai.zJ(this.lID), ai.zJ(paramString), Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(this.lIE), Integer.valueOf(this.lIF), Integer.valueOf(paramInt3) });
    GMTrace.o(18026514612224L, 134308);
  }
  
  public final void eQ(boolean paramBoolean)
  {
    int i = 1;
    GMTrace.i(18026380394496L, 134307);
    long l = System.currentTimeMillis() - this.lIL;
    w.d("MicroMsg.GameWebViewReportManager", "getA8keyTime = %d, success = %b", new Object[] { Long.valueOf(l), Boolean.valueOf(paramBoolean) });
    Object localObject = this.lHe.aEr();
    if (paramBoolean)
    {
      a((String)localObject, 3, l, i, 0);
      localObject = g.ork;
      if (!paramBoolean) {
        break label105;
      }
    }
    label105:
    for (l = 2L;; l = 1L)
    {
      ((g)localObject).a(607L, l, 1L, false);
      GMTrace.o(18026380394496L, 134307);
      return;
      i = 0;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.page;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.report.e;

public final class p
{
  public final e ivB;
  public volatile long ivC;
  public volatile long ivD;
  
  p(int paramInt)
  {
    GMTrace.i(18356556005376L, 136767);
    this.ivC = 0L;
    this.ivD = 0L;
    this.ivB = new e("MicroMsg.AppBrandPageViewStatistics[" + paramInt + "]");
    GMTrace.o(18356556005376L, 136767);
  }
  
  public final boolean ZA()
  {
    GMTrace.i(16149345468416L, 120322);
    if ((this.ivC > 0L) && (this.ivD <= 0L))
    {
      GMTrace.o(16149345468416L, 120322);
      return true;
    }
    GMTrace.o(16149345468416L, 120322);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
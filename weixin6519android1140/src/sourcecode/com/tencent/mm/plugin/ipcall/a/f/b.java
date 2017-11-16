package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.ipcall.a.d.g;
import com.tencent.mm.y.at;

public final class b
{
  private static b mmE;
  private g mmF;
  
  public b()
  {
    GMTrace.i(11598693400576L, 86417);
    GMTrace.o(11598693400576L, 86417);
  }
  
  public static b aIT()
  {
    GMTrace.i(11598827618304L, 86418);
    if (mmE == null) {
      mmE = new b();
    }
    b localb = mmE;
    GMTrace.o(11598827618304L, 86418);
    return localb;
  }
  
  public final void fs(boolean paramBoolean)
  {
    GMTrace.i(11598961836032L, 86419);
    at.wS().c(this.mmF);
    this.mmF = null;
    if (paramBoolean) {}
    for (this.mmF = new g(1);; this.mmF = new g(0))
    {
      at.wS().a(this.mmF, 0);
      GMTrace.o(11598961836032L, 86419);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
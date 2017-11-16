package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.ipcall.a.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.h;
import com.tencent.mm.plugin.ipcall.a.h.a;
import com.tencent.mm.protocal.c.ava;

public final class e
  extends com.tencent.mm.plugin.ipcall.a.a.a
  implements h.a
{
  private h mmH;
  
  public e()
  {
    GMTrace.i(11592519385088L, 86371);
    this.mmH = null;
    GMTrace.o(11592519385088L, 86371);
  }
  
  public final int Fd()
  {
    GMTrace.i(11592787820544L, 86373);
    GMTrace.o(11592787820544L, 86373);
    return 8;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11593324691456L, 86377);
    GMTrace.o(11593324691456L, 86377);
  }
  
  public final void a(ava paramava)
  {
    GMTrace.i(11593458909184L, 86378);
    this.mjC.a(8, paramava, 0, 0);
    GMTrace.o(11593458909184L, 86378);
  }
  
  public final int[] aIA()
  {
    GMTrace.i(11592653602816L, 86372);
    GMTrace.o(11592653602816L, 86372);
    return new int[0];
  }
  
  public final void aIB()
  {
    GMTrace.i(11592922038272L, 86374);
    this.mmH = new h();
    this.mmH.mjd = this;
    com.tencent.mm.sdk.b.a.vgX.b(this.mmH);
    GMTrace.o(11592922038272L, 86374);
  }
  
  public final void b(c paramc)
  {
    GMTrace.i(11593190473728L, 86376);
    GMTrace.o(11593190473728L, 86376);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(11593056256000L, 86375);
    com.tencent.mm.sdk.b.a.vgX.c(this.mmH);
    GMTrace.o(11593056256000L, 86375);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.ui.tools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.y.at;

final class i
  extends SecurityImage.b
{
  protected String vRa;
  protected String vRb;
  protected byte[] vRc;
  protected int vRd;
  
  i()
  {
    GMTrace.i(1932735283200L, 14400);
    this.vRa = "";
    this.vRb = "";
    this.vRc = null;
    this.vRd = 0;
    GMTrace.o(1932735283200L, 14400);
  }
  
  public final void bYp()
  {
    GMTrace.i(1932869500928L, 14401);
    u localu = new u(this.vRd, "", this.vRa, this.vRb);
    at.wS().a(localu, 0);
    GMTrace.o(1932869500928L, 14401);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
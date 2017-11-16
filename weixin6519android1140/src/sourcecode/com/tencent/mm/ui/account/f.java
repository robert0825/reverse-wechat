package com.tencent.mm.ui.account;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.y.at;

public final class f
  extends SecurityImage.b
{
  private static f vRe;
  public String gUy;
  public String vQY;
  public String vQZ;
  public String vRa;
  public String vRb;
  public byte[] vRc;
  public int vRd;
  
  static
  {
    GMTrace.i(2661940199424L, 19833);
    vRe = null;
    GMTrace.o(2661940199424L, 19833);
  }
  
  public f()
  {
    GMTrace.i(2661269110784L, 19828);
    this.gUy = null;
    this.vQY = null;
    this.vQZ = null;
    this.vRa = null;
    this.vRb = null;
    this.vRc = null;
    this.vRd = 0;
    GMTrace.o(2661269110784L, 19828);
  }
  
  public static void a(f paramf)
  {
    GMTrace.i(2661537546240L, 19830);
    vRe = paramf;
    GMTrace.o(2661537546240L, 19830);
  }
  
  public static String bYA()
  {
    GMTrace.i(2661805981696L, 19832);
    if (vRe != null)
    {
      String str = vRe.vQY;
      GMTrace.o(2661805981696L, 19832);
      return str;
    }
    GMTrace.o(2661805981696L, 19832);
    return null;
  }
  
  public static String bYz()
  {
    GMTrace.i(2661671763968L, 19831);
    if (vRe != null)
    {
      String str = vRe.gUy;
      GMTrace.o(2661671763968L, 19831);
      return str;
    }
    GMTrace.o(2661671763968L, 19831);
    return null;
  }
  
  public final void bYp()
  {
    GMTrace.i(2661403328512L, 19829);
    if (!bg.nm(this.vQZ))
    {
      localu = new u(this.gUy, this.vQZ, this.vXU.vRd, "", "", "", 0, "", false, true);
      at.wS().a(localu, 0);
      GMTrace.o(2661403328512L, 19829);
      return;
    }
    u localu = new u(this.gUy, this.vQY, this.vXU.vRd, "", "", "", 0, "", false, false);
    at.wS().a(localu, 0);
    GMTrace.o(2661403328512L, 19829);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
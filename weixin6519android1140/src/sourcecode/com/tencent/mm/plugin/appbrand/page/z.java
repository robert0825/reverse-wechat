package com.tencent.mm.plugin.appbrand.page;

import com.tencent.gmtrace.GMTrace;

 enum z
{
  private final String type;
  
  static
  {
    GMTrace.i(10223498559488L, 76171);
    iwI = new z("APP_LAUNCH", 0, "appLaunch");
    iwJ = new z("NAVIGATE_TO", 1, "navigateTo");
    iwK = new z("NAVIGATE_BACK", 2, "navigateBack");
    iwL = new z("REDIRECT_TO", 3, "redirectTo");
    iwM = new z("RE_LAUNCH", 4, "reLaunch");
    iwN = new z("AUTO_RE_LAUNCH", 5, "autoReLaunch");
    iwO = new z("SWITCH_TAB", 6, "switchTab");
    iwP = new z[] { iwI, iwJ, iwK, iwL, iwM, iwN, iwO };
    GMTrace.o(10223498559488L, 76171);
  }
  
  private z(String paramString)
  {
    GMTrace.i(10223230124032L, 76169);
    this.type = paramString;
    GMTrace.o(10223230124032L, 76169);
  }
  
  public final String toString()
  {
    GMTrace.i(10223364341760L, 76170);
    String str = this.type;
    GMTrace.o(10223364341760L, 76170);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
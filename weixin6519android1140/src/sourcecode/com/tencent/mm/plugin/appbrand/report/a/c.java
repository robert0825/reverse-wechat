package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.c.bus;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  private static final c iza;
  public String appId;
  public int eAu;
  public String eAv;
  public String eAw;
  public String eDA;
  public int eVi;
  public String eVj;
  public String iyC;
  public int iyH;
  private boolean iyJ;
  public int iym;
  private final boolean iyv;
  public int scene;
  
  static
  {
    GMTrace.i(16283026325504L, 121318);
    iza = new c(true);
    GMTrace.o(16283026325504L, 121318);
  }
  
  private c(boolean paramBoolean)
  {
    GMTrace.i(16282489454592L, 121314);
    this.iyJ = true;
    this.iyv = paramBoolean;
    GMTrace.o(16282489454592L, 121314);
  }
  
  public static c a(e parame, String paramString1, String paramString2)
  {
    GMTrace.i(18355213828096L, 136757);
    c localc = new c(false);
    localc.eDA = paramString1;
    localc.appId = parame.hyD;
    paramString1 = com.tencent.mm.plugin.appbrand.a.nL(parame.hyD);
    localc.scene = paramString1.scene;
    localc.eAv = paramString1.eAv;
    localc.eVi = paramString1.eVi;
    localc.eVj = paramString1.eVj;
    localc.iym = paramString1.iym;
    localc.eAu = (parame.hyG.hRg.hKB + 1);
    localc.iyC = paramString2;
    GMTrace.o(18355213828096L, 136757);
    return localc;
  }
  
  public static c aae()
  {
    GMTrace.i(16282623672320L, 121315);
    c localc = iza;
    GMTrace.o(16282623672320L, 121315);
    return localc;
  }
  
  public final void f(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(16282892107776L, 121317);
    if (paramAppBrandPageView == null)
    {
      GMTrace.o(16282892107776L, 121317);
      return;
    }
    this.iyC = paramAppBrandPageView.ivj.hZo;
    GMTrace.o(16282892107776L, 121317);
  }
  
  public final void rw()
  {
    int i = 1;
    GMTrace.i(16162498805760L, 120420);
    if (this.iyv)
    {
      GMTrace.o(16162498805760L, 120420);
      return;
    }
    bus localbus = new bus();
    localbus.jib = 1;
    localbus.lQa = this.appId;
    localbus.vdd = this.eAw;
    localbus.oqG = 0;
    localbus.kBw = ((int)bg.Pu());
    localbus.oqH = 1;
    localbus.vde = "";
    localbus.vcS = this.eAu;
    localbus.vdf = this.eDA;
    localbus.vdg = com.tencent.mm.plugin.appbrand.report.a.bP(ab.getContext());
    localbus.rBN = this.scene;
    localbus.vdh = this.iym;
    localbus.vdi = this.eAv;
    localbus.iyC = this.iyC;
    localbus.eVi = this.eVi;
    localbus.eVj = this.eVj;
    if (this.iyJ) {}
    for (;;)
    {
      this.iyH = i;
      localbus.iyH = i;
      AppBrandIDKeyBatchReport.a(localbus);
      this.iyJ = false;
      w.i("MicroMsg.AppBrand.Report.kv_14004", "report " + toString());
      GMTrace.o(16162498805760L, 120420);
      return;
      i = 0;
    }
  }
  
  public final String toString()
  {
    GMTrace.i(16162633023488L, 120421);
    String str = "kv_14004{appId='" + this.appId + '\'' + ", sessionId='" + this.eDA + '\'' + ", scene=" + this.scene + ", sceneNote='" + this.eAv + '\'' + ", preScene=" + this.eVi + ", preSceneNote='" + this.eVj + '\'' + ", pagePath='" + this.eAw + '\'' + ", usedState=" + this.iym + ", appState=" + this.eAu + ", referPagePath='" + this.iyC + '\'' + ", isEntrance=" + this.iyH + '}';
    GMTrace.o(16162633023488L, 120421);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
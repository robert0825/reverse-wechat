package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.c.f;
import com.tencent.mm.plugin.appbrand.c.j;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.b;

final class b
{
  static void c(AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject)
  {
    GMTrace.i(20673825079296L, 154032);
    paramAppBrandInitConfig.hQz = AppBrandStickyBannerLogic.b.av(paramAppBrandInitConfig.appId, paramAppBrandInitConfig.hKs);
    paramAppBrandInitConfig.Uv();
    boolean bool = e.Sj().ab(paramAppBrandInitConfig.username, paramAppBrandInitConfig.hKs);
    if (e.Sk().aa(paramAppBrandInitConfig.username, paramAppBrandInitConfig.hKs))
    {
      paramAppBrandStatObject.iym = 1;
      GMTrace.o(20673825079296L, 154032);
      return;
    }
    if (bool)
    {
      paramAppBrandStatObject.iym = 2;
      GMTrace.o(20673825079296L, 154032);
      return;
    }
    paramAppBrandStatObject.iym = 3;
    GMTrace.o(20673825079296L, 154032);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.menu;

import android.app.Activity;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.n;

public final class j
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public j()
  {
    super(l.isu - 1);
    GMTrace.i(15558519029760L, 115920);
    GMTrace.o(15558519029760L, 115920);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, n paramn, String paramString)
  {
    GMTrace.i(17667213754368L, 131631);
    boolean bool = AppBrandStickyBannerLogic.a.av(paramString, paramAppBrandPageView.hzM.hyG.hRg.hKB);
    int i = this.isD;
    if (bool) {}
    for (paramContext = paramContext.getString(o.i.hDY);; paramContext = paramContext.getString(o.i.hDX))
    {
      paramn.e(i, paramContext);
      GMTrace.o(17667213754368L, 131631);
      return;
    }
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15558787465216L, 115922);
    paramk = com.tencent.mm.plugin.appbrand.a.nK(paramString);
    if (AppBrandStickyBannerLogic.a.av(paramk.appId, paramk.hRg.hKB))
    {
      AppBrandStickyBannerLogic.a.st(paramk.appId);
      com.tencent.mm.ui.snackbar.a.a(paramContext, ((Activity)paramContext).findViewById(16908290), paramContext.getString(o.i.hDZ));
    }
    for (;;)
    {
      com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramAppBrandPageView.ivj.hZo, 13, "", bg.Pu(), 1, 0);
      GMTrace.o(15558787465216L, 115922);
      return;
      c.a(paramString, c.c.hyv);
      if (paramAppBrandPageView == null) {
        paramContext = ab.getContext();
      }
      AppBrandStickyBannerLogic.a.a(paramContext, paramk.appId, paramk.hRg.hKB, paramk.eEs, paramk.hQJ);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\menu\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
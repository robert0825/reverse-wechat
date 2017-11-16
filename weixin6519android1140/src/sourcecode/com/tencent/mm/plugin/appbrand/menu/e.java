package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.ui.base.n;

public final class e
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public e()
  {
    super(l.isr - 1);
    GMTrace.i(15559458553856L, 115927);
    GMTrace.o(15559458553856L, 115927);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, n paramn, String paramString)
  {
    GMTrace.i(17666542665728L, 131626);
    if (com.tencent.mm.plugin.appbrand.a.nK(paramString).hRg.hKB == 1) {
      if (!com.tencent.mm.plugin.appbrand.a.nK(paramString).hQM) {
        break label62;
      }
    }
    label62:
    for (paramContext = paramContext.getString(o.i.hFF);; paramContext = paramContext.getString(o.i.hFM))
    {
      paramn.e(l.isr - 1, paramContext);
      GMTrace.o(17666542665728L, 131626);
      return;
    }
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15559726989312L, 115929);
    if (!com.tencent.mm.plugin.appbrand.a.nK(paramString).hQM) {}
    for (int i = 1; i != 0; i = 0)
    {
      AppBrandPerformanceManager.rX(paramString);
      Toast.makeText(paramContext, o.i.hFN, 0).show();
      GMTrace.o(15559726989312L, 115929);
      return;
    }
    AppBrandPerformanceManager.rY(paramString);
    Toast.makeText(paramContext, o.i.hFG, 0).show();
    GMTrace.o(15559726989312L, 115929);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\menu\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
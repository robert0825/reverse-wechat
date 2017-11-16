package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.m;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.n;

public final class b
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public b()
  {
    super(l.iss - 1);
    GMTrace.i(19693633011712L, 146729);
    GMTrace.o(19693633011712L, 146729);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, n paramn, String paramString)
  {
    GMTrace.i(19693767229440L, 146730);
    paramn.e(this.isD, paramContext.getString(o.i.hEI));
    GMTrace.o(19693767229440L, 146730);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(19693901447168L, 146731);
    paramAppBrandPageView.hzM.hyJ.Zr();
    com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramAppBrandPageView.ivj.iwc, 17, "", bg.Pu(), 1, 0);
    GMTrace.o(19693901447168L, 146731);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\menu\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
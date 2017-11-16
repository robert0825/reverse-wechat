package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.h;
import com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic.a;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.plugin.appbrand.widget.f.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.n;

public final class a
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  private static boolean isd;
  
  public a(boolean paramBoolean)
  {
    super(l.isw - 1);
    GMTrace.i(20686173110272L, 154124);
    isd = paramBoolean;
    GMTrace.o(20686173110272L, 154124);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, n paramn, String paramString)
  {
    GMTrace.i(17667347972096L, 131632);
    paramAppBrandPageView = paramAppBrandPageView.hzM.hyG;
    int k = l.isw;
    paramString = paramAppBrandPageView.eEs;
    int i = paramAppBrandPageView.hRg.hKB;
    paramAppBrandPageView = paramContext.getString(o.i.cRP, new Object[] { paramString });
    String str = com.tencent.mm.plugin.appbrand.appcache.a.hW(i);
    if (bg.nm(str))
    {
      paramContext = paramAppBrandPageView;
      paramn.e(k - 1, paramContext);
      GMTrace.o(17667347972096L, 131632);
      return;
    }
    int j = Color.parseColor("#42000000");
    i = com.tencent.mm.br.a.c(paramContext, o.c.hAc);
    if (isd)
    {
      j = Color.parseColor("#80FFFFFF");
      i = com.tencent.mm.br.a.c(paramContext, o.c.aPq);
    }
    for (;;)
    {
      paramString = new b(str, com.tencent.mm.br.a.fromDPToPix(paramContext, 11), com.tencent.mm.br.a.fromDPToPix(paramContext, 11), com.tencent.mm.br.a.fromDPToPix(paramContext, 9), j, com.tencent.mm.br.a.fromDPToPix(paramContext, 2));
      j = paramString.a(null);
      int[] arrayOfInt = g.aaW();
      int m = com.tencent.mm.br.a.V(paramContext, o.d.hAo);
      TextPaint localTextPaint = new TextPaint(new Paint(i));
      localTextPaint.setTextSize(m);
      paramAppBrandPageView = TextUtils.ellipsize(paramAppBrandPageView, localTextPaint, arrayOfInt[0] - com.tencent.mm.br.a.V(paramContext, o.d.hAn) - j, TextUtils.TruncateAt.END);
      paramContext = new SpannableStringBuilder(paramAppBrandPageView + str);
      paramContext.setSpan(new AbsoluteSizeSpan(m, false), 0, paramAppBrandPageView.length(), 18);
      paramContext.setSpan(new ForegroundColorSpan(i), 0, paramAppBrandPageView.length(), 18);
      paramContext.setSpan(paramString, paramAppBrandPageView.length(), paramContext.length(), 18);
      break;
    }
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15552076578816L, 115872);
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(paramString);
    if (localAppBrandSysConfig == null)
    {
      GMTrace.o(15552076578816L, 115872);
      return;
    }
    paramk = "";
    if (com.tencent.mm.plugin.appbrand.a.nL(paramString) != null) {
      paramk = bg.nl(h.f(paramAppBrandPageView.hzM).hzG);
    }
    AppBrandOpReportLogic.a.Xd();
    WxaExposedParams.a locala = new WxaExposedParams.a();
    locala.appId = localAppBrandSysConfig.appId;
    locala.eDj = 3;
    locala.ePf = paramAppBrandPageView.ivj.hZo;
    locala.hKB = localAppBrandSysConfig.hRg.hKB;
    locala.hKC = localAppBrandSysConfig.hRg.hKC;
    AppBrandProfileUI.a(paramContext, localAppBrandSysConfig.eAr, paramk, locala.UI());
    com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramAppBrandPageView.ivj.hZo, 6, "", bg.Pu(), 1, 0);
    GMTrace.o(15552076578816L, 115872);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\menu\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
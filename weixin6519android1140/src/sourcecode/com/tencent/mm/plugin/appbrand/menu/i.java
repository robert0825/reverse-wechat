package com.tencent.mm.plugin.appbrand.menu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.o;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.n;
import java.util.Locale;

final class i
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  i()
  {
    super(l.isq - 1);
    GMTrace.i(15554358280192L, 115889);
    GMTrace.o(15554358280192L, 115889);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, n paramn, String paramString)
  {
    GMTrace.i(17666274230272L, 131624);
    if (b.bPq()) {
      paramn.e(this.isD, paramContext.getString(o.i.hGA));
    }
    GMTrace.o(17666274230272L, 131624);
  }
  
  @SuppressLint({"DefaultLocale"})
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15554626715648L, 115891);
    paramString = paramAppBrandPageView.hzM.hyG;
    paramk = com.tencent.mm.plugin.appbrand.appcache.l.SC();
    if (paramk.hKB == 0) {
      if (!paramk.hKE)
      {
        paramAppBrandPageView = "[ CGI ]";
        paramAppBrandPageView = "" + String.format("公共库版本: %d %s\n", new Object[] { Integer.valueOf(paramk.hKC), paramAppBrandPageView });
        label83:
        if (paramString.hRg.hKB != 0) {
          break label232;
        }
      }
    }
    label232:
    for (paramAppBrandPageView = paramAppBrandPageView + String.format("正式包版本: %d", new Object[] { Integer.valueOf(paramString.hRg.hKC) });; paramAppBrandPageView = paramAppBrandPageView + String.format(new StringBuilder().append(com.tencent.mm.plugin.appbrand.appcache.a.hW(paramString.hRg.hKB)).append(" 更新时间: %s").toString(), new Object[] { bg.eK(paramString.hRg.hKD) }))
    {
      Toast.makeText(paramContext, paramAppBrandPageView, 1).show();
      GMTrace.o(15554626715648L, 115891);
      return;
      Locale localLocale = Locale.US;
      if (o.SF()) {}
      for (paramAppBrandPageView = "| FORCE";; paramAppBrandPageView = "")
      {
        paramAppBrandPageView = String.format(localLocale, "[ LOCAL %s ]", new Object[] { paramAppBrandPageView });
        break;
      }
      paramAppBrandPageView = "" + String.format("测试版公共库更新时间: %s\n", new Object[] { bg.eK(paramk.hKD) });
      break label83;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\menu\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
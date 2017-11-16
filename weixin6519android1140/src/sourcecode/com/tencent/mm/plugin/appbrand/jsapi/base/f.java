package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;

public final class f
{
  public static int a(AppBrandPageView paramAppBrandPageView, View paramView)
  {
    GMTrace.i(10468177477632L, 77994);
    int i = (paramAppBrandPageView.hashCode() + "#" + System.currentTimeMillis() + "#" + paramView.hashCode()).hashCode();
    GMTrace.o(10468177477632L, 77994);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\base\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
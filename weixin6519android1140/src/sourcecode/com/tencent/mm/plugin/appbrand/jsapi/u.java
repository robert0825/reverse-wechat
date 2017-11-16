package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.a.c;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import org.json.JSONObject;

public final class u
  extends a
{
  public static final int CTRL_INDEX = 139;
  public static final String NAME = "disableScrollBounce";
  
  public u()
  {
    GMTrace.i(10336644104192L, 77014);
    GMTrace.o(10336644104192L, 77014);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10336778321920L, 77015);
    if (!paramJSONObject.has("disable"))
    {
      paramAppBrandPageView.v(paramInt, d("ok", null));
      GMTrace.o(10336778321920L, 77015);
      return;
    }
    if (paramJSONObject.optBoolean("disable", false)) {
      paramAppBrandPageView.cs(false);
    }
    for (;;)
    {
      paramAppBrandPageView.v(paramInt, d("ok", null));
      GMTrace.o(10336778321920L, 77015);
      return;
      paramAppBrandPageView.cs(paramAppBrandPageView.hzM.hyH.pd(paramAppBrandPageView.ivj.hZo).hPU);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
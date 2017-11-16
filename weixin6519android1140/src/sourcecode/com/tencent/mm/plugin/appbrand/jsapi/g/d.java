package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 84;
  public static final String NAME = "showDatePickerView";
  
  public d()
  {
    GMTrace.i(10379727994880L, 77335);
    GMTrace.o(10379727994880L, 77335);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10379862212608L, 77336);
    super.a(paramAppBrandPageView, paramJSONObject, paramInt);
    String str = paramJSONObject.optString("mode");
    if ("date".equals(str))
    {
      new a().a(this, paramAppBrandPageView, paramJSONObject, paramInt);
      GMTrace.o(10379862212608L, 77336);
      return;
    }
    if ("time".equals(str))
    {
      new i().a(this, paramAppBrandPageView, paramJSONObject, paramInt);
      GMTrace.o(10379862212608L, 77336);
      return;
    }
    paramAppBrandPageView.v(paramInt, d("fail:invalid data", null));
    GMTrace.o(10379862212608L, 77336);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\g\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
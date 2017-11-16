package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class f
  extends a
{
  private static final int CTRL_INDEX = 96;
  private static final String NAME = "showPickerView";
  
  public f()
  {
    GMTrace.i(10378385817600L, 77325);
    GMTrace.o(10378385817600L, 77325);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10378520035328L, 77326);
    super.a(paramAppBrandPageView, paramJSONObject, paramInt);
    new h().a(this, paramAppBrandPageView, paramJSONObject, paramInt);
    GMTrace.o(10378520035328L, 77326);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\g\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
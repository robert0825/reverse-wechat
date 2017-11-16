package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class am
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "initReady";
  
  public am()
  {
    GMTrace.i(10350602747904L, 77118);
    GMTrace.o(10350602747904L, 77118);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10350736965632L, 77119);
    paramAppBrandPageView.onReady();
    GMTrace.o(10350736965632L, 77119);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
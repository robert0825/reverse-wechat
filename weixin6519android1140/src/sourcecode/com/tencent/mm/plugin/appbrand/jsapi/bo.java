package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import org.json.JSONObject;

final class bo
  extends a
{
  private static final int CTRL_INDEX = 77;
  private static final String NAME = "setKeyboardValue";
  
  bo()
  {
    GMTrace.i(10419590660096L, 77632);
    GMTrace.o(10419590660096L, 77632);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10419724877824L, 77633);
    AppBrandPageView localAppBrandPageView = b(paramj);
    if (localAppBrandPageView == null)
    {
      GMTrace.o(10419724877824L, 77633);
      return;
    }
    try
    {
      str = paramJSONObject.getString("value");
    }
    catch (Exception paramJSONObject)
    {
      String str;
      int i;
      label50:
      paramj.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(10419724877824L, 77633);
      return;
    }
    try
    {
      i = paramJSONObject.getInt("cursor");
      paramJSONObject = Integer.valueOf(i);
    }
    catch (Exception paramJSONObject)
    {
      paramJSONObject = null;
      break label50;
    }
    m.a(localAppBrandPageView, str, paramJSONObject);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(10419724877824L, 77633);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
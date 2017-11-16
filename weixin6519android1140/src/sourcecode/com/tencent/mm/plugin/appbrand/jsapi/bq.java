package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class bq
  extends a
{
  public static final int CTRL_INDEX = 8;
  public static final String NAME = "setNavigationBarTitle";
  
  public bq()
  {
    GMTrace.i(10399323783168L, 77481);
    GMTrace.o(10399323783168L, 77481);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10399458000896L, 77482);
    paramJSONObject = paramJSONObject.optString("title");
    AppBrandPageView localAppBrandPageView = b(paramj);
    if (localAppBrandPageView == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10399458000896L, 77482);
      return;
    }
    localAppBrandPageView.rO(paramJSONObject);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(10399458000896L, 77482);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class bu
  extends a
{
  public static final int CTRL_INDEX = 9;
  public static final String NAME = "showNavigationBarLoading";
  
  public bu()
  {
    GMTrace.i(10357045198848L, 77166);
    GMTrace.o(10357045198848L, 77166);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10357179416576L, 77167);
    paramJSONObject = b(paramj);
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10357179416576L, 77167);
      return;
    }
    paramJSONObject.cr(true);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(10357179416576L, 77167);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
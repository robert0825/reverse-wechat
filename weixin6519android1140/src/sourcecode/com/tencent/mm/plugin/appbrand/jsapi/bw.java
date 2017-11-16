package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.17;
import org.json.JSONObject;

public final class bw
  extends a
{
  public static final int CTRL_INDEX = 12;
  public static final String NAME = "stopPullDownRefresh";
  
  public bw()
  {
    GMTrace.i(10343623426048L, 77066);
    GMTrace.o(10343623426048L, 77066);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10343757643776L, 77067);
    paramJSONObject = b(paramj);
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10343757643776L, 77067);
      return;
    }
    paramJSONObject.runOnUiThread(new AppBrandPageView.17(paramJSONObject));
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(10343757643776L, 77067);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.16;
import org.json.JSONObject;

public final class bv
  extends a
{
  public static final int CTRL_INDEX = 284;
  public static final String NAME = "startPullDownRefresh";
  
  public bv()
  {
    GMTrace.i(17670703415296L, 131657);
    GMTrace.o(17670703415296L, 131657);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17670837633024L, 131658);
    paramJSONObject = b(paramj);
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(17670837633024L, 131658);
      return;
    }
    paramJSONObject.runOnUiThread(new AppBrandPageView.16(paramJSONObject));
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(17670837633024L, 131658);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.m;
import org.json.JSONObject;

public final class by
  extends a
{
  public static final int CTRL_INDEX = 150;
  public static final String NAME = "switchTab";
  
  public by()
  {
    GMTrace.i(10295170826240L, 76705);
    GMTrace.o(10295170826240L, 76705);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10295305043968L, 76706);
    paramJSONObject = paramJSONObject.optString("url");
    if (!paramj.hzM.hyH.hPA.pf(paramJSONObject))
    {
      paramj.v(paramInt, d("fail:can not switch to non-TabBar page", null));
      GMTrace.o(10295305043968L, 76706);
      return;
    }
    paramj.hzM.hyJ.rJ(paramJSONObject);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(10295305043968L, 76706);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
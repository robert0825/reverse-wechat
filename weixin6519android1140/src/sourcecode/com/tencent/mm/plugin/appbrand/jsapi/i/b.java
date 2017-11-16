package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import org.json.JSONObject;

public final class b
  extends a
{
  private static final int CTRL_INDEX = 238;
  private static final String NAME = "setNavigationBarRightButton";
  
  public b()
  {
    GMTrace.i(17380122034176L, 129492);
    GMTrace.o(17380122034176L, 129492);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17380256251904L, 129493);
    boolean bool = paramJSONObject.optBoolean("hide", false);
    String str = paramJSONObject.optString("text", "");
    paramJSONObject = paramJSONObject.optString("iconPath", "");
    int i = com.tencent.mm.plugin.appbrand.page.b.a(b(paramj), str, paramJSONObject, bool);
    paramJSONObject = "fail";
    switch (1.ilm[(i - 1)])
    {
    }
    for (;;)
    {
      paramj.v(paramInt, d(paramJSONObject, null));
      GMTrace.o(17380256251904L, 129493);
      return;
      paramJSONObject = "ok";
      continue;
      paramJSONObject = "fail no page available";
      continue;
      paramJSONObject = "fail iconPath not found";
      continue;
      paramJSONObject = "fail invalid text length";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\i\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
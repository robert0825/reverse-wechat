package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONArray;
import org.json.JSONObject;

final class ca
  extends a
{
  public static final int CTRL_INDEX = 283;
  public static final String NAME = "traceEvent";
  
  ca()
  {
    GMTrace.i(17388309315584L, 129553);
    GMTrace.o(17388309315584L, 129553);
  }
  
  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17388443533312L, 129554);
    paramJSONObject = paramJSONObject.optJSONArray("events");
    if ((!AppBrandPerformanceManager.rZ(paramc.getAppId())) || (paramJSONObject == null))
    {
      paramc.v(paramInt, d("fail", null));
      GMTrace.o(17388443533312L, 129554);
      return;
    }
    int i = 0;
    while (i < paramJSONObject.length())
    {
      Object localObject = paramJSONObject.optJSONObject(i);
      if (localObject != null)
      {
        String str1 = ((JSONObject)localObject).optString("category");
        String str2 = ((JSONObject)localObject).optString("name");
        long l1 = ((JSONObject)localObject).optLong("start");
        long l2 = ((JSONObject)localObject).optLong("end");
        String str3 = ((JSONObject)localObject).optString("phase");
        localObject = ((JSONObject)localObject).optString("args");
        if (!bg.nm(str2)) {
          com.tencent.mm.plugin.appbrand.performance.a.a(paramc.getAppId(), str1, str2, str3, l1, l2, (String)localObject);
        }
      }
      i += 1;
    }
    paramc.v(paramInt, d("ok", null));
    GMTrace.o(17388443533312L, 129554);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
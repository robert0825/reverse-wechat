package com.tencent.mm.plugin.appbrand.jsapi.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 223;
  private static final String NAME = "getBeacons";
  
  public b()
  {
    GMTrace.i(15472351248384L, 115278);
    GMTrace.o(15472351248384L, 115278);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(15472485466112L, 115279);
    w.d("MicroMsg.JsApiGetBeacons", "getBeacons!");
    Object localObject = a.WI();
    JSONArray localJSONArray = new JSONArray();
    paramJSONObject = new HashMap(1);
    if ((localObject == null) || (((Map)localObject).size() <= 0))
    {
      w.e("MicroMsg.JsApiGetBeacons", "not found device");
      paramJSONObject.put("beacons", localJSONArray);
      paramj.v(paramInt, d("ok", paramJSONObject));
      GMTrace.o(15472485466112L, 115279);
      return;
    }
    localObject = ((Map)localObject).entrySet().iterator();
    while (((Iterator)localObject).hasNext()) {
      localJSONArray.put((JSONObject)((Map.Entry)((Iterator)localObject).next()).getValue());
    }
    paramJSONObject.put("beacons", localJSONArray);
    localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("errMsg", getName() + ":ok");
      ((JSONObject)localObject).put("beacons", localJSONArray);
      paramj.v(paramInt, d("ok", paramJSONObject));
      GMTrace.o(15472485466112L, 115279);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.JsApiGetBeacons", localException, "put error", new Object[0]);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
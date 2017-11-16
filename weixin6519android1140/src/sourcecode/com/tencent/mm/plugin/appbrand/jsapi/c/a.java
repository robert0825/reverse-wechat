package com.tencent.mm.plugin.appbrand.jsapi.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
{
  private static Map<String, JSONObject> ieB;
  
  public static Map<String, JSONObject> WI()
  {
    GMTrace.i(15471411724288L, 115271);
    if (ieB == null) {
      ieB = new HashMap();
    }
    Map localMap = ieB;
    GMTrace.o(15471411724288L, 115271);
    return localMap;
  }
  
  public static void WJ()
  {
    GMTrace.i(15471545942016L, 115272);
    if (ieB != null) {
      ieB = null;
    }
    GMTrace.o(15471545942016L, 115272);
  }
  
  public static String i(j paramj)
  {
    GMTrace.i(15471680159744L, 115273);
    paramj = "JsApi#BeaconSessionId" + paramj.hashCode();
    GMTrace.o(15471680159744L, 115273);
    return paramj;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
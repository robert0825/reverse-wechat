package com.tencent.mm.plugin.appbrand.dynamic.g;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.collector.CollectSession;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  private static Set<String> hUU;
  
  static
  {
    GMTrace.i(19910528860160L, 148345);
    hUU = new HashSet();
    if (!TextUtils.isEmpty("drawCanvas")) {
      hUU.add("drawCanvas");
    }
    GMTrace.o(19910528860160L, 148345);
  }
  
  public static void a(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    GMTrace.i(19910260424704L, 148343);
    try
    {
      paramJSONObject.put("__session_id", paramString1);
      paramJSONObject.put("__invoke_jsapi_timestamp", System.nanoTime());
      paramString1 = c.oP(paramString1);
      if (paramString1 != null) {
        paramString1.eJV.putInt("__invoke_jsapi_data_size", paramString2.length());
      }
      GMTrace.o(19910260424704L, 148343);
      return;
    }
    catch (JSONException paramString1)
    {
      w.e("MicroMsg.JsApiCostTimeStrategy", "%s", new Object[] { Log.getStackTraceString(paramString1) });
      GMTrace.o(19910260424704L, 148343);
    }
  }
  
  public static String g(JSONObject paramJSONObject)
  {
    GMTrace.i(19910394642432L, 148344);
    paramJSONObject = paramJSONObject.optString("__session_id");
    GMTrace.o(19910394642432L, 148344);
    return paramJSONObject;
  }
  
  public static boolean oV(String paramString)
  {
    GMTrace.i(19910126206976L, 148342);
    boolean bool = hUU.contains(paramString);
    GMTrace.o(19910126206976L, 148342);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\g\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
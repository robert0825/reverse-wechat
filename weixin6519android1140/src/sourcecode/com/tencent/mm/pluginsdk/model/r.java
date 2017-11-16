package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.x5.sdk.d;
import java.util.HashMap;
import org.json.JSONObject;

public final class r
{
  public static int a(Context paramContext, String paramString1, String paramString2, String paramString3, ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(726788997120L, 5415);
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("local", "true");
    localHashMap.put("style", "1");
    String str = "";
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("path", paramString1);
      localJSONObject.put("ext", paramString2);
      localJSONObject.put("token", paramString3);
      paramString1 = localJSONObject.toString();
      int i = d.startMiniQBToLoadUrl(paramContext, paramString1, localHashMap, paramValueCallback);
      GMTrace.o(726788997120L, 5415);
      return i;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.QbReaderLogic", paramString1, "openReadFile", new Object[0]);
        paramString1 = str;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\pluginsdk\model\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
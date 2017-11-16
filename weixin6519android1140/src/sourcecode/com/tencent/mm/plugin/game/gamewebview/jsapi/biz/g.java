package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g
  extends a
{
  public static final int CTRL_BYTE = 84;
  public static final String NAME = "checkJsApi";
  
  public g()
  {
    GMTrace.i(17050214858752L, 127034);
    GMTrace.o(17050214858752L, 127034);
  }
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17050349076480L, 127035);
    w.i("MicroMsg.GameJsApiCheckJsApi", "invoke");
    JSONArray localJSONArray = paramJSONObject.optJSONArray("jsApiList");
    if (localJSONArray == null)
    {
      paramd.v(paramInt, a.d("checkJsApi:param is empty", null));
      GMTrace.o(17050349076480L, 127035);
      return;
    }
    paramJSONObject = new JSONObject();
    int i = 0;
    try
    {
      if (i < localJSONArray.length())
      {
        String str = localJSONArray.optString(i);
        if (com.tencent.mm.plugin.game.gamewebview.jsapi.d.aDS().containsKey(str)) {}
        for (boolean bool = true;; bool = false)
        {
          paramJSONObject.put(str, bool);
          i += 1;
          break;
        }
      }
      HashMap localHashMap;
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.GameJsApiCheckJsApi", localException, "", new Object[0]);
      localHashMap = new HashMap();
      localHashMap.put("checkResult", paramJSONObject.toString());
      paramd.v(paramInt, d("checkJsApi:ok", localHashMap));
      GMTrace.o(17050349076480L, 127035);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
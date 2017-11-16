package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ap
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = -2;
  public static final String NAME = "requestData";
  
  public ap()
  {
    GMTrace.i(19310038745088L, 143871);
    GMTrace.o(19310038745088L, 143871);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19310172962816L, 143872);
    w.i("MicroMsg.GameJsApiRequestData", "invoke");
    if (!Uri.parse(paramd.aEr()).getHost().equals("game.weixin.qq.com"))
    {
      w.i("MicroMsg.GameJsApiRequestData", "host is not game");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("requestData:fail", null));
      GMTrace.o(19310172962816L, 143872);
      return;
    }
    Object localObject = paramJSONObject.optString("url");
    String str = paramJSONObject.optString("method");
    paramJSONObject = paramJSONObject.optJSONObject("data");
    w.i("MicroMsg.GameJsApiRequestData", "reqUrl = %s, method = %s", new Object[] { localObject, str });
    if ((bg.nm((String)localObject)) || (bg.nm(str)))
    {
      w.i("MicroMsg.GameJsApiRequestData", "reqUrl or method is null");
      GMTrace.o(19310172962816L, 143872);
      return;
    }
    paramJSONObject = com.tencent.mm.plugin.game.gamewebview.c.a.b((String)localObject, str, paramJSONObject);
    if (paramJSONObject == null)
    {
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("requestData:fail", null));
      GMTrace.o(19310172962816L, 143872);
      return;
    }
    try
    {
      paramJSONObject = new JSONObject(paramJSONObject);
      localObject = new HashMap();
      ((Map)localObject).put("respData", paramJSONObject);
      paramd.v(paramInt, d("requestData:ok", (Map)localObject));
      GMTrace.o(19310172962816L, 143872);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      w.e("MicroMsg.GameJsApiRequestData", paramJSONObject.getMessage());
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("requestData:fail_parse_json_fail", null));
      GMTrace.o(19310172962816L, 143872);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
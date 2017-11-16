package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.webview.c.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l
  extends a
{
  public static final int CTRL_BYTE = 300;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "clearGameData";
  
  public l()
  {
    GMTrace.i(19310575616000L, 143875);
    GMTrace.o(19310575616000L, 143875);
  }
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    GMTrace.i(19310709833728L, 143876);
    w.i("MicroMsg.GameJsApiSetGameData", "invoke");
    paramContext = d.qe(paramString);
    if (paramContext == null)
    {
      w.e("MicroMsg.GameJsApiSetGameData", "data is null");
      parama.qp(a.d("clearGameData:fail_null_data", null));
      GMTrace.o(19310709833728L, 143876);
      return;
    }
    paramString = paramContext.optString("current_appid");
    if (bg.nm(paramString))
    {
      w.i("MicroMsg.GameJsApiSetGameData", "appId is null");
      parama.qp(a.d("clearGameData:fail_appid_null", null));
      GMTrace.o(19310709833728L, 143876);
      return;
    }
    JSONArray localJSONArray = paramContext.optJSONArray("keys");
    boolean bool = paramContext.optBoolean("clearAllData", false);
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      b.bFZ().b(paramString, localJSONArray);
      parama.qp(a.d("clearGameData:ok", null));
      GMTrace.o(19310709833728L, 143876);
      return;
    }
    if (bool)
    {
      b.bFZ().MF(paramString);
      parama.qp(a.d("clearGameData:ok", null));
      GMTrace.o(19310709833728L, 143876);
      return;
    }
    w.i("MicroMsg.GameJsApiSetGameData", "keys is null");
    parama.qp(a.d("clearGameData:fail", null));
    GMTrace.o(19310709833728L, 143876);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
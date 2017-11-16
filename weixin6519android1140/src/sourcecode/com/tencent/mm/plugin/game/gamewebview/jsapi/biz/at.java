package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.webview.c.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class at
  extends a
{
  public static final int CTRL_BYTE = 298;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "setGameData";
  
  public at()
  {
    GMTrace.i(19310307180544L, 143873);
    GMTrace.o(19310307180544L, 143873);
  }
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    GMTrace.i(19310441398272L, 143874);
    w.i("MicroMsg.GameJsApiSetGameData", "invoke");
    paramContext = d.qe(paramString);
    if (paramContext == null)
    {
      w.e("MicroMsg.GameJsApiSetGameData", "data is null");
      parama.qp(a.d("setGameData:fail_null_data", null));
      GMTrace.o(19310441398272L, 143874);
      return;
    }
    paramString = paramContext.optString("current_appid");
    if (bg.nm(paramString))
    {
      w.i("MicroMsg.GameJsApiSetGameData", "appId is null");
      parama.qp(a.d("setGameData:fail_appid_null", null));
      GMTrace.o(19310441398272L, 143874);
      return;
    }
    String str1 = paramContext.optString("key");
    String str2 = paramContext.optString("value");
    String str3 = paramContext.optString("weight", "1");
    String str4 = paramContext.optString("expireTime");
    boolean bool = paramContext.optBoolean("autoClean", true);
    if ((bg.nm(str1)) || (bg.nm(str2)))
    {
      w.i("MicroMsg.GameJsApiSetGameData", "key or value is null");
      parama.qp(a.d("setGameData:fail_null_key", null));
      GMTrace.o(19310441398272L, 143874);
      return;
    }
    if (b.bFZ().a(paramString, str1, str2, str3, str4, bool))
    {
      parama.qp(a.d("setGameData:ok", null));
      GMTrace.o(19310441398272L, 143874);
      return;
    }
    parama.qp(a.d("setGameData:fail_exceed_size", null));
    GMTrace.o(19310441398272L, 143874);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
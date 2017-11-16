package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.webview.c.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 299;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "getGameData";
  
  public p()
  {
    GMTrace.i(19309770309632L, 143869);
    GMTrace.o(19309770309632L, 143869);
  }
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    GMTrace.i(19309904527360L, 143870);
    w.i("MicroMsg.GameJsApiSetGameData", "invoke");
    paramString = d.qe(paramString);
    if (paramString == null)
    {
      w.e("MicroMsg.GameJsApiSetGameData", "data is null");
      parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("getGameData:fail_null_data", null));
      GMTrace.o(19309904527360L, 143870);
      return;
    }
    paramContext = paramString.optString("current_appid");
    if (bg.nm(paramContext))
    {
      w.i("MicroMsg.GameJsApiSetGameData", "appId is null");
      parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("getGameData:fail_appid_null", null));
      GMTrace.o(19309904527360L, 143870);
      return;
    }
    paramString = paramString.optString("key");
    if (bg.nm(paramString))
    {
      w.i("MicroMsg.GameJsApiSetGameData", "key is null");
      parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("getGameData:fail_null_key", null));
      GMTrace.o(19309904527360L, 143870);
      return;
    }
    paramContext = b.bFZ().er(paramContext, paramString);
    if (!bg.nm(paramContext.field_value))
    {
      paramString = new HashMap();
      paramString.put("value", paramContext.field_value);
      paramString.put("weight", paramContext.field_weight);
      paramString.put("expireTime", Long.valueOf(paramContext.field_expireTime - System.currentTimeMillis() / 1000L));
      parama.qp(d("getGameData:ok", paramString));
      GMTrace.o(19309904527360L, 143870);
      return;
    }
    parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("getGameData:ok", null));
    GMTrace.o(19309904527360L, 143870);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
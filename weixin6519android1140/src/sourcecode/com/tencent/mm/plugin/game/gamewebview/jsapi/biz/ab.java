package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.b;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ab
  extends a
{
  public static final int CTRL_BYTE = 256;
  public static final String NAME = "openCustomWebview";
  
  public ab()
  {
    GMTrace.i(17061220712448L, 127116);
    GMTrace.o(17061220712448L, 127116);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17061354930176L, 127117);
    GameWebViewUI localGameWebViewUI = paramd.aEo();
    if (localGameWebViewUI == null)
    {
      w.i("MicroMsg.GameJsApiOpenCustomWebView", "activity is null");
      GMTrace.o(17061354930176L, 127117);
      return;
    }
    String str1 = paramJSONObject.optString("url");
    if (bg.nm(str1))
    {
      paramd.v(paramInt, a.d("openCunstonWebview:fail_invalid_url", null));
      GMTrace.o(17061354930176L, 127117);
      return;
    }
    bg.nl(paramd.lID).startsWith("http://game.weixin.qq.com/cgi-bin/h5/static/gameloading/index.html?appid=");
    String str2 = paramJSONObject.optString("orientation");
    int j = -1;
    int i = j;
    if (!bg.nm(str2))
    {
      if (!str2.equals("horizontal")) {
        break label351;
      }
      i = 0;
    }
    for (;;)
    {
      boolean bool1 = paramJSONObject.optBoolean("fullscreen");
      str2 = paramJSONObject.optString("top_title");
      String str3 = paramJSONObject.optString("top_url");
      boolean bool2 = paramJSONObject.optString("finish_recent_webview").equals("1");
      boolean bool3 = paramJSONObject.optString("disable_swipe_back").equals("1");
      String str4 = paramJSONObject.optString("username");
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", str1);
      localIntent.putExtra("screen_orientation", i);
      localIntent.putExtra("show_full_screen", bool1);
      localIntent.putExtra("disable_swipe_back", bool3);
      localIntent.putExtra("shortcut_user_name", str4);
      localIntent.putExtra("finish_recent_page", bool2);
      if ((!bg.nm(str3)) && (!bg.nm(str2)))
      {
        localIntent.putExtra("custom_keep_top_url", str3);
        localIntent.putExtra("custom_keep_top_title", str2);
      }
      if ((bool2) && (paramd.lJl.aEe())) {
        localIntent.putExtra("is_from_keep_top", true);
      }
      localIntent.putExtra("game_hv_menu_appid", bg.nl(paramJSONObject.optString("gameAppid")));
      localGameWebViewUI.J(localIntent);
      paramd.v(paramInt, a.d("openCunstonWebview:ok", null));
      GMTrace.o(17061354930176L, 127117);
      return;
      label351:
      i = j;
      if (str2.equals("vertical")) {
        i = 1;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
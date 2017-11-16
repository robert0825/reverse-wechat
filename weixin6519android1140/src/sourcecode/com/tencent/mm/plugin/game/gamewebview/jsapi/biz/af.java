package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class af
  extends a
{
  public static final int CTRL_BYTE = 173;
  public static final String NAME = "openUrlWithExtraWebview";
  
  public af()
  {
    GMTrace.i(17054241390592L, 127064);
    GMTrace.o(17054241390592L, 127064);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17054375608320L, 127065);
    GameWebViewUI localGameWebViewUI = paramd.aEo();
    if (localGameWebViewUI == null)
    {
      w.i("MicroMsg.GameJsApiOpenUrlWithExtraWebView", "activity is null");
      GMTrace.o(17054375608320L, 127065);
      return;
    }
    paramJSONObject = paramJSONObject.optString("url");
    if (bg.nm(paramJSONObject))
    {
      paramd.v(paramInt, a.d("openUrlWithExtraWebview:fail_invalid_url", null));
      GMTrace.o(17054375608320L, 127065);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramJSONObject);
    w.d("MicroMsg.GameJsApiOpenUrlWithExtraWebView", "openUrlWithExtraWebview: " + System.currentTimeMillis());
    localGameWebViewUI.J(localIntent);
    paramd.v(paramInt, a.d("openUrlWithExtraWebview:ok", null));
    GMTrace.o(17054375608320L, 127065);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
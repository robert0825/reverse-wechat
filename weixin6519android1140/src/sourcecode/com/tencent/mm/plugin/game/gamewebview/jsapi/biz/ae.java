package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import android.graphics.Color;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ae
  extends a
{
  public static final int CTRL_BYTE = -2;
  public static final String NAME = "openGameUrlWithExtraWebView";
  
  public ae()
  {
    GMTrace.i(19308830785536L, 143862);
    GMTrace.o(19308830785536L, 143862);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19308965003264L, 143863);
    w.i("MicroMsg.GameJsApiOpenGameUrlWithExtraWebView", "invoke");
    String str = paramJSONObject.optString("url");
    if (bg.nm(str))
    {
      w.e("MicroMsg.GameJsApiOpenGameUrlWithExtraWebView", "url is null");
      paramd.v(paramInt, a.d("openGameUrlWithExtraWebView:fail", null));
      GMTrace.o(19308965003264L, 143863);
      return;
    }
    Object localObject = paramJSONObject.optString("statusBarColor");
    int i = 0;
    if (!bg.nm((String)localObject)) {}
    try
    {
      i = Color.parseColor((String)localObject);
      paramJSONObject = paramJSONObject.optString("statusBarStyle");
      localObject = new Intent();
      ((Intent)localObject).putExtra("rawUrl", str);
      ((Intent)localObject).putExtra("customize_status_bar_color", i);
      ((Intent)localObject).putExtra("status_bar_style", paramJSONObject);
      paramd.aEo().J((Intent)localObject);
      paramd.v(paramInt, "openGameUrlWithExtraWebView:ok");
      GMTrace.o(19308965003264L, 143863);
      return;
    }
    catch (IllegalArgumentException paramJSONObject)
    {
      w.e("MicroMsg.GameJsApiOpenGameUrlWithExtraWebView", paramJSONObject.getMessage());
      paramd.v(paramInt, a.d("openGameUrlWithExtraWebView:fail_invalid_color", null));
      GMTrace.o(19308965003264L, 143863);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
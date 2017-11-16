package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.qi.a;
import com.tencent.mm.g.a.qi.b;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ag
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 250;
  public static final int DO_IN_ENV = 2;
  public static final String NAME = "openWeApp";
  
  public ag()
  {
    GMTrace.i(17069676429312L, 127179);
    GMTrace.o(17069676429312L, 127179);
  }
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    GMTrace.i(17069810647040L, 127180);
    w.i("MicroMsg.GameJsApiOpenWeApp", "invoke");
    paramString = d.qe(paramString);
    if (paramString == null)
    {
      w.e("MicroMsg.GameJsApiOpenWeApp", "data is null");
      parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("openWeApp:fail_null_data", null));
      GMTrace.o(17069810647040L, 127180);
      return;
    }
    qi localqi = new qi();
    localqi.eUY.context = paramContext;
    localqi.eUY.userName = paramString.optString("userName");
    localqi.eUY.appId = paramString.optString("appId");
    localqi.eUY.eVa = paramString.optString("relativeURL");
    localqi.eUY.eVc = paramString.optInt("appVersion", 0);
    localqi.eUY.scene = paramString.optInt("scene", 1018);
    localqi.eUY.eAv = paramString.optString("sceneNote");
    if (bg.nm(localqi.eUY.eAv)) {
      localqi.eUY.eAv = p.encode(bg.nl(paramString.optString("current_url")));
    }
    localqi.eUY.eIP = paramString.optString("downloadURL");
    localqi.eUY.eVb = paramString.optInt("openType", 0);
    localqi.eUY.eVd = paramString.optString("checkSumMd5");
    localqi.eUY.eVf = false;
    com.tencent.mm.sdk.b.a.vgX.m(localqi);
    if (localqi.eUZ.eVk)
    {
      parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("openWeApp:ok", null));
      GMTrace.o(17069810647040L, 127180);
      return;
    }
    parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("openWeApp:fail:" + bg.nl(localqi.eUZ.eVl), null));
    GMTrace.o(17069810647040L, 127180);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
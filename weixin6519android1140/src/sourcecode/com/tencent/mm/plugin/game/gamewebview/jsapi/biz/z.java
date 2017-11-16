package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.k.c;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class z
  extends a
{
  public static final int CTRL_BYTE = 277;
  public static final int DO_IN_ENV = 2;
  public static final String NAME = "launchMiniProgram";
  
  public z()
  {
    GMTrace.i(17035987779584L, 126928);
    GMTrace.o(17035987779584L, 126928);
  }
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    GMTrace.i(17036121997312L, 126929);
    w.i("MicroMsg.GameJsApiLaunchMiniProgram", "invoke");
    JSONObject localJSONObject = d.qe(paramString);
    if (localJSONObject == null)
    {
      w.e("MicroMsg.GameJsApiLaunchMiniProgram", "data is null");
      parama.qp(a.d(a.d("launchMiniProgram:fail_null_data", null), null));
      GMTrace.o(17036121997312L, 126929);
      return;
    }
    String str2 = localJSONObject.optString("targetAppId");
    String str3 = localJSONObject.optString("current_url");
    String str1 = localJSONObject.optString("current_appid");
    paramString = str1;
    if (bg.nm(str1)) {
      paramString = localJSONObject.optString("referrerAppId");
    }
    if (bg.nm(str2))
    {
      parama.qp(a.d("launchMiniProgram:fail_invalid_targetAppId", null));
      GMTrace.o(17036121997312L, 126929);
      return;
    }
    if (bg.nm(paramString))
    {
      parama.qp(a.d("launchMiniProgram:fail_invalid_referrerAppId", null));
      GMTrace.o(17036121997312L, 126929);
      return;
    }
    str1 = bg.nl(localJSONObject.optString("envVersion"));
    int i = -1;
    switch (str1.hashCode())
    {
    default: 
      switch (i)
      {
      default: 
        i = 0;
      }
      break;
    }
    for (;;)
    {
      str1 = localJSONObject.optString("path");
      ((c)h.h(c.class)).a(paramContext, str3, paramString, str2, i, str1);
      parama.qp(a.d("launchMiniProgram:ok", null));
      GMTrace.o(17036121997312L, 126929);
      return;
      if (!str1.equals("develop")) {
        break;
      }
      i = 0;
      break;
      if (!str1.equals("trial")) {
        break;
      }
      i = 1;
      break;
      i = 1;
      continue;
      i = 2;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
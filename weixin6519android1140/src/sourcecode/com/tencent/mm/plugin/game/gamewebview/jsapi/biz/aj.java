package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class aj
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = -2;
  public static final String NAME = "preRequestData";
  
  public aj()
  {
    GMTrace.i(19309501874176L, 143867);
    GMTrace.o(19309501874176L, 143867);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19309636091904L, 143868);
    w.i("MicroMsg.GameJsApiPreRequestData", "invoke");
    if (!Uri.parse(paramd.aEr()).getHost().equals("game.weixin.qq.com"))
    {
      w.i("MicroMsg.GameJsApiPreRequestData", "host is not game");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("preRequestData:fail", null));
      GMTrace.o(19309636091904L, 143868);
      return;
    }
    String str1 = paramJSONObject.optString("url");
    String str2 = paramJSONObject.optString("method");
    paramJSONObject = paramJSONObject.optJSONObject("data");
    w.i("MicroMsg.GameJsApiPreRequestData", "reqUrl = %s, method = %s", new Object[] { str1, str2 });
    if ((bg.nm(str1)) || (bg.nm(str2)))
    {
      w.i("MicroMsg.GameJsApiPreRequestData", "reqUrl or method is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("preRequestData:fail", null));
      GMTrace.o(19309636091904L, 143868);
      return;
    }
    com.tencent.mm.plugin.game.gamewebview.c.a.c(str1, str2, paramJSONObject);
    paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("preRequestData:ok", null));
    GMTrace.o(19309636091904L, 143868);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
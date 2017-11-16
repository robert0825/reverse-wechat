package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d.23;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class av
  extends a
{
  public static final int CTRL_BYTE = 113;
  public static final String NAME = "setPageTitle";
  
  public av()
  {
    GMTrace.i(17063368196096L, 127132);
    GMTrace.o(17063368196096L, 127132);
  }
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17063502413824L, 127133);
    w.i("MicroMsg.GameJsApiSetPageTitle", "invoke");
    if (paramJSONObject == null)
    {
      w.i("MicroMsg.GameJsApiSetPageTitle", "data is null");
      paramd.v(paramInt, "setPageTitle:fail");
      GMTrace.o(17063502413824L, 127133);
      return;
    }
    GameWebViewUI localGameWebViewUI = paramd.aEo();
    String str = paramJSONObject.optString("title");
    int i = com.tencent.mm.plugin.webview.ui.tools.d.at(paramJSONObject.optString("color"), localGameWebViewUI.getResources().getColor(R.e.aMC));
    paramd.mHandler.post(new d.23(paramd, str, i));
    paramd.v(paramInt, a.d("setPageTitle:ok", null));
    GMTrace.o(17063502413824L, 127133);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
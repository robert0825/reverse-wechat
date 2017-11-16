package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class m
  extends a
{
  public static final int CTRL_BYTE = 17;
  public static final String NAME = "closeWindow";
  
  public m()
  {
    GMTrace.i(17054778261504L, 127068);
    GMTrace.o(17054778261504L, 127068);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17054912479232L, 127069);
    w.i("MicroMsg.GameJsApiCloseWindow", "invoke");
    if ((paramd == null) || (paramd.aEo() == null))
    {
      w.e("MicroMsg.GameJsApiCloseWindow", "page or activity is null");
      GMTrace.o(17054912479232L, 127069);
      return;
    }
    paramd.eV(false);
    paramd.v(paramInt, a.d("close_window:ok", null));
    GMTrace.o(17054912479232L, 127069);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
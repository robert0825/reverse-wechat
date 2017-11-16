package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.e;
import com.tencent.mm.plugin.game.gamewebview.ui.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import org.json.JSONObject;

public final class bb
  extends a
{
  public static final int CTRL_BYTE = 14;
  public static final String NAME = "showOptionMenu";
  
  public bb()
  {
    GMTrace.i(17043906625536L, 126987);
    GMTrace.o(17043906625536L, 126987);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17044040843264L, 126988);
    w.i("MicroMsg.GameJsApiShowOptionMenu", "invoke");
    paramJSONObject = paramd.lJm;
    if (paramJSONObject == null)
    {
      w.i("MicroMsg.GameJsApiShowOptionMenu", "actionBar is null");
      GMTrace.o(17044040843264L, 126988);
      return;
    }
    if (paramJSONObject.lKw != null) {
      paramJSONObject.lKw.lKK.clear();
    }
    paramd.v(paramInt, a.d("showOptionMenu:ok", null));
    GMTrace.o(17044040843264L, 126988);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.d.20;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class az
  extends a
{
  public static final int CTRL_BYTE = 187;
  public static final String NAME = "showKeyboard";
  
  public az()
  {
    GMTrace.i(17038403698688L, 126946);
    GMTrace.o(17038403698688L, 126946);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17038537916416L, 126947);
    w.i("MicroMsg.GameJsApiShowKeyBoard", "invoke");
    String str = paramJSONObject.optString("placeholder");
    int i = paramJSONObject.optInt("maxLength");
    paramd.lJK = paramInt;
    if (paramd.lJs != null) {
      paramd.mHandler.post(new d.20(paramd, str, i));
    }
    GMTrace.o(17038537916416L, 126947);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
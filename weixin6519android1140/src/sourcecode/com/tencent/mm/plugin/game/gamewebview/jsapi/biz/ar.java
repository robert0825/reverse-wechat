package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.d.26;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ar
  extends a
{
  public static final int CTRL_BYTE = 218;
  public static final String NAME = "setBounceBackground";
  
  public ar()
  {
    GMTrace.i(17051825471488L, 127046);
    GMTrace.o(17051825471488L, 127046);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17051959689216L, 127047);
    w.i("MicroMsg.GameJsApiSetBounceBackground", "invoke");
    if ((paramJSONObject == null) || (bg.nm(paramJSONObject.optString("backgroundColor"))))
    {
      paramd.v(paramInt, a.d("setBounceBackground:fail_invalid_data", null));
      GMTrace.o(17051959689216L, 127047);
      return;
    }
    paramd.runOnUiThread(new d.26(paramd, paramJSONObject.optString("backgroundColor")));
    paramd.v(paramInt, a.d("setBounceBackground:ok", null));
    GMTrace.o(17051959689216L, 127047);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
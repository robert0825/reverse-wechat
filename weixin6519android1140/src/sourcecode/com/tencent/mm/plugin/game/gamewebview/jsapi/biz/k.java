package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.d.25;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class k
  extends a
{
  public static final int CTRL_BYTE = 189;
  public static final String NAME = "clearBounceBackground";
  
  public k()
  {
    GMTrace.i(17066992074752L, 127159);
    GMTrace.o(17066992074752L, 127159);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17067126292480L, 127160);
    w.i("MicroMsg.GameJsApiClearBounceBackground", "invoke");
    if (paramd.lJr != null) {
      paramd.mHandler.post(new d.25(paramd));
    }
    paramd.v(paramInt, a.d("clearBounceBackground:ok", null));
    GMTrace.o(17067126292480L, 127160);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
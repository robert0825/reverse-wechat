package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import org.json.JSONObject;

public final class t
  extends a
{
  public static final int CTRL_BYTE = -3;
  public static final String NAME = "getWePkgAuthResult";
  
  public t()
  {
    GMTrace.i(17059610099712L, 127104);
    GMTrace.o(17059610099712L, 127104);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17059744317440L, 127105);
    w.i("MicroMsg.GameJsApiGetWePkgAuthResult", "invoke");
    if (paramd.lJL)
    {
      w.i("MicroMsg.GameJsApiGetWePkgAuthResult", "gettingA8Key");
      paramd.v(paramInt, a.d("getWePkgAuthResult:fail_auth_result_not_return", null));
      GMTrace.o(17059744317440L, 127105);
      return;
    }
    paramJSONObject = paramd.lJI;
    if (bg.nm(paramJSONObject))
    {
      paramd.v(paramInt, a.d("getWePkgAuthResult:fail_full_url_empty", null));
      GMTrace.o(17059744317440L, 127105);
      return;
    }
    HashMap localHashMap = new HashMap();
    if (paramd.lJR) {
      localHashMap.put("set_cookie", Integer.valueOf(1));
    }
    for (;;)
    {
      localHashMap.put("full_url", paramJSONObject);
      paramd.v(paramInt, d("getWePkgAuthResult:ok", localHashMap));
      GMTrace.o(17059744317440L, 127105);
      return;
      localHashMap.put("set_cookie", Integer.valueOf(0));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
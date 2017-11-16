package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class an
  extends a
{
  public static final int CTRL_BYTE = 251;
  public static final String NAME = "recordVideo";
  
  public an()
  {
    GMTrace.i(17038672134144L, 126948);
    GMTrace.o(17038672134144L, 126948);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17038806351872L, 126949);
    w.i("MicroMsg.GameJsApiRecordVideo", "invoke");
    if (paramJSONObject == null)
    {
      paramd.v(paramInt, a.d("chooseVideo:fail_invalid_data", null));
      GMTrace.o(17038806351872L, 126949);
      return;
    }
    j.a(paramd, paramJSONObject, paramInt, 1);
    GMTrace.o(17038806351872L, 126949);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
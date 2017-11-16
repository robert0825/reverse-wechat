package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.e;
import com.tencent.mm.plugin.game.gamewebview.ui.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

public final class v
  extends a
{
  public static final int CTRL_BYTE = 14;
  public static final String NAME = "hideOptionMenu";
  
  public v()
  {
    GMTrace.i(17068468469760L, 127170);
    GMTrace.o(17068468469760L, 127170);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17068602687488L, 127171);
    w.i("MicroMsg.GameJsApiHideOptionMenu", "invoke");
    paramJSONObject = paramd.lJm;
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.GameJsApiHideOptionMenu", "actionBar is null");
      GMTrace.o(17068602687488L, 127171);
      return;
    }
    if (paramJSONObject.lKw != null)
    {
      paramJSONObject = paramJSONObject.lKw;
      paramJSONObject.lKK.clear();
      paramJSONObject.lKK.addAll(paramJSONObject.lKL.values());
      paramJSONObject.lKK.removeAll(paramJSONObject.lKM);
    }
    paramd.v(paramInt, a.d("hideOptionMenu:ok", null));
    GMTrace.o(17068602687488L, 127171);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
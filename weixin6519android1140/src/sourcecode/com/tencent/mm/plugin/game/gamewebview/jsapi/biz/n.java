package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.d.24;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n
  extends a
{
  public static final int CTRL_BYTE = 188;
  public static final String NAME = "disableBounceScroll";
  
  public n()
  {
    GMTrace.i(17049812205568L, 127031);
    GMTrace.o(17049812205568L, 127031);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    GMTrace.i(17049946423296L, 127032);
    w.i("MicroMsg.GameJsApiDisableBounceScroll", "invoke");
    paramJSONObject = paramJSONObject.optJSONArray("place");
    if (paramJSONObject == null)
    {
      w.i("MicroMsg.GameJsApiDisableBounceScroll", "placeArray is null");
      paramd.v(paramInt, a.d("disableBounceScroll:fail", null));
      GMTrace.o(17049946423296L, 127032);
      return;
    }
    int j = 0;
    while (i < paramJSONObject.length())
    {
      if ("top".equalsIgnoreCase(paramJSONObject.optString(i))) {
        j = 1;
      }
      i += 1;
    }
    if (j == 0)
    {
      paramd.v(paramInt, a.d("disableBounceScroll:ok", null));
      GMTrace.o(17049946423296L, 127032);
      return;
    }
    paramd.mHandler.post(new d.24(paramd));
    paramd.v(paramInt, a.d("disableBounceScroll:ok", null));
    GMTrace.o(17049946423296L, 127032);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
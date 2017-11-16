package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.b;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class aw
  extends a
{
  public static final int CTRL_BYTE = 270;
  public static final String NAME = "setScreenOrientation";
  
  public aw()
  {
    GMTrace.i(17033169207296L, 126907);
    GMTrace.o(17033169207296L, 126907);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    int j = 1;
    GMTrace.i(17033303425024L, 126908);
    w.i("MicroMsg.GameJsApiSetScreenOrientation", "invoke");
    if (paramJSONObject != null)
    {
      paramJSONObject = paramJSONObject.optString("orientation");
      if (!bg.nm(paramJSONObject)) {}
    }
    else
    {
      w.e("MicroMsg.GameJsApiSetScreenOrientation", "data is null");
      paramd.v(paramInt, a.d("setScreenOrientation:fail_invalid_data", null));
      GMTrace.o(17033303425024L, 126908);
      return;
    }
    int i;
    if (paramJSONObject.equals("horizontal")) {
      i = 0;
    }
    for (;;)
    {
      paramJSONObject = paramd.lJl;
      paramJSONObject.ui.putInt("screen_orientation", i);
      if ((paramJSONObject.mContext instanceof GameWebViewUI)) {
        ((GameWebViewUI)paramJSONObject.mContext).oG(i);
      }
      paramd.v(paramInt, a.d("setScreenOrientation:ok", null));
      GMTrace.o(17033303425024L, 126908);
      return;
      i = j;
      if (!paramJSONObject.equals("vertical")) {
        if (paramJSONObject.equals("sensor"))
        {
          i = 4;
        }
        else if (paramJSONObject.equals("horizontal_unforced"))
        {
          i = 0;
        }
        else
        {
          i = j;
          if (!paramJSONObject.equals("vertical_unforced")) {
            i = -1;
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
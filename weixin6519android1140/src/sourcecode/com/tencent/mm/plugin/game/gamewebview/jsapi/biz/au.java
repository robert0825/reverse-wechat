package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.graphics.Color;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class au
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 182;
  public static final String NAME = "setNavigationBarColor";
  
  public au()
  {
    GMTrace.i(17046054109184L, 127003);
    GMTrace.o(17046054109184L, 127003);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17046188326912L, 127004);
    w.i("MicroMsg.GameJsApiSetNavigationBarColor", "invoke");
    int i;
    if (paramJSONObject.optInt("actionCode") == 1) {
      i = 1;
    }
    for (;;)
    {
      int j = -1;
      try
      {
        k = Color.parseColor(paramJSONObject.optString("color"));
        k |= 0xFF000000;
        j = i;
        i = k;
      }
      catch (Exception localException)
      {
        try
        {
          for (;;)
          {
            bg.getFloat(paramJSONObject.optString("alpha"), 1.0F);
            if (j == 0) {
              break label162;
            }
            paramd.ivp = android.support.v4.content.a.c(paramd.lJb, R.e.aMB);
            paramd.ivr = "";
            paramd.aEu();
            paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("setNavigationBarColor:ok", null));
            GMTrace.o(17046188326912L, 127004);
            return;
            i = 0;
            break;
            localException = localException;
            w.e("MicroMsg.GameJsApiSetNavigationBarColor", localException.getMessage());
            int k = 1;
            i = j;
            j = k;
          }
        }
        catch (Exception paramJSONObject)
        {
          for (;;)
          {
            w.e("MicroMsg.GameJsApiSetNavigationBarColor", paramJSONObject.getMessage());
            continue;
            label162:
            paramd.lKf = true;
            paramd.ivp = i;
            paramd.aEu();
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
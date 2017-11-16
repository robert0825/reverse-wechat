package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.e;
import com.tencent.mm.plugin.game.gamewebview.ui.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ba
  extends a
{
  public static final int CTRL_BYTE = 86;
  public static final String NAME = "showMenuItems";
  
  public ba()
  {
    GMTrace.i(17065918332928L, 127151);
    GMTrace.o(17065918332928L, 127151);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17066052550656L, 127152);
    w.i("MicroMsg.GameJsApiShowMenuItems", "invoke");
    Object localObject = paramd.aEo();
    if ((localObject == null) || (((GameWebViewUI)localObject).isFinishing()))
    {
      w.e("MicroMsg.GameJsApiShowMenuItems", "activity is finish");
      GMTrace.o(17066052550656L, 127152);
      return;
    }
    if (paramJSONObject != null)
    {
      paramJSONObject = paramJSONObject.optJSONArray("menuList");
      if (paramJSONObject != null) {}
    }
    else
    {
      w.i("MicroMsg.GameJsApiShowMenuItems", "data is null");
      paramd.v(paramInt, a.d("showMenuItems:fail_invalid_data", null));
      GMTrace.o(17066052550656L, 127152);
      return;
    }
    localObject = paramd.lJm;
    if ((localObject != null) && (((e)localObject).lKw != null))
    {
      localObject = ((e)localObject).lKw;
      if (paramJSONObject != null)
      {
        int i = 0;
        while (i < paramJSONObject.length())
        {
          int j = bg.e((Integer)((i)localObject).lKL.get(paramJSONObject.optString(i)));
          if (j > 0) {
            ((i)localObject).lKK.remove(Integer.valueOf(j));
          }
          i += 1;
        }
      }
    }
    paramd.v(paramInt, a.d("showMenuItems:ok", null));
    GMTrace.o(17066052550656L, 127152);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
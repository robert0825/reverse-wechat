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

public final class u
  extends a
{
  public static final int CTRL_BYTE = 85;
  public static final String NAME = "hideMenuItems";
  
  public u()
  {
    GMTrace.i(17057462616064L, 127088);
    GMTrace.o(17057462616064L, 127088);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17057596833792L, 127089);
    w.i("MicroMsg.GameJsApiHideMenuItems", "invoke");
    Object localObject = paramd.aEo();
    if ((localObject == null) || (((GameWebViewUI)localObject).isFinishing()))
    {
      w.e("MicroMsg.GameJsApiHideMenuItems", "activity is finish");
      GMTrace.o(17057596833792L, 127089);
      return;
    }
    if (paramJSONObject != null)
    {
      paramJSONObject = paramJSONObject.optJSONArray("menuList");
      if (paramJSONObject != null) {}
    }
    else
    {
      w.i("MicroMsg.GameJsApiHideMenuItems", "data is null");
      paramd.v(paramInt, a.d("hideMenuItems:fail_invalid_data", null));
      GMTrace.o(17057596833792L, 127089);
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
          if ((j > 0) && (!((i)localObject).lKM.contains(Integer.valueOf(j)))) {
            ((i)localObject).lKK.add(Integer.valueOf(j));
          }
          i += 1;
        }
      }
    }
    paramd.v(paramInt, a.d("hideMenuItems:ok", null));
    GMTrace.o(17057596833792L, 127089);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
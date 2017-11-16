package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.a.c;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.ui.GameCenterUI;
import com.tencent.mm.plugin.game.ui.GameDetailUI;
import com.tencent.mm.plugin.game.ui.GameLibraryUI;
import com.tencent.mm.plugin.game.ui.GameMessageUI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ac
  extends a
{
  public static final int CTRL_BYTE = 175;
  public static final String NAME = "openGameCenter";
  
  public ac()
  {
    GMTrace.i(17038135263232L, 126944);
    GMTrace.o(17038135263232L, 126944);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17038269480960L, 126945);
    w.i("MicroMsg.GameJsApiShowMenuItems", "invoke");
    GameWebViewUI localGameWebViewUI = paramd.aEo();
    if ((localGameWebViewUI == null) || (localGameWebViewUI.isFinishing()))
    {
      w.e("MicroMsg.GameJsApiShowMenuItems", "activity is finish");
      GMTrace.o(17038269480960L, 126945);
      return;
    }
    if (paramJSONObject == null)
    {
      w.i("MicroMsg.GameJsApiShowMenuItems", "data is null");
      paramd.v(paramInt, a.d("gameCenterJump:fail_invalid_data", null));
      GMTrace.o(17038269480960L, 126945);
      return;
    }
    int j = paramJSONObject.optInt("jumpView");
    int k = paramJSONObject.optInt("jumpType");
    w.i("MicroMsg.GameJsApiShowMenuItems", "jumpView = %d, jumpType = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
    Object localObject = paramJSONObject.optJSONObject("extInfo");
    int i;
    if (localObject != null)
    {
      i = ((JSONObject)localObject).optInt("ssid");
      paramJSONObject = new Intent();
      switch (j)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(17038269480960L, 126945);
      return;
      i = 0;
      break;
      paramJSONObject.setClass(localGameWebViewUI, GameCenterUI.class);
      if (k == 1) {
        paramJSONObject.putExtra("jump_find_more_friends", "jump_find_more_friends");
      }
      paramJSONObject.putExtra("game_report_from_scene", 5);
      localGameWebViewUI.startActivity(paramJSONObject);
      paramd.v(paramInt, a.d("gameCenterJump:ok", null));
      c.z(localGameWebViewUI, i);
      GMTrace.o(17038269480960L, 126945);
      return;
      paramJSONObject.setClass(localGameWebViewUI, GameLibraryUI.class);
      if (k == 1) {
        paramJSONObject.putExtra("jump_game_center", "jump_game_center");
      }
      paramJSONObject.putExtra("game_report_from_scene", 5);
      localGameWebViewUI.startActivity(paramJSONObject);
      c.z(localGameWebViewUI, i);
      GMTrace.o(17038269480960L, 126945);
      return;
      if (localObject != null)
      {
        localObject = ((JSONObject)localObject).optString("appId");
        if (!bg.nm((String)localObject)) {}
      }
      else
      {
        paramd.v(paramInt, a.d("gameCenterJump:fail_invalid_data", null));
        GMTrace.o(17038269480960L, 126945);
        return;
      }
      paramJSONObject.setClass(localGameWebViewUI, GameDetailUI.class);
      paramJSONObject.putExtra("game_app_id", (String)localObject);
      if (k == 1) {
        paramJSONObject.putExtra("jump_game_center", "jump_game_center");
      }
      paramJSONObject.putExtra("game_report_from_scene", 5);
      localGameWebViewUI.startActivity(paramJSONObject);
      c.z(localGameWebViewUI, i);
      GMTrace.o(17038269480960L, 126945);
      return;
      paramJSONObject.setClass(localGameWebViewUI, GameMessageUI.class);
      paramJSONObject.putExtra("game_report_from_scene", 5);
      localGameWebViewUI.startActivity(paramJSONObject);
      c.z(localGameWebViewUI, i);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
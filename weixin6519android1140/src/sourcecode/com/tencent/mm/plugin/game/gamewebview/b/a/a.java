package com.tencent.mm.plugin.game.gamewebview.b.a;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.game.gamewebview.b.a
{
  public static final int CTRL_BYTE = 0;
  public static final String NAME = "onCustomGameMenuClicked";
  
  public a()
  {
    GMTrace.i(17984772898816L, 133997);
    GMTrace.o(17984772898816L, 133997);
  }
  
  public final void j(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(17984907116544L, 133998);
    w.i("MicroMsg.GameJsEventCustomGameMenuClicked", "invoke");
    if (paramBundle == null)
    {
      GMTrace.o(17984907116544L, 133998);
      return;
    }
    int i = paramBundle.getInt("itemId");
    paramBundle = com.tencent.mm.plugin.game.gamewebview.model.a.oA(paramInt);
    if (paramBundle == null)
    {
      GMTrace.o(17984907116544L, 133998);
      return;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("itemId", i);
      paramBundle.cp(getName(), localJSONObject.toString());
      GMTrace.o(17984907116544L, 133998);
      return;
    }
    catch (Exception paramBundle)
    {
      w.e("MicroMsg.GameJsEventCustomGameMenuClicked", "ex : " + paramBundle.getMessage());
      GMTrace.o(17984907116544L, 133998);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
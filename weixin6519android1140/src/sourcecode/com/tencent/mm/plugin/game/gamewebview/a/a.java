package com.tencent.mm.plugin.game.gamewebview.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class a
{
  public static void a(d paramd, int paramInt)
  {
    GMTrace.i(18955703943168L, 141231);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("height", paramInt);
      paramd.cp("onGetKeyboardHeight", localJSONObject.toString());
      GMTrace.o(18955703943168L, 141231);
      return;
    }
    catch (Exception paramd)
    {
      w.e("MicroMsg.GameWebviewJsLoader", "onGetA8Key, e:" + paramd.getMessage());
      GMTrace.o(18955703943168L, 141231);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
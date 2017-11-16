package com.tencent.mm.plugin.game.gamewebview.b.a;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.game.gamewebview.b.a
{
  public static final int CTRL_BYTE = 0;
  public static final String NAME = "onNetWorkChange";
  
  public d()
  {
    GMTrace.i(16964583948288L, 126396);
    GMTrace.o(16964583948288L, 126396);
  }
  
  public final void j(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(16964718166016L, 126397);
    w.i("MicroMsg.GameJsEventNetworkChange", "dispatch");
    if (paramBundle == null)
    {
      GMTrace.o(16964718166016L, 126397);
      return;
    }
    paramBundle = paramBundle.getString("netType", "");
    com.tencent.mm.plugin.game.gamewebview.ui.d locald = com.tencent.mm.plugin.game.gamewebview.model.a.oA(paramInt);
    if (locald == null)
    {
      GMTrace.o(16964718166016L, 126397);
      return;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("netType", paramBundle);
      locald.cp(getName(), localJSONObject.toString());
      GMTrace.o(16964718166016L, 126397);
      return;
    }
    catch (Exception paramBundle)
    {
      w.e("MicroMsg.GameJsEventNetworkChange", "ex : " + paramBundle.getMessage());
      GMTrace.o(16964718166016L, 126397);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\b\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
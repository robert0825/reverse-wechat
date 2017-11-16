package com.tencent.mm.plugin.game.gamewebview.b.a;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.game.gamewebview.b.a
{
  public static final int CTRL_BYTE = 0;
  public static final String NAME = "wxdownload:state_change";
  
  public c()
  {
    GMTrace.i(16964852383744L, 126398);
    GMTrace.o(16964852383744L, 126398);
  }
  
  public final void j(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(16964986601472L, 126399);
    if (paramBundle == null)
    {
      GMTrace.o(16964986601472L, 126399);
      return;
    }
    String str = paramBundle.getString("appid");
    long l = paramBundle.getLong("download_id");
    paramBundle = paramBundle.getString("state");
    d locald = com.tencent.mm.plugin.game.gamewebview.model.a.oA(paramInt);
    if (locald == null)
    {
      GMTrace.o(16964986601472L, 126399);
      return;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("appid", str);
      localJSONObject.put("download_id", l);
      localJSONObject.put("state", paramBundle);
      locald.cp(getName(), localJSONObject.toString());
      GMTrace.o(16964986601472L, 126399);
      return;
    }
    catch (Exception paramBundle)
    {
      w.e("MicroMsg.GameJsEventDownloadInfo", "ex : " + paramBundle.getMessage());
      GMTrace.o(16964986601472L, 126399);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
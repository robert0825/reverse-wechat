package com.tencent.mm.plugin.game.gamewebview.b.a;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.game.gamewebview.b.a
{
  public static final int CTRL_BYTE = 0;
  public static final String NAME = "wxdownload:progress_change";
  
  public b()
  {
    GMTrace.i(16964315512832L, 126394);
    GMTrace.o(16964315512832L, 126394);
  }
  
  public final void j(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(16964449730560L, 126395);
    if (paramBundle == null)
    {
      GMTrace.o(16964449730560L, 126395);
      return;
    }
    String str = paramBundle.getString("appid");
    long l1 = paramBundle.getLong("download_id");
    long l2 = paramBundle.getInt("progress");
    paramBundle = com.tencent.mm.plugin.game.gamewebview.model.a.oA(paramInt);
    if (paramBundle == null)
    {
      GMTrace.o(16964449730560L, 126395);
      return;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("appid", str);
      localJSONObject.put("download_id", l1);
      localJSONObject.put("progress", l2);
      paramBundle.cp(getName(), localJSONObject.toString());
      GMTrace.o(16964449730560L, 126395);
      return;
    }
    catch (Exception paramBundle)
    {
      w.e("MicroMsg.GameJsEventDownloadProgressChange", "ex : " + paramBundle.getMessage());
      GMTrace.o(16964449730560L, 126395);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.game.gamewebview.b.a;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.plugin.game.gamewebview.b.a
{
  public static final int CTRL_BYTE = 0;
  public static final String NAME = "onMediaFileUploadProgress";
  
  public e()
  {
    GMTrace.i(16964047077376L, 126392);
    GMTrace.o(16964047077376L, 126392);
  }
  
  public final void j(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(16964181295104L, 126393);
    w.i("MicroMsg.GameJsEventUploadMediaFileProgess", "invoke");
    if (paramBundle == null)
    {
      GMTrace.o(16964181295104L, 126393);
      return;
    }
    String str = paramBundle.getString("webview_jssdk_file_item_local_id");
    int i = paramBundle.getInt("webview_jssdk_file_item_progreess");
    paramBundle = com.tencent.mm.plugin.game.gamewebview.model.a.oA(paramInt);
    if (paramBundle == null)
    {
      GMTrace.o(16964181295104L, 126393);
      return;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("localId", str);
      localJSONObject.put("percent", i);
      paramBundle.cp(getName(), localJSONObject.toString());
      GMTrace.o(16964181295104L, 126393);
      return;
    }
    catch (Exception paramBundle)
    {
      w.e("MicroMsg.GameJsEventUploadMediaFileProgess", "ex : " + paramBundle.getMessage());
      GMTrace.o(16964181295104L, 126393);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\b\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
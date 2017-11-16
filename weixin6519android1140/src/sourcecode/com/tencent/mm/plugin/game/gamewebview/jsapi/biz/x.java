package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class x
  extends a
{
  public static final int CTRL_BYTE = 41;
  public static final String NAME = "installDownloadTask";
  
  public x()
  {
    GMTrace.i(17044175060992L, 126989);
    GMTrace.o(17044175060992L, 126989);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17044309278720L, 126990);
    w.i("MicroMsg.GameJsApiGetNetworkType", "invoke");
    long l;
    if (paramJSONObject != null)
    {
      l = paramJSONObject.optLong("download_id", -1L);
      if (l > 0L) {}
    }
    else
    {
      w.i("MicroMsg.GameJsApiGetNetworkType", "data is null");
      paramd.v(paramInt, a.d("install_download_task:fail_invalid_data", null));
      GMTrace.o(17044309278720L, 126990);
      return;
    }
    paramJSONObject = new DoDownloadTask();
    paramJSONObject.type = 5;
    paramJSONObject.eAf = l;
    GameWebViewMainProcessService.b(paramJSONObject);
    if (paramJSONObject.eDb)
    {
      paramd.v(paramInt, a.d("install_download_task:ok", null));
      GMTrace.o(17044309278720L, 126990);
      return;
    }
    paramd.v(paramInt, a.d("install_download_task:fail", null));
    GMTrace.o(17044309278720L, 126990);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
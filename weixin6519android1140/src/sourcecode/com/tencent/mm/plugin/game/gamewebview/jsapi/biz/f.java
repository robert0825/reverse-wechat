package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class f
  extends a
{
  public static final int CTRL_BYTE = 39;
  public static final String NAME = "cancelDownloadTask";
  
  public f()
  {
    GMTrace.i(17060952276992L, 127114);
    GMTrace.o(17060952276992L, 127114);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17061086494720L, 127115);
    w.i("MicroMsg.GameJsApiCancelDownloadTask", "GameJsApiCancelDownloadTask");
    long l = paramJSONObject.optLong("download_id");
    if (l <= 0L)
    {
      w.e("MicroMsg.GameJsApiCancelDownloadTask", "fail, invalid downloadId = " + l);
      paramd.v(paramInt, a.d("cancel_download_task:fail_invalid_downloadid", null));
      GMTrace.o(17061086494720L, 127115);
      return;
    }
    paramJSONObject = new DoDownloadTask();
    paramJSONObject.type = 4;
    paramJSONObject.eAf = l;
    GameWebViewMainProcessService.b(paramJSONObject);
    if (paramJSONObject.eDb)
    {
      paramd.v(paramInt, a.d("cancel_download_task:ok", null));
      GMTrace.o(17061086494720L, 127115);
      return;
    }
    paramd.v(paramInt, a.d("cancel_download_task:fail", null));
    GMTrace.o(17061086494720L, 127115);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
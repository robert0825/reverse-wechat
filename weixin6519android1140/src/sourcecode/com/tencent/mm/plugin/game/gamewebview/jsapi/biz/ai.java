package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ai
  extends a
{
  public static final int CTRL_BYTE = 239;
  public static final String NAME = "pauseDownloadTask";
  
  public ai()
  {
    GMTrace.i(17052764995584L, 127053);
    GMTrace.o(17052764995584L, 127053);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17052899213312L, 127054);
    w.i("MicroMsg.GameJsApiPauseDownloadTask", "GameJsApiPauseDownloadTask");
    long l = paramJSONObject.optLong("download_id");
    if (l <= 0L)
    {
      w.e("MicroMsg.GameJsApiPauseDownloadTask", "fail, invalid downloadId = " + l);
      paramd.v(paramInt, a.d("pause_download_task:fail_invalid_downloadid", null));
      GMTrace.o(17052899213312L, 127054);
      return;
    }
    paramJSONObject = new DoDownloadTask();
    paramJSONObject.type = 2;
    paramJSONObject.eAf = l;
    GameWebViewMainProcessService.b(paramJSONObject);
    if (paramJSONObject.eDb)
    {
      paramd.v(paramInt, a.d("pause_download_task:ok", null));
      GMTrace.o(17052899213312L, 127054);
      return;
    }
    paramd.v(paramInt, a.d("pause_download_task:fail", null));
    GMTrace.o(17052899213312L, 127054);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
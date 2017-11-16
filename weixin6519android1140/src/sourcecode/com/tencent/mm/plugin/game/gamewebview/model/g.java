package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonLogicTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.webview.model.ai;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.k;

public final class g
{
  public g()
  {
    GMTrace.i(17080145412096L, 127257);
    GMTrace.o(17080145412096L, 127257);
  }
  
  public static k zu(String paramString)
  {
    GMTrace.i(19310844051456L, 143877);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.GameWebViewResourceInterrupter", "url is null, return ");
      GMTrace.o(19310844051456L, 143877);
      return null;
    }
    if ((!bg.nm(paramString)) && (paramString.startsWith("weixin://resourceid/"))) {
      w.i("MicroMsg.GameWebViewResourceInterrupter", "it is wechat resource is, should intercept");
    }
    for (;;)
    {
      try
      {
        CommonLogicTask localCommonLogicTask = new CommonLogicTask();
        localCommonLogicTask.type = 8;
        localCommonLogicTask.ler.putString("localId", paramString);
        GameWebViewMainProcessService.b(localCommonLogicTask);
        paramString = ai.Lq(localCommonLogicTask.ler.getString("file_path"));
        if (paramString == null) {
          break label163;
        }
        paramString = new k("image/*", "utf-8", paramString);
        GMTrace.o(19310844051456L, 143877);
        return paramString;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.GameWebViewResourceInterrupter", "get webview jssdk resource failed %s", new Object[] { paramString.getMessage() });
        GMTrace.o(19310844051456L, 143877);
        return null;
      }
      GMTrace.o(19310844051456L, 143877);
      return null;
      label163:
      paramString = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
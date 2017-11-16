package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.a;
import com.tencent.mm.plugin.webview.model.c.a;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  implements c.a
{
  public d()
  {
    GMTrace.i(17078803234816L, 127247);
    GMTrace.o(17078803234816L, 127247);
  }
  
  public final void a(boolean paramBoolean, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    GMTrace.i(17078937452544L, 127248);
    w.i("MicroMsg.GameWebViewCdnProgressCallback", "onWebView cdn callback progress, upload : %b, mediaType : %d, percent : %d, localid : %s, mediaId : %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, paramString2 });
    if (paramBoolean)
    {
      paramString2 = new Bundle();
      paramString2.putInt("mm_to_client_notify_type", 1);
      paramString2.putString("js_event_name", "onMediaFileUploadProgress");
      paramString2.putString("webview_jssdk_file_item_local_id", paramString1);
      paramString2.putInt("webview_jssdk_file_item_progreess", paramInt2);
      a.A(paramString2);
    }
    GMTrace.o(17078937452544L, 127248);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
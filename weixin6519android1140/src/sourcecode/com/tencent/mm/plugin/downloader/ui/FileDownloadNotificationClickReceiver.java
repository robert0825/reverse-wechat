package com.tencent.mm.plugin.downloader.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qk;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class FileDownloadNotificationClickReceiver
  extends BroadcastReceiver
{
  public FileDownloadNotificationClickReceiver()
  {
    GMTrace.i(18588886892544L, 138498);
    GMTrace.o(18588886892544L, 138498);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(18589021110272L, 138499);
    w.i("MicroMsg.FileDownloadNotificationClickReceiver", "onReceive");
    Object localObject = bg.bs(paramContext);
    w.i("MicroMsg.FileDownloadNotificationClickReceiver", "topActivityName = " + (String)localObject);
    paramIntent = paramIntent.getExtras();
    if (bg.nl((String)localObject).equals("com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI"))
    {
      paramContext = new qk();
      paramContext.eVm.bundle = paramIntent;
      a.vgX.m(paramContext);
      GMTrace.o(18589021110272L, 138499);
      return;
    }
    localObject = new Intent(paramContext, FileDownloadConfirmUI.class);
    ((Intent)localObject).putExtras(paramIntent);
    ((Intent)localObject).setFlags(268435456);
    paramContext.startActivity((Intent)localObject);
    GMTrace.o(18589021110272L, 138499);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\downloader\ui\FileDownloadNotificationClickReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
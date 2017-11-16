package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.downloader.model.n;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  implements n
{
  public e()
  {
    GMTrace.i(17079071670272L, 127249);
    GMTrace.o(17079071670272L, 127249);
  }
  
  public final void bs(long paramLong)
  {
    GMTrace.i(17079876976640L, 127255);
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:progress_change");
    com.tencent.mm.plugin.downloader.e.a locala = com.tencent.mm.plugin.downloader.model.e.bm(paramLong);
    if ((locala == null) || (locala.field_totalSize == 0L))
    {
      w.w("MicroMsg.GameWebViewDownloadEventBus", "loadDownloadProgress failed, downloadId = " + paramLong);
      GMTrace.o(17079876976640L, 127255);
      return;
    }
    localBundle.putInt("progress", (int)(locala.field_downloadedSize / locala.field_totalSize * 100.0D));
    localBundle.putString("appid", locala.field_appId);
    localBundle.putLong("download_id", paramLong);
    com.tencent.mm.plugin.game.gamewebview.ipc.a.A(localBundle);
    GMTrace.o(17079876976640L, 127255);
  }
  
  public final void c(long paramLong, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17079474323456L, 127252);
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:state_change");
    localBundle.putString("state", "download_fail");
    localBundle.putInt("err_code", paramInt);
    Object localObject = com.tencent.mm.plugin.downloader.model.e.bm(paramLong);
    if (localObject != null) {}
    for (localObject = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_appId;; localObject = "")
    {
      localBundle.putString("appid", (String)localObject);
      localBundle.putLong("download_id", paramLong);
      com.tencent.mm.plugin.game.gamewebview.ipc.a.A(localBundle);
      GMTrace.o(17079474323456L, 127252);
      return;
    }
  }
  
  public final void c(long paramLong, String paramString, boolean paramBoolean)
  {
    GMTrace.i(17079340105728L, 127251);
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:state_change");
    localBundle.putString("state", "download_succ");
    paramString = com.tencent.mm.plugin.downloader.model.e.bm(paramLong);
    if (paramString != null) {}
    for (paramString = paramString.field_appId;; paramString = "")
    {
      localBundle.putString("appid", paramString);
      localBundle.putLong("download_id", paramLong);
      com.tencent.mm.plugin.game.gamewebview.ipc.a.A(localBundle);
      GMTrace.o(17079340105728L, 127251);
      return;
    }
  }
  
  public final void k(long paramLong, String paramString)
  {
    GMTrace.i(17080011194368L, 127256);
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:state_change");
    localBundle.putString("state", "download_resumed");
    paramString = com.tencent.mm.plugin.downloader.model.e.bm(paramLong);
    if (paramString != null) {}
    for (paramString = paramString.field_appId;; paramString = "")
    {
      localBundle.putString("appid", paramString);
      localBundle.putLong("download_id", paramLong);
      com.tencent.mm.plugin.game.gamewebview.ipc.a.A(localBundle);
      GMTrace.o(17080011194368L, 127256);
      return;
    }
  }
  
  public final void onTaskPaused(long paramLong)
  {
    GMTrace.i(17079742758912L, 127254);
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:state_change");
    localBundle.putString("state", "download_pause");
    Object localObject = com.tencent.mm.plugin.downloader.model.e.bm(paramLong);
    if (localObject != null) {}
    for (localObject = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_appId;; localObject = "")
    {
      localBundle.putString("appid", (String)localObject);
      localBundle.putLong("download_id", paramLong);
      com.tencent.mm.plugin.game.gamewebview.ipc.a.A(localBundle);
      GMTrace.o(17079742758912L, 127254);
      return;
    }
  }
  
  public final void onTaskRemoved(long paramLong)
  {
    GMTrace.i(17079608541184L, 127253);
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:state_change");
    localBundle.putString("state", "download_removed");
    Object localObject = com.tencent.mm.plugin.downloader.model.e.bm(paramLong);
    if (localObject != null) {}
    for (localObject = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_appId;; localObject = "")
    {
      localBundle.putString("appid", (String)localObject);
      localBundle.putLong("download_id", paramLong);
      com.tencent.mm.plugin.game.gamewebview.ipc.a.A(localBundle);
      GMTrace.o(17079608541184L, 127253);
      return;
    }
  }
  
  public final void onTaskStarted(long paramLong, String paramString)
  {
    GMTrace.i(17079205888000L, 127250);
    Bundle localBundle = new Bundle();
    localBundle.putInt("mm_to_client_notify_type", 1);
    localBundle.putString("js_event_name", "wxdownload:state_change");
    localBundle.putString("state", "download_start");
    paramString = com.tencent.mm.plugin.downloader.model.e.bm(paramLong);
    if (paramString != null) {}
    for (paramString = paramString.field_appId;; paramString = "")
    {
      localBundle.putString("appid", paramString);
      localBundle.putLong("download_id", paramLong);
      com.tencent.mm.plugin.game.gamewebview.ipc.a.A(localBundle);
      GMTrace.o(17079205888000L, 127250);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
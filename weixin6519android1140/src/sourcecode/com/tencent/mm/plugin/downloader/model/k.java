package com.tencent.mm.plugin.downloader.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

final class k
  extends j
{
  public k(c paramc)
  {
    super(paramc);
    GMTrace.i(18603919278080L, 138610);
    GMTrace.o(18603919278080L, 138610);
  }
  
  public final long a(g paramg)
  {
    GMTrace.i(18604053495808L, 138611);
    if (bg.nm(paramg.hJF))
    {
      GMTrace.o(18604053495808L, 138611);
      return -1L;
    }
    paramg = new Intent("android.intent.action.VIEW", Uri.parse(paramg.hJF));
    paramg.addFlags(268435456);
    try
    {
      ab.getContext().startActivity(paramg);
      GMTrace.o(18604053495808L, 138611);
      return 0L;
    }
    catch (Exception paramg)
    {
      w.e("MicroMsg.FileDownloaderImplNormal", "Add download task failed: " + paramg.toString());
      GMTrace.o(18604053495808L, 138611);
    }
    return -1L;
  }
  
  public final int bf(long paramLong)
  {
    GMTrace.i(18604187713536L, 138612);
    GMTrace.o(18604187713536L, 138612);
    return 1;
  }
  
  public final FileDownloadTaskInfo bg(long paramLong)
  {
    GMTrace.i(18604321931264L, 138613);
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    localFileDownloadTaskInfo.id = paramLong;
    localFileDownloadTaskInfo.status = -1;
    GMTrace.o(18604321931264L, 138613);
    return localFileDownloadTaskInfo;
  }
  
  public final boolean bh(long paramLong)
  {
    GMTrace.i(18604456148992L, 138614);
    GMTrace.o(18604456148992L, 138614);
    return false;
  }
  
  public final boolean bi(long paramLong)
  {
    GMTrace.i(18604590366720L, 138615);
    GMTrace.o(18604590366720L, 138615);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
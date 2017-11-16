package com.tencent.mm.plugin.downloader.model;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.y.d;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.downloader.b.c;
import com.tencent.mm.plugin.downloader.ipc.CDNTaskInfo;
import com.tencent.mm.plugin.downloader.ipc.CDNTaskState;
import com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aj;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends j
{
  private static final String keB;
  private byte[] gCf;
  private HashMap<String, Long> keC;
  public HashMap<String, Long> keD;
  private ConcurrentHashMap<String, Integer> keE;
  private com.tencent.mm.plugin.downloader.d.b keg;
  public Context mContext;
  
  static
  {
    GMTrace.i(18608885334016L, 138647);
    keB = com.tencent.mm.loader.stub.a.ghz + "BigFile";
    GMTrace.o(18608885334016L, 138647);
  }
  
  public b(c paramc)
  {
    super(paramc);
    GMTrace.i(18607677374464L, 138638);
    this.gCf = new byte[0];
    this.keg = new com.tencent.mm.plugin.downloader.d.b()
    {
      public final void e(String paramAnonymousString1, int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString2)
      {
        GMTrace.i(20093736058880L, 149710);
        com.tencent.mm.plugin.downloader.e.a locala = e.vu(paramAnonymousString1);
        if (locala == null)
        {
          w.i("MicroMsg.FileCDNDownloader", "onDownloadTaskStateChanged, info is null");
          GMTrace.o(20093736058880L, 149710);
          return;
        }
        w.i("MicroMsg.FileCDNDownloader", "onDownloadTaskStateChanged, url = %s, state = %d, errCode = %d, errMsg = %s", new Object[] { paramAnonymousString1, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString2 });
        switch (paramAnonymousInt1)
        {
        }
        for (;;)
        {
          GMTrace.o(20093736058880L, 149710);
          return;
          locala.field_errCode = Math.abs(paramAnonymousInt2);
          locala.field_status = 4;
          e.c(locala);
          b.this.kfj.b(locala.field_downloadId, Math.abs(paramAnonymousInt2), false);
          b.this.b(locala.field_downloadUrl, 4, 0, false);
          GMTrace.o(20093736058880L, 149710);
          return;
          paramAnonymousString1 = new Intent();
          paramAnonymousString1.putExtra(FileDownloadService.kfz, 1);
          paramAnonymousString1.setClass(b.this.mContext, FileDownloadService.class);
          paramAnonymousString1.putExtra(FileDownloadService.EXTRA_ID, locala.field_downloadId);
          try
          {
            b.this.mContext.startService(paramAnonymousString1);
            b.this.cancelNotification(locala.field_downloadUrl);
          }
          catch (Exception paramAnonymousString1)
          {
            for (;;)
            {
              w.e("MicroMsg.FileCDNDownloader", paramAnonymousString1.getMessage());
            }
          }
        }
      }
      
      public final void h(String paramAnonymousString, long paramAnonymousLong1, long paramAnonymousLong2)
      {
        GMTrace.i(20093870276608L, 149711);
        paramAnonymousString = e.vu(paramAnonymousString);
        if (paramAnonymousString == null)
        {
          w.i("MicroMsg.FileCDNDownloader", "onDownloadTaskStateChanged, info is null");
          GMTrace.o(20093870276608L, 149711);
          return;
        }
        Long localLong1 = (Long)b.this.keD.get(paramAnonymousString.field_downloadUrl);
        Long localLong2 = Long.valueOf(System.currentTimeMillis());
        if ((localLong1 != null) && (localLong2.longValue() - localLong1.longValue() < 500L))
        {
          GMTrace.o(20093870276608L, 149711);
          return;
        }
        b.this.keD.put(paramAnonymousString.field_downloadUrl, localLong2);
        paramAnonymousString.field_status = 1;
        paramAnonymousString.field_downloadedSize = paramAnonymousLong1;
        paramAnonymousString.field_totalSize = paramAnonymousLong2;
        e.c(paramAnonymousString);
        b.this.kfj.bl(paramAnonymousString.field_downloadId);
        int i = 0;
        if (paramAnonymousLong2 > 0L) {
          i = (int)((float)paramAnonymousLong1 / (float)paramAnonymousLong2 * 100.0F);
        }
        int j;
        if (i < 0) {
          j = 0;
        }
        for (;;)
        {
          b.this.b(paramAnonymousString.field_downloadUrl, 1, j, false);
          GMTrace.o(20093870276608L, 149711);
          return;
          j = i;
          if (i > 100) {
            j = 100;
          }
        }
      }
    };
    this.mContext = ab.getContext();
    this.keC = new HashMap();
    this.keD = new HashMap();
    this.keE = new ConcurrentHashMap();
    com.tencent.mm.plugin.downloader.d.a.apz().keg = this.keg;
    GMTrace.o(18607677374464L, 138638);
  }
  
  public static CDNTaskInfo a(com.tencent.mm.plugin.downloader.e.a parama)
  {
    GMTrace.i(20094004494336L, 149712);
    CDNTaskInfo localCDNTaskInfo = new CDNTaskInfo();
    localCDNTaskInfo.gAI = true;
    localCDNTaskInfo.mediaId = parama.field_downloadUrl;
    localCDNTaskInfo.downloadUrl = parama.field_downloadUrl;
    localCDNTaskInfo.filePath = parama.field_filePath;
    localCDNTaskInfo.ket = parama.field_secondaryUrl;
    localCDNTaskInfo.kev = 15;
    localCDNTaskInfo.kew = 3600;
    localCDNTaskInfo.kex = true;
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (parama.field_fileSize > 0L) {
        localJSONObject.put("Content-Length", parama.field_fileSize);
      }
      localCDNTaskInfo.keu = localJSONObject.toString();
    }
    catch (JSONException parama)
    {
      for (;;)
      {
        w.e("MicroMsg.FileCDNDownloader", "addVerifyHeaders: " + parama.getMessage());
      }
    }
    GMTrace.o(20094004494336L, 149712);
    return localCDNTaskInfo;
  }
  
  public final long a(final g paramg)
  {
    GMTrace.i(18607811592192L, 138639);
    if ((paramg == null) || (bg.nm(paramg.hJF)))
    {
      w.e("MicroMsg.FileCDNDownloader", "Invalid Request");
      GMTrace.o(18607811592192L, 138639);
      return -1L;
    }
    final String str = paramg.hJF;
    Object localObject1 = e.vu(str);
    long l;
    if (localObject1 != null)
    {
      localObject2 = bg(((com.tencent.mm.plugin.downloader.e.a)localObject1).field_downloadId);
      w.i("MicroMsg.FileCDNDownloader", "addDownloadTask, status = " + ((FileDownloadTaskInfo)localObject2).status);
      if (((FileDownloadTaskInfo)localObject2).status == 1)
      {
        l = ((FileDownloadTaskInfo)localObject2).id;
        GMTrace.o(18607811592192L, 138639);
        return l;
      }
    }
    Object localObject2 = new File(keB);
    File localFile1;
    if (!((File)localObject2).exists())
    {
      if (!((File)localObject2).getParentFile().exists())
      {
        localFile1 = ((File)localObject2).getParentFile();
        File localFile2 = new File(localFile1.getAbsolutePath() + System.currentTimeMillis());
        if (!localFile2.mkdirs()) {
          break label422;
        }
        localFile2.renameTo(localFile1);
      }
      w.i("MicroMsg.FileCDNDownloader", "Make download dir result: %b", new Object[] { Boolean.valueOf(((File)localObject2).mkdirs()) });
    }
    for (;;)
    {
      e.vs(str);
      e.vt(paramg.hyD);
      paramg = h.b(paramg);
      paramg.field_downloadId = System.currentTimeMillis();
      paramg.field_downloaderType = 3;
      localObject2 = aa.RP(str);
      paramg.field_filePath = (keB + "/" + (String)localObject2);
      if (localObject1 != null)
      {
        localObject2 = paramg.field_filePath;
        localObject1 = ((com.tencent.mm.plugin.downloader.e.a)localObject1).field_filePath;
        if ((localObject2 != null) && (localObject1 != null) && (!((String)localObject2).equals(localObject1)))
        {
          localObject1 = new File((String)localObject1);
          if (((File)localObject1).exists()) {
            w.i("MicroMsg.FileCDNDownloader", "Delete previous file result: %b", new Object[] { Boolean.valueOf(((File)localObject1).delete()) });
          }
        }
      }
      paramg.field_startTime = System.currentTimeMillis();
      new Thread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18600161181696L, 138582);
          CDNTaskInfo localCDNTaskInfo = b.a(paramg);
          int i = com.tencent.mm.plugin.downloader.d.a.apz().a(localCDNTaskInfo);
          w.i("MicroMsg.FileCDNDownloader", "addDownloadTask: " + i);
          if (i == 0)
          {
            paramg.field_status = 1;
            e.b(paramg);
            b.this.kfj.i(paramg.field_downloadId, paramg.field_filePath);
            b.this.b(str, 1, 0, true);
            GMTrace.o(18600161181696L, 138582);
            return;
          }
          if (i == -2)
          {
            paramg.field_status = 1;
            e.b(paramg);
            GMTrace.o(18600161181696L, 138582);
            return;
          }
          paramg.field_status = 4;
          paramg.field_errCode = d.keP;
          e.b(paramg);
          b.this.kfj.b(paramg.field_downloadId, paramg.field_errCode, false);
          GMTrace.o(18600161181696L, 138582);
        }
      }).start();
      l = paramg.field_downloadId;
      GMTrace.o(18607811592192L, 138639);
      return l;
      label422:
      w.e("MicroMsg.FileCDNDownloader", "mkdir parent error, %s", new Object[] { localFile1.getAbsolutePath() });
    }
  }
  
  public final void b(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(18608616898560L, 138645);
    w.d("MicroMsg.FileCDNDownloader", "state = %d, progress = %d, firstShown = %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) });
    ??? = e.vu(paramString);
    if (??? == null)
    {
      w.e("MicroMsg.FileCDNDownloader", "updateNotification failed: null task info");
      GMTrace.o(18608616898560L, 138645);
      return;
    }
    if (!((com.tencent.mm.plugin.downloader.e.a)???).field_showNotification)
    {
      GMTrace.o(18608616898560L, 138645);
      return;
    }
    y.d locald = new y.d(this.mContext);
    long l;
    if (paramBoolean)
    {
      l = System.currentTimeMillis();
      this.keC.put(paramString, Long.valueOf(l));
      locald.c(l);
    }
    Object localObject2;
    for (;;)
    {
      locald.a(((com.tencent.mm.plugin.downloader.e.a)???).field_fileName);
      switch (paramInt1)
      {
      case 2: 
      case 3: 
      default: 
        cancelNotification(paramString);
        GMTrace.o(18608616898560L, 138645);
        return;
        localObject2 = (Long)this.keC.get(paramString);
        if (localObject2 != null) {
          locald.c(((Long)localObject2).longValue());
        }
        break;
      }
    }
    locald.L(17301633);
    if (paramInt2 == 0) {
      paramBoolean = true;
    }
    for (;;)
    {
      locald.a(100, paramInt2, paramBoolean);
      locald.b(this.mContext.getString(b.c.dvq));
      locald.b(2, true);
      l = ((com.tencent.mm.plugin.downloader.e.a)???).field_downloadId;
      ??? = new Intent(this.mContext, FileDownloadConfirmUI.class);
      ((Intent)???).putExtra("extra_download_id", l);
      locald.rg = PendingIntent.getActivity(this.mContext, (int)System.currentTimeMillis(), (Intent)???, 268435456);
      synchronized (this.gCf)
      {
        for (;;)
        {
          localObject2 = (Integer)this.keE.get(paramString);
          if (localObject2 != null) {
            break label485;
          }
          paramInt2 = ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.notification.b.a.class)).getNotification().b(locald.build());
          this.keE.put(paramString, Integer.valueOf(paramInt2));
          if (paramInt1 == 4) {
            this.keE.remove(paramString);
          }
          GMTrace.o(18608616898560L, 138645);
          return;
          paramBoolean = false;
          break;
          locald.L(17301634);
          locald.o(true);
          ??? = new Intent();
          locald.rg = PendingIntent.getActivity(ab.getContext(), 0, (Intent)???, 0);
          locald.b(this.mContext.getString(b.c.dvp));
        }
        label485:
        ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.notification.b.a.class)).getNotification().notify(((Integer)localObject2).intValue(), locald.build());
      }
    }
  }
  
  public final int bf(final long paramLong)
  {
    GMTrace.i(18608080027648L, 138641);
    new Thread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18593987166208L, 138536);
        com.tencent.mm.plugin.downloader.e.a locala = e.bm(paramLong);
        if (locala == null)
        {
          GMTrace.o(18593987166208L, 138536);
          return;
        }
        com.tencent.mm.plugin.downloader.d.a.apz().vo(locala.field_downloadUrl);
        b.this.cancelNotification(locala.field_downloadUrl);
        if (locala.field_status != 5)
        {
          e.j(locala.field_downloadId, 5);
          b.this.kfj.bj(paramLong);
        }
        GMTrace.o(18593987166208L, 138536);
      }
    }).start();
    GMTrace.o(18608080027648L, 138641);
    return 1;
  }
  
  public final FileDownloadTaskInfo bg(long paramLong)
  {
    GMTrace.i(18608214245376L, 138642);
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    com.tencent.mm.plugin.downloader.e.a locala = e.bm(paramLong);
    if (locala != null)
    {
      CDNTaskState localCDNTaskState = com.tencent.mm.plugin.downloader.d.a.apz().vp(locala.field_downloadUrl);
      if ((locala.field_status != 1) || ((localCDNTaskState != null) && ((localCDNTaskState.taskState == 100) || (localCDNTaskState.taskState == 101)))) {
        break label159;
      }
    }
    label159:
    for (localFileDownloadTaskInfo.status = 0;; localFileDownloadTaskInfo.status = locala.field_status)
    {
      localFileDownloadTaskInfo.eJd = locala.field_downloadedSize;
      localFileDownloadTaskInfo.eJe = locala.field_totalSize;
      localFileDownloadTaskInfo.id = paramLong;
      localFileDownloadTaskInfo.eJD = locala.field_downloaderType;
      localFileDownloadTaskInfo.kfD = locala.field_autoDownload;
      localFileDownloadTaskInfo.path = locala.field_filePath;
      localFileDownloadTaskInfo.url = locala.field_downloadUrl;
      localFileDownloadTaskInfo.eDW = locala.field_md5;
      GMTrace.o(18608214245376L, 138642);
      return localFileDownloadTaskInfo;
    }
  }
  
  public final boolean bh(final long paramLong)
  {
    GMTrace.i(18608348463104L, 138643);
    new Thread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18599624310784L, 138578);
        w.d("MicroMsg.FileCDNDownloader", "pauseDownloadTask");
        FileDownloadTaskInfo localFileDownloadTaskInfo = b.this.bg(paramLong);
        if ((localFileDownloadTaskInfo != null) && (localFileDownloadTaskInfo.status == 1))
        {
          com.tencent.mm.plugin.downloader.d.a.apz().vn(localFileDownloadTaskInfo.url);
          e.j(localFileDownloadTaskInfo.id, 2);
          b.this.kfj.bk(paramLong);
          b.this.cancelNotification(localFileDownloadTaskInfo.url);
        }
        GMTrace.o(18599624310784L, 138578);
      }
    }).start();
    GMTrace.o(18608348463104L, 138643);
    return true;
  }
  
  public final boolean bi(final long paramLong)
  {
    GMTrace.i(18608482680832L, 138644);
    final com.tencent.mm.plugin.downloader.e.a locala = e.bm(paramLong);
    if ((locala != null) && (locala.field_status == 2))
    {
      new Thread(new Runnable()
      {
        public final void run()
        {
          long l = 0L;
          GMTrace.i(20093467623424L, 149708);
          int i = com.tencent.mm.plugin.downloader.d.a.apz().b(b.a(locala));
          w.i("MicroMsg.FileCDNDownloader", "resumeDownloadTask: " + i);
          locala.field_startTime = System.currentTimeMillis();
          locala.field_startState = d.kfa;
          locala.field_startSize = locala.field_downloadedSize;
          if (i == 0)
          {
            locala.field_status = 1;
            locala.field_errCode = 0;
            e.c(locala);
            b.this.kfj.j(paramLong, locala.field_filePath);
            if (locala.field_totalSize != 0L) {
              l = locala.field_downloadedSize / locala.field_totalSize;
            }
            b.this.b(locala.field_downloadUrl, 1, (int)l, true);
            GMTrace.o(20093467623424L, 149708);
            return;
          }
          if (i == -2)
          {
            locala.field_status = 1;
            locala.field_errCode = 0;
            e.c(locala);
            GMTrace.o(20093467623424L, 149708);
            return;
          }
          locala.field_status = 4;
          locala.field_errCode = d.keQ;
          e.c(locala);
          b.this.kfj.b(paramLong, locala.field_errCode, false);
          GMTrace.o(20093467623424L, 149708);
        }
      }).start();
      GMTrace.o(18608482680832L, 138644);
      return true;
    }
    GMTrace.o(18608482680832L, 138644);
    return false;
  }
  
  public final void cancelNotification(String paramString)
  {
    GMTrace.i(18608751116288L, 138646);
    synchronized (this.gCf)
    {
      Integer localInteger = (Integer)this.keE.get(paramString);
      if (localInteger == null)
      {
        w.i("MicroMsg.FileCDNDownloader", "No notification id found");
        GMTrace.o(18608751116288L, 138646);
        return;
      }
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(localInteger.intValue());
      w.i("MicroMsg.FileCDNDownloader", "cancelNotification, id = " + localInteger);
      this.keE.remove(paramString);
      GMTrace.o(18608751116288L, 138646);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
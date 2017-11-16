package com.tencent.mm.plugin.downloader.model;

import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.app.DownloadManager.Request;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.downloader.e.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class i
  extends j
{
  public aj htb;
  private DownloadManager kfE;
  public CopyOnWriteArraySet<Long> kfF;
  private Context mContext;
  
  public i(c paramc)
  {
    super(paramc);
    GMTrace.i(18602174447616L, 138597);
    this.htb = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(18593047642112L, 138529);
        i locali = i.this;
        com.tencent.mm.kernel.h.xB().A(new i.3(locali));
        locali = i.this;
        if ((locali.kfF == null) || (locali.kfF.size() == 0)) {}
        for (int i = 1; i == 0; i = 0)
        {
          i.this.htb.z(1000L, 1000L);
          GMTrace.o(18593047642112L, 138529);
          return false;
        }
        w.d("MicroMsg.FileDownloaderImpl23", "timer stop");
        GMTrace.o(18593047642112L, 138529);
        return false;
      }
    }, false);
    this.mContext = ab.getContext();
    this.kfE = ((DownloadManager)this.mContext.getSystemService("download"));
    this.kfF = new CopyOnWriteArraySet();
    GMTrace.o(18602174447616L, 138597);
  }
  
  private FileDownloadTaskInfo br(long paramLong)
  {
    GMTrace.i(18602845536256L, 138602);
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    Object localObject = new DownloadManager.Query();
    ((DownloadManager.Query)localObject).setFilterById(new long[] { paramLong });
    try
    {
      localObject = this.kfE.query((DownloadManager.Query)localObject);
      if (localObject == null)
      {
        w.e("MicroMsg.FileDownloaderImpl23", "query download status failed: cursor is null");
        GMTrace.o(18602845536256L, 138602);
        return localFileDownloadTaskInfo;
      }
    }
    catch (Exception localException1)
    {
      w.e("MicroMsg.FileDownloaderImpl23", "query downloadinfo from downloadmanager failed:%s, sysDownloadId:%d", new Object[] { localException1.toString(), Long.valueOf(paramLong) });
      GMTrace.o(18602845536256L, 138602);
      return localFileDownloadTaskInfo;
    }
    int i;
    int j;
    int k;
    int m;
    int n;
    if (localException1.moveToFirst())
    {
      i = localException1.getColumnIndex("status");
      j = localException1.getColumnIndex("uri");
      k = localException1.getColumnIndex("local_uri");
      m = localException1.getColumnIndex("bytes_so_far");
      n = localException1.getColumnIndex("total_size");
      if (i == -1) {}
    }
    try
    {
      switch (localException1.getInt(i))
      {
      case 1: 
      case 2: 
        for (;;)
        {
          if (j != -1) {
            localFileDownloadTaskInfo.url = localException1.getString(j);
          }
          if (k != -1)
          {
            String str = localException1.getString(k);
            if (bg.nm(str)) {
              break;
            }
            w.i("MicroMsg.FileDownloaderImpl23", "get download uri: [%s]", new Object[] { str });
            localFileDownloadTaskInfo.path = Uri.parse(str).getPath();
            w.i("MicroMsg.FileDownloaderImpl23", "get download path: [%s]", new Object[] { localFileDownloadTaskInfo.path });
          }
          if (m != -1) {
            localFileDownloadTaskInfo.eJd = localException1.getLong(m);
          }
          if (n != -1) {
            localFileDownloadTaskInfo.eJe = localException1.getLong(n);
          }
          localException1.close();
          w.i("MicroMsg.FileDownloaderImpl23", "querySysDownloadManager: id: %d, status: %d, url: %s, path: %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(localFileDownloadTaskInfo.status), localFileDownloadTaskInfo.url, localFileDownloadTaskInfo.path });
          GMTrace.o(18602845536256L, 138602);
          return localFileDownloadTaskInfo;
          localFileDownloadTaskInfo.status = 1;
        }
      }
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        w.e("MicroMsg.FileDownloaderImpl23", "query download info failed: [%s]", new Object[] { localException2.toString() });
        localFileDownloadTaskInfo.status = 4;
        continue;
        localFileDownloadTaskInfo.status = 4;
        continue;
        localFileDownloadTaskInfo.status = 2;
        continue;
        localFileDownloadTaskInfo.status = 3;
        continue;
        w.e("MicroMsg.FileDownloaderImpl23", "get download uri failed");
      }
    }
  }
  
  public final long a(final g paramg)
  {
    GMTrace.i(18602308665344L, 138598);
    if ((paramg == null) || (bg.nm(paramg.hJF)))
    {
      w.e("MicroMsg.FileDownloaderImpl23", "Invalid Request");
      GMTrace.o(18602308665344L, 138598);
      return -1L;
    }
    if (paramg.kfw)
    {
      w.e("MicroMsg.FileDownloaderImpl23", "autoDownloadTask not use system downloader, appid = %s", new Object[] { paramg.hyD });
      GMTrace.o(18602308665344L, 138598);
      return -1L;
    }
    String str = paramg.hJF;
    final Object localObject1 = "";
    Object localObject2 = e.vu(str);
    if (localObject2 != null)
    {
      localObject1 = br(((a)localObject2).field_sysDownloadId);
      if (((FileDownloadTaskInfo)localObject1).status == 1)
      {
        l = ((FileDownloadTaskInfo)localObject1).id;
        GMTrace.o(18602308665344L, 138598);
        return l;
      }
      localObject1 = ((a)localObject2).field_filePath;
      this.kfE.remove(new long[] { ((a)localObject2).field_sysDownloadId });
    }
    localObject2 = com.tencent.mm.compatible.util.h.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
    if (!bg.nm((String)localObject2))
    {
      localObject2 = new File((String)localObject2);
      if (!((File)localObject2).exists()) {
        w.i("MicroMsg.FileDownloaderImpl23", "download folder not exist, make new one : [%b]", new Object[] { Boolean.valueOf(((File)localObject2).mkdir()) });
      }
    }
    vD((String)localObject1);
    e.vs(str);
    e.vt(paramg.hyD);
    localObject1 = h.b(paramg);
    ((a)localObject1).field_downloadId = System.currentTimeMillis();
    ((a)localObject1).field_status = 0;
    ((a)localObject1).field_downloaderType = 1;
    str = aa.RP(str);
    ((a)localObject1).field_filePath = (com.tencent.mm.compatible.util.h.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + "/" + str);
    ((a)localObject1).field_startTime = System.currentTimeMillis();
    e.b((a)localObject1);
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18606737850368L, 138631);
        if (paramg.kfv)
        {
          String str = h.vC(localObject1.field_downloadUrl);
          localObject1.field_md5 = str;
        }
        long l = i.this.d(localObject1);
        if (l > 0L)
        {
          localObject1.field_sysDownloadId = l;
          localObject1.field_status = 1;
          e.c(localObject1);
          i.this.kfj.i(localObject1.field_downloadId, localObject1.field_filePath);
          f.apJ();
          if (f.bo(localObject1.field_downloadId))
          {
            f.apJ();
            f.j(localObject1.field_downloadId, l);
          }
          i.this.kfF.add(Long.valueOf(localObject1.field_downloadId));
          if (i.this.htb.bQn()) {
            i.this.htb.z(100L, 100L);
          }
          w.i("MicroMsg.FileDownloaderImpl23", "addDownloadTask: id: %d, url: %s, path: %s", new Object[] { Long.valueOf(localObject1.field_downloadId), localObject1.field_downloadUrl, localObject1.field_filePath });
          GMTrace.o(18606737850368L, 138631);
          return;
        }
        localObject1.field_status = 4;
        e.c(localObject1);
        i.this.kfj.b(localObject1.field_downloadId, d.keY, false);
        w.e("MicroMsg.FileDownloaderImpl23", "addDownloadTask Failed: Invalid downloadId");
        GMTrace.o(18606737850368L, 138631);
      }
    });
    long l = ((a)localObject1).field_downloadId;
    GMTrace.o(18602308665344L, 138598);
    return l;
  }
  
  public final int bf(long paramLong)
  {
    GMTrace.i(18602442883072L, 138599);
    f.apJ();
    int i;
    if (f.bo(paramLong))
    {
      f.apJ();
      paramLong = f.bp(paramLong);
      i = this.kfE.remove(new long[] { paramLong });
      GMTrace.o(18602442883072L, 138599);
      return i;
    }
    a locala = e.bm(paramLong);
    if (locala == null)
    {
      w.e("MicroMsg.FileDownloaderImpl23", "Invalid id");
      GMTrace.o(18602442883072L, 138599);
      return 0;
    }
    for (;;)
    {
      try
      {
        i = this.kfE.remove(new long[] { locala.field_sysDownloadId });
      }
      catch (Exception localException1)
      {
        try
        {
          w.i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: id: %d", new Object[] { Long.valueOf(paramLong) });
          b.deleteFile(locala.field_filePath);
          w.i("MicroMsg.FileDownloaderImpl23", "removeDownloadTask: path: %s", new Object[] { locala.field_filePath });
          locala.field_status = 5;
          e.c(locala);
          this.kfj.bj(paramLong);
          this.kfF.remove(Long.valueOf(paramLong));
          GMTrace.o(18602442883072L, 138599);
          return i;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        i = 0;
      }
      tmp208_205[0] = Long.valueOf(paramLong);
      Object[] tmp215_208 = tmp208_205;
      tmp215_208[1] = localException1.toString();
      w.e("MicroMsg.FileDownloaderImpl23", "remove task error:[%d], [%s]", tmp215_208);
    }
  }
  
  public final FileDownloadTaskInfo bg(long paramLong)
  {
    GMTrace.i(18602577100800L, 138600);
    f.apJ();
    if (f.bo(paramLong))
    {
      f.apJ();
      localObject = br(f.bp(paramLong));
      ((FileDownloadTaskInfo)localObject).id = paramLong;
      ((FileDownloadTaskInfo)localObject).eJD = 1;
      GMTrace.o(18602577100800L, 138600);
      return (FileDownloadTaskInfo)localObject;
    }
    Object localObject = e.bm(paramLong);
    if (localObject == null)
    {
      localObject = new FileDownloadTaskInfo();
      GMTrace.o(18602577100800L, 138600);
      return (FileDownloadTaskInfo)localObject;
    }
    if ((((a)localObject).field_status == 4) || (((a)localObject).field_status == 2) || (((a)localObject).field_status == 5) || (((a)localObject).field_status == 3)) {
      this.kfF.remove(Long.valueOf(paramLong));
    }
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    localFileDownloadTaskInfo.id = ((a)localObject).field_downloadId;
    localFileDownloadTaskInfo.url = ((a)localObject).field_downloadUrl;
    localFileDownloadTaskInfo.status = ((a)localObject).field_status;
    localFileDownloadTaskInfo.path = ((a)localObject).field_filePath;
    localFileDownloadTaskInfo.eDW = ((a)localObject).field_md5;
    localFileDownloadTaskInfo.kfD = ((a)localObject).field_autoDownload;
    localFileDownloadTaskInfo.eJD = ((a)localObject).field_downloaderType;
    localFileDownloadTaskInfo.eJd = ((a)localObject).field_downloadedSize;
    localFileDownloadTaskInfo.eJe = ((a)localObject).field_totalSize;
    GMTrace.o(18602577100800L, 138600);
    return localFileDownloadTaskInfo;
  }
  
  public final boolean bh(long paramLong)
  {
    GMTrace.i(18602979753984L, 138603);
    FileDownloadTaskInfo localFileDownloadTaskInfo = bg(paramLong);
    if (localFileDownloadTaskInfo == null)
    {
      w.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, record not found", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(18602979753984L, 138603);
      return false;
    }
    this.kfF.remove(Long.valueOf(paramLong));
    if (localFileDownloadTaskInfo.status != 1)
    {
      w.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, Task is not running", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(18602979753984L, 138603);
      return true;
    }
    int i = bf(paramLong);
    w.i("MicroMsg.FileDownloaderImpl23", "pauseDownloadTask: %d, Task removed: %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(i) });
    if (i > 0)
    {
      GMTrace.o(18602979753984L, 138603);
      return true;
    }
    GMTrace.o(18602979753984L, 138603);
    return false;
  }
  
  public final boolean bi(long paramLong)
  {
    GMTrace.i(18603113971712L, 138604);
    a locala = e.bm(paramLong);
    if (locala == null)
    {
      w.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, record not found", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(18603113971712L, 138604);
      return false;
    }
    if (locala.field_downloaderType != 1)
    {
      w.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, downloader not matched", new Object[] { Long.valueOf(paramLong) });
      b.deleteFile(locala.field_filePath);
      e.bn(paramLong);
      GMTrace.o(18603113971712L, 138604);
      return false;
    }
    if (locala.field_status == 1)
    {
      w.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, not in paused status", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(18603113971712L, 138604);
      return false;
    }
    this.kfE.remove(new long[] { locala.field_sysDownloadId });
    paramLong = d(locala);
    if (paramLong > 0L)
    {
      this.kfF.add(Long.valueOf(locala.field_downloadId));
      if (this.htb.bQn()) {
        this.htb.z(100L, 100L);
      }
      locala.field_sysDownloadId = paramLong;
      locala.field_status = 1;
      e.c(locala);
      GMTrace.o(18603113971712L, 138604);
      return true;
    }
    w.i("MicroMsg.FileDownloaderImpl23", "resumeDownloadTask: %d, restart failed");
    GMTrace.o(18603113971712L, 138604);
    return false;
  }
  
  public final long d(a parama)
  {
    GMTrace.i(18602711318528L, 138601);
    try
    {
      DownloadManager.Request localRequest = new DownloadManager.Request(Uri.parse(parama.field_downloadUrl));
      localRequest.setAllowedNetworkTypes(3);
      localRequest.setShowRunningNotification(parama.field_showNotification);
      localRequest.setVisibleInDownloadsUi(parama.field_showNotification);
      if (!bg.nm(parama.field_fileName)) {
        localRequest.setTitle(parama.field_fileName);
      }
      localRequest.setDestinationUri(Uri.fromFile(new File(parama.field_filePath)));
      long l = this.kfE.enqueue(localRequest);
      if (l > 0L)
      {
        GMTrace.o(18602711318528L, 138601);
        return l;
      }
      w.e("MicroMsg.FileDownloaderImpl23", "addToSysDownloadManager Failed: Invalid downloadId");
      GMTrace.o(18602711318528L, 138601);
      return -1L;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.FileDownloaderImpl23", "Add download task failed: %s, url: %s", new Object[] { localException.toString(), parama.field_downloadUrl });
      GMTrace.o(18602711318528L, 138601);
    }
    return -1L;
  }
  
  public final void g(Long paramLong)
  {
    GMTrace.i(18603248189440L, 138605);
    w.d("MicroMsg.FileDownloaderImpl23", "updateDownloadStatus");
    locala = e.bm(paramLong.longValue());
    if (locala == null)
    {
      GMTrace.o(18603248189440L, 138605);
      return;
    }
    Object localObject1 = new DownloadManager.Query();
    ((DownloadManager.Query)localObject1).setFilterById(new long[] { locala.field_sysDownloadId });
    try
    {
      localObject1 = this.kfE.query((DownloadManager.Query)localObject1);
      if (localObject1 == null)
      {
        w.e("MicroMsg.FileDownloaderImpl23", "query download status failed: cursor is null");
        this.kfF.remove(paramLong);
        locala.field_status = 4;
        e.c(locala);
        GMTrace.o(18603248189440L, 138605);
        return;
      }
    }
    catch (Exception localException1)
    {
      w.e("MicroMsg.FileDownloaderImpl23", "query downloadinfo from downloadmanager failed:%s, sysDownloadId:%d", new Object[] { localException1.toString(), paramLong });
      this.kfF.remove(paramLong);
      locala.field_status = 4;
      e.c(locala);
      GMTrace.o(18603248189440L, 138605);
      return;
    }
    int m;
    int j;
    int k;
    if (localException1.moveToFirst())
    {
      m = localException1.getColumnIndex("status");
      i = localException1.getColumnIndex("local_uri");
      j = localException1.getColumnIndex("bytes_so_far");
      k = localException1.getColumnIndex("total_size");
      if (m == -1) {}
    }
    for (;;)
    {
      try
      {
        m = localException1.getInt(m);
        w.d("MicroMsg.FileDownloaderImpl23", "status = %d", new Object[] { Integer.valueOf(m) });
        switch (m)
        {
        }
      }
      catch (Exception localException2)
      {
        this.kfF.remove(paramLong);
        locala.field_status = 4;
        e.c(locala);
        w.e("MicroMsg.FileDownloaderImpl23", "query download info failed: [%s]", new Object[] { localException2.toString() });
        continue;
        this.kfF.remove(paramLong);
        i = d.keY;
        locala.field_status = 4;
        e.c(locala);
        this.kfj.b(paramLong.longValue(), i, false);
        continue;
        this.kfF.remove(paramLong);
        locala.field_status = 2;
        e.c(locala);
        this.kfj.bk(paramLong.longValue());
        continue;
        this.kfF.remove(paramLong);
        if (i == -1) {
          continue;
        }
        if ((!bg.nm(locala.field_filePath)) && (com.tencent.mm.a.e.aZ(locala.field_filePath))) {
          continue;
        }
        w.e("MicroMsg.FileDownloaderImpl23", "path not exists, path = %s", new Object[] { locala.field_filePath });
        locala.field_status = 4;
        e.c(locala);
        GMTrace.o(18603248189440L, 138605);
        return;
        Object localObject2 = new Intent();
        ((Intent)localObject2).setClass(ab.getContext(), FileDownloadService.class);
        ((Intent)localObject2).putExtra(FileDownloadService.EXTRA_ID, locala.field_downloadId);
        ((Intent)localObject2).putExtra(FileDownloadService.kfz, 1);
        localObject2 = ab.getContext().startService((Intent)localObject2);
        w.d("MicroMsg.FileDownloaderImpl23", "start download service: " + ((ComponentName)localObject2).getClassName() + ", " + ((ComponentName)localObject2).getPackageName());
        continue;
      }
      localException1.close();
      GMTrace.o(18603248189440L, 138605);
      return;
      if (j != -1) {
        locala.field_downloadedSize = localException1.getLong(j);
      }
      if (k != -1) {
        locala.field_totalSize = localException1.getLong(k);
      }
      locala.field_status = 1;
      e.c(locala);
      this.kfj.bl(paramLong.longValue());
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
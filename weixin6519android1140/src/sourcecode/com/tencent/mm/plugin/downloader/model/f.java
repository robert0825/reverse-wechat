package com.tencent.mm.plugin.downloader.model;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.app.y.d;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.hd;
import com.tencent.mm.g.a.hd.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsimple.al;
import com.tencent.mm.plugin.downloader.b.c;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aj;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class f
{
  public static Map<Long, Long> kfc;
  private static int kfi;
  private static f kfk;
  o kfd;
  private o kfe;
  private o kff;
  private o kfg;
  private o kfh;
  public c kfj;
  
  static
  {
    GMTrace.i(18614388260864L, 138688);
    kfc = new HashMap();
    kfi = 2;
    GMTrace.o(18614388260864L, 138688);
  }
  
  private f()
  {
    GMTrace.i(18611569688576L, 138667);
    apO();
    if (h.xw().wL())
    {
      h.xw();
      if (!com.tencent.mm.kernel.a.wF())
      {
        kfi = bg.getInt(((com.tencent.mm.plugin.zero.b.a)h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("FileDownloaderType"), 2);
        w.i("MicroMsg.FileDownloadManager", "get downloader type from dynamic config = %d", new Object[] { Integer.valueOf(kfi) });
      }
    }
    for (;;)
    {
      this.kfj = new c();
      GMTrace.o(18611569688576L, 138667);
      return;
      w.i("MicroMsg.FileDownloadManager", "not login, use the default tmassist downloader");
    }
  }
  
  public static void a(String paramString1, String paramString2, PendingIntent paramPendingIntent)
  {
    GMTrace.i(18613582954496L, 138682);
    y.d locald = new y.d(ab.getContext());
    locald.a(paramString1);
    locald.b(paramString2);
    locald.L(17301634);
    locald.o(true);
    if (paramPendingIntent != null) {}
    for (locald.rg = paramPendingIntent;; locald.rg = PendingIntent.getActivity(ab.getContext(), 0, paramString1, 0))
    {
      ((com.tencent.mm.plugin.notification.b.a)h.j(com.tencent.mm.plugin.notification.b.a.class)).getNotification().b(locald.build());
      w.i("MicroMsg.FileDownloadManager", "show notification");
      GMTrace.o(18613582954496L, 138682);
      return;
      paramString1 = new Intent();
    }
  }
  
  public static f apJ()
  {
    GMTrace.i(18611435470848L, 138666);
    if (kfk == null) {
      kfk = new f();
    }
    f localf = kfk;
    GMTrace.o(18611435470848L, 138666);
    return localf;
  }
  
  private o apK()
  {
    GMTrace.i(18611703906304L, 138668);
    w.i("MicroMsg.FileDownloadManager", "mDownloaderType = " + kfi);
    if (this.kfd != null)
    {
      localObject = this.kfd;
      GMTrace.o(18611703906304L, 138668);
      return (o)localObject;
    }
    Object localObject = new hd();
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    int i = ((hd)localObject).eKq.eJD;
    if (i > 0) {
      kfi = i;
    }
    if (kfi == 1) {}
    for (this.kfd = apL();; this.kfd = this.kfg)
    {
      localObject = this.kfd;
      GMTrace.o(18611703906304L, 138668);
      return (o)localObject;
      if (this.kfg == null) {
        this.kfg = new l(this.kfj);
      }
    }
  }
  
  private static void apO()
  {
    GMTrace.i(18613314519040L, 138680);
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("off_line_download_ids", 0);
    if (localSharedPreferences == null)
    {
      GMTrace.o(18613314519040L, 138680);
      return;
    }
    Object localObject = localSharedPreferences.getAll();
    if ((localObject == null) || (((Map)localObject).size() == 0))
    {
      GMTrace.o(18613314519040L, 138680);
      return;
    }
    kfc.clear();
    localObject = ((Map)localObject).entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)((Iterator)localObject).next();
      if ((localEntry1 != null) && (!bg.nm((String)localEntry1.getKey()))) {
        try
        {
          long l1 = bg.getLong((String)localEntry1.getKey(), 0L);
          long l2 = ((Long)localEntry1.getValue()).longValue();
          long l3 = System.currentTimeMillis() - l1;
          if ((l3 - l1 > 0L) && (l3 - l1 < 86400000L)) {
            kfc.put(Long.valueOf(l1), Long.valueOf(l2));
          }
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.FileDownloadManager", "parse download task failed: " + localException.toString());
          w.printErrStackTrace("MicroMsg.FileDownloadManager", localException, "", new Object[0]);
        }
      }
    }
    localSharedPreferences.edit().clear();
    localObject = kfc.entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)((Iterator)localObject).next();
      localSharedPreferences.edit().putLong(localEntry2.getKey(), ((Long)localEntry2.getValue()).longValue());
    }
    localSharedPreferences.edit().commit();
    GMTrace.o(18613314519040L, 138680);
  }
  
  public static PendingIntent bM(String paramString1, String paramString2)
  {
    GMTrace.i(18614254043136L, 138687);
    Intent localIntent = new Intent();
    Context localContext = ab.getContext();
    localIntent.setClass(localContext, FileDownloadService.class);
    localIntent.putExtra(FileDownloadService.kfz, 3);
    localIntent.putExtra(FileDownloadService.kfA, paramString1);
    localIntent.putExtra(FileDownloadService.kfB, paramString2);
    paramString1 = PendingIntent.getService(localContext, (int)System.currentTimeMillis(), localIntent, 0);
    GMTrace.o(18614254043136L, 138687);
    return paramString1;
  }
  
  static boolean bo(long paramLong)
  {
    GMTrace.i(18613717172224L, 138683);
    boolean bool = kfc.containsKey(Long.valueOf(paramLong));
    GMTrace.o(18613717172224L, 138683);
    return bool;
  }
  
  static long bp(long paramLong)
  {
    GMTrace.i(18613985607680L, 138685);
    Long localLong = (Long)kfc.get(Long.valueOf(paramLong));
    if (localLong == null)
    {
      GMTrace.o(18613985607680L, 138685);
      return -1L;
    }
    paramLong = localLong.longValue();
    GMTrace.o(18613985607680L, 138685);
    return paramLong;
  }
  
  static void j(long paramLong1, long paramLong2)
  {
    GMTrace.i(18613851389952L, 138684);
    kfc.put(Long.valueOf(paramLong1), Long.valueOf(paramLong2));
    ab.getContext().getSharedPreferences("off_line_download_ids", 0).edit().putLong(String.valueOf(paramLong1), paramLong2).commit();
    GMTrace.o(18613851389952L, 138684);
  }
  
  public static ArrayList<FileDownloadTaskInfo> q(ArrayList<String> paramArrayList)
  {
    ArrayList localArrayList = null;
    GMTrace.i(18612911865856L, 138677);
    Object localObject = e.yQ();
    label45:
    FileDownloadTaskInfo localFileDownloadTaskInfo;
    if (localObject == null)
    {
      paramArrayList = localArrayList;
      localArrayList = new ArrayList();
      if ((paramArrayList == null) || (paramArrayList.size() <= 0)) {
        break label286;
      }
      paramArrayList = paramArrayList.iterator();
      if (!paramArrayList.hasNext()) {
        break label286;
      }
      localObject = (com.tencent.mm.plugin.downloader.e.a)paramArrayList.next();
      localFileDownloadTaskInfo = new FileDownloadTaskInfo();
      if ((((com.tencent.mm.plugin.downloader.e.a)localObject).field_status != 3) || (com.tencent.mm.a.e.aZ(((com.tencent.mm.plugin.downloader.e.a)localObject).field_filePath))) {
        break label275;
      }
    }
    label275:
    for (localFileDownloadTaskInfo.status = 0;; localFileDownloadTaskInfo.status = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_status)
    {
      localFileDownloadTaskInfo.appId = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_appId;
      localFileDownloadTaskInfo.id = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_downloadId;
      localFileDownloadTaskInfo.url = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_downloadUrl;
      localFileDownloadTaskInfo.path = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_filePath;
      localFileDownloadTaskInfo.eDW = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_md5;
      localFileDownloadTaskInfo.eJd = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_downloadedSize;
      localFileDownloadTaskInfo.eJe = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_totalSize;
      localFileDownloadTaskInfo.kfD = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_autoDownload;
      localFileDownloadTaskInfo.eJD = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_downloaderType;
      localArrayList.add(localFileDownloadTaskInfo);
      break label45;
      paramArrayList = com.tencent.mm.plugin.downloader.e.b.r(paramArrayList);
      localObject = ((com.tencent.mm.plugin.downloader.e.b)localObject).rawQuery("select * from FileDownloadInfo where " + paramArrayList, new String[0]);
      paramArrayList = localArrayList;
      if (localObject == null) {
        break;
      }
      localArrayList = new ArrayList();
      if (((Cursor)localObject).moveToFirst()) {
        do
        {
          paramArrayList = new com.tencent.mm.plugin.downloader.e.a();
          paramArrayList.b((Cursor)localObject);
          localArrayList.add(paramArrayList);
        } while (((Cursor)localObject).moveToNext());
      }
      paramArrayList = localArrayList;
      if (localObject == null) {
        break;
      }
      ((Cursor)localObject).close();
      paramArrayList = localArrayList;
      break;
    }
    label286:
    GMTrace.o(18612911865856L, 138677);
    return localArrayList;
  }
  
  public static void vx(String paramString)
  {
    GMTrace.i(18613448736768L, 138681);
    w.i("MicroMsg.FileDownloadManager", "APK File Path: %s", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      GMTrace.o(18613448736768L, 138681);
      return;
    }
    paramString = Uri.fromFile(new File(paramString));
    q.e(ab.getContext(), paramString);
    GMTrace.o(18613448736768L, 138681);
  }
  
  public final long a(g paramg)
  {
    GMTrace.i(18612240777216L, 138672);
    w.i("MicroMsg.FileDownloadManager", "addDownloadTask, appId = %s", new Object[] { paramg.hyD });
    if (h.xw().wL())
    {
      h.xw();
      if (!com.tencent.mm.kernel.a.wF())
      {
        l = apK().a(paramg);
        GMTrace.o(18612240777216L, 138672);
        return l;
      }
    }
    long l = apL().a(paramg);
    if (l >= 0L)
    {
      kfc.put(Long.valueOf(l), Long.valueOf(0L));
      ab.getContext().getSharedPreferences("off_line_download_ids", 0).edit().putLong(String.valueOf(l), 0L).commit();
      w.i("MicroMsg.FileDownloadManager", "Add id: %d to offline ids", new Object[] { Long.valueOf(l) });
      GMTrace.o(18612240777216L, 138672);
      return l;
    }
    w.i("MicroMsg.FileDownloadManager", "add download task to system downloader failed, use browser to download it");
    apM().a(paramg);
    GMTrace.o(18612240777216L, 138672);
    return l;
  }
  
  public final o apL()
  {
    GMTrace.i(18611838124032L, 138669);
    if (this.kff == null) {
      this.kff = new i(this.kfj);
    }
    o localo = this.kff;
    GMTrace.o(18611838124032L, 138669);
    return localo;
  }
  
  public final o apM()
  {
    GMTrace.i(18611972341760L, 138670);
    if (this.kfe == null) {
      this.kfe = new k(this.kfj);
    }
    o localo = this.kfe;
    GMTrace.o(18611972341760L, 138670);
    return localo;
  }
  
  public final o apN()
  {
    GMTrace.i(18612106559488L, 138671);
    if (this.kfh == null) {
      this.kfh = new b(this.kfj);
    }
    o localo = this.kfh;
    GMTrace.o(18612106559488L, 138671);
    return localo;
  }
  
  public final int bf(long paramLong)
  {
    GMTrace.i(18612374994944L, 138673);
    w.i("MicroMsg.FileDownloadManager", "removeDownloadTask, id = " + paramLong);
    if (bo(paramLong))
    {
      i = apL().bf(paramLong);
      GMTrace.o(18612374994944L, 138673);
      return i;
    }
    com.tencent.mm.plugin.downloader.e.a locala = e.bm(paramLong);
    if ((locala != null) && (locala.field_downloaderType == 3))
    {
      i = apN().bf(paramLong);
      GMTrace.o(18612374994944L, 138673);
      return i;
    }
    int i = apK().bf(paramLong);
    GMTrace.o(18612374994944L, 138673);
    return i;
  }
  
  public final FileDownloadTaskInfo bg(long paramLong)
  {
    GMTrace.i(18612509212672L, 138674);
    Object localObject;
    if (bo(paramLong))
    {
      localObject = apL().bg(paramLong);
      GMTrace.o(18612509212672L, 138674);
      return (FileDownloadTaskInfo)localObject;
    }
    com.tencent.mm.plugin.downloader.e.a locala = e.bm(paramLong);
    if ((locala != null) && (locala.field_status == 3) && (com.tencent.mm.a.e.aZ(locala.field_filePath)))
    {
      localObject = new FileDownloadTaskInfo();
      ((FileDownloadTaskInfo)localObject).id = paramLong;
      ((FileDownloadTaskInfo)localObject).url = locala.field_downloadUrl;
      ((FileDownloadTaskInfo)localObject).status = 3;
      ((FileDownloadTaskInfo)localObject).path = locala.field_filePath;
      ((FileDownloadTaskInfo)localObject).eDW = locala.field_md5;
      ((FileDownloadTaskInfo)localObject).eJd = locala.field_downloadedSize;
      ((FileDownloadTaskInfo)localObject).eJe = locala.field_totalSize;
      ((FileDownloadTaskInfo)localObject).kfD = locala.field_autoDownload;
      ((FileDownloadTaskInfo)localObject).eJD = locala.field_downloaderType;
    }
    for (;;)
    {
      w.i("MicroMsg.FileDownloadManager", "getDownloadTaskInfo: id: %d, url: %s, status: %d, path: %s, md5: %s, totalsize: %d, autodownload: %b, downloaderType: %d", new Object[] { Long.valueOf(((FileDownloadTaskInfo)localObject).id), ((FileDownloadTaskInfo)localObject).url, Integer.valueOf(((FileDownloadTaskInfo)localObject).status), ((FileDownloadTaskInfo)localObject).path, ((FileDownloadTaskInfo)localObject).eDW, Long.valueOf(((FileDownloadTaskInfo)localObject).eJe), Boolean.valueOf(((FileDownloadTaskInfo)localObject).kfD), Integer.valueOf(((FileDownloadTaskInfo)localObject).eJD) });
      GMTrace.o(18612509212672L, 138674);
      return (FileDownloadTaskInfo)localObject;
      if ((locala != null) && (locala.field_downloaderType == 3))
      {
        localObject = apN().bg(paramLong);
      }
      else
      {
        FileDownloadTaskInfo localFileDownloadTaskInfo = apK().bg(paramLong);
        localObject = localFileDownloadTaskInfo;
        if (locala != null)
        {
          localFileDownloadTaskInfo.kfD = locala.field_autoDownload;
          localFileDownloadTaskInfo.eJD = locala.field_downloaderType;
          localObject = localFileDownloadTaskInfo;
        }
      }
    }
  }
  
  public final boolean bh(long paramLong)
  {
    GMTrace.i(18613046083584L, 138678);
    w.i("MicroMsg.FileDownloadManager", "pauseDownloadTask, id = " + paramLong);
    if (bo(paramLong))
    {
      bool = apL().bh(paramLong);
      GMTrace.o(18613046083584L, 138678);
      return bool;
    }
    com.tencent.mm.plugin.downloader.e.a locala = e.bm(paramLong);
    if ((locala != null) && (locala.field_downloaderType == 3))
    {
      bool = apN().bh(paramLong);
      GMTrace.o(18613046083584L, 138678);
      return bool;
    }
    boolean bool = apK().bh(paramLong);
    GMTrace.o(18613046083584L, 138678);
    return bool;
  }
  
  public final boolean bi(long paramLong)
  {
    GMTrace.i(18613180301312L, 138679);
    w.i("MicroMsg.FileDownloadManager", "resumeDownloadTask, id = " + paramLong);
    if (bo(paramLong))
    {
      bool = apL().bi(paramLong);
      GMTrace.o(18613180301312L, 138679);
      return bool;
    }
    com.tencent.mm.plugin.downloader.e.a locala = e.bm(paramLong);
    if ((locala != null) && (locala.field_downloaderType == 3))
    {
      bool = apN().bi(paramLong);
      GMTrace.o(18613180301312L, 138679);
      return bool;
    }
    boolean bool = apK().bi(paramLong);
    GMTrace.o(18613180301312L, 138679);
    return bool;
  }
  
  final void f(final long paramLong, boolean paramBoolean)
  {
    GMTrace.i(18614119825408L, 138686);
    w.d("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded id[%d], stack[%s]", new Object[] { Long.valueOf(paramLong), bg.bQW() });
    final Object localObject = ab.getContext();
    if (bo(paramLong))
    {
      localObject = bg(paramLong);
      this.kfj.b(paramLong, ((FileDownloadTaskInfo)localObject).path, paramBoolean);
      GMTrace.o(18614119825408L, 138686);
      return;
    }
    final com.tencent.mm.plugin.downloader.e.a locala = e.bm(paramLong);
    if (locala == null)
    {
      GMTrace.o(18614119825408L, 138686);
      return;
    }
    if (bg.nm(locala.field_packageName))
    {
      String str = q.OE(locala.field_filePath);
      if (!bg.nm(str))
      {
        locala.field_packageName = str;
        w.i("MicroMsg.FileDownloadManager", "get package name from file : %s, %s", new Object[] { locala.field_filePath, str });
        e.c(locala);
      }
    }
    final int i = q.OF(locala.field_filePath);
    w.d("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded field_packageName[%s], field_filePath[%s], versionCode[%d]", new Object[] { locala.field_packageName, locala.field_filePath, Integer.valueOf(i) });
    h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18594255601664L, 138538);
        new al(locala.field_packageName, i).a(h.xx().fYr.gus, new com.tencent.mm.ad.e()
        {
          public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
          {
            GMTrace.i(18593316077568L, 138531);
            paramAnonymous2k.guc = true;
            if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0))
            {
              w.w("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded get pkg sig error");
              com.tencent.mm.plugin.report.service.g.ork.a(322L, 28L, 1L, false);
              com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(4028), String.format("%s,%s,%d,%d", new Object[] { f.1.this.keG.field_packageName, f.1.this.keG.field_filePath, Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) }) });
            }
            for (;;)
            {
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(18593718730752L, 138534);
                  PendingIntent localPendingIntent = null;
                  if (f.1.this.keG.field_fileType == 1) {
                    localPendingIntent = f.bM(f.1.this.keG.field_filePath, f.1.this.keG.field_md5);
                  }
                  String str;
                  if ((f.1.this.keG.field_showNotification) && (bg.nm(f.1.this.keG.field_fileName)))
                  {
                    str = f.1.this.keG.field_downloadUrl;
                    f.a(f.1.this.val$context.getString(b.c.kdW), "", localPendingIntent);
                  }
                  for (;;)
                  {
                    if ((f.1.this.keG.field_autoInstall) && (f.1.this.keG.field_fileType == 1)) {
                      f.vx(f.1.this.keG.field_filePath);
                    }
                    f.this.kfj.b(f.1.this.keH, f.1.this.keG.field_filePath, f.1.this.keL);
                    GMTrace.o(18593718730752L, 138534);
                    return;
                    if ((f.1.this.keG.field_showNotification) && (!bg.nm(f.1.this.keG.field_fileName)))
                    {
                      str = f.1.this.keG.field_downloadUrl;
                      f.a(f.1.this.keG.field_fileName, f.1.this.val$context.getString(b.c.kdW), localPendingIntent);
                    }
                  }
                }
              });
              GMTrace.o(18593316077568L, 138531);
              return;
              paramAnonymous2String = MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "yyb_pkg_sig_prefs", 4).getString(f.1.this.keG.field_packageName, "");
              w.i("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded sig[%s]", new Object[] { paramAnonymous2String });
              if (!bg.nm(paramAnonymous2String))
              {
                try
                {
                  com.tencent.mm.c.c.b(new File(f.1.this.keG.field_filePath), paramAnonymous2String);
                  w.i("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded writeSecurityCode done");
                  com.tencent.mm.plugin.report.service.g.ork.a(322L, 25L, 1L, false);
                  com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(4025), String.format("%s,%s,%s", new Object[] { f.1.this.keG.field_packageName, f.1.this.keG.field_filePath, paramAnonymous2String }) });
                }
                catch (Exception paramAnonymous2String)
                {
                  w.w("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded writeSecurityCode e: " + paramAnonymous2String.getMessage());
                  com.tencent.mm.plugin.report.service.g.ork.a(322L, 27L, 1L, false);
                  com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(4027), String.format("%s,%s,%s", new Object[] { f.1.this.keG.field_packageName, f.1.this.keG.field_filePath, paramAnonymous2String.getMessage() }) });
                }
              }
              else
              {
                com.tencent.mm.plugin.report.service.g.ork.a(322L, 26L, 1L, false);
                com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(4026), String.format("%s,%s", new Object[] { f.1.this.keG.field_packageName, f.1.this.keG.field_filePath }) });
              }
            }
          }
        });
        GMTrace.o(18594255601664L, 138538);
      }
    });
    GMTrace.o(18614119825408L, 138686);
  }
  
  public final FileDownloadTaskInfo vv(String paramString)
  {
    GMTrace.i(18612643430400L, 138675);
    paramString = e.vr(paramString);
    if (paramString != null)
    {
      paramString = bg(paramString.field_downloadId);
      GMTrace.o(18612643430400L, 138675);
      return paramString;
    }
    paramString = new FileDownloadTaskInfo();
    GMTrace.o(18612643430400L, 138675);
    return paramString;
  }
  
  public final FileDownloadTaskInfo vw(String paramString)
  {
    GMTrace.i(18612777648128L, 138676);
    paramString = e.vu(paramString);
    if (paramString != null)
    {
      paramString = bg(paramString.field_downloadId);
      GMTrace.o(18612777648128L, 138676);
      return paramString;
    }
    paramString = new FileDownloadTaskInfo();
    GMTrace.o(18612777648128L, 138676);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.downloader.model;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.downloader.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public class FileDownloadService
  extends IntentService
{
  public static final String EXTRA_ID;
  public static final String EXTRA_PACKAGE_NAME;
  public static final String kfA;
  public static final String kfB;
  public static final String kfC;
  private static final String kfy;
  public static final String kfz;
  
  static
  {
    GMTrace.i(18607543156736L, 138637);
    kfy = FileDownloadService.class.getSimpleName() + "_extra_";
    EXTRA_ID = kfy + "id";
    kfz = kfy + "action_type";
    EXTRA_PACKAGE_NAME = kfy + "package_name";
    kfA = kfy + "file_path";
    kfB = kfy + "md5";
    kfC = kfy + "change_url";
    GMTrace.o(18607543156736L, 138637);
  }
  
  public FileDownloadService()
  {
    super("FileDownloadService");
    GMTrace.i(18607140503552L, 138634);
    GMTrace.o(18607140503552L, 138634);
  }
  
  private static boolean bN(String paramString1, String paramString2)
  {
    GMTrace.i(18607408939008L, 138636);
    File localFile = new File(paramString1);
    w.i("MicroMsg.FileDownloadService", "MD5 Check: %s, File Exists: %b", new Object[] { paramString1, Boolean.valueOf(localFile.exists()) });
    long l = System.currentTimeMillis();
    paramString1 = com.tencent.mm.a.g.h(localFile);
    w.i("MicroMsg.FileDownloadService", "MD5 Check Time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    w.i("MicroMsg.FileDownloadService", "Original MD5: %s, Calculated MD5: %s", new Object[] { paramString2, paramString1 });
    if (bg.nm(paramString2))
    {
      bool = localFile.exists();
      GMTrace.o(18607408939008L, 138636);
      return bool;
    }
    if (bg.nm(paramString1))
    {
      w.i("MicroMsg.FileDownloadService", "check from file failed, may caused by low memory while checking md5");
      bool = localFile.exists();
      GMTrace.o(18607408939008L, 138636);
      return bool;
    }
    boolean bool = paramString2.equalsIgnoreCase(paramString1);
    GMTrace.o(18607408939008L, 138636);
    return bool;
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    GMTrace.i(18607274721280L, 138635);
    if (paramIntent == null)
    {
      GMTrace.o(18607274721280L, 138635);
      return;
    }
    int i = paramIntent.getIntExtra(kfz, 0);
    w.i("MicroMsg.FileDownloadService", "handle intent type : %d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    }
    for (;;)
    {
      GMTrace.o(18607274721280L, 138635);
      return;
      long l = paramIntent.getLongExtra(EXTRA_ID, -1L);
      boolean bool = paramIntent.getBooleanExtra(kfC, false);
      if (l < 0L)
      {
        w.e("MicroMsg.FileDownloadService", "Invalid id");
        GMTrace.o(18607274721280L, 138635);
        return;
      }
      if (h.xw().wL())
      {
        h.xw();
        if (!com.tencent.mm.kernel.a.wF()) {}
      }
      else
      {
        w.d("MicroMsg.FileDownloadService", "no user login");
        GMTrace.o(18607274721280L, 138635);
        return;
      }
      Object localObject2 = e.bm(l);
      if (localObject2 != null)
      {
        w.i("MicroMsg.FileDownloadService", "filePath = " + ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_filePath);
        if ((bg.nm(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_filePath)) || (!com.tencent.mm.a.e.aZ(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_filePath)))
        {
          com.tencent.mm.plugin.report.service.g.ork.a(710L, 5L, 1L, false);
          w.i("MicroMsg.FileDownloadService", "file not exists, appid = " + ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_appId);
          GMTrace.o(18607274721280L, 138635);
          return;
        }
        if (bg.nm(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_md5))
        {
          w.i("MicroMsg.FileDownloadService", "Invalid original md5, abort checking");
          ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_status = 3;
          e.c((com.tencent.mm.plugin.downloader.e.a)localObject2);
          f.apJ().f(l, bool);
          GMTrace.o(18607274721280L, 138635);
          return;
        }
        if (bN(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_filePath, ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_md5))
        {
          ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_status = 3;
          e.c((com.tencent.mm.plugin.downloader.e.a)localObject2);
          f.apJ().f(l, bool);
          GMTrace.o(18607274721280L, 138635);
          return;
        }
        paramIntent = "";
        try
        {
          String str1 = m.s(new File(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_filePath));
          paramIntent = str1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.FileDownloadService", "readChannelId exception : " + localException.getMessage());
          }
          paramIntent = f.apJ();
          localObject2 = e.bm(l);
          if (localObject2 == null) {
            break label728;
          }
        }
        ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_status = 4;
        ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_channelId = paramIntent;
        ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_errCode = d.keV;
        ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_downloadedSize = com.tencent.mm.a.e.aY(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_filePath);
        e.c((com.tencent.mm.plugin.downloader.e.a)localObject2);
        w.i("MicroMsg.FileDownloadService", "ChannelId = %s, receivedSize = %d, fileSize = %d", new Object[] { paramIntent, Long.valueOf(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_downloadedSize), Integer.valueOf(com.tencent.mm.a.e.aY(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_filePath)) });
        b.deleteFile(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_filePath);
        if ((am.isWifi(this)) && (!bool) && (!bg.nm(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_secondaryUrl)) && (((com.tencent.mm.plugin.downloader.e.a)localObject2).field_downloaderType != 3))
        {
          paramIntent = new g.a();
          paramIntent.vy(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_secondaryUrl);
          paramIntent.bq(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_fileSize);
          paramIntent.vA(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_fileName);
          paramIntent.setAppId(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_appId);
          paramIntent.vB(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_md5);
          paramIntent.dJ(true);
          paramIntent.mt(1);
          paramIntent.bE(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_packageName);
          l = f.apJ().a(paramIntent.kfx);
          w.i("MicroMsg.FileDownloadService", "MD5 check failed, restart download, id = " + l);
          GMTrace.o(18607274721280L, 138635);
          return;
        }
        localObject1 = ab.getContext();
        if ((!((com.tencent.mm.plugin.downloader.e.a)localObject2).field_showNotification) || (!bg.nm(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_fileName))) {
          break label737;
        }
        localObject2 = ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_downloadUrl;
        f.a(((Context)localObject1).getString(b.c.kdX), "", null);
      }
      for (;;)
      {
        paramIntent.kfj.b(l, d.keV, bool);
        label728:
        GMTrace.o(18607274721280L, 138635);
        return;
        label737:
        if ((((com.tencent.mm.plugin.downloader.e.a)localObject2).field_showNotification) && (!bg.nm(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_fileName)))
        {
          String str2 = ((com.tencent.mm.plugin.downloader.e.a)localObject2).field_downloadUrl;
          f.a(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_fileName, ((Context)localObject1).getString(b.c.kdX), null);
        }
      }
      Object localObject1 = paramIntent.getStringExtra(kfA);
      paramIntent = paramIntent.getStringExtra(kfB);
      if ((bg.nm((String)localObject1)) || (!com.tencent.mm.a.e.aZ((String)localObject1)))
      {
        w.i("MicroMsg.FileDownloadService", "Invalid file path, ignored");
        GMTrace.o(18607274721280L, 138635);
        return;
      }
      if ((bg.nm(paramIntent)) || (bN((String)localObject1, paramIntent)))
      {
        paramIntent = Uri.fromFile(new File((String)localObject1));
        localObject1 = new Intent("android.intent.action.VIEW");
        ((Intent)localObject1).setDataAndType(paramIntent, "application/vnd.android.package-archive");
        ((Intent)localObject1).addFlags(268435456);
        startActivity((Intent)localObject1);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\FileDownloadService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
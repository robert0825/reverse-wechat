package com.tencent.mm.plugin.tmassistant.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Looper;
import android.support.v4.app.y.d;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.fy;
import com.tencent.mm.g.a.gq;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.downloader.model.FileDownloadService;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e;
import com.tencent.mm.plugin.downloader.model.g;
import com.tencent.mm.plugin.downloader.model.h;
import com.tencent.mm.plugin.downloader.model.j;
import com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a
  extends j
{
  private byte[] gCf;
  public com.tencent.mm.sdk.platformtools.aj lUi;
  private TMAssistantDownloadSDKClient mClient;
  public Context mContext;
  private HashMap<String, Long> qzG;
  public HashMap<String, Long> qzH;
  private ConcurrentHashMap<String, Integer> qzI;
  public HashSet<Long> qzJ;
  public Map<String, String> qzK;
  private ITMAssistantDownloadSDKClientListener qzL;
  
  public a()
  {
    super(null);
    GMTrace.i(12848126230528L, 95726);
    this.mClient = null;
    this.qzK = null;
    this.gCf = new byte[0];
    this.lUi = new com.tencent.mm.sdk.platformtools.aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12852018544640L, 95755);
        if (!a.this.bsL()) {
          a.this.lUi.z(240000L, 240000L);
        }
        GMTrace.o(12852018544640L, 95755);
        return true;
      }
    }, false);
    this.qzL = new ITMAssistantDownloadSDKClientListener()
    {
      public final void OnDownloadSDKTaskProgressChanged(TMAssistantDownloadSDKClient paramAnonymousTMAssistantDownloadSDKClient, String paramAnonymousString, long paramAnonymousLong1, long paramAnonymousLong2)
      {
        GMTrace.i(12847992012800L, 95725);
        paramAnonymousTMAssistantDownloadSDKClient = (Long)a.this.qzH.get(paramAnonymousString);
        Long localLong = Long.valueOf(System.currentTimeMillis());
        if ((paramAnonymousTMAssistantDownloadSDKClient != null) && (localLong.longValue() - paramAnonymousTMAssistantDownloadSDKClient.longValue() < 500L))
        {
          GMTrace.o(12847992012800L, 95725);
          return;
        }
        a.this.qzH.put(paramAnonymousString, localLong);
        w.i("MicroMsg.FileDownloaderImplTMAssistant", "onProgressChanged");
        int i = (int)(100L * paramAnonymousLong1 / paramAnonymousLong2);
        a.this.b(paramAnonymousString, 2, i, false);
        paramAnonymousTMAssistantDownloadSDKClient = e.vu(paramAnonymousString);
        if (paramAnonymousTMAssistantDownloadSDKClient == null)
        {
          w.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadInfoByURL failed");
          GMTrace.o(12847992012800L, 95725);
          return;
        }
        e.d(paramAnonymousTMAssistantDownloadSDKClient.field_downloadId, paramAnonymousLong1, paramAnonymousLong2);
        a.M(7, paramAnonymousTMAssistantDownloadSDKClient.field_downloadId);
        GMTrace.o(12847992012800L, 95725);
      }
      
      public final void OnDownloadSDKTaskStateChanged(TMAssistantDownloadSDKClient paramAnonymousTMAssistantDownloadSDKClient, String paramAnonymousString1, int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString2, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(12847857795072L, 95724);
        w.i("MicroMsg.FileDownloaderImplTMAssistant", "OnDownloadSDKTaskStateChanged State: " + paramAnonymousInt1 + " | ErrorCode: " + paramAnonymousInt2 + " | ErrorMsg: " + paramAnonymousString2);
        paramAnonymousTMAssistantDownloadSDKClient = e.vu(paramAnonymousString1);
        if (paramAnonymousTMAssistantDownloadSDKClient == null)
        {
          w.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadInfoByURL failed");
          GMTrace.o(12847857795072L, 95724);
          return;
        }
        w.i("MicroMsg.FileDownloaderImplTMAssistant", "State: %d, Id: %d, Path: %s, File Exists: %b, URL: %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Long.valueOf(paramAnonymousTMAssistantDownloadSDKClient.field_downloadId), paramAnonymousTMAssistantDownloadSDKClient.field_filePath, Boolean.valueOf(new File(paramAnonymousTMAssistantDownloadSDKClient.field_filePath).exists()), paramAnonymousString1 });
        switch (paramAnonymousInt1)
        {
        }
        for (;;)
        {
          GMTrace.o(12847857795072L, 95724);
          return;
          GMTrace.o(12847857795072L, 95724);
          return;
          e.j(paramAnonymousTMAssistantDownloadSDKClient.field_downloadId, 1);
          GMTrace.o(12847857795072L, 95724);
          return;
          e.j(paramAnonymousTMAssistantDownloadSDKClient.field_downloadId, 2);
          a.this.cancelNotification(paramAnonymousString1);
          a.this.qzJ.remove(Long.valueOf(paramAnonymousTMAssistantDownloadSDKClient.field_downloadId));
          GMTrace.o(12847857795072L, 95724);
          return;
          w.i("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant Download Succeed event received");
          if (paramAnonymousBoolean2)
          {
            paramAnonymousString2 = new gq();
            paramAnonymousString2.eJK.appId = paramAnonymousTMAssistantDownloadSDKClient.field_appId;
            paramAnonymousString2.eJK.opType = 6;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousString2);
          }
          paramAnonymousString2 = new Intent();
          paramAnonymousString2.putExtra(FileDownloadService.kfz, 1);
          paramAnonymousString2.setClass(a.this.mContext, FileDownloadService.class);
          paramAnonymousString2.putExtra(FileDownloadService.EXTRA_ID, paramAnonymousTMAssistantDownloadSDKClient.field_downloadId);
          paramAnonymousString2.putExtra(FileDownloadService.kfC, paramAnonymousBoolean1);
          try
          {
            a.this.mContext.startService(paramAnonymousString2);
            a.this.cancelNotification(paramAnonymousString1);
            a.this.qzJ.remove(Long.valueOf(paramAnonymousTMAssistantDownloadSDKClient.field_downloadId));
            GMTrace.o(12847857795072L, 95724);
            return;
          }
          catch (Exception paramAnonymousString2)
          {
            for (;;)
            {
              w.e("MicroMsg.FileDownloaderImplTMAssistant", paramAnonymousString2.getMessage());
            }
          }
          a.this.b(paramAnonymousString1, paramAnonymousInt1, 0, false);
          a.this.qzJ.remove(Long.valueOf(paramAnonymousTMAssistantDownloadSDKClient.field_downloadId));
          paramAnonymousTMAssistantDownloadSDKClient.field_errCode = paramAnonymousInt2;
          paramAnonymousTMAssistantDownloadSDKClient.field_status = 4;
          e.c(paramAnonymousTMAssistantDownloadSDKClient);
          a.f(paramAnonymousTMAssistantDownloadSDKClient.field_downloadId, paramAnonymousInt2, paramAnonymousBoolean1);
          if ((paramAnonymousInt2 == 601) || (paramAnonymousInt2 == 602) || (paramAnonymousInt2 == 603) || (paramAnonymousInt2 == 605) || (paramAnonymousInt2 == 606))
          {
            w.d("MicroMsg.FileDownloaderImplTMAssistant", "releaseTimer 4 min");
            a.this.lUi.z(240000L, 240000L);
            GMTrace.o(12847857795072L, 95724);
            return;
            a.this.cancelNotification(paramAnonymousString1);
            a.this.qzJ.remove(Long.valueOf(paramAnonymousTMAssistantDownloadSDKClient.field_downloadId));
            e.j(paramAnonymousTMAssistantDownloadSDKClient.field_downloadId, 5);
            a.M(5, paramAnonymousTMAssistantDownloadSDKClient.field_downloadId);
          }
        }
      }
      
      public final void OnDwonloadSDKServiceInvalid(TMAssistantDownloadSDKClient paramAnonymousTMAssistantDownloadSDKClient)
      {
        GMTrace.i(12847723577344L, 95723);
        w.e("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant Service unavailable");
        paramAnonymousTMAssistantDownloadSDKClient = a.this.qzJ.iterator();
        while (paramAnonymousTMAssistantDownloadSDKClient.hasNext())
        {
          com.tencent.mm.plugin.downloader.e.a locala = e.bm(((Long)paramAnonymousTMAssistantDownloadSDKClient.next()).longValue());
          if (locala != null)
          {
            locala.field_status = 4;
            locala.field_errCode = d.keM;
            e.c(locala);
            a.f(locala.field_downloadId, d.keM, false);
            a.this.b(locala.field_downloadUrl, 5, 0, false);
          }
        }
        a.this.qzJ.clear();
        a.a(101, 0L, "");
        GMTrace.o(12847723577344L, 95723);
      }
    };
    this.mContext = ab.getContext();
    this.qzG = new HashMap();
    this.qzH = new HashMap();
    this.qzI = new ConcurrentHashMap();
    this.qzJ = new HashSet();
    HashMap localHashMap = new HashMap();
    String str2 = System.getProperty("http.agent");
    w.i("MicroMsg.FileDownloaderImplTMAssistant", str2);
    String str1 = str2;
    if (bg.nm(str2)) {
      str1 = "Mozilla/5.0 (Linux; Android) AppleWebkit (KHTML, like Gecko)";
    }
    str2 = str1 + " MicroMessenger";
    PackageInfo localPackageInfo = getPackageInfo(this.mContext, ab.getPackageName());
    str1 = str2;
    if (localPackageInfo != null)
    {
      str1 = str2 + "/";
      str1 = str1 + localPackageInfo.versionName;
      str1 = str1 + "." + localPackageInfo.versionCode;
    }
    str2 = am.getNetTypeString(ab.getContext());
    str1 = str1 + " NetType/" + str2;
    w.i("MicroMsg.FileDownloaderImplTMAssistant", "User-Agent: %s", new Object[] { str1 });
    localHashMap.put("User-Agent", str1);
    this.qzK = localHashMap;
    GMTrace.o(12848126230528L, 95726);
  }
  
  public static void M(int paramInt, long paramLong)
  {
    GMTrace.i(16084518305792L, 119839);
    a(paramInt, paramLong, "", 0, false);
    GMTrace.o(16084518305792L, 119839);
  }
  
  public static void a(int paramInt, long paramLong, String paramString)
  {
    GMTrace.i(12849468407808L, 95736);
    a(paramInt, paramLong, paramString, 0, false);
    GMTrace.o(12849468407808L, 95736);
  }
  
  private static void a(int paramInt1, long paramLong, String paramString, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(12849602625536L, 95737);
    fy localfy = new fy();
    localfy.eIW.eIX = paramInt1;
    localfy.eIW.id = paramLong;
    localfy.eIW.errCode = paramInt2;
    localfy.eIW.path = paramString;
    localfy.eIW.eIY = paramBoolean;
    com.tencent.mm.sdk.b.a.vgX.m(localfy);
    GMTrace.o(12849602625536L, 95737);
  }
  
  private static void bsM()
  {
    GMTrace.i(12849065754624L, 95733);
    File localFile = new File(TMAssistantFile.getSavePathRootDir() + "/.tmp/");
    if (!localFile.exists()) {
      w.i("MicroMsg.FileDownloaderImplTMAssistant", "Make download dir result: %b", new Object[] { Boolean.valueOf(localFile.mkdirs()) });
    }
    GMTrace.o(12849065754624L, 95733);
  }
  
  public static void f(long paramLong, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(18034299240448L, 134366);
    a(4, paramLong, "", paramInt, paramBoolean);
    GMTrace.o(18034299240448L, 134366);
  }
  
  private static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    GMTrace.i(12848931536896L, 95732);
    if (paramString == null)
    {
      w.e("MicroMsg.FileDownloaderImplTMAssistant", "getPackageInfo fail, packageName is null");
      GMTrace.o(12848931536896L, 95732);
      return null;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      GMTrace.o(12848931536896L, 95732);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      w.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", paramContext, "", new Object[0]);
      GMTrace.o(12848931536896L, 95732);
    }
    return null;
  }
  
  public final long a(final g paramg)
  {
    GMTrace.i(18034030804992L, 134364);
    if ((paramg == null) || (bg.nm(paramg.hJF)))
    {
      w.e("MicroMsg.FileDownloaderImplTMAssistant", "Invalid Request");
      GMTrace.o(18034030804992L, 134364);
      return -1L;
    }
    final String str1 = paramg.hJF;
    final String str2 = paramg.kfp;
    final long l = paramg.kfq;
    final Object localObject1 = paramg.hyD;
    Object localObject2 = e.vu(str1);
    if (localObject2 != null)
    {
      localObject2 = bg(((com.tencent.mm.plugin.downloader.e.a)localObject2).field_downloadId);
      if (((FileDownloadTaskInfo)localObject2).status == 1)
      {
        l = ((FileDownloadTaskInfo)localObject2).id;
        GMTrace.o(18034030804992L, 134364);
        return l;
      }
    }
    bsM();
    e.vs(str1);
    e.vt((String)localObject1);
    localObject1 = h.b(paramg);
    ((com.tencent.mm.plugin.downloader.e.a)localObject1).field_downloadId = System.currentTimeMillis();
    ((com.tencent.mm.plugin.downloader.e.a)localObject1).field_status = 0;
    ((com.tencent.mm.plugin.downloader.e.a)localObject1).field_downloaderType = 2;
    ((com.tencent.mm.plugin.downloader.e.a)localObject1).field_startTime = System.currentTimeMillis();
    e.b((com.tencent.mm.plugin.downloader.e.a)localObject1);
    at.xB().A(new Runnable()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: ldc2_w 56
        //   3: ldc 58
        //   5: invokestatic 48	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: aload_0
        //   9: getfield 28	com/tencent/mm/plugin/tmassistant/a/a$1:kfG	Lcom/tencent/mm/plugin/downloader/model/g;
        //   12: getfield 64	com/tencent/mm/plugin/downloader/model/g:kfv	Z
        //   15: ifeq +24 -> 39
        //   18: aload_0
        //   19: getfield 30	com/tencent/mm/plugin/tmassistant/a/a$1:keG	Lcom/tencent/mm/plugin/downloader/e/a;
        //   22: getfield 69	com/tencent/mm/plugin/downloader/e/a:field_downloadUrl	Ljava/lang/String;
        //   25: invokestatic 75	com/tencent/mm/plugin/downloader/model/h:vC	(Ljava/lang/String;)Ljava/lang/String;
        //   28: astore 4
        //   30: aload_0
        //   31: getfield 30	com/tencent/mm/plugin/tmassistant/a/a$1:keG	Lcom/tencent/mm/plugin/downloader/e/a;
        //   34: aload 4
        //   36: putfield 78	com/tencent/mm/plugin/downloader/e/a:field_md5	Ljava/lang/String;
        //   39: aload_0
        //   40: getfield 26	com/tencent/mm/plugin/tmassistant/a/a$1:qzO	Lcom/tencent/mm/plugin/tmassistant/a/a;
        //   43: invokevirtual 82	com/tencent/mm/plugin/tmassistant/a/a:getClient	()Lcom/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClient;
        //   46: aload_0
        //   47: getfield 32	com/tencent/mm/plugin/tmassistant/a/a$1:val$url	Ljava/lang/String;
        //   50: invokevirtual 88	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClient:getDownloadTaskState	(Ljava/lang/String;)Lcom/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo;
        //   53: astore 4
        //   55: aload 4
        //   57: ifnull +47 -> 104
        //   60: aload 4
        //   62: getfield 94	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo:mState	I
        //   65: iconst_4
        //   66: if_icmpne +38 -> 104
        //   69: aload 4
        //   71: getfield 97	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo:mSavePath	Ljava/lang/String;
        //   74: invokestatic 101	com/tencent/mm/plugin/tmassistant/a/a:vD	(Ljava/lang/String;)V
        //   77: ldc 103
        //   79: ldc 105
        //   81: iconst_2
        //   82: anewarray 4	java/lang/Object
        //   85: dup
        //   86: iconst_0
        //   87: aload 4
        //   89: getfield 108	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo:mUrl	Ljava/lang/String;
        //   92: aastore
        //   93: dup
        //   94: iconst_1
        //   95: aload 4
        //   97: getfield 97	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo:mSavePath	Ljava/lang/String;
        //   100: aastore
        //   101: invokestatic 113	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   104: aload_0
        //   105: getfield 26	com/tencent/mm/plugin/tmassistant/a/a$1:qzO	Lcom/tencent/mm/plugin/tmassistant/a/a;
        //   108: invokevirtual 82	com/tencent/mm/plugin/tmassistant/a/a:getClient	()Lcom/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClient;
        //   111: aload_0
        //   112: getfield 32	com/tencent/mm/plugin/tmassistant/a/a$1:val$url	Ljava/lang/String;
        //   115: invokevirtual 116	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClient:cancelDownloadTask	(Ljava/lang/String;)V
        //   118: aload_0
        //   119: getfield 26	com/tencent/mm/plugin/tmassistant/a/a$1:qzO	Lcom/tencent/mm/plugin/tmassistant/a/a;
        //   122: invokevirtual 82	com/tencent/mm/plugin/tmassistant/a/a:getClient	()Lcom/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClient;
        //   125: aload_0
        //   126: getfield 32	com/tencent/mm/plugin/tmassistant/a/a$1:val$url	Ljava/lang/String;
        //   129: aload_0
        //   130: getfield 34	com/tencent/mm/plugin/tmassistant/a/a$1:qzM	Ljava/lang/String;
        //   133: aload_0
        //   134: getfield 36	com/tencent/mm/plugin/tmassistant/a/a$1:qzN	J
        //   137: iconst_0
        //   138: ldc 118
        //   140: aload_0
        //   141: getfield 32	com/tencent/mm/plugin/tmassistant/a/a$1:val$url	Ljava/lang/String;
        //   144: invokestatic 123	com/tencent/mm/sdk/platformtools/aa:RP	(Ljava/lang/String;)Ljava/lang/String;
        //   147: aload_0
        //   148: getfield 26	com/tencent/mm/plugin/tmassistant/a/a$1:qzO	Lcom/tencent/mm/plugin/tmassistant/a/a;
        //   151: getfield 127	com/tencent/mm/plugin/tmassistant/a/a:qzK	Ljava/util/Map;
        //   154: invokevirtual 131	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClient:startDownloadTask	(Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)I
        //   157: istore_1
        //   158: iload_1
        //   159: ifne +238 -> 397
        //   162: aload_0
        //   163: getfield 26	com/tencent/mm/plugin/tmassistant/a/a$1:qzO	Lcom/tencent/mm/plugin/tmassistant/a/a;
        //   166: invokevirtual 82	com/tencent/mm/plugin/tmassistant/a/a:getClient	()Lcom/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClient;
        //   169: aload_0
        //   170: getfield 32	com/tencent/mm/plugin/tmassistant/a/a$1:val$url	Ljava/lang/String;
        //   173: invokevirtual 88	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadSDKClient:getDownloadTaskState	(Ljava/lang/String;)Lcom/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo;
        //   176: astore 4
        //   178: ldc 103
        //   180: ldc -123
        //   182: iconst_2
        //   183: anewarray 4	java/lang/Object
        //   186: dup
        //   187: iconst_0
        //   188: aload_0
        //   189: getfield 32	com/tencent/mm/plugin/tmassistant/a/a$1:val$url	Ljava/lang/String;
        //   192: aastore
        //   193: dup
        //   194: iconst_1
        //   195: aload 4
        //   197: getfield 97	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo:mSavePath	Ljava/lang/String;
        //   200: aastore
        //   201: invokestatic 113	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   204: aload_0
        //   205: getfield 30	com/tencent/mm/plugin/tmassistant/a/a$1:keG	Lcom/tencent/mm/plugin/downloader/e/a;
        //   208: getfield 136	com/tencent/mm/plugin/downloader/e/a:field_downloadId	J
        //   211: lstore_2
        //   212: aload 4
        //   214: getfield 97	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo:mSavePath	Ljava/lang/String;
        //   217: astore 5
        //   219: invokestatic 142	com/tencent/mm/plugin/downloader/model/e:yQ	()Lcom/tencent/mm/plugin/downloader/e/b;
        //   222: astore 6
        //   224: aload 6
        //   226: ifnull +45 -> 271
        //   229: aload 5
        //   231: invokestatic 148	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
        //   234: ifne +37 -> 271
        //   237: aload 6
        //   239: ldc -106
        //   241: new 152	java/lang/StringBuilder
        //   244: dup
        //   245: ldc -102
        //   247: invokespecial 156	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   250: aload 5
        //   252: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   255: ldc -94
        //   257: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   260: lload_2
        //   261: invokevirtual 165	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   264: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   267: invokevirtual 175	com/tencent/mm/plugin/downloader/e/b:eZ	(Ljava/lang/String;Ljava/lang/String;)Z
        //   270: pop
        //   271: aload_0
        //   272: getfield 30	com/tencent/mm/plugin/tmassistant/a/a$1:keG	Lcom/tencent/mm/plugin/downloader/e/a;
        //   275: getfield 136	com/tencent/mm/plugin/downloader/e/a:field_downloadId	J
        //   278: aload 4
        //   280: getfield 178	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo:mReceiveDataLen	J
        //   283: aload 4
        //   285: getfield 181	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo:mTotalDataLen	J
        //   288: invokestatic 185	com/tencent/mm/plugin/downloader/model/e:d	(JJJ)Z
        //   291: pop
        //   292: aload_0
        //   293: getfield 26	com/tencent/mm/plugin/tmassistant/a/a$1:qzO	Lcom/tencent/mm/plugin/tmassistant/a/a;
        //   296: getfield 189	com/tencent/mm/plugin/tmassistant/a/a:qzJ	Ljava/util/HashSet;
        //   299: aload_0
        //   300: getfield 30	com/tencent/mm/plugin/tmassistant/a/a$1:keG	Lcom/tencent/mm/plugin/downloader/e/a;
        //   303: getfield 136	com/tencent/mm/plugin/downloader/e/a:field_downloadId	J
        //   306: invokestatic 195	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   309: invokevirtual 201	java/util/HashSet:add	(Ljava/lang/Object;)Z
        //   312: pop
        //   313: aload_0
        //   314: getfield 26	com/tencent/mm/plugin/tmassistant/a/a$1:qzO	Lcom/tencent/mm/plugin/tmassistant/a/a;
        //   317: aload_0
        //   318: getfield 32	com/tencent/mm/plugin/tmassistant/a/a$1:val$url	Ljava/lang/String;
        //   321: aload 4
        //   323: getfield 94	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo:mState	I
        //   326: iconst_0
        //   327: iconst_1
        //   328: invokevirtual 205	com/tencent/mm/plugin/tmassistant/a/a:b	(Ljava/lang/String;IIZ)V
        //   331: iconst_1
        //   332: aload_0
        //   333: getfield 30	com/tencent/mm/plugin/tmassistant/a/a$1:keG	Lcom/tencent/mm/plugin/downloader/e/a;
        //   336: getfield 136	com/tencent/mm/plugin/downloader/e/a:field_downloadId	J
        //   339: aload 4
        //   341: getfield 97	com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadTaskInfo:mSavePath	Ljava/lang/String;
        //   344: invokestatic 208	com/tencent/mm/plugin/tmassistant/a/a:a	(IJLjava/lang/String;)V
        //   347: ldc 103
        //   349: ldc -46
        //   351: iconst_3
        //   352: anewarray 4	java/lang/Object
        //   355: dup
        //   356: iconst_0
        //   357: aload_0
        //   358: getfield 30	com/tencent/mm/plugin/tmassistant/a/a$1:keG	Lcom/tencent/mm/plugin/downloader/e/a;
        //   361: getfield 136	com/tencent/mm/plugin/downloader/e/a:field_downloadId	J
        //   364: invokestatic 195	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   367: aastore
        //   368: dup
        //   369: iconst_1
        //   370: aload_0
        //   371: getfield 32	com/tencent/mm/plugin/tmassistant/a/a$1:val$url	Ljava/lang/String;
        //   374: aastore
        //   375: dup
        //   376: iconst_2
        //   377: aload_0
        //   378: getfield 30	com/tencent/mm/plugin/tmassistant/a/a$1:keG	Lcom/tencent/mm/plugin/downloader/e/a;
        //   381: getfield 213	com/tencent/mm/plugin/downloader/e/a:field_filePath	Ljava/lang/String;
        //   384: aastore
        //   385: invokestatic 113	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   388: ldc2_w 56
        //   391: ldc 58
        //   393: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   396: return
        //   397: aload_0
        //   398: getfield 30	com/tencent/mm/plugin/tmassistant/a/a$1:keG	Lcom/tencent/mm/plugin/downloader/e/a;
        //   401: getstatic 218	com/tencent/mm/plugin/downloader/model/d:keN	I
        //   404: putfield 221	com/tencent/mm/plugin/downloader/e/a:field_errCode	I
        //   407: aload_0
        //   408: getfield 30	com/tencent/mm/plugin/tmassistant/a/a$1:keG	Lcom/tencent/mm/plugin/downloader/e/a;
        //   411: iconst_4
        //   412: putfield 224	com/tencent/mm/plugin/downloader/e/a:field_status	I
        //   415: aload_0
        //   416: getfield 30	com/tencent/mm/plugin/tmassistant/a/a$1:keG	Lcom/tencent/mm/plugin/downloader/e/a;
        //   419: invokestatic 228	com/tencent/mm/plugin/downloader/model/e:c	(Lcom/tencent/mm/plugin/downloader/e/a;)J
        //   422: pop2
        //   423: ldc 103
        //   425: ldc -26
        //   427: iconst_2
        //   428: anewarray 4	java/lang/Object
        //   431: dup
        //   432: iconst_0
        //   433: iload_1
        //   434: invokestatic 235	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   437: aastore
        //   438: dup
        //   439: iconst_1
        //   440: aload_0
        //   441: getfield 32	com/tencent/mm/plugin/tmassistant/a/a$1:val$url	Ljava/lang/String;
        //   444: aastore
        //   445: invokestatic 238	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   448: aload_0
        //   449: getfield 30	com/tencent/mm/plugin/tmassistant/a/a$1:keG	Lcom/tencent/mm/plugin/downloader/e/a;
        //   452: getfield 136	com/tencent/mm/plugin/downloader/e/a:field_downloadId	J
        //   455: getstatic 218	com/tencent/mm/plugin/downloader/model/d:keN	I
        //   458: iconst_0
        //   459: invokestatic 242	com/tencent/mm/plugin/tmassistant/a/a:f	(JIZ)V
        //   462: ldc2_w 56
        //   465: ldc 58
        //   467: invokestatic 51	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   470: return
        //   471: astore 4
        //   473: iconst_m1
        //   474: istore_1
        //   475: ldc 103
        //   477: ldc -12
        //   479: iconst_1
        //   480: anewarray 4	java/lang/Object
        //   483: dup
        //   484: iconst_0
        //   485: aload 4
        //   487: invokevirtual 245	java/lang/Exception:toString	()Ljava/lang/String;
        //   490: aastore
        //   491: invokestatic 238	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   494: goto -97 -> 397
        //   497: astore 4
        //   499: goto -24 -> 475
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	502	0	this	1
        //   157	318	1	i	int
        //   211	50	2	l	long
        //   28	312	4	localObject	Object
        //   471	15	4	localException1	Exception
        //   497	1	4	localException2	Exception
        //   217	34	5	str	String
        //   222	16	6	localb	com.tencent.mm.plugin.downloader.e.b
        // Exception table:
        //   from	to	target	type
        //   39	55	471	java/lang/Exception
        //   60	104	471	java/lang/Exception
        //   104	158	471	java/lang/Exception
        //   162	224	497	java/lang/Exception
        //   229	271	497	java/lang/Exception
        //   271	388	497	java/lang/Exception
      }
    });
    l = ((com.tencent.mm.plugin.downloader.e.a)localObject1).field_downloadId;
    GMTrace.o(18034030804992L, 134364);
    return l;
  }
  
  public final void b(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(16084384088064L, 119838);
    localObject = e.vu(paramString);
    if (localObject == null)
    {
      w.e("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification failed: null task info");
      GMTrace.o(16084384088064L, 119838);
      return;
    }
    if (!((com.tencent.mm.plugin.downloader.e.a)localObject).field_showNotification)
    {
      GMTrace.o(16084384088064L, 119838);
      return;
    }
    y.d locald = new y.d(this.mContext);
    long l;
    if (paramBoolean)
    {
      l = System.currentTimeMillis();
      this.qzG.put(paramString, Long.valueOf(l));
      locald.c(l);
      locald.a(((com.tencent.mm.plugin.downloader.e.a)localObject).field_fileName);
      switch (paramInt1)
      {
      default: 
        label152:
        localObject = this.gCf;
        if (!paramBoolean) {
          break;
        }
      }
    }
    for (;;)
    {
      try
      {
        paramInt1 = at.getNotification().b(locald.build());
        this.qzI.put(paramString, Integer.valueOf(paramInt1));
        GMTrace.o(16084384088064L, 119838);
        return;
      }
      finally {}
      Long localLong = (Long)this.qzG.get(paramString);
      if (localLong == null) {
        break;
      }
      locald.c(localLong.longValue());
      break;
      locald.L(17301633);
      if (paramInt2 == 0)
      {
        bool = true;
        locald.a(100, paramInt2, bool);
        locald.b(this.mContext.getString(R.l.dvq));
        locald.b(2, true);
        l = ((com.tencent.mm.plugin.downloader.e.a)localObject).field_downloadId;
        localObject = new Intent(this.mContext, FileDownloadConfirmUI.class);
        ((Intent)localObject).putExtra("extra_download_id", l);
        locald.rg = PendingIntent.getActivity(this.mContext, (int)System.currentTimeMillis(), (Intent)localObject, 268435456);
        break label152;
      }
      boolean bool = false;
      continue;
      locald.L(17301634);
      locald.o(true);
      localObject = new Intent();
      locald.rg = PendingIntent.getActivity(ab.getContext(), 0, (Intent)localObject, 0);
      locald.b(this.mContext.getString(R.l.dvp));
      break label152;
      cancelNotification(paramString);
      GMTrace.o(16084384088064L, 119838);
      return;
      paramString = (Integer)this.qzI.get(paramString);
      if (paramString != null) {
        at.getNotification().notify(paramString.intValue(), locald.build());
      }
    }
  }
  
  public final int bf(final long paramLong)
  {
    GMTrace.i(12848394665984L, 95728);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12846515617792L, 95714);
        com.tencent.mm.plugin.downloader.e.a locala = e.bm(paramLong);
        if (locala == null)
        {
          GMTrace.o(12846515617792L, 95714);
          return;
        }
        try
        {
          a.this.getClient().cancelDownloadTask(locala.field_downloadUrl);
          b.deleteFile(locala.field_filePath);
          a.this.qzJ.remove(Long.valueOf(locala.field_downloadId));
          a.this.cancelNotification(locala.field_downloadUrl);
          w.i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask: status = " + locala.field_status);
          int i = locala.field_status;
          if (i == 5)
          {
            GMTrace.o(12846515617792L, 95714);
            return;
          }
          e.j(locala.field_downloadId, 5);
          a.M(5, locala.field_downloadId);
          w.i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask: id: %d, path: %s", new Object[] { Long.valueOf(paramLong), locala.field_filePath });
          GMTrace.o(12846515617792L, 95714);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant remove task failed: " + localException.toString());
          GMTrace.o(12846515617792L, 95714);
        }
      }
    });
    GMTrace.o(12848394665984L, 95728);
    return 1;
  }
  
  public final FileDownloadTaskInfo bg(long paramLong)
  {
    GMTrace.i(18034165022720L, 134365);
    final FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    localFileDownloadTaskInfo.id = paramLong;
    final com.tencent.mm.plugin.downloader.e.a locala = e.bm(paramLong);
    if ((locala == null) || (bg.nm(locala.field_downloadUrl)))
    {
      GMTrace.o(18034165022720L, 134365);
      return localFileDownloadTaskInfo;
    }
    localFileDownloadTaskInfo.url = locala.field_downloadUrl;
    localFileDownloadTaskInfo.status = locala.field_status;
    new bb(localFileDownloadTaskInfo, locala)
    {
      private Void bsN()
      {
        GMTrace.i(12846784053248L, 95716);
        try
        {
          localTMAssistantDownloadTaskInfo = a.this.getClient().getDownloadTaskState(localFileDownloadTaskInfo.url);
          if (localTMAssistantDownloadTaskInfo == null)
          {
            localFileDownloadTaskInfo.status = 0;
            GMTrace.o(12846784053248L, 95716);
            return null;
          }
          switch (localTMAssistantDownloadTaskInfo.mState)
          {
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            TMAssistantDownloadTaskInfo localTMAssistantDownloadTaskInfo;
            w.e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadTaskState faile: " + localException.toString());
            continue;
            localFileDownloadTaskInfo.status = 2;
            continue;
            localFileDownloadTaskInfo.status = 3;
            continue;
            localFileDownloadTaskInfo.status = 4;
            continue;
            localFileDownloadTaskInfo.status = 5;
          }
        }
        for (localFileDownloadTaskInfo.status = 0;; localFileDownloadTaskInfo.status = 1)
        {
          localFileDownloadTaskInfo.path = localTMAssistantDownloadTaskInfo.mSavePath;
          localFileDownloadTaskInfo.eJd = localTMAssistantDownloadTaskInfo.mReceiveDataLen;
          localFileDownloadTaskInfo.eJe = localTMAssistantDownloadTaskInfo.mTotalDataLen;
          localFileDownloadTaskInfo.eDW = locala.field_md5;
          GMTrace.o(12846784053248L, 95716);
          return null;
        }
      }
    }.b(at.xB().bQi());
    w.i("MicroMsg.FileDownloaderImplTMAssistant", "queryDownloadTask: id: %d, status: %d, url: %s, path: %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(localFileDownloadTaskInfo.status), localFileDownloadTaskInfo.url, localFileDownloadTaskInfo.path });
    GMTrace.o(18034165022720L, 134365);
    return localFileDownloadTaskInfo;
  }
  
  public final boolean bh(final long paramLong)
  {
    GMTrace.i(12849199972352L, 95734);
    final com.tencent.mm.plugin.downloader.e.a locala = e.bm(paramLong);
    if ((locala == null) || (bg.nm(locala.field_downloadUrl)))
    {
      w.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d, record not found", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(12849199972352L, 95734);
      return false;
    }
    if (locala.field_downloaderType != 2)
    {
      w.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d, downloader type not matched", new Object[] { Long.valueOf(paramLong) });
      b.deleteFile(locala.field_filePath);
      e.bn(paramLong);
      GMTrace.o(12849199972352L, 95734);
      return false;
    }
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12846247182336L, 95712);
        try
        {
          TMAssistantDownloadTaskInfo localTMAssistantDownloadTaskInfo = a.this.getClient().getDownloadTaskState(locala.field_downloadUrl);
          if (localTMAssistantDownloadTaskInfo.mState != 1)
          {
            int i = localTMAssistantDownloadTaskInfo.mState;
            if (i != 2)
            {
              GMTrace.o(12846247182336L, 95712);
              return;
            }
          }
          a.this.getClient().pauseDownloadTask(locala.field_downloadUrl);
          e.j(locala.field_downloadId, 2);
          a.M(2, locala.field_downloadId);
          a.this.qzJ.remove(Long.valueOf(locala.field_downloadId));
          a.this.cancelNotification(locala.field_downloadUrl);
          w.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d ", new Object[] { Long.valueOf(paramLong) });
          GMTrace.o(12846247182336L, 95712);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %s", new Object[] { localException.toString() });
          w.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", localException, "", new Object[0]);
          GMTrace.o(12846247182336L, 95712);
        }
      }
    });
    GMTrace.o(12849199972352L, 95734);
    return true;
  }
  
  public final boolean bi(final long paramLong)
  {
    GMTrace.i(12849334190080L, 95735);
    final com.tencent.mm.plugin.downloader.e.a locala = e.bm(paramLong);
    if ((locala == null) || (bg.nm(locala.field_downloadUrl)))
    {
      w.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d, record not found", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(12849334190080L, 95735);
      return false;
    }
    if (locala.field_downloaderType != 2)
    {
      w.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d, downloader type not matched", new Object[] { Long.valueOf(paramLong) });
      b.deleteFile(locala.field_filePath);
      e.bn(paramLong);
      GMTrace.o(12849334190080L, 95735);
      return false;
    }
    locala.field_startTime = System.currentTimeMillis();
    if (locala.field_status == 2) {}
    for (locala.field_startState = d.kfa;; locala.field_startState = d.kfb)
    {
      locala.field_startSize = locala.field_downloadedSize;
      locala.field_errCode = 0;
      bsM();
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12852286980096L, 95757);
          try
          {
            if (a.this.getClient().getDownloadTaskState(locala.field_downloadUrl).mState != 3)
            {
              w.e("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask, not paused");
              GMTrace.o(12852286980096L, 95757);
              return;
            }
            if (a.this.getClient().startDownloadTask(locala.field_downloadUrl, locala.field_secondaryUrl, locala.field_fileSize, 0, "resource/tm.android.unknown", locala.field_fileName, a.this.qzK) == 0)
            {
              locala.field_status = 1;
              e.c(locala);
              a.this.qzJ.add(Long.valueOf(locala.field_downloadId));
              a.this.b(locala.field_downloadUrl, 2, 0, true);
              a.a(6, locala.field_downloadId, locala.field_filePath);
              w.i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d", new Object[] { Long.valueOf(paramLong) });
              GMTrace.o(12852286980096L, 95757);
              return;
            }
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %s", new Object[] { localException.toString() });
            w.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", localException, "", new Object[0]);
            locala.field_status = 4;
            locala.field_errCode = d.keO;
            e.c(locala);
            a.f(locala.field_downloadId, d.keO, false);
            GMTrace.o(12852286980096L, 95757);
          }
        }
      });
      GMTrace.o(12849334190080L, 95735);
      return true;
    }
  }
  
  public final boolean bsL()
  {
    GMTrace.i(12848663101440L, 95730);
    if ((this.qzJ == null) || (this.qzJ.size() == 0))
    {
      TMAssistantDownloadSDKManager.getInstance(this.mContext).releaseDownloadSDKClient("WechatDownloadClient");
      if (this.mClient != null) {
        this.mClient.unRegisterDownloadTaskListener(this.qzL);
      }
      this.mClient = null;
      TMAssistantDownloadSDKManager.closeAllService(this.mContext);
      try
      {
        Intent localIntent = new Intent(this.mContext, TMAssistantDownloadSDKService.class);
        this.mContext.stopService(localIntent);
        w.i("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistantSDK Client released");
        GMTrace.o(12848663101440L, 95730);
        return true;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.FileDownloaderImplTMAssistant", "Error occurred when stopping TMAssistant Service: " + localException.toString());
        }
      }
    }
    w.i("MicroMsg.FileDownloaderImplTMAssistant", "Still have tasks running");
    GMTrace.o(12848663101440L, 95730);
    return false;
  }
  
  public final void cancelNotification(String paramString)
  {
    GMTrace.i(12848797319168L, 95731);
    synchronized (this.gCf)
    {
      Integer localInteger = (Integer)this.qzI.get(paramString);
      if (localInteger == null)
      {
        w.i("MicroMsg.FileDownloaderImplTMAssistant", "No notification id found");
        GMTrace.o(12848797319168L, 95731);
        return;
      }
      at.getNotification().cancel(localInteger.intValue());
      w.i("MicroMsg.FileDownloaderImplTMAssistant", "cancelNotification, id = " + localInteger);
      this.qzI.remove(paramString);
      GMTrace.o(12848797319168L, 95731);
      return;
    }
  }
  
  public final TMAssistantDownloadSDKClient getClient()
  {
    GMTrace.i(16084249870336L, 119837);
    if (this.mClient == null)
    {
      this.mClient = TMAssistantDownloadSDKManager.getInstance(this.mContext).getDownloadSDKClient("WechatDownloadClient");
      this.mClient.registerDownloadTaskListener(this.qzL);
    }
    this.lUi.z(240000L, 240000L);
    TMAssistantDownloadSDKClient localTMAssistantDownloadSDKClient = this.mClient;
    GMTrace.o(16084249870336L, 119837);
    return localTMAssistantDownloadSDKClient;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\tmassistant\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.game.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.downloader.e.a;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.downloader.model.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.at;
import com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener;
import com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class l
  implements n, ITMQQDownloaderOpenSDKListener
{
  private static l lMn;
  private static BroadcastReceiver lMo;
  public static Set<b> lMp;
  public static HashMap<String, c> lMq;
  private static Map<Long, Long> lMr;
  
  static
  {
    GMTrace.i(12631633035264L, 94113);
    lMn = null;
    lMo = null;
    lMp = Collections.synchronizedSet(new HashSet());
    lMq = new HashMap();
    lMr = new HashMap();
    GMTrace.o(12631633035264L, 94113);
  }
  
  private l()
  {
    GMTrace.i(12628009156608L, 94086);
    GMTrace.o(12628009156608L, 94086);
  }
  
  public static String a(c paramc)
  {
    GMTrace.i(12630827728896L, 94107);
    Object localObject = null;
    a locala = com.tencent.mm.plugin.downloader.model.e.vr(paramc.appId);
    paramc = (c)localObject;
    if (locala != null) {
      if (locala.field_downloaderType != 1) {
        break label45;
      }
    }
    label45:
    for (paramc = "downloader_type_system";; paramc = "downloader_type_tmassistant")
    {
      GMTrace.o(12630827728896L, 94107);
      return paramc;
    }
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(12628277592064L, 94088);
    synchronized (lMp)
    {
      lMp.add(paramb);
      GMTrace.o(12628277592064L, 94088);
      return;
    }
  }
  
  public static void a(String paramString1, int paramInt, boolean paramBoolean, String paramString2)
  {
    GMTrace.i(12630961946624L, 94108);
    int i;
    if (paramInt != 710)
    {
      i = paramInt;
      if (paramInt != 711) {}
    }
    else
    {
      i = d.keX;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameDownloadEventBus", "appid = %s, errCode = %d", new Object[] { paramString1, Integer.valueOf(i) });
    if (!paramBoolean)
    {
      SubCoreGameCenter.aGi();
      w.b(paramString1, 2, i, null, paramString2);
      GMTrace.o(12630961946624L, 94108);
      return;
    }
    SubCoreGameCenter.aGi();
    w.b(paramString1, 4, i, null, paramString2);
    GMTrace.o(12630961946624L, 94108);
  }
  
  public static void a(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    GMTrace.i(12629082898432L, 94094);
    if (bg.nm(paramString1))
    {
      GMTrace.o(12629082898432L, 94094);
      return;
    }
    lMq.put(paramString1, new c(paramString2, paramInt, paramString3, "", paramString4));
    GMTrace.o(12629082898432L, 94094);
  }
  
  public static void a(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(12629217116160L, 94095);
    if (bg.nm(paramString1))
    {
      GMTrace.o(12629217116160L, 94095);
      return;
    }
    lMq.put(paramString1, new c(paramString2, paramInt, paramString3, paramString4, paramString5));
    GMTrace.o(12629217116160L, 94095);
  }
  
  public static void aFc()
  {
    GMTrace.i(12628546027520L, 94090);
    if (lMn == null) {
      lMn = new l();
    }
    if (lMo == null) {
      lMo = new a((byte)0);
    }
    f.apJ();
    com.tencent.mm.plugin.downloader.model.c.a(lMn);
    ay.aGa();
    ay.registerListener(lMn);
    IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
    localIntentFilter.addDataScheme("package");
    ab.getContext().registerReceiver(lMo, localIntentFilter);
    GMTrace.o(12628546027520L, 94090);
  }
  
  public static void aFd()
  {
    GMTrace.i(12628680245248L, 94091);
    f.apJ();
    com.tencent.mm.plugin.downloader.model.c.b(lMn);
    ay.aGa();
    ay.unregisterListener(lMn);
    ab.getContext().unregisterReceiver(lMo);
    lMn = null;
    lMp.clear();
    lMq.clear();
    GMTrace.o(12628680245248L, 94091);
  }
  
  public static l aFn()
  {
    GMTrace.i(12628143374336L, 94087);
    if (lMn == null) {
      lMn = new l();
    }
    l locall = lMn;
    GMTrace.o(12628143374336L, 94087);
    return locall;
  }
  
  public static void b(b paramb)
  {
    GMTrace.i(12628411809792L, 94089);
    synchronized (lMp)
    {
      lMp.remove(paramb);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameDownloadEventBus", "removeListener, size:%d, listener:%s", new Object[] { Integer.valueOf(lMp.size()), paramb });
      GMTrace.o(12628411809792L, 94089);
      return;
    }
  }
  
  public static void cs(String paramString1, String paramString2)
  {
    GMTrace.i(12631096164352L, 94109);
    SubCoreGameCenter.aGi();
    w.b(paramString1, 6, 0, null, paramString2);
    GMTrace.o(12631096164352L, 94109);
  }
  
  private void f(final int paramInt, final String paramString, final boolean paramBoolean)
  {
    GMTrace.i(12628948680704L, 94093);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12625593237504L, 94068);
        synchronized (l.lMp)
        {
          Iterator localIterator = l.lMp.iterator();
          if (localIterator.hasNext()) {
            ((l.b)localIterator.next()).g(paramInt, paramString, paramBoolean);
          }
        }
        GMTrace.o(12625593237504L, 94068);
      }
    });
    GMTrace.o(12628948680704L, 94093);
  }
  
  private void s(long paramLong, int paramInt)
  {
    GMTrace.i(12628814462976L, 94092);
    a locala = com.tencent.mm.plugin.downloader.model.e.bm(paramLong);
    int i;
    Object localObject;
    if (locala != null)
    {
      i = 0;
      switch (paramInt)
      {
      default: 
        if (!bg.nm(locala.field_appId)) {
          ai.a(locala.field_appId, locala.field_scene, i, locala.field_downloadedSize - locala.field_startSize, locala.field_totalSize, locala.field_downloadUrl, locala.field_errCode, locala.field_downloaderType, locala.field_channelId, (System.currentTimeMillis() - locala.field_startTime) / 1000L, locala.field_startState);
        }
        localObject = (c)lMq.get(locala.field_downloadUrl);
        if (localObject == null) {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameDownloadEventBus", "No report info found, abort reporting: %s", new Object[] { locala.field_downloadUrl });
        }
        break;
      case 6: 
        label189:
        localObject = locala.field_appId;
        if (locala.field_autoDownload) {}
        break;
      }
    }
    for (boolean bool = true;; bool = false)
    {
      f(paramInt, (String)localObject, bool);
      GMTrace.o(12628814462976L, 94092);
      return;
      i = 1;
      break;
      i = 7;
      break;
      i = 6;
      break;
      i = 2;
      break;
      i = 3;
      break;
      i = 8;
      break;
      if (bg.nm(((c)localObject).eDk)) {
        ((c)localObject).eDk = a((c)localObject);
      }
      ai.a(((c)localObject).appId, ((c)localObject).scene, i, ((c)localObject).eDW, locala.field_downloadUrl, ((c)localObject).lMv, ((c)localObject).eDk);
      break label189;
    }
  }
  
  public final void OnDownloadTaskProgressChanged(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, long paramLong1, long paramLong2)
  {
    GMTrace.i(12630425075712L, 94104);
    GMTrace.o(12630425075712L, 94104);
  }
  
  public final void OnDownloadTaskStateChanged(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, int paramInt1, int paramInt2, String paramString)
  {
    int i = 2;
    GMTrace.i(12630290857984L, 94103);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameDownloadEventBus", "OnDownloadTaskStateChanged, status = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramInt2 != 0)
    {
      GMTrace.o(12630290857984L, 94103);
      return;
    }
    paramInt2 = i;
    switch (paramInt1)
    {
    default: 
      paramInt2 = 0;
    }
    for (;;)
    {
      if (paramInt2 != 0) {
        f(paramInt2, paramTMQQDownloaderOpenSDKParam.taskPackageName, true);
      }
      GMTrace.o(12630290857984L, 94103);
      return;
      paramInt2 = 1;
      continue;
      paramInt2 = 3;
      continue;
      paramInt2 = 5;
      continue;
      paramInt2 = 4;
    }
  }
  
  public final void OnQQDownloaderInvalid()
  {
    GMTrace.i(12630559293440L, 94105);
    GMTrace.o(12630559293440L, 94105);
  }
  
  public final void OnServiceFree()
  {
    GMTrace.i(12630693511168L, 94106);
    GMTrace.o(12630693511168L, 94106);
  }
  
  public final void bs(long paramLong)
  {
    GMTrace.i(12630022422528L, 94101);
    s(paramLong, 6);
    GMTrace.o(12630022422528L, 94101);
  }
  
  public final void c(long paramLong, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(12629619769344L, 94098);
    lMr.remove(Long.valueOf(paramLong));
    s(paramLong, 5);
    a locala = com.tencent.mm.plugin.downloader.model.e.bm(paramLong);
    String str2;
    String str1;
    if (locala != null)
    {
      str2 = null;
      str1 = null;
      if (paramInt == d.keV) {
        str1 = str2;
      }
    }
    try
    {
      JSONObject localJSONObject = new JSONObject();
      str1 = str2;
      localJSONObject.put("ChannelId", locala.field_channelId);
      str1 = str2;
      localJSONObject.put("DownloadSize", locala.field_downloadedSize);
      str1 = str2;
      str2 = ai.zJ(localJSONObject.toString());
      str1 = str2;
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GameDownloadEventBus", "extInfo = " + localJSONObject.toString());
      str1 = str2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameDownloadEventBus", "reportDownloadFailed, e = " + localException.getMessage());
      }
    }
    a(locala.field_appId, paramInt, paramBoolean, str1);
    GMTrace.o(12629619769344L, 94098);
  }
  
  public final void c(long paramLong, String paramString, boolean paramBoolean)
  {
    GMTrace.i(12629485551616L, 94097);
    if ((!bg.nm(paramString)) && (com.tencent.mm.a.e.aZ(paramString)))
    {
      if (lMr.containsKey(Long.valueOf(paramLong)))
      {
        long l = ((Long)lMr.get(Long.valueOf(paramLong))).longValue();
        lMr.remove(Long.valueOf(paramLong));
        l = (System.currentTimeMillis() - l) / 1000L;
        paramString = com.tencent.mm.plugin.downloader.model.e.bm(paramLong);
        if (paramString != null)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameDownloadEventBus", "appId = %s, downloadType = %d, costTime = %d", new Object[] { paramString.field_appId, Integer.valueOf(paramString.field_downloaderType), Long.valueOf(l) });
          ai.a(ab.getContext(), paramString.field_appId, l, paramString.field_downloaderType);
        }
      }
      s(paramLong, 3);
      if (paramBoolean)
      {
        paramString = com.tencent.mm.plugin.downloader.model.e.bm(paramLong);
        if (paramString != null)
        {
          paramString = paramString.field_appId;
          SubCoreGameCenter.aGi();
          w.b(paramString, 5, 0, null, null);
        }
        GMTrace.o(12629485551616L, 94097);
      }
    }
    else
    {
      f.apJ().bf(paramLong);
    }
    GMTrace.o(12629485551616L, 94097);
  }
  
  public final void k(long paramLong, String paramString)
  {
    GMTrace.i(14411225890816L, 107372);
    s(paramLong, 7);
    GMTrace.o(14411225890816L, 107372);
  }
  
  public final void onTaskPaused(long paramLong)
  {
    GMTrace.i(12629888204800L, 94100);
    lMr.remove(Long.valueOf(paramLong));
    s(paramLong, 2);
    GMTrace.o(12629888204800L, 94100);
  }
  
  public final void onTaskRemoved(long paramLong)
  {
    int i = 0;
    GMTrace.i(12629753987072L, 94099);
    lMr.remove(Long.valueOf(paramLong));
    s(paramLong, 4);
    Object localObject2 = com.tencent.mm.plugin.downloader.model.e.bm(paramLong);
    if (localObject2 != null)
    {
      Object localObject1 = ab.getContext();
      String str1 = ((a)localObject2).field_appId;
      SharedPreferences localSharedPreferences = ((Context)localObject1).getSharedPreferences("game_center_pref", 0);
      localObject1 = localSharedPreferences.getString("download_app_id_time_map", "");
      if ((!bg.nm((String)localObject1)) && (((String)localObject1).contains(str1)))
      {
        localObject2 = new String();
        String[] arrayOfString = ((String)localObject1).split(",");
        if (i < arrayOfString.length)
        {
          String str2 = arrayOfString[i];
          localObject1 = localObject2;
          if (!str2.contains(str1)) {
            if (i != arrayOfString.length - 1) {
              break label184;
            }
          }
          label184:
          for (localObject1 = (String)localObject2 + str2;; localObject1 = (String)localObject2 + str2 + ",")
          {
            i += 1;
            localObject2 = localObject1;
            break;
          }
        }
        localSharedPreferences.edit().putString("download_app_id_time_map", (String)localObject2).apply();
      }
    }
    GMTrace.o(12629753987072L, 94099);
  }
  
  public final void onTaskStarted(long paramLong, String paramString)
  {
    GMTrace.i(12629351333888L, 94096);
    lMr.put(Long.valueOf(paramLong), Long.valueOf(System.currentTimeMillis()));
    s(paramLong, 1);
    GMTrace.o(12629351333888L, 94096);
  }
  
  private static final class a
    extends BroadcastReceiver
  {
    private a()
    {
      GMTrace.i(12596467990528L, 93851);
      GMTrace.o(12596467990528L, 93851);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(12596602208256L, 93852);
      if ((paramContext == null) || (paramIntent == null))
      {
        GMTrace.o(12596602208256L, 93852);
        return;
      }
      paramContext = paramIntent.getAction();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameInstallationReceiver", paramContext);
      if (bg.nm(paramContext))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameInstallationReceiver", "action is null or nill, ignore");
        GMTrace.o(12596602208256L, 93852);
        return;
      }
      if (!paramContext.equals("android.intent.action.PACKAGE_ADDED"))
      {
        GMTrace.o(12596602208256L, 93852);
        return;
      }
      paramContext = "";
      try
      {
        paramIntent = paramIntent.getDataString();
        paramContext = paramIntent;
      }
      catch (Exception paramIntent)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameInstallationReceiver", "%s", new Object[] { bg.f(paramIntent) });
        }
        paramIntent = paramContext;
        if (!paramContext.startsWith("package:")) {
          break label165;
        }
        paramIntent = paramContext.substring(8);
        if ((at.AU()) && (!at.wF())) {
          break label193;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameInstallationReceiver", "no user login");
        GMTrace.o(12596602208256L, 93852);
        return;
        if (at.AR() != null) {
          break label208;
        }
        GMTrace.o(12596602208256L, 93852);
        return;
        paramContext = com.tencent.mm.y.c.yQ();
        if (!bg.nm(paramIntent)) {
          break label256;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.FileDownloadInfoStorage", "Null or nil PakcageName");
        paramContext = null;
        while (paramContext == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameInstallationReceiver", "No AppInfo found for package: %s", new Object[] { paramIntent });
          GMTrace.o(12596602208256L, 93852);
          return;
          Cursor localCursor = paramContext.rawQuery("select * from FileDownloadInfo where packageName='" + paramIntent + "' order by downloadId desc limit 1", new String[0]);
          if (localCursor == null)
          {
            paramContext = null;
          }
          else
          {
            paramContext = null;
            if (localCursor.moveToFirst())
            {
              paramContext = new a();
              paramContext.b(localCursor);
            }
            if (localCursor != null) {
              localCursor.close();
            }
          }
        }
        if (!com.tencent.mm.a.e.aZ(paramContext.field_filePath)) {
          break label358;
        }
        com.tencent.mm.loader.stub.b.deleteFile(paramContext.field_filePath);
        com.tencent.mm.plugin.downloader.model.e.vt(paramContext.field_appId);
        if (bg.nm(paramContext.field_appId)) {
          break label422;
        }
        ai.a(paramContext.field_appId, paramContext.field_scene, 5, paramContext.field_downloadedSize - paramContext.field_startSize, paramContext.field_totalSize, paramContext.field_downloadUrl, 0, paramContext.field_downloaderType, paramContext.field_channelId, (System.currentTimeMillis() - paramContext.field_startTime) / 1000L, paramContext.field_startState);
        paramIntent = (l.c)l.lMq.get(paramContext.field_downloadUrl);
        if (paramIntent != null) {
          break label467;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameInstallationReceiver", "No ReportInfo found for url: %s", new Object[] { paramContext.field_downloadUrl });
        GMTrace.o(12596602208256L, 93852);
        return;
        if (!bg.nm(paramIntent.eDk)) {
          break label485;
        }
        paramIntent.eDk = l.a(paramIntent);
        ai.a(paramIntent.appId, paramIntent.scene, 5, paramIntent.eDW, paramContext.field_downloadUrl, paramIntent.lMv, paramIntent.eDk);
        GMTrace.o(12596602208256L, 93852);
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameInstallationReceiver", "get added package name : %s", new Object[] { paramContext });
      if (bg.nm(paramContext))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameInstallationReceiver", "get installed broadcast, while the package name is null or nil");
        GMTrace.o(12596602208256L, 93852);
        return;
      }
      label165:
      label193:
      label208:
      label256:
      label358:
      label422:
      label467:
      label485:
      return;
    }
  }
  
  public static abstract interface b
  {
    public abstract void g(int paramInt, String paramString, boolean paramBoolean);
  }
  
  private static final class c
  {
    String appId;
    String eDW;
    String eDk;
    String lMv;
    int scene;
    
    c(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4)
    {
      GMTrace.i(12624116842496L, 94057);
      this.eDW = "";
      this.scene = 0;
      this.appId = "";
      this.lMv = "";
      this.eDk = "";
      this.eDW = paramString1;
      this.scene = paramInt;
      this.appId = paramString2;
      this.lMv = paramString3;
      this.eDk = paramString4;
      GMTrace.o(12624116842496L, 94057);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
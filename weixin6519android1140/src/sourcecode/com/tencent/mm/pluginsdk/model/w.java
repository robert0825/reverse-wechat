package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.xweb.WebView;
import com.tencent.xweb.p;
import com.tencent.xweb.util.b;
import com.tencent.xweb.x5.sdk.d.a;
import com.tencent.xweb.x5.sdk.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class w
{
  private static long tnx;
  private static final Map<String, Object> tny;
  
  static
  {
    GMTrace.i(749471793152L, 5584);
    tny = new HashMap();
    GMTrace.o(749471793152L, 5584);
  }
  
  public static void ac(Intent paramIntent)
  {
    GMTrace.i(748934922240L, 5580);
    String str1 = paramIntent.getStringExtra("file_path");
    final String str2 = paramIntent.getStringExtra("file_ext");
    if (System.currentTimeMillis() - tnx < 1000L)
    {
      GMTrace.o(748934922240L, 5580);
      return;
    }
    if (bg.nm(str1))
    {
      GMTrace.o(748934922240L, 5580);
      return;
    }
    tnx = System.currentTimeMillis();
    final Context localContext = ab.getContext();
    paramIntent = "";
    try
    {
      Object localObject = new JSONObject();
      ((JSONObject)localObject).putOpt("path", str1);
      ((JSONObject)localObject).putOpt("ext", str2);
      localObject = ((JSONObject)localObject).toString();
      paramIntent = (Intent)localObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.TBSHelper", localJSONException, "", new Object[0]);
      }
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSHelper", "openFileByMiniQB, file pathinfo:%s", new Object[] { paramIntent });
    com.tencent.xweb.x5.sdk.d.a(localContext, paramIntent, new ValueCallback() {});
    GMTrace.o(748934922240L, 5580);
  }
  
  public static void eD(String paramString1, String paramString2)
  {
    GMTrace.i(16010966990848L, 119291);
    Intent localIntent = new Intent();
    localIntent.setAction("MINIQB_OPEN_RET");
    localIntent.putExtra("file_path", paramString1);
    localIntent.putExtra("file_ext", paramString2);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSHelper", "TBS MiniQB cannot open this file:%s", new Object[] { paramString1 });
    localIntent.putExtra("MINIQB_OPEN_RET_VAL", false);
    ab.getContext().sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
    GMTrace.o(16010966990848L, 119291);
  }
  
  public static void eE(String paramString1, String paramString2)
  {
    GMTrace.i(16011101208576L, 119292);
    Intent localIntent = new Intent();
    localIntent.setClassName(ab.getContext(), "com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI");
    localIntent.putExtra("file_path", paramString1);
    localIntent.putExtra("file_ext", paramString2);
    localIntent.addFlags(268435456);
    ab.getContext().startActivity(localIntent);
    GMTrace.o(16011101208576L, 119292);
  }
  
  public static void r(String paramString, Object paramObject)
  {
    GMTrace.i(14281437347840L, 106405);
    tny.put(paramString, paramObject);
    com.tencent.xweb.x5.sdk.d.initTbsSettings(tny);
    GMTrace.o(14281437347840L, 106405);
  }
  
  public static final class a
  {
    private static boolean tnB;
    
    static
    {
      GMTrace.i(762759348224L, 5683);
      com.tencent.mm.sdk.platformtools.w.i("TBSDownloadChecker", "TRACE_ORDER:TBSHelper.java");
      p.a(ab.getContext(), new b()
      {
        public final void d(String paramAnonymousString1, String paramAnonymousString2)
        {
          GMTrace.i(20285398974464L, 151138);
          com.tencent.mm.sdk.platformtools.w.d(paramAnonymousString1, paramAnonymousString2);
          GMTrace.o(20285398974464L, 151138);
        }
        
        public final void e(String paramAnonymousString1, String paramAnonymousString2)
        {
          GMTrace.i(20285130539008L, 151136);
          com.tencent.mm.sdk.platformtools.w.e(paramAnonymousString1, paramAnonymousString2);
          GMTrace.o(20285130539008L, 151136);
        }
        
        public final void i(String paramAnonymousString1, String paramAnonymousString2)
        {
          GMTrace.i(20284996321280L, 151135);
          com.tencent.mm.sdk.platformtools.w.i(paramAnonymousString1, paramAnonymousString2);
          GMTrace.o(20284996321280L, 151135);
        }
        
        public final void v(String paramAnonymousString1, String paramAnonymousString2)
        {
          GMTrace.i(20285533192192L, 151139);
          com.tencent.mm.sdk.platformtools.w.v(paramAnonymousString1, paramAnonymousString2);
          GMTrace.o(20285533192192L, 151139);
        }
        
        public final void w(String paramAnonymousString1, String paramAnonymousString2)
        {
          GMTrace.i(20285264756736L, 151137);
          com.tencent.mm.sdk.platformtools.w.w(paramAnonymousString1, paramAnonymousString2);
          GMTrace.o(20285264756736L, 151137);
        }
      }, null, null);
      tnB = false;
      GMTrace.o(762759348224L, 5683);
    }
    
    public static boolean bJm()
    {
      GMTrace.i(762088259584L, 5678);
      boolean bool1 = f.isDownloading();
      boolean bool2 = com.tencent.xweb.x5.sdk.d.getTBSInstalling();
      boolean bool3 = tnB;
      if ((bool1) || (bool2) || (bool3))
      {
        GMTrace.o(762088259584L, 5678);
        return true;
      }
      GMTrace.o(762088259584L, 5678);
      return false;
    }
    
    public static int bJn()
    {
      GMTrace.i(762490912768L, 5681);
      if ((com.tencent.mm.compatible.util.d.et(19)) || (com.tencent.mm.compatible.util.d.eu(16)))
      {
        GMTrace.o(762490912768L, 5681);
        return 1;
      }
      if (WebView.getTbsCoreVersion(ab.getContext()) > 0)
      {
        GMTrace.o(762490912768L, 5681);
        return 4;
      }
      if (f.isDownloading())
      {
        GMTrace.o(762490912768L, 5681);
        return 2;
      }
      if (com.tencent.xweb.x5.sdk.d.getTBSInstalling())
      {
        GMTrace.o(762490912768L, 5681);
        return 3;
      }
      boolean bool = ab.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).getBoolean("tbs_download_oversea", false);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "oversea = %b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        GMTrace.o(762490912768L, 5681);
        return 2;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.TBSDownloadChecker", "WTF, how could it be?");
      GMTrace.o(762490912768L, 5681);
      return 0;
    }
    
    public static int ctN()
    {
      GMTrace.i(21034199678976L, 156717);
      int i = com.tencent.xweb.x5.sdk.d.getTbsVersion(ab.getContext());
      if (i < 36824)
      {
        if (bg.bRb())
        {
          if (com.tencent.mm.compatible.util.d.eu(17))
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "is GP version can not download");
            GMTrace.o(21034199678976L, 156717);
            return 2;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "is GP version no need download");
          GMTrace.o(21034199678976L, 156717);
          return 0;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "tbsCoreVersion %d should download", new Object[] { Integer.valueOf(i) });
        GMTrace.o(21034199678976L, 156717);
        return 1;
      }
      if (com.tencent.xweb.x5.sdk.d.canOpenWebPlus(ab.getContext()))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "tbsCoreVersion %d can load x5", new Object[] { Integer.valueOf(i) });
        GMTrace.o(21034199678976L, 156717);
        return 0;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "tbsCoreVersion %d can not load x5", new Object[] { Integer.valueOf(i) });
      GMTrace.o(21034199678976L, 156717);
      return 1;
    }
    
    public static void dL(Context paramContext)
    {
      GMTrace.i(761819824128L, 5676);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "webview start check tbs");
      Object localObject1 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
      int i;
      if ((localObject1 == null) || (bg.bRb()))
      {
        i = 1;
        bool = ((SharedPreferences)localObject1).getBoolean("tbs_download_oversea", false);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "user hasDownloadOverSea = %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool) {
          break label224;
        }
        i = 2;
      }
      Object localObject2;
      long l1;
      long l2;
      label224:
      while (!bg.bRb())
      {
        localObject2 = ((SharedPreferences)localObject1).getString("tbs_download", null);
        if ("1".equals(localObject2)) {
          break label247;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "tbsDownload switch is off, value = %s", new Object[] { localObject2 });
        GMTrace.o(761819824128L, 5676);
        return;
        l1 = ((SharedPreferences)localObject1).getLong("last_check_xwalk", 0L);
        l2 = System.currentTimeMillis();
        if (l2 - l1 < 1800000L) {
          break;
        }
        localObject2 = ((SharedPreferences)localObject1).edit();
        ((SharedPreferences.Editor)localObject2).putLong("last_check_xwalk", l2);
        ((SharedPreferences.Editor)localObject2).apply();
        localObject2 = new Intent();
        ((Intent)localObject2).setClassName(ab.getPackageName(), "com.tencent.mm.sandbox.updater.UpdaterService");
        ((Intent)localObject2).putExtra("intent_extra_download_type", 3);
        paramContext.startService((Intent)localObject2);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "start UpdaterService to download xwalk");
        break;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "isGPVersion, ignore this request");
      GMTrace.o(761819824128L, 5676);
      return;
      label247:
      boolean bool = am.isWifi(paramContext);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "check, tbsDownload = %s, isWifi = %b", new Object[] { localObject2, Boolean.valueOf(bool) });
      if (!bool)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "check, net type is not wifi");
        GMTrace.o(761819824128L, 5676);
        return;
      }
      if (localObject1 == null) {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.TBSDownloadChecker", "sp is null");
      }
      for (int j = 0;; j = 1)
      {
        if (j != 0) {
          break label413;
        }
        j = WebView.getTbsCoreVersion(paramContext);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "check expired false, tbsCoreVersion = %d", new Object[] { Integer.valueOf(j) });
        if (j <= 0) {
          break label413;
        }
        GMTrace.o(761819824128L, 5676);
        return;
        l1 = ((SharedPreferences)localObject1).getLong("last_check_ts", 0L);
        l2 = System.currentTimeMillis();
        if (l2 - l1 <= 7200000L) {
          break;
        }
        localObject1 = ((SharedPreferences)localObject1).edit();
        ((SharedPreferences.Editor)localObject1).putLong("last_check_ts", l2);
        ((SharedPreferences.Editor)localObject1).apply();
      }
      label413:
      localObject1 = new Intent();
      ((Intent)localObject1).setClassName(ab.getPackageName(), "com.tencent.mm.sandbox.updater.UpdaterService");
      ((Intent)localObject1).putExtra("intent_extra_download_type", i);
      paramContext.startService((Intent)localObject1);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "start UpdaterService to download tbs");
      GMTrace.o(761819824128L, 5676);
    }
    
    public static void dM(Context paramContext)
    {
      GMTrace.i(762625130496L, 5682);
      Intent localIntent = new Intent();
      localIntent.setClassName(ab.getPackageName(), "com.tencent.mm.sandbox.updater.UpdaterService");
      localIntent.putExtra("intent_extra_download_type", 2);
      localIntent.putExtra("intent_extra_download_ignore_network_type", true);
      paramContext.startService(localIntent);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.TBSDownloadChecker", "start UpdaterService to download tbs");
      paramContext = ab.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
      if (paramContext != null) {
        paramContext.edit().putBoolean("tbs_download_oversea", true).apply();
      }
      GMTrace.o(762625130496L, 5682);
    }
    
    public static void jW(boolean paramBoolean)
    {
      GMTrace.i(762222477312L, 5679);
      tnB = paramBoolean;
      GMTrace.o(762222477312L, 5679);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\pluginsdk\model\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
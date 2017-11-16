package com.tencent.mm.pluginsdk.i;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.c.a;
import com.tencent.mm.c.b;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.protocal.c.bjc;
import com.tencent.mm.protocal.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.List;

public final class p
{
  private static String tpA;
  private static String tpB;
  private static String tpC;
  private static final long[] tpy;
  private static String tpz;
  
  static
  {
    GMTrace.i(19254338387968L, 143456);
    tpy = new long[] { 0L, 259200000L, 604800000L };
    tpz = "tinker-boots-install-info";
    tpA = "tinker-boots-last-show";
    tpB = "tinker-boots-show-time";
    tpC = "";
    GMTrace.o(19254338387968L, 143456);
  }
  
  public static String OH(String paramString)
  {
    GMTrace.i(19254069952512L, 143454);
    paramString = bJW() + paramString + ".apk";
    GMTrace.o(19254069952512L, 143454);
    return paramString;
  }
  
  public static void a(bjc parambjc)
  {
    GMTrace.i(19253533081600L, 143450);
    try
    {
      ab.getContext().getSharedPreferences("tinker_patch_share_config", 4).edit().putString(tpz, Base64.encodeToString(parambjc.toByteArray(), 0)).apply();
      w.d("MicroMsg.UpdateUtil", "save tinker install update info.");
      GMTrace.o(19253533081600L, 143450);
      return;
    }
    catch (Exception parambjc)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.UpdateUtil", parambjc, "", new Object[0]);
      }
    }
  }
  
  public static void aT(Context paramContext, String paramString)
  {
    GMTrace.i(19252996210688L, 143446);
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.addFlags(268435456);
    localIntent.setDataAndType(Uri.fromFile(new File(paramString)), "application/vnd.android.package-archive");
    paramContext.startActivity(localIntent);
    GMTrace.o(19252996210688L, 143446);
  }
  
  public static String bJN()
  {
    GMTrace.i(19252190904320L, 143440);
    String str = ab.getContext().getSharedPreferences("update_config_prefs", 4).getString("update_downloaded_pack_md5_key", null);
    GMTrace.o(19252190904320L, 143440);
    return str;
  }
  
  public static int bJO()
  {
    GMTrace.i(19252325122048L, 143441);
    int i = ab.getContext().getSharedPreferences("update_config_prefs", 4).getInt("update_downloaded_pack_update_type", 3);
    GMTrace.o(19252325122048L, 143441);
    return i;
  }
  
  public static boolean bJP()
  {
    GMTrace.i(19252459339776L, 143442);
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("update_config_prefs", 4);
    long l1 = localSharedPreferences.getLong("update_downloaded_cancel_ts", 0L);
    int i = localSharedPreferences.getInt("update_downloaded_cancel_times", 0);
    w.i("MicroMsg.UpdateUtil", "checkIgnoreDownloadedPack last: %s times: %s", new Object[] { Long.valueOf(l1), Integer.valueOf(i) });
    if (i > tpy.length - 1)
    {
      GMTrace.o(19252459339776L, 143442);
      return true;
    }
    long l2 = tpy[i];
    if (System.currentTimeMillis() - l1 > l2)
    {
      GMTrace.o(19252459339776L, 143442);
      return false;
    }
    if (System.currentTimeMillis() - l1 < 0L)
    {
      w.e("MicroMsg.UpdateUtil", "user modify mobile time. we just remove the config.");
      ab.getContext().getSharedPreferences("update_config_prefs", 4).edit().clear().commit();
      w.i("MicroMsg.UpdateUtil", "clearUpdateConfigPrefs");
      GMTrace.o(19252459339776L, 143442);
      return true;
    }
    GMTrace.o(19252459339776L, 143442);
    return true;
  }
  
  public static boolean bJQ()
  {
    GMTrace.i(19252593557504L, 143443);
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("update_config_prefs", 4);
    long l = localSharedPreferences.getLong("update_downloading_in_silence", 0L);
    boolean bool = localSharedPreferences.getBoolean("update_download_start_one_immediate", false);
    w.i("MicroMsg.UpdateUtil", "hasUnfinishDownloadingInSilence unfinish %s", new Object[] { Long.valueOf(l) });
    if ((bool) || ((l != 0L) && (System.currentTimeMillis() - l > 3600000L)))
    {
      GMTrace.o(19252593557504L, 143443);
      return true;
    }
    GMTrace.o(19252593557504L, 143443);
    return false;
  }
  
  public static bjc bJR()
  {
    GMTrace.i(19253130428416L, 143447);
    Object localObject2 = ab.getContext().getSharedPreferences("tinker_patch_share_config", 4).getString(tpz, "");
    if (!bg.nm((String)localObject2)) {}
    for (;;)
    {
      try
      {
        localObject1 = new bjc();
        w.printErrStackTrace("MicroMsg.UpdateUtil", localException1, "parse tinker install failed.", new Object[0]);
      }
      catch (Exception localException1)
      {
        try
        {
          localObject2 = (bjc)((bjc)localObject1).aD(Base64.decode((String)localObject2, 0));
          localObject1 = localObject2;
          if (localObject1 == null) {
            break label93;
          }
          GMTrace.o(19253130428416L, 143447);
          return (bjc)localObject1;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        localObject1 = null;
      }
      continue;
      label93:
      w.i("MicroMsg.UpdateUtil", "update info is null.");
      GMTrace.o(19253130428416L, 143447);
      return null;
      Object localObject1 = null;
    }
  }
  
  public static boolean bJS()
  {
    GMTrace.i(19253264646144L, 143448);
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("tinker_patch_share_config", 4);
    long l1 = localSharedPreferences.getLong(tpA, 0L);
    int i = localSharedPreferences.getInt(tpB, 0);
    long l2 = System.currentTimeMillis();
    w.d("MicroMsg.UpdateUtil", "isNeedShowTinkerDialog now:%d last:%d time:%d", new Object[] { Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(i) });
    if ((l2 - l1 > 21600000L) && (i < 3))
    {
      GMTrace.o(19253264646144L, 143448);
      return true;
    }
    GMTrace.o(19253264646144L, 143448);
    return false;
  }
  
  public static void bJT()
  {
    GMTrace.i(19253398863872L, 143449);
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("tinker_patch_share_config", 4);
    localSharedPreferences.edit().putLong(tpA, System.currentTimeMillis()).apply();
    int i = localSharedPreferences.getInt(tpB, 0);
    localSharedPreferences.edit().putInt(tpB, i + 1).apply();
    GMTrace.o(19253398863872L, 143449);
  }
  
  public static void bJU()
  {
    GMTrace.i(19253667299328L, 143451);
    w.i("MicroMsg.UpdateUtil", "clearInstallUpdateInfo.");
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("tinker_patch_share_config", 4);
    localSharedPreferences.edit().putString(tpz, "").apply();
    localSharedPreferences.edit().putLong(tpA, 0L).apply();
    localSharedPreferences.edit().putInt(tpB, 0).apply();
    GMTrace.o(19253667299328L, 143451);
  }
  
  public static void bJV()
  {
    GMTrace.i(19253801517056L, 143452);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19252056686592L, 143439);
        w.i("MicroMsg.UpdateUtil", "delete apk file. on worker thread");
        com.tencent.mm.a.e.ba(p.bJW());
        GMTrace.o(19252056686592L, 143439);
      }
    });
    GMTrace.o(19253801517056L, 143452);
  }
  
  public static String bJW()
  {
    GMTrace.i(19253935734784L, 143453);
    if (bg.nm(tpC)) {
      tpC = com.tencent.mm.compatible.util.e.fRX + "bsdiff/";
    }
    String str = tpC;
    GMTrace.o(19253935734784L, 143453);
    return str;
  }
  
  public static String[] bJX()
  {
    int i = 0;
    GMTrace.i(19254204170240L, 143455);
    if ((r.hjS != null) && (r.hjS.length() > 0))
    {
      localObject = r.hjS;
      GMTrace.o(19254204170240L, 143455);
      return new String[] { localObject };
    }
    Object localObject = ab.getContext().getSharedPreferences("system_config_prefs", 0).getString("builtin_short_ips", "");
    if ((localObject != null) && (((String)localObject).length() > 0)) {}
    String[] arrayOfString;
    for (;;)
    {
      localObject = n.Qe((String)localObject);
      arrayOfString = new String[((List)localObject).size()];
      while (i < ((List)localObject).size())
      {
        arrayOfString[i] = ((n)((List)localObject).get(i)).mwD;
        i += 1;
      }
      localObject = "0,112.64.200.240,80|0,180.153.82.27,80|0,117.135.130.177,80";
    }
    GMTrace.o(19254204170240L, 143455);
    return arrayOfString;
  }
  
  public static String dQ(Context paramContext)
  {
    GMTrace.i(19252727775232L, 143444);
    paramContext = dR(paramContext);
    if ((paramContext == null) || (!new File(paramContext).exists()))
    {
      GMTrace.o(19252727775232L, 143444);
      return null;
    }
    a locala = a.bq(paramContext);
    if ((locala != null) && (locala.eqS != null))
    {
      paramContext = locala.eqS.apkMd5;
      GMTrace.o(19252727775232L, 143444);
      return paramContext;
    }
    paramContext = g.bg(paramContext);
    GMTrace.o(19252727775232L, 143444);
    return paramContext;
  }
  
  public static String dR(Context paramContext)
  {
    GMTrace.i(19252861992960L, 143445);
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).applicationInfo.sourceDir;
      GMTrace.o(19252861992960L, 143445);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.UpdateUtil", paramContext, "", new Object[0]);
      GMTrace.o(19252861992960L, 143445);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\i\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
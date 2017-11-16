package com.tencent.mm.plugin.hp.tinker;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
{
  public static boolean ae(Context paramContext, String paramString)
  {
    GMTrace.i(18991003205632L, 141494);
    paramContext = paramContext.getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_before_install", "");
    w.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "isBeforeDownloadDialogHaveCancel current patchID :%s patchID:%s", new Object[] { paramContext, paramString });
    if ((!bg.nm(paramContext)) && (!bg.nm(paramString)) && (paramContext.equalsIgnoreCase(paramString)))
    {
      GMTrace.o(18991003205632L, 141494);
      return true;
    }
    GMTrace.o(18991003205632L, 141494);
    return false;
  }
  
  public static void af(Context paramContext, String paramString)
  {
    GMTrace.i(18991137423360L, 141495);
    paramContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_before_install", paramString).apply();
    GMTrace.o(18991137423360L, 141495);
  }
  
  public static void aq(Context paramContext, int paramInt)
  {
    GMTrace.i(21074867650560L, 157020);
    paramContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putInt("tinker_node_retry_time", paramInt).apply();
    GMTrace.o(21074867650560L, 157020);
  }
  
  public static void bU(Context paramContext, String paramString)
  {
    GMTrace.i(21074733432832L, 157019);
    paramContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_node", paramString).apply();
    GMTrace.o(21074733432832L, 157019);
  }
  
  public static void cH(Context paramContext)
  {
    GMTrace.i(16256585433088L, 121121);
    int i = com.tencent.mm.k.g.ut().getInt("TinkerCheckUpdateInterval", 12);
    if (i < 0)
    {
      w.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "saveTinkerCheckUpdateTinker hours < 0 ");
      GMTrace.o(16256585433088L, 121121);
      return;
    }
    w.i("MicroMsg.Tinker.TinkerPatchSharedPreferencesUtil", "saveTinkerCheckUpdateTinker hours:%d", new Object[] { Integer.valueOf(i) });
    paramContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putInt("check_tinker_update_interval", i).apply();
    GMTrace.o(16256585433088L, 121121);
  }
  
  public static int cI(Context paramContext)
  {
    GMTrace.i(16256719650816L, 121122);
    int i = paramContext.getSharedPreferences("tinker_patch_share_config", 4).getInt("check_tinker_update_interval", 12);
    GMTrace.o(16256719650816L, 121122);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\tinker\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
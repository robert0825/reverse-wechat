package com.tencent.mm.compatible.h;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.t;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  private static int fRO;
  
  static
  {
    GMTrace.i(13777315561472L, 102649);
    fRO = 0;
    GMTrace.o(13777315561472L, 102649);
  }
  
  public static void aP(boolean paramBoolean)
  {
    GMTrace.i(13777181343744L, 102648);
    SharedPreferences localSharedPreferences = ab.bPV();
    boolean bool = localSharedPreferences.getBoolean("settings_support_swipe", true);
    if (bool != paramBoolean) {
      localSharedPreferences.edit().putBoolean("settings_support_swipe", paramBoolean).commit();
    }
    w.i("MicroMsg.StyleUtil", "switchSwipebackMode, from %B to %B", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(paramBoolean) });
    GMTrace.o(13777181343744L, 102648);
  }
  
  public static boolean tw()
  {
    GMTrace.i(13777047126016L, 102647);
    Object localObject;
    if ((bg.aq(Build.VERSION.INCREMENTAL, "").toLowerCase().contains("flyme")) || (bg.aq(Build.DISPLAY, "").toLowerCase().contains("flyme")))
    {
      i = 1;
      if (i == 0) {
        break label117;
      }
      localObject = p.fQH;
      if (!ab.bPY()) {
        ((t)localObject).fRd = MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "system_config_prefs", 4).getInt("update_swip_back_status", 0);
      }
      if (((t)localObject).fRd != 1) {
        break label112;
      }
    }
    label112:
    for (int i = 0;; i = 1)
    {
      if (i == 0) {
        break label117;
      }
      GMTrace.o(13777047126016L, 102647);
      return false;
      i = 0;
      break;
    }
    label117:
    if (fRO == 0)
    {
      localObject = ab.bPV();
      if ((localObject == null) || (!((SharedPreferences)localObject).getBoolean("settings_support_swipe", true))) {
        break label164;
      }
    }
    label164:
    for (fRO = 1; fRO == 1; fRO = 2)
    {
      GMTrace.o(13777047126016L, 102647);
      return true;
    }
    GMTrace.o(13777047126016L, 102647);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
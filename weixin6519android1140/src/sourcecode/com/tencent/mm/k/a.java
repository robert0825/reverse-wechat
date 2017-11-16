package com.tencent.mm.k;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.RingtoneManager;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public class a
{
  public static final String fSD;
  private static SharedPreferences fSE;
  private static SharedPreferences fSF;
  private static String fSG;
  
  static
  {
    GMTrace.i(4095117099008L, 30511);
    fSD = null;
    fSE = null;
    fSF = null;
    fSG = fSD;
    GMTrace.o(4095117099008L, 30511);
  }
  
  public static boolean aA(int paramInt1, int paramInt2)
  {
    GMTrace.i(4094982881280L, 30510);
    if (tQ())
    {
      GMTrace.o(4094982881280L, 30510);
      return true;
    }
    int i = tR();
    int j = tT();
    int k = tS();
    int m = tU();
    if ((i == k) && (j == m))
    {
      GMTrace.o(4094982881280L, 30510);
      return false;
    }
    if ((i == k) && (j < m))
    {
      if ((paramInt1 == i) && (paramInt2 > j) && (paramInt2 < m))
      {
        GMTrace.o(4094982881280L, 30510);
        return true;
      }
      GMTrace.o(4094982881280L, 30510);
      return false;
    }
    if (k > i)
    {
      if (((paramInt1 > i) && (paramInt1 < k)) || ((paramInt1 == i) && (paramInt2 > j)) || ((paramInt1 == k) && (paramInt2 < m)))
      {
        GMTrace.o(4094982881280L, 30510);
        return true;
      }
      GMTrace.o(4094982881280L, 30510);
      return false;
    }
    if ((k < i) || ((i == k) && (j > m)))
    {
      if (((paramInt1 > i) && (paramInt1 <= 23)) || ((paramInt1 == i) && (paramInt2 > j)) || ((paramInt1 == k) && (paramInt2 < m)) || ((paramInt1 > 0) && (paramInt1 < k)))
      {
        GMTrace.o(4094982881280L, 30510);
        return true;
      }
      GMTrace.o(4094982881280L, 30510);
      return false;
    }
    GMTrace.o(4094982881280L, 30510);
    return true;
  }
  
  static void dU(String paramString)
  {
    GMTrace.i(16293629526016L, 121397);
    ab.bPV().edit().putString("settings.ringtone", paramString).commit();
    com.tencent.mm.kernel.a.wJ().edit().putString("settings.ringtone", paramString).commit();
    GMTrace.o(16293629526016L, 121397);
  }
  
  public static SharedPreferences tI()
  {
    GMTrace.i(4093238050816L, 30497);
    SharedPreferences localSharedPreferences = aa.OR();
    fSF = localSharedPreferences;
    GMTrace.o(4093238050816L, 30497);
    return localSharedPreferences;
  }
  
  public static boolean tJ()
  {
    GMTrace.i(4093372268544L, 30498);
    boolean bool = com.tencent.mm.kernel.a.wJ().getBoolean("command_notification_status", false);
    GMTrace.o(4093372268544L, 30498);
    return bool;
  }
  
  public static boolean tK()
  {
    GMTrace.i(4093506486272L, 30499);
    boolean bool = com.tencent.mm.kernel.a.wJ().getBoolean("settings_new_msg_notification", true);
    GMTrace.o(4093506486272L, 30499);
    return bool;
  }
  
  public static boolean tL()
  {
    GMTrace.i(4093640704000L, 30500);
    boolean bool = com.tencent.mm.kernel.a.wJ().getBoolean("settings_new_voip_msg_notification", true);
    GMTrace.o(4093640704000L, 30500);
    return bool;
  }
  
  public static boolean tM()
  {
    GMTrace.i(4093774921728L, 30501);
    boolean bool = com.tencent.mm.kernel.a.wJ().getBoolean("settings_show_detail", true);
    GMTrace.o(4093774921728L, 30501);
    return bool;
  }
  
  public static boolean tN()
  {
    GMTrace.i(4093909139456L, 30502);
    boolean bool = com.tencent.mm.kernel.a.wJ().getBoolean("settings_sound", true);
    GMTrace.o(4093909139456L, 30502);
    return bool;
  }
  
  public static String tO()
  {
    GMTrace.i(4094043357184L, 30503);
    String str2 = com.tencent.mm.kernel.a.wJ().getString("settings.ringtone", fSD);
    String str1 = str2;
    if (str2 != fSD)
    {
      str1 = str2;
      if (!str2.equals(fSG))
      {
        RingtoneManager localRingtoneManager = new RingtoneManager(ab.getContext());
        localRingtoneManager.setType(2);
        str1 = str2;
        if (localRingtoneManager.getRingtonePosition(Uri.parse(str2)) < 0)
        {
          str1 = fSD;
          dU(str1);
          w.i("MicroMsg.BaseNotificationConfig", "reset ringTone");
        }
        fSG = str1;
      }
    }
    GMTrace.o(4094043357184L, 30503);
    return str1;
  }
  
  public static boolean tP()
  {
    GMTrace.i(4094177574912L, 30504);
    boolean bool = com.tencent.mm.kernel.a.wJ().getBoolean("settings_shake", true);
    GMTrace.o(4094177574912L, 30504);
    return bool;
  }
  
  public static boolean tQ()
  {
    GMTrace.i(4094311792640L, 30505);
    boolean bool = com.tencent.mm.kernel.a.wJ().getBoolean("settings_active_time_full", true);
    GMTrace.o(4094311792640L, 30505);
    return bool;
  }
  
  public static int tR()
  {
    GMTrace.i(4094446010368L, 30506);
    int i = com.tencent.mm.kernel.a.wJ().getInt("settings_active_begin_time_hour", 8);
    GMTrace.o(4094446010368L, 30506);
    return i;
  }
  
  public static int tS()
  {
    GMTrace.i(4094580228096L, 30507);
    int i = com.tencent.mm.kernel.a.wJ().getInt("settings_active_end_time_hour", 23);
    GMTrace.o(4094580228096L, 30507);
    return i;
  }
  
  public static int tT()
  {
    GMTrace.i(4094714445824L, 30508);
    int i = com.tencent.mm.kernel.a.wJ().getInt("settings_active_begin_time_min", 0);
    GMTrace.o(4094714445824L, 30508);
    return i;
  }
  
  public static int tU()
  {
    GMTrace.i(4094848663552L, 30509);
    int i = com.tencent.mm.kernel.a.wJ().getInt("settings_active_end_time_min", 0);
    GMTrace.o(4094848663552L, 30509);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\k\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
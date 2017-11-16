package com.tencent.mm.k;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.a.d;
import com.tencent.mm.g.a.si;
import com.tencent.mm.g.a.si.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import com.tencent.mm.y.k;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.List;
import java.util.Map;

public final class f
  extends a
{
  private static String TAG;
  
  static
  {
    GMTrace.i(4099680501760L, 30545);
    TAG = "MicroMsg.NotificationConfig";
    GMTrace.o(4099680501760L, 30545);
  }
  
  public static void aB(int paramInt1, int paramInt2)
  {
    GMTrace.i(4096325058560L, 30520);
    SharedPreferences localSharedPreferences = ab.bPV();
    localSharedPreferences.edit().putInt("settings_active_begin_time_hour", paramInt1).commit();
    localSharedPreferences.edit().putInt("settings_active_begin_time_min", paramInt2).commit();
    localSharedPreferences = com.tencent.mm.kernel.a.wJ();
    localSharedPreferences.edit().putInt("settings_active_begin_time_hour", paramInt1).commit();
    localSharedPreferences.edit().putInt("settings_active_begin_time_min", paramInt2).commit();
    w.i(TAG, "[NOTIFICATION SETTINGS]double write : saveActiveBegine: %d:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(4096325058560L, 30520);
  }
  
  public static void aC(int paramInt1, int paramInt2)
  {
    GMTrace.i(4096459276288L, 30521);
    SharedPreferences localSharedPreferences = ab.bPV();
    localSharedPreferences.edit().putInt("settings_active_end_time_hour", paramInt1).commit();
    localSharedPreferences.edit().putInt("settings_active_end_time_min", paramInt2).commit();
    localSharedPreferences = com.tencent.mm.kernel.a.wJ();
    localSharedPreferences.edit().putInt("settings_active_end_time_hour", paramInt1).commit();
    localSharedPreferences.edit().putInt("settings_active_end_time_min", paramInt2).commit();
    w.i(TAG, "[NOTIFICATION SETTINGS]double write : saveActiveEnd: %d:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(4096459276288L, 30521);
  }
  
  public static void aQ(boolean paramBoolean)
  {
    GMTrace.i(4095251316736L, 30512);
    ab.bPV().edit().putBoolean("settings_new_msg_notification", paramBoolean).commit();
    com.tencent.mm.kernel.a.wJ().edit().putBoolean("settings_new_msg_notification", paramBoolean).commit();
    w.i(TAG, "[NOTIFICATION SETTINGS]double write : saveNewMsgNotification: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(4095251316736L, 30512);
  }
  
  public static void aR(boolean paramBoolean)
  {
    GMTrace.i(4095385534464L, 30513);
    ab.bPV().edit().putBoolean("settings_new_voip_msg_notification", paramBoolean).commit();
    com.tencent.mm.kernel.a.wJ().edit().putBoolean("settings_new_voip_msg_notification", paramBoolean).commit();
    w.i(TAG, "[NOTIFICATION SETTINGS]double write : saveNewVoIPMsgNotification: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(4095385534464L, 30513);
  }
  
  public static void aS(boolean paramBoolean)
  {
    GMTrace.i(4095519752192L, 30514);
    ab.bPV().edit().putBoolean("settings_show_detail", paramBoolean).commit();
    com.tencent.mm.kernel.a.wJ().edit().putBoolean("settings_show_detail", paramBoolean).commit();
    w.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsShowDetail: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(4095519752192L, 30514);
  }
  
  public static void aT(boolean paramBoolean)
  {
    GMTrace.i(4095653969920L, 30515);
    com.tencent.mm.kernel.a.wJ().edit().putBoolean("command_notification_status", paramBoolean).commit();
    w.i(TAG, "[NOTIFICATION SETTINGS]is notification by system: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(4095653969920L, 30515);
  }
  
  public static void aU(boolean paramBoolean)
  {
    GMTrace.i(4095788187648L, 30516);
    ab.bPV().edit().putBoolean("settings_sound", paramBoolean).commit();
    com.tencent.mm.kernel.a.wJ().edit().putBoolean("settings_sound", paramBoolean).commit();
    w.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsSound: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(4095788187648L, 30516);
  }
  
  public static void aV(boolean paramBoolean)
  {
    GMTrace.i(4095922405376L, 30517);
    ab.bPV().edit().putBoolean("settings_shake", paramBoolean).commit();
    com.tencent.mm.kernel.a.wJ().edit().putBoolean("settings_shake", paramBoolean).commit();
    w.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsShake: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(4095922405376L, 30517);
  }
  
  public static void aW(boolean paramBoolean)
  {
    GMTrace.i(4096190840832L, 30519);
    ab.bPV().edit().putBoolean("settings_active_time_full", paramBoolean).commit();
    com.tencent.mm.kernel.a.wJ().edit().putBoolean("settings_active_time_full", paramBoolean).commit();
    w.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsActiveTime: %B", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(4096190840832L, 30519);
  }
  
  public static int d(au paramau)
  {
    int j = 0;
    GMTrace.i(4097935671296L, 30532);
    if (s.fD(paramau.field_talker)) {}
    for (int i = 0; (paramau.field_bizChatId != -1L) && (com.tencent.mm.af.f.dL(paramau.field_talker)); i = 3)
    {
      com.tencent.mm.af.a.c localc = com.tencent.mm.af.x.FI().t(paramau.field_bizChatId);
      if ((localc.FU()) || (!localc.fN(1))) {
        break;
      }
      GMTrace.o(4097935671296L, 30532);
      return i;
    }
    paramau = paramau.fwv;
    if (bg.nm(paramau))
    {
      GMTrace.o(4097935671296L, 30532);
      return i;
    }
    paramau = bh.q(paramau, "msgsource");
    if ((paramau == null) || (paramau.isEmpty()))
    {
      GMTrace.o(4097935671296L, 30532);
      return i;
    }
    for (;;)
    {
      int k;
      try
      {
        k = Integer.parseInt((String)paramau.get(".msgsource.tips"));
        if (((k & 0x1) == 0) && ((k & 0x2) != 0))
        {
          i = j;
          GMTrace.o(4097935671296L, 30532);
          return i;
        }
      }
      catch (Exception paramau)
      {
        GMTrace.o(4097935671296L, 30532);
        return i;
      }
      i = k;
    }
  }
  
  public static void dU(String paramString)
  {
    GMTrace.i(4096056623104L, 30518);
    a.dU(paramString);
    w.i(TAG, "[NOTIFICATION SETTINGS]double write : saveSoundTone: %s", new Object[] { paramString });
    GMTrace.o(4096056623104L, 30518);
  }
  
  public static boolean dX(String paramString)
  {
    GMTrace.i(4097264582656L, 30527);
    si localsi = new si();
    localsi.eXf.eHJ = 1;
    localsi.eXf.content = paramString;
    com.tencent.mm.sdk.b.a.vgX.m(localsi);
    if ((localsi.eXg.type == 2) || (paramString.equals(au.vBm)))
    {
      GMTrace.o(4097264582656L, 30527);
      return true;
    }
    GMTrace.o(4097264582656L, 30527);
    return false;
  }
  
  public static boolean dY(String paramString)
  {
    GMTrace.i(4097398800384L, 30528);
    si localsi = new si();
    localsi.eXf.eHJ = 1;
    localsi.eXf.content = paramString;
    com.tencent.mm.sdk.b.a.vgX.m(localsi);
    if ((localsi.eXg.type == 3) || (paramString.equals(au.vBl)))
    {
      GMTrace.o(4097398800384L, 30528);
      return true;
    }
    GMTrace.o(4097398800384L, 30528);
    return false;
  }
  
  public static int dZ(String paramString)
  {
    GMTrace.i(4098472542208L, 30536);
    int i = com.tencent.mm.y.t.G(paramString, null);
    GMTrace.o(4098472542208L, 30536);
    return i;
  }
  
  public static boolean e(au paramau)
  {
    GMTrace.i(4099277848576L, 30542);
    if (paramau == null)
    {
      GMTrace.o(4099277848576L, 30542);
      return false;
    }
    boolean bool = paramau.Ug(q.zE());
    GMTrace.o(4099277848576L, 30542);
    return bool;
  }
  
  public static boolean ea(String paramString)
  {
    GMTrace.i(4098606759936L, 30537);
    boolean bool = com.tencent.mm.storage.x.fw(paramString);
    GMTrace.o(4098606759936L, 30537);
    return bool;
  }
  
  public static boolean eb(String paramString)
  {
    GMTrace.i(4098740977664L, 30538);
    boolean bool = paramString.toLowerCase().endsWith("@chatroom");
    GMTrace.o(4098740977664L, 30538);
    return bool;
  }
  
  public static boolean ec(String paramString)
  {
    GMTrace.i(4099009413120L, 30540);
    if ((s.gr(paramString)) || ((s.eb(paramString)) && (!s.gq(paramString))))
    {
      GMTrace.o(4099009413120L, 30540);
      return true;
    }
    GMTrace.o(4099009413120L, 30540);
    return false;
  }
  
  public static int ed(String paramString)
  {
    GMTrace.i(4099143630848L, 30541);
    at.AR();
    int i = com.tencent.mm.y.c.yP().Ub(paramString);
    GMTrace.o(4099143630848L, 30541);
    return i;
  }
  
  public static void ey(int paramInt)
  {
    GMTrace.i(4096727711744L, 30523);
    com.tencent.mm.kernel.a.wJ().edit().putInt("notification.status.webonline.push.open", paramInt).commit();
    GMTrace.o(4096727711744L, 30523);
  }
  
  public static boolean ez(int paramInt)
  {
    GMTrace.i(4097130364928L, 30526);
    if ((paramInt == 50) || (paramInt == 53))
    {
      GMTrace.o(4097130364928L, 30526);
      return true;
    }
    GMTrace.o(4097130364928L, 30526);
    return false;
  }
  
  public static boolean uk()
  {
    GMTrace.i(4096593494016L, 30522);
    boolean bool = com.tencent.mm.y.c.fg(com.tencent.mm.kernel.a.wI());
    GMTrace.o(4096593494016L, 30522);
    return bool;
  }
  
  public static boolean ul()
  {
    GMTrace.i(4096861929472L, 30524);
    boolean bool = q.fo(com.tencent.mm.kernel.a.wJ().getInt("notification.status.webonline.push.open", 0));
    GMTrace.o(4096861929472L, 30524);
    return bool;
  }
  
  public static void um()
  {
    GMTrace.i(4096996147200L, 30525);
    SharedPreferences localSharedPreferences = ab.bPV();
    SharedPreferences.Editor localEditor = com.tencent.mm.kernel.a.wJ().edit();
    boolean bool1 = localSharedPreferences.getBoolean("settings_new_msg_notification", true);
    localEditor.putBoolean("settings_new_msg_notification", bool1);
    localEditor.putBoolean("settings_new_voip_msg_notification", localSharedPreferences.getBoolean("settings_new_voip_msg_notification", true));
    boolean bool2 = localSharedPreferences.getBoolean("settings_show_detail", true);
    localEditor.putBoolean("settings_show_detail", bool2);
    boolean bool3 = localSharedPreferences.getBoolean("settings_sound", true);
    localEditor.putBoolean("settings_sound", bool3);
    String str = localSharedPreferences.getString("settings.ringtone", fSD);
    localEditor.putString("settings.ringtone", str);
    boolean bool4 = localSharedPreferences.getBoolean("settings_shake", true);
    localEditor.putBoolean("settings_shake", bool4);
    boolean bool5 = localSharedPreferences.getBoolean("settings_active_time_full", true);
    localEditor.putBoolean("settings_active_time_full", bool5);
    int i = localSharedPreferences.getInt("settings_active_begin_time_hour", 8);
    localEditor.putInt("settings_active_begin_time_hour", i);
    int j = localSharedPreferences.getInt("settings_active_begin_time_min", 0);
    localEditor.putInt("settings_active_begin_time_min", j);
    int k = localSharedPreferences.getInt("settings_active_end_time_hour", 23);
    localEditor.putInt("settings_active_end_time_hour", k);
    int m = localSharedPreferences.getInt("settings_active_end_time_min", 0);
    localEditor.putInt("settings_active_end_time_min", m);
    localEditor.commit();
    w.i(TAG, "notification config copyDefault, newMsgNotification: %B, showDetail: %B, isSound: %B, ringTone: %s, isShake: %B, isActiveTime: %B, begin: %d:%d, end: %d:Td", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), str, Boolean.valueOf(bool4), Boolean.valueOf(bool5), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
    GMTrace.o(4096996147200L, 30525);
  }
  
  public static int un()
  {
    GMTrace.i(4098069889024L, 30533);
    if (!at.AU())
    {
      w.w(TAG, "getUnReadTalkerCount, but mmcore not ready");
      GMTrace.o(4098069889024L, 30533);
      return 0;
    }
    int i = com.tencent.mm.y.t.gv(s.gmw);
    GMTrace.o(4098069889024L, 30533);
    return i;
  }
  
  public static List<String> uo()
  {
    GMTrace.i(4098204106752L, 30534);
    List localList = com.tencent.mm.y.t.w(s.gmw, -1);
    GMTrace.o(4098204106752L, 30534);
    return localList;
  }
  
  public static int up()
  {
    GMTrace.i(4098338324480L, 30535);
    if (!at.AU())
    {
      w.w(TAG, "getUnReadMsgCoun, but mmcore not ready");
      GMTrace.o(4098338324480L, 30535);
      return 0;
    }
    int i = com.tencent.mm.y.t.gu(s.gmw);
    GMTrace.o(4098338324480L, 30535);
    return i;
  }
  
  public static int uq()
  {
    GMTrace.i(4098875195392L, 30539);
    int i = k.zB();
    GMTrace.o(4098875195392L, 30539);
    return i;
  }
  
  public static boolean ur()
  {
    GMTrace.i(4099412066304L, 30543);
    at.AR();
    boolean bool = ((Boolean)com.tencent.mm.y.c.xh().get(73217, Boolean.valueOf(true))).booleanValue();
    GMTrace.o(4099412066304L, 30543);
    return bool;
  }
  
  public static boolean us()
  {
    GMTrace.i(4099546284032L, 30544);
    at.AR();
    boolean bool = ((Boolean)com.tencent.mm.y.c.xh().get(73218, Boolean.valueOf(true))).booleanValue();
    GMTrace.o(4099546284032L, 30544);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\k\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
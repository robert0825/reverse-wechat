package com.tencent.mm.kernel;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class k
{
  public static boolean aS(Context paramContext)
  {
    GMTrace.i(13499082211328L, 100576);
    if (paramContext == null)
    {
      w.e("MicroMsg.WeChatAppStatus", "getFullExitStatus context == null");
      GMTrace.o(13499082211328L, 100576);
      return false;
    }
    boolean bool = paramContext.getSharedPreferences("system_config_prefs", 4).getBoolean("settings_fully_exit", true);
    GMTrace.o(13499082211328L, 100576);
    return bool;
  }
  
  public static boolean aT(Context paramContext)
  {
    GMTrace.i(13499350646784L, 100578);
    if (paramContext == null)
    {
      w.e("MicroMsg.WeChatAppStatus", "getShutDownWxStatus context == null");
      GMTrace.o(13499350646784L, 100578);
      return false;
    }
    boolean bool = paramContext.getSharedPreferences("system_config_prefs_showdown", 4).getBoolean("shut_down_weixin", false);
    GMTrace.o(13499350646784L, 100578);
    return bool;
  }
  
  public static void d(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(13498947993600L, 100575);
    if (paramContext == null)
    {
      w.e("MicroMsg.WeChatAppStatus", "editFullExitStatus context == null");
      GMTrace.o(13498947993600L, 100575);
      return;
    }
    paramContext.getSharedPreferences("system_config_prefs", 4).edit().putBoolean("settings_fully_exit", paramBoolean).commit();
    w.i("MicroMsg.WeChatAppStatus", "editFullExitStatus to " + paramBoolean);
    GMTrace.o(13498947993600L, 100575);
  }
  
  public static void e(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(13499216429056L, 100577);
    if (paramContext == null)
    {
      w.e("MicroMsg.WeChatAppStatus", "editShutDownWxStatus context == null");
      GMTrace.o(13499216429056L, 100577);
      return;
    }
    paramContext.getSharedPreferences("system_config_prefs_showdown", 4).edit().putBoolean("shut_down_weixin", paramBoolean).commit();
    w.i("MicroMsg.WeChatAppStatus", "editShutDownWxStatus to " + paramBoolean);
    GMTrace.o(13499216429056L, 100577);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
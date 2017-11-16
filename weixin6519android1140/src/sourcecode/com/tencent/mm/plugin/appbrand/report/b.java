package com.tencent.mm.plugin.appbrand.report;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;

public final class b
{
  public static int e(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(16166525337600L, 120450);
    if ((paramBundle == null) || (!jx(paramInt)))
    {
      GMTrace.o(16166525337600L, 120450);
      return 0;
    }
    paramInt = paramBundle.getInt("stat_scene");
    GMTrace.o(16166525337600L, 120450);
    return paramInt;
  }
  
  public static String f(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(16166659555328L, 120451);
    if ((paramBundle == null) || (!jx(paramInt)))
    {
      GMTrace.o(16166659555328L, 120451);
      return "";
    }
    switch (paramBundle.getInt("stat_scene"))
    {
    case 5: 
    default: 
      GMTrace.o(16166659555328L, 120451);
      return "";
    case 1: 
      paramBundle = paramBundle.getString("stat_send_msg_user");
      GMTrace.o(16166659555328L, 120451);
      return paramBundle;
    case 2: 
      str = paramBundle.getString("stat_chat_talker_username");
      paramBundle = paramBundle.getString("stat_send_msg_user");
      paramBundle = str + ":" + paramBundle;
      GMTrace.o(16166659555328L, 120451);
      return paramBundle;
    case 3: 
      str = paramBundle.getString("stat_msg_id");
      paramBundle = paramBundle.getString("stat_send_msg_user");
      paramBundle = str + ":" + paramBundle;
      GMTrace.o(16166659555328L, 120451);
      return paramBundle;
    case 4: 
      paramBundle = p.encode(paramBundle.getString("stat_url"));
      GMTrace.o(16166659555328L, 120451);
      return paramBundle;
    case 6: 
      str = paramBundle.getString("stat_app_id");
      paramBundle = paramBundle.getString("stat_url");
      paramBundle = str + ":" + p.encode(paramBundle);
      GMTrace.o(16166659555328L, 120451);
      return paramBundle;
    case 7: 
      paramBundle = paramBundle.getString("stat_chat_talker_username");
      GMTrace.o(16166659555328L, 120451);
      return paramBundle;
    case 8: 
      paramBundle = "search:" + paramBundle.getString("stat_search_id");
      GMTrace.o(16166659555328L, 120451);
      return paramBundle;
    }
    String str = paramBundle.getString("stat_chat_talker_username");
    paramBundle = paramBundle.getString("stat_send_msg_user");
    paramBundle = str + ":" + paramBundle;
    GMTrace.o(16166659555328L, 120451);
    return paramBundle;
  }
  
  private static boolean jx(int paramInt)
  {
    GMTrace.i(16166793773056L, 120452);
    switch (paramInt)
    {
    default: 
      GMTrace.o(16166793773056L, 120452);
      return false;
    }
    GMTrace.o(16166793773056L, 120452);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
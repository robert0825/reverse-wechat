package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Build.VERSION;
import java.util.HashMap;
import java.util.Map;

public class l
{
  private static String ayF;
  static Map<String, String> ayG = new HashMap();
  
  public static void ax(String paramString)
  {
    try
    {
      ayF = paramString;
      return;
    }
    finally {}
  }
  
  public static void j(Context paramContext, String paramString)
  {
    String str = Uri.parse("http://hostname/?" + paramString).getQueryParameter("conv");
    if ((str != null) && (str.length() > 0))
    {
      ayG.put(str, paramString);
      paramContext = paramContext.getSharedPreferences("gtm_click_referrers", 0).edit();
      paramContext.putString(str, paramString);
      if (Build.VERSION.SDK_INT >= 9) {
        paramContext.apply();
      }
    }
    else
    {
      return;
    }
    new Thread(new af.1(paramContext)).start();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
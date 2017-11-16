package com.tinkerboots.sdk.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class a
{
  private static ConnectivityManager yqP = null;
  
  public static boolean isConnected(Context paramContext)
  {
    if (yqP == null) {
      yqP = (ConnectivityManager)paramContext.getSystemService("connectivity");
    }
    if (yqP == null) {
      return false;
    }
    paramContext = yqP.getActiveNetworkInfo();
    if (paramContext != null) {}
    try
    {
      boolean bool = paramContext.isConnected();
      if (bool) {}
      for (bool = true;; bool = false) {
        return bool;
      }
      return false;
    }
    catch (Exception paramContext) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tinkerboots\sdk\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
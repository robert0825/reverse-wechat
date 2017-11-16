package org.xwalk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtil
{
  static Integer getNetworkType(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null) {
      return null;
    }
    paramContext = paramContext.getActiveNetworkInfo();
    if (paramContext == null) {
      return null;
    }
    return Integer.valueOf(paramContext.getType());
  }
  
  public static boolean isNetworkAvailable()
  {
    Object localObject = XWalkEnvironment.getApplicationContext();
    if (((Context)localObject).checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0)
    {
      XWalkInitializer.addXWalkInitializeLog("no network");
      return false;
    }
    localObject = getNetworkType((Context)localObject);
    if (localObject == null)
    {
      XWalkInitializer.addXWalkInitializeLog("no network");
      return false;
    }
    switch (((Integer)localObject).intValue())
    {
    default: 
      XWalkInitializer.addXWalkInitializeLog("no network");
      return false;
    }
    return true;
  }
  
  public static boolean isWifiAvailable()
  {
    Object localObject = XWalkEnvironment.getApplicationContext();
    if (((Context)localObject).checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {}
    do
    {
      return false;
      localObject = getNetworkType((Context)localObject);
    } while (localObject == null);
    switch (((Integer)localObject).intValue())
    {
    default: 
      return false;
    }
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\org\xwalk\core\NetworkUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
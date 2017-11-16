package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.DexLoader;
import java.lang.reflect.Field;

public class CookieSyncManager
{
  private static android.webkit.CookieSyncManager xTr;
  private static CookieSyncManager xTs;
  private static boolean xTt = false;
  
  private CookieSyncManager(Context paramContext)
  {
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX()))
    {
      localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_createInstance", new Class[] { Context.class }, new Object[] { paramContext });
      xTt = true;
    }
  }
  
  public static CookieSyncManager createInstance(Context paramContext)
  {
    try
    {
      xTr = android.webkit.CookieSyncManager.createInstance(paramContext);
      if ((xTs == null) || (!xTt)) {
        xTs = new CookieSyncManager(paramContext.getApplicationContext());
      }
      paramContext = xTs;
      return paramContext;
    }
    finally {}
  }
  
  public static CookieSyncManager getInstance()
  {
    try
    {
      if (xTs == null) {
        throw new IllegalStateException("CookieSyncManager::createInstance() needs to be called before CookieSyncManager::getInstance()");
      }
    }
    finally {}
    CookieSyncManager localCookieSyncManager = xTs;
    return localCookieSyncManager;
  }
  
  public void startSync()
  {
    Object localObject = ab.coW();
    if ((localObject != null) && (((ab)localObject).coX()))
    {
      ((ab)localObject).coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_startSync", new Class[0], new Object[0]);
      return;
    }
    xTr.startSync();
    try
    {
      localObject = Class.forName("android.webkit.WebSyncManager").getDeclaredField("mSyncThread");
      ((Field)localObject).setAccessible(true);
      ((Thread)((Field)localObject).get(xTr)).setUncaughtExceptionHandler(new SQLiteUncaughtExceptionHandler());
      return;
    }
    catch (Exception localException) {}
  }
  
  public void stopSync()
  {
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX()))
    {
      localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_stopSync", new Class[0], new Object[0]);
      return;
    }
    xTr.stopSync();
  }
  
  public void sync()
  {
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX()))
    {
      localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieSyncManager_Sync", new Class[0], new Object[0]);
      return;
    }
    xTr.sync();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\CookieSyncManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
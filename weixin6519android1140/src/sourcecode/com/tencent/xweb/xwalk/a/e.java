package com.tencent.xweb.xwalk.a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.Process;
import android.webkit.ValueCallback;
import java.util.Iterator;
import java.util.List;
import org.xwalk.core.NetworkUtil;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkUpdater;
import org.xwalk.core.XWalkUpdater.UpdateConfig;

public final class e
  extends AsyncTask<String, Integer, Integer>
{
  static XWalkUpdater ypM;
  static b yqw;
  
  public e(XWalkUpdater paramXWalkUpdater)
  {
    ypM = paramXWalkUpdater;
  }
  
  public static void Gs(int paramInt)
  {
    csK();
    c.Gs(paramInt);
  }
  
  static boolean b(c.a parama)
  {
    if (csI()) {}
    while (!NetworkUtil.isNetworkAvailable()) {
      return false;
    }
    if ((!parama.ypT) && (!NetworkUtil.isWifiAvailable()))
    {
      XWalkInitializer.addXWalkInitializeLog("current network is not wifi , this scheduler not support mobile data");
      return false;
    }
    XWalkUpdater localXWalkUpdater = ypM;
    XWalkUpdater.UpdateConfig localUpdateConfig;
    if (!parama.yqp) {
      if ((parama.ypN == null) || (parama.ypN.isEmpty()))
      {
        if (!c.a.$assertionsDisabled) {
          throw new AssertionError("royle:no md5 info, maybe something wrong");
        }
        localUpdateConfig = new XWalkUpdater.UpdateConfig(parama.ypS, false, parama.ypY);
      }
    }
    for (;;)
    {
      localUpdateConfig.versionDetail = parama.yqr;
      if (!localXWalkUpdater.updateXWalkRuntime(localUpdateConfig)) {
        break;
      }
      csJ();
      return true;
      localUpdateConfig = new XWalkUpdater.UpdateConfig(parama.ypN, false, null, parama.ypS, parama.ypY);
      continue;
      if ((parama.ypN == null) || (parama.ypN.isEmpty()) || (parama.ero == null) || (parama.ero.isEmpty()))
      {
        if (!c.a.$assertionsDisabled) {
          throw new AssertionError("royle:no md5 info, maybe something wrong");
        }
        localUpdateConfig = new XWalkUpdater.UpdateConfig(parama.ypS, true, parama.ypY);
      }
      else
      {
        localUpdateConfig = new XWalkUpdater.UpdateConfig(parama.ero, true, parama.ypN, parama.ypS, parama.ypY);
      }
    }
  }
  
  public static boolean csI()
  {
    int i = XWalkEnvironment.getSharedPreferencesForUpdateConfig().getInt("UpdatingProcessId", -1);
    if (i == Process.myPid())
    {
      XWalkInitializer.addXWalkInitializeLog("current process is in updating progress");
      return true;
    }
    if (i < 0) {
      return false;
    }
    Object localObject = (ActivityManager)XWalkEnvironment.getApplicationContext().getSystemService("activity");
    Process.myPid();
    int j = Process.myUid();
    localObject = ((ActivityManager)localObject).getRunningAppProcesses().iterator();
    while (((Iterator)localObject).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      if (localRunningAppProcessInfo.pid == i) {
        if (localRunningAppProcessInfo.uid == j)
        {
          XWalkInitializer.addXWalkInitializeLog("some process is in updating progress");
          return true;
        }
      }
    }
    csK();
    return false;
  }
  
  public static void csJ()
  {
    int i = Process.myPid();
    SharedPreferences.Editor localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    localEditor.putInt("UpdatingProcessId", i);
    localEditor.commit();
    XWalkInitializer.addXWalkInitializeLog("start updating progress");
  }
  
  public static void csK()
  {
    Process.myPid();
    SharedPreferences.Editor localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    localEditor.remove("UpdatingProcessId");
    localEditor.commit();
    XWalkInitializer.addXWalkInitializeLog("finish updating progress");
  }
  
  public static void csL()
  {
    XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    csK();
    c.a(null);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\xwalk\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.xweb.xwalk.a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.regex.Pattern;
import org.xwalk.core.NetworkUtil;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;

public class c
{
  static c yqm;
  static a yqn;
  
  private static boolean C(long paramLong1, long paramLong2)
  {
    if ((paramLong1 > paramLong2 + 600000L) || (paramLong1 + 600000L < paramLong2)) {
      return true;
    }
    XWalkInitializer.addXWalkInitializeLog("the most recent time to fetch config is too close");
    return false;
  }
  
  public static void Gs(int paramInt)
  {
    if (!NetworkUtil.isNetworkAvailable()) {
      return;
    }
    Object localObject = XWalkEnvironment.getSharedPreferencesForUpdateConfig();
    int j = ((SharedPreferences)localObject).getInt("nTryCnt", 0) + 1;
    int i = j;
    if (paramInt < -2) {
      i = j + 3;
    }
    if (i > 3)
    {
      XWalkInitializer.addXWalkInitializeLog("FailedTooManytimes at this version");
      XWalkInitializer.addXWalkInitializeLog("abandon Current Scheduler");
      a(null);
      return;
    }
    csH().yqs = i;
    localObject = ((SharedPreferences)localObject).edit();
    ((SharedPreferences.Editor)localObject).putInt("nTryCnt", i);
    long l1 = System.currentTimeMillis();
    long l2 = i * 1000;
    XWalkInitializer.addXWalkInitializeLog("rescheduler update time after " + i * 1000 / 60000 + " minute");
    ((SharedPreferences.Editor)localObject).putLong("nTimeToUpdate", l1 + l2);
    ((SharedPreferences.Editor)localObject).commit();
  }
  
  public static a a(a.a parama)
  {
    if (parama == null) {}
    label153:
    label178:
    label215:
    label411:
    label422:
    label429:
    label439:
    label458:
    label466:
    for (;;)
    {
      return null;
      a locala1 = csH();
      if ((locala1 != null) && (locala1.ypO != parama.ypO))
      {
        a locala2 = new a();
        Object localObject;
        int j;
        int i;
        if ((parama == null) || (parama.ypP == null) || (parama.ypP.length == 0))
        {
          locala1 = null;
          if ((locala1 == null) || (locala1.ypY <= XWalkEnvironment.getAvailableVersion())) {
            break label458;
          }
          XWalkInitializer.addXWalkInitializeLog("got matched version");
          locala2.ypO = parama.ypO;
          locala2.ypN = locala1.ypN;
          locala2.ypY = locala1.ypY;
          locala2.yqr = locala1.yqc.yqe;
          locala2.ypT = locala1.ypT;
          if (locala1.yqb == null) {
            break label429;
          }
          localObject = locala1.yqb;
          j = localObject.length;
          i = 0;
          if (i >= j) {
            break label429;
          }
          parama = localObject[i];
          if (parama.ypR != XWalkEnvironment.getAvailableVersion()) {
            break label422;
          }
          XWalkInitializer.addXWalkInitializeLog("got matched patch");
          if (parama == null) {
            break label439;
          }
          locala2.yqp = true;
          locala2.ypS = parama.ypS;
          locala2.ero = parama.ypN;
          locala2.ypT = parama.ypT;
          i = (int)(Math.random() * locala1.ypZ);
          locala2.yqq = (i * 60 * 1000 + System.currentTimeMillis());
          XWalkInitializer.addXWalkInitializeLog("schedul after " + i + " minute to update");
        }
        for (parama = locala2;; parama = null)
        {
          if (parama == null) {
            break label466;
          }
          a(parama);
          return parama;
          j = Build.VERSION.SDK_INT;
          localObject = parama.ypP;
          int k = localObject.length;
          i = 0;
          for (;;)
          {
            if (i >= k) {
              break label411;
            }
            locala1 = localObject[i];
            if ((locala1 != null) && (locala1.ypU <= 10) && (locala1.ypV >= 10) && (locala1.ypW <= j) && (locala1.ypX >= j) && (XWalkEnvironment.isMatchGrey(locala1.yqd, locala1.ypY)) && ((locala1.yqa != null) && (!locala1.yqa.isEmpty()) && (!Pattern.matches(locala1.yqa, Build.MODEL)))) {
              break;
            }
            i += 1;
          }
          XWalkInitializer.addXWalkInitializeLog("no matched version");
          locala1 = null;
          break;
          i += 1;
          break label153;
          XWalkInitializer.addXWalkInitializeLog("no matched patch");
          parama = null;
          break label178;
          locala2.yqp = false;
          locala2.ypS = locala1.ypS;
          break label215;
          XWalkInitializer.addXWalkInitializeLog("no matched version");
        }
      }
    }
  }
  
  public static void a(a parama)
  {
    yqn = parama;
    if (parama == null) {
      yqn = new a();
    }
    parama = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    parama.putString("strMd5", yqn.ypN);
    parama.putString("strUrl", yqn.ypS);
    parama.putString("strConfigVer", yqn.ypO);
    parama.putBoolean("bIsPatchUpdate", yqn.yqp);
    parama.putBoolean("bCanUseCellular", yqn.ypT);
    parama.putLong("nTimeToUpdate", yqn.yqq);
    parama.putInt("nApkVer", yqn.ypY);
    parama.putInt("nTryCnt", yqn.yqs);
    parama.putString("strPatchMd5", yqn.ero);
    parama.putString("strVersionDetail", yqn.yqr);
    parama.commit();
  }
  
  public static c csB()
  {
    if (yqm == null) {
      yqm = new c();
    }
    return yqm;
  }
  
  public static boolean csC()
  {
    if (!csD()) {
      return false;
    }
    XWalkInitializer.addXWalkInitializeLog("has scheduler for update");
    return true;
  }
  
  private static boolean csD()
  {
    if ((csH() == null) || (csH().ypS == null) || (csH().ypS.isEmpty())) {}
    while (csH().ypY <= XWalkEnvironment.getAvailableVersion()) {
      return false;
    }
    return true;
  }
  
  public static boolean csE()
  {
    if (!csD()) {
      return false;
    }
    if (System.currentTimeMillis() >= csH().yqq)
    {
      XWalkInitializer.addXWalkInitializeLog("time to update");
      return true;
    }
    XWalkInitializer.addXWalkInitializeLog("has scheduler waiting for update, but time is not up");
    return false;
  }
  
  public static void csF()
  {
    csH().yqo = System.currentTimeMillis();
    SharedPreferences.Editor localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    localEditor.putLong("nLastFetchConfigTime", csH().yqo);
    localEditor.commit();
  }
  
  public static boolean csG()
  {
    if (csD()) {
      XWalkInitializer.addXWalkInitializeLog("has scheduler , don't need to fetch config");
    }
    long l1;
    long l2;
    do
    {
      do
      {
        return false;
        l1 = System.currentTimeMillis();
      } while (!C(l1, csH().yqo));
      l2 = XWalkEnvironment.getSharedPreferencesForUpdateConfig().getLong("nLastFetchConfigTime", 0L);
      csH().yqo = l2;
    } while (!C(l1, l2));
    XWalkInitializer.addXWalkInitializeLog("enough time after last time fetch config");
    return true;
  }
  
  public static a csH()
  {
    if (yqn != null) {
      return yqn;
    }
    yqn = new a();
    SharedPreferences localSharedPreferences = XWalkEnvironment.getSharedPreferencesForUpdateConfig();
    yqn.yqo = localSharedPreferences.getLong("nLastFetchConfigTime", 0L);
    if (!localSharedPreferences.contains("strUrl")) {
      return yqn;
    }
    yqn.ypN = localSharedPreferences.getString("strMd5", null);
    yqn.ypS = localSharedPreferences.getString("strUrl", null);
    yqn.ypO = localSharedPreferences.getString("strConfigVer", null);
    yqn.yqp = localSharedPreferences.getBoolean("bIsPatchUpdate", false);
    yqn.yqq = localSharedPreferences.getLong("nTimeToUpdate", 0L);
    yqn.ypY = localSharedPreferences.getInt("nApkVer", 0);
    yqn.yqs = localSharedPreferences.getInt("nTryCnt", 0);
    yqn.ero = localSharedPreferences.getString("strPatchMd5", null);
    yqn.yqr = localSharedPreferences.getString("strVersionDetail", null);
    yqn.ypT = localSharedPreferences.getBoolean("bCanUseCellular", false);
    return yqn;
  }
  
  public static final class a
  {
    public String ero;
    public String ypN;
    public String ypO;
    public String ypS;
    public boolean ypT;
    public int ypY;
    public long yqo;
    public boolean yqp;
    public long yqq;
    public String yqr;
    public int yqs;
    
    static
    {
      if (!c.class.desiredAssertionStatus()) {}
      for (boolean bool = true;; bool = false)
      {
        $assertionsDisabled = bool;
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\xwalk\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
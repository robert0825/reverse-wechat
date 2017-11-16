package com.tencent.liteav.basic.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.opengl.CropRect;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.UUID;

public class TXCSystemUtil
{
  public static final int NETWORK_TYPE_2G = 4;
  public static final int NETWORK_TYPE_3G = 3;
  public static final int NETWORK_TYPE_4G = 2;
  public static final int NETWORK_TYPE_UNKNOWN = 255;
  public static final int NETWORK_TYPE_WIFI = 1;
  private static long lastCpuCheckTimeStamps;
  private static int[] lastCpuUsage;
  private static boolean mFirstTimeRun;
  private static boolean mHasLoaded = false;
  private static float mIdleCPUTime1;
  private static float mIdleCPUTime2;
  private static String mLibraryPath;
  private static final Object mLoadLock;
  private static float mProcessCPUTime1;
  private static float mProcessCPUTime2;
  private static float mTotoalCPUTime1 = 0.0F;
  private static float mTotoalCPUTime2 = 0.0F;
  
  static
  {
    mProcessCPUTime1 = 0.0F;
    mProcessCPUTime2 = 0.0F;
    mIdleCPUTime1 = 0.0F;
    mIdleCPUTime2 = 0.0F;
    mFirstTimeRun = true;
    lastCpuUsage = new int[2];
    lastCpuCheckTimeStamps = 0L;
    mLibraryPath = "";
    mLoadLock = new Object();
  }
  
  public static String createUUID()
  {
    return UUID.randomUUID().toString();
  }
  
  public static CropRect cropTexture(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    if (paramInt1 * paramInt4 >= paramInt2 * paramInt3)
    {
      paramInt4 = paramInt2 * paramInt3 / paramInt4;
      paramInt3 = paramInt2;
      if (paramInt1 <= paramInt4) {
        break label67;
      }
    }
    label67:
    for (paramInt1 = paramInt1 - paramInt4 >> 1;; paramInt1 = 0)
    {
      if (paramInt2 > paramInt3) {
        i = paramInt2 - paramInt3 >> 1;
      }
      return new CropRect(paramInt1, i, paramInt4, paramInt3);
      paramInt3 = paramInt1 * paramInt4 / paramInt3;
      paramInt4 = paramInt1;
      break;
    }
  }
  
  private static long getAppCPUTime()
  {
    long l2 = 0L;
    try
    {
      int i = Process.myPid();
      Object localObject = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + i + "/stat")), 1000);
      String str = ((BufferedReader)localObject).readLine();
      ((BufferedReader)localObject).close();
      localObject = str.split(" ");
      long l1 = l2;
      if (localObject != null)
      {
        l1 = l2;
        if (!TextUtils.isEmpty(localObject[13]))
        {
          l1 = Long.parseLong(localObject[13]);
          l2 = Long.parseLong(localObject[14]);
          long l3 = Long.parseLong(localObject[15]);
          long l4 = Long.parseLong(localObject[16]);
          l1 = l4 + (l1 + l2 + l3);
        }
      }
      return l1;
    }
    catch (Exception localException) {}
    return 0L;
  }
  
  public static String getDevUUID(Context paramContext)
  {
    return TXCDRApi.getDevUUID(paramContext, TXCDRApi.getSimulateIDFA(paramContext));
  }
  
  public static String getDeviceName()
  {
    return Build.MODEL;
  }
  
  public static String getLibraryPath()
  {
    return mLibraryPath;
  }
  
  public static int getNetworkType(Context paramContext)
  {
    if (paramContext == null) {
      return 255;
    }
    Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
    paramContext = (TelephonyManager)paramContext.getSystemService("phone");
    localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    if (localObject == null) {
      return 255;
    }
    if (((NetworkInfo)localObject).getType() == 1) {
      return 1;
    }
    if (((NetworkInfo)localObject).getType() == 0)
    {
      switch (paramContext.getNetworkType())
      {
      default: 
        return 2;
      case 1: 
      case 2: 
      case 4: 
      case 7: 
      case 11: 
        return 4;
      case 3: 
      case 5: 
      case 6: 
      case 8: 
      case 9: 
      case 10: 
      case 12: 
      case 14: 
      case 15: 
        return 3;
      }
      return 2;
    }
    return 255;
  }
  
  public static String getPackageName(Context paramContext)
  {
    String str = "";
    if (paramContext != null) {}
    try
    {
      str = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).packageName;
      return str;
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  public static int[] getProcessCPURate()
  {
    float f1 = 0.0F;
    if ((lastCpuCheckTimeStamps != 0L) && (TXCTimeUtil.getTimeTick() - lastCpuCheckTimeStamps < 2000L)) {
      return lastCpuUsage;
    }
    int[] arrayOfInt = new int[2];
    if (mFirstTimeRun)
    {
      mProcessCPUTime1 = (float)getAppCPUTime();
      getTotalIdleCpuTime();
      mFirstTimeRun = false;
      arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
      return arrayOfInt;
    }
    mProcessCPUTime2 = (float)getAppCPUTime();
    getTotalIdleCpuTime();
    float f2;
    if (mTotoalCPUTime2 != mTotoalCPUTime1)
    {
      f2 = (mProcessCPUTime2 - mProcessCPUTime1) * 100.0F / (mTotoalCPUTime2 - mTotoalCPUTime1);
      f1 = (mTotoalCPUTime2 - mTotoalCPUTime1 - (mIdleCPUTime2 - mIdleCPUTime1)) * 100.0F / (mTotoalCPUTime2 - mTotoalCPUTime1);
    }
    for (;;)
    {
      mTotoalCPUTime1 = mTotoalCPUTime2;
      mProcessCPUTime1 = mProcessCPUTime2;
      mIdleCPUTime1 = mIdleCPUTime2;
      arrayOfInt[0] = ((int)(f2 * 10.0F));
      arrayOfInt[1] = ((int)(f1 * 10.0F));
      lastCpuUsage[0] = arrayOfInt[0];
      lastCpuUsage[1] = arrayOfInt[1];
      lastCpuCheckTimeStamps = TXCTimeUtil.getTimeTick();
      return arrayOfInt;
      f2 = 0.0F;
    }
  }
  
  private static void getTotalIdleCpuTime()
  {
    long l1 = 0L;
    try
    {
      localObject = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
      String str = ((BufferedReader)localObject).readLine();
      ((BufferedReader)localObject).close();
      localObject = str.split(" ");
      l2 = Long.parseLong(localObject[2]);
      l3 = Long.parseLong(localObject[3]);
      l4 = Long.parseLong(localObject[4]);
      long l5 = Long.parseLong(localObject[6]);
      long l6 = Long.parseLong(localObject[5]);
      long l7 = Long.parseLong(localObject[7]);
      long l8 = Long.parseLong(localObject[8]);
      l2 = l2 + l3 + l4 + l5 + l6 + l7 + l8;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        Object localObject;
        long l3;
        long l4;
        label161:
        long l2 = 0L;
      }
    }
    try
    {
      l3 = Long.parseLong(localObject[5]);
      l4 = Long.parseLong(localObject[6]);
      l1 = l4 + l3;
    }
    catch (Exception localException2)
    {
      break label161;
    }
    if (mFirstTimeRun)
    {
      mTotoalCPUTime1 = (float)l2;
      mIdleCPUTime1 = (float)l1;
      return;
    }
    mTotoalCPUTime2 = (float)l2;
    mIdleCPUTime2 = (float)l1;
  }
  
  public static String getUserId(Context paramContext)
  {
    return TXCDRApi.getSimulateIDFA(paramContext);
  }
  
  public static void loadLibrary(String paramString)
  {
    try
    {
      System.loadLibrary(paramString);
      return;
    }
    catch (Error localError)
    {
      loadLibrary(mLibraryPath, paramString);
      return;
    }
    catch (Exception localException)
    {
      loadLibrary(mLibraryPath, paramString);
    }
  }
  
  private static void loadLibrary(String paramString1, String paramString2)
  {
    try
    {
      if (!TextUtils.isEmpty(paramString1)) {
        System.load(paramString1 + "/lib" + paramString2 + ".so");
      }
      return;
    }
    catch (Exception paramString1) {}catch (Error paramString1) {}
  }
  
  public static void loadLiteAVLibrary()
  {
    synchronized (mLoadLock)
    {
      if (!mHasLoaded)
      {
        loadLibrary("stlport_shared");
        loadLibrary("saturn");
        loadLibrary("ijkffmpeg");
        loadLibrary("liteavsdk");
        mHasLoaded = true;
      }
      return;
    }
  }
  
  public static void notifyEvent(WeakReference<TXINotifyListener> paramWeakReference, int paramInt, Bundle paramBundle)
  {
    if (paramWeakReference == null) {}
    do
    {
      return;
      paramWeakReference = (TXINotifyListener)paramWeakReference.get();
    } while (paramWeakReference == null);
    paramWeakReference.onNotifyEvent(paramInt, paramBundle);
  }
  
  public static void notifyEvent(WeakReference<TXINotifyListener> paramWeakReference, int paramInt, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("EVT_ID", paramInt);
    localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
    if (paramString != null) {
      localBundle.putCharSequence("EVT_MSG", paramString);
    }
    notifyEvent(paramWeakReference, paramInt, localBundle);
  }
  
  public static void notifyEvent(WeakReference<TXINotifyListener> paramWeakReference, long paramLong, int paramInt, Bundle paramBundle)
  {
    if (paramWeakReference == null) {}
    do
    {
      return;
      paramWeakReference = (TXINotifyListener)paramWeakReference.get();
    } while (paramWeakReference == null);
    paramBundle.putLong("EVT_USERID", paramLong);
    paramWeakReference.onNotifyEvent(paramInt, paramBundle);
  }
  
  public static void notifyEvent(WeakReference<TXINotifyListener> paramWeakReference, long paramLong, int paramInt, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("EVT_USERID", paramLong);
    localBundle.putInt("EVT_ID", paramInt);
    localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
    if (paramString != null) {
      localBundle.putCharSequence("EVT_MSG", paramString);
    }
    notifyEvent(paramWeakReference, paramInt, localBundle);
  }
  
  public static void resetCpu()
  {
    mFirstTimeRun = true;
  }
  
  public static void setLibraryPath(String paramString)
  {
    mLibraryPath = paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\util\TXCSystemUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
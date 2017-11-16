package com.tencent.mars.comm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import java.io.PrintWriter;
import java.io.StringWriter;

public class PlatformComm
{
  static final int EMobile = 2;
  static final int ENoNet = -1;
  static final int EOtherNet = 3;
  static final int EWifi = 1;
  private static final boolean IS_PROXY_ON = false;
  static final int NETTYPE_2G = 3;
  static final int NETTYPE_3G = 4;
  static final int NETTYPE_4G = 5;
  static final int NETTYPE_NON = -1;
  static final int NETTYPE_NOT_WIFI = 0;
  static final int NETTYPE_UNKNOWN = 6;
  static final int NETTYPE_WAP = 2;
  static final int NETTYPE_WIFI = 1;
  private static final String TAG = "PlatformComm";
  public static Context context = null;
  public static ae handler = null;
  public static IResetProcess resetprocessimp = null;
  
  public static void init(Context paramContext, ae paramae)
  {
    context = paramContext;
    handler = paramae;
    NetworkSignalUtil.InitNetworkSignalUtil(paramContext);
  }
  
  static class APNInfo
  {
    public String extraInfo;
    public int netType;
    public int subNetType;
  }
  
  static class Assert
  {
    static void assertTrue(String paramString, boolean paramBoolean) {}
    
    static void assertTrue(boolean paramBoolean) {}
  }
  
  public static class C2Java
  {
    private static String exception2String(Exception paramException)
    {
      StringWriter localStringWriter = new StringWriter();
      paramException.printStackTrace(new PrintWriter(localStringWriter));
      return localStringWriter.toString();
    }
    
    public static PlatformComm.APNInfo getAPNInfo()
    {
      try
      {
        Object localObject = ((ConnectivityManager)PlatformComm.context.getSystemService("connectivity")).getActiveNetworkInfo();
        PlatformComm.APNInfo localAPNInfo = new PlatformComm.APNInfo();
        if (localObject != null)
        {
          localAPNInfo.netType = ((NetworkInfo)localObject).getType();
          localAPNInfo.subNetType = ((NetworkInfo)localObject).getSubtype();
          if (1 != ((NetworkInfo)localObject).getType())
          {
            if (((NetworkInfo)localObject).getExtraInfo() == null) {}
            for (localObject = "";; localObject = ((NetworkInfo)localObject).getExtraInfo())
            {
              localAPNInfo.extraInfo = ((String)localObject);
              return localAPNInfo;
            }
          }
          localAPNInfo.extraInfo = getCurWifiInfo().ssid;
          return localAPNInfo;
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
      }
      return null;
    }
    
    public static int getCurRadioAccessNetworkInfo()
    {
      if (PlatformComm.context == null)
      {
        PlatformComm.Assert.assertTrue(false);
        return 0;
      }
      try
      {
        int i = ((TelephonyManager)PlatformComm.context.getSystemService("phone")).getNetworkType();
        return i;
      }
      catch (Exception localException)
      {
        w.e("PlatformComm", exception2String(localException));
        w.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
        PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
      }
      return 0;
    }
    
    public static PlatformComm.SIMInfo getCurSIMInfo()
    {
      try
      {
        if (PlatformComm.context == null) {
          return null;
        }
        int i = am.getISPCode(PlatformComm.context);
        if (i != 0)
        {
          PlatformComm.SIMInfo localSIMInfo = new PlatformComm.SIMInfo();
          localSIMInfo.ispCode = String.valueOf(i);
          w.d("PlatformComm", "getISPCode MCC_MNC=%s", new Object[] { localSIMInfo.ispCode });
          localSIMInfo.ispName = am.getISPName(PlatformComm.context);
          return localSIMInfo;
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
      }
      return null;
    }
    
    public static PlatformComm.WifiInfo getCurWifiInfo()
    {
      try
      {
        if (PlatformComm.context == null) {
          return null;
        }
        Object localObject1 = (ConnectivityManager)PlatformComm.context.getSystemService("connectivity");
        if (localObject1 == null) {
          return null;
        }
        try
        {
          localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
          if (localObject1 != null) {
            if (1 == ((NetworkInfo)localObject1).getType()) {}
          }
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            w.e("PlatformComm", "getActiveNetworkInfo failed.");
            localObject2 = null;
          }
          Object localObject2 = (WifiManager)PlatformComm.context.getSystemService("wifi");
          if (localObject2 == null) {
            return null;
          }
          localObject2 = ((WifiManager)localObject2).getConnectionInfo();
          if (localObject2 == null) {
            return null;
          }
          PlatformComm.WifiInfo localWifiInfo = new PlatformComm.WifiInfo();
          localWifiInfo.ssid = ((WifiInfo)localObject2).getSSID();
          localWifiInfo.bssid = ((WifiInfo)localObject2).getBSSID();
          return localWifiInfo;
        }
        return null;
      }
      catch (Exception localException2)
      {
        w.printErrStackTrace("PlatformComm", localException2, "", new Object[0]);
        return null;
      }
    }
    
    public static int getNetInfo()
    {
      try
      {
        localObject1 = (ConnectivityManager)PlatformComm.context.getSystemService("connectivity");
        if (localObject1 == null) {
          return -1;
        }
        localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
      }
      catch (Exception localException1)
      {
        Object localObject2;
        for (;;)
        {
          Object localObject1;
          localObject2 = null;
        }
        try
        {
          int i = ((NetworkInfo)localObject2).getType();
          switch (i)
          {
          default: 
            return 3;
          case 1: 
            return 1;
          }
          return 2;
        }
        catch (Exception localException2)
        {
          w.printErrStackTrace("PlatformComm", localException2, "", new Object[0]);
        }
      }
      if (localObject1 == null) {
        return -1;
      }
      return 3;
    }
    
    public static int getProxyInfo(StringBuffer paramStringBuffer)
    {
      return -1;
    }
    
    public static long getSignal(boolean paramBoolean)
    {
      try
      {
        if (PlatformComm.context == null)
        {
          PlatformComm.Assert.assertTrue(false);
          return 0L;
        }
        if (paramBoolean) {
          return NetworkSignalUtil.getWifiSignalStrength();
        }
        long l = NetworkSignalUtil.getGSMSignalStrength();
        return l;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
      }
      return 0L;
    }
    
    public static int getStatisticsNetType()
    {
      if (PlatformComm.context == null)
      {
        PlatformComm.Assert.assertTrue(false);
        return 0;
      }
      try
      {
        int i = am.getNetType(PlatformComm.context);
        if (i == -1) {
          return -1;
        }
        if (am.is2G(PlatformComm.context)) {
          return 3;
        }
        if (am.is3G(PlatformComm.context)) {
          return 4;
        }
        if (am.is4G(PlatformComm.context)) {
          return 5;
        }
        if (am.isWifi(i)) {
          return 1;
        }
        boolean bool = am.isWap(i);
        if (bool) {
          return 2;
        }
        return 6;
      }
      catch (Exception localException)
      {
        w.e("PlatformComm", exception2String(localException));
        w.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
        PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
      }
      return -1;
    }
    
    public static boolean isNetworkConnected()
    {
      if (PlatformComm.context == null)
      {
        PlatformComm.Assert.assertTrue(false);
        return false;
      }
      try
      {
        boolean bool = am.isNetworkConnected(PlatformComm.context);
        return bool;
      }
      catch (Exception localException)
      {
        w.e("PlatformComm", exception2String(localException));
        w.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
        PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
      }
      return false;
    }
    
    public static void restartProcess()
    {
      if (PlatformComm.resetprocessimp == null) {
        return;
      }
      try
      {
        PlatformComm.handler.post(new Runnable()
        {
          public final void run()
          {
            PlatformComm.resetprocessimp.restartProcess();
          }
        });
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
      }
    }
    
    public static boolean startAlarm(int paramInt1, int paramInt2)
    {
      if (PlatformComm.context == null)
      {
        PlatformComm.Assert.assertTrue(false);
        return false;
      }
      long l = paramInt1;
      try
      {
        boolean bool = Alarm.start(l, paramInt2, PlatformComm.context);
        return bool;
      }
      catch (Exception localException)
      {
        w.e("PlatformComm", exception2String(localException));
        w.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
        PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
      }
      return false;
    }
    
    public static boolean stopAlarm(int paramInt)
    {
      if (PlatformComm.context == null)
      {
        PlatformComm.Assert.assertTrue(false);
        return false;
      }
      long l = paramInt;
      try
      {
        boolean bool = Alarm.stop(l, PlatformComm.context);
        return bool;
      }
      catch (Exception localException)
      {
        w.e("PlatformComm", exception2String(localException));
        w.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
        PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
      }
      return false;
    }
    
    public static WakerLock wakeupLock_new()
    {
      if (PlatformComm.context == null)
      {
        PlatformComm.Assert.assertTrue(false);
        return null;
      }
      try
      {
        WakerLock localWakerLock = new WakerLock(PlatformComm.context);
        return localWakerLock;
      }
      catch (Exception localException)
      {
        w.e("PlatformComm", exception2String(localException));
        w.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
        PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
      }
      return null;
    }
  }
  
  public static abstract interface IResetProcess
  {
    public abstract void restartProcess();
  }
  
  static class SIMInfo
  {
    public String ispCode;
    public String ispName;
  }
  
  static class WifiInfo
  {
    public String bssid;
    public String ssid;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mars\comm\PlatformComm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
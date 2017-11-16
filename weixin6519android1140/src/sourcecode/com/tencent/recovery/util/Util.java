package com.tencent.recovery.util;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings.Secure;
import com.tencent.recovery.Recovery;
import com.tencent.recovery.log.RecoveryLog;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class Util
{
  private static String processName = "";
  
  public static final int fP(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("recovery-info", 0);
    int j = localSharedPreferences.getInt("KeySafeModeUUID", -1);
    int i = j;
    StringBuffer localStringBuffer;
    if (j == -1)
    {
      localStringBuffer = new StringBuffer();
      localStringBuffer.append(Settings.Secure.getString(paramContext.getContentResolver(), "android_id"));
      paramContext = (WifiManager)paramContext.getSystemService("wifi");
      if (paramContext != null) {
        break label202;
      }
      paramContext = null;
      if (paramContext == null) {
        break label215;
      }
    }
    label202:
    label210:
    label215:
    for (Object localObject = paramContext.getMacAddress();; localObject = null)
    {
      paramContext = (Context)localObject;
      if (localObject == null)
      {
        paramContext = BluetoothAdapter.getDefaultAdapter();
        if (paramContext == null) {
          break label210;
        }
      }
      for (paramContext = paramContext.getAddress();; paramContext = null)
      {
        localObject = paramContext;
        if (paramContext == null) {
          localObject = UUID.randomUUID().toString();
        }
        localStringBuffer.append((String)localObject);
        localStringBuffer.append(Build.MANUFACTURER + Build.MODEL);
        i = ("A" + n(localStringBuffer.toString().getBytes()).substring(0, 15)).hashCode();
        localSharedPreferences.edit().putInt("KeySafeModeUUID", i).commit();
        return i;
        paramContext = paramContext.getConnectionInfo();
        break;
      }
    }
  }
  
  public static String fQ(Context paramContext)
  {
    return r(paramContext, Process.myPid());
  }
  
  public static String fp(long paramLong)
  {
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(paramLong));
  }
  
  private static final String n(byte[] paramArrayOfByte)
  {
    int i = 0;
    char[] arrayOfChar = new char[16];
    char[] tmp10_8 = arrayOfChar;
    tmp10_8[0] = 48;
    char[] tmp15_10 = tmp10_8;
    tmp15_10[1] = 49;
    char[] tmp20_15 = tmp15_10;
    tmp20_15[2] = 50;
    char[] tmp25_20 = tmp20_15;
    tmp25_20[3] = 51;
    char[] tmp30_25 = tmp25_20;
    tmp30_25[4] = 52;
    char[] tmp35_30 = tmp30_25;
    tmp35_30[5] = 53;
    char[] tmp40_35 = tmp35_30;
    tmp40_35[6] = 54;
    char[] tmp46_40 = tmp40_35;
    tmp46_40[7] = 55;
    char[] tmp52_46 = tmp46_40;
    tmp52_46[8] = 56;
    char[] tmp58_52 = tmp52_46;
    tmp58_52[9] = 57;
    char[] tmp64_58 = tmp58_52;
    tmp64_58[10] = 97;
    char[] tmp70_64 = tmp64_58;
    tmp70_64[11] = 98;
    char[] tmp76_70 = tmp70_64;
    tmp76_70[12] = 99;
    char[] tmp82_76 = tmp76_70;
    tmp82_76[13] = 100;
    char[] tmp88_82 = tmp82_76;
    tmp88_82[14] = 101;
    char[] tmp94_88 = tmp88_82;
    tmp94_88[15] = 102;
    tmp94_88;
    for (;;)
    {
      Object localObject;
      int k;
      int j;
      try
      {
        localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramArrayOfByte);
        paramArrayOfByte = ((MessageDigest)localObject).digest();
        k = paramArrayOfByte.length;
        localObject = new char[k * 2];
        j = 0;
      }
      catch (Exception paramArrayOfByte)
      {
        return null;
      }
      paramArrayOfByte = new String((char[])localObject);
      return paramArrayOfByte;
      while (i < k)
      {
        int m = paramArrayOfByte[i];
        int n = j + 1;
        localObject[j] = arrayOfChar[(m >>> 4 & 0xF)];
        j = n + 1;
        localObject[n] = arrayOfChar[(m & 0xF)];
        i += 1;
      }
    }
  }
  
  public static final boolean nm(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }
  
  private static String r(Context paramContext, int paramInt)
  {
    if (!nm(processName)) {
      return processName;
    }
    Object localObject = paramContext;
    if (paramContext == null) {
      localObject = Recovery.getContext();
    }
    if ((localObject == null) || (paramInt <= 0)) {
      return processName;
    }
    try
    {
      paramContext = ((ActivityManager)((Context)localObject).getSystemService("activity")).getRunningAppProcesses().iterator();
      while (paramContext.hasNext())
      {
        localObject = (ActivityManager.RunningAppProcessInfo)paramContext.next();
        if ((((ActivityManager.RunningAppProcessInfo)localObject).pid == paramInt) && (((ActivityManager.RunningAppProcessInfo)localObject).processName != null) && (!((ActivityManager.RunningAppProcessInfo)localObject).processName.equals(""))) {
          processName = ((ActivityManager.RunningAppProcessInfo)localObject).processName;
        }
      }
      return processName;
    }
    catch (Exception paramContext)
    {
      RecoveryLog.printErrStackTrace("Recovery.Util", paramContext, "", new Object[0]);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\util\Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
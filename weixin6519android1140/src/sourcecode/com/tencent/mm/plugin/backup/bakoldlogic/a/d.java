package com.tencent.mm.plugin.backup.bakoldlogic.a;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.StatFs;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.s;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  private static List<String> iVA;
  
  static
  {
    GMTrace.i(14810255196160L, 110345);
    iVA = null;
    GMTrace.o(14810255196160L, 110345);
  }
  
  public static boolean a(long paramLong, PLong paramPLong1, PLong paramPLong2, String paramString)
  {
    GMTrace.i(14809718325248L, 110341);
    Object localObject = new StatFs(h.getExternalStorageDirectory().getPath());
    long l1 = ((StatFs)localObject).getBlockSize();
    paramPLong1.value = (((StatFs)localObject).getAvailableBlocks() * l1);
    localObject = h.getDataDirectory();
    StatFs localStatFs = new StatFs(((File)localObject).getPath());
    l1 = localStatFs.getBlockCount();
    long l2 = localStatFs.getAvailableBlocks();
    paramPLong2.value = (localStatFs.getBlockSize() * localStatFs.getAvailableBlocks());
    w.i("MicroMsg.BakUtil", "checkDataFull, SDAvailSize:%d, DataAvailSize%d, dbSize:%d", new Object[] { Long.valueOf(paramPLong1.value), Long.valueOf(paramPLong2.value), Long.valueOf(paramLong) });
    if (l1 <= 0L)
    {
      GMTrace.o(14809718325248L, 110341);
      return false;
    }
    if (l1 - l2 < 0L)
    {
      GMTrace.o(14809718325248L, 110341);
      return false;
    }
    if ((paramPLong1.value == paramPLong2.value) || (paramString.startsWith(((File)localObject).getPath()))) {
      paramPLong1.value = 0L;
    }
    if (paramLong > paramPLong2.value)
    {
      GMTrace.o(14809718325248L, 110341);
      return false;
    }
    GMTrace.o(14809718325248L, 110341);
    return true;
  }
  
  public static String aR(long paramLong)
  {
    GMTrace.i(14810120978432L, 110344);
    long l1 = paramLong / 1024L;
    paramLong = l1 / 1024L;
    long l2 = paramLong / 1024L;
    String str;
    if (l2 > 0L) {
      str = l2 + "." + (paramLong - l2 * 1024L) * 10L / 1024L + "G";
    }
    for (;;)
    {
      GMTrace.o(14810120978432L, 110344);
      return str;
      if (paramLong > 0L)
      {
        str = paramLong + "." + (l1 - paramLong * 1024L) * 10L / 1024L + "M";
      }
      else
      {
        paramLong = l1;
        if (l1 == 0L) {
          paramLong = 1L;
        }
        str = paramLong + "K";
      }
    }
  }
  
  public static List<String> aet()
  {
    GMTrace.i(14809449889792L, 110339);
    if (iVA != null)
    {
      localObject1 = iVA;
      GMTrace.o(14809449889792L, 110339);
      return (List<String>)localObject1;
    }
    iVA = new LinkedList();
    Object localObject1 = s.gmD;
    int j = localObject1.length;
    int i = 0;
    while (i < j)
    {
      Object localObject2 = localObject1[i];
      iVA.add(localObject2);
      i += 1;
    }
    iVA.add("weixin");
    iVA.add("weibo");
    iVA.add("qqmail");
    iVA.add("fmessage");
    iVA.add("tmessage");
    iVA.add("qmessage");
    iVA.add("qqsync");
    iVA.add("floatbottle");
    iVA.add("lbsapp");
    iVA.add("shakeapp");
    iVA.add("medianote");
    iVA.add("qqfriend");
    iVA.add("readerapp");
    iVA.add("newsapp");
    iVA.add("blogapp");
    iVA.add("facebookapp");
    iVA.add("masssendapp");
    iVA.add("meishiapp");
    iVA.add("feedsapp");
    iVA.add("voipapp");
    iVA.add("officialaccounts");
    iVA.add("helper_entry");
    iVA.add("pc_share");
    iVA.add("cardpackage");
    iVA.add("voicevoipapp");
    iVA.add("voiceinputapp");
    iVA.add("linkedinplugin");
    iVA.add("appbrandcustomerservicemsg");
    localObject1 = iVA;
    GMTrace.o(14809449889792L, 110339);
    return (List<String>)localObject1;
  }
  
  public static boolean afR()
  {
    GMTrace.i(14809986760704L, 110343);
    WifiManager localWifiManager = (WifiManager)ab.getContext().getSystemService("wifi");
    for (;;)
    {
      try
      {
        int i = ((Integer)localWifiManager.getClass().getField("WIFI_AP_STATE_ENABLED").get(localWifiManager)).intValue();
      }
      catch (Exception localException1)
      {
        try
        {
          j = ((Integer)localWifiManager.getClass().getMethod("getWifiApState", new Class[0]).invoke(localWifiManager, new Object[0])).intValue();
          if (j != i) {
            break;
          }
          GMTrace.o(14809986760704L, 110343);
          return true;
        }
        catch (Exception localException2)
        {
          int j;
          for (;;) {}
        }
        localException1 = localException1;
        i = 13;
      }
      tmp96_93[0] = localException1;
      w.e("MicroMsg.BakUtil", "getWifiApState %s", tmp96_93);
      w.printErrStackTrace("MicroMsg.BakUtil", localException1, "", new Object[0]);
      j = 0;
    }
    GMTrace.o(14809986760704L, 110343);
    return false;
  }
  
  public static String bY(Context paramContext)
  {
    GMTrace.i(14809852542976L, 110342);
    paramContext = (WifiManager)paramContext.getSystemService("wifi");
    if (paramContext.getWifiState() == 3)
    {
      paramContext = paramContext.getConnectionInfo();
      if (paramContext != null) {}
      for (;;)
      {
        try
        {
          paramContext = paramContext.getSSID();
          Object localObject = paramContext;
          if (paramContext.length() >= 2)
          {
            localObject = paramContext;
            if (paramContext.startsWith("\""))
            {
              localObject = paramContext;
              if (paramContext.endsWith("\""))
              {
                w.i("MicroMsg.BakUtil", "start and end with \", and trunk it");
                localObject = paramContext.substring(1, paramContext.length() - 1);
              }
            }
          }
          GMTrace.o(14809852542976L, 110342);
          return (String)localObject;
        }
        catch (Exception paramContext)
        {
          w.e("MicroMsg.BakUtil", "getConnectionInfo %s", new Object[] { paramContext });
          w.printErrStackTrace("MicroMsg.BakUtil", paramContext, "", new Object[0]);
          GMTrace.o(14809852542976L, 110342);
          return "";
        }
        paramContext = "wifi";
      }
    }
    int i = 13;
    try
    {
      j = ((Integer)paramContext.getClass().getField("WIFI_AP_STATE_ENABLED").get(paramContext)).intValue();
      i = j;
      k = ((Integer)paramContext.getClass().getMethod("getWifiApState", new Class[0]).invoke(paramContext, new Object[0])).intValue();
      i = k;
      k = j;
      j = i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          paramContext = ((WifiConfiguration)paramContext.getClass().getMethod("getWifiApConfiguration", new Class[0]).invoke(paramContext, new Object[0])).SSID;
          GMTrace.o(14809852542976L, 110342);
          return paramContext;
        }
        catch (Exception paramContext)
        {
          int j;
          int k;
          w.e("MicroMsg.BakUtil", "getWifiApConfiguration %s", new Object[] { paramContext });
          w.printErrStackTrace("MicroMsg.BakUtil", paramContext, "", new Object[0]);
        }
        localException = localException;
        w.e("MicroMsg.BakUtil", "getWifiApState %s", new Object[] { localException });
        w.printErrStackTrace("MicroMsg.BakUtil", localException, "", new Object[0]);
        j = 0;
        k = i;
      }
      GMTrace.o(14809852542976L, 110342);
    }
    if (j == k) {
      w.i("MicroMsg.BakUtil", "getWifiName apmode");
    }
    return "";
  }
  
  public static String ti(String paramString)
  {
    GMTrace.i(14809584107520L, 110340);
    if (paramString == null)
    {
      GMTrace.o(14809584107520L, 110340);
      return "";
    }
    String str2 = g.n(paramString.getBytes());
    paramString = "";
    String str1 = "";
    if (str2.length() > 0) {
      paramString = str2.charAt(0) + "/";
    }
    if (str2.length() >= 2) {
      str1 = str2.charAt(1) + "/";
    }
    paramString = paramString + str1;
    GMTrace.o(14809584107520L, 110340);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.freewifi.model;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.freewifi.g.c;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d
{
  private static Map<Integer, String> lqc;
  
  static
  {
    GMTrace.i(7134477549568L, 53156);
    lqc = new HashMap() {};
    GMTrace.o(7134477549568L, 53156);
  }
  
  public d()
  {
    GMTrace.i(7131793195008L, 53136);
    GMTrace.o(7131793195008L, 53136);
  }
  
  public static void a(String paramString, int paramInt, Intent paramIntent)
  {
    GMTrace.i(7133403807744L, 53148);
    w.i("MicroMsg.FreeWifi.FreeWifiManager", "sessionKey=%s, step=%d, method=FreeWifiManager.updateConnectState, desc=it changes the connect state of the model to %s. state=%d", new Object[] { m.C(paramIntent), Integer.valueOf(m.D(paramIntent)), nS(paramInt), Integer.valueOf(paramInt) });
    paramIntent = j.aBe().yH(paramString);
    if (paramIntent != null)
    {
      paramIntent.field_connectState = paramInt;
      w.i("MicroMsg.FreeWifi.FreeWifiManager", "update %s, connect state : %d, return : %b", new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(j.aBe().c(paramIntent, new String[0])) });
    }
    GMTrace.o(7133403807744L, 53148);
  }
  
  public static boolean aAS()
  {
    GMTrace.i(7132866936832L, 53144);
    WifiManager localWifiManager = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localWifiManager == null)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "get wifi manager failed");
      GMTrace.o(7132866936832L, 53144);
      return false;
    }
    boolean bool = localWifiManager.setWifiEnabled(true);
    GMTrace.o(7132866936832L, 53144);
    return bool;
  }
  
  public static String aAT()
  {
    GMTrace.i(7133538025472L, 53149);
    if (am.getNetType(ab.getContext()) == 0)
    {
      Object localObject = aAW();
      if ((localObject != null) && (((WifiInfo)localObject).getBSSID() != null))
      {
        localObject = ((WifiInfo)localObject).getBSSID();
        w.i("MicroMsg.FreeWifi.FreeWifiManager", "getConnectWifiMacAddress, get bssid now : %s", new Object[] { localObject });
        GMTrace.o(7133538025472L, 53149);
        return (String)localObject;
      }
    }
    GMTrace.o(7133538025472L, 53149);
    return null;
  }
  
  public static int aAU()
  {
    GMTrace.i(7133672243200L, 53150);
    if (am.getNetType(ab.getContext()) == 0)
    {
      WifiInfo localWifiInfo = aAW();
      if (localWifiInfo != null)
      {
        int i = localWifiInfo.getRssi();
        w.i("MicroMsg.FreeWifi.FreeWifiManager", "getConnectWifiSignal, get rssi now : %d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(7133672243200L, 53150);
        return i;
      }
    }
    GMTrace.o(7133672243200L, 53150);
    return 0;
  }
  
  public static String aAV()
  {
    GMTrace.i(7133806460928L, 53151);
    int i = am.getNetType(ab.getContext());
    w.i("MicroMsg.FreeWifi.FreeWifiManager", "networkType = %d", new Object[] { Integer.valueOf(i) });
    if (i == 0)
    {
      Object localObject = aAW();
      if ((localObject != null) && (((WifiInfo)localObject).getSSID() != null))
      {
        localObject = ((WifiInfo)localObject).getSSID().replace("\"", "");
        w.i("MicroMsg.FreeWifi.FreeWifiManager", "get ssid now : %s", new Object[] { localObject });
        GMTrace.o(7133806460928L, 53151);
        return (String)localObject;
      }
    }
    GMTrace.o(7133806460928L, 53151);
    return null;
  }
  
  public static WifiInfo aAW()
  {
    GMTrace.i(7133940678656L, 53152);
    Object localObject = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localObject == null)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "get wifi manager failed");
      GMTrace.o(7133940678656L, 53152);
      return null;
    }
    try
    {
      localObject = ((WifiManager)localObject).getConnectionInfo();
      GMTrace.o(7133940678656L, 53152);
      return (WifiInfo)localObject;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "getConnectionInfo failed : %s", new Object[] { localException.getMessage() });
      GMTrace.o(7133940678656L, 53152);
    }
    return null;
  }
  
  public static String aAX()
  {
    GMTrace.i(7134074896384L, 53153);
    Object localObject = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localObject == null)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "get wifi manager failed");
      GMTrace.o(7134074896384L, 53153);
      return "";
    }
    try
    {
      localObject = ((WifiManager)localObject).getConnectionInfo();
      if (localObject == null)
      {
        GMTrace.o(7134074896384L, 53153);
        return "";
      }
      localObject = ((WifiInfo)localObject).getBSSID();
      if (localObject == null)
      {
        GMTrace.o(7134074896384L, 53153);
        return "";
      }
      GMTrace.o(7134074896384L, 53153);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "getConnectWifiBssid failed : %s", new Object[] { localException.getMessage() });
      GMTrace.o(7134074896384L, 53153);
    }
    return "";
  }
  
  public static String aAY()
  {
    GMTrace.i(7134209114112L, 53154);
    Object localObject = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localObject == null)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "get wifi manager failed");
      GMTrace.o(7134209114112L, 53154);
      return "";
    }
    try
    {
      localObject = ((WifiManager)localObject).getConnectionInfo();
      if (localObject == null)
      {
        GMTrace.o(7134209114112L, 53154);
        return "";
      }
      localObject = ((WifiInfo)localObject).getSSID();
      if (localObject == null)
      {
        GMTrace.o(7134209114112L, 53154);
        return "";
      }
      localObject = m.yq((String)localObject);
      GMTrace.o(7134209114112L, 53154);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "getConnectWifiBssid failed : %s", new Object[] { localException.getMessage() });
      GMTrace.o(7134209114112L, 53154);
    }
    return "";
  }
  
  public static int d(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(7132464283648L, 53141);
    w.i("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork by encrypt, ssid is : %s, password : %s, cryptType :%d, hideSSID = %b", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork by encrypt alg failed, ssid is null");
      GMTrace.o(7132464283648L, 53141);
      return -12;
    }
    if (paramInt == 0)
    {
      paramInt = yz(paramString1);
      GMTrace.o(7132464283648L, 53141);
      return paramInt;
    }
    if (bg.nm(paramString2))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "encrypt type is not none, while password is null");
      GMTrace.o(7132464283648L, 53141);
      return -15;
    }
    WifiManager localWifiManager = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localWifiManager == null)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork by encrypt alg, get wifi manager failed");
      GMTrace.o(7132464283648L, 53141);
      return -11;
    }
    label168:
    Object localObject;
    if (f.et(21)) {
      if (bg.nm(paramString1))
      {
        w.e("MicroMsg.FreeWifi.FreeWifiManager", "null or nill ssid");
        break label315;
        localObject = null;
        label171:
        if (localObject != null) {
          break label372;
        }
        paramString1 = s(paramString1, paramString2, paramInt);
        paramString1.hiddenSSID = paramBoolean;
        paramInt = localWifiManager.addNetwork(paramString1);
        localWifiManager.saveConfiguration();
      }
    }
    for (;;)
    {
      paramBoolean = localWifiManager.enableNetwork(paramInt, true);
      w.i("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork by encrypt alg, netid : %d, result : %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
      if (!paramBoolean) {
        break label621;
      }
      GMTrace.o(7132464283648L, 53141);
      return 0;
      localObject = ((WifiManager)ab.getContext().getSystemService("wifi")).getConfiguredNetworks();
      if (localObject == null)
      {
        w.e("MicroMsg.FreeWifi.FreeWifiManager", "get wifi list is null");
        break label168;
      }
      w.i("MicroMsg.FreeWifi.FreeWifiManager", "get wificonfiguration list size : %d", new Object[] { Integer.valueOf(((List)localObject).size()) });
      Iterator localIterator = ((List)localObject).iterator();
      label315:
      if (!localIterator.hasNext()) {
        break label168;
      }
      localObject = (WifiConfiguration)localIterator.next();
      if (!((WifiConfiguration)localObject).SSID.equals("\"" + paramString1 + "\"")) {
        break;
      }
      break label171;
      label372:
      if (localObject != null)
      {
        ((WifiConfiguration)localObject).SSID = ("\"" + paramString1 + "\"");
        ((WifiConfiguration)localObject).status = 2;
        switch (paramInt)
        {
        default: 
          w.e("MicroMsg.FreeWifi.FreeWifiManager", "unsupport encrypt type : %d", new Object[] { Integer.valueOf(paramInt) });
        }
      }
      for (;;)
      {
        ((WifiConfiguration)localObject).hiddenSSID = paramBoolean;
        paramInt = ((WifiConfiguration)localObject).networkId;
        break;
        ((WifiConfiguration)localObject).wepKeys = new String[] { "\"" + paramString2 + "\"" };
        ((WifiConfiguration)localObject).allowedKeyManagement.set(0);
        continue;
        ((WifiConfiguration)localObject).preSharedKey = ("\"" + paramString2 + "\"");
        ((WifiConfiguration)localObject).allowedKeyManagement.set(1);
      }
      int i = yB(paramString1);
      if (i > 0) {
        w.i("MicroMsg.FreeWifi.FreeWifiManager", "this network has exist : %s, try to remove it : %b", new Object[] { paramString1, Boolean.valueOf(localWifiManager.removeNetwork(i)) });
      }
      paramString1 = s(paramString1, paramString2, paramInt);
      paramString1.hiddenSSID = paramBoolean;
      paramInt = localWifiManager.addNetwork(paramString1);
      localWifiManager.saveConfiguration();
    }
    label621:
    GMTrace.o(7132464283648L, 53141);
    return -14;
  }
  
  public static int getNetworkType()
  {
    GMTrace.i(15395310272512L, 114704);
    int i = am.getNetType(ab.getContext());
    GMTrace.o(15395310272512L, 114704);
    return i;
  }
  
  public static boolean isWifiEnabled()
  {
    GMTrace.i(7132732719104L, 53143);
    WifiManager localWifiManager = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localWifiManager == null)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "get wifi manager failed");
      GMTrace.o(7132732719104L, 53143);
      return false;
    }
    boolean bool = localWifiManager.isWifiEnabled();
    w.i("MicroMsg.FreeWifi.FreeWifiManager", "is wifi enalbe now : %b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(7132732719104L, 53143);
    return bool;
  }
  
  public static String nS(int paramInt)
  {
    GMTrace.i(7133269590016L, 53147);
    String str = (String)lqc.get(Integer.valueOf(paramInt));
    if (str == null)
    {
      GMTrace.o(7133269590016L, 53147);
      return "";
    }
    GMTrace.o(7133269590016L, 53147);
    return str;
  }
  
  public static void release()
  {
    GMTrace.i(7132061630464L, 53138);
    GMTrace.o(7132061630464L, 53138);
  }
  
  private static WifiConfiguration s(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(7132598501376L, 53142);
    WifiConfiguration localWifiConfiguration = new WifiConfiguration();
    localWifiConfiguration.SSID = ("\"" + paramString1 + "\"");
    localWifiConfiguration.status = 2;
    switch (paramInt)
    {
    default: 
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "unsupport encrypt type : %d", new Object[] { Integer.valueOf(paramInt) });
    }
    for (;;)
    {
      GMTrace.o(7132598501376L, 53142);
      return localWifiConfiguration;
      localWifiConfiguration.wepKeys = new String[] { "\"" + paramString2 + "\"" };
      localWifiConfiguration.allowedKeyManagement.set(0);
      continue;
      localWifiConfiguration.preSharedKey = ("\"" + paramString2 + "\"");
      localWifiConfiguration.allowedKeyManagement.set(1);
    }
  }
  
  public static boolean yA(String paramString)
  {
    GMTrace.i(7133001154560L, 53145);
    int i = yB(paramString);
    w.i("MicroMsg.FreeWifi.FreeWifiManager", "get network id by ssid :%s, netid is %d", new Object[] { paramString, Integer.valueOf(i) });
    if (i == -1)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiManager", "ssid is not exist : %s", new Object[] { paramString });
      GMTrace.o(7133001154560L, 53145);
      return false;
    }
    WifiManager localWifiManager = (WifiManager)ab.getContext().getSystemService("wifi");
    boolean bool = localWifiManager.removeNetwork(i);
    localWifiManager.saveConfiguration();
    w.i("MicroMsg.FreeWifi.FreeWifiManager", "remove ssid : %s, ret = %b", new Object[] { paramString, Boolean.valueOf(bool) });
    GMTrace.o(7133001154560L, 53145);
    return bool;
  }
  
  private static int yB(String paramString)
  {
    GMTrace.i(7133135372288L, 53146);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "null or nill ssid");
      GMTrace.o(7133135372288L, 53146);
      return -1;
    }
    Object localObject = ((WifiManager)ab.getContext().getSystemService("wifi")).getConfiguredNetworks();
    if (localObject == null)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "get wifi list is null");
      GMTrace.o(7133135372288L, 53146);
      return -1;
    }
    w.i("MicroMsg.FreeWifi.FreeWifiManager", "get wificonfiguration list size : %d", new Object[] { Integer.valueOf(((List)localObject).size()) });
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      WifiConfiguration localWifiConfiguration = (WifiConfiguration)((Iterator)localObject).next();
      if (localWifiConfiguration.SSID.equals("\"" + paramString + "\""))
      {
        int i = localWifiConfiguration.networkId;
        GMTrace.o(7133135372288L, 53146);
        return i;
      }
    }
    GMTrace.o(7133135372288L, 53146);
    return -1;
  }
  
  public static int yx(String paramString)
  {
    GMTrace.i(7131927412736L, 53137);
    if (bg.nm(paramString))
    {
      w.d("MicroMsg.FreeWifi.FreeWifiManager", "Illegal SSID");
      GMTrace.o(7131927412736L, 53137);
      return 0;
    }
    c localc = j.aBe().yH(paramString);
    if ((localc != null) && (paramString.equalsIgnoreCase(localc.field_ssid)))
    {
      if ((localc.field_connectState == 2) && (localc.field_expiredTime > 0L) && (localc.field_expiredTime - bg.Pu() <= 0L))
      {
        localc.field_connectState = 1;
        boolean bool = j.aBe().c(localc, new String[0]);
        w.i("MicroMsg.FreeWifi.FreeWifiManager", "Expired, re-auth, expired time : %d, current time : %d, ret : %b", new Object[] { Long.valueOf(localc.field_expiredTime), Long.valueOf(bg.Pu()), Boolean.valueOf(bool) });
      }
      int i = localc.field_connectState;
      GMTrace.o(7131927412736L, 53137);
      return i;
    }
    GMTrace.o(7131927412736L, 53137);
    return 0;
  }
  
  public static boolean yy(String paramString)
  {
    GMTrace.i(7132195848192L, 53139);
    w.i("MicroMsg.FreeWifi.FreeWifiManager", "check is wechat free wifi, ssid : %s", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "ssid is null or nil");
      GMTrace.o(7132195848192L, 53139);
      return false;
    }
    String str = aAV();
    if ((!bg.nm(str)) && (str.equals(paramString)))
    {
      GMTrace.o(7132195848192L, 53139);
      return true;
    }
    GMTrace.o(7132195848192L, 53139);
    return false;
  }
  
  public static int yz(String paramString)
  {
    GMTrace.i(7132330065920L, 53140);
    WifiManager localWifiManager = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localWifiManager == null)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork, get wifi manager failed");
      GMTrace.o(7132330065920L, 53140);
      return -11;
    }
    int i = yB(paramString);
    if (i > 0) {
      w.i("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork, the network has exsited, just enable it");
    }
    for (;;)
    {
      boolean bool = localWifiManager.enableNetwork(i, true);
      w.i("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork netid : %d, result : %b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
      if (!bool) {
        break;
      }
      GMTrace.o(7132330065920L, 53140);
      return 0;
      WifiConfiguration localWifiConfiguration = new WifiConfiguration();
      localWifiConfiguration.allowedAuthAlgorithms.clear();
      localWifiConfiguration.allowedGroupCiphers.clear();
      localWifiConfiguration.allowedKeyManagement.clear();
      localWifiConfiguration.allowedPairwiseCiphers.clear();
      localWifiConfiguration.allowedProtocols.clear();
      localWifiConfiguration.SSID = ("\"" + paramString + "\"");
      w.i("MicroMsg.FreeWifi.FreeWifiManager", "check is the same ssid is exist, %b", new Object[] { Boolean.valueOf(yA(paramString)) });
      localWifiConfiguration.allowedKeyManagement.set(0);
      localWifiConfiguration.wepTxKeyIndex = 0;
      i = localWifiManager.addNetwork(localWifiConfiguration);
    }
    GMTrace.o(7132330065920L, 53140);
    return -14;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.WiFiConnector.2;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private static boolean ioS;
  private static WeakReference<com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a> ioT;
  private static b ioU;
  private static a ioV;
  private static Context mContext;
  
  static
  {
    GMTrace.i(19818455498752L, 147659);
    ioS = false;
    ioT = null;
    ioU = null;
    GMTrace.o(19818455498752L, 147659);
  }
  
  public static void A(String paramString1, String paramString2, String paramString3)
  {
    String str = null;
    GMTrace.i(19818187063296L, 147657);
    if (ioT != null)
    {
      locala = (com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a)ioT.get();
      if ((locala != null) && (!locala.Yf())) {
        locala.qX("duplicated request");
      }
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a locala = new com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a(ioV, mContext);
    new StringBuilder("ssid:").append(paramString1).append(" bssid:").append(paramString2).append(" psw:").append(paramString3);
    locala.ioL = paramString1;
    locala.ioM = paramString2;
    if (TextUtils.isEmpty(paramString3))
    {
      i = 0;
      if ((paramString1 != null) && (paramString1.length() > 0)) {
        break label375;
      }
      paramString2 = null;
      List localList = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getConfiguredNetworks();
      paramString3 = str;
      if (localList != null) {
        paramString3 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.a(paramString1, i, localList);
      }
      if (paramString2 == null) {
        break label536;
      }
      str = paramString2;
      if (paramString3 != null)
      {
        if (!com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.am(paramString1, i)) {
          break label547;
        }
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.saveConfiguration();
      }
    }
    label375:
    label536:
    label547:
    for (int i = 1;; i = 0)
    {
      str = paramString2;
      if (i == 0)
      {
        paramString2.networkId = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.b(paramString2);
        str = paramString2;
        if (paramString2.networkId == com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.ipg) {
          str = paramString3;
        }
      }
      if (str.networkId == com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.ipg) {
        str.networkId = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.b(str);
      }
      if ((str.networkId != com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.ipg) && (locala.a(str)))
      {
        locala.iQ(1);
        locala.ioZ = str;
        if (!locala.ioH)
        {
          paramString1 = new IntentFilter();
          paramString1.addAction("android.net.wifi.supplicant.STATE_CHANGE");
          paramString1.addAction("android.net.wifi.STATE_CHANGE");
          paramString1.addAction("android.net.conn.CONNECTIVITY_CHANGE");
          paramString1.setPriority(Integer.MAX_VALUE);
          locala.ioI = new WiFiConnector.2(locala);
          locala.ioW.registerReceiver(locala.ioI, paramString1);
          locala.ioH = true;
        }
        locala.mHandler.sendEmptyMessageDelayed(1, 13000L);
      }
      for (;;)
      {
        ioT = new WeakReference(locala);
        GMTrace.o(19818187063296L, 147657);
        return;
        i = 2;
        break;
        paramString2 = new WifiConfiguration();
        paramString2.allowedAuthAlgorithms.clear();
        paramString2.allowedGroupCiphers.clear();
        paramString2.allowedKeyManagement.clear();
        paramString2.allowedPairwiseCiphers.clear();
        paramString2.allowedProtocols.clear();
        paramString2.SSID = ("\"" + paramString1 + "\"");
        paramString2.hiddenSSID = true;
        switch (i)
        {
        default: 
          paramString2.allowedKeyManagement.set(0);
        }
        for (;;)
        {
          paramString2.status = 2;
          break;
          if (paramString3.length() != 0) {
            if (paramString3.matches("[0-9A-Fa-f]{64}")) {
              paramString2.preSharedKey = paramString3;
            } else {
              paramString2.preSharedKey = ("\"" + paramString3 + '"');
            }
          }
        }
        locala.e(false, "fail to connect wifi:invalid network id");
      }
    }
  }
  
  public static b Yd()
  {
    GMTrace.i(19817918627840L, 147655);
    WifiInfo localWifiInfo = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getConnectionInfo();
    String str = "";
    Object localObject = str;
    if (localWifiInfo != null)
    {
      localObject = str;
      if (!TextUtils.isEmpty(localWifiInfo.getSSID())) {
        localObject = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.qY(localWifiInfo.getSSID());
      }
    }
    if ((ioU != null) && (ioU.ioL.compareTo((String)localObject) == 0))
    {
      localObject = ioU;
      GMTrace.o(19817918627840L, 147655);
      return (b)localObject;
    }
    if (localWifiInfo != null)
    {
      Ye();
      localObject = ioU;
      GMTrace.o(19817918627840L, 147655);
      return (b)localObject;
    }
    GMTrace.o(19817918627840L, 147655);
    return null;
  }
  
  public static c Ye()
  {
    GMTrace.i(19818052845568L, 147656);
    c localc = new c();
    ioU = null;
    Object localObject2;
    if ((ioS) && (com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.isWifiEnabled()))
    {
      com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.startScan();
      localObject2 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getScanResults();
      localc.ioR = new ArrayList();
      localc.hZP = "ok";
      if (localObject2 != null)
      {
        w.d("MicroMsg.WiFiManagerWrapper", "[getWifiList] ScanResult:%s, size:%d", new Object[] { localObject2, Integer.valueOf(((List)localObject2).size()) });
        localObject1 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getConnectionInfo();
        w.d("MicroMsg.WiFiManagerWrapper", "[getWifiList] currentWiFiInfo:%s", new Object[] { localObject1 });
        if ((localObject1 == null) || (TextUtils.isEmpty(((WifiInfo)localObject1).getSSID()))) {
          break label390;
        }
      }
    }
    label239:
    label252:
    label331:
    label336:
    label390:
    for (Object localObject1 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.qY(((WifiInfo)localObject1).getSSID());; localObject1 = null)
    {
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        ScanResult localScanResult = (ScanResult)((Iterator)localObject2).next();
        if (localScanResult != null)
        {
          int j = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.a(localScanResult);
          if ((j == 0) || (j == 2))
          {
            b localb = new b();
            localb.ioL = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.qY(localScanResult.SSID);
            localb.ioM = localScanResult.BSSID;
            int i = localScanResult.level;
            boolean bool;
            if (i <= -100)
            {
              i = 0;
              localb.ioN = i;
              if (j != 2) {
                break label331;
              }
              bool = true;
              localb.ioO = bool;
              if ((localObject1 == null) || (localb.ioL.compareTo((String)localObject1) != 0)) {
                break label336;
              }
            }
            for (i = 1;; i = 0)
            {
              if (i != 0) {
                ioU = localb;
              }
              localc.ioR.add(localb);
              break;
              if (i >= -55)
              {
                i = 99;
                break label239;
              }
              i = (int)((i + 100) * 99.0F / 45.0F);
              break label239;
              bool = false;
              break label252;
            }
            w.e("MicroMsg.WiFiManagerWrapper", "wifiList is null");
          }
        }
      }
      for (;;)
      {
        GMTrace.o(19818052845568L, 147656);
        return localc;
        if (ioS) {
          localc.hZP = "wifi is disable";
        } else {
          localc.hZP = "sdk not init";
        }
      }
    }
  }
  
  public static void a(a parama)
  {
    GMTrace.i(19818321281024L, 147658);
    ioV = parama;
    GMTrace.o(19818321281024L, 147658);
  }
  
  public static void bN(Context paramContext)
  {
    GMTrace.i(19817784410112L, 147654);
    if ((!ioS) && (paramContext != null))
    {
      mContext = paramContext;
      paramContext = (WifiManager)paramContext.getSystemService("wifi");
      if (paramContext != null)
      {
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.aDQ = paramContext;
        ioS = true;
      }
    }
    GMTrace.o(19817784410112L, 147654);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\wifi\wifisdk\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.freewifi.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public a lpU;
  BroadcastReceiver lpV;
  
  public b()
  {
    GMTrace.i(7136625033216L, 53172);
    this.lpU = new a();
    this.lpV = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(7129377275904L, 53118);
        if (paramAnonymousIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
          try
          {
            w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "connChangedBroadcastReceiver");
            paramAnonymousIntent = (NetworkInfo)paramAnonymousIntent.getParcelableExtra("networkInfo");
            if (paramAnonymousIntent == null)
            {
              w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfo is null");
              GMTrace.o(7129377275904L, 53118);
              return;
            }
            w.v("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfo=" + paramAnonymousIntent.toString() + "; networkInfo.isConnected()=%b, networkInfo.getState()=%s, networkInfo.getDetailedState()=%s, networkInfo.getExtraInfo()=%s, networkInfo.isConnectedOrConnecting()=%b, networkInfo.isAvailable()=%b, ", new Object[] { Boolean.valueOf(paramAnonymousIntent.isConnected()), paramAnonymousIntent.getState(), paramAnonymousIntent.getDetailedState(), paramAnonymousIntent.getExtraInfo(), Boolean.valueOf(paramAnonymousIntent.isConnectedOrConnecting()), Boolean.valueOf(paramAnonymousIntent.isAvailable()) });
            if (!paramAnonymousIntent.isConnected())
            {
              w.v("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "network is not connected.");
              GMTrace.o(7129377275904L, 53118);
              return;
            }
            if ((paramAnonymousIntent.getType() != 0) && (paramAnonymousIntent.getType() != 1))
            {
              w.v("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "network type is not wifi or mobile.");
              GMTrace.o(7129377275904L, 53118);
              return;
            }
            if (paramAnonymousContext == null)
            {
              w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "context is null.");
              GMTrace.o(7129377275904L, 53118);
              return;
            }
            if (paramAnonymousIntent.getType() == 1)
            {
              paramAnonymousContext = (WifiManager)paramAnonymousContext.getSystemService("wifi");
              if (paramAnonymousContext == null)
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "wifiManager is null.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              Object localObject = paramAnonymousContext.getConnectionInfo();
              if (localObject == null)
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "wifiInfo is null.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              paramAnonymousContext = m.yq(((WifiInfo)localObject).getSSID());
              localObject = m.yr(((WifiInfo)localObject).getBSSID()).toLowerCase();
              paramAnonymousIntent = m.yq(m.yr(paramAnonymousIntent.getExtraInfo()));
              w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfo.getExtraInfo()=%s, wifiInfo.getSsid()=%s, wifiInfo.getBssid=%s", new Object[] { paramAnonymousIntent, paramAnonymousContext, localObject });
              if (!m.yr(paramAnonymousIntent).equals(paramAnonymousContext))
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "wifiManage ssid is not equal to networkInfo.getExtraInfo(). networkwork might changed. return.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              if ((b.this.lpU.type == 1) && (m.yr(b.this.lpU.ssid).equals(paramAnonymousContext)) && (m.yr(b.this.lpU.bssid).equals(localObject)))
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "Dulplicated intent.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              paramAnonymousIntent = new b.a();
              paramAnonymousIntent.lpX = System.currentTimeMillis();
              paramAnonymousIntent.type = 1;
              paramAnonymousIntent.ssid = paramAnonymousContext;
              paramAnonymousIntent.bssid = ((String)localObject);
              paramAnonymousIntent.lpY = "";
              b.b(b.this.lpU.aAQ(), paramAnonymousIntent);
              b.this.lpU = paramAnonymousIntent;
              GMTrace.o(7129377275904L, 53118);
              return;
            }
            if (paramAnonymousIntent.getType() == 0)
            {
              if ((b.this.lpU.type == 0) && (m.yr(b.this.lpU.lpY).equals(m.yr(paramAnonymousIntent.getExtraInfo()))))
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "Dulplicated intent.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              paramAnonymousContext = (ConnectivityManager)paramAnonymousContext.getSystemService("connectivity");
              if (paramAnonymousContext == null)
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "connManager is null.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              paramAnonymousContext = paramAnonymousContext.getNetworkInfo(1);
              if (paramAnonymousContext == null)
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoWifi is null.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoWifi.getState()=%s, networkInfoWifi.getDetailedState()=%s", new Object[] { paramAnonymousContext.getState(), paramAnonymousContext.getDetailedState() });
              if (paramAnonymousContext.getDetailedState() != NetworkInfo.DetailedState.DISCONNECTED)
              {
                w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "It receives a type mobile connected event, but wifi network is not disconnected, so in fact user is probably switching wifi among ssids, not trying to connect to mobile network. ");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              paramAnonymousContext = new b.a();
              paramAnonymousContext.lpX = System.currentTimeMillis();
              paramAnonymousContext.type = 0;
              paramAnonymousContext.ssid = "";
              paramAnonymousContext.bssid = "";
              paramAnonymousContext.lpY = m.yr(paramAnonymousIntent.getExtraInfo());
              b.a(b.this.lpU.aAQ(), paramAnonymousContext);
              b.this.lpU = paramAnonymousContext;
              GMTrace.o(7129377275904L, 53118);
              return;
            }
            GMTrace.o(7129377275904L, 53118);
            return;
          }
          catch (Exception paramAnonymousContext)
          {
            paramAnonymousIntent = k.aAB();
            paramAnonymousIntent.eCE = "UnExpectedException";
            paramAnonymousIntent.result = -1;
            paramAnonymousIntent.jNb = m.d(paramAnonymousContext);
            paramAnonymousIntent.aAD().aAC();
            w.e("MicroMsg.FreeWifi.UnExcepctedException", m.e(paramAnonymousContext));
          }
        }
        GMTrace.o(7129377275904L, 53118);
      }
    };
    GMTrace.o(7136625033216L, 53172);
  }
  
  public static void a(a parama1, a parama2)
  {
    GMTrace.i(7136893468672L, 53174);
    m.yv("on mobile connected.");
    w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "onMobileConnected. lastRecord=%s, newRecord=%s", new Object[] { parama1.toString(), parama2.toString() });
    com.tencent.mm.plugin.freewifi.f.b.nU(0);
    GMTrace.o(7136893468672L, 53174);
  }
  
  public static void b(a parama1, a parama2)
  {
    GMTrace.i(7137027686400L, 53175);
    m.yv("on wifi connected.");
    w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "onWifiConnected. lastRecord=%s, newRecord=%s", new Object[] { parama1.toString(), parama2.toString() });
    if ((parama1.type == 1) && (parama1.ssid.equals(parama2.ssid)) && (!parama1.bssid.equals(parama2.bssid)))
    {
      String str = parama1.ssid;
      parama1 = parama1.bssid;
      parama2 = parama2.bssid;
      m.yv("on wifi roaming.");
      w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "WifiRoaming. ssid=%s, fromBssid=%s, toBssid=%s", new Object[] { str, parama1, parama2 });
    }
    com.tencent.mm.plugin.freewifi.f.b.nU(1);
    GMTrace.o(7137027686400L, 53175);
  }
  
  public final void aAr()
  {
    GMTrace.i(7136759250944L, 53173);
    try
    {
      ab.getContext().unregisterReceiver(this.lpV);
      GMTrace.o(7136759250944L, 53173);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      GMTrace.o(7136759250944L, 53173);
    }
  }
  
  private static final class a
  {
    String bssid;
    long lpX;
    String lpY;
    String ssid;
    int type;
    
    public a()
    {
      GMTrace.i(7143335919616L, 53222);
      this.ssid = "";
      this.bssid = "";
      this.lpY = "";
      GMTrace.o(7143335919616L, 53222);
    }
    
    public final a aAQ()
    {
      GMTrace.i(7143470137344L, 53223);
      a locala = new a();
      locala.lpX = this.lpX;
      locala.type = this.type;
      locala.ssid = this.ssid;
      locala.bssid = this.bssid;
      locala.lpY = this.lpY;
      GMTrace.o(7143470137344L, 53223);
      return locala;
    }
    
    public final String toString()
    {
      GMTrace.i(7143604355072L, 53224);
      String str = String.format("NetworkInfoConnectedRecord(timeMillis=%d, type=%d, ssid=%s, bssid=%s, mobileNetworkType=%s)", new Object[] { Long.valueOf(this.lpX), Integer.valueOf(this.type), this.ssid, this.bssid, this.lpY });
      GMTrace.o(7143604355072L, 53224);
      return str;
    }
  }
  
  private static final class b
  {
    public static b lpZ;
    
    static
    {
      GMTrace.i(7129645711360L, 53120);
      lpZ = new b();
      GMTrace.o(7129645711360L, 53120);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
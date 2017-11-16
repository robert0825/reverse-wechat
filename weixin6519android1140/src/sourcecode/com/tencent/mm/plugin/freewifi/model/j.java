package com.tencent.mm.plugin.freewifi.model;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.g.a.bh;
import com.tencent.mm.g.a.et;
import com.tencent.mm.g.a.ew;
import com.tencent.mm.g.a.gf;
import com.tencent.mm.g.a.gf.a;
import com.tencent.mm.g.a.gg;
import com.tencent.mm.g.a.oa;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.freewifi.d.g;
import com.tencent.mm.plugin.freewifi.e.c.1;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.c.azx;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.ck;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class j
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private com.tencent.mm.sdk.b.c hPq;
  private bt.a kAP;
  private c lqA;
  private c lqB;
  private a lqC;
  private e lqD;
  private com.tencent.mm.network.n lqE;
  private com.tencent.mm.sdk.b.c lqF;
  private com.tencent.mm.sdk.b.c lqG;
  private com.tencent.mm.sdk.b.c lqH;
  private com.tencent.mm.sdk.b.c lqI;
  private com.tencent.mm.sdk.b.c lqJ;
  private com.tencent.mm.sdk.b.c lqK;
  private d lqw;
  private com.tencent.mm.plugin.freewifi.g.d lqx;
  private com.tencent.mm.plugin.freewifi.g.b lqy;
  private com.tencent.mm.plugin.freewifi.g.f lqz;
  
  static
  {
    GMTrace.i(7140517347328L, 53201);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("FREEWIFIINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(7142127960064L, 53213);
        String[] arrayOfString = com.tencent.mm.plugin.freewifi.g.d.fTX;
        GMTrace.o(7142127960064L, 53213);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("FREEWIFICONFIG_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(7145483403264L, 53238);
        String[] arrayOfString = com.tencent.mm.plugin.freewifi.g.b.fTX;
        GMTrace.o(7145483403264L, 53238);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("FREEWIFILOG_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(7134745985024L, 53158);
        String[] arrayOfString = com.tencent.mm.plugin.freewifi.g.f.fTX;
        GMTrace.o(7134745985024L, 53158);
        return arrayOfString;
      }
    });
    GMTrace.o(7140517347328L, 53201);
  }
  
  public j()
  {
    GMTrace.i(7138504081408L, 53186);
    this.lqE = new n.a()
    {
      private byte[] fJa;
      
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(7130719453184L, 53128);
        for (;;)
        {
          synchronized (this.fJa)
          {
            if (!at.AU())
            {
              w.e("MicroMsg.FreeWifi.SubCoreFreeWifi", "account not ready");
              GMTrace.o(7130719453184L, 53128);
              return;
            }
            w.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", "onNetworkChange state=" + paramAnonymousInt + ".(-1=NETWORK_UNKNOWN; 0=NETWORK_UNAVAILABLE; 1=NETWORK_CONNECTED; 2=GATEWAY_FAILED; 3=SERVER_FAILED; 4=CONNECTTING; 5=CONNECTED; 6=SERVER_DOWN)");
            Object localObject2 = (ConnectivityManager)ab.getContext().getSystemService("connectivity");
            NetworkInfo localNetworkInfo = ((ConnectivityManager)localObject2).getNetworkInfo(1);
            if (localNetworkInfo != null)
            {
              w.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", "wifiNetwork:" + localNetworkInfo);
              w.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", " wifiNetwork.isAvailable()=%b,wifiNetwork.isConnected()=%b,wifiNetwork.isConnectedOrConnecting()=%b", new Object[] { Boolean.valueOf(localNetworkInfo.isAvailable()), Boolean.valueOf(localNetworkInfo.isConnected()), Boolean.valueOf(localNetworkInfo.isConnectedOrConnecting()) });
            }
            localObject2 = ((ConnectivityManager)localObject2).getNetworkInfo(0);
            if (localObject2 != null)
            {
              w.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", "mobileNetworkInfo", new Object[] { localObject2 });
              w.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", " mobileNetworkInfo.isAvailable()=%b,mobileNetworkInfo.isConnected()=%b,mobileNetworkInfo.isConnectedOrConnecting()=%b", new Object[] { Boolean.valueOf(((NetworkInfo)localObject2).isAvailable()), Boolean.valueOf(((NetworkInfo)localObject2).isConnected()), Boolean.valueOf(((NetworkInfo)localObject2).isConnectedOrConnecting()) });
              break label314;
              if (!localNetworkInfo.isConnected())
              {
                f.a.lqg.aAZ();
                GMTrace.o(7130719453184L, 53128);
                return;
              }
              boolean bool = f.a.lqg.a(d.aAW());
              w.i("MicroMsg.FreeWifi.SubCoreFreeWifi", "isWifiIndeedChanged=%b", new Object[] { Boolean.valueOf(bool) });
              if (bool) {
                j.aBj().aAP();
              }
              GMTrace.o(7130719453184L, 53128);
              return;
            }
          }
          label314:
          if ((6 != paramAnonymousInt) && (4 != paramAnonymousInt) && (paramAnonymousInt != 0) && (-1 != paramAnonymousInt)) {
            if (-9 != paramAnonymousInt) {}
          }
        }
      }
    };
    this.lqF = new com.tencent.mm.sdk.b.c() {};
    this.lqG = new com.tencent.mm.sdk.b.c() {};
    this.lqH = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(gf paramAnonymousgf)
      {
        GMTrace.i(7137430339584L, 53178);
        String str1;
        f.b localb;
        if ((paramAnonymousgf.eJp.data == "MAIN_UI_EVENT_UPDATE_VIEW") && (m.aAE()))
        {
          str1 = "InterruptedProtocol31-" + System.currentTimeMillis();
          localb = f.a.lqg.aBa();
          if ((localb != null) && (!localb.lqk) && (System.currentTimeMillis() - localb.lpX <= 180000L) && (!m.yp(localb.lqi)) && (!m.yp(localb.lqh)) && (!m.yp(localb.lqj))) {
            break label118;
          }
        }
        for (;;)
        {
          GMTrace.o(7137430339584L, 53178);
          return false;
          label118:
          w.i("MicroMsg.FreeWifi.Protocol31Handler", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema, desc=It gets info of the wifi switched to last time. apSSid=%s, apBssid=%s, mobileMac=%s, time=%d", new Object[] { str1, Integer.valueOf(1), localb.lqh, localb.lqi, localb.lqj, Long.valueOf(localb.lpX) });
          paramAnonymousgf = d.aAW();
          w.i("MicroMsg.FreeWifi.Protocol31Handler", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema, desc=It gets info of the wifi connected right now. wifiinfo = %s", new Object[] { str1, Integer.valueOf(2), paramAnonymousgf });
          if (paramAnonymousgf != null)
          {
            String str2 = m.yq(paramAnonymousgf.getSSID());
            if (m.yq(localb.lqh).equals(str2))
            {
              String str3 = paramAnonymousgf.getBSSID();
              ??? = paramAnonymousgf.getMacAddress();
              paramAnonymousgf = (gf)???;
              if (Build.VERSION.SDK_INT > 22) {
                if (??? != null)
                {
                  paramAnonymousgf = (gf)???;
                  if (!((String)???).equals("02:00:00:00:00:00")) {}
                }
                else
                {
                  paramAnonymousgf = m.aAG();
                }
              }
              synchronized (f.a.lqg)
              {
                if (localb == f.a.lqg.aBa()) {}
              }
              w.i("MicroMsg.FreeWifi.Protocol31Handler", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema, desc=it starts net request [GetInterruptedProtocol31] for schema url. apSSid=%s, apBssid=%s, mobileMac=%s", new Object[] { str1, Integer.valueOf(3), str2, str3, paramAnonymousgf });
              new g(str2, str3, paramAnonymousgf).b(new c.1(str1, localb));
            }
          }
        }
      }
    };
    this.lqI = new com.tencent.mm.sdk.b.c() {};
    this.lqJ = new com.tencent.mm.sdk.b.c() {};
    this.lqK = new com.tencent.mm.sdk.b.c() {};
    this.hPq = new com.tencent.mm.sdk.b.c() {};
    this.kAP = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(14550946545664L, 108413);
        e locale = j.aBk();
        paramAnonymousa = paramAnonymousa.gtM;
        if (1 != i.a.loq.getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_RECV_FREEWIFI_SYSMSG", 0)) {
          i.a.loq.aZ("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_RECV_FREEWIFI_SYSMSG", 1);
        }
        if ((paramAnonymousa == null) || (paramAnonymousa.tPY == null))
        {
          w.e("MicroMsg.FreeWifi.FreeWifiMessageService", "cmdAddMsg is null");
          GMTrace.o(14550946545664L, 108413);
          return;
        }
        Object localObject = com.tencent.mm.platformtools.n.a(paramAnonymousa.tPY);
        w.i("MicroMsg.FreeWifi.FreeWifiMessageService", "freewifi push message cmdAM.NewMsgId=%d, msgContent=%s", new Object[] { Long.valueOf(paramAnonymousa.tQd), localObject });
        if (m.yp((String)localObject))
        {
          w.e("MicroMsg.FreeWifi.FreeWifiMessageService", "msgContent is empty. return.");
          GMTrace.o(14550946545664L, 108413);
          return;
        }
        localObject = com.tencent.mm.plugin.freewifi.c.a.yw((String)localObject);
        if (localObject == null)
        {
          w.e("MicroMsg.FreeWifi.FreeWifiMessageService", "parse schemaMsg failed. return.");
          GMTrace.o(14550946545664L, 108413);
          return;
        }
        String str = m.yu("MicroMsg.FreeWifi.FreeWifiMessageService");
        new com.tencent.mm.plugin.freewifi.d.d(m.ys("MicroMsg.FreeWifi.FreeWifiMessageService"), m.yt("MicroMsg.FreeWifi.FreeWifiMessageService"), str, ((com.tencent.mm.plugin.freewifi.c.a)localObject).lpP, ((com.tencent.mm.plugin.freewifi.c.a)localObject).lpM, ((com.tencent.mm.plugin.freewifi.c.a)localObject).lpQ, ((com.tencent.mm.plugin.freewifi.c.a)localObject).ssid, ((com.tencent.mm.plugin.freewifi.c.a)localObject).bssid).b(new e.1(locale, paramAnonymousa));
        GMTrace.o(14550946545664L, 108413);
      }
    };
    GMTrace.o(7138504081408L, 53186);
  }
  
  public static j aBc()
  {
    GMTrace.i(7138638299136L, 53187);
    j localj2 = (j)at.AK().gZ("plugin.freewifi");
    j localj1 = localj2;
    if (localj2 == null)
    {
      w.w("MicroMsg.FreeWifi.SubCoreFreeWifi", "not found in MMCore, new one");
      localj1 = new j();
      at.AK().a("plugin.freewifi", localj1);
    }
    GMTrace.o(7138638299136L, 53187);
    return localj1;
  }
  
  public static d aBd()
  {
    GMTrace.i(7138772516864L, 53188);
    h.xw().wG();
    if (aBc().lqw == null) {
      aBc().lqw = new d();
    }
    d locald = aBc().lqw;
    GMTrace.o(7138772516864L, 53188);
    return locald;
  }
  
  public static com.tencent.mm.plugin.freewifi.g.d aBe()
  {
    GMTrace.i(7138906734592L, 53189);
    h.xw().wG();
    if (aBc().lqx == null)
    {
      localObject = aBc();
      at.AR();
      ((j)localObject).lqx = new com.tencent.mm.plugin.freewifi.g.d(com.tencent.mm.y.c.yH());
    }
    Object localObject = aBc().lqx;
    GMTrace.o(7138906734592L, 53189);
    return (com.tencent.mm.plugin.freewifi.g.d)localObject;
  }
  
  public static com.tencent.mm.plugin.freewifi.g.b aBf()
  {
    GMTrace.i(7139040952320L, 53190);
    h.xw().wG();
    if (aBc().lqy == null)
    {
      localObject = aBc();
      at.AR();
      ((j)localObject).lqy = new com.tencent.mm.plugin.freewifi.g.b(com.tencent.mm.y.c.yH());
    }
    Object localObject = aBc().lqy;
    GMTrace.o(7139040952320L, 53190);
    return (com.tencent.mm.plugin.freewifi.g.b)localObject;
  }
  
  public static com.tencent.mm.plugin.freewifi.g.f aBg()
  {
    GMTrace.i(7139175170048L, 53191);
    h.xw().wG();
    if (aBc().lqz == null)
    {
      localObject = aBc();
      at.AR();
      ((j)localObject).lqz = new com.tencent.mm.plugin.freewifi.g.f(com.tencent.mm.y.c.yH());
    }
    Object localObject = aBc().lqz;
    GMTrace.o(7139175170048L, 53191);
    return (com.tencent.mm.plugin.freewifi.g.f)localObject;
  }
  
  public static c aBh()
  {
    GMTrace.i(7139309387776L, 53192);
    h.xw().wG();
    if (aBc().lqA == null) {
      aBc().lqA = new c();
    }
    c localc = aBc().lqA;
    GMTrace.o(7139309387776L, 53192);
    return localc;
  }
  
  public static c aBi()
  {
    GMTrace.i(7139443605504L, 53193);
    h.xw().wG();
    if (aBc().lqB == null) {
      aBc().lqB = new c();
    }
    c localc = aBc().lqB;
    GMTrace.o(7139443605504L, 53193);
    return localc;
  }
  
  public static a aBj()
  {
    GMTrace.i(7139577823232L, 53194);
    h.xw().wG();
    if (aBc().lqC == null) {
      aBc().lqC = new a();
    }
    a locala = aBc().lqC;
    GMTrace.o(7139577823232L, 53194);
    return locala;
  }
  
  public static e aBk()
  {
    GMTrace.i(7140383129600L, 53200);
    h.xw().wG();
    if (aBc().lqD == null) {
      aBc().lqD = new e();
    }
    e locale = aBc().lqD;
    GMTrace.o(7140383129600L, 53200);
    return locale;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7139846258688L, 53196);
    at.getSysCmdMsgExtension().a("freewifi", this.kAP, true);
    at.a(this.lqE);
    com.tencent.mm.sdk.b.a.vgX.b(this.lqF);
    com.tencent.mm.sdk.b.a.vgX.b(this.lqG);
    com.tencent.mm.sdk.b.a.vgX.b(this.lqH);
    com.tencent.mm.sdk.b.a.vgX.b(this.lqI);
    com.tencent.mm.sdk.b.a.vgX.b(this.lqJ);
    com.tencent.mm.sdk.b.a.vgX.b(this.lqK);
    com.tencent.mm.sdk.b.a.vgX.b(this.hPq);
    try
    {
      this.lqE.db(-9);
      b localb = b.b.lpZ;
      w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "initialized");
      try
      {
        localObject1 = (ConnectivityManager)ab.getContext().getSystemService("connectivity");
        localObject2 = ((ConnectivityManager)localObject1).getNetworkInfo(1);
        w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoWifi=%s", new Object[] { ((NetworkInfo)localObject2).toString() });
        if ((localObject2 == null) || (!((NetworkInfo)localObject2).isConnected())) {
          break label356;
        }
        localObject2 = ((WifiManager)ab.getContext().getSystemService("wifi")).getConnectionInfo();
        localObject1 = m.yq(((WifiInfo)localObject2).getSSID());
        localObject2 = m.yr(((WifiInfo)localObject2).getBSSID()).toLowerCase();
        b.a locala = new b.a();
        locala.lpX = System.currentTimeMillis();
        locala.type = 1;
        locala.ssid = ((String)localObject1);
        locala.bssid = ((String)localObject2);
        locala.lpY = "";
        b.b(localb.lpU.aAQ(), locala);
        localb.lpU = locala;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject1;
          Object localObject2 = com.tencent.mm.plugin.freewifi.k.aAB();
          ((k.a)localObject2).eCE = "UnExpectedException";
          ((k.a)localObject2).result = -1;
          ((k.a)localObject2).jNb = m.d(localException);
          ((k.a)localObject2).aAD().aAC();
          w.e("MicroMsg.FreeWifi.UnExcepctedException", m.e(localException));
        }
      }
      localObject1 = new IntentFilter();
      ((IntentFilter)localObject1).addAction("android.net.conn.CONNECTIVITY_CHANGE");
      localb.aAr();
      ab.getContext().registerReceiver(localb.lpV, (IntentFilter)localObject1);
      GMTrace.o(7139846258688L, 53196);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.e("MicroMsg.FreeWifi.SubCoreFreeWifi", "netChanged.onNetworkChange(NETWORK_ACCOUNT_POST_RESET) error. e.getMessage()=" + localRemoteException.getMessage());
        continue;
        label356:
        localObject1 = ((ConnectivityManager)localObject1).getNetworkInfo(0);
        w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoMobile=%s", new Object[] { ((NetworkInfo)localObject1).toString() });
        if ((localObject1 != null) && (((NetworkInfo)localObject1).isConnected()))
        {
          localObject2 = new b.a();
          ((b.a)localObject2).lpX = System.currentTimeMillis();
          ((b.a)localObject2).type = 0;
          ((b.a)localObject2).ssid = "";
          ((b.a)localObject2).bssid = "";
          ((b.a)localObject2).lpY = m.yr(((NetworkInfo)localObject1).getExtraInfo());
          b.a(localRemoteException.lpU.aAQ(), (b.a)localObject2);
          localRemoteException.lpU = ((b.a)localObject2);
        }
      }
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7139980476416L, 53197);
    GMTrace.o(7139980476416L, 53197);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7139712040960L, 53195);
    GMTrace.o(7139712040960L, 53195);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7140114694144L, 53198);
    at.getSysCmdMsgExtension().b("freewifi", this.kAP, true);
    aBd();
    d.release();
    aBh().release();
    at.b(this.lqE);
    com.tencent.mm.sdk.b.a.vgX.c(this.lqF);
    com.tencent.mm.sdk.b.a.vgX.c(this.lqG);
    com.tencent.mm.sdk.b.a.vgX.c(this.lqH);
    com.tencent.mm.sdk.b.a.vgX.c(this.lqI);
    com.tencent.mm.sdk.b.a.vgX.c(this.lqJ);
    com.tencent.mm.sdk.b.a.vgX.c(this.lqK);
    com.tencent.mm.sdk.b.a.vgX.c(this.hPq);
    b.b.lpZ.aAr();
    GMTrace.o(7140114694144L, 53198);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7140248911872L, 53199);
    HashMap localHashMap = fIv;
    GMTrace.o(7140248911872L, 53199);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
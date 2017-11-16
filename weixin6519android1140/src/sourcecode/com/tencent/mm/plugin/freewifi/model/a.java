package com.tencent.mm.plugin.freewifi.model;

import android.content.Intent;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.freewifi.d.b;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public SparseArray<Long> lpR;
  private g lpS;
  
  public a()
  {
    GMTrace.i(7136088162304L, 53168);
    this.lpR = new SparseArray();
    this.lpS = new g();
    GMTrace.o(7136088162304L, 53168);
  }
  
  public final void a(String paramString, g.b paramb, int paramInt, Intent paramIntent)
  {
    GMTrace.i(7136222380032L, 53169);
    g localg = this.lpS;
    j.aBh().aAR().post(new g.1(localg, paramString, paramIntent, paramb, paramInt));
    GMTrace.o(7136222380032L, 53169);
  }
  
  public final void a(String paramString1, String paramString2, Intent paramIntent)
  {
    GMTrace.i(7136356597760L, 53170);
    g localg = this.lpS;
    j.aBh().aAR().post(new g.2(localg, paramString2, paramString1, paramIntent, null));
    GMTrace.o(7136356597760L, 53170);
  }
  
  public final void aAP()
  {
    String str2;
    try
    {
      GMTrace.i(7136490815488L, 53171);
      w.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "ap check for bar.");
      str2 = d.aAV();
      w.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "autuApAuth, get ssid is %s ", new Object[] { str2 });
      if (bg.nm(str2)) {
        GMTrace.o(7136490815488L, 53171);
      }
      for (;;)
      {
        return;
        if (j.aBe().yG(str2) == null) {
          break;
        }
        GMTrace.o(7136490815488L, 53171);
      }
      str3 = d.aAT();
    }
    finally {}
    String str3;
    if (str3 == null) {}
    for (int i = 0;; i = str3.hashCode())
    {
      w.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "freewifi info is null, now try to check is the wechat wifi fromserver, ssid is : %s, mac is : %s, nowmac hashcode : %d", new Object[] { str2, str3, Integer.valueOf(i) });
      if (!bg.nm(str3)) {
        break label154;
      }
      GMTrace.o(7136490815488L, 53171);
      break;
    }
    label154:
    com.tencent.mm.plugin.freewifi.g.c localc = j.aBe().yH(str2);
    String str1;
    label173:
    boolean bool;
    if (localc == null)
    {
      str1 = "null free wifiinfo";
      w.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "now mac is : %s, loacal mac is : %s", new Object[] { str3, str1 });
      if (localc == null) {
        break label486;
      }
      w.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "freewifi is not null, expired time = %d", new Object[] { Long.valueOf(localc.field_expiredTime) });
      if ((str3.equalsIgnoreCase(localc.field_mac)) && (localc.field_expiredTime - bg.Pu() >= 0L)) {
        break label581;
      }
      w.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "has expierd time or mac has changed");
      bool = true;
    }
    for (;;)
    {
      label258:
      w.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "Should request bar from back end = %b", new Object[] { Boolean.valueOf(bool) });
      int k;
      if (bool)
      {
        k = d.aAU();
        w.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "now should do ap check, rssi is :  %d, mac : %s, mac hashcode : %d", new Object[] { Integer.valueOf(k), str3, Integer.valueOf(str3.hashCode()) });
        if (System.currentTimeMillis() - i.a.loq.nn("LOCAL_CONFIG_LAST_APCHECK_SAVE_DELAY_CRD_TIMEMILLIS") <= i.a.loq.getInt("LOCAL_CONFIG_APCHECK_DELAY_CRD_EXPIRED_DAYS", 7) * 24 * 60 * 60 * 1000) {
          break label576;
        }
      }
      label486:
      label576:
      for (int j = 1;; j = 0)
      {
        i = j;
        if (i.a.loq.getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_BAR_APPEARED", 0) == 1) {
          i = j | 0x2;
        }
        j = i;
        if (i.a.loq.getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 0) == 1) {
          j = i | 0x4;
        }
        i = j;
        if (i.a.loq.getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_RECV_FREEWIFI_SYSMSG", 0) == 1) {
          i = j | 0x8;
        }
        w.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "features : " + i);
        new b(str3, str2, k, i).b(new e()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
          {
            GMTrace.i(7144812314624L, 53233);
            paramAnonymousString = ((b)paramAnonymousk).mac;
            if (m.yp(paramAnonymousString))
            {
              GMTrace.o(7144812314624L, 53233);
              return;
            }
            if (paramAnonymousInt2 == 35525)
            {
              a.this.lpR.put(paramAnonymousString.hashCode(), Long.valueOf(bg.Pv()));
              GMTrace.o(7144812314624L, 53233);
              return;
            }
            a.this.lpR.remove(paramAnonymousString.hashCode());
            GMTrace.o(7144812314624L, 53233);
          }
        });
        GMTrace.o(7136490815488L, 53171);
        break;
        str1 = localc.field_mac;
        break label173;
        if (this.lpR.indexOfKey(str3.hashCode()) >= 0)
        {
          long l = ((Long)this.lpR.get(str3.hashCode())).longValue();
          w.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "has checked this mac, now time - last check time = %d", new Object[] { Long.valueOf(bg.Pv() - l) });
          if (bg.Pv() - l <= 43200000L) {
            break label581;
          }
          bool = true;
          break label258;
        }
        w.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "has not checked this mac, try to check from server");
        bool = true;
        break label258;
      }
      label581:
      bool = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
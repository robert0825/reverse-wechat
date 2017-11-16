package com.tencent.mm.plugin.freewifi.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.et;
import com.tencent.mm.g.a.et.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiManufacturerLoadingUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public b()
  {
    GMTrace.i(7121726865408L, 53061);
    GMTrace.o(7121726865408L, 53061);
  }
  
  private static void a(et paramet, int paramInt, String paramString)
  {
    GMTrace.i(7121995300864L, 53063);
    paramet.eGv.eGy = paramInt;
    paramet.eGv.eGz = paramString;
    paramet.eGv.eGx = 1;
    w.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "FreeWifiManufacturerConnectWifiHelper setResult. errorcode=%d, errmsg=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramet.eDO != null) {
      paramet.eDO.run();
    }
    GMTrace.o(7121995300864L, 53063);
  }
  
  public final void a(et paramet)
  {
    for (;;)
    {
      final String str1;
      final String str2;
      try
      {
        GMTrace.i(7121861083136L, 53062);
        w.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "Method connectWifi gets called");
        str1 = m.yq(paramet.eGu.ssid);
        str2 = paramet.eGu.bssid;
        if (m.yp(str1))
        {
          a(paramet, 1141, "Ssid is empty.");
          GMTrace.o(7121861083136L, 53062);
          return;
        }
        if (m.yp(str2))
        {
          a(paramet, 1142, "Bssid is empty.");
          GMTrace.o(7121861083136L, 53062);
          continue;
        }
        w.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "args: ssid=" + paramet.eGu.ssid + "; bssid=" + paramet.eGu.bssid + "; version=" + paramet.eGu.version);
      }
      finally {}
      w.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "Try to get connect info from cache");
      a.b localb = a.a.lpx.cj(str1, str2);
      w.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "read cache done.");
      if (localb == null)
      {
        if (a.a.lpx.size() == 0)
        {
          a(paramet, 1145, "Ap connect info cache in wechat is empty. It may be wechat got killed before.");
          GMTrace.o(7121861083136L, 53062);
        }
        else
        {
          a(paramet, 1144, "Ap connect info cache in wechat is not empty but the ap tried to connect to is not contained in the cache.");
          GMTrace.o(7121861083136L, 53062);
        }
      }
      else
      {
        final String str3 = localb.eCE;
        int i = localb.low;
        if (i == 4)
        {
          w.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "Ready to start up password ap connect page.");
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7123471695872L, 53074);
              Intent localIntent = new Intent();
              localIntent.putExtra("free_wifi_ap_key", str3);
              localIntent.putExtra("free_wifi_sessionkey", m.aAF());
              localIntent.putExtra("free_wifi_source", 6);
              localIntent.addFlags(67108864);
              d.b(ab.getContext(), "freewifi", ".ui.FreeWifiEntryUI", localIntent);
              GMTrace.o(7123471695872L, 53074);
            }
          });
          a(paramet, 1, null);
          GMTrace.o(7121861083136L, 53062);
        }
        else if (i == 31)
        {
          w.i("MicroMsg.FreeWifi.FreeWifiManufacturerConnectWifiHelper", "Ready to connect 31 page.");
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7124277002240L, 53080);
              Intent localIntent = new Intent();
              localIntent.putExtra("ConstantsFreeWifi.FreeWifiManufacturerConnectWifiHelper_Ssid", str1);
              localIntent.putExtra("ConstantsFreeWifi.FreeWifiManufacturerConnectWifiHelper_Bssid", str2);
              localIntent.setClass(ab.getContext(), FreeWifiManufacturerLoadingUI.class);
              localIntent.addFlags(268435456);
              ab.getContext().startActivity(localIntent);
              GMTrace.o(7124277002240L, 53080);
            }
          });
          a(paramet, 1, null);
          GMTrace.o(7121861083136L, 53062);
        }
        else
        {
          a(paramet, 1143, "Wechant installed Currently doesn't support connect protocol " + i);
          GMTrace.o(7121861083136L, 53062);
        }
      }
    }
  }
  
  private static final class a
  {
    public static b lpB;
    
    static
    {
      GMTrace.i(7126558703616L, 53097);
      lpB = new b();
      GMTrace.o(7126558703616L, 53097);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
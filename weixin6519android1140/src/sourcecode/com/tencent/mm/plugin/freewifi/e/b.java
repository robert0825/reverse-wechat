package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiNetCheckUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  private static String TAG;
  
  static
  {
    GMTrace.i(7246280916992L, 53989);
    TAG = "MicroMsg.FreeWifi.Protocol31Entry";
    GMTrace.o(7246280916992L, 53989);
  }
  
  public b()
  {
    GMTrace.i(7245744046080L, 53985);
    GMTrace.o(7245744046080L, 53985);
  }
  
  public static void H(Intent paramIntent)
  {
    boolean bool1 = true;
    GMTrace.i(7246012481536L, 53987);
    if (paramIntent == null)
    {
      GMTrace.o(7246012481536L, 53987);
      return;
    }
    Object localObject = paramIntent.getStringExtra("free_wifi_ap_key");
    int i;
    if (!m.yp((String)localObject))
    {
      i = paramIntent.getIntExtra("free_wifi_threeone_startup_type", 0);
      if (2 != i) {
        break label393;
      }
      i = 11;
    }
    for (;;)
    {
      paramIntent.putExtra("free_wifi_channel_id", i);
      paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 31);
      m.d(paramIntent, paramIntent.getStringExtra("free_wifi_schema_ticket"));
      paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_ID", m.C(paramIntent) + "_" + m.E(paramIntent) + "_" + m.F(paramIntent) + "_" + System.currentTimeMillis());
      boolean bool2 = d.a.lqX.i(paramIntent.getIntExtra("free_wifi_threeone_startup_type", 0), paramIntent.getStringExtra("free_wifi_ap_key"), paramIntent.getStringExtra("free_wifi_schema_ticket"));
      k.a locala = k.aAB();
      locala.ssid = m.ys(TAG);
      locala.bssid = m.yt(TAG);
      locala.eCE = ((String)localObject);
      locala.lov = paramIntent.getStringExtra("free_wifi_schema_ticket");
      locala.low = m.E(paramIntent);
      locala.lox = k.b.loQ.lpi;
      locala.loy = k.b.loQ.name;
      locala.ePH = m.F(paramIntent);
      if (bool2)
      {
        i = 0;
        label258:
        locala.result = i;
        localObject = locala.aAD();
        if (bool2) {
          break label420;
        }
      }
      for (;;)
      {
        ((k)localObject).b(paramIntent, bool1).aAC();
        w.i(TAG, "getLock = " + bool2);
        m.yv("type=" + paramIntent.getIntExtra("free_wifi_threeone_startup_type", 0) + ";getLock=" + bool2);
        if (bool2)
        {
          m.d(paramIntent, paramIntent.getStringExtra("free_wifi_schema_ticket"));
          paramIntent.setClass(ab.getContext(), FreeWifiNetCheckUI.class);
          paramIntent.addFlags(67108864);
          com.tencent.mm.bj.d.b(ab.getContext(), "freewifi", ".ui.FreeWifiEntryUI", paramIntent);
        }
        GMTrace.o(7246012481536L, 53987);
        return;
        label393:
        if (3 == i)
        {
          i = 12;
          break;
        }
        if (4 != i) {
          break label425;
        }
        i = 13;
        break;
        i = -1;
        break label258;
        label420:
        bool1 = false;
      }
      label425:
      i = 1;
    }
  }
  
  public static b aBA()
  {
    GMTrace.i(7245878263808L, 53986);
    b localb = a.lqS;
    GMTrace.o(7245878263808L, 53986);
    return localb;
  }
  
  private static final class a
  {
    public static b lqS;
    
    static
    {
      GMTrace.i(7237556764672L, 53924);
      lqS = new b();
      GMTrace.o(7237556764672L, 53924);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
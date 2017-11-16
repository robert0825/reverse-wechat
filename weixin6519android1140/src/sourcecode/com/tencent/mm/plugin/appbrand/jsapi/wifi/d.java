package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.b;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_INDEX = 314;
  public static final String NAME = "startWifi";
  public static boolean ioH;
  public static BroadcastReceiver ioI;
  
  static
  {
    GMTrace.i(19816710668288L, 147646);
    ioH = false;
    ioI = null;
    GMTrace.o(19816710668288L, 147646);
  }
  
  public d()
  {
    GMTrace.i(19816308015104L, 147643);
    GMTrace.o(19816308015104L, 147643);
  }
  
  public static void j(j paramj)
  {
    GMTrace.i(19816576450560L, 147645);
    try
    {
      a.a locala = new a.a();
      HashMap localHashMap = new HashMap();
      localHashMap.put("wifi", new b().on());
      locala.ai(paramj.hyD, 0).r(localHashMap).VR();
      GMTrace.o(19816576450560L, 147645);
      return;
    }
    catch (JSONException paramj)
    {
      w.e("MicroMsg.JsApiStartWifi", "mWiFiEventReceiver is error");
      w.printErrStackTrace("MicroMsg.JsApiStartWifi", paramj, "", new Object[0]);
      GMTrace.o(19816576450560L, 147645);
    }
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19816442232832L, 147644);
    w.i("MicroMsg.JsApiStartWifi", "invoke startWifi");
    paramJSONObject = paramj.mContext;
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiStartWifi", "mContext is null, invoke fail!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paramj.v(paramInt, d("fail:context is null", paramJSONObject));
      GMTrace.o(19816442232832L, 147644);
      return;
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.bN(paramJSONObject);
    if (!ioH)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
      localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
      localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      localIntentFilter.setPriority(Integer.MAX_VALUE);
      ioI = new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          GMTrace.i(19815905361920L, 147640);
          if (paramAnonymousIntent == null)
          {
            GMTrace.o(19815905361920L, 147640);
            return;
          }
          paramAnonymousContext = paramAnonymousIntent.getAction();
          if (TextUtils.isEmpty(paramAnonymousContext))
          {
            GMTrace.o(19815905361920L, 147640);
            return;
          }
          w.i("MicroMsg.JsApiStartWifi", "actiong:%s", new Object[] { paramAnonymousContext });
          int i;
          if ("android.net.wifi.WIFI_STATE_CHANGED".equals(paramAnonymousContext))
          {
            i = paramAnonymousIntent.getIntExtra("wifi_state", 0);
            w.i("MicroMsg.JsApiStartWifi", "wifiState" + i);
          }
          label153:
          int j;
          switch (i)
          {
          default: 
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(paramAnonymousContext)) {
              break label328;
            }
            paramAnonymousContext = paramAnonymousIntent.getParcelableExtra("networkInfo");
            if (paramAnonymousContext == null) {
              break label328;
            }
            paramAnonymousContext = (NetworkInfo)paramAnonymousContext;
            if (paramAnonymousContext.getState() == NetworkInfo.State.CONNECTED)
            {
              i = 1;
              if (paramAnonymousContext.getType() != 1) {
                break label227;
              }
              j = 1;
            }
            break;
          }
          for (;;)
          {
            if ((i != 0) && (j != 0))
            {
              paramAnonymousContext = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.Yd();
              w.i("MicroMsg.JsApiStartWifi", "[mWiFiEventReceiver]currentWifi:%s", new Object[] { paramAnonymousContext });
              if (paramAnonymousContext == null)
              {
                w.e("MicroMsg.JsApiStartWifi", "[CONNECTIVITY_ACTION]currentWIfi is null");
                GMTrace.o(19815905361920L, 147640);
                return;
                d.j(paramj);
                break;
                i = 0;
                break label153;
                label227:
                j = 0;
                continue;
              }
              try
              {
                paramAnonymousIntent = new a.a();
                HashMap localHashMap = new HashMap();
                localHashMap.put("wifi", paramAnonymousContext.on());
                paramAnonymousIntent.ai(paramj.hyD, 0).r(localHashMap).VR();
                GMTrace.o(19815905361920L, 147640);
                return;
              }
              catch (JSONException paramAnonymousContext)
              {
                w.e("MicroMsg.JsApiStartWifi", "IConnectWiFiCallback is error");
                w.printErrStackTrace("MicroMsg.JsApiStartWifi", paramAnonymousContext, "", new Object[0]);
                GMTrace.o(19815905361920L, 147640);
                return;
              }
            }
          }
          d.j(paramj);
          label328:
          GMTrace.o(19815905361920L, 147640);
        }
      };
      paramJSONObject.registerReceiver(ioI, localIntentFilter);
      ioH = true;
    }
    paramJSONObject = new c.b()
    {
      public final void onDestroy()
      {
        GMTrace.i(19816979103744L, 147648);
        if (d.ioI != null)
        {
          w.i("MicroMsg.JsApiStartWifi", "unregisterReceiver");
          paramJSONObject.unregisterReceiver(d.ioI);
          d.ioH = false;
          d.ioI = null;
        }
        c.b(paramj.hyD, this);
        GMTrace.o(19816979103744L, 147648);
      }
    };
    c.a(paramj.hyD, paramJSONObject);
    paramJSONObject = new HashMap();
    paramJSONObject.put("errCode", Integer.valueOf(0));
    paramj.v(paramInt, d("ok", paramJSONObject));
    GMTrace.o(19816442232832L, 147644);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\wifi\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 316;
  public static final String NAME = "connectWifi";
  
  public a()
  {
    GMTrace.i(19824361078784L, 147703);
    GMTrace.o(19824361078784L, 147703);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19824495296512L, 147704);
    super.a(paramj, paramJSONObject, paramInt);
    if (!d.ioH)
    {
      w.e("MicroMsg.JsApiConenctWifi", "not invoke startWifi");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12000));
      paramj.v(paramInt, d("fail:not invoke startWifi", paramJSONObject));
      GMTrace.o(19824495296512L, 147704);
      return;
    }
    if ((paramJSONObject == null) || (!paramJSONObject.has("SSID")))
    {
      w.e("MicroMsg.JsApiConenctWifi", "params is invalid");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paramj.v(paramInt, d("fail:invalid data", paramJSONObject));
      GMTrace.o(19824495296512L, 147704);
      return;
    }
    final Object localObject = paramj.mContext;
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiConenctWifi", "mContext is null, invoke fail!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paramj.v(paramInt, d("fail:context is null", paramJSONObject));
      GMTrace.o(19824495296512L, 147704);
      return;
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.bN((Context)localObject);
    if (!com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.isWifiEnabled())
    {
      w.e("MicroMsg.JsApiConenctWifi", "wifi is disable");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12005));
      paramj.v(paramInt, d("fail:wifi is disable", paramJSONObject));
      GMTrace.o(19824495296512L, 147704);
      return;
    }
    localObject = new com.tencent.mm.plugin.appbrand.widget.d((Context)localObject);
    ((com.tencent.mm.plugin.appbrand.widget.c.a)localObject).setCancelable(false);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20744289386496L, 154557);
        paramj.hzM.a(localObject);
        GMTrace.o(20744289386496L, 154557);
      }
    });
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.a(new com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.a()
    {
      public final void qW(String paramAnonymousString)
      {
        GMTrace.i(20744020951040L, 154555);
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.a(null);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(21062385401856L, 156927);
            if (a.2.this.ioF != null) {
              a.2.this.ioF.dismiss();
            }
            GMTrace.o(21062385401856L, 156927);
          }
        });
        if (paramAnonymousString.equals("ok"))
        {
          paramAnonymousString = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.Yd();
          w.i("MicroMsg.JsApiConenctWifi", "[IConnectWiFiCallback]currentWifi:%s", new Object[] { paramAnonymousString });
          if (paramAnonymousString == null)
          {
            w.e("MicroMsg.JsApiConenctWifi", "[onWiFiConnect]currentWIfi is null");
            paramAnonymousString = new HashMap();
            paramAnonymousString.put("errCode", Integer.valueOf(12010));
            paramj.v(paramInt, a.this.d("fail:currentWifi is null", paramAnonymousString));
            GMTrace.o(20744020951040L, 154555);
            return;
          }
          try
          {
            localHashMap = new HashMap();
            localHashMap.put("wifi", paramAnonymousString.on());
            localHashMap.put("errCode", Integer.valueOf(0));
            paramj.v(paramInt, a.this.d("ok", localHashMap));
            GMTrace.o(20744020951040L, 154555);
            return;
          }
          catch (JSONException paramAnonymousString)
          {
            w.e("MicroMsg.JsApiConenctWifi", "IConnectWiFiCallback is error");
            w.printErrStackTrace("MicroMsg.JsApiConenctWifi", paramAnonymousString, "", new Object[0]);
            paramAnonymousString = new HashMap();
            paramAnonymousString.put("errCode", Integer.valueOf(12010));
            paramj.v(paramInt, a.this.d("fail:parse json err", paramAnonymousString));
            GMTrace.o(20744020951040L, 154555);
            return;
          }
        }
        HashMap localHashMap = new HashMap();
        if (paramAnonymousString.equals("duplicated request")) {
          localHashMap.put("errCode", Integer.valueOf(12004));
        }
        for (;;)
        {
          w.e("MicroMsg.JsApiConenctWifi", "[IConnectWiFiCallback]errMsg:%s", new Object[] { paramAnonymousString });
          paramj.v(paramInt, a.this.d("fail:" + paramAnonymousString, localHashMap));
          GMTrace.o(20744020951040L, 154555);
          return;
          if (paramAnonymousString.equals("password error")) {
            localHashMap.put("errCode", Integer.valueOf(12002));
          } else {
            localHashMap.put("errCode", Integer.valueOf(12003));
          }
        }
      }
    });
    localObject = new c.b()
    {
      public final void onDestroy()
      {
        GMTrace.i(20743752515584L, 154553);
        w.d("MicroMsg.JsApiConenctWifi", "remove listener");
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.a(null);
        com.tencent.mm.plugin.appbrand.c.b(paramj.hyD, this);
        GMTrace.o(20743752515584L, 154553);
      }
    };
    com.tencent.mm.plugin.appbrand.c.a(paramj.hyD, (c.b)localObject);
    localObject = paramJSONObject.optString("SSID");
    String str = paramJSONObject.optString("BSSID");
    paramJSONObject = paramJSONObject.optString("password");
    if (((String)localObject).equals(""))
    {
      w.e("MicroMsg.JsApiConenctWifi", "params is invalid");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12008));
      paramj.v(paramInt, d("fail:invalid data", paramJSONObject));
      GMTrace.o(19824495296512L, 147704);
      return;
    }
    w.i("MicroMsg.JsApiConenctWifi", "ssid:%s, bSsid:%s is connecting", new Object[] { localObject, str });
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.A((String)localObject, str, paramJSONObject);
    GMTrace.o(19824495296512L, 147704);
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 322;
    private static final String NAME = "onWifiConnected";
    
    public a()
    {
      GMTrace.i(19824763731968L, 147706);
      GMTrace.o(19824763731968L, 147706);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\wifi\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 318;
  public static final String NAME = "getConnectedWifi";
  
  public b()
  {
    GMTrace.i(19815502708736L, 147637);
    GMTrace.o(19815502708736L, 147637);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19815636926464L, 147638);
    super.a(paramj, paramJSONObject, paramInt);
    if (!d.ioH)
    {
      w.e("MicroMsg.JsApiGetConnectedWifi", "not invoke startWifi");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12000));
      paramj.v(paramInt, d("fail:not invoke startWifi", paramJSONObject));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    Object localObject = paramj.mContext;
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiGetConnectedWifi", "mContext is null, invoke fail!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paramj.v(paramInt, d("fail:context is null", paramJSONObject));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.bN((Context)localObject);
    if (!c.isWifiEnabled())
    {
      w.e("MicroMsg.JsApiGetConnectedWifi", "wifi is disable,invoke fail!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12005));
      paramj.v(paramInt, d("fail:wifi is disable", paramJSONObject));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    paramJSONObject = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.Yd();
    if (paramJSONObject == null)
    {
      if ((Build.VERSION.SDK_INT >= 23) && (!g.tE()) && (!((LocationManager)((Context)localObject).getSystemService("location")).isProviderEnabled("gps")))
      {
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(12006));
        paramj.v(paramInt, d("fail:may be not open GPS", paramJSONObject));
        w.e("MicroMsg.JsApiGetConnectedWifi", "wifiList is empty, may be not open GPS");
        GMTrace.o(19815636926464L, 147638);
        return;
      }
      boolean bool = com.tencent.mm.pluginsdk.h.a.a((Activity)localObject, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
      w.i("MicroMsg.JsApiGetConnectedWifi", "checkLocation:%b", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(12012));
        paramj.v(paramInt, d("fail:may be not obtain GPS Perrmission", paramJSONObject));
        w.e("MicroMsg.JsApiGetConnectedWifi", "wifiList is empty, may be not obtain GPS Perrmission");
        GMTrace.o(19815636926464L, 147638);
        return;
      }
      w.e("MicroMsg.JsApiGetConnectedWifi", "currentWifi is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paramj.v(paramInt, d("fail:currentWifi is null", paramJSONObject));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    localObject = (ConnectivityManager)((Context)localObject).getSystemService("connectivity");
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiGetConnectedWifi", "ConnectivityManager is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paramj.v(paramInt, d("fail:connectivityManager is null", paramJSONObject));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiGetConnectedWifi", "netInfo is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paramj.v(paramInt, d("fail:netInfo is null", paramJSONObject));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    if (((NetworkInfo)localObject).getDetailedState() != NetworkInfo.DetailedState.CONNECTED)
    {
      w.e("MicroMsg.JsApiGetConnectedWifi", "ConnectivityManager is null, detailState:%s", new Object[] { ((NetworkInfo)localObject).getDetailedState() });
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paramj.v(paramInt, d("fail:detailState is not connected", paramJSONObject));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    w.i("MicroMsg.JsApiGetConnectedWifi", "[invoke]currentWifi:%s", new Object[] { paramJSONObject });
    try
    {
      localObject = new HashMap();
      ((HashMap)localObject).put("wifi", paramJSONObject.on());
      ((HashMap)localObject).put("errCode", Integer.valueOf(0));
      paramj.v(paramInt, d("ok", (Map)localObject));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.JsApiGetConnectedWifi", paramJSONObject, "", new Object[0]);
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paramj.v(paramInt, d("fail:parse json err", paramJSONObject));
      GMTrace.o(19815636926464L, 147638);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\wifi\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
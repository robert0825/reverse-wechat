package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 315;
  public static final String NAME = "stopWifi";
  
  public e()
  {
    GMTrace.i(19817113321472L, 147649);
    GMTrace.o(19817113321472L, 147649);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19817247539200L, 147650);
    w.i("MicroMsg.JsApiStopWifi", "invoke registerHotspotHelper");
    paramJSONObject = paramj.mContext;
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiStopWifi", "mContext is null, invoke fail!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paramj.v(paramInt, d("fail:context is null", paramJSONObject));
      GMTrace.o(19817247539200L, 147650);
      return;
    }
    if (!d.ioH)
    {
      w.e("MicroMsg.JsApiStopWifi", "not invoke startWifi");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12000));
      paramj.v(paramInt, d("fail:not invoke startWifi", paramJSONObject));
      GMTrace.o(19817247539200L, 147650);
      return;
    }
    if (d.ioI != null)
    {
      w.i("MicroMsg.JsApiStopWifi", "unregisterReceiver");
      paramJSONObject.unregisterReceiver(d.ioI);
      d.ioH = false;
      d.ioI = null;
    }
    paramJSONObject = new HashMap();
    paramJSONObject.put("errCode", Integer.valueOf(0));
    paramj.v(paramInt, d("ok", paramJSONObject));
    GMTrace.o(19817247539200L, 147650);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\wifi\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
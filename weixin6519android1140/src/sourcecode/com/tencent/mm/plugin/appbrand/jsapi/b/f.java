package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class f
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 182;
  private static final String NAME = "getBLEDeviceServices";
  
  public f()
  {
    GMTrace.i(14336735051776L, 106817);
    GMTrace.o(14336735051776L, 106817);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14336869269504L, 106818);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetBLEDeviceServices", "JsApiGetBLEDeviceServices data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(14336869269504L, 106818);
      return;
    }
    w.i("MicroMsg.JsApiGetBLEDeviceServices", "getBLEDeviceServices data %s", new Object[] { paramJSONObject.toString() });
    Object localObject1 = new HashMap();
    if (com.tencent.mm.compatible.util.f.eu(18))
    {
      w.e("MicroMsg.JsApiGetBLEDeviceServices", "API version is below 18!");
      ((Map)localObject1).put("errCode", Integer.valueOf(10009));
      paramj.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(14336869269504L, 106818);
      return;
    }
    paramJSONObject = paramJSONObject.optString("deviceId");
    if (!a.icY)
    {
      w.e("MicroMsg.JsApiGetBLEDeviceServices", "bluetooth is not init!");
      ((Map)localObject1).put("errCode", Integer.valueOf(10000));
      paramj.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(14336869269504L, 106818);
      return;
    }
    Object localObject2 = (BluetoothManager)paramj.mContext.getSystemService("bluetooth");
    if (localObject2 == null)
    {
      w.e("MicroMsg.JsApiGetBLEDeviceServices", "bluetoothManager is null!");
      ((Map)localObject1).put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(14336869269504L, 106818);
      return;
    }
    localObject2 = ((BluetoothManager)localObject2).getAdapter();
    if ((localObject2 == null) || (!((BluetoothAdapter)localObject2).isEnabled()))
    {
      w.e("MicroMsg.JsApiGetBLEDeviceServices", "adapter is null or not enabled!");
      ((Map)localObject1).put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(14336869269504L, 106818);
      return;
    }
    localObject2 = a.g(paramj);
    w.i("MicroMsg.JsApiGetBLEDeviceServices", "try getBleDeviceServices with deviceId : " + paramJSONObject);
    localObject2 = (Map)((u.b)localObject2).get("key_bluetooth_services_uuid" + paramJSONObject, null);
    if ((localObject2 == null) || (((Map)localObject2).size() <= 0))
    {
      w.e("MicroMsg.JsApiGetBLEDeviceServices", "not found services");
      ((Map)localObject1).put("errCode", Integer.valueOf(10004));
      paramj.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(14336869269504L, 106818);
      return;
    }
    paramJSONObject = new JSONArray();
    localObject1 = ((Map)localObject2).entrySet().iterator();
    for (;;)
    {
      Object localObject3;
      boolean bool;
      if (((Iterator)localObject1).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject1).next();
        localObject2 = (String)((Map.Entry)localObject3).getKey();
        bool = bg.b((Boolean)((Map.Entry)localObject3).getValue());
        if (bg.nm((String)localObject2)) {
          w.e("MicroMsg.JsApiGetBLEDeviceServices", "get uuid is null");
        }
      }
      else
      {
        localObject1 = new JSONObject();
      }
      try
      {
        ((JSONObject)localObject1).put("errMsg", getName() + ":ok");
        ((JSONObject)localObject1).put("services", paramJSONObject);
        ((JSONObject)localObject1).put("errCode", 0);
        w.i("MicroMsg.JsApiGetBLEDeviceServices", "retJson %s", new Object[] { ((JSONObject)localObject1).toString() });
        paramj.v(paramInt, ((JSONObject)localObject1).toString());
        GMTrace.o(14336869269504L, 106818);
        return;
        localObject3 = new JSONObject();
        try
        {
          ((JSONObject)localObject3).put("uuid", localObject2);
          ((JSONObject)localObject3).put("isPrimary", bool);
          paramJSONObject.put(localObject3);
        }
        catch (JSONException localJSONException)
        {
          w.e("MicroMsg.JsApiGetBLEDeviceServices", "JSONException %s", new Object[] { localJSONException.getMessage() });
        }
      }
      catch (JSONException paramJSONObject)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.JsApiGetBLEDeviceServices", paramJSONObject, "", new Object[0]);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
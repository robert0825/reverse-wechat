package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class e
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 183;
  private static final String NAME = "getBLEDeviceCharacteristics";
  
  public e()
  {
    GMTrace.i(14333648044032L, 106794);
    GMTrace.o(14333648044032L, 106794);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14333782261760L, 106795);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "getBLEDeviceCharacteristics data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(14333782261760L, 106795);
      return;
    }
    w.i("MicroMsg.JsApiGetBLEDeviceCharacteristics", "getBLEDeviceCharacteristics data %s", new Object[] { paramJSONObject.toString() });
    Object localObject1 = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "API version is below 18!");
      ((Map)localObject1).put("errCode", Integer.valueOf(10009));
      paramj.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(14333782261760L, 106795);
      return;
    }
    String str = paramJSONObject.optString("deviceId");
    paramJSONObject = paramJSONObject.optString("serviceId");
    w.i("MicroMsg.JsApiGetBLEDeviceCharacteristics", "try to get characteristics with deviceId : " + str + ", and serviceId : " + paramJSONObject);
    if (!a.icY)
    {
      w.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "bluetooth is not init!");
      ((Map)localObject1).put("errCode", Integer.valueOf(10000));
      paramj.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(14333782261760L, 106795);
      return;
    }
    Object localObject2 = (BluetoothManager)paramj.mContext.getSystemService("bluetooth");
    if (localObject2 == null)
    {
      w.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "bluetoothManager is null!");
      ((Map)localObject1).put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(14333782261760L, 106795);
      return;
    }
    localObject2 = ((BluetoothManager)localObject2).getAdapter();
    if ((localObject2 == null) || (!((BluetoothAdapter)localObject2).isEnabled()))
    {
      w.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "adapter is null or not enabled!");
      ((Map)localObject1).put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(14333782261760L, 106795);
      return;
    }
    paramJSONObject = (JSONArray)a.g(paramj).get(new StringBuilder("key_bluetooth_gatt_service").append(str).append(paramJSONObject).toString().hashCode(), null);
    if ((paramJSONObject == null) || (paramJSONObject.length() <= 0))
    {
      w.e("MicroMsg.JsApiGetBLEDeviceCharacteristics", "not found services");
      ((Map)localObject1).put("errCode", Integer.valueOf(10005));
      paramj.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(14333782261760L, 106795);
      return;
    }
    localObject1 = new JSONObject();
    try
    {
      ((JSONObject)localObject1).put("errMsg", getName() + ":ok");
      ((JSONObject)localObject1).put("characteristics", paramJSONObject);
      ((JSONObject)localObject1).put("errCode", 0);
      w.i("MicroMsg.JsApiGetBLEDeviceCharacteristics", "retJson %s", new Object[] { ((JSONObject)localObject1).toString() });
      paramj.v(paramInt, ((JSONObject)localObject1).toString());
      GMTrace.o(14333782261760L, 106795);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.JsApiGetBLEDeviceCharacteristics", paramJSONObject, "", new Object[0]);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
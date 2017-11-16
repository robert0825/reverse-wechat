package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
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
import org.json.JSONObject;

@TargetApi(18)
public final class l
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 185;
  private static final String NAME = "readBLECharacteristicValue";
  
  public l()
  {
    GMTrace.i(14329487294464L, 106763);
    GMTrace.o(14329487294464L, 106763);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14329621512192L, 106764);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiReadBLECharacteristicValue", "JsApiReadBLECharacteristicValue data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(14329621512192L, 106764);
      return;
    }
    w.i("MicroMsg.JsApiReadBLECharacteristicValue", "readBLECharacteristicValue data %s", new Object[] { paramJSONObject.toString() });
    HashMap localHashMap = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiReadBLECharacteristicValue", "API version is below 18!");
      localHashMap.put("errCode", Integer.valueOf(10009));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329621512192L, 106764);
      return;
    }
    if (!a.icY)
    {
      w.e("MicroMsg.JsApiReadBLECharacteristicValue", "bluetooth is not init!");
      localHashMap.put("errCode", Integer.valueOf(10000));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329621512192L, 106764);
      return;
    }
    Object localObject = (BluetoothManager)paramj.mContext.getSystemService("bluetooth");
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiReadBLECharacteristicValue", "bluetoothManager is null!");
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329621512192L, 106764);
      return;
    }
    localObject = ((BluetoothManager)localObject).getAdapter();
    if ((localObject == null) || (!((BluetoothAdapter)localObject).isEnabled()))
    {
      w.e("MicroMsg.JsApiReadBLECharacteristicValue", "adapter is null or not enabled!");
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329621512192L, 106764);
      return;
    }
    localObject = paramJSONObject.optString("deviceId");
    String str1 = paramJSONObject.optString("serviceId");
    String str2 = paramJSONObject.optString("characteristicId");
    u.b localb = a.g(paramj);
    paramJSONObject = (BluetoothGatt)localb.get("key_bluetooth_gatt" + (String)localObject, null);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiReadBLECharacteristicValue", "get bluetoothGatt failed, bluetoothGatt is null!");
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329621512192L, 106764);
      return;
    }
    localObject = (BluetoothGattCharacteristic)localb.get((String)localObject + str1 + str2, null);
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiReadBLECharacteristicValue", "get characteristics failed !");
      localHashMap.put("errCode", Integer.valueOf(10005));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329621512192L, 106764);
      return;
    }
    if (!paramJSONObject.readCharacteristic((BluetoothGattCharacteristic)localObject))
    {
      localHashMap.put("errCode", Integer.valueOf(10008));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329621512192L, 106764);
      return;
    }
    localHashMap.put("errCode", Integer.valueOf(0));
    paramj.v(paramInt, d("ok", localHashMap));
    GMTrace.o(14329621512192L, 106764);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
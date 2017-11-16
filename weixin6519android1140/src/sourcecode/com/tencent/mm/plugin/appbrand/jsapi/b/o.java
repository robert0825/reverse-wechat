package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(18)
public final class o
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 184;
  private static final String NAME = "writeBLECharacteristicValue";
  
  public o()
  {
    GMTrace.i(14335795527680L, 106810);
    GMTrace.o(14335795527680L, 106810);
  }
  
  private static byte[] N(byte[] paramArrayOfByte)
  {
    int k = 0;
    GMTrace.i(14336063963136L, 106812);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(14336063963136L, 106812);
      return null;
    }
    int j = paramArrayOfByte.length;
    int i = j;
    if (paramArrayOfByte.length < j)
    {
      w.w("MicroMsg.JsApiWriteBLECharacteristicValue", "data length is shorter then print command length");
      i = paramArrayOfByte.length;
    }
    Object localObject = new StringBuilder();
    j = 0;
    int m;
    while (j < i)
    {
      m = paramArrayOfByte[j] & 0xFF;
      if (m < 16) {
        ((StringBuilder)localObject).append("0");
      }
      ((StringBuilder)localObject).append(Integer.toHexString(m));
      j += 1;
    }
    paramArrayOfByte = ((StringBuilder)localObject).toString().toUpperCase(Locale.US);
    w.d("MicroMsg.JsApiWriteBLECharacteristicValue", "write data = %s", new Object[] { paramArrayOfByte });
    if ((paramArrayOfByte == null) || (paramArrayOfByte.equals("")))
    {
      GMTrace.o(14336063963136L, 106812);
      return new byte[0];
    }
    j = paramArrayOfByte.toUpperCase().length() / 2;
    paramArrayOfByte = paramArrayOfByte.toCharArray();
    localObject = new byte[j];
    i = k;
    while (i < j)
    {
      k = i * 2;
      m = (byte)"0123456789ABCDEF".indexOf(paramArrayOfByte[k]);
      localObject[i] = ((byte)((byte)"0123456789ABCDEF".indexOf(paramArrayOfByte[(k + 1)]) | m << 4));
      i += 1;
    }
    GMTrace.o(14336063963136L, 106812);
    return (byte[])localObject;
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14335929745408L, 106811);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiWriteBLECharacteristicValue", "JsApiWriteBLECharacteristicValue data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(14335929745408L, 106811);
      return;
    }
    w.i("MicroMsg.JsApiWriteBLECharacteristicValue", "writeBLECharacteristicValue data %s", new Object[] { paramJSONObject });
    HashMap localHashMap = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiWriteBLECharacteristicValue", "API version is below 18!");
      localHashMap.put("errCode", Integer.valueOf(10009));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14335929745408L, 106811);
      return;
    }
    if (!a.icY)
    {
      w.e("MicroMsg.JsApiWriteBLECharacteristicValue", "bluetooth is not init!");
      localHashMap.put("errCode", Integer.valueOf(10000));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14335929745408L, 106811);
      return;
    }
    Object localObject = (BluetoothManager)paramj.mContext.getSystemService("bluetooth");
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiWriteBLECharacteristicValue", "bluetoothManager is null!");
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14335929745408L, 106811);
      return;
    }
    localObject = ((BluetoothManager)localObject).getAdapter();
    if ((localObject == null) || (!((BluetoothAdapter)localObject).isEnabled()))
    {
      w.e("MicroMsg.JsApiWriteBLECharacteristicValue", "bluetoothAdapter is null or not enable!");
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14335929745408L, 106811);
      return;
    }
    localObject = paramJSONObject.optString("deviceId");
    String str1 = paramJSONObject.optString("serviceId");
    String str2 = paramJSONObject.optString("characteristicId");
    paramJSONObject = paramJSONObject.optString("value");
    u.b localb = a.g(paramj);
    BluetoothGatt localBluetoothGatt = (BluetoothGatt)localb.get("key_bluetooth_gatt" + (String)localObject, null);
    if (localBluetoothGatt == null)
    {
      w.e("MicroMsg.JsApiWriteBLECharacteristicValue", "get bluetoothGatt failed, bluetoothGatt is null!");
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14335929745408L, 106811);
      return;
    }
    localObject = (BluetoothGattCharacteristic)localb.get((String)localObject + str1 + str2, null);
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiWriteBLECharacteristicValue", "get characteristics failed !");
      localHashMap.put("errCode", Integer.valueOf(10005));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14335929745408L, 106811);
      return;
    }
    ((BluetoothGattCharacteristic)localObject).setValue(N(Base64.decode(paramJSONObject, 2)));
    a.e(paramj);
    a.iD(paramInt);
    boolean bool = localBluetoothGatt.writeCharacteristic((BluetoothGattCharacteristic)localObject);
    w.i("MicroMsg.JsApiWriteBLECharacteristicValue", "start write retWrite: " + bool);
    if (!bool)
    {
      w.e("MicroMsg.JsApiWriteBLECharacteristicValue", "start write fail..");
      localHashMap.put("errCode", Integer.valueOf(10008));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14335929745408L, 106811);
      return;
    }
    int i = ((BluetoothGattCharacteristic)localObject).getProperties();
    if (((i & 0x4) != 0) && ((i & 0x8) == 0))
    {
      localHashMap.put("errCode", Integer.valueOf(0));
      paramj.v(paramInt, d("ok", localHashMap));
    }
    GMTrace.o(14335929745408L, 106811);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(18)
public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 174;
  private static final String NAME = "closeBluetoothAdapter";
  
  public c()
  {
    GMTrace.i(14334721785856L, 106802);
    GMTrace.o(14334721785856L, 106802);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14334856003584L, 106803);
    w.i("MicroMsg.JsApiCloseBluetoothAdapter", "closeBluetoothAdapter!");
    paramJSONObject = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiCloseBluetoothAdapter", "API version is below 18!");
      paramJSONObject.put("errCode", Integer.valueOf(10009));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334856003584L, 106803);
      return;
    }
    if (!a.icY)
    {
      w.e("MicroMsg.JsApiCloseBluetoothAdapter", "bluetooth is not init!");
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334856003584L, 106803);
      return;
    }
    Object localObject = (BluetoothManager)paramj.mContext.getSystemService("bluetooth");
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiCloseBluetoothAdapter", "bluetoothManager is null!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334856003584L, 106803);
      return;
    }
    if (!paramj.mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le"))
    {
      w.e("MicroMsg.JsApiCloseBluetoothAdapter", "not support ble feature!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334856003584L, 106803);
      return;
    }
    localObject = ((BluetoothManager)localObject).getAdapter();
    if ((localObject == null) || (!((BluetoothAdapter)localObject).isEnabled()))
    {
      w.e("MicroMsg.JsApiCloseBluetoothAdapter", "bluetoothAdapter is null!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334856003584L, 106803);
      return;
    }
    if (((BluetoothAdapter)localObject).isDiscovering()) {
      ((BluetoothAdapter)localObject).cancelDiscovery();
    }
    if (k.idj != null) {
      w.i("MicroMsg.JsApiCloseBluetoothAdapter", "unregisterReceiver");
    }
    try
    {
      paramj.mContext.unregisterReceiver(k.idj);
      k.idj = null;
      a.Wt();
      a.Ww();
      a.h(paramj);
      a.icY = false;
      a.e(null);
      a.iD(0);
      w.i("MicroMsg.JsApiCloseBluetoothAdapter", "closeBluetoothAdapter end with success!");
      paramj.v(paramInt, d("ok", null));
      GMTrace.o(14334856003584L, 106803);
      return;
    }
    catch (Exception paramJSONObject)
    {
      for (;;)
      {
        w.e("MicroMsg.JsApiCloseBluetoothAdapter", "unregisterReceiver error!");
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
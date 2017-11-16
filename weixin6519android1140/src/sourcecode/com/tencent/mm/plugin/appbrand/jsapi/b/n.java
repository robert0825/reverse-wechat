package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class n
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 177;
  private static final String NAME = "stopBluetoothDevicesDiscovery";
  
  public n()
  {
    GMTrace.i(14334453350400L, 106800);
    GMTrace.o(14334453350400L, 106800);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14334587568128L, 106801);
    w.i("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "stopBluetoothDevicesDiscovery!");
    paramJSONObject = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "API version is below 18!");
      paramJSONObject.put("errCode", Integer.valueOf(10009));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334587568128L, 106801);
      return;
    }
    if (!a.icY)
    {
      w.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "bluetooth is not init!");
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334587568128L, 106801);
      return;
    }
    Object localObject = (BluetoothManager)paramj.mContext.getSystemService("bluetooth");
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "bluetoothManager is null!");
      paramJSONObject.put("isDiscovering", Boolean.valueOf(false));
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334587568128L, 106801);
      return;
    }
    localObject = ((BluetoothManager)localObject).getAdapter();
    if ((localObject == null) || (!((BluetoothAdapter)localObject).isEnabled()))
    {
      w.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "bluetoothAdapter is null or not enable!");
      paramJSONObject.put("isDiscovering", Boolean.valueOf(false));
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334587568128L, 106801);
      return;
    }
    m.a locala = (m.a)a.g(paramj).get("key_bluetooth_le_scaner", null);
    if (locala == null)
    {
      w.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "bluetoothLEScaner is null!");
      paramJSONObject.put("isDiscovering", Boolean.valueOf(false));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334587568128L, 106801);
      return;
    }
    ((BluetoothAdapter)localObject).stopLeScan(locala);
    paramJSONObject.put("isDiscovering", Boolean.valueOf(false));
    paramj.v(paramInt, d("ok", paramJSONObject));
    localObject = new a();
    paramJSONObject = new JSONObject();
    try
    {
      paramJSONObject.put("available", true);
      paramJSONObject.put("discovering", false);
      w.i("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "OnBluetoothAdapterStateChange %s", new Object[] { paramJSONObject.toString() });
      paramj = ((a)localObject).ai(paramj.hyD, paramj.hashCode());
      paramj.mData = paramJSONObject.toString();
      paramj.VR();
      GMTrace.o(14334587568128L, 106801);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        w.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "put JSON data error : %s", new Object[] { localJSONException });
      }
    }
  }
  
  private static final class a
    extends e
  {
    private static final int CTRL_INDEX = 189;
    private static final String NAME = "onBluetoothAdapterStateChange";
    
    public a()
    {
      GMTrace.i(14335527092224L, 106808);
      GMTrace.o(14335527092224L, 106808);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
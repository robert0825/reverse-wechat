package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class i
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 179;
  private static final String NAME = "getConnectedBluetoothDevices";
  
  public i()
  {
    GMTrace.i(14334990221312L, 106804);
    GMTrace.o(14334990221312L, 106804);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14335124439040L, 106805);
    w.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "getConnectedBluetoothDevices!");
    paramJSONObject = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "API version is below 18!");
      paramJSONObject.put("errCode", Integer.valueOf(10009));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14335124439040L, 106805);
      return;
    }
    if (!a.icY)
    {
      w.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bluetooth is not init!");
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14335124439040L, 106805);
      return;
    }
    Object localObject1 = (BluetoothManager)paramj.mContext.getSystemService("bluetooth");
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bluetoothManager is null!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14335124439040L, 106805);
      return;
    }
    Object localObject2 = ((BluetoothManager)localObject1).getAdapter();
    if ((localObject2 == null) || (!((BluetoothAdapter)localObject2).isEnabled()))
    {
      w.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "adapter is null or not enabled!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14335124439040L, 106805);
      return;
    }
    localObject1 = ((BluetoothManager)localObject1).getConnectedDevices(7);
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bluetoothDevices is empty!");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14335124439040L, 106805);
      return;
    }
    paramJSONObject = new JSONArray();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject3 = (BluetoothDevice)((Iterator)localObject1).next();
      localObject2 = ((BluetoothDevice)localObject3).getAddress();
      localObject3 = ((BluetoothDevice)localObject3).getName();
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("deviceId", localObject2);
        localJSONObject.put("name", localObject3);
        paramJSONObject.put(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        w.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "put JSON data error : %s", new Object[] { localJSONException });
      }
    }
    localObject1 = new JSONObject();
    try
    {
      ((JSONObject)localObject1).put("errMsg", getName() + ":ok");
      ((JSONObject)localObject1).put("devices", paramJSONObject);
      w.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "retJson %s", new Object[] { ((JSONObject)localObject1).toString() });
      paramj.v(paramInt, ((JSONObject)localObject1).toString());
      GMTrace.o(14335124439040L, 106805);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.JsApiGetConnectedBluetoothDevices", paramJSONObject, "", new Object[0]);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
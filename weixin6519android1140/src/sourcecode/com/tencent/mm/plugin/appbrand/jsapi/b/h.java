package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class h
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 178;
  private static final String NAME = "getBluetoothDevices";
  
  public h()
  {
    GMTrace.i(14333379608576L, 106792);
    GMTrace.o(14333379608576L, 106792);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14333513826304L, 106793);
    w.i("MicroMsg.JsApiGetBluetoothDevices", "getBluetoothDevices!");
    paramJSONObject = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiGetBluetoothDevices", "API version is below 18!");
      paramJSONObject.put("errCode", Integer.valueOf(10009));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14333513826304L, 106793);
      return;
    }
    if (!a.icY)
    {
      w.e("MicroMsg.JsApiGetBluetoothDevices", "bluetooth is not init!");
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14333513826304L, 106793);
      return;
    }
    Object localObject1 = (BluetoothManager)paramj.mContext.getSystemService("bluetooth");
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiGetBluetoothDevices", "bluetoothManager is null!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14333513826304L, 106793);
      return;
    }
    Object localObject2 = ((BluetoothManager)localObject1).getAdapter();
    if ((localObject2 == null) || (!((BluetoothAdapter)localObject2).isEnabled()))
    {
      w.e("MicroMsg.JsApiGetBluetoothDevices", "adapter is null or not enabled!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14333513826304L, 106793);
      return;
    }
    paramJSONObject = a.Ws();
    if ((Build.VERSION.SDK_INT >= 18) && (localObject1 != null))
    {
      localObject1 = ((BluetoothManager)localObject1).getConnectedDevices(7);
      if (localObject1 != null)
      {
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (BluetoothDevice)((Iterator)localObject1).next();
          String str = ((BluetoothDevice)localObject2).getAddress();
          if (!paramJSONObject.containsKey(str))
          {
            JSONObject localJSONObject = new JSONObject();
            JSONArray localJSONArray = new JSONArray();
            try
            {
              localJSONObject.put("deviceId", str);
              localJSONObject.put("name", ((BluetoothDevice)localObject2).getName());
              localJSONObject.put("RSSI", 0);
              localJSONObject.put("advertisData", "");
              localJSONObject.put("advertisServiceUUIDs", localJSONArray);
              paramJSONObject.put(str, localJSONObject);
            }
            catch (JSONException localJSONException2)
            {
              w.e("MicroMsg.JsApiGetBluetoothDevices", "put JSON data error : %s", new Object[] { localJSONException2 });
            }
          }
        }
      }
    }
    localObject1 = new JSONArray();
    Iterator localIterator = paramJSONObject.keySet().iterator();
    while (localIterator.hasNext()) {
      ((JSONArray)localObject1).put(paramJSONObject.get((String)localIterator.next()));
    }
    paramJSONObject = new JSONObject();
    try
    {
      paramJSONObject.put("errMsg", getName() + ":ok");
      paramJSONObject.put("devices", localObject1);
      w.i("MicroMsg.JsApiGetBluetoothDevices", "retJson %s", new Object[] { paramJSONObject });
      paramj.v(paramInt, paramJSONObject.toString());
      GMTrace.o(14333513826304L, 106793);
      return;
    }
    catch (JSONException localJSONException1)
    {
      for (;;)
      {
        w.e("MicroMsg.JsApiGetBluetoothDevices", "put json value error : %s", new Object[] { Log.getStackTraceString(localJSONException1) });
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
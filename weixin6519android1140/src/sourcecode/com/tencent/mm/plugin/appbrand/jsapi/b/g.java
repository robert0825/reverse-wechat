package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.bluetooth.BluetoothAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 175;
  private static final String NAME = "getBluetoothAdapterState";
  
  public g()
  {
    GMTrace.i(14336198180864L, 106813);
    GMTrace.o(14336198180864L, 106813);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    boolean bool2 = true;
    GMTrace.i(14336332398592L, 106814);
    w.i("MicroMsg.JsApiGetBluetoothAdapterState", "getBluetoothAdapterState!");
    paramJSONObject = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiGetBluetoothAdapterState", "API version is below 18!");
      paramJSONObject.put("errCode", Integer.valueOf(10009));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14336332398592L, 106814);
      return;
    }
    if (!a.icY)
    {
      w.e("MicroMsg.JsApiGetBluetoothAdapterState", "bluetooth is not init!");
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14336332398592L, 106814);
      return;
    }
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    if (localBluetoothAdapter == null)
    {
      paramJSONObject.put("available", Boolean.valueOf(false));
      paramJSONObject.put("discovering", Boolean.valueOf(false));
      paramj.v(paramInt, d("ok", paramJSONObject));
      GMTrace.o(14336332398592L, 106814);
      return;
    }
    boolean bool1;
    if (localBluetoothAdapter.isEnabled())
    {
      bool1 = true;
      if (!localBluetoothAdapter.isDiscovering()) {
        break label289;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.JsApiGetBluetoothAdapterState", "availableState : " + bool1 + ",discoveringState : " + bool2);
      paramJSONObject.put("available", Boolean.valueOf(bool1));
      paramJSONObject.put("discovering", Boolean.valueOf(bool2));
      paramj.v(paramInt, d("ok", paramJSONObject));
      GMTrace.o(14336332398592L, 106814);
      return;
      bool1 = false;
      break;
      label289:
      bool2 = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
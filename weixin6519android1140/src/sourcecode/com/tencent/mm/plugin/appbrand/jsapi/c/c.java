package com.tencent.mm.plugin.appbrand.jsapi.c;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 221;
  private static final String NAME = "startBeaconDiscovery";
  public static BroadcastReceiver idj;
  j hyI;
  private JSONObject idm;
  UUID[] ieC;
  
  public c()
  {
    GMTrace.i(15472888119296L, 115282);
    this.ieC = null;
    GMTrace.o(15472888119296L, 115282);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(15473022337024L, 115283);
    this.hyI = paramj;
    w.d("MicroMsg.JsApiStartBeaconDiscovery", "startBeaconDiscovery data %s", new Object[] { paramJSONObject });
    this.idm = paramJSONObject;
    HashMap localHashMap = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiStartBeaconDiscovery", "API version is below 18!");
      localHashMap.put("errCode", Integer.valueOf(11000));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(15473022337024L, 115283);
      return;
    }
    paramJSONObject = (BluetoothManager)paramj.mContext.getSystemService("bluetooth");
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiStartBeaconDiscovery", "bluetoothManager is null!");
      localHashMap.put("errCode", Integer.valueOf(11001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(15473022337024L, 115283);
      return;
    }
    BluetoothAdapter localBluetoothAdapter = paramJSONObject.getAdapter();
    if (localBluetoothAdapter == null)
    {
      w.e("MicroMsg.JsApiStartBeaconDiscovery", "bluetoothAdapter is null!");
      localHashMap.put("errCode", Integer.valueOf(11001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(15473022337024L, 115283);
      return;
    }
    paramJSONObject = a.i(paramj);
    Object localObject1 = u.Av().gw(paramJSONObject);
    if ((localBluetoothAdapter.isDiscovering()) || (localObject1 != null))
    {
      w.e("MicroMsg.JsApiStartBeaconDiscovery", "bluetoothAdapter is Discovering!");
      localHashMap.put("errCode", Integer.valueOf(11003));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(15473022337024L, 115283);
      return;
    }
    Object localObject2 = u.Av().p(paramJSONObject, true);
    localObject1 = (a)((u.b)localObject2).get("key_bluetooth_le_scaner", null);
    paramJSONObject = (JSONObject)localObject1;
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiStartBeaconDiscovery", "bluetoothLEScaner is null!");
      paramJSONObject = new a(paramj);
      ((u.b)localObject2).o("key_bluetooth_le_scaner", paramJSONObject);
    }
    if (!localBluetoothAdapter.isEnabled())
    {
      localHashMap.put("errCode", Integer.valueOf(11001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(15473022337024L, 115283);
      return;
    }
    if (this.idm.has("uuids"))
    {
      localObject1 = new ArrayList();
      try
      {
        localObject2 = new JSONArray(this.idm.optString("uuids"));
        this.ieC = new UUID[((JSONArray)localObject2).length()];
        int i = 0;
        while (i < ((JSONArray)localObject2).length())
        {
          String str = ((JSONArray)localObject2).getString(i);
          ((List)localObject1).add(str);
          w.d("MicroMsg.JsApiStartBeaconDiscovery", "uuid %s", new Object[] { str });
          this.ieC[i] = UUID.fromString(str);
          i += 1;
        }
        if (this.ieC == null) {
          break label569;
        }
      }
      catch (JSONException paramJSONObject)
      {
        w.e("MicroMsg.JsApiStartBeaconDiscovery", "get uuid error!");
        localHashMap.put("errCode", Integer.valueOf(11001));
        paramj.v(paramInt, d("fail", localHashMap));
        GMTrace.o(15473022337024L, 115283);
        return;
      }
    }
    if (this.ieC.length <= 0)
    {
      label569:
      localHashMap.put("errCode", Integer.valueOf(11001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(15473022337024L, 115283);
      return;
    }
    a.WJ();
    localBluetoothAdapter.startLeScan(paramJSONObject);
    localHashMap.put("errCode", Integer.valueOf(0));
    paramj.v(paramInt, d("ok", localHashMap));
    localObject1 = new b();
    paramJSONObject = new JSONObject();
    try
    {
      paramJSONObject.put("available", true);
      paramJSONObject.put("discovering", true);
      w.d("MicroMsg.JsApiStartBeaconDiscovery", "onBeaconServiceChanged %s", new Object[] { paramJSONObject.toString() });
      localObject1 = ((b)localObject1).ai(paramj.hyD, paramj.hashCode());
      ((e)localObject1).mData = paramJSONObject.toString();
      ((e)localObject1).VR();
      if (idj == null) {
        idj = new BroadcastReceiver()
        {
          public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
          {
            GMTrace.i(17395959726080L, 129610);
            if (paramAnonymousIntent == null)
            {
              w.i("MicroMsg.JsApiStartBeaconDiscovery", "Receive intent failed");
              GMTrace.o(17395959726080L, 129610);
              return;
            }
            paramAnonymousContext = BluetoothAdapter.getDefaultAdapter();
            int j;
            boolean bool;
            int i;
            if (paramAnonymousContext != null)
            {
              j = paramAnonymousContext.getState();
              if ((j == 12) || (j == 11))
              {
                bool = true;
                i = 1;
                w.i("MicroMsg.JsApiStartBeaconDiscovery", "bluetoothAdapter state: %s", new Object[] { Integer.valueOf(j) });
              }
            }
            for (;;)
            {
              if (i != 0)
              {
                paramAnonymousIntent = new c.b();
                paramAnonymousContext = new JSONObject();
              }
              try
              {
                paramAnonymousContext.put("available", bool);
                paramAnonymousContext.put("discovering", false);
                w.i("MicroMsg.JsApiStartBeaconDiscovery", "OnBeaconServiceChangedEvent %s", new Object[] { paramAnonymousContext.toString() });
                if (c.this.hyI != null)
                {
                  paramAnonymousIntent = paramAnonymousIntent.ai(c.this.hyI.hyD, c.this.hyI.hashCode());
                  paramAnonymousIntent.mData = paramAnonymousContext.toString();
                  paramAnonymousIntent.VR();
                }
                if ((c.this.hyI != null) && (c.idj != null))
                {
                  c.this.hyI.mContext.unregisterReceiver(c.idj);
                  c.idj = null;
                }
                GMTrace.o(17395959726080L, 129610);
                return;
                if ((j == 10) || (j == 13))
                {
                  bool = false;
                  i = 1;
                }
              }
              catch (JSONException localJSONException)
              {
                for (;;)
                {
                  w.e("MicroMsg.JsApiStartBeaconDiscovery", "put JSON data error : %s", new Object[] { localJSONException });
                }
                bool = false;
                i = 0;
              }
              break;
              bool = false;
              i = 0;
            }
          }
        };
      }
      paramJSONObject = new IntentFilter();
      paramJSONObject.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
      paramj.mContext.registerReceiver(idj, paramJSONObject);
      paramJSONObject = new com.tencent.mm.plugin.appbrand.c.b()
      {
        public final void onDestroy()
        {
          GMTrace.i(17396228161536L, 129612);
          w.i("MicroMsg.JsApiStartBeaconDiscovery", "onDestroy");
          com.tencent.mm.plugin.appbrand.c.b(paramj.hyD, this);
          if ((c.this.hyI != null) && (c.idj != null)) {
            c.this.hyI.mContext.unregisterReceiver(c.idj);
          }
          GMTrace.o(17396228161536L, 129612);
        }
      };
      com.tencent.mm.plugin.appbrand.c.a(paramj.hyD, paramJSONObject);
      GMTrace.o(15473022337024L, 115283);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        w.e("MicroMsg.JsApiStartBeaconDiscovery", "put JSON data error : %s", new Object[] { localJSONException });
      }
    }
  }
  
  public final class a
    implements BluetoothAdapter.LeScanCallback
  {
    private j idn;
    
    public a(j paramj)
    {
      GMTrace.i(15471814377472L, 115274);
      this.idn = paramj;
      GMTrace.o(15471814377472L, 115274);
    }
    
    public final void onLeScan(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
    {
      GMTrace.i(15471948595200L, 115275);
      if (bg.bq(paramArrayOfByte))
      {
        w.e("MicroMsg.JsApiStartBeaconDiscovery", "valueByte is null or nil");
        GMTrace.o(15471948595200L, 115275);
        return;
      }
      int k = 0;
      int i = 2;
      for (;;)
      {
        j = k;
        if (i <= 5)
        {
          if (((paramArrayOfByte[(i + 2)] & 0xFF) == 2) && ((paramArrayOfByte[(i + 3)] & 0xFF) == 21)) {
            j = 1;
          }
        }
        else
        {
          if (j == 0) {
            break label710;
          }
          localObject1 = new byte[16];
          System.arraycopy(paramArrayOfByte, i + 4, localObject1, 0, 16);
          localObject2 = new StringBuilder();
          j = 0;
          while (j < 16)
          {
            k = localObject1[j] & 0xFF;
            if (k < 16) {
              ((StringBuilder)localObject2).append("0");
            }
            ((StringBuilder)localObject2).append(Integer.toHexString(k));
            j += 1;
          }
        }
        i += 1;
      }
      Object localObject1 = ((StringBuilder)localObject2).toString().toUpperCase(Locale.US);
      localObject1 = UUID.fromString(((String)localObject1).substring(0, 8) + "-" + ((String)localObject1).substring(8, 12) + "-" + ((String)localObject1).substring(12, 16) + "-" + ((String)localObject1).substring(16, 20) + "-" + ((String)localObject1).substring(20, 32));
      int m = 0;
      Object localObject2 = c.this.ieC;
      int n = localObject2.length;
      int j = 0;
      for (;;)
      {
        k = m;
        double d;
        label397:
        JSONObject localJSONObject;
        if (j < n)
        {
          if (localObject2[j].equals(localObject1)) {
            k = 1;
          }
        }
        else
        {
          if (k == 0) {
            break label710;
          }
          j = paramArrayOfByte[(i + 20)];
          k = paramArrayOfByte[(i + 21)];
          m = paramArrayOfByte[(i + 22)];
          n = paramArrayOfByte[(i + 23)];
          i = paramArrayOfByte[(i + 24)];
          d = paramInt;
          if (d != 0.0D) {
            break label589;
          }
          d = -1.0D;
          localObject2 = paramBluetoothDevice.getAddress();
          paramArrayOfByte = a.WI();
          paramBluetoothDevice = new c.c();
          localJSONObject = new JSONObject();
        }
        try
        {
          localJSONObject.put("uuid", localObject1);
          localJSONObject.put("major", (j & 0xFF) * 256 + (k & 0xFF));
          localJSONObject.put("minor", (m & 0xFF) * 256 + (n & 0xFF));
          localJSONObject.put("proximity", 0);
          localJSONObject.put("accuracy", d);
          localJSONObject.put("rssi", paramInt);
          paramArrayOfByte.put(localObject2, localJSONObject);
          localObject1 = new JSONArray();
          paramArrayOfByte = paramArrayOfByte.values().iterator();
          for (;;)
          {
            if (paramArrayOfByte.hasNext())
            {
              localObject2 = (JSONObject)paramArrayOfByte.next();
              if (localObject2 != null)
              {
                ((JSONArray)localObject1).put(localObject2);
                continue;
                j += 1;
                break;
                label589:
                d = d * 1.0D / i;
                if (d < 1.0D)
                {
                  d = Math.pow(d, 10.0D);
                  break label397;
                }
                d = Math.pow(d, 9.9476D) * 0.92093D + 0.54992D;
              }
            }
          }
        }
        catch (JSONException localJSONException1)
        {
          for (;;)
          {
            w.e("MicroMsg.JsApiStartBeaconDiscovery", "put JSON data error : %s", new Object[] { localJSONException1 });
          }
          paramArrayOfByte = new JSONObject();
        }
      }
      try
      {
        paramArrayOfByte.put("beacons", localJSONException1);
        paramBluetoothDevice = paramBluetoothDevice.ai(this.idn.hyD, this.idn.hashCode());
        paramBluetoothDevice.mData = paramArrayOfByte.toString();
        paramBluetoothDevice.VR();
        label710:
        GMTrace.o(15471948595200L, 115275);
        return;
      }
      catch (JSONException localJSONException2)
      {
        for (;;)
        {
          w.e("MicroMsg.JsApiStartBeaconDiscovery", "put res JSON data error : %s", new Object[] { localJSONException2 });
        }
      }
    }
  }
  
  private static final class b
    extends e
  {
    private static final int CTRL_INDEX = 225;
    private static final String NAME = "onBeaconServiceChanged";
    
    public b()
    {
      GMTrace.i(15472619683840L, 115280);
      GMTrace.o(15472619683840L, 115280);
    }
  }
  
  private static final class c
    extends e
  {
    private static final int CTRL_INDEX = 224;
    private static final String NAME = "onBeaconUpdated";
    
    public c()
    {
      GMTrace.i(15471143288832L, 115269);
      GMTrace.o(15471143288832L, 115269);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.ParcelUuid;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class m
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 176;
  private static final String NAME = "startBluetoothDevicesDiscovery";
  public boolean idl;
  public JSONObject idm;
  
  public m()
  {
    GMTrace.i(14330561036288L, 106771);
    GMTrace.o(14330561036288L, 106771);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14330695254016L, 106772);
    if (paramJSONObject != null) {
      w.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "startBluetoothDevicesDiscovery data %s", new Object[] { paramJSONObject.toString() });
    }
    this.idm = paramJSONObject;
    HashMap localHashMap = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "API version is below 18!");
      localHashMap.put("errCode", Integer.valueOf(10009));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14330695254016L, 106772);
      return;
    }
    if (!a.icY)
    {
      w.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "bluetooth is not init!");
      localHashMap.put("errCode", Integer.valueOf(10000));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14330695254016L, 106772);
      return;
    }
    paramJSONObject = (BluetoothManager)paramj.mContext.getSystemService("bluetooth");
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "bluetoothManager is null!");
      localHashMap.put("isDiscovering", Boolean.valueOf(false));
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14330695254016L, 106772);
      return;
    }
    BluetoothAdapter localBluetoothAdapter = paramJSONObject.getAdapter();
    if ((localBluetoothAdapter == null) || (!localBluetoothAdapter.isEnabled()))
    {
      w.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "bluetoothAdapter is null!");
      localHashMap.put("isDiscovering", Boolean.valueOf(false));
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14330695254016L, 106772);
      return;
    }
    if ((!Build.VERSION.RELEASE.equals("6.0")) && (!Build.VERSION.RELEASE.equals("6.0.0")) && (Build.VERSION.SDK_INT >= 23))
    {
      paramJSONObject = (LocationManager)ab.getContext().getSystemService("location");
      if (paramJSONObject != null)
      {
        bool1 = paramJSONObject.isProviderEnabled("gps");
        boolean bool2 = paramJSONObject.isProviderEnabled("network");
        w.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "isGPSEnable " + bool1 + ", isNetworkEnable" + bool2);
      }
    }
    Object localObject2 = a.g(paramj);
    Object localObject1 = (a)((u.b)localObject2).get("key_bluetooth_le_scaner", null);
    paramJSONObject = (JSONObject)localObject1;
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "bluetoothLEScaner is null!");
      paramJSONObject = new a(paramj);
      ((u.b)localObject2).o("key_bluetooth_le_scaner", paramJSONObject);
    }
    if (!localBluetoothAdapter.isEnabled())
    {
      localHashMap.put("isDiscovering", Boolean.valueOf(false));
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14330695254016L, 106772);
      return;
    }
    localObject1 = null;
    if (this.idm.has("services"))
    {
      ArrayList localArrayList = new ArrayList();
      try
      {
        JSONArray localJSONArray = new JSONArray(this.idm.optString("services"));
        localObject2 = new UUID[localJSONArray.length()];
        int i = 0;
        for (;;)
        {
          localObject1 = localObject2;
          if (i >= localJSONArray.length()) {
            break;
          }
          localObject1 = localJSONArray.getString(i).toUpperCase();
          localArrayList.add(localObject1);
          w.d("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "servicesUuid %s", new Object[] { localObject1 });
          localObject2[i] = UUID.fromString((String)localObject1);
          i += 1;
        }
        if (localObject1 == null) {
          break label783;
        }
      }
      catch (JSONException paramJSONObject)
      {
        w.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "get uuid error!");
        localHashMap.put("isDiscovering", Boolean.valueOf(false));
        localHashMap.put("errCode", Integer.valueOf(10004));
        paramj.v(paramInt, d("fail", localHashMap));
        GMTrace.o(14330695254016L, 106772);
        return;
      }
    }
    if (localObject1.length > 0) {}
    label783:
    for (boolean bool1 = localBluetoothAdapter.startLeScan((UUID[])localObject1, paramJSONObject); !bool1; bool1 = localBluetoothAdapter.startLeScan(paramJSONObject))
    {
      w.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "startLeScan fail...");
      localHashMap.put("isDiscovering", Boolean.valueOf(false));
      localHashMap.put("errCode", Integer.valueOf(10008));
      paramj.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14330695254016L, 106772);
      return;
    }
    localHashMap.put("isDiscovering", Boolean.valueOf(true));
    localHashMap.put("errCode", Integer.valueOf(0));
    paramj.v(paramInt, d("ok", localHashMap));
    localObject1 = new b();
    paramJSONObject = new JSONObject();
    try
    {
      paramJSONObject.put("available", true);
      paramJSONObject.put("discovering", true);
      w.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "OnBluetoothAdapterStateChange %s", new Object[] { paramJSONObject.toString() });
      paramj = ((b)localObject1).ai(paramj.hyD, paramj.hashCode());
      paramj.mData = paramJSONObject.toString();
      paramj.VR();
      GMTrace.o(14330695254016L, 106772);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        w.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "put JSON data error : %s", new Object[] { localJSONException });
      }
    }
  }
  
  public final class a
    implements BluetoothAdapter.LeScanCallback
  {
    private Map<String, JSONObject> idb;
    public j idn;
    private aj ido;
    public final ParcelUuid idp;
    
    public a(j paramj)
    {
      GMTrace.i(14329755729920L, 106765);
      this.ido = null;
      this.idp = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
      this.idn = paramj;
      this.idb = a.Ws();
      this.ido = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(14336600834048L, 106816);
          Object localObject1 = new m.c();
          Object localObject2 = a.Ws();
          JSONArray localJSONArray = new JSONArray();
          Iterator localIterator = ((Map)localObject2).keySet().iterator();
          while (localIterator.hasNext()) {
            localJSONArray.put(((Map)localObject2).get((String)localIterator.next()));
          }
          localObject2 = new JSONObject();
          try
          {
            ((JSONObject)localObject2).put("devices", localJSONArray);
            if ((localJSONArray.length() > 0) && (a.icY))
            {
              localObject1 = ((m.c)localObject1).ai(m.a.this.idn.hyD, m.a.this.idn.hashCode());
              ((e)localObject1).mData = ((JSONObject)localObject2).toString();
              ((e)localObject1).VR();
              a.Wx();
              w.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", " run OnBluetoothDeviceFoundEvent in onTimerExpired!");
            }
            GMTrace.o(14336600834048L, 106816);
            return true;
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.JsApiStartBluetoothDevicesDiscovery", localJSONException, "", new Object[0]);
            }
          }
        }
      }, false);
      GMTrace.o(14329755729920L, 106765);
    }
    
    private static String M(byte[] paramArrayOfByte)
    {
      GMTrace.i(18211735076864L, 135688);
      if (paramArrayOfByte == null)
      {
        GMTrace.o(18211735076864L, 135688);
        return "";
      }
      String str = "";
      int i = 0;
      if (i < paramArrayOfByte.length)
      {
        int j = i + 1;
        i = paramArrayOfByte[i] & 0xFF;
        if (i != 0)
        {
          i -= 1;
          int k = j + 1;
          switch (paramArrayOfByte[j] & 0xFF)
          {
          }
          for (;;)
          {
            i += k;
            break;
            str = new String(c(paramArrayOfByte, k, i));
          }
        }
      }
      GMTrace.o(18211735076864L, 135688);
      return str;
    }
    
    private int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, List<ParcelUuid> paramList)
    {
      GMTrace.i(14330292600832L, 106769);
      while (paramInt2 > 0)
      {
        Object localObject = c(paramArrayOfByte, paramInt1, paramInt3);
        int i = localObject.length;
        if ((i != 2) && (i != 4) && (i != 16)) {
          throw new IllegalArgumentException("uuidBytes length invalid - " + i);
        }
        if (i == 16)
        {
          localObject = ByteBuffer.wrap((byte[])localObject).order(ByteOrder.LITTLE_ENDIAN);
          localObject = new ParcelUuid(new UUID(((ByteBuffer)localObject).getLong(8), ((ByteBuffer)localObject).getLong(0)));
          paramList.add(localObject);
          paramInt2 -= paramInt3;
          paramInt1 += paramInt3;
        }
        else
        {
          if (i == 2) {
            l1 = localObject[0] & 0xFF;
          }
          long l2;
          long l3;
          for (long l1 = ((localObject[1] & 0xFF) << 8) + l1;; l1 = ((localObject[3] & 0xFF) << 24) + (l1 + l2 + l3))
          {
            localObject = new ParcelUuid(new UUID(this.idp.getUuid().getMostSignificantBits() + (l1 << 32), this.idp.getUuid().getLeastSignificantBits()));
            break;
            l1 = localObject[0] & 0xFF;
            l2 = (localObject[1] & 0xFF) << 8;
            l3 = (localObject[2] & 0xFF) << 16;
          }
        }
      }
      GMTrace.o(14330292600832L, 106769);
      return paramInt1;
    }
    
    /* Error */
    private void a(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: ldc2_w 161
      //   5: ldc -93
      //   7: invokestatic 38	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   10: aload_1
      //   11: ifnonnull +21 -> 32
      //   14: ldc -91
      //   16: ldc -89
      //   18: invokestatic 173	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   21: ldc2_w 161
      //   24: ldc -93
      //   26: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   29: aload_0
      //   30: monitorexit
      //   31: return
      //   32: aload_1
      //   33: invokevirtual 178	android/bluetooth/BluetoothDevice:getName	()Ljava/lang/String;
      //   36: invokestatic 184	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
      //   39: astore 6
      //   41: aload_1
      //   42: invokevirtual 187	android/bluetooth/BluetoothDevice:getAddress	()Ljava/lang/String;
      //   45: astore 7
      //   47: ldc -91
      //   49: new 96	java/lang/StringBuilder
      //   52: dup
      //   53: ldc -67
      //   55: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   58: aload 7
      //   60: invokevirtual 192	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   63: ldc -62
      //   65: invokevirtual 192	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   68: aload 6
      //   70: invokevirtual 192	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   73: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   76: invokestatic 196	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   79: aload 7
      //   81: invokestatic 200	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   84: ifeq +19 -> 103
      //   87: ldc2_w 161
      //   90: ldc -93
      //   92: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   95: goto -66 -> 29
      //   98: astore_1
      //   99: aload_0
      //   100: monitorexit
      //   101: aload_1
      //   102: athrow
      //   103: aload_0
      //   104: getfield 26	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:idq	Lcom/tencent/mm/plugin/appbrand/jsapi/b/m;
      //   107: aload_0
      //   108: getfield 26	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:idq	Lcom/tencent/mm/plugin/appbrand/jsapi/b/m;
      //   111: getfield 204	com/tencent/mm/plugin/appbrand/jsapi/b/m:idm	Lorg/json/JSONObject;
      //   114: ldc -50
      //   116: invokevirtual 211	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
      //   119: putfield 215	com/tencent/mm/plugin/appbrand/jsapi/b/m:idl	Z
      //   122: new 217	java/util/ArrayList
      //   125: dup
      //   126: invokespecial 218	java/util/ArrayList:<init>	()V
      //   129: astore 9
      //   131: aload_3
      //   132: invokestatic 220	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:M	([B)Ljava/lang/String;
      //   135: astore 8
      //   137: aload_0
      //   138: aload_3
      //   139: aload 9
      //   141: invokespecial 223	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:a	([BLjava/util/List;)[B
      //   144: astore_1
      //   145: aload_1
      //   146: ifnull +457 -> 603
      //   149: new 81	java/lang/String
      //   152: dup
      //   153: aload_1
      //   154: iconst_2
      //   155: invokestatic 229	android/util/Base64:encode	([BI)[B
      //   158: invokespecial 88	java/lang/String:<init>	([B)V
      //   161: astore_1
      //   162: new 231	org/json/JSONArray
      //   165: dup
      //   166: invokespecial 232	org/json/JSONArray:<init>	()V
      //   169: astore 10
      //   171: aload 9
      //   173: invokeinterface 236 1 0
      //   178: astore_3
      //   179: aload_3
      //   180: invokeinterface 242 1 0
      //   185: ifeq +30 -> 215
      //   188: aload 10
      //   190: aload_3
      //   191: invokeinterface 246 1 0
      //   196: checkcast 44	android/os/ParcelUuid
      //   199: invokevirtual 148	android/os/ParcelUuid:getUuid	()Ljava/util/UUID;
      //   202: invokevirtual 247	java/util/UUID:toString	()Ljava/lang/String;
      //   205: invokevirtual 250	java/lang/String:toUpperCase	()Ljava/lang/String;
      //   208: invokevirtual 254	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
      //   211: pop
      //   212: goto -33 -> 179
      //   215: new 256	com/tencent/mm/plugin/appbrand/jsapi/b/m$c
      //   218: dup
      //   219: invokespecial 257	com/tencent/mm/plugin/appbrand/jsapi/b/m$c:<init>	()V
      //   222: astore_3
      //   223: new 208	org/json/JSONObject
      //   226: dup
      //   227: invokespecial 258	org/json/JSONObject:<init>	()V
      //   230: astore 9
      //   232: aload 9
      //   234: ldc_w 260
      //   237: aload 7
      //   239: invokevirtual 263	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      //   242: pop
      //   243: aload 9
      //   245: ldc_w 265
      //   248: aload 6
      //   250: invokevirtual 263	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      //   253: pop
      //   254: aload 9
      //   256: ldc_w 267
      //   259: iload_2
      //   260: invokevirtual 270	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
      //   263: pop
      //   264: aload 9
      //   266: ldc_w 272
      //   269: aload_1
      //   270: invokevirtual 263	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      //   273: pop
      //   274: aload 9
      //   276: ldc_w 274
      //   279: aload 10
      //   281: invokevirtual 263	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      //   284: pop
      //   285: aload 9
      //   287: ldc_w 276
      //   290: aload 8
      //   292: invokevirtual 263	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      //   295: pop
      //   296: aload_0
      //   297: monitorenter
      //   298: aload_0
      //   299: getfield 26	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:idq	Lcom/tencent/mm/plugin/appbrand/jsapi/b/m;
      //   302: getfield 215	com/tencent/mm/plugin/appbrand/jsapi/b/m:idl	Z
      //   305: ifne +87 -> 392
      //   308: aload_0
      //   309: getfield 60	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:idb	Ljava/util/Map;
      //   312: aload 7
      //   314: invokeinterface 281 2 0
      //   319: ifeq +73 -> 392
      //   322: aload_0
      //   323: getfield 60	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:idb	Ljava/util/Map;
      //   326: aload 7
      //   328: aload 9
      //   330: invokeinterface 284 3 0
      //   335: pop
      //   336: ldc -91
      //   338: new 96	java/lang/StringBuilder
      //   341: dup
      //   342: ldc_w 286
      //   345: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   348: aload 7
      //   350: invokevirtual 192	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   353: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   356: invokestatic 196	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   359: aload_0
      //   360: monitorexit
      //   361: ldc2_w 161
      //   364: ldc -93
      //   366: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   369: goto -340 -> 29
      //   372: astore_1
      //   373: ldc -91
      //   375: ldc_w 288
      //   378: iconst_1
      //   379: anewarray 4	java/lang/Object
      //   382: dup
      //   383: iconst_0
      //   384: aload_1
      //   385: aastore
      //   386: invokestatic 291	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   389: goto -93 -> 296
      //   392: aload_0
      //   393: getfield 60	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:idb	Ljava/util/Map;
      //   396: aload 7
      //   398: aload 9
      //   400: invokeinterface 284 3 0
      //   405: pop
      //   406: aload_0
      //   407: getfield 26	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:idq	Lcom/tencent/mm/plugin/appbrand/jsapi/b/m;
      //   410: getfield 204	com/tencent/mm/plugin/appbrand/jsapi/b/m:idm	Lorg/json/JSONObject;
      //   413: ldc_w 293
      //   416: invokevirtual 297	org/json/JSONObject:optInt	(Ljava/lang/String;)I
      //   419: istore_2
      //   420: new 231	org/json/JSONArray
      //   423: dup
      //   424: invokespecial 232	org/json/JSONArray:<init>	()V
      //   427: astore 6
      //   429: aload 6
      //   431: aload 9
      //   433: invokevirtual 254	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
      //   436: pop
      //   437: new 208	org/json/JSONObject
      //   440: dup
      //   441: invokespecial 258	org/json/JSONObject:<init>	()V
      //   444: astore_1
      //   445: aload_1
      //   446: ldc_w 299
      //   449: aload 6
      //   451: invokevirtual 263	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      //   454: pop
      //   455: iload_2
      //   456: ifle +85 -> 541
      //   459: aload_0
      //   460: getfield 40	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:ido	Lcom/tencent/mm/sdk/platformtools/aj;
      //   463: invokevirtual 302	com/tencent/mm/sdk/platformtools/aj:bQn	()Z
      //   466: ifeq +39 -> 505
      //   469: aload_0
      //   470: getfield 40	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:ido	Lcom/tencent/mm/sdk/platformtools/aj;
      //   473: astore_1
      //   474: iload_2
      //   475: i2l
      //   476: lstore 4
      //   478: aload_1
      //   479: lload 4
      //   481: lload 4
      //   483: invokevirtual 305	com/tencent/mm/sdk/platformtools/aj:z	(JJ)V
      //   486: ldc -91
      //   488: ldc_w 307
      //   491: iconst_1
      //   492: anewarray 4	java/lang/Object
      //   495: dup
      //   496: iconst_0
      //   497: iload_2
      //   498: invokestatic 313	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   501: aastore
      //   502: invokestatic 315	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   505: aload_0
      //   506: monitorexit
      //   507: ldc2_w 161
      //   510: ldc -93
      //   512: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   515: goto -486 -> 29
      //   518: astore 6
      //   520: ldc -91
      //   522: aload 6
      //   524: ldc 79
      //   526: iconst_0
      //   527: anewarray 4	java/lang/Object
      //   530: invokestatic 319	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   533: goto -78 -> 455
      //   536: astore_1
      //   537: aload_0
      //   538: monitorexit
      //   539: aload_1
      //   540: athrow
      //   541: getstatic 322	com/tencent/mm/plugin/appbrand/jsapi/b/a:icY	Z
      //   544: ifne +24 -> 568
      //   547: ldc -91
      //   549: ldc_w 324
      //   552: invokestatic 173	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   555: aload_0
      //   556: monitorexit
      //   557: ldc2_w 161
      //   560: ldc -93
      //   562: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   565: goto -536 -> 29
      //   568: aload_3
      //   569: aload_0
      //   570: getfield 52	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:idn	Lcom/tencent/mm/plugin/appbrand/j;
      //   573: getfield 330	com/tencent/mm/plugin/appbrand/j:hyD	Ljava/lang/String;
      //   576: aload_0
      //   577: getfield 52	com/tencent/mm/plugin/appbrand/jsapi/b/m$a:idn	Lcom/tencent/mm/plugin/appbrand/j;
      //   580: invokevirtual 334	java/lang/Object:hashCode	()I
      //   583: invokevirtual 338	com/tencent/mm/plugin/appbrand/jsapi/b/m$c:ai	(Ljava/lang/String;I)Lcom/tencent/mm/plugin/appbrand/jsapi/e;
      //   586: astore_3
      //   587: aload_3
      //   588: aload_1
      //   589: invokevirtual 339	org/json/JSONObject:toString	()Ljava/lang/String;
      //   592: putfield 344	com/tencent/mm/plugin/appbrand/jsapi/e:mData	Ljava/lang/String;
      //   595: aload_3
      //   596: invokevirtual 347	com/tencent/mm/plugin/appbrand/jsapi/e:VR	()Z
      //   599: pop
      //   600: goto -95 -> 505
      //   603: aconst_null
      //   604: astore_1
      //   605: goto -443 -> 162
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	608	0	this	a
      //   0	608	1	paramBluetoothDevice	BluetoothDevice
      //   0	608	2	paramInt	int
      //   0	608	3	paramArrayOfByte	byte[]
      //   476	6	4	l	long
      //   39	411	6	localObject1	Object
      //   518	5	6	localJSONException	JSONException
      //   45	352	7	str1	String
      //   135	156	8	str2	String
      //   129	303	9	localObject2	Object
      //   169	111	10	localJSONArray	JSONArray
      // Exception table:
      //   from	to	target	type
      //   2	10	98	finally
      //   14	29	98	finally
      //   32	95	98	finally
      //   103	145	98	finally
      //   149	162	98	finally
      //   162	179	98	finally
      //   179	212	98	finally
      //   215	232	98	finally
      //   232	296	98	finally
      //   296	298	98	finally
      //   361	369	98	finally
      //   373	389	98	finally
      //   507	515	98	finally
      //   539	541	98	finally
      //   557	565	98	finally
      //   232	296	372	org/json/JSONException
      //   445	455	518	org/json/JSONException
      //   298	361	536	finally
      //   392	445	536	finally
      //   445	455	536	finally
      //   459	474	536	finally
      //   478	505	536	finally
      //   505	507	536	finally
      //   520	533	536	finally
      //   537	539	536	finally
      //   541	557	536	finally
      //   568	600	536	finally
    }
    
    private byte[] a(byte[] paramArrayOfByte, List<ParcelUuid> paramList)
    {
      byte[] arrayOfByte = null;
      GMTrace.i(14330024165376L, 106767);
      if (paramArrayOfByte == null)
      {
        GMTrace.o(14330024165376L, 106767);
        return null;
      }
      int i = 0;
      if (i < paramArrayOfByte.length)
      {
        int j = i + 1;
        i = paramArrayOfByte[i] & 0xFF;
        if (i != 0)
        {
          i -= 1;
          int k = j + 1;
          switch (paramArrayOfByte[j] & 0xFF)
          {
          }
          for (;;)
          {
            i = k + i;
            break;
            a(paramArrayOfByte, k, i, 2, paramList);
            continue;
            a(paramArrayOfByte, k, i, 4, paramList);
            continue;
            a(paramArrayOfByte, k, i, 16, paramList);
            continue;
            continue;
            arrayOfByte = c(paramArrayOfByte, k, i);
          }
        }
      }
      GMTrace.o(14330024165376L, 106767);
      return arrayOfByte;
    }
    
    private static byte[] c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      GMTrace.i(14330158383104L, 106768);
      byte[] arrayOfByte = new byte[paramInt2];
      System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
      GMTrace.o(14330158383104L, 106768);
      return arrayOfByte;
    }
    
    public final void onLeScan(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
    {
      GMTrace.i(14329889947648L, 106766);
      a(paramBluetoothDevice, paramInt, paramArrayOfByte);
      GMTrace.o(14329889947648L, 106766);
    }
  }
  
  private static final class b
    extends e
  {
    private static final int CTRL_INDEX = 189;
    private static final String NAME = "onBluetoothAdapterStateChange";
    
    public b()
    {
      GMTrace.i(14333916479488L, 106796);
      GMTrace.o(14333916479488L, 106796);
    }
  }
  
  private static final class c
    extends e
  {
    private static final int CTRL_INDEX = 190;
    private static final String NAME = "onBluetoothDeviceFound";
    
    public c()
    {
      GMTrace.i(14331097907200L, 106775);
      GMTrace.o(14331097907200L, 106775);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
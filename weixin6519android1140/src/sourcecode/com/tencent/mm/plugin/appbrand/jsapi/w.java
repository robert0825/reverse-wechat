package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.g.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class w
  extends a
{
  public static final int CTRL_INDEX = 92;
  public static final String NAME = "enableAccelerometer";
  private Handler mHandler;
  
  public w()
  {
    GMTrace.i(10352213360640L, 77130);
    this.mHandler = new Handler(com.tencent.mm.plugin.appbrand.o.d.xB().ngv.getLooper());
    GMTrace.o(10352213360640L, 77130);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10352347578368L, 77131);
    super.a(paramj, paramJSONObject, paramInt);
    boolean bool;
    final SensorManager localSensorManager;
    try
    {
      bool = paramJSONObject.getBoolean("enable");
      localSensorManager = (SensorManager)paramj.mContext.getSystemService("sensor");
      if (localSensorManager == null)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.JsApiEnableAccelerometer", "getSystemService(SENSOR_SERVICE) failed.");
        paramj.v(paramInt, d("fail", null));
        GMTrace.o(10352347578368L, 77131);
        return;
      }
    }
    catch (JSONException paramJSONObject)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.JsApiEnableAccelerometer", "json data do not contains parameter enable.");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10352347578368L, 77131);
      return;
    }
    Object localObject = localSensorManager.getDefaultSensor(1);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.JsApiEnableAccelerometer", "get Accelerometer sensor failed.");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10352347578368L, 77131);
      return;
    }
    String str = "JsApi#SensorAccelerometer" + paramj.hashCode();
    if (bool)
    {
      paramJSONObject = u.Av().gw(str);
      if (paramJSONObject != null) {
        break label503;
      }
      paramJSONObject = u.Av().p(str, true);
    }
    label503:
    for (;;)
    {
      if ((b)paramJSONObject.get("sensor_event_listener", null) != null)
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.JsApiEnableAccelerometer", "register failed, sensorEventListener has already registered.");
        paramj.v(paramInt, d("fail, has enable, should stop pre operation", null));
        GMTrace.o(10352347578368L, 77131);
        return;
      }
      b local1 = new b(paramj)
      {
        public final void onDestroy()
        {
          GMTrace.i(10320672194560L, 76895);
          c.b(paramj.hyD, this);
          localSensorManager.unregisterListener(this);
          GMTrace.o(10320672194560L, 76895);
        }
      };
      c.a(paramj.hyD, local1);
      paramJSONObject.o("sensor_event_listener", local1);
      bool = localSensorManager.registerListener(local1, (Sensor)localObject, 3, this.mHandler);
      if (!bool)
      {
        localSensorManager.unregisterListener(local1);
        c.b(paramj.hyD, local1);
        paramJSONObject.recycle();
        u.Av().gx(str);
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.JsApiEnableAccelerometer", "register accelerometer sensor finished(s : %s, r : %s).", new Object[] { str, Boolean.valueOf(bool) });
      if (bool) {}
      for (paramJSONObject = d("ok", null);; paramJSONObject = d("fail", null))
      {
        paramj.v(paramInt, paramJSONObject);
        GMTrace.o(10352347578368L, 77131);
        return;
        paramJSONObject = u.Av().gx(str);
        if (paramJSONObject == null)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.JsApiEnableAccelerometer", "unregister sensor event listener failed, keyValueSet do not exist.");
          paramj.v(paramInt, d("fail", null));
          GMTrace.o(10352347578368L, 77131);
          return;
        }
        localObject = (b)paramJSONObject.get("sensor_event_listener", null);
        if (localObject == null)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.JsApiEnableAccelerometer", "unregister sensor event listener failed, listener do not exist.");
          paramj.v(paramInt, d("fail", null));
          GMTrace.o(10352347578368L, 77131);
          return;
        }
        localSensorManager.unregisterListener((SensorEventListener)localObject);
        c.b(paramj.hyD, (c.b)localObject);
        paramJSONObject.recycle();
        bool = true;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.JsApiEnableAccelerometer", "unregister accelerometer sensor finished(s : %s).", new Object[] { str });
        break;
      }
    }
  }
  
  public static final class a
    extends e
  {
    private static final int CTRL_INDEX = 93;
    private static final String NAME = "onAccelerometerChange";
    
    public a()
    {
      GMTrace.i(10321745936384L, 76903);
      GMTrace.o(10321745936384L, 76903);
    }
  }
  
  private static abstract class b
    extends c.b
    implements SensorEventListener
  {
    private g hYg;
    w.a hYh;
    
    b(final j paramj)
    {
      GMTrace.i(10416235216896L, 77607);
      this.hYh = new w.a();
      this.hYh.a(paramj);
      this.hYg = new g(ci.Wa(), new g.a()
      {
        public final boolean f(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(10327919951872L, 76949);
          paramAnonymousVarArgs = (float[])paramAnonymousVarArgs[0];
          HashMap localHashMap = new HashMap();
          localHashMap.put("x", Float.valueOf(-paramAnonymousVarArgs[0] / 10.0F));
          localHashMap.put("y", Float.valueOf(-paramAnonymousVarArgs[1] / 10.0F));
          localHashMap.put("z", Float.valueOf(-paramAnonymousVarArgs[2] / 10.0F));
          w.b.this.hYh.r(localHashMap);
          boolean bool = ci.VY().a(w.b.this.hYh, paramj);
          GMTrace.o(10327919951872L, 76949);
          return bool;
        }
      });
      GMTrace.o(10416235216896L, 77607);
    }
    
    public void onAccuracyChanged(Sensor paramSensor, int paramInt)
    {
      GMTrace.i(10416503652352L, 77609);
      GMTrace.o(10416503652352L, 77609);
    }
    
    public void onSensorChanged(SensorEvent paramSensorEvent)
    {
      GMTrace.i(10416369434624L, 77608);
      if (paramSensorEvent.sensor.getType() != 1)
      {
        GMTrace.o(10416369434624L, 77608);
        return;
      }
      paramSensorEvent = paramSensorEvent.values;
      if ((paramSensorEvent == null) || (paramSensorEvent.length < 3))
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.JsApiEnableAccelerometer", "ACCELEROMETER sensor callback data invalidate.");
        GMTrace.o(10416369434624L, 77608);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.JsApiEnableAccelerometer", "try to do frequency limit action(%s).", new Object[] { Boolean.valueOf(this.hYg.h(new Object[] { paramSensorEvent })) });
      GMTrace.o(10416369434624L, 77608);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
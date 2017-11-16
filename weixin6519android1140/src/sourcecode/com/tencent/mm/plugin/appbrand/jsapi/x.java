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
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class x
  extends a
{
  public static final int CTRL_INDEX = 94;
  public static final String NAME = "enableCompass";
  public SensorManager aDS;
  private Handler mHandler;
  
  public x()
  {
    GMTrace.i(10427509506048L, 77691);
    this.mHandler = new Handler(com.tencent.mm.plugin.appbrand.o.d.xB().ngv.getLooper());
    GMTrace.o(10427509506048L, 77691);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10427643723776L, 77692);
    super.a(paramj, paramJSONObject, paramInt);
    boolean bool;
    try
    {
      bool = paramJSONObject.getBoolean("enable");
      if (this.aDS == null) {
        this.aDS = ((SensorManager)paramj.mContext.getSystemService("sensor"));
      }
      if (this.aDS == null)
      {
        w.i("MicroMsg.JsApiEnableCompass", "getSystemService(SENSOR_SERVICE) failed.");
        paramj.v(paramInt, d("fail", null));
        GMTrace.o(10427643723776L, 77692);
        return;
      }
    }
    catch (JSONException paramJSONObject)
    {
      w.i("MicroMsg.JsApiEnableCompass", "json data do not contains parameter enable.");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10427643723776L, 77692);
      return;
    }
    Object localObject = this.aDS.getDefaultSensor(2);
    Sensor localSensor = this.aDS.getDefaultSensor(1);
    if ((localObject == null) || (localSensor == null))
    {
      w.i("MicroMsg.JsApiEnableCompass", "get compass or accelerometer sensor failed.");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10427643723776L, 77692);
      return;
    }
    String str = "JsApi#SensorMagneticField" + paramj.hashCode();
    if (bool)
    {
      paramJSONObject = u.Av().gw(str);
      if (paramJSONObject != null) {
        break label576;
      }
      paramJSONObject = u.Av().p(str, true);
    }
    label395:
    label565:
    label576:
    for (;;)
    {
      if ((b)paramJSONObject.get("sensor_event_listener", null) != null)
      {
        w.w("MicroMsg.JsApiEnableCompass", "register failed, sensorEventListener has already registered.");
        paramj.v(paramInt, d("fail, has enable, should stop pre operation", null));
        GMTrace.o(10427643723776L, 77692);
        return;
      }
      b local1 = new b(paramj)
      {
        public final void onDestroy()
        {
          GMTrace.i(10479988637696L, 78082);
          c.b(paramj.hyD, this);
          x.this.aDS.unregisterListener(this);
          GMTrace.o(10479988637696L, 78082);
        }
      };
      c.a(paramj.hyD, local1);
      paramJSONObject.o("sensor_event_listener", local1);
      if ((this.aDS.registerListener(local1, (Sensor)localObject, 3, this.mHandler)) && (this.aDS.registerListener(local1, localSensor, 3, this.mHandler)))
      {
        bool = true;
        if (!bool)
        {
          this.aDS.unregisterListener(local1);
          local1.hYk = true;
          c.b(paramj.hyD, local1);
          paramJSONObject.recycle();
          u.Av().gx(str);
        }
        w.i("MicroMsg.JsApiEnableCompass", "register compass sensor finished(s : %s, r : %s).", new Object[] { str, Boolean.valueOf(bool) });
        if (!bool) {
          break label565;
        }
      }
      for (paramJSONObject = d("ok", null);; paramJSONObject = d("fail", null))
      {
        paramj.v(paramInt, paramJSONObject);
        GMTrace.o(10427643723776L, 77692);
        return;
        bool = false;
        break;
        paramJSONObject = u.Av().gx(str);
        if (paramJSONObject == null)
        {
          w.i("MicroMsg.JsApiEnableCompass", "unregister sensor event listener failed, keyValueSet do not exist.");
          paramj.v(paramInt, d("fail", null));
          GMTrace.o(10427643723776L, 77692);
          return;
        }
        localObject = (b)paramJSONObject.get("sensor_event_listener", null);
        if (localObject == null)
        {
          w.i("MicroMsg.JsApiEnableCompass", "unregister sensor event listener failed, listener do not exist.");
          paramj.v(paramInt, d("fail", null));
          GMTrace.o(10427643723776L, 77692);
          return;
        }
        this.aDS.unregisterListener((SensorEventListener)localObject);
        c.b(paramj.hyD, (c.b)localObject);
        ((b)localObject).hYk = true;
        paramJSONObject.recycle();
        bool = true;
        w.i("MicroMsg.JsApiEnableCompass", "unregister compass sensor finished(%s).", new Object[] { str });
        break label395;
      }
    }
  }
  
  public static final class a
    extends e
  {
    private static final int CTRL_INDEX = 95;
    private static final String NAME = "onCompassChange";
    
    public a()
    {
      GMTrace.i(10405229363200L, 77525);
      GMTrace.o(10405229363200L, 77525);
    }
  }
  
  private static abstract class b
    extends c.b
    implements SensorEventListener
  {
    private g hYg;
    boolean hYk;
    public float[] hYl;
    public float[] hYm;
    x.a hYn;
    
    b(final j paramj)
    {
      GMTrace.i(10455292575744L, 77898);
      this.hYl = new float[3];
      this.hYm = new float[3];
      this.hYn = new x.a();
      this.hYn.a(paramj);
      this.hYg = new g(ci.Wa(), new g.a()
      {
        public final boolean f(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(10326980427776L, 76942);
          w.v("MicroMsg.JsApiEnableCompass", "onAction.");
          paramAnonymousVarArgs = new float[3];
          Object localObject = new float[9];
          SensorManager.getRotationMatrix((float[])localObject, null, x.b.this.hYl, x.b.this.hYm);
          SensorManager.getOrientation((float[])localObject, paramAnonymousVarArgs);
          localObject = new HashMap();
          float f2 = (float)Math.toDegrees(paramAnonymousVarArgs[0]);
          float f1 = f2;
          if (f2 < 0.0F) {
            f1 = f2 + 360.0F;
          }
          ((Map)localObject).put("direction", Float.valueOf(f1));
          x.b.this.hYn.r((Map)localObject);
          boolean bool = ci.VY().a(x.b.this.hYn, paramj);
          GMTrace.o(10326980427776L, 76942);
          return bool;
        }
      });
      GMTrace.o(10455292575744L, 77898);
    }
    
    public void onAccuracyChanged(Sensor paramSensor, int paramInt)
    {
      GMTrace.i(10455561011200L, 77900);
      GMTrace.o(10455561011200L, 77900);
    }
    
    public void onSensorChanged(SensorEvent paramSensorEvent)
    {
      GMTrace.i(10455426793472L, 77899);
      if (this.hYk)
      {
        GMTrace.o(10455426793472L, 77899);
        return;
      }
      if ((paramSensorEvent.values == null) || (paramSensorEvent.values.length < 3))
      {
        w.w("MicroMsg.JsApiEnableCompass", "compass sensor callback data invalidate.");
        GMTrace.o(10455426793472L, 77899);
        return;
      }
      if (paramSensorEvent.sensor.getType() == 2) {
        this.hYm = paramSensorEvent.values;
      }
      for (;;)
      {
        w.v("MicroMsg.JsApiEnableCompass", "try to do frequency limit action(%s).", new Object[] { Boolean.valueOf(this.hYg.h(new Object[0])) });
        GMTrace.o(10455426793472L, 77899);
        return;
        if (paramSensorEvent.sensor.getType() != 1) {
          break;
        }
        this.hYl = paramSensorEvent.values;
      }
      GMTrace.o(10455426793472L, 77899);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.location.model;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.pluginsdk.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

public final class i
{
  private SensorManager aDS;
  private a.a fJt;
  private c gxh;
  HashSet<WeakReference<a>> hPn;
  private b mxa;
  public double mxb;
  public double mxc;
  public double mxd;
  public double mxe;
  double mxf;
  public boolean mxg;
  
  public i()
  {
    GMTrace.i(9626632323072L, 71724);
    this.mxa = new b();
    this.hPn = new HashSet();
    this.mxb = 900.0D;
    this.mxc = 900.0D;
    this.mxd = -1000.0D;
    this.mxe = -1000.0D;
    this.mxf = 0.0D;
    this.mxg = false;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15404839731200L, 114775);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15404839731200L, 114775);
          return false;
        }
        if ((i.this.mxd != -1000.0D) && (i.this.mxe != -1000.0D)) {
          i.this.mxg = f.a(i.this.mxe, i.this.mxd, paramAnonymousFloat1, paramAnonymousFloat2, paramAnonymousInt, paramAnonymousDouble1);
        }
        i.this.mxd = paramAnonymousFloat2;
        i.this.mxe = paramAnonymousFloat1;
        if ((i.this.mxc == 900.0D) || (i.this.mxb == 900.0D))
        {
          i locali1 = i.this;
          i locali2 = i.this;
          paramAnonymousDouble1 = f.i(paramAnonymousFloat2, paramAnonymousFloat1);
          locali2.mxb = paramAnonymousDouble1;
          locali1.mxc = paramAnonymousDouble1;
        }
        for (;;)
        {
          w.d("MicroMsg.OrientationSensorMgr", "onGetLocation, update headding, mCurrentHeading = %f, mPreviousHeading = %f mIsMove = %b", new Object[] { Double.valueOf(i.this.mxb), Double.valueOf(i.this.mxc), Boolean.valueOf(i.this.mxg) });
          GMTrace.o(15404839731200L, 114775);
          return true;
          i.this.mxc = i.this.mxb;
          i.this.mxb = f.i(paramAnonymousFloat2, paramAnonymousFloat1);
        }
      }
    };
    this.aDS = ((SensorManager)ab.getContext().getSystemService("sensor"));
    GMTrace.o(9626632323072L, 71724);
  }
  
  private void aKh()
  {
    GMTrace.i(9626900758528L, 71726);
    w.i("MicroMsg.OrientationSensorMgr", "registerSensor ");
    if (this.gxh == null) {
      this.gxh = c.Ir();
    }
    this.gxh.b(this.fJt, true);
    Sensor localSensor = this.aDS.getDefaultSensor(3);
    this.aDS.registerListener(this.mxa, localSensor, 1);
    GMTrace.o(9626900758528L, 71726);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(9627169193984L, 71728);
    Iterator localIterator = this.hPn.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((a)localWeakReference.get()).equals(parama)))
      {
        GMTrace.o(9627169193984L, 71728);
        return;
      }
    }
    this.hPn.add(new WeakReference(parama));
    w.i("MicroMsg.OrientationSensorMgr", "registerSensorListener %d", new Object[] { Integer.valueOf(this.hPn.size()) });
    if (this.hPn.size() == 1) {
      aKh();
    }
    GMTrace.o(9627169193984L, 71728);
  }
  
  public final double aKg()
  {
    GMTrace.i(9626766540800L, 71725);
    if (this.mxg)
    {
      w.d("MicroMsg.OrientationSensorMgr", "getHeading, mIsMove = true, result = %f", new Object[] { Double.valueOf(this.mxb) });
      d = this.mxb;
      GMTrace.o(9626766540800L, 71725);
      return d;
    }
    w.d("MicroMsg.OrientationSensorMgr", "getHeading, mIsMove = false, result = %f", new Object[] { Double.valueOf(this.mxf) });
    double d = this.mxf;
    GMTrace.o(9626766540800L, 71725);
    return d;
  }
  
  final void aKi()
  {
    GMTrace.i(9627034976256L, 71727);
    w.i("MicroMsg.OrientationSensorMgr", "unregisterSensor ");
    this.aDS.unregisterListener(this.mxa);
    c.Ir().c(this.fJt);
    GMTrace.o(9627034976256L, 71727);
  }
  
  public final void b(a parama)
  {
    GMTrace.i(9627303411712L, 71729);
    if ((this.hPn == null) || (parama == null))
    {
      GMTrace.o(9627303411712L, 71729);
      return;
    }
    Iterator localIterator = this.hPn.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((a)localWeakReference.get()).equals(parama))) {
        this.hPn.remove(localWeakReference);
      }
    }
    w.i("MicroMsg.OrientationSensorMgr", "unregisterSensorListener %d", new Object[] { Integer.valueOf(this.hPn.size()) });
    if (this.hPn.size() == 0) {
      aKi();
    }
    GMTrace.o(9627303411712L, 71729);
  }
  
  public static abstract interface a
  {
    public abstract void l(double paramDouble);
  }
  
  protected final class b
    implements SensorEventListener
  {
    private float igL;
    private long timestamp;
    
    protected b()
    {
      GMTrace.i(9633880080384L, 71778);
      this.igL = 0.0F;
      this.timestamp = 200L;
      GMTrace.o(9633880080384L, 71778);
    }
    
    public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
    {
      GMTrace.i(9634148515840L, 71780);
      GMTrace.o(9634148515840L, 71780);
    }
    
    public final void onSensorChanged(SensorEvent paramSensorEvent)
    {
      int i = 0;
      GMTrace.i(9634014298112L, 71779);
      if (paramSensorEvent.sensor.getType() == 3)
      {
        long l1 = System.currentTimeMillis();
        long l2 = this.timestamp;
        float f1 = q.at(paramSensorEvent.values[0]);
        if ((l1 - l2 > 200L) && (Math.abs(f1 - this.igL) > 3.0F))
        {
          paramSensorEvent = i.this;
          float f2 = this.igL;
          paramSensorEvent.mxf = f1;
          if (paramSensorEvent.hPn == null) {}
          for (;;)
          {
            w.d("MicroMsg.OrientationSensorMgr", "onOrientationChanged %f %f, mListenerList.size = %d", new Object[] { Float.valueOf(f2), Float.valueOf(f1), Integer.valueOf(i) });
            if (paramSensorEvent.hPn == null) {
              break;
            }
            Iterator localIterator = paramSensorEvent.hPn.iterator();
            while (localIterator.hasNext())
            {
              WeakReference localWeakReference = (WeakReference)localIterator.next();
              if ((localWeakReference != null) && (localWeakReference.get() != null)) {
                ((i.a)localWeakReference.get()).l(paramSensorEvent.aKg());
              }
            }
            i = paramSensorEvent.hPn.size();
          }
          this.igL = f1;
          this.timestamp = System.currentTimeMillis();
        }
      }
      GMTrace.o(9634014298112L, 71779);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
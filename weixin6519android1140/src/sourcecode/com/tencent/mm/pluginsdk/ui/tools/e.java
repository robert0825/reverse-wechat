package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  implements r.a
{
  public static e tGq;
  public boolean hasInit;
  private SensorEventListener rTb;
  public float[] tGm;
  int tGn;
  int tGo;
  private SensorManager tGp;
  
  static
  {
    GMTrace.i(1147561574400L, 8550);
    tGq = null;
    GMTrace.o(1147561574400L, 8550);
  }
  
  public e()
  {
    GMTrace.i(1146219397120L, 8540);
    this.hasInit = false;
    this.tGm = new float[3];
    this.tGn = 55536;
    this.tGo = 55536;
    GMTrace.o(1146219397120L, 8540);
  }
  
  private void bNk()
  {
    GMTrace.i(1146756268032L, 8544);
    w.d("MicroMsg.HeadingPitchSensorMgr", "releaseSensor");
    if ((this.tGp != null) && (this.rTb != null))
    {
      w.d("MicroMsg.HeadingPitchSensorMgr", "releaseSensor");
      this.tGp.unregisterListener(this.rTb);
      this.tGp = null;
      this.rTb = null;
    }
    this.hasInit = false;
    GMTrace.o(1146756268032L, 8544);
  }
  
  public final void bEF()
  {
    GMTrace.i(1147024703488L, 8546);
    tGq = null;
    bNk();
    GMTrace.o(1147024703488L, 8546);
  }
  
  public final void bEG()
  {
    GMTrace.i(1147293138944L, 8548);
    bNk();
    GMTrace.o(1147293138944L, 8548);
  }
  
  public final int bNj()
  {
    GMTrace.i(1146353614848L, 8541);
    w.d("MicroMsg.HeadingPitchSensorMgr", "getHeading() " + this.tGn);
    int i = this.tGn;
    GMTrace.o(1146353614848L, 8541);
    return i;
  }
  
  public final void dV(Context paramContext)
  {
    GMTrace.i(1146622050304L, 8543);
    w.d("MicroMsg.HeadingPitchSensorMgr", "initSensor() ");
    if (paramContext == null)
    {
      w.e("MicroMsg.HeadingPitchSensorMgr", "initSensor() context == null");
      GMTrace.o(1146622050304L, 8543);
      return;
    }
    if (this.tGp == null) {
      this.tGp = ((SensorManager)paramContext.getSystemService("sensor"));
    }
    if (this.rTb == null) {
      this.rTb = new SensorEventListener()
      {
        public final void onAccuracyChanged(Sensor paramAnonymousSensor, int paramAnonymousInt)
        {
          GMTrace.i(1110920134656L, 8277);
          w.i("MicroMsg.HeadingPitchSensorMgr", "onAccuracyChanged");
          GMTrace.o(1110920134656L, 8277);
        }
        
        public final void onSensorChanged(SensorEvent paramAnonymousSensorEvent)
        {
          GMTrace.i(1110785916928L, 8276);
          if (paramAnonymousSensorEvent.sensor.getType() == 3)
          {
            e.this.tGm[0] = paramAnonymousSensorEvent.values[0];
            e.this.tGm[1] = paramAnonymousSensorEvent.values[1];
            e.this.tGm[2] = paramAnonymousSensorEvent.values[2];
            if (e.this.tGn == 55536) {
              e.this.tGn = ((int)e.this.tGm[0]);
            }
            for (;;)
            {
              if (e.this.tGn == 0) {
                e.this.tGn = 1;
              }
              if (e.this.tGn == 365) {
                e.this.tGn = 364;
              }
              if (e.this.tGo != 55536) {
                break;
              }
              e.this.tGo = ((int)e.this.tGm[1]);
              GMTrace.o(1110785916928L, 8276);
              return;
              if ((e.this.tGm[0] - e.this.tGn > 300.0F) || (e.this.tGm[0] - e.this.tGn < -300.0F)) {
                e.this.tGn = ((int)e.this.tGm[0]);
              } else {
                e.this.tGn = ((int)(e.this.tGn * 0.6D + e.this.tGm[0] * 0.4D));
              }
            }
            if (e.this.tGm[1] < -68.0F)
            {
              int j = (int)(-68.0D + (e.this.tGm[1] + 68.0F) / 1.5D);
              int i = j;
              if (j < -89) {
                i = -89;
              }
              e.this.tGo = i;
              GMTrace.o(1110785916928L, 8276);
              return;
            }
            if (e.this.tGm[1] > 89.0F)
            {
              e.this.tGo = 89;
              GMTrace.o(1110785916928L, 8276);
              return;
            }
            e.this.tGo = ((int)(e.this.tGo * 0.6D + e.this.tGm[1] * 0.4D));
          }
          GMTrace.o(1110785916928L, 8276);
        }
      };
    }
    boolean bool = this.tGp.registerListener(this.rTb, this.tGp.getDefaultSensor(3), 3);
    this.hasInit = true;
    w.d("MicroMsg.HeadingPitchSensorMgr", "initSensor() finish, %s", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(1146622050304L, 8543);
  }
  
  public final void du(Context paramContext)
  {
    GMTrace.i(1147158921216L, 8547);
    dV(paramContext);
    GMTrace.o(1147158921216L, 8547);
  }
  
  public final String getName()
  {
    GMTrace.i(1146890485760L, 8545);
    GMTrace.o(1146890485760L, 8545);
    return "HeadingPitchSensorMgr";
  }
  
  public final int getPitch()
  {
    GMTrace.i(1146487832576L, 8542);
    w.d("MicroMsg.HeadingPitchSensorMgr", "getPitch() " + this.tGo);
    int i = this.tGo;
    GMTrace.o(1146487832576L, 8542);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
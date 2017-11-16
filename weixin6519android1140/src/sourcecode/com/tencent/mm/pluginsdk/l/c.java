package com.tencent.mm.pluginsdk.l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class c
{
  private SensorManager trZ;
  private a tsa;
  
  public c(Context paramContext)
  {
    GMTrace.i(891742584832L, 6644);
    this.trZ = ((SensorManager)paramContext.getSystemService("sensor"));
    GMTrace.o(891742584832L, 6644);
  }
  
  private boolean bKA()
  {
    GMTrace.i(892547891200L, 6650);
    if (this.trZ == null)
    {
      w.e("MicroMsg.ShakeSensorService", "cannot init sensor manager");
      GMTrace.o(892547891200L, 6650);
      return false;
    }
    List localList = this.trZ.getSensorList(1);
    if ((localList != null) && (localList.size() > 0))
    {
      GMTrace.o(892547891200L, 6650);
      return true;
    }
    GMTrace.o(892547891200L, 6650);
    return false;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(892145238016L, 6647);
    aFd();
    if (bKA())
    {
      this.tsa = parama;
      this.trZ.registerListener(this.tsa, this.trZ.getDefaultSensor(1), 1);
      GMTrace.o(892145238016L, 6647);
      return;
    }
    w.e("MicroMsg.ShakeSensorService", "no sensor found for shake detection");
    GMTrace.o(892145238016L, 6647);
  }
  
  public final void aFd()
  {
    GMTrace.i(892279455744L, 6648);
    if (this.tsa != null)
    {
      this.tsa.onRelease();
      this.trZ.unregisterListener(this.tsa, this.trZ.getDefaultSensor(1));
      this.tsa = null;
    }
    GMTrace.o(892279455744L, 6648);
  }
  
  public final boolean bKx()
  {
    GMTrace.i(891876802560L, 6645);
    if (this.tsa != null)
    {
      GMTrace.o(891876802560L, 6645);
      return true;
    }
    GMTrace.o(891876802560L, 6645);
    return false;
  }
  
  public final void bKy()
  {
    GMTrace.i(892011020288L, 6646);
    if (this.tsa != null) {
      a.reset();
    }
    GMTrace.o(892011020288L, 6646);
  }
  
  public final boolean bKz()
  {
    GMTrace.i(892413673472L, 6649);
    if (bKA())
    {
      GMTrace.o(892413673472L, 6649);
      return true;
    }
    GMTrace.o(892413673472L, 6649);
    return false;
  }
  
  public static abstract class a
    implements SensorEventListener
  {
    private static int tsd;
    private final float[] tsb;
    private float[] tsc;
    
    static
    {
      GMTrace.i(889058230272L, 6624);
      tsd = 5;
      if (Build.MODEL.equals("LG-E510")) {
        tsd = 4;
      }
      GMTrace.o(889058230272L, 6624);
    }
    
    public a()
    {
      GMTrace.i(888252923904L, 6618);
      this.tsb = new float[] { 2.0F, 2.5F, 0.5F };
      this.tsc = new float[3];
      GMTrace.o(888252923904L, 6618);
    }
    
    public static void reset()
    {
      GMTrace.i(888655577088L, 6621);
      w.d("MicroMsg.ShakeSensorListener", "reset threadHold");
      tsd = 5;
      if (Build.MODEL.equals("LG-E510")) {
        tsd = 4;
      }
      GMTrace.o(888655577088L, 6621);
    }
    
    public abstract void aTB();
    
    public void onAccuracyChanged(Sensor paramSensor, int paramInt)
    {
      GMTrace.i(888924012544L, 6623);
      GMTrace.o(888924012544L, 6623);
    }
    
    public abstract void onRelease();
    
    public void onSensorChanged(SensorEvent paramSensorEvent)
    {
      GMTrace.i(888789794816L, 6622);
      float[] arrayOfFloat1 = new float[3];
      float[] arrayOfFloat2 = paramSensorEvent.values;
      int i = 0;
      int j = 0;
      if (i < 3)
      {
        arrayOfFloat1[i] = Math.round(this.tsb[i] * (arrayOfFloat2[i] - this.tsc[i]) * 0.45F);
        float f = Math.abs(arrayOfFloat1[i]);
        if (f >= 4.0F) {
          w.v("MicroMsg.ShakeSensorListener", "result:" + f + " THREAHOLD:" + tsd);
        }
        if (tsd < 9)
        {
          if (f < 14.0F) {
            break label155;
          }
          tsd = 9;
        }
        for (;;)
        {
          if (f > tsd) {
            j = 1;
          }
          this.tsc[i] = arrayOfFloat2[i];
          i += 1;
          break;
          label155:
          int k = (int)f;
          if (tsd < k - 4) {
            tsd = k - 4;
          }
        }
      }
      if (j != 0)
      {
        w.d("MicroMsg.ShakeSensorListener", "sensorChanged " + paramSensorEvent.sensor.getName() + " (" + arrayOfFloat2[0] + ", " + arrayOfFloat2[1] + ", " + arrayOfFloat2[2] + ") diff(" + arrayOfFloat1[0] + " " + arrayOfFloat1[1] + " " + arrayOfFloat1[2] + ")");
        aTB();
        paramSensorEvent = paramSensorEvent.values;
      }
      GMTrace.o(888789794816L, 6622);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\l\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
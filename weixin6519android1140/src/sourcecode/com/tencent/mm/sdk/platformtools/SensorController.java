package com.tencent.mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.jg.JgMethodChecked;
import com.tencent.gmtrace.GMTrace;

public class SensorController
  extends BroadcastReceiver
  implements SensorEventListener
{
  private static float vkN;
  private static float vkP;
  public static boolean vkW;
  public static double vkX;
  private Context context;
  private SensorManager gXR;
  private float pFY;
  private float vkO;
  private a vkQ;
  private Sensor vkR;
  private final boolean vkS;
  private boolean vkT;
  public boolean vkU;
  private float vkV;
  
  static
  {
    GMTrace.i(13872207495168L, 103356);
    vkN = 4.2949673E9F;
    vkP = 0.5F;
    vkW = false;
    vkX = -1.0D;
    GMTrace.o(13872207495168L, 103356);
  }
  
  public SensorController(Context paramContext)
  {
    GMTrace.i(13871402188800L, 103350);
    this.vkT = false;
    this.vkU = false;
    this.pFY = -1.0F;
    this.vkV = -1.0F;
    if (paramContext == null)
    {
      this.vkS = false;
      GMTrace.o(13871402188800L, 103350);
      return;
    }
    this.context = paramContext;
    this.gXR = ((SensorManager)paramContext.getSystemService("sensor"));
    this.vkR = this.gXR.getDefaultSensor(8);
    if (this.vkR != null) {
      this.pFY = Math.min(10.0F, this.vkR.getMaximumRange());
    }
    if (this.pFY < 0.0F)
    {
      w.e("MicroMsg.SensorController", "error, getMaximumRange return %s, set to 1", new Object[] { Float.valueOf(this.pFY) });
      this.pFY = 1.0F;
    }
    if (this.vkR != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.vkS = bool;
      this.vkO = (vkP + 1.0F);
      GMTrace.o(13871402188800L, 103350);
      return;
    }
  }
  
  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public final void a(a parama)
  {
    GMTrace.i(13871536406528L, 103351);
    w.i("MicroMsg.SensorController", "sensor callback set, isRegistered:" + this.vkU + ", proximitySensor: " + this.vkR + ", maxValue: " + this.pFY);
    if (!this.vkU)
    {
      this.vkV = -1.0F;
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.HEADSET_PLUG");
      this.context.registerReceiver(this, localIntentFilter);
      this.gXR.registerListener(this, this.vkR, 2);
      this.vkU = true;
    }
    this.vkQ = parama;
    GMTrace.o(13871536406528L, 103351);
  }
  
  public final void bQD()
  {
    GMTrace.i(13871670624256L, 103352);
    w.i("MicroMsg.SensorController", "sensor callback removed");
    try
    {
      this.context.unregisterReceiver(this);
      this.gXR.unregisterListener(this, this.vkR);
      this.gXR.unregisterListener(this);
      this.vkU = false;
      this.vkQ = null;
      this.vkV = -1.0F;
      GMTrace.o(13871670624256L, 103352);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.v("MicroMsg.SensorController", "sensor receiver has already unregistered");
      }
    }
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    GMTrace.i(13871804841984L, 103353);
    GMTrace.o(13871804841984L, 103353);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(13872073277440L, 103355);
    if (paramIntent == null)
    {
      GMTrace.o(13872073277440L, 103355);
      return;
    }
    paramContext = paramIntent.getAction();
    if ((paramContext != null) && (paramContext.equals("android.intent.action.HEADSET_PLUG")))
    {
      int i = paramIntent.getIntExtra("state", 0);
      if (i == 1) {
        this.vkT = true;
      }
      if (i == 0) {
        this.vkT = false;
      }
    }
    GMTrace.o(13872073277440L, 103355);
  }
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    GMTrace.i(13871939059712L, 103354);
    if ((paramSensorEvent == null) || (paramSensorEvent.sensor == null) || (this.vkR == null))
    {
      GMTrace.o(13871939059712L, 103354);
      return;
    }
    if (this.vkT)
    {
      GMTrace.o(13871939059712L, 103354);
      return;
    }
    float f2 = paramSensorEvent.values[0];
    double d = 3.0D;
    w.i("MicroMsg.SensorController", "newValue: %s, maxValue: %s, divideRatio: %s, configNearFarDivideRatio: %s, lastValue: %s, maxRange: %s", new Object[] { Float.valueOf(f2), Float.valueOf(this.pFY), Double.valueOf(3.0D), Double.valueOf(vkX), Float.valueOf(this.vkV), Float.valueOf(this.vkR.getMaximumRange()) });
    if (vkX > 0.0D) {
      d = vkX;
    }
    if ((vkX > 0.0D) || (this.pFY < 0.0F)) {}
    float f3;
    for (float f1 = this.vkR.getMaximumRange();; f1 = this.pFY)
    {
      f3 = Math.max(0.1F, (float)(f1 / d));
      w.i("MicroMsg.SensorController", "onSensorChanged, near threshold: %s, max: %s", new Object[] { Float.valueOf(f3), Float.valueOf(f1) });
      switch (paramSensorEvent.sensor.getType())
      {
      default: 
        GMTrace.o(13871939059712L, 103354);
        return;
      }
    }
    if (this.vkQ == null)
    {
      GMTrace.o(13871939059712L, 103354);
      return;
    }
    if (f2 == this.vkV)
    {
      GMTrace.o(13871939059712L, 103354);
      return;
    }
    if (f2 < f3)
    {
      w.i("MicroMsg.SensorController", "sensor near-far event near false");
      this.vkQ.jdMethod_do(false);
    }
    for (;;)
    {
      this.vkV = f2;
      break;
      w.i("MicroMsg.SensorController", "sensor near-far event far true");
      this.vkQ.jdMethod_do(true);
    }
  }
  
  public static abstract interface a
  {
    public abstract void jdMethod_do(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\SensorController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
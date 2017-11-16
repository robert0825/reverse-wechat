package com.tencent.mm.plugin.scanner.util;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.oe;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class ScanCameraLightDetector
  implements SensorEventListener
{
  public static final ScanCameraLightDetector oAX;
  public SensorManager gXR;
  public ae handler;
  public long oAY;
  public Sensor oAZ;
  public boolean oBa;
  public float oBb;
  public HandlerThread oBc;
  
  static
  {
    GMTrace.i(6171331133440L, 45980);
    oAX = new ScanCameraLightDetector();
    GMTrace.o(6171331133440L, 45980);
  }
  
  public ScanCameraLightDetector()
  {
    GMTrace.i(6170525827072L, 45974);
    this.oAY = -1L;
    this.oBa = false;
    this.oBb = -1.0F;
    GMTrace.o(6170525827072L, 45974);
  }
  
  private static native int calcLumNative(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public static boolean g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(16030696996864L, 119438);
    if ((!bg.bq(paramArrayOfByte)) && (paramArrayOfByte.length > paramInt1 * paramInt2))
    {
      paramInt1 = calcLumNative(paramArrayOfByte, paramInt1, paramInt2);
      w.i("MicroMsg.ScanCameraLightDetector", "lum light: %s", new Object[] { Integer.valueOf(paramInt1) });
      if (paramInt1 < 50)
      {
        GMTrace.o(16030696996864L, 119438);
        return true;
      }
    }
    GMTrace.o(16030696996864L, 119438);
    return false;
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    GMTrace.i(6170928480256L, 45977);
    w.d("MicroMsg.ScanCameraLightDetector", "onAccuracyChanged");
    GMTrace.o(6170928480256L, 45977);
  }
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    GMTrace.i(6170794262528L, 45976);
    paramSensorEvent = paramSensorEvent.values;
    if ((paramSensorEvent != null) && (paramSensorEvent.length > 0)) {
      this.oBb = paramSensorEvent[0];
    }
    GMTrace.o(6170794262528L, 45976);
  }
  
  private final class a
  {
    public int height;
    public byte[] mZR;
    public int width;
    
    public a()
    {
      GMTrace.i(6169720520704L, 45968);
      GMTrace.o(6169720520704L, 45968);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\ScanCameraLightDetector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
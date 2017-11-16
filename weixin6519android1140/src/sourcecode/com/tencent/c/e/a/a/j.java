package com.tencent.c.e.a.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.Arrays;

public final class j
{
  public final long timestamp;
  public final float[] values;
  public final int xSs;
  
  public j(SensorEvent paramSensorEvent, long paramLong)
  {
    this.xSs = paramSensorEvent.sensor.getType();
    this.timestamp = paramLong;
    this.values = Arrays.copyOf(paramSensorEvent.values, paramSensorEvent.values.length);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
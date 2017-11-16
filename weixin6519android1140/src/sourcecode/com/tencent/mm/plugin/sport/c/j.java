package com.tencent.mm.plugin.sport.c;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class j
  implements SensorEventListener
{
  private static long qqJ;
  private static long qqK;
  private static long qqL;
  private static long qqM;
  private static long qqN;
  private static long qqO;
  private static long qqP;
  private static long qqQ;
  public c qqR;
  
  static
  {
    GMTrace.i(16736950681600L, 124700);
    qqJ = 0L;
    qqK = 0L;
    qqL = 0L;
    qqM = 0L;
    qqN = 0L;
    qqO = 0L;
    qqP = 0L;
    qqQ = 0L;
    GMTrace.o(16736950681600L, 124700);
  }
  
  public j()
  {
    GMTrace.i(16736548028416L, 124697);
    qqN = 0L;
    qqO = 0L;
    qqP = 0L;
    qqQ = 0L;
    qqJ = 0L;
    qqK = 0L;
    qqL = 0L;
    qqM = 0L;
    GMTrace.o(16736548028416L, 124697);
  }
  
  public static long brd()
  {
    GMTrace.i(16736279592960L, 124695);
    long l = qqL;
    GMTrace.o(16736279592960L, 124695);
    return l;
  }
  
  public static long bre()
  {
    GMTrace.i(16736413810688L, 124696);
    long l = qqN;
    GMTrace.o(16736413810688L, 124696);
    return l;
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    GMTrace.i(16736816463872L, 124699);
    GMTrace.o(16736816463872L, 124699);
  }
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    GMTrace.i(16736682246144L, 124698);
    JSONObject localJSONObject = f.bra();
    if (localJSONObject.optInt("deviceStepSwitch") != 1)
    {
      if (this.qqR != null) {
        this.qqR.bqY();
      }
      w.i("MicroMsg.Sport.SportStepDetector", "device step switch off");
      GMTrace.o(16736682246144L, 124698);
      return;
    }
    int j = localJSONObject.optInt("stepCounterMaxStep5m", 3000);
    long l1;
    long l2;
    long l4;
    long l5;
    long l3;
    int i;
    long l6;
    label601:
    long l7;
    boolean bool1;
    if ((paramSensorEvent != null) && (paramSensorEvent.values != null) && (paramSensorEvent.values.length > 0))
    {
      w.i("MicroMsg.Sport.SportStepDetector", "Step change %f, accuracy %s, %s", new Object[] { Float.valueOf(paramSensorEvent.values[0]), Integer.valueOf(paramSensorEvent.accuracy), Long.valueOf(paramSensorEvent.timestamp) });
      l1 = bg.bQR() / 10000L;
      if (qqN == 0L) {
        qqN = h.vO(202);
      }
      if (qqK == 0L) {
        qqK = h.vO(203);
      }
      if (qqL == 0L) {
        qqL = h.vO(201);
      }
      if (qqM == 0L) {
        qqM = qqL;
      }
      if (qqO == 0L) {
        qqO = h.vO(204);
      }
      if (qqP == 0L) {
        qqP = qqO;
      }
      if (qqQ == 0L) {
        qqQ = h.vO(209);
      }
      w.i("MicroMsg.Sport.SportStepDetector", "currentVar: beginOfToday %d saveTodayTime %d preSensorStep %d currentTodayStep %d lastSaveSensorStep %d lastSaveStepTime %d preSysStepTime %d preSensorNanoTime %d", new Object[] { Long.valueOf(l1), Long.valueOf(qqN), Long.valueOf(qqK), Long.valueOf(qqL), Long.valueOf(qqM), Long.valueOf(qqO), Long.valueOf(qqP), Long.valueOf(qqQ) });
      l2 = paramSensorEvent.values[0];
      qqJ = l2;
      if (l2 < 0L)
      {
        GMTrace.o(16736682246144L, 124698);
        return;
      }
      l4 = System.currentTimeMillis();
      l5 = paramSensorEvent.timestamp;
      if (qqN != l1)
      {
        w.i("MicroMsg.Sport.SportStepDetector", "new day beginOfToday: %s saveTodayTime: %s, ", new Object[] { k.ax(10000L * l1), k.ax(qqN * 10000L) });
        h.L(202, l1);
        h.L(201, 0L);
        h.L(204, l4);
        h.L(209, paramSensorEvent.timestamp);
        h.L(203, (int)qqJ);
        qqK = qqJ;
        qqL = 0L;
        qqM = 0L;
        qqN = l1;
        qqO = l4;
        qqP = l4;
        qqQ = l5;
        GMTrace.o(16736682246144L, 124698);
        return;
      }
      l2 = h.vO(205);
      l1 = 0L;
      l3 = (l4 - qqP) / 300000L;
      if ((l4 - qqP) % 300000L > 0L)
      {
        i = 1;
        l6 = l3 + i;
        l3 = (l5 / 1000000L - qqQ / 1000000L) / 300000L;
        if ((l5 / 1000000L - qqQ / 1000000L) % 300000L <= 0L) {
          break label988;
        }
        i = 1;
        l7 = l3 + i;
        w.i("MicroMsg.Sport.SportStepDetector", "timesOf5Minute(%d, %d). rebootTime: %d %s", new Object[] { Long.valueOf(l7), Long.valueOf(l6), Long.valueOf(l2), k.ax(l2) });
        bool1 = false;
        if (l2 <= qqO) {
          break label993;
        }
        l3 = qqJ - qqM;
        if ((l3 <= 0L) || ((l3 >= j * l7) && (l3 >= j * l6))) {
          break label1338;
        }
        paramSensorEvent = "rebootIncrease Valid Step diffStep > 0";
        l1 = l3;
      }
    }
    for (;;)
    {
      Object localObject = paramSensorEvent;
      l2 = l1;
      if (l3 < 0L) {
        if (qqJ >= l7 * j)
        {
          localObject = paramSensorEvent;
          l2 = l1;
          if (qqJ >= l6 * j) {}
        }
        else
        {
          l2 = qqJ;
          localObject = "rebootIncrease Valid Step diffStep < 0";
        }
      }
      h.L(205, 0L);
      bool1 = true;
      for (;;)
      {
        label772:
        w.i("MicroMsg.Sport.SportStepDetector", "increase step %s %d %b", new Object[] { localObject, Long.valueOf(l2), Boolean.valueOf(bool1) });
        qqL = l2 + qqL;
        if ((l4 - qqO > localJSONObject.optInt("stepCounterSaveInterval", 60000)) || (qqJ - qqM > localJSONObject.optInt("stepCounterSaveStep")) || (bool1))
        {
          h.L(201, qqL);
          h.L(203, qqJ);
          h.L(204, l4);
          h.L(209, l5);
          w.i("MicroMsg.Sport.SportStepDetector", "save to [file] currentTodayStep %d lastSaveSensorStep %d preSysStepTime %d lastSaveStepTime %d preSensorNanoTime %d", new Object[] { Long.valueOf(qqL), Long.valueOf(qqM), Long.valueOf(qqP), Long.valueOf(qqO), Long.valueOf(qqQ) });
          qqO = l4;
          qqM = qqJ;
        }
        for (;;)
        {
          qqK = qqJ;
          qqP = l4;
          qqQ = l5;
          GMTrace.o(16736682246144L, 124698);
          return;
          i = 0;
          break;
          label988:
          i = 0;
          break label601;
          label993:
          if (qqJ < qqK)
          {
            w.i("MicroMsg.Sport.SportStepDetector", "invalid currentSensorStep %d preSensorStep %d lastSaveSensorStep %d", new Object[] { Long.valueOf(qqJ), Long.valueOf(qqK), Long.valueOf(qqM) });
            l2 = qqJ;
            qqK = l2;
            qqM = l2;
            bool1 = true;
          }
          if ((qqJ - qqK >= l7 * j) && (qqJ - qqK >= l6 * j)) {
            break label1327;
          }
          l2 = qqJ - qqK;
          localObject = "normalIncrease Valid Step";
          break label772;
          w.i("MicroMsg.Sport.SportStepDetector", "save to cache currentTodayStep %d preSysStepTime %d lastSaveStepTime %d preSensorNanoTime %d", new Object[] { Long.valueOf(qqL), Long.valueOf(qqP), Long.valueOf(qqO), Long.valueOf(qqQ) });
        }
        if ((paramSensorEvent == null) || (paramSensorEvent.values == null))
        {
          if (paramSensorEvent == null)
          {
            bool1 = true;
            if (paramSensorEvent == null) {
              break label1224;
            }
          }
          label1224:
          for (boolean bool2 = true;; bool2 = false)
          {
            w.e("MicroMsg.Sport.SportStepDetector", "[Willen][Step] SensorEvent Exception. event==null:%s , event.values==null:%s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
            GMTrace.o(16736682246144L, 124698);
            return;
            bool1 = false;
            break;
          }
        }
        w.e("MicroMsg.Sport.SportStepDetector", "[Willen][Step] SensorEvent Exception accuracy: %d, timestamp: %s", new Object[] { Integer.valueOf(paramSensorEvent.accuracy), Long.valueOf(paramSensorEvent.timestamp) });
        i = 0;
        paramSensorEvent = paramSensorEvent.values;
        int k = paramSensorEvent.length;
        j = 0;
        while (j < k)
        {
          w.e("MicroMsg.Sport.SportStepDetector", "[Willen][Step] SensorEvent Exception event[%d]: %f", new Object[] { Integer.valueOf(i), Float.valueOf(paramSensorEvent[j]) });
          j += 1;
          i += 1;
        }
        GMTrace.o(16736682246144L, 124698);
        return;
        label1327:
        localObject = "";
        l2 = l1;
      }
      label1338:
      paramSensorEvent = "";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
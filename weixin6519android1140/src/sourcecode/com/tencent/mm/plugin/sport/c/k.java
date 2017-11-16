package com.tencent.mm.plugin.sport.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

public final class k
{
  public static final String ax(long paramLong)
  {
    GMTrace.i(16733595238400L, 124675);
    String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(paramLong));
    GMTrace.o(16733595238400L, 124675);
    return str;
  }
  
  public static boolean bqR()
  {
    GMTrace.i(16734266327040L, 124680);
    x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE("gh_43f2581f6fd6");
    if (localx != null) {}
    for (boolean bool = a.eE(localx.field_type);; bool = false)
    {
      if (!bool) {
        w.i("MicroMsg.Sport.SportUtil", "checkUserInstallWeSportPlugin %b", new Object[] { Boolean.valueOf(bool) });
      }
      GMTrace.o(16734266327040L, 124680);
      return bool;
    }
  }
  
  public static boolean brf()
  {
    GMTrace.i(16734132109312L, 124679);
    if (f.bra().optInt("extStepApiSwitch") != 1)
    {
      w.i("MicroMsg.Sport.SportUtil", "Not Support extStepApiSwitch is off");
      GMTrace.o(16734132109312L, 124679);
      return false;
    }
    GMTrace.o(16734132109312L, 124679);
    return true;
  }
  
  public static boolean dh(Context paramContext)
  {
    GMTrace.i(16733997891584L, 124678);
    if (d.eu(19))
    {
      w.i("MicroMsg.Sport.SportUtil", "Not Support SDK VERSION");
      GMTrace.o(16733997891584L, 124678);
      return false;
    }
    if (!paramContext.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter"))
    {
      w.i("MicroMsg.Sport.SportUtil", "Not Support FEATURE_SENSOR_STEP_COUNTER");
      GMTrace.o(16733997891584L, 124678);
      return false;
    }
    if (((SensorManager)paramContext.getSystemService("sensor")).getDefaultSensor(19) == null)
    {
      w.i("MicroMsg.Sport.SportUtil", "Not Support can not get sensor");
      GMTrace.o(16733997891584L, 124678);
      return false;
    }
    if (f.bra().optInt("deviceStepSwitch") != 1)
    {
      w.i("MicroMsg.Sport.SportUtil", "Not Support deviceStepSwitch is off");
      GMTrace.o(16733997891584L, 124678);
      return false;
    }
    GMTrace.o(16733997891584L, 124678);
    return true;
  }
  
  public static boolean v(long paramLong1, long paramLong2)
  {
    GMTrace.i(16733729456128L, 124676);
    l2 = 3600000L;
    try
    {
      JSONObject localJSONObject = f.bra().optJSONObject("stepCountUploadConfig");
      l1 = l2;
      if (localJSONObject != null)
      {
        int i = localJSONObject.optInt("backgroundTimeInterval", 60);
        l1 = i * 60 * 1000L;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        long l1 = l2;
      }
    }
    if (paramLong2 - paramLong1 >= l1)
    {
      GMTrace.o(16733729456128L, 124676);
      return true;
    }
    GMTrace.o(16733729456128L, 124676);
    return false;
  }
  
  public static boolean w(long paramLong1, long paramLong2)
  {
    j = 500;
    GMTrace.i(16733863673856L, 124677);
    if ((paramLong1 == 0L) && (paramLong2 > 0L))
    {
      GMTrace.o(16733863673856L, 124677);
      return true;
    }
    try
    {
      JSONObject localJSONObject = f.bra().optJSONObject("stepCountUploadConfig");
      i = j;
      if (localJSONObject != null) {
        i = localJSONObject.optInt("backgroundStepCountInterval", 500);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i = j;
      }
    }
    if (paramLong2 - paramLong1 >= i)
    {
      GMTrace.o(16733863673856L, 124677);
      return true;
    }
    GMTrace.o(16733863673856L, 124677);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
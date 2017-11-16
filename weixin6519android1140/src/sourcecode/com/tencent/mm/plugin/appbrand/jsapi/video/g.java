package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public final class g
{
  public static String ax(long paramLong)
  {
    GMTrace.i(17341467328512L, 129204);
    if (paramLong < 3600000L) {}
    for (Object localObject = "mm:ss";; localObject = "HH:mm:ss")
    {
      localObject = new SimpleDateFormat((String)localObject);
      ((SimpleDateFormat)localObject).setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
      localObject = ((SimpleDateFormat)localObject).format(Long.valueOf(paramLong));
      GMTrace.o(17341467328512L, 129204);
      return (String)localObject;
    }
  }
  
  private static float bJ(Context paramContext)
  {
    GMTrace.i(17341198893056L, 129202);
    paramContext = paramContext.getContentResolver();
    float f = 0.0F;
    try
    {
      int i = Settings.System.getInt(paramContext, "screen_brightness");
      f = i / 255.0F;
    }
    catch (Settings.SettingNotFoundException paramContext)
    {
      for (;;) {}
    }
    GMTrace.o(17341198893056L, 129202);
    return f;
  }
  
  public static float bL(Context paramContext)
  {
    GMTrace.i(17341333110784L, 129203);
    WindowManager.LayoutParams localLayoutParams = ((Activity)paramContext).getWindow().getAttributes();
    if (localLayoutParams.screenBrightness < 0.0F)
    {
      f = bJ(paramContext);
      GMTrace.o(17341333110784L, 129203);
      return f;
    }
    float f = localLayoutParams.screenBrightness;
    GMTrace.o(17341333110784L, 129203);
    return f;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\video\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
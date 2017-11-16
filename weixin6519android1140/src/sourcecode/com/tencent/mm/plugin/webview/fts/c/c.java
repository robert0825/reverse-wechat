package com.tencent.mm.plugin.webview.fts.c;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  public static String W(JSONObject paramJSONObject)
  {
    GMTrace.i(20493839106048L, 152691);
    paramJSONObject = paramJSONObject.optJSONArray("playUrl");
    if ((paramJSONObject != null) && (paramJSONObject.length() > 0)) {
      try
      {
        paramJSONObject = paramJSONObject.getString(0);
        GMTrace.o(20493839106048L, 152691);
        return paramJSONObject;
      }
      catch (JSONException paramJSONObject) {}
    }
    GMTrace.o(20493839106048L, 152691);
    return "";
  }
  
  public static float[] a(JSONObject paramJSONObject, Context paramContext)
  {
    GMTrace.i(20493570670592L, 152689);
    float[] arrayOfFloat = new float[5];
    if (paramJSONObject.has("x"))
    {
      arrayOfFloat[0] = a.fromDPToPix(paramContext, paramJSONObject.optInt("x"));
      if (!paramJSONObject.has("y")) {
        break label126;
      }
      arrayOfFloat[1] = a.fromDPToPix(paramContext, paramJSONObject.optInt("y"));
      label58:
      if (!paramJSONObject.has("width")) {
        break label134;
      }
      arrayOfFloat[2] = a.fromDPToPix(paramContext, paramJSONObject.optInt("width"));
      label81:
      if (!paramJSONObject.has("height")) {
        break label142;
      }
      arrayOfFloat[3] = a.fromDPToPix(paramContext, paramJSONObject.optInt("height"));
    }
    for (;;)
    {
      arrayOfFloat[4] = 0.0F;
      GMTrace.o(20493570670592L, 152689);
      return arrayOfFloat;
      arrayOfFloat[0] = Float.MAX_VALUE;
      break;
      label126:
      arrayOfFloat[1] = Float.MAX_VALUE;
      break label58;
      label134:
      arrayOfFloat[2] = Float.MAX_VALUE;
      break label81;
      label142:
      arrayOfFloat[3] = Float.MAX_VALUE;
    }
  }
  
  public static String ax(long paramLong)
  {
    GMTrace.i(20493436452864L, 152688);
    if (paramLong < 3600000L) {}
    for (Object localObject = "mm:ss";; localObject = "HH:mm:ss")
    {
      localObject = new SimpleDateFormat((String)localObject);
      ((SimpleDateFormat)localObject).setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
      localObject = ((SimpleDateFormat)localObject).format(Long.valueOf(paramLong));
      GMTrace.o(20493436452864L, 152688);
      return (String)localObject;
    }
  }
  
  private static float bJ(Context paramContext)
  {
    GMTrace.i(20493168017408L, 152686);
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
    GMTrace.o(20493168017408L, 152686);
    return f;
  }
  
  public static float bL(Context paramContext)
  {
    GMTrace.i(20493302235136L, 152687);
    WindowManager.LayoutParams localLayoutParams = ((Activity)paramContext).getWindow().getAttributes();
    if (localLayoutParams.screenBrightness < 0.0F)
    {
      f = bJ(paramContext);
      GMTrace.o(20493302235136L, 152687);
      return f;
    }
    float f = localLayoutParams.screenBrightness;
    GMTrace.o(20493302235136L, 152687);
    return f;
  }
  
  public static int j(JSONObject paramJSONObject)
  {
    GMTrace.i(20493704888320L, 152690);
    if (paramJSONObject.has("visible"))
    {
      if (paramJSONObject.optBoolean("visible"))
      {
        GMTrace.o(20493704888320L, 152690);
        return 0;
      }
      GMTrace.o(20493704888320L, 152690);
      return 1;
    }
    GMTrace.o(20493704888320L, 152690);
    return Integer.MAX_VALUE;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
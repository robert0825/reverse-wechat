package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ae
  extends a
{
  public static final int CTRL_INDEX = 232;
  public static final String NAME = "getScreenBrightness";
  
  public ae()
  {
    GMTrace.i(15486846763008L, 115386);
    GMTrace.o(15486846763008L, 115386);
  }
  
  private static float bJ(Context paramContext)
  {
    GMTrace.i(15487115198464L, 115388);
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
    GMTrace.o(15487115198464L, 115388);
    return f;
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(15486980980736L, 115387);
    w.d("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness!");
    paramJSONObject = a(paramj);
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiGetScreenBrightness", "context is null, invoke fail!");
      GMTrace.o(15486980980736L, 115387);
      return;
    }
    float f2 = paramJSONObject.getWindow().getAttributes().screenBrightness;
    float f1 = f2;
    if (f2 < 0.0F) {
      f1 = bJ(paramJSONObject);
    }
    paramJSONObject = new HashMap();
    paramJSONObject.put("value", Float.valueOf(f1));
    paramj.v(paramInt, d("ok", paramJSONObject));
    GMTrace.o(15486980980736L, 115387);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
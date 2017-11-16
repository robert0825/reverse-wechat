package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.os.Vibrator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ch
  extends a
{
  public static final int CTRL_INDEX = 230;
  public static final String NAME = "vibrateShort";
  
  public ch()
  {
    GMTrace.i(15478525263872L, 115324);
    GMTrace.o(15478525263872L, 115324);
  }
  
  private static void bK(Context paramContext)
  {
    GMTrace.i(15478927917056L, 115327);
    paramContext = (Vibrator)paramContext.getSystemService("vibrator");
    if (paramContext == null)
    {
      GMTrace.o(15478927917056L, 115327);
      return;
    }
    paramContext.vibrate(15L);
    GMTrace.o(15478927917056L, 115327);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(15478659481600L, 115325);
    w.d("MicroMsg.JsApiVibrateShort", "JsApiVibrateShort services!");
    bK(paramj.mContext);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(15478659481600L, 115325);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(15478793699328L, 115326);
    w.d("MicroMsg.JsApiVibrateShort", "JsApiVibrateShort!");
    bK(paramAppBrandPageView.mContext);
    paramAppBrandPageView.v(paramInt, d("ok", null));
    GMTrace.o(15478793699328L, 115326);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
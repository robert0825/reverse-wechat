package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class br
  extends a
{
  public static final int CTRL_INDEX = 229;
  public static final String NAME = "setScreenBrightness";
  public float hZt;
  public float hZu;
  
  public br()
  {
    GMTrace.i(15482686013440L, 115355);
    this.hZt = NaN.0F;
    GMTrace.o(15482686013440L, 115355);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(15482820231168L, 115356);
    w.d("MicroMsg.JsApiSetScreenBrightness", "JsApiSetScreenBrightness!");
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiSetScreenBrightness", "data is null");
      GMTrace.o(15482820231168L, 115356);
      return;
    }
    af.t(new Runnable()
    {
      public final void run()
      {
        float f = 0.01F;
        GMTrace.i(15503758196736L, 115512);
        br.this.hZu = ((float)paramJSONObject.optDouble("value"));
        if ((Float.isNaN(br.this.hZu)) || (br.this.hZu < 0.0F) || (br.this.hZu > 1.0F))
        {
          paramj.v(paramInt, br.this.d("fail:value invalid", null));
          w.e("MicroMsg.JsApiSetScreenBrightness", "value invalid");
          GMTrace.o(15503758196736L, 115512);
          return;
        }
        final MMActivity localMMActivity = br.this.a(paramj);
        if (localMMActivity == null)
        {
          paramj.v(paramInt, br.this.d("fail", null));
          w.e("MicroMsg.JsApiSetScreenBrightness", "context is null, invoke fail!");
          GMTrace.o(15503758196736L, 115512);
          return;
        }
        final WindowManager.LayoutParams localLayoutParams = localMMActivity.getWindow().getAttributes();
        if (Float.isNaN(br.this.hZt))
        {
          br.this.hZt = localLayoutParams.screenBrightness;
          c.a(paramj.hyD, new c.b()
          {
            public final void a(c.c paramAnonymous2c)
            {
              GMTrace.i(15485638803456L, 115377);
              localLayoutParams.screenBrightness = br.this.hZt;
              localMMActivity.getWindow().setAttributes(localLayoutParams);
              GMTrace.o(15485638803456L, 115377);
            }
            
            public final void onResume()
            {
              GMTrace.i(15485773021184L, 115378);
              localLayoutParams.screenBrightness = br.this.hZu;
              localMMActivity.getWindow().setAttributes(localLayoutParams);
              GMTrace.o(15485773021184L, 115378);
            }
          });
        }
        if (br.this.hZu < 0.01F) {}
        for (;;)
        {
          localLayoutParams.screenBrightness = f;
          localMMActivity.getWindow().setAttributes(localLayoutParams);
          paramj.v(paramInt, br.this.d("ok", null));
          GMTrace.o(15503758196736L, 115512);
          return;
          f = br.this.hZu;
        }
      }
    });
    GMTrace.o(15482820231168L, 115356);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi;

import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ar
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "measureText";
  
  public ar()
  {
    GMTrace.i(17337977667584L, 129178);
    GMTrace.o(17337977667584L, 129178);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17338111885312L, 129179);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiMeasureText", "measureText, data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(17338111885312L, 129179);
      return;
    }
    String str = paramJSONObject.optString("text");
    int i = paramJSONObject.optInt("fontSize", 16);
    w.i("MicroMsg.JsApiMeasureText", "measureText data:%s", new Object[] { paramJSONObject.toString() });
    if ((TextUtils.isEmpty(str)) || (i <= 0))
    {
      w.e("MicroMsg.JsApiMeasureText", "measureText, param is illegal");
      paramj.v(paramInt, d("fail:param is illegal", null));
      GMTrace.o(17338111885312L, 129179);
      return;
    }
    paramJSONObject = new Paint();
    paramJSONObject.setTextSize(i);
    float f2 = paramJSONObject.measureText(str);
    w.i("MicroMsg.JsApiMeasureText", "strWidth" + f2);
    paramJSONObject = paramJSONObject.getFontMetrics();
    w.i("MicroMsg.JsApiMeasureText", "fontMetrics.bottom:%f, fontMetrics.top:%f", new Object[] { Float.valueOf(paramJSONObject.bottom), Float.valueOf(paramJSONObject.top) });
    float f1 = Math.abs(paramJSONObject.bottom - paramJSONObject.top);
    w.i("MicroMsg.JsApiMeasureText", "height:%f", new Object[] { Float.valueOf(f1) });
    f2 = c.V(f2);
    f1 = c.V(f1);
    paramJSONObject = new HashMap();
    paramJSONObject.put("width", Float.valueOf(f2));
    paramJSONObject.put("height", Float.valueOf(f1));
    w.i("MicroMsg.JsApiMeasureText", "map:%s", new Object[] { paramJSONObject.toString() });
    paramj.v(paramInt, d("ok", paramJSONObject));
    GMTrace.o(17338111885312L, 129179);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
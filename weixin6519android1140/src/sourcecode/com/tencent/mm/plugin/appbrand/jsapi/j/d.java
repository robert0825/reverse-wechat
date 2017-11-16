package com.tencent.mm.plugin.appbrand.jsapi.j;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.appbrand.o.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  public static void a(View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17677548519424L, 131708);
    if ((paramView == null) || (paramJSONObject == null))
    {
      GMTrace.o(17677548519424L, 131708);
      return;
    }
    int i = c.su(paramJSONObject.optString("bgColor"));
    int j = c.su(paramJSONObject.optString("borderColor"));
    float f1 = c.a(paramJSONObject, "borderRadius", 0.0F);
    float f2 = c.a(paramJSONObject, "borderWidth", 0.0F);
    try
    {
      float f3 = (float)paramJSONObject.getDouble("opacity");
      if ((f3 >= 0.0F) && (f3 <= 1.0F)) {
        paramView.setAlpha(f3);
      }
    }
    catch (JSONException localJSONException)
    {
      int k;
      int m;
      int n;
      for (;;) {}
    }
    paramJSONObject = paramJSONObject.optJSONArray("padding");
    if ((paramJSONObject != null) && (paramJSONObject.length() == 4))
    {
      k = c.c(paramJSONObject, 0);
      m = c.c(paramJSONObject, 1);
      n = c.c(paramJSONObject, 2);
      paramView.setPadding(c.c(paramJSONObject, 3), k, m, n);
    }
    paramJSONObject = null;
    if (f2 > 0.0F)
    {
      paramJSONObject = new RectF(f2, f2, f2, f2);
      paramJSONObject = new ShapeDrawable(new RoundRectShape(new float[] { f1, f1, f1, f1, f1, f1, f1, f1 }, paramJSONObject, new float[] { f1, f1, f1, f1, f1, f1, f1, f1 }));
      paramJSONObject.getPaint().setColor(j);
    }
    if (paramJSONObject == null)
    {
      paramView.setBackground(m.g(i, f1));
      GMTrace.o(17677548519424L, 131708);
      return;
    }
    paramView.setBackground(new LayerDrawable(new Drawable[] { m.g(i, f1), paramJSONObject }));
    GMTrace.o(17677548519424L, 131708);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\j\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
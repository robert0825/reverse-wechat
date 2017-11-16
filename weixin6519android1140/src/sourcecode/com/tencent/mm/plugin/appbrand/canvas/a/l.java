package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.canvas.b.a.a;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class l
  implements d
{
  public l()
  {
    GMTrace.i(17708821250048L, 131941);
    GMTrace.o(17708821250048L, 131941);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17709089685504L, 131943);
    if (paramJSONArray.length() < 3)
    {
      GMTrace.o(17709089685504L, 131943);
      return false;
    }
    String str = paramJSONArray.optString(0);
    float f3 = c.b(paramJSONArray, 1);
    float f2 = c.b(paramJSONArray, 2);
    paramJSONArray = paramd.hNM.getFontMetrics();
    float f1;
    if (paramd.hNM.hNX == a.a.hOa) {
      f1 = f2 + Math.abs(paramJSONArray.ascent);
    }
    for (;;)
    {
      paramCanvas.drawText(str, f3, f1, paramd.hNN);
      GMTrace.o(17709089685504L, 131943);
      return true;
      if (paramd.hNM.hNX == a.a.hOc)
      {
        f1 = f2 + Math.abs((-paramJSONArray.ascent + paramJSONArray.descent) / 2.0F - paramJSONArray.descent);
      }
      else
      {
        f1 = f2;
        if (paramd.hNM.hNX == a.a.hOb) {
          f1 = f2 - Math.abs(paramJSONArray.descent);
        }
      }
    }
  }
  
  public final String getMethod()
  {
    GMTrace.i(17708955467776L, 131942);
    GMTrace.o(17708955467776L, 131942);
    return "fillText";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
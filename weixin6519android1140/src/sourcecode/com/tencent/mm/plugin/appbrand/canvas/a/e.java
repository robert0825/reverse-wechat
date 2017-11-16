package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class e
  implements d
{
  public e()
  {
    GMTrace.i(17709223903232L, 131944);
    GMTrace.o(17709223903232L, 131944);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17709492338688L, 131946);
    if (paramJSONArray.length() < 5)
    {
      GMTrace.o(17709492338688L, 131946);
      return false;
    }
    float f1 = c.b(paramJSONArray, 0);
    float f2 = c.b(paramJSONArray, 1);
    float f3 = c.b(paramJSONArray, 2);
    float f4 = (float)paramJSONArray.optDouble(3);
    float f5 = (float)paramJSONArray.optDouble(4);
    paramCanvas.drawArc(new RectF(f1 - f3, f2 - f3, f1 + f3, f3 + f2), (float)(f4 / 3.141592653589793D * 180.0D), (float)(f5 / 3.141592653589793D * 180.0D), true, paramd.hNM);
    GMTrace.o(17709492338688L, 131946);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17709358120960L, 131945);
    GMTrace.o(17709358120960L, 131945);
    return "arc";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
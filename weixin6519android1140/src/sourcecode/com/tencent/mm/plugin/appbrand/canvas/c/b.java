package com.tencent.mm.plugin.appbrand.canvas.c;

import android.graphics.Path;
import android.graphics.RectF;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class b
  implements a
{
  public b()
  {
    GMTrace.i(10206184472576L, 76042);
    GMTrace.o(10206184472576L, 76042);
  }
  
  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    GMTrace.i(10206452908032L, 76044);
    if (paramJSONArray.length() < 5)
    {
      GMTrace.o(10206452908032L, 76044);
      return false;
    }
    float f4 = c.b(paramJSONArray, 0);
    float f5 = c.b(paramJSONArray, 1);
    float f1 = c.b(paramJSONArray, 2);
    float f6 = (float)paramJSONArray.optDouble(3);
    float f7 = (float)paramJSONArray.optDouble(4);
    boolean bool = paramJSONArray.optBoolean(5);
    float f2 = f4 - f1;
    float f3 = f5 - f1;
    f4 += f1;
    f5 += f1;
    f6 = (float)Math.toDegrees(f6);
    float f9 = (float)Math.toDegrees(f7);
    f7 = (float)(360.0D / (6.283185307179586D * f1));
    float f8 = (f9 - f6) % 360.0F;
    if (bool)
    {
      f1 = f6 - f9;
      if ((f8 > f7) || (f8 < -f7)) {
        break label203;
      }
      paramPath.addArc(new RectF(f2, f3, f4, f5), f6, f1);
    }
    for (;;)
    {
      GMTrace.o(10206452908032L, 76044);
      return true;
      f1 = f9 - f6;
      break;
      label203:
      paramPath.arcTo(new RectF(f2, f3, f4, f5), f6, f1, false);
    }
  }
  
  public final String getMethod()
  {
    GMTrace.i(10206318690304L, 76043);
    GMTrace.o(10206318690304L, 76043);
    return "arc";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
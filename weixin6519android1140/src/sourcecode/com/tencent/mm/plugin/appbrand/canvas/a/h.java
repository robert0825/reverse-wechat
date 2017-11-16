package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class h
  implements d
{
  public h()
  {
    GMTrace.i(17713116217344L, 131973);
    GMTrace.o(17713116217344L, 131973);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17713384652800L, 131975);
    if (paramJSONArray.length() < 4)
    {
      GMTrace.o(17713384652800L, 131975);
      return false;
    }
    float f1 = c.b(paramJSONArray, 0);
    float f2 = c.b(paramJSONArray, 1);
    paramCanvas.drawRect(f1, f2, f1 + c.b(paramJSONArray, 2), c.b(paramJSONArray, 3) + f2, paramd.hNM);
    GMTrace.o(17713384652800L, 131975);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17713250435072L, 131974);
    GMTrace.o(17713250435072L, 131974);
    return "strokeRect";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
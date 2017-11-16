package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.c.d.a;
import org.json.JSONArray;

public final class g
  implements d
{
  public g()
  {
    GMTrace.i(17715129483264L, 131988);
    GMTrace.o(17715129483264L, 131988);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17715397918720L, 131990);
    paramCanvas.drawPath(d.a.hOf.d(paramJSONArray), paramd.hNM);
    GMTrace.o(17715397918720L, 131990);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17715263700992L, 131989);
    GMTrace.o(17715263700992L, 131989);
    return "strokePath";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.c.d.a;
import org.json.JSONArray;

public final class c
  implements d
{
  public c()
  {
    GMTrace.i(17714726830080L, 131985);
    GMTrace.o(17714726830080L, 131985);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17714995265536L, 131987);
    paramCanvas.clipPath(d.a.hOf.d(paramJSONArray));
    GMTrace.o(17714995265536L, 131987);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17714861047808L, 131986);
    GMTrace.o(17714861047808L, 131986);
    return "clipPath";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
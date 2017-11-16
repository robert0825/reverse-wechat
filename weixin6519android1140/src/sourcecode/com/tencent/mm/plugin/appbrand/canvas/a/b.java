package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.c.d.a;
import org.json.JSONArray;

public final class b
  implements d
{
  public b()
  {
    GMTrace.i(19999246778368L, 149006);
    GMTrace.o(19999246778368L, 149006);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(19999515213824L, 149008);
    paramCanvas.clipPath(d.a.hOf.d(paramJSONArray));
    GMTrace.o(19999515213824L, 149008);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(19999380996096L, 149007);
    GMTrace.o(19999380996096L, 149007);
    return "clip";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
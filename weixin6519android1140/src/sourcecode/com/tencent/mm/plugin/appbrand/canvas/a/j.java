package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.c.d.a;
import org.json.JSONArray;

public final class j
  implements d
{
  public j()
  {
    GMTrace.i(17716337442816L, 131997);
    GMTrace.o(17716337442816L, 131997);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17716605878272L, 131999);
    paramCanvas.drawPath(d.a.hOf.d(paramJSONArray), paramd.hNN);
    GMTrace.o(17716605878272L, 131999);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17716471660544L, 131998);
    GMTrace.o(17716471660544L, 131998);
    return "fillPath";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class ac
  implements d
{
  public ac()
  {
    GMTrace.i(17716740096000L, 132000);
    GMTrace.o(17716740096000L, 132000);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17717008531456L, 132002);
    if (paramJSONArray.length() < 2)
    {
      GMTrace.o(17717008531456L, 132002);
      return false;
    }
    paramCanvas.translate(c.b(paramJSONArray, 0), c.b(paramJSONArray, 1));
    GMTrace.o(17717008531456L, 132002);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17716874313728L, 132001);
    GMTrace.o(17716874313728L, 132001);
    return "translate";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class k
  implements d
{
  public k()
  {
    GMTrace.i(17713921523712L, 131979);
    GMTrace.o(17713921523712L, 131979);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17714189959168L, 131981);
    if (paramJSONArray.length() < 4)
    {
      GMTrace.o(17714189959168L, 131981);
      return false;
    }
    float f1 = c.b(paramJSONArray, 0);
    float f2 = c.b(paramJSONArray, 1);
    paramCanvas.drawRect(f1, f2, f1 + c.b(paramJSONArray, 2), c.b(paramJSONArray, 3) + f2, paramd.hNN);
    GMTrace.o(17714189959168L, 131981);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17714055741440L, 131980);
    GMTrace.o(17714055741440L, 131980);
    return "fillRect";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
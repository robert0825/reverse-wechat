package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import org.json.JSONArray;

public final class p
  implements d
{
  public p()
  {
    GMTrace.i(17711639822336L, 131962);
    GMTrace.o(17711639822336L, 131962);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17711908257792L, 131964);
    if (paramJSONArray.length() < 2)
    {
      GMTrace.o(17711908257792L, 131964);
      return false;
    }
    paramCanvas.scale((float)paramJSONArray.optDouble(0), (float)paramJSONArray.optDouble(1));
    GMTrace.o(17711908257792L, 131964);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17711774040064L, 131963);
    GMTrace.o(17711774040064L, 131963);
    return "scale";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
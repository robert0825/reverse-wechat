package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import org.json.JSONArray;

public final class n
  implements d
{
  public n()
  {
    GMTrace.i(17708418596864L, 131938);
    GMTrace.o(17708418596864L, 131938);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17708687032320L, 131940);
    if (paramJSONArray.length() <= 0)
    {
      GMTrace.o(17708687032320L, 131940);
      return false;
    }
    paramCanvas.rotate((float)((float)paramJSONArray.optDouble(0) / 3.141592653589793D * 180.0D));
    GMTrace.o(17708687032320L, 131940);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17708552814592L, 131939);
    GMTrace.o(17708552814592L, 131939);
    return "rotate";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
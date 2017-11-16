package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import org.json.JSONArray;

public final class x
  implements d
{
  public x()
  {
    GMTrace.i(17718753361920L, 132015);
    GMTrace.o(17718753361920L, 132015);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17719021797376L, 132017);
    if (paramJSONArray.length() <= 0)
    {
      GMTrace.o(17719021797376L, 132017);
      return false;
    }
    float f = (float)paramJSONArray.optDouble(0);
    paramd.hNN.setStrokeMiter(f);
    paramd.hNM.setStrokeMiter(f);
    GMTrace.o(17719021797376L, 132017);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17718887579648L, 132016);
    GMTrace.o(17718887579648L, 132016);
    return "setMiterLimit";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
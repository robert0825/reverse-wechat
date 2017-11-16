package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class w
  implements d
{
  public w()
  {
    GMTrace.i(17710029209600L, 131950);
    GMTrace.o(17710029209600L, 131950);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17710297645056L, 131952);
    if (paramJSONArray.length() <= 0)
    {
      GMTrace.o(17710297645056L, 131952);
      return false;
    }
    float f = c.b(paramJSONArray, 0);
    paramd.hNN.setStrokeWidth(f);
    paramd.hNM.setStrokeWidth(f);
    GMTrace.o(17710297645056L, 131952);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17710163427328L, 131951);
    GMTrace.o(17710163427328L, 131951);
    return "setLineWidth";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
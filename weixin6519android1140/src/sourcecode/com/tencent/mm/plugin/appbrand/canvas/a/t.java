package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import org.json.JSONArray;

public final class t
  implements d
{
  public t()
  {
    GMTrace.i(17710834515968L, 131956);
    GMTrace.o(17710834515968L, 131956);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17711102951424L, 131958);
    if (paramJSONArray.length() <= 0)
    {
      GMTrace.o(17711102951424L, 131958);
      return false;
    }
    paramCanvas = paramJSONArray.optString(0);
    if ("butt".equalsIgnoreCase(paramCanvas))
    {
      paramd.hNN.setStrokeCap(Paint.Cap.BUTT);
      paramd.hNM.setStrokeCap(Paint.Cap.BUTT);
    }
    for (;;)
    {
      GMTrace.o(17711102951424L, 131958);
      return true;
      if ("round".equalsIgnoreCase(paramCanvas))
      {
        paramd.hNN.setStrokeCap(Paint.Cap.ROUND);
        paramd.hNM.setStrokeCap(Paint.Cap.ROUND);
      }
      else if ("square".equalsIgnoreCase(paramCanvas))
      {
        paramd.hNN.setStrokeCap(Paint.Cap.SQUARE);
        paramd.hNM.setStrokeCap(Paint.Cap.SQUARE);
      }
    }
  }
  
  public final String getMethod()
  {
    GMTrace.i(17710968733696L, 131957);
    GMTrace.o(17710968733696L, 131957);
    return "setLineCap";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
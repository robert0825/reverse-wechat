package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.Paint.Join;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import org.json.JSONArray;

public final class v
  implements d
{
  public v()
  {
    GMTrace.i(17711237169152L, 131959);
    GMTrace.o(17711237169152L, 131959);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17711505604608L, 131961);
    if (paramJSONArray.length() <= 0)
    {
      GMTrace.o(17711505604608L, 131961);
      return false;
    }
    paramCanvas = paramJSONArray.optString(0);
    if ("miter".equalsIgnoreCase(paramCanvas))
    {
      paramd.hNN.setStrokeJoin(Paint.Join.MITER);
      paramd.hNM.setStrokeJoin(Paint.Join.MITER);
    }
    for (;;)
    {
      GMTrace.o(17711505604608L, 131961);
      return true;
      if ("round".equalsIgnoreCase(paramCanvas))
      {
        paramd.hNN.setStrokeJoin(Paint.Join.ROUND);
        paramd.hNM.setStrokeJoin(Paint.Join.ROUND);
      }
      else if ("bevel".equalsIgnoreCase(paramCanvas))
      {
        paramd.hNN.setStrokeJoin(Paint.Join.BEVEL);
        paramd.hNM.setStrokeJoin(Paint.Join.BEVEL);
      }
    }
  }
  
  public final String getMethod()
  {
    GMTrace.i(17711371386880L, 131960);
    GMTrace.o(17711371386880L, 131960);
    return "setLineJoin";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
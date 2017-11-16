package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class y
  implements d
{
  public y()
  {
    GMTrace.i(17712713564160L, 131970);
    GMTrace.o(17712713564160L, 131970);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17712981999616L, 131972);
    if (paramJSONArray.length() < 4)
    {
      GMTrace.o(17712981999616L, 131972);
      return false;
    }
    float f1 = c.b(paramJSONArray, 0);
    float f2 = c.b(paramJSONArray, 1);
    float f3 = c.b(paramJSONArray, 2);
    paramCanvas = paramJSONArray.optJSONArray(3);
    if ((paramCanvas == null) || (paramCanvas.length() < 4))
    {
      GMTrace.o(17712981999616L, 131972);
      return false;
    }
    int i = c.i(paramCanvas);
    paramd.hNN.setShadowLayer(f3, f1, f2, i);
    paramd.hNM.setShadowLayer(f3, f1, f2, i);
    GMTrace.o(17712981999616L, 131972);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17712847781888L, 131971);
    GMTrace.o(17712847781888L, 131971);
    return "setShadow";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
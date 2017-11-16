package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;
import org.json.JSONException;

public final class u
  implements d
{
  public u()
  {
    GMTrace.i(19998844125184L, 149003);
    GMTrace.o(19998844125184L, 149003);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(19999112560640L, 149005);
    if (paramJSONArray.length() < 2)
    {
      GMTrace.o(19999112560640L, 149005);
      return false;
    }
    try
    {
      paramCanvas = paramJSONArray.getJSONArray(0);
      if (paramCanvas == null)
      {
        GMTrace.o(19999112560640L, 149005);
        return false;
      }
      float[] arrayOfFloat = new float[paramCanvas.length()];
      int i = 0;
      while (i < arrayOfFloat.length)
      {
        arrayOfFloat[i] = c.b(paramCanvas, i);
        i += 1;
      }
      float f = c.b(paramJSONArray, 1);
      paramd.hNM.setPathEffect(new DashPathEffect(arrayOfFloat, f));
      GMTrace.o(19999112560640L, 149005);
      return true;
    }
    catch (JSONException paramd)
    {
      GMTrace.o(19999112560640L, 149005);
    }
    return false;
  }
  
  public final String getMethod()
  {
    GMTrace.i(19998978342912L, 149004);
    GMTrace.o(19998978342912L, 149004);
    return "setLineDash";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
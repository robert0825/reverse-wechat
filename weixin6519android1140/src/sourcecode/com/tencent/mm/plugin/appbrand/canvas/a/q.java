package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;

public final class q
  implements d
{
  public q()
  {
    GMTrace.i(17714324176896L, 131982);
    GMTrace.o(17714324176896L, 131982);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17714592612352L, 131984);
    if (paramJSONArray.length() < 2)
    {
      GMTrace.o(17714592612352L, 131984);
      return false;
    }
    paramCanvas = paramJSONArray.optString(0);
    paramd = paramd.hNN;
    float f1;
    float f2;
    float f3;
    float[] arrayOfFloat;
    int i;
    JSONArray localJSONArray;
    if ("linear".equalsIgnoreCase(paramCanvas))
    {
      if (paramJSONArray.length() < 3)
      {
        GMTrace.o(17714592612352L, 131984);
        return false;
      }
      paramCanvas = paramJSONArray.optJSONArray(1);
      if ((paramCanvas == null) || (paramCanvas.length() < 4))
      {
        GMTrace.o(17714592612352L, 131984);
        return false;
      }
      f1 = c.b(paramCanvas, 0);
      f2 = c.b(paramCanvas, 1);
      f3 = c.b(paramCanvas, 2);
      float f4 = c.b(paramCanvas, 3);
      paramCanvas = paramJSONArray.optJSONArray(2);
      if ((paramCanvas == null) || (paramCanvas.length() == 0))
      {
        GMTrace.o(17714592612352L, 131984);
        return false;
      }
      paramJSONArray = new int[paramCanvas.length()];
      arrayOfFloat = new float[paramCanvas.length()];
      i = 0;
      while (i < paramCanvas.length())
      {
        localJSONArray = paramCanvas.optJSONArray(i);
        if (localJSONArray.length() >= 2)
        {
          arrayOfFloat[i] = ((float)localJSONArray.optDouble(0));
          paramJSONArray[i] = c.i(localJSONArray.optJSONArray(1));
        }
        i += 1;
      }
      paramd.setShader(new LinearGradient(f1, f2, f3, f4, paramJSONArray, arrayOfFloat, Shader.TileMode.CLAMP));
    }
    for (;;)
    {
      GMTrace.o(17714592612352L, 131984);
      return true;
      if ("radial".equalsIgnoreCase(paramCanvas))
      {
        if (paramJSONArray.length() < 3)
        {
          GMTrace.o(17714592612352L, 131984);
          return false;
        }
        paramCanvas = paramJSONArray.optJSONArray(1);
        if ((paramCanvas == null) || (paramCanvas.length() < 3))
        {
          GMTrace.o(17714592612352L, 131984);
          return false;
        }
        f1 = c.b(paramCanvas, 0);
        f2 = c.b(paramCanvas, 1);
        f3 = c.b(paramCanvas, 2);
        if (f3 <= 0.0F)
        {
          w.i("MicroMsg.Canvas.SetFillStyleAction", "setFillStyle(radial) failed, sr(%s) <= 0.", new Object[] { Float.valueOf(f3) });
          GMTrace.o(17714592612352L, 131984);
          return false;
        }
        paramCanvas = paramJSONArray.optJSONArray(2);
        paramJSONArray = new int[paramCanvas.length()];
        arrayOfFloat = new float[paramCanvas.length()];
        i = 0;
        while (i < paramCanvas.length())
        {
          localJSONArray = paramCanvas.optJSONArray(i);
          if (localJSONArray.length() >= 2)
          {
            arrayOfFloat[i] = ((float)localJSONArray.optDouble(0));
            paramJSONArray[i] = c.i(localJSONArray.optJSONArray(1));
          }
          i += 1;
        }
        paramd.setShader(new RadialGradient(f1, f2, f3, paramJSONArray, arrayOfFloat, Shader.TileMode.CLAMP));
      }
      else if ("normal".equalsIgnoreCase(paramCanvas))
      {
        paramCanvas = paramJSONArray.optJSONArray(1);
        if ((paramCanvas == null) || (paramCanvas.length() < 4))
        {
          GMTrace.o(17714592612352L, 131984);
          return false;
        }
        paramd.setShader(null);
        paramd.setColor(c.i(paramCanvas));
      }
    }
  }
  
  public final String getMethod()
  {
    GMTrace.i(17714458394624L, 131983);
    GMTrace.o(17714458394624L, 131983);
    return "setFillStyle";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
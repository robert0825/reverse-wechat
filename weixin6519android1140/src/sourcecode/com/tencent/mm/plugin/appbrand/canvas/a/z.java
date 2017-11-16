package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class z
  implements d
{
  public z()
  {
    GMTrace.i(17715934789632L, 131994);
    GMTrace.o(17715934789632L, 131994);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17716203225088L, 131996);
    if (paramJSONArray.length() < 2)
    {
      GMTrace.o(17716203225088L, 131996);
      return false;
    }
    paramCanvas = paramJSONArray.optString(0);
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
        GMTrace.o(17716203225088L, 131996);
        return false;
      }
      paramCanvas = paramJSONArray.optJSONArray(1);
      if ((paramCanvas == null) || (paramCanvas.length() < 4))
      {
        GMTrace.o(17716203225088L, 131996);
        return false;
      }
      f1 = c.b(paramCanvas, 0);
      f2 = c.b(paramCanvas, 1);
      f3 = c.b(paramCanvas, 2);
      float f4 = c.b(paramCanvas, 3);
      paramCanvas = paramJSONArray.optJSONArray(2);
      if ((paramCanvas == null) || (paramCanvas.length() == 0))
      {
        GMTrace.o(17716203225088L, 131996);
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
      paramCanvas = new LinearGradient(f1, f2, f3, f4, paramJSONArray, arrayOfFloat, Shader.TileMode.CLAMP);
      paramd.hNM.setShader(paramCanvas);
    }
    for (;;)
    {
      GMTrace.o(17716203225088L, 131996);
      return true;
      if ("radial".equalsIgnoreCase(paramCanvas))
      {
        if (paramJSONArray.length() < 3)
        {
          GMTrace.o(17716203225088L, 131996);
          return false;
        }
        paramCanvas = paramJSONArray.optJSONArray(1);
        if ((paramCanvas == null) || (paramCanvas.length() < 3))
        {
          GMTrace.o(17716203225088L, 131996);
          return false;
        }
        f1 = c.b(paramCanvas, 1);
        f2 = c.b(paramCanvas, 2);
        f3 = c.b(paramCanvas, 3);
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
        paramCanvas = new RadialGradient(f1, f2, f3, paramJSONArray, arrayOfFloat, Shader.TileMode.CLAMP);
        paramd.hNM.setShader(paramCanvas);
      }
      else if ("normal".equalsIgnoreCase(paramCanvas))
      {
        paramCanvas = paramJSONArray.optJSONArray(1);
        if ((paramCanvas == null) || (paramCanvas.length() < 4))
        {
          GMTrace.o(17716203225088L, 131996);
          return false;
        }
        paramd.hNM.setColor(c.i(paramCanvas));
      }
    }
  }
  
  public final String getMethod()
  {
    GMTrace.i(17716069007360L, 131995);
    GMTrace.o(17716069007360L, 131995);
    return "setStrokeStyle";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
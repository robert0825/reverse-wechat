package com.tencent.mm.plugin.appbrand.canvas.c;

import android.graphics.Path;
import android.graphics.Path.Direction;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class i
  implements a
{
  public i()
  {
    GMTrace.i(10207795085312L, 76054);
    GMTrace.o(10207795085312L, 76054);
  }
  
  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    GMTrace.i(10208063520768L, 76056);
    if (paramJSONArray.length() < 4)
    {
      GMTrace.o(10208063520768L, 76056);
      return false;
    }
    float f1 = c.b(paramJSONArray, 0);
    float f2 = c.b(paramJSONArray, 1);
    paramPath.addRect(f1, f2, f1 + c.b(paramJSONArray, 2), c.b(paramJSONArray, 3) + f2, Path.Direction.CW);
    GMTrace.o(10208063520768L, 76056);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(10207929303040L, 76055);
    GMTrace.o(10207929303040L, 76055);
    return "rect";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
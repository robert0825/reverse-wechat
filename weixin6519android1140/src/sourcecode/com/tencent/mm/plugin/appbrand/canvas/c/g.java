package com.tencent.mm.plugin.appbrand.canvas.c;

import android.graphics.Path;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class g
  implements a
{
  public g()
  {
    GMTrace.i(10204976513024L, 76033);
    GMTrace.o(10204976513024L, 76033);
  }
  
  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    GMTrace.i(10205244948480L, 76035);
    if (paramJSONArray.length() < 2)
    {
      GMTrace.o(10205244948480L, 76035);
      return false;
    }
    paramPath.moveTo(c.b(paramJSONArray, 0), c.b(paramJSONArray, 1));
    GMTrace.o(10205244948480L, 76035);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(10205110730752L, 76034);
    GMTrace.o(10205110730752L, 76034);
    return "moveTo";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
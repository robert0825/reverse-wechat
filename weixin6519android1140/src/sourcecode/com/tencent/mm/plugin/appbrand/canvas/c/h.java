package com.tencent.mm.plugin.appbrand.canvas.c;

import android.graphics.Path;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class h
  implements a
{
  public h()
  {
    GMTrace.i(10205379166208L, 76036);
    GMTrace.o(10205379166208L, 76036);
  }
  
  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    GMTrace.i(10205647601664L, 76038);
    if (paramJSONArray.length() < 4)
    {
      GMTrace.o(10205647601664L, 76038);
      return false;
    }
    paramPath.quadTo(c.b(paramJSONArray, 0), c.b(paramJSONArray, 1), c.b(paramJSONArray, 2), c.b(paramJSONArray, 3));
    GMTrace.o(10205647601664L, 76038);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(10205513383936L, 76037);
    GMTrace.o(10205513383936L, 76037);
    return "quadraticCurveTo";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
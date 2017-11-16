package com.tencent.mm.plugin.appbrand.canvas.c;

import android.graphics.Path;
import com.tencent.gmtrace.GMTrace;
import org.json.JSONArray;

public final class c
  implements a
{
  public c()
  {
    GMTrace.i(10205781819392L, 76039);
    GMTrace.o(10205781819392L, 76039);
  }
  
  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    GMTrace.i(10206050254848L, 76041);
    if (paramJSONArray.length() < 6)
    {
      GMTrace.o(10206050254848L, 76041);
      return false;
    }
    paramPath.cubicTo(com.tencent.mm.plugin.appbrand.n.c.b(paramJSONArray, 0), com.tencent.mm.plugin.appbrand.n.c.b(paramJSONArray, 1), com.tencent.mm.plugin.appbrand.n.c.b(paramJSONArray, 2), com.tencent.mm.plugin.appbrand.n.c.b(paramJSONArray, 3), com.tencent.mm.plugin.appbrand.n.c.b(paramJSONArray, 4), com.tencent.mm.plugin.appbrand.n.c.b(paramJSONArray, 5));
    GMTrace.o(10206050254848L, 76041);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(10205916037120L, 76040);
    GMTrace.o(10205916037120L, 76040);
    return "bezierCurveTo";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
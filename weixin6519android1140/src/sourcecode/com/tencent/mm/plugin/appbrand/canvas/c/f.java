package com.tencent.mm.plugin.appbrand.canvas.c;

import android.graphics.Path;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class f
  implements a
{
  public f()
  {
    GMTrace.i(10207392432128L, 76051);
    GMTrace.o(10207392432128L, 76051);
  }
  
  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    GMTrace.i(10207660867584L, 76053);
    if (paramJSONArray.length() < 2)
    {
      GMTrace.o(10207660867584L, 76053);
      return false;
    }
    paramPath.lineTo(c.b(paramJSONArray, 0), c.b(paramJSONArray, 1));
    GMTrace.o(10207660867584L, 76053);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(10207526649856L, 76052);
    GMTrace.o(10207526649856L, 76052);
    return "lineTo";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.plugin.appbrand.n.c;
import org.json.JSONArray;

public final class r
  implements d
{
  public r()
  {
    GMTrace.i(17709626556416L, 131947);
    GMTrace.o(17709626556416L, 131947);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17709894991872L, 131949);
    if (paramJSONArray.length() <= 0)
    {
      GMTrace.o(17709894991872L, 131949);
      return false;
    }
    int i = c.c(paramJSONArray, 0);
    paramd.hNN.setTextSize(i);
    paramd.hNM.setTextSize(i);
    GMTrace.o(17709894991872L, 131949);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17709760774144L, 131948);
    GMTrace.o(17709760774144L, 131948);
    return "setFontSize";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
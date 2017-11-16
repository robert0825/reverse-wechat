package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a.a;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;

public final class ab
  implements d
{
  public ab()
  {
    GMTrace.i(17712042475520L, 131965);
    GMTrace.o(17712042475520L, 131965);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17712310910976L, 131967);
    if (paramJSONArray.length() <= 0)
    {
      GMTrace.o(17712310910976L, 131967);
      return false;
    }
    paramCanvas = paramJSONArray.optString(0);
    w.i("MicroMsg.SetTextBaselineAction", "SetTextBaselineAction, align:%s", new Object[] { paramCanvas });
    if ("top".equalsIgnoreCase(paramCanvas))
    {
      paramd.hNM.hNX = a.a.hOa;
      paramd.hNN.hNX = a.a.hOa;
    }
    for (;;)
    {
      GMTrace.o(17712310910976L, 131967);
      return true;
      if ("middle".equalsIgnoreCase(paramCanvas))
      {
        paramd.hNM.hNX = a.a.hOc;
        paramd.hNN.hNX = a.a.hOc;
      }
      else if ("bottom".equalsIgnoreCase(paramCanvas))
      {
        paramd.hNM.hNX = a.a.hOb;
        paramd.hNN.hNX = a.a.hOb;
      }
      else if ("normal".equalsIgnoreCase(paramCanvas))
      {
        paramd.hNM.hNX = a.a.hNZ;
        paramd.hNN.hNX = a.a.hNZ;
      }
    }
  }
  
  public final String getMethod()
  {
    GMTrace.i(17712176693248L, 131966);
    GMTrace.o(17712176693248L, 131966);
    return "setTextBaseline";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
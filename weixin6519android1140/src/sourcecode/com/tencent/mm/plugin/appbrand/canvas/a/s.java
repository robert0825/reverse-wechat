package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b.a;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONException;

public final class s
  implements d
{
  public s()
  {
    GMTrace.i(17717948055552L, 132009);
    GMTrace.o(17717948055552L, 132009);
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    GMTrace.i(17718216491008L, 132011);
    try
    {
      int i = paramJSONArray.getInt(0);
      paramd.hNM.N(i / 255.0F);
      paramd.hNN.N(i / 255.0F);
      GMTrace.o(17718216491008L, 132011);
      return true;
    }
    catch (JSONException paramd)
    {
      w.e("MicroMsg.SetGlobalAlphaAction", "getGlobalAlpha value error. exception : %s", new Object[] { paramd });
      GMTrace.o(17718216491008L, 132011);
    }
    return false;
  }
  
  public final String getMethod()
  {
    GMTrace.i(17718082273280L, 132010);
    GMTrace.o(17718082273280L, 132010);
    return "setGlobalAlpha";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
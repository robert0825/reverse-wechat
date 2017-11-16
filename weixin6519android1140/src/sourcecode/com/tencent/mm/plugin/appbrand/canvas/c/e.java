package com.tencent.mm.plugin.appbrand.canvas.c;

import android.graphics.Path;
import com.tencent.gmtrace.GMTrace;
import org.json.JSONArray;

public final class e
  implements a
{
  public e()
  {
    GMTrace.i(10208197738496L, 76057);
    GMTrace.o(10208197738496L, 76057);
  }
  
  public final boolean a(Path paramPath, JSONArray paramJSONArray)
  {
    GMTrace.i(10208466173952L, 76059);
    paramPath.close();
    GMTrace.o(10208466173952L, 76059);
    return true;
  }
  
  public final String getMethod()
  {
    GMTrace.i(10208331956224L, 76058);
    GMTrace.o(10208331956224L, 76058);
    return "closePath";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import org.json.JSONObject;

public final class bc
  extends b
{
  public static final int CTRL_INDEX = 68;
  public static final String NAME = "removeCanvas";
  
  public bc()
  {
    GMTrace.i(10472338227200L, 78025);
    GMTrace.o(10472338227200L, 78025);
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(10472740880384L, 78028);
    int i = paramJSONObject.optInt("canvasId");
    GMTrace.o(10472740880384L, 78028);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
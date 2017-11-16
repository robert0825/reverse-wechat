package com.tencent.mm.plugin.appbrand.jsapi.container;

import com.tencent.gmtrace.GMTrace;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.base.b
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "removeContainer";
  
  public b()
  {
    GMTrace.i(15466043015168L, 115231);
    GMTrace.o(15466043015168L, 115231);
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(15466177232896L, 115232);
    int i = paramJSONObject.getInt("containerId");
    GMTrace.o(15466177232896L, 115232);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\container\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
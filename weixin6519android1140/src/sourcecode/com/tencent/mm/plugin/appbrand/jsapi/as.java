package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.m;
import org.json.JSONObject;

public final class as
  extends a
{
  public static final int CTRL_INDEX = 15;
  public static final String NAME = "navigateBack";
  
  public as()
  {
    GMTrace.i(10304700284928L, 76776);
    GMTrace.o(10304700284928L, 76776);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10304834502656L, 76777);
    int i = paramJSONObject.optInt("delta", 1);
    paramj.hzM.hyJ.jg(i);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(10304834502656L, 76777);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
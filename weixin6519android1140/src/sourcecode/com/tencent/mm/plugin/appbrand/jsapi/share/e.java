package com.tencent.mm.plugin.appbrand.jsapi.share;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.menu.l;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 146;
  public static final String NAME = "showShareMenu";
  
  public e()
  {
    GMTrace.i(18230659776512L, 135829);
    GMTrace.o(18230659776512L, 135829);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(18230793994240L, 135830);
    paramJSONObject = b(paramj);
    if (paramJSONObject != null) {
      paramJSONObject.s(l.isn, false);
    }
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(18230793994240L, 135830);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\share\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
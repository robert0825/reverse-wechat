package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public class ab
  extends k
{
  public static int CTRL_INDEX;
  public static String NAME;
  
  static
  {
    GMTrace.i(10387109969920L, 77390);
    NAME = "getCurrentRoute";
    CTRL_INDEX = 71;
    GMTrace.o(10387109969920L, 77390);
  }
  
  public ab()
  {
    GMTrace.i(10386841534464L, 77388);
    GMTrace.o(10386841534464L, 77388);
  }
  
  public final String a(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(10386975752192L, 77389);
    HashMap localHashMap = new HashMap();
    localHashMap.put("route", paramAppBrandPageView.ivj.hZo);
    w.d("MicroMsg.JsApiGetCurrentRoute", "getCurrentRoute : %s", new Object[] { d("ok", localHashMap) });
    paramAppBrandPageView = d("ok", localHashMap);
    GMTrace.o(10386975752192L, 77389);
    return paramAppBrandPageView;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
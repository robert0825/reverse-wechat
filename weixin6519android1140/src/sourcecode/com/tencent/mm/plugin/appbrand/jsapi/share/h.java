package com.tencent.mm.plugin.appbrand.jsapi.share;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.menu.k;
import com.tencent.mm.plugin.appbrand.menu.l;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import org.json.JSONObject;

public final class h
  extends a
{
  public static final int CTRL_INDEX = 210;
  public static final String NAME = "updateShareMenuShareTicket";
  
  public h()
  {
    GMTrace.i(18236699574272L, 135874);
    GMTrace.o(18236699574272L, 135874);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(18236833792000L, 135875);
    w.i("MicroMsg.JsApiUpdateShareMenuShareTicket", "invoke");
    Object localObject = b(paramj);
    if (localObject != null)
    {
      localObject = ((AppBrandPageView)localObject).jh(l.isn);
      if (localObject == null)
      {
        paramj.v(paramInt, d("fail:menu item do not exist", null));
        GMTrace.o(18236833792000L, 135875);
        return;
      }
      boolean bool = paramJSONObject.optBoolean("withShareTicket", false);
      ((k)localObject).hTC.o("enable_share_with_share_ticket", Boolean.valueOf(bool));
      paramj.v(paramInt, d("ok", null));
      w.i("MicroMsg.JsApiUpdateShareMenuShareTicket", "update share menu withShareTicket(%s)", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(18236833792000L, 135875);
      return;
    }
    paramj.v(paramInt, d("fail", null));
    GMTrace.o(18236833792000L, 135875);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\share\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
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

public final class g
  extends a
{
  public static final int CTRL_INDEX = 211;
  public static final String NAME = "updateShareMenuDynamic";
  
  public g()
  {
    GMTrace.i(18233746784256L, 135852);
    GMTrace.o(18233746784256L, 135852);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(18233881001984L, 135853);
    Object localObject = b(paramj);
    if (localObject != null)
    {
      localObject = ((AppBrandPageView)localObject).jh(l.isn);
      if (localObject == null)
      {
        paramj.v(paramInt, d("fail:menu item do not exist", null));
        GMTrace.o(18233881001984L, 135853);
        return;
      }
      boolean bool = paramJSONObject.optBoolean("isDynamic", false);
      ((k)localObject).hTC.o("enable_share_dynamic", Boolean.valueOf(bool));
      paramj.v(paramInt, d("ok", null));
      w.i("MicroMsg.JsApiUpdateShareMenuDynamic", "update share menu dynamic(%s)", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(18233881001984L, 135853);
      return;
    }
    paramj.v(paramInt, d("fail", null));
    GMTrace.o(18233881001984L, 135853);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\share\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.menu.l;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class al
  extends a
{
  public static final int CTRL_INDEX = 203;
  public static final String NAME = "hideShareMenu";
  
  public al()
  {
    GMTrace.i(14340761583616L, 106847);
    GMTrace.o(14340761583616L, 106847);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14340895801344L, 106848);
    w.i("MicroMsg.JsApiHideShareMenu", "invoke");
    paramJSONObject = b(paramj);
    if (paramJSONObject != null) {
      paramJSONObject.s(l.isn, true);
    }
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(14340895801344L, 106848);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.j.a;
import com.tencent.mm.plugin.appbrand.jsapi.j.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.e;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class cc
  extends c
{
  private static final int CTRL_INDEX = 254;
  public static final String NAME = "updateImageView";
  
  public cc()
  {
    GMTrace.i(17687614849024L, 131783);
    GMTrace.o(17687614849024L, 131783);
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17687883284480L, 131785);
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiUpdateImageView", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(17687883284480L, 131785);
      return false;
    }
    e locale = (e)((CoverViewContainer)paramView).J(e.class);
    if (locale == null)
    {
      w.w("MicroMsg.JsApiUpdateImageView", "the target view(%s) is null", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(17687883284480L, 131785);
      return false;
    }
    d.a(paramView, paramJSONObject.optJSONObject("style"));
    a.a(paramAppBrandPageView, locale, paramJSONObject);
    boolean bool = super.c(paramAppBrandPageView, paramInt, paramView, paramJSONObject);
    GMTrace.o(17687883284480L, 131785);
    return bool;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(17687749066752L, 131784);
    int i = paramJSONObject.getInt("viewId");
    GMTrace.o(17687749066752L, 131784);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
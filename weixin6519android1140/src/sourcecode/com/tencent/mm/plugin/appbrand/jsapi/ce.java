package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.j.a;
import com.tencent.mm.plugin.appbrand.jsapi.j.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.h;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ce
  extends c
{
  private static final int CTRL_INDEX = 254;
  public static final String NAME = "updateTextView";
  
  public ce()
  {
    GMTrace.i(17688420155392L, 131789);
    GMTrace.o(17688420155392L, 131789);
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17688688590848L, 131791);
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiUpdateTextView", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(17688688590848L, 131791);
      return false;
    }
    h localh = (h)((CoverViewContainer)paramView).J(h.class);
    if (localh == null) {
      w.w("MicroMsg.JsApiUpdateTextView", "the target view(%s) is null", new Object[] { Integer.valueOf(paramInt) });
    }
    a.a(localh, paramJSONObject.optJSONObject("label"));
    d.a(paramView, paramJSONObject.optJSONObject("style"));
    boolean bool = super.c(paramAppBrandPageView, paramInt, paramView, paramJSONObject);
    GMTrace.o(17688688590848L, 131791);
    return bool;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(17688554373120L, 131790);
    int i = paramJSONObject.getInt("viewId");
    GMTrace.o(17688554373120L, 131790);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
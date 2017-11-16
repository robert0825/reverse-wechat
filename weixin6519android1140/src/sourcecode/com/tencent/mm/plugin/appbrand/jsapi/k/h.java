package com.tencent.mm.plugin.appbrand.jsapi.k;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import org.json.JSONObject;

public final class h
  extends c
{
  public static final int CTRL_INDEX = 300;
  public static final String NAME = "updateHTMLWebView";
  
  public h()
  {
    GMTrace.i(19755104731136L, 147187);
    GMTrace.o(19755104731136L, 147187);
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(19755238948864L, 147188);
    if (!(paramView instanceof a))
    {
      GMTrace.o(19755238948864L, 147188);
      return false;
    }
    paramAppBrandPageView = paramJSONObject.optString("src", "about:blank");
    w.i("URL", paramAppBrandPageView);
    ((a)paramView).inX.loadUrl(paramAppBrandPageView);
    GMTrace.o(19755238948864L, 147188);
    return true;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(19755373166592L, 147189);
    int i = paramJSONObject.getInt("htmlId");
    GMTrace.o(19755373166592L, 147189);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\k\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
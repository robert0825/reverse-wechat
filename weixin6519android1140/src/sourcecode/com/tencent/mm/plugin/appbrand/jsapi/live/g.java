package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class g
  extends b
{
  private static final int CTRL_INDEX = 362;
  public static final String NAME = "removeLivePusher";
  
  public g()
  {
    GMTrace.i(20730464960512L, 154454);
    GMTrace.o(20730464960512L, 154454);
  }
  
  protected final boolean b(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(20730733395968L, 154456);
    super.b(paramAppBrandPageView, paramInt, paramView, paramJSONObject);
    w.i("MicroMsg.JsApiRemoveLivePusher", "onRemoveView livePusherId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiRemoveLivePusher", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20730733395968L, 154456);
      return false;
    }
    paramAppBrandPageView = ((CoverViewContainer)paramView).J(View.class);
    if (!(paramAppBrandPageView instanceof AppBrandLivePusherView))
    {
      w.e("MicroMsg.JsApiRemoveLivePusher", "targetView not AppBrandLivePusherView");
      GMTrace.o(20730733395968L, 154456);
      return false;
    }
    ((AppBrandLivePusherView)paramAppBrandPageView).ow();
    GMTrace.o(20730733395968L, 154456);
    return true;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(20730599178240L, 154455);
    int i = paramJSONObject.optInt("livePusherId");
    GMTrace.o(20730599178240L, 154455);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
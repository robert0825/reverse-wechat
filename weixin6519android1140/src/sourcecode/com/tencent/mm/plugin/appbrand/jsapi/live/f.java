package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class f
  extends b
{
  private static final int CTRL_INDEX = 366;
  public static final String NAME = "removeLivePlayer";
  
  public f()
  {
    GMTrace.i(20729793871872L, 154449);
    GMTrace.o(20729793871872L, 154449);
  }
  
  protected final boolean b(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(20730062307328L, 154451);
    super.b(paramAppBrandPageView, paramInt, paramView, paramJSONObject);
    w.i("MicroMsg.JsApiRemoveLivePlayer", "onRemoveView livePlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiRemoveLivePlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20730062307328L, 154451);
      return false;
    }
    paramAppBrandPageView = ((CoverViewContainer)paramView).J(View.class);
    if (!(paramAppBrandPageView instanceof AppBrandLivePlayerView))
    {
      w.e("MicroMsg.JsApiRemoveLivePlayer", "targetView not AppBrandLivePlayerView");
      GMTrace.o(20730062307328L, 154451);
      return false;
    }
    ((AppBrandLivePlayerView)paramAppBrandPageView).ow();
    GMTrace.o(20730062307328L, 154451);
    return true;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(20729928089600L, 154450);
    int i = paramJSONObject.optInt("livePlayerId");
    GMTrace.o(20729928089600L, 154450);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class c
  extends b
{
  private static final int CTRL_INDEX = 7;
  public static final String NAME = "removeVideoPlayer";
  
  public c()
  {
    GMTrace.i(17340796239872L, 129199);
    GMTrace.o(17340796239872L, 129199);
  }
  
  protected final boolean b(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17341064675328L, 129201);
    w.i("MicroMsg.JsApiRemoveVideoPlayer", "onRemoveView videoPlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiRemoveVideoPlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(17341064675328L, 129201);
      return false;
    }
    final AppBrandVideoView localAppBrandVideoView = (AppBrandVideoView)((CoverViewContainer)paramView).J(AppBrandVideoView.class);
    if (localAppBrandVideoView == null)
    {
      w.w("MicroMsg.JsApiRemoveVideoPlayer", "onRemoveView not AppBrandVideoView");
      GMTrace.o(17341064675328L, 129201);
      return false;
    }
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17671106068480L, 131660);
        localAppBrandVideoView.clean();
        GMTrace.o(17671106068480L, 131660);
      }
    });
    super.b(paramAppBrandPageView, paramInt, paramView, paramJSONObject);
    GMTrace.o(17341064675328L, 129201);
    return true;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(17340930457600L, 129200);
    int i = paramJSONObject.optInt("videoPlayerId", 0);
    GMTrace.o(17340930457600L, 129200);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\video\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
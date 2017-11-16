package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends c
{
  private static final int CTRL_INDEX = 367;
  public static final String NAME = "operateLivePlayer";
  
  public d()
  {
    GMTrace.i(20733551968256L, 154477);
    GMTrace.o(20733551968256L, 154477);
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(20733820403712L, 154479);
    w.i("MicroMsg.JsApiOperateLivePlayer", "onUpdateView : livePlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiOperateLivePlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20733820403712L, 154479);
      return false;
    }
    paramAppBrandPageView = ((CoverViewContainer)paramView).J(View.class);
    if (!(paramAppBrandPageView instanceof AppBrandLivePlayerView))
    {
      w.e("MicroMsg.JsApiOperateLivePlayer", "targetView not AppBrandLivePlayerView");
      GMTrace.o(20733820403712L, 154479);
      return false;
    }
    paramAppBrandPageView = (AppBrandLivePlayerView)paramAppBrandPageView;
    paramView = paramJSONObject.optString("type");
    w.i("MicroMsg.JsApiOperateLivePlayer", "onUpdateView operateType=%s", new Object[] { paramView });
    paramInt = -1;
    switch (paramView.hashCode())
    {
    }
    for (;;)
    {
      switch (paramInt)
      {
      default: 
        paramJSONObject = paramAppBrandPageView.ifu.qv(paramView);
        w.i("MicroMsg.AppBrandLivePlayerView", "onOperate code:%d info:%s", new Object[] { Integer.valueOf(paramJSONObject.errorCode), paramJSONObject.errorInfo });
        if ((paramView.equalsIgnoreCase("stop")) && (paramJSONObject.errorCode == 0) && (paramAppBrandPageView.ifv != null) && (paramAppBrandPageView.ifv.isFullScreen())) {
          paramAppBrandPageView.setVisibility(0);
        }
        if (paramJSONObject.errorCode != 0) {
          break label525;
        }
        GMTrace.o(20733820403712L, 154479);
        return true;
        if (paramView.equals("requestFullScreen"))
        {
          paramInt = 0;
          continue;
          if (paramView.equals("exitFullScreen")) {
            paramInt = 1;
          }
        }
        break;
      }
    }
    paramInt = 0;
    paramView = paramJSONObject.optJSONArray("data");
    if ((paramView == null) || (paramView.length() == 0)) {
      w.w("MicroMsg.JsApiOperateLivePlayer", "onUpdateView directionArr nil");
    }
    for (;;)
    {
      w.i("MicroMsg.AppBrandLivePlayerView", "enterFullScreen direction:%s", new Object[] { Integer.valueOf(paramInt) });
      if (paramAppBrandPageView.ifv != null) {
        break;
      }
      w.w("MicroMsg.AppBrandLivePlayerView", "enterFullScreen mFullScreenDelegate null");
      GMTrace.o(20733820403712L, 154479);
      return false;
      paramInt = paramView.optInt(0, 0);
    }
    if (paramAppBrandPageView.ifv.isFullScreen())
    {
      w.i("MicroMsg.AppBrandLivePlayerView", "enterFullScreen already full screen");
      GMTrace.o(20733820403712L, 154479);
      return true;
    }
    paramAppBrandPageView.ifv.iE(paramInt);
    paramAppBrandPageView.ifx = paramInt;
    paramAppBrandPageView.cg(true);
    GMTrace.o(20733820403712L, 154479);
    return true;
    w.i("MicroMsg.AppBrandLivePlayerView", "quitFullScreen");
    if (paramAppBrandPageView.ifv == null)
    {
      w.w("MicroMsg.AppBrandLivePlayerView", "quitFullScreen mFullScreenDelegate null");
      GMTrace.o(20733820403712L, 154479);
      return false;
    }
    if (!paramAppBrandPageView.ifv.isFullScreen())
    {
      w.i("MicroMsg.AppBrandLivePlayerView", "quitFullScreen already quit full screen");
      GMTrace.o(20733820403712L, 154479);
      return true;
    }
    paramAppBrandPageView.ifv.WT();
    GMTrace.o(20733820403712L, 154479);
    return true;
    label525:
    GMTrace.o(20733820403712L, 154479);
    return false;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(20733686185984L, 154478);
    int i = paramJSONObject.optInt("livePlayerId");
    GMTrace.o(20733686185984L, 154478);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
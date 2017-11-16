package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class e
  extends c
{
  private static final int CTRL_INDEX = 363;
  public static final String NAME = "operateLivePusher";
  
  public e()
  {
    GMTrace.i(20735431016448L, 154491);
    GMTrace.o(20735431016448L, 154491);
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(20735699451904L, 154493);
    w.i("MicroMsg.JsApiOperateLivePusher", "onUpdateView : livePusherId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiOperateLivePusher", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20735699451904L, 154493);
      return false;
    }
    paramAppBrandPageView = ((CoverViewContainer)paramView).J(View.class);
    if (!(paramAppBrandPageView instanceof AppBrandLivePusherView))
    {
      w.e("MicroMsg.JsApiOperateLivePusher", "targetView not AppBrandLivePusherView");
      GMTrace.o(20735699451904L, 154493);
      return false;
    }
    paramAppBrandPageView = (AppBrandLivePusherView)paramAppBrandPageView;
    paramView = paramJSONObject.optString("type");
    w.i("MicroMsg.JsApiOperateLivePusher", "onUpdateView operateType=%s", new Object[] { paramView });
    paramAppBrandPageView = paramAppBrandPageView.ifz.qw(paramView);
    w.i("MicroMsg.AppBrandLivePusherView", "onOperate code:%d info:%s", new Object[] { Integer.valueOf(paramAppBrandPageView.errorCode), paramAppBrandPageView.errorInfo });
    if (paramAppBrandPageView.errorCode == 0)
    {
      GMTrace.o(20735699451904L, 154493);
      return true;
    }
    GMTrace.o(20735699451904L, 154493);
    return false;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(20735565234176L, 154492);
    int i = paramJSONObject.optInt("livePusherId");
    GMTrace.o(20735565234176L, 154492);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
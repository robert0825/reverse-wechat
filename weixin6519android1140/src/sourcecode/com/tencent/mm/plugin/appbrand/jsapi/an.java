package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.b;
import com.tencent.mm.plugin.appbrand.canvas.g;
import com.tencent.mm.plugin.appbrand.canvas.widget.AppBrandDrawableView;
import com.tencent.mm.plugin.appbrand.canvas.widget.MCanvasView;
import com.tencent.mm.plugin.appbrand.jsapi.base.a;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class an
  extends a
{
  public static final int CTRL_INDEX = 67;
  public static final String NAME = "insertCanvas";
  
  public an()
  {
    GMTrace.i(10396102557696L, 77457);
    GMTrace.o(10396102557696L, 77457);
  }
  
  protected final boolean VT()
  {
    GMTrace.i(10396773646336L, 77462);
    GMTrace.o(10396773646336L, 77462);
    return true;
  }
  
  protected final boolean VU()
  {
    GMTrace.i(10396907864064L, 77463);
    GMTrace.o(10396907864064L, 77463);
    return true;
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(10396236775424L, 77458);
    paramJSONObject = paramAppBrandPageView.mContext;
    AppBrandDrawableView localAppBrandDrawableView = new AppBrandDrawableView(paramJSONObject);
    localAppBrandDrawableView.hOg.hNw.hNS = g.TS();
    localAppBrandDrawableView.oI(paramAppBrandPageView.hyD);
    paramAppBrandPageView = new CoverViewContainer(paramJSONObject, localAppBrandDrawableView);
    GMTrace.o(10396236775424L, 77458);
    return paramAppBrandPageView;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(10396639428608L, 77461);
    int i = paramJSONObject.getInt("canvasId");
    GMTrace.o(10396639428608L, 77461);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.List;
import org.json.JSONObject;

public final class k
  extends com.tencent.mm.plugin.appbrand.jsapi.base.b
{
  public static final int CTRL_INDEX = 3;
  public static final String NAME = "removeMap";
  
  public k()
  {
    GMTrace.i(10450326519808L, 77861);
    GMTrace.o(10450326519808L, 77861);
  }
  
  protected final boolean b(AppBrandPageView paramAppBrandPageView, int paramInt, final View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17386832920576L, 129542);
    paramAppBrandPageView = paramAppBrandPageView.ivh.js(paramInt);
    if (paramAppBrandPageView == null)
    {
      w.i("MicroMsg.JsApiRemoveMap", "KeyValueSet(%s) is null.", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(17386832920576L, 129542);
      return false;
    }
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiRemoveMap", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(17386832920576L, 129542);
      return false;
    }
    try
    {
      paramView = ((c)h.h(c.class)).bE(((CoverViewContainer)paramView).J(View.class));
      paramJSONObject = (List)paramAppBrandPageView.get("markers", null);
      List localList = (List)paramAppBrandPageView.get("converters", null);
      if ((paramJSONObject != null) && (paramJSONObject.size() > 0)) {
        paramJSONObject.clear();
      }
      if ((localList != null) && (localList.size() > 0)) {
        localList.clear();
      }
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10447910600704L, 77843);
          if (paramView != null)
          {
            paramView.getView().setVisibility(8);
            paramView.clean();
          }
          GMTrace.o(10447910600704L, 77843);
        }
      });
      paramAppBrandPageView.recycle();
      GMTrace.o(17386832920576L, 129542);
      return true;
    }
    catch (Exception paramAppBrandPageView)
    {
      w.e("MicroMsg.JsApiRemoveMap", "get SoSoMapView(%s) by id failed, exception : %s", new Object[] { Integer.valueOf(paramInt), paramAppBrandPageView });
      GMTrace.o(17386832920576L, 129542);
    }
    return false;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(10450594955264L, 77863);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10450594955264L, 77863);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiRemoveMap", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10450594955264L, 77863);
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\map\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
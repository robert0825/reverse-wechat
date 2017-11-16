package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.graphics.Color;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 135;
  public static final String NAME = "addMapCircles";
  
  public a()
  {
    GMTrace.i(10449521213440L, 77855);
    GMTrace.o(10449521213440L, 77855);
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(10449923866624L, 77858);
    Object localObject = paramAppBrandPageView.ivh.t(paramInt, false);
    if (localObject == null)
    {
      w.i("MicroMsg.JsApiAddMapCircles", "KeyValueSet(%s) is null.", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10449923866624L, 77858);
      return false;
    }
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiAddMapCircles", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10449923866624L, 77858);
      return false;
    }
    try
    {
      paramView = ((com.tencent.mm.plugin.appbrand.compat.a.c)h.h(com.tencent.mm.plugin.appbrand.compat.a.c.class)).bE(((CoverViewContainer)paramView).J(View.class));
      if (paramView == null)
      {
        w.w("MicroMsg.JsApiAddMapCircles", "MapView(%s) is null", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(10449923866624L, 77858);
        return false;
      }
    }
    catch (Exception paramAppBrandPageView)
    {
      w.e("MicroMsg.JsApiAddMapCircles", "get SoSoMapView(%s) by id failed, exception : %s", new Object[] { Integer.valueOf(paramInt), paramAppBrandPageView });
      GMTrace.o(10449923866624L, 77858);
      return false;
    }
    label504:
    for (;;)
    {
      try
      {
        if (paramJSONObject.has("circles"))
        {
          paramAppBrandPageView = (List)((u.b)localObject).get("map_circle", null);
          if (paramAppBrandPageView != null) {
            break label504;
          }
          paramAppBrandPageView = new ArrayList();
          ((u.b)localObject).o("map_circle", paramAppBrandPageView);
          if (paramAppBrandPageView.size() > 0)
          {
            paramInt = 0;
            if (paramInt < paramAppBrandPageView.size())
            {
              ((b.b)paramAppBrandPageView.get(paramInt)).remove();
              paramInt += 1;
              continue;
            }
            paramAppBrandPageView.clear();
          }
          paramJSONObject = new JSONArray(paramJSONObject.optString("circles"));
          paramInt = 0;
          if (paramInt < paramJSONObject.length())
          {
            localObject = (JSONObject)paramJSONObject.get(paramInt);
            float f1 = bg.getFloat(((JSONObject)localObject).optString("latitude"), 0.0F);
            float f2 = bg.getFloat(((JSONObject)localObject).optString("longitude"), 0.0F);
            int i = com.tencent.mm.plugin.appbrand.n.c.az(((JSONObject)localObject).optString("color", ""), Color.parseColor("#000000"));
            int j = com.tencent.mm.plugin.appbrand.n.c.az(((JSONObject)localObject).optString("fillColor", ""), Color.parseColor("#000000"));
            int k = ((JSONObject)localObject).optInt("radius");
            float f3 = com.tencent.mm.plugin.appbrand.n.c.a((JSONObject)localObject, "strokeWidth", 0.0F);
            localObject = paramView.Uc();
            ((b.c)localObject).d(f1, f2);
            ((b.c)localObject).ii(k);
            ((b.c)localObject).ij(i);
            ((b.c)localObject).ik((int)f3);
            ((b.c)localObject).il(j);
            paramAppBrandPageView.add(paramView.a((b.c)localObject));
            paramInt += 1;
            continue;
          }
        }
        GMTrace.o(10449923866624L, 77858);
      }
      catch (Exception paramAppBrandPageView)
      {
        w.e("MicroMsg.JsApiAddMapCircles", "parse circles error, exception : %s", new Object[] { paramAppBrandPageView });
        GMTrace.o(10449923866624L, 77858);
        return false;
      }
      return true;
    }
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(10449655431168L, 77856);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10449655431168L, 77856);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiAddMapCircles", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10449655431168L, 77856);
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\map\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
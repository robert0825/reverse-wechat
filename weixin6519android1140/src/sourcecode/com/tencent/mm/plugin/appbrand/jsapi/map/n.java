package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.compat.a.b.i;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.o;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 4;
  public static final String NAME = "updateMap";
  
  public n()
  {
    GMTrace.i(10442810327040L, 77805);
    GMTrace.o(10442810327040L, 77805);
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(10443212980224L, 77808);
    Object localObject1 = paramAppBrandPageView.ivh.t(paramInt, false);
    if (localObject1 == null)
    {
      w.i("MicroMsg.JsApiUpdateMap", "KeyValueSet(%s) is null.", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10443212980224L, 77808);
      return false;
    }
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiUpdateMap", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10443212980224L, 77808);
      return false;
    }
    b localb;
    try
    {
      localb = ((com.tencent.mm.plugin.appbrand.compat.a.c)h.h(com.tencent.mm.plugin.appbrand.compat.a.c.class)).bE(((CoverViewContainer)paramView).J(View.class));
      if (localb == null)
      {
        w.w("MicroMsg.JsApiUpdateMap", "MapView(%s) is null", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(10443212980224L, 77808);
        return false;
      }
    }
    catch (Exception paramAppBrandPageView)
    {
      w.e("MicroMsg.JsApiUpdateMap", "get SoSoMapView(%s) by id failed, exception : %s", new Object[] { Integer.valueOf(paramInt), paramAppBrandPageView });
      GMTrace.o(10443212980224L, 77808);
      return false;
    }
    if (paramJSONObject.has("scale")) {
      localb.im(paramJSONObject.optInt("scale", 16));
    }
    label586:
    label596:
    for (;;)
    {
      float f1;
      float f2;
      try
      {
        if (paramJSONObject.has("covers"))
        {
          paramView = (List)((u.b)localObject1).get("converters", null);
          if (paramView != null) {
            break label596;
          }
          paramView = new ArrayList();
          ((u.b)localObject1).o("converters", paramView);
          if (paramView.size() > 0)
          {
            paramInt = 0;
            if (paramInt < paramView.size())
            {
              ((b.h)paramView.get(paramInt)).remove();
              paramInt += 1;
              continue;
            }
            paramView.clear();
          }
          localObject1 = new JSONArray(paramJSONObject.optString("covers"));
          paramInt = 0;
          if (paramInt < ((JSONArray)localObject1).length())
          {
            Object localObject3 = (JSONObject)((JSONArray)localObject1).get(paramInt);
            f1 = bg.getFloat(((JSONObject)localObject3).optString("latitude"), 0.0F);
            f2 = bg.getFloat(((JSONObject)localObject3).optString("longitude"), 0.0F);
            Object localObject2 = ((JSONObject)localObject3).optString("iconPath");
            float f3 = (float)((JSONObject)localObject3).optDouble("rotate", 0.0D);
            localObject3 = localb.Ub();
            ((b.i)localObject3).f(f1, f2);
            localObject2 = o.g(paramAppBrandPageView.hzM, (String)localObject2);
            if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled())) {
              ((b.i)localObject3).p((Bitmap)localObject2);
            }
            ((b.i)localObject3).O(f3);
            localObject2 = localb.a((b.i)localObject3);
            ((b.h)localObject2).oZ("cover");
            paramView.add(localObject2);
            paramInt += 1;
            continue;
          }
        }
        if (!paramJSONObject.has("centerLatitude")) {
          break label586;
        }
      }
      catch (Exception paramAppBrandPageView)
      {
        w.e("MicroMsg.JsApiUpdateMap", "parse covers error, exception : %s", new Object[] { paramAppBrandPageView });
        GMTrace.o(10443212980224L, 77808);
        return false;
      }
      if (paramJSONObject.has("centerLongitude"))
      {
        f1 = bg.getFloat(paramJSONObject.optString("centerLatitude"), 0.0F);
        f2 = bg.getFloat(paramJSONObject.optString("centerLongitude"), 0.0F);
        if ((Math.abs(f1) <= 90.0F) && (Math.abs(f2) <= 180.0F)) {
          localb.setCenter(f1, f2);
        }
      }
      GMTrace.o(10443212980224L, 77808);
      return true;
    }
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(10442944544768L, 77806);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10442944544768L, 77806);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiUpdateMap", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10442944544768L, 77806);
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\map\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
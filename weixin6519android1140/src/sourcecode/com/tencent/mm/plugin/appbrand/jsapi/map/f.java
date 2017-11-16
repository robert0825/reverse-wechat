package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.g;
import com.tencent.mm.plugin.appbrand.compat.a.b.q;
import com.tencent.mm.plugin.appbrand.compat.a.b.r;
import com.tencent.mm.plugin.appbrand.compat.a.c;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "getMapRegion";
  
  public f()
  {
    GMTrace.i(17387369791488L, 129546);
    GMTrace.o(17387369791488L, 129546);
  }
  
  private static int h(JSONObject paramJSONObject)
  {
    GMTrace.i(17387504009216L, 129547);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(17387504009216L, 129547);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiGetMapRegion", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(17387504009216L, 129547);
    }
    return 0;
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17387638226944L, 129548);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetMapRegion", "JsApiGetMapRegion data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(17387638226944L, 129548);
      return;
    }
    Object localObject1 = b(paramj);
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiGetMapRegion", "JsApiGetMapRegion pv is null");
      paramj.v(paramInt, d("fail:pageView is null", null));
      GMTrace.o(17387638226944L, 129548);
      return;
    }
    w.i("MicroMsg.JsApiGetMapRegion", "JsApiGetMapRegion data:%s", new Object[] { paramJSONObject.toString() });
    try
    {
      int i = h(paramJSONObject);
      paramJSONObject = ((AppBrandPageView)localObject1).ivh.jr(i);
      if (paramJSONObject == null)
      {
        w.e("MicroMsg.JsApiGetMapRegion", "view is null");
        paramj.v(paramInt, d("fail:view is null", null));
        GMTrace.o(17387638226944L, 129548);
        return;
      }
      if (!(paramJSONObject instanceof CoverViewContainer))
      {
        w.w("MicroMsg.JsApiGetMapRegion", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(i) });
        GMTrace.o(17387638226944L, 129548);
        return;
      }
      paramJSONObject = ((c)h.h(c.class)).bE(((CoverViewContainer)paramJSONObject).J(View.class));
      if (paramJSONObject == null)
      {
        w.e("MicroMsg.JsApiGetMapRegion", "get SoSoMapView by id failed");
        paramj.v(paramInt, d("fail:mapView is null", null));
        GMTrace.o(17387638226944L, 129548);
        return;
      }
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiGetMapRegion", "get SoSoMapView by id failed, exception : %s", new Object[] { paramJSONObject });
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(17387638226944L, 129548);
      return;
    }
    paramJSONObject = paramJSONObject.Ua().Uk().Ul();
    localObject1 = paramJSONObject.Uf();
    Object localObject2 = paramJSONObject.Ug();
    paramJSONObject = new HashMap();
    paramJSONObject.put("latitude", Double.valueOf(((b.f)localObject1).Uh()));
    paramJSONObject.put("longitude", Double.valueOf(((b.f)localObject1).Ui()));
    localObject1 = new HashMap();
    ((Map)localObject1).put("latitude", Double.valueOf(((b.f)localObject2).Uh()));
    ((Map)localObject1).put("longitude", Double.valueOf(((b.f)localObject2).Ui()));
    localObject2 = new HashMap();
    ((Map)localObject2).put("southwest", paramJSONObject);
    ((Map)localObject2).put("northeast", localObject1);
    w.i("MicroMsg.JsApiGetMapRegion", "getMapRegion ok, values:%s", new Object[] { localObject2.toString() });
    paramj.v(paramInt, d("ok", (Map)localObject2));
    GMTrace.o(17387638226944L, 129548);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\map\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
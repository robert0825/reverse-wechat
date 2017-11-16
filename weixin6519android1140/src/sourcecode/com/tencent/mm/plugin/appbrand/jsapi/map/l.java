package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class l
  extends c
{
  public static final int CTRL_INDEX = 343;
  public static final String NAME = "removeMapMarkers";
  
  public l()
  {
    GMTrace.i(19768526503936L, 147287);
    GMTrace.o(19768526503936L, 147287);
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(19768794939392L, 147289);
    paramAppBrandPageView = paramAppBrandPageView.ivh.t(paramInt, false);
    if (paramAppBrandPageView == null)
    {
      w.e("MicroMsg.JsApiRemoveMapMarkers", "KeyValueSet(%s) is null.", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(19768794939392L, 147289);
      return false;
    }
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiRemoveMapMarkers", "data is null");
      GMTrace.o(19768794939392L, 147289);
      return false;
    }
    w.i("MicroMsg.JsApiRemoveMapMarkers", "removeMapMarkers, data:%s", new Object[] { paramJSONObject.toString() });
    if (paramJSONObject.has("markers"))
    {
      paramAppBrandPageView = (Map)paramAppBrandPageView.get("marker", null);
      if ((paramAppBrandPageView == null) || (paramAppBrandPageView.size() < 0))
      {
        w.e("MicroMsg.JsApiRemoveMapMarkers", "markerMap is empty!");
        GMTrace.o(19768794939392L, 147289);
        return false;
      }
    }
    for (;;)
    {
      try
      {
        paramView = new JSONArray(paramJSONObject.optString("markers"));
        paramInt = 0;
        if (paramInt < paramView.length())
        {
          paramJSONObject = paramView.getString(paramInt);
          b.h localh = (b.h)paramAppBrandPageView.get(paramJSONObject);
          if (localh == null)
          {
            w.e("MicroMsg.JsApiRemoveMapMarkers", "marker id:[%d], isn't exist", new Object[] { paramJSONObject });
          }
          else
          {
            paramAppBrandPageView.remove(paramJSONObject);
            localh.remove();
          }
        }
      }
      catch (JSONException paramAppBrandPageView)
      {
        w.printErrStackTrace("MicroMsg.JsApiRemoveMapMarkers", paramAppBrandPageView, "", new Object[0]);
        GMTrace.o(19768794939392L, 147289);
        return false;
      }
      GMTrace.o(19768794939392L, 147289);
      return true;
      paramInt += 1;
    }
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(19768660721664L, 147288);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(19768660721664L, 147288);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiRemoveMapMarkers", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(19768660721664L, 147288);
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\map\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
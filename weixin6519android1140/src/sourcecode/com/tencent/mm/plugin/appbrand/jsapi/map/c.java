package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.o;
import com.tencent.mm.plugin.appbrand.compat.a.b.p;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.o;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 134;
  public static final String NAME = "addMapLines";
  
  public c()
  {
    GMTrace.i(10440394407936L, 77787);
    GMTrace.o(10440394407936L, 77787);
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(10440797061120L, 77790);
    Object localObject1 = paramAppBrandPageView.ivh.t(paramInt, false);
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiAddMapLines", "KeyValueSet(%s) is null.", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10440797061120L, 77790);
      return false;
    }
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiAddMapLines", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10440797061120L, 77790);
      return false;
    }
    b localb;
    try
    {
      localb = ((com.tencent.mm.plugin.appbrand.compat.a.c)h.h(com.tencent.mm.plugin.appbrand.compat.a.c.class)).bE(((CoverViewContainer)paramView).J(View.class));
      if (paramJSONObject == null)
      {
        w.e("MicroMsg.JsApiAddMapLines", "data is null");
        GMTrace.o(10440797061120L, 77790);
        return false;
      }
    }
    catch (Exception paramAppBrandPageView)
    {
      w.e("MicroMsg.JsApiAddMapLines", "get SoSoMapView(%s) by id failed, exception : %s", new Object[] { Integer.valueOf(paramInt), paramAppBrandPageView });
      GMTrace.o(10440797061120L, 77790);
      return false;
    }
    w.d("MicroMsg.JsApiAddMapLines", "onUpdateView, data:%s", new Object[] { paramJSONObject.toString() });
    label757:
    label780:
    label844:
    label852:
    label862:
    for (;;)
    {
      Object localObject2;
      Object localObject3;
      int j;
      try
      {
        if (!paramJSONObject.has("lines")) {
          break label844;
        }
        paramView = (List)((u.b)localObject1).get("map_line", null);
        if (paramView != null) {
          break label862;
        }
        paramView = new ArrayList();
        ((u.b)localObject1).o("map_line", paramView);
        if (paramView.size() > 0)
        {
          paramInt = 0;
          if (paramInt < paramView.size())
          {
            ((b.o)paramView.get(paramInt)).remove();
            paramInt += 1;
            continue;
          }
          paramView.clear();
        }
        paramJSONObject = new JSONArray(paramJSONObject.optString("lines"));
        int i = 0;
        if (i >= paramJSONObject.length()) {
          break label852;
        }
        localObject2 = (JSONObject)paramJSONObject.get(i);
        localObject1 = new ArrayList();
        localObject3 = new JSONArray(((JSONObject)localObject2).optString("points"));
        paramInt = 0;
        if (paramInt < ((JSONArray)localObject3).length())
        {
          JSONObject localJSONObject = ((JSONArray)localObject3).getJSONObject(paramInt);
          float f1 = bg.getFloat(localJSONObject.optString("latitude"), 0.0F);
          float f2 = bg.getFloat(localJSONObject.optString("longitude"), 0.0F);
          ((List)localObject1).add(localb.e(f1, f2));
          paramInt += 1;
          continue;
        }
        paramInt = com.tencent.mm.plugin.appbrand.n.c.az(((JSONObject)localObject2).optString("color", ""), Color.parseColor("#000000"));
        j = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject2, "width");
        boolean bool1 = ((JSONObject)localObject2).optBoolean("dottedLine", false);
        int k = com.tencent.mm.plugin.appbrand.n.c.az(((JSONObject)localObject2).optString("borderColor", ""), Color.parseColor("#000000"));
        int m = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject2, "borderWidth");
        boolean bool2 = ((JSONObject)localObject2).optBoolean("arrowLine", false);
        localObject3 = ((JSONObject)localObject2).optString("arrowIconPath", "");
        localObject2 = localb.Ud();
        ((b.p)localObject2).a((Iterable)localObject1);
        ((b.p)localObject2).in(paramInt);
        ((b.p)localObject2).io(j);
        ((b.p)localObject2).setDottedLine(bool1);
        ((b.p)localObject2).ip(k);
        ((b.p)localObject2).iq(m);
        if (bool2)
        {
          j = 1;
          if ((bg.nm((String)localObject3)) || (!((String)localObject3).startsWith("wxfile://"))) {
            break label780;
          }
          localObject1 = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(paramAppBrandPageView.hyD, (String)localObject3);
          if ((localObject1 == null) || (TextUtils.isEmpty(((AppBrandLocalMediaObject)localObject1).gpy))) {
            break label757;
          }
          w.d("MicroMsg.JsApiAddMapLines", "fileFullPath:%s", new Object[] { ((AppBrandLocalMediaObject)localObject1).gpy });
          localObject1 = d.decodeFile(((AppBrandLocalMediaObject)localObject1).gpy, null);
          if (localObject1 == null) {
            continue;
          }
          ((b.p)localObject2).q((Bitmap)localObject1);
          paramInt = 0;
          if (paramInt != 0) {
            ((b.p)localObject2).q(BitmapFactory.decodeStream(ab.getContext().getAssets().open("app_brand_map_line_texture_arrow.png")));
          }
        }
        paramView.add(localb.a((b.p)localObject2));
        i += 1;
        continue;
        w.e("MicroMsg.JsApiAddMapLines", "BitmapUtil decode fail, mLocalBitmap is null, use default");
        paramInt = j;
        continue;
      }
      catch (Exception paramAppBrandPageView)
      {
        w.e("MicroMsg.JsApiAddMapLines", "parse lines error, exception : %s", new Object[] { paramAppBrandPageView });
        GMTrace.o(10440797061120L, 77790);
        return false;
      }
      tmp766_763[0] = localObject3;
      w.e("MicroMsg.JsApiAddMapLines", "arrowIconPath:%s, item is null", tmp766_763);
      paramInt = j;
      continue;
      paramInt = j;
      if (!bg.nm((String)localObject3))
      {
        localObject1 = o.g(paramAppBrandPageView.hzM, (String)localObject3);
        if (localObject1 != null)
        {
          paramInt = 0;
          ((b.p)localObject2).q((Bitmap)localObject1);
        }
        else
        {
          w.e("MicroMsg.JsApiAddMapLines", "arrowIconPath:%s, AppBrandPageIconCache.getIcon fail, mLocalBitmap is null", new Object[] { localObject3 });
          paramInt = j;
          continue;
          w.e("MicroMsg.JsApiAddMapLines", "data has not lines info");
          GMTrace.o(10440797061120L, 77790);
          return true;
        }
      }
    }
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(10440528625664L, 77788);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10440528625664L, 77788);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiAddMapLines", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10440528625664L, 77788);
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\map\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
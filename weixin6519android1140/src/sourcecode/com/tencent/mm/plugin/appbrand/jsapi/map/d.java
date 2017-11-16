package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.compat.a.b.e;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.compat.a.b.i;
import com.tencent.mm.plugin.appbrand.compat.a.b.j;
import com.tencent.mm.plugin.appbrand.compat.a.b.l;
import com.tencent.mm.plugin.appbrand.compat.a.b.n;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.o;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 133;
  public static final String NAME = "addMapMarkers";
  public AppBrandPageView idw;
  private com.tencent.mm.plugin.appbrand.compat.a.b igv;
  private a igw;
  public Map<String, String> igx;
  
  public d()
  {
    GMTrace.i(10446299987968L, 77831);
    this.igx = new HashMap();
    GMTrace.o(10446299987968L, 77831);
  }
  
  protected final boolean c(final AppBrandPageView paramAppBrandPageView, final int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(10446702641152L, 77834);
    u.b localb = paramAppBrandPageView.ivh.t(paramInt, false);
    if (localb == null)
    {
      w.e("MicroMsg.JsApiAddMapMarkers", "KeyValueSet(%s) is null.", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10446702641152L, 77834);
      return false;
    }
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiAddMapMarkers", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10446702641152L, 77834);
      return false;
    }
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiAddMapMarkers", "data is null");
      GMTrace.o(10446702641152L, 77834);
      return false;
    }
    w.i("MicroMsg.JsApiAddMapMarkers", "onUpdateView, data:%s", new Object[] { paramJSONObject.toString() });
    this.idw = paramAppBrandPageView;
    this.igv = ((com.tencent.mm.plugin.appbrand.compat.a.c)h.h(com.tencent.mm.plugin.appbrand.compat.a.c.class)).bE(((CoverViewContainer)paramView).J(View.class));
    final Map localMap1 = (Map)localb.get("marker", new HashMap());
    final Map localMap2 = (Map)localb.get("marker_data", new HashMap());
    try
    {
      if (!paramJSONObject.has("markers")) {
        break label1733;
      }
      if (!paramJSONObject.optBoolean("clear", true)) {
        break label297;
      }
      paramView = localMap1.values().iterator();
      while (paramView.hasNext()) {
        ((b.h)paramView.next()).remove();
      }
      localMap1.clear();
    }
    catch (Exception paramAppBrandPageView)
    {
      w.e("MicroMsg.JsApiAddMapMarkers", "parse markers error, exception : %s", new Object[] { paramAppBrandPageView });
      GMTrace.o(10446702641152L, 77834);
      return false;
    }
    localMap2.clear();
    label297:
    paramJSONObject = new JSONArray(paramJSONObject.optString("markers"));
    int i = 0;
    Object localObject1;
    float f1;
    float f2;
    Object localObject4;
    Object localObject2;
    FrameLayout localFrameLayout;
    Object localObject3;
    TextView localTextView;
    label498:
    label657:
    Object localObject5;
    label1019:
    label1147:
    float f3;
    if (i < paramJSONObject.length())
    {
      localObject1 = (JSONObject)paramJSONObject.get(i);
      f1 = bg.getFloat(((JSONObject)localObject1).optString("latitude"), 0.0F);
      f2 = bg.getFloat(((JSONObject)localObject1).optString("longitude"), 0.0F);
      localObject4 = ((JSONObject)localObject1).optString("iconPath");
      localObject2 = this.igv.Ub();
      ((b.i)localObject2).f(f1, f2);
      localFrameLayout = (FrameLayout)((LayoutInflater)paramAppBrandPageView.mContext.getSystemService("layout_inflater")).inflate(o.g.hCV, null);
      localObject3 = (ImageView)localFrameLayout.findViewById(o.f.hBU);
      localTextView = (TextView)localFrameLayout.findViewById(o.f.hBV);
      localFrameLayout.setVisibility(8);
      paramView = null;
      if ((localObject4 != null) && (((String)localObject4).startsWith("wxfile://")))
      {
        localObject4 = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(paramAppBrandPageView.hyD, (String)localObject4);
        if (localObject4 != null) {
          paramView = com.tencent.mm.sdk.platformtools.d.decodeFile(((AppBrandLocalMediaObject)localObject4).gpy, null);
        }
        if (paramView != null)
        {
          m = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject1, "width");
          n = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject1, "height");
          k = n;
          j = m;
          if (m == 0)
          {
            k = n;
            j = m;
            if (n == 0)
            {
              j = com.tencent.mm.plugin.appbrand.n.c.jM(paramView.getWidth());
              k = com.tencent.mm.plugin.appbrand.n.c.jM(paramView.getHeight());
            }
          }
          if ((j <= 0) || (k <= 0) || ((j == paramView.getWidth()) && (k == paramView.getHeight()))) {
            break label1470;
          }
          f1 = j / paramView.getWidth();
          f2 = k / paramView.getHeight();
          localObject4 = new Matrix();
          ((Matrix)localObject4).postScale(f1, f2);
          ((ImageView)localObject3).setImageBitmap(Bitmap.createBitmap(paramView, 0, 0, paramView.getWidth(), paramView.getHeight(), (Matrix)localObject4, true));
        }
        ((ImageView)localObject3).measure(0, 0);
        int k = ((ImageView)localObject3).getMeasuredWidth();
        int j = ((ImageView)localObject3).getMeasuredHeight();
        f1 = 0.5F;
        f2 = 1.0F;
        if (((JSONObject)localObject1).has("anchor"))
        {
          localObject3 = new JSONObject(((JSONObject)localObject1).optString("anchor"));
          f1 = (float)((JSONObject)localObject3).optDouble("x");
          f2 = (float)((JSONObject)localObject3).optDouble("y");
          w.i("MicroMsg.JsApiAddMapMarkers", "anchorObj:%s", new Object[] { ((JSONObject)localObject3).toString() });
        }
        k = (int)(k * f1);
        int m = (int)(j * f2);
        localObject3 = ((JSONObject)localObject1).optString("label");
        if (!bg.nm((String)localObject3))
        {
          localObject4 = new JSONObject((String)localObject3);
          String str = ((JSONObject)localObject4).optString("color");
          j = Color.parseColor("#000000");
          if (!TextUtils.isEmpty(str)) {
            j = com.tencent.mm.plugin.appbrand.n.c.az(str, Color.parseColor("#000000"));
          }
          n = ((JSONObject)localObject4).optInt("fontSize", 0);
          str = ((JSONObject)localObject4).optString("content");
          localObject5 = new GradientDrawable();
          if (((JSONObject)localObject4).has("borderRadius")) {
            ((GradientDrawable)localObject5).setCornerRadius(((JSONObject)localObject4).optInt("borderRadius"));
          }
          if ((((JSONObject)localObject4).has("borderWidth")) && (((JSONObject)localObject4).has("borderColor"))) {
            ((GradientDrawable)localObject5).setStroke(com.tencent.mm.plugin.appbrand.n.c.jM(((JSONObject)localObject4).optInt("borderWidth")), com.tencent.mm.plugin.appbrand.n.c.su(((JSONObject)localObject4).optString("borderColor")));
          }
          ((GradientDrawable)localObject5).setColor(com.tencent.mm.plugin.appbrand.n.c.az(((JSONObject)localObject4).optString("bgColor", ""), Color.parseColor("#000000")));
          localTextView.setBackgroundDrawable((Drawable)localObject5);
          if (!((JSONObject)localObject4).has("textAlign")) {
            break label1539;
          }
          localObject5 = ((JSONObject)localObject4).optString("textAlign", "");
          if (!((String)localObject5).equals("left")) {
            break label1487;
          }
          localTextView.setGravity(3);
          if (((JSONObject)localObject4).has("padding"))
          {
            i1 = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject4, "padding");
            localTextView.setPadding(i1, i1, i1, i1);
          }
          int i1 = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject4, "x");
          int i2 = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject4, "y");
          localTextView.setText(str);
          localTextView.setTextColor(j);
          if (n > 0) {
            localTextView.setTextSize(n);
          }
          ((ViewGroup.MarginLayoutParams)localTextView.getLayoutParams()).setMargins(k + i1, i2 + m, 0, 0);
          localTextView.requestLayout();
        }
        if (paramView == null) {
          break label1550;
        }
        localFrameLayout.setVisibility(0);
        ((b.i)localObject2).bD(localFrameLayout);
        f3 = (float)((JSONObject)localObject1).optDouble("alpha", 1.0D);
        ((b.i)localObject2).O((float)((JSONObject)localObject1).optDouble("rotate", 0.0D));
        ((b.i)localObject2).P(f3);
        if (bg.nm((String)localObject3)) {
          break label1587;
        }
        localFrameLayout.measure(0, 0);
        j = localFrameLayout.getMeasuredWidth();
        int n = localFrameLayout.getMeasuredHeight();
        if ((j <= 0) || (n <= 0)) {
          break label1744;
        }
        f2 = k / j;
        f1 = m / n;
      }
    }
    for (;;)
    {
      ((b.i)localObject2).o(f2, f1);
      label1253:
      paramView = ((JSONObject)localObject1).optString("title");
      if (!bg.nm(paramView)) {
        ((b.i)localObject2).pa(paramView);
      }
      ((b.i)localObject2).f(new Animation() {});
      ((b.i)localObject2).e(new Animation() {});
      paramView = this.igv.a((b.i)localObject2);
      if (((JSONObject)localObject1).has("id")) {
        localMap1.put(((JSONObject)localObject1).optString("id"), paramView);
      }
      for (;;)
      {
        localObject2 = ((JSONObject)localObject1).optString("callout");
        if (!bg.nm((String)localObject2))
        {
          this.igx.put(paramView.getId(), localObject2);
          this.igw = new a();
          this.igv.a(this.igw);
          if (d(paramView)) {
            paramView.showInfoWindow();
          }
        }
        localObject1 = ((JSONObject)localObject1).optString("data");
        localMap2.put(paramView.getId(), localObject1);
        i += 1;
        break;
        paramView = o.g(paramAppBrandPageView.hzM, (String)localObject4);
        break label498;
        label1470:
        ((ImageView)localObject3).setImageBitmap(paramView);
        ((ImageView)localObject3).setScaleType(ImageView.ScaleType.CENTER);
        break label657;
        label1487:
        if (((String)localObject5).equals("right"))
        {
          localTextView.setGravity(5);
          break label1019;
        }
        if (((String)localObject5).equals("center"))
        {
          localTextView.setGravity(17);
          break label1019;
        }
        localTextView.setGravity(8388659);
        break label1019;
        label1539:
        localTextView.setGravity(8388659);
        break label1019;
        label1550:
        if (!bg.nm((String)localObject3))
        {
          localFrameLayout.setVisibility(0);
          ((b.i)localObject2).bD(localFrameLayout);
          break label1147;
        }
        w.e("MicroMsg.JsApiAddMapMarkers", "bitmap is null");
        break label1147;
        label1587:
        ((b.i)localObject2).o(f1, f2);
        break label1253;
        localMap1.put(paramView.hashCode(), paramView);
      }
      if (localMap1.size() > 0)
      {
        localb.o("marker", localMap1);
        localb.o("marker_data", localMap2);
      }
      this.igv.a(new b.j()
      {
        public final void b(b.h paramAnonymoush)
        {
          GMTrace.i(19770539769856L, 147302);
          Object localObject = new d.b();
          String str = bg.nl((String)localMap2.get(paramAnonymoush.getId()));
          paramAnonymoush = new JSONObject();
          try
          {
            paramAnonymoush.put("mapId", paramInt);
            paramAnonymoush.put("data", str);
            localObject = ((d.b)localObject).ai(paramAppBrandPageView.hyD, paramAppBrandPageView.hashCode());
            ((e)localObject).mData = paramAnonymoush.toString();
            ((e)localObject).VR();
            GMTrace.o(19770539769856L, 147302);
            return;
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              w.e("MicroMsg.JsApiAddMapMarkers", "put JSON data error : %s", new Object[] { localJSONException });
            }
          }
        }
      });
      this.igv.a(new b.l()
      {
        public final void Uo()
        {
          GMTrace.i(19770271334400L, 147300);
          if (localMap1 == null)
          {
            w.e("MicroMsg.JsApiAddMapMarkers", "markerMap is null, return");
            GMTrace.o(19770271334400L, 147300);
            return;
          }
          Object localObject2 = new i.c();
          Object localObject1 = new JSONObject();
          try
          {
            ((JSONObject)localObject1).put("mapId", paramInt);
            localObject2 = ((i.c)localObject2).a(paramAppBrandPageView);
            ((e)localObject2).mData = ((JSONObject)localObject1).toString();
            ((e)localObject2).VR();
            localObject1 = localMap1.values().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject2 = (b.h)((Iterator)localObject1).next();
              if ((!d.this.d((b.h)localObject2)) && (((b.h)localObject2).isInfoWindowShown())) {
                ((b.h)localObject2).hideInfoWindow();
              }
            }
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              w.e("MicroMsg.JsApiAddMapMarkers", "put JSON data error : %s", new Object[] { localJSONException });
            }
            GMTrace.o(19770271334400L, 147300);
          }
        }
      });
      this.igv.a(new b.n()
      {
        public final boolean c(b.h paramAnonymoush)
        {
          GMTrace.i(19769063374848L, 147291);
          Object localObject2 = new d.c();
          String str = bg.nl((String)localMap2.get(paramAnonymoush.getId()));
          Object localObject1 = new JSONObject();
          try
          {
            ((JSONObject)localObject1).put("mapId", paramInt);
            ((JSONObject)localObject1).put("data", str);
            localObject2 = ((d.c)localObject2).ai(paramAppBrandPageView.hyD, paramAppBrandPageView.hashCode());
            ((e)localObject2).mData = ((JSONObject)localObject1).toString();
            ((e)localObject2).VR();
            localObject1 = (String)d.this.igx.get(paramAnonymoush.getId());
            if ((bg.nm((String)localObject1)) && (bg.nm(paramAnonymoush.getTitle())) && (bg.nm(paramAnonymoush.getSnippet())))
            {
              w.e("MicroMsg.JsApiAddMapMarkers", "callout and title and snippet is empty, don't show info window");
              GMTrace.o(19769063374848L, 147291);
              return true;
            }
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              w.e("MicroMsg.JsApiAddMapMarkers", "put JSON data error : %s", new Object[] { localJSONException });
            }
            if (!bg.nm((String)localObject1))
            {
              if (!d.this.d(paramAnonymoush))
              {
                if (!paramAnonymoush.isInfoWindowShown()) {
                  paramAnonymoush.showInfoWindow();
                }
                GMTrace.o(19769063374848L, 147291);
                return true;
              }
            }
            else
            {
              if (paramAnonymoush.isInfoWindowShown()) {
                paramAnonymoush.hideInfoWindow();
              }
              for (;;)
              {
                GMTrace.o(19769063374848L, 147291);
                return true;
                paramAnonymoush.showInfoWindow();
              }
            }
            GMTrace.o(19769063374848L, 147291);
          }
          return false;
        }
      });
      for (;;)
      {
        GMTrace.o(10446702641152L, 77834);
        return true;
        label1733:
        w.e("MicroMsg.JsApiAddMapMarkers", "data has not markers");
      }
      label1744:
      f3 = f1;
      f1 = f2;
      f2 = f3;
    }
  }
  
  public final boolean d(b.h paramh)
  {
    GMTrace.i(19770002898944L, 147298);
    paramh = (String)this.igx.get(paramh.getId());
    try
    {
      if (TextUtils.isEmpty(paramh))
      {
        w.e("MicroMsg.JsApiAddMapMarkers", "isShowInfoWindow, callout is empty");
        GMTrace.o(19770002898944L, 147298);
        return false;
      }
      int i = new JSONObject(paramh).optInt("display");
      if (i == 1)
      {
        GMTrace.o(19770002898944L, 147298);
        return true;
      }
    }
    catch (Exception paramh)
    {
      w.printErrStackTrace("MicroMsg.JsApiAddMapMarkers", paramh, "isShowInfoWindow", new Object[0]);
      GMTrace.o(19770002898944L, 147298);
    }
    return false;
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(10446434205696L, 77832);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10446434205696L, 77832);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiAddMapMarkers", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10446434205696L, 77832);
    }
    return 0;
  }
  
  final class a
    implements b.e
  {
    a()
    {
      GMTrace.i(15496242003968L, 115456);
      GMTrace.o(15496242003968L, 115456);
    }
    
    public final View a(b.h paramh)
    {
      GMTrace.i(19768123850752L, 147284);
      paramh = (String)d.this.igx.get(paramh.getId());
      if (!bg.nm(paramh)) {}
      for (;;)
      {
        Object localObject;
        String str;
        try
        {
          paramh = new JSONObject(paramh);
          com.tencent.mm.plugin.appbrand.n.c.az(paramh.optString("shadowColor", ""), Color.parseColor("#000000"));
          paramh.optInt("shadowOpacity");
          paramh.optInt("shadowOffsetX");
          paramh.optInt("shadowOffsetY");
          LinearLayout localLinearLayout = new LinearLayout(d.this.idw.mContext);
          localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
          localLinearLayout.setOrientation(1);
          localLinearLayout.setGravity(17);
          int i = com.tencent.mm.plugin.appbrand.n.c.jM(3);
          localLinearLayout.setPadding(i, i, i, i);
          localObject = new TextView(d.this.idw.mContext);
          str = paramh.optString("color");
          i = Color.parseColor("#000000");
          if (!TextUtils.isEmpty(str)) {
            i = com.tencent.mm.plugin.appbrand.n.c.az(str, Color.parseColor("#000000"));
          }
          if (paramh.has("padding"))
          {
            int j = com.tencent.mm.plugin.appbrand.n.c.b(paramh, "padding");
            ((TextView)localObject).setPadding(j, j, j, j);
          }
          ((TextView)localObject).setTextColor(i);
          if (paramh.has("fontSize")) {
            ((TextView)localObject).setTextSize(paramh.optInt("fontSize"));
          }
          if (paramh.has("content")) {
            ((TextView)localObject).setText(paramh.optString("content"));
          }
          ((TextView)localObject).setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
          if (paramh.has("textAlign"))
          {
            str = paramh.optString("textAlign", "");
            if (str.equals("left")) {
              ((TextView)localObject).setGravity(3);
            }
          }
          else
          {
            localLinearLayout.addView((View)localObject);
            localObject = new com.tencent.mm.plugin.appbrand.widget.e.b();
            if (paramh.has("borderRadius")) {
              ((com.tencent.mm.plugin.appbrand.widget.e.b)localObject).Vl = paramh.optInt("borderRadius");
            }
            i = com.tencent.mm.plugin.appbrand.n.c.az(paramh.optString("bgColor", ""), Color.parseColor("#000000"));
            ((com.tencent.mm.plugin.appbrand.widget.e.b)localObject).mPaint.setColor(i);
            localLinearLayout.setBackgroundDrawable((Drawable)localObject);
            GMTrace.o(19768123850752L, 147284);
            return localLinearLayout;
          }
          if (!str.equals("right")) {
            break label444;
          }
          ((TextView)localObject).setGravity(5);
          continue;
          GMTrace.o(19768123850752L, 147284);
        }
        catch (Exception paramh)
        {
          w.printErrStackTrace("MicroMsg.JsApiAddMapMarkers", paramh, "getInfoWindow", new Object[0]);
        }
        return null;
        label444:
        if (str.equals("center")) {
          ((TextView)localObject).setGravity(17);
        }
      }
    }
  }
  
  private static final class b
    extends e
  {
    private static final int CTRL_INDEX = 199;
    private static final String NAME = "onMapCalloutClick";
    
    public b()
    {
      GMTrace.i(15492752343040L, 115430);
      GMTrace.o(15492752343040L, 115430);
    }
  }
  
  private static final class c
    extends e
  {
    private static final int CTRL_INDEX = 142;
    private static final String NAME = "onMapMarkerClick";
    
    public c()
    {
      GMTrace.i(10445360463872L, 77824);
      GMTrace.o(10445360463872L, 77824);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\map\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
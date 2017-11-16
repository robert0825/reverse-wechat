package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.o;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 140;
  public static final String NAME = "addMapControls";
  
  public b()
  {
    GMTrace.i(10451131826176L, 77867);
    GMTrace.o(10451131826176L, 77867);
  }
  
  protected final boolean c(final AppBrandPageView paramAppBrandPageView, final int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(10451534479360L, 77870);
    final Object localObject2 = paramAppBrandPageView.ivh.t(paramInt, false);
    if (localObject2 == null)
    {
      w.i("MicroMsg.JsApiAddMapControls", "KeyValueSet(%s) is null.", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10451534479360L, 77870);
      return false;
    }
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiAddMapControls", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10451534479360L, 77870);
      return false;
    }
    View localView = ((CoverViewContainer)paramView).J(View.class);
    for (;;)
    {
      int k;
      try
      {
        if (paramJSONObject.has("controls"))
        {
          Object localObject1 = (List)((u.b)localObject2).get("map_controls", null);
          if (localObject1 != null) {
            break label650;
          }
          localObject1 = new ArrayList();
          ((u.b)localObject2).o("map_controls", localObject1);
          int i;
          if (((List)localObject1).size() > 0)
          {
            i = 0;
            if (i < ((List)localObject1).size())
            {
              ((ImageView)((List)localObject1).get(i)).setVisibility(8);
              i += 1;
              continue;
            }
            ((List)localObject1).clear();
          }
          paramJSONObject = new JSONArray(paramJSONObject.optString("controls"));
          k = 0;
          if (k < paramJSONObject.length())
          {
            final Object localObject3 = (JSONObject)paramJSONObject.get(k);
            Object localObject5 = ((JSONObject)localObject3).optString("iconPath");
            boolean bool = ((JSONObject)localObject3).optBoolean("clickable");
            localObject2 = ((JSONObject)localObject3).optString("data");
            int m;
            int n;
            try
            {
              Object localObject4 = ((JSONObject)localObject3).getJSONObject("position");
              m = 0;
              n = 0;
              localObject3 = new ImageView(paramView.getContext());
              if (((String)localObject5).startsWith("wxfile://"))
              {
                localObject5 = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(paramAppBrandPageView.hyD, (String)localObject5);
                i = n;
                j = m;
                if (localObject5 != null)
                {
                  localObject5 = d.decodeFile(((AppBrandLocalMediaObject)localObject5).gpy, null);
                  ((ImageView)localObject3).setImageBitmap((Bitmap)localObject5);
                  i = ((Bitmap)localObject5).getHeight();
                  j = ((Bitmap)localObject5).getWidth();
                }
                if (!((JSONObject)localObject4).has("width")) {
                  break label647;
                }
                j = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject4, "width");
                if (!((JSONObject)localObject4).has("height")) {
                  break label644;
                }
                i = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject4, "height");
                m = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject4, "top");
                n = com.tencent.mm.plugin.appbrand.n.c.b((JSONObject)localObject4, "left");
                localObject4 = (FrameLayout)localView;
                localObject5 = new FrameLayout.LayoutParams(j, i);
                ((FrameLayout.LayoutParams)localObject5).setMargins(n, m, 0, 0);
                ((FrameLayout)localObject4).addView((View)localObject3, (ViewGroup.LayoutParams)localObject5);
                ((List)localObject1).add(localObject3);
                if (!bool) {
                  break label653;
                }
                ((ImageView)localObject3).setOnTouchListener(new View.OnTouchListener()
                {
                  public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
                  {
                    GMTrace.i(10449386995712L, 77854);
                    int i = paramAnonymousMotionEvent.getAction();
                    if (i == 0) {
                      localObject3.setColorFilter(Color.parseColor("#88888888"));
                    }
                    for (;;)
                    {
                      GMTrace.o(10449386995712L, 77854);
                      return false;
                      if ((i == 3) || (i == 1)) {
                        localObject3.clearColorFilter();
                      }
                    }
                  }
                });
                ((ImageView)localObject3).setClickable(true);
                ((ImageView)localObject3).setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymousView)
                  {
                    GMTrace.i(10447105294336L, 77837);
                    Object localObject = new b.a();
                    paramAnonymousView = new JSONObject();
                    try
                    {
                      paramAnonymousView.put("mapId", paramInt);
                      paramAnonymousView.put("data", localObject2);
                      localObject = ((b.a)localObject).a(paramAppBrandPageView);
                      ((e)localObject).mData = paramAnonymousView.toString();
                      ((e)localObject).VR();
                      GMTrace.o(10447105294336L, 77837);
                      return;
                    }
                    catch (JSONException localJSONException)
                    {
                      for (;;)
                      {
                        w.e("MicroMsg.JsApiAddMapControls", "put JSON data error : %s", new Object[] { localJSONException });
                      }
                    }
                  }
                });
              }
            }
            catch (JSONException paramAppBrandPageView)
            {
              w.e("MicroMsg.JsApiAddMapControls", "parse position error, exception : %s", new Object[] { paramAppBrandPageView });
              GMTrace.o(10451534479360L, 77870);
              return false;
            }
            localObject5 = o.g(paramAppBrandPageView.hzM, (String)localObject5);
            i = n;
            int j = m;
            if (localObject5 == null) {
              continue;
            }
            i = n;
            j = m;
            if (((Bitmap)localObject5).isRecycled()) {
              continue;
            }
            ((ImageView)localObject3).setImageBitmap((Bitmap)localObject5);
            i = ((Bitmap)localObject5).getHeight();
            j = ((Bitmap)localObject5).getWidth();
            continue;
          }
        }
        GMTrace.o(10451534479360L, 77870);
      }
      catch (Exception paramAppBrandPageView)
      {
        w.e("MicroMsg.JsApiAddMapControls", "parse circles error, exception : %s", new Object[] { paramAppBrandPageView });
        GMTrace.o(10451534479360L, 77870);
        return false;
      }
      return true;
      label644:
      continue;
      label647:
      continue;
      label650:
      continue;
      label653:
      k += 1;
    }
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(10451266043904L, 77868);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10451266043904L, 77868);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiAddMapControls", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10451266043904L, 77868);
    }
    return 0;
  }
  
  private static final class a
    extends e
  {
    private static final int CTRL_INDEX = 143;
    private static final String NAME = "onMapControlClick";
    
    public a()
    {
      GMTrace.i(10441333932032L, 77794);
      GMTrace.o(10441333932032L, 77794);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\map\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
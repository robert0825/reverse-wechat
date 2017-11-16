package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.os.Looper;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.u.6;
import com.tencent.mm.plugin.appbrand.page.u.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class c
  extends d
{
  public c()
  {
    GMTrace.i(10465627340800L, 77975);
    GMTrace.o(10465627340800L, 77975);
  }
  
  private void a(final com.tencent.mm.plugin.appbrand.jsapi.c paramc, final int paramInt, final AppBrandPageView paramAppBrandPageView, final JSONObject paramJSONObject)
  {
    GMTrace.i(15499731664896L, 115482);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10459453325312L, 77929);
        if (paramAppBrandPageView == null)
        {
          w.w("MicroMsg.BaseUpdateViewJsApi", "page view has been release.");
          paramc.v(paramInt, c.this.d("fail:page is null", null));
          GMTrace.o(10459453325312L, 77929);
          return;
        }
        try
        {
          j = c.this.h(paramJSONObject);
          View localView = paramAppBrandPageView.ivh.jr(j);
          if (localView == null)
          {
            w.w("MicroMsg.BaseUpdateViewJsApi", "get view by viewId(%s) return null.", new Object[] { Integer.valueOf(j) });
            paramc.v(paramInt, c.this.d("fail:got 'null' when get view by the given viewId", null));
            GMTrace.o(10459453325312L, 77929);
            return;
          }
        }
        catch (JSONException localJSONException1)
        {
          paramc.v(paramInt, c.this.d("fail:view id do not exist", null));
          GMTrace.o(10459453325312L, 77929);
          return;
        }
        localObject2 = c.this;
        AppBrandPageView localAppBrandPageView = paramAppBrandPageView;
        Object localObject1 = paramJSONObject;
        if (((c)localObject2).VT()) {}
        for (;;)
        {
          try
          {
            localObject2 = localAppBrandPageView.ivh.t(j, false);
            if (localObject2 != null)
            {
              ((JSONObject)localObject1).getBoolean("disableScroll");
              if (!((u.b)localObject2).gz("isTouching")) {
                continue;
              }
              if (((u.b)localObject2).getBoolean("disableScroll", false) != true) {
                ((u.b)localObject2).q("disableScroll-nextState", true);
              }
            }
          }
          catch (JSONException localJSONException2)
          {
            boolean bool3;
            continue;
            bool1 = ((Boolean)((bb)localObject2).b(localJSONException2.mHandler)).booleanValue();
            continue;
            int i = localJSONException2.iwH;
            continue;
          }
          try
          {
            localObject2 = c.i(paramJSONObject);
            i = c.j(paramJSONObject);
            localObject1 = paramAppBrandPageView.ivh;
            localObject2 = new u.6((u)localObject1, Boolean.valueOf(false), j, (float[])localObject2, i);
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
              continue;
            }
            bool1 = ((Boolean)((bb)localObject2).b(null)).booleanValue();
            localObject1 = paramAppBrandPageView.ivh.jp(j);
            if (localObject1 != null) {
              continue;
            }
            i = 0;
            w.i("MicroMsg.BaseUpdateViewJsApi", "update view(parentId : %s, viewId : %d), ret : %b", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localJSONException1.hashCode()), Boolean.valueOf(bool1) });
          }
          catch (JSONException localJSONException3)
          {
            bool1 = true;
            continue;
            bool2 = c.this.c(paramAppBrandPageView, j, str, paramJSONObject);
            continue;
            str = "fail";
            continue;
          }
          bool3 = c.this.VS();
          bool2 = bool1;
          if (bool1)
          {
            if (!bool3) {
              break label540;
            }
            bool2 = c.this.a(paramAppBrandPageView, j, localJSONException1, paramJSONObject, new g(paramc, paramInt));
          }
          if (!bool3)
          {
            localObject1 = paramc;
            i = paramInt;
            localObject2 = c.this;
            if (!bool2) {
              break label563;
            }
            str = "ok";
            ((com.tencent.mm.plugin.appbrand.jsapi.c)localObject1).v(i, ((com.tencent.mm.plugin.appbrand.jsapi.d)localObject2).d(str, null));
          }
          GMTrace.o(10459453325312L, 77929);
          return;
          ((u.b)localObject2).q("disableScroll", true);
        }
      }
    });
    GMTrace.o(15499731664896L, 115482);
  }
  
  public boolean VS()
  {
    GMTrace.i(15500000100352L, 115484);
    GMTrace.o(15500000100352L, 115484);
    return false;
  }
  
  public boolean VT()
  {
    GMTrace.i(10466298429440L, 77980);
    GMTrace.o(10466298429440L, 77980);
    return false;
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10465761558528L, 77976);
    super.a(paramj, paramJSONObject, paramInt);
    AppBrandPageView localAppBrandPageView = b(paramj);
    if (localAppBrandPageView == null)
    {
      w.w("MicroMsg.BaseUpdateViewJsApi", "invoke JsApi updateView failed, current page view is null.");
      paramj.v(paramInt, d("fail:page is null", null));
      GMTrace.o(10465761558528L, 77976);
      return;
    }
    a(paramj, paramInt, localAppBrandPageView, paramJSONObject);
    GMTrace.o(10465761558528L, 77976);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10465895776256L, 77977);
    super.a(paramAppBrandPageView, paramJSONObject, paramInt);
    a(paramAppBrandPageView, paramInt, paramAppBrandPageView, paramJSONObject);
    GMTrace.o(10465895776256L, 77977);
  }
  
  public boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject, g paramg)
  {
    GMTrace.i(20737310064640L, 154505);
    GMTrace.o(20737310064640L, 154505);
    return true;
  }
  
  public boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(10466029993984L, 77978);
    GMTrace.o(10466029993984L, 77978);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\base\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
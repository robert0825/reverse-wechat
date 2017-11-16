package com.tencent.mm.plugin.appbrand.jsapi.d;

import android.graphics.Rect;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.b;
import com.tencent.mm.plugin.appbrand.widget.input.e;
import com.tencent.mm.plugin.appbrand.widget.input.h.a;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public class f
  extends a<com.tencent.mm.plugin.appbrand.widget.input.b.h>
{
  private static final int CTRL_INDEX = 112;
  private static final String NAME = "updateInput";
  
  public f()
  {
    GMTrace.i(10368319488000L, 77250);
    GMTrace.o(10368319488000L, 77250);
  }
  
  protected final boolean WK()
  {
    GMTrace.i(10368587923456L, 77252);
    GMTrace.o(10368587923456L, 77252);
    return true;
  }
  
  public void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10368453705728L, 77251);
    final com.tencent.mm.plugin.appbrand.widget.input.b.h localh = new com.tencent.mm.plugin.appbrand.widget.input.b.h();
    if (!a(localh, paramJSONObject, paramAppBrandPageView, paramInt))
    {
      GMTrace.o(10368453705728L, 77251);
      return;
    }
    final String str = paramJSONObject.optString("inputId", "");
    if (bg.nm(str))
    {
      paramAppBrandPageView.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(10368453705728L, 77251);
      return;
    }
    if ((localh.iQl != null) && (localh.iQl.intValue() < 0)) {
      localh.iQl = Integer.valueOf(0);
    }
    if ((localh.iQm != null) && (localh.iQm.intValue() < 0)) {
      localh.iQm = Integer.valueOf(0);
    }
    paramJSONObject = paramJSONObject.optString("data", null);
    if (paramJSONObject != null) {
      aZ(str, paramJSONObject);
    }
    com.tencent.mm.plugin.appbrand.o.d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10364695609344L, 77223);
        Object localObject1 = h.a.iLT;
        Object localObject3 = str;
        Object localObject2 = localh;
        if (bg.nm((String)localObject3))
        {
          localObject1 = null;
          if (localObject1 == null) {
            break label195;
          }
          if (((com.tencent.mm.plugin.appbrand.widget.input.b.h)localObject2).iQk != null) {
            ((b)localObject1).sP(((com.tencent.mm.plugin.appbrand.widget.input.b.h)localObject2).iQk);
          }
          ((b)localObject1).a((com.tencent.mm.plugin.appbrand.widget.input.b.h)localObject2);
          localObject2 = ((b)localObject1).ace();
          if (localObject2 != null)
          {
            localObject3 = (AppBrandPageView)((b)localObject1).iKW.get();
            if ((localObject3 != null) && (((AppBrandPageView)localObject3).ivj != null)) {
              break label147;
            }
          }
        }
        label93:
        label147:
        label195:
        for (int i = 1;; i = 0)
        {
          if (i == 0) {
            break label200;
          }
          paramAppBrandPageView.v(paramInt, f.this.d("ok", null));
          GMTrace.o(10364695609344L, 77223);
          return;
          localObject1 = (b)((com.tencent.mm.plugin.appbrand.widget.input.h)localObject1).iLO.get(localObject3);
          break;
          e locale = ((AppBrandPageView)localObject3).ivi;
          if (locale == null) {
            break label93;
          }
          localObject1 = ((b)localObject1).acf();
          locale.b(((AppBrandPageView)localObject3).ivj, (View)localObject2, ((Rect)localObject1).width(), ((Rect)localObject1).height(), ((Rect)localObject1).left, ((Rect)localObject1).top);
          break label93;
        }
        label200:
        if (m.a(localh, str))
        {
          paramAppBrandPageView.v(paramInt, f.this.d("ok", null));
          GMTrace.o(10364695609344L, 77223);
          return;
        }
        paramAppBrandPageView.v(paramInt, f.this.d("fail", null));
        GMTrace.o(10364695609344L, 77223);
      }
    });
    GMTrace.o(10368453705728L, 77251);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
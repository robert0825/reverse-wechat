package com.tencent.mm.plugin.appbrand.jsapi.g;

import android.view.View;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

abstract class c
  extends b
{
  private int hXU;
  WeakReference<AppBrandPageView> ieZ;
  private d ijM;
  
  c()
  {
    GMTrace.i(10381070172160L, 77345);
    GMTrace.o(10381070172160L, 77345);
  }
  
  protected final View Xe()
  {
    GMTrace.i(10381472825344L, 77348);
    if (this.ieZ == null)
    {
      GMTrace.o(10381472825344L, 77348);
      return null;
    }
    LinearLayout localLinearLayout = ((AppBrandPageView)this.ieZ.get()).iuf;
    GMTrace.o(10381472825344L, 77348);
    return localLinearLayout;
  }
  
  final void a(d paramd, AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10381338607616L, 77347);
    this.ijM = paramd;
    this.ieZ = new WeakReference(paramAppBrandPageView);
    this.hXU = paramInt;
    l(paramJSONObject);
    GMTrace.o(10381338607616L, 77347);
  }
  
  final void e(String paramString, Map<String, Object> paramMap)
  {
    GMTrace.i(10381607043072L, 77349);
    if ((this.ieZ != null) && (this.ieZ.get() != null) && (this.ijM != null)) {
      ((AppBrandPageView)this.ieZ.get()).v(this.hXU, this.ijM.d(paramString, paramMap));
    }
    GMTrace.o(10381607043072L, 77349);
  }
  
  abstract void l(JSONObject paramJSONObject);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\g\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
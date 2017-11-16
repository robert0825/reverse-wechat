package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.h;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.c.bus;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

final class bk
  extends a
{
  public static final int CTRL_INDEX = 108;
  public static final String NAME = "reportRealtimeAction";
  
  bk()
  {
    GMTrace.i(10401337049088L, 77496);
    GMTrace.o(10401337049088L, 77496);
  }
  
  private static void a(String paramString, AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(16157666967552L, 120384);
    String str2 = paramJSONObject.optString("actionData");
    String str1 = "";
    paramJSONObject = str1;
    if (paramAppBrandPageView != null)
    {
      paramAppBrandPageView = paramAppBrandPageView.ivj.hZo;
      paramJSONObject = str1;
      if (!bg.nm(paramAppBrandPageView))
      {
        paramJSONObject = str1;
        if (paramAppBrandPageView.contains(".html")) {
          paramJSONObject = paramAppBrandPageView.substring(0, paramAppBrandPageView.lastIndexOf(".html") + 5);
        }
      }
    }
    paramAppBrandPageView = new bus();
    paramAppBrandPageView.jib = 2;
    paramAppBrandPageView.lQa = paramString;
    paramAppBrandPageView.vdd = paramJSONObject;
    paramAppBrandPageView.oqG = 0;
    paramAppBrandPageView.oqH = 0;
    paramAppBrandPageView.vde = str2;
    paramAppBrandPageView.vdg = com.tencent.mm.plugin.appbrand.report.a.bP(ab.getContext());
    paramAppBrandPageView.vdf = h.nZ(paramString).hzG;
    paramString = com.tencent.mm.plugin.appbrand.a.nL(paramString);
    if (paramString != null)
    {
      paramAppBrandPageView.rBN = paramString.scene;
      paramAppBrandPageView.vdi = paramString.eAv;
      paramAppBrandPageView.eVi = paramString.eVi;
      paramAppBrandPageView.eVj = paramString.eVj;
    }
    AppBrandIDKeyBatchReport.a(paramAppBrandPageView);
    GMTrace.o(16157666967552L, 120384);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10401471266816L, 77497);
    a(paramj.hyD, b(paramj), paramJSONObject);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(10401471266816L, 77497);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10401605484544L, 77498);
    a(paramAppBrandPageView.hyD, paramAppBrandPageView, paramJSONObject);
    paramAppBrandPageView.v(paramInt, d("ok", null));
    GMTrace.o(10401605484544L, 77498);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
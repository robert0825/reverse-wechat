package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bj
  extends a
{
  public static final int CTRL_INDEX = 63;
  public static final String NAME = "reportKeyValue";
  
  public bj()
  {
    GMTrace.i(10422677667840L, 77655);
    GMTrace.o(10422677667840L, 77655);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10422811885568L, 77656);
    paramJSONObject = paramJSONObject.optJSONArray("dataArray");
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10422811885568L, 77656);
      return;
    }
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
    if (localAppBrandSysConfig == null)
    {
      w.e("MicroMsg.JsApiReportKeyValue", "config is Null!");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10422811885568L, 77656);
      return;
    }
    int i = 0;
    while (i < paramJSONObject.length())
    {
      try
      {
        Object localObject = paramJSONObject.getJSONObject(i);
        int j = ((JSONObject)localObject).optInt("key");
        localObject = ((JSONObject)localObject).optString("value");
        if ((j > 0) && (!bg.nm((String)localObject))) {
          g.ork.i(j, new Object[] { paramj.hyD, Integer.valueOf(localAppBrandSysConfig.hRg.hKC), Integer.valueOf(localAppBrandSysConfig.hRg.hKB + 1), localObject });
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.JsApiReportKeyValue", "AppBrandService parse report value failed : %s", new Object[] { localException.getMessage() });
        }
      }
      i += 1;
    }
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(10422811885568L, 77656);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10422946103296L, 77657);
    paramJSONObject = paramJSONObject.optJSONArray("dataArray");
    if (paramJSONObject == null)
    {
      paramAppBrandPageView.v(paramInt, d("fail", null));
      GMTrace.o(10422946103296L, 77657);
      return;
    }
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(paramAppBrandPageView.hyD);
    if (localAppBrandSysConfig == null)
    {
      w.e("MicroMsg.JsApiReportKeyValue", "config is Null!");
      paramAppBrandPageView.v(paramInt, d("fail", null));
      GMTrace.o(10422946103296L, 77657);
      return;
    }
    int i = 0;
    while (i < paramJSONObject.length())
    {
      try
      {
        Object localObject = paramJSONObject.getJSONObject(i);
        int j = ((JSONObject)localObject).optInt("key");
        localObject = ((JSONObject)localObject).optString("value");
        if ((j > 0) && (!bg.nm((String)localObject))) {
          g.ork.i(j, new Object[] { paramAppBrandPageView.hyD, Integer.valueOf(localAppBrandSysConfig.hRg.hKC), Integer.valueOf(localAppBrandSysConfig.hRg.hKB + 1), localObject });
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.JsApiReportKeyValue", "AppBrandPageView parse report value failed : %s", new Object[] { localException.getMessage() });
        }
      }
      i += 1;
    }
    paramAppBrandPageView.v(paramInt, d("ok", null));
    GMTrace.o(10422946103296L, 77657);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
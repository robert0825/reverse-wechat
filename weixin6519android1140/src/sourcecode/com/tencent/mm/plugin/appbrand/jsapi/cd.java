package com.tencent.mm.plugin.appbrand.jsapi;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONArray;
import org.json.JSONObject;

final class cd
  extends a
{
  public static final int CTRL_INDEX = 215;
  public static final String NAME = "updatePerfData";
  private static final SparseArray<Integer> hZA;
  
  static
  {
    GMTrace.i(15486712545280L, 115385);
    hZA = new SparseArray();
    GMTrace.o(15486712545280L, 115385);
  }
  
  cd()
  {
    GMTrace.i(15486444109824L, 115383);
    hZA.put("firstRenderTime".hashCode(), Integer.valueOf(301));
    hZA.put("reRenderTime".hashCode(), Integer.valueOf(302));
    hZA.put("webview2AppServiceTotalTime".hashCode(), Integer.valueOf(402));
    hZA.put("webview2AppServiceDataSize".hashCode(), Integer.valueOf(403));
    hZA.put("webview2AppServiceNativeTime".hashCode(), Integer.valueOf(404));
    hZA.put("appService2WebviewTotalTime".hashCode(), Integer.valueOf(405));
    hZA.put("appService2WebviewDataSize".hashCode(), Integer.valueOf(406));
    hZA.put("appService2WebviewNativeTime".hashCode(), Integer.valueOf(407));
    GMTrace.o(15486444109824L, 115383);
  }
  
  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(15486578327552L, 115384);
    paramJSONObject = paramJSONObject.optJSONArray("dataArray");
    if ((!AppBrandPerformanceManager.rZ(paramc.getAppId())) || (paramJSONObject == null))
    {
      paramc.v(paramInt, d("fail", null));
      GMTrace.o(15486578327552L, 115384);
      return;
    }
    int i = 0;
    if (i < paramJSONObject.length())
    {
      Object localObject = paramJSONObject.optJSONObject(i);
      String str;
      if (localObject != null)
      {
        str = ((JSONObject)localObject).optString("key");
        localObject = ((JSONObject)localObject).optString("value");
        if (!bg.nm(str))
        {
          Integer localInteger = (Integer)hZA.get(str.hashCode());
          if (localInteger == null) {
            break label145;
          }
          AppBrandPerformanceManager.l(paramc.getAppId(), localInteger.intValue(), (String)localObject);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        label145:
        AppBrandPerformanceManager.C(paramc.getAppId(), str, (String)localObject);
      }
    }
    paramc.v(paramInt, d("ok", null));
    GMTrace.o(15486578327552L, 115384);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
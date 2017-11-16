package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class bs
  extends a
{
  public static final int CTRL_INDEX = 16;
  public static final String NAME = "setStorage";
  
  public bs()
  {
    GMTrace.i(10328725258240L, 76955);
    GMTrace.o(10328725258240L, 76955);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10328859475968L, 76956);
    String str1 = paramJSONObject.optString("key");
    String str2 = paramJSONObject.optString("data");
    paramJSONObject = paramJSONObject.optString("dataType");
    if (bg.nm(str1))
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10328859475968L, 76956);
      return;
    }
    int j = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD).hRh.hQe;
    int k = str1.length();
    if (str2 == null) {}
    for (int i = 0; i + k > j; i = str2.length())
    {
      paramj.v(paramInt, d("fail:entry size limit reached", null));
      GMTrace.o(10328859475968L, 76956);
      return;
    }
    final JsApiSetStorageTask localJsApiSetStorageTask = new JsApiSetStorageTask();
    localJsApiSetStorageTask.appId = paramj.hyD;
    localJsApiSetStorageTask.x(str1, str2, paramJSONObject);
    localJsApiSetStorageTask.hYr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10425227804672L, 77674);
        paramj.v(paramInt, bs.this.d(localJsApiSetStorageTask.result, null));
        localJsApiSetStorageTask.VN();
        GMTrace.o(10425227804672L, 77674);
      }
    };
    localJsApiSetStorageTask.VM();
    AppBrandMainProcessService.a(localJsApiSetStorageTask);
    GMTrace.o(10328859475968L, 76956);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
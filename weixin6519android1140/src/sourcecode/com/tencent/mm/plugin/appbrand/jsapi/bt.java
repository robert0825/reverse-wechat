package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class bt
  extends k
{
  public static final int CTRL_INDEX = 16;
  public static final String NAME = "setStorageSync";
  
  public bt()
  {
    GMTrace.i(10407376846848L, 77541);
    GMTrace.o(10407376846848L, 77541);
  }
  
  public final String a(j paramj, JSONObject paramJSONObject)
  {
    GMTrace.i(10407511064576L, 77542);
    String str1 = paramJSONObject.optString("key");
    String str2 = paramJSONObject.optString("data");
    String str3 = paramJSONObject.optString("dataType");
    if (bg.nm(str1))
    {
      paramj = d("fail", null);
      GMTrace.o(10407511064576L, 77542);
      return paramj;
    }
    int j = a.nK(paramj.hyD).hRh.hQe;
    int k = str1.length();
    if (str2 == null) {}
    for (int i = 0; i + k > j; i = str2.length())
    {
      paramj = d("fail:entry size limit reached", null);
      GMTrace.o(10407511064576L, 77542);
      return paramj;
    }
    paramJSONObject = "fail";
    JsApiSetStorageTask localJsApiSetStorageTask = new JsApiSetStorageTask();
    localJsApiSetStorageTask.appId = paramj.hyD;
    localJsApiSetStorageTask.x(str1, str2, str3);
    paramj = paramJSONObject;
    if (AppBrandMainProcessService.b(localJsApiSetStorageTask)) {
      paramj = localJsApiSetStorageTask.result;
    }
    paramj = d(paramj, null);
    GMTrace.o(10407511064576L, 77542);
    return paramj;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
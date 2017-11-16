package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.j;
import org.json.JSONObject;

public final class t
  extends k
{
  public static final int CTRL_INDEX = 18;
  public static final String NAME = "clearStorageSync";
  
  public t()
  {
    GMTrace.i(10481196597248L, 78091);
    GMTrace.o(10481196597248L, 78091);
  }
  
  public final String a(j paramj, JSONObject paramJSONObject)
  {
    GMTrace.i(10481330814976L, 78092);
    paramJSONObject = new JsApiClearStorageTask();
    paramJSONObject.appId = paramj.hyD;
    AppBrandMainProcessService.b(paramJSONObject);
    paramj = d("ok", null);
    GMTrace.o(10481330814976L, 78092);
    return paramj;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
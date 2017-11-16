package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.j;
import org.json.JSONObject;

public final class s
  extends a
{
  public static final int CTRL_INDEX = 18;
  public static final String NAME = "clearStorage";
  
  public s()
  {
    GMTrace.i(10359058464768L, 77181);
    GMTrace.o(10359058464768L, 77181);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10359192682496L, 77182);
    paramJSONObject = new JsApiClearStorageTask();
    paramJSONObject.appId = paramj.hyD;
    AppBrandMainProcessService.a(paramJSONObject);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(10359192682496L, 77182);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
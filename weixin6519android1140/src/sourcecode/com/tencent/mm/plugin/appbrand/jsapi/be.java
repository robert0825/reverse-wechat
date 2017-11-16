package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class be
  extends a
{
  public static final int CTRL_INDEX = 98;
  public static final String NAME = "removeStorage";
  
  public be()
  {
    GMTrace.i(10360132206592L, 77189);
    GMTrace.o(10360132206592L, 77189);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10360266424320L, 77190);
    paramJSONObject = paramJSONObject.optString("key");
    if (bg.nm(paramJSONObject))
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10360266424320L, 77190);
      return;
    }
    JsApiRemoveStorageTask localJsApiRemoveStorageTask = new JsApiRemoveStorageTask();
    localJsApiRemoveStorageTask.appId = paramj.hyD;
    localJsApiRemoveStorageTask.amf = paramJSONObject;
    AppBrandMainProcessService.a(localJsApiRemoveStorageTask);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(10360266424320L, 77190);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
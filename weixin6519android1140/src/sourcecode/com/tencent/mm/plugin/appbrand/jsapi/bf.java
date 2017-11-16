package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class bf
  extends k
{
  public static final int CTRL_INDEX = 98;
  public static final String NAME = "removeStorageSync";
  
  public bf()
  {
    GMTrace.i(10295439261696L, 76707);
    GMTrace.o(10295439261696L, 76707);
  }
  
  public final String a(j paramj, JSONObject paramJSONObject)
  {
    GMTrace.i(10295573479424L, 76708);
    paramJSONObject = paramJSONObject.optString("key");
    if (bg.nm(paramJSONObject))
    {
      paramj = d("fail", null);
      GMTrace.o(10295573479424L, 76708);
      return paramj;
    }
    JsApiRemoveStorageTask localJsApiRemoveStorageTask = new JsApiRemoveStorageTask();
    localJsApiRemoveStorageTask.appId = paramj.hyD;
    localJsApiRemoveStorageTask.amf = paramJSONObject;
    AppBrandMainProcessService.b(localJsApiRemoveStorageTask);
    paramj = d("ok", null);
    GMTrace.o(10295573479424L, 76708);
    return paramj;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
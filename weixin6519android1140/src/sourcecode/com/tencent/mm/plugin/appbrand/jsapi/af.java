package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class af
  extends a
{
  public static final int CTRL_INDEX = 17;
  public static final String NAME = "getStorage";
  
  public af()
  {
    GMTrace.i(10431536037888L, 77721);
    GMTrace.o(10431536037888L, 77721);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10431670255616L, 77722);
    final long l = System.currentTimeMillis();
    paramJSONObject = paramJSONObject.optString("key");
    if (bg.nm(paramJSONObject))
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(10431670255616L, 77722);
      return;
    }
    final JsApiGetStorageTask localJsApiGetStorageTask = new JsApiGetStorageTask();
    localJsApiGetStorageTask.appId = paramj.hyD;
    localJsApiGetStorageTask.amf = paramJSONObject;
    localJsApiGetStorageTask.hYr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10359997988864L, 77188);
        String str1;
        HashMap localHashMap;
        if (localJsApiGetStorageTask.value == null)
        {
          str1 = "fail";
          localHashMap = new HashMap();
          if (localJsApiGetStorageTask.value != null) {
            break label152;
          }
          str2 = "";
          label42:
          localHashMap.put("data", str2);
          if (localJsApiGetStorageTask.type != null) {
            break label163;
          }
        }
        label152:
        label163:
        for (String str2 = "";; str2 = localJsApiGetStorageTask.type)
        {
          localHashMap.put("dataType", str2);
          paramj.v(paramInt, af.this.d(str1, localHashMap));
          localJsApiGetStorageTask.VN();
          w.i("MicroMsg.JsApiGetStorage", "getStorage: %s, time: %d", new Object[] { localJsApiGetStorageTask.amf, Long.valueOf(System.currentTimeMillis() - l) });
          GMTrace.o(10359997988864L, 77188);
          return;
          str1 = "ok";
          break;
          str2 = localJsApiGetStorageTask.value;
          break label42;
        }
      }
    };
    localJsApiGetStorageTask.VM();
    AppBrandMainProcessService.a(localJsApiGetStorageTask);
    GMTrace.o(10431670255616L, 77722);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
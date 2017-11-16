package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.j;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ag
  extends a
{
  public static final int CTRL_INDEX = 113;
  public static final String NAME = "getStorageInfo";
  
  public ag()
  {
    GMTrace.i(10323356549120L, 76915);
    GMTrace.o(10323356549120L, 76915);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10323490766848L, 76916);
    paramJSONObject = new JsApiGetStorageInfoTask();
    paramJSONObject.appId = paramj.hyD;
    paramJSONObject.hYr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10409255895040L, 77555);
        HashMap localHashMap = new HashMap();
        localHashMap.put("keys", paramJSONObject.hYz);
        localHashMap.put("currentSize", Integer.valueOf(paramJSONObject.size));
        localHashMap.put("limitSize", Integer.valueOf(paramJSONObject.aCN));
        paramj.v(paramInt, ag.this.d("ok", localHashMap));
        GMTrace.o(10409255895040L, 77555);
      }
    };
    paramJSONObject.VM();
    AppBrandMainProcessService.a(paramJSONObject);
    GMTrace.o(10323490766848L, 76916);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
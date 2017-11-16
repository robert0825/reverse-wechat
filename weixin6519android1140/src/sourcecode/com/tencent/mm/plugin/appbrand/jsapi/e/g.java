package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 270;
  public static final String NAME = "operateDownloadTask";
  
  public g()
  {
    GMTrace.i(17683990970368L, 131756);
    GMTrace.o(17683990970368L, 131756);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17684125188096L, 131757);
    w.d("MicroMsg.JsApiOperateDownloadTask", "JsApiOperateDownloadTask");
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiOperateDownloadTask", "data is null");
      GMTrace.o(17684125188096L, 131757);
      return;
    }
    String str = paramJSONObject.optString("downloadTaskId");
    if (bg.nm(str))
    {
      w.e("MicroMsg.JsApiOperateDownloadTask", "downloadTaskId is null");
      paramj.v(paramInt, d("fail:downloadTaskId is null or nil", null));
      GMTrace.o(17684125188096L, 131757);
      return;
    }
    paramJSONObject = paramJSONObject.optString("operationType");
    if (bg.nm(paramJSONObject))
    {
      w.e("MicroMsg.JsApiOperateDownloadTask", "operationType is null");
      paramj.v(paramInt, d("fail:operationType is null or nil", null));
      GMTrace.o(17684125188096L, 131757);
      return;
    }
    if (paramJSONObject.equals("abort"))
    {
      paramJSONObject = com.tencent.mm.plugin.appbrand.h.b.YP().ro(paramj.hyD);
      if (paramJSONObject == null)
      {
        paramj.v(paramInt, d("fail:no task", null));
        w.w("MicroMsg.JsApiOperateDownloadTask", "download is null");
        GMTrace.o(17684125188096L, 131757);
        return;
      }
      com.tencent.mm.plugin.appbrand.h.a.b localb = paramJSONObject.rl(str);
      if (localb == null)
      {
        paramj.v(paramInt, d("fail:no task", null));
        w.w("MicroMsg.JsApiOperateDownloadTask", "downloadWorker is null %s", new Object[] { str });
        GMTrace.o(17684125188096L, 131757);
        return;
      }
      paramJSONObject.a(localb);
      paramj.v(paramInt, d("ok", null));
      paramJSONObject = new HashMap();
      paramJSONObject.put("downloadTaskId", str);
      paramJSONObject.put("state", "fail");
      paramJSONObject.put("errMsg", "abort");
      paramJSONObject = new JSONObject(paramJSONObject).toString();
      paramj = new c.a().a(paramj);
      paramj.mData = paramJSONObject;
      paramj.VR();
      w.d("MicroMsg.JsApiOperateDownloadTask", "abortTask finish %s", new Object[] { str });
      GMTrace.o(17684125188096L, 131757);
      return;
    }
    paramj.v(paramInt, d("fail:unknown operationType", null));
    GMTrace.o(17684125188096L, 131757);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\e\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
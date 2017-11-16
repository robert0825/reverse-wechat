package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.h.f;
import com.tencent.mm.plugin.appbrand.h.g;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j
  extends a
{
  public static final int CTRL_INDEX = 273;
  public static final String NAME = "operateUploadTask";
  
  public j()
  {
    GMTrace.i(18238175969280L, 135885);
    GMTrace.o(18238175969280L, 135885);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(18238310187008L, 135886);
    w.d("MicroMsg.JsApiOperateUploadTask", "JsApiOperateUploadTask");
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiOperateUploadTask", "data is null");
      GMTrace.o(18238310187008L, 135886);
      return;
    }
    String str = paramJSONObject.optString("uploadTaskId");
    if (bg.nm(str))
    {
      w.e("MicroMsg.JsApiOperateUploadTask", "uploadTaskId is null");
      paramj.v(paramInt, d("fail:uploadTaskId is null or nil", null));
      GMTrace.o(18238310187008L, 135886);
      return;
    }
    paramJSONObject = paramJSONObject.optString("operationType");
    if (bg.nm(paramJSONObject))
    {
      w.e("MicroMsg.JsApiOperateUploadTask", "operationType is null");
      paramj.v(paramInt, d("fail:operationType is null or nil", null));
      GMTrace.o(18238310187008L, 135886);
      return;
    }
    if (paramJSONObject.equals("abort"))
    {
      paramJSONObject = h.YS().rt(paramj.hyD);
      if (paramJSONObject == null)
      {
        w.i("MicroMsg.JsApiOperateUploadTask", "upload is null");
        paramj.v(paramInt, d("fail:no task", null));
        GMTrace.o(18238310187008L, 135886);
        return;
      }
      g localg = paramJSONObject.rs(str);
      if (localg == null)
      {
        w.i("MicroMsg.JsApiOperateUploadTask", "uploadInfo is null %s", new Object[] { str });
        paramj.v(paramInt, d("fail:no task", null));
        GMTrace.o(18238310187008L, 135886);
        return;
      }
      paramJSONObject.a(localg);
      paramj.v(paramInt, d("ok", null));
      paramJSONObject = new HashMap();
      paramJSONObject.put("uploadTaskId", str);
      paramJSONObject.put("state", "fail");
      paramJSONObject.put("errMsg", "abort");
      paramJSONObject = new JSONObject(paramJSONObject).toString();
      paramj = new f.a().a(paramj);
      paramj.mData = paramJSONObject;
      paramj.VR();
      w.d("MicroMsg.JsApiOperateUploadTask", "abortTask finish %s", new Object[] { str });
      GMTrace.o(18238310187008L, 135886);
      return;
    }
    paramj.v(paramInt, d("fail:unknown operationType", null));
    GMTrace.o(18238310187008L, 135886);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\e\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.h.k;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import org.json.JSONObject;

public final class i
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 347;
  public static final String NAME = "operateSocketTask";
  
  public i()
  {
    GMTrace.i(20746973741056L, 154577);
    GMTrace.o(20746973741056L, 154577);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(20747107958784L, 154578);
    w.d("MicroMsg.JsApiOperateSocketTask", "JsApiOperateSocketTask");
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiOperateSocketTask", "data is null");
      GMTrace.o(20747107958784L, 154578);
      return;
    }
    Object localObject = paramJSONObject.optString("socketTaskId");
    if (bg.nm((String)localObject))
    {
      w.e("MicroMsg.JsApiOperateSocketTask", "taskId is null");
      paramj.v(paramInt, d("fail:taskId is null or nil", null));
      GMTrace.o(20747107958784L, 154578);
      return;
    }
    String str = paramJSONObject.optString("operationType");
    if (bg.nm(str))
    {
      w.e("MicroMsg.JsApiOperateSocketTask", "operationType is null");
      paramj.v(paramInt, d("fail:operationType is null or nil", null));
      GMTrace.o(20747107958784L, 154578);
      return;
    }
    com.tencent.mm.plugin.appbrand.h.j localj = k.YU().rA(paramj.hyD);
    if (localj == null)
    {
      paramj.v(paramInt, d("fail:no task", null));
      w.w("MicroMsg.JsApiOperateSocketTask", "client is null");
      GMTrace.o(20747107958784L, 154578);
      return;
    }
    localObject = localj.ry((String)localObject);
    if (localObject == null)
    {
      paramj.v(paramInt, d("fail:taskID not exist", null));
      w.w("MicroMsg.JsApiOperateSocketTask", "webSocketClient is null");
      GMTrace.o(20747107958784L, 154578);
      return;
    }
    if (str.equals("close"))
    {
      int i = paramJSONObject.optInt("code", 1000);
      if ((i != 1000) && ((i < 3000) || (i >= 5000)))
      {
        paramj.v(paramInt, d("fail:The code must be either 1000, or between 3000 and 4999", null));
        GMTrace.o(20747107958784L, 154578);
        return;
      }
      paramJSONObject = paramJSONObject.optString("reason", "");
      localj.a((com.tencent.mm.plugin.appbrand.p.a.a)localObject, i, paramJSONObject);
      paramj.v(paramInt, d("ok", null));
      w.d("MicroMsg.JsApiOperateSocketTask", "closeSocket code %d, reason %s", new Object[] { Integer.valueOf(i), paramJSONObject });
      GMTrace.o(20747107958784L, 154578);
      return;
    }
    if (str.equals("send"))
    {
      if (!com.tencent.mm.plugin.appbrand.h.j.d((com.tencent.mm.plugin.appbrand.p.a.a)localObject))
      {
        paramj.v(paramInt, d("fail", null));
        GMTrace.o(20747107958784L, 154578);
        return;
      }
      paramJSONObject = paramJSONObject.opt("data");
      if (paramJSONObject != null)
      {
        if ((paramJSONObject instanceof ByteBuffer)) {
          com.tencent.mm.plugin.appbrand.h.j.a((com.tencent.mm.plugin.appbrand.p.a.a)localObject, (ByteBuffer)paramJSONObject);
        }
        for (;;)
        {
          paramj.v(paramInt, d("ok", null));
          GMTrace.o(20747107958784L, 154578);
          return;
          if (!(paramJSONObject instanceof String)) {
            break;
          }
          com.tencent.mm.plugin.appbrand.h.j.a((com.tencent.mm.plugin.appbrand.p.a.a)localObject, (String)paramJSONObject);
        }
        w.w("MicroMsg.JsApiOperateSocketTask", "sendSocketMessage error message type wrong");
        paramj.v(paramInt, d("fail:unknown data", null));
        GMTrace.o(20747107958784L, 154578);
        return;
      }
      paramj.v(paramInt, d("fail:message is null or nil", null));
      GMTrace.o(20747107958784L, 154578);
      return;
    }
    paramj.v(paramInt, d("fail:unknown operationType", null));
    GMTrace.o(20747107958784L, 154578);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\e\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
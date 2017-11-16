package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.modelappbrand.LogInfo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import com.tencent.recovery.util.Util;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public e(int paramInt)
  {
    super("log", paramInt);
    GMTrace.i(19926903422976L, 148467);
    GMTrace.o(19926903422976L, 148467);
  }
  
  protected final void a(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    GMTrace.i(20775159463936L, 154787);
    for (;;)
    {
      int i;
      try
      {
        paramJSONObject = paramJSONObject.getJSONArray("dataArray");
        ArrayList localArrayList = new ArrayList(paramJSONObject.length());
        i = 0;
        if (i < paramJSONObject.length())
        {
          JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
          if (localJSONObject != null)
          {
            LogInfo localLogInfo = new LogInfo();
            localLogInfo.gra = localJSONObject.optLong("ts");
            localLogInfo.level = (localJSONObject.optInt("level") + 1);
            localLogInfo.message = localJSONObject.optString("msg");
            localArrayList.add(localLogInfo);
            w.d("MicroMsg.JsApiFunc_Log", "ts : %s, level : %d, msg : %s", new Object[] { Util.fp(localLogInfo.gra), Integer.valueOf(localLogInfo.level), localLogInfo.message });
          }
        }
        else
        {
          com.tencent.mm.plugin.appbrand.dynamic.debugger.a.a(parama.wr().getString("__page_view_id", null), localArrayList);
          parama1.ap(a(true, "", null));
          GMTrace.o(20775159463936L, 154787);
          return;
        }
      }
      catch (JSONException parama)
      {
        parama1.ap(a(false, "dataArray is null", null));
        GMTrace.o(20775159463936L, 154787);
        return;
      }
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
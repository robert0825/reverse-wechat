package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetContext;
import com.tencent.mm.plugin.appbrand.dynamic.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public j(int paramInt)
  {
    super("reportKeyValue", paramInt);
    GMTrace.i(19929587777536L, 148487);
    GMTrace.o(19929587777536L, 148487);
  }
  
  protected final void a(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    GMTrace.i(20776367423488L, 154796);
    parama = h.pI(parama.wr().getString("__page_view_id", null));
    if (parama == null)
    {
      parama1.ap(a(false, "JsApi Framework Context is null", null));
      GMTrace.o(20776367423488L, 154796);
      return;
    }
    paramJSONObject = paramJSONObject.optJSONArray("dataArray");
    if (paramJSONObject == null)
    {
      parama1.ap(a(false, "dataArray is null", null));
      GMTrace.o(20776367423488L, 154796);
      return;
    }
    int i = 0;
    while (i < paramJSONObject.length())
    {
      try
      {
        Object localObject = paramJSONObject.getJSONObject(i);
        int j = ((JSONObject)localObject).optInt("key");
        localObject = ((JSONObject)localObject).optString("value");
        if ((j > 0) && (!bg.nm((String)localObject))) {
          g.ork.i(j, new Object[] { parama.getAppId(), Integer.valueOf(parama.UT()), Integer.valueOf(com.tencent.mm.plugin.appbrand.dynamic.j.a.ix(parama.US()) + 1), localObject });
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.JsApiFunc_ReportKeyValue", "parse report value failed : %s", new Object[] { localException });
        }
      }
      i += 1;
    }
    parama1.ap(a(true, "", null));
    GMTrace.o(20776367423488L, 154796);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
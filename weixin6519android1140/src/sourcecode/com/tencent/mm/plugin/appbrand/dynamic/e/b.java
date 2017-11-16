package com.tencent.mm.plugin.appbrand.dynamic.e;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.jsapi.b.c
{
  public Map<String, String> hUs;
  public String hUt;
  public int hUu;
  public int hUv;
  public String path;
  public String title;
  
  public b()
  {
    super("onCanvasInsert");
    GMTrace.i(17727880167424L, 132083);
    GMTrace.o(17727880167424L, 132083);
  }
  
  b(int paramInt)
  {
    super("onCanvasInsert", paramInt);
    GMTrace.i(19923682197504L, 148443);
    GMTrace.o(19923682197504L, 148443);
  }
  
  public final JSONObject on()
  {
    GMTrace.i(17728014385152L, 132084);
    JSONObject localJSONObject = new JSONObject();
    for (;;)
    {
      try
      {
        localJSONObject.put("title", this.title);
        localJSONObject.put("path", this.path);
        if (this.hUs != null) {
          continue;
        }
        localObject = new HashMap();
        localJSONObject.put("query", new JSONObject((Map)localObject));
        localJSONObject.put("cacheKey", this.hUt);
        localJSONObject.put("width", com.tencent.mm.plugin.appbrand.n.c.jL(this.hUu));
        localJSONObject.put("height", com.tencent.mm.plugin.appbrand.n.c.jL(this.hUv));
      }
      catch (JSONException localJSONException)
      {
        Object localObject;
        continue;
      }
      GMTrace.o(17728014385152L, 132084);
      return localJSONObject;
      localObject = this.hUs;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
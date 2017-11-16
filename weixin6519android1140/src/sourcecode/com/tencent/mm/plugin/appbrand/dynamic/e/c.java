package com.tencent.mm.plugin.appbrand.dynamic.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.jsapi.b.c
{
  public String data;
  
  public c()
  {
    super("onDataPush");
    GMTrace.i(17728148602880L, 132085);
    GMTrace.o(17728148602880L, 132085);
  }
  
  c(int paramInt)
  {
    super("onDataPush", paramInt);
    GMTrace.i(19923413762048L, 148441);
    GMTrace.o(19923413762048L, 148441);
  }
  
  public final JSONObject on()
  {
    GMTrace.i(17728282820608L, 132086);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("data", bg.nl(this.data));
      GMTrace.o(17728282820608L, 132086);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
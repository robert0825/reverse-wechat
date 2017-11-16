package com.tencent.mm.plugin.appbrand.dynamic.d.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.plugin.appbrand.dynamic.g.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  implements com.tencent.mm.jsapi.core.b
{
  private Handler hTS;
  public com.tencent.mm.plugin.appbrand.dynamic.h.a hTT;
  
  public c()
  {
    GMTrace.i(19935761793024L, 148533);
    HandlerThread localHandlerThread = new HandlerThread("JsApiExecutor-Thread:" + hashCode());
    localHandlerThread.start();
    this.hTS = new Handler(localHandlerThread.getLooper());
    GMTrace.o(19935761793024L, 148533);
  }
  
  public static JSONObject pN(String paramString)
  {
    GMTrace.i(19936298663936L, 148537);
    String str = paramString;
    try
    {
      if (bg.nm(paramString)) {
        str = "{}";
      }
      long l = System.nanoTime();
      paramString = com.tencent.mm.u.g.eC(str);
      com.tencent.mm.plugin.appbrand.dynamic.h.b.f(System.nanoTime() - l, str.length());
      GMTrace.o(19936298663936L, 148537);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.DefaultJsApiExecutor", Log.getStackTraceString(paramString));
      GMTrace.o(19936298663936L, 148537);
    }
    return null;
  }
  
  public final String A(String paramString1, String paramString2)
  {
    GMTrace.i(19936432881664L, 148538);
    HashMap localHashMap = new HashMap();
    localHashMap.put("errMsg", paramString1 + ":" + paramString2);
    paramString1 = new JSONObject(localHashMap).toString();
    GMTrace.o(19936432881664L, 148538);
    return paramString1;
  }
  
  public final String a(final com.tencent.mm.jsapi.core.a parama, final com.tencent.mm.jsapi.c.a parama1, final com.tencent.mm.jsapi.b.b paramb, final String paramString, final b.a parama2)
  {
    GMTrace.i(20778112253952L, 154809);
    final String str = paramb.name;
    if (!parama1.eS(paramb.index))
    {
      w.i("MicroMsg.DefaultJsApiExecutor", "JsApiFunc(%s) no permission.", new Object[] { str });
      parama = A(str, "fail:access denied");
      GMTrace.o(20778112253952L, 154809);
      return parama;
    }
    parama1 = com.tencent.mm.plugin.appbrand.n.g.aO(System.nanoTime());
    final boolean bool = d.oV(str);
    com.tencent.mm.plugin.appbrand.collector.c.c("jsapi_draw_canvas", parama1, "start_jsapi_invoke", bool);
    com.tencent.mm.plugin.appbrand.collector.c.aN(parama1, "after_draw_actions");
    if ((paramb instanceof b))
    {
      parama1 = pN(paramString);
      if (parama1 == null)
      {
        parama = A(str, "fail:invalid data");
        GMTrace.o(20778112253952L, 154809);
        return parama;
      }
    }
    for (parama = paramb.a(parama, parama1, parama2);; parama = "")
    {
      if (this.hTT != null) {
        this.hTT.pO(str);
      }
      GMTrace.o(20778112253952L, 154809);
      return parama;
      this.hTS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19936969752576L, 148542);
          com.tencent.mm.plugin.appbrand.collector.c.f(parama1, "parse_json_start", bool);
          JSONObject localJSONObject = c.pN(paramString);
          if (localJSONObject == null)
          {
            parama2.ap(c.this.A(str, "fail:invalid data"));
            GMTrace.o(19936969752576L, 148542);
            return;
          }
          com.tencent.mm.plugin.appbrand.collector.c.f(parama1, "parse_json_end", bool);
          d.a(parama1, paramString, localJSONObject);
          paramb.a(parama, localJSONObject, parama2);
          GMTrace.o(19936969752576L, 148542);
        }
      });
    }
  }
  
  public final String ev(String paramString)
  {
    GMTrace.i(19935896010752L, 148534);
    w.i("MicroMsg.DefaultJsApiExecutor", "JsApiFunc(%s) do not exist.", new Object[] { paramString });
    paramString = A(paramString, "fail:not supported");
    GMTrace.o(19935896010752L, 148534);
    return paramString;
  }
  
  public final void quit()
  {
    GMTrace.i(19936164446208L, 148536);
    this.hTS.getLooper().quit();
    if (this.hTT != null) {
      this.hTT.rw();
    }
    GMTrace.o(19936164446208L, 148536);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
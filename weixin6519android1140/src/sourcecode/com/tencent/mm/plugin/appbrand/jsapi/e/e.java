package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.b.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.h.j.a;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class e
  extends com.tencent.mm.plugin.appbrand.jsapi.k
{
  public static final int CTRL_INDEX = 346;
  public static final String NAME = "createSocketTask";
  
  public e()
  {
    GMTrace.i(20745497346048L, 154566);
    GMTrace.o(20745497346048L, 154566);
  }
  
  public final String a(final com.tencent.mm.plugin.appbrand.j paramj, JSONObject paramJSONObject)
  {
    GMTrace.i(20745631563776L, 154567);
    com.tencent.mm.plugin.appbrand.h.k.YU();
    final int j = com.tencent.mm.plugin.appbrand.h.k.YO();
    Object localObject2 = com.tencent.mm.plugin.appbrand.h.k.YU().rA(paramj.hyD);
    final Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject3 = b(paramj);
      localObject2 = null;
      localObject1 = localObject2;
      if (localObject3 != null)
      {
        localObject1 = localObject2;
        if (((AppBrandPageView)localObject3).ivj != null) {
          localObject1 = ((AppBrandPageView)localObject3).ivj.getSettings().getUserAgentString();
        }
      }
      localObject1 = new com.tencent.mm.plugin.appbrand.h.j(paramj.hyD, (String)localObject1);
      com.tencent.mm.plugin.appbrand.h.k.YU().a(paramj.hyD, (com.tencent.mm.plugin.appbrand.h.j)localObject1);
    }
    localObject2 = new j.a()
    {
      public final void a(com.tencent.mm.plugin.appbrand.b.a paramAnonymousa)
      {
        GMTrace.i(20745899999232L, 154569);
        if ((paramAnonymousa == com.tencent.mm.plugin.appbrand.b.a.hKL) || (paramAnonymousa == com.tencent.mm.plugin.appbrand.b.a.hKM))
        {
          localObject1.c(localObject1.ry(j));
          paramAnonymousa = new HashMap();
          paramAnonymousa.put("reason", "interrupted");
          paramAnonymousa.put("socketTaskId", j);
          paramAnonymousa.put("state", "close");
          paramAnonymousa = new JSONObject(paramAnonymousa).toString();
          com.tencent.mm.plugin.appbrand.jsapi.e locale = new e.a().a(paramj);
          locale.mData = paramAnonymousa;
          locale.VR();
        }
        GMTrace.o(20745899999232L, 154569);
      }
    }
    {
      public final void Xb()
      {
        GMTrace.i(20746168434688L, 154571);
        paramj.hzM.hyU.a(this.iiL);
        Object localObject = new HashMap();
        ((Map)localObject).put("socketTaskId", j);
        ((Map)localObject).put("state", "open");
        localObject = new JSONObject((Map)localObject).toString();
        com.tencent.mm.plugin.appbrand.jsapi.e locale = new e.a().a(paramj);
        locale.mData = ((String)localObject);
        locale.VR();
        GMTrace.o(20746168434688L, 154571);
      }
      
      public final void a(ByteBuffer paramAnonymousByteBuffer)
      {
        GMTrace.i(20746571087872L, 154574);
        Object localObject = new HashMap();
        ((Map)localObject).put("socketTaskId", j);
        ((Map)localObject).put("data", paramAnonymousByteBuffer);
        ((Map)localObject).put("isBuffer", Boolean.valueOf(true));
        ((Map)localObject).put("state", "message");
        paramAnonymousByteBuffer = new e.a();
        if (com.tencent.mm.plugin.appbrand.o.l.a(paramj, (Map)localObject, paramAnonymousByteBuffer))
        {
          paramAnonymousByteBuffer = new JSONObject((Map)localObject).toString();
          localObject = new e.a().a(paramj);
          ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousByteBuffer;
          ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
        }
        GMTrace.o(20746571087872L, 154574);
      }
      
      public final void qD(String paramAnonymousString)
      {
        GMTrace.i(20746302652416L, 154572);
        Object localObject = new HashMap();
        ((Map)localObject).put("socketTaskId", j);
        ((Map)localObject).put("state", "error");
        ((Map)localObject).put("errMsg", paramAnonymousString);
        paramAnonymousString = new JSONObject((Map)localObject).toString();
        localObject = new e.a().a(paramj);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousString;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
        GMTrace.o(20746302652416L, 154572);
      }
      
      public final void qE(String paramAnonymousString)
      {
        GMTrace.i(20746436870144L, 154573);
        Object localObject = new HashMap();
        ((Map)localObject).put("data", com.tencent.mm.plugin.appbrand.o.d.sz(paramAnonymousString));
        ((Map)localObject).put("isBuffer", Boolean.valueOf(false));
        ((Map)localObject).put("socketTaskId", j);
        ((Map)localObject).put("state", "message");
        paramAnonymousString = new JSONObject((Map)localObject).toString();
        localObject = new e.a().a(paramj);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousString;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
        GMTrace.o(20746436870144L, 154573);
      }
      
      public final void qF(String paramAnonymousString)
      {
        GMTrace.i(20746839523328L, 154576);
        if (bg.nm(paramAnonymousString)) {}
        for (paramAnonymousString = "fail";; paramAnonymousString = "fail:" + paramAnonymousString)
        {
          Object localObject = new HashMap();
          ((Map)localObject).put("socketTaskId", j);
          ((Map)localObject).put("state", "error");
          ((Map)localObject).put("errMsg", paramAnonymousString);
          paramAnonymousString = new JSONObject((Map)localObject).toString();
          localObject = new e.a().a(paramj);
          ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousString;
          ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
          GMTrace.o(20746839523328L, 154576);
          return;
        }
      }
      
      public final void y(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(20746705305600L, 154575);
        paramj.hzM.hyU.b(this.iiL);
        Object localObject = new HashMap();
        if (paramj.hzM.hyU.Ta()) {
          ((Map)localObject).put("reason", "interrupted");
        }
        for (;;)
        {
          ((Map)localObject).put("code", Integer.valueOf(paramAnonymousInt));
          ((Map)localObject).put("socketTaskId", j);
          ((Map)localObject).put("state", "close");
          paramAnonymousString = new JSONObject((Map)localObject).toString();
          localObject = new e.a().a(paramj);
          ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousString;
          ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
          GMTrace.o(20746705305600L, 154575);
          return;
          if (!bg.nm(paramAnonymousString)) {
            ((Map)localObject).put("reason", paramAnonymousString);
          }
        }
      }
    };
    Object localObject3 = paramj.hzM.hyH;
    String str = paramJSONObject.optString("url");
    if (bg.nm(str))
    {
      w.i("MicroMsg.JsApiCreateSocketTask", "url is null");
      paramj = d("fail", null);
      GMTrace.o(20745631563776L, 154567);
      return paramj;
    }
    w.i("MicroMsg.JsApiCreateSocketTask", "url is " + str);
    paramj = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
    Map localMap = i.a(paramJSONObject, paramj);
    if ((i.a(paramj, paramJSONObject.optBoolean("__skipDomainCheck__", false))) && (!i.a(paramj.hRa, str)))
    {
      w.i("MicroMsg.JsApiCreateSocketTask", "not in domain url %s", new Object[] { str });
      paramj = d("fail:url not in domain list", null);
      GMTrace.o(20745631563776L, 154567);
      return paramj;
    }
    int i = i.a(paramj, (com.tencent.mm.plugin.appbrand.config.a)localObject3, 1);
    if (i > 0) {}
    for (;;)
    {
      boolean bool = ((com.tencent.mm.plugin.appbrand.h.j)localObject1).a(String.valueOf(j), i, paramJSONObject, localMap, (j.a)localObject2);
      w.i("MicroMsg.JsApiCreateSocketTask", "connectSocket ret: %b, url is : %s ,appid: %s", new Object[] { Boolean.valueOf(bool), str, paramj.appId });
      if (bool)
      {
        paramj = new HashMap();
        paramj.put("socketTaskId", String.valueOf(j));
        paramj = d("ok", paramj);
        GMTrace.o(20745631563776L, 154567);
        return paramj;
      }
      paramj = d("fail", null);
      GMTrace.o(20745631563776L, 154567);
      return paramj;
      i = 60000;
    }
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    public static final int CTRL_INDEX = 348;
    public static final String NAME = "onSocketTaskStateChange";
    
    public a()
    {
      GMTrace.i(20745363128320L, 154565);
      GMTrace.o(20745363128320L, 154565);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.b.b.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.h.j.a;
import com.tencent.mm.plugin.appbrand.h.k;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.l;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 20;
  public static final String NAME = "connectSocket";
  
  public b()
  {
    GMTrace.i(18237907533824L, 135883);
    GMTrace.o(18237907533824L, 135883);
  }
  
  public final void a(final com.tencent.mm.plugin.appbrand.j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(18238041751552L, 135884);
    final Object localObject1 = k.YU().rA(paramj.hyD);
    if ((localObject1 != null) && (com.tencent.mm.plugin.appbrand.h.j.d(((com.tencent.mm.plugin.appbrand.h.j)localObject1).ry("0"))))
    {
      w.i("MicroMsg.JsApiConnectSocket", "the already appid has a websocket");
      paramJSONObject = new HashMap();
      paramJSONObject.put("message", "websocket is connected");
      paramj.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(18238041751552L, 135884);
      return;
    }
    if (localObject1 != null) {
      k.YU().rB(paramj.hyD);
    }
    Object localObject2 = b(paramj);
    j.a local2 = null;
    localObject1 = local2;
    if (localObject2 != null)
    {
      localObject1 = local2;
      if (((AppBrandPageView)localObject2).ivj != null) {
        localObject1 = ((AppBrandPageView)localObject2).ivj.getSettings().getUserAgentString();
      }
    }
    localObject1 = new com.tencent.mm.plugin.appbrand.h.j(paramj.hyD, (String)localObject1);
    local2 = new j.a()
    {
      public final void a(com.tencent.mm.plugin.appbrand.b.a paramAnonymousa)
      {
        GMTrace.i(18841350438912L, 140379);
        if ((paramAnonymousa == com.tencent.mm.plugin.appbrand.b.a.hKL) || (paramAnonymousa == com.tencent.mm.plugin.appbrand.b.a.hKM))
        {
          paramAnonymousa = localObject1;
          paramAnonymousa.c(paramAnonymousa.ry("0"));
        }
        GMTrace.o(18841350438912L, 140379);
      }
    }
    {
      public final void Xb()
      {
        GMTrace.i(18840276697088L, 140371);
        k.YU().a(paramj.hyD, localObject1);
        paramj.hzM.hyU.a(this.iiL);
        paramj.h("onSocketOpen", null, 0);
        GMTrace.o(18840276697088L, 140371);
      }
      
      public final void a(ByteBuffer paramAnonymousByteBuffer)
      {
        GMTrace.i(18840679350272L, 140374);
        HashMap localHashMap = new HashMap();
        String str = "";
        if (paramAnonymousByteBuffer != null) {}
        try
        {
          str = new String(Base64.encode(paramAnonymousByteBuffer.array(), 2), "utf-8");
          localHashMap.put("data", str);
          localHashMap.put("isBuffer", Boolean.valueOf(true));
          paramj.h("onSocketMessage", new JSONObject(localHashMap).toString(), 0);
          GMTrace.o(18840679350272L, 140374);
          return;
        }
        catch (UnsupportedEncodingException paramAnonymousByteBuffer)
        {
          w.e("MicroMsg.JsApiConnectSocket", "create string by buffer error. exception : %s", new Object[] { paramAnonymousByteBuffer });
          GMTrace.o(18840679350272L, 140374);
        }
      }
      
      public final void qD(String paramAnonymousString)
      {
        GMTrace.i(18840410914816L, 140372);
        HashMap localHashMap = new HashMap();
        localHashMap.put("message", paramAnonymousString);
        paramj.h("onSocketError", new JSONObject(localHashMap).toString(), 0);
        GMTrace.o(18840410914816L, 140372);
      }
      
      public final void qE(String paramAnonymousString)
      {
        GMTrace.i(18840545132544L, 140373);
        HashMap localHashMap = new HashMap();
        localHashMap.put("data", com.tencent.mm.plugin.appbrand.o.d.sz(paramAnonymousString));
        paramj.h("onSocketMessage", new JSONObject(localHashMap).toString(), 0);
        GMTrace.o(18840545132544L, 140373);
      }
      
      public final void qF(String paramAnonymousString)
      {
        GMTrace.i(18840947785728L, 140376);
        if (bg.nm(paramAnonymousString))
        {
          paramj.v(paramInt, b.this.d("fail", null));
          GMTrace.o(18840947785728L, 140376);
          return;
        }
        paramj.v(paramInt, b.this.d("fail:" + paramAnonymousString, null));
        GMTrace.o(18840947785728L, 140376);
      }
      
      public final void y(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(18840813568000L, 140375);
        k.YU().rB(paramj.hyD);
        paramj.hzM.hyU.b(this.iiL);
        HashMap localHashMap = new HashMap();
        if (paramj.hzM.hyU.Ta()) {
          localHashMap.put("message", "interrupted");
        }
        for (;;)
        {
          localHashMap.put("code", Integer.valueOf(paramAnonymousInt));
          paramAnonymousString = new JSONObject(localHashMap).toString();
          paramj.h("onSocketClose", paramAnonymousString, 0);
          GMTrace.o(18840813568000L, 140375);
          return;
          if (!bg.nm(paramAnonymousString)) {
            localHashMap.put("message", paramAnonymousString);
          }
        }
      }
    };
    localObject2 = paramj.hzM.hyH;
    String str = paramJSONObject.optString("url");
    if (bg.nm(str))
    {
      w.i("MicroMsg.JsApiConnectSocket", "url is null");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(18238041751552L, 135884);
      return;
    }
    w.i("MicroMsg.JsApiConnectSocket", "url is " + str);
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
    Map localMap = i.a(paramJSONObject, localAppBrandSysConfig);
    if ((i.a(localAppBrandSysConfig, paramJSONObject.optBoolean("__skipDomainCheck__", false))) && (!i.a(localAppBrandSysConfig.hRa, str)))
    {
      paramj.v(paramInt, d("fail:url not in domain list", null));
      w.i("MicroMsg.JsApiConnectSocket", "not in domain url %s", new Object[] { str });
      GMTrace.o(18238041751552L, 135884);
      return;
    }
    int i = i.a(localAppBrandSysConfig, (com.tencent.mm.plugin.appbrand.config.a)localObject2, 1);
    if (i > 0) {}
    for (;;)
    {
      w.i("MicroMsg.JsApiConnectSocket", "send request ok, url is : %s ,appid: %s", new Object[] { str, localAppBrandSysConfig.appId });
      if (((com.tencent.mm.plugin.appbrand.h.j)localObject1).a("0", i, paramJSONObject, localMap, local2)) {
        paramj.v(paramInt, d("ok", null));
      }
      GMTrace.o(18238041751552L, 135884);
      return;
      i = 60000;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
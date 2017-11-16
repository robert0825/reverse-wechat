package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.h.c;
import com.tencent.mm.plugin.appbrand.h.c.a;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class d
  extends k
{
  public static final int CTRL_INDEX = 242;
  public static final String NAME = "createRequestTask";
  
  public d()
  {
    GMTrace.i(17684259405824L, 131758);
    GMTrace.o(17684259405824L, 131758);
  }
  
  public final String a(j paramj, JSONObject paramJSONObject)
  {
    GMTrace.i(17684393623552L, 131759);
    w.d("MicroMsg.JsApiCreateRequestTask", "JsApiCreateRequestTask");
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiCreateRequestTask", "data is null");
      paramj = d("fail:data is null", null);
      GMTrace.o(17684393623552L, 131759);
      return paramj;
    }
    com.tencent.mm.plugin.appbrand.h.e.YR();
    final int j = com.tencent.mm.plugin.appbrand.h.e.YO();
    c.a local1 = new c.a()
    {
      public final void a(String paramAnonymousString, Object paramAnonymousObject, int paramAnonymousInt, JSONObject paramAnonymousJSONObject)
      {
        GMTrace.i(19825837473792L, 147714);
        int j = 0;
        int i;
        HashMap localHashMap;
        if ((paramAnonymousObject != null) && ((paramAnonymousObject instanceof ByteBuffer)))
        {
          i = ((ByteBuffer)paramAnonymousObject).array().length;
          w.d("MicroMsg.JsApiCreateRequestTask", "onRequestResult, time: %d, data size: %d, code %s,reqrestId %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.iiO), Integer.valueOf(i), Integer.valueOf(paramAnonymousInt), Integer.valueOf(this.iiP) });
          localHashMap = new HashMap();
          localHashMap.put("requestTaskId", this.iiP);
          if (!paramAnonymousString.equalsIgnoreCase("ok")) {
            break label285;
          }
          localHashMap.put("state", "success");
          localHashMap.put("data", paramAnonymousObject);
        }
        for (;;)
        {
          localHashMap.put("statusCode", Integer.valueOf(paramAnonymousInt));
          if (paramAnonymousJSONObject != null) {
            localHashMap.put("header", paramAnonymousJSONObject);
          }
          paramAnonymousString = new d.a();
          if (((paramAnonymousObject != null) && ((paramAnonymousObject instanceof String))) || (com.tencent.mm.plugin.appbrand.o.l.a(j, localHashMap, paramAnonymousString)))
          {
            paramAnonymousObject = new JSONObject(localHashMap).toString();
            paramAnonymousString = paramAnonymousString.a(j);
            paramAnonymousString.mData = ((String)paramAnonymousObject);
            paramAnonymousString.VR();
          }
          GMTrace.o(19825837473792L, 147714);
          return;
          i = j;
          if (paramAnonymousObject == null) {
            break;
          }
          i = j;
          if (!(paramAnonymousObject instanceof String)) {
            break;
          }
          i = ((String)paramAnonymousObject).length();
          break;
          label285:
          localHashMap.put("state", "fail");
        }
      }
      
      public final void qH(String paramAnonymousString)
      {
        GMTrace.i(19825703256064L, 147713);
        long l1 = System.currentTimeMillis();
        long l2 = this.iiO;
        if (paramAnonymousString == null) {}
        for (int i = 0;; i = paramAnonymousString.length())
        {
          w.d("MicroMsg.JsApiCreateRequestTask", "onRequestResult, time: %d, data size: %d", new Object[] { Long.valueOf(l1 - l2), Integer.valueOf(i) });
          localObject = com.tencent.mm.plugin.appbrand.h.e.YR().rr(j.hyD);
          if ((localObject == null) || (!((c)localObject).rm(this.iiP))) {
            break;
          }
          w.d("MicroMsg.JsApiCreateRequestTask", "request abort %d", new Object[] { Integer.valueOf(this.iiP) });
          GMTrace.o(19825703256064L, 147713);
          return;
        }
        Object localObject = new HashMap();
        ((Map)localObject).put("requestTaskId", this.iiP);
        ((Map)localObject).put("state", "fail");
        ((Map)localObject).put("errMsg", paramAnonymousString);
        paramAnonymousString = new JSONObject((Map)localObject).toString();
        localObject = new d.a().a(j);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousString;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
        GMTrace.o(19825703256064L, 147713);
      }
    };
    String str1 = paramJSONObject.optString("url");
    if (bg.nm(str1))
    {
      w.e("MicroMsg.JsApiCreateRequestTask", "url is null");
      paramj = d("fail:url is null or nil", null);
      GMTrace.o(17684393623552L, 131759);
      return paramj;
    }
    AppBrandSysConfig localAppBrandSysConfig = a.nK(paramj.hyD);
    int i = i.a(localAppBrandSysConfig, paramj.hzM.hyH, 0);
    if (i > 0) {}
    for (;;)
    {
      if (localAppBrandSysConfig.hQR <= 0) {
        w.i("MicroMsg.JsApiCreateRequestTask", "maxRequestConcurrent <= 0 use default concurrent");
      }
      Map localMap = i.a(paramJSONObject, localAppBrandSysConfig);
      boolean bool = i.a(localAppBrandSysConfig, paramJSONObject.optBoolean("__skipDomainCheck__", false));
      if ((bool) && (!i.a(localAppBrandSysConfig.hQZ, str1)))
      {
        w.i("MicroMsg.JsApiCreateRequestTask", "not in domain url %s", new Object[] { str1 });
        paramj = d("fail:url not in domain list", null);
        GMTrace.o(17684393623552L, 131759);
        return paramj;
      }
      Object localObject1;
      if (com.tencent.mm.plugin.appbrand.h.e.YR().rr(paramj.hyD) == null)
      {
        Object localObject2 = b(paramj);
        c localc = null;
        localObject1 = localc;
        if (localObject2 != null)
        {
          localObject1 = localc;
          if (((AppBrandPageView)localObject2).ivj != null) {
            localObject1 = ((AppBrandPageView)localObject2).ivj.getSettings().getUserAgentString();
          }
        }
        localc = new c(paramj.hyD, (String)localObject1);
        localObject2 = com.tencent.mm.plugin.appbrand.h.e.YR();
        String str2 = paramj.hyD;
        localObject1 = localc;
        if (!((com.tencent.mm.plugin.appbrand.h.e)localObject2).idu.containsKey(str2))
        {
          ((com.tencent.mm.plugin.appbrand.h.e)localObject2).idu.put(str2, localc);
          localObject1 = localc;
        }
        w.i("MicroMsg.JsApiCreateRequestTask", "request url: %s", new Object[] { str1 });
        if (localObject1 == null) {
          break label479;
        }
        if (bool) {
          break label451;
        }
        w.i("MicroMsg.JsApiCreateRequestTask", "debug type, do not verify domains");
        ((c)localObject1).a(paramj, this, i, paramJSONObject, localMap, null, local1, String.valueOf(j), "createRequestTask");
      }
      for (;;)
      {
        paramj = new HashMap();
        paramj.put("requestTaskId", String.valueOf(j));
        paramj = d("ok", paramj);
        GMTrace.o(17684393623552L, 131759);
        return paramj;
        localObject1 = com.tencent.mm.plugin.appbrand.h.e.YR().rr(paramj.hyD);
        break;
        label451:
        ((c)localObject1).a(paramj, this, i, paramJSONObject, localMap, localAppBrandSysConfig.hQZ, local1, String.valueOf(j), "createRequestTask");
      }
      label479:
      paramj = d("fail:create request error", null);
      GMTrace.o(17684393623552L, 131759);
      return paramj;
      i = 60000;
    }
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    public static final int CTRL_INDEX = 244;
    public static final String NAME = "onRequestTaskStateChange";
    
    public a()
    {
      GMTrace.i(17685064712192L, 131764);
      GMTrace.o(17685064712192L, 131764);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
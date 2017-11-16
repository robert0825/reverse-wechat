package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class f
  extends k
{
  public static final int CTRL_INDEX = 272;
  public static final String NAME = "createUploadTask";
  
  public f()
  {
    GMTrace.i(17683588317184L, 131753);
    GMTrace.o(17683588317184L, 131753);
  }
  
  public static boolean b(j paramj, String paramString)
  {
    GMTrace.i(17683856752640L, 131755);
    paramj = h.YS().rt(paramj.hyD);
    if ((paramj != null) && (paramj.rm(paramString)))
    {
      w.i("MicroMsg.JsApiCreateUploadTask", "upload abort %s", new Object[] { paramString });
      GMTrace.o(17683856752640L, 131755);
      return true;
    }
    GMTrace.o(17683856752640L, 131755);
    return false;
  }
  
  public final String a(final j paramj, JSONObject paramJSONObject)
  {
    GMTrace.i(17683722534912L, 131754);
    w.d("MicroMsg.JsApiCreateUploadTask", "JsApiCreateUploadTask");
    String str2 = paramj.hyD;
    if (paramJSONObject == null)
    {
      paramj = d("fail:data is null", null);
      GMTrace.o(17683722534912L, 131754);
      return paramj;
    }
    Object localObject1 = paramJSONObject.optString("filePath");
    if (bg.nm((String)localObject1))
    {
      paramj = d("fail:filePath is null", null);
      GMTrace.o(17683722534912L, 131754);
      return paramj;
    }
    w.i("MicroMsg.JsApiCreateUploadTask", "tempFilePath " + (String)localObject1);
    Object localObject2 = c.aJ(str2, (String)localObject1);
    if (localObject2 == null)
    {
      paramj = d("fail:file doesn't exist", null);
      GMTrace.o(17683722534912L, 131754);
      return paramj;
    }
    final String str1 = ((AppBrandLocalMediaObject)localObject2).gpy;
    localObject2 = ((AppBrandLocalMediaObject)localObject2).mimeType;
    w.i("MicroMsg.JsApiCreateUploadTask", "filePath(%s), tempFilePath(%s)", new Object[] { str1, localObject1 });
    h.YS();
    final int j = h.YO();
    com.tencent.mm.plugin.appbrand.h.f.a local1 = new com.tencent.mm.plugin.appbrand.h.f.a()
    {
      public final void b(int paramAnonymousInt1, String paramAnonymousString, int paramAnonymousInt2)
      {
        GMTrace.i(17686943760384L, 131778);
        if (paramAnonymousInt1 == 0)
        {
          w.d("MicroMsg.JsApiCreateUploadTask", "success: file name %s, result %s , errMsg %d", new Object[] { str1, paramAnonymousString, Integer.valueOf(paramAnonymousInt1) });
          localObject = new HashMap();
          ((Map)localObject).put("data", paramAnonymousString);
          ((Map)localObject).put("statusCode", Integer.valueOf(paramAnonymousInt2));
          ((Map)localObject).put("uploadTaskId", j);
          ((Map)localObject).put("state", "success");
          paramAnonymousString = new JSONObject((Map)localObject).toString();
          localObject = new f.a().a(paramj);
          ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousString;
          ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
          GMTrace.o(17686943760384L, 131778);
          return;
        }
        if (f.b(paramj, j))
        {
          GMTrace.o(17686943760384L, 131778);
          return;
        }
        w.e("MicroMsg.JsApiCreateUploadTask", "error: file name %s, result %s , errMsg %d", new Object[] { str1, paramAnonymousString, Integer.valueOf(paramAnonymousInt1) });
        Object localObject = new HashMap();
        ((Map)localObject).put("uploadTaskId", j);
        ((Map)localObject).put("state", "fail");
        ((Map)localObject).put("errMsg", paramAnonymousString);
        paramAnonymousString = new JSONObject((Map)localObject).toString();
        localObject = new f.a().a(paramj);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousString;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
        GMTrace.o(17686943760384L, 131778);
      }
      
      public final void c(int paramAnonymousInt, long paramAnonymousLong1, long paramAnonymousLong2)
      {
        GMTrace.i(17687077978112L, 131779);
        Object localObject = new HashMap();
        ((Map)localObject).put("uploadTaskId", j);
        ((Map)localObject).put("state", "progressUpdate");
        ((Map)localObject).put("progress", Integer.valueOf(paramAnonymousInt));
        ((Map)localObject).put("totalBytesSent", Long.valueOf(paramAnonymousLong1));
        ((Map)localObject).put("totalBytesExpectedToSend", Long.valueOf(paramAnonymousLong2));
        localObject = new JSONObject((Map)localObject).toString();
        com.tencent.mm.plugin.appbrand.jsapi.e locale = new f.a().a(paramj);
        locale.mData = ((String)localObject);
        locale.VR();
        GMTrace.o(17687077978112L, 131779);
      }
      
      public final void qI(String paramAnonymousString)
      {
        GMTrace.i(17686809542656L, 131777);
        if (f.b(paramj, j))
        {
          GMTrace.o(17686809542656L, 131777);
          return;
        }
        Object localObject = new HashMap();
        ((Map)localObject).put("uploadTaskId", j);
        ((Map)localObject).put("state", "fail");
        ((Map)localObject).put("errMsg", paramAnonymousString);
        paramAnonymousString = new JSONObject((Map)localObject).toString();
        localObject = new f.a().a(paramj);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousString;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
        GMTrace.o(17686809542656L, 131777);
      }
    };
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(str2);
    localObject1 = paramj.hzM.hyH;
    Map localMap = i.a(paramJSONObject, localAppBrandSysConfig);
    Object localObject3 = paramJSONObject.optString("url");
    if (bg.nm((String)localObject3))
    {
      w.i("MicroMsg.JsApiCreateUploadTask", "url is null");
      paramj = d("fail:url is null or nil", null);
      GMTrace.o(17683722534912L, 131754);
      return paramj;
    }
    boolean bool = i.a(localAppBrandSysConfig, paramJSONObject.optBoolean("__skipDomainCheck__", false));
    if ((bool) && (!i.a(localAppBrandSysConfig.hRb, (String)localObject3)))
    {
      w.i("MicroMsg.JsApiCreateUploadTask", "not in domain url %s", new Object[] { localObject3 });
      paramj = d("fail:url not in domain list", null);
      GMTrace.o(17683722534912L, 131754);
      return paramj;
    }
    if (localAppBrandSysConfig.hQS <= 0) {
      w.i("MicroMsg.JsApiCreateUploadTask", "concurrent <= 0 ");
    }
    int i = i.a(localAppBrandSysConfig, (com.tencent.mm.plugin.appbrand.config.a)localObject1, 2);
    if (i > 0) {}
    for (;;)
    {
      if (h.YS().rt(str2) == null)
      {
        localObject3 = b(paramj);
        localObject1 = null;
        paramj = (j)localObject1;
        if (localObject3 != null)
        {
          paramj = (j)localObject1;
          if (((AppBrandPageView)localObject3).ivj != null) {
            paramj = ((AppBrandPageView)localObject3).ivj.getSettings().getUserAgentString();
          }
        }
        paramj = new com.tencent.mm.plugin.appbrand.h.f(str2, paramj);
        localObject1 = h.YS();
        if (!((h)localObject1).idu.containsKey(str2)) {
          ((h)localObject1).idu.put(str2, paramj);
        }
        if (paramj != null)
        {
          if (bool) {
            break label532;
          }
          w.i("MicroMsg.JsApiCreateUploadTask", "debug type, do not verify domains");
          paramj.a(i, (String)localObject2, str1, paramJSONObject, localMap, null, local1, String.valueOf(j), "createUploadTask");
        }
      }
      for (;;)
      {
        paramj = new HashMap();
        paramj.put("uploadTaskId", String.valueOf(j));
        paramj = d("ok", paramj);
        GMTrace.o(17683722534912L, 131754);
        return paramj;
        paramj = h.YS().rt(str2);
        break;
        label532:
        paramj.a(i, (String)localObject2, str1, paramJSONObject, localMap, localAppBrandSysConfig.hRb, local1, String.valueOf(j), "createUploadTask");
      }
      i = 60000;
    }
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    public static final int CTRL_INDEX = 274;
    public static final String NAME = "onUploadTaskStateChange";
    
    public a()
    {
      GMTrace.i(17687212195840L, 131780);
      GMTrace.o(17687212195840L, 131780);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
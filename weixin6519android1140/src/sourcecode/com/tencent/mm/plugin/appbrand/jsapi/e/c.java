package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.h.a.1;
import com.tencent.mm.plugin.appbrand.h.a.a;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class c
  extends k
{
  public static final int CTRL_INDEX = 269;
  public static final String NAME = "createDownloadTask";
  
  public c()
  {
    GMTrace.i(17685601583104L, 131768);
    GMTrace.o(17685601583104L, 131768);
  }
  
  public static boolean a(j paramj, String paramString)
  {
    GMTrace.i(17685870018560L, 131770);
    paramj = com.tencent.mm.plugin.appbrand.h.b.YP().ro(paramj.hyD);
    if ((paramj != null) && (paramj.rm(paramString)))
    {
      w.i("MicroMsg.JsApiCreateDownloadTask", "download abort %s", new Object[] { paramString });
      GMTrace.o(17685870018560L, 131770);
      return true;
    }
    GMTrace.o(17685870018560L, 131770);
    return false;
  }
  
  public static AppBrandLocalMediaObject z(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(18839605608448L, 140366);
    paramString1 = com.tencent.mm.plugin.appbrand.appstorage.c.b(paramString1, paramString2, s.OV(paramString3), false);
    GMTrace.o(18839605608448L, 140366);
    return paramString1;
  }
  
  public final String a(final j paramj, JSONObject paramJSONObject)
  {
    GMTrace.i(17685735800832L, 131769);
    w.d("MicroMsg.JsApiCreateDownloadTask", "JsApiCreateDownloadTask");
    ??? = paramj.hyD;
    com.tencent.mm.plugin.appbrand.h.b.YP();
    final int j = com.tencent.mm.plugin.appbrand.h.b.YO();
    a.a local1 = new a.a()
    {
      public final void b(int paramAnonymousInt, long paramAnonymousLong1, long paramAnonymousLong2)
      {
        GMTrace.i(17684796276736L, 131762);
        Object localObject = new HashMap();
        ((Map)localObject).put("downloadTaskId", j);
        ((Map)localObject).put("state", "progressUpdate");
        ((Map)localObject).put("progress", Integer.valueOf(paramAnonymousInt));
        ((Map)localObject).put("totalBytesWritten", Long.valueOf(paramAnonymousLong1));
        ((Map)localObject).put("totalBytesExpectedToWrite", Long.valueOf(paramAnonymousLong2));
        localObject = new JSONObject((Map)localObject).toString();
        com.tencent.mm.plugin.appbrand.jsapi.e locale = new c.a().a(paramj);
        locale.mData = ((String)localObject);
        locale.VR();
        GMTrace.o(17684796276736L, 131762);
      }
      
      public final void b(int paramAnonymousInt1, String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt2)
      {
        GMTrace.i(17684662059008L, 131761);
        w.i("MicroMsg.JsApiCreateDownloadTask", "onDownloadResultWithCode errMsg = %d, mimeType = %s, filePath = %s, statusCode = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousString1, paramAnonymousString2, Integer.valueOf(paramAnonymousInt2) });
        if (com.tencent.mm.plugin.appbrand.h.a.FAILED != paramAnonymousInt1)
        {
          paramAnonymousString1 = c.z(localObject3, paramAnonymousString2, paramAnonymousString1);
          if (paramAnonymousString1 != null) {}
        }
        else
        {
          if (c.a(paramj, j))
          {
            GMTrace.o(17684662059008L, 131761);
            return;
          }
          paramAnonymousString1 = new HashMap();
          paramAnonymousString1.put("downloadTaskId", j);
          paramAnonymousString1.put("state", "fail");
          paramAnonymousString1.put("errMsg", "download fail");
          paramAnonymousString1 = new JSONObject(paramAnonymousString1).toString();
          paramAnonymousString2 = new c.a().a(paramj);
          paramAnonymousString2.mData = paramAnonymousString1;
          paramAnonymousString2.VR();
          GMTrace.o(17684662059008L, 131761);
          return;
        }
        paramAnonymousString1 = paramAnonymousString1.eHy;
        w.i("MicroMsg.JsApiCreateDownloadTask", "onDownloadResultWithCode attached tempFilePath " + paramAnonymousString1);
        paramAnonymousString2 = new HashMap();
        paramAnonymousString2.put("downloadTaskId", j);
        paramAnonymousString2.put("tempFilePath", paramAnonymousString1);
        paramAnonymousString2.put("statusCode", Integer.valueOf(paramAnonymousInt2));
        paramAnonymousString2.put("state", "success");
        paramAnonymousString1 = new JSONObject(paramAnonymousString2).toString();
        paramAnonymousString2 = new c.a().a(paramj);
        paramAnonymousString2.mData = paramAnonymousString1;
        paramAnonymousString2.VR();
        GMTrace.o(17684662059008L, 131761);
      }
      
      public final void qG(String paramAnonymousString)
      {
        GMTrace.i(17684930494464L, 131763);
        if (c.a(paramj, j))
        {
          GMTrace.o(17684930494464L, 131763);
          return;
        }
        Object localObject = new HashMap();
        ((Map)localObject).put("downloadTaskId", j);
        ((Map)localObject).put("state", "fail");
        ((Map)localObject).put("errMsg", paramAnonymousString);
        paramAnonymousString = new JSONObject((Map)localObject).toString();
        localObject = new c.a().a(paramj);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousString;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
        GMTrace.o(17684930494464L, 131763);
      }
    };
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
    ??? = paramj.hzM.hyH;
    Map localMap = i.a(paramJSONObject, localAppBrandSysConfig);
    Object localObject2 = paramJSONObject.optString("url");
    if (bg.nm((String)localObject2))
    {
      w.i("MicroMsg.JsApiCreateDownloadTask", "url is null");
      paramj = d("fail:url is null or nil", null);
      GMTrace.o(17685735800832L, 131769);
      return paramj;
    }
    boolean bool = i.a(localAppBrandSysConfig, paramJSONObject.optBoolean("__skipDomainCheck__", false));
    if ((bool) && (!i.a(localAppBrandSysConfig.hRc, (String)localObject2)))
    {
      w.i("MicroMsg.JsApiCreateDownloadTask", "not in domain url %s", new Object[] { localObject2 });
      paramj = d("fail:url not in domain list", null);
      GMTrace.o(17685735800832L, 131769);
      return paramj;
    }
    if (localAppBrandSysConfig.hQT <= 0) {
      w.i("MicroMsg.JsApiCreateDownloadTask", "maxDownloadConcurrent <= 0 ");
    }
    int i = i.a(localAppBrandSysConfig, (com.tencent.mm.plugin.appbrand.config.a)???, 3);
    if (i > 0) {}
    for (;;)
    {
      ??? = com.tencent.mm.plugin.appbrand.h.b.YP().ro(paramj.hyD);
      if (??? == null)
      {
        AppBrandPageView localAppBrandPageView = b(paramj);
        localObject2 = null;
        ??? = localObject2;
        if (localAppBrandPageView != null)
        {
          ??? = localObject2;
          if (localAppBrandPageView.ivj != null) {
            ??? = localAppBrandPageView.ivj.getSettings().getUserAgentString();
          }
        }
        ??? = new com.tencent.mm.plugin.appbrand.h.a(paramj.hyD, (String)???);
        localObject2 = com.tencent.mm.plugin.appbrand.h.b.YP();
        paramj = paramj.hyD;
        if (!((com.tencent.mm.plugin.appbrand.h.b)localObject2).idu.containsKey(paramj)) {
          ((com.tencent.mm.plugin.appbrand.h.b)localObject2).idu.put(paramj, ???);
        }
      }
      for (paramj = (j)???;; paramj = (j)???)
      {
        int k;
        if (paramj != null)
        {
          w.i("MicroMsg.JsApiCreateDownloadTask", "before do download, checkDomains = %b", new Object[] { Boolean.valueOf(bool) });
          k = com.tencent.mm.plugin.appbrand.a.nK((String)???).hRh.hQd;
          if (!bool) {
            break label466;
          }
          ??? = localAppBrandSysConfig.hRc;
          localObject2 = String.valueOf(j);
          paramJSONObject = paramJSONObject.optString("url");
        }
        for (;;)
        {
          synchronized (paramj.isM)
          {
            if (paramj.isM.size() >= paramj.isH)
            {
              local1.qG("max_connected");
              w.i("MicroMsg.AppBrandNetworkDownload", "max connected");
              paramj = new HashMap();
              paramj.put("downloadTaskId", String.valueOf(j));
              paramj = d("ok", paramj);
              GMTrace.o(17685735800832L, 131769);
              return paramj;
              label466:
              ??? = null;
              break;
            }
            if (bg.nm(paramJSONObject))
            {
              w.i("MicroMsg.AppBrandNetworkDownload", "url is null");
              local1.qG("url is null");
            }
          }
          ??? = paramj.isI + aa.RP(paramJSONObject) + "temp";
          paramJSONObject = new com.tencent.mm.plugin.appbrand.h.a.b(paramj.hyD, paramJSONObject, (String)???, paramj.isK, new a.1(paramj, (String)localObject2, local1));
          paramJSONObject.itH = localMap;
          paramJSONObject.itI = i;
          paramJSONObject.aDI = true;
          paramJSONObject.itf = ((ArrayList)???);
          paramJSONObject.itJ = k;
          paramJSONObject.isJ = paramj.isJ;
          paramJSONObject.hXm = ((String)localObject2);
          paramJSONObject.itj = "createDownloadTask";
          synchronized (paramj.isM)
          {
            paramj.isM.add(paramJSONObject);
            com.tencent.mm.sdk.f.e.post(paramJSONObject, "appbrand_download_thread");
          }
        }
      }
      i = 60000;
    }
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    public static final int CTRL_INDEX = 271;
    public static final String NAME = "onDownloadTaskStateChange";
    
    public a()
    {
      GMTrace.i(17685198929920L, 131765);
      GMTrace.o(17685198929920L, 131765);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
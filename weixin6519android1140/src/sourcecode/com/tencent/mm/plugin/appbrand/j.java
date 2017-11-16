package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.l;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.jsapi.AppBrandJSInterface;
import com.tencent.mm.plugin.appbrand.jsruntime.AppBrandMessBasedJsEngine;
import com.tencent.mm.plugin.appbrand.o.h.a;
import com.tencent.mm.plugin.appbrand.page.m;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.f;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j
  extends com.tencent.mm.plugin.appbrand.jsapi.c
{
  public String hyD;
  public e hzM;
  AppBrandJSInterface hzN;
  public com.tencent.mm.plugin.appbrand.jsruntime.a hzO;
  private LinkedList<a> hzP;
  public boolean hzQ;
  private boolean hzR;
  public Context mContext;
  public boolean mRunning;
  
  public j()
  {
    GMTrace.i(20749926531072L, 154599);
    this.mRunning = true;
    this.hzP = new LinkedList();
    this.hzQ = false;
    this.hzR = false;
    this.hzN = new AppBrandJSInterface(this);
    Object localObject1 = ab.getContext();
    Object localObject2 = ab.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
    String str = ((SharedPreferences)localObject2).getString("tbs_webview_disable", "0");
    int i;
    if ((!((SharedPreferences)localObject2).getBoolean("switch_x5_jscore", true)) || ("1".equals(str)))
    {
      i = 1;
      if (i == 0) {
        break label191;
      }
    }
    label191:
    for (localObject1 = new com.tencent.mm.plugin.appbrand.jsruntime.e((Context)localObject1);; localObject1 = new AppBrandMessBasedJsEngine((Context)localObject1))
    {
      if (!(localObject1 instanceof com.tencent.mm.plugin.appbrand.jsruntime.e)) {
        break label205;
      }
      g.ork.a(434L, 1L, 1L, false);
      w.i("MicroMsg.AppBrandJsRuntimeFactory", "Using WebView Based Javascript Engine");
      g.ork.a(434L, 0L, 1L, false);
      ((com.tencent.mm.plugin.appbrand.jsruntime.a)localObject1).addJavascriptInterface(this.hzN, "WeixinJSCore");
      this.hzO = ((com.tencent.mm.plugin.appbrand.jsruntime.a)localObject1);
      GMTrace.o(20749926531072L, 154599);
      return;
      i = 0;
      break;
    }
    label205:
    localObject2 = g.ork;
    if (((AppBrandMessBasedJsEngine)localObject1).iph.wq()) {}
    for (long l = 1L;; l = 2L)
    {
      ((g)localObject2).a(434L, l, 1L, false);
      w.i("MicroMsg.AppBrandJsRuntimeFactory", "Using v8 Javascript Engine, probably");
      break;
    }
  }
  
  public static void a(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    GMTrace.i(10662658965504L, 79443);
    try
    {
      paramJSONObject.put(paramString, paramObject);
      GMTrace.o(10662658965504L, 79443);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.AppBrandService", paramJSONObject.getMessage());
      GMTrace.o(10662658965504L, 79443);
    }
  }
  
  final void RT()
  {
    try
    {
      GMTrace.i(17842904760320L, 132940);
      Iterator localIterator = this.hzP.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        super.h(locala.eBq, locala.data, locala.src);
      }
      this.hzP = null;
    }
    finally {}
    GMTrace.o(17842904760320L, 132940);
  }
  
  public final void RU()
  {
    GMTrace.i(20750060748800L, 154600);
    String str = "";
    if (!this.hzR)
    {
      this.hzR = true;
      str = "" + com.tencent.mm.plugin.appbrand.o.a.sx("wxa_library/android.js") + l.om("WAService.js");
    }
    Object localObject = str;
    if (this.hzM != null)
    {
      localObject = new StringBuilder().append(str);
      str = "";
      if (AppBrandPerformanceManager.rZ(this.hyD)) {
        str = l.om("WAPerf.js");
      }
      localObject = str;
    }
    if (bg.nm((String)localObject))
    {
      w.v("MicroMsg.AppBrandService", "execInternalInitScript, js null");
      GMTrace.o(20750060748800L, 154600);
      return;
    }
    g.ork.a(370L, 5L, 1L, false);
    com.tencent.mm.plugin.appbrand.o.h.a(this.hzO, (String)localObject, new h.a()
    {
      public final void eu(String paramAnonymousString)
      {
        int j = 0;
        GMTrace.i(10197460320256L, 75977);
        w.e("MicroMsg.AppBrandService", "Inject SDK Service Script Failed: %s", new Object[] { paramAnonymousString });
        g.ork.a(370L, 6L, 1L, false);
        com.tencent.mm.plugin.appbrand.report.a.aq(j.this.hyD, 24);
        int i = -1;
        if (j.this.hzM != null)
        {
          j = j.this.hzM.hyG.hRg.hKC;
          i = j.this.hzM.hyG.hRg.hKB;
        }
        com.tencent.mm.plugin.appbrand.report.a.b(j.this.hyD, j, i, 370, 6);
        GMTrace.o(10197460320256L, 75977);
      }
      
      public final void wk()
      {
        GMTrace.i(10197326102528L, 75976);
        g.ork.a(370L, 7L, 1L, false);
        GMTrace.o(10197326102528L, 75976);
      }
    });
    GMTrace.o(20750060748800L, 154600);
  }
  
  public final e RV()
  {
    GMTrace.i(17401059999744L, 129648);
    e locale = this.hzM;
    GMTrace.o(17401059999744L, 129648);
    return locale;
  }
  
  public final com.tencent.mm.plugin.appbrand.jsruntime.a RW()
  {
    GMTrace.i(20750194966528L, 154601);
    com.tencent.mm.plugin.appbrand.jsruntime.a locala = this.hzO;
    GMTrace.o(20750194966528L, 154601);
    return locala;
  }
  
  final void RX()
  {
    GMTrace.i(20750329184256L, 154602);
    JSONObject localJSONObject1 = new JSONObject();
    Object localObject1 = this.hzM.hyG;
    com.tencent.mm.plugin.appbrand.config.a locala = this.hzM.hyH;
    if ((localObject1 == null) || (locala == null))
    {
      GMTrace.o(20750329184256L, 154602);
      return;
    }
    JSONObject localJSONObject2 = locala.hPD;
    Object localObject2 = localJSONObject2.keys();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      Object localObject3 = localJSONObject2.opt(str);
      try
      {
        localJSONObject1.putOpt(str, localObject3);
      }
      catch (Exception localException1)
      {
        w.e("MicroMsg.AppBrandService", localException1.getMessage());
      }
    }
    a(localJSONObject1, "debug", Boolean.valueOf(this.hzM.hyG.hQL));
    a(localJSONObject1, "downloadDomain", ((AppBrandSysConfig)localObject1).hRc);
    a(localJSONObject1, "platform", "android");
    a(localJSONObject1, "system", "Android " + Build.VERSION.RELEASE);
    a(localJSONObject1, "clientVersion", Integer.valueOf(d.tJC));
    localJSONObject2 = new JSONObject();
    a(localJSONObject2, "scene", Integer.valueOf(this.hzM.RD()));
    localObject2 = this.hzM.RE();
    a(localJSONObject2, "path", com.tencent.mm.plugin.appbrand.n.h.sv((String)localObject2));
    a(localJSONObject2, "query", new JSONObject(com.tencent.mm.plugin.appbrand.n.h.sw((String)localObject2)));
    a(localJSONObject2, "topBarStatus", Boolean.valueOf(this.hzM.hyF.hQz));
    a(localJSONObject2, "referrerInfo", this.hzM.hyF.hQB.Uy());
    a(localJSONObject2, "shareInfo", this.hzM.hyF.Uw());
    localObject2 = new JSONObject();
    try
    {
      a((JSONObject)localObject2, "template", new JSONArray(((AppBrandSysConfig)localObject1).hQK));
      a((JSONObject)localObject2, "maxRequestConcurrent", Integer.valueOf(((AppBrandSysConfig)localObject1).hQR));
      a((JSONObject)localObject2, "maxUploadConcurrent", Integer.valueOf(((AppBrandSysConfig)localObject1).hQS));
      a((JSONObject)localObject2, "maxDownloadConcurrent", Integer.valueOf(((AppBrandSysConfig)localObject1).hQT));
      a((JSONObject)localObject2, "maxWebsocketConnect", Integer.valueOf(((AppBrandSysConfig)localObject1).hQU));
      a(localJSONObject1, "appLaunchInfo", localJSONObject2);
      a(localJSONObject1, "wxAppInfo", localObject2);
      a(localJSONObject1, "isPluginMiniProgram", Boolean.valueOf(this.hzM.RF()));
      if (this.hzO.q(com.tencent.mm.plugin.appbrand.jsruntime.c.class) != null) {}
      for (boolean bool = true;; bool = false)
      {
        a(localJSONObject1, "nativeBufferEnabled", Boolean.valueOf(bool));
        localObject1 = locala.hPE;
        this.hzO.evaluateJavascript(String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", new Object[] { localJSONObject1.toString(), localObject1 }), null);
        if (this.hzQ) {
          super.h("onWxConfigReady", "", 0);
        }
        GMTrace.o(20750329184256L, 154602);
        return;
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  public final void a(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    GMTrace.i(10661719441408L, 79436);
    this.hzM.hyJ.c(paramString1, paramString2, paramArrayOfInt);
    GMTrace.o(10661719441408L, 79436);
  }
  
  public final String getAppId()
  {
    GMTrace.i(10662390530048L, 79441);
    String str = this.hyD;
    GMTrace.o(10662390530048L, 79441);
    return str;
  }
  
  public final void h(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(17843038978048L, 132941);
    try
    {
      if (this.hzP != null)
      {
        this.hzP.add(new a(paramString1, paramString2, paramInt));
        GMTrace.o(17843038978048L, 132941);
        return;
      }
      super.h(paramString1, paramString2, paramInt);
      GMTrace.o(17843038978048L, 132941);
      return;
    }
    finally {}
  }
  
  public final boolean isRunning()
  {
    GMTrace.i(10661987876864L, 79438);
    boolean bool = this.mRunning;
    GMTrace.o(10661987876864L, 79438);
    return bool;
  }
  
  private static final class a
  {
    String data;
    String eBq;
    int src;
    
    a(String paramString1, String paramString2, int paramInt)
    {
      GMTrace.i(17848944558080L, 132985);
      this.eBq = paramString1;
      this.data = paramString2;
      this.src = paramInt;
      GMTrace.o(17848944558080L, 132985);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.config;

import android.support.v4.e.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;

public final class e
  implements j.a
{
  private static e hQC;
  public final Map<String, AppBrandInitConfig> hQD;
  public final Map<String, String> hQE;
  
  private e()
  {
    GMTrace.i(20753684627456L, 154627);
    this.hQD = new a();
    this.hQE = new a();
    GMTrace.o(20753684627456L, 154627);
  }
  
  public static e Ux()
  {
    GMTrace.i(20754087280640L, 154630);
    try
    {
      e locale = hQC;
      GMTrace.o(20754087280640L, 154630);
      return locale;
    }
    finally {}
  }
  
  public static AppBrandInitConfig a(WxaAttributes paramWxaAttributes)
  {
    GMTrace.i(20754624151552L, 154634);
    AppBrandInitConfig localAppBrandInitConfig = null;
    if (paramWxaAttributes != null)
    {
      localAppBrandInitConfig = new AppBrandInitConfig();
      localAppBrandInitConfig.username = paramWxaAttributes.field_username;
      localAppBrandInitConfig.appId = paramWxaAttributes.field_appId;
      localAppBrandInitConfig.eEs = paramWxaAttributes.field_nickname;
      localAppBrandInitConfig.iconUrl = paramWxaAttributes.field_brandIconURL;
      if (paramWxaAttributes.UD().hRI == 0) {
        break label81;
      }
    }
    label81:
    for (boolean bool = true;; bool = false)
    {
      localAppBrandInitConfig.hQw = bool;
      GMTrace.o(20754624151552L, 154634);
      return localAppBrandInitConfig;
    }
  }
  
  public static void init()
  {
    GMTrace.i(20753818845184L, 154628);
    try
    {
      hQC = new e();
      q.UC().c(hQC);
      GMTrace.o(20753818845184L, 154628);
      return;
    }
    finally {}
  }
  
  private AppBrandInitConfig pj(String paramString)
  {
    GMTrace.i(20754489933824L, 154633);
    if (bg.nm(paramString))
    {
      GMTrace.o(20754489933824L, 154633);
      return null;
    }
    Object localObject2;
    synchronized (this.hQE)
    {
      localObject2 = (String)this.hQE.get(paramString);
      if (bg.nm((String)localObject2))
      {
        localObject2 = a(com.tencent.mm.plugin.appbrand.app.e.Se().d(paramString, new String[] { "appId", "appInfo", "brandIconURL", "nickname" }));
        ??? = localObject2;
        if (localObject2 == null) {}
      }
    }
    for (;;)
    {
      synchronized (this.hQE)
      {
        this.hQE.put(paramString, ((AppBrandInitConfig)localObject2).appId);
        ??? = localObject2;
        GMTrace.o(20754489933824L, 154633);
        return (AppBrandInitConfig)???;
        paramString = finally;
        throw paramString;
      }
      ??? = pk((String)localObject2);
    }
  }
  
  public static void release()
  {
    GMTrace.i(20753953062912L, 154629);
    try
    {
      hQC = null;
      GMTrace.o(20753953062912L, 154629);
      return;
    }
    finally {}
  }
  
  public final void a(String arg1, l paraml)
  {
    GMTrace.i(20754221498368L, 154631);
    if ("single".equals(???))
    {
      if (String.class.isInstance(paraml.obj))
      {
        ??? = String.valueOf(paraml.obj);
        if (!bg.nm(???)) {
          pj(???);
        }
      }
      GMTrace.o(20754221498368L, 154631);
      return;
    }
    if ("batch".equals(???)) {
      synchronized (this.hQD)
      {
        this.hQD.clear();
        GMTrace.o(20754221498368L, 154631);
        return;
      }
    }
    GMTrace.o(20754221498368L, 154631);
  }
  
  public final String pi(String paramString)
  {
    GMTrace.i(20754355716096L, 154632);
    if (bg.nm(paramString))
    {
      GMTrace.o(20754355716096L, 154632);
      return null;
    }
    synchronized (this.hQE)
    {
      paramString = (String)this.hQE.get(paramString);
      GMTrace.o(20754355716096L, 154632);
      return paramString;
    }
  }
  
  public final AppBrandInitConfig pk(String paramString)
  {
    GMTrace.i(20754758369280L, 154635);
    if (bg.nm(paramString))
    {
      GMTrace.o(20754758369280L, 154635);
      return null;
    }
    synchronized (this.hQD)
    {
      AppBrandInitConfig localAppBrandInitConfig = (AppBrandInitConfig)this.hQD.remove(paramString);
      ??? = localAppBrandInitConfig;
      if (localAppBrandInitConfig == null) {
        ??? = a(com.tencent.mm.plugin.appbrand.app.e.Se().e(paramString, new String[] { "appInfo", "brandIconURL", "nickname" }));
      }
      GMTrace.o(20754758369280L, 154635);
      return (AppBrandInitConfig)???;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
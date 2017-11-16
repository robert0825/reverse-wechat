package com.tencent.mm.plugin.appbrand.dynamic.i;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.c.a;
import com.tencent.mm.plugin.appbrand.appcache.j;
import com.tencent.mm.plugin.appbrand.appcache.t;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.appcache.y.a;
import com.tencent.mm.plugin.appbrand.appcache.y.a.a;
import com.tencent.mm.plugin.appbrand.appcache.y.a.b;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.d.a;
import com.tencent.mm.plugin.appbrand.widget.r;
import com.tencent.mm.protocal.c.afu;
import com.tencent.mm.protocal.c.afv;
import com.tencent.mm.protocal.c.btw;
import com.tencent.mm.protocal.c.btx;
import com.tencent.mm.protocal.c.bty;
import com.tencent.mm.protocal.c.bvl;
import com.tencent.mm.protocal.c.md;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.LinkedList;

public final class a
{
  public static d a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18339778789376L, 136642);
    Bundle localBundle = new Bundle();
    localBundle.putString("appId", paramString);
    localBundle.putInt("pkgType", paramInt1);
    localBundle.putInt("pkgVersion", paramInt2);
    localBundle.putInt("widgetType", paramInt3);
    localBundle.putInt("scene", paramInt4);
    localBundle = (Bundle)com.tencent.mm.ipcinvoker.e.a("com.tencent.mm", localBundle, c.class);
    if (localBundle == null)
    {
      GMTrace.o(18339778789376L, 136642);
      return null;
    }
    d locald = new d();
    locald.appId = paramString;
    locald.hVh = ((DebuggerInfo)localBundle.getParcelable("debuggerInfo"));
    paramString = localBundle.getByteArray("jsApiInfo");
    if (paramString != null) {
      locald.hVl = new md();
    }
    try
    {
      locald.hVl.aD(paramString);
      paramString = localBundle.getByteArray("launchAction");
      if (paramString != null) {
        locald.hVk = new btx();
      }
    }
    catch (IOException paramString)
    {
      try
      {
        locald.hVk.aD(paramString);
        paramString = localBundle.getByteArray("versionInfo");
        if (paramString != null) {
          locald.hVm = new bty();
        }
      }
      catch (IOException paramString)
      {
        try
        {
          for (;;)
          {
            locald.hVm.aD(paramString);
            locald.hVi = ((WidgetSysConfig)localBundle.getParcelable("sysConfig"));
            locald.hVj = ((WidgetRuntimeConfig)localBundle.getParcelable("runtimeConfig"));
            if (locald.hVj == null) {
              locald.hVj = new WidgetRuntimeConfig();
            }
            GMTrace.o(18339778789376L, 136642);
            return locald;
            paramString = paramString;
            w.v("MicroMsg.DynamicPkgUpdater", "parseFrom bytes failed : %s", new Object[] { paramString });
          }
          paramString = paramString;
          w.v("MicroMsg.DynamicPkgUpdater", "parseFrom bytes failed : %s", new Object[] { paramString });
        }
        catch (IOException paramString)
        {
          for (;;)
          {
            w.v("MicroMsg.DynamicPkgUpdater", "parseFrom bytes failed : %s", new Object[] { paramString });
          }
        }
      }
    }
  }
  
  public static WxaPkgWrappingInfo d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(17844381155328L, 132951);
    Bundle localBundle = new Bundle();
    localBundle.putString("appId", paramString1);
    localBundle.putInt("pkgType", paramInt1);
    localBundle.putInt("pkgVersion", paramInt2);
    localBundle.putString("searchId", paramString2);
    paramString2 = com.tencent.mm.plugin.appbrand.dynamic.b.e.pK(v(paramString1, paramInt1, paramInt2));
    if (paramString2 != null)
    {
      GMTrace.o(17844381155328L, 132951);
      return paramString2;
    }
    paramString2 = (WxaPkgWrappingInfo)com.tencent.mm.ipcinvoker.e.a("com.tencent.mm", localBundle, a.class);
    if (paramString2 != null) {
      com.tencent.mm.plugin.appbrand.dynamic.b.e.a(v(paramString1, paramInt1, paramInt2), paramString2);
    }
    GMTrace.o(17844381155328L, 132951);
    return paramString2;
  }
  
  private static String v(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(17725061595136L, 132062);
    paramString = paramString + "#" + paramInt1 + "#" + paramInt2;
    GMTrace.o(17725061595136L, 132062);
    return paramString;
  }
  
  private static class a
    implements i<Bundle, WxaPkgWrappingInfo>
  {
    private a()
    {
      GMTrace.i(17722914111488L, 132046);
      GMTrace.o(17722914111488L, 132046);
    }
    
    private static WxaPkgWrappingInfo r(Bundle paramBundle)
    {
      GMTrace.i(18341255184384L, 136653);
      String str = paramBundle.getString("appId");
      int j = paramBundle.getInt("pkgType");
      int i = paramBundle.getInt("pkgVersion");
      paramBundle.getInt("scene");
      Object localObject1 = paramBundle.getString("searchId");
      switch (j)
      {
      default: 
        paramBundle = "";
      }
      try
      {
        localObject2 = ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(str, j, new String[] { "downloadURL", "version" });
        if (localObject2 != null)
        {
          paramBundle = ((t)localObject2).field_downloadURL;
          i = ((t)localObject2).field_version;
        }
        paramBundle = new com.tencent.mm.plugin.appbrand.dynamic.launching.c(str, (String)localObject1, j, i, com.tencent.mm.plugin.appbrand.dynamic.launching.c.hUx, paramBundle).Vi();
        GMTrace.o(18341255184384L, 136653);
        return paramBundle;
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          Object localObject2;
          int k;
          btw localbtw;
          label493:
          label908:
          w.e("MicroMsg.DynamicPkgUpdater", "CheckWidgetPkg error : %s", new Object[] { paramBundle });
        }
      }
      if (new com.tencent.mm.plugin.appbrand.dynamic.launching.d(str, "", "", (byte)0).Vk() == d.a.hUE - 1)
      {
        paramBundle = ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(str, j, new String[] { "downloadURL" });
        if (paramBundle == null)
        {
          w.e("MicroMsg.DynamicPkgUpdater", "WxaPkgManifestRecord(%s, %d) is null.", new Object[] { str, Integer.valueOf(j) });
          GMTrace.o(18341255184384L, 136653);
          return null;
        }
        try
        {
          paramBundle = new com.tencent.mm.plugin.appbrand.dynamic.launching.c(str, (String)localObject1, j, i, com.tencent.mm.plugin.appbrand.dynamic.launching.c.hUx, paramBundle.field_downloadURL).Vi();
          GMTrace.o(18341255184384L, 136653);
          return paramBundle;
        }
        catch (Exception paramBundle)
        {
          w.e("MicroMsg.DynamicPkgUpdater", "getWxaPkgInfo(%s, %d) error : %s", new Object[] { str, Integer.valueOf(j), paramBundle });
          GMTrace.o(18341255184384L, 136653);
          return null;
        }
        paramBundle = (WxaPkgWrappingInfo)com.tencent.mm.plugin.appbrand.appcache.s.p(str, j, i).second;
        GMTrace.o(18341255184384L, 136653);
        return paramBundle;
        paramBundle = ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(str, j, new String[] { "downloadURL" });
        com.tencent.mm.kernel.h.xw();
        k = com.tencent.mm.kernel.a.ww();
        localObject1 = new b.a();
        localObject2 = new afu();
        ((afu)localObject2).eSd = str;
        ((afu)localObject2).uvu = k;
        localbtw = new btw();
        switch (j)
        {
        default: 
          localbtw.tWR = 0;
          localbtw.vcC = 0;
          if (paramBundle != null)
          {
            localbtw.eDW = paramBundle.field_versionMd5;
            ((afu)localObject2).uvv = new LinkedList();
            ((afu)localObject2).uvv.add(localbtw);
            ((b.a)localObject1).gtF = ((com.tencent.mm.bm.a)localObject2);
            ((b.a)localObject1).gtG = new afv();
            ((b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/wxaapp/getwidgetinfo";
            ((b.a)localObject1).gtE = 1186;
            paramBundle = com.tencent.mm.plugin.appbrand.g.c.c(((b.a)localObject1).DA());
            if ((paramBundle.errType != 0) || (paramBundle.errCode != 0)) {
              break label908;
            }
            paramBundle = (afv)paramBundle.eWz;
            if ((paramBundle != null) && (paramBundle.uvv != null) && (paramBundle.uvv.size() > 0))
            {
              paramBundle = (btw)paramBundle.uvv.getFirst();
              w.i("MicroMsg.DynamicPkgUpdater", "getWidgetInfo debugType %d, md5 %s, url %s", new Object[] { Integer.valueOf(j), paramBundle.eDW, paramBundle.url });
              if ((paramBundle.url != null) && (paramBundle.url.length() > 0)) {
                switch (j)
                {
                }
              }
            }
          }
          break;
        }
        for (;;)
        {
          paramBundle = (WxaPkgWrappingInfo)com.tencent.mm.plugin.appbrand.appcache.s.p(str, j, i).second;
          GMTrace.o(18341255184384L, 136653);
          return paramBundle;
          localbtw.tWR = 1;
          localbtw.vcC = 1;
          break;
          localbtw.tWR = 2;
          localbtw.vcC = 1;
          break;
          localbtw.eDW = "";
          break label493;
          ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(str, 10000, paramBundle.url, paramBundle.eDW, 0L, 0L);
          continue;
          ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(str, 10001, paramBundle.url, paramBundle.eDW, 0L, 0L);
          continue;
          ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(str, 10100, paramBundle.url, paramBundle.eDW, 0L, 0L);
          continue;
          ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(str, 10101, paramBundle.url, paramBundle.eDW, 0L, 0L);
          continue;
          w.i("MicroMsg.DynamicPkgUpdater", "cgi fail errType %d, errCode %d,errMsg %s, appid %s , pkgType %d", new Object[] { Integer.valueOf(paramBundle.errType), Integer.valueOf(paramBundle.errCode), paramBundle.eAR, str, Integer.valueOf(j) });
        }
        paramBundle = "";
        try
        {
          localObject2 = ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RZ().a(str, j, new String[] { "downloadURL", "version" });
          if (localObject2 != null)
          {
            paramBundle = ((t)localObject2).field_downloadURL;
            i = ((t)localObject2).field_version;
          }
          paramBundle = new com.tencent.mm.plugin.appbrand.dynamic.launching.c(str, (String)localObject1, j, i, com.tencent.mm.plugin.appbrand.dynamic.launching.c.hUy, paramBundle).Vi();
          GMTrace.o(18341255184384L, 136653);
          return paramBundle;
        }
        catch (Exception paramBundle)
        {
          w.e("MicroMsg.DynamicPkgUpdater", "CheckWidgetPkg error : %s", new Object[] { paramBundle });
        }
      }
      GMTrace.o(18341255184384L, 136653);
      return null;
    }
  }
  
  private static class b
    implements g<Bundle, Bundle>
  {
    private b()
    {
      GMTrace.i(17785996443648L, 132516);
      GMTrace.o(17785996443648L, 132516);
    }
  }
  
  private static class c
    implements i<Bundle, Bundle>
  {
    private c()
    {
      GMTrace.i(17843978502144L, 132948);
      GMTrace.o(17843978502144L, 132948);
    }
    
    private static Bundle l(Bundle paramBundle)
    {
      boolean bool2 = true;
      GMTrace.i(17844112719872L, 132949);
      Object localObject1 = paramBundle.getString("appId");
      int i = paramBundle.getInt("pkgType");
      int j = paramBundle.getInt("pkgVersion");
      int k = paramBundle.getInt("scene");
      int m = paramBundle.getInt("widgetType");
      paramBundle = new Bundle();
      try
      {
        localObject3 = new com.tencent.mm.plugin.appbrand.dynamic.launching.b((String)localObject1, i, j, k, m).Vh();
        if (localObject3 == null)
        {
          GMTrace.o(17844112719872L, 132949);
          return paramBundle;
        }
        if (((com.tencent.mm.plugin.appbrand.widget.o)localObject3).field_jsApiInfo != null) {
          paramBundle.putByteArray("jsApiInfo", ((com.tencent.mm.plugin.appbrand.widget.o)localObject3).field_jsApiInfo.toByteArray());
        }
        if (((com.tencent.mm.plugin.appbrand.widget.o)localObject3).field_launchAction != null) {
          paramBundle.putByteArray("launchAction", ((com.tencent.mm.plugin.appbrand.widget.o)localObject3).field_launchAction.toByteArray());
        }
        if (((com.tencent.mm.plugin.appbrand.widget.o)localObject3).field_versionInfo != null) {
          paramBundle.putByteArray("versionInfo", ((com.tencent.mm.plugin.appbrand.widget.o)localObject3).field_versionInfo.toByteArray());
        }
        localObject2 = new WidgetRuntimeConfig();
        ((WidgetRuntimeConfig)localObject2).appId = ((String)localObject1);
        ((WidgetRuntimeConfig)localObject2).hUw = m;
        localObject3 = ((com.tencent.mm.plugin.appbrand.widget.o)localObject3).field_widgetSetting;
        if (localObject3 != null)
        {
          ((WidgetRuntimeConfig)localObject2).hUL = ((bvl)localObject3).vdH;
          ((WidgetRuntimeConfig)localObject2).hUN = ((bvl)localObject3).vdJ;
          ((WidgetRuntimeConfig)localObject2).hUM = ((bvl)localObject3).vdI;
        }
        paramBundle.putParcelable("runtimeConfig", (Parcelable)localObject2);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject3;
          Object localObject2;
          w.w("MicroMsg.DynamicPkgUpdater", "check widget launch info error : %s", new Object[] { localException });
          continue;
          boolean bool1 = false;
          continue;
          bool1 = false;
          continue;
          bool1 = false;
        }
      }
      localObject2 = ((com.tencent.mm.plugin.appbrand.widget.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.widget.a.a.class)).Sh().sO((String)localObject1);
      localObject1 = com.tencent.mm.plugin.appbrand.dynamic.debugger.b.pL((String)localObject1);
      localObject3 = new DebuggerInfo();
      if ((localObject2 != null) && (((r)localObject2).field_openDebug))
      {
        bool1 = true;
        ((DebuggerInfo)localObject3).hTu = bool1;
        if ((!c.a.fI(i)) && ((localObject1 == null) || (!((DebuggerInfo)localObject1).hTt))) {
          break label439;
        }
        bool1 = true;
        ((DebuggerInfo)localObject3).hTt = bool1;
        if ((localObject1 == null) || (!((DebuggerInfo)localObject1).hTv)) {
          break label445;
        }
        bool1 = bool2;
        ((DebuggerInfo)localObject3).hTv = bool1;
        paramBundle.putParcelable("debuggerInfo", (Parcelable)localObject3);
        localObject1 = AppBrandGlobalSystemConfig.Uu();
        localObject2 = new WidgetSysConfig();
        ((WidgetSysConfig)localObject2).hQj = ((AppBrandGlobalSystemConfig)localObject1).hQj;
        ((WidgetSysConfig)localObject2).hQk = ((AppBrandGlobalSystemConfig)localObject1).hQk;
        ((WidgetSysConfig)localObject2).hQl = ((AppBrandGlobalSystemConfig)localObject1).hQl;
        paramBundle.putParcelable("sysConfig", (Parcelable)localObject2);
        GMTrace.o(17844112719872L, 132949);
        return paramBundle;
      }
    }
  }
  
  private static class d
    implements i<Bundle, WxaPkgWrappingInfo>
  {
    private d()
    {
      GMTrace.i(17721840369664L, 132038);
      GMTrace.o(17721840369664L, 132038);
    }
    
    private static WxaPkgWrappingInfo Vq()
    {
      GMTrace.i(17721974587392L, 132039);
      for (;;)
      {
        try
        {
          new com.tencent.mm.plugin.appbrand.dynamic.launching.a();
          ab.bPV();
          localObject1 = new j().bW(false);
          if (localObject1 == null) {
            continue;
          }
          ((WxaPkgWrappingInfo)localObject1).hKC = 0;
        }
        catch (Exception localException)
        {
          Object localObject1;
          WxaPkgWrappingInfo localWxaPkgWrappingInfo;
          w.e("MicroMsg.DynamicPkgUpdater", "getLibPkgInfo error : %s", new Object[] { Log.getStackTraceString(localException) });
          Object localObject2 = null;
          continue;
        }
        GMTrace.o(17721974587392L, 132039);
        return (WxaPkgWrappingInfo)localObject1;
        localWxaPkgWrappingInfo = new j().bW(true);
        localObject1 = localWxaPkgWrappingInfo;
        if (localWxaPkgWrappingInfo == null)
        {
          localWxaPkgWrappingInfo = com.tencent.mm.plugin.appbrand.appcache.a.ol("@LibraryAppId");
          localObject1 = localWxaPkgWrappingInfo;
          if (localWxaPkgWrappingInfo == null) {
            localObject1 = com.tencent.mm.plugin.appbrand.appcache.o.SG();
          }
        }
      }
    }
  }
  
  private static class e
    implements g<Bundle, Bundle>
  {
    private e()
    {
      GMTrace.i(17723853635584L, 132053);
      GMTrace.o(17723853635584L, 132053);
    }
  }
  
  public static abstract interface f
  {
    public abstract void K(String paramString, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\i\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
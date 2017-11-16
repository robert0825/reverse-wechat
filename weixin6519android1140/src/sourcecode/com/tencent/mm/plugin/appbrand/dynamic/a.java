package com.tencent.mm.plugin.appbrand.dynamic;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.jsapi.core.MiniJsBridge;
import com.tencent.mm.plugin.appbrand.collector.CollectSession;
import com.tencent.mm.plugin.appbrand.dynamic.e.f;
import com.tencent.mm.plugin.appbrand.dynamic.g.e;
import com.tencent.mm.plugin.appbrand.widget.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import junit.framework.Assert;

public final class a
{
  public String fXC;
  public String hSf;
  public g hSg;
  
  public a(g paramg)
  {
    GMTrace.i(17731638263808L, 132111);
    this.hSg = paramg;
    GMTrace.o(17731638263808L, 132111);
  }
  
  private static class a
    implements com.tencent.mm.ipcinvoker.a
  {
    private a()
    {
      GMTrace.i(17728953909248L, 132091);
      GMTrace.o(17728953909248L, 132091);
    }
    
    public final void a(final Bundle paramBundle, final com.tencent.mm.ipcinvoker.c paramc)
    {
      GMTrace.i(18311995719680L, 136435);
      paramc = paramBundle.getString("id");
      final String str = paramBundle.getString("appId");
      paramBundle = paramBundle.getBundle("extData");
      final c localc = d.UO().pG(paramc);
      if (localc == null)
      {
        w.e("MicroMsg.IPCInvoke_AttachTo", "get DynamicPageViewIPCProxy(id : %s) return null.", new Object[] { paramc });
        GMTrace.o(18311995719680L, 136435);
        return;
      }
      b.k(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17728551256064L, 132088);
          c localc = localc;
          String str = paramc;
          Object localObject2 = str;
          Object localObject4 = paramBundle;
          Assert.assertNotNull(str);
          if ((!str.equals(localc.fXC)) && (localc.fXz != null))
          {
            localc.cleanup();
            localc.mRunning = false;
            localc.fXz = null;
          }
          localc.fXC = str;
          localc.appId = ((String)localObject2);
          Object localObject1 = "";
          long l = 0L;
          if (localObject4 != null)
          {
            localObject1 = ((Bundle)localObject4).getString("cache_key", "");
            localc.gRc = ((Bundle)localObject4).getString("query");
            localc.mUrl = ((Bundle)localObject4).getString("url");
            localc.hSt = ((Bundle)localObject4).getInt("widget_type");
            localc.hSv = ((Bundle)localObject4).getString("search_id");
            localc.hNz = ((Bundle)localObject4).getString("__session_id");
            l = ((Bundle)localObject4).getLong("__on_bind_nano_time");
            if (!bg.nm(localc.hNz)) {
              com.tencent.mm.plugin.appbrand.collector.c.a((CollectSession)((Bundle)localObject4).getParcelable("__cost_time_session"));
            }
          }
          w.i("MicroMsg.DynamicPageViewIPCProxy", "attach(%s, %s, %s)", new Object[] { str, localObject2, localObject1 });
          int i = 1;
          localc.hSu = com.tencent.mm.plugin.appbrand.dynamic.i.b.pU(str);
          if (localc.hSu == null)
          {
            localc.hSu = new l();
            i = 0;
          }
          if (localc.hSt == 1) {}
          for (int j = 0;; j = i)
          {
            localc.hSu.field_id = str;
            localc.hSu.field_cacheKey = ((String)localObject1);
            localc.hSu.field_appId = ((String)localObject2);
            if (localc.fXz == null)
            {
              com.tencent.mm.plugin.appbrand.collector.c.aM(localc.hNz, "before_init_js_engine");
              localObject1 = localc.mContext;
              str = localc.fXC;
              localObject2 = h.pI(str);
              if ((localObject2 == null) || (localObject4 == null))
              {
                w.w("MicroMsg.WxaWidgetInitializer", "FwContext is null(id : %s)", new Object[] { str });
                localObject1 = null;
                localc.fXz = ((MiniJsBridge)localObject1);
                com.tencent.mm.plugin.appbrand.collector.c.aM(localc.hNz, "after_init_js_engine");
                localc.fXz.fXC = localc.fXC;
                if (localObject4 != null) {
                  localc.q(((Bundle)localObject4).getBundle("__env_args"));
                }
                localc.fXz.onStart();
                if (!localc.hSw) {
                  break label755;
                }
                localc.fXz.b(new f());
                label454:
                MiniJsBridge localMiniJsBridge = localc.fXz;
                str = "";
                localObject1 = "";
                localObject2 = "";
                Object localObject3 = null;
                int k = 0;
                i = 0;
                if (localObject4 != null)
                {
                  k = ((Bundle)localObject4).getInt("view_init_width");
                  i = ((Bundle)localObject4).getInt("view_init_height");
                  str = ((Bundle)localObject4).getString("cache_key", "");
                  localObject1 = ((Bundle)localObject4).getString("msg_title", "");
                  localObject3 = ((Bundle)localObject4).getString("msg_path", "");
                  localObject2 = com.tencent.mm.plugin.appbrand.n.h.sv((String)localObject3);
                  localObject3 = com.tencent.mm.plugin.appbrand.n.h.sw((String)localObject3);
                }
                localObject4 = new com.tencent.mm.plugin.appbrand.dynamic.e.b();
                ((com.tencent.mm.plugin.appbrand.dynamic.e.b)localObject4).hUt = str;
                ((com.tencent.mm.plugin.appbrand.dynamic.e.b)localObject4).title = ((String)localObject1);
                ((com.tencent.mm.plugin.appbrand.dynamic.e.b)localObject4).path = ((String)localObject2);
                ((com.tencent.mm.plugin.appbrand.dynamic.e.b)localObject4).hUs = ((Map)localObject3);
                ((com.tencent.mm.plugin.appbrand.dynamic.e.b)localObject4).hUu = k;
                ((com.tencent.mm.plugin.appbrand.dynamic.e.b)localObject4).hUv = i;
                localMiniJsBridge.a((com.tencent.mm.jsapi.b.c)localObject4);
                if (l > 0L)
                {
                  l = (System.nanoTime() - l) / 1000000L;
                  i = 7;
                  if (l > 50L) {
                    break label773;
                  }
                  i = 0;
                  label638:
                  com.tencent.mm.plugin.report.service.g.ork.a(677L, i, 1L, false);
                }
                com.tencent.mm.plugin.appbrand.collector.c.aM(localc.hNz, "init_finish");
                com.tencent.mm.plugin.appbrand.collector.c.print(localc.hNz);
              }
            }
            for (;;)
            {
              localc.mRunning = true;
              if (j != 0) {
                c.a(localc.fXz, localc.hSu);
              }
              localc.UN();
              GMTrace.o(17728551256064L, 132088);
              return;
              w.i("MicroMsg.WxaWidgetInitializer", "initJsBridge(%s)", new Object[] { str });
              localObject1 = e.a((Context)localObject1, (WxaWidgetContext)localObject2, new com.tencent.mm.plugin.appbrand.dynamic.d.b.a(str, ((WxaWidgetContext)localObject2).UU()), (Bundle)localObject4);
              break;
              label755:
              localc.fXz.c(new com.tencent.mm.plugin.appbrand.dynamic.e.g());
              break label454;
              label773:
              if (l <= 100L)
              {
                i = 1;
                break label638;
              }
              if (l <= 200L)
              {
                i = 2;
                break label638;
              }
              if (l <= 300L)
              {
                i = 3;
                break label638;
              }
              if (l <= 400L)
              {
                i = 4;
                break label638;
              }
              if (l <= 500L)
              {
                i = 5;
                break label638;
              }
              if (l > 600L) {
                break label638;
              }
              i = 6;
              break label638;
              com.tencent.mm.plugin.appbrand.collector.c.oQ(localc.hNz);
              if (localObject4 != null) {
                localc.q(((Bundle)localObject4).getBundle("__env_args"));
              }
              localc.fXz.onStart();
              if (localc.hSw) {
                localc.fXz.b(new f());
              } else {
                localc.fXz.c(new com.tencent.mm.plugin.appbrand.dynamic.e.g());
              }
            }
          }
        }
      });
      GMTrace.o(18311995719680L, 136435);
    }
  }
  
  private static class b
    implements com.tencent.mm.ipcinvoker.a
  {
    private b()
    {
      GMTrace.i(17758079156224L, 132308);
      GMTrace.o(17758079156224L, 132308);
    }
    
    public final void a(final Bundle paramBundle, final com.tencent.mm.ipcinvoker.c paramc)
    {
      Object localObject = null;
      GMTrace.i(18297500205056L, 136327);
      final String str = paramBundle.getString("id");
      paramBundle = d.UO();
      if (bg.nm(str))
      {
        w.w("MicroMsg.DynamicPageViewIPCProxyManager", "remove IPCProxy from manager failed, key is null or nil.");
        paramBundle = (Bundle)localObject;
        if (paramBundle == null)
        {
          w.e("MicroMsg.IPCInvoke_Detach", "get DynamicPageViewIPCProxy(id : %s) return null.", new Object[] { str });
          GMTrace.o(18297500205056L, 136327);
        }
      }
      else
      {
        c localc = (c)paramBundle.hSE.remove(str);
        if (localc != null) {}
        for (paramBundle = Integer.valueOf(localc.hashCode());; paramBundle = null)
        {
          w.d("MicroMsg.DynamicPageViewIPCProxyManager", "remove IPCProxy success.(key : %s, ref : %s)", new Object[] { str, paramBundle });
          paramBundle = (Bundle)localObject;
          if (localc == null) {
            break;
          }
          paramBundle = localc;
          break;
        }
      }
      b.k(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17751770923008L, 132261);
          c localc = paramBundle;
          w.i("MicroMsg.DynamicPageViewIPCProxy", "detach(%s)", new Object[] { localc.fXC });
          localc.mRunning = false;
          localc.cleanup();
          localc.fXz = null;
          localc.hSu = null;
          localc.fXC = null;
          localc.hNz = null;
          h.pJ(str);
          paramc.k(null);
          GMTrace.o(17751770923008L, 132261);
        }
      });
      GMTrace.o(18297500205056L, 136327);
    }
  }
  
  private static class c
    implements com.tencent.mm.ipcinvoker.a
  {
    private c()
    {
      GMTrace.i(17734859489280L, 132135);
      GMTrace.o(17734859489280L, 132135);
    }
    
    public final void a(Bundle paramBundle, final com.tencent.mm.ipcinvoker.c paramc)
    {
      GMTrace.i(18345147498496L, 136682);
      String str1 = paramBundle.getString("id");
      String str2 = paramBundle.getString("appId");
      int i = paramBundle.getInt("wxaPkgType");
      int j = paramBundle.getInt("pkgVersion");
      int k = paramBundle.getInt("scene");
      String str3 = paramBundle.getString("searchId");
      int m = paramBundle.getInt("widgetType");
      d locald;
      if (d.UO().pG(str1) == null)
      {
        paramBundle = new c(ab.getContext());
        locald = d.UO();
        if (!bg.nm(str1)) {
          break label154;
        }
        w.w("MicroMsg.DynamicPageViewIPCProxyManager", "add IPCProxy into manager failed, key is null or nil.");
      }
      for (;;)
      {
        paramBundle = new WxaWidgetInitializer.a()
        {
          public final void a(String paramAnonymousString1, String paramAnonymousString2, boolean paramAnonymousBoolean, WxaWidgetContext paramAnonymousWxaWidgetContext)
          {
            GMTrace.i(20779185995776L, 154817);
            Bundle localBundle = new Bundle();
            localBundle.putInt("op", 1);
            localBundle.putString("id", paramAnonymousString1);
            localBundle.putString("appId", paramAnonymousString2);
            localBundle.putBoolean("success", paramAnonymousBoolean);
            if (paramAnonymousWxaWidgetContext != null)
            {
              localBundle.putParcelable("fwContext", paramAnonymousWxaWidgetContext);
              h.a(paramAnonymousString1, paramAnonymousWxaWidgetContext);
            }
            paramc.k(localBundle);
            GMTrace.o(20779185995776L, 154817);
          }
          
          public final void aS(String paramAnonymousString1, String paramAnonymousString2)
          {
            GMTrace.i(17740765069312L, 132179);
            Bundle localBundle = new Bundle();
            localBundle.putInt("op", 0);
            localBundle.putString("id", paramAnonymousString1);
            localBundle.putString("appId", paramAnonymousString2);
            paramc.k(localBundle);
            GMTrace.o(17740765069312L, 132179);
          }
        };
        b.j(new WxaWidgetInitializer.1(str1, com.tencent.mm.plugin.appbrand.dynamic.j.a.bp(m, i), j, str2, m, k, paramBundle, str3));
        GMTrace.o(18345147498496L, 136682);
        return;
        label154:
        if ((c)locald.hSE.put(str1, paramBundle) != null) {
          w.i("MicroMsg.DynamicPageViewIPCProxyManager", "add a new IPCProxy and remove old one with key : %s.", new Object[] { str1 });
        }
        w.d("MicroMsg.DynamicPageViewIPCProxyManager", "add IPCProxy success.(%s)", new Object[] { str1 });
      }
    }
  }
  
  private static class d
    implements com.tencent.mm.ipcinvoker.a
  {
    private d()
    {
      GMTrace.i(17755394801664L, 132288);
      GMTrace.o(17755394801664L, 132288);
    }
    
    public final void a(Bundle paramBundle, final com.tencent.mm.ipcinvoker.c paramc)
    {
      GMTrace.i(18311861501952L, 136434);
      paramBundle = paramBundle.getString("id");
      paramc = d.UO().pG(paramBundle);
      if (paramc == null)
      {
        w.e("MicroMsg.IPCInvoke_OnPause", "get DynamicPageViewIPCProxy(id : %s) return null.", new Object[] { paramBundle });
        GMTrace.o(18311861501952L, 136434);
        return;
      }
      b.k(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17731504046080L, 132110);
          paramc.onPause();
          GMTrace.o(17731504046080L, 132110);
        }
      });
      GMTrace.o(18311861501952L, 136434);
    }
  }
  
  private static class e
    implements com.tencent.mm.ipcinvoker.a
  {
    private e()
    {
      GMTrace.i(17732443570176L, 132117);
      GMTrace.o(17732443570176L, 132117);
    }
    
    public final void a(Bundle paramBundle, final com.tencent.mm.ipcinvoker.c paramc)
    {
      GMTrace.i(18330786201600L, 136575);
      paramBundle = paramBundle.getString("id");
      paramc = d.UO().pG(paramBundle);
      if (paramc == null)
      {
        w.e("MicroMsg.IPCInvoke_OnResume", "get DynamicPageViewIPCProxy(id : %s) return null.", new Object[] { paramBundle });
        GMTrace.o(18330786201600L, 136575);
        return;
      }
      b.k(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17751234052096L, 132257);
          paramc.onResume();
          GMTrace.o(17751234052096L, 132257);
        }
      });
      GMTrace.o(18330786201600L, 136575);
    }
  }
  
  private static class f
    implements i<Bundle, IPCBoolean>
  {
    private f()
    {
      GMTrace.i(19986093441024L, 148908);
      GMTrace.o(19986093441024L, 148908);
    }
  }
  
  private static class g
    implements com.tencent.mm.ipcinvoker.a
  {
    private g()
    {
      GMTrace.i(18940939993088L, 141121);
      GMTrace.o(18940939993088L, 141121);
    }
    
    public final void a(Bundle paramBundle, com.tencent.mm.ipcinvoker.c paramc)
    {
      GMTrace.i(18941074210816L, 141122);
      paramc = paramBundle.getString("id");
      paramBundle = paramBundle.getBundle("__env_args");
      if (paramBundle == null)
      {
        w.i("MicroMsg.IPCInvoke_UpdateEnvArgs", "envArgs is null.");
        GMTrace.o(18941074210816L, 141122);
        return;
      }
      c localc = d.UO().pG(paramc);
      if (localc == null)
      {
        w.e("MicroMsg.IPCInvoke_UpdateEnvArgs", "get DynamicPageViewIPCProxy(id : %s) return null.", new Object[] { paramc });
        GMTrace.o(18941074210816L, 141122);
        return;
      }
      localc.q(paramBundle);
      GMTrace.o(18941074210816L, 141122);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
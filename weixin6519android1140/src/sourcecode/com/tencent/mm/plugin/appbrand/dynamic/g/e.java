package com.tencent.mm.plugin.appbrand.dynamic.g;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.a.a;
import com.tencent.mm.jsapi.core.MiniJsBridge;
import com.tencent.mm.jsapi.core.b;
import com.tencent.mm.plugin.appbrand.appcache.o;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetContext;
import com.tencent.mm.plugin.appbrand.dynamic.d.m;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.jsengine.X5JSCoreBasedJsEngine;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.f;
import com.tencent.xweb.f.a;
import org.json.JSONObject;

public class e
{
  public static volatile MiniJsBridge hUV;
  public static volatile DebuggerInfo hUW;
  private static volatile boolean hUX;
  
  public e()
  {
    GMTrace.i(19910663077888L, 148346);
    GMTrace.o(19910663077888L, 148346);
  }
  
  public static MiniJsBridge a(Context paramContext, WxaWidgetContext paramWxaWidgetContext, com.tencent.mm.jsapi.c.a parama, Bundle paramBundle)
  {
    GMTrace.i(20770730278912L, 154754);
    for (;;)
    {
      try
      {
        Object localObject2 = hUV;
        hUV = null;
        Object localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = a(paramWxaWidgetContext.UW());
        }
        int i = paramBundle.getInt("widget_type");
        localObject2 = new com.tencent.mm.plugin.appbrand.dynamic.d.a.c();
        if (i == 1) {
          ((com.tencent.mm.plugin.appbrand.dynamic.d.a.c)localObject2).hTT = new com.tencent.mm.plugin.appbrand.dynamic.h.c(paramWxaWidgetContext.getAppId(), paramBundle.getString("search_id"));
        }
        paramBundle = new com.tencent.mm.jsapi.core.c(paramContext, (MiniJsBridge)localObject1, parama, (b)localObject2);
        paramBundle.fXv = m.it(i);
        ((MiniJsBridge)localObject1).fXD = paramBundle;
        paramBundle = ((MiniJsBridge)localObject1).fXF;
        ((MiniJsBridge)localObject1).fXE = new com.tencent.mm.jsapi.core.e(paramBundle, com.tencent.mm.plugin.appbrand.dynamic.e.a.iu(i), parama);
        ((MiniJsBridge)localObject1).fXH = com.tencent.mm.plugin.appbrand.dynamic.debugger.a.Vc();
        parama = paramWxaWidgetContext.UY();
        localObject2 = new JSONObject();
        b((JSONObject)localObject2, "widgetType", Integer.valueOf(parama.hUw));
        b((JSONObject)localObject2, "platform", "android");
        b((JSONObject)localObject2, "debug", Boolean.valueOf(paramWxaWidgetContext.UW().hTt));
        b((JSONObject)localObject2, "drawMinInterval", Integer.valueOf(paramWxaWidgetContext.UX().hQl));
        b((JSONObject)localObject2, "clientVersion", Integer.valueOf(com.tencent.mm.protocal.d.tJC));
        JSONObject localJSONObject = new JSONObject();
        b(localJSONObject, "drawMinInterval", Integer.valueOf(parama.hUL));
        b(localJSONObject, "timerEnabled", Boolean.valueOf(parama.hUM));
        b(localJSONObject, "drawLock", Boolean.valueOf(parama.hUN));
        parama = String.format("var __widgetConfig__ = %s;var __wxConfig = %s;var __wxIndexPage = \"%s\"", new Object[] { localJSONObject.toString(), ((JSONObject)localObject2).toString(), "" });
        paramBundle.evaluateJavascript(parama, null);
        w.v("MicroMsg.PreloadOptimizer", "injectConfig(%s, %s)", new Object[] { paramWxaWidgetContext.getId(), parama });
        parama = com.tencent.mm.plugin.appbrand.dynamic.i.c.aW(paramWxaWidgetContext.getId(), "WAWidget.js");
        if (bg.nm(parama))
        {
          parama = com.tencent.mm.plugin.appbrand.dynamic.i.c.convertStreamToString(o.openRead("WAWidget.js"));
          if (bg.nm(parama)) {
            w.e("MicroMsg.PreloadOptimizer", "get Null Or Nil widget js");
          }
          g.ork.a(636L, 0L, 1L, false);
          com.tencent.mm.jsapi.a.a(paramBundle, parama, new a.a()
          {
            public final void eu(String paramAnonymousString)
            {
              GMTrace.i(19909723553792L, 148339);
              g.ork.a(636L, 2L, 1L, false);
              w.e("MicroMsg.PreloadOptimizer", "Inject SDK widget Script Failed: %s", new Object[] { paramAnonymousString });
              GMTrace.o(19909723553792L, 148339);
            }
            
            public final void wk()
            {
              GMTrace.i(19909589336064L, 148338);
              g.ork.a(636L, 1L, 1L, false);
              GMTrace.o(19909589336064L, 148338);
            }
          });
          w.v("MicroMsg.PreloadOptimizer", "injectWAWidget(%s)", new Object[] { paramWxaWidgetContext.getId() });
          parama = com.tencent.mm.plugin.appbrand.dynamic.i.c.aW(paramWxaWidgetContext.getId(), "widget.js");
          if (bg.nm(parama)) {
            w.e("MicroMsg.PreloadOptimizer", "get Null Or Nil widget js");
          }
          g.ork.a(636L, 3L, 1L, false);
          com.tencent.mm.jsapi.a.a(paramBundle, parama, new a.a()
          {
            public final void eu(String paramAnonymousString)
            {
              GMTrace.i(19911602601984L, 148353);
              g.ork.a(636L, 5L, 1L, false);
              w.e("MicroMsg.PreloadOptimizer", "Inject External widget Script Failed: %s", new Object[] { paramAnonymousString });
              GMTrace.o(19911602601984L, 148353);
            }
            
            public final void wk()
            {
              GMTrace.i(19911468384256L, 148352);
              g.ork.a(636L, 4L, 1L, false);
              GMTrace.o(19911468384256L, 148352);
            }
          });
          w.v("MicroMsg.PreloadOptimizer", "injectWidget(%s)", new Object[] { paramWxaWidgetContext.getId() });
          bI(paramContext);
          GMTrace.o(20770730278912L, 154754);
          return (MiniJsBridge)localObject1;
        }
      }
      finally {}
    }
  }
  
  public static MiniJsBridge a(DebuggerInfo paramDebuggerInfo)
  {
    GMTrace.i(19911065731072L, 148349);
    MiniJsBridge localMiniJsBridge = new MiniJsBridge();
    int j = 0;
    int i = j;
    if (paramDebuggerInfo != null)
    {
      i = j;
      if (paramDebuggerInfo.hTu)
      {
        w.i("MicroMsg.PreloadOptimizer", "debug mode opened, use WebView  JavaScript Engine.");
        i = 1;
      }
    }
    paramDebuggerInfo = ab.getContext();
    if (i != 0)
    {
      paramDebuggerInfo = new com.tencent.mm.plugin.appbrand.dynamic.jsengine.c(paramDebuggerInfo, localMiniJsBridge, "WeixinJSCore", "https://servicewechat.com/app-widget");
      if (!paramDebuggerInfo.wq()) {
        break label158;
      }
      g.ork.a(639L, 1L, 1L, false);
      w.i("MicroMsg.PreloadOptimizer", "Using WebView Based Javascript Engine");
      label97:
      g.ork.a(639L, 0L, 1L, false);
      if (localMiniJsBridge.fXF == null) {
        break label183;
      }
      w.e("MicroMsg.MiniJsBridge", "can not initialize again.");
    }
    for (;;)
    {
      GMTrace.o(19911065731072L, 148349);
      return localMiniJsBridge;
      paramDebuggerInfo = new X5JSCoreBasedJsEngine(localMiniJsBridge, "WeixinJSCore", f.a(f.a.ync, paramDebuggerInfo));
      break;
      label158:
      g.ork.a(639L, 2L, 1L, false);
      w.i("MicroMsg.PreloadOptimizer", "Using v8 Javascript Engine");
      break label97;
      label183:
      localMiniJsBridge.fXF = paramDebuggerInfo;
    }
  }
  
  private static void b(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    GMTrace.i(19911199948800L, 148350);
    try
    {
      paramJSONObject.put(paramString, paramObject);
      GMTrace.o(19911199948800L, 148350);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.PreloadOptimizer", "put env arguments error, %s", new Object[] { paramJSONObject });
      GMTrace.o(19911199948800L, 148350);
    }
  }
  
  public static void bI(Context paramContext)
  {
    GMTrace.i(19910931513344L, 148348);
    if (!hUX)
    {
      GMTrace.o(19910931513344L, 148348);
      return;
    }
    com.tencent.mm.bv.a.U(new Runnable()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: ldc2_w 34
        //   3: ldc 36
        //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: ldc 8
        //   10: monitorenter
        //   11: getstatic 40	com/tencent/mm/plugin/appbrand/dynamic/g/e:hUV	Lcom/tencent/mm/jsapi/core/MiniJsBridge;
        //   14: ifnull +15 -> 29
        //   17: ldc 8
        //   19: monitorexit
        //   20: ldc2_w 34
        //   23: ldc 36
        //   25: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   28: return
        //   29: ldc 8
        //   31: monitorexit
        //   32: getstatic 44	com/tencent/mm/plugin/appbrand/dynamic/g/e:hUW	Lcom/tencent/mm/plugin/appbrand/dynamic/debugger/DebuggerInfo;
        //   35: invokestatic 48	com/tencent/mm/plugin/appbrand/dynamic/g/e:a	(Lcom/tencent/mm/plugin/appbrand/dynamic/debugger/DebuggerInfo;)Lcom/tencent/mm/jsapi/core/MiniJsBridge;
        //   38: astore_1
        //   39: ldc 8
        //   41: monitorenter
        //   42: aload_1
        //   43: putstatic 40	com/tencent/mm/plugin/appbrand/dynamic/g/e:hUV	Lcom/tencent/mm/jsapi/core/MiniJsBridge;
        //   46: ldc 8
        //   48: monitorexit
        //   49: ldc2_w 34
        //   52: ldc 36
        //   54: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   57: return
        //   58: astore_1
        //   59: ldc 8
        //   61: monitorexit
        //   62: aload_1
        //   63: athrow
        //   64: astore_1
        //   65: ldc 8
        //   67: monitorexit
        //   68: aload_1
        //   69: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	70	0	this	1
        //   38	5	1	localMiniJsBridge	MiniJsBridge
        //   58	5	1	localObject1	Object
        //   64	5	1	localObject2	Object
        // Exception table:
        //   from	to	target	type
        //   11	20	58	finally
        //   29	32	58	finally
        //   59	62	58	finally
        //   42	49	64	finally
        //   65	68	64	finally
      }
    });
    GMTrace.o(19910931513344L, 148348);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\g\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.task;

import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class c
{
  private static boolean izI;
  private static boolean izJ;
  private static HashSet<a> izK;
  private static List<AppBrandPageView> izL;
  private static List<j> izM;
  private static j izN;
  private static String izO;
  private static String izP;
  private static boolean izQ;
  private static boolean izS;
  
  static
  {
    GMTrace.i(17272076763136L, 128687);
    izI = false;
    izJ = false;
    izK = new HashSet();
    izL = new LinkedList();
    izM = new LinkedList();
    izO = null;
    izP = null;
    izQ = false;
    izS = false;
    GMTrace.o(17272076763136L, 128687);
  }
  
  public static void a(a parama, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(20690065424384L, 154153);
        if (paramBoolean) {
          reset();
        }
        if (izI)
        {
          if (parama != null) {
            izK.add(parama);
          }
          GMTrace.o(20690065424384L, 154153);
          return;
        }
        if (izJ)
        {
          if (parama != null) {
            parama.onReady();
          }
          GMTrace.o(20690065424384L, 154153);
          continue;
        }
        izI = true;
      }
      finally {}
      if (parama != null) {
        izK.add(parama);
      }
      w.i("AppBrandProcessPreloader", "TRACE_ORDER:AppBrandProcessPreloader.java");
      com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17273553158144L, 128698);
          w.i("AppBrandProcessPreloader", "preInit start");
          new com.tencent.mm.plugin.appbrand.h.l().init();
          com.tencent.mm.plugin.appbrand.appcache.l.load();
          c.aap();
          if (WebView.hasInited())
          {
            c.aan();
            GMTrace.o(17273553158144L, 128698);
            return;
          }
          WebView.initWebviewCore(ab.getContext(), MMWebView.xrT, new WebView.b()
          {
            public final void oR()
            {
              GMTrace.i(17270868803584L, 128678);
              c.aan();
              GMTrace.o(17270868803584L, 128678);
            }
            
            public final void oS()
            {
              GMTrace.i(19698733285376L, 146767);
              c.aan();
              GMTrace.o(19698733285376L, 146767);
            }
          });
          GMTrace.o(17273553158144L, 128698);
        }
      });
      GMTrace.o(20690065424384L, 154153);
    }
  }
  
  private static void aaj()
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        GMTrace.i(20690199642112L, 154154);
        if (izM.size() > 0)
        {
          GMTrace.o(20690199642112L, 154154);
          return;
        }
        j localj = new j();
        localj.hzQ = true;
        w.d("MicroMsg.AppBrandService", "preInjectConfig");
        JSONObject localJSONObject = new JSONObject();
        j.a(localJSONObject, "platform", "android");
        j.a(localJSONObject, "clientVersion", Integer.valueOf(com.tencent.mm.protocal.d.tJC));
        if (localj.hzO.q(com.tencent.mm.plugin.appbrand.jsruntime.c.class) != null)
        {
          j.a(localJSONObject, "nativeBufferEnabled", Boolean.valueOf(bool));
          j.a(localJSONObject, "preload", Boolean.valueOf(true));
          j.a(localJSONObject, "system", "Android " + Build.VERSION.RELEASE);
          localj.hzO.evaluateJavascript(String.format("var __wxConfig = %s;", new Object[] { localJSONObject.toString() }), null);
          localj.RU();
          izM.add(localj);
          izN = localj;
          GMTrace.o(20690199642112L, 154154);
        }
        else
        {
          bool = false;
        }
      }
      finally {}
    }
  }
  
  /* Error */
  private static void aak()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 219
    //   6: ldc -35
    //   8: invokestatic 42	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: getstatic 58	com/tencent/mm/plugin/appbrand/task/c:izL	Ljava/util/List;
    //   14: invokeinterface 118 1 0
    //   19: ifle +15 -> 34
    //   22: ldc2_w 219
    //   25: ldc -35
    //   27: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: ldc 2
    //   32: monitorexit
    //   33: return
    //   34: new 223	com/tencent/mm/plugin/appbrand/page/AppBrandPageView
    //   37: dup
    //   38: invokespecial 224	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:<init>	()V
    //   41: astore_0
    //   42: aload_0
    //   43: iconst_1
    //   44: putfield 225	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:hzQ	Z
    //   47: aload_0
    //   48: new 227	com/tencent/mm/plugin/appbrand/page/t
    //   51: dup
    //   52: new 229	android/content/MutableContextWrapper
    //   55: dup
    //   56: invokestatic 235	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   59: invokespecial 238	android/content/MutableContextWrapper:<init>	(Landroid/content/Context;)V
    //   62: invokespecial 239	com/tencent/mm/plugin/appbrand/page/t:<init>	(Landroid/content/Context;)V
    //   65: putfield 243	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:ivj	Lcom/tencent/mm/plugin/appbrand/page/t;
    //   68: aload_0
    //   69: getfield 243	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:ivj	Lcom/tencent/mm/plugin/appbrand/page/t;
    //   72: iconst_1
    //   73: putfield 246	com/tencent/mm/plugin/appbrand/page/t:iwk	Z
    //   76: aload_0
    //   77: getfield 243	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:ivj	Lcom/tencent/mm/plugin/appbrand/page/t;
    //   80: astore_1
    //   81: new 248	com/tencent/mm/plugin/appbrand/jsapi/AppBrandJSInterface
    //   84: dup
    //   85: aload_0
    //   86: invokespecial 251	com/tencent/mm/plugin/appbrand/jsapi/AppBrandJSInterface:<init>	(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;)V
    //   89: astore_2
    //   90: aload_0
    //   91: aload_2
    //   92: putfield 255	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:hzN	Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandJSInterface;
    //   95: aload_1
    //   96: aload_2
    //   97: ldc_w 257
    //   100: invokevirtual 261	com/tencent/mm/plugin/appbrand/page/t:addJavascriptInterface	(Ljava/lang/Object;Ljava/lang/String;)V
    //   103: aload_0
    //   104: getfield 243	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:ivj	Lcom/tencent/mm/plugin/appbrand/page/t;
    //   107: new 263	com/tencent/mm/plugin/appbrand/page/AppBrandPageView$DeviceInfoForSDK
    //   110: dup
    //   111: aload_0
    //   112: invokespecial 264	com/tencent/mm/plugin/appbrand/page/AppBrandPageView$DeviceInfoForSDK:<init>	(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;)V
    //   115: ldc_w 266
    //   118: invokevirtual 261	com/tencent/mm/plugin/appbrand/page/t:addJavascriptInterface	(Ljava/lang/Object;Ljava/lang/String;)V
    //   121: aload_0
    //   122: getfield 243	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:ivj	Lcom/tencent/mm/plugin/appbrand/page/t;
    //   125: invokevirtual 269	com/tencent/mm/plugin/appbrand/page/t:init	()V
    //   128: getstatic 58	com/tencent/mm/plugin/appbrand/task/c:izL	Ljava/util/List;
    //   131: aload_0
    //   132: invokeinterface 215 2 0
    //   137: pop
    //   138: ldc2_w 219
    //   141: ldc -35
    //   143: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   146: goto -116 -> 30
    //   149: astore_0
    //   150: ldc 2
    //   152: monitorexit
    //   153: aload_0
    //   154: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   41	91	0	localAppBrandPageView	AppBrandPageView
    //   149	5	0	localObject	Object
    //   80	16	1	localt	com.tencent.mm.plugin.appbrand.page.t
    //   89	8	2	localAppBrandJSInterface	com.tencent.mm.plugin.appbrand.jsapi.AppBrandJSInterface
    // Exception table:
    //   from	to	target	type
    //   3	30	149	finally
    //   34	146	149	finally
  }
  
  public static j aal()
  {
    try
    {
      GMTrace.i(20690602295296L, 154157);
      j localj = izN;
      GMTrace.o(20690602295296L, 154157);
      return localj;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void aam()
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        GMTrace.i(20690870730752L, 154159);
        if (WebView.getTbsCoreVersion(ab.getContext()) == 0)
        {
          w.i("MicroMsg.AppBrandProcessPreloader", "closeClientPreload without x5");
          if (!bool) {
            break label92;
          }
          w.i("MicroMsg.AppBrandProcessPreloader", "preLoadNextRuntime disable preload");
          GMTrace.o(20690870730752L, 154159);
          return;
        }
        if (!com.tencent.xweb.x5.sdk.d.canOpenWebPlus(ab.getContext()))
        {
          w.i("MicroMsg.AppBrandProcessPreloader", "closeClientPreload can not OpenWebPlus");
          continue;
        }
        bool = izQ;
      }
      finally {}
      continue;
      label92:
      aaj();
      aak();
      GMTrace.o(20690870730752L, 154159);
    }
  }
  
  /* Error */
  public static void aan()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 304
    //   6: ldc_w 306
    //   9: invokestatic 42	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: new 10	com/tencent/mm/plugin/appbrand/task/c$2
    //   15: dup
    //   16: invokespecial 307	com/tencent/mm/plugin/appbrand/task/c$2:<init>	()V
    //   19: astore_0
    //   20: invokestatic 313	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   23: invokevirtual 317	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   26: invokestatic 322	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   29: if_acmpne +22 -> 51
    //   32: aload_0
    //   33: invokeinterface 327 1 0
    //   38: ldc2_w 304
    //   41: ldc_w 306
    //   44: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   47: ldc 2
    //   49: monitorexit
    //   50: return
    //   51: aload_0
    //   52: invokestatic 331	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   55: ldc2_w 304
    //   58: ldc_w 306
    //   61: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   64: goto -17 -> 47
    //   67: astore_0
    //   68: ldc 2
    //   70: monitorexit
    //   71: aload_0
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   19	33	0	local2	2
    //   67	5	0	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	47	67	finally
    //   51	64	67	finally
  }
  
  public static boolean aao()
  {
    GMTrace.i(17271942545408L, 128686);
    boolean bool = izJ;
    GMTrace.o(17271942545408L, 128686);
    return bool;
  }
  
  public static void aap()
  {
    GMTrace.i(20691139166208L, 154161);
    Object localObject = a.b.fVY;
    localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.er("100308");
    if (localObject == null)
    {
      w.i("MicroMsg.AppBrandProcessPreloader", "initPreloadABTest item is null");
      GMTrace.o(20691139166208L, 154161);
      return;
    }
    if ((((com.tencent.mm.storage.c)localObject).isValid()) && ("1".equals(((com.tencent.mm.storage.c)localObject).bSg().get("closeClientPreload"))))
    {
      bool = true;
      izQ = bool;
      if ((!((com.tencent.mm.storage.c)localObject).isValid()) || (!"1".equals(((com.tencent.mm.storage.c)localObject).bSg().get("openDevelopControlPreload")))) {
        break label157;
      }
    }
    label157:
    for (boolean bool = true;; bool = false)
    {
      izS = bool;
      w.i("MicroMsg.AppBrandProcessPreloader", "initPreloadABTest close:%b, openDevelopCrt:%b", new Object[] { Boolean.valueOf(izQ), Boolean.valueOf(izS) });
      GMTrace.o(20691139166208L, 154161);
      return;
      bool = false;
      break;
    }
  }
  
  public static boolean aaq()
  {
    GMTrace.i(20691273383936L, 154162);
    boolean bool = izS;
    GMTrace.o(20691273383936L, 154162);
    return bool;
  }
  
  public static void done()
  {
    try
    {
      GMTrace.i(17271808327680L, 128685);
      w.i("AppBrandProcessPreloader", "preInit finished");
      izJ = true;
      izI = false;
      Iterator localIterator = izK.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (locala != null) {
          locala.onReady();
        }
      }
      izK.clear();
    }
    finally {}
    GMTrace.o(17271808327680L, 128685);
  }
  
  private static void reset()
  {
    try
    {
      GMTrace.i(20689796988928L, 154151);
      izI = false;
      izJ = false;
      izK.clear();
      izL.clear();
      izM.clear();
      izN = null;
      izO = null;
      izP = null;
      GMTrace.o(20689796988928L, 154151);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void sf(String paramString)
  {
    try
    {
      GMTrace.i(20689931206656L, 154152);
      izO = paramString;
      izP = paramString;
      GMTrace.o(20689931206656L, 154152);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public static j sg(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 422
    //   6: ldc_w 424
    //   9: invokestatic 42	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_0
    //   13: invokestatic 430	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   16: ifne +29 -> 45
    //   19: aload_0
    //   20: getstatic 64	com/tencent/mm/plugin/appbrand/task/c:izP	Ljava/lang/String;
    //   23: invokevirtual 378	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   26: ifeq +19 -> 45
    //   29: ldc2_w 422
    //   32: ldc_w 424
    //   35: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   38: aconst_null
    //   39: astore_0
    //   40: ldc 2
    //   42: monitorexit
    //   43: aload_0
    //   44: areturn
    //   45: aload_0
    //   46: putstatic 64	com/tencent/mm/plugin/appbrand/task/c:izP	Ljava/lang/String;
    //   49: getstatic 60	com/tencent/mm/plugin/appbrand/task/c:izM	Ljava/util/List;
    //   52: invokeinterface 118 1 0
    //   57: ifgt +17 -> 74
    //   60: ldc2_w 422
    //   63: ldc_w 424
    //   66: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   69: aconst_null
    //   70: astore_0
    //   71: goto -31 -> 40
    //   74: getstatic 60	com/tencent/mm/plugin/appbrand/task/c:izM	Ljava/util/List;
    //   77: iconst_0
    //   78: invokeinterface 433 2 0
    //   83: checkcast 120	com/tencent/mm/plugin/appbrand/j
    //   86: astore_0
    //   87: aload_0
    //   88: ifnonnull +17 -> 105
    //   91: ldc2_w 422
    //   94: ldc_w 424
    //   97: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   100: aconst_null
    //   101: astore_0
    //   102: goto -62 -> 40
    //   105: getstatic 60	com/tencent/mm/plugin/appbrand/task/c:izM	Ljava/util/List;
    //   108: aload_0
    //   109: invokeinterface 436 2 0
    //   114: pop
    //   115: ldc2_w 422
    //   118: ldc_w 424
    //   121: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   124: goto -84 -> 40
    //   127: astore_0
    //   128: ldc 2
    //   130: monitorexit
    //   131: aload_0
    //   132: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	paramString	String
    // Exception table:
    //   from	to	target	type
    //   3	38	127	finally
    //   45	69	127	finally
    //   74	87	127	finally
    //   91	100	127	finally
    //   105	124	127	finally
  }
  
  /* Error */
  public static AppBrandPageView sh(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 439
    //   6: ldc_w 441
    //   9: invokestatic 42	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_0
    //   13: invokestatic 430	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   16: ifne +29 -> 45
    //   19: aload_0
    //   20: getstatic 62	com/tencent/mm/plugin/appbrand/task/c:izO	Ljava/lang/String;
    //   23: invokevirtual 378	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   26: ifeq +19 -> 45
    //   29: ldc2_w 439
    //   32: ldc_w 441
    //   35: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   38: aconst_null
    //   39: astore_0
    //   40: ldc 2
    //   42: monitorexit
    //   43: aload_0
    //   44: areturn
    //   45: aload_0
    //   46: putstatic 62	com/tencent/mm/plugin/appbrand/task/c:izO	Ljava/lang/String;
    //   49: getstatic 58	com/tencent/mm/plugin/appbrand/task/c:izL	Ljava/util/List;
    //   52: invokeinterface 118 1 0
    //   57: ifgt +17 -> 74
    //   60: ldc2_w 439
    //   63: ldc_w 441
    //   66: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   69: aconst_null
    //   70: astore_0
    //   71: goto -31 -> 40
    //   74: getstatic 58	com/tencent/mm/plugin/appbrand/task/c:izL	Ljava/util/List;
    //   77: iconst_0
    //   78: invokeinterface 433 2 0
    //   83: checkcast 223	com/tencent/mm/plugin/appbrand/page/AppBrandPageView
    //   86: astore_0
    //   87: aload_0
    //   88: ifnonnull +17 -> 105
    //   91: ldc2_w 439
    //   94: ldc_w 441
    //   97: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   100: aconst_null
    //   101: astore_0
    //   102: goto -62 -> 40
    //   105: getstatic 58	com/tencent/mm/plugin/appbrand/task/c:izL	Ljava/util/List;
    //   108: aload_0
    //   109: invokeinterface 436 2 0
    //   114: pop
    //   115: ldc2_w 439
    //   118: ldc_w 441
    //   121: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   124: goto -84 -> 40
    //   127: astore_0
    //   128: ldc 2
    //   130: monitorexit
    //   131: aload_0
    //   132: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	paramString	String
    // Exception table:
    //   from	to	target	type
    //   3	38	127	finally
    //   45	69	127	finally
    //   74	87	127	finally
    //   91	100	127	finally
    //   105	124	127	finally
  }
  
  public static abstract interface a
  {
    public abstract void onReady();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\task\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
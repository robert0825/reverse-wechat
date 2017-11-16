package com.tencent.xweb;

import android.content.Context;
import com.tencent.xweb.a.g;
import com.tencent.xweb.a.g.a;
import com.tencent.xweb.util.b;
import com.tencent.xweb.util.e;
import org.xwalk.core.Log;
import org.xwalk.core.WebViewExtensionListener;
import org.xwalk.core.XWalkEnvironment;

public final class p
{
  static boolean ynJ = false;
  static boolean ynK = false;
  
  public static void a(Context paramContext, b paramb)
  {
    a(paramContext, paramb, null, null);
  }
  
  public static void a(Context paramContext, b paramb, o paramo, WebViewExtensionListener paramWebViewExtensionListener)
  {
    if (paramb != null) {}
    try
    {
      Log.SetLogCallBack(paramb);
      if (paramo != null) {
        e.a(paramo);
      }
      if (((paramContext != null) && (XWalkEnvironment.getApplicationContext() == null)) || (!ynJ))
      {
        ynJ = true;
        XWalkEnvironment.init(paramContext);
        paramb = g.a(WebView.c.ynF);
        if (paramb != null) {
          paramb.initEnviroment(paramContext);
        }
        paramb = g.a(WebView.c.ynG);
        if (paramb != null) {
          paramb.initEnviroment(paramContext);
        }
      }
      if (paramWebViewExtensionListener != null) {
        g.a(WebView.c.ynF).initCallback(paramWebViewExtensionListener);
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public static void initInterface()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 13	com/tencent/xweb/p:ynK	Z
    //   6: istore_0
    //   7: iload_0
    //   8: ifeq +7 -> 15
    //   11: ldc 2
    //   13: monitorexit
    //   14: return
    //   15: iconst_1
    //   16: putstatic 13	com/tencent/xweb/p:ynK	Z
    //   19: getstatic 46	com/tencent/xweb/WebView$c:ynF	Lcom/tencent/xweb/WebView$c;
    //   22: invokestatic 51	com/tencent/xweb/a/g:a	(Lcom/tencent/xweb/WebView$c;)Lcom/tencent/xweb/a/g$a;
    //   25: astore_1
    //   26: aload_1
    //   27: ifnull +9 -> 36
    //   30: aload_1
    //   31: invokeinterface 66 1 0
    //   36: getstatic 59	com/tencent/xweb/WebView$c:ynG	Lcom/tencent/xweb/WebView$c;
    //   39: invokestatic 51	com/tencent/xweb/a/g:a	(Lcom/tencent/xweb/WebView$c;)Lcom/tencent/xweb/a/g$a;
    //   42: astore_1
    //   43: aload_1
    //   44: ifnull -33 -> 11
    //   47: aload_1
    //   48: invokeinterface 66 1 0
    //   53: goto -42 -> 11
    //   56: astore_1
    //   57: ldc 2
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   6	2	0	bool	boolean
    //   25	23	1	locala	g.a
    //   56	5	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	7	56	finally
    //   15	26	56	finally
    //   30	36	56	finally
    //   36	43	56	finally
    //   47	53	56	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.xweb.xwalk;

import android.content.Context;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.b;
import com.tencent.xweb.a.a.a;
import com.tencent.xweb.a.a.b;
import com.tencent.xweb.a.e;
import com.tencent.xweb.a.g.a;
import com.tencent.xweb.f.a;
import org.xwalk.core.Log;
import org.xwalk.core.WebViewExtension;
import org.xwalk.core.WebViewExtensionListener;
import org.xwalk.core.XWalkInitializer;

public class XWalkWebFactory
  implements g.a
{
  static XWalkWebFactory sInstance;
  
  public static XWalkWebFactory getInstance()
  {
    if (sInstance == null) {
      sInstance = new XWalkWebFactory();
    }
    return sInstance;
  }
  
  public e createWebView(WebView paramWebView)
  {
    try
    {
      if (g.dI(paramWebView.getContext()))
      {
        WebViewExtension.updateExtension(false);
        paramWebView = new g(paramWebView);
        return paramWebView;
      }
    }
    catch (Exception paramWebView)
    {
      XWalkInitializer.addXWalkInitializeLog("init xwalk crashed:" + paramWebView.getMessage());
    }
    return null;
  }
  
  public Object excute(String paramString, Object[] paramArrayOfObject)
  {
    if ((paramString == null) || (paramString.isEmpty())) {}
    do
    {
      return null;
      if (paramString.equals("STR_CMD_GET_DEBUG_VIEW")) {
        return new a((WebView)paramArrayOfObject[0]);
      }
      if (paramString.equals("STR_CMD_GET_UPDATER")) {
        return new k.a();
      }
    } while (!paramString.equals("STR_CMD_CLEAR_SCHEDULER"));
    com.tencent.xweb.xwalk.a.c.a(null);
    return null;
  }
  
  public a.a getCookieManager()
  {
    return new b();
  }
  
  public a.b getCookieSyncManager()
  {
    return new c();
  }
  
  public com.tencent.xweb.a.d getJsCore(f.a parama, Context paramContext)
  {
    initWebviewCore(paramContext, null);
    switch (1.ynb[parama.ordinal()])
    {
    }
    do
    {
      do
      {
        return null;
      } while (!com.tencent.xweb.xwalk.a.d.isXWalkReady());
      if (parama == f.a.ynh)
      {
        parama = new f();
        parama.init(0);
        return parama;
      }
    } while (parama != f.a.yni);
    parama = new f();
    parama.init(1);
    return parama;
  }
  
  public boolean hasInited()
  {
    return a.hasInited();
  }
  
  public boolean hasInitedCallback()
  {
    return a.hasInitedCallback();
  }
  
  public void initCallback(WebViewExtensionListener paramWebViewExtensionListener)
  {
    a.initCallback(paramWebViewExtensionListener);
  }
  
  public void initEnviroment(Context paramContext) {}
  
  public void initInterface() {}
  
  public boolean initWebviewCore(Context paramContext, WebView.b paramb)
  {
    boolean bool = a.iq(paramContext);
    if (paramb != null)
    {
      if (bool) {
        paramb.oR();
      }
    }
    else {
      return bool;
    }
    paramb.oS();
    return bool;
  }
  
  public boolean isCoreReady()
  {
    return a.isCoreReady();
  }
  
  static final class a
  {
    private static boolean kIx = false;
    private static boolean yoI = false;
    private static boolean yoa = false;
    
    public static boolean hasInited()
    {
      return kIx;
    }
    
    public static boolean hasInitedCallback()
    {
      return yoa;
    }
    
    public static void initCallback(WebViewExtensionListener paramWebViewExtensionListener)
    {
      if (yoa) {
        return;
      }
      Log.i("XWebViewHelper", "initCallback");
      WebViewExtension.SetExtension(paramWebViewExtensionListener);
      yoa = true;
    }
    
    public static boolean iq(Context paramContext)
    {
      if (kIx) {
        return kIx;
      }
      Log.i("XWebViewHelper", "preInit");
      if (g.dI(paramContext))
      {
        Log.i("XWebViewHelper", "preInit finished");
        kIx = true;
        yoI = true;
      }
      for (;;)
      {
        return kIx;
        Log.i("XWebViewHelper", "preInit xwalk is not available");
      }
    }
    
    public static boolean isCoreReady()
    {
      return yoI;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\xweb\xwalk\XWalkWebFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
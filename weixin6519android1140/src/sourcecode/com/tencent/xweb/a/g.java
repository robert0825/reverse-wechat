package com.tencent.xweb.a;

import android.content.Context;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.b;
import com.tencent.xweb.WebView.c;
import com.tencent.xweb.f.a;
import org.xwalk.core.Log;
import org.xwalk.core.WebViewExtensionListener;

public final class g
{
  static a ynO;
  static a ynP;
  static a ynQ;
  
  public static e a(WebView.c paramc, WebView paramWebView)
  {
    if (a(paramc) == null)
    {
      Log.e("WebViewWrapperFactory", "the kind of " + paramc + " this provider does not exist!");
      return null;
    }
    return a(paramc).createWebView(paramWebView);
  }
  
  public static a a(WebView.c paramc)
  {
    if (paramc == WebView.c.ynF)
    {
      if (ynO == null)
      {
        paramc = com.tencent.xweb.util.d.fF("com.tencent.xweb.xwalk.XWalkWebFactory", "getInstance");
        if ((paramc == null) || (!(paramc instanceof a)))
        {
          Log.e("WebViewWrapperFactory", "find com.tencent.xweb.XWalkWebFactory failed");
          return null;
        }
        ynO = (a)paramc;
      }
      return ynO;
    }
    if (paramc == WebView.c.ynG)
    {
      if (ynP == null)
      {
        paramc = com.tencent.xweb.util.d.fF("com.tencent.xweb.x5.X5WebFactory", "getInstance");
        if ((paramc == null) || (!(paramc instanceof a)))
        {
          Log.e("WebViewWrapperFactory", "find X5WebFactory failed");
          return null;
        }
        ynP = (a)paramc;
      }
      return ynP;
    }
    if (paramc == WebView.c.ynH)
    {
      if (ynQ == null)
      {
        paramc = com.tencent.xweb.util.d.fF("com.tencent.xweb.sys.SysWebFactory", "getInstance");
        if ((paramc == null) || (!(paramc instanceof a)))
        {
          Log.e("WebViewWrapperFactory", "find SysWebFactory failed");
          return null;
        }
        ynQ = (a)paramc;
      }
      return ynQ;
    }
    return null;
  }
  
  public static abstract interface a
  {
    public abstract e createWebView(WebView paramWebView);
    
    public abstract Object excute(String paramString, Object[] paramArrayOfObject);
    
    public abstract a.a getCookieManager();
    
    public abstract a.b getCookieSyncManager();
    
    public abstract d getJsCore(f.a parama, Context paramContext);
    
    public abstract boolean hasInited();
    
    public abstract void initCallback(WebViewExtensionListener paramWebViewExtensionListener);
    
    public abstract void initEnviroment(Context paramContext);
    
    public abstract void initInterface();
    
    public abstract boolean initWebviewCore(Context paramContext, WebView.b paramb);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
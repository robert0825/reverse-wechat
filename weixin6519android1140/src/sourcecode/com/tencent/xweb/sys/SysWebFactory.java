package com.tencent.xweb.sys;

import android.content.Context;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.b;
import com.tencent.xweb.a.a.a;
import com.tencent.xweb.a.a.b;
import com.tencent.xweb.a.d;
import com.tencent.xweb.a.e;
import com.tencent.xweb.a.g.a;
import com.tencent.xweb.f.a;
import org.xwalk.core.WebViewExtensionListener;

public class SysWebFactory
  implements g.a
{
  static SysWebFactory sInstance;
  
  public static SysWebFactory getInstance()
  {
    if (sInstance == null) {
      sInstance = new SysWebFactory();
    }
    return sInstance;
  }
  
  public e createWebView(WebView paramWebView)
  {
    return new SysWebView(paramWebView);
  }
  
  public Object excute(String paramString, Object[] paramArrayOfObject)
  {
    if ((paramString == null) || (paramString.isEmpty())) {}
    while ((paramString.equals("STR_CMD_GET_DEBUG_VIEW")) || (!paramString.equals("STR_CMD_GET_UPDATER"))) {
      return null;
    }
    return null;
  }
  
  public a.a getCookieManager()
  {
    return new a();
  }
  
  public a.b getCookieSyncManager()
  {
    return new b();
  }
  
  public d getJsCore(f.a parama, Context paramContext)
  {
    return null;
  }
  
  public boolean hasInited()
  {
    return true;
  }
  
  public boolean hasInitedCallback()
  {
    return a.hasInitedCallback();
  }
  
  public void initCallback(WebViewExtensionListener paramWebViewExtensionListener) {}
  
  public void initEnviroment(Context paramContext) {}
  
  public void initInterface() {}
  
  public boolean initWebviewCore(Context paramContext, WebView.b paramb)
  {
    if (paramb != null) {
      paramb.oR();
    }
    return true;
  }
  
  public boolean isCoreReady()
  {
    return true;
  }
  
  static final class a
  {
    private static boolean kIx = false;
    private static boolean yoa = false;
    
    public static boolean hasInitedCallback()
    {
      return yoa;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\sys\SysWebFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
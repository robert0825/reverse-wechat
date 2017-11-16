package com.tencent.xweb.x5;

import com.tencent.smtt.sdk.CookieManager;
import com.tencent.xweb.a.a.a;
import org.xwalk.core.Log;

public final class d
  implements a.a
{
  CookieManager yov = CookieManager.getInstance();
  
  public final void a(com.tencent.xweb.WebView paramWebView, boolean paramBoolean)
  {
    if (paramWebView == null)
    {
      Log.e("X5CookieManagerWrapper", "setAcceptThirdPartyCookies: the webview is null");
      return;
    }
    paramWebView = paramWebView.getWebViewUI();
    if (!(paramWebView instanceof com.tencent.smtt.sdk.WebView))
    {
      Log.e("X5CookieManagerWrapper", "setAcceptThirdPartyCookies: the webview is not x5 webview");
      return;
    }
    this.yov.setAcceptThirdPartyCookies((com.tencent.smtt.sdk.WebView)paramWebView, true);
  }
  
  public final String getCookie(String paramString)
  {
    return this.yov.getCookie(paramString);
  }
  
  public final void removeAllCookie()
  {
    this.yov.removeAllCookie();
  }
  
  public final void removeSessionCookie()
  {
    this.yov.removeSessionCookie();
  }
  
  public final void setAcceptCookie(boolean paramBoolean)
  {
    this.yov.setAcceptCookie(true);
  }
  
  public final void setCookie(String paramString1, String paramString2)
  {
    this.yov.setCookie(paramString1, paramString2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\x5\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
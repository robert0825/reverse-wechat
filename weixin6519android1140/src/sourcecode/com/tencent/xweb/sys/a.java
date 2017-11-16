package com.tencent.xweb.sys;

import android.os.Build.VERSION;
import android.webkit.CookieManager;
import com.tencent.xweb.a.a.a;
import org.xwalk.core.Log;

public final class a
  implements a.a
{
  CookieManager ynR = CookieManager.getInstance();
  
  public final void a(com.tencent.xweb.WebView paramWebView, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      if ((paramWebView != null) && (paramWebView.getWebViewUI() != null) && ((paramWebView.getWebViewUI() instanceof android.webkit.WebView))) {
        this.ynR.setAcceptThirdPartyCookies((android.webkit.WebView)paramWebView.getWebViewUI(), true);
      }
    }
    else {
      return;
    }
    Log.e("SysCookieManagerWrapper", "webview kind not match");
  }
  
  public final String getCookie(String paramString)
  {
    return this.ynR.getCookie(paramString);
  }
  
  public final void removeAllCookie()
  {
    this.ynR.removeAllCookie();
  }
  
  public final void removeSessionCookie()
  {
    this.ynR.removeSessionCookie();
  }
  
  public final void setAcceptCookie(boolean paramBoolean)
  {
    this.ynR.setAcceptCookie(true);
  }
  
  public final void setCookie(String paramString1, String paramString2)
  {
    this.ynR.setCookie(paramString1, paramString2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\sys\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
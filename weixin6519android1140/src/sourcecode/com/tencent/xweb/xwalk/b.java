package com.tencent.xweb.xwalk;

import com.tencent.xweb.WebView;
import com.tencent.xweb.a.a.a;
import org.xwalk.core.XWalkCookieManager;

public final class b
  implements a.a
{
  XWalkCookieManager ypm = new XWalkCookieManager();
  
  public final void a(WebView paramWebView, boolean paramBoolean) {}
  
  public final String getCookie(String paramString)
  {
    return this.ypm.getCookie(paramString);
  }
  
  public final void removeAllCookie()
  {
    this.ypm.removeAllCookie();
  }
  
  public final void removeSessionCookie()
  {
    this.ypm.removeSessionCookie();
  }
  
  public final void setAcceptCookie(boolean paramBoolean)
  {
    this.ypm.setAcceptCookie(true);
  }
  
  public final void setCookie(String paramString1, String paramString2)
  {
    this.ypm.setCookie(paramString1, paramString2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\xwalk\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
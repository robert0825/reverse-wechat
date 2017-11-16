package com.tencent.xweb;

import com.tencent.xweb.a.a.a;

public final class b
{
  private static b ymU;
  public a.a ymV;
  
  public static b crS()
  {
    try
    {
      if (ymU == null) {
        ymU = new b();
      }
      b localb = ymU;
      return localb;
    }
    finally {}
  }
  
  public final void c(WebView paramWebView)
  {
    try
    {
      if (this.ymV != null) {
        this.ymV.a(paramWebView, true);
      }
      return;
    }
    finally
    {
      paramWebView = finally;
      throw paramWebView;
    }
  }
  
  public final void crT()
  {
    try
    {
      if (this.ymV != null) {
        this.ymV.setAcceptCookie(true);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String getCookie(String paramString)
  {
    return this.ymV.getCookie(paramString);
  }
  
  public final void removeAllCookie()
  {
    this.ymV.removeAllCookie();
  }
  
  public final void setCookie(String paramString1, String paramString2)
  {
    try
    {
      this.ymV.setCookie(paramString1, paramString2);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
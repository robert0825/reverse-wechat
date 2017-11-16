package com.tencent.xweb.a;

import android.content.Context;
import com.tencent.xweb.WebView;

public final class a
{
  public static abstract interface a
  {
    public abstract void a(WebView paramWebView, boolean paramBoolean);
    
    public abstract String getCookie(String paramString);
    
    public abstract void removeAllCookie();
    
    public abstract void removeSessionCookie();
    
    public abstract void setAcceptCookie(boolean paramBoolean);
    
    public abstract void setCookie(String paramString1, String paramString2);
  }
  
  public static abstract interface b
  {
    public abstract void init(Context paramContext);
    
    public abstract void sync();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
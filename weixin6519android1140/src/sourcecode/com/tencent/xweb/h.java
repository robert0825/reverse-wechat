package com.tencent.xweb;

import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.xweb.a.c;

public class h
{
  c ynk;
  
  public void a(WebView paramWebView, int paramInt) {}
  
  public boolean a(WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, a parama)
  {
    return false;
  }
  
  public boolean a(WebView paramWebView, String paramString1, String paramString2, e parame)
  {
    if (this.ynk != null) {
      return this.ynk.a(paramString1, paramString2, parame);
    }
    return false;
  }
  
  public boolean a(WebView paramWebView, String paramString1, String paramString2, String paramString3, d paramd)
  {
    if (this.ynk != null) {
      return this.ynk.a(paramString1, paramString2, paramString3, paramd);
    }
    return false;
  }
  
  public boolean b(WebView paramWebView, String paramString1, String paramString2, e parame)
  {
    if (this.ynk != null) {
      return this.ynk.b(paramString1, paramString2, parame);
    }
    return false;
  }
  
  public void c(WebView paramWebView, String paramString) {}
  
  public View getVideoLoadingProgressView()
  {
    return null;
  }
  
  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    return false;
  }
  
  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    paramCallback.invoke(paramString, true, true);
  }
  
  public void onHideCustomView()
  {
    if (this.ynk != null) {
      this.ynk.onHideCustomView();
    }
  }
  
  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    if (this.ynk != null) {
      this.ynk.onShowCustomView(paramView, paramCustomViewCallback);
    }
  }
  
  public void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    paramValueCallback.onReceiveValue(null);
  }
  
  public static abstract class a
  {
    public abstract String[] getAcceptTypes();
    
    public abstract int getMode();
    
    public abstract boolean isCaptureEnabled();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
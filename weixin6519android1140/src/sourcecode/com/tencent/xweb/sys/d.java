package com.tencent.xweb.sys;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tencent.xweb.a.c;
import com.tencent.xweb.e;

public final class d
  implements c
{
  WebViewClient ynX;
  WebChromeClient ynY;
  WebView ynZ;
  
  public d(WebView paramWebView)
  {
    this.ynZ = paramWebView;
    this.ynX = new WebViewClient();
    this.ynY = new WebChromeClient();
  }
  
  public final boolean a(String paramString1, String paramString2, e parame)
  {
    return false;
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, com.tencent.xweb.d paramd)
  {
    return false;
  }
  
  public final boolean b(String paramString1, String paramString2, e parame)
  {
    return false;
  }
  
  public final void onHideCustomView() {}
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {}
  
  public final void w(String paramString, Bitmap paramBitmap)
  {
    this.ynX.onPageStarted(this.ynZ, paramString, paramBitmap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\sys\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
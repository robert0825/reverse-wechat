package com.tencent.xweb.x5;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.smtt.sdk.WebView;
import com.tencent.xweb.d;
import com.tencent.xweb.e;

public final class h
  implements com.tencent.xweb.a.c
{
  WebView xTx;
  c yoF;
  b yoG;
  
  public h(WebView paramWebView)
  {
    this.xTx = paramWebView;
    this.yoF = new c();
    this.yoG = new b();
  }
  
  public final boolean a(String paramString1, String paramString2, e parame)
  {
    return false;
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, d paramd)
  {
    return false;
  }
  
  public final boolean b(String paramString1, String paramString2, e parame)
  {
    return false;
  }
  
  public final void onHideCustomView()
  {
    this.yoG.csv();
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {}
  
  public final void w(String paramString, Bitmap paramBitmap)
  {
    this.yoF.a(this.xTx, paramString, paramBitmap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\x5\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
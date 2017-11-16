package com.tencent.xweb.a;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.xweb.d;
import com.tencent.xweb.e;

public abstract interface c
{
  public abstract boolean a(String paramString1, String paramString2, e parame);
  
  public abstract boolean a(String paramString1, String paramString2, String paramString3, d paramd);
  
  public abstract boolean b(String paramString1, String paramString2, e parame);
  
  public abstract void onHideCustomView();
  
  public abstract void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback);
  
  public abstract void w(String paramString, Bitmap paramBitmap);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
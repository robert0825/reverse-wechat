package com.tencent.xweb.xwalk;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.xweb.a.c;
import com.tencent.xweb.d;
import org.xwalk.core.XWalkView;

public final class e
  implements c
{
  i yps;
  j ypt;
  XWalkView ypu;
  
  public e(XWalkView paramXWalkView)
  {
    this.ypu = paramXWalkView;
    this.yps = new i(paramXWalkView);
    this.ypt = new j(paramXWalkView);
  }
  
  public final boolean a(String paramString1, String paramString2, com.tencent.xweb.e parame)
  {
    if ((parame instanceof d.c)) {
      return this.yps.b(this.ypu, paramString1, paramString2, ((d.c)parame).ypq);
    }
    return false;
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, d paramd)
  {
    if ((paramd instanceof d.d)) {
      return this.yps.a(this.ypu, paramString1, paramString2, paramString3, ((d.d)paramd).ypq);
    }
    return false;
  }
  
  public final boolean b(String paramString1, String paramString2, com.tencent.xweb.e parame)
  {
    if ((parame instanceof d.c)) {
      return this.yps.a(this.ypu, paramString1, paramString2, ((d.c)parame).ypq);
    }
    return false;
  }
  
  public final void onHideCustomView()
  {
    this.yps.csv();
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    if ((paramCustomViewCallback instanceof d.a)) {
      this.yps.a(paramView, ((d.a)paramCustomViewCallback).ypo);
    }
  }
  
  public final void w(String paramString, Bitmap paramBitmap)
  {
    this.yps.a(this.ypu, paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\xwalk\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
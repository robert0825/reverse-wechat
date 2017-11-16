package com.tencent.xweb.sys;

import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import com.tencent.smtt.utils.o;
import com.tencent.xweb.l;

public final class e
  extends l
{
  WebView yoo;
  
  public e(WebView paramWebView)
  {
    this.yoo = paramWebView;
  }
  
  public final void crX()
  {
    this.yoo.getSettings().setDisplayZoomControls(false);
  }
  
  public final void crY()
  {
    this.yoo.getSettings().setSaveFormData(false);
  }
  
  public final void crZ()
  {
    this.yoo.getSettings().setJavaScriptEnabled(false);
  }
  
  public final void csa()
  {
    this.yoo.getSettings().setDefaultFontSize(8);
  }
  
  public final void csb()
  {
    this.yoo.getSettings().setJavaScriptEnabled(true);
  }
  
  public final void csc()
  {
    this.yoo.getSettings().setAppCacheMaxSize(10485760L);
  }
  
  public final void csd()
  {
    this.yoo.getSettings().setDatabaseEnabled(true);
  }
  
  public final void cse()
  {
    this.yoo.getSettings().setDomStorageEnabled(true);
  }
  
  public final void csf()
  {
    this.yoo.getSettings().setCacheMode(-1);
  }
  
  public final void csg()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      this.yoo.getSettings().setMixedContentMode(0);
    }
  }
  
  public final String getUserAgentString()
  {
    return this.yoo.getSettings().getUserAgentString();
  }
  
  public final void setAppCachePath(String paramString)
  {
    this.yoo.getSettings().setAppCachePath(paramString);
  }
  
  public final void setBuiltInZoomControls(boolean paramBoolean)
  {
    this.yoo.getSettings().setBuiltInZoomControls(paramBoolean);
  }
  
  public final void setDatabasePath(String paramString)
  {
    this.yoo.getSettings().setDatabasePath(paramString);
  }
  
  public final void setDefaultTextEncodingName(String paramString)
  {
    this.yoo.getSettings().setDefaultTextEncodingName(paramString);
  }
  
  public final void setGeolocationEnabled(boolean paramBoolean)
  {
    this.yoo.getSettings().setJavaScriptEnabled(paramBoolean);
  }
  
  public final void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean)
  {
    this.yoo.getSettings().setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
  }
  
  public final void setJavaScriptEnabled(boolean paramBoolean)
  {
    this.yoo.getSettings().setJavaScriptEnabled(paramBoolean);
  }
  
  public final void setLayoutAlgorithm(WebSettings.LayoutAlgorithm paramLayoutAlgorithm)
  {
    this.yoo.getSettings().setLayoutAlgorithm(paramLayoutAlgorithm);
  }
  
  public final void setLoadWithOverviewMode(boolean paramBoolean)
  {
    this.yoo.getSettings().setLoadWithOverviewMode(paramBoolean);
  }
  
  public final void setLoadsImagesAutomatically(boolean paramBoolean)
  {
    this.yoo.getSettings().setLoadsImagesAutomatically(paramBoolean);
  }
  
  public final void setMediaPlaybackRequiresUserGesture(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      this.yoo.getSettings().setMediaPlaybackRequiresUserGesture(paramBoolean);
    }
  }
  
  public final void setPluginsEnabled(boolean paramBoolean)
  {
    o.a(this.yoo.getSettings(), "setPluginsEnabled", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
  }
  
  public final void setRenderPriority(WebSettings.RenderPriority paramRenderPriority)
  {
    this.yoo.getSettings().setRenderPriority(paramRenderPriority);
  }
  
  public final void setSupportZoom(boolean paramBoolean)
  {
    this.yoo.getSettings().setSupportZoom(paramBoolean);
  }
  
  public final void setTextZoom(int paramInt)
  {
    this.yoo.getSettings().setTextZoom(paramInt);
  }
  
  public final void setUseWideViewPort(boolean paramBoolean)
  {
    this.yoo.getSettings().setUseWideViewPort(paramBoolean);
  }
  
  public final void setUserAgentString(String paramString)
  {
    this.yoo.getSettings().setUserAgentString(paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\sys\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.xweb.x5;

import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.RenderPriority;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebSettings.TextSize;
import com.tencent.smtt.sdk.WebView;
import com.tencent.xweb.l;
import com.tencent.xweb.l.a;

public final class j
  extends l
{
  WebView yoR;
  
  public j(WebView paramWebView)
  {
    this.yoR = paramWebView;
  }
  
  public final void a(l.a parama)
  {
    try
    {
      this.yoR.getSettings().setTextSize(WebSettings.TextSize.valueOf(parama.name()));
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public final void crX()
  {
    this.yoR.getSettings().setDisplayZoomControls(false);
  }
  
  public final void crY()
  {
    this.yoR.getSettings().setSaveFormData(false);
  }
  
  public final void crZ()
  {
    this.yoR.getSettings().setJavaScriptEnabled(false);
  }
  
  public final void csa()
  {
    this.yoR.getSettings().setDefaultFontSize(8);
  }
  
  public final void csb()
  {
    this.yoR.getSettings().setJavaScriptEnabled(true);
  }
  
  public final void csc()
  {
    this.yoR.getSettings().setAppCacheMaxSize(10485760L);
  }
  
  public final void csd()
  {
    this.yoR.getSettings().setDatabaseEnabled(true);
  }
  
  public final void cse()
  {
    this.yoR.getSettings().setDomStorageEnabled(true);
  }
  
  public final void csf()
  {
    this.yoR.getSettings().setCacheMode(-1);
  }
  
  public final void csg()
  {
    this.yoR.getSettings().setMixedContentMode(0);
  }
  
  public final String getUserAgentString()
  {
    return this.yoR.getSettings().getUserAgentString();
  }
  
  public final void setAppCachePath(String paramString)
  {
    this.yoR.getSettings().setAppCachePath(paramString);
  }
  
  public final void setBuiltInZoomControls(boolean paramBoolean)
  {
    this.yoR.getSettings().setBuiltInZoomControls(paramBoolean);
  }
  
  public final void setDatabasePath(String paramString)
  {
    this.yoR.getSettings().setDatabasePath(paramString);
  }
  
  public final void setDefaultTextEncodingName(String paramString)
  {
    this.yoR.getSettings().setDefaultTextEncodingName(paramString);
  }
  
  public final void setGeolocationEnabled(boolean paramBoolean)
  {
    this.yoR.getSettings().setJavaScriptEnabled(paramBoolean);
  }
  
  public final void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean)
  {
    this.yoR.getSettings().setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
  }
  
  public final void setJavaScriptEnabled(boolean paramBoolean)
  {
    this.yoR.getSettings().setJavaScriptEnabled(paramBoolean);
  }
  
  public final void setLayoutAlgorithm(WebSettings.LayoutAlgorithm paramLayoutAlgorithm)
  {
    paramLayoutAlgorithm = com.tencent.smtt.sdk.WebSettings.LayoutAlgorithm.values()[paramLayoutAlgorithm.ordinal()];
    this.yoR.getSettings().setLayoutAlgorithm(paramLayoutAlgorithm);
  }
  
  public final void setLoadWithOverviewMode(boolean paramBoolean)
  {
    this.yoR.getSettings().setLoadWithOverviewMode(paramBoolean);
  }
  
  public final void setLoadsImagesAutomatically(boolean paramBoolean)
  {
    this.yoR.getSettings().setLoadsImagesAutomatically(paramBoolean);
  }
  
  public final void setMediaPlaybackRequiresUserGesture(boolean paramBoolean)
  {
    this.yoR.getSettings().setMediaPlaybackRequiresUserGesture(paramBoolean);
  }
  
  public final void setPluginsEnabled(boolean paramBoolean)
  {
    this.yoR.getSettings().setPluginsEnabled(paramBoolean);
  }
  
  public final void setRenderPriority(WebSettings.RenderPriority paramRenderPriority)
  {
    paramRenderPriority = com.tencent.smtt.sdk.WebSettings.RenderPriority.values()[paramRenderPriority.ordinal()];
    this.yoR.getSettings().setRenderPriority(paramRenderPriority);
  }
  
  public final void setSupportZoom(boolean paramBoolean)
  {
    this.yoR.getSettings().setSupportZoom(paramBoolean);
  }
  
  public final void setTextZoom(int paramInt)
  {
    this.yoR.getSettings().setTextZoom(paramInt);
  }
  
  public final void setUseWideViewPort(boolean paramBoolean)
  {
    this.yoR.getSettings().setUseWideViewPort(paramBoolean);
  }
  
  public final void setUserAgentString(String paramString)
  {
    this.yoR.getSettings().setUserAgentString(paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\x5\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
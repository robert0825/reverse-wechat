package com.tencent.xweb.xwalk;

import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.RenderPriority;
import com.tencent.xweb.l;
import org.xwalk.core.XWalkSettings;
import org.xwalk.core.XWalkView;

public final class h
  extends l
{
  XWalkView ypK;
  
  public h(XWalkView paramXWalkView)
  {
    this.ypK = paramXWalkView;
  }
  
  public final void crX() {}
  
  public final void crY()
  {
    this.ypK.getSettings().setSaveFormData(false);
  }
  
  public final void crZ() {}
  
  public final void csa()
  {
    this.ypK.getSettings().setDefaultFontSize(8);
  }
  
  public final void csb()
  {
    this.ypK.getSettings().setAppCacheEnabled(true);
  }
  
  public final void csc() {}
  
  public final void csd()
  {
    this.ypK.getSettings().setDatabaseEnabled(true);
  }
  
  public final void cse()
  {
    this.ypK.getSettings().setDomStorageEnabled(true);
  }
  
  public final void csf()
  {
    this.ypK.getSettings().setCacheMode(-1);
  }
  
  public final void csg() {}
  
  public final String getUserAgentString()
  {
    return this.ypK.getUserAgentString();
  }
  
  public final void setAppCachePath(String paramString)
  {
    this.ypK.getSettings().setAppCachePath(paramString);
  }
  
  public final void setBuiltInZoomControls(boolean paramBoolean)
  {
    this.ypK.getSettings().setBuiltInZoomControls(paramBoolean);
  }
  
  public final void setDatabasePath(String paramString) {}
  
  public final void setDefaultTextEncodingName(String paramString) {}
  
  public final void setGeolocationEnabled(boolean paramBoolean) {}
  
  public final void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean)
  {
    this.ypK.getSettings().setJavaScriptCanOpenWindowsAutomatically(paramBoolean);
  }
  
  public final void setJavaScriptEnabled(boolean paramBoolean)
  {
    this.ypK.getSettings().setJavaScriptEnabled(paramBoolean);
  }
  
  public final void setLayoutAlgorithm(WebSettings.LayoutAlgorithm paramLayoutAlgorithm)
  {
    paramLayoutAlgorithm = org.xwalk.core.XWalkSettings.LayoutAlgorithm.values()[paramLayoutAlgorithm.ordinal()];
    this.ypK.getSettings().setLayoutAlgorithm(paramLayoutAlgorithm);
  }
  
  public final void setLoadWithOverviewMode(boolean paramBoolean)
  {
    this.ypK.getSettings().setLoadWithOverviewMode(paramBoolean);
  }
  
  public final void setLoadsImagesAutomatically(boolean paramBoolean)
  {
    this.ypK.getSettings().setLoadsImagesAutomatically(paramBoolean);
  }
  
  public final void setMediaPlaybackRequiresUserGesture(boolean paramBoolean)
  {
    this.ypK.getSettings().setMediaPlaybackRequiresUserGesture(paramBoolean);
  }
  
  public final void setPluginsEnabled(boolean paramBoolean) {}
  
  public final void setRenderPriority(WebSettings.RenderPriority paramRenderPriority) {}
  
  public final void setSupportZoom(boolean paramBoolean)
  {
    this.ypK.getSettings().setSupportZoom(paramBoolean);
  }
  
  public final void setTextZoom(int paramInt)
  {
    this.ypK.getSettings().setTextZoom(paramInt);
  }
  
  public final void setUseWideViewPort(boolean paramBoolean)
  {
    this.ypK.getSettings().setUseWideViewPort(paramBoolean);
  }
  
  public final void setUserAgentString(String paramString)
  {
    this.ypK.getSettings().setUserAgentString(paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\xwalk\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
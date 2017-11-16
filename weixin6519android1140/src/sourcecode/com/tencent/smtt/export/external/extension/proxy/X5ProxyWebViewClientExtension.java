package com.tencent.smtt.export.external.extension.proxy;

import com.tencent.smtt.export.external.WebViewWizardBase;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;

public abstract class X5ProxyWebViewClientExtension
  extends ProxyWebViewClientExtension
{
  public X5ProxyWebViewClientExtension(WebViewWizardBase paramWebViewWizardBase)
  {
    this.mWebViewClientExt = ((IX5WebViewClientExtension)paramWebViewWizardBase.newInstance("com.tencent.smtt.webkit.WebViewClientExtension"));
  }
  
  public X5ProxyWebViewClientExtension(IX5WebViewClientExtension paramIX5WebViewClientExtension)
  {
    this.mWebViewClientExt = paramIX5WebViewClientExtension;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\export\external\extension\proxy\X5ProxyWebViewClientExtension.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class ad
{
  private static ad rED;
  HashMap<String, WebViewJSSDKFileItem> rEE;
  
  static
  {
    GMTrace.i(11999467536384L, 89403);
    rED = new ad();
    GMTrace.o(11999467536384L, 89403);
  }
  
  public ad()
  {
    GMTrace.i(11999064883200L, 89400);
    this.rEE = new HashMap();
    GMTrace.o(11999064883200L, 89400);
  }
  
  public static final ad bCn()
  {
    GMTrace.i(11998930665472L, 89399);
    ad localad = rED;
    GMTrace.o(11998930665472L, 89399);
    return localad;
  }
  
  public final WebViewJSSDKFileItem Lk(String paramString)
  {
    GMTrace.i(11999333318656L, 89402);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.WebViewJSSDKFileItemManager", "get by local id error, local id is null or nil");
      GMTrace.o(11999333318656L, 89402);
      return null;
    }
    paramString = (WebViewJSSDKFileItem)this.rEE.get(paramString);
    GMTrace.o(11999333318656L, 89402);
    return paramString;
  }
  
  public final void b(WebViewJSSDKFileItem paramWebViewJSSDKFileItem)
  {
    GMTrace.i(11999199100928L, 89401);
    if ((paramWebViewJSSDKFileItem == null) || (bg.nm(paramWebViewJSSDKFileItem.eHy)))
    {
      w.e("MicroMsg.WebViewJSSDKFileItemManager", "item is null or local id is null, ignore this add");
      GMTrace.o(11999199100928L, 89401);
      return;
    }
    w.i("MicroMsg.WebViewJSSDKFileItemManager", "add jssdk file item, local id : %s, file path : %s", new Object[] { paramWebViewJSSDKFileItem.eHy, paramWebViewJSSDKFileItem.hOo });
    this.rEE.put(paramWebViewJSSDKFileItem.eHy, paramWebViewJSSDKFileItem);
    GMTrace.o(11999199100928L, 89401);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
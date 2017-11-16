package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;

public class WebViewTestUI
  extends MMActivity
{
  private n hUm;
  MMWebViewWithJsApi rKs;
  
  public WebViewTestUI()
  {
    GMTrace.i(12323737567232L, 91819);
    this.hUm = new n()
    {
      public final void a(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19455530762240L, 144955);
        super.a(paramAnonymousWebView, paramAnonymousString);
        GMTrace.o(19455530762240L, 144955);
      }
    };
    GMTrace.o(12323737567232L, 91819);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12324006002688L, 91821);
    GMTrace.o(12324006002688L, 91821);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12323871784960L, 91820);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("rawUrl");
    this.rKs = MMWebViewWithJsApi.a.dx(this);
    this.rKs.setWebViewClient(this.hUm);
    setContentView(this.rKs);
    this.rKs.loadUrl(paramBundle);
    GMTrace.o(12323871784960L, 91820);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\WebViewTestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
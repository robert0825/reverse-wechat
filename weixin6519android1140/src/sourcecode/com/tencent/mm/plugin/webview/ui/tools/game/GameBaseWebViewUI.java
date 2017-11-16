package com.tencent.mm.plugin.webview.ui.tools.game;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.i;
import com.tencent.xweb.WebView;

public class GameBaseWebViewUI
  extends WebViewUI
{
  private c lKa;
  protected a rQm;
  
  public GameBaseWebViewUI()
  {
    GMTrace.i(19386140196864L, 144438);
    this.lKa = new c()
    {
      protected final void B(Bundle paramAnonymousBundle)
      {
        GMTrace.i(19389227204608L, 144461);
        try
        {
          if ((GameBaseWebViewUI.a(GameBaseWebViewUI.this) != null) && (paramAnonymousBundle != null)) {
            GameBaseWebViewUI.b(GameBaseWebViewUI.this).d(96, paramAnonymousBundle);
          }
          GMTrace.o(19389227204608L, 144461);
          return;
        }
        catch (RemoteException paramAnonymousBundle)
        {
          GMTrace.o(19389227204608L, 144461);
        }
      }
    };
    GMTrace.o(19386140196864L, 144438);
  }
  
  protected final void V(Bundle paramBundle)
  {
    GMTrace.i(19386274414592L, 144439);
    this.lKa.rQG.ab(paramBundle);
    GMTrace.o(19386274414592L, 144439);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19386408632320L, 144440);
    super.onCreate(paramBundle);
    GMTrace.o(19386408632320L, 144440);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(19386811285504L, 144443);
    this.lKa.rQG.onDestroy();
    if (this.rQm != null) {
      this.rQm.onDestroy();
    }
    super.onDestroy();
    GMTrace.o(19386811285504L, 144443);
  }
  
  protected void onPause()
  {
    GMTrace.i(19386677067776L, 144442);
    super.onPause();
    this.lKa.rQG.onPause();
    if (this.rQm != null) {
      this.rQm.lKa.rQG.onPause();
    }
    GMTrace.o(19386677067776L, 144442);
  }
  
  protected void onResume()
  {
    GMTrace.i(19386542850048L, 144441);
    this.lKa.rQG.onResume();
    if (this.rQm != null) {
      this.rQm.lKa.rQG.onResume();
    }
    super.onResume();
    GMTrace.o(19386542850048L, 144441);
  }
  
  protected class a
    extends WebViewUI.i
  {
    protected a()
    {
      super();
      GMTrace.i(19388153462784L, 144453);
      GMTrace.o(19388153462784L, 144453);
    }
    
    public void a(WebView paramWebView, String paramString)
    {
      GMTrace.i(19388421898240L, 144455);
      super.a(paramWebView, paramString);
      GameBaseWebViewUI.c(GameBaseWebViewUI.this).rQG.bFi();
      GMTrace.o(19388421898240L, 144455);
    }
    
    public void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(19388287680512L, 144454);
      GameBaseWebViewUI.c(GameBaseWebViewUI.this).rQG.bFh();
      super.b(paramWebView, paramString, paramBitmap);
      GMTrace.o(19388287680512L, 144454);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\GameBaseWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
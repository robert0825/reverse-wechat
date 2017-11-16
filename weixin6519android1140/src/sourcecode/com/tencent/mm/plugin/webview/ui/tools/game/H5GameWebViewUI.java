package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.widget.MMWebView;

@a(19)
public class H5GameWebViewUI
  extends GameWebViewUI
{
  private int mXO;
  private boolean rQT;
  
  public H5GameWebViewUI()
  {
    GMTrace.i(12338233081856L, 91927);
    GMTrace.o(12338233081856L, 91927);
  }
  
  protected final boolean bDW()
  {
    GMTrace.i(12338769952768L, 91931);
    GMTrace.o(12338769952768L, 91931);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12338367299584L, 91928);
    super.onCreate(paramBundle);
    w.i("MicroMsg.H5GameWebViewUI", "onCreate");
    this.lJT = false;
    this.mXO = this.screenOrientation;
    this.rQT = this.rKD;
    GMTrace.o(12338367299584L, 91928);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(12338501517312L, 91929);
    w.i("MicroMsg.H5GameWebViewUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    paramIntent = paramIntent.getStringExtra("rawUrl");
    w.d("MicroMsg.H5GameWebViewUI", "url = " + paramIntent);
    if (!this.rKK.equals(paramIntent))
    {
      if (paramIntent.startsWith("http://game.weixin.qq.com/cgi-bin/h5/static/gameloading/index.html")) {
        this.rKK = paramIntent;
      }
      if (!this.eVw.equals(paramIntent))
      {
        this.eVw = paramIntent;
        this.screenOrientation = getIntent().getIntExtra("screen_orientation", -1);
        this.rKD = getIntent().getBooleanExtra("show_full_screen", false);
        this.rLk.lIx = this.eVw;
        if (this.ioi == null) {
          this.ioi = new e(this, this.nXD);
        }
        for (;;)
        {
          this.nXD.loadUrl("about:blank");
          super.j(this.eVw, false, -1);
          GMTrace.o(12338501517312L, 91929);
          return;
          this.ioi.b(paramIntent, null, null);
        }
      }
      this.screenOrientation = this.mXO;
      this.rKD = this.rQT;
    }
    GMTrace.o(12338501517312L, 91929);
  }
  
  public void onResume()
  {
    GMTrace.i(12338635735040L, 91930);
    aEa();
    super.onResume();
    GMTrace.o(12338635735040L, 91930);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\H5GameWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
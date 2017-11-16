package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.webview.modeltools.e;
import com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMWebView;

@a(3)
public class TransparentWebViewUI
  extends GameWebViewUI
{
  public TransparentWebViewUI()
  {
    GMTrace.i(12265621291008L, 91386);
    GMTrace.o(12265621291008L, 91386);
  }
  
  protected final void MP()
  {
    GMTrace.i(12265755508736L, 91387);
    super.MP();
    this.rMj.rKn = true;
    this.rMj.hPU = false;
    this.rMj.jw(true);
    this.rMj.xQ(0);
    if ((this.rKD) && (this.rKC != null)) {
      this.rKC.rVP = false;
    }
    GMTrace.o(12265755508736L, 91387);
  }
  
  protected final void bDL()
  {
    GMTrace.i(12265889726464L, 91388);
    AT(0);
    this.vKB.hqF.setBackgroundResource(0);
    this.nXD.setBackgroundResource(17170445);
    this.nXD.setBackgroundColor(0);
    findViewById(R.h.cnO).setBackgroundResource(17170445);
    GMTrace.o(12265889726464L, 91388);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(15143383597056L, 112827);
    super.onCreate(paramBundle);
    if (this.screenOrientation == 1001)
    {
      this.screenOrientation = 0;
      if (this.rKF != null)
      {
        this.rKF.enable();
        GMTrace.o(15143383597056L, 112827);
      }
    }
    else if (this.screenOrientation == 1002)
    {
      this.screenOrientation = 1;
      if (this.rKF != null) {
        this.rKF.enable();
      }
    }
    GMTrace.o(15143383597056L, 112827);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\TransparentWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
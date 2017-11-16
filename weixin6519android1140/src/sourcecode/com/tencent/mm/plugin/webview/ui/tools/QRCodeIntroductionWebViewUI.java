package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.ui.base.h.c;

public class QRCodeIntroductionWebViewUI
  extends WebViewUI
{
  public QRCodeIntroductionWebViewUI()
  {
    GMTrace.i(12322932260864L, 91813);
    GMTrace.o(12322932260864L, 91813);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12323066478592L, 91814);
    super.onCreate(paramBundle);
    a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12347091451904L, 91993);
        QRCodeIntroductionWebViewUI.a(QRCodeIntroductionWebViewUI.this);
        GMTrace.o(12347091451904L, 91993);
        return true;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12132074651648L, 90391);
        QRCodeIntroductionWebViewUI.this.finish();
        GMTrace.o(12132074651648L, 90391);
        return true;
      }
    });
    GMTrace.o(12323066478592L, 91814);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\QRCodeIntroductionWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
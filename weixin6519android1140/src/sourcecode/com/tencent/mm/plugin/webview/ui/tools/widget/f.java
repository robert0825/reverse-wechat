package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.widget.MMWebView;

public final class f
  extends e
{
  public b rVC;
  private g rVD;
  
  public f(MMWebView paramMMWebView, boolean paramBoolean, b paramb)
  {
    super(paramMMWebView, false);
    GMTrace.i(20453573787648L, 152391);
    this.rVC = null;
    this.rVD = null;
    this.rVC = paramb;
    GMTrace.o(20453573787648L, 152391);
  }
  
  protected final g XZ()
  {
    GMTrace.i(20453708005376L, 152392);
    if (this.rVD == null) {
      this.rVD = new g()
      {
        public final boolean m(int paramAnonymousInt, Bundle paramAnonymousBundle)
        {
          GMTrace.i(20453439569920L, 152390);
          if (f.this.rVC != null)
          {
            bool = f.this.rVC.m(paramAnonymousInt, paramAnonymousBundle);
            GMTrace.o(20453439569920L, 152390);
            return bool;
          }
          boolean bool = super.m(paramAnonymousInt, paramAnonymousBundle);
          GMTrace.o(20453439569920L, 152390);
          return bool;
        }
      };
    }
    g localg = this.rVD;
    GMTrace.o(20453708005376L, 152392);
    return localg;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\widget\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
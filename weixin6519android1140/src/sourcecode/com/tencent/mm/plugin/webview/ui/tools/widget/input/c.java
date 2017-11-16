package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;

public final class c
{
  boolean iPF;
  int iPJ;
  int iPK;
  Context iPn;
  b rWv;
  WebViewSmileyPanel.a rWw;
  
  public c()
  {
    GMTrace.i(12076911165440L, 89980);
    this.iPF = false;
    GMTrace.o(12076911165440L, 89980);
  }
  
  public final a bFY()
  {
    GMTrace.i(12077045383168L, 89981);
    if (this.rWv == null)
    {
      this.rWv = new b();
      this.rWv.iPn = this.iPn;
      this.rWv.a(this);
    }
    b localb = this.rWv;
    GMTrace.o(12077045383168L, 89981);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\widget\input\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
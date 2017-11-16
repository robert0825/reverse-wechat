package com.tencent.mm.plugin.appbrand.dynamic.html;

import android.content.Intent;
import android.text.style.URLSpan;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.sdk.platformtools.w;

public class CustomURLSpan
  extends URLSpan
{
  private String mUrl;
  
  public CustomURLSpan(String paramString)
  {
    super(paramString);
    GMTrace.i(18342060490752L, 136659);
    this.mUrl = paramString;
    GMTrace.o(18342060490752L, 136659);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(18342194708480L, 136660);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.mUrl);
    d.b(paramView.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
    w.d("MicroMsg.CustomURLSpan", "on custom url(%s) span clicked.", new Object[] { this.mUrl });
    GMTrace.o(18342194708480L, 136660);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\html\CustomURLSpan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
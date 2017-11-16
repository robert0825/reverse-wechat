package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends ClickableSpan
{
  private String ibL;
  private int ibM;
  
  public a(String paramString)
  {
    GMTrace.i(20706842640384L, 154278);
    this.ibM = ab.getContext().getResources().getColor(o.c.aNQ);
    this.ibL = paramString;
    GMTrace.o(20706842640384L, 154278);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(20707111075840L, 154280);
    if (bg.nm(this.ibL))
    {
      w.e("MicroMsg.ExposeSpan", "exposeUrl is null, return");
      GMTrace.o(20707111075840L, 154280);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.ibL);
    localIntent.putExtra("forceHideShare", true);
    d.b(paramView.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
    w.d("MicroMsg.ExposeSpan", "expose click, exposeUrl:%s", new Object[] { this.ibL });
    GMTrace.o(20707111075840L, 154280);
  }
  
  public final void updateDrawState(TextPaint paramTextPaint)
  {
    GMTrace.i(20706976858112L, 154279);
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setColor(this.ibM);
    paramTextPaint.setUnderlineText(false);
    GMTrace.o(20706976858112L, 154279);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
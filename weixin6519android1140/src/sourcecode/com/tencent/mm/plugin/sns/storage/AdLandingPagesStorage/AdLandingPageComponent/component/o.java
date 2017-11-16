package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.l;

public final class o
  extends i
{
  MMWebView inX;
  FrameLayout pHS;
  
  public o(Context paramContext, v paramv, ViewGroup paramViewGroup)
  {
    super(paramContext, paramv, paramViewGroup);
    GMTrace.i(8237747273728L, 61376);
    GMTrace.o(8237747273728L, 61376);
  }
  
  protected final int aXW()
  {
    GMTrace.i(8238149926912L, 61379);
    GMTrace.o(8238149926912L, 61379);
    return Integer.MAX_VALUE;
  }
  
  public final View bkC()
  {
    GMTrace.i(8238015709184L, 61378);
    this.pHS = ((FrameLayout)this.hqF);
    this.inX = MMWebView.a.cb(this.context);
    this.pHS.addView(this.inX);
    FrameLayout localFrameLayout = this.pHS;
    GMTrace.o(8238015709184L, 61378);
    return localFrameLayout;
  }
  
  protected final void bkI()
  {
    GMTrace.i(8237881491456L, 61377);
    WindowManager localWindowManager = (WindowManager)this.context.getSystemService("window");
    int i = localWindowManager.getDefaultDisplay().getWidth();
    int j = localWindowManager.getDefaultDisplay().getHeight();
    this.inX.setVerticalScrollBarEnabled(false);
    this.inX.setHorizontalScrollBarEnabled(false);
    this.inX.getSettings().setJavaScriptEnabled(true);
    this.inX.loadUrl(((v)this.pGS).mci);
    this.inX.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    this.inX.setVisibility(0);
    this.pHS.setPadding(this.pHS.getPaddingLeft(), (int)((v)this.pGS).pEB, this.pHS.getPaddingRight(), (int)((v)this.pGS).pEC);
    this.pHS.setLayoutParams(new LinearLayout.LayoutParams(i, j));
    GMTrace.o(8237881491456L, 61377);
  }
  
  protected final View bkJ()
  {
    GMTrace.i(8238284144640L, 61380);
    FrameLayout localFrameLayout = new FrameLayout(this.context);
    GMTrace.o(8238284144640L, 61380);
    return localFrameLayout;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
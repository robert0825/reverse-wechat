package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager.e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.mogic.WxViewPager;

public class WebViewSmileyPanel
  extends LinearLayout
  implements ViewPager.e, WebViewSmileyViewPager.a
{
  View Hw;
  private boolean iNp;
  MMActivity iPC;
  private MMDotView iPE;
  private boolean iPF;
  c rWp;
  a rWs;
  private WebViewSmileyViewPager rWt;
  
  public WebViewSmileyPanel(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(12079998173184L, 90003);
    this.iNp = false;
    this.Hw = null;
    this.rWt = null;
    this.iPF = true;
    init();
    GMTrace.o(12079998173184L, 90003);
  }
  
  public WebViewSmileyPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12080132390912L, 90004);
    this.iNp = false;
    this.Hw = null;
    this.rWt = null;
    this.iPF = true;
    init();
    GMTrace.o(12080132390912L, 90004);
  }
  
  private void adA()
  {
    GMTrace.i(12081474568192L, 90014);
    if (this.iPE == null)
    {
      GMTrace.o(12081474568192L, 90014);
      return;
    }
    boolean bool = j.aN(getContext());
    RelativeLayout.LayoutParams localLayoutParams;
    if (bool != this.iPF)
    {
      if (!bool) {
        break label117;
      }
      this.iPE.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(R.f.aQw));
      localLayoutParams = (RelativeLayout.LayoutParams)this.iPE.getLayoutParams();
      localLayoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(R.f.aRY);
      this.iPE.setLayoutParams(localLayoutParams);
    }
    for (;;)
    {
      this.iPF = bool;
      GMTrace.o(12081474568192L, 90014);
      return;
      label117:
      this.iPE.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(R.f.aQu));
      localLayoutParams = (RelativeLayout.LayoutParams)this.iPE.getLayoutParams();
      localLayoutParams.bottomMargin = 0;
      this.iPE.setLayoutParams(localLayoutParams);
    }
  }
  
  private void init()
  {
    GMTrace.i(12080803479552L, 90009);
    this.iPC = ((MMActivity)getContext());
    this.rWp = new c();
    this.rWp.iPn = getContext();
    this.rWp.rWw = this.rWs;
    GMTrace.o(12080803479552L, 90009);
  }
  
  public final void V(int paramInt)
  {
    GMTrace.i(12079192866816L, 89997);
    a locala = this.rWp.bFY();
    int i = locala.getPageCount();
    int j = locala.iPp;
    if (i <= 1)
    {
      this.iPE.setVisibility(4);
      GMTrace.o(12079192866816L, 89997);
      return;
    }
    this.iPE.setVisibility(0);
    this.iPE.BU(i);
    this.iPE.BV(paramInt - j);
    GMTrace.o(12079192866816L, 89997);
  }
  
  public final void W(int paramInt)
  {
    GMTrace.i(12079327084544L, 89998);
    GMTrace.o(12079327084544L, 89998);
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(12079058649088L, 89996);
    GMTrace.o(12079058649088L, 89996);
  }
  
  public final void ady()
  {
    GMTrace.i(12079461302272L, 89999);
    if (this.rWt == null)
    {
      GMTrace.o(12079461302272L, 89999);
      return;
    }
    this.rWp.iPF = j.aN(getContext());
    WebViewSmileyViewPager.b localb = (WebViewSmileyViewPager.b)this.rWt.xH;
    if (localb != null)
    {
      localb.iPP.clear();
      localb.rWp = this.rWp;
      localb.notifyDataSetChanged();
    }
    for (;;)
    {
      this.rWt.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12074495246336L, 89962);
          WebViewSmileyPanel.this.V(WebViewSmileyPanel.a(WebViewSmileyPanel.this).xI);
          GMTrace.o(12074495246336L, 89962);
        }
      });
      GMTrace.o(12079461302272L, 89999);
      return;
      localb = new WebViewSmileyViewPager.b();
      localb.rWp = this.rWp;
      this.rWt.a(localb);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(12079729737728L, 90001);
    if (this.iNp)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
      GMTrace.o(12079729737728L, 90001);
      return;
    }
    j.aN(getContext());
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(12079729737728L, 90001);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(12079595520000L, 90000);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    adA();
    GMTrace.o(12079595520000L, 90000);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(12081071915008L, 90011);
    if (paramInt == 0) {}
    for (this.iNp = false;; this.iNp = true)
    {
      super.setVisibility(paramInt);
      if (this.iNp) {
        break label186;
      }
      this.iPC.aLo();
      if ((this.Hw == null) || (getChildCount() <= 0)) {
        break;
      }
      this.Hw.setVisibility(0);
      GMTrace.o(12081071915008L, 90011);
      return;
    }
    if (this.Hw == null) {
      this.Hw = View.inflate(ab.getContext(), R.i.cHY, null);
    }
    for (;;)
    {
      this.rWt = ((WebViewSmileyViewPager)this.Hw.findViewById(R.h.cfq));
      this.rWt.b(this);
      this.rWt.rWp = this.rWp;
      this.rWt.rWy = this;
      this.iPE = ((MMDotView)this.Hw.findViewById(R.h.cfp));
      this.iPE.BU(1);
      adA();
      addView(this.Hw, new LinearLayout.LayoutParams(-1, -1));
      label186:
      GMTrace.o(12081071915008L, 90011);
      return;
      if (this.Hw.getParent() != null) {
        ((ViewGroup)this.Hw.getParent()).removeView(this.Hw);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void acZ();
    
    public abstract void append(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\widget\input\WebViewSmileyPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
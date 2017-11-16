package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.annotation.SuppressLint;
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
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.mogic.WxViewPager;

public class AppBrandSmileyPanelBase
  extends LinearLayout
  implements ViewPager.e, AppBrandSmileyViewPager.b
{
  public View Hw;
  private boolean iNp;
  public a iPB;
  public MMActivity iPC;
  private AppBrandSmileyViewPager iPD;
  private MMDotView iPE;
  private boolean iPF;
  public c iPo;
  
  public AppBrandSmileyPanelBase(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(19872276807680L, 148060);
    this.iNp = false;
    this.Hw = null;
    this.iPD = null;
    this.iPF = true;
    init();
    GMTrace.o(19872276807680L, 148060);
  }
  
  public AppBrandSmileyPanelBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(19872411025408L, 148061);
    this.iNp = false;
    this.Hw = null;
    this.iPD = null;
    this.iPF = true;
    init();
    GMTrace.o(19872411025408L, 148061);
  }
  
  private void adA()
  {
    GMTrace.i(19873350549504L, 148068);
    if (this.iPE == null)
    {
      GMTrace.o(19873350549504L, 148068);
      return;
    }
    boolean bool = j.aN(getContext());
    RelativeLayout.LayoutParams localLayoutParams;
    if (bool != this.iPF)
    {
      if (!bool) {
        break label117;
      }
      this.iPE.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(o.d.aQw));
      localLayoutParams = (RelativeLayout.LayoutParams)this.iPE.getLayoutParams();
      localLayoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(o.d.aRY);
      this.iPE.setLayoutParams(localLayoutParams);
    }
    for (;;)
    {
      this.iPF = bool;
      GMTrace.o(19873350549504L, 148068);
      return;
      label117:
      this.iPE.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(o.d.aQu));
      localLayoutParams = (RelativeLayout.LayoutParams)this.iPE.getLayoutParams();
      localLayoutParams.bottomMargin = 0;
      this.iPE.setLayoutParams(localLayoutParams);
    }
  }
  
  private void init()
  {
    GMTrace.i(19872679460864L, 148063);
    this.iPC = ((MMActivity)getContext());
    this.iPo = acQ();
    this.iPo.iPn = getContext();
    this.iPo.iPI = this.iPB;
    GMTrace.o(19872679460864L, 148063);
  }
  
  public final void MP()
  {
    GMTrace.i(19873216331776L, 148067);
    if ((this.Hw != null) && (getChildCount() > 0))
    {
      this.Hw.setVisibility(0);
      GMTrace.o(19873216331776L, 148067);
      return;
    }
    if (this.Hw == null) {
      this.Hw = View.inflate(ab.getContext(), o.g.hDt, null);
    }
    for (;;)
    {
      this.iPD = ((AppBrandSmileyViewPager)this.Hw.findViewById(o.f.cfq));
      this.iPD.b(this);
      this.iPD.iPo = this.iPo;
      this.iPD.iPO = this;
      this.iPE = ((MMDotView)this.Hw.findViewById(o.f.cfp));
      this.iPE.BU(1);
      adA();
      addView(this.Hw, new LinearLayout.LayoutParams(-1, -1));
      GMTrace.o(19873216331776L, 148067);
      return;
      if (this.Hw.getParent() != null) {
        ((ViewGroup)this.Hw.getParent()).removeView(this.Hw);
      }
    }
  }
  
  public final void V(int paramInt)
  {
    GMTrace.i(19871471501312L, 148054);
    a locala = this.iPo.adB();
    int i = locala.getPageCount();
    int j = locala.iPp;
    if (i <= 1)
    {
      this.iPE.setVisibility(4);
      GMTrace.o(19871471501312L, 148054);
      return;
    }
    this.iPE.setVisibility(0);
    this.iPE.BU(i);
    this.iPE.BV(paramInt - j);
    GMTrace.o(19871471501312L, 148054);
  }
  
  public final void W(int paramInt)
  {
    GMTrace.i(19871605719040L, 148055);
    GMTrace.o(19871605719040L, 148055);
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(19871337283584L, 148053);
    GMTrace.o(19871337283584L, 148053);
  }
  
  public c acQ()
  {
    GMTrace.i(19872813678592L, 148064);
    c localc = new c();
    GMTrace.o(19872813678592L, 148064);
    return localc;
  }
  
  public final void ady()
  {
    GMTrace.i(19871739936768L, 148056);
    if (this.iPD == null)
    {
      GMTrace.o(19871739936768L, 148056);
      return;
    }
    this.iPo.iPF = j.aN(getContext());
    AppBrandSmileyViewPager.a locala = (AppBrandSmileyViewPager.a)this.iPD.xH;
    if (locala != null)
    {
      locala.iPP.clear();
      locala.iPo = this.iPo;
      locala.notifyDataSetChanged();
    }
    for (;;)
    {
      this.iPD.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19874558509056L, 148077);
          AppBrandSmileyPanelBase.this.V(AppBrandSmileyPanelBase.a(AppBrandSmileyPanelBase.this).xI);
          GMTrace.o(19874558509056L, 148077);
        }
      });
      GMTrace.o(19871739936768L, 148056);
      return;
      locala = new AppBrandSmileyViewPager.a();
      locala.iPo = this.iPo;
      this.iPD.a(locala);
    }
  }
  
  public final void adz()
  {
    GMTrace.i(19872545243136L, 148062);
    if (this.Hw != null) {
      this.Hw.setVisibility(4);
    }
    GMTrace.o(19872545243136L, 148062);
  }
  
  @SuppressLint({"WrongCall"})
  public final void bE(int paramInt1, int paramInt2)
  {
    GMTrace.i(19872142589952L, 148059);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(19872142589952L, 148059);
  }
  
  public final void kd(int paramInt)
  {
    GMTrace.i(19873082114048L, 148066);
    super.setVisibility(paramInt);
    GMTrace.o(19873082114048L, 148066);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(19872008372224L, 148058);
    if (this.iNp)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
      GMTrace.o(19872008372224L, 148058);
      return;
    }
    j.aN(getContext());
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(19872008372224L, 148058);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(19871874154496L, 148057);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    adA();
    GMTrace.o(19871874154496L, 148057);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(19872947896320L, 148065);
    if (paramInt == 0) {}
    for (this.iNp = false;; this.iNp = true)
    {
      super.setVisibility(paramInt);
      if (!this.iNp)
      {
        this.iPC.aLo();
        MP();
      }
      GMTrace.o(19872947896320L, 148065);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void acZ();
    
    public abstract void append(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\panel\AppBrandSmileyPanelBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
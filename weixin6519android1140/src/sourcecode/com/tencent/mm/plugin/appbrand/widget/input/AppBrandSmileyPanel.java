package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyPanelBase;
import com.tencent.mm.plugin.appbrand.widget.input.panel.c;

final class AppBrandSmileyPanel
  extends AppBrandSmileyPanelBase
{
  private int iMW;
  int iMX;
  private boolean ou;
  
  public AppBrandSmileyPanel(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10104715870208L, 75286);
    this.iMW = 0;
    this.iMX = -1;
    this.ou = false;
    GMTrace.o(10104715870208L, 75286);
  }
  
  public AppBrandSmileyPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10104850087936L, 75287);
    this.iMW = 0;
    this.iMX = -1;
    this.ou = false;
    GMTrace.o(10104850087936L, 75287);
  }
  
  protected final c acQ()
  {
    GMTrace.i(19868116058112L, 148029);
    ae localae = new ae();
    GMTrace.o(19868116058112L, 148029);
    return localae;
  }
  
  final boolean acR()
  {
    GMTrace.i(10105521176576L, 75292);
    if (d.et(18))
    {
      bool = super.isInLayout();
      GMTrace.o(10105521176576L, 75292);
      return bool;
    }
    boolean bool = this.ou;
    GMTrace.o(10105521176576L, 75292);
    return bool;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(10105386958848L, 75291);
    this.ou = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.ou = false;
    GMTrace.o(10105386958848L, 75291);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(10105118523392L, 75289);
    if (!isShown())
    {
      bE(paramInt1, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
      GMTrace.o(10105118523392L, 75289);
      return;
    }
    int[] arrayOfInt;
    if (!j.aN(getContext()))
    {
      arrayOfInt = c.aaW();
      paramInt2 = Math.min(arrayOfInt[0], arrayOfInt[1]) / 2 - getContext().getResources().getDimensionPixelSize(o.d.hAe);
    }
    for (;;)
    {
      bE(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      GMTrace.o(10105118523392L, 75289);
      return;
      if (this.iMX > 0)
      {
        paramInt2 = this.iMX;
      }
      else if (this.iMW > 0)
      {
        paramInt2 = this.iMW;
      }
      else
      {
        arrayOfInt = c.aaW();
        paramInt2 = Math.max(arrayOfInt[0], arrayOfInt[1]) / 2 - getContext().getResources().getDimensionPixelSize(o.d.hAe);
        this.iMW = paramInt2;
      }
    }
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(10105252741120L, 75290);
    kd(paramInt);
    if (paramInt == 0) {
      MP();
    }
    GMTrace.o(10105252741120L, 75290);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\AppBrandSmileyPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
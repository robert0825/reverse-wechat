package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView;

public class CoverViewContainer
  extends AppBrandNativeContainerView
{
  private View Uy;
  
  public CoverViewContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20737444282368L, 154506);
    GMTrace.o(20737444282368L, 154506);
  }
  
  public CoverViewContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20737578500096L, 154507);
    GMTrace.o(20737578500096L, 154507);
  }
  
  public CoverViewContainer(Context paramContext, View paramView)
  {
    super(paramContext);
    GMTrace.i(20737712717824L, 154508);
    this.Uy = paramView;
    super.addView(paramView, 0, new ViewGroup.LayoutParams(-1, -1));
    GMTrace.o(20737712717824L, 154508);
  }
  
  public final <T extends View> T J(Class<T> paramClass)
  {
    GMTrace.i(21076344045568L, 157031);
    try
    {
      if (paramClass.isAssignableFrom(this.Uy.getClass()))
      {
        paramClass = this.Uy;
        GMTrace.o(21076344045568L, 157031);
        return paramClass;
      }
    }
    catch (Exception paramClass)
    {
      GMTrace.o(21076344045568L, 157031);
    }
    return null;
  }
  
  public void addView(View paramView, int paramInt)
  {
    GMTrace.i(20737981153280L, 154510);
    int i;
    if (paramInt < 0) {
      i = 0;
    }
    for (;;)
    {
      super.addView(paramView, i + 1);
      GMTrace.o(20737981153280L, 154510);
      return;
      i = paramInt;
      if (paramInt > getChildCount() - 1) {
        i = getChildCount() - 1;
      }
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(20738115371008L, 154511);
    int i;
    if (paramInt < 0) {
      i = 0;
    }
    for (;;)
    {
      super.addView(paramView, i + 1, paramLayoutParams);
      GMTrace.o(20738115371008L, 154511);
      return;
      i = paramInt;
      if (paramInt > getChildCount() - 1) {
        i = getChildCount() - 1;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\coverview\CoverViewContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
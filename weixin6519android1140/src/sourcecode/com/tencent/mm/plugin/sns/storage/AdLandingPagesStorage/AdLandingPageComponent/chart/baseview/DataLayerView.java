package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;

public abstract class DataLayerView
  extends View
{
  public DataLayerView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8209427333120L, 61165);
    GMTrace.o(8209427333120L, 61165);
  }
  
  public DataLayerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8209561550848L, 61166);
    GMTrace.o(8209561550848L, 61166);
  }
  
  public DataLayerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8209695768576L, 61167);
    GMTrace.o(8209695768576L, 61167);
  }
  
  public abstract int bks();
  
  public abstract int bkt();
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8210232639488L, 61171);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8210232639488L, 61171);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8209829986304L, 61168);
    View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = i;
    switch (j)
    {
    default: 
      paramInt1 = i;
    case 1073741824: 
      j = View.MeasureSpec.getMode(paramInt2);
      i = View.MeasureSpec.getSize(paramInt2);
      paramInt2 = i;
      switch (j)
      {
      default: 
        paramInt2 = i;
      }
      break;
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      GMTrace.o(8209829986304L, 61168);
      return;
      paramInt1 = bkt();
      break;
      paramInt1 = getSuggestedMinimumWidth();
      break;
      paramInt2 = bks();
      continue;
      paramInt2 = getSuggestedMinimumHeight();
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8210366857216L, 61172);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8210366857216L, 61172);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\chart\baseview\DataLayerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;

public abstract class ChartGridView
  extends View
{
  public ChartGridView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8208353591296L, 61157);
    GMTrace.o(8208353591296L, 61157);
  }
  
  public ChartGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8208487809024L, 61158);
    GMTrace.o(8208487809024L, 61158);
  }
  
  public ChartGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8208622026752L, 61159);
    GMTrace.o(8208622026752L, 61159);
  }
  
  public abstract int bks();
  
  public abstract int bkt();
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8209158897664L, 61163);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8209158897664L, 61163);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8208756244480L, 61160);
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
      GMTrace.o(8208756244480L, 61160);
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
    GMTrace.i(8209293115392L, 61164);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8209293115392L, 61164);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\chart\baseview\ChartGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
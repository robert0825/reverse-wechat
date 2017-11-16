package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;

public class MaxListView
  extends ListView
{
  public MaxListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3325915299840L, 24780);
    GMTrace.o(3325915299840L, 24780);
  }
  
  public MaxListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3325781082112L, 24779);
    GMTrace.o(3325781082112L, 24779);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3326049517568L, 24781);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(3326049517568L, 24781);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\base\MaxListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
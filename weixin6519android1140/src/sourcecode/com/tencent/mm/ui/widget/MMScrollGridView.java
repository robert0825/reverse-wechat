package com.tencent.mm.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.GridView;
import com.tencent.gmtrace.GMTrace;

public class MMScrollGridView
  extends GridView
{
  public MMScrollGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1637322063872L, 12199);
    GMTrace.o(1637322063872L, 12199);
  }
  
  public MMScrollGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1637456281600L, 12200);
    GMTrace.o(1637456281600L, 12200);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1637590499328L, 12201);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(1637590499328L, 12201);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\widget\MMScrollGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
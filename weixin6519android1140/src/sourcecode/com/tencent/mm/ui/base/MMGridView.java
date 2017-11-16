package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.GridView;
import com.tencent.gmtrace.GMTrace;

public class MMGridView
  extends GridView
{
  public MMGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3359201296384L, 25028);
    GMTrace.o(3359201296384L, 25028);
  }
  
  public MMGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3359335514112L, 25029);
    GMTrace.o(3359335514112L, 25029);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3359469731840L, 25030);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(3359469731840L, 25030);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\base\MMGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
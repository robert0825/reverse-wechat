package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.GridView;
import com.tencent.gmtrace.GMTrace;

public class MaxGridView
  extends GridView
{
  public MaxGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6013893738496L, 44807);
    GMTrace.o(6013893738496L, 44807);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(6014027956224L, 44808);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(6014027956224L, 44808);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\MaxGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.GridView;
import com.tencent.gmtrace.GMTrace;

public class WrappingGridView
  extends GridView
{
  public WrappingGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(15977949429760L, 119045);
    GMTrace.o(15977949429760L, 119045);
  }
  
  public WrappingGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(15978083647488L, 119046);
    GMTrace.o(15978083647488L, 119046);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(15978217865216L, 119047);
    if (getLayoutParams().height == -2) {
      paramInt2 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(15978217865216L, 119047);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\previewimageview\WrappingGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
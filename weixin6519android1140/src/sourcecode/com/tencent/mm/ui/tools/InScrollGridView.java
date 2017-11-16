package com.tencent.mm.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.GridView;
import com.tencent.gmtrace.GMTrace;

public class InScrollGridView
  extends GridView
{
  public InScrollGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1925353308160L, 14345);
    GMTrace.o(1925353308160L, 14345);
  }
  
  public InScrollGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1925487525888L, 14346);
    GMTrace.o(1925487525888L, 14346);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1925621743616L, 14347);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(1925621743616L, 14347);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\InScrollGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
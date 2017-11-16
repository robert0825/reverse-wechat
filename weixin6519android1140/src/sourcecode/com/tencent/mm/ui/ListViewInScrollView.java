package com.tencent.mm.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;

public class ListViewInScrollView
  extends ListView
{
  public ListViewInScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(21076612481024L, 157033);
    GMTrace.o(21076612481024L, 157033);
  }
  
  public ListViewInScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(21076746698752L, 157034);
    GMTrace.o(21076746698752L, 157034);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(21076880916480L, 157035);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(21076880916480L, 157035);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\ListViewInScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
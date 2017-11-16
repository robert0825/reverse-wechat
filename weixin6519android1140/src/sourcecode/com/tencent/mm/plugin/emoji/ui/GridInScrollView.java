package com.tencent.mm.plugin.emoji.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.GridView;
import com.tencent.gmtrace.GMTrace;

public class GridInScrollView
  extends GridView
{
  public GridInScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11433337159680L, 85185);
    GMTrace.o(11433337159680L, 85185);
  }
  
  public GridInScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11433471377408L, 85186);
    GMTrace.o(11433471377408L, 85186);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11433605595136L, 85187);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(11433605595136L, 85187);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\GridInScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
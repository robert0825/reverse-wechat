package com.tencent.mm.ui.bindqq;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;

public class AutoBottomScrollView
  extends ScrollView
{
  public AutoBottomScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1893946359808L, 14111);
    GMTrace.o(1893946359808L, 14111);
  }
  
  public AutoBottomScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1894080577536L, 14112);
    GMTrace.o(1894080577536L, 14112);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1894214795264L, 14113);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1898375544832L, 14144);
        AutoBottomScrollView.this.smoothScrollTo(0, AutoBottomScrollView.this.getBottom());
        GMTrace.o(1898375544832L, 14144);
      }
    }, 100L);
    GMTrace.o(1894214795264L, 14113);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\bindqq\AutoBottomScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
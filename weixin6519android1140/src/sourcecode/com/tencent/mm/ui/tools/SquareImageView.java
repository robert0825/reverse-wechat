package com.tencent.mm.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;

public class SquareImageView
  extends ImageView
{
  public SquareImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1997696663552L, 14884);
    GMTrace.o(1997696663552L, 14884);
  }
  
  public SquareImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1997830881280L, 14885);
    GMTrace.o(1997830881280L, 14885);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1997965099008L, 14886);
    paramInt1 = getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
    setMeasuredDimension(paramInt1, paramInt1);
    GMTrace.o(1997965099008L, 14886);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1998099316736L, 14887);
    super.onSizeChanged(paramInt1, paramInt1, paramInt3, paramInt4);
    GMTrace.o(1998099316736L, 14887);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\SquareImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
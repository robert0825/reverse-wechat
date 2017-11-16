package com.tencent.mm.plugin.emoji.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;

public class SquareImageView
  extends ImageView
{
  public SquareImageView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(11416291508224L, 85058);
    GMTrace.o(11416291508224L, 85058);
  }
  
  public SquareImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(11416425725952L, 85059);
    GMTrace.o(11416425725952L, 85059);
  }
  
  public SquareImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11416559943680L, 85060);
    GMTrace.o(11416559943680L, 85060);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11416694161408L, 85061);
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    paramInt1 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    super.onMeasure(paramInt1, paramInt1);
    GMTrace.o(11416694161408L, 85061);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\SquareImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
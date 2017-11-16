package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;

public class SlowImageView
  extends ImageView
{
  public SlowImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3365643747328L, 25076);
    GMTrace.o(3365643747328L, 25076);
  }
  
  public SlowImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3365777965056L, 25077);
    GMTrace.o(3365777965056L, 25077);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\base\SlowImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
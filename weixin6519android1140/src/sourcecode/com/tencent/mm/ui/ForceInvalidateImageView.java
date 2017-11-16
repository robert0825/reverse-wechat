package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;

public class ForceInvalidateImageView
  extends ImageView
{
  public ForceInvalidateImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2086146146304L, 15543);
    GMTrace.o(2086146146304L, 15543);
  }
  
  public ForceInvalidateImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2086011928576L, 15542);
    GMTrace.o(2086011928576L, 15542);
  }
  
  @TargetApi(8)
  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    GMTrace.i(2086280364032L, 15544);
    if (paramInt == 0) {
      invalidate();
    }
    super.onVisibilityChanged(paramView, paramInt);
    GMTrace.o(2086280364032L, 15544);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\ForceInvalidateImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
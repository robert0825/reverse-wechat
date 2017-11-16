package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.widget.DrawedCallBackLinearLayout;

public class OnLayoutChangedLinearLayout
  extends DrawedCallBackLinearLayout
{
  public a wia;
  
  public OnLayoutChangedLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3168343687168L, 23606);
    GMTrace.o(3168343687168L, 23606);
  }
  
  @TargetApi(11)
  public OnLayoutChangedLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3168477904896L, 23607);
    GMTrace.o(3168477904896L, 23607);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3168612122624L, 23608);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.wia != null) {
      this.wia.bWl();
    }
    GMTrace.o(3168612122624L, 23608);
  }
  
  public static abstract interface a
  {
    public abstract void bWl();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\OnLayoutChangedLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
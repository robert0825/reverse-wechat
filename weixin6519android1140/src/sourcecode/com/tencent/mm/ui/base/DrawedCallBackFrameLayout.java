package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;

public class DrawedCallBackFrameLayout
  extends FrameLayout
{
  public a vZi;
  
  public DrawedCallBackFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3332760403968L, 24831);
    GMTrace.o(3332760403968L, 24831);
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(3333028839424L, 24833);
    try
    {
      super.dispatchDraw(paramCanvas);
      if (this.vZi != null)
      {
        this.vZi.aDr();
        this.vZi = null;
      }
      GMTrace.o(3333028839424L, 24833);
      return;
    }
    catch (Throwable paramCanvas)
    {
      for (;;) {}
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3332894621696L, 24832);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(3332894621696L, 24832);
  }
  
  public static abstract interface a
  {
    public abstract void aDr();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\DrawedCallBackFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
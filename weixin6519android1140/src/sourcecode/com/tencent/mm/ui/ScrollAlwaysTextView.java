package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;

public class ScrollAlwaysTextView
  extends TextView
{
  public ScrollAlwaysTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842884);
    GMTrace.i(2901518843904L, 21618);
    GMTrace.o(2901518843904L, 21618);
  }
  
  public ScrollAlwaysTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2901653061632L, 21619);
    GMTrace.o(2901653061632L, 21619);
  }
  
  public int getBaseline()
  {
    GMTrace.i(2902458368000L, 21625);
    try
    {
      int i = super.getBaseline();
      GMTrace.o(2902458368000L, 21625);
      return i;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(2902458368000L, 21625);
    }
    return -1;
  }
  
  public boolean isFocused()
  {
    GMTrace.i(2902055714816L, 21622);
    GMTrace.o(2902055714816L, 21622);
    return true;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(2902324150272L, 21624);
    try
    {
      super.onDraw(paramCanvas);
      GMTrace.o(2902324150272L, 21624);
      return;
    }
    catch (Throwable paramCanvas)
    {
      GMTrace.o(2902324150272L, 21624);
    }
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    GMTrace.i(2901787279360L, 21620);
    if (paramBoolean) {
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
    }
    GMTrace.o(2901787279360L, 21620);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(2902189932544L, 21623);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      GMTrace.o(2902189932544L, 21623);
      return;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(2902189932544L, 21623);
    }
  }
  
  public boolean onPreDraw()
  {
    GMTrace.i(2902592585728L, 21626);
    try
    {
      boolean bool = super.onPreDraw();
      GMTrace.o(2902592585728L, 21626);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(2902592585728L, 21626);
    }
    return true;
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    GMTrace.i(2901921497088L, 21621);
    if (paramBoolean) {
      super.onWindowFocusChanged(paramBoolean);
    }
    GMTrace.o(2901921497088L, 21621);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\ScrollAlwaysTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;

public class SnsUnScaleTextView
  extends TextView
{
  public SnsUnScaleTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8362435543040L, 62305);
    GMTrace.o(8362435543040L, 62305);
  }
  
  public SnsUnScaleTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8362301325312L, 62304);
    GMTrace.o(8362301325312L, 62304);
  }
  
  public int getBaseline()
  {
    GMTrace.i(8362838196224L, 62308);
    try
    {
      int i = super.getBaseline();
      GMTrace.o(8362838196224L, 62308);
      return i;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(8362838196224L, 62308);
    }
    return -1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8362703978496L, 62307);
    try
    {
      super.onDraw(paramCanvas);
      GMTrace.o(8362703978496L, 62307);
      return;
    }
    catch (Throwable paramCanvas)
    {
      GMTrace.o(8362703978496L, 62307);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8362569760768L, 62306);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      GMTrace.o(8362569760768L, 62306);
      return;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(8362569760768L, 62306);
    }
  }
  
  public boolean onPreDraw()
  {
    GMTrace.i(8362972413952L, 62309);
    try
    {
      boolean bool = super.onPreDraw();
      GMTrace.o(8362972413952L, 62309);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(8362972413952L, 62309);
    }
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsUnScaleTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
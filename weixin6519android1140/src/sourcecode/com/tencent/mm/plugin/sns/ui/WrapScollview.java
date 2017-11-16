package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;

public class WrapScollview
  extends ScrollView
{
  View hqF;
  boolean qkS;
  
  public WrapScollview(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8534234234880L, 63585);
    this.qkS = true;
    GMTrace.o(8534234234880L, 63585);
  }
  
  public WrapScollview(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8534100017152L, 63584);
    this.qkS = true;
    GMTrace.o(8534100017152L, 63584);
  }
  
  protected int computeScrollDeltaToGetChildRectOnScreen(Rect paramRect)
  {
    GMTrace.i(8534502670336L, 63587);
    if (!this.qkS)
    {
      GMTrace.o(8534502670336L, 63587);
      return 0;
    }
    int i = super.computeScrollDeltaToGetChildRectOnScreen(paramRect);
    GMTrace.o(8534502670336L, 63587);
    return i;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    GMTrace.i(8534368452608L, 63586);
    if (this.hqF != null)
    {
      View localView = this.hqF;
      float f1 = paramMotionEvent.getRawX();
      float f2 = paramMotionEvent.getRawY();
      int[] arrayOfInt = new int[2];
      localView.getLocationOnScreen(arrayOfInt);
      int j = arrayOfInt[0];
      int k = localView.getWidth();
      int m = arrayOfInt[1];
      int n = localView.getHeight();
      if ((j < f1) && (f1 < k + j) && (m < f2) && (f2 < n + m)) {}
      while (i != 0)
      {
        GMTrace.o(8534368452608L, 63586);
        return false;
        i = 0;
      }
    }
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    GMTrace.o(8534368452608L, 63586);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\WrapScollview.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
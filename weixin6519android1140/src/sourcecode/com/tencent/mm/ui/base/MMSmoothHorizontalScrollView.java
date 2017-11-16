package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;
import com.tencent.gmtrace.GMTrace;

public class MMSmoothHorizontalScrollView
  extends HorizontalScrollView
{
  private Rect eI;
  private Interpolator el;
  private TranslateAnimation oaR;
  private View weT;
  private float yd;
  
  public MMSmoothHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3168746340352L, 23609);
    this.eI = new Rect();
    this.el = new DecelerateInterpolator();
    setFadingEdgeLength(0);
    GMTrace.o(3168746340352L, 23609);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(3168880558080L, 23610);
    if (getChildCount() > 0) {
      this.weT = getChildAt(0);
    }
    GMTrace.o(3168880558080L, 23610);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = 1;
    int i = 0;
    GMTrace.i(3169014775808L, 23611);
    boolean bool;
    if (this.weT == null)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(3169014775808L, 23611);
      return bool;
    }
    switch (paramMotionEvent.getAction())
    {
    }
    label444:
    for (;;)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(3169014775808L, 23611);
      return bool;
      this.yd = paramMotionEvent.getX();
      continue;
      float f = paramMotionEvent.getX();
      if (this.yd == 0.0F) {
        this.yd = f;
      }
      j = (int)(this.yd - f) / 2;
      scrollBy(j, 0);
      this.yd = f;
      int k = this.weT.getMeasuredWidth();
      int m = getWidth();
      int n = getPaddingLeft();
      int i1 = getPaddingRight();
      int i2 = getScrollX();
      if ((i2 == 0) || (i2 == k - (m - n - i1))) {
        i = 1;
      }
      if (i != 0)
      {
        if (this.eI.isEmpty()) {
          this.eI.set(this.weT.getLeft(), this.weT.getTop(), this.weT.getRight(), this.weT.getBottom());
        }
        this.weT.layout(this.weT.getLeft() - j, this.weT.getTop(), this.weT.getRight() - j, this.weT.getBottom());
        continue;
        this.yd = 0.0F;
        if (!this.eI.isEmpty()) {}
        for (i = j;; i = 0)
        {
          if (i == 0) {
            break label444;
          }
          this.oaR = new TranslateAnimation(this.weT.getLeft(), this.eI.left, 0.0F, 0.0F);
          this.oaR.setInterpolator(this.el);
          this.oaR.setDuration(Math.abs(this.weT.getLeft() - this.eI.left));
          this.weT.startAnimation(this.oaR);
          this.weT.layout(this.eI.left, this.eI.top, this.eI.right, this.eI.bottom);
          this.eI.setEmpty();
          break;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\base\MMSmoothHorizontalScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
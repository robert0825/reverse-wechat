package com.tencent.mm.plugin.radar.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;

class RadarSpecialSmoothScrollView
  extends ScrollView
{
  private Rect eI;
  private RadarSpecialTableLayout oaQ;
  private TranslateAnimation oaR;
  private a oaS;
  private float ye;
  
  public RadarSpecialSmoothScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8913130881024L, 66408);
    this.eI = new Rect();
    this.oaS = new a();
    GMTrace.o(8913130881024L, 66408);
  }
  
  public boolean aZS()
  {
    GMTrace.i(8913801969664L, 66413);
    int i = this.oaQ.getMeasuredHeight();
    int j = getHeight();
    int k = getScrollY();
    if ((k == 0) || (k == i - j))
    {
      GMTrace.o(8913801969664L, 66413);
      return true;
    }
    GMTrace.o(8913801969664L, 66413);
    return false;
  }
  
  public boolean aZT()
  {
    GMTrace.i(8913667751936L, 66412);
    if (!this.eI.isEmpty())
    {
      GMTrace.o(8913667751936L, 66412);
      return true;
    }
    GMTrace.o(8913667751936L, 66412);
    return false;
  }
  
  public void adF()
  {
    GMTrace.i(8913533534208L, 66411);
    this.oaR = new TranslateAnimation(0.0F, 0.0F, this.oaQ.getTop() - this.eI.top, 0.0F);
    this.oaR.setInterpolator(this.oaS);
    this.oaR.setDuration(Math.abs(this.oaQ.getTop() - this.eI.top));
    this.oaQ.startAnimation(this.oaR);
    this.oaQ.n(this.eI.left, this.eI.top, this.eI.right, this.eI.bottom);
    this.eI.setEmpty();
    GMTrace.o(8913533534208L, 66411);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(8913265098752L, 66409);
    if (getChildCount() > 0) {
      this.oaQ = ((RadarSpecialTableLayout)getChildAt(0));
    }
    GMTrace.o(8913265098752L, 66409);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(8913399316480L, 66410);
    boolean bool;
    if (this.oaQ == null)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(8913399316480L, 66410);
      return bool;
    }
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(8913399316480L, 66410);
      return bool;
      this.ye = paramMotionEvent.getY();
      continue;
      float f = paramMotionEvent.getY();
      if (this.ye == 0.0F) {
        this.ye = f;
      }
      if (aZS())
      {
        int i = (int)(this.ye - f);
        scrollBy(0, i);
        if (this.eI.isEmpty()) {
          this.eI.set(this.oaQ.getLeft(), this.oaQ.getTop(), this.oaQ.getRight(), this.oaQ.getBottom());
        }
        this.oaQ.n(this.oaQ.getLeft(), this.oaQ.getTop() - i / 2, this.oaQ.getRight(), this.oaQ.getBottom() - i / 2);
      }
      for (;;)
      {
        this.ye = f;
        break;
        scrollBy(0, (int)(this.ye - f) / 2);
      }
      this.ye = 0.0F;
      if (aZT()) {
        adF();
      }
    }
  }
  
  private static final class a
    implements Interpolator
  {
    private float oaT;
    
    public a()
    {
      GMTrace.i(8904675164160L, 66345);
      this.oaT = 1.3F;
      GMTrace.o(8904675164160L, 66345);
    }
    
    public final float getInterpolation(float paramFloat)
    {
      GMTrace.i(8904809381888L, 66346);
      paramFloat -= 1.0F;
      float f1 = this.oaT;
      float f2 = this.oaT;
      GMTrace.o(8904809381888L, 66346);
      return (paramFloat * (f1 + 1.0F) + f2) * (paramFloat * paramFloat) + 1.0F;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\RadarSpecialSmoothScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
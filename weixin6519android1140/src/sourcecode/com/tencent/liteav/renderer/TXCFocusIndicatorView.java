package com.tencent.liteav.renderer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout.LayoutParams;

public class TXCFocusIndicatorView
  extends View
{
  private static final int FOCUS_AREA_STROKE = 1;
  private int mFocusAreaStroke = 2;
  private Runnable mHideRunnable = new Runnable()
  {
    public void run()
    {
      TXCFocusIndicatorView.this.setVisibility(8);
    }
  };
  private Paint mPaint;
  private ScaleAnimation mScaleAnimation;
  private int mSize = 0;
  
  public TXCFocusIndicatorView(Context paramContext)
  {
    super(paramContext);
    init(null, 0);
  }
  
  public TXCFocusIndicatorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramAttributeSet, 0);
  }
  
  public TXCFocusIndicatorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramAttributeSet, paramInt);
  }
  
  private void init(AttributeSet paramAttributeSet, int paramInt)
  {
    this.mPaint = new Paint();
    this.mFocusAreaStroke = ((int)(getContext().getResources().getDisplayMetrics().density * 1.0F + 0.5F));
    this.mScaleAnimation = new ScaleAnimation(1.3F, 1.0F, 1.3F, 1.0F, 1, 0.5F, 1, 0.5F);
    this.mScaleAnimation.setDuration(200L);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.save();
    Rect localRect = new Rect(0, 0, this.mSize, this.mSize);
    this.mPaint.setColor(-1);
    this.mPaint.setStyle(Paint.Style.STROKE);
    this.mPaint.setStrokeWidth(this.mFocusAreaStroke);
    paramCanvas.drawRect(localRect, this.mPaint);
    paramCanvas.restore();
    super.onDraw(paramCanvas);
  }
  
  public void show(int paramInt1, int paramInt2, int paramInt3)
  {
    removeCallbacks(this.mHideRunnable);
    this.mScaleAnimation.cancel();
    this.mSize = paramInt3;
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)getLayoutParams();
    localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
    localLayoutParams.width = this.mSize;
    localLayoutParams.height = this.mSize;
    setVisibility(0);
    requestLayout();
    this.mScaleAnimation.reset();
    startAnimation(this.mScaleAnimation);
    postDelayed(this.mHideRunnable, 1000L);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\renderer\TXCFocusIndicatorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
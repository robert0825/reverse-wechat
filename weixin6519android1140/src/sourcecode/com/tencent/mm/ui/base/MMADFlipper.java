package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;

public class MMADFlipper
  extends ViewGroup
{
  private VelocityTracker ez;
  private int hQ;
  private Context mContext;
  private int waf;
  private Interpolator wag;
  private int wah;
  private int wai;
  private boolean waj;
  private boolean wak;
  private Scroller xM;
  private float yd;
  private float ye;
  
  public MMADFlipper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3169283211264L, 23613);
    GMTrace.o(3169283211264L, 23613);
  }
  
  public MMADFlipper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3169417428992L, 23614);
    this.waf = 0;
    this.waj = false;
    this.wak = true;
    this.mContext = paramContext;
    this.wag = new LinearInterpolator();
    this.xM = new Scroller(this.mContext, this.wag);
    this.hQ = ViewConfiguration.get(this.mContext).getScaledDoubleTapSlop();
    GMTrace.o(3169417428992L, 23614);
  }
  
  private void BI(int paramInt)
  {
    GMTrace.i(3170356953088L, 23621);
    int i = Math.max(0, Math.min(paramInt, getChildCount() - 1));
    if (getScrollX() != getWidth() * i)
    {
      i = i * getWidth() - getScrollX();
      this.xM.startScroll(getScrollX(), 0, i, 0, a.Y(getContext(), Math.abs(i) * 2));
      invalidate();
    }
    w.d("MicroMsg.MMFlipper", "mCurScreen:%d, mLastScreen:%d, whichScreen:%d", new Object[] { Integer.valueOf(this.wah), Integer.valueOf(this.wai), Integer.valueOf(paramInt) });
    this.wai = paramInt;
    GMTrace.o(3170356953088L, 23621);
  }
  
  @TargetApi(14)
  private void BJ(int paramInt)
  {
    GMTrace.i(3170625388544L, 23623);
    if (Build.VERSION.SDK_INT >= 14)
    {
      setScrollX(paramInt);
      GMTrace.o(3170625388544L, 23623);
      return;
    }
    if (this.xM != null) {
      this.xM.setFinalX(paramInt);
    }
    GMTrace.o(3170625388544L, 23623);
  }
  
  private boolean bZz()
  {
    GMTrace.i(3170222735360L, 23620);
    if (getChildCount() > 1)
    {
      GMTrace.o(3170222735360L, 23620);
      return true;
    }
    GMTrace.o(3170222735360L, 23620);
    return false;
  }
  
  public void computeScroll()
  {
    GMTrace.i(3170491170816L, 23622);
    if (this.xM.computeScrollOffset())
    {
      scrollTo(this.xM.getCurrX(), this.xM.getCurrY());
      postInvalidate();
      GMTrace.o(3170491170816L, 23622);
      return;
    }
    if (this.waj)
    {
      this.waj = false;
      if (this.wah <= 0)
      {
        if (getChildCount() > 1) {}
        for (int i = getChildCount() - 2;; i = getChildCount())
        {
          this.wah = i;
          BJ(this.wah * getWidth());
          GMTrace.o(3170491170816L, 23622);
          return;
        }
      }
      if (this.wah >= getChildCount() - 1)
      {
        this.wah = 1;
        BJ(this.wah * getWidth());
      }
    }
    GMTrace.o(3170491170816L, 23622);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(3169551646720L, 23615);
    super.onFinishInflate();
    GMTrace.o(3169551646720L, 23615);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3169954299904L, 23618);
    boolean bool;
    if (!this.wak)
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      GMTrace.o(3169954299904L, 23618);
      return bool;
    }
    if (getChildCount() == 1)
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      GMTrace.o(3169954299904L, 23618);
      return bool;
    }
    int i = paramMotionEvent.getAction();
    if ((i == 2) && (this.waf != 0))
    {
      GMTrace.o(3169954299904L, 23618);
      return true;
    }
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (i)
    {
    }
    while (this.waf != 0)
    {
      GMTrace.o(3169954299904L, 23618);
      return true;
      i = (int)Math.abs(this.yd - f1);
      int j = (int)Math.abs(this.ye - f2);
      if ((i > this.hQ) && (j < this.hQ)) {}
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label218;
        }
        this.waf = 1;
        break;
      }
      label218:
      this.waf = 0;
      continue;
      this.yd = f1;
      this.ye = f2;
      if (this.xM.isFinished()) {}
      for (i = 0;; i = 1)
      {
        this.waf = i;
        break;
      }
      this.waf = 0;
    }
    GMTrace.o(3169954299904L, 23618);
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3169685864448L, 23616);
    paramInt4 = getChildCount();
    paramInt2 = 0;
    paramInt1 = 0;
    while (paramInt1 < paramInt4)
    {
      View localView = getChildAt(paramInt1);
      paramInt3 = paramInt2;
      if (localView.getVisibility() != 8)
      {
        paramInt3 = localView.getMeasuredWidth();
        localView.layout(paramInt2, 0, paramInt2 + paramInt3, localView.getMeasuredHeight());
        paramInt3 = paramInt2 + paramInt3;
      }
      paramInt1 += 1;
      paramInt2 = paramInt3;
    }
    GMTrace.o(3169685864448L, 23616);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3169820082176L, 23617);
    super.onMeasure(paramInt1, paramInt2);
    View.MeasureSpec.getSize(paramInt1);
    View.MeasureSpec.getSize(paramInt2);
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      getChildAt(i).measure(paramInt1, paramInt2);
      i += 1;
    }
    GMTrace.o(3169820082176L, 23617);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3170088517632L, 23619);
    if (getChildCount() == 1)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(3170088517632L, 23619);
      return bool;
    }
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    this.ez.addMovement(paramMotionEvent);
    int i = paramMotionEvent.getAction();
    float f = paramMotionEvent.getX();
    switch (i)
    {
    default: 
    case 0: 
    case 2: 
      for (;;)
      {
        GMTrace.o(3170088517632L, 23619);
        return true;
        if (!this.xM.isFinished()) {
          this.xM.abortAnimation();
        }
        this.yd = f;
        continue;
        i = (int)(this.yd - f);
        this.yd = f;
        scrollBy(i, 0);
      }
    }
    paramMotionEvent = this.ez;
    paramMotionEvent.computeCurrentVelocity(1000);
    i = (int)paramMotionEvent.getXVelocity();
    if (i > 600)
    {
      if (bZz())
      {
        this.wah -= 1;
        BI(this.wah);
      }
      this.waj = true;
    }
    for (;;)
    {
      if (this.ez != null)
      {
        this.ez.recycle();
        this.ez = null;
      }
      this.waf = 0;
      this.yd = 0.0F;
      this.ye = 0.0F;
      break;
      if (i < 64936)
      {
        if (bZz())
        {
          this.wah += 1;
          BI(this.wah);
        }
        this.waj = true;
      }
      else
      {
        i = getWidth();
        BI((getScrollX() + i / 2) / i);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\MMADFlipper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
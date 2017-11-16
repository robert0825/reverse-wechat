package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class MMFlipper
  extends ViewGroup
{
  private Interpolator el;
  private VelocityTracker ez;
  private int hQ;
  private int waf;
  protected int wah;
  protected int wai;
  public boolean wak;
  protected int wbF;
  private int wbG;
  private boolean wbH;
  public b wbI;
  public a wbJ;
  int wbK;
  int wbL;
  private Scroller xM;
  private float yd;
  private float ye;
  
  public MMFlipper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3178410016768L, 23681);
    init(paramContext);
    GMTrace.o(3178410016768L, 23681);
  }
  
  public MMFlipper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3178544234496L, 23682);
    this.wbG = 0;
    this.waf = 0;
    this.wbH = false;
    this.wak = true;
    this.wbK = -123454321;
    this.wbL = -123454321;
    init(paramContext);
    GMTrace.o(3178544234496L, 23682);
  }
  
  private void BI(int paramInt)
  {
    GMTrace.i(3179081105408L, 23686);
    paramInt = Math.max(0, Math.min(paramInt, getChildCount() - 1));
    if (getScrollX() != getWidth() * paramInt)
    {
      int i = getWidth() * paramInt - getScrollX();
      this.xM.startScroll(getScrollX(), 0, i, 0, a.Y(getContext(), (int)(Math.abs(i) * 1.3F)));
      if (this.wah != paramInt)
      {
        this.wbH = true;
        this.wbF += paramInt - this.wah;
      }
      this.wai = this.wah;
      this.wah = paramInt;
      invalidate();
    }
    GMTrace.o(3179081105408L, 23686);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(3178678452224L, 23683);
    this.el = new c();
    this.xM = new Scroller(paramContext, this.el);
    this.wai = -1;
    int i = this.wbG;
    this.wah = i;
    this.wbF = i;
    this.hQ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    GMTrace.o(3178678452224L, 23683);
  }
  
  public final void BW(int paramInt)
  {
    GMTrace.i(3179215323136L, 23687);
    paramInt = Math.max(0, Math.min(paramInt, getChildCount() - 1));
    this.wbH = false;
    if (!this.xM.isFinished()) {
      this.xM.abortAnimation();
    }
    this.wai = this.wah;
    this.wah = paramInt;
    scrollTo(paramInt * getWidth(), 0);
    GMTrace.o(3179215323136L, 23687);
  }
  
  public final void BX(int paramInt)
  {
    GMTrace.i(3179349540864L, 23688);
    this.wbF = paramInt;
    GMTrace.o(3179349540864L, 23688);
  }
  
  public final void BY(int paramInt)
  {
    GMTrace.i(3179483758592L, 23689);
    paramInt = Math.max(0, Math.min(paramInt, getChildCount() - 1));
    this.wbH = false;
    if (!this.xM.isFinished()) {
      this.xM.abortAnimation();
    }
    if (this.wbI != null) {
      this.wbI.tz(paramInt);
    }
    this.wai = this.wah;
    this.wah = paramInt;
    this.wbF = paramInt;
    scrollTo(paramInt * getWidth(), 0);
    GMTrace.o(3179483758592L, 23689);
  }
  
  public final int bZI()
  {
    GMTrace.i(3179617976320L, 23690);
    w.d("MicroMsg.MMFlipper", "cur screen is %d", new Object[] { Integer.valueOf(this.wah) });
    int i = this.wah;
    GMTrace.o(3179617976320L, 23690);
    return i;
  }
  
  public void computeScroll()
  {
    GMTrace.i(3179752194048L, 23691);
    this.xM.getCurrX();
    if (this.xM.computeScrollOffset())
    {
      scrollTo(this.xM.getCurrX(), this.xM.getCurrY());
      postInvalidate();
      GMTrace.o(3179752194048L, 23691);
      return;
    }
    if (this.wbH)
    {
      this.wbH = false;
      if (this.wbI != null) {
        this.wbI.tz(this.wbF);
      }
    }
    GMTrace.o(3179752194048L, 23691);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3180020629504L, 23693);
    boolean bool;
    if (!this.wak)
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      GMTrace.o(3180020629504L, 23693);
      return bool;
    }
    if (getChildCount() == 1)
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      GMTrace.o(3180020629504L, 23693);
      return bool;
    }
    int i = paramMotionEvent.getAction();
    if ((i == 2) && (this.waf != 0))
    {
      GMTrace.o(3180020629504L, 23693);
      return true;
    }
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (i)
    {
    }
    while (this.waf != 0)
    {
      GMTrace.o(3180020629504L, 23693);
      return true;
      i = (int)Math.abs(this.yd - f1);
      int j = (int)Math.abs(this.ye - f2);
      w.v("MicroMsg.MMFlipper", "xDif = " + i + ", yDif = " + j);
      if ((i > this.hQ) && (j < this.hQ)) {}
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label250;
        }
        this.waf = 1;
        break;
      }
      label250:
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
    GMTrace.o(3180020629504L, 23693);
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3178812669952L, 23684);
    long l = bg.Pw();
    int m = getChildCount();
    int j = 0;
    int i = 0;
    while (i < m)
    {
      View localView = getChildAt(i);
      int k = j;
      if (localView.getVisibility() != 8)
      {
        k = localView.getMeasuredWidth();
        w.v("MicroMsg.MMFlipper", "flipper onLayout childWidth:" + k);
        localView.layout(j, 0, j + k, localView.getMeasuredHeight());
        k = j + k;
      }
      i += 1;
      j = k;
    }
    w.v("MicroMsg.MMFlipper", "use " + bg.aI(l) + " ms, flipper onLayout changed:" + paramBoolean + " Left,Top,Right,Bottom:" + paramInt1 + "," + paramInt2 + "," + paramInt3 + "," + paramInt4);
    GMTrace.o(3178812669952L, 23684);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3178946887680L, 23685);
    long l = bg.Pw();
    super.onMeasure(paramInt1, paramInt2);
    int j = View.MeasureSpec.getSize(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt2);
    if (this.wbJ != null) {
      this.wbJ.cQ(j, i);
    }
    this.wbK = j;
    this.wbL = i;
    int k = getChildCount();
    i = 0;
    while (i < k)
    {
      getChildAt(i).measure(paramInt1, paramInt2);
      i += 1;
    }
    scrollTo(this.wah * j, 0);
    w.v("MicroMsg.MMFlipper", "flipper onMeasure:" + j + "," + View.MeasureSpec.getSize(paramInt2) + " childCount:" + k + ", use " + bg.aI(l));
    GMTrace.o(3178946887680L, 23685);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3179886411776L, 23692);
    if (getChildCount() == 1)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(3179886411776L, 23692);
      return bool;
    }
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    this.ez.addMovement(paramMotionEvent);
    int i = paramMotionEvent.getAction();
    float f = paramMotionEvent.getX();
    paramMotionEvent.getY();
    switch (i)
    {
    default: 
    case 0: 
    case 2: 
      for (;;)
      {
        GMTrace.o(3179886411776L, 23692);
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
    if ((i > 600) && (this.wah > 0)) {
      BI(this.wah - 1);
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
      if ((i < 64936) && (this.wah < getChildCount() - 1))
      {
        BI(this.wah + 1);
      }
      else
      {
        i = getWidth();
        BI((getScrollX() + i / 2) / i);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void cQ(int paramInt1, int paramInt2);
  }
  
  public static abstract interface b
  {
    public abstract void tz(int paramInt);
  }
  
  private static final class c
    implements Interpolator
  {
    private float oaT;
    
    public c()
    {
      GMTrace.i(3186597298176L, 23742);
      this.oaT = 1.3F;
      this.oaT = 0.0F;
      GMTrace.o(3186597298176L, 23742);
    }
    
    public final float getInterpolation(float paramFloat)
    {
      GMTrace.i(3186731515904L, 23743);
      paramFloat -= 1.0F;
      GMTrace.o(3186731515904L, 23743);
      return paramFloat * (paramFloat * paramFloat) + 1.0F;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMFlipper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
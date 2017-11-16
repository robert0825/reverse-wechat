package com.tencent.mm.plugin.luckymoney.particles;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.luckymoney.particles.a.b;
import com.tencent.mm.plugin.wxpay.a.d;
import java.util.Iterator;
import java.util.List;

public class ConfettiView
  extends View
  implements View.OnLayoutChangeListener
{
  List<b> mKq;
  boolean mLa;
  private boolean mLb;
  private b mLc;
  
  public ConfettiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9913589825536L, 73862);
    GMTrace.o(9913589825536L, 73862);
  }
  
  public static ConfettiView cM(Context paramContext)
  {
    GMTrace.i(9913455607808L, 73861);
    ConfettiView localConfettiView = new ConfettiView(paramContext, null);
    localConfettiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    if (Build.VERSION.SDK_INT >= 21) {
      localConfettiView.setElevation(paramContext.getResources().getDimensionPixelOffset(a.d.snh));
    }
    GMTrace.o(9913455607808L, 73861);
    return localConfettiView;
  }
  
  public final void aMn()
  {
    GMTrace.i(9913724043264L, 73863);
    if (!this.mLa)
    {
      this.mLa = true;
      getParent().requestLayout();
    }
    GMTrace.o(9913724043264L, 73863);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(9913858260992L, 73864);
    super.onAttachedToWindow();
    ViewGroup localViewGroup = (ViewGroup)getParent();
    localViewGroup.removeOnLayoutChangeListener(this);
    localViewGroup.addOnLayoutChangeListener(this);
    if (this.mKq == null) {
      aMn();
    }
    GMTrace.o(9913858260992L, 73864);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(9914126696448L, 73866);
    super.onDraw(paramCanvas);
    if (!this.mLa)
    {
      paramCanvas.save();
      Iterator localIterator = this.mKq.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (localb.mLz) {
          localb.a(paramCanvas, localb.mLB + localb.mLD, localb.mLC + localb.mLE, localb.mLx);
        } else if ((localb.mLy) && (!localb.mLa)) {
          localb.a(paramCanvas, localb.mLv, localb.mLw, localb.mLx);
        }
      }
      paramCanvas.restore();
    }
    GMTrace.o(9914126696448L, 73866);
  }
  
  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    GMTrace.i(9913992478720L, 73865);
    if (this.mLa)
    {
      paramView = getParent();
      if ((paramView != null) && ((paramView instanceof ViewGroup)))
      {
        paramView = (ViewGroup)paramView;
        paramView.removeViewInLayout(this);
        paramView.removeOnLayoutChangeListener(this);
        paramView.invalidate();
      }
    }
    GMTrace.o(9913992478720L, 73865);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(9914260914176L, 73867);
    if (this.mLb) {}
    int i;
    switch (paramMotionEvent.getAction())
    {
    default: 
      i = 0;
    }
    for (;;)
    {
      if ((i == 0) && (!super.onTouchEvent(paramMotionEvent))) {
        break label462;
      }
      GMTrace.o(9914260914176L, 73867);
      return true;
      Object localObject = this.mKq.iterator();
      label174:
      label264:
      label268:
      for (;;)
      {
        if (!((Iterator)localObject).hasNext()) {
          break label270;
        }
        b localb = (b)((Iterator)localObject).next();
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        if ((localb.mLv <= f1) && (f1 <= localb.mLv + localb.getWidth()) && (localb.mLw <= f2) && (f2 <= localb.mLw + localb.getHeight()))
        {
          i = 1;
          if (i == 0) {
            break label264;
          }
          localb.mLz = true;
          localb.mLB = f1;
          localb.mLC = f2;
          localb.mLD = (localb.mLv - f1);
          localb.mLE = (localb.mLw - f2);
          localb.mLA = VelocityTracker.obtain();
          localb.mLA.addMovement(paramMotionEvent);
        }
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label268;
          }
          this.mLc = localb;
          i = 1;
          break;
          i = 0;
          break label174;
        }
      }
      label270:
      i = 0;
      continue;
      if (this.mLc == null) {
        break;
      }
      localObject = this.mLc;
      ((b)localObject).mLB = paramMotionEvent.getX();
      ((b)localObject).mLC = paramMotionEvent.getY();
      ((b)localObject).mLA.addMovement(paramMotionEvent);
      i = 1;
      continue;
      if (this.mLc == null) {
        break;
      }
      localObject = this.mLc;
      ((b)localObject).mLA.addMovement(paramMotionEvent);
      ((b)localObject).mLA.computeCurrentVelocity(1);
      ((b)localObject).mLj = -1L;
      ((b)localObject).mLk = (paramMotionEvent.getX() + ((b)localObject).mLD);
      ((b)localObject).mLl = (paramMotionEvent.getY() + ((b)localObject).mLE);
      ((b)localObject).mLm = ((b)localObject).mLA.getXVelocity();
      ((b)localObject).mLn = ((b)localObject).mLA.getYVelocity();
      ((b)localObject).mLq = ((b)localObject).mLx;
      ((b)localObject).mLA.recycle();
      ((b)localObject).g(((b)localObject).mKx);
      ((b)localObject).mLz = false;
      this.mLc = null;
      i = 1;
    }
    label462:
    GMTrace.o(9914260914176L, 73867);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\particles\ConfettiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
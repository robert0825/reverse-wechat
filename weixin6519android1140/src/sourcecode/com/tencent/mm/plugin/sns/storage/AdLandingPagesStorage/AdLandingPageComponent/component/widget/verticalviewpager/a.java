package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.os.SystemClock;
import android.support.v4.view.u;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

public final class a
  implements View.OnTouchListener
{
  private float iTi;
  private DummyViewPager pKj;
  private float pKk;
  
  public a(DummyViewPager paramDummyViewPager)
  {
    GMTrace.i(17111955013632L, 127494);
    this.pKk = Float.MIN_VALUE;
    this.iTi = Float.MIN_VALUE;
    this.pKj = paramDummyViewPager;
    GMTrace.o(17111955013632L, 127494);
  }
  
  private boolean a(View paramView, MotionEvent paramMotionEvent, float paramFloat)
  {
    GMTrace.i(17112223449088L, 127496);
    float f1;
    float f2;
    int i;
    if (this.pKj.yj)
    {
      f1 = (int)(this.pKj.getScrollX() - paramFloat) - this.pKj.blj();
      f2 = this.pKj.getScrollX() - this.pKj.blj();
      if (Math.abs(f1 + f2) < Math.abs(f1 - f2))
      {
        i = 1;
        if (i == 0) {
          break label468;
        }
      }
    }
    label468:
    for (float f3 = this.pKj.getScrollX() - this.pKj.blj();; f3 = paramFloat)
    {
      DummyViewPager localDummyViewPager = this.pKj;
      if (!localDummyViewPager.yj)
      {
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        i = 0;
        break;
      }
      localDummyViewPager.yd += f3;
      float f4 = localDummyViewPager.getScrollX() - f3;
      i = localDummyViewPager.bO();
      f1 = i;
      float f6 = localDummyViewPager.xT;
      f2 = i;
      float f5 = localDummyViewPager.xU;
      Object localObject = (AdLandingViewPager.b)localDummyViewPager.dw.get(0);
      AdLandingViewPager.b localb = (AdLandingViewPager.b)localDummyViewPager.dw.get(localDummyViewPager.dw.size() - 1);
      if (((AdLandingViewPager.b)localObject).position != 0) {}
      for (f1 = ((AdLandingViewPager.b)localObject).yD * i;; f1 *= f6)
      {
        if (localb.position != localDummyViewPager.xH.getCount() - 1) {}
        for (f2 = localb.yD * i;; f2 *= f5)
        {
          if (f4 < f1) {}
          for (;;)
          {
            localDummyViewPager.yd += f1 - (int)f1;
            localDummyViewPager.scrollTo((int)f1, localDummyViewPager.getScrollY());
            localDummyViewPager.ab((int)f1);
            long l = SystemClock.uptimeMillis();
            localObject = MotionEvent.obtain(localDummyViewPager.pKa, l, 2, localDummyViewPager.yd, 0.0F, 0);
            localDummyViewPager.ez.addMovement((MotionEvent)localObject);
            ((MotionEvent)localObject).recycle();
            new StringBuilder("fake drag, diff ").append(paramFloat).append(",step ").append(f3).append(",scrollX ").append(this.pKj.getScrollX());
            c(paramView, paramMotionEvent);
            GMTrace.o(17112223449088L, 127496);
            return true;
            if (f4 > f2)
            {
              f1 = f2;
              continue;
              GMTrace.o(17112223449088L, 127496);
              return false;
            }
            else
            {
              f1 = f4;
            }
          }
        }
      }
    }
  }
  
  private static void c(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(17112357666816L, 127497);
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(0);
    paramView.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(17112357666816L, 127497);
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(17112089231360L, 127495);
    new StringBuilder("onTouchEvent , action ").append(paramMotionEvent.getAction()).append(", e.rawY ").append(paramMotionEvent.getRawY()).append(",lastMotionY ").append(this.pKk).append(",downY ").append(this.iTi);
    label272:
    int i;
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
    case 2: 
      for (;;)
      {
        boolean bool = paramView.onTouchEvent(paramMotionEvent);
        GMTrace.o(17112089231360L, 127495);
        return bool;
        this.iTi = paramMotionEvent.getRawY();
        continue;
        if ((this.iTi != Float.MIN_VALUE) || (this.pKk != Float.MIN_VALUE)) {
          break;
        }
        this.iTi = paramMotionEvent.getRawY();
      }
      float f2 = paramMotionEvent.getRawY();
      if (this.pKk == Float.MIN_VALUE) {}
      for (float f1 = this.iTi;; f1 = this.pKk)
      {
        this.pKk = paramMotionEvent.getRawY();
        f1 = (f2 - f1) / 2.0F;
        new StringBuilder("scrollX ").append(this.pKj.getScrollX()).append(",basescrollX ").append(this.pKj.blj());
        if (this.pKj.getScrollX() == this.pKj.blj()) {
          break label272;
        }
        if (!a(paramView, paramMotionEvent, f1)) {
          break;
        }
        GMTrace.o(17112089231360L, 127495);
        return false;
      }
      if (-f1 > 0.0F) {}
      for (i = 1;; i = -1)
      {
        if (!z.h(paramView, i)) {
          break label326;
        }
        new StringBuilder("scroll vertically  ").append(f1).append(", move.lastMotionY ").append(paramMotionEvent.getY());
        break;
      }
      label326:
      this.pKj.bli();
      a(paramView, paramMotionEvent, f1);
      c(paramView, paramMotionEvent);
      GMTrace.o(17112089231360L, 127495);
      return false;
    }
    if (this.pKj.yj) {
      try
      {
        DummyViewPager localDummyViewPager = this.pKj;
        if (!localDummyViewPager.yj) {
          throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
      }
      catch (Exception localException) {}
    }
    for (;;)
    {
      this.iTi = Float.MIN_VALUE;
      this.pKk = Float.MIN_VALUE;
      break;
      Object localObject = localException.ez;
      ((VelocityTracker)localObject).computeCurrentVelocity(1000, localException.yg);
      i = (int)y.a((VelocityTracker)localObject, localException.eA);
      localException.xY = true;
      int j = localException.bO();
      int k = localException.getScrollX();
      localObject = localException.blh();
      localException.a(localException.a(((AdLandingViewPager.b)localObject).position, (k / j - ((AdLandingViewPager.b)localObject).yD) / ((AdLandingViewPager.b)localObject).yC, i, (int)(localException.yd - localException.wS)), true, true, i);
      localException.cy();
      localException.yj = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\widget\verticalviewpager\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
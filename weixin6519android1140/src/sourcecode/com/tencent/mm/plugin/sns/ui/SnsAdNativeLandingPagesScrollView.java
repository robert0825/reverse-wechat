package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class SnsAdNativeLandingPagesScrollView
  extends NestedScrollView
{
  private int pWN;
  private int pWO;
  private int pWP;
  private an pWQ;
  private long pWR;
  private Runnable pWS;
  
  public SnsAdNativeLandingPagesScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8476252176384L, 63153);
    this.pWN = 0;
    this.pWO = 0;
    this.pWP = 50;
    this.pWQ = null;
    this.pWR = System.currentTimeMillis();
    this.pWS = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8368341123072L, 62349);
        int i = SnsAdNativeLandingPagesScrollView.this.getScrollY();
        w.w("SnsAdNativeLandingPagesScrollView", "1 middlePos %d, newPos %d", new Object[] { Integer.valueOf(SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this)), Integer.valueOf(i) });
        if (i != SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this))
        {
          if (SnsAdNativeLandingPagesScrollView.b(SnsAdNativeLandingPagesScrollView.this) != null)
          {
            SnsAdNativeLandingPagesScrollView.b(SnsAdNativeLandingPagesScrollView.this);
            SnsAdNativeLandingPagesScrollView.c(SnsAdNativeLandingPagesScrollView.this);
          }
          SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this, System.currentTimeMillis());
        }
        if (SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this) - i == 0)
        {
          if (SnsAdNativeLandingPagesScrollView.b(SnsAdNativeLandingPagesScrollView.this) != null)
          {
            SnsAdNativeLandingPagesScrollView.b(SnsAdNativeLandingPagesScrollView.this);
            SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this);
            SnsAdNativeLandingPagesScrollView.c(SnsAdNativeLandingPagesScrollView.this);
          }
          SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this, SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this));
        }
        SnsAdNativeLandingPagesScrollView.b(SnsAdNativeLandingPagesScrollView.this, SnsAdNativeLandingPagesScrollView.this.getScrollY());
        w.w("SnsAdNativeLandingPagesScrollView", "2 middlePos %d, newPos %d", new Object[] { Integer.valueOf(SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this)), Integer.valueOf(i) });
        SnsAdNativeLandingPagesScrollView.this.postDelayed(SnsAdNativeLandingPagesScrollView.d(SnsAdNativeLandingPagesScrollView.this), SnsAdNativeLandingPagesScrollView.e(SnsAdNativeLandingPagesScrollView.this));
        GMTrace.o(8368341123072L, 62349);
      }
    };
    GMTrace.o(8476252176384L, 63153);
  }
  
  public SnsAdNativeLandingPagesScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8476117958656L, 63152);
    this.pWN = 0;
    this.pWO = 0;
    this.pWP = 50;
    this.pWQ = null;
    this.pWR = System.currentTimeMillis();
    this.pWS = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8368341123072L, 62349);
        int i = SnsAdNativeLandingPagesScrollView.this.getScrollY();
        w.w("SnsAdNativeLandingPagesScrollView", "1 middlePos %d, newPos %d", new Object[] { Integer.valueOf(SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this)), Integer.valueOf(i) });
        if (i != SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this))
        {
          if (SnsAdNativeLandingPagesScrollView.b(SnsAdNativeLandingPagesScrollView.this) != null)
          {
            SnsAdNativeLandingPagesScrollView.b(SnsAdNativeLandingPagesScrollView.this);
            SnsAdNativeLandingPagesScrollView.c(SnsAdNativeLandingPagesScrollView.this);
          }
          SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this, System.currentTimeMillis());
        }
        if (SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this) - i == 0)
        {
          if (SnsAdNativeLandingPagesScrollView.b(SnsAdNativeLandingPagesScrollView.this) != null)
          {
            SnsAdNativeLandingPagesScrollView.b(SnsAdNativeLandingPagesScrollView.this);
            SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this);
            SnsAdNativeLandingPagesScrollView.c(SnsAdNativeLandingPagesScrollView.this);
          }
          SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this, SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this));
        }
        SnsAdNativeLandingPagesScrollView.b(SnsAdNativeLandingPagesScrollView.this, SnsAdNativeLandingPagesScrollView.this.getScrollY());
        w.w("SnsAdNativeLandingPagesScrollView", "2 middlePos %d, newPos %d", new Object[] { Integer.valueOf(SnsAdNativeLandingPagesScrollView.a(SnsAdNativeLandingPagesScrollView.this)), Integer.valueOf(i) });
        SnsAdNativeLandingPagesScrollView.this.postDelayed(SnsAdNativeLandingPagesScrollView.d(SnsAdNativeLandingPagesScrollView.this), SnsAdNativeLandingPagesScrollView.e(SnsAdNativeLandingPagesScrollView.this));
        GMTrace.o(8368341123072L, 62349);
      }
    };
    GMTrace.o(8476117958656L, 63152);
  }
  
  public final void fling(int paramInt)
  {
    GMTrace.i(8476923265024L, 63158);
    super.fling(paramInt / 3);
    GMTrace.o(8476923265024L, 63158);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(8477057482752L, 63159);
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    GMTrace.o(8477057482752L, 63159);
    return bool;
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8476520611840L, 63155);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    w.w("SnsAdNativeLandingPagesScrollView", "onScrollChanged x %d,y %d,oldx %d,oldy %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    GMTrace.o(8476520611840L, 63155);
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    GMTrace.i(8476789047296L, 63157);
    super.scrollBy(paramInt1, paramInt2);
    GMTrace.o(8476789047296L, 63157);
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    GMTrace.i(8476654829568L, 63156);
    super.scrollTo(paramInt1, paramInt2);
    GMTrace.o(8476654829568L, 63156);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsAdNativeLandingPagesScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.o;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v4.widget.q;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

abstract class HeaderBehavior<V extends View>
  extends ViewOffsetBehavior<V>
{
  private int eA = -1;
  private VelocityTracker ez;
  private Runnable hM;
  public q hN;
  private boolean hO;
  private int hP;
  private int hQ = -1;
  
  public HeaderBehavior() {}
  
  public HeaderBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void ae()
  {
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
  }
  
  int H()
  {
    return I();
  }
  
  int a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3)
  {
    int k = I();
    int j = 0;
    int i = j;
    if (paramInt2 != 0)
    {
      i = j;
      if (k >= paramInt2)
      {
        i = j;
        if (k <= paramInt3)
        {
          paramInt1 = n.b(paramInt1, paramInt2, paramInt3);
          i = j;
          if (k != paramInt1)
          {
            f(paramInt1);
            i = k - paramInt1;
          }
        }
      }
    }
    return i;
  }
  
  void a(CoordinatorLayout paramCoordinatorLayout, V paramV) {}
  
  final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt, float paramFloat)
  {
    if (this.hM != null)
    {
      paramV.removeCallbacks(this.hM);
      this.hM = null;
    }
    if (this.hN == null) {
      this.hN = q.a(paramV.getContext(), null);
    }
    this.hN.a(I(), 0, Math.round(paramFloat), 0, 0, paramInt, 0);
    if (this.hN.computeScrollOffset())
    {
      this.hM = new a(paramCoordinatorLayout, paramV);
      z.a(paramV, this.hM);
      return true;
    }
    a(paramCoordinatorLayout, paramV);
    return false;
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (this.hQ < 0) {
      this.hQ = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop();
    }
    if ((paramMotionEvent.getAction() == 2) && (this.hO)) {
      return true;
    }
    switch (o.d(paramMotionEvent))
    {
    }
    for (;;)
    {
      if (this.ez != null) {
        this.ez.addMovement(paramMotionEvent);
      }
      return this.hO;
      this.hO = false;
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      if ((d(paramV)) && (paramCoordinatorLayout.b(paramV, i, j)))
      {
        this.hP = j;
        this.eA = o.c(paramMotionEvent, 0);
        ae();
        continue;
        i = this.eA;
        if (i != -1)
        {
          i = o.b(paramMotionEvent, i);
          if (i != -1)
          {
            i = (int)o.e(paramMotionEvent, i);
            if (Math.abs(i - this.hP) > this.hQ)
            {
              this.hO = true;
              this.hP = i;
              continue;
              this.hO = false;
              this.eA = -1;
              if (this.ez != null)
              {
                this.ez.recycle();
                this.ez = null;
              }
            }
          }
        }
      }
    }
  }
  
  final int b(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramCoordinatorLayout, paramV, H() - paramInt1, paramInt2, paramInt3);
  }
  
  int b(V paramV)
  {
    return paramV.getHeight();
  }
  
  public final boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    if (this.hQ < 0) {
      this.hQ = ViewConfiguration.get(paramCoordinatorLayout.getContext()).getScaledTouchSlop();
    }
    switch (o.d(paramMotionEvent))
    {
    }
    for (;;)
    {
      if (this.ez != null) {
        this.ez.addMovement(paramMotionEvent);
      }
      boolean bool1 = true;
      do
      {
        do
        {
          do
          {
            return bool1;
            i = (int)paramMotionEvent.getX();
            j = (int)paramMotionEvent.getY();
            bool1 = bool2;
          } while (!paramCoordinatorLayout.b(paramV, i, j));
          bool1 = bool2;
        } while (!d(paramV));
        this.hP = j;
        this.eA = o.c(paramMotionEvent, 0);
        ae();
        break;
        i = o.b(paramMotionEvent, this.eA);
        bool1 = bool2;
      } while (i == -1);
      int k = (int)o.e(paramMotionEvent, i);
      int j = this.hP - k;
      int i = j;
      if (!this.hO)
      {
        i = j;
        if (Math.abs(j) > this.hQ)
        {
          this.hO = true;
          if (j <= 0) {
            break label260;
          }
        }
      }
      label260:
      for (i = j - this.hQ; this.hO; i = j + this.hQ)
      {
        this.hP = k;
        b(paramCoordinatorLayout, paramV, i, c(paramV), 0);
        break;
      }
      if (this.ez != null)
      {
        this.ez.addMovement(paramMotionEvent);
        this.ez.computeCurrentVelocity(1000);
        float f = y.b(this.ez, this.eA);
        a(paramCoordinatorLayout, paramV, -b(paramV), f);
      }
      this.hO = false;
      this.eA = -1;
      if (this.ez != null)
      {
        this.ez.recycle();
        this.ez = null;
      }
    }
  }
  
  final int c(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    return a(paramCoordinatorLayout, paramV, paramInt, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  
  int c(V paramV)
  {
    return -paramV.getHeight();
  }
  
  boolean d(V paramV)
  {
    return false;
  }
  
  private final class a
    implements Runnable
  {
    private final CoordinatorLayout hR;
    private final V hS;
    
    a(V paramV)
    {
      this.hR = paramV;
      View localView;
      this.hS = localView;
    }
    
    public final void run()
    {
      if ((this.hS != null) && (HeaderBehavior.this.hN != null))
      {
        if (HeaderBehavior.this.hN.computeScrollOffset())
        {
          HeaderBehavior.this.c(this.hR, this.hS, HeaderBehavior.this.hN.getCurrY());
          z.a(this.hS, this);
        }
      }
      else {
        return;
      }
      HeaderBehavior.this.a(this.hR, this.hS);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\HeaderBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
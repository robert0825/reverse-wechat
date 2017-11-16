package android.support.design.widget;

import android.support.v4.view.o;
import android.support.v4.view.z;
import android.support.v4.widget.u;
import android.support.v4.widget.u.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public class s<V extends View>
  extends CoordinatorLayout.Behavior<V>
{
  private final u.a eD = new u.a()
  {
    private int eA = -1;
    private int ja;
    
    public final void a(View paramAnonymousView, float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      boolean bool = true;
      this.eA = -1;
      int j = paramAnonymousView.getWidth();
      int i;
      if (paramAnonymousFloat1 != 0.0F) {
        if (z.J(paramAnonymousView) == 1)
        {
          i = 1;
          if (s.this.iW != 2) {
            break label114;
          }
          i = 1;
          label45:
          if (i == 0) {
            break label290;
          }
          if (paramAnonymousView.getLeft() >= this.ja) {
            break label278;
          }
          i = this.ja - j;
          label70:
          if (!s.this.er.p(i, paramAnonymousView.getTop())) {
            break label302;
          }
          z.a(paramAnonymousView, new s.b(s.this, paramAnonymousView, bool));
        }
      }
      label114:
      label278:
      label290:
      label302:
      while ((!bool) || (s.this.iT == null))
      {
        return;
        i = 0;
        break;
        if (s.this.iW == 0)
        {
          if (i != 0)
          {
            if (paramAnonymousFloat1 < 0.0F)
            {
              i = 1;
              break label45;
            }
            i = 0;
            break label45;
          }
          if (paramAnonymousFloat1 > 0.0F)
          {
            i = 1;
            break label45;
          }
          i = 0;
          break label45;
        }
        if (s.this.iW == 1)
        {
          if (i != 0)
          {
            if (paramAnonymousFloat1 > 0.0F)
            {
              i = 1;
              break label45;
            }
            i = 0;
            break label45;
          }
          if (paramAnonymousFloat1 < 0.0F)
          {
            i = 1;
            break label45;
          }
          i = 0;
          break label45;
          i = paramAnonymousView.getLeft();
          int k = this.ja;
          int m = Math.round(paramAnonymousView.getWidth() * s.this.iX);
          if (Math.abs(i - k) >= m)
          {
            i = 1;
            break label45;
          }
          i = 0;
          break label45;
        }
        i = 0;
        break label45;
        i = this.ja + j;
        break label70;
        i = this.ja;
        bool = false;
        break label70;
      }
      s.this.iT.onDismiss(paramAnonymousView);
    }
    
    public final void a(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      float f1 = this.ja + paramAnonymousView.getWidth() * s.this.iY;
      float f2 = this.ja + paramAnonymousView.getWidth() * s.this.iZ;
      if (paramAnonymousInt1 <= f1)
      {
        z.d(paramAnonymousView, 1.0F);
        return;
      }
      if (paramAnonymousInt1 >= f2)
      {
        z.d(paramAnonymousView, 0.0F);
        return;
      }
      z.d(paramAnonymousView, s.l(1.0F - s.c(f1, f2, paramAnonymousInt1)));
    }
    
    public final boolean b(View paramAnonymousView, int paramAnonymousInt)
    {
      return (this.eA == -1) && (s.this.r(paramAnonymousView));
    }
    
    public final int c(View paramAnonymousView, int paramAnonymousInt)
    {
      return paramAnonymousView.getTop();
    }
    
    public final int d(View paramAnonymousView, int paramAnonymousInt)
    {
      int i;
      int j;
      if (z.J(paramAnonymousView) == 1)
      {
        i = 1;
        if (s.this.iW != 0) {
          break label72;
        }
        if (i == 0) {
          break label53;
        }
        i = this.ja - paramAnonymousView.getWidth();
        j = this.ja;
      }
      for (;;)
      {
        return s.clamp(i, paramAnonymousInt, j);
        i = 0;
        break;
        label53:
        i = this.ja;
        j = this.ja + paramAnonymousView.getWidth();
        continue;
        label72:
        if (s.this.iW == 1)
        {
          if (i != 0)
          {
            i = this.ja;
            j = this.ja + paramAnonymousView.getWidth();
          }
          else
          {
            i = this.ja - paramAnonymousView.getWidth();
            j = this.ja;
          }
        }
        else
        {
          i = this.ja - paramAnonymousView.getWidth();
          j = this.ja + paramAnonymousView.getWidth();
        }
      }
    }
    
    public final void f(View paramAnonymousView, int paramAnonymousInt)
    {
      this.eA = paramAnonymousInt;
      this.ja = paramAnonymousView.getLeft();
      paramAnonymousView = paramAnonymousView.getParent();
      if (paramAnonymousView != null) {
        paramAnonymousView.requestDisallowInterceptTouchEvent(true);
      }
    }
    
    public final void j(int paramAnonymousInt)
    {
      if (s.this.iT != null) {
        s.this.iT.w(paramAnonymousInt);
      }
    }
    
    public final int s(View paramAnonymousView)
    {
      return paramAnonymousView.getWidth();
    }
  };
  public u er;
  private boolean es;
  public a iT;
  private float iU = 0.0F;
  private boolean iV;
  public int iW = 2;
  public float iX = 0.5F;
  public float iY = 0.0F;
  public float iZ = 0.5F;
  
  static float c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat3 - paramFloat1) / (paramFloat2 - paramFloat1);
  }
  
  public static int clamp(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.min(Math.max(paramInt1, paramInt2), paramInt3);
  }
  
  public static float l(float paramFloat)
  {
    return Math.min(Math.max(0.0F, paramFloat), 1.0F);
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    switch (o.d(paramMotionEvent))
    {
    case 2: 
    default: 
      if (paramCoordinatorLayout.b(paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
        break;
      }
    }
    for (boolean bool = true;; bool = false)
    {
      this.es = bool;
      do
      {
        if (!this.es) {
          break;
        }
        return false;
      } while (!this.es);
      this.es = false;
      return false;
    }
    if (this.er == null) {
      if (!this.iV) {
        break label129;
      }
    }
    label129:
    for (paramCoordinatorLayout = u.a(paramCoordinatorLayout, this.iU, this.eD);; paramCoordinatorLayout = u.a(paramCoordinatorLayout, this.eD))
    {
      this.er = paramCoordinatorLayout;
      return this.er.j(paramMotionEvent);
    }
  }
  
  public final boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (this.er != null)
    {
      this.er.k(paramMotionEvent);
      return true;
    }
    return false;
  }
  
  public boolean r(View paramView)
  {
    return true;
  }
  
  public static abstract interface a
  {
    public abstract void onDismiss(View paramView);
    
    public abstract void w(int paramInt);
  }
  
  private final class b
    implements Runnable
  {
    private final boolean jc;
    private final View mView;
    
    b(View paramView, boolean paramBoolean)
    {
      this.mView = paramView;
      this.jc = paramBoolean;
    }
    
    public final void run()
    {
      if ((s.this.er != null) && (s.this.er.cG())) {
        z.a(this.mView, this);
      }
      while ((!this.jc) || (s.this.iT == null)) {
        return;
      }
      s.this.iT.onDismiss(this.mView);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
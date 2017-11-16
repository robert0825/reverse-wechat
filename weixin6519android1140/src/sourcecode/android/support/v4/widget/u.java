package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.o;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

public final class u
{
  private static final Interpolator xF = new Interpolator()
  {
    public final float getInterpolation(float paramAnonymousFloat)
    {
      paramAnonymousFloat -= 1.0F;
      return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
    }
  };
  int DZ;
  float[] Ea;
  float[] Eb;
  float[] Ec;
  float[] Ed;
  private int[] Ee;
  private int[] Ef;
  private int[] Eg;
  private int Eh;
  private float Ei;
  float Ej;
  int Ek;
  int El;
  private final a Em;
  View En;
  private boolean Eo;
  private final ViewGroup Ep;
  private final Runnable Eq = new Runnable()
  {
    public final void run()
    {
      u.this.ao(0);
    }
  };
  private int eA = -1;
  private VelocityTracker ez;
  private q hN;
  public int hQ;
  
  private u(Context paramContext, ViewGroup paramViewGroup, a parama)
  {
    if (paramViewGroup == null) {
      throw new IllegalArgumentException("Parent view may not be null");
    }
    if (parama == null) {
      throw new IllegalArgumentException("Callback may not be null");
    }
    this.Ep = paramViewGroup;
    this.Em = parama;
    paramViewGroup = ViewConfiguration.get(paramContext);
    this.Ek = ((int)(paramContext.getResources().getDisplayMetrics().density * 20.0F + 0.5F));
    this.hQ = paramViewGroup.getScaledTouchSlop();
    this.Ei = paramViewGroup.getScaledMaximumFlingVelocity();
    this.Ej = paramViewGroup.getScaledMinimumFlingVelocity();
    this.hN = q.a(paramContext, xF);
  }
  
  public static u a(ViewGroup paramViewGroup, float paramFloat, a parama)
  {
    paramViewGroup = a(paramViewGroup, parama);
    paramViewGroup.hQ = ((int)(paramViewGroup.hQ * (1.0F / paramFloat)));
    return paramViewGroup;
  }
  
  public static u a(ViewGroup paramViewGroup, a parama)
  {
    return new u(paramViewGroup.getContext(), paramViewGroup, parama);
  }
  
  private void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    int j = 0;
    if ((this.Ea == null) || (this.Ea.length <= paramInt))
    {
      localObject = new float[paramInt + 1];
      float[] arrayOfFloat1 = new float[paramInt + 1];
      float[] arrayOfFloat2 = new float[paramInt + 1];
      float[] arrayOfFloat3 = new float[paramInt + 1];
      int[] arrayOfInt1 = new int[paramInt + 1];
      int[] arrayOfInt2 = new int[paramInt + 1];
      int[] arrayOfInt3 = new int[paramInt + 1];
      if (this.Ea != null)
      {
        System.arraycopy(this.Ea, 0, localObject, 0, this.Ea.length);
        System.arraycopy(this.Eb, 0, arrayOfFloat1, 0, this.Eb.length);
        System.arraycopy(this.Ec, 0, arrayOfFloat2, 0, this.Ec.length);
        System.arraycopy(this.Ed, 0, arrayOfFloat3, 0, this.Ed.length);
        System.arraycopy(this.Ee, 0, arrayOfInt1, 0, this.Ee.length);
        System.arraycopy(this.Ef, 0, arrayOfInt2, 0, this.Ef.length);
        System.arraycopy(this.Eg, 0, arrayOfInt3, 0, this.Eg.length);
      }
      this.Ea = ((float[])localObject);
      this.Eb = arrayOfFloat1;
      this.Ec = arrayOfFloat2;
      this.Ed = arrayOfFloat3;
      this.Ee = arrayOfInt1;
      this.Ef = arrayOfInt2;
      this.Eg = arrayOfInt3;
    }
    Object localObject = this.Ea;
    this.Ec[paramInt] = paramFloat1;
    localObject[paramInt] = paramFloat1;
    localObject = this.Eb;
    this.Ed[paramInt] = paramFloat2;
    localObject[paramInt] = paramFloat2;
    localObject = this.Ee;
    int m = (int)paramFloat1;
    int k = (int)paramFloat2;
    if (m < this.Ep.getLeft() + this.Ek) {
      j = 1;
    }
    int i = j;
    if (k < this.Ep.getTop() + this.Ek) {
      i = j | 0x4;
    }
    j = i;
    if (m > this.Ep.getRight() - this.Ek) {
      j = i | 0x2;
    }
    i = j;
    if (k > this.Ep.getBottom() - this.Ek) {
      i = j | 0x8;
    }
    localObject[paramInt] = i;
    this.Eh |= 1 << paramInt;
  }
  
  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    if (((this.Ee[paramInt1] & paramInt2) != paramInt2) || ((this.El & paramInt2) == 0) || ((this.Eg[paramInt1] & paramInt2) == paramInt2) || ((this.Ef[paramInt1] & paramInt2) == paramInt2) || ((paramFloat1 <= this.hQ) && (paramFloat2 <= this.hQ))) {}
    while (((this.Ef[paramInt1] & paramInt2) != 0) || (paramFloat1 <= this.hQ)) {
      return false;
    }
    return true;
  }
  
  private void am(int paramInt)
  {
    if (this.Ea == null) {
      return;
    }
    this.Ea[paramInt] = 0.0F;
    this.Eb[paramInt] = 0.0F;
    this.Ec[paramInt] = 0.0F;
    this.Ed[paramInt] = 0.0F;
    this.Ee[paramInt] = 0;
    this.Ef[paramInt] = 0;
    this.Eg[paramInt] = 0;
    this.Eh &= (1 << paramInt ^ 0xFFFFFFFF);
  }
  
  private boolean ap(int paramInt)
  {
    if (!an(paramInt))
    {
      new StringBuilder("Ignoring pointerId=").append(paramInt).append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
      return false;
    }
    return true;
  }
  
  private void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int j = 1;
    if (a(paramFloat1, paramFloat2, paramInt, 1)) {}
    for (;;)
    {
      int i = j;
      if (a(paramFloat2, paramFloat1, paramInt, 4)) {
        i = j | 0x4;
      }
      j = i;
      if (a(paramFloat1, paramFloat2, paramInt, 2)) {
        j = i | 0x2;
      }
      i = j;
      if (a(paramFloat2, paramFloat1, paramInt, 8)) {
        i = j | 0x8;
      }
      if (i != 0)
      {
        int[] arrayOfInt = this.Ef;
        arrayOfInt[paramInt] |= i;
        this.Em.m(i, paramInt);
      }
      return;
      j = 0;
    }
  }
  
  private boolean b(View paramView, float paramFloat1, float paramFloat2)
  {
    if (paramView == null) {}
    label20:
    int j;
    label72:
    label78:
    do
    {
      do
      {
        return false;
        int i;
        if (this.Em.s(paramView) > 0)
        {
          i = 1;
          if (this.Em.K() <= 0) {
            break label72;
          }
        }
        for (j = 1;; j = 0)
        {
          if ((i == 0) || (j == 0)) {
            break label78;
          }
          if (paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2 <= this.hQ * this.hQ) {
            break;
          }
          return true;
          i = 0;
          break label20;
        }
        if (i == 0) {
          break;
        }
      } while (Math.abs(paramFloat1) <= this.hQ);
      return true;
    } while ((j == 0) || (Math.abs(paramFloat2) <= this.hQ));
    return true;
  }
  
  private void cH()
  {
    this.ez.computeCurrentVelocity(1000, this.Ei);
    i(e(y.a(this.ez, this.eA), this.Ej, this.Ei), e(y.b(this.ez, this.eA), this.Ej, this.Ei));
  }
  
  private static float e(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = Math.abs(paramFloat1);
    if (f < paramFloat2) {
      paramFloat2 = 0.0F;
    }
    do
    {
      return paramFloat2;
      if (f <= paramFloat3) {
        break;
      }
      paramFloat2 = paramFloat3;
    } while (paramFloat1 > 0.0F);
    return -paramFloat3;
    return paramFloat1;
  }
  
  private int f(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0) {
      return 0;
    }
    int i = this.Ep.getWidth();
    int j = i / 2;
    float f3 = Math.min(1.0F, Math.abs(paramInt1) / i);
    float f1 = j;
    float f2 = j;
    f3 = (float)Math.sin((float)((f3 - 0.5F) * 0.4712389167638204D));
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0) {}
    for (paramInt1 = Math.round(Math.abs((f3 * f2 + f1) / paramInt2) * 1000.0F) * 4;; paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F)) {
      return Math.min(paramInt1, 600);
    }
  }
  
  private boolean f(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.En.getLeft();
    int j = this.En.getTop();
    paramInt1 -= i;
    paramInt2 -= j;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.hN.abortAnimation();
      ao(0);
      return false;
    }
    View localView = this.En;
    paramInt3 = g(paramInt3, (int)this.Ej, (int)this.Ei);
    paramInt4 = g(paramInt4, (int)this.Ej, (int)this.Ei);
    int k = Math.abs(paramInt1);
    int m = Math.abs(paramInt2);
    int n = Math.abs(paramInt3);
    int i1 = Math.abs(paramInt4);
    int i2 = n + i1;
    int i3 = k + m;
    float f1;
    if (paramInt3 != 0)
    {
      f1 = n / i2;
      if (paramInt4 == 0) {
        break label237;
      }
    }
    label237:
    for (float f2 = i1 / i2;; f2 = m / i3)
    {
      paramInt3 = f(paramInt1, paramInt3, this.Em.s(localView));
      paramInt4 = f(paramInt2, paramInt4, this.Em.K());
      float f3 = paramInt3;
      paramInt3 = (int)(f2 * paramInt4 + f1 * f3);
      this.hN.startScroll(i, j, paramInt1, paramInt2, paramInt3);
      ao(2);
      return true;
      f1 = k / i3;
      break;
    }
  }
  
  public static boolean f(View paramView, int paramInt1, int paramInt2)
  {
    if (paramView == null) {}
    while ((paramInt1 < paramView.getLeft()) || (paramInt1 >= paramView.getRight()) || (paramInt2 < paramView.getTop()) || (paramInt2 >= paramView.getBottom())) {
      return false;
    }
    return true;
  }
  
  private static int g(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = Math.abs(paramInt1);
    if (i < paramInt2) {
      paramInt2 = 0;
    }
    do
    {
      return paramInt2;
      if (i <= paramInt3) {
        break;
      }
      paramInt2 = paramInt3;
    } while (paramInt1 > 0);
    return -paramInt3;
    return paramInt1;
  }
  
  private void i(float paramFloat1, float paramFloat2)
  {
    this.Eo = true;
    this.Em.a(this.En, paramFloat1, paramFloat2);
    this.Eo = false;
    if (this.DZ == 1) {
      ao(0);
    }
  }
  
  private void i(MotionEvent paramMotionEvent)
  {
    int j = o.f(paramMotionEvent);
    int i = 0;
    while (i < j)
    {
      int k = o.c(paramMotionEvent, i);
      float f1 = o.d(paramMotionEvent, i);
      float f2 = o.e(paramMotionEvent, i);
      this.Ec[k] = f1;
      this.Ed[k] = f2;
      i += 1;
    }
  }
  
  private boolean o(View paramView, int paramInt)
  {
    if ((paramView == this.En) && (this.eA == paramInt)) {
      return true;
    }
    if ((paramView != null) && (this.Em.b(paramView, paramInt)))
    {
      this.eA = paramInt;
      n(paramView, paramInt);
      return true;
    }
    return false;
  }
  
  public final void abort()
  {
    cancel();
    if (this.DZ == 2)
    {
      this.hN.getCurrX();
      this.hN.getCurrY();
      this.hN.abortAnimation();
      int i = this.hN.getCurrX();
      int j = this.hN.getCurrY();
      this.Em.a(this.En, i, j);
    }
    ao(0);
  }
  
  public final boolean an(int paramInt)
  {
    return (this.Eh & 1 << paramInt) != 0;
  }
  
  final void ao(int paramInt)
  {
    this.Ep.removeCallbacks(this.Eq);
    if (this.DZ != paramInt)
    {
      this.DZ = paramInt;
      this.Em.j(paramInt);
      if (this.DZ == 0) {
        this.En = null;
      }
    }
  }
  
  public final boolean cG()
  {
    boolean bool2 = false;
    if (this.DZ == 2)
    {
      boolean bool3 = this.hN.computeScrollOffset();
      int i = this.hN.getCurrX();
      int j = this.hN.getCurrY();
      int k = i - this.En.getLeft();
      int m = j - this.En.getTop();
      if (k != 0) {
        z.k(this.En, k);
      }
      if (m != 0) {
        z.j(this.En, m);
      }
      if ((k != 0) || (m != 0)) {
        this.Em.a(this.En, i, j);
      }
      bool1 = bool3;
      if (bool3)
      {
        bool1 = bool3;
        if (i == this.hN.getFinalX())
        {
          bool1 = bool3;
          if (j == this.hN.getFinalY())
          {
            this.hN.abortAnimation();
            bool1 = false;
          }
        }
      }
      if (!bool1) {
        this.Ep.post(this.Eq);
      }
    }
    boolean bool1 = bool2;
    if (this.DZ == 2) {
      bool1 = true;
    }
    return bool1;
  }
  
  public final void cancel()
  {
    this.eA = -1;
    if (this.Ea != null)
    {
      Arrays.fill(this.Ea, 0.0F);
      Arrays.fill(this.Eb, 0.0F);
      Arrays.fill(this.Ec, 0.0F);
      Arrays.fill(this.Ed, 0.0F);
      Arrays.fill(this.Ee, 0);
      Arrays.fill(this.Ef, 0);
      Arrays.fill(this.Eg, 0);
      this.Eh = 0;
    }
    if (this.ez != null)
    {
      this.ez.recycle();
      this.ez = null;
    }
  }
  
  public final boolean e(View paramView, int paramInt1, int paramInt2)
  {
    this.En = paramView;
    this.eA = -1;
    boolean bool = f(paramInt1, paramInt2, 0, 0);
    if ((!bool) && (this.DZ == 0) && (this.En != null)) {
      this.En = null;
    }
    return bool;
  }
  
  public final boolean j(MotionEvent paramMotionEvent)
  {
    int j = o.d(paramMotionEvent);
    int i = o.e(paramMotionEvent);
    if (j == 0) {
      cancel();
    }
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    this.ez.addMovement(paramMotionEvent);
    switch (j)
    {
    }
    while (this.DZ == 1)
    {
      return true;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      i = o.c(paramMotionEvent, 0);
      a(f1, f2, i);
      paramMotionEvent = q((int)f1, (int)f2);
      if ((paramMotionEvent == this.En) && (this.DZ == 2)) {
        o(paramMotionEvent, i);
      }
      if ((this.Ee[i] & this.El) != 0)
      {
        this.Em.cp();
        continue;
        j = o.c(paramMotionEvent, i);
        f1 = o.d(paramMotionEvent, i);
        f2 = o.e(paramMotionEvent, i);
        a(f1, f2, j);
        if (this.DZ == 0)
        {
          if ((this.Ee[j] & this.El) != 0) {
            this.Em.cp();
          }
        }
        else if (this.DZ == 2)
        {
          paramMotionEvent = q((int)f1, (int)f2);
          if (paramMotionEvent == this.En)
          {
            o(paramMotionEvent, j);
            continue;
            if ((this.Ea != null) && (this.Eb != null))
            {
              int k = o.f(paramMotionEvent);
              i = 0;
              if (i < k)
              {
                int m = o.c(paramMotionEvent, i);
                float f3;
                float f4;
                View localView;
                if (ap(m))
                {
                  f1 = o.d(paramMotionEvent, i);
                  f2 = o.e(paramMotionEvent, i);
                  f3 = f1 - this.Ea[m];
                  f4 = f2 - this.Eb[m];
                  localView = q((int)f1, (int)f2);
                  if ((localView == null) || (!b(localView, f3, f4))) {
                    break label551;
                  }
                }
                label551:
                for (j = 1;; j = 0)
                {
                  if (j != 0)
                  {
                    int n = localView.getLeft();
                    int i1 = (int)f3;
                    i1 = this.Em.d(localView, i1 + n);
                    int i2 = localView.getTop();
                    int i3 = (int)f4;
                    i3 = this.Em.c(localView, i3 + i2);
                    int i4 = this.Em.s(localView);
                    int i5 = this.Em.K();
                    if (((i4 == 0) || ((i4 > 0) && (i1 == n))) && ((i5 == 0) || ((i5 > 0) && (i3 == i2)))) {
                      break label557;
                    }
                  }
                  b(f3, f4, m);
                  if ((this.DZ == 1) || ((j != 0) && (o(localView, m)))) {
                    break label557;
                  }
                  i += 1;
                  break;
                }
              }
              label557:
              i(paramMotionEvent);
              continue;
              am(o.c(paramMotionEvent, i));
              continue;
              cancel();
            }
          }
        }
      }
    }
    return false;
  }
  
  public final void k(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = 0;
    int m = o.d(paramMotionEvent);
    int k = o.e(paramMotionEvent);
    if (m == 0) {
      cancel();
    }
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    this.ez.addMovement(paramMotionEvent);
    float f1;
    float f2;
    switch (m)
    {
    case 4: 
    default: 
    case 0: 
    case 5: 
    case 2: 
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              f1 = paramMotionEvent.getX();
              f2 = paramMotionEvent.getY();
              i = o.c(paramMotionEvent, 0);
              paramMotionEvent = q((int)f1, (int)f2);
              a(f1, f2, i);
              o(paramMotionEvent, i);
            } while ((this.Ee[i] & this.El) == 0);
            this.Em.cp();
            return;
            i = o.c(paramMotionEvent, k);
            f1 = o.d(paramMotionEvent, k);
            f2 = o.e(paramMotionEvent, k);
            a(f1, f2, i);
            if (this.DZ != 0) {
              break;
            }
            o(q((int)f1, (int)f2), i);
          } while ((this.Ee[i] & this.El) == 0);
          this.Em.cp();
          return;
          j = (int)f1;
          k = (int)f2;
        } while (!f(this.En, j, k));
        o(this.En, i);
        return;
        if (this.DZ != 1) {
          break;
        }
      } while (!ap(this.eA));
      i = o.b(paramMotionEvent, this.eA);
      f1 = o.d(paramMotionEvent, i);
      f2 = o.e(paramMotionEvent, i);
      m = (int)(f1 - this.Ec[this.eA]);
      int n = (int)(f2 - this.Ed[this.eA]);
      j = this.En.getLeft() + m;
      k = this.En.getTop() + n;
      int i2 = this.En.getLeft();
      int i1 = this.En.getTop();
      i = j;
      if (m != 0)
      {
        i = this.Em.d(this.En, j);
        z.k(this.En, i - i2);
      }
      j = k;
      if (n != 0)
      {
        j = this.Em.c(this.En, k);
        z.j(this.En, j - i1);
      }
      if ((m != 0) || (n != 0)) {
        this.Em.a(this.En, i, j);
      }
      i(paramMotionEvent);
      return;
      k = o.f(paramMotionEvent);
      i = j;
      while (i < k)
      {
        j = o.c(paramMotionEvent, i);
        if (ap(j))
        {
          f1 = o.d(paramMotionEvent, i);
          f2 = o.e(paramMotionEvent, i);
          float f3 = f1 - this.Ea[j];
          float f4 = f2 - this.Eb[j];
          b(f3, f4, j);
          if (this.DZ == 1) {
            break;
          }
          View localView = q((int)f1, (int)f2);
          if ((b(localView, f3, f4)) && (o(localView, j))) {
            break;
          }
        }
        i += 1;
      }
      i(paramMotionEvent);
      return;
    case 6: 
      j = o.c(paramMotionEvent, k);
      if ((this.DZ == 1) && (j == this.eA))
      {
        k = o.f(paramMotionEvent);
        if (i >= k) {
          break label785;
        }
        m = o.c(paramMotionEvent, i);
        if (m == this.eA) {
          break label740;
        }
        f1 = o.d(paramMotionEvent, i);
        f2 = o.e(paramMotionEvent, i);
        if ((q((int)f1, (int)f2) != this.En) || (!o(this.En, m))) {
          break label740;
        }
      }
      break;
    }
    label740:
    label785:
    for (i = this.eA;; i = -1)
    {
      if (i == -1) {
        cH();
      }
      am(j);
      return;
      i += 1;
      break;
      if (this.DZ == 1) {
        cH();
      }
      cancel();
      return;
      if (this.DZ == 1) {
        i(0.0F, 0.0F);
      }
      cancel();
      return;
    }
  }
  
  public final void n(View paramView, int paramInt)
  {
    if (paramView.getParent() != this.Ep) {
      throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.Ep + ")");
    }
    this.En = paramView;
    this.eA = paramInt;
    this.Em.f(paramView, paramInt);
    ao(1);
  }
  
  public final boolean p(int paramInt1, int paramInt2)
  {
    if (!this.Eo) {
      throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
    return f(paramInt1, paramInt2, (int)y.a(this.ez, this.eA), (int)y.b(this.ez, this.eA));
  }
  
  public final View q(int paramInt1, int paramInt2)
  {
    int i = this.Ep.getChildCount() - 1;
    while (i >= 0)
    {
      View localView = this.Ep.getChildAt(i);
      if ((paramInt1 >= localView.getLeft()) && (paramInt1 < localView.getRight()) && (paramInt2 >= localView.getTop()) && (paramInt2 < localView.getBottom())) {
        return localView;
      }
      i -= 1;
    }
    return null;
  }
  
  public static abstract class a
  {
    public int K()
    {
      return 0;
    }
    
    public void a(View paramView, float paramFloat1, float paramFloat2) {}
    
    public void a(View paramView, int paramInt1, int paramInt2) {}
    
    public abstract boolean b(View paramView, int paramInt);
    
    public int c(View paramView, int paramInt)
    {
      return 0;
    }
    
    public void cp() {}
    
    public int d(View paramView, int paramInt)
    {
      return 0;
    }
    
    public void f(View paramView, int paramInt) {}
    
    public void j(int paramInt) {}
    
    public void m(int paramInt1, int paramInt2) {}
    
    public int s(View paramView)
    {
      return 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\widget\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
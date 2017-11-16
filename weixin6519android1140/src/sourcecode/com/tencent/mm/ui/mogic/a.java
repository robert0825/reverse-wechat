package com.tencent.mm.ui.mogic;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.o;
import android.support.v4.view.y;
import android.support.v4.widget.q;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Arrays;

public final class a
{
  private static final Interpolator xF;
  public int DZ;
  public float[] Ea;
  public float[] Eb;
  public float[] Ec;
  public float[] Ed;
  public int[] Ee;
  private int[] Ef;
  private int[] Eg;
  public int Eh;
  public float Ei;
  public float Ej;
  private int Ek;
  public int El;
  public View En;
  public boolean Eo;
  public final ViewGroup Ep;
  public final Runnable Eq;
  public int eA;
  public VelocityTracker ez;
  public q hN;
  private int hQ;
  public final a xer;
  
  static
  {
    GMTrace.i(1859586621440L, 13855);
    xF = new Interpolator()
    {
      public final float getInterpolation(float paramAnonymousFloat)
      {
        GMTrace.i(1860794580992L, 13864);
        paramAnonymousFloat -= 1.0F;
        GMTrace.o(1860794580992L, 13864);
        return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
      }
    };
    GMTrace.o(1859586621440L, 13855);
  }
  
  private a(Context paramContext, ViewGroup paramViewGroup, a parama)
  {
    GMTrace.i(1857304920064L, 13838);
    this.eA = -1;
    this.Eq = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1856096960512L, 13829);
        a.this.ao(0);
        GMTrace.o(1856096960512L, 13829);
      }
    };
    if (paramViewGroup == null) {
      throw new IllegalArgumentException("Parent view may not be null");
    }
    if (parama == null) {
      throw new IllegalArgumentException("Callback may not be null");
    }
    this.Ep = paramViewGroup;
    this.xer = parama;
    paramViewGroup = ViewConfiguration.get(paramContext);
    this.Ek = ((int)(paramContext.getResources().getDisplayMetrics().density * 20.0F + 0.5F));
    this.hQ = paramViewGroup.getScaledTouchSlop();
    this.Ei = paramViewGroup.getScaledMaximumFlingVelocity();
    this.Ej = paramViewGroup.getScaledMinimumFlingVelocity();
    this.hN = q.a(paramContext, xF);
    GMTrace.o(1857304920064L, 13838);
  }
  
  public static a a(ViewGroup paramViewGroup, a parama)
  {
    GMTrace.i(1857170702336L, 13837);
    paramViewGroup = new a(paramViewGroup.getContext(), paramViewGroup, parama);
    GMTrace.o(1857170702336L, 13837);
    return paramViewGroup;
  }
  
  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    GMTrace.i(1859049750528L, 13851);
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    if (((this.Ee[paramInt1] & paramInt2) != paramInt2) || ((this.El & paramInt2) == 0) || ((this.Eg[paramInt1] & paramInt2) == paramInt2) || ((this.Ef[paramInt1] & paramInt2) == paramInt2) || ((paramFloat1 <= this.hQ) && (paramFloat2 <= this.hQ)))
    {
      GMTrace.o(1859049750528L, 13851);
      return false;
    }
    if (((this.Ef[paramInt1] & paramInt2) == 0) && (paramFloat1 > this.hQ))
    {
      GMTrace.o(1859049750528L, 13851);
      return true;
    }
    GMTrace.o(1859049750528L, 13851);
    return false;
  }
  
  private static float e(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    GMTrace.i(1857976008704L, 13843);
    float f = Math.abs(paramFloat1);
    if (f < paramFloat2)
    {
      GMTrace.o(1857976008704L, 13843);
      return 0.0F;
    }
    if (f > paramFloat3)
    {
      if (paramFloat1 > 0.0F)
      {
        GMTrace.o(1857976008704L, 13843);
        return paramFloat3;
      }
      paramFloat1 = -paramFloat3;
      GMTrace.o(1857976008704L, 13843);
      return paramFloat1;
    }
    GMTrace.o(1857976008704L, 13843);
    return paramFloat1;
  }
  
  private int f(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1857707573248L, 13841);
    if (paramInt1 == 0)
    {
      GMTrace.o(1857707573248L, 13841);
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
    for (paramInt1 = Math.round(Math.abs((f3 * f2 + f1) / paramInt2) * 1000.0F) * 4;; paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F))
    {
      paramInt1 = Math.min(paramInt1, 600);
      GMTrace.o(1857707573248L, 13841);
      return paramInt1;
    }
  }
  
  private static int g(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1857841790976L, 13842);
    int i = Math.abs(paramInt1);
    if (i < paramInt2)
    {
      GMTrace.o(1857841790976L, 13842);
      return 0;
    }
    if (i > paramInt3)
    {
      if (paramInt1 > 0)
      {
        GMTrace.o(1857841790976L, 13842);
        return paramInt3;
      }
      paramInt1 = -paramInt3;
      GMTrace.o(1857841790976L, 13842);
      return paramInt1;
    }
    GMTrace.o(1857841790976L, 13842);
    return paramInt1;
  }
  
  public final void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    GMTrace.i(1858378661888L, 13846);
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
    int j = 0;
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
    GMTrace.o(1858378661888L, 13846);
  }
  
  public final void am(int paramInt)
  {
    GMTrace.i(1858244444160L, 13845);
    if (this.Ea == null)
    {
      GMTrace.o(1858244444160L, 13845);
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
    GMTrace.o(1858244444160L, 13845);
  }
  
  final void ao(int paramInt)
  {
    GMTrace.i(1858647097344L, 13848);
    if (this.DZ != paramInt)
    {
      this.DZ = paramInt;
      this.xer.j(paramInt);
      if (paramInt == 0) {
        this.En = null;
      }
    }
    GMTrace.o(1858647097344L, 13848);
  }
  
  public final void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int j = 1;
    GMTrace.i(1858915532800L, 13850);
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
        arrayOfInt[paramInt] = (i | arrayOfInt[paramInt]);
      }
      GMTrace.o(1858915532800L, 13850);
      return;
      j = 0;
    }
  }
  
  public final void cH()
  {
    GMTrace.i(1859318185984L, 13853);
    this.ez.computeCurrentVelocity(1000, this.Ei);
    i(e(y.a(this.ez, this.eA), this.Ej, this.Ei), e(y.b(this.ez, this.eA), this.Ej, this.Ei));
    GMTrace.o(1859318185984L, 13853);
  }
  
  public final void cancel()
  {
    GMTrace.i(1857439137792L, 13839);
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
    GMTrace.o(1857439137792L, 13839);
  }
  
  public final boolean f(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1857573355520L, 13840);
    int i = this.En.getLeft();
    int j = this.En.getTop();
    paramInt1 -= i;
    paramInt2 -= j;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.hN.abortAnimation();
      ao(0);
      GMTrace.o(1857573355520L, 13840);
      return false;
    }
    int m = g(paramInt3, (int)this.Ej, (int)this.Ei);
    int k = g(paramInt4, (int)this.Ej, (int)this.Ei);
    int n = Math.abs(paramInt1);
    int i1 = Math.abs(paramInt2);
    int i2 = Math.abs(m);
    int i3 = Math.abs(k);
    int i4 = i2 + i3;
    int i5 = n + i1;
    float f1;
    if (m != 0)
    {
      f1 = i2 / i4;
      if (k == 0) {
        break label308;
      }
    }
    label308:
    for (float f2 = i3 / i4;; f2 = i1 / i5)
    {
      m = f(paramInt1, m, this.xer.chQ());
      k = f(paramInt2, k, 0);
      float f3 = m;
      k = (int)(f2 * k + f1 * f3);
      w.d("WxViewDragHelper", "ashutest:: xvel %d, yvel %d, dx %d, dy %d duration %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(k) });
      this.hN.startScroll(i, j, paramInt1, paramInt2, k);
      ao(2);
      GMTrace.o(1857573355520L, 13840);
      return true;
      f1 = n / i5;
      break;
    }
  }
  
  public final void i(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(1858110226432L, 13844);
    this.Eo = true;
    this.xer.a(this.En, paramFloat1, paramFloat2);
    this.Eo = false;
    if (this.DZ == 1) {
      ao(0);
    }
    GMTrace.o(1858110226432L, 13844);
  }
  
  public final void i(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1858512879616L, 13847);
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
    GMTrace.o(1858512879616L, 13847);
  }
  
  public final boolean l(View paramView, float paramFloat)
  {
    GMTrace.i(1859183968256L, 13852);
    if (paramView == null)
    {
      GMTrace.o(1859183968256L, 13852);
      return false;
    }
    int i;
    if (this.xer.chQ() > 0) {
      i = 1;
    }
    while (i != 0) {
      if (Math.abs(paramFloat) > this.hQ)
      {
        GMTrace.o(1859183968256L, 13852);
        return true;
        i = 0;
      }
      else
      {
        GMTrace.o(1859183968256L, 13852);
        return false;
      }
    }
    GMTrace.o(1859183968256L, 13852);
    return false;
  }
  
  public final boolean o(View paramView, int paramInt)
  {
    GMTrace.i(1858781315072L, 13849);
    if ((paramView == this.En) && (this.eA == paramInt))
    {
      GMTrace.o(1858781315072L, 13849);
      return true;
    }
    if ((paramView != null) && (this.xer.DT(paramInt)))
    {
      this.eA = paramInt;
      if (paramView.getParent() != this.Ep) {
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.Ep + ")");
      }
      this.En = paramView;
      this.eA = paramInt;
      ao(1);
      GMTrace.o(1858781315072L, 13849);
      return true;
    }
    GMTrace.o(1858781315072L, 13849);
    return false;
  }
  
  public final View q(int paramInt1, int paramInt2)
  {
    GMTrace.i(1859452403712L, 13854);
    int i = this.Ep.getChildCount() - 1;
    while (i >= 0)
    {
      View localView = this.Ep.getChildAt(i);
      if ((paramInt1 >= localView.getLeft()) && (paramInt1 < localView.getRight()) && (paramInt2 >= localView.getTop()) && (paramInt2 < localView.getBottom()))
      {
        GMTrace.o(1859452403712L, 13854);
        return localView;
      }
      i -= 1;
    }
    GMTrace.o(1859452403712L, 13854);
    return null;
  }
  
  public static abstract class a
  {
    public a()
    {
      GMTrace.i(1870055604224L, 13933);
      GMTrace.o(1870055604224L, 13933);
    }
    
    public abstract boolean DT(int paramInt);
    
    public void a(View paramView, float paramFloat1, float paramFloat2)
    {
      GMTrace.i(1870458257408L, 13936);
      GMTrace.o(1870458257408L, 13936);
    }
    
    public int chQ()
    {
      GMTrace.i(1870592475136L, 13937);
      GMTrace.o(1870592475136L, 13937);
      return 0;
    }
    
    public int d(View paramView, int paramInt)
    {
      GMTrace.i(1870860910592L, 13939);
      GMTrace.o(1870860910592L, 13939);
      return 0;
    }
    
    public void ey(int paramInt1, int paramInt2)
    {
      GMTrace.i(1870324039680L, 13935);
      GMTrace.o(1870324039680L, 13935);
    }
    
    public void j(int paramInt)
    {
      GMTrace.i(1870189821952L, 13934);
      GMTrace.o(1870189821952L, 13934);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\mogic\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
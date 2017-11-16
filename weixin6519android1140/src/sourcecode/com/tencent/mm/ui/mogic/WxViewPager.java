package com.tencent.mm.ui.mogic;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.c;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.ViewPager.f;
import android.support.v4.view.a;
import android.support.v4.view.a.f;
import android.support.v4.view.ae;
import android.support.v4.view.g;
import android.support.v4.view.o;
import android.support.v4.view.u;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v4.widget.i;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import junit.framework.Assert;

public class WxViewPager
  extends ViewGroup
{
  private static final int[] xC;
  private static final Comparator<b> xE;
  private static final Interpolator xF;
  private static final e xev;
  private final Rect dF;
  private final ArrayList<b> dw;
  private int eA;
  public VelocityTracker ez;
  public boolean hO;
  private int hQ;
  private boolean ou;
  public long pKa;
  public float wS;
  private float wT;
  private int xD;
  public u xH;
  public int xI;
  private int xJ;
  private Parcelable xK;
  private ClassLoader xL;
  public Scroller xM;
  public int xP;
  private Drawable xQ;
  private int xR;
  private int xS;
  private float xT;
  private float xU;
  private int xV;
  private int xW;
  private boolean xX;
  private boolean xY;
  private int xZ;
  private final b xet;
  private d xeu;
  private int xl;
  private boolean ya;
  private int yb;
  private int yc;
  public float yd;
  public float ye;
  private int yf;
  private int yg;
  private int yh;
  private int yi;
  public boolean yj;
  private i yk;
  private i yl;
  private boolean ym;
  private boolean yn;
  private boolean yo;
  private int yp;
  private ViewPager.e yr;
  private ViewPager.e ys;
  private ViewPager.f yu;
  private int yv;
  private ArrayList<View> yw;
  private final Runnable yy;
  
  static
  {
    GMTrace.i(1869921386496L, 13932);
    xC = new int[] { 16842931 };
    xE = new Comparator() {};
    xF = new Interpolator()
    {
      public final float getInterpolation(float paramAnonymousFloat)
      {
        GMTrace.i(1857036484608L, 13836);
        paramAnonymousFloat -= 1.0F;
        GMTrace.o(1857036484608L, 13836);
        return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
      }
    };
    xev = new e();
    GMTrace.o(1869921386496L, 13932);
  }
  
  public WxViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1860928798720L, 13865);
    this.dw = new ArrayList();
    this.xet = new b();
    this.dF = new Rect();
    this.xJ = -1;
    this.xK = null;
    this.xL = null;
    this.xT = -3.4028235E38F;
    this.xU = Float.MAX_VALUE;
    this.xZ = 1;
    this.eA = -1;
    this.ym = true;
    this.yn = false;
    this.yy = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1855157436416L, 13822);
        WxViewPager.a(WxViewPager.this);
        WxViewPager.this.populate();
        GMTrace.o(1855157436416L, 13822);
      }
    };
    this.xl = 0;
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    paramContext = getContext();
    this.xM = new Scroller(paramContext, xF);
    paramAttributeSet = ViewConfiguration.get(paramContext);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.hQ = ae.a(paramAttributeSet);
    this.yf = ((int)(400.0F * f));
    this.yg = paramAttributeSet.getScaledMaximumFlingVelocity();
    this.yk = new i(paramContext);
    this.yl = new i(paramContext);
    this.yh = ((int)(25.0F * f));
    this.yi = ((int)(2.0F * f));
    this.yb = ((int)(16.0F * f));
    z.a(this, new c());
    if (z.G(this) == 0) {
      z.i(this, 1);
    }
    GMTrace.o(1860928798720L, 13865);
  }
  
  private b DV(int paramInt)
  {
    GMTrace.i(1864552677376L, 13892);
    int i = 0;
    while (i < this.dw.size())
    {
      b localb = (b)this.dw.get(i);
      if (localb.position == paramInt)
      {
        GMTrace.o(1864552677376L, 13892);
        return localb;
      }
      i += 1;
    }
    GMTrace.o(1864552677376L, 13892);
    return null;
  }
  
  private void Z(int paramInt)
  {
    GMTrace.i(1863344717824L, 13883);
    int i;
    Object localObject2;
    if (this.xI != paramInt) {
      if (this.xI < paramInt)
      {
        i = 66;
        localObject2 = DV(this.xI);
        this.xI = paramInt;
      }
    }
    for (int j = i;; j = 2)
    {
      if (this.xH == null)
      {
        bQ();
        GMTrace.o(1863344717824L, 13883);
        return;
        i = 17;
        break;
      }
      if (this.xY)
      {
        bQ();
        GMTrace.o(1863344717824L, 13883);
        return;
      }
      if (getWindowToken() == null)
      {
        GMTrace.o(1863344717824L, 13883);
        return;
      }
      paramInt = this.xZ;
      int i3 = Math.max(0, this.xI - paramInt);
      int i1 = this.xH.getCount();
      int i2 = Math.min(i1 - 1, paramInt + this.xI);
      Object localObject1;
      if (i1 != this.xD) {
        try
        {
          String str = getResources().getResourceName(getId());
          throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.xD + ", found: " + i1 + " Pager id: " + str + " Pager class: " + getClass() + " Problematic adapter: " + this.xH.getClass());
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          for (;;)
          {
            localObject1 = Integer.toHexString(getId());
          }
        }
      }
      paramInt = 0;
      if (paramInt < this.dw.size())
      {
        localObject1 = (b)this.dw.get(paramInt);
        if (((b)localObject1).position >= this.xI) {
          if (((b)localObject1).position != this.xI) {
            break label1301;
          }
        }
      }
      for (;;)
      {
        if ((localObject1 == null) && (i1 > 0)) {}
        for (Object localObject3 = ez(this.xI, paramInt);; localObject3 = localObject1)
        {
          label370:
          int i4;
          float f2;
          label383:
          float f3;
          int k;
          label405:
          float f1;
          if (localObject3 != null)
          {
            int n = paramInt - 1;
            int m;
            Object localObject4;
            if (n >= 0)
            {
              localObject1 = (b)this.dw.get(n);
              i4 = bO();
              if (i4 > 0) {
                break label567;
              }
              f2 = 0.0F;
              i = this.xI;
              f3 = 0.0F;
              m = i - 1;
              k = paramInt;
              localObject4 = localObject1;
              if (m < 0) {
                break label717;
              }
              if ((f3 < f2) || (m >= i3)) {
                break label597;
              }
              if (localObject4 == null) {
                break label717;
              }
              localObject1 = localObject4;
              paramInt = n;
              f1 = f3;
              i = k;
              if (m == ((b)localObject4).position)
              {
                localObject1 = localObject4;
                paramInt = n;
                f1 = f3;
                i = k;
                if (!((b)localObject4).yB)
                {
                  this.dw.remove(n);
                  this.xH.a(this, m, ((b)localObject4).yA);
                  paramInt = n - 1;
                  i = k - 1;
                  if (paramInt < 0) {
                    break label588;
                  }
                  localObject1 = (b)this.dw.get(paramInt);
                  f1 = f3;
                }
              }
            }
            for (;;)
            {
              m -= 1;
              localObject4 = localObject1;
              n = paramInt;
              f3 = f1;
              k = i;
              break label405;
              paramInt += 1;
              break;
              localObject1 = null;
              break label370;
              label567:
              f2 = 2.0F - ((b)localObject3).yC + getPaddingLeft() / i4;
              break label383;
              label588:
              localObject1 = null;
              f1 = f3;
              continue;
              label597:
              if ((localObject4 != null) && (m == ((b)localObject4).position))
              {
                f1 = f3 + ((b)localObject4).yC;
                paramInt = n - 1;
                if (paramInt >= 0)
                {
                  localObject1 = (b)this.dw.get(paramInt);
                  i = k;
                }
                else
                {
                  localObject1 = null;
                  i = k;
                }
              }
              else
              {
                f1 = f3 + ez(m, n + 1).yC;
                i = k + 1;
                if (n >= 0)
                {
                  localObject1 = (b)this.dw.get(n);
                  paramInt = n;
                }
                else
                {
                  localObject1 = null;
                  paramInt = n;
                }
              }
            }
            label717:
            f1 = ((b)localObject3).yC;
            paramInt = k + 1;
            if (f1 < 2.0F) {
              if (paramInt < this.dw.size())
              {
                localObject1 = (b)this.dw.get(paramInt);
                if (i4 > 0) {
                  break label883;
                }
                f2 = 0.0F;
                label765:
                i = this.xI;
                i += 1;
                label777:
                if (i >= i1) {
                  break label1026;
                }
                if ((f1 < f2) || (i <= i2)) {
                  break label904;
                }
                if (localObject1 == null) {
                  break label1026;
                }
                if ((i != ((b)localObject1).position) || (((b)localObject1).yB)) {
                  break label1291;
                }
                this.dw.remove(paramInt);
                this.xH.a(this, i, ((b)localObject1).yA);
                if (paramInt >= this.dw.size()) {
                  break label898;
                }
                localObject1 = (b)this.dw.get(paramInt);
              }
            }
          }
          label883:
          label898:
          label904:
          label1026:
          label1291:
          for (;;)
          {
            i += 1;
            break label777;
            localObject1 = null;
            break;
            f2 = getPaddingRight() / i4 + 2.0F;
            break label765;
            localObject1 = null;
            continue;
            if ((localObject1 != null) && (i == ((b)localObject1).position))
            {
              f3 = ((b)localObject1).yC;
              paramInt += 1;
              if (paramInt < this.dw.size()) {}
              for (localObject1 = (b)this.dw.get(paramInt);; localObject1 = null)
              {
                f1 += f3;
                break;
              }
            }
            localObject1 = ez(i, paramInt);
            paramInt += 1;
            f3 = ((b)localObject1).yC;
            if (paramInt < this.dw.size()) {}
            for (localObject1 = (b)this.dw.get(paramInt);; localObject1 = null)
            {
              f1 += f3;
              break;
            }
            a((b)localObject3, k, (b)localObject2);
            localObject2 = this.xH;
            if (localObject3 != null) {}
            for (localObject1 = ((b)localObject3).yA;; localObject1 = null)
            {
              ((u)localObject2).d(localObject1);
              this.xH.ba();
              i = getChildCount();
              paramInt = 0;
              while (paramInt < i)
              {
                localObject2 = getChildAt(paramInt);
                localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
                ((LayoutParams)localObject1).yG = paramInt;
                if ((!((LayoutParams)localObject1).yE) && (((LayoutParams)localObject1).yC == 0.0F))
                {
                  localObject2 = dD((View)localObject2);
                  if (localObject2 != null)
                  {
                    ((LayoutParams)localObject1).yC = ((b)localObject2).yC;
                    ((LayoutParams)localObject1).position = ((b)localObject2).position;
                  }
                }
                paramInt += 1;
              }
            }
            bQ();
            if (hasFocus())
            {
              localObject1 = findFocus();
              if (localObject1 != null) {}
              for (localObject1 = dE((View)localObject1); (localObject1 == null) || (((b)localObject1).position != this.xI); localObject1 = null)
              {
                paramInt = 0;
                while (paramInt < getChildCount())
                {
                  localObject1 = getChildAt(paramInt);
                  localObject2 = dD((View)localObject1);
                  if ((localObject2 != null) && (((b)localObject2).position == this.xI) && (((View)localObject1).requestFocus(j))) {
                    break;
                  }
                  paramInt += 1;
                }
              }
            }
            GMTrace.o(1863344717824L, 13883);
            return;
          }
        }
        label1301:
        localObject1 = null;
      }
      localObject2 = null;
    }
  }
  
  private Rect a(Rect paramRect, View paramView)
  {
    GMTrace.i(1867908120576L, 13917);
    if (paramRect == null) {
      paramRect = new Rect();
    }
    for (;;)
    {
      if (paramView == null)
      {
        paramRect.set(0, 0, 0, 0);
        GMTrace.o(1867908120576L, 13917);
        return paramRect;
      }
      paramRect.left = paramView.getLeft();
      paramRect.right = paramView.getRight();
      paramRect.top = paramView.getTop();
      paramRect.bottom = paramView.getBottom();
      for (paramView = paramView.getParent(); ((paramView instanceof ViewGroup)) && (paramView != this); paramView = paramView.getParent())
      {
        paramView = (ViewGroup)paramView;
        paramRect.left += paramView.getLeft();
        paramRect.right += paramView.getRight();
        paramRect.top += paramView.getTop();
        paramRect.bottom += paramView.getBottom();
      }
      GMTrace.o(1867908120576L, 13917);
      return paramRect;
    }
  }
  
  private void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(1865626419200L, 13900);
    int i;
    int j;
    int i2;
    int n;
    View localView;
    int k;
    int m;
    label140:
    int i4;
    if (this.yp > 0)
    {
      int i1 = getScrollX();
      i = getPaddingLeft();
      j = getPaddingRight();
      i2 = getWidth();
      int i3 = getChildCount();
      n = 0;
      if (n < i3)
      {
        localView = getChildAt(n);
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if (!localLayoutParams.yE) {
          break label431;
        }
        switch (localLayoutParams.gravity & 0x7)
        {
        case 2: 
        case 4: 
        default: 
          k = i;
          m = j;
          j = i;
          i = m;
          i4 = k + i1 - localView.getLeft();
          k = i;
          m = j;
          if (i4 != 0)
          {
            localView.offsetLeftAndRight(i4);
            m = j;
            k = i;
          }
          break;
        }
      }
    }
    for (;;)
    {
      n += 1;
      i = m;
      j = k;
      break;
      k = localView.getWidth();
      m = k + i;
      k = i;
      i = j;
      j = m;
      break label140;
      k = Math.max((i2 - localView.getMeasuredWidth()) / 2, i);
      m = i;
      i = j;
      j = m;
      break label140;
      k = i2 - j - localView.getMeasuredWidth();
      i4 = localView.getMeasuredWidth();
      m = i;
      i = j + i4;
      j = m;
      break label140;
      if (this.yr != null) {
        this.yr.a(paramInt1, paramFloat, paramInt2);
      }
      if (this.ys != null) {
        this.ys.a(paramInt1, paramFloat, paramInt2);
      }
      if (this.yu != null)
      {
        paramInt2 = getScrollX();
        i = getChildCount();
        paramInt1 = 0;
        while (paramInt1 < i)
        {
          localView = getChildAt(paramInt1);
          if (!((LayoutParams)localView.getLayoutParams()).yE)
          {
            paramFloat = (localView.getLeft() - paramInt2) / bO();
            this.yu.h(localView, paramFloat);
          }
          paramInt1 += 1;
        }
      }
      this.yo = true;
      GMTrace.o(1865626419200L, 13900);
      return;
      label431:
      k = j;
      m = i;
    }
  }
  
  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    GMTrace.i(1862136758272L, 13874);
    b localb = DV(paramInt1);
    int i = 0;
    if (localb != null) {
      i = (int)(bO() * Math.max(this.xT, Math.min(localb.yD, this.xU)));
    }
    if (paramBoolean1)
    {
      if (getChildCount() == 0) {
        setScrollingCacheEnabled(false);
      }
      int j;
      int k;
      int m;
      for (;;)
      {
        if ((paramBoolean2) && (this.yr != null)) {
          this.yr.V(paramInt1);
        }
        if ((!paramBoolean2) || (this.ys == null)) {
          break label405;
        }
        this.ys.V(paramInt1);
        GMTrace.o(1862136758272L, 13874);
        return;
        j = getScrollX();
        k = getScrollY();
        i -= j;
        m = 0 - k;
        if ((i != 0) || (m != 0)) {
          break;
        }
        r(false);
        populate();
        X(0);
      }
      setScrollingCacheEnabled(true);
      X(2);
      int n = bO();
      int i1 = n / 2;
      float f3 = Math.min(1.0F, 1.0F * Math.abs(i) / n);
      float f1 = i1;
      float f2 = i1;
      f3 = (float)Math.sin((float)((f3 - 0.5F) * 0.4712389167638204D));
      paramInt2 = Math.abs(paramInt2);
      if (paramInt2 > 0) {}
      for (paramInt2 = Math.round(1000.0F * Math.abs((f2 * f3 + f1) / paramInt2)) * 4;; paramInt2 = (int)((Math.abs(i) / (f1 * 1.0F + this.xP) + 3.0F) * 100.0F))
      {
        paramInt2 = Math.min(paramInt2, 600);
        this.xM.startScroll(j, k, i, m, paramInt2);
        z.F(this);
        break;
        f1 = n;
      }
    }
    if ((paramBoolean2) && (this.yr != null)) {
      this.yr.V(paramInt1);
    }
    if ((paramBoolean2) && (this.ys != null)) {
      this.ys.V(paramInt1);
    }
    r(false);
    scrollTo(i, 0);
    ab(i);
    label405:
    GMTrace.o(1862136758272L, 13874);
  }
  
  private void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1861868322816L, 13872);
    a(paramInt, paramBoolean1, paramBoolean2, 0);
    GMTrace.o(1861868322816L, 13872);
  }
  
  private void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    boolean bool = false;
    GMTrace.i(1862002540544L, 13873);
    if ((this.xH == null) || (this.xH.getCount() <= 0))
    {
      setScrollingCacheEnabled(false);
      GMTrace.o(1862002540544L, 13873);
      return;
    }
    if ((!paramBoolean2) && (this.xI == paramInt1) && (this.dw.size() != 0))
    {
      setScrollingCacheEnabled(false);
      GMTrace.o(1862002540544L, 13873);
      return;
    }
    int i;
    if (paramInt1 < 0) {
      i = 0;
    }
    for (;;)
    {
      paramInt1 = this.xZ;
      if ((i <= this.xI + paramInt1) && (i >= this.xI - paramInt1)) {
        break;
      }
      paramInt1 = 0;
      while (paramInt1 < this.dw.size())
      {
        ((b)this.dw.get(paramInt1)).yB = true;
        paramInt1 += 1;
      }
      i = paramInt1;
      if (paramInt1 >= this.xH.getCount()) {
        i = this.xH.getCount() - 1;
      }
    }
    paramBoolean2 = bool;
    if (this.xI != i) {
      paramBoolean2 = true;
    }
    if (this.ym)
    {
      this.xI = i;
      if ((paramBoolean2) && (this.yr != null)) {
        this.yr.V(i);
      }
      if ((paramBoolean2) && (this.ys != null)) {
        this.ys.V(i);
      }
      requestLayout();
      GMTrace.o(1862002540544L, 13873);
      return;
    }
    Z(i);
    a(i, paramBoolean1, paramInt2, paramBoolean2);
    GMTrace.o(1862002540544L, 13873);
  }
  
  private void a(b paramb1, int paramInt, b paramb2)
  {
    GMTrace.i(1863613153280L, 13885);
    int k = this.xH.getCount();
    int i = bO();
    if (i > 0) {}
    float f1;
    float f3;
    int j;
    for (float f2 = this.xP / i;; f2 = 0.0F)
    {
      if (paramb2 == null) {
        break label382;
      }
      i = paramb2.position;
      if (i >= paramb1.position) {
        break;
      }
      f1 = paramb2.yD;
      f3 = paramb2.yC;
      j = 0;
      f1 = f1 + f3 + f2;
      i += 1;
      if ((i > paramb1.position) || (j >= this.dw.size())) {
        break label382;
      }
      for (paramb2 = (b)this.dw.get(j); (i > paramb2.position) && (j < this.dw.size() - 1); paramb2 = (b)this.dw.get(j)) {
        j += 1;
      }
    }
    for (;;)
    {
      if (i < paramb2.position)
      {
        i += 1;
        f1 = 1.0F + f2 + f1;
      }
      else
      {
        paramb2.yD = f1;
        f1 += paramb2.yC + f2;
        i += 1;
        break;
        if (i > paramb1.position)
        {
          j = this.dw.size();
          f1 = paramb2.yD;
          j -= 1;
          i -= 1;
          if ((i >= paramb1.position) && (j >= 0)) {
            for (paramb2 = (b)this.dw.get(j); (i < paramb2.position) && (j > 0); paramb2 = (b)this.dw.get(j)) {
              j -= 1;
            }
          }
        }
        for (;;)
        {
          if (i > paramb2.position)
          {
            i -= 1;
            f1 -= 1.0F + f2;
          }
          else
          {
            f1 -= paramb2.yC + f2;
            paramb2.yD = f1;
            i -= 1;
            break;
            label382:
            int m = this.dw.size();
            f3 = paramb1.yD;
            i = paramb1.position - 1;
            if (paramb1.position == 0)
            {
              f1 = paramb1.yD;
              this.xT = f1;
              if (paramb1.position != k - 1) {
                break label515;
              }
              f1 = paramb1.yD + paramb1.yC - 1.0F;
              label448:
              this.xU = f1;
              j = paramInt - 1;
              f1 = f3;
            }
            for (;;)
            {
              if (j < 0) {
                break label568;
              }
              paramb2 = (b)this.dw.get(j);
              for (;;)
              {
                if (i > paramb2.position)
                {
                  i -= 1;
                  f1 -= 1.0F + f2;
                  continue;
                  f1 = -3.4028235E38F;
                  break;
                  label515:
                  f1 = Float.MAX_VALUE;
                  break label448;
                }
              }
              f1 -= paramb2.yC + f2;
              paramb2.yD = f1;
              if (paramb2.position == 0) {
                this.xT = f1;
              }
              i -= 1;
              j -= 1;
            }
            label568:
            f1 = paramb1.yD + paramb1.yC + f2;
            j = paramb1.position + 1;
            i = paramInt + 1;
            paramInt = j;
            while (i < m)
            {
              paramb1 = (b)this.dw.get(i);
              while (paramInt < paramb1.position)
              {
                paramInt += 1;
                f1 += 1.0F + f2;
              }
              if (paramb1.position == k - 1) {
                this.xU = (paramb1.yC + f1 - 1.0F);
              }
              paramb1.yD = f1;
              f1 += paramb1.yC + f2;
              paramInt += 1;
              i += 1;
            }
            this.yn = false;
            GMTrace.o(1863613153280L, 13885);
            return;
          }
        }
      }
    }
  }
  
  private boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1867505467392L, 13914);
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int j = paramView.getScrollX();
      int k = paramView.getScrollY();
      int i = localViewGroup.getChildCount() - 1;
      while (i >= 0)
      {
        View localView = localViewGroup.getChildAt(i);
        if ((paramInt2 + j >= localView.getLeft()) && (paramInt2 + j < localView.getRight()) && (paramInt3 + k >= localView.getTop()) && (paramInt3 + k < localView.getBottom()) && (a(localView, true, paramInt1, paramInt2 + j - localView.getLeft(), paramInt3 + k - localView.getTop())))
        {
          GMTrace.o(1867505467392L, 13914);
          return true;
        }
        i -= 1;
      }
    }
    if ((paramBoolean) && (z.g(paramView, -paramInt1)))
    {
      GMTrace.o(1867505467392L, 13914);
      return true;
    }
    GMTrace.o(1867505467392L, 13914);
    return false;
  }
  
  private boolean ab(int paramInt)
  {
    GMTrace.i(1865492201472L, 13899);
    if (this.dw.size() == 0)
    {
      this.yo = false;
      a(0, 0.0F, 0);
      if (!this.yo) {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      }
      GMTrace.o(1865492201472L, 13899);
      return false;
    }
    b localb = chR();
    if (localb == null)
    {
      GMTrace.o(1865492201472L, 13899);
      return false;
    }
    int j = bO();
    int k = this.xP;
    float f = this.xP / j;
    int i = localb.position;
    f = (paramInt / j - localb.yD) / (localb.yC + f);
    paramInt = (int)((k + j) * f);
    this.yo = false;
    a(i, f, paramInt);
    if (!this.yo) {
      throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }
    GMTrace.o(1865492201472L, 13899);
    return true;
  }
  
  private boolean arrowScroll(int paramInt)
  {
    GMTrace.i(1867773902848L, 13916);
    View localView = findFocus();
    Object localObject;
    int j;
    boolean bool;
    if (localView == this)
    {
      localObject = null;
      localView = FocusFinder.getInstance().findNextFocus(this, (View)localObject, paramInt);
      if ((localView == null) || (localView == localObject)) {
        break label326;
      }
      if (paramInt != 17) {
        break label272;
      }
      i = a(this.dF, localView).left;
      j = a(this.dF, (View)localObject).left;
      if ((localObject != null) && (i >= j))
      {
        bool = bU();
        label98:
        if (bool) {
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        }
        GMTrace.o(1867773902848L, 13916);
        return bool;
      }
    }
    else
    {
      if (localView == null) {
        break label372;
      }
      localObject = localView.getParent();
      if (!(localObject instanceof ViewGroup)) {
        break label379;
      }
      if (localObject != this) {}
    }
    label272:
    label326:
    label366:
    label372:
    label379:
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localView.getClass().getSimpleName());
        localObject = localView.getParent();
        for (;;)
        {
          if ((localObject instanceof ViewGroup))
          {
            localStringBuilder.append(" => ").append(localObject.getClass().getSimpleName());
            localObject = ((ViewParent)localObject).getParent();
            continue;
            localObject = ((ViewParent)localObject).getParent();
            break;
          }
        }
        new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ").append(localStringBuilder.toString());
        localObject = null;
        break;
        bool = localView.requestFocus();
        break label98;
        if (paramInt == 66)
        {
          i = a(this.dF, localView).left;
          j = a(this.dF, (View)localObject).left;
          if ((localObject == null) || (i > j))
          {
            bool = localView.requestFocus();
            break label98;
            if ((paramInt == 17) || (paramInt == 1))
            {
              bool = bU();
              break label98;
            }
            if ((paramInt != 66) && (paramInt != 2)) {
              break label366;
            }
          }
          bool = bV();
          break label98;
        }
        bool = false;
        break label98;
      }
      localObject = localView;
      break;
    }
  }
  
  private int bO()
  {
    GMTrace.i(1861465669632L, 13869);
    int i = getMeasuredWidth();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    GMTrace.o(1861465669632L, 13869);
    return i - j - k;
  }
  
  private void bQ()
  {
    GMTrace.i(1863478935552L, 13884);
    if (this.yv != 0)
    {
      if (this.yw == null) {
        this.yw = new ArrayList();
      }
      for (;;)
      {
        int j = getChildCount();
        int i = 0;
        while (i < j)
        {
          View localView = getChildAt(i);
          this.yw.add(localView);
          i += 1;
        }
        this.yw.clear();
      }
      Collections.sort(this.yw, xev);
    }
    GMTrace.o(1863478935552L, 13884);
  }
  
  private boolean bU()
  {
    GMTrace.i(1868042338304L, 13918);
    if (this.xI > 0)
    {
      c(this.xI - 1, true);
      GMTrace.o(1868042338304L, 13918);
      return true;
    }
    GMTrace.o(1868042338304L, 13918);
    return false;
  }
  
  private boolean bV()
  {
    GMTrace.i(1868176556032L, 13919);
    if ((this.xH != null) && (this.xI < this.xH.getCount() - 1))
    {
      c(this.xI + 1, true);
      GMTrace.o(1868176556032L, 13919);
      return true;
    }
    GMTrace.o(1868176556032L, 13919);
    return false;
  }
  
  private b chR()
  {
    GMTrace.i(1866297507840L, 13905);
    int i = bO();
    float f1;
    float f2;
    label45:
    int k;
    float f3;
    float f4;
    int j;
    Object localObject;
    label62:
    b localb;
    if (i > 0)
    {
      f1 = getScrollX() / i;
      if (i <= 0) {
        break label209;
      }
      f2 = this.xP / i;
      k = -1;
      f3 = 0.0F;
      f4 = 0.0F;
      j = 1;
      localObject = null;
      i = 0;
      if (i >= this.dw.size()) {
        break label256;
      }
      localb = (b)this.dw.get(i);
      if ((j != 0) || (localb.position == k + 1)) {
        break label268;
      }
      localb = this.xet;
      localb.yD = (f4 + f3 + f2);
      localb.position = (k + 1);
      localb.yC = 1.0F;
      i -= 1;
    }
    label209:
    label226:
    label256:
    label268:
    for (;;)
    {
      f3 = localb.yD;
      f4 = localb.yC;
      if ((j != 0) || (f1 >= f3))
      {
        if ((f1 >= f4 + f3 + f2) && (i != this.dw.size() - 1)) {
          break label226;
        }
        GMTrace.o(1866297507840L, 13905);
        return localb;
        f1 = 0.0F;
        break;
        f2 = 0.0F;
        break label45;
      }
      GMTrace.o(1866297507840L, 13905);
      return (b)localObject;
      k = localb.position;
      f4 = localb.yC;
      j = 0;
      i += 1;
      localObject = localb;
      break label62;
      GMTrace.o(1866297507840L, 13905);
      return (b)localObject;
    }
  }
  
  private void cy()
  {
    GMTrace.i(1867102814208L, 13911);
    this.hO = false;
    this.ya = false;
    if (this.ez != null)
    {
      this.ez.recycle();
      this.ez = null;
    }
    GMTrace.o(1867102814208L, 13911);
  }
  
  private b dD(View paramView)
  {
    GMTrace.i(1864284241920L, 13890);
    int i = 0;
    while (i < this.dw.size())
    {
      b localb = (b)this.dw.get(i);
      if (this.xH.a(paramView, localb.yA))
      {
        GMTrace.o(1864284241920L, 13890);
        return localb;
      }
      i += 1;
    }
    GMTrace.o(1864284241920L, 13890);
    return null;
  }
  
  private b dE(View paramView)
  {
    GMTrace.i(1864418459648L, 13891);
    for (;;)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this) {
        break;
      }
      if ((localViewParent == null) || (!(localViewParent instanceof View)))
      {
        GMTrace.o(1864418459648L, 13891);
        return null;
      }
      paramView = (View)localViewParent;
    }
    paramView = dD(paramView);
    GMTrace.o(1864418459648L, 13891);
    return paramView;
  }
  
  private b ez(int paramInt1, int paramInt2)
  {
    GMTrace.i(1862942064640L, 13880);
    b localb = new b();
    localb.position = paramInt1;
    localb.yA = this.xH.b(this, paramInt1);
    localb.yC = 1.0F;
    if ((paramInt2 < 0) || (paramInt2 >= this.dw.size())) {
      this.dw.add(localb);
    }
    for (;;)
    {
      GMTrace.o(1862942064640L, 13880);
      return localb;
      this.dw.add(paramInt2, localb);
    }
  }
  
  private void h(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1866968596480L, 13910);
    int i = o.e(paramMotionEvent);
    if (o.c(paramMotionEvent, i) == this.eA) {
      if (i != 0) {
        break label74;
      }
    }
    label74:
    for (i = 1;; i = 0)
    {
      this.yd = o.d(paramMotionEvent, i);
      this.eA = o.c(paramMotionEvent, i);
      if (this.ez != null) {
        this.ez.clear();
      }
      GMTrace.o(1866968596480L, 13910);
      return;
    }
  }
  
  private boolean o(float paramFloat)
  {
    int j = 1;
    boolean bool2 = false;
    boolean bool1 = false;
    GMTrace.i(1866163290112L, 13904);
    float f1 = this.yd;
    this.yd = paramFloat;
    float f2 = getScrollX() + (f1 - paramFloat);
    int k = bO();
    paramFloat = k * this.xT;
    f1 = k;
    float f3 = this.xU;
    b localb1 = (b)this.dw.get(0);
    b localb2 = (b)this.dw.get(this.dw.size() - 1);
    if (localb1.position != 0) {
      paramFloat = localb1.yD * k;
    }
    for (int i = 0;; i = 1)
    {
      if (localb2.position != this.xH.getCount() - 1)
      {
        f1 = localb2.yD * k;
        j = 0;
      }
      for (;;)
      {
        if (f2 < paramFloat)
        {
          f1 = paramFloat;
          if (i != 0)
          {
            bool1 = this.yk.u(Math.abs(paramFloat - f2) / k);
            f1 = paramFloat;
          }
        }
        for (;;)
        {
          this.yd += f1 - (int)f1;
          scrollTo((int)f1, getScrollY());
          ab((int)f1);
          GMTrace.o(1866163290112L, 13904);
          return bool1;
          if (f2 > f1)
          {
            bool1 = bool2;
            if (j != 0) {
              bool1 = this.yl.u(Math.abs(f2 - f1) / k);
            }
          }
          else
          {
            f1 = f2;
          }
        }
        f1 *= f3;
      }
    }
  }
  
  private void r(boolean paramBoolean)
  {
    GMTrace.i(1865760636928L, 13901);
    if (this.xl == 2) {}
    int j;
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        setScrollingCacheEnabled(false);
        this.xM.abortAnimation();
        j = getScrollX();
        k = getScrollY();
        int m = this.xM.getCurrX();
        int n = this.xM.getCurrY();
        if ((j != m) || (k != n)) {
          scrollTo(m, n);
        }
      }
      this.xY = false;
      int k = 0;
      j = i;
      i = k;
      while (i < this.dw.size())
      {
        b localb = (b)this.dw.get(i);
        if (localb.yB)
        {
          localb.yB = false;
          j = 1;
        }
        i += 1;
      }
    }
    if (j != 0)
    {
      if (paramBoolean)
      {
        z.a(this, this.yy);
        GMTrace.o(1865760636928L, 13901);
        return;
      }
      this.yy.run();
    }
    GMTrace.o(1865760636928L, 13901);
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    GMTrace.i(1867237031936L, 13912);
    if (this.xX != paramBoolean) {
      this.xX = paramBoolean;
    }
    GMTrace.o(1867237031936L, 13912);
  }
  
  public final void DU(int paramInt)
  {
    GMTrace.i(1862539411456L, 13877);
    int i = paramInt;
    if (paramInt <= 0)
    {
      new StringBuilder("Requested offscreen page limit ").append(paramInt).append(" too small; defaulting to 1");
      i = 1;
    }
    if (i != this.xZ)
    {
      this.xZ = i;
      populate();
    }
    GMTrace.o(1862539411456L, 13877);
  }
  
  public final void X(int paramInt)
  {
    GMTrace.i(1861197234176L, 13867);
    if (this.xl == paramInt)
    {
      GMTrace.o(1861197234176L, 13867);
      return;
    }
    this.xl = paramInt;
    if (this.yu != null)
    {
      int i;
      int j;
      if (paramInt != 0)
      {
        i = 1;
        int m = getChildCount();
        j = 0;
        label53:
        if (j >= m) {
          break label95;
        }
        if (i == 0) {
          break label89;
        }
      }
      label89:
      for (int k = 2;; k = 0)
      {
        z.a(getChildAt(j), k, null);
        j += 1;
        break label53;
        i = 0;
        break;
      }
    }
    label95:
    if (this.yr != null) {
      this.yr.W(paramInt);
    }
    GMTrace.o(1861197234176L, 13867);
  }
  
  public final void Y(int paramInt)
  {
    GMTrace.i(1861599887360L, 13870);
    this.xY = false;
    if (!this.ym) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramInt, bool, false);
      GMTrace.o(1861599887360L, 13870);
      return;
    }
  }
  
  public void a(u paramu)
  {
    GMTrace.i(1861331451904L, 13868);
    if (this.xH != null)
    {
      this.xH.unregisterDataSetObserver(this.xeu);
      int i = 0;
      while (i < this.dw.size())
      {
        b localb = (b)this.dw.get(i);
        this.xH.a(this, localb.position, localb.yA);
        i += 1;
      }
      this.xH.ba();
      this.dw.clear();
      int j;
      for (i = 0; i < getChildCount(); i = j + 1)
      {
        j = i;
        if (!((LayoutParams)getChildAt(i).getLayoutParams()).yE)
        {
          removeViewAt(i);
          j = i - 1;
        }
      }
      this.xI = 0;
      scrollTo(0, 0);
    }
    this.xH = paramu;
    this.xD = 0;
    if (this.xH != null)
    {
      if (this.xeu == null) {
        this.xeu = new d((byte)0);
      }
      this.xH.registerDataSetObserver(this.xeu);
      this.xY = false;
      boolean bool = this.ym;
      this.ym = true;
      this.xD = this.xH.getCount();
      if (this.xJ >= 0)
      {
        this.xH.a(this.xK, this.xL);
        a(this.xJ, false, true);
        this.xJ = -1;
        this.xK = null;
        this.xL = null;
        GMTrace.o(1861331451904L, 13868);
        return;
      }
      if (!bool)
      {
        populate();
        GMTrace.o(1861331451904L, 13868);
        return;
      }
      requestLayout();
    }
    GMTrace.o(1861331451904L, 13868);
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    GMTrace.i(1868310773760L, 13920);
    Assert.assertNotNull(paramArrayList);
    int j = paramArrayList.size();
    int k = getDescendantFocusability();
    if (k != 393216)
    {
      int i = 0;
      while (i < getChildCount())
      {
        View localView = getChildAt(i);
        if (localView.getVisibility() == 0)
        {
          b localb = dD(localView);
          if ((localb != null) && (localb.position == this.xI)) {
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
        i += 1;
      }
    }
    if ((k != 262144) || (j == paramArrayList.size()))
    {
      if (!isFocusable())
      {
        GMTrace.o(1868310773760L, 13920);
        return;
      }
      if (((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode()))
      {
        GMTrace.o(1868310773760L, 13920);
        return;
      }
      paramArrayList.add(this);
    }
    GMTrace.o(1868310773760L, 13920);
  }
  
  public void addTouchables(ArrayList<View> paramArrayList)
  {
    GMTrace.i(1868444991488L, 13921);
    int i = 0;
    while (i < getChildCount())
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        b localb = dD(localView);
        if ((localb != null) && (localb.position == this.xI)) {
          localView.addTouchables(paramArrayList);
        }
      }
      i += 1;
    }
    GMTrace.o(1868444991488L, 13921);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(1864015806464L, 13888);
    if (!checkLayoutParams(paramLayoutParams)) {
      paramLayoutParams = generateLayoutParams(paramLayoutParams);
    }
    for (;;)
    {
      Assert.assertNotNull(paramLayoutParams);
      LayoutParams localLayoutParams = (LayoutParams)paramLayoutParams;
      localLayoutParams.yE |= paramView instanceof a;
      if (this.ou)
      {
        if (localLayoutParams.yE) {
          throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        localLayoutParams.yF = true;
        addViewInLayout(paramView, paramInt, paramLayoutParams);
        GMTrace.o(1864015806464L, 13888);
        return;
      }
      super.addView(paramView, paramInt, paramLayoutParams);
      GMTrace.o(1864015806464L, 13888);
      return;
    }
  }
  
  public void b(ViewPager.e parame)
  {
    GMTrace.i(1862270976000L, 13875);
    this.yr = parame;
    GMTrace.o(1862270976000L, 13875);
  }
  
  final void bP()
  {
    GMTrace.i(1863076282368L, 13881);
    int i2 = this.xH.getCount();
    this.xD = i2;
    int i;
    int j;
    int k;
    int n;
    int m;
    label76:
    Object localObject;
    if ((this.dw.size() < this.xZ * 2 + 1) && (this.dw.size() < i2))
    {
      i = 1;
      j = this.xI;
      k = 0;
      n = 0;
      m = i;
      i = j;
      j = k;
      k = n;
      if (k >= this.dw.size()) {
        break label279;
      }
      localObject = (b)this.dw.get(k);
      n = this.xH.j(((b)localObject).yA);
      if (n == -1) {
        break label372;
      }
      if (n != -2) {
        break label227;
      }
      this.dw.remove(k);
      m = k - 1;
      k = j;
      if (j == 0) {
        k = 1;
      }
      this.xH.a(this, ((b)localObject).position, ((b)localObject).yA);
      if (this.xI != ((b)localObject).position) {
        break label393;
      }
      j = Math.max(0, Math.min(this.xI, i2 - 1));
      i = k;
      k = 1;
    }
    for (;;)
    {
      n = k;
      int i1 = j;
      k = m + 1;
      j = i;
      i = i1;
      m = n;
      break label76;
      i = 0;
      break;
      label227:
      if (((b)localObject).position != n)
      {
        if (((b)localObject).position == this.xI) {
          i = n;
        }
        ((b)localObject).position = n;
        n = i;
        i1 = 1;
        m = k;
        i = j;
        j = n;
        k = i1;
        continue;
        label279:
        if (j != 0) {
          this.xH.ba();
        }
        Collections.sort(this.dw, xE);
        if (m != 0)
        {
          k = getChildCount();
          j = 0;
          while (j < k)
          {
            localObject = (LayoutParams)getChildAt(j).getLayoutParams();
            if (!((LayoutParams)localObject).yE) {
              ((LayoutParams)localObject).yC = 0.0F;
            }
            j += 1;
          }
          a(i, false, true);
          requestLayout();
        }
        GMTrace.o(1863076282368L, 13881);
      }
      else
      {
        label372:
        n = i;
        i1 = m;
        m = k;
        i = j;
        j = n;
        k = i1;
        continue;
        label393:
        j = i;
        n = 1;
        i = k;
        k = n;
      }
    }
  }
  
  public final void c(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(1861734105088L, 13871);
    this.xY = false;
    a(paramInt, paramBoolean, false);
    GMTrace.o(1861734105088L, 13871);
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    GMTrace.i(1867371249664L, 13913);
    if (this.xH == null)
    {
      GMTrace.o(1867371249664L, 13913);
      return false;
    }
    int i = bO();
    int j = getScrollX();
    if (paramInt < 0)
    {
      if (j > (int)(i * this.xT))
      {
        GMTrace.o(1867371249664L, 13913);
        return true;
      }
      GMTrace.o(1867371249664L, 13913);
      return false;
    }
    if (paramInt > 0)
    {
      if (j < (int)(i * this.xU))
      {
        GMTrace.o(1867371249664L, 13913);
        return true;
      }
      GMTrace.o(1867371249664L, 13913);
      return false;
    }
    GMTrace.o(1867371249664L, 13913);
    return false;
  }
  
  public int caw()
  {
    GMTrace.i(1866431725568L, 13906);
    int i = ((b)this.dw.get(0)).position;
    GMTrace.o(1866431725568L, 13906);
    return i;
  }
  
  public int cax()
  {
    GMTrace.i(1866565943296L, 13907);
    int i = ((b)this.dw.get(this.dw.size() - 1)).position;
    GMTrace.o(1866565943296L, 13907);
    return i;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(1869116080128L, 13926);
    if (((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams)))
    {
      GMTrace.o(1869116080128L, 13926);
      return true;
    }
    GMTrace.o(1869116080128L, 13926);
    return false;
  }
  
  public void computeScroll()
  {
    GMTrace.i(1865357983744L, 13898);
    if ((!this.xM.isFinished()) && (this.xM.computeScrollOffset()))
    {
      int i = getScrollX();
      int j = getScrollY();
      int k = this.xM.getCurrX();
      int m = this.xM.getCurrY();
      if ((i != k) || (j != m))
      {
        scrollTo(k, m);
        if (!ab(k))
        {
          this.xM.abortAnimation();
          scrollTo(0, m);
        }
      }
      z.F(this);
      GMTrace.o(1865357983744L, 13898);
      return;
    }
    r(true);
    GMTrace.o(1865357983744L, 13898);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(1867639685120L, 13915);
    boolean bool;
    if (!super.dispatchKeyEvent(paramKeyEvent))
    {
      if (paramKeyEvent.getAction() == 0) {}
      switch (paramKeyEvent.getKeyCode())
      {
      default: 
        bool = false;
      }
    }
    for (;;)
    {
      if (!bool) {
        break label142;
      }
      GMTrace.o(1867639685120L, 13915);
      return true;
      bool = arrowScroll(17);
      continue;
      bool = arrowScroll(66);
      continue;
      if (Build.VERSION.SDK_INT < 11) {
        break;
      }
      if (g.a(paramKeyEvent))
      {
        bool = arrowScroll(2);
      }
      else
      {
        if (!g.a(paramKeyEvent, 1)) {
          break;
        }
        bool = arrowScroll(1);
      }
    }
    label142:
    GMTrace.o(1867639685120L, 13915);
    return false;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(1868713426944L, 13923);
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      boolean bool = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      GMTrace.o(1868713426944L, 13923);
      return bool;
    }
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        b localb = dD(localView);
        if ((localb != null) && (localb.position == this.xI) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent)))
        {
          GMTrace.o(1868713426944L, 13923);
          return true;
        }
      }
      i += 1;
    }
    GMTrace.o(1868713426944L, 13923);
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(1866700161024L, 13908);
    super.draw(paramCanvas);
    int k = 0;
    int i = 0;
    int m = z.C(this);
    boolean bool;
    if ((m == 0) || ((m == 1) && (this.xH != null) && (this.xH.getCount() > 1)))
    {
      int j;
      if (!this.yk.isFinished())
      {
        k = paramCanvas.save();
        i = getHeight() - getPaddingTop() - getPaddingBottom();
        m = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-i + getPaddingTop(), this.xT * m);
        this.yk.setSize(i, m);
        j = this.yk.draw(paramCanvas) | false;
        paramCanvas.restoreToCount(k);
      }
      k = j;
      if (!this.yl.isFinished())
      {
        m = paramCanvas.save();
        k = getWidth();
        int n = getHeight();
        int i1 = getPaddingTop();
        int i2 = getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(this.xU + 1.0F) * k);
        this.yl.setSize(n - i1 - i2, k);
        bool = j | this.yl.draw(paramCanvas);
        paramCanvas.restoreToCount(m);
      }
    }
    for (;;)
    {
      if (bool) {
        z.F(this);
      }
      GMTrace.o(1866700161024L, 13908);
      return;
      this.yk.finish();
      this.yl.finish();
    }
  }
  
  protected void drawableStateChanged()
  {
    GMTrace.i(1862807846912L, 13879);
    super.drawableStateChanged();
    Drawable localDrawable = this.xQ;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      localDrawable.setState(getDrawableState());
    }
    GMTrace.o(1862807846912L, 13879);
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    GMTrace.i(1868847644672L, 13924);
    LayoutParams localLayoutParams = new LayoutParams();
    GMTrace.o(1868847644672L, 13924);
    return localLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    GMTrace.i(1869250297856L, 13927);
    paramAttributeSet = new LayoutParams(getContext(), paramAttributeSet);
    GMTrace.o(1869250297856L, 13927);
    return paramAttributeSet;
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(1868981862400L, 13925);
    paramLayoutParams = generateDefaultLayoutParams();
    GMTrace.o(1868981862400L, 13925);
    return paramLayoutParams;
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    GMTrace.i(1862405193728L, 13876);
    int i = paramInt2;
    if (this.yv == 2) {
      i = paramInt1 - 1 - paramInt2;
    }
    paramInt1 = ((LayoutParams)((View)this.yw.get(i)).getLayoutParams()).yG;
    GMTrace.o(1862405193728L, 13876);
    return paramInt1;
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(1864686895104L, 13893);
    super.onAttachedToWindow();
    this.ym = true;
    GMTrace.o(1864686895104L, 13893);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(1861063016448L, 13866);
    removeCallbacks(this.yy);
    super.onDetachedFromWindow();
    GMTrace.o(1861063016448L, 13866);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(1866834378752L, 13909);
    super.onDraw(paramCanvas);
    if ((this.xP > 0) && (this.xQ != null) && (this.dw.size() > 0) && (this.xH != null))
    {
      int k = getScrollX();
      int m = getWidth();
      float f3 = this.xP / m;
      Object localObject = (b)this.dw.get(0);
      float f1 = ((b)localObject).yD;
      int n = this.dw.size();
      int i = ((b)localObject).position;
      int i1 = ((b)this.dw.get(n - 1)).position;
      int j = 0;
      if (i < i1)
      {
        while ((i > ((b)localObject).position) && (j < n))
        {
          localObject = this.dw;
          j += 1;
          localObject = (b)((ArrayList)localObject).get(j);
        }
        float f2;
        if (i == ((b)localObject).position) {
          f2 = (((b)localObject).yD + ((b)localObject).yC) * m;
        }
        for (f1 = ((b)localObject).yD + ((b)localObject).yC + f3;; f1 += 1.0F + f3)
        {
          if (this.xP + f2 > k)
          {
            this.xQ.setBounds((int)f2, this.xR, (int)(this.xP + f2 + 0.5F), this.xS);
            this.xQ.draw(paramCanvas);
          }
          if (f2 > k + m) {
            break label306;
          }
          i += 1;
          break;
          f2 = (1.0F + f1) * m;
        }
      }
    }
    label306:
    GMTrace.o(1866834378752L, 13909);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1865894854656L, 13902);
    int i = paramMotionEvent.getAction() & 0xFF;
    if ((i == 3) || (i == 1))
    {
      this.hO = false;
      this.ya = false;
      this.eA = -1;
      if (this.ez != null)
      {
        this.ez.recycle();
        this.ez = null;
      }
      GMTrace.o(1865894854656L, 13902);
      return false;
    }
    if (i != 0)
    {
      if (this.hO)
      {
        GMTrace.o(1865894854656L, 13902);
        return true;
      }
      if (this.ya)
      {
        GMTrace.o(1865894854656L, 13902);
        return false;
      }
    }
    switch (i)
    {
    }
    for (;;)
    {
      if (this.ez == null) {
        this.ez = VelocityTracker.obtain();
      }
      this.ez.addMovement(paramMotionEvent);
      boolean bool = this.hO;
      GMTrace.o(1865894854656L, 13902);
      return bool;
      i = this.eA;
      if (i != -1)
      {
        i = o.b(paramMotionEvent, i);
        float f2 = o.d(paramMotionEvent, i);
        float f1 = f2 - this.yd;
        float f4 = Math.abs(f1);
        float f3 = o.e(paramMotionEvent, i);
        float f5 = Math.abs(f3 - this.wT);
        if (f1 != 0.0F)
        {
          float f6 = this.yd;
          if (((f6 < this.yc) && (f1 > 0.0F)) || ((f6 > getWidth() - this.yc) && (f1 < 0.0F))) {}
          for (i = 1; (i == 0) && (a(this, false, (int)f1, (int)f2, (int)f3)); i = 0)
          {
            this.yd = f2;
            this.ye = f3;
            this.ya = true;
            GMTrace.o(1865894854656L, 13902);
            return false;
          }
        }
        if ((f4 > this.hQ) && (0.5F * f4 > f5))
        {
          this.hO = true;
          X(1);
          if (f1 > 0.0F)
          {
            f1 = this.wS + this.hQ;
            label410:
            this.yd = f1;
            this.ye = f3;
            setScrollingCacheEnabled(true);
          }
        }
        while ((this.hO) && (o(f2)))
        {
          z.F(this);
          break;
          f1 = this.wS - this.hQ;
          break label410;
          if (f5 > this.hQ) {
            this.ya = true;
          }
        }
        f1 = paramMotionEvent.getX();
        this.wS = f1;
        this.yd = f1;
        f1 = paramMotionEvent.getY();
        this.wT = f1;
        this.ye = f1;
        this.eA = o.c(paramMotionEvent, 0);
        this.ya = false;
        this.xM.computeScrollOffset();
        if ((this.xl == 2) && (Math.abs(this.xM.getFinalX() - this.xM.getCurrX()) > this.yi))
        {
          this.xM.abortAnimation();
          this.xY = false;
          populate();
          this.hO = true;
          X(1);
        }
        else
        {
          r(false);
          this.hO = false;
          continue;
          h(paramMotionEvent);
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1865223766016L, 13897);
    int i1 = getChildCount();
    int i3 = paramInt3 - paramInt1;
    int i2 = paramInt4 - paramInt2;
    paramInt2 = getPaddingLeft();
    paramInt1 = getPaddingTop();
    int i = getPaddingRight();
    paramInt3 = getPaddingBottom();
    int i4 = getScrollX();
    int j = 0;
    int m = 0;
    View localView;
    LayoutParams localLayoutParams;
    int i5;
    int k;
    label162:
    int n;
    if (m < i1)
    {
      localView = getChildAt(m);
      if (localView.getVisibility() == 8) {
        break label688;
      }
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (!localLayoutParams.yE) {
        break label688;
      }
      paramInt4 = localLayoutParams.gravity;
      i5 = localLayoutParams.gravity;
      switch (paramInt4 & 0x7)
      {
      case 2: 
      case 4: 
      default: 
        paramInt4 = paramInt2;
        k = paramInt2;
        switch (i5 & 0x70)
        {
        default: 
          n = paramInt1;
          paramInt2 = paramInt1;
          paramInt1 = paramInt3;
          paramInt3 = n;
          label212:
          paramInt4 += i4;
          localView.layout(paramInt4, paramInt3, localView.getMeasuredWidth() + paramInt4, localView.getMeasuredHeight() + paramInt3);
          j += 1;
          paramInt4 = i;
          paramInt3 = k;
          i = paramInt1;
          paramInt1 = j;
        }
        break;
      }
    }
    for (;;)
    {
      m += 1;
      k = paramInt3;
      j = paramInt1;
      paramInt1 = paramInt2;
      paramInt3 = i;
      i = paramInt4;
      paramInt2 = k;
      break;
      k = localView.getMeasuredWidth();
      paramInt4 = paramInt2;
      k += paramInt2;
      break label162;
      paramInt4 = Math.max((i3 - localView.getMeasuredWidth()) / 2, paramInt2);
      k = paramInt2;
      break label162;
      k = localView.getMeasuredWidth();
      paramInt4 = i + localView.getMeasuredWidth();
      n = i3 - i - k;
      i = paramInt4;
      k = paramInt2;
      paramInt4 = n;
      break label162;
      n = localView.getMeasuredHeight();
      paramInt2 = paramInt3;
      n += paramInt1;
      paramInt3 = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = n;
      break label212;
      n = Math.max((i2 - localView.getMeasuredHeight()) / 2, paramInt1);
      paramInt2 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = n;
      break label212;
      n = i2 - paramInt3 - localView.getMeasuredHeight();
      i5 = localView.getMeasuredHeight();
      paramInt2 = paramInt1;
      paramInt1 = paramInt3 + i5;
      paramInt3 = n;
      break label212;
      i = i3 - paramInt2 - i;
      paramInt4 = 0;
      while (paramInt4 < i1)
      {
        localView = getChildAt(paramInt4);
        if (localView.getVisibility() != 8)
        {
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.yE)
          {
            b localb = dD(localView);
            if (localb != null)
            {
              float f = i;
              k = (int)(localb.yD * f) + paramInt2;
              if (localLayoutParams.yF)
              {
                localLayoutParams.yF = false;
                f = i;
                localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localLayoutParams.yC * f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2 - paramInt1 - paramInt3, 1073741824));
              }
              localView.layout(k, paramInt1, localView.getMeasuredWidth() + k, localView.getMeasuredHeight() + paramInt1);
            }
          }
        }
        paramInt4 += 1;
      }
      this.xR = paramInt1;
      this.xS = (i2 - paramInt3);
      this.yp = j;
      if (this.ym) {
        a(this.xI, false, 0, false);
      }
      this.ym = false;
      GMTrace.o(1865223766016L, 13897);
      return;
      label688:
      paramInt4 = j;
      j = paramInt1;
      k = paramInt2;
      paramInt1 = paramInt4;
      paramInt4 = i;
      i = paramInt3;
      paramInt2 = j;
      paramInt3 = k;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1864821112832L, 13894);
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    paramInt1 = getMeasuredWidth();
    this.yc = Math.min(paramInt1 / 10, this.yb);
    paramInt1 = paramInt1 - getPaddingLeft() - getPaddingRight();
    paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i4 = getChildCount();
    int k = 0;
    View localView;
    int i;
    int j;
    LayoutParams localLayoutParams;
    int m;
    int i1;
    label192:
    int n;
    if (k < i4)
    {
      localView = getChildAt(k);
      i = paramInt1;
      j = paramInt2;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        i = paramInt1;
        j = paramInt2;
        if (localLayoutParams != null)
        {
          i = paramInt1;
          j = paramInt2;
          if (localLayoutParams.yE)
          {
            i = localLayoutParams.gravity & 0x7;
            m = localLayoutParams.gravity & 0x70;
            i1 = Integer.MIN_VALUE;
            j = Integer.MIN_VALUE;
            if ((m != 48) && (m != 80)) {
              break label342;
            }
            m = 1;
            if ((i != 3) && (i != 5)) {
              break label348;
            }
            n = 1;
            label207:
            if (m == 0) {
              break label354;
            }
            i = 1073741824;
            label217:
            if (localLayoutParams.width == -2) {
              break label551;
            }
            i1 = 1073741824;
            if (localLayoutParams.width == -1) {
              break label545;
            }
            i = localLayoutParams.width;
          }
        }
      }
    }
    for (;;)
    {
      int i3;
      if (localLayoutParams.height != -2)
      {
        i2 = 1073741824;
        j = i2;
        if (localLayoutParams.height != -1)
        {
          i3 = localLayoutParams.height;
          j = i2;
        }
      }
      for (int i2 = i3;; i2 = paramInt2)
      {
        localView.measure(View.MeasureSpec.makeMeasureSpec(i, i1), View.MeasureSpec.makeMeasureSpec(i2, j));
        if (m != 0)
        {
          j = paramInt2 - localView.getMeasuredHeight();
          i = paramInt1;
        }
        for (;;)
        {
          k += 1;
          paramInt1 = i;
          paramInt2 = j;
          break;
          label342:
          m = 0;
          break label192;
          label348:
          n = 0;
          break label207;
          label354:
          i = i1;
          if (n == 0) {
            break label217;
          }
          j = 1073741824;
          i = i1;
          break label217;
          i = paramInt1;
          j = paramInt2;
          if (n != 0)
          {
            i = paramInt1 - localView.getMeasuredWidth();
            j = paramInt2;
          }
        }
        this.xV = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
        this.xW = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
        this.ou = true;
        populate();
        this.ou = false;
        i = getChildCount();
        paramInt2 = 0;
        while (paramInt2 < i)
        {
          localView = getChildAt(paramInt2);
          if (localView.getVisibility() != 8)
          {
            localLayoutParams = (LayoutParams)localView.getLayoutParams();
            if (((localLayoutParams == null) || (!localLayoutParams.yE)) && (localLayoutParams != null))
            {
              float f = paramInt1;
              localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localLayoutParams.yC * f), 1073741824), this.xW);
            }
          }
          paramInt2 += 1;
        }
        GMTrace.o(1864821112832L, 13894);
        return;
      }
      label545:
      i = paramInt1;
      continue;
      label551:
      i1 = i;
      i = paramInt1;
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int j = -1;
    GMTrace.i(1868579209216L, 13922);
    int k = getChildCount();
    int i;
    if ((paramInt & 0x2) != 0)
    {
      j = 1;
      i = 0;
    }
    while (i != k)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        b localb = dD(localView);
        if ((localb != null) && (localb.position == this.xI) && (localView.requestFocus(paramInt, paramRect)))
        {
          GMTrace.o(1868579209216L, 13922);
          return true;
          i = k - 1;
          k = -1;
          continue;
        }
      }
      i += j;
    }
    GMTrace.o(1868579209216L, 13922);
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GMTrace.i(1863881588736L, 13887);
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      GMTrace.o(1863881588736L, 13887);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (this.xH != null)
    {
      this.xH.a(paramParcelable.yH, paramParcelable.yI);
      a(paramParcelable.position, false, true);
      GMTrace.o(1863881588736L, 13887);
      return;
    }
    this.xJ = paramParcelable.position;
    this.xK = paramParcelable.yH;
    this.xL = paramParcelable.yI;
    GMTrace.o(1863881588736L, 13887);
  }
  
  public Parcelable onSaveInstanceState()
  {
    GMTrace.i(1863747371008L, 13886);
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.position = this.xI;
    if (this.xH != null) {
      localSavedState.yH = this.xH.bb();
    }
    GMTrace.o(1863747371008L, 13886);
    return localSavedState;
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1864955330560L, 13895);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      v(paramInt1, paramInt3, this.xP, this.xP);
    }
    GMTrace.o(1864955330560L, 13895);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int n = 0;
    GMTrace.i(1866029072384L, 13903);
    if (this.yj)
    {
      GMTrace.o(1866029072384L, 13903);
      return true;
    }
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
    {
      GMTrace.o(1866029072384L, 13903);
      return false;
    }
    if ((this.xH == null) || (this.xH.getCount() == 0))
    {
      GMTrace.o(1866029072384L, 13903);
      return false;
    }
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    this.ez.addMovement(paramMotionEvent);
    int i = n;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default: 
      i = n;
    }
    for (;;)
    {
      if (i != 0) {
        z.F(this);
      }
      GMTrace.o(1866029072384L, 13903);
      return true;
      this.xM.abortAnimation();
      this.xY = false;
      populate();
      this.hO = true;
      X(1);
      float f1 = paramMotionEvent.getX();
      this.wS = f1;
      this.yd = f1;
      f1 = paramMotionEvent.getY();
      this.wT = f1;
      this.ye = f1;
      this.eA = o.c(paramMotionEvent, 0);
      i = n;
      continue;
      float f2;
      if (!this.hO)
      {
        i = o.b(paramMotionEvent, this.eA);
        f1 = o.d(paramMotionEvent, i);
        float f3 = Math.abs(f1 - this.yd);
        f2 = o.e(paramMotionEvent, i);
        float f4 = Math.abs(f2 - this.ye);
        if ((f3 > this.hQ) && (f3 > f4))
        {
          this.hO = true;
          if (f1 - this.wS <= 0.0F) {
            break label409;
          }
        }
      }
      label409:
      for (f1 = this.wS + this.hQ;; f1 = this.wS - this.hQ)
      {
        this.yd = f1;
        this.ye = f2;
        X(1);
        setScrollingCacheEnabled(true);
        i = n;
        if (!this.hO) {
          break;
        }
        bool1 = o(o.d(paramMotionEvent, o.b(paramMotionEvent, this.eA))) | false;
        break;
      }
      boolean bool1 = n;
      if (this.hO)
      {
        Object localObject = this.ez;
        ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.yg);
        int i2 = (int)y.a((VelocityTracker)localObject, this.eA);
        this.xY = true;
        int j = bO();
        int i1 = getScrollX();
        localObject = chR();
        if (localObject != null)
        {
          n = ((b)localObject).position;
          f2 = (i1 / j - ((b)localObject).yD) / ((b)localObject).yC;
          i1 = o.b(paramMotionEvent, this.eA);
          j = i1;
          if (i1 < 0) {
            j = 0;
          }
          if ((Math.abs((int)(o.d(paramMotionEvent, j) - this.wS)) <= this.yh) || (Math.abs(i2) <= this.yf)) {
            break label669;
          }
          if (i2 <= 0) {
            break label660;
          }
        }
        boolean bool4;
        label660:
        for (j = n;; k = n + 1)
        {
          n = j;
          if (this.dw.size() > 0) {
            n = Math.max(caw(), Math.min(j, cax()));
          }
          a(n, true, true, i2);
          this.eA = -1;
          cy();
          bool4 = this.yk.cq();
          boolean bool2 = this.yl.cq() | bool4;
          break;
        }
        label669:
        if (n >= this.xI) {}
        for (f1 = 0.6F;; f1 = 0.4F)
        {
          k = (int)(f1 + (n + f2));
          break;
        }
        int k = n;
        if (this.hO)
        {
          a(this.xI, true, 0, false);
          this.eA = -1;
          cy();
          bool4 = this.yk.cq();
          boolean bool3 = this.yl.cq() | bool4;
          continue;
          int m = o.e(paramMotionEvent);
          this.yd = o.d(paramMotionEvent, m);
          this.eA = o.c(paramMotionEvent, m);
          m = n;
          continue;
          h(paramMotionEvent);
          this.yd = o.d(paramMotionEvent, o.b(paramMotionEvent, this.eA));
          m = n;
        }
      }
    }
  }
  
  final void populate()
  {
    GMTrace.i(1863210500096L, 13882);
    Z(this.xI);
    GMTrace.o(1863210500096L, 13882);
  }
  
  public void removeView(View paramView)
  {
    GMTrace.i(1864150024192L, 13889);
    if (this.ou)
    {
      removeViewInLayout(paramView);
      GMTrace.o(1864150024192L, 13889);
      return;
    }
    super.removeView(paramView);
    GMTrace.o(1864150024192L, 13889);
  }
  
  public final void v(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1865089548288L, 13896);
    if ((paramInt2 > 0) && (!this.dw.isEmpty()))
    {
      int i = getPaddingLeft();
      int j = getPaddingRight();
      int k = getPaddingLeft();
      int m = getPaddingRight();
      f = getScrollX() / (paramInt2 - k - m + paramInt4);
      paramInt2 = (int)((paramInt1 - i - j + paramInt3) * f);
      scrollTo(paramInt2, getScrollY());
      if (!this.xM.isFinished())
      {
        paramInt3 = this.xM.getDuration();
        paramInt4 = this.xM.timePassed();
        localb = DV(this.xI);
        if (localb != null) {
          this.xM.startScroll(paramInt2, 0, (int)(localb.yD * paramInt1), 0, paramInt3 - paramInt4);
        }
      }
      GMTrace.o(1865089548288L, 13896);
      return;
    }
    b localb = DV(this.xI);
    if (localb != null) {}
    for (float f = Math.min(localb.yD, this.xU);; f = 0.0F)
    {
      paramInt1 = (int)(f * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 != getScrollX())
      {
        r(false);
        scrollTo(paramInt1, getScrollY());
      }
      GMTrace.o(1865089548288L, 13896);
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    GMTrace.i(1862673629184L, 13878);
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.xQ))
    {
      GMTrace.o(1862673629184L, 13878);
      return true;
    }
    GMTrace.o(1862673629184L, 13878);
    return false;
  }
  
  public static class LayoutParams
    extends ViewGroup.LayoutParams
  {
    public int gravity;
    int position;
    float yC;
    public boolean yE;
    boolean yF;
    int yG;
    
    public LayoutParams()
    {
      super(-1);
      GMTrace.i(1854754783232L, 13819);
      this.yC = 0.0F;
      GMTrace.o(1854754783232L, 13819);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      GMTrace.i(1854889000960L, 13820);
      this.yC = 0.0F;
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, WxViewPager.bW());
      this.gravity = paramContext.getInteger(0, 48);
      paramContext.recycle();
      GMTrace.o(1854889000960L, 13820);
    }
  }
  
  public static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR;
    int position;
    Parcelable yH;
    ClassLoader yI;
    
    static
    {
      GMTrace.i(1860257710080L, 13860);
      CREATOR = android.support.v4.os.b.a(new c() {});
      GMTrace.o(1860257710080L, 13860);
    }
    
    SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super();
      GMTrace.i(1860123492352L, 13859);
      ClassLoader localClassLoader = paramClassLoader;
      if (paramClassLoader == null) {
        localClassLoader = getClass().getClassLoader();
      }
      this.position = paramParcel.readInt();
      this.yH = paramParcel.readParcelable(localClassLoader);
      this.yI = localClassLoader;
      GMTrace.o(1860123492352L, 13859);
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
      GMTrace.i(1859720839168L, 13856);
      GMTrace.o(1859720839168L, 13856);
    }
    
    public String toString()
    {
      GMTrace.i(1859989274624L, 13858);
      String str = "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
      GMTrace.o(1859989274624L, 13858);
      return str;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(1859855056896L, 13857);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.position);
      paramParcel.writeParcelable(this.yH, paramInt);
      GMTrace.o(1859855056896L, 13857);
    }
  }
  
  static abstract interface a {}
  
  static final class b
  {
    int position;
    Object yA;
    boolean yB;
    float yC;
    float yD;
    
    b()
    {
      GMTrace.i(1870995128320L, 13940);
      GMTrace.o(1870995128320L, 13940);
    }
  }
  
  final class c
    extends a
  {
    c()
    {
      GMTrace.i(1855291654144L, 13823);
      GMTrace.o(1855291654144L, 13823);
    }
    
    private boolean bX()
    {
      GMTrace.i(1855828525056L, 13827);
      if ((WxViewPager.b(WxViewPager.this) != null) && (WxViewPager.b(WxViewPager.this).getCount() > 1))
      {
        GMTrace.o(1855828525056L, 13827);
        return true;
      }
      GMTrace.o(1855828525056L, 13827);
      return false;
    }
    
    public final void a(View paramView, android.support.v4.view.a.b paramb)
    {
      GMTrace.i(1855560089600L, 13825);
      super.a(paramView, paramb);
      paramb.setClassName(WxViewPager.class.getName());
      paramb.setScrollable(bX());
      if (WxViewPager.this.canScrollHorizontally(1)) {
        paramb.addAction(4096);
      }
      if (WxViewPager.this.canScrollHorizontally(-1)) {
        paramb.addAction(8192);
      }
      GMTrace.o(1855560089600L, 13825);
    }
    
    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      GMTrace.i(1855425871872L, 13824);
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(WxViewPager.class.getName());
      paramView = f.cg();
      paramView.setScrollable(bX());
      if ((paramAccessibilityEvent.getEventType() == 4096) && (WxViewPager.b(WxViewPager.this) != null))
      {
        paramView.setItemCount(WxViewPager.b(WxViewPager.this).getCount());
        paramView.setFromIndex(WxViewPager.c(WxViewPager.this));
        paramView.setToIndex(WxViewPager.c(WxViewPager.this));
      }
      GMTrace.o(1855425871872L, 13824);
    }
    
    public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      GMTrace.i(1855694307328L, 13826);
      if (super.performAccessibilityAction(paramView, paramInt, paramBundle))
      {
        GMTrace.o(1855694307328L, 13826);
        return true;
      }
      switch (paramInt)
      {
      default: 
        GMTrace.o(1855694307328L, 13826);
        return false;
      case 4096: 
        if (WxViewPager.this.canScrollHorizontally(1))
        {
          WxViewPager.this.Y(WxViewPager.c(WxViewPager.this) + 1);
          GMTrace.o(1855694307328L, 13826);
          return true;
        }
        GMTrace.o(1855694307328L, 13826);
        return false;
      }
      if (WxViewPager.this.canScrollHorizontally(-1))
      {
        WxViewPager.this.Y(WxViewPager.c(WxViewPager.this) - 1);
        GMTrace.o(1855694307328L, 13826);
        return true;
      }
      GMTrace.o(1855694307328L, 13826);
      return false;
    }
  }
  
  private final class d
    extends DataSetObserver
  {
    private d()
    {
      GMTrace.i(1871129346048L, 13941);
      GMTrace.o(1871129346048L, 13941);
    }
    
    public final void onChanged()
    {
      GMTrace.i(1871263563776L, 13942);
      WxViewPager.this.bP();
      GMTrace.o(1871263563776L, 13942);
    }
    
    public final void onInvalidated()
    {
      GMTrace.i(1871397781504L, 13943);
      WxViewPager.this.bP();
      GMTrace.o(1871397781504L, 13943);
    }
  }
  
  static final class e
    implements Comparator<View>
  {
    e()
    {
      GMTrace.i(1860391927808L, 13861);
      GMTrace.o(1860391927808L, 13861);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\mogic\WxViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
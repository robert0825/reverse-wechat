package android.support.v4.view;

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
import android.support.v4.view.a.f;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager
  extends ViewGroup
{
  private static final int[] xC = { 16842931 };
  private static final Comparator<b> xE = new Comparator() {};
  private static final Interpolator xF = new Interpolator()
  {
    public final float getInterpolation(float paramAnonymousFloat)
    {
      paramAnonymousFloat -= 1.0F;
      return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
    }
  };
  private static final i yx = new i();
  private final Rect dF = new Rect();
  private final ArrayList<b> dw = new ArrayList();
  private int eA = -1;
  private VelocityTracker ez;
  private boolean hO;
  private int hQ;
  private boolean ou;
  private float wS;
  private float wT;
  private int xD;
  private final b xG = new b();
  u xH;
  public int xI;
  private int xJ = -1;
  private Parcelable xK = null;
  private ClassLoader xL = null;
  private Scroller xM;
  private boolean xN;
  private g xO;
  private int xP;
  private Drawable xQ;
  private int xR;
  private int xS;
  private float xT = -3.4028235E38F;
  private float xU = Float.MAX_VALUE;
  private int xV;
  private int xW;
  private boolean xX;
  private boolean xY;
  public int xZ = 1;
  private int xl = 0;
  private boolean ya;
  private int yb;
  private int yc;
  private float yd;
  private float ye;
  private int yf;
  private int yg;
  private int yh;
  private int yi;
  private boolean yj;
  private i yk;
  private i yl;
  private boolean ym = true;
  private boolean yn = false;
  private boolean yo;
  private int yp;
  public List<e> yq;
  public e yr;
  private e ys;
  d yt;
  private f yu;
  private int yv;
  private ArrayList<View> yw;
  private final Runnable yy = new Runnable()
  {
    public final void run()
    {
      ViewPager.a(ViewPager.this);
      ViewPager.this.populate();
    }
  };
  
  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
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
    z.b(this, new t()
    {
      private final Rect dF = new Rect();
      
      public final ap a(View paramAnonymousView, ap paramAnonymousap)
      {
        paramAnonymousView = z.a(paramAnonymousView, paramAnonymousap);
        if (paramAnonymousView.isConsumed()) {
          return paramAnonymousView;
        }
        paramAnonymousap = this.dF;
        paramAnonymousap.left = paramAnonymousView.getSystemWindowInsetLeft();
        paramAnonymousap.top = paramAnonymousView.getSystemWindowInsetTop();
        paramAnonymousap.right = paramAnonymousView.getSystemWindowInsetRight();
        paramAnonymousap.bottom = paramAnonymousView.getSystemWindowInsetBottom();
        int i = 0;
        int j = ViewPager.this.getChildCount();
        while (i < j)
        {
          ap localap = z.b(ViewPager.this.getChildAt(i), paramAnonymousView);
          paramAnonymousap.left = Math.min(localap.getSystemWindowInsetLeft(), paramAnonymousap.left);
          paramAnonymousap.top = Math.min(localap.getSystemWindowInsetTop(), paramAnonymousap.top);
          paramAnonymousap.right = Math.min(localap.getSystemWindowInsetRight(), paramAnonymousap.right);
          paramAnonymousap.bottom = Math.min(localap.getSystemWindowInsetBottom(), paramAnonymousap.bottom);
          i += 1;
        }
        return paramAnonymousView.e(paramAnonymousap.left, paramAnonymousap.top, paramAnonymousap.right, paramAnonymousap.bottom);
      }
    });
  }
  
  private void X(int paramInt)
  {
    int m = 0;
    if (this.xl == paramInt) {}
    label38:
    label74:
    label80:
    do
    {
      return;
      this.xl = paramInt;
      int i;
      int j;
      if (this.yu != null)
      {
        if (paramInt != 0)
        {
          i = 1;
          int n = getChildCount();
          j = 0;
          if (j >= n) {
            break label80;
          }
          if (i == 0) {
            break label74;
          }
        }
        for (int k = 2;; k = 0)
        {
          z.a(getChildAt(j), k, null);
          j += 1;
          break label38;
          i = 0;
          break;
        }
      }
      if (this.yr != null) {
        this.yr.W(paramInt);
      }
      if (this.yq != null)
      {
        j = this.yq.size();
        i = m;
        while (i < j)
        {
          e locale = (e)this.yq.get(i);
          if (locale != null) {
            locale.W(paramInt);
          }
          i += 1;
        }
      }
    } while (this.ys == null);
    this.ys.W(paramInt);
  }
  
  private void Z(int paramInt)
  {
    Object localObject2;
    if (this.xI != paramInt)
    {
      localObject2 = aa(this.xI);
      this.xI = paramInt;
    }
    for (;;)
    {
      if (this.xH == null) {
        bQ();
      }
      do
      {
        return;
        if (this.xY)
        {
          bQ();
          return;
        }
      } while (getWindowToken() == null);
      paramInt = this.xZ;
      int i2 = Math.max(0, this.xI - paramInt);
      int n = this.xH.getCount();
      int i1 = Math.min(n - 1, paramInt + this.xI);
      Object localObject1;
      if (n != this.xD) {
        try
        {
          String str = getResources().getResourceName(getId());
          throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.xD + ", found: " + n + " Pager id: " + str + " Pager class: " + getClass() + " Problematic adapter: " + this.xH.getClass());
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
            break label1230;
          }
        }
      }
      for (;;)
      {
        if ((localObject1 == null) && (n > 0)) {}
        for (Object localObject3 = k(this.xI, paramInt);; localObject3 = localObject1)
        {
          label310:
          int i3;
          float f2;
          label323:
          int i;
          float f3;
          int j;
          label345:
          float f1;
          if (localObject3 != null)
          {
            int m = paramInt - 1;
            int k;
            Object localObject4;
            if (m >= 0)
            {
              localObject1 = (b)this.dw.get(m);
              i3 = bO();
              if (i3 > 0) {
                break label507;
              }
              f2 = 0.0F;
              i = this.xI;
              f3 = 0.0F;
              k = i - 1;
              j = paramInt;
              localObject4 = localObject1;
              if (k < 0) {
                break label657;
              }
              if ((f3 < f2) || (k >= i2)) {
                break label537;
              }
              if (localObject4 == null) {
                break label657;
              }
              localObject1 = localObject4;
              paramInt = m;
              f1 = f3;
              i = j;
              if (k == ((b)localObject4).position)
              {
                localObject1 = localObject4;
                paramInt = m;
                f1 = f3;
                i = j;
                if (!((b)localObject4).yB)
                {
                  this.dw.remove(m);
                  this.xH.a(this, k, ((b)localObject4).yA);
                  paramInt = m - 1;
                  i = j - 1;
                  if (paramInt < 0) {
                    break label528;
                  }
                  localObject1 = (b)this.dw.get(paramInt);
                  f1 = f3;
                }
              }
            }
            for (;;)
            {
              k -= 1;
              localObject4 = localObject1;
              m = paramInt;
              f3 = f1;
              j = i;
              break label345;
              paramInt += 1;
              break;
              localObject1 = null;
              break label310;
              label507:
              f2 = 2.0F - ((b)localObject3).yC + getPaddingLeft() / i3;
              break label323;
              label528:
              localObject1 = null;
              f1 = f3;
              continue;
              label537:
              if ((localObject4 != null) && (k == ((b)localObject4).position))
              {
                f1 = f3 + ((b)localObject4).yC;
                paramInt = m - 1;
                if (paramInt >= 0)
                {
                  localObject1 = (b)this.dw.get(paramInt);
                  i = j;
                }
                else
                {
                  localObject1 = null;
                  i = j;
                }
              }
              else
              {
                f1 = f3 + k(k, m + 1).yC;
                i = j + 1;
                if (m >= 0)
                {
                  localObject1 = (b)this.dw.get(m);
                  paramInt = m;
                }
                else
                {
                  localObject1 = null;
                  paramInt = m;
                }
              }
            }
            label657:
            f1 = ((b)localObject3).yC;
            paramInt = j + 1;
            if (f1 < 2.0F) {
              if (paramInt < this.dw.size())
              {
                localObject1 = (b)this.dw.get(paramInt);
                label698:
                if (i3 > 0) {
                  break label823;
                }
                f2 = 0.0F;
                label705:
                i = this.xI;
                i += 1;
                label717:
                if (i >= n) {
                  break label966;
                }
                if ((f1 < f2) || (i <= i1)) {
                  break label844;
                }
                if (localObject1 == null) {
                  break label966;
                }
                if ((i != ((b)localObject1).position) || (((b)localObject1).yB)) {
                  break label1220;
                }
                this.dw.remove(paramInt);
                this.xH.a(this, i, ((b)localObject1).yA);
                if (paramInt >= this.dw.size()) {
                  break label838;
                }
                localObject1 = (b)this.dw.get(paramInt);
              }
            }
          }
          label823:
          label838:
          label844:
          label966:
          label1212:
          label1218:
          label1220:
          for (;;)
          {
            i += 1;
            break label717;
            localObject1 = null;
            break label698;
            f2 = getPaddingRight() / i3 + 2.0F;
            break label705;
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
            localObject1 = k(i, paramInt);
            paramInt += 1;
            f3 = ((b)localObject1).yC;
            if (paramInt < this.dw.size()) {}
            for (localObject1 = (b)this.dw.get(paramInt);; localObject1 = null)
            {
              f1 += f3;
              break;
            }
            a((b)localObject3, j, (b)localObject2);
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
                  localObject2 = ap((View)localObject2);
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
            if (!hasFocus()) {
              break;
            }
            localObject1 = findFocus();
            if (localObject1 != null) {}
            for (localObject1 = aq((View)localObject1);; localObject1 = null)
            {
              if ((localObject1 != null) && (((b)localObject1).position == this.xI)) {
                break label1218;
              }
              paramInt = 0;
              for (;;)
              {
                if (paramInt >= getChildCount()) {
                  break label1212;
                }
                localObject1 = getChildAt(paramInt);
                localObject2 = ap((View)localObject1);
                if ((localObject2 != null) && (((b)localObject2).position == this.xI) && (((View)localObject1).requestFocus(2))) {
                  break;
                }
                paramInt += 1;
              }
              break;
            }
            break;
          }
        }
        label1230:
        localObject1 = null;
      }
      localObject2 = null;
    }
  }
  
  private Rect a(Rect paramRect, View paramView)
  {
    if (paramRect == null) {
      paramRect = new Rect();
    }
    for (;;)
    {
      if (paramView == null)
      {
        paramRect.set(0, 0, 0, 0);
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
      return paramRect;
    }
  }
  
  private void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int i;
    int j;
    int i2;
    int n;
    Object localObject;
    int k;
    int m;
    label132:
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
        localObject = getChildAt(n);
        LayoutParams localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
        if (!localLayoutParams.yE) {
          break label482;
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
          i4 = k + i1 - ((View)localObject).getLeft();
          k = i;
          m = j;
          if (i4 != 0)
          {
            ((View)localObject).offsetLeftAndRight(i4);
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
      k = ((View)localObject).getWidth();
      m = k + i;
      k = i;
      i = j;
      j = m;
      break label132;
      k = Math.max((i2 - ((View)localObject).getMeasuredWidth()) / 2, i);
      m = i;
      i = j;
      j = m;
      break label132;
      k = i2 - j - ((View)localObject).getMeasuredWidth();
      i4 = ((View)localObject).getMeasuredWidth();
      m = i;
      i = j + i4;
      j = m;
      break label132;
      if (this.yr != null) {
        this.yr.a(paramInt1, paramFloat, paramInt2);
      }
      if (this.yq != null)
      {
        j = this.yq.size();
        i = 0;
        while (i < j)
        {
          localObject = (e)this.yq.get(i);
          if (localObject != null) {
            ((e)localObject).a(paramInt1, paramFloat, paramInt2);
          }
          i += 1;
        }
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
          localObject = getChildAt(paramInt1);
          if (!((LayoutParams)((View)localObject).getLayoutParams()).yE)
          {
            paramFloat = (((View)localObject).getLeft() - paramInt2) / bO();
            this.yu.h((View)localObject, paramFloat);
          }
          paramInt1 += 1;
        }
      }
      this.yo = true;
      return;
      label482:
      k = j;
      m = i;
    }
  }
  
  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    b localb = aa(paramInt1);
    if (localb != null) {}
    for (int j = (int)(bO() * Math.max(this.xT, Math.min(localb.yD, this.xU)));; j = 0)
    {
      if (paramBoolean1)
      {
        if (getChildCount() == 0)
        {
          setScrollingCacheEnabled(false);
          if (paramBoolean2) {
            ac(paramInt1);
          }
          return;
        }
        int i;
        if ((this.xM != null) && (!this.xM.isFinished()))
        {
          i = 1;
          label87:
          if (i == 0) {
            break label184;
          }
          if (!this.xN) {
            break label172;
          }
          i = this.xM.getCurrX();
          label108:
          this.xM.abortAnimation();
          setScrollingCacheEnabled(false);
        }
        int k;
        int m;
        for (;;)
        {
          k = getScrollY();
          j -= i;
          m = 0 - k;
          if ((j != 0) || (m != 0)) {
            break label193;
          }
          r(false);
          populate();
          X(0);
          break;
          i = 0;
          break label87;
          label172:
          i = this.xM.getStartX();
          break label108;
          label184:
          i = getScrollX();
        }
        label193:
        setScrollingCacheEnabled(true);
        X(2);
        int n = bO();
        int i1 = n / 2;
        float f3 = Math.min(1.0F, 1.0F * Math.abs(j) / n);
        float f1 = i1;
        float f2 = i1;
        f3 = (float)Math.sin((float)((f3 - 0.5F) * 0.4712389167638204D));
        paramInt2 = Math.abs(paramInt2);
        if (paramInt2 > 0) {}
        for (paramInt2 = Math.round(1000.0F * Math.abs((f2 * f3 + f1) / paramInt2)) * 4;; paramInt2 = (int)((Math.abs(j) / (f1 * 1.0F + this.xP) + 1.0F) * 100.0F))
        {
          paramInt2 = Math.min(paramInt2, 600);
          this.xN = false;
          this.xM.startScroll(i, k, j, m, paramInt2);
          z.F(this);
          break;
          f1 = n;
        }
      }
      if (paramBoolean2) {
        ac(paramInt1);
      }
      r(false);
      scrollTo(j, 0);
      ab(j);
      return;
    }
  }
  
  private void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  private void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    boolean bool = false;
    if ((this.xH == null) || (this.xH.getCount() <= 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if ((!paramBoolean2) && (this.xI == paramInt1) && (this.dw.size() != 0))
    {
      setScrollingCacheEnabled(false);
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
      if (paramBoolean2) {
        ac(i);
      }
      requestLayout();
      return;
    }
    Z(i);
    a(i, paramBoolean1, paramInt2, paramBoolean2);
  }
  
  private void a(b paramb1, int paramInt, b paramb2)
  {
    int k = this.xH.getCount();
    int i = bO();
    if (i > 0) {}
    float f1;
    int j;
    for (float f2 = this.xP / i;; f2 = 0.0F)
    {
      if (paramb2 == null) {
        break label365;
      }
      i = paramb2.position;
      if (i >= paramb1.position) {
        break;
      }
      f1 = paramb2.yD + paramb2.yC + f2;
      j = 0;
      i += 1;
      if ((i > paramb1.position) || (j >= this.dw.size())) {
        break label365;
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
            label365:
            int m = this.dw.size();
            float f3 = paramb1.yD;
            i = paramb1.position - 1;
            if (paramb1.position == 0)
            {
              f1 = paramb1.yD;
              this.xT = f1;
              if (paramb1.position != k - 1) {
                break label498;
              }
              f1 = paramb1.yD + paramb1.yC - 1.0F;
              label431:
              this.xU = f1;
              j = paramInt - 1;
              f1 = f3;
            }
            for (;;)
            {
              if (j < 0) {
                break label551;
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
                  label498:
                  f1 = Float.MAX_VALUE;
                  break label431;
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
            label551:
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
            return;
          }
        }
      }
    }
  }
  
  private boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int j = paramView.getScrollX();
      int k = paramView.getScrollY();
      i = localViewGroup.getChildCount() - 1;
      if (i >= 0)
      {
        localView = localViewGroup.getChildAt(i);
        if ((paramInt2 + j < localView.getLeft()) || (paramInt2 + j >= localView.getRight()) || (paramInt3 + k < localView.getTop()) || (paramInt3 + k >= localView.getBottom()) || (!a(localView, true, paramInt1, paramInt2 + j - localView.getLeft(), paramInt3 + k - localView.getTop()))) {}
      }
    }
    while ((paramBoolean) && (z.g(paramView, -paramInt1)))
    {
      View localView;
      return true;
      i -= 1;
      break;
    }
    return false;
  }
  
  private b aa(int paramInt)
  {
    int i = 0;
    while (i < this.dw.size())
    {
      b localb = (b)this.dw.get(i);
      if (localb.position == paramInt) {
        return localb;
      }
      i += 1;
    }
    return null;
  }
  
  private boolean ab(int paramInt)
  {
    if (this.dw.size() == 0)
    {
      if (this.ym) {}
      do
      {
        return false;
        this.yo = false;
        a(0, 0.0F, 0);
      } while (this.yo);
      throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }
    b localb = bT();
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
    return true;
  }
  
  private void ac(int paramInt)
  {
    if (this.yr != null) {
      this.yr.V(paramInt);
    }
    if (this.yq != null)
    {
      int j = this.yq.size();
      int i = 0;
      while (i < j)
      {
        e locale = (e)this.yq.get(i);
        if (locale != null) {
          locale.V(paramInt);
        }
        i += 1;
      }
    }
    if (this.ys != null) {
      this.ys.V(paramInt);
    }
  }
  
  private b ap(View paramView)
  {
    int i = 0;
    while (i < this.dw.size())
    {
      b localb = (b)this.dw.get(i);
      if (this.xH.a(paramView, localb.yA)) {
        return localb;
      }
      i += 1;
    }
    return null;
  }
  
  private b aq(View paramView)
  {
    for (;;)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this) {
        break;
      }
      if ((localViewParent == null) || (!(localViewParent instanceof View))) {
        return null;
      }
      paramView = (View)localViewParent;
    }
    return ap(paramView);
  }
  
  private boolean arrowScroll(int paramInt)
  {
    View localView = findFocus();
    Object localObject;
    int j;
    boolean bool;
    if (localView == this)
    {
      localObject = null;
      localView = FocusFinder.getInstance().findNextFocus(this, (View)localObject, paramInt);
      if ((localView == null) || (localView == localObject)) {
        break label308;
      }
      if (paramInt != 17) {
        break label254;
      }
      i = a(this.dF, localView).left;
      j = a(this.dF, (View)localObject).left;
      if ((localObject != null) && (i >= j))
      {
        bool = bU();
        label89:
        if (bool) {
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        }
        return bool;
      }
    }
    else
    {
      if (localView == null) {
        break label354;
      }
      localObject = localView.getParent();
      if (!(localObject instanceof ViewGroup)) {
        break label361;
      }
      if (localObject != this) {}
    }
    label254:
    label308:
    label348:
    label354:
    label361:
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
        break label89;
        if (paramInt == 66)
        {
          i = a(this.dF, localView).left;
          j = a(this.dF, (View)localObject).left;
          if ((localObject == null) || (i > j))
          {
            bool = localView.requestFocus();
            break label89;
            if ((paramInt == 17) || (paramInt == 1))
            {
              bool = bU();
              break label89;
            }
            if ((paramInt != 66) && (paramInt != 2)) {
              break label348;
            }
          }
          bool = bV();
          break label89;
        }
        bool = false;
        break label89;
      }
      localObject = localView;
      break;
    }
  }
  
  private int bO()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private void bQ()
  {
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
      Collections.sort(this.yw, yx);
    }
  }
  
  private boolean bR()
  {
    this.eA = -1;
    this.hO = false;
    this.ya = false;
    if (this.ez != null)
    {
      this.ez.recycle();
      this.ez = null;
    }
    return this.yk.cq() | this.yl.cq();
  }
  
  private void bS()
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(true);
    }
  }
  
  private b bT()
  {
    int i = bO();
    float f1;
    float f2;
    label36:
    float f4;
    float f3;
    int k;
    int j;
    Object localObject1;
    label53:
    Object localObject2;
    b localb;
    if (i > 0)
    {
      f1 = getScrollX() / i;
      if (i <= 0) {
        break label203;
      }
      f2 = this.xP / i;
      f4 = 0.0F;
      f3 = 0.0F;
      k = -1;
      i = 0;
      j = 1;
      localObject1 = null;
      localObject2 = localObject1;
      if (i < this.dw.size())
      {
        localb = (b)this.dw.get(i);
        if ((j != 0) || (localb.position == k + 1)) {
          break label238;
        }
        localb = this.xG;
        localb.yD = (f4 + f3 + f2);
        localb.position = (k + 1);
        localb.yC = 1.0F;
        i -= 1;
      }
    }
    label203:
    label208:
    label238:
    for (;;)
    {
      f3 = localb.yD;
      f4 = localb.yC;
      if (j == 0)
      {
        localObject2 = localObject1;
        if (f1 < f3) {}
      }
      else
      {
        if ((f1 >= f4 + f3 + f2) && (i != this.dw.size() - 1)) {
          break label208;
        }
        localObject2 = localb;
      }
      return (b)localObject2;
      f1 = 0.0F;
      break;
      f2 = 0.0F;
      break label36;
      k = localb.position;
      f4 = localb.yC;
      j = 0;
      i += 1;
      localObject1 = localb;
      break label53;
    }
  }
  
  private boolean bU()
  {
    if (this.xI > 0)
    {
      c(this.xI - 1, true);
      return true;
    }
    return false;
  }
  
  private boolean bV()
  {
    if ((this.xH != null) && (this.xI < this.xH.getCount() - 1))
    {
      c(this.xI + 1, true);
      return true;
    }
    return false;
  }
  
  private void h(MotionEvent paramMotionEvent)
  {
    int i = o.e(paramMotionEvent);
    if (o.c(paramMotionEvent, i) == this.eA) {
      if (i != 0) {
        break label56;
      }
    }
    label56:
    for (i = 1;; i = 0)
    {
      this.yd = o.d(paramMotionEvent, i);
      this.eA = o.c(paramMotionEvent, i);
      if (this.ez != null) {
        this.ez.clear();
      }
      return;
    }
  }
  
  private b k(int paramInt1, int paramInt2)
  {
    b localb = new b();
    localb.position = paramInt1;
    localb.yA = this.xH.b(this, paramInt1);
    localb.yC = 1.0F;
    if ((paramInt2 < 0) || (paramInt2 >= this.dw.size()))
    {
      this.dw.add(localb);
      return localb;
    }
    this.dw.add(paramInt2, localb);
    return localb;
  }
  
  private boolean o(float paramFloat)
  {
    int j = 1;
    boolean bool2 = false;
    boolean bool1 = false;
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
    int i;
    if (this.xl == 2)
    {
      i = 1;
      if (i != 0)
      {
        setScrollingCacheEnabled(false);
        if (this.xM.isFinished()) {
          break label170;
        }
      }
    }
    label170:
    for (int j = 1;; j = 0)
    {
      if (j != 0)
      {
        this.xM.abortAnimation();
        j = getScrollX();
        k = getScrollY();
        int m = this.xM.getCurrX();
        int n = this.xM.getCurrY();
        if ((j != m) || (k != n))
        {
          scrollTo(m, n);
          if (m != j) {
            ab(m);
          }
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
      i = 0;
      break;
    }
    if (j != 0)
    {
      if (paramBoolean) {
        z.a(this, this.yy);
      }
    }
    else {
      return;
    }
    this.yy.run();
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.xX != paramBoolean) {
      this.xX = paramBoolean;
    }
  }
  
  public final void Y(int paramInt)
  {
    this.xY = false;
    if (!this.ym) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramInt, bool, false);
      return;
    }
  }
  
  final e a(e parame)
  {
    e locale = this.ys;
    this.ys = parame;
    return locale;
  }
  
  public final void a(u paramu)
  {
    if (this.xH != null)
    {
      this.xH.a(null);
      int i = 0;
      while (i < this.dw.size())
      {
        localObject = (b)this.dw.get(i);
        this.xH.a(this, ((b)localObject).position, ((b)localObject).yA);
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
    Object localObject = this.xH;
    this.xH = paramu;
    this.xD = 0;
    boolean bool;
    if (this.xH != null)
    {
      if (this.xO == null) {
        this.xO = new g((byte)0);
      }
      this.xH.a(this.xO);
      this.xY = false;
      bool = this.ym;
      this.ym = true;
      this.xD = this.xH.getCount();
      if (this.xJ < 0) {
        break label290;
      }
      this.xH.a(this.xK, this.xL);
      a(this.xJ, false, true);
      this.xJ = -1;
      this.xK = null;
      this.xL = null;
    }
    for (;;)
    {
      if ((this.yt != null) && (localObject != paramu)) {
        this.yt.b((u)localObject, paramu);
      }
      return;
      label290:
      if (!bool) {
        populate();
      } else {
        requestLayout();
      }
    }
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
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
          b localb = ap(localView);
          if ((localb != null) && (localb.position == this.xI)) {
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
        i += 1;
      }
    }
    if (((k == 262144) && (j != paramArrayList.size())) || (!isFocusable())) {}
    while ((((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode())) || (paramArrayList == null)) {
      return;
    }
    paramArrayList.add(this);
  }
  
  public void addTouchables(ArrayList<View> paramArrayList)
  {
    int i = 0;
    while (i < getChildCount())
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        b localb = ap(localView);
        if ((localb != null) && (localb.position == this.xI)) {
          localView.addTouchables(paramArrayList);
        }
      }
      i += 1;
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (!checkLayoutParams(paramLayoutParams)) {
      paramLayoutParams = generateLayoutParams(paramLayoutParams);
    }
    for (;;)
    {
      LayoutParams localLayoutParams = (LayoutParams)paramLayoutParams;
      localLayoutParams.yE |= paramView instanceof a;
      if (this.ou)
      {
        if ((localLayoutParams != null) && (localLayoutParams.yE)) {
          throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        localLayoutParams.yF = true;
        addViewInLayout(paramView, paramInt, paramLayoutParams);
        return;
      }
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    }
  }
  
  final void bP()
  {
    int i2 = this.xH.getCount();
    this.xD = i2;
    int i;
    int j;
    int k;
    int n;
    int m;
    label67:
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
        break label270;
      }
      localObject = (b)this.dw.get(k);
      n = this.xH.j(((b)localObject).yA);
      if (n == -1) {
        break label354;
      }
      if (n != -2) {
        break label218;
      }
      this.dw.remove(k);
      m = k - 1;
      k = j;
      if (j == 0) {
        k = 1;
      }
      this.xH.a(this, ((b)localObject).position, ((b)localObject).yA);
      if (this.xI != ((b)localObject).position) {
        break label375;
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
      break label67;
      i = 0;
      break;
      label218:
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
        label270:
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
      }
      else
      {
        label354:
        n = i;
        i1 = m;
        m = k;
        i = j;
        j = n;
        k = i1;
        continue;
        label375:
        j = i;
        n = 1;
        i = k;
        k = n;
      }
    }
  }
  
  public final void c(int paramInt, boolean paramBoolean)
  {
    this.xY = false;
    a(paramInt, paramBoolean, false);
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    if (this.xH == null) {}
    int i;
    int j;
    do
    {
      do
      {
        return false;
        i = bO();
        j = getScrollX();
        if (paramInt >= 0) {
          break;
        }
      } while (j <= (int)(i * this.xT));
      return true;
    } while ((paramInt <= 0) || (j >= (int)(i * this.xU)));
    return true;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    this.xN = true;
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
      return;
    }
    r(true);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    boolean bool1;
    if (!super.dispatchKeyEvent(paramKeyEvent))
    {
      if (paramKeyEvent.getAction() == 0) {}
      switch (paramKeyEvent.getKeyCode())
      {
      default: 
        bool1 = false;
      }
    }
    for (;;)
    {
      if (bool1) {
        bool2 = true;
      }
      return bool2;
      bool1 = arrowScroll(17);
      continue;
      bool1 = arrowScroll(66);
      continue;
      if (Build.VERSION.SDK_INT < 11) {
        break;
      }
      if (g.a(paramKeyEvent))
      {
        bool1 = arrowScroll(2);
      }
      else
      {
        if (!g.a(paramKeyEvent, 1)) {
          break;
        }
        bool1 = arrowScroll(1);
      }
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      bool1 = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      return bool1;
    }
    int j = getChildCount();
    int i = 0;
    for (;;)
    {
      bool1 = bool2;
      if (i >= j) {
        break;
      }
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        b localb = ap(localView);
        if ((localb != null) && (localb.position == this.xI) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))) {
          return true;
        }
      }
      i += 1;
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
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
      return;
      this.yk.finish();
      this.yl.finish();
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.xQ;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (this.yv == 2) {
      i = paramInt1 - 1 - paramInt2;
    }
    return ((LayoutParams)((View)this.yw.get(i)).getLayoutParams()).yG;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.ym = true;
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.yy);
    if ((this.xM != null) && (!this.xM.isFinished())) {
      this.xM.abortAnimation();
    }
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
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
            this.xQ.setBounds(Math.round(f2), this.xR, Math.round(this.xP + f2), this.xS);
            this.xQ.draw(paramCanvas);
          }
          if (f2 > k + m) {
            return;
          }
          i += 1;
          break;
          f2 = (1.0F + f1) * m;
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction() & 0xFF;
    if ((i == 3) || (i == 1)) {
      bR();
    }
    do
    {
      return false;
      if (i == 0) {
        break;
      }
      if (this.hO) {
        return true;
      }
    } while (this.ya);
    switch (i)
    {
    }
    for (;;)
    {
      if (this.ez == null) {
        this.ez = VelocityTracker.obtain();
      }
      this.ez.addMovement(paramMotionEvent);
      return this.hO;
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
            return false;
          }
        }
        if ((f4 > this.hQ) && (0.5F * f4 > f5))
        {
          this.hO = true;
          bS();
          X(1);
          if (f1 > 0.0F)
          {
            f1 = this.wS + this.hQ;
            label328:
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
          break label328;
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
        this.xN = true;
        this.xM.computeScrollOffset();
        if ((this.xl == 2) && (Math.abs(this.xM.getFinalX() - this.xM.getCurrX()) > this.yi))
        {
          this.xM.abortAnimation();
          this.xY = false;
          populate();
          this.hO = true;
          bS();
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
    label154:
    int n;
    if (m < i1)
    {
      localView = getChildAt(m);
      if (localView.getVisibility() == 8) {
        break label671;
      }
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (!localLayoutParams.yE) {
        break label671;
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
          label204:
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
      break label154;
      paramInt4 = Math.max((i3 - localView.getMeasuredWidth()) / 2, paramInt2);
      k = paramInt2;
      break label154;
      k = localView.getMeasuredWidth();
      paramInt4 = i + localView.getMeasuredWidth();
      n = i3 - i - k;
      i = paramInt4;
      k = paramInt2;
      paramInt4 = n;
      break label154;
      n = localView.getMeasuredHeight();
      paramInt2 = paramInt3;
      n += paramInt1;
      paramInt3 = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = n;
      break label204;
      n = Math.max((i2 - localView.getMeasuredHeight()) / 2, paramInt1);
      paramInt2 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = n;
      break label204;
      n = i2 - paramInt3 - localView.getMeasuredHeight();
      i5 = localView.getMeasuredHeight();
      paramInt2 = paramInt1;
      paramInt1 = paramInt3 + i5;
      paramInt3 = n;
      break label204;
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
            b localb = ap(localView);
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
      return;
      label671:
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
    label183:
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
              break label333;
            }
            m = 1;
            if ((i != 3) && (i != 5)) {
              break label339;
            }
            n = 1;
            label198:
            if (m == 0) {
              break label345;
            }
            i = 1073741824;
            label208:
            if (localLayoutParams.width == -2) {
              break label528;
            }
            i1 = 1073741824;
            if (localLayoutParams.width == -1) {
              break label522;
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
          label333:
          m = 0;
          break label183;
          label339:
          n = 0;
          break label198;
          label345:
          i = i1;
          if (n == 0) {
            break label208;
          }
          j = 1073741824;
          i = i1;
          break label208;
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
            if ((localLayoutParams == null) || (!localLayoutParams.yE))
            {
              float f = paramInt1;
              localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localLayoutParams.yC * f), 1073741824), this.xW);
            }
          }
          paramInt2 += 1;
        }
        return;
      }
      label522:
      i = paramInt1;
      continue;
      label528:
      i1 = i;
      i = paramInt1;
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int j = -1;
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
        b localb = ap(localView);
        if ((localb != null) && (localb.position == this.xI) && (localView.requestFocus(paramInt, paramRect)))
        {
          return true;
          i = k - 1;
          k = -1;
          continue;
        }
      }
      i += j;
    }
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (this.xH != null)
    {
      this.xH.a(paramParcelable.yH, paramParcelable.yI);
      a(paramParcelable.position, false, true);
      return;
    }
    this.xJ = paramParcelable.position;
    this.xK = paramParcelable.yH;
    this.xL = paramParcelable.yI;
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.position = this.xI;
    if (this.xH != null) {
      localSavedState.yH = this.xH.bb();
    }
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      paramInt2 = this.xP;
      paramInt4 = this.xP;
      if ((paramInt3 <= 0) || (this.dw.isEmpty())) {
        break label132;
      }
      if (!this.xM.isFinished()) {
        this.xM.setFinalX(this.xI * bO());
      }
    }
    else
    {
      return;
    }
    int i = getPaddingLeft();
    int j = getPaddingRight();
    int k = getPaddingLeft();
    int m = getPaddingRight();
    float f = getScrollX() / (paramInt4 + (paramInt3 - k - m));
    scrollTo((int)((paramInt2 + (paramInt1 - i - j)) * f), getScrollY());
    return;
    label132:
    b localb = aa(this.xI);
    if (localb != null) {}
    for (f = Math.min(localb.yD, this.xU);; f = 0.0F)
    {
      paramInt1 = (int)(f * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 == getScrollX()) {
        break;
      }
      r(false);
      scrollTo(paramInt1, getScrollY());
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    if (this.yj) {
      return true;
    }
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0)) {
      return false;
    }
    if ((this.xH == null) || (this.xH.getCount() == 0)) {
      return false;
    }
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    this.ez.addMovement(paramMotionEvent);
    boolean bool1 = bool2;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default: 
      bool1 = bool2;
    }
    for (;;)
    {
      if (bool1) {
        z.F(this);
      }
      return true;
      this.xM.abortAnimation();
      this.xY = false;
      populate();
      float f1 = paramMotionEvent.getX();
      this.wS = f1;
      this.yd = f1;
      f1 = paramMotionEvent.getY();
      this.wT = f1;
      this.ye = f1;
      this.eA = o.c(paramMotionEvent, 0);
      bool1 = bool2;
      continue;
      int i;
      float f2;
      if (!this.hO)
      {
        i = o.b(paramMotionEvent, this.eA);
        if (i == -1)
        {
          bool1 = bR();
          continue;
        }
        f1 = o.d(paramMotionEvent, i);
        float f3 = Math.abs(f1 - this.yd);
        f2 = o.e(paramMotionEvent, i);
        float f4 = Math.abs(f2 - this.ye);
        if ((f3 > this.hQ) && (f3 > f4))
        {
          this.hO = true;
          bS();
          if (f1 - this.wS <= 0.0F) {
            break label392;
          }
        }
      }
      Object localObject;
      label392:
      for (f1 = this.wS + this.hQ;; f1 = this.wS - this.hQ)
      {
        this.yd = f1;
        this.ye = f2;
        X(1);
        setScrollingCacheEnabled(true);
        localObject = getParent();
        if (localObject != null) {
          ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
        }
        bool1 = bool2;
        if (!this.hO) {
          break;
        }
        bool1 = o(o.d(paramMotionEvent, o.b(paramMotionEvent, this.eA))) | false;
        break;
      }
      bool1 = bool2;
      if (this.hO)
      {
        localObject = this.ez;
        ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.yg);
        int k = (int)y.a((VelocityTracker)localObject, this.eA);
        this.xY = true;
        int j = bO();
        int m = getScrollX();
        localObject = bT();
        f1 = this.xP / j;
        i = ((b)localObject).position;
        f2 = (m / j - ((b)localObject).yD) / (((b)localObject).yC + f1);
        if ((Math.abs((int)(o.d(paramMotionEvent, o.b(paramMotionEvent, this.eA)) - this.wS)) > this.yh) && (Math.abs(k) > this.yf))
        {
          if (k > 0) {}
          for (;;)
          {
            j = i;
            if (this.dw.size() > 0)
            {
              paramMotionEvent = (b)this.dw.get(0);
              localObject = (b)this.dw.get(this.dw.size() - 1);
              j = Math.max(paramMotionEvent.position, Math.min(i, ((b)localObject).position));
            }
            a(j, true, true, k);
            bool1 = bR();
            break;
            i += 1;
          }
        }
        if (i >= this.xI) {}
        for (f1 = 0.4F;; f1 = 0.6F)
        {
          i = (int)(i + f2 + f1);
          break;
        }
        bool1 = bool2;
        if (this.hO)
        {
          a(this.xI, true, 0, false);
          bool1 = bR();
          continue;
          i = o.e(paramMotionEvent);
          this.yd = o.d(paramMotionEvent, i);
          this.eA = o.c(paramMotionEvent, i);
          bool1 = bool2;
          continue;
          h(paramMotionEvent);
          this.yd = o.d(paramMotionEvent, o.b(paramMotionEvent, this.eA));
          bool1 = bool2;
        }
      }
    }
  }
  
  public final void populate()
  {
    Z(this.xI);
  }
  
  public void removeView(View paramView)
  {
    if (this.ou)
    {
      removeViewInLayout(paramView);
      return;
    }
    super.removeView(paramView);
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.xQ);
  }
  
  public static class LayoutParams
    extends ViewGroup.LayoutParams
  {
    public int gravity;
    int position;
    float yC = 0.0F;
    public boolean yE;
    boolean yF;
    int yG;
    
    public LayoutParams()
    {
      super(-1);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ViewPager.bW());
      this.gravity = paramContext.getInteger(0, 48);
      paramContext.recycle();
    }
  }
  
  public static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = android.support.v4.os.b.a(new c() {});
    int position;
    Parcelable yH;
    ClassLoader yI;
    
    SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super();
      ClassLoader localClassLoader = paramClassLoader;
      if (paramClassLoader == null) {
        localClassLoader = getClass().getClassLoader();
      }
      this.position = paramParcel.readInt();
      this.yH = paramParcel.readParcelable(localClassLoader);
      this.yI = localClassLoader;
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.position);
      paramParcel.writeParcelable(this.yH, paramInt);
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
  }
  
  final class c
    extends a
  {
    c() {}
    
    private boolean bX()
    {
      return (ViewPager.b(ViewPager.this) != null) && (ViewPager.b(ViewPager.this).getCount() > 1);
    }
    
    public final void a(View paramView, android.support.v4.view.a.b paramb)
    {
      super.a(paramView, paramb);
      paramb.setClassName(ViewPager.class.getName());
      paramb.setScrollable(bX());
      if (ViewPager.this.canScrollHorizontally(1)) {
        paramb.addAction(4096);
      }
      if (ViewPager.this.canScrollHorizontally(-1)) {
        paramb.addAction(8192);
      }
    }
    
    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(ViewPager.class.getName());
      paramView = android.support.v4.view.a.a.a(paramAccessibilityEvent);
      paramView.setScrollable(bX());
      if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.b(ViewPager.this) != null))
      {
        paramView.setItemCount(ViewPager.b(ViewPager.this).getCount());
        paramView.setFromIndex(ViewPager.c(ViewPager.this));
        paramView.setToIndex(ViewPager.c(ViewPager.this));
      }
    }
    
    public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
        return true;
      }
      switch (paramInt)
      {
      default: 
        return false;
      case 4096: 
        if (ViewPager.this.canScrollHorizontally(1))
        {
          ViewPager.this.Y(ViewPager.c(ViewPager.this) + 1);
          return true;
        }
        return false;
      }
      if (ViewPager.this.canScrollHorizontally(-1))
      {
        ViewPager.this.Y(ViewPager.c(ViewPager.this) - 1);
        return true;
      }
      return false;
    }
  }
  
  static abstract interface d
  {
    public abstract void b(u paramu1, u paramu2);
  }
  
  public static abstract interface e
  {
    public abstract void V(int paramInt);
    
    public abstract void W(int paramInt);
    
    public abstract void a(int paramInt1, float paramFloat, int paramInt2);
  }
  
  public static abstract interface f
  {
    public abstract void h(View paramView, float paramFloat);
  }
  
  private final class g
    extends DataSetObserver
  {
    private g() {}
    
    public final void onChanged()
    {
      ViewPager.this.bP();
    }
    
    public final void onInvalidated()
    {
      ViewPager.this.bP();
    }
  }
  
  public static class h
    implements ViewPager.e
  {
    public void V(int paramInt) {}
    
    public void W(int paramInt) {}
    
    public void a(int paramInt1, float paramFloat, int paramInt2) {}
  }
  
  static final class i
    implements Comparator<View>
  {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\ViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
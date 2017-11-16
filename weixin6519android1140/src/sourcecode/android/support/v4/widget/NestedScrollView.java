package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.a.b;
import android.support.v4.view.a.f;
import android.support.v4.view.a.f.c;
import android.support.v4.view.o;
import android.support.v4.view.p;
import android.support.v4.view.r;
import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.List;

public class NestedScrollView
  extends FrameLayout
  implements p, r, w
{
  private static final a Cw = new a();
  private static final int[] Cx = { 16843130 };
  private float CA;
  public b CB;
  private long Ck;
  private i Cl;
  private i Cm;
  private boolean Cn = true;
  private boolean Co = false;
  private View Cp = null;
  private boolean Cq;
  private boolean Cr = true;
  private final int[] Cs = new int[2];
  private final int[] Ct = new int[2];
  private int Cu;
  private SavedState Cv;
  private final s Cy;
  private final android.support.v4.view.q Cz;
  private final Rect dF = new Rect();
  private int eA = -1;
  private VelocityTracker ez;
  private q hN = q.a(getContext(), null);
  private boolean hO = false;
  private int hP;
  private int hQ;
  private int yf;
  private int yg;
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    this.hQ = localViewConfiguration.getScaledTouchSlop();
    this.yf = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.yg = localViewConfiguration.getScaledMaximumFlingVelocity();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Cx, paramInt, 0);
    boolean bool = paramContext.getBoolean(0, false);
    if (bool != this.Cq)
    {
      this.Cq = bool;
      requestLayout();
    }
    paramContext.recycle();
    this.Cy = new s(this);
    this.Cz = new android.support.v4.view.q(this);
    setNestedScrollingEnabled(true);
    z.a(this, Cw);
  }
  
  private static boolean a(View paramView1, View paramView2)
  {
    if (paramView1 == paramView2) {
      return true;
    }
    paramView1 = paramView1.getParent();
    return ((paramView1 instanceof ViewGroup)) && (a((View)paramView1, paramView2));
  }
  
  private boolean aC(View paramView)
  {
    boolean bool = false;
    if (!d(paramView, 0, getHeight())) {
      bool = true;
    }
    return bool;
  }
  
  private void aD(View paramView)
  {
    paramView.getDrawingRect(this.dF);
    offsetDescendantRectToMyCoords(paramView, this.dF);
    int i = computeScrollDeltaToGetChildRectOnScreen(this.dF);
    if (i != 0) {
      scrollBy(0, i);
    }
  }
  
  private void ai(int paramInt)
  {
    if (paramInt != 0)
    {
      if (this.Cr) {
        smoothScrollBy(0, paramInt);
      }
    }
    else {
      return;
    }
    scrollBy(0, paramInt);
  }
  
  private void ak(int paramInt)
  {
    int i = getScrollY();
    if (((i > 0) || (paramInt > 0)) && ((i < cx()) || (paramInt < 0))) {}
    for (boolean bool = true;; bool = false)
    {
      if (!dispatchNestedPreFling(0.0F, paramInt))
      {
        dispatchNestedFling(0.0F, paramInt, bool);
        if (bool) {
          fling(paramInt);
        }
      }
      return;
    }
  }
  
  private boolean arrowScroll(int paramInt)
  {
    View localView2 = findFocus();
    View localView1 = localView2;
    if (localView2 == this) {
      localView1 = null;
    }
    localView2 = FocusFinder.getInstance().findNextFocus(this, localView1, paramInt);
    int j = (int)(0.5F * getHeight());
    if ((localView2 != null) && (d(localView2, j, getHeight())))
    {
      localView2.getDrawingRect(this.dF);
      offsetDescendantRectToMyCoords(localView2, this.dF);
      ai(computeScrollDeltaToGetChildRectOnScreen(this.dF));
      localView2.requestFocus(paramInt);
      if ((localView1 != null) && (localView1.isFocused()) && (aC(localView1)))
      {
        paramInt = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(paramInt);
      }
      return true;
    }
    int i;
    if ((paramInt == 33) && (getScrollY() < j)) {
      i = getScrollY();
    }
    while (i == 0)
    {
      return false;
      i = j;
      if (paramInt == 130)
      {
        i = j;
        if (getChildCount() > 0)
        {
          int k = getChildAt(0).getBottom();
          int m = getScrollY() + getHeight() - getPaddingBottom();
          i = j;
          if (k - m < j) {
            i = k - m;
          }
        }
      }
    }
    if (paramInt == 130) {}
    for (;;)
    {
      ai(i);
      break;
      i = -i;
    }
  }
  
  private static int clamp(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if ((paramInt2 >= paramInt3) || (paramInt1 < 0)) {
      i = 0;
    }
    do
    {
      return i;
      i = paramInt1;
    } while (paramInt2 + paramInt1 <= paramInt3);
    return paramInt3 - paramInt2;
  }
  
  private int computeScrollDeltaToGetChildRectOnScreen(Rect paramRect)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    int m = getHeight();
    int i = getScrollY();
    int k = i + m;
    int n = getVerticalFadingEdgeLength();
    int j = i;
    if (paramRect.top > 0) {
      j = i + n;
    }
    i = k;
    if (paramRect.bottom < getChildAt(0).getHeight()) {
      i = k - n;
    }
    if ((paramRect.bottom > i) && (paramRect.top > j)) {
      if (paramRect.height() > m)
      {
        j = paramRect.top - j + 0;
        i = Math.min(j, getChildAt(0).getBottom() - i);
      }
    }
    for (;;)
    {
      return i;
      j = paramRect.bottom - i + 0;
      break;
      if ((paramRect.top < j) && (paramRect.bottom < i))
      {
        if (paramRect.height() > m) {}
        for (i = 0 - (i - paramRect.bottom);; i = 0 - (j - paramRect.top))
        {
          i = Math.max(i, -getScrollY());
          break;
        }
      }
      i = 0;
    }
  }
  
  private void cv()
  {
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
  }
  
  private void cw()
  {
    if (this.ez != null)
    {
      this.ez.recycle();
      this.ez = null;
    }
  }
  
  private int cx()
  {
    int i = 0;
    if (getChildCount() > 0) {
      i = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
    }
    return i;
  }
  
  private void cy()
  {
    this.hO = false;
    cw();
    stopNestedScroll();
    if (this.Cl != null)
    {
      this.Cl.cq();
      this.Cm.cq();
    }
  }
  
  private void cz()
  {
    if (z.C(this) != 2)
    {
      if (this.Cl == null)
      {
        Context localContext = getContext();
        this.Cl = new i(localContext);
        this.Cm = new i(localContext);
      }
      return;
    }
    this.Cl = null;
    this.Cm = null;
  }
  
  private boolean d(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getHeight();
    int i1 = getScrollY();
    int i2 = i1 + i;
    int k;
    Object localObject1;
    int m;
    label53:
    Object localObject2;
    int n;
    int i4;
    int j;
    if (paramInt1 == 33)
    {
      k = 1;
      ArrayList localArrayList = getFocusables(2);
      localObject1 = null;
      i = 0;
      int i3 = localArrayList.size();
      m = 0;
      if (m >= i3) {
        break label237;
      }
      localObject2 = (View)localArrayList.get(m);
      n = ((View)localObject2).getTop();
      i4 = ((View)localObject2).getBottom();
      if ((paramInt2 >= i4) || (n >= paramInt3)) {
        break label312;
      }
      if ((paramInt2 >= n) || (i4 >= paramInt3)) {
        break label143;
      }
      j = 1;
      label115:
      if (localObject1 != null) {
        break label149;
      }
      localObject1 = localObject2;
      i = j;
    }
    label143:
    label149:
    label210:
    label237:
    label312:
    for (;;)
    {
      m += 1;
      break label53;
      k = 0;
      break;
      j = 0;
      break label115;
      if (((k != 0) && (n < ((View)localObject1).getTop())) || ((k == 0) && (i4 > ((View)localObject1).getBottom()))) {}
      for (n = 1;; n = 0)
      {
        if (i == 0) {
          break label210;
        }
        if ((j == 0) || (n == 0)) {
          break label312;
        }
        localObject1 = localObject2;
        break;
      }
      if (j != 0)
      {
        localObject1 = localObject2;
        i = 1;
      }
      else if (n != 0)
      {
        localObject1 = localObject2;
        continue;
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = this;
        }
        boolean bool;
        if ((paramInt2 >= i1) && (paramInt3 <= i2))
        {
          bool = false;
          if (localObject2 != findFocus()) {
            ((View)localObject2).requestFocus(paramInt1);
          }
          return bool;
        }
        if (k != 0) {
          paramInt2 -= i1;
        }
        for (;;)
        {
          ai(paramInt2);
          bool = true;
          break;
          paramInt2 = paramInt3 - i2;
        }
      }
    }
  }
  
  private boolean d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    boolean bool3 = false;
    z.C(this);
    computeHorizontalScrollRange();
    computeHorizontalScrollExtent();
    computeVerticalScrollRange();
    computeVerticalScrollExtent();
    paramInt1 = paramInt3 + paramInt1;
    paramInt2 = paramInt4 + paramInt2;
    paramInt3 = paramInt5 + 0;
    boolean bool1;
    if (paramInt1 > 0)
    {
      bool1 = true;
      paramInt1 = 0;
    }
    for (;;)
    {
      boolean bool2;
      if (paramInt2 > paramInt3)
      {
        paramInt2 = paramInt3;
        bool2 = true;
      }
      for (;;)
      {
        if (bool2) {
          this.hN.e(paramInt1, paramInt2, cx());
        }
        onOverScrolled(paramInt1, paramInt2, bool1, bool2);
        if (!bool1)
        {
          bool1 = bool3;
          if (!bool2) {}
        }
        else
        {
          bool1 = true;
        }
        return bool1;
        if (paramInt1 >= 0) {
          break label140;
        }
        bool1 = true;
        paramInt1 = 0;
        break;
        if (paramInt2 < 0)
        {
          bool2 = true;
          paramInt2 = 0;
        }
        else
        {
          bool2 = false;
        }
      }
      label140:
      bool1 = false;
    }
  }
  
  private boolean d(View paramView, int paramInt1, int paramInt2)
  {
    paramView.getDrawingRect(this.dF);
    offsetDescendantRectToMyCoords(paramView, this.dF);
    return (this.dF.bottom + paramInt1 >= getScrollY()) && (this.dF.top - paramInt1 <= getScrollY() + paramInt2);
  }
  
  private boolean fullScroll(int paramInt)
  {
    if (paramInt == 130) {}
    for (int i = 1;; i = 0)
    {
      int j = getHeight();
      this.dF.top = 0;
      this.dF.bottom = j;
      if (i != 0)
      {
        i = getChildCount();
        if (i > 0)
        {
          View localView = getChildAt(i - 1);
          this.dF.bottom = (localView.getBottom() + getPaddingBottom());
          this.dF.top = (this.dF.bottom - j);
        }
      }
      return d(paramInt, this.dF.top, this.dF.bottom);
    }
  }
  
  private void h(MotionEvent paramMotionEvent)
  {
    int i = (paramMotionEvent.getAction() & 0xFF00) >> 8;
    if (o.c(paramMotionEvent, i) == this.eA) {
      if (i != 0) {
        break label64;
      }
    }
    label64:
    for (i = 1;; i = 0)
    {
      this.hP = ((int)o.e(paramMotionEvent, i));
      this.eA = o.c(paramMotionEvent, i);
      if (this.ez != null) {
        this.ez.clear();
      }
      return;
    }
  }
  
  private void smoothScrollBy(int paramInt1, int paramInt2)
  {
    if (getChildCount() == 0) {
      return;
    }
    if (AnimationUtils.currentAnimationTimeMillis() - this.Ck > 250L)
    {
      paramInt1 = getHeight();
      int i = getPaddingBottom();
      int j = getPaddingTop();
      i = Math.max(0, getChildAt(0).getHeight() - (paramInt1 - i - j));
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt1 + paramInt2, i));
      q localq = this.hN;
      i = getScrollX();
      localq.CL.a(localq.CK, i, paramInt1, 0, paramInt2 - paramInt1);
      z.F(this);
    }
    for (;;)
    {
      this.Ck = AnimationUtils.currentAnimationTimeMillis();
      return;
      if (!this.hN.isFinished()) {
        this.hN.abortAnimation();
      }
      scrollBy(paramInt1, paramInt2);
    }
  }
  
  public void addView(View paramView)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView);
  }
  
  public void addView(View paramView, int paramInt)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView, paramInt);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView, paramLayoutParams);
  }
  
  public final void aj(int paramInt)
  {
    smoothScrollBy(0 - getScrollX(), paramInt - getScrollY());
  }
  
  public int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }
  
  public int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }
  
  public int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }
  
  public void computeScroll()
  {
    int k;
    int n;
    int i1;
    int i;
    if (this.hN.computeScrollOffset())
    {
      int j = getScrollX();
      k = getScrollY();
      int m = this.hN.getCurrX();
      n = this.hN.getCurrY();
      if ((j != m) || (k != n))
      {
        i1 = cx();
        i = z.C(this);
        if ((i != 0) && ((i != 1) || (i1 <= 0))) {
          break label128;
        }
        i = 1;
        d(m - j, n - k, j, k, i1);
        if (i != 0)
        {
          cz();
          if ((n > 0) || (k <= 0)) {
            break label133;
          }
          this.Cl.ag((int)this.hN.getCurrVelocity());
        }
      }
    }
    label128:
    label133:
    while ((n < i1) || (k >= i1))
    {
      return;
      i = 0;
      break;
    }
    this.Cm.ag((int)this.hN.getCurrVelocity());
  }
  
  public int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }
  
  public int computeVerticalScrollOffset()
  {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  public int computeVerticalScrollRange()
  {
    int j = getChildCount();
    int i = getHeight() - getPaddingBottom() - getPaddingTop();
    if (j == 0) {}
    int k;
    int m;
    do
    {
      return i;
      j = getChildAt(0).getBottom();
      k = getScrollY();
      m = Math.max(0, j - i);
      if (k < 0) {
        return j - k;
      }
      i = j;
    } while (k <= m);
    return j + (k - m);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return (super.dispatchKeyEvent(paramKeyEvent)) || (executeKeyEvent(paramKeyEvent));
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.Cz.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.Cz.dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.Cz.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.Cz.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.Cl != null)
    {
      int i = getScrollY();
      int j;
      int k;
      int m;
      if (!this.Cl.isFinished())
      {
        j = paramCanvas.save();
        k = getWidth();
        m = getPaddingLeft();
        int n = getPaddingRight();
        paramCanvas.translate(getPaddingLeft(), Math.min(0, i));
        this.Cl.setSize(k - m - n, getHeight());
        if (this.Cl.draw(paramCanvas)) {
          z.F(this);
        }
        paramCanvas.restoreToCount(j);
      }
      if (!this.Cm.isFinished())
      {
        j = paramCanvas.save();
        k = getWidth() - getPaddingLeft() - getPaddingRight();
        m = getHeight();
        paramCanvas.translate(-k + getPaddingLeft(), Math.max(cx(), i) + m);
        paramCanvas.rotate(180.0F, k, 0.0F);
        this.Cm.setSize(k, m);
        if (this.Cm.draw(paramCanvas)) {
          z.F(this);
        }
        paramCanvas.restoreToCount(j);
      }
    }
  }
  
  public final boolean executeKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    this.dF.setEmpty();
    View localView = getChildAt(0);
    int i;
    boolean bool1;
    if (localView != null)
    {
      i = localView.getHeight();
      if (getHeight() < i + getPaddingTop() + getPaddingBottom())
      {
        i = 1;
        if (i != 0) {
          break label151;
        }
        bool1 = bool2;
        if (isFocused())
        {
          bool1 = bool2;
          if (paramKeyEvent.getKeyCode() != 4)
          {
            localView = findFocus();
            paramKeyEvent = localView;
            if (localView == this) {
              paramKeyEvent = null;
            }
            paramKeyEvent = FocusFinder.getInstance().findNextFocus(this, paramKeyEvent, 130);
            bool1 = bool2;
            if (paramKeyEvent != null)
            {
              bool1 = bool2;
              if (paramKeyEvent != this)
              {
                bool1 = bool2;
                if (paramKeyEvent.requestFocus(130)) {
                  bool1 = true;
                }
              }
            }
          }
        }
      }
    }
    label151:
    do
    {
      return bool1;
      i = 0;
      break;
      i = 0;
      break;
      bool1 = bool2;
    } while (paramKeyEvent.getAction() != 0);
    switch (paramKeyEvent.getKeyCode())
    {
    default: 
      return false;
    case 19: 
      if (!paramKeyEvent.isAltPressed()) {
        return arrowScroll(33);
      }
      return fullScroll(33);
    case 20: 
      if (!paramKeyEvent.isAltPressed()) {
        return arrowScroll(130);
      }
      return fullScroll(130);
    }
    int j;
    label265:
    int k;
    if (paramKeyEvent.isShiftPressed())
    {
      i = 33;
      if (i != 130) {
        break label383;
      }
      j = 1;
      k = getHeight();
      if (j == 0) {
        break label388;
      }
      this.dF.top = (getScrollY() + k);
      j = getChildCount();
      if (j > 0)
      {
        paramKeyEvent = getChildAt(j - 1);
        if (this.dF.top + k > paramKeyEvent.getBottom()) {
          this.dF.top = (paramKeyEvent.getBottom() - k);
        }
      }
    }
    for (;;)
    {
      this.dF.bottom = (k + this.dF.top);
      d(i, this.dF.top, this.dF.bottom);
      return false;
      i = 130;
      break;
      label383:
      j = 0;
      break label265;
      label388:
      this.dF.top = (getScrollY() - k);
      if (this.dF.top < 0) {
        this.dF.top = 0;
      }
    }
  }
  
  public void fling(int paramInt)
  {
    if (getChildCount() > 0)
    {
      int k = getHeight() - getPaddingBottom() - getPaddingTop();
      int m = getChildAt(0).getHeight();
      q localq = this.hN;
      int i = getScrollX();
      int j = getScrollY();
      m = Math.max(0, m - k);
      k /= 2;
      localq.CL.a(localq.CK, i, j, 0, paramInt, 0, 0, 0, m, 0, k);
      z.F(this);
    }
  }
  
  protected float getBottomFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    int i = getVerticalFadingEdgeLength();
    int j = getHeight();
    int k = getPaddingBottom();
    j = getChildAt(0).getBottom() - getScrollY() - (j - k);
    if (j < i) {
      return j / i;
    }
    return 1.0F;
  }
  
  public int getNestedScrollAxes()
  {
    return this.Cy.wD;
  }
  
  protected float getTopFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    int i = getVerticalFadingEdgeLength();
    int j = getScrollY();
    if (j < i) {
      return j / i;
    }
    return 1.0F;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.Cz.hasNestedScrollingParent();
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.Cz.wA;
  }
  
  protected void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramInt1 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin + paramInt2, localMarginLayoutParams.width);
    paramInt2 = localMarginLayoutParams.topMargin;
    paramView.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(localMarginLayoutParams.bottomMargin + paramInt2, 0));
  }
  
  public void onAttachedToWindow()
  {
    this.Co = false;
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if ((o.g(paramMotionEvent) & 0x2) != 0) {
      switch (paramMotionEvent.getAction())
      {
      }
    }
    for (;;)
    {
      return false;
      if (!this.hO)
      {
        float f = o.f(paramMotionEvent, 9);
        if (f != 0.0F)
        {
          if (this.CA == 0.0F)
          {
            paramMotionEvent = new TypedValue();
            Context localContext = getContext();
            if (!localContext.getTheme().resolveAttribute(16842829, paramMotionEvent, true)) {
              throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.CA = paramMotionEvent.getDimension(localContext.getResources().getDisplayMetrics());
          }
          int i = (int)(f * this.CA);
          int j = cx();
          int m = getScrollY();
          int k = m - i;
          if (k < 0) {
            i = 0;
          }
          while (i != m)
          {
            super.scrollTo(getScrollX(), i);
            return true;
            i = j;
            if (k <= j) {
              i = k;
            }
          }
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    int i = paramMotionEvent.getAction();
    if ((i == 2) && (this.hO)) {
      return true;
    }
    switch (i & 0xFF)
    {
    }
    for (;;)
    {
      return this.hO;
      i = this.eA;
      if (i != -1)
      {
        int j = o.b(paramMotionEvent, i);
        if (j == -1)
        {
          new StringBuilder("Invalid pointerId=").append(i).append(" in onInterceptTouchEvent");
        }
        else
        {
          i = (int)o.e(paramMotionEvent, j);
          if ((Math.abs(i - this.hP) > this.hQ) && ((getNestedScrollAxes() & 0x2) == 0))
          {
            this.hO = true;
            this.hP = i;
            cv();
            this.ez.addMovement(paramMotionEvent);
            this.Cu = 0;
            paramMotionEvent = getParent();
            if (paramMotionEvent != null)
            {
              paramMotionEvent.requestDisallowInterceptTouchEvent(true);
              continue;
              j = (int)paramMotionEvent.getY();
              i = (int)paramMotionEvent.getX();
              if (getChildCount() > 0)
              {
                int k = getScrollY();
                View localView = getChildAt(0);
                if ((j >= localView.getTop() - k) && (j < localView.getBottom() - k) && (i >= localView.getLeft()) && (i < localView.getRight())) {
                  i = 1;
                }
              }
              for (;;)
              {
                if (i != 0) {
                  break label298;
                }
                this.hO = false;
                cw();
                break;
                i = 0;
                continue;
                i = 0;
              }
              label298:
              this.hP = j;
              this.eA = o.c(paramMotionEvent, 0);
              if (this.ez == null)
              {
                this.ez = VelocityTracker.obtain();
                label326:
                this.ez.addMovement(paramMotionEvent);
                this.hN.computeScrollOffset();
                if (this.hN.isFinished()) {
                  break label377;
                }
              }
              for (;;)
              {
                this.hO = bool;
                startNestedScroll(2);
                break;
                this.ez.clear();
                break label326;
                label377:
                bool = false;
              }
              this.hO = false;
              this.eA = -1;
              cw();
              if (this.hN.e(getScrollX(), getScrollY(), cx())) {
                z.F(this);
              }
              stopNestedScroll();
              continue;
              h(paramMotionEvent);
            }
          }
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.Cn = false;
    if ((this.Cp != null) && (a(this.Cp, this))) {
      aD(this.Cp);
    }
    this.Cp = null;
    if (!this.Co)
    {
      if (this.Cv != null)
      {
        scrollTo(getScrollX(), this.Cv.CC);
        this.Cv = null;
      }
      if (getChildCount() <= 0) {
        break label153;
      }
      paramInt1 = getChildAt(0).getMeasuredHeight();
      paramInt1 = Math.max(0, paramInt1 - (paramInt4 - paramInt2 - getPaddingBottom() - getPaddingTop()));
      if (getScrollY() <= paramInt1) {
        break label158;
      }
      scrollTo(getScrollX(), paramInt1);
    }
    for (;;)
    {
      scrollTo(getScrollX(), getScrollY());
      this.Co = true;
      return;
      label153:
      paramInt1 = 0;
      break;
      label158:
      if (getScrollY() < 0) {
        scrollTo(getScrollX(), 0);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!this.Cq) {}
    View localView;
    do
    {
      do
      {
        return;
      } while ((View.MeasureSpec.getMode(paramInt2) == 0) || (getChildCount() <= 0));
      localView = getChildAt(0);
      paramInt2 = getMeasuredHeight();
    } while (localView.getMeasuredHeight() >= paramInt2);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    localView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(paramInt2 - getPaddingTop() - getPaddingBottom(), 1073741824));
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      ak((int)paramFloat2);
      return true;
    }
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt, null);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = getScrollY();
    scrollBy(0, paramInt4);
    paramInt1 = getScrollY() - paramInt1;
    dispatchNestedScroll(0, paramInt1, 0, paramInt4 - paramInt1, null);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.Cy.wD = paramInt;
    startNestedScroll(2);
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i;
    View localView;
    if (paramInt == 2)
    {
      i = 130;
      if (paramRect != null) {
        break label44;
      }
      localView = FocusFinder.getInstance().findNextFocus(this, null, i);
      label24:
      if (localView != null) {
        break label58;
      }
    }
    label44:
    label58:
    while (aC(localView))
    {
      return false;
      i = paramInt;
      if (paramInt != 1) {
        break;
      }
      i = 33;
      break;
      localView = FocusFinder.getInstance().findNextFocusFromRect(this, paramRect, i);
      break label24;
    }
    return localView.requestFocus(i, paramRect);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.Cv = paramParcelable;
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.CC = getScrollY();
    return localSavedState;
  }
  
  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.CB != null) {
      this.CB.b(this);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = findFocus();
    if ((localView == null) || (this == localView)) {}
    while (!d(localView, 0, paramInt4)) {
      return;
    }
    localView.getDrawingRect(this.dF);
    offsetDescendantRectToMyCoords(localView, this.dF);
    ai(computeScrollDeltaToGetChildRectOnScreen(this.dF));
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return (paramInt & 0x2) != 0;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    this.Cy.wD = 0;
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    cv();
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i = o.d(paramMotionEvent);
    if (i == 0) {
      this.Cu = 0;
    }
    localMotionEvent.offsetLocation(0.0F, this.Cu);
    int k;
    int m;
    int j;
    switch (i)
    {
    case 4: 
    default: 
    case 0: 
    case 2: 
      ViewParent localViewParent;
      for (;;)
      {
        if (this.ez != null) {
          this.ez.addMovement(localMotionEvent);
        }
        localMotionEvent.recycle();
        return true;
        if (getChildCount() == 0) {
          return false;
        }
        if (!this.hN.isFinished()) {}
        for (boolean bool = true;; bool = false)
        {
          this.hO = bool;
          if (bool)
          {
            localViewParent = getParent();
            if (localViewParent != null) {
              localViewParent.requestDisallowInterceptTouchEvent(true);
            }
          }
          if (!this.hN.isFinished()) {
            this.hN.abortAnimation();
          }
          this.hP = ((int)paramMotionEvent.getY());
          this.eA = o.c(paramMotionEvent, 0);
          startNestedScroll(2);
          break;
        }
        k = o.b(paramMotionEvent, this.eA);
        if (k != -1) {
          break;
        }
        new StringBuilder("Invalid pointerId=").append(this.eA).append(" in onTouchEvent");
      }
      m = (int)o.e(paramMotionEvent, k);
      j = this.hP - m;
      i = j;
      if (dispatchNestedPreScroll(0, j, this.Ct, this.Cs))
      {
        i = j - this.Ct[1];
        localMotionEvent.offsetLocation(0.0F, this.Cs[1]);
        this.Cu += this.Cs[1];
      }
      if ((!this.hO) && (Math.abs(i) > this.hQ))
      {
        localViewParent = getParent();
        if (localViewParent != null) {
          localViewParent.requestDisallowInterceptTouchEvent(true);
        }
        this.hO = true;
        if (i > 0) {
          i -= this.hQ;
        }
      }
      break;
    }
    label374:
    while (this.hO)
    {
      this.hP = (m - this.Cs[1]);
      int n = getScrollY();
      m = cx();
      j = z.C(this);
      if ((j == 0) || ((j == 1) && (m > 0))) {}
      for (j = 1;; j = 0)
      {
        if ((d(0, i, 0, getScrollY(), m)) && (!hasNestedScrollingParent())) {
          this.ez.clear();
        }
        int i1 = getScrollY() - n;
        if (!dispatchNestedScroll(0, i1, 0, i - i1, this.Cs)) {
          break label546;
        }
        this.hP -= this.Cs[1];
        localMotionEvent.offsetLocation(0.0F, this.Cs[1]);
        this.Cu += this.Cs[1];
        break;
        i += this.hQ;
        break label374;
      }
      label546:
      if (j == 0) {
        break;
      }
      cz();
      j = n + i;
      if (j < 0)
      {
        this.Cl.h(i / getHeight(), o.d(paramMotionEvent, k) / getWidth());
        if (!this.Cm.isFinished()) {
          this.Cm.cq();
        }
      }
      while ((this.Cl != null) && ((!this.Cl.isFinished()) || (!this.Cm.isFinished())))
      {
        z.F(this);
        break;
        if (j > m)
        {
          this.Cm.h(i / getHeight(), 1.0F - o.d(paramMotionEvent, k) / getWidth());
          if (!this.Cl.isFinished()) {
            this.Cl.cq();
          }
        }
      }
      if (this.hO)
      {
        paramMotionEvent = this.ez;
        paramMotionEvent.computeCurrentVelocity(1000, this.yg);
        i = (int)y.b(paramMotionEvent, this.eA);
        if (Math.abs(i) <= this.yf) {
          break label763;
        }
        ak(-i);
      }
      for (;;)
      {
        this.eA = -1;
        cy();
        break;
        label763:
        if (this.hN.e(getScrollX(), getScrollY(), cx())) {
          z.F(this);
        }
      }
      if ((this.hO) && (getChildCount() > 0) && (this.hN.e(getScrollX(), getScrollY(), cx()))) {
        z.F(this);
      }
      this.eA = -1;
      cy();
      break;
      i = o.e(paramMotionEvent);
      this.hP = ((int)o.e(paramMotionEvent, i));
      this.eA = o.c(paramMotionEvent, i);
      break;
      h(paramMotionEvent);
      this.hP = ((int)o.e(paramMotionEvent, o.b(paramMotionEvent, this.eA)));
      break;
    }
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    if (!this.Cn) {
      aD(paramView2);
    }
    for (;;)
    {
      super.requestChildFocus(paramView1, paramView2);
      return;
      this.Cp = paramView2;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    int i = computeScrollDeltaToGetChildRectOnScreen(paramRect);
    if (i != 0) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool)
      {
        if (!paramBoolean) {
          break;
        }
        scrollBy(0, i);
      }
      return bool;
    }
    smoothScrollBy(0, i);
    return bool;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean) {
      cw();
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    this.Cn = true;
    super.requestLayout();
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      paramInt1 = clamp(paramInt1, getWidth() - getPaddingRight() - getPaddingLeft(), localView.getWidth());
      paramInt2 = clamp(paramInt2, getHeight() - getPaddingBottom() - getPaddingTop(), localView.getHeight());
      if ((paramInt1 != getScrollX()) || (paramInt2 != getScrollY())) {
        super.scrollTo(paramInt1, paramInt2);
      }
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.Cz.setNestedScrollingEnabled(paramBoolean);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return true;
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.Cz.startNestedScroll(paramInt);
  }
  
  public void stopNestedScroll()
  {
    this.Cz.stopNestedScroll();
  }
  
  static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    public int CC;
    
    public SavedState(Parcel paramParcel)
    {
      super();
      this.CC = paramParcel.readInt();
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.CC + "}";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.CC);
    }
  }
  
  static final class a
    extends android.support.v4.view.a
  {
    public final void a(View paramView, b paramb)
    {
      super.a(paramView, paramb);
      paramView = (NestedScrollView)paramView;
      paramb.setClassName(ScrollView.class.getName());
      if (paramView.isEnabled())
      {
        int i = NestedScrollView.a(paramView);
        if (i > 0)
        {
          paramb.setScrollable(true);
          if (paramView.getScrollY() > 0) {
            paramb.addAction(8192);
          }
          if (paramView.getScrollY() < i) {
            paramb.addAction(4096);
          }
        }
      }
    }
    
    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramView = (NestedScrollView)paramView;
      paramAccessibilityEvent.setClassName(ScrollView.class.getName());
      paramAccessibilityEvent = android.support.v4.view.a.a.a(paramAccessibilityEvent);
      if (NestedScrollView.a(paramView) > 0) {}
      for (boolean bool = true;; bool = false)
      {
        paramAccessibilityEvent.setScrollable(bool);
        int i = paramView.getScrollX();
        f.zG.f(paramAccessibilityEvent.zH, i);
        i = paramView.getScrollY();
        f.zG.g(paramAccessibilityEvent.zH, i);
        i = paramView.getScrollX();
        f.zG.i(paramAccessibilityEvent.zH, i);
        i = NestedScrollView.a(paramView);
        f.zG.j(paramAccessibilityEvent.zH, i);
        return;
      }
    }
    
    public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
        return true;
      }
      paramView = (NestedScrollView)paramView;
      if (!paramView.isEnabled()) {
        return false;
      }
      switch (paramInt)
      {
      default: 
        return false;
      case 4096: 
        paramInt = Math.min(paramView.getHeight() - paramView.getPaddingBottom() - paramView.getPaddingTop() + paramView.getScrollY(), NestedScrollView.a(paramView));
        if (paramInt != paramView.getScrollY())
        {
          paramView.aj(paramInt);
          return true;
        }
        return false;
      }
      paramInt = paramView.getHeight();
      int i = paramView.getPaddingBottom();
      int j = paramView.getPaddingTop();
      paramInt = Math.max(paramView.getScrollY() - (paramInt - i - j), 0);
      if (paramInt != paramView.getScrollY())
      {
        paramView.aj(paramInt);
        return true;
      }
      return false;
    }
  }
  
  public static abstract interface b
  {
    public abstract void b(NestedScrollView paramNestedScrollView);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\widget\NestedScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
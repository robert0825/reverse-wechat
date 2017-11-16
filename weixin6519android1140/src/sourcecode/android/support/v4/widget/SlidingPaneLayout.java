package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.e;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout
  extends ViewGroup
{
  static final d Da = new e();
  private int CM = -858993460;
  private int CN;
  private Drawable CO;
  private Drawable CP;
  private final int CQ;
  private boolean CR;
  private View CS;
  private float CT;
  private float CU;
  private int CV;
  private int CW;
  private final u CX;
  private boolean CY;
  private final ArrayList<b> CZ = new ArrayList();
  private final Rect fV = new Rect();
  private float wS;
  private float wT;
  private boolean ya;
  private boolean ym = true;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 17)
    {
      Da = new g();
      return;
    }
    if (i >= 16)
    {
      Da = new f();
      return;
    }
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.CQ = ((int)(32.0F * f + 0.5F));
    ViewConfiguration.get(paramContext);
    setWillNotDraw(false);
    z.a(this, new a());
    z.i(this, 1);
    this.CX = u.a(this, 0.5F, new c());
    this.CX.Ej = (f * 400.0F);
  }
  
  private void A(float paramFloat)
  {
    boolean bool = cC();
    Object localObject = (LayoutParams)this.CS.getLayoutParams();
    int i;
    label43:
    int j;
    if (((LayoutParams)localObject).De) {
      if (bool)
      {
        i = ((LayoutParams)localObject).rightMargin;
        if (i > 0) {
          break label177;
        }
        i = 1;
        int n = getChildCount();
        j = 0;
        label52:
        if (j >= n) {
          return;
        }
        localObject = getChildAt(j);
        if (localObject != this.CS)
        {
          int k = (int)((1.0F - this.CU) * this.CW);
          this.CU = paramFloat;
          int m = k - (int)((1.0F - paramFloat) * this.CW);
          k = m;
          if (bool) {
            k = -m;
          }
          ((View)localObject).offsetLeftAndRight(k);
          if (i != 0) {
            if (!bool) {
              break label182;
            }
          }
        }
      }
    }
    label177:
    label182:
    for (float f = this.CU - 1.0F;; f = 1.0F - this.CU)
    {
      a((View)localObject, f, this.CN);
      j += 1;
      break label52;
      i = ((LayoutParams)localObject).leftMargin;
      break;
      i = 0;
      break label43;
    }
  }
  
  private void a(View paramView, float paramFloat, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      i = (int)(((0xFF000000 & paramInt) >>> 24) * paramFloat);
      if (localLayoutParams.Df == null) {
        localLayoutParams.Df = new Paint();
      }
      localLayoutParams.Df.setColorFilter(new PorterDuffColorFilter(i << 24 | 0xFFFFFF & paramInt, PorterDuff.Mode.SRC_OVER));
      if (z.I(paramView) != 2) {
        z.a(paramView, 2, localLayoutParams.Df);
      }
      aF(paramView);
    }
    while (z.I(paramView) == 0)
    {
      int i;
      return;
    }
    if (localLayoutParams.Df != null) {
      localLayoutParams.Df.setColorFilter(null);
    }
    paramView = new b(paramView);
    this.CZ.add(paramView);
    z.a(this, paramView);
  }
  
  private void aF(View paramView)
  {
    Da.b(this, paramView);
  }
  
  private boolean cB()
  {
    boolean bool = false;
    if ((this.ym) || (z(0.0F)))
    {
      this.CY = false;
      bool = true;
    }
    return bool;
  }
  
  private boolean cC()
  {
    return z.J(this) == 1;
  }
  
  private boolean z(float paramFloat)
  {
    if (!this.CR) {
      return false;
    }
    boolean bool = cC();
    LayoutParams localLayoutParams = (LayoutParams)this.CS.getLayoutParams();
    int j;
    int k;
    if (bool)
    {
      i = getPaddingRight();
      j = localLayoutParams.rightMargin;
      k = this.CS.getWidth();
    }
    for (int i = (int)(getWidth() - (j + i + this.CV * paramFloat + k)); this.CX.e(this.CS, i, this.CS.getTop()); i = (int)(localLayoutParams.leftMargin + i + this.CV * paramFloat))
    {
      cA();
      z.F(this);
      return true;
      i = getPaddingLeft();
    }
    return false;
  }
  
  final void aE(View paramView)
  {
    boolean bool = cC();
    int i;
    int j;
    label31:
    int k;
    label63:
    int i1;
    int n;
    int m;
    label92:
    int i2;
    label101:
    Object localObject;
    if (bool)
    {
      i = getWidth() - getPaddingRight();
      if (!bool) {
        break label244;
      }
      j = getPaddingLeft();
      int i4 = getPaddingTop();
      int i5 = getHeight();
      int i6 = getPaddingBottom();
      if (paramView == null) {
        break label303;
      }
      if (!z.L(paramView)) {
        break label257;
      }
      k = 1;
      if (k == 0) {
        break label303;
      }
      i1 = paramView.getLeft();
      n = paramView.getRight();
      m = paramView.getTop();
      k = paramView.getBottom();
      int i7 = getChildCount();
      i2 = 0;
      if (i2 >= i7) {
        return;
      }
      localObject = getChildAt(i2);
      if (localObject == paramView) {
        return;
      }
      if (!bool) {
        break label318;
      }
      i3 = j;
      label130:
      int i8 = Math.max(i3, ((View)localObject).getLeft());
      int i9 = Math.max(i4, ((View)localObject).getTop());
      if (!bool) {
        break label324;
      }
      i3 = i;
      label162:
      i3 = Math.min(i3, ((View)localObject).getRight());
      int i10 = Math.min(i5 - i6, ((View)localObject).getBottom());
      if ((i8 < i1) || (i9 < m) || (i3 > n) || (i10 > k)) {
        break label330;
      }
    }
    label244:
    label257:
    label303:
    label318:
    label324:
    label330:
    for (int i3 = 4;; i3 = 0)
    {
      ((View)localObject).setVisibility(i3);
      i2 += 1;
      break label101;
      i = getPaddingLeft();
      break;
      j = getWidth() - getPaddingRight();
      break label31;
      if (Build.VERSION.SDK_INT < 18)
      {
        localObject = paramView.getBackground();
        if (localObject != null)
        {
          if (((Drawable)localObject).getOpacity() == -1)
          {
            k = 1;
            break label63;
          }
          k = 0;
          break label63;
        }
      }
      k = 0;
      break label63;
      k = 0;
      m = 0;
      n = 0;
      i1 = 0;
      break label92;
      i3 = i;
      break label130;
      i3 = j;
      break label162;
    }
  }
  
  final boolean aG(View paramView)
  {
    if (paramView == null) {
      return false;
    }
    paramView = (LayoutParams)paramView.getLayoutParams();
    return (this.CR) && (paramView.De) && (this.CT > 0.0F);
  }
  
  final void cA()
  {
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 4) {
        localView.setVisibility(0);
      }
      i += 1;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    if (this.CX.cG())
    {
      if (!this.CR) {
        this.CX.abort();
      }
    }
    else {
      return;
    }
    z.F(this);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    Drawable localDrawable;
    if (cC())
    {
      localDrawable = this.CP;
      if (getChildCount() <= 1) {
        break label53;
      }
    }
    label53:
    for (View localView = getChildAt(1);; localView = null)
    {
      if ((localView != null) && (localDrawable != null)) {
        break label59;
      }
      return;
      localDrawable = this.CO;
      break;
    }
    label59:
    int k = localView.getTop();
    int m = localView.getBottom();
    int n = localDrawable.getIntrinsicWidth();
    int j;
    int i;
    if (cC())
    {
      j = localView.getRight();
      i = j + n;
    }
    for (;;)
    {
      localDrawable.setBounds(j, k, i, m);
      localDrawable.draw(paramCanvas);
      return;
      i = localView.getLeft();
      j = i - n;
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = paramCanvas.save(2);
    if ((this.CR) && (!localLayoutParams.Dd) && (this.CS != null))
    {
      paramCanvas.getClipBounds(this.fV);
      if (!cC()) {
        break label168;
      }
      this.fV.left = Math.max(this.fV.left, this.CS.getRight());
    }
    boolean bool;
    for (;;)
    {
      paramCanvas.clipRect(this.fV);
      if (Build.VERSION.SDK_INT >= 11) {
        break label216;
      }
      if ((!localLayoutParams.De) || (this.CT <= 0.0F)) {
        break label228;
      }
      if (!paramView.isDrawingCacheEnabled()) {
        paramView.setDrawingCacheEnabled(true);
      }
      Bitmap localBitmap = paramView.getDrawingCache();
      if (localBitmap == null) {
        break;
      }
      paramCanvas.drawBitmap(localBitmap, paramView.getLeft(), paramView.getTop(), localLayoutParams.Df);
      bool = false;
      paramCanvas.restoreToCount(i);
      return bool;
      label168:
      this.fV.right = Math.min(this.fV.right, this.CS.getLeft());
    }
    new StringBuilder("drawChild: child view ").append(paramView).append(" returned null drawing cache");
    for (;;)
    {
      label216:
      bool = super.drawChild(paramCanvas, paramView, paramLong);
      break;
      label228:
      if (paramView.isDrawingCacheEnabled()) {
        paramView.setDrawingCacheEnabled(false);
      }
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
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.ym = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.ym = true;
    int j = this.CZ.size();
    int i = 0;
    while (i < j)
    {
      ((b)this.CZ.get(i)).run();
      i += 1;
    }
    this.CZ.clear();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    int i = o.d(paramMotionEvent);
    if ((!this.CR) && (i == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null) {
        if (u.f(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
          break label104;
        }
      }
    }
    label104:
    for (boolean bool1 = true;; bool1 = false)
    {
      this.CY = bool1;
      if ((this.CR) && ((!this.ya) || (i == 0))) {
        break;
      }
      this.CX.cancel();
      bool1 = super.onInterceptTouchEvent(paramMotionEvent);
      return bool1;
    }
    if ((i == 3) || (i == 1))
    {
      this.CX.cancel();
      return false;
    }
    switch (i)
    {
    }
    label160:
    float f1;
    float f2;
    do
    {
      for (i = 0;; i = 1)
      {
        if (!this.CX.j(paramMotionEvent))
        {
          bool1 = bool2;
          if (i == 0) {
            break;
          }
        }
        return true;
        this.ya = false;
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        this.wS = f1;
        this.wT = f2;
        if ((!u.f(this.CS, (int)f1, (int)f2)) || (!aG(this.CS))) {
          break label160;
        }
      }
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      f2 = Math.abs(f2 - this.wS);
      f1 = Math.abs(f1 - this.wT);
    } while ((f2 <= this.CX.hQ) || (f1 <= f2));
    this.CX.cancel();
    this.ya = true;
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = cC();
    label35:
    label46:
    int m;
    float f;
    label82:
    label93:
    LayoutParams localLayoutParams;
    int i1;
    int j;
    int i;
    if (bool)
    {
      this.CX.El = 2;
      int k = paramInt3 - paramInt1;
      if (!bool) {
        break label352;
      }
      paramInt1 = getPaddingRight();
      if (!bool) {
        break label360;
      }
      paramInt3 = getPaddingLeft();
      int n = getPaddingTop();
      m = getChildCount();
      if (this.ym)
      {
        if ((!this.CR) || (!this.CY)) {
          break label369;
        }
        f = 1.0F;
        this.CT = f;
      }
      paramInt4 = 0;
      paramInt2 = paramInt1;
      if (paramInt4 >= m) {
        break label442;
      }
      View localView = getChildAt(paramInt4);
      if (localView.getVisibility() == 8) {
        break label551;
      }
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      i1 = localView.getMeasuredWidth();
      j = 0;
      if (!localLayoutParams.Dd) {
        break label390;
      }
      i = localLayoutParams.leftMargin;
      int i2 = localLayoutParams.rightMargin;
      i2 = Math.min(paramInt1, k - paramInt3 - this.CQ) - paramInt2 - (i + i2);
      this.CV = i2;
      if (!bool) {
        break label375;
      }
      i = localLayoutParams.rightMargin;
      label202:
      if (paramInt2 + i + i2 + i1 / 2 <= k - paramInt3) {
        break label385;
      }
      paramBoolean = true;
      label224:
      localLayoutParams.De = paramBoolean;
      i2 = (int)(i2 * this.CT);
      paramInt2 += i + i2;
      this.CT = (i2 / this.CV);
      i = j;
      if (!bool) {
        break label426;
      }
      j = k - paramInt2 + i;
      i = j - i1;
      label287:
      localView.layout(i, n, j, localView.getMeasuredHeight() + n);
      i = localView.getWidth() + paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = i;
    }
    for (;;)
    {
      i = paramInt4 + 1;
      paramInt4 = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = paramInt4;
      paramInt4 = i;
      break label93;
      this.CX.El = 1;
      break;
      label352:
      paramInt1 = getPaddingLeft();
      break label35;
      label360:
      paramInt3 = getPaddingRight();
      break label46;
      label369:
      f = 0.0F;
      break label82;
      label375:
      i = localLayoutParams.leftMargin;
      break label202;
      label385:
      paramBoolean = false;
      break label224;
      label390:
      if ((this.CR) && (this.CW != 0)) {}
      for (paramInt2 = (int)((1.0F - this.CT) * this.CW);; paramInt2 = 0)
      {
        i = paramInt2;
        paramInt2 = paramInt1;
        break;
        label426:
        i = paramInt2 - i;
        j = i + i1;
        break label287;
        label442:
        if (this.ym)
        {
          if (!this.CR) {
            break label517;
          }
          if (this.CW != 0) {
            A(this.CT);
          }
          if (((LayoutParams)this.CS.getLayoutParams()).De) {
            a(this.CS, this.CT, this.CM);
          }
        }
        for (;;)
        {
          aE(this.CS);
          this.ym = false;
          return;
          label517:
          paramInt1 = 0;
          while (paramInt1 < m)
          {
            a(getChildAt(paramInt1), 0.0F, this.CM);
            paramInt1 += 1;
          }
        }
      }
      label551:
      i = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = i;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k = View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    if (k != 1073741824) {
      if (isInEditMode())
      {
        if ((k == Integer.MIN_VALUE) || (k != 0)) {
          break label1069;
        }
        i = j;
        j = 300;
      }
    }
    for (;;)
    {
      label93:
      boolean bool1;
      int i2;
      int i3;
      int i1;
      float f1;
      label129:
      View localView;
      LayoutParams localLayoutParams;
      int m;
      switch (i)
      {
      default: 
        paramInt1 = 0;
        k = -1;
        bool1 = false;
        i2 = j - getPaddingLeft() - getPaddingRight();
        i3 = getChildCount();
        this.CS = null;
        i1 = 0;
        paramInt2 = i2;
        f1 = 0.0F;
        if (i1 < i3)
        {
          localView = getChildAt(i1);
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if (localView.getVisibility() == 8)
          {
            localLayoutParams.De = false;
            m = paramInt2;
            paramInt2 = paramInt1;
            paramInt1 = m;
          }
        }
        break;
      }
      for (;;)
      {
        i1 += 1;
        m = paramInt2;
        paramInt2 = paramInt1;
        paramInt1 = m;
        break label129;
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        if (j != 0) {
          break label1069;
        }
        if (isInEditMode())
        {
          if (j != 0) {
            break label1069;
          }
          paramInt2 = Integer.MIN_VALUE;
          j = i;
          paramInt1 = 300;
          i = paramInt2;
          break;
        }
        throw new IllegalStateException("Height must not be UNSPECIFIED");
        paramInt1 = paramInt1 - getPaddingTop() - getPaddingBottom();
        k = paramInt1;
        break label93;
        k = getPaddingTop();
        m = getPaddingBottom();
        paramInt2 = 0;
        k = paramInt1 - k - m;
        paramInt1 = paramInt2;
        break label93;
        float f2 = f1;
        if (localLayoutParams.weight > 0.0F)
        {
          f2 = f1 + localLayoutParams.weight;
          if (localLayoutParams.width == 0) {}
        }
        else
        {
          m = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
          label364:
          int n;
          label384:
          int i4;
          if (localLayoutParams.width == -2)
          {
            m = View.MeasureSpec.makeMeasureSpec(i2 - m, Integer.MIN_VALUE);
            if (localLayoutParams.height != -2) {
              break label526;
            }
            n = View.MeasureSpec.makeMeasureSpec(k, Integer.MIN_VALUE);
            localView.measure(m, n);
            n = localView.getMeasuredWidth();
            i4 = localView.getMeasuredHeight();
            m = paramInt1;
            if (i == Integer.MIN_VALUE)
            {
              m = paramInt1;
              if (i4 > paramInt1) {
                m = Math.min(i4, k);
              }
            }
            paramInt1 = paramInt2 - n;
            if (paramInt1 >= 0) {
              break label564;
            }
          }
          label526:
          label564:
          for (boolean bool2 = true;; bool2 = false)
          {
            localLayoutParams.Dd = bool2;
            if (localLayoutParams.Dd) {
              this.CS = localView;
            }
            f1 = f2;
            bool1 = bool2 | bool1;
            paramInt2 = m;
            break;
            if (localLayoutParams.width == -1)
            {
              m = View.MeasureSpec.makeMeasureSpec(i2 - m, 1073741824);
              break label364;
            }
            m = View.MeasureSpec.makeMeasureSpec(localLayoutParams.width, 1073741824);
            break label364;
            if (localLayoutParams.height == -1)
            {
              n = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
              break label384;
            }
            n = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
            break label384;
          }
          if ((bool1) || (f1 > 0.0F))
          {
            i1 = i2 - this.CQ;
            m = 0;
            if (m < i3)
            {
              localView = getChildAt(m);
              if (localView.getVisibility() != 8)
              {
                localLayoutParams = (LayoutParams)localView.getLayoutParams();
                if (localView.getVisibility() != 8)
                {
                  if ((localLayoutParams.width != 0) || (localLayoutParams.weight <= 0.0F)) {
                    break label755;
                  }
                  i = 1;
                  label659:
                  if (i == 0) {
                    break label761;
                  }
                  n = 0;
                  label667:
                  if ((!bool1) || (localView == this.CS)) {
                    break label825;
                  }
                  if ((localLayoutParams.width < 0) && ((n > i1) || (localLayoutParams.weight > 0.0F)))
                  {
                    if (i == 0) {
                      break label809;
                    }
                    if (localLayoutParams.height != -2) {
                      break label771;
                    }
                    i = View.MeasureSpec.makeMeasureSpec(k, Integer.MIN_VALUE);
                    label731:
                    localView.measure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), i);
                  }
                }
              }
              for (;;)
              {
                m += 1;
                break;
                label755:
                i = 0;
                break label659;
                label761:
                n = localView.getMeasuredWidth();
                break label667;
                label771:
                if (localLayoutParams.height == -1)
                {
                  i = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
                  break label731;
                }
                i = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
                break label731;
                label809:
                i = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
                break label731;
                label825:
                if (localLayoutParams.weight > 0.0F)
                {
                  if (localLayoutParams.width == 0) {
                    if (localLayoutParams.height == -2) {
                      i = View.MeasureSpec.makeMeasureSpec(k, Integer.MIN_VALUE);
                    }
                  }
                  for (;;)
                  {
                    if (!bool1) {
                      break label971;
                    }
                    i4 = localLayoutParams.leftMargin;
                    i4 = i2 - (localLayoutParams.rightMargin + i4);
                    int i5 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    if (n == i4) {
                      break;
                    }
                    localView.measure(i5, i);
                    break;
                    if (localLayoutParams.height == -1)
                    {
                      i = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
                    }
                    else
                    {
                      i = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
                      continue;
                      i = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
                    }
                  }
                  label971:
                  i4 = Math.max(0, paramInt2);
                  localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localLayoutParams.weight * i4 / f1) + n, 1073741824), i);
                }
              }
            }
          }
          setMeasuredDimension(j, getPaddingTop() + paramInt1 + getPaddingBottom());
          this.CR = bool1;
          if ((this.CX.DZ != 0) && (!bool1)) {
            this.CX.abort();
          }
          return;
        }
        m = paramInt1;
        f1 = f2;
        paramInt1 = paramInt2;
        paramInt2 = m;
      }
      label1069:
      paramInt2 = j;
      j = i;
      i = paramInt2;
    }
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
    if (paramParcelable.Dg) {
      if ((this.ym) || (z(1.0F))) {
        this.CY = true;
      }
    }
    for (;;)
    {
      this.CY = paramParcelable.Dg;
      return;
      cB();
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    boolean bool;
    if (this.CR) {
      if ((!this.CR) || (this.CT == 1.0F)) {
        bool = true;
      }
    }
    for (;;)
    {
      localSavedState.Dg = bool;
      return localSavedState;
      bool = false;
      continue;
      bool = this.CY;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      this.ym = true;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.CR) {
      return super.onTouchEvent(paramMotionEvent);
    }
    this.CX.k(paramMotionEvent);
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    for (;;)
    {
      return true;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.wS = f1;
      this.wT = f2;
      continue;
      if (aG(this.CS))
      {
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        float f3 = f1 - this.wS;
        float f4 = f2 - this.wT;
        int i = this.CX.hQ;
        if ((f3 * f3 + f4 * f4 < i * i) && (u.f(this.CS, (int)f1, (int)f2))) {
          cB();
        }
      }
    }
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!this.CR)) {
      if (paramView1 != this.CS) {
        break label36;
      }
    }
    label36:
    for (boolean bool = true;; bool = false)
    {
      this.CY = bool;
      return;
    }
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    private static final int[] xg = { 16843137 };
    boolean Dd;
    boolean De;
    Paint Df;
    public float weight = 0.0F;
    
    public LayoutParams()
    {
      super(-1);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, xg);
      this.weight = paramContext.getFloat(0, 0.0F);
      paramContext.recycle();
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
  
  static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    boolean Dg;
    
    private SavedState(Parcel paramParcel)
    {
      super();
      if (paramParcel.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.Dg = bool;
        return;
      }
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      if (this.Dg) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        return;
      }
    }
  }
  
  final class a
    extends a
  {
    private final Rect fV = new Rect();
    
    a() {}
    
    private boolean aH(View paramView)
    {
      return SlidingPaneLayout.this.aG(paramView);
    }
    
    public final void a(View paramView, b paramb)
    {
      b localb = b.a(paramb);
      super.a(paramView, localb);
      Rect localRect = this.fV;
      localb.getBoundsInParent(localRect);
      paramb.setBoundsInParent(localRect);
      localb.getBoundsInScreen(localRect);
      paramb.setBoundsInScreen(localRect);
      paramb.setVisibleToUser(localb.isVisibleToUser());
      paramb.setPackageName(localb.getPackageName());
      paramb.setClassName(localb.getClassName());
      paramb.setContentDescription(localb.getContentDescription());
      paramb.setEnabled(localb.isEnabled());
      paramb.setClickable(localb.isClickable());
      paramb.setFocusable(localb.isFocusable());
      paramb.setFocused(localb.isFocused());
      paramb.setAccessibilityFocused(localb.isAccessibilityFocused());
      paramb.setSelected(localb.isSelected());
      paramb.setLongClickable(localb.isLongClickable());
      paramb.addAction(localb.getActions());
      int i = b.yZ.C(localb.za);
      b.yZ.c(paramb.za, i);
      localb.recycle();
      paramb.setClassName(SlidingPaneLayout.class.getName());
      paramb.setSource(paramView);
      paramView = z.K(paramView);
      if ((paramView instanceof View)) {
        paramb.setParent((View)paramView);
      }
      int j = SlidingPaneLayout.this.getChildCount();
      i = 0;
      while (i < j)
      {
        paramView = SlidingPaneLayout.this.getChildAt(i);
        if ((!aH(paramView)) && (paramView.getVisibility() == 0))
        {
          z.i(paramView, 1);
          paramb.addChild(paramView);
        }
        i += 1;
      }
    }
    
    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }
    
    public final boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if (!aH(paramView)) {
        return super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
      }
      return false;
    }
  }
  
  private final class b
    implements Runnable
  {
    final View Dc;
    
    b(View paramView)
    {
      this.Dc = paramView;
    }
    
    public final void run()
    {
      if (this.Dc.getParent() == SlidingPaneLayout.this)
      {
        z.a(this.Dc, 0, null);
        SlidingPaneLayout.a(SlidingPaneLayout.this, this.Dc);
      }
      SlidingPaneLayout.g(SlidingPaneLayout.this).remove(this);
    }
  }
  
  private final class c
    extends u.a
  {
    public c() {}
    
    public final void a(View paramView, float paramFloat1, float paramFloat2)
    {
      SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
      int i;
      int j;
      if (SlidingPaneLayout.e(SlidingPaneLayout.this))
      {
        i = SlidingPaneLayout.this.getPaddingRight();
        j = localLayoutParams.rightMargin + i;
        if (paramFloat1 >= 0.0F)
        {
          i = j;
          if (paramFloat1 == 0.0F)
          {
            i = j;
            if (SlidingPaneLayout.c(SlidingPaneLayout.this) <= 0.5F) {}
          }
        }
        else
        {
          i = j + SlidingPaneLayout.f(SlidingPaneLayout.this);
        }
        j = SlidingPaneLayout.d(SlidingPaneLayout.this).getWidth();
        i = SlidingPaneLayout.this.getWidth() - i - j;
      }
      for (;;)
      {
        SlidingPaneLayout.b(SlidingPaneLayout.this).p(i, paramView.getTop());
        SlidingPaneLayout.this.invalidate();
        return;
        i = SlidingPaneLayout.this.getPaddingLeft();
        j = localLayoutParams.leftMargin + i;
        if (paramFloat1 <= 0.0F)
        {
          i = j;
          if (paramFloat1 == 0.0F)
          {
            i = j;
            if (SlidingPaneLayout.c(SlidingPaneLayout.this) <= 0.5F) {}
          }
        }
        else
        {
          i = j + SlidingPaneLayout.f(SlidingPaneLayout.this);
        }
      }
    }
    
    public final void a(View paramView, int paramInt1, int paramInt2)
    {
      SlidingPaneLayout.a(SlidingPaneLayout.this, paramInt1);
      SlidingPaneLayout.this.invalidate();
    }
    
    public final boolean b(View paramView, int paramInt)
    {
      if (SlidingPaneLayout.a(SlidingPaneLayout.this)) {
        return false;
      }
      return ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).Dd;
    }
    
    public final int c(View paramView, int paramInt)
    {
      return paramView.getTop();
    }
    
    public final int d(View paramView, int paramInt)
    {
      paramView = (SlidingPaneLayout.LayoutParams)SlidingPaneLayout.d(SlidingPaneLayout.this).getLayoutParams();
      if (SlidingPaneLayout.e(SlidingPaneLayout.this))
      {
        i = SlidingPaneLayout.this.getWidth();
        j = SlidingPaneLayout.this.getPaddingRight();
        i -= paramView.rightMargin + j + SlidingPaneLayout.d(SlidingPaneLayout.this).getWidth();
        j = SlidingPaneLayout.f(SlidingPaneLayout.this);
        return Math.max(Math.min(paramInt, i), i - j);
      }
      int i = SlidingPaneLayout.this.getPaddingLeft();
      i = paramView.leftMargin + i;
      int j = SlidingPaneLayout.f(SlidingPaneLayout.this);
      return Math.min(Math.max(paramInt, i), j + i);
    }
    
    public final void f(View paramView, int paramInt)
    {
      SlidingPaneLayout.this.cA();
    }
    
    public final void j(int paramInt)
    {
      if (SlidingPaneLayout.b(SlidingPaneLayout.this).DZ == 0)
      {
        if (SlidingPaneLayout.c(SlidingPaneLayout.this) == 0.0F)
        {
          SlidingPaneLayout.this.aE(SlidingPaneLayout.d(SlidingPaneLayout.this));
          localSlidingPaneLayout = SlidingPaneLayout.this;
          SlidingPaneLayout.d(SlidingPaneLayout.this);
          localSlidingPaneLayout.sendAccessibilityEvent(32);
          SlidingPaneLayout.a(SlidingPaneLayout.this, false);
        }
      }
      else {
        return;
      }
      SlidingPaneLayout localSlidingPaneLayout = SlidingPaneLayout.this;
      SlidingPaneLayout.d(SlidingPaneLayout.this);
      localSlidingPaneLayout.sendAccessibilityEvent(32);
      SlidingPaneLayout.a(SlidingPaneLayout.this, true);
    }
    
    public final void m(int paramInt1, int paramInt2)
    {
      SlidingPaneLayout.b(SlidingPaneLayout.this).n(SlidingPaneLayout.d(SlidingPaneLayout.this), paramInt2);
    }
    
    public final int s(View paramView)
    {
      return SlidingPaneLayout.f(SlidingPaneLayout.this);
    }
  }
  
  static abstract interface d
  {
    public abstract void b(SlidingPaneLayout paramSlidingPaneLayout, View paramView);
  }
  
  static class e
    implements SlidingPaneLayout.d
  {
    public void b(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
    {
      z.b(paramSlidingPaneLayout, paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    }
  }
  
  static final class f
    extends SlidingPaneLayout.e
  {
    private Method Dh;
    private Field Di;
    
    f()
    {
      try
      {
        this.Dh = View.class.getDeclaredMethod("getDisplayList", null);
        try
        {
          this.Di = View.class.getDeclaredField("mRecreateDisplayList");
          this.Di.setAccessible(true);
          return;
        }
        catch (NoSuchFieldException localNoSuchFieldException) {}
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;) {}
      }
    }
    
    public final void b(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
    {
      if ((this.Dh != null) && (this.Di != null)) {}
      try
      {
        this.Di.setBoolean(paramView, true);
        this.Dh.invoke(paramView, null);
        super.b(paramSlidingPaneLayout, paramView);
        return;
        paramView.invalidate();
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  static final class g
    extends SlidingPaneLayout.e
  {
    public final void b(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
    {
      z.a(paramView, ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).Df);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\widget\SlidingPaneLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.f;
import android.support.v4.view.z;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class LinearLayoutCompat
  extends ViewGroup
{
  boolean QR = true;
  private int QS = -1;
  private int QT = 0;
  private int QU;
  private int QV;
  private float QW;
  private boolean QX;
  private int[] QY;
  private int[] QZ;
  private Drawable Ra;
  int Rb;
  private int Rc;
  private int Rd;
  private int Re;
  private int tl = 8388659;
  
  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = ap.a(paramContext, paramAttributeSet, a.k.LinearLayoutCompat, paramInt);
    paramInt = paramContext.getInt(a.k.LinearLayoutCompat_android_orientation, -1);
    if (paramInt >= 0) {
      setOrientation(paramInt);
    }
    paramInt = paramContext.getInt(a.k.LinearLayoutCompat_android_gravity, -1);
    if (paramInt >= 0) {
      setGravity(paramInt);
    }
    boolean bool2 = paramContext.getBoolean(a.k.LinearLayoutCompat_android_baselineAligned, true);
    if (!bool2) {
      this.QR = bool2;
    }
    paramInt = a.k.LinearLayoutCompat_android_weightSum;
    this.QW = paramContext.Yu.getFloat(paramInt, -1.0F);
    this.QS = paramContext.getInt(a.k.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
    this.QX = paramContext.getBoolean(a.k.LinearLayoutCompat_measureWithLargestChild, false);
    paramAttributeSet = paramContext.getDrawable(a.k.LinearLayoutCompat_divider);
    if (paramAttributeSet != this.Ra)
    {
      this.Ra = paramAttributeSet;
      if (paramAttributeSet == null) {
        break label227;
      }
      this.Rb = paramAttributeSet.getIntrinsicWidth();
      this.Rc = paramAttributeSet.getIntrinsicHeight();
      if (paramAttributeSet != null) {
        break label240;
      }
    }
    for (;;)
    {
      setWillNotDraw(bool1);
      requestLayout();
      this.Rd = paramContext.getInt(a.k.LinearLayoutCompat_showDividers, 0);
      this.Re = paramContext.getDimensionPixelSize(a.k.LinearLayoutCompat_dividerPadding, 0);
      paramContext.Yu.recycle();
      return;
      label227:
      this.Rb = 0;
      this.Rc = 0;
      break;
      label240:
      bool1 = false;
    }
  }
  
  private void F(int paramInt1, int paramInt2)
  {
    int j = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    int i = 0;
    while (i < paramInt1)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if (localLayoutParams.width == -1)
        {
          int k = localLayoutParams.height;
          localLayoutParams.height = localView.getMeasuredHeight();
          measureChildWithMargins(localView, j, 0, paramInt2, 0);
          localLayoutParams.height = k;
        }
      }
      i += 1;
    }
  }
  
  private void G(int paramInt1, int paramInt2)
  {
    this.QV = 0;
    int i1 = 0;
    int m = 0;
    int k = 0;
    int i3 = 0;
    int n = 1;
    float f1 = 0.0F;
    int i10 = getChildCount();
    int i12 = View.MeasureSpec.getMode(paramInt1);
    int i11 = View.MeasureSpec.getMode(paramInt2);
    int i2 = 0;
    int j = 0;
    if ((this.QY == null) || (this.QZ == null))
    {
      this.QY = new int[4];
      this.QZ = new int[4];
    }
    Object localObject1 = this.QY;
    Object localObject2 = this.QZ;
    localObject1[3] = -1;
    localObject1[2] = -1;
    localObject1[1] = -1;
    localObject1[0] = -1;
    localObject2[3] = -1;
    localObject2[2] = -1;
    localObject2[1] = -1;
    localObject2[0] = -1;
    boolean bool1 = this.QR;
    boolean bool2 = this.QX;
    if (i12 == 1073741824) {}
    int i;
    int i4;
    Object localObject3;
    int i7;
    int i6;
    for (int i5 = 1;; i5 = 0)
    {
      i = Integer.MIN_VALUE;
      for (i4 = 0;; i4 = i7)
      {
        if (i4 >= i10) {
          break label894;
        }
        localObject3 = getChildAt(i4);
        if (localObject3 != null) {
          break;
        }
        this.QV += 0;
        i7 = i4;
        i6 = m;
        i4 = k;
        m = i3;
        k = n;
        i7 += 1;
        n = k;
        i3 = m;
        k = i4;
        m = i6;
      }
    }
    LayoutParams localLayoutParams;
    label340:
    label361:
    label386:
    int i8;
    int i9;
    if (((View)localObject3).getVisibility() != 8)
    {
      if (aU(i4)) {
        this.QV += this.Rb;
      }
      localLayoutParams = (LayoutParams)((View)localObject3).getLayoutParams();
      f1 += localLayoutParams.weight;
      if ((i12 == 1073741824) && (localLayoutParams.width == 0) && (localLayoutParams.weight > 0.0F)) {
        if (i5 != 0)
        {
          this.QV += localLayoutParams.leftMargin + localLayoutParams.rightMargin;
          if (!bool1) {
            break label643;
          }
          i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
          ((View)localObject3).measure(i6, i6);
          i6 = 0;
          if ((i11 == 1073741824) || (localLayoutParams.height != -1)) {
            break label2320;
          }
          i2 = 1;
          i6 = 1;
          i7 = localLayoutParams.topMargin + localLayoutParams.bottomMargin;
          i8 = ((View)localObject3).getMeasuredHeight() + i7;
          i9 = at.combineMeasuredStates(m, z.N((View)localObject3));
          if (bool1)
          {
            int i13 = ((View)localObject3).getBaseline();
            if (i13 != -1)
            {
              if (localLayoutParams.gravity >= 0) {
                break label823;
              }
              m = this.tl;
              label453:
              m = ((m & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              localObject1[m] = Math.max(localObject1[m], i13);
              localObject2[m] = Math.max(localObject2[m], i8 - i13);
            }
          }
          i1 = Math.max(i1, i8);
          if ((n == 0) || (localLayoutParams.height != -1)) {
            break label833;
          }
          m = 1;
          label526:
          if (localLayoutParams.weight <= 0.0F) {
            break label846;
          }
          if (i6 == 0) {
            break label839;
          }
          label541:
          n = Math.max(i3, i7);
          i6 = m;
          m = n;
          i7 = i;
          i3 = i9;
          n = k;
          k = i6;
          i = j;
          j = i7;
        }
      }
    }
    for (;;)
    {
      i7 = i4 + 0;
      i4 = i;
      i = j;
      j = i4;
      i4 = n;
      i6 = i3;
      break;
      i6 = this.QV;
      this.QV = Math.max(i6, localLayoutParams.leftMargin + i6 + localLayoutParams.rightMargin);
      break label340;
      label643:
      j = 1;
      break label361;
      i7 = Integer.MIN_VALUE;
      i6 = i7;
      if (localLayoutParams.width == 0)
      {
        i6 = i7;
        if (localLayoutParams.weight > 0.0F)
        {
          i6 = 0;
          localLayoutParams.width = -2;
        }
      }
      if (f1 == 0.0F)
      {
        i7 = this.QV;
        label701:
        e((View)localObject3, paramInt1, i7, paramInt2, 0);
        if (i6 != Integer.MIN_VALUE) {
          localLayoutParams.width = i6;
        }
        i6 = ((View)localObject3).getMeasuredWidth();
        if (i5 == 0) {
          break label786;
        }
        this.QV += localLayoutParams.leftMargin + i6 + localLayoutParams.rightMargin + 0;
      }
      for (;;)
      {
        if (bool2)
        {
          i = Math.max(i6, i);
          break;
          i7 = 0;
          break label701;
          label786:
          i7 = this.QV;
          this.QV = Math.max(i7, i7 + i6 + localLayoutParams.leftMargin + localLayoutParams.rightMargin + 0);
          continue;
          label823:
          m = localLayoutParams.gravity;
          break label453;
          label833:
          m = 0;
          break label526;
          label839:
          i7 = i8;
          break label541;
          label846:
          if (i6 != 0) {}
          for (;;)
          {
            n = Math.max(k, i7);
            k = m;
            i6 = j;
            m = i3;
            j = i;
            i = i6;
            i3 = i9;
            break;
            i7 = i8;
          }
          label894:
          if ((this.QV > 0) && (aU(i10))) {
            this.QV += this.Rb;
          }
          if ((localObject1[1] != -1) || (localObject1[0] != -1) || (localObject1[2] != -1) || (localObject1[3] != -1)) {}
          for (i4 = Math.max(i1, Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))) + Math.max(localObject2[3], Math.max(localObject2[0], Math.max(localObject2[1], localObject2[2]))));; i4 = i1)
          {
            if ((bool2) && ((i12 == Integer.MIN_VALUE) || (i12 == 0)))
            {
              this.QV = 0;
              i1 = 0;
              if (i1 < i10)
              {
                localObject3 = getChildAt(i1);
                if (localObject3 == null) {
                  this.QV += 0;
                }
                for (;;)
                {
                  i1 += 1;
                  break;
                  if (((View)localObject3).getVisibility() == 8)
                  {
                    i1 += 0;
                  }
                  else
                  {
                    localObject3 = (LayoutParams)((View)localObject3).getLayoutParams();
                    if (i5 != 0)
                    {
                      i6 = this.QV;
                      i7 = ((LayoutParams)localObject3).leftMargin;
                      this.QV = (((LayoutParams)localObject3).rightMargin + (i7 + i) + 0 + i6);
                    }
                    else
                    {
                      i6 = this.QV;
                      i7 = ((LayoutParams)localObject3).leftMargin;
                      this.QV = Math.max(i6, ((LayoutParams)localObject3).rightMargin + (i6 + i + i7) + 0);
                    }
                  }
                }
              }
            }
            this.QV += getPaddingLeft() + getPaddingRight();
            i8 = z.resolveSizeAndState(Math.max(this.QV, getSuggestedMinimumWidth()), paramInt1, 0);
            i1 = (0xFFFFFF & i8) - this.QV;
            if ((j != 0) || ((i1 != 0) && (f1 > 0.0F)))
            {
              if (this.QW > 0.0F) {
                f1 = this.QW;
              }
              localObject1[3] = -1;
              localObject1[2] = -1;
              localObject1[1] = -1;
              localObject1[0] = -1;
              localObject2[3] = -1;
              localObject2[2] = -1;
              localObject2[1] = -1;
              localObject2[0] = -1;
              this.QV = 0;
              i3 = 0;
              j = n;
              n = -1;
              i = m;
              m = n;
              n = i1;
              if (i3 < i10)
              {
                localObject3 = getChildAt(i3);
                if ((localObject3 == null) || (((View)localObject3).getVisibility() == 8)) {
                  break label2282;
                }
                localLayoutParams = (LayoutParams)((View)localObject3).getLayoutParams();
                float f2 = localLayoutParams.weight;
                if (f2 <= 0.0F) {
                  break label2267;
                }
                i4 = (int)(n * f2 / f1);
                i7 = getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom() + localLayoutParams.topMargin + localLayoutParams.bottomMargin, localLayoutParams.height);
                if ((localLayoutParams.width != 0) || (i12 != 1073741824))
                {
                  i6 = i4 + ((View)localObject3).getMeasuredWidth();
                  i1 = i6;
                  if (i6 < 0) {
                    i1 = 0;
                  }
                  label1468:
                  ((View)localObject3).measure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), i7);
                  i = at.combineMeasuredStates(i, z.N((View)localObject3) & 0xFF000000);
                  f1 -= f2;
                  i1 = n - i4;
                  n = i;
                  i = i1;
                  label1518:
                  if (i5 == 0) {
                    break label1791;
                  }
                  this.QV += ((View)localObject3).getMeasuredWidth() + localLayoutParams.leftMargin + localLayoutParams.rightMargin + 0;
                  label1551:
                  if ((i11 == 1073741824) || (localLayoutParams.height != -1)) {
                    break label1831;
                  }
                  i1 = 1;
                  label1570:
                  i7 = localLayoutParams.topMargin + localLayoutParams.bottomMargin;
                  i6 = ((View)localObject3).getMeasuredHeight() + i7;
                  i4 = Math.max(m, i6);
                  if (i1 == 0) {
                    break label1837;
                  }
                  m = i7;
                  label1611:
                  m = Math.max(k, m);
                  if ((j == 0) || (localLayoutParams.height != -1)) {
                    break label1844;
                  }
                  j = 1;
                  label1637:
                  if (bool1)
                  {
                    i1 = ((View)localObject3).getBaseline();
                    if (i1 != -1)
                    {
                      if (localLayoutParams.gravity >= 0) {
                        break label1850;
                      }
                      k = this.tl;
                      label1669:
                      k = ((k & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                      localObject1[k] = Math.max(localObject1[k], i1);
                      localObject2[k] = Math.max(localObject2[k], i6 - i1);
                    }
                  }
                  i1 = n;
                  n = j;
                  k = i4;
                  j = i1;
                }
              }
            }
            for (;;)
            {
              i4 = i3 + 1;
              i1 = n;
              i3 = k;
              n = i;
              i = j;
              j = i1;
              k = m;
              m = i3;
              i3 = i4;
              break;
              if (i4 > 0)
              {
                i1 = i4;
                break label1468;
              }
              i1 = 0;
              break label1468;
              label1791:
              i1 = this.QV;
              this.QV = Math.max(i1, ((View)localObject3).getMeasuredWidth() + i1 + localLayoutParams.leftMargin + localLayoutParams.rightMargin + 0);
              break label1551;
              label1831:
              i1 = 0;
              break label1570;
              label1837:
              m = i6;
              break label1611;
              label1844:
              j = 0;
              break label1637;
              label1850:
              k = localLayoutParams.gravity;
              break label1669;
              this.QV += getPaddingLeft() + getPaddingRight();
              if ((localObject1[1] == -1) && (localObject1[0] == -1) && (localObject1[2] == -1))
              {
                n = m;
                if (localObject1[3] == -1) {}
              }
              else
              {
                n = Math.max(m, Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))) + Math.max(localObject2[3], Math.max(localObject2[0], Math.max(localObject2[1], localObject2[2]))));
              }
              m = i;
              i1 = j;
              j = n;
              i = k;
              for (;;)
              {
                if ((i1 == 0) && (i11 != 1073741824)) {}
                for (;;)
                {
                  setMeasuredDimension(0xFF000000 & m | i8, z.resolveSizeAndState(Math.max(i + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), paramInt2, m << 16));
                  if (i2 != 0)
                  {
                    i = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    paramInt2 = 0;
                    while (paramInt2 < i10)
                    {
                      localObject1 = getChildAt(paramInt2);
                      if (((View)localObject1).getVisibility() != 8)
                      {
                        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
                        if (((LayoutParams)localObject2).height == -1)
                        {
                          j = ((LayoutParams)localObject2).width;
                          ((LayoutParams)localObject2).width = ((View)localObject1).getMeasuredWidth();
                          measureChildWithMargins((View)localObject1, paramInt1, 0, i, 0);
                          ((LayoutParams)localObject2).width = j;
                        }
                      }
                      paramInt2 += 1;
                      continue;
                      k = Math.max(k, i3);
                      if ((!bool2) || (i12 == 1073741824)) {
                        break label2252;
                      }
                      j = 0;
                      while (j < i10)
                      {
                        localObject1 = getChildAt(j);
                        if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (((LayoutParams)((View)localObject1).getLayoutParams()).weight > 0.0F)) {
                          ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(((View)localObject1).getMeasuredHeight(), 1073741824));
                        }
                        j += 1;
                      }
                    }
                  }
                  return;
                  i = j;
                }
                label2252:
                i = k;
                j = i4;
                i1 = n;
              }
              label2267:
              i1 = i;
              i = n;
              n = i1;
              break label1518;
              label2282:
              i4 = j;
              j = i;
              i1 = m;
              i = n;
              n = i4;
              m = k;
              k = i1;
            }
          }
          label2320:
          break label386;
        }
      }
      break label361;
      i7 = j;
      i6 = k;
      i8 = m;
      j = i;
      i = i7;
      k = n;
      m = i3;
      n = i6;
      i3 = i8;
    }
  }
  
  private void a(Canvas paramCanvas, int paramInt)
  {
    this.Ra.setBounds(getPaddingLeft() + this.Re, paramInt, getWidth() - getPaddingRight() - this.Re, this.Rc + paramInt);
    this.Ra.draw(paramCanvas);
  }
  
  private boolean aU(int paramInt)
  {
    if (paramInt == 0) {
      if ((this.Rd & 0x1) == 0) {}
    }
    do
    {
      return true;
      return false;
      if (paramInt != getChildCount()) {
        break;
      }
    } while ((this.Rd & 0x4) != 0);
    return false;
    if ((this.Rd & 0x2) != 0)
    {
      paramInt -= 1;
      for (;;)
      {
        if (paramInt < 0) {
          break label75;
        }
        if (getChildAt(paramInt).getVisibility() != 8) {
          break;
        }
        paramInt -= 1;
      }
    }
    return false;
    label75:
    return false;
  }
  
  private void b(Canvas paramCanvas, int paramInt)
  {
    this.Ra.setBounds(paramInt, getPaddingTop() + this.Re, this.Rb + paramInt, getHeight() - getPaddingBottom() - this.Re);
    this.Ra.draw(paramCanvas);
  }
  
  private void e(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private static void f(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.layout(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
  }
  
  public LayoutParams c(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  protected LayoutParams d(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new LayoutParams(paramLayoutParams);
  }
  
  protected LayoutParams ec()
  {
    if (this.QU == 0) {
      return new LayoutParams(-2, -2);
    }
    if (this.QU == 1) {
      return new LayoutParams(-1, -2);
    }
    return null;
  }
  
  public int getBaseline()
  {
    int i = -1;
    if (this.QS < 0) {
      i = super.getBaseline();
    }
    View localView;
    int j;
    do
    {
      return i;
      if (getChildCount() <= this.QS) {
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
      }
      localView = getChildAt(this.QS);
      j = localView.getBaseline();
      if (j != -1) {
        break;
      }
    } while (this.QS == 0);
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    i = this.QT;
    if (this.QU == 1)
    {
      int k = this.tl & 0x70;
      if (k != 48) {
        switch (k)
        {
        }
      }
    }
    for (;;)
    {
      return ((LayoutParams)localView.getLayoutParams()).topMargin + i + j;
      i = getBottom() - getTop() - getPaddingBottom() - this.QV;
      continue;
      i += (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.QV) / 2;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.Ra == null) {}
    int i;
    LayoutParams localLayoutParams;
    int k;
    boolean bool;
    label259:
    do
    {
      int j;
      do
      {
        return;
        if (this.QU != 1) {
          break;
        }
        j = getChildCount();
        i = 0;
        while (i < j)
        {
          localView = getChildAt(i);
          if ((localView != null) && (localView.getVisibility() != 8) && (aU(i)))
          {
            localLayoutParams = (LayoutParams)localView.getLayoutParams();
            a(paramCanvas, localView.getTop() - localLayoutParams.topMargin - this.Rc);
          }
          i += 1;
        }
      } while (!aU(j));
      localView = getChildAt(j - 1);
      if (localView == null) {}
      for (i = getHeight() - getPaddingBottom() - this.Rc;; i = localLayoutParams.bottomMargin + i)
      {
        a(paramCanvas, i);
        return;
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        i = localView.getBottom();
      }
      k = getChildCount();
      bool = at.bw(this);
      i = 0;
      if (i < k)
      {
        localView = getChildAt(i);
        if ((localView != null) && (localView.getVisibility() != 8) && (aU(i)))
        {
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if (!bool) {
            break label259;
          }
          j = localView.getRight();
        }
        for (j = localLayoutParams.rightMargin + j;; j = localView.getLeft() - localLayoutParams.leftMargin - this.Rb)
        {
          b(paramCanvas, j);
          i += 1;
          break;
        }
      }
    } while (!aU(k));
    View localView = getChildAt(k - 1);
    if (localView == null) {
      if (bool) {
        i = getPaddingLeft();
      }
    }
    for (;;)
    {
      b(paramCanvas, i);
      return;
      i = getWidth() - getPaddingRight() - this.Rb;
      continue;
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (bool)
      {
        i = localView.getLeft() - localLayoutParams.leftMargin - this.Rb;
      }
      else
      {
        i = localView.getRight();
        i = localLayoutParams.rightMargin + i;
      }
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    label93:
    Object localObject1;
    if (this.QU == 1)
    {
      i = getPaddingLeft();
      j = paramInt3 - paramInt1;
      k = getPaddingRight();
      m = getPaddingRight();
      n = getChildCount();
      paramInt1 = this.tl;
      i1 = this.tl;
      switch (paramInt1 & 0x70)
      {
      default: 
        paramInt1 = getPaddingTop();
        paramInt3 = 0;
        paramInt2 = paramInt1;
        paramInt1 = paramInt3;
        if (paramInt1 < n)
        {
          localObject1 = getChildAt(paramInt1);
          if (localObject1 == null) {
            paramInt2 += 0;
          }
        }
        break;
      }
    }
    for (;;)
    {
      paramInt1 += 1;
      break label93;
      paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - this.QV;
      break;
      paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - this.QV) / 2;
      break;
      if (((View)localObject1).getVisibility() != 8)
      {
        int i2 = ((View)localObject1).getMeasuredWidth();
        int i3 = ((View)localObject1).getMeasuredHeight();
        Object localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        paramInt4 = ((LayoutParams)localObject2).gravity;
        paramInt3 = paramInt4;
        if (paramInt4 < 0) {
          paramInt3 = 0x800007 & i1;
        }
        switch (f.getAbsoluteGravity(paramInt3, z.J(this)) & 0x7)
        {
        default: 
          paramInt3 = ((LayoutParams)localObject2).leftMargin + i;
        }
        for (;;)
        {
          paramInt4 = paramInt2;
          if (aU(paramInt1)) {
            paramInt4 = paramInt2 + this.Rc;
          }
          paramInt2 = paramInt4 + ((LayoutParams)localObject2).topMargin;
          f((View)localObject1, paramInt3, paramInt2 + 0, i2, i3);
          paramInt2 += ((LayoutParams)localObject2).bottomMargin + i3 + 0;
          paramInt1 += 0;
          break;
          paramInt3 = (j - i - m - i2) / 2 + i + ((LayoutParams)localObject2).leftMargin - ((LayoutParams)localObject2).rightMargin;
          continue;
          paramInt3 = j - k - i2 - ((LayoutParams)localObject2).rightMargin;
        }
        paramBoolean = at.bw(this);
        k = getPaddingTop();
        n = paramInt4 - paramInt2;
        i1 = getPaddingBottom();
        i2 = getPaddingBottom();
        i3 = getChildCount();
        paramInt2 = this.tl;
        int i4 = this.tl;
        boolean bool = this.QR;
        localObject1 = this.QY;
        localObject2 = this.QZ;
        switch (f.getAbsoluteGravity(paramInt2 & 0x800007, z.J(this)))
        {
        default: 
          paramInt1 = getPaddingLeft();
          if (paramBoolean) {
            i = i3 - 1;
          }
          break;
        }
        for (paramInt4 = -1;; paramInt4 = 1)
        {
          paramInt2 = 0;
          paramInt3 = paramInt1;
          label507:
          int i7;
          View localView;
          if (paramInt2 < i3)
          {
            i7 = i + paramInt4 * paramInt2;
            localView = getChildAt(i7);
            if (localView == null)
            {
              paramInt3 += 0;
              paramInt1 = paramInt2;
            }
          }
          for (;;)
          {
            paramInt2 = paramInt1 + 1;
            break label507;
            paramInt1 = getPaddingLeft() + paramInt3 - paramInt1 - this.QV;
            break;
            paramInt1 = getPaddingLeft() + (paramInt3 - paramInt1 - this.QV) / 2;
            break;
            if (localView.getVisibility() != 8)
            {
              int i5 = localView.getMeasuredWidth();
              int i6 = localView.getMeasuredHeight();
              paramInt1 = -1;
              LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
              j = paramInt1;
              if (bool)
              {
                j = paramInt1;
                if (localLayoutParams.height != -1) {
                  j = localView.getBaseline();
                }
              }
              m = localLayoutParams.gravity;
              paramInt1 = m;
              if (m < 0) {
                paramInt1 = i4 & 0x70;
              }
              switch (paramInt1 & 0x70)
              {
              default: 
                paramInt1 = k;
              }
              label715:
              label895:
              for (;;)
              {
                if (aU(i7)) {
                  paramInt3 = this.Rb + paramInt3;
                }
                for (;;)
                {
                  paramInt3 += localLayoutParams.leftMargin;
                  f(localView, paramInt3 + 0, paramInt1, i5, i6);
                  paramInt3 += localLayoutParams.rightMargin + i5 + 0;
                  paramInt1 = paramInt2 + 0;
                  break;
                  m = localLayoutParams.topMargin + k;
                  paramInt1 = m;
                  if (j == -1) {
                    break label895;
                  }
                  paramInt1 = localObject1[1] - j + m;
                  break label715;
                  paramInt1 = (n - k - i2 - i6) / 2 + k + localLayoutParams.topMargin - localLayoutParams.bottomMargin;
                  break label715;
                  m = n - i1 - i6 - localLayoutParams.bottomMargin;
                  paramInt1 = m;
                  if (j == -1) {
                    break label895;
                  }
                  paramInt1 = localView.getMeasuredHeight();
                  paramInt1 = m - (localObject2[2] - (paramInt1 - j));
                  break label715;
                  return;
                }
              }
            }
            paramInt1 = paramInt2;
          }
          i = 0;
        }
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k;
    int i;
    int j;
    int i3;
    int m;
    float f1;
    int i9;
    int i10;
    int i11;
    int i2;
    int i1;
    boolean bool;
    int n;
    int i4;
    Object localObject;
    int i8;
    int i7;
    int i6;
    int i5;
    LayoutParams localLayoutParams;
    if (this.QU == 1)
    {
      this.QV = 0;
      k = 0;
      i = 0;
      j = 0;
      i3 = 0;
      m = 1;
      f1 = 0.0F;
      i9 = getChildCount();
      i10 = View.MeasureSpec.getMode(paramInt1);
      i11 = View.MeasureSpec.getMode(paramInt2);
      i2 = 0;
      i1 = 0;
      int i12 = this.QS;
      bool = this.QX;
      n = Integer.MIN_VALUE;
      i4 = 0;
      for (;;)
      {
        if (i4 < i9)
        {
          localObject = getChildAt(i4);
          if (localObject == null)
          {
            this.QV += 0;
            i8 = i4;
            i7 = k;
            i6 = i;
            i5 = j;
            i4 = i3;
            k = m;
            j = i1;
            i = n;
            i8 += 1;
            n = i;
            i1 = j;
            m = k;
            i3 = i4;
            j = i5;
            i = i6;
            k = i7;
            i4 = i8;
          }
          else
          {
            if (((View)localObject).getVisibility() == 8) {
              break label1656;
            }
            if (aU(i4)) {
              this.QV += this.Rc;
            }
            localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
            f1 += localLayoutParams.weight;
            if ((i11 == 1073741824) && (localLayoutParams.height == 0) && (localLayoutParams.weight > 0.0F))
            {
              i1 = this.QV;
              this.QV = Math.max(i1, localLayoutParams.topMargin + i1 + localLayoutParams.bottomMargin);
              i1 = 1;
              label283:
              if ((i12 >= 0) && (i12 == i4 + 1)) {
                this.QT = this.QV;
              }
              if ((i4 < i12) && (localLayoutParams.weight > 0.0F)) {
                throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
              }
            }
            else
            {
              i6 = Integer.MIN_VALUE;
              i5 = i6;
              if (localLayoutParams.height == 0)
              {
                i5 = i6;
                if (localLayoutParams.weight > 0.0F)
                {
                  i5 = 0;
                  localLayoutParams.height = -2;
                }
              }
              if (f1 == 0.0F) {}
              for (i6 = this.QV;; i6 = 0)
              {
                e((View)localObject, paramInt1, 0, paramInt2, i6);
                if (i5 != Integer.MIN_VALUE) {
                  localLayoutParams.height = i5;
                }
                i5 = ((View)localObject).getMeasuredHeight();
                i6 = this.QV;
                this.QV = Math.max(i6, i6 + i5 + localLayoutParams.topMargin + localLayoutParams.bottomMargin + 0);
                if (!bool) {
                  break label1653;
                }
                n = Math.max(i5, n);
                break;
              }
            }
            i5 = 0;
            if ((i10 == 1073741824) || (localLayoutParams.width != -1)) {
              break label1650;
            }
            i2 = 1;
            i5 = 1;
            label499:
            i6 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
            i7 = ((View)localObject).getMeasuredWidth() + i6;
            k = Math.max(k, i7);
            i8 = at.combineMeasuredStates(i, z.N((View)localObject));
            if ((m != 0) && (localLayoutParams.width == -1))
            {
              i = 1;
              label560:
              if (localLayoutParams.weight <= 0.0F) {
                break label678;
              }
              if (i5 == 0) {
                break label671;
              }
              label575:
              i3 = Math.max(i3, i6);
              m = j;
              j = i1;
              i1 = k;
              k = i3;
              i5 = n;
              i3 = i8;
              n = m;
              m = k;
              k = i;
              i = j;
              j = i5;
            }
          }
        }
      }
    }
    for (;;)
    {
      i8 = i4 + 0;
      i4 = i;
      i = j;
      j = i4;
      i4 = m;
      i5 = n;
      i6 = i3;
      i7 = i1;
      break;
      i = 0;
      break label560;
      label671:
      i6 = i7;
      break label575;
      label678:
      if (i5 != 0) {}
      for (;;)
      {
        i5 = Math.max(j, i6);
        m = i;
        i = i1;
        j = n;
        i1 = k;
        k = m;
        m = i3;
        n = i5;
        i3 = i8;
        break;
        i6 = i7;
      }
      if ((this.QV > 0) && (aU(i9))) {
        this.QV += this.Rc;
      }
      if ((bool) && ((i11 == Integer.MIN_VALUE) || (i11 == 0)))
      {
        this.QV = 0;
        i4 = 0;
        if (i4 < i9)
        {
          localObject = getChildAt(i4);
          if (localObject == null) {
            this.QV += 0;
          }
          for (;;)
          {
            i4 += 1;
            break;
            if (((View)localObject).getVisibility() == 8)
            {
              i4 += 0;
            }
            else
            {
              localObject = (LayoutParams)((View)localObject).getLayoutParams();
              i5 = this.QV;
              i6 = ((LayoutParams)localObject).topMargin;
              this.QV = Math.max(i5, ((LayoutParams)localObject).bottomMargin + (i5 + n + i6) + 0);
            }
          }
        }
      }
      this.QV += getPaddingTop() + getPaddingBottom();
      i6 = z.resolveSizeAndState(Math.max(this.QV, getSuggestedMinimumHeight()), paramInt2, 0);
      i4 = (0xFFFFFF & i6) - this.QV;
      if ((i1 != 0) || ((i4 != 0) && (f1 > 0.0F)))
      {
        if (this.QW > 0.0F) {
          f1 = this.QW;
        }
        this.QV = 0;
        i3 = 0;
        n = m;
        m = k;
        k = j;
        j = n;
        n = i4;
        if (i3 < i9)
        {
          localObject = getChildAt(i3);
          if (((View)localObject).getVisibility() == 8) {
            break label1623;
          }
          localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
          float f2 = localLayoutParams.weight;
          if (f2 <= 0.0F) {
            break label1608;
          }
          i4 = (int)(n * f2 / f1);
          i7 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localLayoutParams.leftMargin + localLayoutParams.rightMargin, localLayoutParams.width);
          if ((localLayoutParams.height != 0) || (i11 != 1073741824))
          {
            i5 = i4 + ((View)localObject).getMeasuredHeight();
            i1 = i5;
            if (i5 < 0) {
              i1 = 0;
            }
            label1133:
            ((View)localObject).measure(i7, View.MeasureSpec.makeMeasureSpec(i1, 1073741824));
            i = at.combineMeasuredStates(i, z.N((View)localObject) & 0xFF00);
            i1 = n - i4;
            n = i;
            f1 -= f2;
            i = i1;
            label1183:
            i4 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
            i5 = ((View)localObject).getMeasuredWidth() + i4;
            i1 = Math.max(m, i5);
            if ((i10 == 1073741824) || (localLayoutParams.width != -1)) {
              break label1377;
            }
            m = 1;
            label1234:
            if (m == 0) {
              break label1383;
            }
            m = i4;
            label1243:
            k = Math.max(k, m);
            if ((j == 0) || (localLayoutParams.width != -1)) {
              break label1390;
            }
            j = 1;
            label1269:
            m = this.QV;
            i4 = ((View)localObject).getMeasuredHeight();
            i5 = localLayoutParams.topMargin;
            this.QV = Math.max(m, localLayoutParams.bottomMargin + (i4 + m + i5) + 0);
            m = j;
            j = i1;
          }
        }
      }
      for (;;)
      {
        i4 = i3 + 1;
        i3 = n;
        i1 = j;
        n = i;
        i = i3;
        j = m;
        m = i1;
        i3 = i4;
        break;
        if (i4 > 0)
        {
          i1 = i4;
          break label1133;
        }
        i1 = 0;
        break label1133;
        label1377:
        m = 0;
        break label1234;
        label1383:
        m = i5;
        break label1243;
        label1390:
        j = 0;
        break label1269;
        this.QV += getPaddingTop() + getPaddingBottom();
        n = k;
        k = m;
        m = j;
        for (j = n;; j = i1)
        {
          if ((m == 0) && (i10 != 1073741824)) {}
          for (;;)
          {
            setMeasuredDimension(z.resolveSizeAndState(Math.max(j + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), paramInt1, i), i6);
            if (i2 != 0) {
              F(i9, paramInt2);
            }
            return;
            i1 = Math.max(j, i3);
            if ((!bool) || (i11 == 1073741824)) {
              break;
            }
            j = 0;
            while (j < i9)
            {
              localObject = getChildAt(j);
              if ((localObject != null) && (((View)localObject).getVisibility() != 8) && (((LayoutParams)((View)localObject).getLayoutParams()).weight > 0.0F)) {
                ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(((View)localObject).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(n, 1073741824));
              }
              j += 1;
            }
            G(paramInt1, paramInt2);
            return;
            j = k;
          }
        }
        label1608:
        i1 = i;
        i = n;
        n = i1;
        break label1183;
        label1623:
        i1 = j;
        j = m;
        m = i;
        i = n;
        n = m;
        m = i1;
      }
      label1650:
      break label499;
      label1653:
      break label283;
      label1656:
      i5 = n;
      i6 = i1;
      n = j;
      i1 = k;
      i7 = i;
      j = i5;
      i = i6;
      k = m;
      m = i3;
      i3 = i7;
    }
  }
  
  public final void setGravity(int paramInt)
  {
    if (this.tl != paramInt)
    {
      if ((0x800007 & paramInt) != 0) {
        break label46;
      }
      paramInt = 0x800003 | paramInt;
    }
    label46:
    for (;;)
    {
      int i = paramInt;
      if ((paramInt & 0x70) == 0) {
        i = paramInt | 0x30;
      }
      this.tl = i;
      requestLayout();
      return;
    }
  }
  
  public final void setOrientation(int paramInt)
  {
    if (this.QU != paramInt)
    {
      this.QU = paramInt;
      requestLayout();
    }
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    public int gravity = -1;
    public float weight;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      this.weight = 0.0F;
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.LinearLayoutCompat_Layout);
      this.weight = paramContext.getFloat(a.k.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
      this.gravity = paramContext.getInt(a.k.LinearLayoutCompat_Layout_android_layout_gravity, -1);
      paramContext.recycle();
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\LinearLayoutCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
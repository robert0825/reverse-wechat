package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.m;
import java.util.LinkedList;

public class FlowLayout
  extends ViewGroup
{
  private int vZj;
  private int vZk;
  public LinkedList<Integer> vZl;
  
  static
  {
    GMTrace.i(3248069017600L, 24200);
    if (!FlowLayout.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      GMTrace.o(3248069017600L, 24200);
      return;
    }
  }
  
  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3246726840320L, 24190);
    this.vZj = 0;
    this.vZk = 0;
    this.vZl = new LinkedList();
    c(paramContext, paramAttributeSet);
    GMTrace.o(3246726840320L, 24190);
  }
  
  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3246861058048L, 24191);
    this.vZj = 0;
    this.vZk = 0;
    this.vZl = new LinkedList();
    c(paramContext, paramAttributeSet);
    GMTrace.o(3246861058048L, 24191);
  }
  
  private void c(Context paramContext, AttributeSet paramAttributeSet)
  {
    GMTrace.i(3246995275776L, 24192);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.enp);
    try
    {
      this.vZj = paramContext.getDimensionPixelSize(a.m.ggI, 0);
      this.vZk = paramContext.getDimensionPixelSize(a.m.ggJ, 0);
      paramContext.recycle();
      GMTrace.o(3246995275776L, 24192);
      return;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public final int BC(int paramInt)
  {
    GMTrace.i(3247129493504L, 24193);
    int j = Math.max(0, Math.min(this.vZl.size(), paramInt));
    paramInt = getPaddingTop();
    int i = 0;
    while (i < j - 1)
    {
      paramInt += ((Integer)this.vZl.get(i)).intValue() + this.vZk;
      i += 1;
    }
    i = ((Integer)this.vZl.get(j - 1)).intValue();
    j = getPaddingBottom();
    GMTrace.o(3247129493504L, 24193);
    return i + paramInt + j;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(3247532146688L, 24196);
    boolean bool = paramLayoutParams instanceof ViewGroup.LayoutParams;
    GMTrace.o(3247532146688L, 24196);
    return bool;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    GMTrace.i(3247666364416L, 24197);
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-2, -2);
    GMTrace.o(3247666364416L, 24197);
    return localLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    GMTrace.i(3247800582144L, 24198);
    paramAttributeSet = new ViewGroup.LayoutParams(getContext(), paramAttributeSet);
    GMTrace.o(3247800582144L, 24198);
    return paramAttributeSet;
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(3247934799872L, 24199);
    paramLayoutParams = new ViewGroup.LayoutParams(paramLayoutParams.width, paramLayoutParams.height);
    GMTrace.o(3247934799872L, 24199);
    return paramLayoutParams;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3247397928960L, 24195);
    int i1 = getChildCount();
    int i = getPaddingLeft();
    paramInt2 = getPaddingTop();
    paramInt4 = 0;
    int j = 0;
    View localView;
    int n;
    int m;
    int k;
    if (j < i1)
    {
      localView = getChildAt(j);
      n = i;
      m = paramInt4;
      k = paramInt2;
      if (localView.getVisibility() != 8)
      {
        k = localView.getMeasuredWidth();
        m = localView.getMeasuredHeight();
        if (i + k + getPaddingRight() <= paramInt3 - paramInt1) {
          break label228;
        }
        i = getPaddingLeft();
        paramInt2 += ((Integer)this.vZl.get(paramInt4)).intValue() + this.vZk;
        paramInt4 += 1;
      }
    }
    label228:
    for (;;)
    {
      n = (((Integer)this.vZl.get(paramInt4)).intValue() - m) / 2;
      localView.layout(i, paramInt2 + n, i + k, n + paramInt2 + m);
      n = this.vZj + k + i;
      k = paramInt2;
      m = paramInt4;
      j += 1;
      i = n;
      paramInt4 = m;
      paramInt2 = k;
      break;
      GMTrace.o(3247397928960L, 24195);
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3247263711232L, 24194);
    assert (View.MeasureSpec.getMode(paramInt1) != 0);
    int i5 = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
    int i4 = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    int i6 = getChildCount();
    this.vZl.clear();
    if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE) {}
    int i;
    int j;
    for (int n = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);; n = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      i = 0;
      j = 0;
      int k = 0;
      int i1 = 0;
      while (i1 < i6)
      {
        View localView = getChildAt(i1);
        int i3 = i;
        int m = j;
        int i2 = k;
        if (localView.getVisibility() != 8)
        {
          localView.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), n);
          int i7 = localView.getMeasuredWidth();
          i3 = i;
          m = j;
          i2 = k;
          if (k + i7 > i5)
          {
            i2 = 0;
            m = j + (this.vZk + i);
            this.vZl.add(Integer.valueOf(i));
            i3 = 0;
          }
          i3 = Math.max(i3, localView.getMeasuredHeight());
          i2 += this.vZj + i7;
        }
        i1 += 1;
        i = i3;
        j = m;
        k = i2;
      }
    }
    this.vZl.add(Integer.valueOf(i));
    if (View.MeasureSpec.getMode(paramInt2) == 0) {
      paramInt2 = j + i + getPaddingTop() + getPaddingBottom();
    }
    for (;;)
    {
      setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), paramInt2);
      GMTrace.o(3247263711232L, 24194);
      return;
      if ((View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE) && (j + i < i4)) {
        paramInt2 = j + i + getPaddingTop() + getPaddingBottom();
      } else {
        paramInt2 = i4;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\FlowLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
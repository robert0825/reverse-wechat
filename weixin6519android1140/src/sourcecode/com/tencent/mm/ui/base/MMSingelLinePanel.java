package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.m;
import java.util.LinkedList;

public class MMSingelLinePanel
  extends MMTagPanel
{
  private int vZj;
  private int vZk;
  private LinkedList<Integer> vZl;
  private boolean weH;
  private TextView weI;
  private int weJ;
  private int weK;
  
  static
  {
    GMTrace.i(3151700688896L, 23482);
    if (!MMSingelLinePanel.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      GMTrace.o(3151700688896L, 23482);
      return;
    }
  }
  
  public MMSingelLinePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3150626947072L, 23474);
    GMTrace.o(3150626947072L, 23474);
  }
  
  public MMSingelLinePanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3150761164800L, 23475);
    this.vZl = new LinkedList();
    this.vZj = 0;
    this.vZk = 0;
    this.weH = true;
    this.weJ = 0;
    this.weK = 0;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.enp);
    try
    {
      this.vZj = paramContext.getDimensionPixelSize(a.m.ggI, 0);
      this.vZk = paramContext.getDimensionPixelSize(a.m.ggJ, 0);
      paramContext.recycle();
      GMTrace.o(3150761164800L, 23475);
      return;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public final void caf()
  {
    GMTrace.i(3150895382528L, 23476);
    super.caf();
    this.weI = new TextView(getContext());
    this.weI.setText("...");
    this.weI.setTextColor(getResources().getColor(a.d.aPp));
    this.weI.setLayoutParams(generateDefaultLayoutParams());
    addView(this.weI);
    GMTrace.o(3150895382528L, 23476);
  }
  
  public final void cag()
  {
    GMTrace.i(3151029600256L, 23477);
    this.weH = true;
    this.weI = new TextView(getContext());
    this.weI.setText("...");
    this.weI.setLayoutParams(generateDefaultLayoutParams());
    addView(this.weI);
    GMTrace.o(3151029600256L, 23477);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3151432253440L, 23480);
    GMTrace.o(3151432253440L, 23480);
    return false;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3151566471168L, 23481);
    GMTrace.o(3151566471168L, 23481);
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3151298035712L, 23479);
    int i1;
    int k;
    int j;
    int i;
    int m;
    View localView;
    int n;
    if (this.weH)
    {
      i1 = getChildCount();
      int i2 = this.weJ;
      k = getPaddingLeft();
      j = getPaddingTop();
      i = 0;
      paramInt4 = 0;
      paramInt2 = 0;
      m = 0;
      if (m < i1)
      {
        localView = getChildAt(m);
        if ((localView.getVisibility() == 8) || (localView == this.weI)) {
          break label588;
        }
        int i3 = localView.getMeasuredWidth();
        int i4 = localView.getMeasuredHeight();
        if (k + i3 + getPaddingRight() <= paramInt3 - paramInt1 - i2) {
          break label571;
        }
        n = getPaddingLeft();
        int i5 = ((Integer)this.vZl.get(paramInt2)).intValue();
        int i6 = this.vZk;
        k = paramInt2 + 1;
        paramInt2 = j + (i5 + i6);
        j = n;
        label165:
        if (k > 0) {
          break label554;
        }
        localView.layout(j, paramInt2 + 0, j + i3, paramInt2 + 0 + i4);
        paramInt4 = this.vZj + i3 + j;
        i = paramInt2;
        j = paramInt4;
      }
    }
    for (;;)
    {
      n = m + 1;
      m = j;
      j = i;
      i = paramInt4;
      paramInt4 = paramInt2;
      paramInt2 = k;
      k = m;
      m = n;
      break;
      if (this.weI != null)
      {
        if (paramInt2 > 0)
        {
          this.weI.layout(i, paramInt4, this.weJ + i, this.weK + paramInt4);
          GMTrace.o(3151298035712L, 23479);
          return;
        }
        this.weI.layout(0, 0, 0, 0);
      }
      GMTrace.o(3151298035712L, 23479);
      return;
      i1 = getChildCount();
      i = getPaddingLeft();
      paramInt2 = getPaddingTop();
      paramInt4 = 0;
      j = 0;
      if (j < i1)
      {
        localView = getChildAt(j);
        n = i;
        m = paramInt4;
        k = paramInt2;
        if (localView.getVisibility() != 8)
        {
          n = i;
          m = paramInt4;
          k = paramInt2;
          if (localView != this.weI)
          {
            k = localView.getMeasuredWidth();
            m = localView.getMeasuredHeight();
            if (i + k + getPaddingRight() <= paramInt3 - paramInt1) {
              break label551;
            }
            i = getPaddingLeft();
            paramInt2 += ((Integer)this.vZl.get(paramInt4)).intValue() + this.vZk;
            paramInt4 += 1;
          }
        }
      }
      label551:
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
        GMTrace.o(3151298035712L, 23479);
        return;
      }
      label554:
      n = paramInt2;
      paramInt2 = paramInt4;
      paramInt4 = i;
      i = n;
      continue;
      label571:
      n = k;
      k = paramInt2;
      paramInt2 = j;
      j = n;
      break label165;
      label588:
      n = k;
      k = paramInt2;
      paramInt2 = paramInt4;
      paramInt4 = i;
      i = j;
      j = n;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3151163817984L, 23478);
    assert (View.MeasureSpec.getMode(paramInt1) != 0);
    int i = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
    int i6 = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    int i7 = getChildCount();
    this.vZl.clear();
    int n;
    int m;
    int j;
    int k;
    int i2;
    label196:
    int i4;
    int i3;
    if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE)
    {
      n = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
      if ((this.weH) && (this.weI != null))
      {
        this.weI.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), n);
        this.weJ = this.weI.getMeasuredWidth();
        this.weK = this.weI.getMeasuredHeight();
        w.d("MicroMsg.MMTagContactPanel", "mEllipsisWidth %d", new Object[] { Integer.valueOf(this.weJ) });
      }
      int i1 = i;
      if (this.weH) {
        i1 = i - this.weJ;
      }
      m = 0;
      i = 0;
      j = 0;
      k = 0;
      i2 = 0;
      if (i2 >= i7) {
        break label377;
      }
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 8) {
        break label477;
      }
      localView.measure(View.MeasureSpec.makeMeasureSpec(i1, Integer.MIN_VALUE), n);
      int i8 = localView.getMeasuredWidth();
      int i5 = localView.getMeasuredHeight();
      i4 = i;
      m = j;
      i3 = k;
      if (k + i8 > i1)
      {
        i3 = 0;
        m = j + (this.vZk + i);
        this.vZl.add(Integer.valueOf(i));
        i4 = 0;
      }
      i = Math.max(i4, localView.getMeasuredHeight());
      j = i3 + (this.vZj + i8);
      k = m;
      m = i;
      i = i5;
    }
    for (;;)
    {
      i4 = i2 + 1;
      i2 = j;
      i3 = i;
      i = m;
      j = k;
      k = i2;
      m = i3;
      i2 = i4;
      break label196;
      n = View.MeasureSpec.makeMeasureSpec(0, 0);
      break;
      label377:
      this.vZl.add(Integer.valueOf(i));
      if (this.weH)
      {
        getPaddingTop();
        getPaddingBottom();
      }
      for (;;)
      {
        setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), m);
        GMTrace.o(3151163817984L, 23478);
        return;
        if (View.MeasureSpec.getMode(paramInt2) == 0)
        {
          getPaddingTop();
          getPaddingBottom();
        }
        else if ((View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE) && (j + i < i6))
        {
          getPaddingTop();
          getPaddingBottom();
        }
      }
      label477:
      i3 = k;
      k = i;
      i = m;
      m = k;
      k = j;
      j = i3;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\MMSingelLinePanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
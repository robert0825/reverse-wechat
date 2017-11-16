package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.z;
import android.support.v7.a.a.f;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class ButtonBarLayout
  extends LinearLayout
{
  private boolean Pq;
  private int Pr = -1;
  
  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ButtonBarLayout);
    this.Pq = paramContext.getBoolean(a.k.ButtonBarLayout_allowStacking, false);
    paramContext.recycle();
  }
  
  private void M(boolean paramBoolean)
  {
    label17:
    View localView;
    if (paramBoolean)
    {
      i = 1;
      setOrientation(i);
      if (!paramBoolean) {
        break label78;
      }
      i = 5;
      setGravity(i);
      localView = findViewById(a.f.spacer);
      if (localView != null) {
        if (!paramBoolean) {
          break label84;
        }
      }
    }
    label78:
    label84:
    for (int i = 8;; i = 4)
    {
      localView.setVisibility(i);
      i = getChildCount() - 2;
      while (i >= 0)
      {
        bringChildToFront(getChildAt(i));
        i -= 1;
      }
      i = 0;
      break;
      i = 80;
      break label17;
    }
  }
  
  private boolean eB()
  {
    return getOrientation() == 1;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int m = 0;
    int n = View.MeasureSpec.getSize(paramInt1);
    if (this.Pq)
    {
      if ((n > this.Pr) && (eB())) {
        M(false);
      }
      this.Pr = n;
    }
    int j;
    int i;
    int k;
    if ((!eB()) && (View.MeasureSpec.getMode(paramInt1) == 1073741824))
    {
      j = View.MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE);
      i = 1;
      super.onMeasure(j, paramInt2);
      k = i;
      if (this.Pq)
      {
        k = i;
        if (!eB())
        {
          if (Build.VERSION.SDK_INT < 11) {
            break label160;
          }
          j = m;
          if ((z.M(this) & 0xFF000000) == 16777216) {
            j = 1;
          }
        }
      }
    }
    for (;;)
    {
      k = i;
      if (j != 0)
      {
        M(true);
        k = 1;
      }
      if (k != 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
      return;
      j = paramInt1;
      i = 0;
      break;
      label160:
      int i1 = getChildCount();
      j = 0;
      k = 0;
      while (j < i1)
      {
        k += getChildAt(j).getMeasuredWidth();
        j += 1;
      }
      j = m;
      if (getPaddingLeft() + k + getPaddingRight() > n) {
        j = 1;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v7\widget\ButtonBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
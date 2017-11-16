package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.f;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

abstract class HeaderScrollingViewBehavior
  extends ViewOffsetBehavior<View>
{
  private final Rect gs = new Rect();
  private final Rect gt = new Rect();
  int hU = 0;
  int hV;
  
  public HeaderScrollingViewBehavior() {}
  
  public HeaderScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = paramView.getLayoutParams().height;
    if ((j == -1) || (j == -2))
    {
      View localView = c(paramCoordinatorLayout.n(paramView));
      if (localView != null)
      {
        if ((z.aa(localView)) && (!z.aa(paramView)))
        {
          z.a(paramView, true);
          if (z.aa(paramView))
          {
            paramView.requestLayout();
            return true;
          }
        }
        if (z.aj(localView))
        {
          int i = View.MeasureSpec.getSize(paramInt3);
          paramInt3 = i;
          if (i == 0) {
            paramInt3 = paramCoordinatorLayout.getHeight();
          }
          int k = localView.getMeasuredHeight();
          int m = g(localView);
          if (j == -1) {}
          for (i = 1073741824;; i = Integer.MIN_VALUE)
          {
            paramCoordinatorLayout.a(paramView, paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(m + (paramInt3 - k), i), paramInt4);
            return true;
          }
        }
      }
    }
    return false;
  }
  
  abstract View c(List<View> paramList);
  
  protected final void d(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    View localView = c(paramCoordinatorLayout.n(paramView));
    if (localView != null)
    {
      CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
      Rect localRect = this.gs;
      localRect.set(paramCoordinatorLayout.getPaddingLeft() + locald.leftMargin, localView.getBottom() + locald.topMargin, paramCoordinatorLayout.getWidth() - paramCoordinatorLayout.getPaddingRight() - locald.rightMargin, paramCoordinatorLayout.getHeight() + localView.getBottom() - paramCoordinatorLayout.getPaddingBottom() - locald.bottomMargin);
      paramCoordinatorLayout = this.gt;
      int j = locald.gravity;
      int i = j;
      if (j == 0) {
        i = 8388659;
      }
      f.apply(i, paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect, paramCoordinatorLayout, paramInt);
      paramInt = o(localView);
      paramView.layout(paramCoordinatorLayout.left, paramCoordinatorLayout.top - paramInt, paramCoordinatorLayout.right, paramCoordinatorLayout.bottom - paramInt);
      this.hU = (paramCoordinatorLayout.top - localView.getBottom());
      return;
    }
    super.d(paramCoordinatorLayout, paramView, paramInt);
    this.hU = 0;
  }
  
  float f(View paramView)
  {
    return 1.0F;
  }
  
  int g(View paramView)
  {
    return paramView.getMeasuredHeight();
  }
  
  final int o(View paramView)
  {
    if (this.hV == 0) {
      return 0;
    }
    return n.b(Math.round(f(paramView) * this.hV), 0, this.hV);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\HeaderScrollingViewBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
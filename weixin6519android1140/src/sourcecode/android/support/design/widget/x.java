package android.support.design.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

final class x
{
  private static final a kN = new b();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      kN = new c();
      return;
    }
  }
  
  static void a(ViewGroup paramViewGroup, View paramView, Rect paramRect)
  {
    paramRect.set(0, 0, paramView.getWidth(), paramView.getHeight());
    kN.b(paramViewGroup, paramView, paramRect);
  }
  
  private static abstract interface a
  {
    public abstract void b(ViewGroup paramViewGroup, View paramView, Rect paramRect);
  }
  
  private static final class b
    implements x.a
  {
    public final void b(ViewGroup paramViewGroup, View paramView, Rect paramRect)
    {
      paramViewGroup.offsetDescendantRectToMyCoords(paramView, paramRect);
      paramRect.offset(paramView.getScrollX(), paramView.getScrollY());
    }
  }
  
  private static final class c
    implements x.a
  {
    public final void b(ViewGroup paramViewGroup, View paramView, Rect paramRect)
    {
      y.b(paramViewGroup, paramView, paramRect);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
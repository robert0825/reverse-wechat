package android.support.v4.view;

import android.view.View;

final class ac
{
  private static void ao(View paramView)
  {
    float f = paramView.getTranslationY();
    paramView.setTranslationY(1.0F + f);
    paramView.setTranslationY(f);
  }
  
  static void j(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
    ao(paramView);
    paramView = paramView.getParent();
    if ((paramView instanceof View)) {
      ao((View)paramView);
    }
  }
  
  static void k(View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
    ao(paramView);
    paramView = paramView.getParent();
    if ((paramView instanceof View)) {
      ao((View)paramView);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
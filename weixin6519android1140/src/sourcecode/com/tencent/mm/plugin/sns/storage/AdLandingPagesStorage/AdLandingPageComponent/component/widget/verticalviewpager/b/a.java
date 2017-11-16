package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.b;

import android.support.v4.view.ViewPager.f;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public final class a
  implements ViewPager.f
{
  public a()
  {
    GMTrace.i(17101620248576L, 127417);
    GMTrace.o(17101620248576L, 127417);
  }
  
  public final void h(View paramView, float paramFloat)
  {
    float f2 = 0.0F;
    GMTrace.i(17101754466304L, 127418);
    float f1;
    if ((0.0F <= paramFloat) && (paramFloat <= 1.0F)) {
      f1 = 1.0F - paramFloat;
    }
    for (;;)
    {
      paramView.setAlpha(f1);
      paramView.setTranslationX(paramView.getWidth() * -paramFloat);
      paramView.setTranslationY(paramView.getHeight() * paramFloat);
      GMTrace.o(17101754466304L, 127418);
      return;
      f1 = f2;
      if (-1.0F < paramFloat)
      {
        f1 = f2;
        if (paramFloat < 0.0F) {
          f1 = paramFloat + 1.0F;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\widget\verticalviewpager\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
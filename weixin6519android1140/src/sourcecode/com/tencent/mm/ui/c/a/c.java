package com.tencent.mm.ui.c.a;

import android.view.animation.DecelerateInterpolator;
import com.tencent.gmtrace.GMTrace;

public final class c
  extends DecelerateInterpolator
{
  public c()
  {
    GMTrace.i(2899371360256L, 21602);
    GMTrace.o(2899371360256L, 21602);
  }
  
  public final float getInterpolation(float paramFloat)
  {
    GMTrace.i(2899505577984L, 21603);
    if (paramFloat <= 0.5D)
    {
      paramFloat = super.getInterpolation(2.0F * paramFloat);
      GMTrace.o(2899505577984L, 21603);
      return paramFloat;
    }
    GMTrace.o(2899505577984L, 21603);
    return 1.0F;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\c\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
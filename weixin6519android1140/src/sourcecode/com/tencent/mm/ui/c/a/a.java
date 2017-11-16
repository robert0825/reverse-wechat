package com.tencent.mm.ui.c.a;

import android.view.animation.BounceInterpolator;
import com.tencent.gmtrace.GMTrace;

public final class a
  extends BounceInterpolator
{
  public a()
  {
    GMTrace.i(2899102924800L, 21600);
    GMTrace.o(2899102924800L, 21600);
  }
  
  public final float getInterpolation(float paramFloat)
  {
    GMTrace.i(2899237142528L, 21601);
    if (paramFloat < 0.36363636363636365D)
    {
      paramFloat = (float)(paramFloat * 7.5625D * paramFloat);
      GMTrace.o(2899237142528L, 21601);
      return paramFloat;
    }
    if (paramFloat < 0.7272727272727273D)
    {
      paramFloat = (float)(paramFloat - 0.5454545454545454D);
      d = paramFloat;
      paramFloat = (float)(paramFloat * (d * 7.5625D) + 0.75D);
      GMTrace.o(2899237142528L, 21601);
      return paramFloat;
    }
    paramFloat = (float)(paramFloat - 0.8181818181818182D);
    double d = paramFloat;
    paramFloat = (float)(paramFloat * (d * 7.5625D) + 0.9375D);
    GMTrace.o(2899237142528L, 21601);
    return paramFloat;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
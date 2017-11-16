package com.tencent.mm.ui.c.a;

import android.view.animation.CycleInterpolator;
import com.tencent.gmtrace.GMTrace;

public final class b
  extends CycleInterpolator
{
  public b()
  {
    super(0.5F);
    GMTrace.i(2898834489344L, 21598);
    GMTrace.o(2898834489344L, 21598);
  }
  
  public final float getInterpolation(float paramFloat)
  {
    GMTrace.i(2898968707072L, 21599);
    paramFloat = (float)(1.0D - Math.pow(2.0F * paramFloat - 1.0F, 2.0D));
    GMTrace.o(2898968707072L, 21599);
    return paramFloat;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\c\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
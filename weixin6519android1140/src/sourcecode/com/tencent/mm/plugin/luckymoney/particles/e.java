package com.tencent.mm.plugin.luckymoney.particles;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.animation.Interpolator;
import com.tencent.gmtrace.GMTrace;

public final class e
{
  private static final Paint mLd;
  private static Interpolator mLe;
  
  static
  {
    GMTrace.i(9913052954624L, 73858);
    Paint localPaint = new Paint();
    mLd = localPaint;
    localPaint.setStyle(Paint.Style.FILL);
    GMTrace.o(9913052954624L, 73858);
  }
  
  public static Interpolator aMo()
  {
    GMTrace.i(9912918736896L, 73857);
    if (mLe == null) {
      mLe = new Interpolator()
      {
        public final float getInterpolation(float paramAnonymousFloat)
        {
          GMTrace.i(9908221116416L, 73822);
          if (paramAnonymousFloat >= 0.9F)
          {
            GMTrace.o(9908221116416L, 73822);
            return 1.0F - (paramAnonymousFloat - 0.9F) * 10.0F;
          }
          GMTrace.o(9908221116416L, 73822);
          return 1.0F;
        }
      };
    }
    Interpolator localInterpolator = mLe;
    GMTrace.o(9912918736896L, 73857);
    return localInterpolator;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\particles\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
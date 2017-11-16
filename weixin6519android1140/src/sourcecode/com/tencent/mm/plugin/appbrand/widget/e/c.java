package com.tencent.mm.plugin.appbrand.widget.e;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.LinearInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;

public final class c
  extends e
{
  private float iRa;
  private float iRb;
  
  public c(b.h paramh, long paramLong, float paramFloat1, float paramFloat2)
  {
    super(paramh, paramLong);
    GMTrace.i(19861807824896L, 147982);
    this.iRa = paramFloat1;
    this.iRb = paramFloat2;
    this.iRo.play(kl(0));
    GMTrace.o(19861807824896L, 147982);
  }
  
  protected final ValueAnimator kl(int paramInt)
  {
    GMTrace.i(15435978244096L, 115007);
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { this.iRa, this.iRb });
    localValueAnimator.setDuration(this.mDuration);
    localValueAnimator.setInterpolator(new LinearInterpolator());
    localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        GMTrace.i(15436246679552L, 115009);
        double d = Double.parseDouble(String.valueOf(paramAnonymousValueAnimator.getAnimatedValue()));
        ((b.h)c.this.iRn).setRotation((float)d);
        GMTrace.o(15436246679552L, 115009);
      }
    });
    GMTrace.o(15435978244096L, 115007);
    return localValueAnimator;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
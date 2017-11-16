package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.Interpolator;

final class w
  extends u.e
{
  final ValueAnimator kJ = new ValueAnimator();
  
  public final void a(final u.e.a parama)
  {
    this.kJ.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator) {}
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        parama.onAnimationEnd();
      }
      
      public final void onAnimationStart(Animator paramAnonymousAnimator) {}
    });
  }
  
  public final void a(final u.e.b paramb)
  {
    this.kJ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        paramb.au();
      }
    });
  }
  
  public final int aw()
  {
    return ((Integer)this.kJ.getAnimatedValue()).intValue();
  }
  
  public final float ax()
  {
    return ((Float)this.kJ.getAnimatedValue()).floatValue();
  }
  
  public final void cancel()
  {
    this.kJ.cancel();
  }
  
  public final void e(float paramFloat1, float paramFloat2)
  {
    this.kJ.setFloatValues(new float[] { paramFloat1, paramFloat2 });
  }
  
  public final void e(int paramInt1, int paramInt2)
  {
    this.kJ.setIntValues(new int[] { paramInt1, paramInt2 });
  }
  
  public final float getAnimatedFraction()
  {
    return this.kJ.getAnimatedFraction();
  }
  
  public final long getDuration()
  {
    return this.kJ.getDuration();
  }
  
  public final boolean isRunning()
  {
    return this.kJ.isRunning();
  }
  
  public final void setDuration(int paramInt)
  {
    this.kJ.setDuration(paramInt);
  }
  
  public final void setInterpolator(Interpolator paramInterpolator)
  {
    this.kJ.setInterpolator(paramInterpolator);
  }
  
  public final void start()
  {
    this.kJ.start();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
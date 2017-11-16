package android.support.v4.a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewPropertyAnimator;

final class f
  implements c
{
  private TimeInterpolator mT;
  
  public final g aB()
  {
    return new b(ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }));
  }
  
  public final void v(View paramView)
  {
    if (this.mT == null) {
      this.mT = new ValueAnimator().getInterpolator();
    }
    paramView.animate().setInterpolator(this.mT);
  }
  
  static final class a
    implements Animator.AnimatorListener
  {
    final b mU;
    final g mV;
    
    public a(b paramb, g paramg)
    {
      this.mU = paramb;
      this.mV = paramg;
    }
    
    public final void onAnimationCancel(Animator paramAnimator)
    {
      this.mU.aC();
    }
    
    public final void onAnimationEnd(Animator paramAnimator)
    {
      this.mU.a(this.mV);
    }
    
    public final void onAnimationRepeat(Animator paramAnimator) {}
    
    public final void onAnimationStart(Animator paramAnimator) {}
  }
  
  static final class b
    implements g
  {
    final Animator mW;
    
    public b(Animator paramAnimator)
    {
      this.mW = paramAnimator;
    }
    
    public final void a(b paramb)
    {
      this.mW.addListener(new f.a(paramb, this));
    }
    
    public final void a(final d paramd)
    {
      if ((this.mW instanceof ValueAnimator)) {
        ((ValueAnimator)this.mW).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            paramd.b(f.b.this);
          }
        });
      }
    }
    
    public final void cancel()
    {
      this.mW.cancel();
    }
    
    public final float getAnimatedFraction()
    {
      return ((ValueAnimator)this.mW).getAnimatedFraction();
    }
    
    public final void setDuration(long paramLong)
    {
      this.mW.setDuration(paramLong);
    }
    
    public final void start()
    {
      this.mW.start();
    }
    
    public final void w(View paramView)
    {
      this.mW.setTarget(paramView);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
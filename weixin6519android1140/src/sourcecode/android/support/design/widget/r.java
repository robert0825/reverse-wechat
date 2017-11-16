package android.support.design.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class r
{
  WeakReference<View> ew;
  final ArrayList<a> iN = new ArrayList();
  a iO = null;
  public Animation iP = null;
  private Animation.AnimationListener iQ = new Animation.AnimationListener()
  {
    public final void onAnimationEnd(Animation paramAnonymousAnimation)
    {
      if (r.this.iP == paramAnonymousAnimation) {
        r.this.iP = null;
      }
    }
    
    public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
    
    public final void onAnimationStart(Animation paramAnonymousAnimation) {}
  };
  
  public final void a(int[] paramArrayOfInt, Animation paramAnimation)
  {
    paramArrayOfInt = new a(paramArrayOfInt, paramAnimation);
    paramAnimation.setAnimationListener(this.iQ);
    this.iN.add(paramArrayOfInt);
  }
  
  final View an()
  {
    if (this.ew == null) {
      return null;
    }
    return (View)this.ew.get();
  }
  
  static final class a
  {
    final int[] iS;
    final Animation mAnimation;
    
    public a(int[] paramArrayOfInt, Animation paramAnimation)
    {
      this.iS = paramArrayOfInt;
      this.mAnimation = paramAnimation;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
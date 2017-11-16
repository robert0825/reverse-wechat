package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.z;
import android.view.ViewPropertyAnimator;

class k
  extends j
{
  public boolean hr;
  
  k(VisibilityAwareImageButton paramVisibilityAwareImageButton, p paramp)
  {
    super(paramVisibilityAwareImageButton, paramp);
  }
  
  boolean Z()
  {
    return true;
  }
  
  final void a(final l.a parama, boolean paramBoolean)
  {
    if ((this.hr) || (this.hH.getVisibility() != 0)) {}
    do
    {
      return;
      if ((z.aj(this.hH)) && (!this.hH.isInEditMode())) {
        break;
      }
      this.hH.a(8, false);
    } while (parama == null);
    return;
    this.hH.animate().cancel();
    this.hH.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F).setDuration(200L).setInterpolator(a.dJ).setListener(new AnimatorListenerAdapter()
    {
      private boolean hy;
      
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        k.this.hr = false;
        this.hy = true;
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        k.this.hr = false;
        if (!this.hy) {
          k.this.hH.a(8, this.ht);
        }
      }
      
      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        k.this.hr = true;
        this.hy = false;
        k.this.hH.a(0, this.ht);
      }
    });
  }
  
  final void aa()
  {
    float f1 = this.hH.getRotation();
    Object localObject;
    if (this.hs != null)
    {
      localObject = this.hs;
      float f2 = -f1;
      if (((o)localObject).eS != f2)
      {
        ((o)localObject).eS = f2;
        ((o)localObject).invalidateSelf();
      }
    }
    if (this.hC != null)
    {
      localObject = this.hC;
      f1 = -f1;
      if (f1 != ((d)localObject).eS)
      {
        ((d)localObject).eS = f1;
        ((d)localObject).invalidateSelf();
      }
    }
  }
  
  final void b(final l.a parama, boolean paramBoolean)
  {
    if ((this.hr) || (this.hH.getVisibility() != 0))
    {
      if ((z.aj(this.hH)) && (!this.hH.isInEditMode()))
      {
        this.hH.animate().cancel();
        if (this.hH.getVisibility() != 0)
        {
          this.hH.setAlpha(0.0F);
          this.hH.setScaleY(0.0F);
          this.hH.setScaleX(0.0F);
        }
        this.hH.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setDuration(200L).setInterpolator(a.dK).setListener(new AnimatorListenerAdapter()
        {
          public final void onAnimationEnd(Animator paramAnonymousAnimator) {}
          
          public final void onAnimationStart(Animator paramAnonymousAnimator)
          {
            k.this.hH.a(0, this.ht);
          }
        });
      }
    }
    else {
      return;
    }
    this.hH.a(0, false);
    this.hH.setAlpha(1.0F);
    this.hH.setScaleY(1.0F);
    this.hH.setScaleX(1.0F);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.design.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.b.a.a;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

@TargetApi(21)
final class m
  extends k
{
  private InsetDrawable hL;
  private final Interpolator mInterpolator;
  
  m(VisibilityAwareImageButton paramVisibilityAwareImageButton, p paramp)
  {
    super(paramVisibilityAwareImageButton, paramp);
    if (paramVisibilityAwareImageButton.isInEditMode()) {}
    for (paramVisibilityAwareImageButton = null;; paramVisibilityAwareImageButton = AnimationUtils.loadInterpolator(this.hH.getContext(), 17563661))
    {
      this.mInterpolator = paramVisibilityAwareImageButton;
      return;
    }
  }
  
  private Animator a(Animator paramAnimator)
  {
    paramAnimator.setInterpolator(this.mInterpolator);
    return paramAnimator;
  }
  
  final void X() {}
  
  final boolean Z()
  {
    return false;
  }
  
  final void a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int paramInt1, int paramInt2)
  {
    this.hA = a.g(ad());
    a.a(this.hA, paramColorStateList);
    if (paramMode != null) {
      a.a(this.hA, paramMode);
    }
    if (paramInt2 > 0) {
      this.hC = a(paramInt2, paramColorStateList);
    }
    for (paramColorStateList = new LayerDrawable(new Drawable[] { this.hC, this.hA });; paramColorStateList = this.hA)
    {
      this.hB = new RippleDrawable(ColorStateList.valueOf(paramInt1), paramColorStateList, null);
      this.hD = this.hB;
      this.hI.setBackgroundDrawable(this.hB);
      return;
      this.hC = null;
    }
  }
  
  final void a(int[] paramArrayOfInt) {}
  
  final d ac()
  {
    return new e();
  }
  
  final void b(Rect paramRect)
  {
    if (this.hI.W())
    {
      float f1 = this.hI.V();
      float f2 = this.hH.getElevation() + this.hF;
      int i = (int)Math.ceil(o.b(f2, f1, false));
      int j = (int)Math.ceil(o.a(f2, f1, false));
      paramRect.set(i, j, i, j);
      return;
    }
    paramRect.set(0, 0, 0, 0);
  }
  
  final void c(Rect paramRect)
  {
    if (this.hI.W())
    {
      this.hL = new InsetDrawable(this.hB, paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
      this.hI.setBackgroundDrawable(this.hL);
      return;
    }
    this.hI.setBackgroundDrawable(this.hB);
  }
  
  public final void i(float paramFloat)
  {
    this.hH.setElevation(paramFloat);
    if (this.hI.W()) {
      ab();
    }
  }
  
  final void j(float paramFloat)
  {
    StateListAnimator localStateListAnimator = new StateListAnimator();
    localStateListAnimator.addState(PRESSED_ENABLED_STATE_SET, a(ObjectAnimator.ofFloat(this.hH, "translationZ", new float[] { paramFloat })));
    localStateListAnimator.addState(hG, a(ObjectAnimator.ofFloat(this.hH, "translationZ", new float[] { paramFloat })));
    localStateListAnimator.addState(EMPTY_STATE_SET, a(ObjectAnimator.ofFloat(this.hH, "translationZ", new float[] { 0.0F })));
    this.hH.setStateListAnimator(localStateListAnimator);
    if (this.hI.W()) {
      ab();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
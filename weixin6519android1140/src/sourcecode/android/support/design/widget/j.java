package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.design.a.a;
import android.util.StateSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

class j
  extends l
{
  private int hp;
  private r hq;
  public boolean hr;
  o hs;
  
  j(VisibilityAwareImageButton paramVisibilityAwareImageButton, p paramp)
  {
    super(paramVisibilityAwareImageButton, paramp);
    this.hp = paramVisibilityAwareImageButton.getResources().getInteger(17694720);
    this.hq = new r();
    paramp = this.hq;
    View localView = paramp.an();
    if (localView != paramVisibilityAwareImageButton)
    {
      if (localView != null)
      {
        localView = paramp.an();
        int j = paramp.iN.size();
        int i = 0;
        while (i < j)
        {
          Animation localAnimation = ((r.a)paramp.iN.get(i)).mAnimation;
          if (localView.getAnimation() == localAnimation) {
            localView.clearAnimation();
          }
          i += 1;
        }
        paramp.ew = null;
        paramp.iO = null;
        paramp.iP = null;
      }
      if (paramVisibilityAwareImageButton != null) {
        paramp.ew = new WeakReference(paramVisibilityAwareImageButton);
      }
    }
    this.hq.a(PRESSED_ENABLED_STATE_SET, c(new b((byte)0)));
    this.hq.a(hG, c(new b((byte)0)));
    this.hq.a(EMPTY_STATE_SET, c(new c((byte)0)));
  }
  
  private Animation c(Animation paramAnimation)
  {
    paramAnimation.setInterpolator(a.dI);
    paramAnimation.setDuration(this.hp);
    return paramAnimation;
  }
  
  void X()
  {
    r localr = this.hq;
    if (localr.iP != null)
    {
      View localView = localr.an();
      if ((localView != null) && (localView.getAnimation() == localr.iP)) {
        localView.clearAnimation();
      }
    }
  }
  
  void a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int paramInt1, int paramInt2)
  {
    this.hA = android.support.v4.b.a.a.g(ad());
    android.support.v4.b.a.a.a(this.hA, paramColorStateList);
    if (paramMode != null) {
      android.support.v4.b.a.a.a(this.hA, paramMode);
    }
    this.hB = android.support.v4.b.a.a.g(ad());
    android.support.v4.b.a.a.a(this.hB, new ColorStateList(new int[][] { hG, PRESSED_ENABLED_STATE_SET, new int[0] }, new int[] { paramInt1, paramInt1, 0 }));
    if (paramInt2 > 0)
    {
      this.hC = a(paramInt2, paramColorStateList);
      paramColorStateList = new Drawable[3];
      paramColorStateList[0] = this.hC;
      paramColorStateList[1] = this.hA;
      paramColorStateList[2] = this.hB;
    }
    for (;;)
    {
      this.hD = new LayerDrawable(paramColorStateList);
      this.hs = new o(this.hH.getResources(), this.hD, this.hI.V(), this.hE, this.hE + this.hF);
      paramColorStateList = this.hs;
      paramColorStateList.iu = false;
      paramColorStateList.invalidateSelf();
      this.hI.setBackgroundDrawable(this.hs);
      return;
      this.hC = null;
      paramColorStateList = new Drawable[2];
      paramColorStateList[0] = this.hA;
      paramColorStateList[1] = this.hB;
    }
  }
  
  void a(final l.a parama, boolean paramBoolean)
  {
    if ((this.hr) || (this.hH.getVisibility() != 0)) {
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(this.hH.getContext(), a.a.W);
    localAnimation.setInterpolator(a.dJ);
    localAnimation.setDuration(200L);
    localAnimation.setAnimationListener(new b() {});
    this.hH.startAnimation(localAnimation);
  }
  
  void a(int[] paramArrayOfInt)
  {
    r localr = this.hq;
    int j = localr.iN.size();
    int i = 0;
    Object localObject;
    if (i < j)
    {
      localObject = (r.a)localr.iN.get(i);
      if (!StateSet.stateSetMatches(((r.a)localObject).iS, paramArrayOfInt)) {}
    }
    for (paramArrayOfInt = (int[])localObject;; paramArrayOfInt = null)
    {
      if (paramArrayOfInt != localr.iO)
      {
        if ((localr.iO != null) && (localr.iP != null))
        {
          localObject = localr.an();
          if ((localObject != null) && (((View)localObject).getAnimation() == localr.iP)) {
            ((View)localObject).clearAnimation();
          }
          localr.iP = null;
        }
        localr.iO = paramArrayOfInt;
        localObject = (View)localr.ew.get();
        if ((paramArrayOfInt != null) && (localObject != null) && (((View)localObject).getVisibility() == 0))
        {
          localr.iP = paramArrayOfInt.mAnimation;
          paramArrayOfInt = localr.an();
          if (paramArrayOfInt != null) {
            paramArrayOfInt.startAnimation(localr.iP);
          }
        }
      }
      return;
      i += 1;
      break;
    }
  }
  
  void b(Rect paramRect)
  {
    this.hs.getPadding(paramRect);
  }
  
  void b(final l.a parama, boolean paramBoolean)
  {
    if ((this.hH.getVisibility() != 0) || (this.hr))
    {
      this.hH.clearAnimation();
      this.hH.a(0, false);
      Animation localAnimation = AnimationUtils.loadAnimation(this.hH.getContext(), a.a.V);
      localAnimation.setDuration(200L);
      localAnimation.setInterpolator(a.dK);
      localAnimation.setAnimationListener(new b() {});
      this.hH.startAnimation(localAnimation);
    }
  }
  
  void i(float paramFloat)
  {
    if (this.hs != null)
    {
      this.hs.d(paramFloat, this.hF + paramFloat);
      ab();
    }
  }
  
  void j(float paramFloat)
  {
    if (this.hs != null)
    {
      o localo = this.hs;
      float f = this.hE;
      localo.d(localo.io, f + paramFloat);
      ab();
    }
  }
  
  final void setBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.hA != null) {
      android.support.v4.b.a.a.a(this.hA, paramColorStateList);
    }
    if (this.hC != null) {
      this.hC.c(paramColorStateList);
    }
  }
  
  final void setBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.hA != null) {
      android.support.v4.b.a.a.a(this.hA, paramMode);
    }
  }
  
  private abstract class a
    extends Animation
  {
    private float hw;
    private float hx;
    
    private a() {}
    
    protected abstract float Y();
    
    protected void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      paramTransformation = j.this.hs;
      paramTransformation.d(this.hw + this.hx * paramFloat, paramTransformation.im);
    }
    
    public void reset()
    {
      super.reset();
      this.hw = j.this.hs.io;
      this.hx = (Y() - this.hw);
    }
  }
  
  private final class b
    extends j.a
  {
    private b()
    {
      super((byte)0);
    }
    
    protected final float Y()
    {
      return j.this.hE + j.this.hF;
    }
  }
  
  private final class c
    extends j.a
  {
    private c()
    {
      super((byte)0);
    }
    
    protected final float Y()
    {
      return j.this.hE;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.design.a.c;
import android.view.ViewTreeObserver.OnPreDrawListener;

abstract class l
{
  static final int[] EMPTY_STATE_SET = new int[0];
  static final int[] PRESSED_ENABLED_STATE_SET = { 16842919, 16842910 };
  static final int[] hG = { 16842908, 16842910 };
  private final Rect fV = new Rect();
  Drawable hA;
  Drawable hB;
  d hC;
  Drawable hD;
  float hE;
  float hF;
  final VisibilityAwareImageButton hH;
  final p hI;
  ViewTreeObserver.OnPreDrawListener hJ;
  
  l(VisibilityAwareImageButton paramVisibilityAwareImageButton, p paramp)
  {
    this.hH = paramVisibilityAwareImageButton;
    this.hI = paramp;
  }
  
  static GradientDrawable ad()
  {
    GradientDrawable localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setShape(1);
    localGradientDrawable.setColor(-1);
    return localGradientDrawable;
  }
  
  abstract void X();
  
  boolean Z()
  {
    return false;
  }
  
  final d a(int paramInt, ColorStateList paramColorStateList)
  {
    Resources localResources = this.hH.getResources();
    d locald = ac();
    int i = localResources.getColor(a.c.ag);
    int j = localResources.getColor(a.c.af);
    int k = localResources.getColor(a.c.ad);
    int m = localResources.getColor(a.c.ae);
    locald.eL = i;
    locald.eM = j;
    locald.eN = k;
    locald.eO = m;
    float f = paramInt;
    if (locald.eK != f)
    {
      locald.eK = f;
      locald.mPaint.setStrokeWidth(f * 1.3333F);
      locald.eR = true;
      locald.invalidateSelf();
    }
    locald.c(paramColorStateList);
    return locald;
  }
  
  abstract void a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int paramInt1, int paramInt2);
  
  abstract void a(a parama, boolean paramBoolean);
  
  abstract void a(int[] paramArrayOfInt);
  
  void aa() {}
  
  final void ab()
  {
    Rect localRect = this.fV;
    b(localRect);
    c(localRect);
    this.hI.d(localRect.left, localRect.top, localRect.right, localRect.bottom);
  }
  
  d ac()
  {
    return new d();
  }
  
  abstract void b(Rect paramRect);
  
  abstract void b(a parama, boolean paramBoolean);
  
  void c(Rect paramRect) {}
  
  abstract void i(float paramFloat);
  
  abstract void j(float paramFloat);
  
  abstract void setBackgroundTintList(ColorStateList paramColorStateList);
  
  abstract void setBackgroundTintMode(PorterDuff.Mode paramMode);
  
  static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
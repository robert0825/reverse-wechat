package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.z;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.view.View;

final class f
{
  private final h Oc;
  private an Of;
  private an Og;
  private an Oh;
  private final View mView;
  
  f(View paramView, h paramh)
  {
    this.mView = paramView;
    this.Oc = paramh;
  }
  
  final void a(PorterDuff.Mode paramMode)
  {
    if (this.Og == null) {
      this.Og = new an();
    }
    this.Og.mw = paramMode;
    this.Og.Yr = true;
    eu();
  }
  
  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = this.mView.getContext().obtainStyledAttributes(paramAttributeSet, a.k.ViewBackgroundHelper, paramInt, 0);
    try
    {
      if (paramAttributeSet.hasValue(a.k.ViewBackgroundHelper_android_background))
      {
        ColorStateList localColorStateList = this.Oc.f(this.mView.getContext(), paramAttributeSet.getResourceId(a.k.ViewBackgroundHelper_android_background, -1));
        if (localColorStateList != null) {
          f(localColorStateList);
        }
      }
      if (paramAttributeSet.hasValue(a.k.ViewBackgroundHelper_backgroundTint)) {
        z.a(this.mView, paramAttributeSet.getColorStateList(a.k.ViewBackgroundHelper_backgroundTint));
      }
      if (paramAttributeSet.hasValue(a.k.ViewBackgroundHelper_backgroundTintMode)) {
        z.a(this.mView, w.aQ(paramAttributeSet.getInt(a.k.ViewBackgroundHelper_backgroundTintMode, -1)));
      }
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  final void aK(int paramInt)
  {
    if (this.Oc != null) {}
    for (ColorStateList localColorStateList = this.Oc.f(this.mView.getContext(), paramInt);; localColorStateList = null)
    {
      f(localColorStateList);
      return;
    }
  }
  
  final ColorStateList bK()
  {
    if (this.Og != null) {
      return this.Og.Yq;
    }
    return null;
  }
  
  final PorterDuff.Mode bL()
  {
    if (this.Og != null) {
      return this.Og.mw;
    }
    return null;
  }
  
  final void d(ColorStateList paramColorStateList)
  {
    if (this.Og == null) {
      this.Og = new an();
    }
    this.Og.Yq = paramColorStateList;
    this.Og.Ys = true;
    eu();
  }
  
  final void eu()
  {
    int i = 0;
    Drawable localDrawable = this.mView.getBackground();
    if (localDrawable != null)
    {
      if (Build.VERSION.SDK_INT != 21) {
        break label148;
      }
      if (this.Oh == null) {
        this.Oh = new an();
      }
      an localan = this.Oh;
      localan.Yq = null;
      localan.Ys = false;
      localan.mw = null;
      localan.Yr = false;
      Object localObject = z.af(this.mView);
      if (localObject != null)
      {
        localan.Ys = true;
        localan.Yq = ((ColorStateList)localObject);
      }
      localObject = z.ag(this.mView);
      if (localObject != null)
      {
        localan.Yr = true;
        localan.mw = ((PorterDuff.Mode)localObject);
      }
      if ((localan.Ys) || (localan.Yr))
      {
        h.a(localDrawable, localan, this.mView.getDrawableState());
        i = 1;
      }
      if (i == 0) {
        break label148;
      }
    }
    label148:
    do
    {
      return;
      if (this.Og != null)
      {
        h.a(localDrawable, this.Og, this.mView.getDrawableState());
        return;
      }
    } while (this.Of == null);
    h.a(localDrawable, this.Of, this.mView.getDrawableState());
  }
  
  final void f(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.Of == null) {
        this.Of = new an();
      }
      this.Of.Yq = paramColorStateList;
      this.Of.Ys = true;
    }
    for (;;)
    {
      eu();
      return;
      this.Of = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
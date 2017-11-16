package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.b.a.a;
import android.support.v4.widget.c;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class g
{
  private final h Oc;
  private final CompoundButton Oj;
  private ColorStateList Ok = null;
  private PorterDuff.Mode Ol = null;
  private boolean Om = false;
  private boolean On = false;
  private boolean Oo;
  
  g(CompoundButton paramCompoundButton, h paramh)
  {
    this.Oj = paramCompoundButton;
    this.Oc = paramh;
  }
  
  private void ew()
  {
    Drawable localDrawable = c.a(this.Oj);
    if ((localDrawable != null) && ((this.Om) || (this.On)))
    {
      localDrawable = a.g(localDrawable).mutate();
      if (this.Om) {
        a.a(localDrawable, this.Ok);
      }
      if (this.On) {
        a.a(localDrawable, this.Ol);
      }
      if (localDrawable.isStateful()) {
        localDrawable.setState(this.Oj.getDrawableState());
      }
      this.Oj.setButtonDrawable(localDrawable);
    }
  }
  
  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = this.Oj.getContext().obtainStyledAttributes(paramAttributeSet, a.k.CompoundButton, paramInt, 0);
    try
    {
      if (paramAttributeSet.hasValue(a.k.CompoundButton_android_button))
      {
        paramInt = paramAttributeSet.getResourceId(a.k.CompoundButton_android_button, 0);
        if (paramInt != 0) {
          this.Oj.setButtonDrawable(this.Oc.a(this.Oj.getContext(), paramInt, false));
        }
      }
      if (paramAttributeSet.hasValue(a.k.CompoundButton_buttonTint)) {
        c.a(this.Oj, paramAttributeSet.getColorStateList(a.k.CompoundButton_buttonTint));
      }
      if (paramAttributeSet.hasValue(a.k.CompoundButton_buttonTintMode)) {
        c.a(this.Oj, w.aQ(paramAttributeSet.getInt(a.k.CompoundButton_buttonTintMode, -1)));
      }
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  final int aL(int paramInt)
  {
    int i = paramInt;
    if (Build.VERSION.SDK_INT < 17)
    {
      Drawable localDrawable = c.a(this.Oj);
      i = paramInt;
      if (localDrawable != null) {
        i = paramInt + localDrawable.getIntrinsicWidth();
      }
    }
    return i;
  }
  
  final void b(PorterDuff.Mode paramMode)
  {
    this.Ol = paramMode;
    this.On = true;
    ew();
  }
  
  final void e(ColorStateList paramColorStateList)
  {
    this.Ok = paramColorStateList;
    this.Om = true;
    ew();
  }
  
  final void ev()
  {
    if (this.Oo)
    {
      this.Oo = false;
      return;
    }
    this.Oo = true;
    ew();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
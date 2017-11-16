package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;

public final class c
{
  private static final c Au = new b();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      Au = new a();
      return;
    }
    if (i >= 21)
    {
      Au = new d();
      return;
    }
  }
  
  public static Drawable a(CompoundButton paramCompoundButton)
  {
    return Au.a(paramCompoundButton);
  }
  
  public static void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
  {
    Au.a(paramCompoundButton, paramColorStateList);
  }
  
  public static void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
  {
    Au.a(paramCompoundButton, paramMode);
  }
  
  static final class a
    extends c.d
  {
    public final Drawable a(CompoundButton paramCompoundButton)
    {
      return paramCompoundButton.getButtonDrawable();
    }
  }
  
  static class b
    implements c.c
  {
    public Drawable a(CompoundButton paramCompoundButton)
    {
      return d.a(paramCompoundButton);
    }
    
    public void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
    {
      if ((paramCompoundButton instanceof t)) {
        ((t)paramCompoundButton).e(paramColorStateList);
      }
    }
    
    public void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
    {
      if ((paramCompoundButton instanceof t)) {
        ((t)paramCompoundButton).b(paramMode);
      }
    }
  }
  
  static abstract interface c
  {
    public abstract Drawable a(CompoundButton paramCompoundButton);
    
    public abstract void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList);
    
    public abstract void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode);
  }
  
  static class d
    extends c.b
  {
    public final void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
    {
      paramCompoundButton.setButtonTintList(paramColorStateList);
    }
    
    public final void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
    {
      paramCompoundButton.setButtonTintMode(paramMode);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;

public final class r
{
  static final f DU = new b();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      DU = new a();
      return;
    }
    if (i >= 18)
    {
      DU = new d();
      return;
    }
    if (i >= 17)
    {
      DU = new c();
      return;
    }
    if (i >= 16)
    {
      DU = new e();
      return;
    }
  }
  
  public static void a(TextView paramTextView, Drawable paramDrawable)
  {
    DU.a(paramTextView, paramDrawable, null, null, null);
  }
  
  public static int c(TextView paramTextView)
  {
    return DU.c(paramTextView);
  }
  
  static final class a
    extends r.d
  {}
  
  static class b
    implements r.f
  {
    public void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
    {
      paramTextView.setCompoundDrawables(paramDrawable1, null, null, null);
    }
    
    public int c(TextView paramTextView)
    {
      if (!s.DY)
      {
        s.DX = s.o("mMaxMode");
        s.DY = true;
      }
      if ((s.DX != null) && (s.a(s.DX, paramTextView) == 1))
      {
        if (!s.DW)
        {
          s.DV = s.o("mMaximum");
          s.DW = true;
        }
        if (s.DV != null) {
          return s.a(s.DV, paramTextView);
        }
      }
      return -1;
    }
  }
  
  static class c
    extends r.e
  {
    public void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
    {
      int i;
      if (paramTextView.getLayoutDirection() == 1)
      {
        i = 1;
        if (i == 0) {
          break label38;
        }
        paramDrawable2 = null;
        label18:
        if (i == 0) {
          break label43;
        }
      }
      for (;;)
      {
        paramTextView.setCompoundDrawables(paramDrawable2, null, paramDrawable1, null);
        return;
        i = 0;
        break;
        label38:
        paramDrawable2 = paramDrawable1;
        break label18;
        label43:
        paramDrawable1 = null;
      }
    }
  }
  
  static class d
    extends r.c
  {
    public final void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
    {
      paramTextView.setCompoundDrawablesRelative(paramDrawable1, null, null, null);
    }
  }
  
  static class e
    extends r.b
  {
    public final int c(TextView paramTextView)
    {
      return paramTextView.getMaxLines();
    }
  }
  
  static abstract interface f
  {
    public abstract void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4);
    
    public abstract int c(TextView paramTextView);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\widget\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
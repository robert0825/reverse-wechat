package android.support.v4.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Gravity;

public final class f
{
  static final a wn = new b();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      wn = new c();
      return;
    }
  }
  
  public static void apply(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2, int paramInt4)
  {
    wn.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, paramInt4);
  }
  
  public static int getAbsoluteGravity(int paramInt1, int paramInt2)
  {
    return wn.getAbsoluteGravity(paramInt1, paramInt2);
  }
  
  static abstract interface a
  {
    public abstract void apply(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2, int paramInt4);
    
    public abstract int getAbsoluteGravity(int paramInt1, int paramInt2);
  }
  
  static final class b
    implements f.a
  {
    public final void apply(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2, int paramInt4)
    {
      Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2);
    }
    
    public final int getAbsoluteGravity(int paramInt1, int paramInt2)
    {
      return 0xFF7FFFFF & paramInt1;
    }
  }
  
  static final class c
    implements f.a
  {
    public final void apply(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2, int paramInt4)
    {
      Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, paramInt4);
    }
    
    public final int getAbsoluteGravity(int paramInt1, int paramInt2)
    {
      return Gravity.getAbsoluteGravity(paramInt1, paramInt2);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
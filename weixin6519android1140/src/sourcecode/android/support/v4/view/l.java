package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class l
{
  static final a wt = new b();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      wt = new c();
      return;
    }
  }
  
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return wt.a(paramMarginLayoutParams);
  }
  
  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return wt.b(paramMarginLayoutParams);
  }
  
  static abstract interface a
  {
    public abstract int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams);
    
    public abstract int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams);
  }
  
  static final class b
    implements l.a
  {
    public final int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      return paramMarginLayoutParams.leftMargin;
    }
    
    public final int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      return paramMarginLayoutParams.rightMargin;
    }
  }
  
  static final class c
    implements l.a
  {
    public final int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      return paramMarginLayoutParams.getMarginStart();
    }
    
    public final int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      return paramMarginLayoutParams.getMarginEnd();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
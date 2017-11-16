package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class a
{
  private static final d yY = new c();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      yY = new b();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      yY = new a();
      return;
    }
  }
  
  public static f a(AccessibilityEvent paramAccessibilityEvent)
  {
    return new f(paramAccessibilityEvent);
  }
  
  public static void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    yY.a(paramAccessibilityEvent, paramInt);
  }
  
  public static int b(AccessibilityEvent paramAccessibilityEvent)
  {
    return yY.b(paramAccessibilityEvent);
  }
  
  static class a
    extends a.c
  {}
  
  static final class b
    extends a.a
  {
    public final void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
    {
      paramAccessibilityEvent.setContentChangeTypes(paramInt);
    }
    
    public final int b(AccessibilityEvent paramAccessibilityEvent)
    {
      return paramAccessibilityEvent.getContentChangeTypes();
    }
  }
  
  static class c
    implements a.d
  {
    public void a(AccessibilityEvent paramAccessibilityEvent, int paramInt) {}
    
    public int b(AccessibilityEvent paramAccessibilityEvent)
    {
      return 0;
    }
  }
  
  static abstract interface d
  {
    public abstract void a(AccessibilityEvent paramAccessibilityEvent, int paramInt);
    
    public abstract int b(AccessibilityEvent paramAccessibilityEvent);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
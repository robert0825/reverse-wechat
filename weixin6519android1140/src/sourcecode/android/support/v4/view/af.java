package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class af
{
  static final c xB = new f();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      xB = new e();
      return;
    }
    if (i >= 18)
    {
      xB = new d();
      return;
    }
    if (i >= 14)
    {
      xB = new b();
      return;
    }
    if (i >= 11)
    {
      xB = new a();
      return;
    }
  }
  
  public static void b(ViewGroup paramViewGroup)
  {
    xB.b(paramViewGroup, false);
  }
  
  static class a
    extends af.f
  {
    public final void b(ViewGroup paramViewGroup, boolean paramBoolean)
    {
      paramViewGroup.setMotionEventSplittingEnabled(false);
    }
  }
  
  static class b
    extends af.a
  {}
  
  static abstract interface c
  {
    public abstract void b(ViewGroup paramViewGroup, boolean paramBoolean);
  }
  
  static class d
    extends af.b
  {}
  
  static final class e
    extends af.d
  {}
  
  static class f
    implements af.c
  {
    public void b(ViewGroup paramViewGroup, boolean paramBoolean) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
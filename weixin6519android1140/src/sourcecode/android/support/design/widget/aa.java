package android.support.design.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewOutlineProvider;

final class aa
{
  static final u.d kY = new u.d()
  {
    public final u av()
    {
      if (Build.VERSION.SDK_INT >= 12) {}
      for (Object localObject = new w();; localObject = new v()) {
        return new u((u.e)localObject);
      }
    }
  };
  private static final a kZ = new b();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      kZ = new c();
      return;
    }
  }
  
  static u av()
  {
    return kY.av();
  }
  
  static void u(View paramView)
  {
    kZ.u(paramView);
  }
  
  private static abstract interface a
  {
    public abstract void u(View paramView);
  }
  
  private static final class b
    implements aa.a
  {
    public final void u(View paramView) {}
  }
  
  private static final class c
    implements aa.a
  {
    public final void u(View paramView)
    {
      paramView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
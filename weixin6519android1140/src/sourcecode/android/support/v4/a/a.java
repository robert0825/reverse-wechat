package android.support.v4.a;

import android.os.Build.VERSION;
import android.view.View;

public final class a
{
  private static final c mL = new e();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 12)
    {
      mL = new f();
      return;
    }
  }
  
  public static g aB()
  {
    return mL.aB();
  }
  
  public static void v(View paramView)
  {
    mL.v(paramView);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
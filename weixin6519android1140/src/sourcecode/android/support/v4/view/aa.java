package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;

final class aa
{
  private static Field xt;
  private static boolean xu;
  private static Field xv;
  private static boolean xw;
  
  static int T(View paramView)
  {
    if (!xu) {}
    try
    {
      Field localField = View.class.getDeclaredField("mMinWidth");
      xt = localField;
      localField.setAccessible(true);
      xu = true;
      if (xt != null) {
        try
        {
          int i = ((Integer)xt.get(paramView)).intValue();
          return i;
        }
        catch (Exception paramView) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  static int U(View paramView)
  {
    if (!xw) {}
    try
    {
      Field localField = View.class.getDeclaredField("mMinHeight");
      xv = localField;
      localField.setAccessible(true);
      xw = true;
      if (xv != null) {
        try
        {
          int i = ((Integer)xv.get(paramView)).intValue();
          return i;
        }
        catch (Exception paramView) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
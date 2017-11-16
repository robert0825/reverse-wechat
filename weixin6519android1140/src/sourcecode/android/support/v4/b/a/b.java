package android.support.v4.b.a;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;

final class b
{
  static Method tb;
  static boolean tc;
  private static Method td;
  private static boolean te;
  
  public static int i(Drawable paramDrawable)
  {
    if (!te) {}
    try
    {
      Method localMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
      td = localMethod;
      localMethod.setAccessible(true);
      te = true;
      if (td != null) {
        try
        {
          int i = ((Integer)td.invoke(paramDrawable, new Object[0])).intValue();
          return i;
        }
        catch (Exception paramDrawable)
        {
          td = null;
        }
      }
      return -1;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
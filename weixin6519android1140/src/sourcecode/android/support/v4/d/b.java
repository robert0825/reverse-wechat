package android.support.v4.d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

final class b
{
  private static Method uM;
  
  static
  {
    try
    {
      uM = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] { Locale.class });
      return;
    }
    catch (Exception localException)
    {
      throw new IllegalStateException(localException);
    }
  }
  
  public static String a(Locale paramLocale)
  {
    try
    {
      String str = ((Locale)uM.invoke(null, new Object[] { paramLocale })).getScript();
      return str;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return paramLocale.getScript();
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
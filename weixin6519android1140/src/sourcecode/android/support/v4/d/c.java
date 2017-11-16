package android.support.v4.d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

final class c
{
  private static Method uM;
  private static Method uN;
  
  static
  {
    try
    {
      Class localClass = Class.forName("libcore.icu.ICU");
      if (localClass != null)
      {
        uN = localClass.getMethod("getScript", new Class[] { String.class });
        uM = localClass.getMethod("addLikelySubtags", new Class[] { String.class });
      }
      return;
    }
    catch (Exception localException)
    {
      uN = null;
      uM = null;
    }
  }
  
  public static String a(Locale paramLocale)
  {
    paramLocale = b(paramLocale);
    if (paramLocale != null) {
      return n(paramLocale);
    }
    return null;
  }
  
  private static String b(Locale paramLocale)
  {
    paramLocale = paramLocale.toString();
    try
    {
      if (uM != null)
      {
        String str = (String)uM.invoke(null, new Object[] { paramLocale });
        return str;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      return paramLocale;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
  }
  
  private static String n(String paramString)
  {
    try
    {
      if (uN != null)
      {
        paramString = (String)uN.invoke(null, new Object[] { paramString });
        return paramString;
      }
    }
    catch (InvocationTargetException paramString)
    {
      return null;
    }
    catch (IllegalAccessException paramString)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
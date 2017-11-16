package android.support.v4.d;

import android.os.Build.VERSION;
import java.util.Locale;

public final class a
{
  private static final a uL = new b();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      uL = new d();
      return;
    }
    if (i >= 14)
    {
      uL = new c();
      return;
    }
  }
  
  public static String a(Locale paramLocale)
  {
    return uL.a(paramLocale);
  }
  
  static abstract interface a
  {
    public abstract String a(Locale paramLocale);
  }
  
  static final class b
    implements a.a
  {
    public final String a(Locale paramLocale)
    {
      return null;
    }
  }
  
  static final class c
    implements a.a
  {
    public final String a(Locale paramLocale)
    {
      return c.a(paramLocale);
    }
  }
  
  static final class d
    implements a.a
  {
    public final String a(Locale paramLocale)
    {
      return b.a(paramLocale);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
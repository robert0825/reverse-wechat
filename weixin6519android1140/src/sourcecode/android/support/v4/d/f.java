package android.support.v4.d;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

public final class f
{
  public static final Locale ROOT;
  private static final a vb;
  public static String vc;
  public static String vd;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17) {}
    for (vb = new b();; vb = new a())
    {
      ROOT = new Locale("", "");
      vc = "Arab";
      vd = "Hebr";
      return;
    }
  }
  
  public static int getLayoutDirectionFromLocale(Locale paramLocale)
  {
    return vb.getLayoutDirectionFromLocale(paramLocale);
  }
  
  private static class a
  {
    public int getLayoutDirectionFromLocale(Locale paramLocale)
    {
      int j = 1;
      if ((paramLocale != null) && (!paramLocale.equals(f.ROOT)))
      {
        String str = a.a(paramLocale);
        int i;
        if (str == null)
        {
          i = j;
          switch (Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0)))
          {
          default: 
            i = 0;
          }
        }
        do
        {
          do
          {
            return i;
            i = j;
          } while (str.equalsIgnoreCase(f.vc));
          i = j;
        } while (str.equalsIgnoreCase(f.vd));
      }
      return 0;
    }
  }
  
  private static final class b
    extends f.a
  {
    public final int getLayoutDirectionFromLocale(Locale paramLocale)
    {
      return TextUtils.getLayoutDirectionFromLocale(paramLocale);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
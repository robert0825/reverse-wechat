package c.t.m.g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;

public final class aq
{
  public static String a = "";
  public static String b = "";
  public static String c = "";
  public static String d = "";
  public static String e = "";
  
  private static String a()
  {
    try
    {
      String str = Build.MODEL;
      return str;
    }
    catch (Throwable localThrowable) {}
    return "null";
  }
  
  public static void a(Context paramContext)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(a());
    localStringBuffer.append(";Android ");
    localStringBuffer.append(b());
    localStringBuffer.append(",level ");
    localStringBuffer.append(c());
    a = localStringBuffer.toString();
    c = b(paramContext);
    b = paramContext.getPackageName();
    d = d();
    e = a();
  }
  
  private static String b()
  {
    try
    {
      String str = Build.VERSION.RELEASE;
      return str;
    }
    catch (Throwable localThrowable) {}
    return "null";
  }
  
  private static String b(Context paramContext)
  {
    int j = 0;
    Object localObject = paramContext.getPackageName();
    for (;;)
    {
      int i;
      int k;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo((String)localObject, 0);
        localObject = paramContext.versionName;
        int m = paramContext.versionCode;
        if ((localObject == null) || (((String)localObject).trim().length() <= 0)) {
          return String.valueOf(m);
        }
        paramContext = ((String)localObject).trim().replace('\n', ' ').replace('\r', ' ').replace("|", "%7C");
        localObject = paramContext.toCharArray();
        i = 0;
        if (i < localObject.length)
        {
          k = j;
          if (localObject[i] != '.') {
            break label151;
          }
          k = j + 1;
          break label151;
        }
        if (j < 3)
        {
          paramContext = paramContext + "." + m;
          return paramContext;
        }
      }
      catch (Throwable paramContext)
      {
        return "";
      }
      return paramContext;
      label151:
      i += 1;
      j = k;
    }
  }
  
  private static String c()
  {
    try
    {
      String str = Build.VERSION.SDK;
      return str;
    }
    catch (Throwable localThrowable) {}
    return "null";
  }
  
  private static String d()
  {
    try
    {
      String str = Build.BRAND;
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
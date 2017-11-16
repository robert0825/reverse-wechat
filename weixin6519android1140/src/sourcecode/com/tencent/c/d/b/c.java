package com.tencent.c.d.b;

import android.os.Build.VERSION;
import java.lang.reflect.Method;

public final class c
{
  private static Object xRD = null;
  private static Method xRE = null;
  private static boolean xRF = false;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14) {
      try
      {
        xRD = e.fx("libcore.io.Libcore", "os");
        xRE = e.a("libcore.io.Os", "stat", new Class[] { String.class });
        xRF = true;
        return;
      }
      catch (Throwable localThrowable) {}
    }
  }
  
  public static int XT(String paramString)
  {
    if (!xRF) {}
    do
    {
      return 0;
      paramString = xRE.invoke(xRD, new Object[] { paramString });
    } while (paramString == null);
    return ((Integer)e.a(paramString.getClass(), "st_mode", paramString)).intValue();
  }
  
  public static boolean isAvailable()
  {
    return xRF;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\d\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
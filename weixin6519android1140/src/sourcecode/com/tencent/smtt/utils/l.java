package com.tencent.smtt.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

public final class l
{
  private static Class xYH;
  private static Method xYI;
  
  static
  {
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      xYH = localClass;
      xYI = localClass.getDeclaredMethod("get", new Class[] { String.class, String.class });
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public static String fD(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return paramString2;
    }
    return fE(paramString1, paramString2);
  }
  
  private static String fE(String paramString1, String paramString2)
  {
    if ((xYH == null) || (xYI == null)) {
      return paramString2;
    }
    try
    {
      paramString1 = (String)xYI.invoke(xYH, new Object[] { paramString1, paramString2 });
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return paramString2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
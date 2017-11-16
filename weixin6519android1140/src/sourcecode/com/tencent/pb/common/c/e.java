package com.tencent.pb.common.c;

import java.lang.reflect.Field;

public final class e
{
  public static Class<?> xOt;
  
  private static boolean XI(String paramString)
  {
    Object localObject = null;
    try
    {
      paramString = Class.forName(paramString);
      xOt = paramString;
      return paramString != null;
    }
    catch (ClassNotFoundException paramString)
    {
      for (;;)
      {
        paramString = (String)localObject;
      }
    }
  }
  
  public static Object fv(String paramString1, String paramString2)
  {
    Object localObject = null;
    XI(paramString1);
    paramString2 = getField(paramString2);
    paramString1 = (String)localObject;
    if (paramString2 != null) {}
    try
    {
      paramString1 = paramString2.get(null);
      return paramString1;
    }
    catch (IllegalArgumentException paramString1)
    {
      return null;
    }
    catch (IllegalAccessException paramString1) {}
    return null;
  }
  
  private static final Field getField(String paramString)
  {
    String str2 = null;
    String str1 = null;
    try
    {
      paramString = xOt.getDeclaredField(paramString);
      str1 = paramString;
      str2 = paramString;
      paramString.setAccessible(true);
      return paramString;
    }
    catch (NoSuchFieldException paramString)
    {
      return str1;
    }
    catch (SecurityException paramString) {}
    return str2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\pb\common\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
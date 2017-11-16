package com.tencent.c.d.b;

import android.text.TextUtils;
import com.tencent.c.f.h;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class e
{
  public static Object a(Class<?> paramClass, String paramString, Object paramObject)
  {
    try
    {
      paramClass = a(paramClass, paramString);
      if (paramClass == null) {
        return null;
      }
      paramClass = paramClass.get(paramObject);
      return paramClass;
    }
    catch (Throwable paramClass)
    {
      h.h(paramClass);
    }
    return null;
  }
  
  private static Field a(Class<?> paramClass, String paramString)
  {
    if (paramClass == null) {}
    for (;;)
    {
      return null;
      try
      {
        paramClass = paramClass.getDeclaredField(paramString);
        if (paramClass != null)
        {
          paramClass.setAccessible(true);
          return paramClass;
        }
      }
      catch (Throwable paramClass)
      {
        h.h(paramClass);
      }
    }
    return null;
  }
  
  private static Method a(Class<?> paramClass, String paramString, Class<?>... paramVarArgs)
  {
    if (paramClass != null) {
      try
      {
        if (TextUtils.isEmpty(paramString)) {
          return null;
        }
        paramClass = paramClass.getDeclaredMethod(paramString, paramVarArgs);
        if (paramClass != null)
        {
          paramClass.setAccessible(true);
          return paramClass;
        }
      }
      catch (Throwable paramClass)
      {
        h.h(paramClass);
      }
    }
    return null;
  }
  
  public static Method a(String paramString1, String paramString2, Class<?>... paramVarArgs)
  {
    try
    {
      paramString1 = a(s(paramString1, null), paramString2, paramVarArgs);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      h.h(paramString1);
    }
    return null;
  }
  
  public static Object fx(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = a(s(paramString1, null), paramString2, null);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      h.h(paramString1);
    }
    return null;
  }
  
  private static Class<?> s(String paramString, Object paramObject)
  {
    try
    {
      paramString = Class.forName(paramString);
      if (paramString == null) {
        return null;
      }
    }
    catch (Throwable paramString)
    {
      try
      {
        h.h(paramString);
        paramString = null;
      }
      catch (Throwable paramString)
      {
        h.h(paramString);
      }
      return paramString;
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\d\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.ipcinvoker;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.c.a;
import com.tencent.mm.ipcinvoker.e.b;
import com.tencent.mm.ipcinvoker.extension.e;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class n
{
  private static Map<String, e> fVJ;
  
  static
  {
    GMTrace.i(18700958695424L, 139333);
    fVJ = new ConcurrentHashMap();
    GMTrace.o(18700958695424L, 139333);
  }
  
  public static <T> T a(Class<?> paramClass1, Class<?> paramClass2)
  {
    GMTrace.i(18700690259968L, 139331);
    try
    {
      if (!paramClass2.isAssignableFrom(paramClass1))
      {
        w.e("IPC.ObjectStore", "%s isAssignableFrom %s return false", new Object[] { paramClass2, paramClass1 });
        GMTrace.o(18700690259968L, 139331);
        return null;
      }
      if (paramClass1.isAnnotationPresent(a.class))
      {
        String str = paramClass1.getName();
        e locale = (e)fVJ.get(str);
        paramClass2 = locale;
        if (locale == null)
        {
          paramClass2 = new e(paramClass1);
          fVJ.put(str, paramClass2);
        }
        paramClass1 = paramClass2.get();
        GMTrace.o(18700690259968L, 139331);
        return paramClass1;
      }
      paramClass1 = b.b(paramClass1, paramClass2);
      GMTrace.o(18700690259968L, 139331);
      return paramClass1;
    }
    catch (Exception paramClass1)
    {
      GMTrace.o(18700690259968L, 139331);
    }
    return null;
  }
  
  public static <T> T c(String paramString, Class<?> paramClass)
  {
    GMTrace.i(18700556042240L, 139330);
    try
    {
      Class localClass = Class.forName(paramString);
      if (!paramClass.isAssignableFrom(localClass))
      {
        w.e("IPC.ObjectStore", "%s isAssignableFrom %s return false", new Object[] { paramClass, localClass });
        GMTrace.o(18700556042240L, 139330);
        return null;
      }
      if (localClass.isAnnotationPresent(a.class))
      {
        e locale = (e)fVJ.get(paramString);
        paramClass = locale;
        if (locale == null)
        {
          paramClass = new e(localClass);
          fVJ.put(paramString, paramClass);
        }
        paramString = paramClass.get();
        GMTrace.o(18700556042240L, 139330);
        return paramString;
      }
      paramString = b.d(paramString, paramClass);
      GMTrace.o(18700556042240L, 139330);
      return paramString;
    }
    catch (Exception paramString)
    {
      GMTrace.o(18700556042240L, 139330);
    }
    return null;
  }
  
  public static <T> T d(String paramString, Class<?> paramClass)
  {
    GMTrace.i(18700824477696L, 139332);
    paramString = b.d(paramString, paramClass);
    GMTrace.o(18700824477696L, 139332);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
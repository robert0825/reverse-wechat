package com.tencent.mm.kernel;

import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class g
{
  private static volatile boolean fZw;
  
  static
  {
    GMTrace.i(13533576167424L, 100833);
    fZw = true;
    GMTrace.o(13533576167424L, 100833);
  }
  
  public static <T> T a(Class<T> paramClass, int paramInt)
  {
    GMTrace.i(13533307731968L, 100831);
    if (!fZw)
    {
      GMTrace.o(13533307731968L, 100831);
      return null;
    }
    if (paramInt > 3)
    {
      j.e("MMSkeleton.DummyMode", "dummy level > 3, return null.", new Object[0]);
      GMTrace.o(13533307731968L, 100831);
      return null;
    }
    if (!paramClass.isInterface())
    {
      GMTrace.o(13533307731968L, 100831);
      return null;
    }
    try
    {
      a locala = new a();
      locala.level = paramInt;
      j.i("MMSkeleton.DummyMode", "dummy level %s", new Object[] { Integer.valueOf(paramInt) });
      paramClass = Proxy.newProxyInstance(paramClass.getClassLoader(), new Class[] { paramClass, b.class }, locala);
      GMTrace.o(13533307731968L, 100831);
      return paramClass;
    }
    catch (Throwable paramClass)
    {
      j.printErrStackTrace("MMSkeleton.DummyMode", paramClass, "", new Object[0]);
      GMTrace.o(13533307731968L, 100831);
    }
    return null;
  }
  
  public static <T> T l(Class<T> paramClass)
  {
    GMTrace.i(13533173514240L, 100830);
    if (!fZw)
    {
      GMTrace.o(13533173514240L, 100830);
      return null;
    }
    paramClass = a(paramClass, 0);
    GMTrace.o(13533173514240L, 100830);
    return paramClass;
  }
  
  private static final class a
    implements InvocationHandler
  {
    public int level;
    
    public a()
    {
      GMTrace.i(13526865281024L, 100783);
      this.level = 0;
      GMTrace.o(13526865281024L, 100783);
    }
    
    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      GMTrace.i(13526999498752L, 100784);
      paramObject = paramMethod.getReturnType();
      if (paramObject.equals(Integer.TYPE))
      {
        GMTrace.o(13526999498752L, 100784);
        return Integer.valueOf(0);
      }
      if (paramObject.equals(Long.TYPE))
      {
        GMTrace.o(13526999498752L, 100784);
        return Long.valueOf(0L);
      }
      if (paramObject.equals(Double.TYPE))
      {
        GMTrace.o(13526999498752L, 100784);
        return Double.valueOf(0.0D);
      }
      if (paramObject.equals(Float.TYPE))
      {
        GMTrace.o(13526999498752L, 100784);
        return Float.valueOf(0.0F);
      }
      if (paramObject.equals(Short.TYPE))
      {
        GMTrace.o(13526999498752L, 100784);
        return Integer.valueOf(0);
      }
      if (paramObject.equals(Byte.TYPE))
      {
        GMTrace.o(13526999498752L, 100784);
        return Integer.valueOf(0);
      }
      if (paramObject.equals(Character.TYPE))
      {
        GMTrace.o(13526999498752L, 100784);
        return Integer.valueOf(0);
      }
      if (paramObject.equals(Boolean.TYPE))
      {
        GMTrace.o(13526999498752L, 100784);
        return Boolean.valueOf(false);
      }
      if (paramObject.equals(Boolean.class))
      {
        GMTrace.o(13526999498752L, 100784);
        return Boolean.valueOf(false);
      }
      if (((Class)paramObject).isInterface())
      {
        paramObject = g.a((Class)paramObject, this.level + 1);
        GMTrace.o(13526999498752L, 100784);
        return paramObject;
      }
      GMTrace.o(13526999498752L, 100784);
      return null;
    }
  }
  
  private static abstract interface b {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
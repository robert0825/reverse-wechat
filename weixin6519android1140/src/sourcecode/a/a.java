package a;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public final class a
{
  public final Object yA;
  private final boolean yqU;
  
  private a(Object paramObject)
  {
    this.yA = paramObject;
    this.yqU = false;
  }
  
  private static Class<?> H(Class<?> paramClass)
  {
    Class<?> localClass;
    if (paramClass == null) {
      localClass = null;
    }
    do
    {
      do
      {
        return localClass;
        localClass = paramClass;
      } while (!paramClass.isPrimitive());
      if (Boolean.TYPE == paramClass) {
        return Boolean.class;
      }
      if (Integer.TYPE == paramClass) {
        return Integer.class;
      }
      if (Long.TYPE == paramClass) {
        return Long.class;
      }
      if (Short.TYPE == paramClass) {
        return Short.class;
      }
      if (Byte.TYPE == paramClass) {
        return Byte.class;
      }
      if (Double.TYPE == paramClass) {
        return Double.class;
      }
      if (Float.TYPE == paramClass) {
        return Float.class;
      }
      if (Character.TYPE == paramClass) {
        return Character.class;
      }
      localClass = paramClass;
    } while (Void.TYPE != paramClass);
    return Void.class;
  }
  
  private static a a(Method paramMethod, Object paramObject, Object... paramVarArgs)
  {
    if (paramMethod != null) {}
    try
    {
      if ((paramMethod instanceof Member))
      {
        Member localMember = (Member)paramMethod;
        if ((Modifier.isPublic(localMember.getModifiers())) && (Modifier.isPublic(localMember.getDeclaringClass().getModifiers()))) {}
      }
      else if (!paramMethod.isAccessible())
      {
        paramMethod.setAccessible(true);
      }
      if (paramMethod.getReturnType() == Void.TYPE)
      {
        paramMethod.invoke(paramObject, paramVarArgs);
        return ch(paramObject);
      }
      paramMethod = ch(paramMethod.invoke(paramObject, paramVarArgs));
      return paramMethod;
    }
    catch (Exception paramMethod)
    {
      throw new b(paramMethod);
    }
  }
  
  private Method a(String paramString, Class<?>[] paramArrayOfClass)
  {
    Object localObject = csQ();
    try
    {
      Method localMethod1 = ((Class)localObject).getMethod(paramString, paramArrayOfClass);
      return localMethod1;
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      Class localClass;
      do
      {
        try
        {
          Method localMethod2 = ((Class)localObject).getDeclaredMethod(paramString, paramArrayOfClass);
          return localMethod2;
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          localClass = ((Class)localObject).getSuperclass();
          localObject = localClass;
        }
      } while (localClass != null);
      throw new NoSuchMethodException();
    }
  }
  
  private static boolean a(Method paramMethod, String paramString, Class<?>[] paramArrayOfClass)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramMethod.getName().equals(paramString))
    {
      paramMethod = paramMethod.getParameterTypes();
      if (paramMethod.length != paramArrayOfClass.length) {
        break label87;
      }
      i = 0;
      while (i < paramArrayOfClass.length)
      {
        if ((paramArrayOfClass[i] != a.class) && (!H(paramMethod[i]).isAssignableFrom(H(paramArrayOfClass[i])))) {
          break label87;
        }
        i += 1;
      }
    }
    label87:
    for (int i = 1;; i = 0)
    {
      bool1 = bool2;
      if (i != 0) {
        bool1 = true;
      }
      return bool1;
    }
  }
  
  public static a ch(Object paramObject)
  {
    return new a(paramObject);
  }
  
  private Class<?> csQ()
  {
    if (this.yqU) {
      return (Class)this.yA;
    }
    return this.yA.getClass();
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof a)) {
      return this.yA.equals(((a)paramObject).yA);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.yA.hashCode();
  }
  
  public final a l(String paramString, Object... paramVarArgs)
  {
    Class[] arrayOfClass = new Class[paramVarArgs.length];
    int i = 0;
    Object localObject1;
    if (i < paramVarArgs.length)
    {
      localObject1 = paramVarArgs[i];
      if (localObject1 == null) {}
      for (localObject1 = a.class;; localObject1 = localObject1.getClass())
      {
        arrayOfClass[i] = localObject1;
        i += 1;
        break;
      }
    }
    try
    {
      localObject1 = a(a(paramString, arrayOfClass), this.yA, paramVarArgs);
      return (a)localObject1;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
    for (;;)
    {
      try
      {
        localClass = csQ();
        arrayOfMethod1 = localClass.getMethods();
        j = arrayOfMethod1.length;
        i = 0;
        if (i >= j) {
          break label252;
        }
        localObject2 = arrayOfMethod1[i];
        if (!a((Method)localObject2, paramString, arrayOfClass)) {
          break label255;
        }
        return a((Method)localObject2, this.yA, paramVarArgs);
      }
      catch (NoSuchMethodException paramString)
      {
        Class localClass;
        Method[] arrayOfMethod1;
        int j;
        Object localObject2;
        Method[] arrayOfMethod2;
        throw new b(paramString);
      }
      arrayOfMethod2 = localClass.getDeclaredMethods();
      j = arrayOfMethod2.length;
      i = 0;
      if (i < j)
      {
        arrayOfMethod1 = arrayOfMethod2[i];
        localObject2 = arrayOfMethod1;
        if (!a(arrayOfMethod1, paramString, arrayOfClass)) {
          i += 1;
        }
      }
      else
      {
        localClass = localClass.getSuperclass();
        if (localClass == null)
        {
          throw new NoSuchMethodException("No similar method " + paramString + " with params " + Arrays.toString(arrayOfClass) + " could be found on type " + csQ() + ".");
          label252:
          continue;
          label255:
          i += 1;
        }
      }
    }
  }
  
  public final String toString()
  {
    return this.yA.toString();
  }
  
  private static class a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
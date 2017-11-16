package org.xwalk.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.RejectedExecutionException;

class ReflectMethod
{
  private Object[] mArguments;
  private Class<?> mClass;
  private Object mInstance;
  private Method mMethod;
  private String mName;
  private Class<?>[] mParameterTypes;
  
  public ReflectMethod() {}
  
  public ReflectMethod(Class<?> paramClass, String paramString, Class<?>... paramVarArgs)
  {
    init(null, paramClass, paramString, paramVarArgs);
  }
  
  public ReflectMethod(Object paramObject, String paramString, Class<?>... paramVarArgs)
  {
    init(paramObject, null, paramString, paramVarArgs);
  }
  
  public Object[] getArguments()
  {
    return this.mArguments;
  }
  
  public Object getInstance()
  {
    return this.mInstance;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public boolean init(Object paramObject, Class<?> paramClass, String paramString, Class<?>... paramVarArgs)
  {
    this.mInstance = paramObject;
    if (paramClass != null) {}
    for (;;)
    {
      this.mClass = paramClass;
      this.mName = paramString;
      this.mParameterTypes = paramVarArgs;
      this.mMethod = null;
      if (this.mClass != null) {
        break;
      }
      return false;
      if (paramObject != null) {
        paramClass = paramObject.getClass();
      } else {
        paramClass = null;
      }
    }
    try
    {
      this.mMethod = this.mClass.getMethod(this.mName, this.mParameterTypes);
      if (this.mMethod != null) {
        return true;
      }
    }
    catch (NoSuchMethodException paramObject)
    {
      paramObject = this.mClass;
      while (paramObject != null) {
        try
        {
          this.mMethod = ((Class)paramObject).getDeclaredMethod(this.mName, this.mParameterTypes);
          this.mMethod.setAccessible(true);
        }
        catch (NoSuchMethodException paramClass)
        {
          paramObject = ((Class)paramObject).getSuperclass();
        }
      }
    }
    return false;
  }
  
  public Object invoke(Object... paramVarArgs)
  {
    if (this.mMethod == null) {
      throw new UnsupportedOperationException(toString());
    }
    try
    {
      paramVarArgs = this.mMethod.invoke(this.mInstance, paramVarArgs);
      return paramVarArgs;
    }
    catch (NullPointerException paramVarArgs)
    {
      throw new RejectedExecutionException(paramVarArgs);
    }
    catch (IllegalArgumentException paramVarArgs)
    {
      throw paramVarArgs;
    }
    catch (InvocationTargetException paramVarArgs)
    {
      throw new RuntimeException(paramVarArgs.getCause());
    }
    catch (IllegalAccessException paramVarArgs)
    {
      for (;;) {}
    }
  }
  
  public Object invokeWithArguments()
  {
    return invoke(this.mArguments);
  }
  
  public boolean isNull()
  {
    return this.mMethod == null;
  }
  
  public void setArguments(Object... paramVarArgs)
  {
    this.mArguments = paramVarArgs;
  }
  
  public String toString()
  {
    Object localObject;
    if (this.mMethod != null) {
      localObject = this.mMethod.toString();
    }
    String str;
    do
    {
      return (String)localObject;
      str = "";
      if (this.mClass != null) {
        str = "" + this.mClass.toString() + ".";
      }
      localObject = str;
    } while (this.mName == null);
    return str + this.mName;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\org\xwalk\core\ReflectMethod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
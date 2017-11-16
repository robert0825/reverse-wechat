package com.tencent.xweb.util;

import android.os.Build.VERSION;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import org.xwalk.core.Log;

public final class d
{
  public static Object d(Object paramObject, String paramVarArgs)
  {
    if (paramObject == null) {}
    do
    {
      for (;;)
      {
        return null;
        try
        {
          Object localObject = paramObject.getClass();
          if (Build.VERSION.SDK_INT > 10) {}
          for (localObject = ((Class)localObject).getMethod(paramVarArgs, null);; localObject = ((Class)localObject).getDeclaredMethod(paramVarArgs, null))
          {
            ((Method)localObject).setAccessible(true);
            return ((Method)localObject).invoke(paramObject, null);
          }
          if (paramVarArgs.equalsIgnoreCase("canLoadX5Core")) {}
        }
        catch (Throwable paramObject)
        {
          if ((((Throwable)paramObject).getCause() != null) && (((Throwable)paramObject).getCause().toString().contains("AuthenticationFail"))) {
            return new String("AuthenticationFail");
          }
        }
      }
    } while (paramVarArgs.equalsIgnoreCase("initTesRuntimeEnvironment"));
    paramVarArgs = new StringWriter();
    ((Throwable)paramObject).printStackTrace(new PrintWriter(paramVarArgs));
    Log.e("ReflectionUtils", "invokeInstance -- exceptions:" + paramVarArgs.toString());
    return null;
  }
  
  public static Object fF(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = Class.forName(paramString1).getMethod(paramString2, new Class[0]).invoke(null, new Object[0]);
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\util\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
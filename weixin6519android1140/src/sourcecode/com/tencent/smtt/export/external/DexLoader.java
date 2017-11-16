package com.tencent.smtt.export.external;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import dalvik.system.DexClassLoader;
import dalvik.system.VMStack;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

public class DexLoader
{
  private static final String JAVACORE_PACKAGE_PREFIX = "org.chromium";
  private static final String TAG = "DexLoader";
  private static final String TBS_FUSION_DEX = "tbs_jars_fusion_dex";
  private static final String TBS_WEBVIEW_DEX = "webview_dex";
  private static boolean mUseTbsCorePrivateClassLoader = false;
  private DexClassLoader mClassLoader;
  
  public DexLoader(Context paramContext, String paramString1, String paramString2)
  {
    this(paramContext, new String[] { paramString1 }, paramString2);
  }
  
  public DexLoader(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    this(null, paramContext, paramArrayOfString, paramString);
  }
  
  public DexLoader(Context paramContext, String[] paramArrayOfString, String paramString, DexLoader paramDexLoader)
  {
    paramDexLoader = paramDexLoader.getClassLoader();
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      paramDexLoader = createDexClassLoader(paramArrayOfString[i], paramString, paramContext.getApplicationInfo().nativeLibraryDir, paramDexLoader);
      this.mClassLoader = paramDexLoader;
      i += 1;
    }
  }
  
  public DexLoader(Context paramContext, String[] paramArrayOfString, String paramString1, String paramString2)
  {
    ClassLoader localClassLoader = paramContext.getClassLoader();
    String str = paramContext.getApplicationInfo().nativeLibraryDir;
    paramContext = str;
    if (!TextUtils.isEmpty(paramString2)) {
      paramContext = str + File.pathSeparator + paramString2;
    }
    int i = 0;
    paramString2 = localClassLoader;
    while (i < paramArrayOfString.length)
    {
      paramString2 = createDexClassLoader(paramArrayOfString[i], paramString1, paramContext, paramString2);
      this.mClassLoader = paramString2;
      i += 1;
    }
  }
  
  public DexLoader(String paramString1, Context paramContext, String[] paramArrayOfString, String paramString2)
  {
    this(paramString1, paramContext, paramArrayOfString, paramString2, null);
  }
  
  public DexLoader(String paramString1, Context paramContext, String[] paramArrayOfString, String paramString2, Map<String, Object> paramMap)
  {
    initTbsSettings(paramMap);
    ClassLoader localClassLoader = VMStack.getCallingClassLoader();
    paramMap = localClassLoader;
    if (localClassLoader == null) {
      paramMap = paramContext.getClassLoader();
    }
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      paramMap = createDexClassLoader(paramArrayOfString[i], paramString2, paramString1, paramMap);
      this.mClassLoader = paramMap;
      i += 1;
    }
  }
  
  private DexClassLoader createDexClassLoader(String paramString1, String paramString2, String paramString3, ClassLoader paramClassLoader)
  {
    if (shouldUseTbsCorePrivateClassLoader(paramString1)) {
      return new TbsCorePrivateClassLoader(paramString1, paramString2, paramString3, paramClassLoader);
    }
    return new DexClassLoader(paramString1, paramString2, paramString3, paramClassLoader);
  }
  
  public static void initTbsSettings(Map<String, Object> paramMap)
  {
    if (paramMap != null) {}
    try
    {
      paramMap = paramMap.get("use_private_classloader");
      if ((paramMap instanceof Boolean)) {
        mUseTbsCorePrivateClassLoader = ((Boolean)paramMap).booleanValue();
      }
      return;
    }
    catch (Throwable paramMap) {}
  }
  
  private boolean shouldUseTbsCorePrivateClassLoader(String paramString)
  {
    if (!mUseTbsCorePrivateClassLoader) {}
    while ((!paramString.contains("tbs_jars_fusion_dex")) && (!paramString.contains("webview_dex"))) {
      return false;
    }
    return true;
  }
  
  public DexClassLoader getClassLoader()
  {
    return this.mClassLoader;
  }
  
  public Object getStaticField(String paramString1, String paramString2)
  {
    try
    {
      Object localObject = this.mClassLoader.loadClass(paramString1).getField(paramString2);
      ((Field)localObject).setAccessible(true);
      localObject = ((Field)localObject).get(null);
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      getClass().getSimpleName();
      new StringBuilder("'").append(paramString1).append("' get field '").append(paramString2).append("' failed");
    }
    return null;
  }
  
  public Object invokeMethod(Object paramObject, String paramString1, String paramString2, Class<?>[] paramArrayOfClass, Object... paramVarArgs)
  {
    try
    {
      paramArrayOfClass = this.mClassLoader.loadClass(paramString1).getMethod(paramString2, paramArrayOfClass);
      paramArrayOfClass.setAccessible(true);
      paramObject = paramArrayOfClass.invoke(paramObject, paramVarArgs);
      return paramObject;
    }
    catch (Throwable paramObject)
    {
      getClass().getSimpleName();
      new StringBuilder("'").append(paramString1).append("' invoke method '").append(paramString2).append("' failed");
    }
    return null;
  }
  
  public Object invokeStaticMethod(String paramString1, String paramString2, Class<?>[] paramArrayOfClass, Object... paramVarArgs)
  {
    try
    {
      paramArrayOfClass = this.mClassLoader.loadClass(paramString1).getMethod(paramString2, paramArrayOfClass);
      paramArrayOfClass.setAccessible(true);
      paramArrayOfClass = paramArrayOfClass.invoke(null, paramVarArgs);
      return paramArrayOfClass;
    }
    catch (Throwable paramArrayOfClass)
    {
      if ((paramString2 != null) && (paramString2.equalsIgnoreCase("initTesRuntimeEnvironment")))
      {
        getClass().getSimpleName();
        new StringBuilder("'").append(paramString1).append("' invoke static method '").append(paramString2).append("' failed");
        return paramArrayOfClass;
      }
      getClass().getSimpleName();
      new StringBuilder("'").append(paramString1).append("' invoke static method '").append(paramString2).append("' failed");
    }
    return null;
  }
  
  public Class<?> loadClass(String paramString)
  {
    try
    {
      Class localClass = this.mClassLoader.loadClass(paramString);
      return localClass;
    }
    catch (Throwable localThrowable)
    {
      getClass().getSimpleName();
      new StringBuilder("loadClass '").append(paramString).append("' failed");
    }
    return null;
  }
  
  public Object newInstance(String paramString)
  {
    try
    {
      Object localObject = this.mClassLoader.loadClass(paramString).newInstance();
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      getClass().getSimpleName();
      new StringBuilder("create ").append(paramString).append(" instance failed");
    }
    return null;
  }
  
  public Object newInstance(String paramString, Class<?>[] paramArrayOfClass, Object... paramVarArgs)
  {
    try
    {
      paramArrayOfClass = this.mClassLoader.loadClass(paramString).getConstructor(paramArrayOfClass).newInstance(paramVarArgs);
      return paramArrayOfClass;
    }
    catch (Throwable paramArrayOfClass)
    {
      if ("com.tencent.smtt.webkit.adapter.X5WebViewAdapter".equalsIgnoreCase(paramString))
      {
        getClass().getSimpleName();
        new StringBuilder("'newInstance ").append(paramString).append(" failed");
        return paramArrayOfClass;
      }
      getClass().getSimpleName();
      new StringBuilder("create '").append(paramString).append("' instance failed");
    }
    return null;
  }
  
  public void setStaticField(String paramString1, String paramString2, Object paramObject)
  {
    try
    {
      Field localField = this.mClassLoader.loadClass(paramString1).getField(paramString2);
      localField.setAccessible(true);
      localField.set(null, paramObject);
      return;
    }
    catch (Throwable paramObject)
    {
      getClass().getSimpleName();
      new StringBuilder("'").append(paramString1).append("' set field '").append(paramString2).append("' failed");
    }
  }
  
  private static class TbsCorePrivateClassLoader
    extends DexClassLoader
  {
    public TbsCorePrivateClassLoader(String paramString1, String paramString2, String paramString3, ClassLoader paramClassLoader)
    {
      super(paramString2, paramString3, paramClassLoader);
    }
    
    protected Class<?> loadClass(String paramString, boolean paramBoolean)
    {
      Object localObject2;
      if ((paramString != null) && (paramString.startsWith("org.chromium")))
      {
        localObject2 = findLoadedClass(paramString);
        localObject1 = localObject2;
        if (localObject2 != null) {}
      }
      try
      {
        localObject1 = findClass(paramString);
        localObject2 = localObject1;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        ClassLoader localClassLoader;
        for (;;) {}
      }
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        localClassLoader = getParent();
        localObject1 = localObject2;
        if (localClassLoader != null) {
          localObject1 = localClassLoader.loadClass(paramString);
        }
      }
      return (Class<?>)localObject1;
      return super.loadClass(paramString, paramBoolean);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\export\external\DexLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
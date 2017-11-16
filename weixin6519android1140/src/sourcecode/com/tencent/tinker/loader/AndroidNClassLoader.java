package com.tencent.tinker.loader;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
class AndroidNClassLoader
  extends PathClassLoader
{
  private final PathClassLoader yha;
  private String yhb;
  
  private AndroidNClassLoader(String paramString, PathClassLoader paramPathClassLoader, Application paramApplication)
  {
    super(paramString, paramPathClassLoader.getParent());
    this.yha = paramPathClassLoader;
    paramString = paramApplication.getClass().getName();
    if ((paramString != null) && (!paramString.equals("android.app.Application"))) {
      this.yhb = paramString;
    }
  }
  
  public static AndroidNClassLoader a(PathClassLoader paramPathClassLoader, Application paramApplication)
  {
    AndroidNClassLoader localAndroidNClassLoader = new AndroidNClassLoader("", paramPathClassLoader, paramApplication);
    Field localField = ShareReflectUtil.a(paramPathClassLoader, "pathList");
    paramPathClassLoader = localField.get(paramPathClassLoader);
    Object localObject2 = (Object[])ShareReflectUtil.a(paramPathClassLoader, "dexElements").get(paramPathClassLoader);
    Object localObject1 = (List)ShareReflectUtil.a(paramPathClassLoader, "nativeLibraryDirectories").get(paramPathClassLoader);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject3 = ShareReflectUtil.b(localObject2.getClass().getComponentType(), "dexFile");
    int i = 1;
    int m = localObject2.length;
    int j = 0;
    if (j < m)
    {
      DexFile localDexFile = (DexFile)((Field)localObject3).get(localObject2[j]);
      int k = i;
      if (localDexFile != null)
      {
        if (i == 0) {
          break label152;
        }
        i = 0;
      }
      for (;;)
      {
        localStringBuilder.append(localDexFile.getName());
        k = i;
        j += 1;
        i = k;
        break;
        label152:
        localStringBuilder.append(File.pathSeparator);
      }
    }
    localObject2 = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localObject1 = ((List)localObject1).iterator();
    i = 1;
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (File)((Iterator)localObject1).next();
      if (localObject3 != null)
      {
        if (i != 0) {
          i = 0;
        }
        for (;;)
        {
          localStringBuilder.append(((File)localObject3).getAbsolutePath());
          break;
          localStringBuilder.append(File.pathSeparator);
        }
      }
    }
    localObject1 = localStringBuilder.toString();
    localField.set(localAndroidNClassLoader, ShareReflectUtil.a(paramPathClassLoader, new Class[] { ClassLoader.class, String.class, String.class, File.class }).newInstance(new Object[] { localAndroidNClassLoader, localObject2, localObject1, null }));
    paramPathClassLoader = (Context)ShareReflectUtil.a(paramApplication, "mBase").get(paramApplication);
    paramPathClassLoader = ShareReflectUtil.a(paramPathClassLoader, "mPackageInfo").get(paramPathClassLoader);
    paramApplication = ShareReflectUtil.a(paramPathClassLoader, "mClassLoader");
    Thread.currentThread().setContextClassLoader(localAndroidNClassLoader);
    paramApplication.set(paramPathClassLoader, localAndroidNClassLoader);
    return localAndroidNClassLoader;
  }
  
  public Class<?> findClass(String paramString)
  {
    if (((paramString != null) && (paramString.startsWith("com.tencent.tinker.loader.")) && (!paramString.equals("com.tencent.tinker.loader.TinkerTestDexLoad"))) || ((this.yhb != null) && (this.yhb.equals(paramString)))) {
      return this.yha.loadClass(paramString);
    }
    return super.findClass(paramString);
  }
  
  public String findLibrary(String paramString)
  {
    return super.findLibrary(paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\tinker\loader\AndroidNClassLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
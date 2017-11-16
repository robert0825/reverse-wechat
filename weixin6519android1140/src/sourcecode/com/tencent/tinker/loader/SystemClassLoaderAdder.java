package com.tencent.tinker.loader;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Build.VERSION;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public class SystemClassLoaderAdder
{
  private static int yhc = 0;
  
  @SuppressLint({"NewApi"})
  public static void a(Application paramApplication, PathClassLoader paramPathClassLoader, File paramFile, List<File> paramList)
  {
    new StringBuilder("installDexes dexOptDir: ").append(paramFile.getAbsolutePath()).append(", dex size:").append(paramList.size());
    if (!paramList.isEmpty())
    {
      List localList = dj(paramList);
      paramList = paramPathClassLoader;
      if (Build.VERSION.SDK_INT >= 24)
      {
        paramList = paramPathClassLoader;
        if (!di(localList)) {
          paramList = AndroidNClassLoader.a(paramPathClassLoader, paramApplication);
        }
      }
      if (Build.VERSION.SDK_INT >= 23) {
        V23.a(paramList, localList, paramFile);
      }
      for (;;)
      {
        yhc = localList.size();
        new StringBuilder("after loaded classloader: ").append(paramList).append(", dex size:").append(yhc);
        if (((Boolean)ShareReflectUtil.b(Class.forName("com.tencent.tinker.loader.TinkerTestDexLoad", true, paramList), "isPatch").get(null)).booleanValue()) {
          break;
        }
        a(paramList);
        throw new TinkerRuntimeException("checkDexInstall failed");
        if (Build.VERSION.SDK_INT >= 19) {
          V19.a(paramList, localList, paramFile);
        } else if (Build.VERSION.SDK_INT >= 14) {
          V14.a(paramList, localList, paramFile);
        } else {
          V4.a(paramList, localList, paramFile);
        }
      }
    }
  }
  
  public static void a(ClassLoader paramClassLoader)
  {
    if (yhc <= 0) {
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      ShareReflectUtil.a(ShareReflectUtil.a(paramClassLoader, "pathList").get(paramClassLoader), "dexElements", yhc);
      return;
    }
    ShareReflectUtil.a(paramClassLoader, "mPaths", yhc);
    ShareReflectUtil.a(paramClassLoader, "mFiles", yhc);
    ShareReflectUtil.a(paramClassLoader, "mZips", yhc);
    try
    {
      ShareReflectUtil.a(paramClassLoader, "mDexs", yhc);
      return;
    }
    catch (Exception paramClassLoader) {}
  }
  
  private static boolean di(List<File> paramList)
  {
    if (!paramList.isEmpty())
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        File localFile = (File)paramList.next();
        if ((localFile != null) && (localFile.getName().startsWith("changed_classes.dex"))) {
          return true;
        }
      }
    }
    return false;
  }
  
  private static List<File> dj(List<File> paramList)
  {
    paramList = new ArrayList(paramList);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = ((File)localIterator.next()).getName();
      localHashMap.put(str, Boolean.valueOf(ShareConstants.yhC.matcher(str).matches()));
    }
    Collections.sort(paramList, new Comparator() {});
    return paramList;
  }
  
  private static final class V14
  {
    public static void a(ClassLoader paramClassLoader, List<File> paramList, File paramFile)
    {
      paramClassLoader = ShareReflectUtil.a(paramClassLoader, "pathList").get(paramClassLoader);
      paramList = new ArrayList(paramList);
      ShareReflectUtil.a(paramClassLoader, "dexElements", (Object[])ShareReflectUtil.a(paramClassLoader, "makeDexElements", new Class[] { ArrayList.class, File.class }).invoke(paramClassLoader, new Object[] { paramList, paramFile }));
    }
  }
  
  private static final class V19
  {
    public static void a(ClassLoader paramClassLoader, List<File> paramList, File paramFile)
    {
      paramClassLoader = ShareReflectUtil.a(paramClassLoader, "pathList").get(paramClassLoader);
      ArrayList localArrayList = new ArrayList();
      ShareReflectUtil.a(paramClassLoader, "dexElements", a(paramClassLoader, new ArrayList(paramList), paramFile, localArrayList));
      if (localArrayList.size() > 0)
      {
        paramClassLoader = localArrayList.iterator();
        if (paramClassLoader.hasNext()) {
          throw ((IOException)paramClassLoader.next());
        }
      }
    }
    
    public static Object[] a(Object paramObject, ArrayList<File> paramArrayList, File paramFile, ArrayList<IOException> paramArrayList1)
    {
      try
      {
        Method localMethod1 = ShareReflectUtil.a(paramObject, "makeDexElements", new Class[] { ArrayList.class, File.class, ArrayList.class });
        return (Object[])localMethod1.invoke(paramObject, new Object[] { paramArrayList, paramFile, paramArrayList1 });
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        try
        {
          Method localMethod2 = ShareReflectUtil.a(paramObject, "makeDexElements", new Class[] { List.class, File.class, List.class });
        }
        catch (NoSuchMethodException paramObject)
        {
          throw ((Throwable)paramObject);
        }
      }
    }
  }
  
  private static final class V23
  {
    public static void a(ClassLoader paramClassLoader, List<File> paramList, File paramFile)
    {
      paramClassLoader = ShareReflectUtil.a(paramClassLoader, "pathList").get(paramClassLoader);
      ArrayList localArrayList = new ArrayList();
      ShareReflectUtil.a(paramClassLoader, "dexElements", b(paramClassLoader, new ArrayList(paramList), paramFile, localArrayList));
      if (localArrayList.size() > 0)
      {
        paramClassLoader = localArrayList.iterator();
        if (paramClassLoader.hasNext()) {
          throw ((IOException)paramClassLoader.next());
        }
      }
    }
    
    private static Object[] b(Object paramObject, ArrayList<File> paramArrayList, File paramFile, ArrayList<IOException> paramArrayList1)
    {
      try
      {
        Method localMethod1 = ShareReflectUtil.a(paramObject, "makePathElements", new Class[] { List.class, File.class, List.class });
        return (Object[])localMethod1.invoke(paramObject, new Object[] { paramArrayList, paramFile, paramArrayList1 });
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        try
        {
          Method localMethod2 = ShareReflectUtil.a(paramObject, "makePathElements", new Class[] { ArrayList.class, File.class, ArrayList.class });
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          try
          {
            paramObject = SystemClassLoaderAdder.V19.a(paramObject, paramArrayList, paramFile, paramArrayList1);
            return (Object[])paramObject;
          }
          catch (NoSuchMethodException paramObject)
          {
            throw ((Throwable)paramObject);
          }
        }
      }
    }
  }
  
  private static final class V4
  {
    public static void a(ClassLoader paramClassLoader, List<File> paramList, File paramFile)
    {
      int i = paramList.size();
      Field localField = ShareReflectUtil.a(paramClassLoader, "path");
      StringBuilder localStringBuilder = new StringBuilder((String)localField.get(paramClassLoader));
      String[] arrayOfString = new String[i];
      File[] arrayOfFile = new File[i];
      ZipFile[] arrayOfZipFile = new ZipFile[i];
      DexFile[] arrayOfDexFile = new DexFile[i];
      paramList = paramList.listIterator();
      while (paramList.hasNext())
      {
        File localFile = (File)paramList.next();
        String str = localFile.getAbsolutePath();
        localStringBuilder.append(':').append(str);
        i = paramList.previousIndex();
        arrayOfString[i] = str;
        arrayOfFile[i] = localFile;
        arrayOfZipFile[i] = new ZipFile(localFile);
        arrayOfDexFile[i] = DexFile.loadDex(str, SharePatchFileUtil.m(localFile, paramFile), 0);
      }
      localField.set(paramClassLoader, localStringBuilder.toString());
      ShareReflectUtil.a(paramClassLoader, "mPaths", arrayOfString);
      ShareReflectUtil.a(paramClassLoader, "mFiles", arrayOfFile);
      ShareReflectUtil.a(paramClassLoader, "mZips", arrayOfZipFile);
      try
      {
        ShareReflectUtil.a(paramClassLoader, "mDexs", arrayOfDexFile);
        return;
      }
      catch (Exception paramClassLoader) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\tinker\loader\SystemClassLoaderAdder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.smtt.export.external;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.io.File;
import java.util.ArrayList;

public class LibraryLoader
{
  private static String[] sLibrarySearchPaths = null;
  
  public static String[] getLibrarySearchPaths(Context paramContext)
  {
    if (sLibrarySearchPaths != null) {
      return sLibrarySearchPaths;
    }
    if (paramContext == null) {
      return new String[] { "/system/lib" };
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(getNativeLibraryDir(paramContext));
    localArrayList.add("/system/lib");
    paramContext = new String[localArrayList.size()];
    localArrayList.toArray(paramContext);
    sLibrarySearchPaths = paramContext;
    return paramContext;
  }
  
  public static String getNativeLibraryDir(Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 9) {
      return paramContext.getApplicationInfo().nativeLibraryDir;
    }
    if (i >= 4) {
      return paramContext.getApplicationInfo().dataDir + "/lib";
    }
    return "/data/data/" + paramContext.getPackageName() + "/lib";
  }
  
  public static void loadLibrary(Context paramContext, String paramString)
  {
    paramContext = getLibrarySearchPaths(paramContext);
    String str1 = System.mapLibraryName(paramString);
    int j = paramContext.length;
    int i = 0;
    while (i < j)
    {
      String str2 = paramContext[i];
      str2 = str2 + "/" + str1;
      if (new File(str2).exists()) {}
      try
      {
        System.load(str2);
        return;
      }
      catch (Exception paramContext) {}
      i += 1;
    }
    try
    {
      System.loadLibrary(paramString);
      return;
    }
    catch (Exception paramContext) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\export\external\LibraryLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.utils.o;
import java.io.File;
import java.io.InputStream;
import java.util.Map;

public final class CacheManager
{
  @Deprecated
  public static boolean cacheDisabled()
  {
    Object localObject = ab.coW();
    if ((localObject != null) && (((ab)localObject).coX())) {
      return ((Boolean)((ab)localObject).coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cacheDisabled", new Class[0], new Object[0])).booleanValue();
    }
    localObject = o.fF("android.webkit.CacheManager", "cacheDisabled");
    if (localObject == null) {
      return false;
    }
    return ((Boolean)localObject).booleanValue();
  }
  
  public static InputStream getCacheFile(String paramString, boolean paramBoolean)
  {
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX()))
    {
      paramString = localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getCacheFile", new Class[] { String.class, Boolean.TYPE }, new Object[] { paramString, Boolean.valueOf(paramBoolean) });
      if (paramString == null) {
        return null;
      }
      return (InputStream)paramString;
    }
    return null;
  }
  
  public static Object getCacheFile(String paramString, Map<String, String> paramMap)
  {
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX())) {
      return localab.coY().cpa();
    }
    try
    {
      paramString = o.a(Class.forName("android.webkit.CacheManager"), "getCacheFile", new Class[] { String.class, Map.class }, new Object[] { paramString, paramMap });
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  @Deprecated
  public static File getCacheFileBaseDir()
  {
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX())) {
      return (File)localab.coY().cpa();
    }
    return (File)o.fF("android.webkit.CacheManager", "getCacheFileBaseDir");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\smtt\sdk\CacheManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
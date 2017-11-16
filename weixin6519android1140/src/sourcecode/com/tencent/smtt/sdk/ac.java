package com.tencent.smtt.sdk;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import dalvik.system.DexClassLoader;
import java.lang.reflect.Method;
import java.util.Map;

public final class ac
{
  public DexLoader xWV;
  
  public ac(DexLoader paramDexLoader)
  {
    this.xWV = paramDexLoader;
  }
  
  public final int a(Context paramContext, String paramString1, Map<String, String> paramMap, String paramString2, ValueCallback<String> paramValueCallback)
  {
    if (l.gp(paramContext)) {
      return -103;
    }
    if (paramString2 == null)
    {
      paramValueCallback = this.xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "startMiniQB", new Class[] { Context.class, String.class, Map.class, ValueCallback.class }, new Object[] { paramContext, paramString1, paramMap, paramValueCallback });
      paramString2 = paramValueCallback;
      if (paramValueCallback == null) {
        paramString2 = this.xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "startMiniQB", new Class[] { Context.class, String.class, Map.class }, new Object[] { paramContext, paramString1, paramMap });
      }
      paramMap = paramString2;
      if (paramString2 == null) {
        paramMap = this.xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "startMiniQB", new Class[] { Context.class, String.class }, new Object[] { paramContext, paramString1 });
      }
      if (paramMap == null) {
        return -104;
      }
      return ((Integer)paramMap).intValue();
    }
    paramContext = this.xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "startMiniQB", new Class[] { Context.class, String.class, String.class }, new Object[] { paramContext, paramString1, paramString2 });
    if (paramContext == null) {
      return -104;
    }
    return ((Integer)paramContext).intValue();
  }
  
  public final boolean coZ()
  {
    try
    {
      Object localObject = this.xWV.getClassLoader().loadClass("com.tencent.tbs.tbsshell.WebCoreProxy").getMethod("canUseX5", new Class[0]);
      ((Method)localObject).setAccessible(true);
      localObject = ((Method)localObject).invoke(null, new Object[0]);
      if ((localObject instanceof Boolean))
      {
        boolean bool = ((Boolean)localObject).booleanValue();
        return bool;
      }
    }
    catch (Throwable localThrowable)
    {
      throw localThrowable;
    }
    return ((Boolean)localThrowable).booleanValue();
  }
  
  public final Object cpa()
  {
    return this.xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getCachFileBaseDir", new Class[0], new Object[0]);
  }
  
  public final IX5WebViewBase hh(Context paramContext)
  {
    Object localObject3 = this.xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createSDKWebview", new Class[] { Context.class }, new Object[] { paramContext });
    if (localObject3 == null) {}
    try
    {
      localObject1 = this.xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "getLoadFailureDetails", new Class[0], new Object[0]);
      if ((localObject1 != null) && ((localObject1 instanceof Throwable))) {
        i.cnZ().a(paramContext, 325, (Throwable)localObject1);
      }
      if ((localObject1 == null) || (!(localObject1 instanceof String))) {
        break label197;
      }
      i.cnZ().a(paramContext, 325, new Throwable((String)localObject1));
    }
    catch (Exception paramContext)
    {
      Object localObject2;
      do
      {
        IX5WebViewBase localIX5WebViewBase;
        Object localObject1 = null;
        localObject2 = localObject3;
        continue;
        localObject1 = null;
        localObject2 = null;
      } while (localObject2 != null);
    }
    localIX5WebViewBase = (IX5WebViewBase)localObject3;
    localObject1 = localIX5WebViewBase;
    localObject2 = localObject3;
    if (localIX5WebViewBase != null)
    {
      localObject1 = localIX5WebViewBase;
      localObject2 = localObject3;
      try
      {
        if (localIX5WebViewBase.getView() != null) {
          break label201;
        }
        i.cnZ().a(paramContext, 325, new Throwable("x5webview.getView is null!"));
        localObject2 = null;
        localObject1 = localIX5WebViewBase;
      }
      catch (Exception paramContext)
      {
        localObject1 = localIX5WebViewBase;
        localObject2 = localObject3;
      }
      return (IX5WebViewBase)localObject1;
    }
    label197:
    label201:
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
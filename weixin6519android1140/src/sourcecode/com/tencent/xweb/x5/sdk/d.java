package com.tencent.xweb.x5.sdk;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.xweb.p;
import java.util.HashMap;
import java.util.Map;
import org.xwalk.core.Log;

public final class d
{
  static a yoT;
  
  static {}
  
  /* Error */
  public static void a(Context paramContext, a parama)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 20	com/tencent/xweb/x5/sdk/d:yoT	Lcom/tencent/xweb/x5/sdk/a;
    //   6: ifnull +17 -> 23
    //   9: getstatic 20	com/tencent/xweb/x5/sdk/d:yoT	Lcom/tencent/xweb/x5/sdk/a;
    //   12: aload_0
    //   13: aload_1
    //   14: invokeinterface 24 3 0
    //   19: ldc 2
    //   21: monitorexit
    //   22: return
    //   23: ldc 26
    //   25: ldc 28
    //   27: invokestatic 34	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: goto -11 -> 19
    //   33: astore_0
    //   34: ldc 2
    //   36: monitorexit
    //   37: aload_0
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	paramContext	Context
    //   0	39	1	parama	a
    // Exception table:
    //   from	to	target	type
    //   3	19	33	finally
    //   23	30	33	finally
  }
  
  public static void a(Context paramContext, String paramString, ValueCallback<Boolean> paramValueCallback)
  {
    if (yoT != null)
    {
      yoT.a(paramContext, paramString, paramValueCallback);
      return;
    }
    Log.e("TbsDownloader", "canOpenFile: sImp is null");
  }
  
  public static void a(a parama)
  {
    yoT = parama;
  }
  
  public static void a(h paramh)
  {
    if (yoT != null)
    {
      yoT.a(paramh);
      return;
    }
    Log.e("TbsDownloader", "setTbsListener: sImp is null");
  }
  
  public static boolean a(Context paramContext, String paramString, HashMap<String, String> paramHashMap, ValueCallback<String> paramValueCallback)
  {
    if (yoT != null) {
      return yoT.a(paramContext, paramString, paramHashMap, paramValueCallback);
    }
    Log.e("TbsDownloader", "startQbOrMiniQBToLoadUrl: sImp is null");
    return false;
  }
  
  public static boolean canOpenWebPlus(Context paramContext)
  {
    if (yoT != null) {
      return yoT.canOpenWebPlus(paramContext);
    }
    Log.e("TbsDownloader", "canOpenWebPlus: sImp is null");
    return false;
  }
  
  public static void clearAllWebViewCache(Context paramContext, boolean paramBoolean)
  {
    if (yoT != null)
    {
      yoT.clearAllWebViewCache(paramContext, paramBoolean);
      return;
    }
    Log.e("TbsDownloader", "clearAllWebViewCache: sImp is null");
  }
  
  public static void closeFileReader(Context paramContext)
  {
    if (yoT != null)
    {
      yoT.closeFileReader(paramContext);
      return;
    }
    Log.e("TbsDownloader", "closeFileReader: sImp is null");
  }
  
  public static void forceSysWebView()
  {
    if (yoT != null)
    {
      yoT.forceSysWebView();
      return;
    }
    Log.e("TbsDownloader", "forceSysWebView: sImp is null");
  }
  
  public static String getMiniQBVersion(Context paramContext)
  {
    if (yoT != null) {
      return yoT.getMiniQBVersion(paramContext);
    }
    Log.e("TbsDownloader", "forceSysWebView: sImp is null");
    return null;
  }
  
  public static boolean getTBSInstalling()
  {
    if (yoT != null) {
      return yoT.getTBSInstalling();
    }
    Log.e("TbsDownloader", "getTBSInstalling: sImp is null");
    return false;
  }
  
  public static int getTbsVersion(Context paramContext)
  {
    if (yoT != null) {
      return yoT.getTbsVersion(paramContext);
    }
    Log.e("TbsDownloader", "getTbsVersion: sImp is null");
    return 0;
  }
  
  public static void initTbsSettings(Map<String, Object> paramMap)
  {
    if (yoT != null)
    {
      yoT.initTbsSettings(paramMap);
      return;
    }
    Log.e("TbsDownloader", "initTbsSettings: sImp is null");
  }
  
  public static boolean isTbsCoreInited()
  {
    if (yoT != null) {
      return yoT.isTbsCoreInited();
    }
    Log.e("TbsDownloader", "isTbsCoreInited: sImp is null");
    return false;
  }
  
  public static void reset(Context paramContext)
  {
    if (yoT != null)
    {
      yoT.reset(paramContext);
      return;
    }
    Log.e("TbsDownloader", "reset: sImp is null");
  }
  
  public static int startMiniQBToLoadUrl(Context paramContext, String paramString, HashMap<String, String> paramHashMap, ValueCallback<String> paramValueCallback)
  {
    if (yoT != null) {
      return yoT.startMiniQBToLoadUrl(paramContext, paramString, paramHashMap, paramValueCallback);
    }
    Log.e("TbsDownloader", "startMiniQBToLoadUrl: sImp is null");
    return 0;
  }
  
  public static abstract interface a
  {
    public abstract void jV(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\x5\sdk\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
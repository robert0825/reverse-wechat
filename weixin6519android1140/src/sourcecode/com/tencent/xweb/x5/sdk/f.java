package com.tencent.xweb.x5.sdk;

import android.content.Context;
import com.tencent.xweb.p;
import org.xwalk.core.Log;

public final class f
{
  static b yoW;
  
  static {}
  
  public static void a(b paramb)
  {
    yoW = paramb;
  }
  
  public static boolean a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, a parama)
  {
    if (yoW != null) {
      return yoW.a(paramContext, paramBoolean1, paramBoolean2, parama);
    }
    Log.e("TbsDownloader", "needDownload: sImp is null");
    return false;
  }
  
  public static boolean col()
  {
    if (yoW != null) {
      return yoW.col();
    }
    Log.e("TbsDownloader", "isDownloadForeground: sImp is null");
    return false;
  }
  
  public static void gn(Context paramContext)
  {
    r(paramContext, false);
  }
  
  /* Error */
  public static boolean isDownloading()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 20	com/tencent/xweb/x5/sdk/f:yoW	Lcom/tencent/xweb/x5/sdk/b;
    //   6: ifnull +17 -> 23
    //   9: getstatic 20	com/tencent/xweb/x5/sdk/f:yoW	Lcom/tencent/xweb/x5/sdk/b;
    //   12: invokeinterface 50 1 0
    //   17: istore_0
    //   18: ldc 2
    //   20: monitorexit
    //   21: iload_0
    //   22: ireturn
    //   23: ldc 27
    //   25: ldc 52
    //   27: invokestatic 35	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: iconst_0
    //   31: istore_0
    //   32: goto -14 -> 18
    //   35: astore_1
    //   36: ldc 2
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   17	15	0	bool	boolean
    //   35	5	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	18	35	finally
    //   23	30	35	finally
  }
  
  /* Error */
  public static void r(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 20	com/tencent/xweb/x5/sdk/f:yoW	Lcom/tencent/xweb/x5/sdk/b;
    //   6: ifnull +17 -> 23
    //   9: getstatic 20	com/tencent/xweb/x5/sdk/f:yoW	Lcom/tencent/xweb/x5/sdk/b;
    //   12: aload_0
    //   13: iload_1
    //   14: invokeinterface 53 3 0
    //   19: ldc 2
    //   21: monitorexit
    //   22: return
    //   23: ldc 27
    //   25: ldc 55
    //   27: invokestatic 35	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: goto -11 -> 19
    //   33: astore_0
    //   34: ldc 2
    //   36: monitorexit
    //   37: aload_0
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	paramContext	Context
    //   0	39	1	paramBoolean	boolean
    // Exception table:
    //   from	to	target	type
    //   3	19	33	finally
    //   23	30	33	finally
  }
  
  public static void stopDownload()
  {
    if (yoW != null)
    {
      yoW.stopDownload();
      return;
    }
    Log.e("TbsDownloader", "stopDownload: sImp is null");
  }
  
  public static boolean y(Context paramContext, boolean paramBoolean)
  {
    return a(paramContext, paramBoolean, false, null);
  }
  
  public static abstract interface a
  {
    public abstract void g(boolean paramBoolean, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\xweb\x5\sdk\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
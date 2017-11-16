package com.tencent.mm.plugin.webview.wepkg.model;

import android.os.Bundle;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessTask;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgProcessPreloadService;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public class b
{
  private static b rXU;
  
  static
  {
    GMTrace.i(15187272794112L, 113154);
    rXU = null;
    GMTrace.o(15187272794112L, 113154);
  }
  
  public b()
  {
    GMTrace.i(15186735923200L, 113150);
    GMTrace.o(15186735923200L, 113150);
  }
  
  /* Error */
  public static b bGm()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 38
    //   6: ldc 40
    //   8: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: getstatic 25	com/tencent/mm/plugin/webview/wepkg/model/b:rXU	Lcom/tencent/mm/plugin/webview/wepkg/model/b;
    //   14: ifnonnull +25 -> 39
    //   17: ldc 2
    //   19: monitorenter
    //   20: getstatic 25	com/tencent/mm/plugin/webview/wepkg/model/b:rXU	Lcom/tencent/mm/plugin/webview/wepkg/model/b;
    //   23: ifnonnull +13 -> 36
    //   26: new 2	com/tencent/mm/plugin/webview/wepkg/model/b
    //   29: dup
    //   30: invokespecial 41	com/tencent/mm/plugin/webview/wepkg/model/b:<init>	()V
    //   33: putstatic 25	com/tencent/mm/plugin/webview/wepkg/model/b:rXU	Lcom/tencent/mm/plugin/webview/wepkg/model/b;
    //   36: ldc 2
    //   38: monitorexit
    //   39: getstatic 25	com/tencent/mm/plugin/webview/wepkg/model/b:rXU	Lcom/tencent/mm/plugin/webview/wepkg/model/b;
    //   42: astore_0
    //   43: ldc2_w 38
    //   46: ldc 40
    //   48: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: ldc 2
    //   53: monitorexit
    //   54: aload_0
    //   55: areturn
    //   56: astore_0
    //   57: ldc 2
    //   59: monitorexit
    //   60: aload_0
    //   61: athrow
    //   62: astore_0
    //   63: ldc 2
    //   65: monitorexit
    //   66: aload_0
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   42	13	0	localb	b
    //   56	5	0	localObject1	Object
    //   62	5	0	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   20	36	56	finally
    //   36	39	56	finally
    //   57	60	56	finally
    //   3	20	62	finally
    //   39	51	62	finally
    //   60	62	62	finally
  }
  
  /* Error */
  public final void bGn()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc2_w 43
    //   7: ldc 45
    //   9: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: invokestatic 51	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   15: ldc 53
    //   17: iconst_0
    //   18: invokevirtual 59	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   21: astore 4
    //   23: aload 4
    //   25: ldc 61
    //   27: lconst_0
    //   28: invokeinterface 67 4 0
    //   33: lstore_2
    //   34: invokestatic 73	java/lang/System:currentTimeMillis	()J
    //   37: lload_2
    //   38: lsub
    //   39: ldc2_w 74
    //   42: lcmp
    //   43: ifle +72 -> 115
    //   46: ldc 77
    //   48: ldc 79
    //   50: iconst_1
    //   51: anewarray 4	java/lang/Object
    //   54: dup
    //   55: iconst_0
    //   56: iload_1
    //   57: invokestatic 85	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   60: aastore
    //   61: invokestatic 90	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: iload_1
    //   65: ifeq +39 -> 104
    //   68: aload 4
    //   70: invokeinterface 94 1 0
    //   75: ldc 61
    //   77: invokestatic 73	java/lang/System:currentTimeMillis	()J
    //   80: invokeinterface 100 4 0
    //   85: invokeinterface 104 1 0
    //   90: pop
    //   91: new 6	com/tencent/mm/plugin/webview/wepkg/model/b$1
    //   94: dup
    //   95: aload_0
    //   96: invokespecial 107	com/tencent/mm/plugin/webview/wepkg/model/b$1:<init>	(Lcom/tencent/mm/plugin/webview/wepkg/model/b;)V
    //   99: ldc 109
    //   101: invokestatic 115	com/tencent/mm/sdk/f/e:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   104: ldc2_w 43
    //   107: ldc 45
    //   109: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   112: aload_0
    //   113: monitorexit
    //   114: return
    //   115: iconst_0
    //   116: istore_1
    //   117: goto -71 -> 46
    //   120: astore 4
    //   122: aload_0
    //   123: monitorexit
    //   124: aload 4
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	b
    //   1	116	1	bool	boolean
    //   33	5	2	l	long
    //   21	48	4	localSharedPreferences	android.content.SharedPreferences
    //   120	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	46	120	finally
    //   46	64	120	finally
    //   68	104	120	finally
    //   104	112	120	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
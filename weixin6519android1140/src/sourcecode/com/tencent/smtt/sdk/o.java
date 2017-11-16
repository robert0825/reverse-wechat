package com.tencent.smtt.sdk;

import android.text.TextUtils;
import com.tencent.smtt.export.external.DexLoader;
import java.util.Map;

final class o
{
  public boolean xVA = false;
  public boolean xVB = false;
  private Map<String, String> xVC = null;
  
  public final void a(String paramString, byte paramByte)
  {
    for (;;)
    {
      try
      {
        boolean bool = TextUtils.isEmpty(paramString);
        if (bool) {
          return;
        }
        str = "";
        if (paramByte == 1)
        {
          str = "_begin";
          this.xVC.put(paramString + str, String.valueOf(System.currentTimeMillis()));
          continue;
        }
        if (paramByte != 2) {
          continue;
        }
      }
      finally {}
      String str = "_end";
    }
  }
  
  public final boolean aR(int paramInt, String paramString)
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        Object localObject = ab.coW();
        if (((ab)localObject).coX())
        {
          if ((!this.xVB) || (!this.xVA))
          {
            long l = System.currentTimeMillis();
            if (l % 10L != 0L) {
              return bool;
            }
          }
          this.xVB = true;
          this.xVA = true;
          this.xVC.put("is_first_init_tbs", String.valueOf(this.xVB));
          this.xVC.put("is_first_init_x5", String.valueOf(this.xVA));
          this.xVC.put("x5_webview_id", Integer.toString(paramInt));
          this.xVC.put("current_url", paramString);
          if ((QbSdk.xUc != null) && (QbSdk.xUc.containsKey("app_scene_id"))) {
            this.xVC.put("app_scene_id", QbSdk.xUc.get("app_scene_id"));
          }
          paramString = ((ab)localObject).coY().xWV;
          localObject = Integer.TYPE;
          Map localMap = this.xVC;
          paramString.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "setTbsInitPerformanceData", new Class[] { localObject, Map.class }, new Object[] { Integer.valueOf(paramInt), localMap });
          continue;
        }
        bool = false;
      }
      finally {}
    }
  }
  
  /* Error */
  public final void ao(String paramString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 32	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: istore 4
    //   8: iload 4
    //   10: ifeq +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: aload_0
    //   17: getfield 20	com/tencent/smtt/sdk/o:xVC	Ljava/util/Map;
    //   20: aload_1
    //   21: lload_2
    //   22: invokestatic 59	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   25: invokeinterface 65 3 0
    //   30: pop
    //   31: goto -18 -> 13
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	o
    //   0	39	1	paramString	String
    //   0	39	2	paramLong	long
    //   6	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	8	34	finally
    //   16	31	34	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.e;

public final class a
  extends e
{
  private static final int CTRL_INDEX = 355;
  private static final String NAME = "onHCEMessage";
  private static final a iiW;
  
  static
  {
    GMTrace.i(20717580058624L, 154358);
    iiW = new a();
    GMTrace.o(20717580058624L, 154358);
  }
  
  public a()
  {
    GMTrace.i(20717311623168L, 154356);
    GMTrace.o(20717311623168L, 154356);
  }
  
  /* Error */
  static void a(String paramString, int paramInt, android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 40
    //   6: ldc 42
    //   8: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: ldc 44
    //   13: ldc 46
    //   15: iconst_2
    //   16: anewarray 48	java/lang/Object
    //   19: dup
    //   20: iconst_0
    //   21: aload_0
    //   22: aastore
    //   23: dup
    //   24: iconst_1
    //   25: iload_1
    //   26: invokestatic 54	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   29: aastore
    //   30: invokestatic 59	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   33: iload_1
    //   34: bipush 31
    //   36: if_icmpne +73 -> 109
    //   39: aload_2
    //   40: ifnull +134 -> 174
    //   43: aload_2
    //   44: ldc 61
    //   46: invokevirtual 67	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   49: astore_2
    //   50: new 69	java/util/HashMap
    //   53: dup
    //   54: invokespecial 70	java/util/HashMap:<init>	()V
    //   57: astore_3
    //   58: aload_3
    //   59: ldc 72
    //   61: iconst_1
    //   62: invokestatic 54	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   65: invokeinterface 78 3 0
    //   70: pop
    //   71: aload_3
    //   72: ldc 80
    //   74: aload_2
    //   75: invokeinterface 78 3 0
    //   80: pop
    //   81: getstatic 29	com/tencent/mm/plugin/appbrand/jsapi/nfc/a:iiW	Lcom/tencent/mm/plugin/appbrand/jsapi/nfc/a;
    //   84: aload_0
    //   85: iconst_0
    //   86: invokevirtual 84	com/tencent/mm/plugin/appbrand/jsapi/nfc/a:ai	(Ljava/lang/String;I)Lcom/tencent/mm/plugin/appbrand/jsapi/e;
    //   89: aload_3
    //   90: invokevirtual 88	com/tencent/mm/plugin/appbrand/jsapi/e:r	(Ljava/util/Map;)Lcom/tencent/mm/plugin/appbrand/jsapi/e;
    //   93: invokevirtual 92	com/tencent/mm/plugin/appbrand/jsapi/e:VR	()Z
    //   96: pop
    //   97: ldc2_w 40
    //   100: ldc 42
    //   102: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   105: ldc 2
    //   107: monitorexit
    //   108: return
    //   109: iload_1
    //   110: bipush 41
    //   112: if_icmpne +62 -> 174
    //   115: aload_2
    //   116: ifnull +58 -> 174
    //   119: new 69	java/util/HashMap
    //   122: dup
    //   123: invokespecial 70	java/util/HashMap:<init>	()V
    //   126: astore_3
    //   127: aload_3
    //   128: ldc 72
    //   130: iconst_2
    //   131: invokestatic 54	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   134: invokeinterface 78 3 0
    //   139: pop
    //   140: aload_3
    //   141: ldc 94
    //   143: aload_2
    //   144: ldc 96
    //   146: invokevirtual 100	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   149: invokestatic 54	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   152: invokeinterface 78 3 0
    //   157: pop
    //   158: getstatic 29	com/tencent/mm/plugin/appbrand/jsapi/nfc/a:iiW	Lcom/tencent/mm/plugin/appbrand/jsapi/nfc/a;
    //   161: aload_0
    //   162: iconst_0
    //   163: invokevirtual 84	com/tencent/mm/plugin/appbrand/jsapi/nfc/a:ai	(Ljava/lang/String;I)Lcom/tencent/mm/plugin/appbrand/jsapi/e;
    //   166: aload_3
    //   167: invokevirtual 88	com/tencent/mm/plugin/appbrand/jsapi/e:r	(Ljava/util/Map;)Lcom/tencent/mm/plugin/appbrand/jsapi/e;
    //   170: invokevirtual 92	com/tencent/mm/plugin/appbrand/jsapi/e:VR	()Z
    //   173: pop
    //   174: ldc2_w 40
    //   177: ldc 42
    //   179: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   182: goto -77 -> 105
    //   185: astore_0
    //   186: ldc 2
    //   188: monitorexit
    //   189: aload_0
    //   190: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	191	0	paramString	String
    //   0	191	1	paramInt	int
    //   0	191	2	paramBundle	android.os.Bundle
    //   57	110	3	localHashMap	java.util.HashMap
    // Exception table:
    //   from	to	target	type
    //   3	33	185	finally
    //   43	105	185	finally
    //   119	174	185	finally
    //   174	182	185	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\nfc\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
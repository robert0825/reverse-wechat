package com.tencent.mm.vending.h;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public class g
{
  private static Map<String, d> xyL;
  private static Map<Looper, d> xyM;
  private static boolean xyN;
  
  static
  {
    GMTrace.i(295413219328L, 2201);
    xyL = new ConcurrentHashMap();
    xyM = new HashMap();
    xyN = false;
    cks();
    GMTrace.o(295413219328L, 2201);
  }
  
  public g()
  {
    GMTrace.i(294607912960L, 2195);
    GMTrace.o(294607912960L, 2195);
  }
  
  public static void Xm(String paramString)
  {
    GMTrace.i(294876348416L, 2197);
    xyL.remove(paramString.toUpperCase());
    GMTrace.o(294876348416L, 2197);
  }
  
  public static d Xn(String paramString)
  {
    GMTrace.i(295010566144L, 2198);
    Assert.assertNotNull("Scheduler type is null", paramString);
    d locald = (d)xyL.get(paramString.toUpperCase());
    Assert.assertNotNull("Scheduler type not found: " + paramString.toUpperCase(), locald);
    GMTrace.o(295010566144L, 2198);
    return locald;
  }
  
  public static void a(String paramString, d paramd)
  {
    GMTrace.i(294742130688L, 2196);
    Assert.assertNotNull("Scheduler type is null", paramString);
    String str = paramString.toUpperCase();
    if (xyL.containsKey(str)) {
      new IllegalStateException("Fatal error! Duplicate scheduler type " + paramString.toUpperCase());
    }
    xyL.put(str, paramd);
    if ((paramd instanceof h)) {
      try
      {
        xyM.put(((h)paramd).mLooper, paramd);
        GMTrace.o(294742130688L, 2196);
        return;
      }
      finally {}
    }
    GMTrace.o(294742130688L, 2196);
  }
  
  /* Error */
  public static d ckr()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 117
    //   6: sipush 2199
    //   9: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: invokestatic 124	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   15: astore_2
    //   16: aload_2
    //   17: ifnonnull +42 -> 59
    //   20: ldc 126
    //   22: ldc -128
    //   24: iconst_1
    //   25: anewarray 4	java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: invokestatic 134	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   33: aastore
    //   34: invokestatic 140	com/tencent/mm/vending/f/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   37: new 142	com/tencent/mm/vending/h/c
    //   40: dup
    //   41: invokespecial 143	com/tencent/mm/vending/h/c:<init>	()V
    //   44: astore_0
    //   45: ldc2_w 117
    //   48: sipush 2199
    //   51: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   54: ldc 2
    //   56: monitorexit
    //   57: aload_0
    //   58: areturn
    //   59: getstatic 33	com/tencent/mm/vending/h/g:xyM	Ljava/util/Map;
    //   62: aload_2
    //   63: invokeinterface 76 2 0
    //   68: checkcast 78	com/tencent/mm/vending/h/d
    //   71: astore_1
    //   72: aload_1
    //   73: astore_0
    //   74: aload_1
    //   75: ifnonnull +27 -> 102
    //   78: new 110	com/tencent/mm/vending/h/h
    //   81: dup
    //   82: aload_2
    //   83: aload_2
    //   84: invokevirtual 144	android/os/Looper:toString	()Ljava/lang/String;
    //   87: invokespecial 147	com/tencent/mm/vending/h/h:<init>	(Landroid/os/Looper;Ljava/lang/String;)V
    //   90: astore_0
    //   91: getstatic 33	com/tencent/mm/vending/h/g:xyM	Ljava/util/Map;
    //   94: aload_2
    //   95: aload_0
    //   96: invokeinterface 108 3 0
    //   101: pop
    //   102: ldc2_w 117
    //   105: sipush 2199
    //   108: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   111: goto -57 -> 54
    //   114: astore_0
    //   115: ldc 2
    //   117: monitorexit
    //   118: aload_0
    //   119: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   44	52	0	localObject1	Object
    //   114	5	0	localObject2	Object
    //   71	4	1	locald	d
    //   15	80	2	localLooper	Looper
    // Exception table:
    //   from	to	target	type
    //   3	16	114	finally
    //   20	54	114	finally
    //   59	72	114	finally
    //   78	102	114	finally
    //   102	111	114	finally
  }
  
  /* Error */
  static void cks()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 148
    //   6: sipush 2200
    //   9: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: getstatic 35	com/tencent/mm/vending/h/g:xyN	Z
    //   15: ifeq +16 -> 31
    //   18: ldc2_w 148
    //   21: sipush 2200
    //   24: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   27: ldc 2
    //   29: monitorexit
    //   30: return
    //   31: ldc 126
    //   33: ldc -105
    //   35: iconst_0
    //   36: anewarray 4	java/lang/Object
    //   39: invokestatic 153	com/tencent/mm/vending/f/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: iconst_1
    //   43: putstatic 35	com/tencent/mm/vending/h/g:xyN	Z
    //   46: ldc -101
    //   48: getstatic 159	com/tencent/mm/vending/h/d:xyH	Lcom/tencent/mm/vending/h/h;
    //   51: invokestatic 161	com/tencent/mm/vending/h/g:a	(Ljava/lang/String;Lcom/tencent/mm/vending/h/d;)V
    //   54: ldc -93
    //   56: getstatic 166	com/tencent/mm/vending/h/d:xyI	Lcom/tencent/mm/vending/h/h;
    //   59: invokestatic 161	com/tencent/mm/vending/h/g:a	(Ljava/lang/String;Lcom/tencent/mm/vending/h/d;)V
    //   62: ldc -88
    //   64: getstatic 171	com/tencent/mm/vending/h/d:xyJ	Lcom/tencent/mm/vending/h/h;
    //   67: invokestatic 161	com/tencent/mm/vending/h/g:a	(Ljava/lang/String;Lcom/tencent/mm/vending/h/d;)V
    //   70: ldc2_w 148
    //   73: sipush 2200
    //   76: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   79: goto -52 -> 27
    //   82: astore_0
    //   83: ldc 2
    //   85: monitorexit
    //   86: aload_0
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   82	5	0	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	27	82	finally
    //   31	79	82	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\h\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
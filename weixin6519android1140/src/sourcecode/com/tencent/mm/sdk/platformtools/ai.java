package com.tencent.mm.sdk.platformtools;

import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.a.a;
import com.tencent.recovery.crash.DefaultExceptionHandler;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class ai
  implements Thread.UncaughtExceptionHandler
{
  private static ai viC;
  private d viD;
  private a viE;
  public a viF;
  public Map<String, b> viG;
  private Thread.UncaughtExceptionHandler viH;
  private boolean viI;
  private List<c> viJ;
  
  static
  {
    GMTrace.i(14004948828160L, 104345);
    viC = null;
    GMTrace.o(14004948828160L, 104345);
  }
  
  private ai()
  {
    GMTrace.i(14004411957248L, 104341);
    this.viD = null;
    this.viE = null;
    this.viF = null;
    this.viG = new HashMap();
    this.viH = null;
    this.viI = false;
    this.viJ = new LinkedList();
    this.viH = Thread.getDefaultUncaughtExceptionHandler();
    Thread.setDefaultUncaughtExceptionHandler(new DefaultExceptionHandler(this));
    GMTrace.o(14004411957248L, 104341);
  }
  
  private static String RW(String paramString)
  {
    GMTrace.i(14004546174976L, 104342);
    if (paramString == null)
    {
      GMTrace.o(14004546174976L, 104342);
      return null;
    }
    char[] arrayOfChar = paramString.toCharArray();
    if (arrayOfChar == null)
    {
      GMTrace.o(14004546174976L, 104342);
      return null;
    }
    int i = 0;
    if (i < arrayOfChar.length) {
      if (arrayOfChar[i] > '') {
        arrayOfChar[i] = '\000';
      }
    }
    for (int j = 1;; j = 0)
    {
      if (j != 0)
      {
        paramString = new String(arrayOfChar, 0, i);
        GMTrace.o(14004546174976L, 104342);
        return paramString;
        i += 1;
        break;
      }
      GMTrace.o(14004546174976L, 104342);
      return paramString;
    }
  }
  
  public static void a(a parama)
  {
    try
    {
      GMTrace.i(14003740868608L, 104336);
      if (viC == null) {
        viC = new ai();
      }
      viC.viE = parama;
      GMTrace.o(14003740868608L, 104336);
      return;
    }
    finally {}
  }
  
  public static void a(a parama)
  {
    try
    {
      GMTrace.i(14003875086336L, 104337);
      if (viC == null) {
        viC = new ai();
      }
      viC.viF = parama;
      GMTrace.o(14003875086336L, 104337);
      return;
    }
    finally {}
  }
  
  /* Error */
  public static void a(c paramc)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 120
    //   6: ldc 122
    //   8: invokestatic 49	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: ifnonnull +15 -> 27
    //   15: ldc2_w 120
    //   18: ldc 122
    //   20: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   23: ldc 2
    //   25: monitorexit
    //   26: return
    //   27: getstatic 51	com/tencent/mm/sdk/platformtools/ai:viC	Lcom/tencent/mm/sdk/platformtools/ai;
    //   30: ifnonnull +13 -> 43
    //   33: new 2	com/tencent/mm/sdk/platformtools/ai
    //   36: dup
    //   37: invokespecial 114	com/tencent/mm/sdk/platformtools/ai:<init>	()V
    //   40: putstatic 51	com/tencent/mm/sdk/platformtools/ai:viC	Lcom/tencent/mm/sdk/platformtools/ai;
    //   43: getstatic 51	com/tencent/mm/sdk/platformtools/ai:viC	Lcom/tencent/mm/sdk/platformtools/ai;
    //   46: getfield 81	com/tencent/mm/sdk/platformtools/ai:viJ	Ljava/util/List;
    //   49: aload_0
    //   50: invokeinterface 128 2 0
    //   55: pop
    //   56: ldc2_w 120
    //   59: ldc 122
    //   61: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   64: goto -41 -> 23
    //   67: astore_0
    //   68: ldc 2
    //   70: monitorexit
    //   71: aload_0
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	paramc	c
    // Exception table:
    //   from	to	target	type
    //   3	11	67	finally
    //   15	23	67	finally
    //   27	43	67	finally
    //   43	64	67	finally
  }
  
  public static void a(d paramd)
  {
    try
    {
      GMTrace.i(14003606650880L, 104335);
      if (viC == null) {
        viC = new ai();
      }
      viC.viD = paramd;
      GMTrace.o(14003606650880L, 104335);
      return;
    }
    finally {}
  }
  
  public static void a(String paramString, b paramb)
  {
    try
    {
      GMTrace.i(14004009304064L, 104338);
      if (viC == null) {
        viC = new ai();
      }
      viC.viG.put(paramString, paramb);
      GMTrace.o(14004009304064L, 104338);
      return;
    }
    finally {}
  }
  
  /* Error */
  public static String g(Throwable paramThrowable)
  {
    // Byte code:
    //   0: ldc2_w 147
    //   3: ldc -107
    //   5: invokestatic 49	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 151	java/io/ByteArrayOutputStream
    //   11: dup
    //   12: invokespecial 152	java/io/ByteArrayOutputStream:<init>	()V
    //   15: astore_1
    //   16: new 154	java/io/PrintStream
    //   19: dup
    //   20: aload_1
    //   21: invokespecial 157	java/io/PrintStream:<init>	(Ljava/io/OutputStream;)V
    //   24: astore_2
    //   25: aload_0
    //   26: invokevirtual 163	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   29: ifnull +11 -> 40
    //   32: aload_0
    //   33: invokevirtual 163	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   36: astore_0
    //   37: goto -12 -> 25
    //   40: aload_0
    //   41: aload_2
    //   42: invokevirtual 167	java/lang/Throwable:printStackTrace	(Ljava/io/PrintStream;)V
    //   45: aload_1
    //   46: invokevirtual 171	java/io/ByteArrayOutputStream:toString	()Ljava/lang/String;
    //   49: invokestatic 173	com/tencent/mm/sdk/platformtools/ai:RW	(Ljava/lang/String;)Ljava/lang/String;
    //   52: astore_0
    //   53: aload_1
    //   54: invokevirtual 176	java/io/ByteArrayOutputStream:close	()V
    //   57: ldc2_w 147
    //   60: ldc -107
    //   62: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   65: aload_0
    //   66: areturn
    //   67: astore_0
    //   68: aload_1
    //   69: invokevirtual 176	java/io/ByteArrayOutputStream:close	()V
    //   72: aload_0
    //   73: athrow
    //   74: astore_1
    //   75: goto -18 -> 57
    //   78: astore_1
    //   79: goto -7 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	paramThrowable	Throwable
    //   15	54	1	localByteArrayOutputStream	ByteArrayOutputStream
    //   74	1	1	localIOException1	java.io.IOException
    //   78	1	1	localIOException2	java.io.IOException
    //   24	18	2	localPrintStream	PrintStream
    // Exception table:
    //   from	to	target	type
    //   25	37	67	finally
    //   40	53	67	finally
    //   53	57	74	java/io/IOException
    //   68	72	78	java/io/IOException
  }
  
  public static void s(String paramString1, String paramString2, boolean paramBoolean)
  {
    try
    {
      GMTrace.i(14004143521792L, 104339);
      a(paramString1, new b()
      {
        public final String Cz()
        {
          GMTrace.i(13994479845376L, 104267);
          String str = "subinfo=" + this.viK;
          GMTrace.o(13994479845376L, 104267);
          return str;
        }
      });
      Assert.assertTrue(paramString1, paramBoolean);
      GMTrace.o(14004143521792L, 104339);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    GMTrace.i(14004814610432L, 104344);
    if (this.viI)
    {
      GMTrace.o(14004814610432L, 104344);
      return;
    }
    this.viI = true;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      Object localObject = new PrintStream(localByteArrayOutputStream);
      for (paramThread = paramThrowable; paramThread.getCause() != null; paramThread = paramThread.getCause()) {}
      paramThread.printStackTrace((PrintStream)localObject);
      paramThread = RW(localByteArrayOutputStream.toString());
      if ((this.viE != null) && (paramThread != null)) {
        this.viE.eL(paramThread);
      }
      if ((this.viD != null) && (paramThread != null))
      {
        this.viD.a(this, paramThread, paramThrowable);
        this.viF.pf();
      }
      localObject = this.viJ.iterator();
      while (((Iterator)localObject).hasNext())
      {
        c localc = (c)((Iterator)localObject).next();
        if (localc != null) {
          try
          {
            localc.a(paramThread, paramThrowable);
          }
          catch (Exception localException) {}
        }
      }
      localByteArrayOutputStream.close();
      w.appenderClose();
    }
    catch (Exception paramThread)
    {
      for (;;) {}
    }
    Process.killProcess(Process.myPid());
    System.exit(0);
    GMTrace.o(14004814610432L, 104344);
  }
  
  public static abstract interface a
  {
    public abstract void pf();
  }
  
  public static abstract interface b
  {
    public abstract String Cz();
  }
  
  public static abstract interface c
  {
    public abstract void a(String paramString, Throwable paramThrowable);
  }
  
  public static abstract interface d
  {
    public abstract void a(ai paramai, String paramString, Throwable paramThrowable);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
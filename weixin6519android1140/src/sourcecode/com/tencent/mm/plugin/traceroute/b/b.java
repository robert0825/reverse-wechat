package com.tencent.mm.plugin.traceroute.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  public static List<Object> A(String[] paramArrayOfString)
  {
    GMTrace.i(9986067398656L, 74402);
    String str = " ";
    int i = 0;
    while (i < 4)
    {
      localObject = paramArrayOfString[i];
      str = str + (String)localObject + " ";
      i += 1;
    }
    w.i("MicroMsg.MMTraceRoute", str);
    Object localObject = new ArrayList();
    paramArrayOfString = new a(paramArrayOfString, (List)localObject);
    e.a(paramArrayOfString, "MMTraceRouteCMDExecutor_watcher");
    try
    {
      e.P(paramArrayOfString);
      w.i("MicroMsg.MMTraceRoute", "watcher thread stopped" + str);
      GMTrace.o(9986067398656L, 74402);
      return (List<Object>)localObject;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        e.L(paramArrayOfString);
        w.i("MicroMsg.MMTraceRoute", "interrupt thread" + str);
      }
    }
  }
  
  public static String JH(String paramString)
  {
    GMTrace.i(9985798963200L, 74400);
    w.i("MicroMsg.MMTraceRoute", "output string: " + paramString);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(9985798963200L, 74400);
      return null;
    }
    int i = paramString.indexOf("time=");
    if (i < 0)
    {
      GMTrace.o(9985798963200L, 74400);
      return null;
    }
    i += 5;
    int j = paramString.indexOf(" ", i);
    if (j < 0)
    {
      GMTrace.o(9985798963200L, 74400);
      return null;
    }
    paramString = paramString.substring(i, j);
    GMTrace.o(9985798963200L, 74400);
    return paramString;
  }
  
  public static int JI(String paramString)
  {
    GMTrace.i(9985933180928L, 74401);
    int i = paramString.indexOf("ttl=");
    if (i < 0)
    {
      GMTrace.o(9985933180928L, 74401);
      return -1;
    }
    i += 4;
    int j = paramString.indexOf(" ", i);
    if (j < 0)
    {
      GMTrace.o(9985933180928L, 74401);
      return -1;
    }
    i = bg.getInt(paramString.substring(i, j), 0);
    GMTrace.o(9985933180928L, 74401);
    return i;
  }
  
  public static void a(Process paramProcess, InputStream paramInputStream)
  {
    GMTrace.i(16052306051072L, 119599);
    if (paramProcess != null) {}
    try
    {
      paramProcess.destroy();
      if (paramInputStream != null) {
        paramInputStream.close();
      }
      GMTrace.o(16052306051072L, 119599);
      return;
    }
    catch (IOException paramProcess)
    {
      w.e("MicroMsg.MMTraceRoute", "close stream failed: " + paramProcess.getMessage());
      GMTrace.o(16052306051072L, 119599);
    }
  }
  
  private static final class a
    implements Runnable
  {
    private List<Object> lzI;
    private String[] qAr;
    
    public a(String[] paramArrayOfString, List<Object> paramList)
    {
      GMTrace.i(9987006922752L, 74409);
      this.qAr = paramArrayOfString;
      this.lzI = paramList;
      GMTrace.o(9987006922752L, 74409);
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: ldc2_w 46
      //   3: ldc 48
      //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: new 50	java/lang/StringBuilder
      //   11: dup
      //   12: invokespecial 51	java/lang/StringBuilder:<init>	()V
      //   15: astore 11
      //   17: new 53	java/lang/ProcessBuilder
      //   20: dup
      //   21: aload_0
      //   22: getfield 30	com/tencent/mm/plugin/traceroute/b/b$a:qAr	[Ljava/lang/String;
      //   25: invokespecial 56	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
      //   28: astore 7
      //   30: aload 7
      //   32: iconst_1
      //   33: invokevirtual 60	java/lang/ProcessBuilder:redirectErrorStream	(Z)Ljava/lang/ProcessBuilder;
      //   36: pop
      //   37: invokestatic 66	com/tencent/mm/sdk/platformtools/bg:Pv	()J
      //   40: lstore 5
      //   42: invokestatic 66	com/tencent/mm/sdk/platformtools/bg:Pv	()J
      //   45: lstore_1
      //   46: aload 7
      //   48: invokevirtual 70	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
      //   51: astore 7
      //   53: aload 7
      //   55: invokevirtual 76	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
      //   58: invokevirtual 81	java/io/OutputStream:close	()V
      //   61: aload 7
      //   63: invokevirtual 85	java/lang/Process:getInputStream	()Ljava/io/InputStream;
      //   66: astore 8
      //   68: invokestatic 66	com/tencent/mm/sdk/platformtools/bg:Pv	()J
      //   71: lstore_3
      //   72: lload_3
      //   73: lstore_1
      //   74: new 87	java/io/InputStreamReader
      //   77: dup
      //   78: aload 8
      //   80: invokespecial 90	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
      //   83: astore 9
      //   85: new 92	java/io/BufferedReader
      //   88: dup
      //   89: aload 9
      //   91: sipush 8096
      //   94: invokespecial 95	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
      //   97: astore 10
      //   99: aload 10
      //   101: invokevirtual 99	java/io/BufferedReader:readLine	()Ljava/lang/String;
      //   104: astore 12
      //   106: aload 12
      //   108: ifnull +121 -> 229
      //   111: aload 11
      //   113: aload 12
      //   115: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   118: pop
      //   119: goto -20 -> 99
      //   122: astore 9
      //   124: aload 7
      //   126: aload 8
      //   128: invokestatic 106	com/tencent/mm/plugin/traceroute/b/b:a	(Ljava/lang/Process;Ljava/io/InputStream;)V
      //   131: ldc 108
      //   133: new 50	java/lang/StringBuilder
      //   136: dup
      //   137: ldc 110
      //   139: invokespecial 113	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   142: aload 9
      //   144: invokevirtual 116	java/io/IOException:getMessage	()Ljava/lang/String;
      //   147: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   150: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   153: invokestatic 125	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   156: aload 7
      //   158: aload 8
      //   160: invokestatic 106	com/tencent/mm/plugin/traceroute/b/b:a	(Ljava/lang/Process;Ljava/io/InputStream;)V
      //   163: aload_0
      //   164: getfield 32	com/tencent/mm/plugin/traceroute/b/b$a:lzI	Ljava/util/List;
      //   167: aload 11
      //   169: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   172: invokeinterface 131 2 0
      //   177: pop
      //   178: aload_0
      //   179: getfield 32	com/tencent/mm/plugin/traceroute/b/b$a:lzI	Ljava/util/List;
      //   182: lload_1
      //   183: lload 5
      //   185: lsub
      //   186: invokestatic 137	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   189: invokeinterface 131 2 0
      //   194: pop
      //   195: ldc 108
      //   197: new 50	java/lang/StringBuilder
      //   200: dup
      //   201: ldc -117
      //   203: invokespecial 113	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   206: aload 11
      //   208: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   211: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   214: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   217: invokestatic 141	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   220: ldc2_w 46
      //   223: ldc 48
      //   225: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   228: return
      //   229: aload 7
      //   231: invokevirtual 145	java/lang/Process:waitFor	()I
      //   234: pop
      //   235: aload 10
      //   237: invokevirtual 146	java/io/BufferedReader:close	()V
      //   240: aload 9
      //   242: invokevirtual 147	java/io/InputStreamReader:close	()V
      //   245: goto -89 -> 156
      //   248: astore 9
      //   250: aload 7
      //   252: aload 8
      //   254: invokestatic 106	com/tencent/mm/plugin/traceroute/b/b:a	(Ljava/lang/Process;Ljava/io/InputStream;)V
      //   257: ldc 108
      //   259: new 50	java/lang/StringBuilder
      //   262: dup
      //   263: ldc -107
      //   265: invokespecial 113	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   268: aload 9
      //   270: invokevirtual 150	java/lang/InterruptedException:getMessage	()Ljava/lang/String;
      //   273: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   276: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   279: invokestatic 125	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   282: goto -126 -> 156
      //   285: astore 7
      //   287: aconst_null
      //   288: astore 9
      //   290: aconst_null
      //   291: astore 8
      //   293: aload 9
      //   295: aload 8
      //   297: invokestatic 106	com/tencent/mm/plugin/traceroute/b/b:a	(Ljava/lang/Process;Ljava/io/InputStream;)V
      //   300: ldc 108
      //   302: new 50	java/lang/StringBuilder
      //   305: dup
      //   306: ldc -104
      //   308: invokespecial 113	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   311: aload 7
      //   313: invokevirtual 153	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   316: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   319: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   322: invokestatic 125	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   325: aload 9
      //   327: astore 7
      //   329: goto -173 -> 156
      //   332: astore 10
      //   334: aconst_null
      //   335: astore 8
      //   337: aload 7
      //   339: astore 9
      //   341: aload 10
      //   343: astore 7
      //   345: goto -52 -> 293
      //   348: astore 10
      //   350: aload 7
      //   352: astore 9
      //   354: aload 10
      //   356: astore 7
      //   358: goto -65 -> 293
      //   361: astore 10
      //   363: aload 7
      //   365: astore 9
      //   367: aload 10
      //   369: astore 7
      //   371: goto -78 -> 293
      //   374: astore 9
      //   376: aconst_null
      //   377: astore 7
      //   379: aconst_null
      //   380: astore 8
      //   382: goto -132 -> 250
      //   385: astore 9
      //   387: aconst_null
      //   388: astore 8
      //   390: goto -140 -> 250
      //   393: astore 9
      //   395: goto -145 -> 250
      //   398: astore 9
      //   400: aconst_null
      //   401: astore 7
      //   403: aconst_null
      //   404: astore 8
      //   406: goto -282 -> 124
      //   409: astore 9
      //   411: aconst_null
      //   412: astore 8
      //   414: goto -290 -> 124
      //   417: astore 9
      //   419: goto -295 -> 124
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	422	0	this	a
      //   45	138	1	l1	long
      //   71	2	3	l2	long
      //   40	144	5	l3	long
      //   28	223	7	localObject1	Object
      //   285	27	7	localException1	Exception
      //   327	75	7	localObject2	Object
      //   66	347	8	localInputStream	InputStream
      //   83	7	9	localInputStreamReader	java.io.InputStreamReader
      //   122	119	9	localIOException1	IOException
      //   248	21	9	localInterruptedException1	InterruptedException
      //   288	78	9	localObject3	Object
      //   374	1	9	localInterruptedException2	InterruptedException
      //   385	1	9	localInterruptedException3	InterruptedException
      //   393	1	9	localInterruptedException4	InterruptedException
      //   398	1	9	localIOException2	IOException
      //   409	1	9	localIOException3	IOException
      //   417	1	9	localIOException4	IOException
      //   97	139	10	localBufferedReader	java.io.BufferedReader
      //   332	10	10	localException2	Exception
      //   348	7	10	localException3	Exception
      //   361	7	10	localException4	Exception
      //   15	192	11	localStringBuilder	StringBuilder
      //   104	10	12	str	String
      // Exception table:
      //   from	to	target	type
      //   74	99	122	java/io/IOException
      //   99	106	122	java/io/IOException
      //   111	119	122	java/io/IOException
      //   229	245	122	java/io/IOException
      //   74	99	248	java/lang/InterruptedException
      //   99	106	248	java/lang/InterruptedException
      //   111	119	248	java/lang/InterruptedException
      //   229	245	248	java/lang/InterruptedException
      //   46	53	285	java/lang/Exception
      //   53	68	332	java/lang/Exception
      //   68	72	348	java/lang/Exception
      //   74	99	361	java/lang/Exception
      //   99	106	361	java/lang/Exception
      //   111	119	361	java/lang/Exception
      //   229	245	361	java/lang/Exception
      //   46	53	374	java/lang/InterruptedException
      //   53	68	385	java/lang/InterruptedException
      //   68	72	393	java/lang/InterruptedException
      //   46	53	398	java/io/IOException
      //   53	68	409	java/io/IOException
      //   68	72	417	java/io/IOException
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\traceroute\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
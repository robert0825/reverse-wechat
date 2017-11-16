package com.tencent.mm.plugin.appbrand.performance;

import android.annotation.SuppressLint;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressLint({"DefaultLocale"})
public final class a
{
  private static List<a> ixa;
  public static long sAppStartTime;
  
  static
  {
    GMTrace.i(17321871540224L, 129058);
    ixa = Collections.synchronizedList(new LinkedList());
    GMTrace.o(17321871540224L, 129058);
  }
  
  public static void a(String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    GMTrace.i(17321334669312L, 129054);
    a(paramString1, "Native", paramString2, paramLong1, paramLong2, null);
    GMTrace.o(17321334669312L, 129054);
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, double paramDouble)
  {
    GMTrace.i(17321603104768L, 129056);
    long l = System.currentTimeMillis();
    a(paramString1, paramString2, paramString3, "C", l, l, String.format("{ \"%s\": %f }", new Object[] { paramString3, Double.valueOf(paramDouble) }));
    GMTrace.o(17321603104768L, 129056);
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, String paramString4)
  {
    GMTrace.i(17321468887040L, 129055);
    a(paramString1, paramString2, paramString3, "X", paramLong1, paramLong2, paramString4);
    GMTrace.o(17321468887040L, 129055);
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5)
  {
    GMTrace.i(17321737322496L, 129057);
    if (!AppBrandPerformanceManager.rZ(paramString1))
    {
      GMTrace.o(17321737322496L, 129057);
      return;
    }
    a locala = new a();
    locala.appId = paramString1;
    locala.name = paramString3;
    locala.category = paramString2;
    locala.ixb = paramString4;
    locala.start = paramLong1;
    locala.ixc = paramLong2;
    if (paramString5 != null) {}
    for (paramString1 = p.encode(paramString5);; paramString1 = "")
    {
      locala.ixd = paramString1;
      if (ixa.size() < 10000) {
        ixa.add(locala);
      }
      GMTrace.o(17321737322496L, 129057);
      return;
    }
  }
  
  public static void aN(long paramLong)
  {
    GMTrace.i(17321200451584L, 129053);
    sAppStartTime = paramLong;
    GMTrace.o(17321200451584L, 129053);
  }
  
  /* Error */
  private static final boolean bh(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc2_w 148
    //   5: ldc -106
    //   7: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: invokestatic 156	com/tencent/mm/compatible/util/f:ty	()Z
    //   13: ifne +20 -> 33
    //   16: ldc -98
    //   18: ldc -96
    //   20: invokestatic 166	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: ldc2_w 148
    //   26: ldc -106
    //   28: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   31: iconst_0
    //   32: ireturn
    //   33: aconst_null
    //   34: astore 5
    //   36: aconst_null
    //   37: astore 4
    //   39: aload 5
    //   41: astore_3
    //   42: new 168	java/io/File
    //   45: dup
    //   46: new 170	java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial 171	java/lang/StringBuilder:<init>	()V
    //   53: invokestatic 177	com/tencent/mm/compatible/util/h:getExternalStorageDirectory	()Ljava/io/File;
    //   56: invokevirtual 181	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   59: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: ldc -69
    //   64: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokespecial 193	java/io/File:<init>	(Ljava/lang/String;)V
    //   73: astore 6
    //   75: aload 5
    //   77: astore_3
    //   78: aload 6
    //   80: invokevirtual 196	java/io/File:exists	()Z
    //   83: ifne +12 -> 95
    //   86: aload 5
    //   88: astore_3
    //   89: aload 6
    //   91: invokevirtual 199	java/io/File:mkdirs	()Z
    //   94: pop
    //   95: aload 5
    //   97: astore_3
    //   98: new 201	java/io/FileWriter
    //   101: dup
    //   102: new 168	java/io/File
    //   105: dup
    //   106: aload 6
    //   108: ldc -53
    //   110: iconst_2
    //   111: anewarray 4	java/lang/Object
    //   114: dup
    //   115: iconst_0
    //   116: aload_0
    //   117: aastore
    //   118: dup
    //   119: iconst_1
    //   120: getstatic 143	com/tencent/mm/plugin/appbrand/performance/a:sAppStartTime	J
    //   123: invokestatic 208	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   126: aastore
    //   127: invokestatic 78	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   130: invokespecial 211	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   133: iconst_1
    //   134: invokespecial 214	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
    //   137: astore_0
    //   138: aload_0
    //   139: aload_1
    //   140: invokevirtual 217	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   143: aload_0
    //   144: invokevirtual 220	java/io/FileWriter:close	()V
    //   147: ldc2_w 148
    //   150: ldc -106
    //   152: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   155: iload_2
    //   156: ireturn
    //   157: astore_1
    //   158: aload 4
    //   160: astore_0
    //   161: aload_0
    //   162: astore_3
    //   163: ldc -98
    //   165: new 170	java/lang/StringBuilder
    //   168: dup
    //   169: ldc -34
    //   171: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   174: aload_1
    //   175: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   178: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   181: invokestatic 166	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   184: aload_0
    //   185: ifnull +49 -> 234
    //   188: aload_0
    //   189: invokevirtual 220	java/io/FileWriter:close	()V
    //   192: iconst_0
    //   193: istore_2
    //   194: goto -47 -> 147
    //   197: astore_0
    //   198: iconst_0
    //   199: istore_2
    //   200: goto -53 -> 147
    //   203: astore_0
    //   204: aload_3
    //   205: ifnull +7 -> 212
    //   208: aload_3
    //   209: invokevirtual 220	java/io/FileWriter:close	()V
    //   212: aload_0
    //   213: athrow
    //   214: astore_0
    //   215: goto -68 -> 147
    //   218: astore_1
    //   219: goto -7 -> 212
    //   222: astore_1
    //   223: aload_0
    //   224: astore_3
    //   225: aload_1
    //   226: astore_0
    //   227: goto -23 -> 204
    //   230: astore_1
    //   231: goto -70 -> 161
    //   234: iconst_0
    //   235: istore_2
    //   236: goto -89 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	paramString1	String
    //   0	239	1	paramString2	String
    //   1	235	2	bool	boolean
    //   41	184	3	localObject1	Object
    //   37	122	4	localObject2	Object
    //   34	62	5	localObject3	Object
    //   73	34	6	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   42	75	157	java/lang/Exception
    //   78	86	157	java/lang/Exception
    //   89	95	157	java/lang/Exception
    //   98	138	157	java/lang/Exception
    //   188	192	197	java/lang/Exception
    //   42	75	203	finally
    //   78	86	203	finally
    //   89	95	203	finally
    //   98	138	203	finally
    //   163	184	203	finally
    //   143	147	214	java/lang/Exception
    //   208	212	218	java/lang/Exception
    //   138	143	222	finally
    //   138	143	230	java/lang/Exception
  }
  
  public static final boolean sc(String paramString)
  {
    GMTrace.i(17664260964352L, 131609);
    if (!AppBrandPerformanceManager.rZ(paramString))
    {
      GMTrace.o(17664260964352L, 131609);
      return false;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    synchronized (ixa)
    {
      w.d("MicroMsg.AppBrandPerformanceTracer", "dumpTrace events size: %d", new Object[] { Integer.valueOf(ixa.size()) });
      Iterator localIterator = ixa.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if ((locala.appId.equals(paramString)) && (locala.start >= sAppStartTime)) {
          localStringBuffer.append(locala.toString()).append("\n");
        }
      }
    }
    ixa.clear();
    boolean bool = bh(paramString, localStringBuffer.toString());
    GMTrace.o(17664260964352L, 131609);
    return bool;
  }
  
  public static final class a
  {
    public String appId;
    public String category;
    public String ixb;
    public long ixc;
    public String ixd;
    public String name;
    public long start;
    
    public a()
    {
      GMTrace.i(17320932016128L, 129051);
      GMTrace.o(17320932016128L, 129051);
    }
    
    public final String toString()
    {
      GMTrace.i(17321066233856L, 129052);
      String str = this.name + "," + this.category + "," + this.ixb + "," + (this.start - a.sAppStartTime) + "," + (this.ixc - a.sAppStartTime) + "," + this.ixd;
      GMTrace.o(17321066233856L, 129052);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\performance\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class a
{
  private static final String gro;
  private static ConcurrentMap<String, Boolean> ifp;
  public static Map<String, List<a>> ifq;
  
  static
  {
    GMTrace.i(20722009243648L, 154391);
    ifp = new ConcurrentHashMap();
    ifq = new HashMap();
    String str2 = com.tencent.mm.compatible.util.e.ghz;
    String str1 = str2;
    if (!str2.endsWith("/")) {
      str1 = str2 + "/";
    }
    str1 = str1 + "wxacache/";
    gro = str1;
    h.Nj(str1);
    GMTrace.o(20722009243648L, 154391);
  }
  
  public static void a(String paramString1, final String paramString2, final a parama)
  {
    GMTrace.i(20721338155008L, 154386);
    if (bg.nm(paramString1))
    {
      GMTrace.o(20721338155008L, 154386);
      return;
    }
    final String str = null;
    if (!bg.nm(paramString1)) {
      str = g.n(paramString1.getBytes());
    }
    str = String.format("%s%s", new Object[] { gro, str });
    w.i("MicroMsg.AppBrandLiveFileDownloadHelper", "downloadToLocal url:%s localPath:%s", new Object[] { paramString1, str });
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20727914823680L, 154435);
        if (!a.ifq.containsKey(this.val$url)) {
          a.ifq.put(this.val$url, new ArrayList());
        }
        ((List)a.ifq.get(this.val$url)).add(parama);
        GMTrace.o(20727914823680L, 154435);
      }
    });
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20728585912320L, 154440);
        a.y(this.val$url, paramString2, str);
        GMTrace.o(20728585912320L, 154440);
      }
    }, "AppBrandSimpleImageLoaderDownloadThread");
    GMTrace.o(20721338155008L, 154386);
  }
  
  private static void ba(String paramString1, final String paramString2)
  {
    GMTrace.i(20721606590464L, 154388);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20721203937280L, 154385);
        a.bb(this.val$url, paramString2);
        GMTrace.o(20721203937280L, 154385);
      }
    });
    GMTrace.o(20721606590464L, 154388);
  }
  
  public static void bb(String paramString1, String paramString2)
  {
    GMTrace.i(20721740808192L, 154389);
    w.i("MicroMsg.AppBrandLiveFileDownloadHelper", "doCallback url:%s localPath:%s", new Object[] { paramString1, paramString2 });
    List localList = (List)ifq.get(paramString1);
    if ((localList == null) || (localList.size() == 0))
    {
      w.i("MicroMsg.AppBrandLiveFileDownloadHelper", "doCallback callbacks nil");
      GMTrace.o(20721740808192L, 154389);
      return;
    }
    int i = 0;
    while (i < localList.size())
    {
      ((a)localList.get(i)).qu(paramString2);
      i += 1;
    }
    ifq.remove(paramString1);
    GMTrace.o(20721740808192L, 154389);
  }
  
  private static boolean bc(String paramString1, String paramString2)
  {
    GMTrace.i(20721875025920L, 154390);
    if (bg.nm(paramString1))
    {
      w.i("MicroMsg.AppBrandLiveFileDownloadHelper", "isMd5Valid target nil, no check");
      GMTrace.o(20721875025920L, 154390);
      return true;
    }
    paramString2 = g.bg(paramString2);
    w.i("MicroMsg.AppBrandLiveFileDownloadHelper", "isMd5Valid file:%s target:%s", new Object[] { paramString2, paramString1 });
    boolean bool = paramString1.equals(paramString2);
    GMTrace.o(20721875025920L, 154390);
    return bool;
  }
  
  /* Error */
  public static void y(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: ldc2_w 195
    //   3: ldc -59
    //   5: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 199	java/io/File
    //   11: dup
    //   12: aload_2
    //   13: invokespecial 201	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: astore 9
    //   18: aload 9
    //   20: invokevirtual 205	java/io/File:exists	()Z
    //   23: ifeq +62 -> 85
    //   26: ldc 108
    //   28: ldc -49
    //   30: iconst_1
    //   31: anewarray 4	java/lang/Object
    //   34: dup
    //   35: iconst_0
    //   36: aload_0
    //   37: aastore
    //   38: invokestatic 115	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: aload_1
    //   42: aload_2
    //   43: invokestatic 209	com/tencent/mm/plugin/appbrand/jsapi/live/a:bc	(Ljava/lang/String;Ljava/lang/String;)Z
    //   46: ifeq +17 -> 63
    //   49: aload_0
    //   50: aload_2
    //   51: invokestatic 211	com/tencent/mm/plugin/appbrand/jsapi/live/a:ba	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: ldc2_w 195
    //   57: ldc -59
    //   59: invokestatic 80	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   62: return
    //   63: ldc 108
    //   65: ldc -43
    //   67: iconst_1
    //   68: anewarray 4	java/lang/Object
    //   71: dup
    //   72: iconst_0
    //   73: aload 9
    //   75: invokevirtual 216	java/io/File:delete	()Z
    //   78: invokestatic 222	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   81: aastore
    //   82: invokestatic 115	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: getstatic 39	com/tencent/mm/plugin/appbrand/jsapi/live/a:ifp	Ljava/util/concurrent/ConcurrentMap;
    //   88: aload_0
    //   89: invokeinterface 227 2 0
    //   94: ifeq +27 -> 121
    //   97: ldc 108
    //   99: ldc -27
    //   101: iconst_1
    //   102: anewarray 4	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: aload_0
    //   108: aastore
    //   109: invokestatic 115	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   112: ldc2_w 195
    //   115: ldc -59
    //   117: invokestatic 80	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   120: return
    //   121: getstatic 39	com/tencent/mm/plugin/appbrand/jsapi/live/a:ifp	Ljava/util/concurrent/ConcurrentMap;
    //   124: aload_0
    //   125: iconst_1
    //   126: invokestatic 222	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   129: invokeinterface 233 3 0
    //   134: pop
    //   135: new 235	java/net/URL
    //   138: dup
    //   139: aload_0
    //   140: invokespecial 236	java/net/URL:<init>	(Ljava/lang/String;)V
    //   143: invokevirtual 240	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   146: checkcast 242	java/net/HttpURLConnection
    //   149: astore 4
    //   151: new 244	java/io/FileOutputStream
    //   154: dup
    //   155: aload 9
    //   157: invokespecial 247	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   160: astore 5
    //   162: new 249	java/io/BufferedInputStream
    //   165: dup
    //   166: aload 4
    //   168: invokevirtual 253	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   171: invokespecial 256	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   174: astore 4
    //   176: aload 5
    //   178: astore 7
    //   180: aload 4
    //   182: astore 6
    //   184: sipush 16384
    //   187: newarray <illegal type>
    //   189: astore 8
    //   191: aload 5
    //   193: astore 7
    //   195: aload 4
    //   197: astore 6
    //   199: aload 4
    //   201: aload 8
    //   203: iconst_0
    //   204: sipush 16384
    //   207: invokevirtual 262	java/io/InputStream:read	([BII)I
    //   210: istore_3
    //   211: iload_3
    //   212: iconst_m1
    //   213: if_icmpeq +115 -> 328
    //   216: aload 5
    //   218: astore 7
    //   220: aload 4
    //   222: astore 6
    //   224: aload 5
    //   226: aload 8
    //   228: iconst_0
    //   229: iload_3
    //   230: invokevirtual 268	java/io/OutputStream:write	([BII)V
    //   233: goto -42 -> 191
    //   236: astore 8
    //   238: aload 5
    //   240: astore 7
    //   242: aload 4
    //   244: astore 6
    //   246: aload 9
    //   248: invokevirtual 216	java/io/File:delete	()Z
    //   251: pop
    //   252: aload 5
    //   254: astore 7
    //   256: aload 4
    //   258: astore 6
    //   260: ldc 108
    //   262: aload 8
    //   264: ldc_w 270
    //   267: iconst_1
    //   268: anewarray 4	java/lang/Object
    //   271: dup
    //   272: iconst_0
    //   273: aload_0
    //   274: aastore
    //   275: invokestatic 274	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   278: aload 5
    //   280: invokestatic 278	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   283: aload 4
    //   285: invokestatic 278	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   288: ldc 108
    //   290: ldc_w 280
    //   293: invokestatic 164	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   296: getstatic 39	com/tencent/mm/plugin/appbrand/jsapi/live/a:ifp	Ljava/util/concurrent/ConcurrentMap;
    //   299: aload_0
    //   300: invokeinterface 281 2 0
    //   305: pop
    //   306: aload_1
    //   307: aload_2
    //   308: invokestatic 209	com/tencent/mm/plugin/appbrand/jsapi/live/a:bc	(Ljava/lang/String;Ljava/lang/String;)Z
    //   311: ifeq +62 -> 373
    //   314: aload_0
    //   315: aload_2
    //   316: invokestatic 211	com/tencent/mm/plugin/appbrand/jsapi/live/a:ba	(Ljava/lang/String;Ljava/lang/String;)V
    //   319: ldc2_w 195
    //   322: ldc -59
    //   324: invokestatic 80	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   327: return
    //   328: aload 5
    //   330: astore 7
    //   332: aload 4
    //   334: astore 6
    //   336: aload 5
    //   338: invokevirtual 284	java/io/OutputStream:flush	()V
    //   341: aload 5
    //   343: invokestatic 278	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   346: aload 4
    //   348: invokestatic 278	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   351: goto -63 -> 288
    //   354: astore_0
    //   355: aconst_null
    //   356: astore 5
    //   358: aconst_null
    //   359: astore 6
    //   361: aload 5
    //   363: invokestatic 278	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   366: aload 6
    //   368: invokestatic 278	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   371: aload_0
    //   372: athrow
    //   373: ldc 108
    //   375: ldc_w 286
    //   378: invokestatic 289	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   381: aload_0
    //   382: aconst_null
    //   383: invokestatic 211	com/tencent/mm/plugin/appbrand/jsapi/live/a:ba	(Ljava/lang/String;Ljava/lang/String;)V
    //   386: ldc2_w 195
    //   389: ldc -59
    //   391: invokestatic 80	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   394: return
    //   395: astore_0
    //   396: aconst_null
    //   397: astore 6
    //   399: goto -38 -> 361
    //   402: astore_0
    //   403: aload 7
    //   405: astore 5
    //   407: goto -46 -> 361
    //   410: astore 8
    //   412: aconst_null
    //   413: astore 5
    //   415: aconst_null
    //   416: astore 4
    //   418: goto -180 -> 238
    //   421: astore 8
    //   423: aconst_null
    //   424: astore 4
    //   426: goto -188 -> 238
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	429	0	paramString1	String
    //   0	429	1	paramString2	String
    //   0	429	2	paramString3	String
    //   210	20	3	i	int
    //   149	276	4	localObject1	Object
    //   160	254	5	localObject2	Object
    //   182	216	6	localObject3	Object
    //   178	226	7	localObject4	Object
    //   189	38	8	arrayOfByte	byte[]
    //   236	27	8	localException1	Exception
    //   410	1	8	localException2	Exception
    //   421	1	8	localException3	Exception
    //   16	231	9	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   184	191	236	java/lang/Exception
    //   199	211	236	java/lang/Exception
    //   224	233	236	java/lang/Exception
    //   336	341	236	java/lang/Exception
    //   135	162	354	finally
    //   162	176	395	finally
    //   184	191	402	finally
    //   199	211	402	finally
    //   224	233	402	finally
    //   246	252	402	finally
    //   260	278	402	finally
    //   336	341	402	finally
    //   135	162	410	java/lang/Exception
    //   162	176	421	java/lang/Exception
  }
  
  public static abstract interface a
  {
    public abstract void qu(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
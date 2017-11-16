package com.tencent.mm.plugin.report.service;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.StatFs;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.regex.Pattern;

public final class f
{
  private static SparseArray<Long> oqZ;
  private static SparseArray<HashMap<Integer, Integer>> ora;
  private static boolean orb;
  private static long orc;
  private static long ord;
  private static long ore;
  
  static
  {
    GMTrace.i(13121796177920L, 97765);
    oqZ = new SparseArray();
    ora = new SparseArray();
    orb = true;
    orc = 0L;
    ord = 0L;
    ore = 0L;
    GMTrace.o(13121796177920L, 97765);
  }
  
  private static void D(int paramInt, long paramLong)
  {
    GMTrace.i(13121393524736L, 97762);
    if (paramLong <= 0L)
    {
      GMTrace.o(13121393524736L, 97762);
      return;
    }
    if (paramLong < 1000L)
    {
      g.ork.M(paramInt, 0, 1);
      GMTrace.o(13121393524736L, 97762);
      return;
    }
    if (paramLong < 2000L)
    {
      g.ork.M(paramInt, 0, 3);
      GMTrace.o(13121393524736L, 97762);
      return;
    }
    if (paramLong < 5000L)
    {
      g.ork.M(paramInt, 0, 5);
      GMTrace.o(13121393524736L, 97762);
      return;
    }
    if (paramLong < 10000L)
    {
      g.ork.M(paramInt, 0, 7);
      GMTrace.o(13121393524736L, 97762);
      return;
    }
    g.ork.M(paramInt, 0, 9);
    GMTrace.o(13121393524736L, 97762);
  }
  
  private static void E(int paramInt, long paramLong)
  {
    GMTrace.i(13121527742464L, 97763);
    long l;
    if (paramInt == 6)
    {
      l = System.currentTimeMillis();
      if (l < orc + 60000L)
      {
        GMTrace.o(13121527742464L, 97763);
        return;
      }
      orc = l;
    }
    for (;;)
    {
      a locala = a.bbZ();
      if (!locala.hasInit) {
        break;
      }
      g.ork.a(11335, true, false, new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong), Integer.valueOf(locala.org), Long.valueOf(locala.orf[0]), Long.valueOf(locala.orf[1]), Long.valueOf(locala.ori) });
      GMTrace.o(13121527742464L, 97763);
      return;
      if (paramInt == 7)
      {
        l = System.currentTimeMillis();
        if (l < ord + 60000L)
        {
          GMTrace.o(13121527742464L, 97763);
          return;
        }
        ord = l;
      }
      else if (paramInt == 8)
      {
        l = System.currentTimeMillis();
        if (l < ore + 60000L)
        {
          GMTrace.o(13121527742464L, 97763);
          return;
        }
        ore = l;
      }
    }
    g.ork.a(11335, true, false, new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    GMTrace.o(13121527742464L, 97763);
  }
  
  public static void dh(long paramLong)
  {
    GMTrace.i(13121125089280L, 97760);
    if (!orb)
    {
      GMTrace.o(13121125089280L, 97760);
      return;
    }
    w.d("MicroMsg.ReportLogInfo", "ReportLogInfo operationBegin eventID:%d  with time:%d", new Object[] { Integer.valueOf(8), Long.valueOf(paramLong) });
    oqZ.put(8, Long.valueOf(paramLong));
    GMTrace.o(13121125089280L, 97760);
  }
  
  public static void tp(int paramInt)
  {
    GMTrace.i(13120990871552L, 97759);
    if (!orb)
    {
      GMTrace.o(13120990871552L, 97759);
      return;
    }
    oqZ.put(paramInt, Long.valueOf(bg.Pv()));
    w.d("MicroMsg.ReportLogInfo", "ReportLogInfo operationBegin eventID:%d  time:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(bg.Pv()) });
    GMTrace.o(13120990871552L, 97759);
  }
  
  public static void tq(int paramInt)
  {
    GMTrace.i(13121259307008L, 97761);
    if (!orb)
    {
      GMTrace.o(13121259307008L, 97761);
      return;
    }
    Long localLong = (Long)oqZ.get(paramInt);
    if (localLong == null)
    {
      GMTrace.o(13121259307008L, 97761);
      return;
    }
    if (localLong.longValue() == -1L)
    {
      GMTrace.o(13121259307008L, 97761);
      return;
    }
    oqZ.put(paramInt, Long.valueOf(-1L));
    long l = bg.Pv() - localLong.longValue();
    if (l <= 0L)
    {
      GMTrace.o(13121259307008L, 97761);
      return;
    }
    switch (paramInt)
    {
    }
    for (;;)
    {
      w.i("MicroMsg.ReportLogInfo", "ReportLogInfo operationEnd eventID:%d  time:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(l) });
      GMTrace.o(13121259307008L, 97761);
      return;
      if (ab.vin)
      {
        g.ork.c(23, 4, 5, (int)l, false);
      }
      else
      {
        E(1, l);
        D(227, l);
        g.ork.c(23, 1, 2, (int)l, false);
        continue;
        E(3, l);
        D(229, l);
        g.ork.c(27, 1, 2, (int)l, false);
        continue;
        E(2, l);
        D(228, l);
        g.ork.c(28, 1, 2, (int)l, false);
        continue;
        E(6, l);
        continue;
        E(7, l);
        continue;
        E(8, l);
        continue;
        E(10, l);
        continue;
        E(14, l);
        continue;
        E(15, l);
        continue;
        E(9, l);
        continue;
        E(11, l);
        continue;
        E(16, l);
        continue;
        E(13, l);
        continue;
        E(12, l);
      }
    }
  }
  
  public static void tr(int paramInt)
  {
    GMTrace.i(13121661960192L, 97764);
    if (!orb)
    {
      GMTrace.o(13121661960192L, 97764);
      return;
    }
    w.d("MicroMsg.ReportLogInfo", "ReportLogInfo stopOperation stop eventID:%d", new Object[] { Integer.valueOf(paramInt) });
    oqZ.put(paramInt, Long.valueOf(-1L));
    GMTrace.o(13121661960192L, 97764);
  }
  
  public static final class a
  {
    public static a orj;
    public volatile boolean hasInit;
    public long[] orf;
    public int org;
    public String orh;
    public long ori;
    
    public a()
    {
      GMTrace.i(13117769646080L, 97735);
      GMTrace.o(13117769646080L, 97735);
    }
    
    public static a bbZ()
    {
      try
      {
        GMTrace.i(13117903863808L, 97736);
        if (orj == null)
        {
          locala = new a();
          orj = locala;
          locala.org = sT();
          orj.orh = sN();
          locala = orj;
          Object localObject2 = (ActivityManager)ab.getContext().getSystemService("activity");
          ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
          ((ActivityManager)localObject2).getMemoryInfo(localMemoryInfo);
          locala.ori = (localMemoryInfo.availMem >> 10);
          locala = orj;
          localObject2 = new StatFs(h.getDataDirectory().getPath());
          long l1 = ((StatFs)localObject2).getBlockSize();
          long l2 = ((StatFs)localObject2).getBlockCount();
          localObject2 = new StatFs(h.getDataDirectory().getPath());
          long l3 = ((StatFs)localObject2).getBlockSize();
          locala.orf = new long[] { l2 * l1, ((StatFs)localObject2).getAvailableBlocks() * l3 };
          orj.hasInit = true;
        }
        a locala = orj;
        GMTrace.o(13117903863808L, 97736);
        return locala;
      }
      finally {}
    }
    
    /* Error */
    private static String sN()
    {
      // Byte code:
      //   0: ldc2_w 120
      //   3: ldc 122
      //   5: invokestatic 34	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: new 124	java/io/FileReader
      //   11: dup
      //   12: ldc 126
      //   14: invokespecial 127	java/io/FileReader:<init>	(Ljava/lang/String;)V
      //   17: astore_1
      //   18: new 129	java/io/BufferedReader
      //   21: dup
      //   22: aload_1
      //   23: invokespecial 132	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
      //   26: astore 4
      //   28: aload 4
      //   30: astore_3
      //   31: aload_1
      //   32: astore_2
      //   33: aload 4
      //   35: invokevirtual 135	java/io/BufferedReader:readLine	()Ljava/lang/String;
      //   38: invokevirtual 140	java/lang/String:trim	()Ljava/lang/String;
      //   41: astore_0
      //   42: aload 4
      //   44: astore_3
      //   45: aload_1
      //   46: astore_2
      //   47: aload 4
      //   49: invokevirtual 143	java/io/BufferedReader:close	()V
      //   52: aload_1
      //   53: invokevirtual 144	java/io/FileReader:close	()V
      //   56: aload 4
      //   58: invokevirtual 143	java/io/BufferedReader:close	()V
      //   61: aload_0
      //   62: astore_1
      //   63: ldc2_w 120
      //   66: ldc 122
      //   68: invokestatic 37	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   71: aload_1
      //   72: areturn
      //   73: astore_1
      //   74: ldc -110
      //   76: aload_1
      //   77: ldc -108
      //   79: iconst_0
      //   80: anewarray 4	java/lang/Object
      //   83: invokestatic 154	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   86: goto -30 -> 56
      //   89: astore_1
      //   90: ldc -110
      //   92: aload_1
      //   93: ldc -108
      //   95: iconst_0
      //   96: anewarray 4	java/lang/Object
      //   99: invokestatic 154	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   102: aload_0
      //   103: astore_1
      //   104: goto -41 -> 63
      //   107: astore 5
      //   109: aconst_null
      //   110: astore 4
      //   112: aconst_null
      //   113: astore_1
      //   114: ldc -100
      //   116: astore_0
      //   117: aload 4
      //   119: astore_3
      //   120: aload_1
      //   121: astore_2
      //   122: ldc -110
      //   124: aload 5
      //   126: ldc -108
      //   128: iconst_0
      //   129: anewarray 4	java/lang/Object
      //   132: invokestatic 154	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   135: aload_1
      //   136: ifnull +7 -> 143
      //   139: aload_1
      //   140: invokevirtual 144	java/io/FileReader:close	()V
      //   143: aload_0
      //   144: astore_1
      //   145: aload 4
      //   147: ifnull -84 -> 63
      //   150: aload 4
      //   152: invokevirtual 143	java/io/BufferedReader:close	()V
      //   155: aload_0
      //   156: astore_1
      //   157: goto -94 -> 63
      //   160: astore_1
      //   161: ldc -110
      //   163: aload_1
      //   164: ldc -108
      //   166: iconst_0
      //   167: anewarray 4	java/lang/Object
      //   170: invokestatic 154	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   173: aload_0
      //   174: astore_1
      //   175: goto -112 -> 63
      //   178: astore_1
      //   179: ldc -110
      //   181: aload_1
      //   182: ldc -108
      //   184: iconst_0
      //   185: anewarray 4	java/lang/Object
      //   188: invokestatic 154	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   191: goto -48 -> 143
      //   194: astore 5
      //   196: aconst_null
      //   197: astore 4
      //   199: aconst_null
      //   200: astore_1
      //   201: ldc -100
      //   203: astore_0
      //   204: aload 4
      //   206: astore_3
      //   207: aload_1
      //   208: astore_2
      //   209: ldc -110
      //   211: aload 5
      //   213: ldc -108
      //   215: iconst_0
      //   216: anewarray 4	java/lang/Object
      //   219: invokestatic 154	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   222: aload_1
      //   223: ifnull +7 -> 230
      //   226: aload_1
      //   227: invokevirtual 144	java/io/FileReader:close	()V
      //   230: aload_0
      //   231: astore_1
      //   232: aload 4
      //   234: ifnull -171 -> 63
      //   237: aload 4
      //   239: invokevirtual 143	java/io/BufferedReader:close	()V
      //   242: aload_0
      //   243: astore_1
      //   244: goto -181 -> 63
      //   247: astore_1
      //   248: ldc -110
      //   250: aload_1
      //   251: ldc -108
      //   253: iconst_0
      //   254: anewarray 4	java/lang/Object
      //   257: invokestatic 154	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   260: aload_0
      //   261: astore_1
      //   262: goto -199 -> 63
      //   265: astore_1
      //   266: ldc -110
      //   268: aload_1
      //   269: ldc -108
      //   271: iconst_0
      //   272: anewarray 4	java/lang/Object
      //   275: invokestatic 154	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   278: goto -48 -> 230
      //   281: astore_0
      //   282: aconst_null
      //   283: astore_3
      //   284: aconst_null
      //   285: astore_1
      //   286: aload_1
      //   287: ifnull +7 -> 294
      //   290: aload_1
      //   291: invokevirtual 144	java/io/FileReader:close	()V
      //   294: aload_3
      //   295: ifnull +7 -> 302
      //   298: aload_3
      //   299: invokevirtual 143	java/io/BufferedReader:close	()V
      //   302: aload_0
      //   303: athrow
      //   304: astore_1
      //   305: ldc -110
      //   307: aload_1
      //   308: ldc -108
      //   310: iconst_0
      //   311: anewarray 4	java/lang/Object
      //   314: invokestatic 154	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   317: goto -23 -> 294
      //   320: astore_1
      //   321: ldc -110
      //   323: aload_1
      //   324: ldc -108
      //   326: iconst_0
      //   327: anewarray 4	java/lang/Object
      //   330: invokestatic 154	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   333: goto -31 -> 302
      //   336: astore_0
      //   337: aconst_null
      //   338: astore_3
      //   339: goto -53 -> 286
      //   342: astore_0
      //   343: aload_2
      //   344: astore_1
      //   345: goto -59 -> 286
      //   348: astore 5
      //   350: aconst_null
      //   351: astore 4
      //   353: ldc -100
      //   355: astore_0
      //   356: goto -152 -> 204
      //   359: astore 5
      //   361: ldc -100
      //   363: astore_0
      //   364: goto -160 -> 204
      //   367: astore 5
      //   369: goto -165 -> 204
      //   372: astore 5
      //   374: aconst_null
      //   375: astore 4
      //   377: ldc -100
      //   379: astore_0
      //   380: goto -263 -> 117
      //   383: astore 5
      //   385: ldc -100
      //   387: astore_0
      //   388: goto -271 -> 117
      //   391: astore 5
      //   393: goto -276 -> 117
      // Local variable table:
      //   start	length	slot	name	signature
      //   41	220	0	str1	String
      //   281	22	0	localObject1	Object
      //   336	1	0	localObject2	Object
      //   342	1	0	localObject3	Object
      //   355	33	0	str2	String
      //   17	55	1	localObject4	Object
      //   73	4	1	localIOException1	java.io.IOException
      //   89	4	1	localIOException2	java.io.IOException
      //   103	54	1	localObject5	Object
      //   160	4	1	localIOException3	java.io.IOException
      //   174	1	1	localObject6	Object
      //   178	4	1	localIOException4	java.io.IOException
      //   200	44	1	localObject7	Object
      //   247	4	1	localIOException5	java.io.IOException
      //   261	1	1	localObject8	Object
      //   265	4	1	localIOException6	java.io.IOException
      //   285	6	1	localObject9	Object
      //   304	4	1	localIOException7	java.io.IOException
      //   320	4	1	localIOException8	java.io.IOException
      //   344	1	1	localObject10	Object
      //   32	312	2	localObject11	Object
      //   30	309	3	localBufferedReader1	java.io.BufferedReader
      //   26	350	4	localBufferedReader2	java.io.BufferedReader
      //   107	18	5	localFileNotFoundException1	java.io.FileNotFoundException
      //   194	18	5	localIOException9	java.io.IOException
      //   348	1	5	localIOException10	java.io.IOException
      //   359	1	5	localIOException11	java.io.IOException
      //   367	1	5	localIOException12	java.io.IOException
      //   372	1	5	localFileNotFoundException2	java.io.FileNotFoundException
      //   383	1	5	localFileNotFoundException3	java.io.FileNotFoundException
      //   391	1	5	localFileNotFoundException4	java.io.FileNotFoundException
      // Exception table:
      //   from	to	target	type
      //   52	56	73	java/io/IOException
      //   56	61	89	java/io/IOException
      //   8	18	107	java/io/FileNotFoundException
      //   150	155	160	java/io/IOException
      //   139	143	178	java/io/IOException
      //   8	18	194	java/io/IOException
      //   237	242	247	java/io/IOException
      //   226	230	265	java/io/IOException
      //   8	18	281	finally
      //   290	294	304	java/io/IOException
      //   298	302	320	java/io/IOException
      //   18	28	336	finally
      //   33	42	342	finally
      //   47	52	342	finally
      //   122	135	342	finally
      //   209	222	342	finally
      //   18	28	348	java/io/IOException
      //   33	42	359	java/io/IOException
      //   47	52	367	java/io/IOException
      //   18	28	372	java/io/FileNotFoundException
      //   33	42	383	java/io/FileNotFoundException
      //   47	52	391	java/io/FileNotFoundException
    }
    
    private static int sT()
    {
      GMTrace.i(13118172299264L, 97738);
      try
      {
        int i = new File("/sys/devices/system/cpu/").listFiles(new a()).length;
        GMTrace.o(13118172299264L, 97738);
        return i;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.ReportLogInfo", localException, "", new Object[0]);
        GMTrace.o(13118172299264L, 97738);
      }
      return 1;
    }
    
    final class a
      implements FileFilter
    {
      a()
      {
        GMTrace.i(13108911276032L, 97669);
        GMTrace.o(13108911276032L, 97669);
      }
      
      public final boolean accept(File paramFile)
      {
        GMTrace.i(13109045493760L, 97670);
        if (Pattern.matches("cpu[0-9]", paramFile.getName()))
        {
          GMTrace.o(13109045493760L, 97670);
          return true;
        }
        GMTrace.o(13109045493760L, 97670);
        return false;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\service\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
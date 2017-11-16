package com.tencent.mm.lib.riskscanner;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

final class a
{
  private static ThreadLocal<Long> gcd;
  
  static
  {
    GMTrace.i(17534338203648L, 130641);
    gcd = new ThreadLocal();
    GMTrace.o(17534338203648L, 130641);
  }
  
  /* Error */
  public static void c(Throwable paramThrowable)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc2_w 34
    //   7: ldc 36
    //   9: invokestatic 18	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: ldc 38
    //   14: ldc 40
    //   16: iconst_1
    //   17: anewarray 4	java/lang/Object
    //   20: dup
    //   21: iconst_0
    //   22: aload_0
    //   23: invokevirtual 44	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   26: aastore
    //   27: invokestatic 49	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: getstatic 25	com/tencent/mm/lib/riskscanner/a:gcd	Ljava/lang/ThreadLocal;
    //   33: invokevirtual 52	java/lang/ThreadLocal:remove	()V
    //   36: getstatic 58	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
    //   39: ldc2_w 59
    //   42: ldc2_w 61
    //   45: lconst_1
    //   46: iconst_1
    //   47: invokevirtual 66	com/tencent/mm/plugin/report/d:a	(JJJZ)V
    //   50: new 68	java/io/StringWriter
    //   53: dup
    //   54: invokespecial 69	java/io/StringWriter:<init>	()V
    //   57: astore_1
    //   58: new 71	java/io/PrintWriter
    //   61: dup
    //   62: aload_1
    //   63: invokespecial 74	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   66: astore_2
    //   67: aload_0
    //   68: aload_2
    //   69: invokevirtual 78	java/lang/Throwable:printStackTrace	(Ljava/io/PrintWriter;)V
    //   72: aload_2
    //   73: invokevirtual 81	java/io/PrintWriter:flush	()V
    //   76: aload_1
    //   77: invokevirtual 84	java/io/StringWriter:toString	()Ljava/lang/String;
    //   80: ldc 86
    //   82: ldc 88
    //   84: invokevirtual 94	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   87: astore_0
    //   88: getstatic 58	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
    //   91: sipush 14177
    //   94: new 96	java/lang/StringBuilder
    //   97: dup
    //   98: ldc 98
    //   100: invokespecial 101	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   103: aload_0
    //   104: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: iconst_0
    //   111: iconst_1
    //   112: invokevirtual 109	com/tencent/mm/plugin/report/d:a	(ILjava/lang/String;ZZ)V
    //   115: aload_1
    //   116: invokevirtual 112	java/io/StringWriter:close	()V
    //   119: aload_2
    //   120: invokevirtual 113	java/io/PrintWriter:close	()V
    //   123: ldc2_w 34
    //   126: ldc 36
    //   128: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   131: return
    //   132: astore_0
    //   133: ldc2_w 34
    //   136: ldc 36
    //   138: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   141: return
    //   142: astore_0
    //   143: aconst_null
    //   144: astore_0
    //   145: aload_2
    //   146: astore_1
    //   147: aload_1
    //   148: ifnull +7 -> 155
    //   151: aload_1
    //   152: invokevirtual 112	java/io/StringWriter:close	()V
    //   155: aload_0
    //   156: ifnull +49 -> 205
    //   159: aload_0
    //   160: invokevirtual 113	java/io/PrintWriter:close	()V
    //   163: ldc2_w 34
    //   166: ldc 36
    //   168: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   171: return
    //   172: astore_0
    //   173: ldc2_w 34
    //   176: ldc 36
    //   178: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   181: return
    //   182: astore_0
    //   183: aconst_null
    //   184: astore_1
    //   185: aload_3
    //   186: astore_2
    //   187: aload_1
    //   188: ifnull +7 -> 195
    //   191: aload_1
    //   192: invokevirtual 112	java/io/StringWriter:close	()V
    //   195: aload_2
    //   196: ifnull +7 -> 203
    //   199: aload_2
    //   200: invokevirtual 113	java/io/PrintWriter:close	()V
    //   203: aload_0
    //   204: athrow
    //   205: ldc2_w 34
    //   208: ldc 36
    //   210: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   213: return
    //   214: astore_0
    //   215: goto -96 -> 119
    //   218: astore_1
    //   219: goto -64 -> 155
    //   222: astore_1
    //   223: goto -28 -> 195
    //   226: astore_1
    //   227: goto -24 -> 203
    //   230: astore_0
    //   231: aload_3
    //   232: astore_2
    //   233: goto -46 -> 187
    //   236: astore_0
    //   237: goto -50 -> 187
    //   240: astore_0
    //   241: aconst_null
    //   242: astore_0
    //   243: goto -96 -> 147
    //   246: astore_0
    //   247: aload_2
    //   248: astore_0
    //   249: goto -102 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	paramThrowable	Throwable
    //   57	135	1	localObject1	Object
    //   218	1	1	localThrowable1	Throwable
    //   222	1	1	localThrowable2	Throwable
    //   226	1	1	localThrowable3	Throwable
    //   3	245	2	localObject2	Object
    //   1	231	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   119	123	132	java/lang/Throwable
    //   50	58	142	java/lang/Throwable
    //   159	163	172	java/lang/Throwable
    //   50	58	182	finally
    //   115	119	214	java/lang/Throwable
    //   151	155	218	java/lang/Throwable
    //   191	195	222	java/lang/Throwable
    //   199	203	226	java/lang/Throwable
    //   58	67	230	finally
    //   67	115	236	finally
    //   58	67	240	java/lang/Throwable
    //   67	115	246	java/lang/Throwable
  }
  
  public static void fm(int paramInt)
  {
    GMTrace.i(17534203985920L, 130640);
    w.i("MicroMsg.RiskScannerReportService", "Report scan result, %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      d.oqe.a(590L, 3L, 1L, true);
      GMTrace.o(17534203985920L, 130640);
      return;
    case 0: 
      Long localLong = (Long)gcd.get();
      if (localLong != null)
      {
        long l = bg.Pw() - localLong.longValue();
        w.i("MicroMsg.RiskScannerReportService", "Scan cost: %d ms", new Object[] { Long.valueOf(l) });
        d.oqe.c(590, 5, 1, (int)l, true);
        GMTrace.o(17534203985920L, 130640);
        return;
      }
      d.oqe.a(590L, 1L, 1L, true);
      GMTrace.o(17534203985920L, 130640);
      return;
    }
    d.oqe.a(590L, 2L, 1L, true);
    GMTrace.o(17534203985920L, 130640);
  }
  
  public static void ya()
  {
    GMTrace.i(17533935550464L, 130638);
    w.i("MicroMsg.RiskScannerReportService", "Report scan triggering.");
    d.oqe.a(590L, 0L, 1L, true);
    gcd.set(Long.valueOf(bg.Pw()));
    GMTrace.o(17533935550464L, 130638);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\lib\riskscanner\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
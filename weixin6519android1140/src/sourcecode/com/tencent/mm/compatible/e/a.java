package com.tencent.mm.compatible.e;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class a
{
  public static Boolean fRE;
  
  /* Error */
  public static void a(String paramString, List<b> paramList, List<a> paramList1)
  {
    // Byte code:
    //   0: ldc2_w 18
    //   3: ldc 20
    //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 32	com/tencent/mm/a/e:aZ	(Ljava/lang/String;)Z
    //   12: ifne +19 -> 31
    //   15: ldc 34
    //   17: ldc 36
    //   19: invokestatic 41	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: ldc2_w 18
    //   25: ldc 20
    //   27: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: return
    //   31: invokestatic 50	com/tencent/mm/sdk/platformtools/v:bPK	()Ljava/lang/String;
    //   34: astore_3
    //   35: aload_3
    //   36: ldc 52
    //   38: invokevirtual 58	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   41: ifeq +130 -> 171
    //   44: ldc 52
    //   46: astore_3
    //   47: aconst_null
    //   48: astore 4
    //   50: new 60	java/io/BufferedReader
    //   53: dup
    //   54: new 62	java/io/FileReader
    //   57: dup
    //   58: aload_0
    //   59: invokespecial 66	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   62: invokespecial 69	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   65: astore_0
    //   66: aload_0
    //   67: astore 4
    //   69: aload_0
    //   70: invokevirtual 72	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   73: astore 5
    //   75: aload 5
    //   77: ifnull +695 -> 772
    //   80: aload_0
    //   81: astore 4
    //   83: aload 5
    //   85: invokevirtual 75	java/lang/String:trim	()Ljava/lang/String;
    //   88: astore 6
    //   90: aload_0
    //   91: astore 4
    //   93: aload 6
    //   95: invokevirtual 79	java/lang/String:length	()I
    //   98: ifeq -32 -> 66
    //   101: aload_0
    //   102: astore 4
    //   104: aload 6
    //   106: ldc 81
    //   108: invokestatic 87	com/tencent/mm/sdk/platformtools/bh:q	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   111: astore 5
    //   113: aload 5
    //   115: ifnonnull +122 -> 237
    //   118: aload_0
    //   119: astore 4
    //   121: ldc 34
    //   123: new 89	java/lang/StringBuilder
    //   126: dup
    //   127: ldc 91
    //   129: invokespecial 92	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   132: aload 6
    //   134: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: invokestatic 102	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   143: goto -77 -> 66
    //   146: astore_1
    //   147: ldc 34
    //   149: ldc 104
    //   151: invokestatic 102	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   154: aload_0
    //   155: ifnull +641 -> 796
    //   158: aload_0
    //   159: invokevirtual 108	java/io/BufferedReader:close	()V
    //   162: ldc2_w 18
    //   165: ldc 20
    //   167: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   170: return
    //   171: aload_3
    //   172: ldc 110
    //   174: invokevirtual 58	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   177: ifne +12 -> 189
    //   180: aload_3
    //   181: ldc 112
    //   183: invokevirtual 58	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   186: ifeq +27 -> 213
    //   189: new 89	java/lang/StringBuilder
    //   192: dup
    //   193: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   196: ldc 116
    //   198: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: ldc 110
    //   203: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: astore_3
    //   210: goto -163 -> 47
    //   213: new 89	java/lang/StringBuilder
    //   216: dup
    //   217: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   220: ldc 116
    //   222: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: ldc 118
    //   227: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   233: astore_3
    //   234: goto -187 -> 47
    //   237: aload_0
    //   238: astore 4
    //   240: aload 5
    //   242: ldc 120
    //   244: invokeinterface 126 2 0
    //   249: checkcast 54	java/lang/String
    //   252: astore 7
    //   254: aload 7
    //   256: ifnonnull +59 -> 315
    //   259: aload_0
    //   260: astore 4
    //   262: ldc 34
    //   264: new 89	java/lang/StringBuilder
    //   267: dup
    //   268: ldc -128
    //   270: invokespecial 92	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   273: aload 6
    //   275: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   281: invokestatic 102	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   284: goto -218 -> 66
    //   287: astore_1
    //   288: aload_0
    //   289: astore 4
    //   291: ldc 34
    //   293: ldc -126
    //   295: invokestatic 102	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   298: aload_0
    //   299: ifnull +516 -> 815
    //   302: aload_0
    //   303: invokevirtual 108	java/io/BufferedReader:close	()V
    //   306: ldc2_w 18
    //   309: ldc 20
    //   311: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   314: return
    //   315: aload_0
    //   316: astore 4
    //   318: aload 7
    //   320: ldc -124
    //   322: invokevirtual 58	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   325: ifeq +222 -> 547
    //   328: aload_0
    //   329: astore 4
    //   331: new 9	com/tencent/mm/compatible/e/a$b
    //   334: dup
    //   335: invokespecial 133	com/tencent/mm/compatible/e/a$b:<init>	()V
    //   338: astore 6
    //   340: aload_0
    //   341: astore 4
    //   343: aload 6
    //   345: new 135	android/util/SparseArray
    //   348: dup
    //   349: invokespecial 136	android/util/SparseArray:<init>	()V
    //   352: putfield 140	com/tencent/mm/compatible/e/a$b:fRI	Landroid/util/SparseArray;
    //   355: aload_0
    //   356: astore 4
    //   358: aload 6
    //   360: aload 5
    //   362: ldc -114
    //   364: invokeinterface 126 2 0
    //   369: checkcast 54	java/lang/String
    //   372: putfield 146	com/tencent/mm/compatible/e/a$b:fRJ	Ljava/lang/String;
    //   375: aload_0
    //   376: astore 4
    //   378: aload 6
    //   380: aload 5
    //   382: ldc -108
    //   384: invokeinterface 126 2 0
    //   389: checkcast 54	java/lang/String
    //   392: putfield 151	com/tencent/mm/compatible/e/a$b:model	Ljava/lang/String;
    //   395: aload_0
    //   396: astore 4
    //   398: aload 6
    //   400: aload 5
    //   402: ldc -103
    //   404: invokeinterface 126 2 0
    //   409: checkcast 54	java/lang/String
    //   412: putfield 156	com/tencent/mm/compatible/e/a$b:version	Ljava/lang/String;
    //   415: aload_0
    //   416: astore 4
    //   418: aload 6
    //   420: getfield 140	com/tencent/mm/compatible/e/a$b:fRI	Landroid/util/SparseArray;
    //   423: iconst_1
    //   424: aload 5
    //   426: new 89	java/lang/StringBuilder
    //   429: dup
    //   430: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   433: ldc -98
    //   435: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   438: aload_3
    //   439: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   442: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   445: invokeinterface 126 2 0
    //   450: invokevirtual 161	android/util/SparseArray:append	(ILjava/lang/Object;)V
    //   453: aload_0
    //   454: astore 4
    //   456: aload 6
    //   458: getfield 140	com/tencent/mm/compatible/e/a$b:fRI	Landroid/util/SparseArray;
    //   461: iconst_2
    //   462: aload 5
    //   464: new 89	java/lang/StringBuilder
    //   467: dup
    //   468: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   471: ldc -98
    //   473: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   476: ldc -93
    //   478: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   481: aload_3
    //   482: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   485: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   488: invokeinterface 126 2 0
    //   493: invokevirtual 161	android/util/SparseArray:append	(ILjava/lang/Object;)V
    //   496: aload_0
    //   497: astore 4
    //   499: aload 6
    //   501: aload 5
    //   503: ldc -91
    //   505: invokeinterface 126 2 0
    //   510: checkcast 54	java/lang/String
    //   513: invokestatic 171	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   516: putfield 175	com/tencent/mm/compatible/e/a$b:fRH	I
    //   519: aload_0
    //   520: astore 4
    //   522: aload_1
    //   523: aload 6
    //   525: invokeinterface 180 2 0
    //   530: pop
    //   531: goto -465 -> 66
    //   534: astore_0
    //   535: aload 4
    //   537: ifnull +8 -> 545
    //   540: aload 4
    //   542: invokevirtual 108	java/io/BufferedReader:close	()V
    //   545: aload_0
    //   546: athrow
    //   547: aload_0
    //   548: astore 4
    //   550: aload 7
    //   552: ldc -74
    //   554: invokevirtual 58	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   557: ifeq -491 -> 66
    //   560: aload_0
    //   561: astore 4
    //   563: new 6	com/tencent/mm/compatible/e/a$a
    //   566: dup
    //   567: invokespecial 183	com/tencent/mm/compatible/e/a$a:<init>	()V
    //   570: astore 6
    //   572: aload_0
    //   573: astore 4
    //   575: aload 6
    //   577: new 135	android/util/SparseArray
    //   580: dup
    //   581: invokespecial 136	android/util/SparseArray:<init>	()V
    //   584: putfield 184	com/tencent/mm/compatible/e/a$a:fRI	Landroid/util/SparseArray;
    //   587: aload_0
    //   588: astore 4
    //   590: aload 6
    //   592: aload 5
    //   594: ldc -70
    //   596: invokeinterface 126 2 0
    //   601: checkcast 54	java/lang/String
    //   604: putfield 189	com/tencent/mm/compatible/e/a$a:esM	Ljava/lang/String;
    //   607: aload_0
    //   608: astore 4
    //   610: aload 6
    //   612: aload 5
    //   614: ldc -65
    //   616: invokeinterface 126 2 0
    //   621: checkcast 54	java/lang/String
    //   624: invokestatic 171	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   627: putfield 194	com/tencent/mm/compatible/e/a$a:fRF	I
    //   630: aload_0
    //   631: astore 4
    //   633: aload 6
    //   635: aload 5
    //   637: ldc -60
    //   639: invokeinterface 126 2 0
    //   644: checkcast 54	java/lang/String
    //   647: invokestatic 171	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   650: putfield 199	com/tencent/mm/compatible/e/a$a:fRG	I
    //   653: aload_0
    //   654: astore 4
    //   656: aload 6
    //   658: getfield 184	com/tencent/mm/compatible/e/a$a:fRI	Landroid/util/SparseArray;
    //   661: iconst_1
    //   662: aload 5
    //   664: new 89	java/lang/StringBuilder
    //   667: dup
    //   668: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   671: ldc -98
    //   673: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   676: aload_3
    //   677: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   680: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   683: invokeinterface 126 2 0
    //   688: invokevirtual 161	android/util/SparseArray:append	(ILjava/lang/Object;)V
    //   691: aload_0
    //   692: astore 4
    //   694: aload 6
    //   696: getfield 184	com/tencent/mm/compatible/e/a$a:fRI	Landroid/util/SparseArray;
    //   699: iconst_2
    //   700: aload 5
    //   702: new 89	java/lang/StringBuilder
    //   705: dup
    //   706: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   709: ldc -98
    //   711: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   714: ldc -93
    //   716: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   719: aload_3
    //   720: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   723: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   726: invokeinterface 126 2 0
    //   731: invokevirtual 161	android/util/SparseArray:append	(ILjava/lang/Object;)V
    //   734: aload_0
    //   735: astore 4
    //   737: aload 6
    //   739: aload 5
    //   741: ldc -91
    //   743: invokeinterface 126 2 0
    //   748: checkcast 54	java/lang/String
    //   751: invokestatic 171	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   754: putfield 200	com/tencent/mm/compatible/e/a$a:fRH	I
    //   757: aload_0
    //   758: astore 4
    //   760: aload_2
    //   761: aload 6
    //   763: invokeinterface 180 2 0
    //   768: pop
    //   769: goto -703 -> 66
    //   772: aload_0
    //   773: invokevirtual 108	java/io/BufferedReader:close	()V
    //   776: ldc2_w 18
    //   779: ldc 20
    //   781: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   784: return
    //   785: astore_0
    //   786: ldc2_w 18
    //   789: ldc 20
    //   791: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   794: return
    //   795: astore_0
    //   796: ldc2_w 18
    //   799: ldc 20
    //   801: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   804: return
    //   805: astore_0
    //   806: ldc2_w 18
    //   809: ldc 20
    //   811: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   814: return
    //   815: ldc2_w 18
    //   818: ldc 20
    //   820: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   823: return
    //   824: astore_1
    //   825: goto -280 -> 545
    //   828: astore_0
    //   829: aconst_null
    //   830: astore 4
    //   832: goto -297 -> 535
    //   835: astore_1
    //   836: aload_0
    //   837: astore 4
    //   839: aload_1
    //   840: astore_0
    //   841: goto -306 -> 535
    //   844: astore_0
    //   845: aconst_null
    //   846: astore_0
    //   847: goto -559 -> 288
    //   850: astore_0
    //   851: aload 4
    //   853: astore_0
    //   854: goto -707 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	857	0	paramString	String
    //   0	857	1	paramList	List<b>
    //   0	857	2	paramList1	List<a>
    //   34	686	3	str1	String
    //   48	804	4	str2	String
    //   73	667	5	localObject1	Object
    //   88	674	6	localObject2	Object
    //   252	299	7	str3	String
    // Exception table:
    //   from	to	target	type
    //   69	75	146	java/io/FileNotFoundException
    //   83	90	146	java/io/FileNotFoundException
    //   93	101	146	java/io/FileNotFoundException
    //   104	113	146	java/io/FileNotFoundException
    //   121	143	146	java/io/FileNotFoundException
    //   240	254	146	java/io/FileNotFoundException
    //   262	284	146	java/io/FileNotFoundException
    //   318	328	146	java/io/FileNotFoundException
    //   331	340	146	java/io/FileNotFoundException
    //   343	355	146	java/io/FileNotFoundException
    //   358	375	146	java/io/FileNotFoundException
    //   378	395	146	java/io/FileNotFoundException
    //   398	415	146	java/io/FileNotFoundException
    //   418	453	146	java/io/FileNotFoundException
    //   456	496	146	java/io/FileNotFoundException
    //   499	519	146	java/io/FileNotFoundException
    //   522	531	146	java/io/FileNotFoundException
    //   550	560	146	java/io/FileNotFoundException
    //   563	572	146	java/io/FileNotFoundException
    //   575	587	146	java/io/FileNotFoundException
    //   590	607	146	java/io/FileNotFoundException
    //   610	630	146	java/io/FileNotFoundException
    //   633	653	146	java/io/FileNotFoundException
    //   656	691	146	java/io/FileNotFoundException
    //   694	734	146	java/io/FileNotFoundException
    //   737	757	146	java/io/FileNotFoundException
    //   760	769	146	java/io/FileNotFoundException
    //   69	75	287	java/io/IOException
    //   83	90	287	java/io/IOException
    //   93	101	287	java/io/IOException
    //   104	113	287	java/io/IOException
    //   121	143	287	java/io/IOException
    //   240	254	287	java/io/IOException
    //   262	284	287	java/io/IOException
    //   318	328	287	java/io/IOException
    //   331	340	287	java/io/IOException
    //   343	355	287	java/io/IOException
    //   358	375	287	java/io/IOException
    //   378	395	287	java/io/IOException
    //   398	415	287	java/io/IOException
    //   418	453	287	java/io/IOException
    //   456	496	287	java/io/IOException
    //   499	519	287	java/io/IOException
    //   522	531	287	java/io/IOException
    //   550	560	287	java/io/IOException
    //   563	572	287	java/io/IOException
    //   575	587	287	java/io/IOException
    //   590	607	287	java/io/IOException
    //   610	630	287	java/io/IOException
    //   633	653	287	java/io/IOException
    //   656	691	287	java/io/IOException
    //   694	734	287	java/io/IOException
    //   737	757	287	java/io/IOException
    //   760	769	287	java/io/IOException
    //   69	75	534	finally
    //   83	90	534	finally
    //   93	101	534	finally
    //   104	113	534	finally
    //   121	143	534	finally
    //   240	254	534	finally
    //   262	284	534	finally
    //   291	298	534	finally
    //   318	328	534	finally
    //   331	340	534	finally
    //   343	355	534	finally
    //   358	375	534	finally
    //   378	395	534	finally
    //   398	415	534	finally
    //   418	453	534	finally
    //   456	496	534	finally
    //   499	519	534	finally
    //   522	531	534	finally
    //   550	560	534	finally
    //   563	572	534	finally
    //   575	587	534	finally
    //   590	607	534	finally
    //   610	630	534	finally
    //   633	653	534	finally
    //   656	691	534	finally
    //   694	734	534	finally
    //   737	757	534	finally
    //   760	769	534	finally
    //   772	776	785	java/io/IOException
    //   158	162	795	java/io/IOException
    //   302	306	805	java/io/IOException
    //   540	545	824	java/io/IOException
    //   50	66	828	finally
    //   147	154	835	finally
    //   50	66	844	java/io/IOException
    //   50	66	850	java/io/FileNotFoundException
  }
  
  public static boolean a(String paramString1, String paramString2, PInt paramPInt, PBool paramPBool)
  {
    GMTrace.i(13778657738752L, 102659);
    if (paramString1 == null)
    {
      paramPBool.value = false;
      GMTrace.o(13778657738752L, 102659);
      return false;
    }
    if (paramString2 == null)
    {
      paramPBool.value = true;
      GMTrace.o(13778657738752L, 102659);
      return false;
    }
    if (paramString1.equals(paramString2))
    {
      paramPInt.value += 1;
      paramPBool.value = true;
      GMTrace.o(13778657738752L, 102659);
      return true;
    }
    paramPBool.value = false;
    GMTrace.o(13778657738752L, 102659);
    return false;
  }
  
  public static List<PackageInfo> aO(boolean paramBoolean)
  {
    GMTrace.i(13778791956480L, 102660);
    HashSet localHashSet = new HashSet();
    if (paramBoolean)
    {
      Object localObject1 = (ActivityManager)ab.getContext().getSystemService("activity");
      if (localObject1 != null) {
        try
        {
          localObject1 = ((ActivityManager)localObject1).getRunningServices(32767);
          if (localObject1 != null)
          {
            localObject1 = ((List)localObject1).iterator();
            while (((Iterator)localObject1).hasNext()) {
              localHashSet.add(((ActivityManager.RunningServiceInfo)((Iterator)localObject1).next()).service.getPackageName());
            }
          }
          localObject2 = ab.getContext().getPackageManager();
        }
        catch (SecurityException localSecurityException)
        {
          w.e("MicroMsg.PermissionConfig", "getRunningServices failed");
        }
      }
    }
    if (localObject2 == null)
    {
      GMTrace.o(13778791956480L, 102660);
      return null;
    }
    Object localObject3 = ((PackageManager)localObject2).getInstalledPackages(0);
    Object localObject2 = localObject3;
    if (localObject3 != null)
    {
      localObject2 = localObject3;
      if (paramBoolean)
      {
        localObject2 = new ArrayList();
        localObject3 = ((List)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          PackageInfo localPackageInfo = (PackageInfo)((Iterator)localObject3).next();
          if (localHashSet.contains(localPackageInfo.packageName)) {
            ((List)localObject2).add(localPackageInfo);
          }
        }
      }
    }
    GMTrace.o(13778791956480L, 102660);
    return (List<PackageInfo>)localObject2;
  }
  
  private static final class a
  {
    public String esM;
    public int fRF;
    public int fRG;
    public int fRH;
    public SparseArray<String> fRI;
    
    public a()
    {
      GMTrace.i(13778255085568L, 102656);
      GMTrace.o(13778255085568L, 102656);
    }
    
    public final String toString()
    {
      GMTrace.i(13778389303296L, 102657);
      String str = String.format(Locale.US, "pkgname: %s, minCode:%d, maxCode: %d, value: %s, chkExp: %d", new Object[] { this.esM, Integer.valueOf(this.fRF), Integer.valueOf(this.fRG), this.fRI, Integer.valueOf(this.fRH) });
      GMTrace.o(13778389303296L, 102657);
      return str;
    }
  }
  
  private static final class b
  {
    public int fRH;
    public SparseArray<String> fRI;
    public String fRJ;
    public String model;
    public String version;
    
    public b()
    {
      GMTrace.i(13779060391936L, 102662);
      GMTrace.o(13779060391936L, 102662);
    }
    
    public final String toString()
    {
      GMTrace.i(13779194609664L, 102663);
      String str = String.format(Locale.US, "manufacture: %s, model: %s, version: %s, value: %s, chkExp: %d", new Object[] { this.fRJ, this.model, this.version, this.fRI, Integer.valueOf(this.fRH) });
      GMTrace.o(13779194609664L, 102663);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\compatible\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
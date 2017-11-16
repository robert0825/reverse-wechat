package com.tencent.mm.modelmulti;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class NotifyFreqLimit
  extends BroadcastReceiver
{
  private static long beginTime;
  private static byte[] gCf;
  private static a gNb;
  private static n gNc;
  private static int gNd;
  private static long[] gNe;
  private static LinkedList<Object> gNf;
  private static int gNg;
  private static Boolean gNh;
  private static Boolean gNi;
  private static long gNj;
  private static PendingIntent gNk;
  
  static
  {
    GMTrace.i(403726925824L, 3008);
    gCf = new byte[0];
    gNb = null;
    gNc = null;
    gNd = 0;
    gNe = null;
    gNf = new LinkedList();
    gNg = 0;
    beginTime = 0L;
    gNh = null;
    gNi = null;
    gNj = 0L;
    gNk = null;
    GMTrace.o(403726925824L, 3008);
  }
  
  public NotifyFreqLimit()
  {
    GMTrace.i(403458490368L, 3006);
    GMTrace.o(403458490368L, 3006);
  }
  
  /* Error */
  public void onReceive(android.content.Context paramContext, android.content.Intent paramIntent)
  {
    // Byte code:
    //   0: ldc2_w 80
    //   3: sipush 3007
    //   6: invokestatic 39	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: getstatic 41	com/tencent/mm/modelmulti/NotifyFreqLimit:gCf	[B
    //   12: astore 13
    //   14: aload 13
    //   16: monitorenter
    //   17: aload_2
    //   18: ifnull +15 -> 33
    //   21: ldc 83
    //   23: aload_2
    //   24: invokevirtual 89	android/content/Intent:getAction	()Ljava/lang/String;
    //   27: invokevirtual 95	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   30: ifne +46 -> 76
    //   33: aload_2
    //   34: ifnonnull +34 -> 68
    //   37: ldc 97
    //   39: astore_1
    //   40: ldc 99
    //   42: ldc 101
    //   44: iconst_1
    //   45: anewarray 103	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: aload_1
    //   51: aastore
    //   52: invokestatic 109	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: aload 13
    //   57: monitorexit
    //   58: ldc2_w 80
    //   61: sipush 3007
    //   64: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   67: return
    //   68: aload_2
    //   69: invokevirtual 89	android/content/Intent:getAction	()Ljava/lang/String;
    //   72: astore_1
    //   73: goto -33 -> 40
    //   76: aload_2
    //   77: ldc 111
    //   79: lconst_0
    //   80: invokevirtual 115	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   83: lstore 5
    //   85: invokestatic 121	com/tencent/mm/sdk/platformtools/bg:Pv	()J
    //   88: lload 5
    //   90: lsub
    //   91: lstore 7
    //   93: aload_2
    //   94: ldc 123
    //   96: iconst_0
    //   97: invokevirtual 127	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   100: istore_3
    //   101: aload_2
    //   102: ldc -127
    //   104: lconst_0
    //   105: invokevirtual 115	android/content/Intent:getLongExtra	(Ljava/lang/String;J)J
    //   108: ldc2_w 130
    //   111: lmul
    //   112: lstore 9
    //   114: invokestatic 137	android/os/Process:myPid	()I
    //   117: istore 4
    //   119: invokestatic 143	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   122: invokevirtual 146	java/lang/Thread:getId	()J
    //   125: lstore 11
    //   127: ldc 99
    //   129: ldc -108
    //   131: bipush 8
    //   133: anewarray 103	java/lang/Object
    //   136: dup
    //   137: iconst_0
    //   138: lload 5
    //   140: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   143: aastore
    //   144: dup
    //   145: iconst_1
    //   146: iload_3
    //   147: invokestatic 159	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   150: aastore
    //   151: dup
    //   152: iconst_2
    //   153: iload 4
    //   155: invokestatic 159	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   158: aastore
    //   159: dup
    //   160: iconst_3
    //   161: lload 11
    //   163: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   166: aastore
    //   167: dup
    //   168: iconst_4
    //   169: lload 7
    //   171: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   174: aastore
    //   175: dup
    //   176: iconst_5
    //   177: lload 9
    //   179: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   182: aastore
    //   183: dup
    //   184: bipush 6
    //   186: getstatic 68	com/tencent/mm/modelmulti/NotifyFreqLimit:gNk	Landroid/app/PendingIntent;
    //   189: aastore
    //   190: dup
    //   191: bipush 7
    //   193: getstatic 43	com/tencent/mm/modelmulti/NotifyFreqLimit:gNb	Lcom/tencent/mm/modelmulti/NotifyFreqLimit$a;
    //   196: aastore
    //   197: invokestatic 161	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: getstatic 68	com/tencent/mm/modelmulti/NotifyFreqLimit:gNk	Landroid/app/PendingIntent;
    //   203: ifnonnull +103 -> 306
    //   206: getstatic 167	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   209: ldc2_w 168
    //   212: ldc2_w 170
    //   215: lconst_1
    //   216: iconst_0
    //   217: invokevirtual 174	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   220: ldc 99
    //   222: ldc -80
    //   224: bipush 8
    //   226: anewarray 103	java/lang/Object
    //   229: dup
    //   230: iconst_0
    //   231: lload 5
    //   233: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   236: aastore
    //   237: dup
    //   238: iconst_1
    //   239: iload_3
    //   240: invokestatic 159	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   243: aastore
    //   244: dup
    //   245: iconst_2
    //   246: iload 4
    //   248: invokestatic 159	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   251: aastore
    //   252: dup
    //   253: iconst_3
    //   254: lload 11
    //   256: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   259: aastore
    //   260: dup
    //   261: iconst_4
    //   262: lload 7
    //   264: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   267: aastore
    //   268: dup
    //   269: iconst_5
    //   270: lload 9
    //   272: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   275: aastore
    //   276: dup
    //   277: bipush 6
    //   279: getstatic 68	com/tencent/mm/modelmulti/NotifyFreqLimit:gNk	Landroid/app/PendingIntent;
    //   282: aastore
    //   283: dup
    //   284: bipush 7
    //   286: getstatic 43	com/tencent/mm/modelmulti/NotifyFreqLimit:gNb	Lcom/tencent/mm/modelmulti/NotifyFreqLimit$a;
    //   289: aastore
    //   290: invokestatic 109	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   293: aload 13
    //   295: monitorexit
    //   296: ldc2_w 80
    //   299: sipush 3007
    //   302: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   305: return
    //   306: aconst_null
    //   307: putstatic 68	com/tencent/mm/modelmulti/NotifyFreqLimit:gNk	Landroid/app/PendingIntent;
    //   310: iload 4
    //   312: iload_3
    //   313: if_icmpeq +103 -> 416
    //   316: getstatic 167	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   319: ldc2_w 168
    //   322: ldc2_w 177
    //   325: lconst_1
    //   326: iconst_0
    //   327: invokevirtual 174	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   330: ldc 99
    //   332: ldc -76
    //   334: bipush 8
    //   336: anewarray 103	java/lang/Object
    //   339: dup
    //   340: iconst_0
    //   341: lload 5
    //   343: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   346: aastore
    //   347: dup
    //   348: iconst_1
    //   349: iload_3
    //   350: invokestatic 159	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   353: aastore
    //   354: dup
    //   355: iconst_2
    //   356: iload 4
    //   358: invokestatic 159	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   361: aastore
    //   362: dup
    //   363: iconst_3
    //   364: lload 11
    //   366: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   369: aastore
    //   370: dup
    //   371: iconst_4
    //   372: lload 7
    //   374: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   377: aastore
    //   378: dup
    //   379: iconst_5
    //   380: lload 9
    //   382: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   385: aastore
    //   386: dup
    //   387: bipush 6
    //   389: getstatic 68	com/tencent/mm/modelmulti/NotifyFreqLimit:gNk	Landroid/app/PendingIntent;
    //   392: aastore
    //   393: dup
    //   394: bipush 7
    //   396: getstatic 43	com/tencent/mm/modelmulti/NotifyFreqLimit:gNb	Lcom/tencent/mm/modelmulti/NotifyFreqLimit$a;
    //   399: aastore
    //   400: invokestatic 109	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   403: aload 13
    //   405: monitorexit
    //   406: ldc2_w 80
    //   409: sipush 3007
    //   412: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   415: return
    //   416: ldc2_w 181
    //   419: lload 9
    //   421: lmul
    //   422: lload 7
    //   424: lcmp
    //   425: iflt +15 -> 440
    //   428: ldc2_w 183
    //   431: lload 9
    //   433: ladd
    //   434: lload 7
    //   436: lcmp
    //   437: ifge +206 -> 643
    //   440: ldc 99
    //   442: ldc -70
    //   444: bipush 8
    //   446: anewarray 103	java/lang/Object
    //   449: dup
    //   450: iconst_0
    //   451: lload 5
    //   453: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   456: aastore
    //   457: dup
    //   458: iconst_1
    //   459: iload_3
    //   460: invokestatic 159	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   463: aastore
    //   464: dup
    //   465: iconst_2
    //   466: iload 4
    //   468: invokestatic 159	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   471: aastore
    //   472: dup
    //   473: iconst_3
    //   474: lload 11
    //   476: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   479: aastore
    //   480: dup
    //   481: iconst_4
    //   482: lload 7
    //   484: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   487: aastore
    //   488: dup
    //   489: iconst_5
    //   490: lload 9
    //   492: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   495: aastore
    //   496: dup
    //   497: bipush 6
    //   499: getstatic 68	com/tencent/mm/modelmulti/NotifyFreqLimit:gNk	Landroid/app/PendingIntent;
    //   502: aastore
    //   503: dup
    //   504: bipush 7
    //   506: getstatic 43	com/tencent/mm/modelmulti/NotifyFreqLimit:gNb	Lcom/tencent/mm/modelmulti/NotifyFreqLimit$a;
    //   509: aastore
    //   510: invokestatic 109	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   513: iconst_0
    //   514: invokestatic 191	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   517: putstatic 64	com/tencent/mm/modelmulti/NotifyFreqLimit:gNi	Ljava/lang/Boolean;
    //   520: invokestatic 197	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   523: ldc -57
    //   525: iconst_0
    //   526: invokevirtual 205	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   529: astore_2
    //   530: aload_2
    //   531: ldc -49
    //   533: ldc -47
    //   535: invokeinterface 215 3 0
    //   540: invokestatic 219	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   543: astore_1
    //   544: aload_2
    //   545: invokeinterface 223 1 0
    //   550: astore_2
    //   551: aload_2
    //   552: ldc -49
    //   554: new 225	java/lang/StringBuilder
    //   557: dup
    //   558: invokespecial 226	java/lang/StringBuilder:<init>	()V
    //   561: invokestatic 121	com/tencent/mm/sdk/platformtools/bg:Pv	()J
    //   564: invokevirtual 230	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   567: ldc -24
    //   569: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   572: aload_1
    //   573: invokevirtual 235	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   576: invokevirtual 238	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   579: invokeinterface 244 3 0
    //   584: pop
    //   585: aload_2
    //   586: invokeinterface 248 1 0
    //   591: pop
    //   592: aload_1
    //   593: invokestatic 252	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   596: ifeq +25 -> 621
    //   599: getstatic 167	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   602: sipush 11098
    //   605: iconst_1
    //   606: anewarray 103	java/lang/Object
    //   609: dup
    //   610: iconst_0
    //   611: sipush 3103
    //   614: invokestatic 159	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   617: aastore
    //   618: invokevirtual 255	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   621: ldc 99
    //   623: ldc_w 257
    //   626: iconst_2
    //   627: anewarray 103	java/lang/Object
    //   630: dup
    //   631: iconst_0
    //   632: getstatic 64	com/tencent/mm/modelmulti/NotifyFreqLimit:gNi	Ljava/lang/Boolean;
    //   635: aastore
    //   636: dup
    //   637: iconst_1
    //   638: aload_1
    //   639: aastore
    //   640: invokestatic 161	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   643: getstatic 43	com/tencent/mm/modelmulti/NotifyFreqLimit:gNb	Lcom/tencent/mm/modelmulti/NotifyFreqLimit$a;
    //   646: ifnonnull +91 -> 737
    //   649: getstatic 167	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   652: ldc2_w 168
    //   655: ldc2_w 258
    //   658: lconst_1
    //   659: iconst_0
    //   660: invokevirtual 174	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   663: ldc 99
    //   665: ldc_w 261
    //   668: bipush 8
    //   670: anewarray 103	java/lang/Object
    //   673: dup
    //   674: iconst_0
    //   675: lload 5
    //   677: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   680: aastore
    //   681: dup
    //   682: iconst_1
    //   683: iload_3
    //   684: invokestatic 159	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   687: aastore
    //   688: dup
    //   689: iconst_2
    //   690: iload 4
    //   692: invokestatic 159	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   695: aastore
    //   696: dup
    //   697: iconst_3
    //   698: lload 11
    //   700: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   703: aastore
    //   704: dup
    //   705: iconst_4
    //   706: lload 7
    //   708: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   711: aastore
    //   712: dup
    //   713: iconst_5
    //   714: lload 9
    //   716: invokestatic 154	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   719: aastore
    //   720: dup
    //   721: bipush 6
    //   723: getstatic 68	com/tencent/mm/modelmulti/NotifyFreqLimit:gNk	Landroid/app/PendingIntent;
    //   726: aastore
    //   727: dup
    //   728: bipush 7
    //   730: getstatic 43	com/tencent/mm/modelmulti/NotifyFreqLimit:gNb	Lcom/tencent/mm/modelmulti/NotifyFreqLimit$a;
    //   733: aastore
    //   734: invokestatic 109	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   737: aload 13
    //   739: monitorexit
    //   740: ldc2_w 80
    //   743: sipush 3007
    //   746: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   749: return
    //   750: astore_1
    //   751: aconst_null
    //   752: putstatic 68	com/tencent/mm/modelmulti/NotifyFreqLimit:gNk	Landroid/app/PendingIntent;
    //   755: getstatic 167	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   758: ldc2_w 168
    //   761: ldc2_w 262
    //   764: lconst_1
    //   765: iconst_0
    //   766: invokevirtual 174	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   769: ldc 99
    //   771: ldc_w 265
    //   774: iconst_1
    //   775: anewarray 103	java/lang/Object
    //   778: dup
    //   779: iconst_0
    //   780: aload_1
    //   781: invokestatic 269	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   784: aastore
    //   785: invokestatic 109	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   788: ldc2_w 80
    //   791: sipush 3007
    //   794: invokestatic 71	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   797: return
    //   798: astore_1
    //   799: aload 13
    //   801: monitorexit
    //   802: aload_1
    //   803: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	804	0	this	NotifyFreqLimit
    //   0	804	1	paramContext	android.content.Context
    //   0	804	2	paramIntent	android.content.Intent
    //   100	584	3	i	int
    //   117	574	4	j	int
    //   83	593	5	l1	long
    //   91	616	7	l2	long
    //   112	603	9	l3	long
    //   125	574	11	l4	long
    //   12	788	13	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   9	17	750	java/lang/Throwable
    //   740	749	750	java/lang/Throwable
    //   802	804	750	java/lang/Throwable
    //   21	33	798	finally
    //   40	58	798	finally
    //   68	73	798	finally
    //   76	296	798	finally
    //   306	310	798	finally
    //   316	406	798	finally
    //   440	621	798	finally
    //   621	643	798	finally
    //   643	737	798	finally
    //   737	740	798	finally
    //   799	802	798	finally
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\modelmulti\NotifyFreqLimit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
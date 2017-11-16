package com.tencent.mm.plugin.sns.model;

import android.net.wifi.ScanResult;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.bfx;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class aj
{
  /* Error */
  private static String bjz()
  {
    // Byte code:
    //   0: ldc2_w 11
    //   3: ldc 13
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: invokestatic 25	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   11: astore 16
    //   13: aload 16
    //   15: ifnonnull +20 -> 35
    //   18: ldc 27
    //   20: ldc 29
    //   22: invokestatic 35	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: ldc2_w 11
    //   28: ldc 13
    //   30: invokestatic 38	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   33: aconst_null
    //   34: areturn
    //   35: iconst_0
    //   36: istore_0
    //   37: aload 16
    //   39: ldc 40
    //   41: invokevirtual 46	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   44: checkcast 48	android/net/ConnectivityManager
    //   47: invokevirtual 52	android/net/ConnectivityManager:getActiveNetworkInfo	()Landroid/net/NetworkInfo;
    //   50: astore 4
    //   52: aload 4
    //   54: invokevirtual 58	android/net/NetworkInfo:getSubtype	()I
    //   57: istore_1
    //   58: aload 4
    //   60: invokevirtual 61	android/net/NetworkInfo:getType	()I
    //   63: istore_2
    //   64: iload_2
    //   65: iconst_1
    //   66: if_icmpne +217 -> 283
    //   69: iconst_1
    //   70: istore_0
    //   71: ldc 27
    //   73: ldc 63
    //   75: iconst_1
    //   76: anewarray 4	java/lang/Object
    //   79: dup
    //   80: iconst_0
    //   81: iload_0
    //   82: invokestatic 69	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   85: aastore
    //   86: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   89: aload 16
    //   91: ldc 74
    //   93: invokevirtual 46	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   96: checkcast 76	android/net/wifi/WifiManager
    //   99: astore 9
    //   101: aload 9
    //   103: invokevirtual 80	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   106: astore 8
    //   108: new 82	java/lang/StringBuffer
    //   111: dup
    //   112: invokespecial 86	java/lang/StringBuffer:<init>	()V
    //   115: astore 4
    //   117: new 82	java/lang/StringBuffer
    //   120: dup
    //   121: invokespecial 86	java/lang/StringBuffer:<init>	()V
    //   124: astore 6
    //   126: new 82	java/lang/StringBuffer
    //   129: dup
    //   130: invokespecial 86	java/lang/StringBuffer:<init>	()V
    //   133: astore 5
    //   135: iconst_0
    //   136: istore_3
    //   137: iconst_0
    //   138: istore_1
    //   139: new 88	java/util/ArrayList
    //   142: dup
    //   143: invokespecial 89	java/util/ArrayList:<init>	()V
    //   146: astore 7
    //   148: aload 4
    //   150: aload 8
    //   152: invokevirtual 94	android/net/wifi/WifiInfo:getSSID	()Ljava/lang/String;
    //   155: invokevirtual 98	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   158: pop
    //   159: aload 6
    //   161: aload 8
    //   163: invokevirtual 101	android/net/wifi/WifiInfo:getBSSID	()Ljava/lang/String;
    //   166: invokevirtual 98	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   169: pop
    //   170: aload 8
    //   172: invokevirtual 101	android/net/wifi/WifiInfo:getBSSID	()Ljava/lang/String;
    //   175: astore 8
    //   177: aload 7
    //   179: aload 8
    //   181: invokevirtual 105	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   184: pop
    //   185: aload 9
    //   187: invokevirtual 109	android/net/wifi/WifiManager:getScanResults	()Ljava/util/List;
    //   190: astore 9
    //   192: aload 9
    //   194: ifnull +303 -> 497
    //   197: aload 9
    //   199: new 6	com/tencent/mm/plugin/sns/model/aj$1
    //   202: dup
    //   203: invokespecial 110	com/tencent/mm/plugin/sns/model/aj$1:<init>	()V
    //   206: invokestatic 116	java/util/Collections:sort	(Ljava/util/List;Ljava/util/Comparator;)V
    //   209: aload 9
    //   211: invokeinterface 122 1 0
    //   216: astore 9
    //   218: bipush 20
    //   220: istore_2
    //   221: iload_1
    //   222: istore_3
    //   223: aload 9
    //   225: invokeinterface 128 1 0
    //   230: ifeq +267 -> 497
    //   233: aload 9
    //   235: invokeinterface 132 1 0
    //   240: checkcast 134	android/net/wifi/ScanResult
    //   243: astore 10
    //   245: aload 10
    //   247: ifnull -26 -> 221
    //   250: aload 10
    //   252: getfield 138	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   255: invokestatic 144	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   258: ifne -37 -> 221
    //   261: aload 10
    //   263: getfield 138	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   266: aload 8
    //   268: invokevirtual 149	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   271: ifeq +111 -> 382
    //   274: aload 10
    //   276: getfield 153	android/net/wifi/ScanResult:level	I
    //   279: istore_1
    //   280: goto -59 -> 221
    //   283: iload_1
    //   284: bipush 13
    //   286: if_icmpeq +15 -> 301
    //   289: iload_1
    //   290: bipush 15
    //   292: if_icmpeq +9 -> 301
    //   295: iload_1
    //   296: bipush 14
    //   298: if_icmpne +8 -> 306
    //   301: iconst_4
    //   302: istore_0
    //   303: goto -232 -> 71
    //   306: iload_1
    //   307: iconst_3
    //   308: if_icmpeq +25 -> 333
    //   311: iload_1
    //   312: iconst_4
    //   313: if_icmpeq +20 -> 333
    //   316: iload_1
    //   317: iconst_5
    //   318: if_icmpeq +15 -> 333
    //   321: iload_1
    //   322: bipush 6
    //   324: if_icmpeq +9 -> 333
    //   327: iload_1
    //   328: bipush 12
    //   330: if_icmpne +8 -> 338
    //   333: iconst_3
    //   334: istore_0
    //   335: goto -264 -> 71
    //   338: iload_1
    //   339: iconst_1
    //   340: if_icmpeq +8 -> 348
    //   343: iload_1
    //   344: iconst_2
    //   345: if_icmpne +8 -> 353
    //   348: iconst_2
    //   349: istore_0
    //   350: goto -279 -> 71
    //   353: iconst_0
    //   354: istore_0
    //   355: goto -284 -> 71
    //   358: astore 4
    //   360: ldc 27
    //   362: ldc -101
    //   364: iconst_1
    //   365: anewarray 4	java/lang/Object
    //   368: dup
    //   369: iconst_0
    //   370: aload 4
    //   372: invokestatic 159	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   375: aastore
    //   376: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   379: goto -308 -> 71
    //   382: iload_1
    //   383: istore_3
    //   384: iload_2
    //   385: ifle +112 -> 497
    //   388: aload 4
    //   390: ldc -93
    //   392: invokevirtual 98	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   395: pop
    //   396: aload 4
    //   398: aload 10
    //   400: getfield 166	android/net/wifi/ScanResult:SSID	Ljava/lang/String;
    //   403: invokestatic 170	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   406: ldc -93
    //   408: ldc -84
    //   410: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   413: ldc -78
    //   415: ldc -84
    //   417: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   420: invokevirtual 98	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   423: pop
    //   424: aload 6
    //   426: ldc -93
    //   428: invokevirtual 98	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   431: pop
    //   432: aload 6
    //   434: aload 10
    //   436: getfield 138	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   439: invokestatic 170	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   442: ldc -93
    //   444: ldc -84
    //   446: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   449: ldc -78
    //   451: ldc -84
    //   453: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   456: invokevirtual 98	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   459: pop
    //   460: aload 7
    //   462: aload 10
    //   464: getfield 138	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   467: invokevirtual 105	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   470: pop
    //   471: aload 5
    //   473: ldc -93
    //   475: invokevirtual 98	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   478: pop
    //   479: aload 5
    //   481: aload 10
    //   483: getfield 153	android/net/wifi/ScanResult:level	I
    //   486: invokevirtual 181	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   489: pop
    //   490: iload_2
    //   491: iconst_1
    //   492: isub
    //   493: istore_2
    //   494: goto -273 -> 221
    //   497: aload 4
    //   499: invokevirtual 184	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   502: astore 4
    //   504: aload 6
    //   506: invokevirtual 184	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   509: astore 6
    //   511: new 186	java/lang/StringBuilder
    //   514: dup
    //   515: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   518: iload_3
    //   519: invokevirtual 190	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   522: aload 5
    //   524: invokevirtual 184	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   527: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   530: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   533: astore 13
    //   535: aload 6
    //   537: astore 14
    //   539: aload 4
    //   541: astore 12
    //   543: ldc 27
    //   545: ldc -60
    //   547: iconst_3
    //   548: anewarray 4	java/lang/Object
    //   551: dup
    //   552: iconst_0
    //   553: aload 14
    //   555: aastore
    //   556: dup
    //   557: iconst_1
    //   558: aload 12
    //   560: aastore
    //   561: dup
    //   562: iconst_2
    //   563: aload 13
    //   565: aastore
    //   566: invokestatic 199	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   569: ldc -84
    //   571: astore 15
    //   573: aload 16
    //   575: ldc -55
    //   577: invokevirtual 46	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   580: checkcast 203	android/telephony/TelephonyManager
    //   583: astore 4
    //   585: aload 4
    //   587: ifnull +914 -> 1501
    //   590: aload 4
    //   592: invokevirtual 206	android/telephony/TelephonyManager:getNetworkOperatorName	()Ljava/lang/String;
    //   595: astore 4
    //   597: aload 4
    //   599: astore 15
    //   601: ldc 27
    //   603: ldc -48
    //   605: iconst_1
    //   606: anewarray 4	java/lang/Object
    //   609: dup
    //   610: iconst_0
    //   611: aload 15
    //   613: aastore
    //   614: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   617: ldc -84
    //   619: astore 10
    //   621: ldc -84
    //   623: astore 11
    //   625: ldc -84
    //   627: astore 6
    //   629: ldc -84
    //   631: astore 5
    //   633: aload 5
    //   635: astore 9
    //   637: aload 6
    //   639: astore 4
    //   641: aload 11
    //   643: astore 8
    //   645: aload 10
    //   647: astore 7
    //   649: aload 16
    //   651: invokestatic 214	com/tencent/mm/sdk/platformtools/am:ez	(Landroid/content/Context;)Ljava/util/List;
    //   654: astore 17
    //   656: iconst_0
    //   657: istore_1
    //   658: aload 5
    //   660: astore 9
    //   662: aload 6
    //   664: astore 4
    //   666: aload 11
    //   668: astore 8
    //   670: aload 10
    //   672: astore 7
    //   674: iload_1
    //   675: aload 17
    //   677: invokeinterface 217 1 0
    //   682: if_icmpge +509 -> 1191
    //   685: aload 5
    //   687: astore 9
    //   689: aload 6
    //   691: astore 4
    //   693: aload 11
    //   695: astore 8
    //   697: aload 10
    //   699: astore 7
    //   701: aload 17
    //   703: iload_1
    //   704: invokeinterface 221 2 0
    //   709: checkcast 223	com/tencent/mm/sdk/platformtools/am$a
    //   712: astore 18
    //   714: aload 5
    //   716: astore 9
    //   718: aload 6
    //   720: astore 4
    //   722: aload 11
    //   724: astore 8
    //   726: aload 10
    //   728: astore 7
    //   730: aload 18
    //   732: getfield 226	com/tencent/mm/sdk/platformtools/am$a:vjH	Ljava/lang/String;
    //   735: ldc -84
    //   737: invokestatic 230	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   740: astore 16
    //   742: aload 5
    //   744: astore 9
    //   746: aload 6
    //   748: astore 4
    //   750: aload 11
    //   752: astore 8
    //   754: aload 16
    //   756: astore 7
    //   758: aload 18
    //   760: getfield 233	com/tencent/mm/sdk/platformtools/am$a:vjI	Ljava/lang/String;
    //   763: ldc -84
    //   765: invokestatic 230	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   768: astore 11
    //   770: aload 6
    //   772: astore 10
    //   774: aload 5
    //   776: astore 9
    //   778: aload 6
    //   780: astore 4
    //   782: aload 11
    //   784: astore 8
    //   786: aload 16
    //   788: astore 7
    //   790: aload 6
    //   792: invokevirtual 236	java/lang/String:length	()I
    //   795: ifle +72 -> 867
    //   798: aload 6
    //   800: astore 10
    //   802: aload 5
    //   804: astore 9
    //   806: aload 6
    //   808: astore 4
    //   810: aload 11
    //   812: astore 8
    //   814: aload 16
    //   816: astore 7
    //   818: aload 18
    //   820: getfield 239	com/tencent/mm/sdk/platformtools/am$a:vjK	Ljava/lang/String;
    //   823: invokestatic 144	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   826: ifne +41 -> 867
    //   829: aload 5
    //   831: astore 9
    //   833: aload 6
    //   835: astore 4
    //   837: aload 11
    //   839: astore 8
    //   841: aload 16
    //   843: astore 7
    //   845: new 186	java/lang/StringBuilder
    //   848: dup
    //   849: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   852: aload 6
    //   854: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   857: ldc -93
    //   859: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   862: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   865: astore 10
    //   867: aload 10
    //   869: astore 6
    //   871: aload 5
    //   873: astore 9
    //   875: aload 10
    //   877: astore 4
    //   879: aload 11
    //   881: astore 8
    //   883: aload 16
    //   885: astore 7
    //   887: aload 18
    //   889: getfield 239	com/tencent/mm/sdk/platformtools/am$a:vjK	Ljava/lang/String;
    //   892: invokestatic 144	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   895: ifne +44 -> 939
    //   898: aload 5
    //   900: astore 9
    //   902: aload 10
    //   904: astore 4
    //   906: aload 11
    //   908: astore 8
    //   910: aload 16
    //   912: astore 7
    //   914: new 186	java/lang/StringBuilder
    //   917: dup
    //   918: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   921: aload 10
    //   923: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   926: aload 18
    //   928: getfield 239	com/tencent/mm/sdk/platformtools/am$a:vjK	Ljava/lang/String;
    //   931: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   934: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   937: astore 6
    //   939: aload 5
    //   941: astore 10
    //   943: aload 5
    //   945: astore 9
    //   947: aload 6
    //   949: astore 4
    //   951: aload 11
    //   953: astore 8
    //   955: aload 16
    //   957: astore 7
    //   959: aload 5
    //   961: invokevirtual 236	java/lang/String:length	()I
    //   964: ifle +72 -> 1036
    //   967: aload 5
    //   969: astore 10
    //   971: aload 5
    //   973: astore 9
    //   975: aload 6
    //   977: astore 4
    //   979: aload 11
    //   981: astore 8
    //   983: aload 16
    //   985: astore 7
    //   987: aload 18
    //   989: getfield 242	com/tencent/mm/sdk/platformtools/am$a:vjJ	Ljava/lang/String;
    //   992: invokestatic 144	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   995: ifne +41 -> 1036
    //   998: aload 5
    //   1000: astore 9
    //   1002: aload 6
    //   1004: astore 4
    //   1006: aload 11
    //   1008: astore 8
    //   1010: aload 16
    //   1012: astore 7
    //   1014: new 186	java/lang/StringBuilder
    //   1017: dup
    //   1018: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   1021: aload 5
    //   1023: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1026: ldc -93
    //   1028: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1031: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1034: astore 10
    //   1036: aload 10
    //   1038: astore 9
    //   1040: aload 6
    //   1042: astore 4
    //   1044: aload 11
    //   1046: astore 8
    //   1048: aload 16
    //   1050: astore 7
    //   1052: aload 18
    //   1054: getfield 242	com/tencent/mm/sdk/platformtools/am$a:vjJ	Ljava/lang/String;
    //   1057: invokestatic 144	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   1060: ifne +434 -> 1494
    //   1063: aload 10
    //   1065: astore 9
    //   1067: aload 6
    //   1069: astore 4
    //   1071: aload 11
    //   1073: astore 8
    //   1075: aload 16
    //   1077: astore 7
    //   1079: new 186	java/lang/StringBuilder
    //   1082: dup
    //   1083: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   1086: aload 10
    //   1088: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1091: aload 18
    //   1093: getfield 242	com/tencent/mm/sdk/platformtools/am$a:vjJ	Ljava/lang/String;
    //   1096: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1099: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1102: astore 5
    //   1104: aload 5
    //   1106: astore 4
    //   1108: iload_1
    //   1109: iconst_1
    //   1110: iadd
    //   1111: istore_1
    //   1112: aload 4
    //   1114: astore 5
    //   1116: aload 16
    //   1118: astore 10
    //   1120: goto -462 -> 658
    //   1123: astore 6
    //   1125: ldc -84
    //   1127: astore 5
    //   1129: ldc -84
    //   1131: astore 4
    //   1133: ldc 27
    //   1135: ldc -12
    //   1137: iconst_1
    //   1138: anewarray 4	java/lang/Object
    //   1141: dup
    //   1142: iconst_0
    //   1143: aload 6
    //   1145: invokestatic 159	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1148: aastore
    //   1149: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1152: ldc -84
    //   1154: astore 13
    //   1156: aload 5
    //   1158: astore 12
    //   1160: aload 4
    //   1162: astore 14
    //   1164: goto -621 -> 543
    //   1167: astore 4
    //   1169: ldc 27
    //   1171: ldc -101
    //   1173: iconst_1
    //   1174: anewarray 4	java/lang/Object
    //   1177: dup
    //   1178: iconst_0
    //   1179: aload 4
    //   1181: invokestatic 159	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1184: aastore
    //   1185: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1188: goto -587 -> 601
    //   1191: aload 11
    //   1193: astore 4
    //   1195: aload 10
    //   1197: astore 7
    //   1199: ldc 27
    //   1201: ldc -10
    //   1203: iconst_4
    //   1204: anewarray 4	java/lang/Object
    //   1207: dup
    //   1208: iconst_0
    //   1209: aload 7
    //   1211: aastore
    //   1212: dup
    //   1213: iconst_1
    //   1214: aload 4
    //   1216: aastore
    //   1217: dup
    //   1218: iconst_2
    //   1219: aload 6
    //   1221: aastore
    //   1222: dup
    //   1223: iconst_3
    //   1224: aload 5
    //   1226: aastore
    //   1227: invokestatic 199	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1230: new 186	java/lang/StringBuilder
    //   1233: dup
    //   1234: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   1237: astore 8
    //   1239: aload 8
    //   1241: iload_0
    //   1242: invokevirtual 190	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1245: ldc -8
    //   1247: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1250: pop
    //   1251: aload 8
    //   1253: aload 12
    //   1255: ldc -8
    //   1257: ldc -78
    //   1259: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1262: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1265: ldc -8
    //   1267: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1270: pop
    //   1271: aload 8
    //   1273: aload 14
    //   1275: ldc -8
    //   1277: ldc -78
    //   1279: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1282: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1285: ldc -8
    //   1287: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1290: pop
    //   1291: aload 8
    //   1293: aload 13
    //   1295: ldc -8
    //   1297: ldc -78
    //   1299: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1302: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1305: ldc -8
    //   1307: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1310: pop
    //   1311: aload 8
    //   1313: aload 15
    //   1315: ldc -8
    //   1317: ldc -78
    //   1319: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1322: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1325: ldc -8
    //   1327: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1330: pop
    //   1331: aload 8
    //   1333: aload 7
    //   1335: ldc -8
    //   1337: ldc -78
    //   1339: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1342: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1345: ldc -8
    //   1347: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1350: pop
    //   1351: aload 8
    //   1353: aload 4
    //   1355: ldc -8
    //   1357: ldc -78
    //   1359: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1362: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1365: ldc -8
    //   1367: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1370: pop
    //   1371: aload 8
    //   1373: aload 6
    //   1375: ldc -8
    //   1377: ldc -78
    //   1379: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1382: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1385: ldc -8
    //   1387: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1390: pop
    //   1391: aload 8
    //   1393: aload 5
    //   1395: ldc -8
    //   1397: ldc -78
    //   1399: invokevirtual 176	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1402: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1405: pop
    //   1406: aload 8
    //   1408: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1411: astore 4
    //   1413: ldc2_w 11
    //   1416: ldc 13
    //   1418: invokestatic 38	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1421: aload 4
    //   1423: areturn
    //   1424: astore 6
    //   1426: aload 9
    //   1428: astore 5
    //   1430: ldc 27
    //   1432: ldc -101
    //   1434: iconst_1
    //   1435: anewarray 4	java/lang/Object
    //   1438: dup
    //   1439: iconst_0
    //   1440: aload 6
    //   1442: invokestatic 159	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1445: aastore
    //   1446: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1449: aload 4
    //   1451: astore 6
    //   1453: aload 8
    //   1455: astore 4
    //   1457: goto -258 -> 1199
    //   1460: astore 6
    //   1462: ldc -84
    //   1464: astore 7
    //   1466: aload 4
    //   1468: astore 5
    //   1470: aload 7
    //   1472: astore 4
    //   1474: goto -341 -> 1133
    //   1477: astore 7
    //   1479: aload 4
    //   1481: astore 5
    //   1483: aload 6
    //   1485: astore 4
    //   1487: aload 7
    //   1489: astore 6
    //   1491: goto -358 -> 1133
    //   1494: aload 10
    //   1496: astore 4
    //   1498: goto -390 -> 1108
    //   1501: ldc -84
    //   1503: astore 4
    //   1505: goto -908 -> 597
    // Local variable table:
    //   start	length	slot	name	signature
    //   36	1206	0	i	int
    //   57	1055	1	j	int
    //   63	431	2	k	int
    //   136	383	3	m	int
    //   50	99	4	localObject1	Object
    //   358	140	4	localException1	Exception
    //   502	659	4	localObject2	Object
    //   1167	13	4	localException2	Exception
    //   1193	311	4	localObject3	Object
    //   133	1349	5	localObject4	Object
    //   124	944	6	localObject5	Object
    //   1123	251	6	localException3	Exception
    //   1424	17	6	localException4	Exception
    //   1451	1	6	localObject6	Object
    //   1460	24	6	localException5	Exception
    //   1489	1	6	localObject7	Object
    //   146	1325	7	localObject8	Object
    //   1477	11	7	localException6	Exception
    //   106	1348	8	localObject9	Object
    //   99	1328	9	localObject10	Object
    //   243	1252	10	localObject11	Object
    //   623	569	11	str1	String
    //   541	713	12	localObject12	Object
    //   533	761	13	str2	String
    //   537	737	14	localObject13	Object
    //   571	743	15	localObject14	Object
    //   11	1106	16	localObject15	Object
    //   654	48	17	localList	List
    //   712	380	18	locala	com.tencent.mm.sdk.platformtools.am.a
    // Exception table:
    //   from	to	target	type
    //   37	64	358	java/lang/Exception
    //   89	135	1123	java/lang/Exception
    //   139	192	1123	java/lang/Exception
    //   197	218	1123	java/lang/Exception
    //   223	245	1123	java/lang/Exception
    //   250	280	1123	java/lang/Exception
    //   388	490	1123	java/lang/Exception
    //   497	504	1123	java/lang/Exception
    //   573	585	1167	java/lang/Exception
    //   590	597	1167	java/lang/Exception
    //   649	656	1424	java/lang/Exception
    //   674	685	1424	java/lang/Exception
    //   701	714	1424	java/lang/Exception
    //   730	742	1424	java/lang/Exception
    //   758	770	1424	java/lang/Exception
    //   790	798	1424	java/lang/Exception
    //   818	829	1424	java/lang/Exception
    //   845	867	1424	java/lang/Exception
    //   887	898	1424	java/lang/Exception
    //   914	939	1424	java/lang/Exception
    //   959	967	1424	java/lang/Exception
    //   987	998	1424	java/lang/Exception
    //   1014	1036	1424	java/lang/Exception
    //   1052	1063	1424	java/lang/Exception
    //   1079	1104	1424	java/lang/Exception
    //   504	511	1460	java/lang/Exception
    //   511	535	1477	java/lang/Exception
  }
  
  public static void dK(long paramLong)
  {
    GMTrace.i(8131849486336L, 60587);
    if (paramLong == 0L)
    {
      GMTrace.o(8131849486336L, 60587);
      return;
    }
    Object localObject1 = ae.bjd().dU(paramLong);
    if (localObject1 == null)
    {
      GMTrace.o(8131849486336L, 60587);
      return;
    }
    if (((m)localObject1).field_type != 1)
    {
      GMTrace.o(8131849486336L, 60587);
      return;
    }
    Object localObject2 = ((m)localObject1).blQ();
    if (localObject2 == null)
    {
      GMTrace.o(8131849486336L, 60587);
      return;
    }
    LinkedList localLinkedList1 = ((anv)localObject2).uDy;
    LinkedList localLinkedList2 = ((m)localObject1).blD().uUc.ueW;
    int j = Math.min(localLinkedList1.size(), localLinkedList2.size());
    localObject1 = "";
    if (j > 0)
    {
      localObject2 = bjz();
      localObject1 = localObject2;
      if (bg.nm((String)localObject2))
      {
        GMTrace.o(8131849486336L, 60587);
        return;
      }
    }
    int i = 0;
    while (i < j)
    {
      bfx localbfx = (bfx)localLinkedList1.get(i);
      localObject2 = new StringBuffer();
      Object localObject3 = (anu)localLinkedList2.get(i);
      ((StringBuffer)localObject2).append("||index: " + i);
      ((StringBuffer)localObject2).append("||item poi lat " + localbfx.uRM + " " + localbfx.uRN);
      ((StringBuffer)localObject2).append("||item poi accuracy loctype " + localbfx.aFG + " " + localbfx.pTO);
      ((StringBuffer)localObject2).append("||item pic lat " + localbfx.uRK + " " + localbfx.uRL);
      ((StringBuffer)localObject2).append("||item exitime:" + localbfx.uRP + " filetime: " + localbfx.uRQ);
      ((StringBuffer)localObject2).append("||item source: " + localbfx.uRO);
      ((StringBuffer)localObject2).append("||url" + ((anu)localObject3).lPM);
      localObject3 = ((anu)localObject3).lPM;
      localObject2 = localObject3;
      if (((String)localObject3).startsWith("http://mmsns.qpic.cn/mmsns/"))
      {
        int k = ((String)localObject3).lastIndexOf("/");
        localObject2 = localObject3;
        if (k > 27)
        {
          localObject2 = localObject3;
          if (k < ((String)localObject3).length()) {
            localObject2 = ((String)localObject3).substring(27, k);
          }
        }
      }
      localObject2 = (String)localObject2 + "," + i.dt(paramLong) + "," + i + "," + bg.Pu() + "," + localbfx.uRO + "," + localbfx.uRQ + "," + localbfx.uRP + "," + localbfx.uRL + "," + localbfx.uRK + "," + localbfx.uRN + "," + localbfx.uRM + "," + (String)localObject1 + "," + localbfx.aFG + "," + localbfx.pTO;
      w.d("MicroMsg.SnsItemReportHelper", "report:%s", new Object[] { localObject2 });
      g.ork.A(11985, (String)localObject2);
      i += 1;
    }
    GMTrace.o(8131849486336L, 60587);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
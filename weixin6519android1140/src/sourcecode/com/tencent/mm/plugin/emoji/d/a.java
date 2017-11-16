package com.tencent.mm.plugin.emoji.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ao.a.b.e;
import com.tencent.mm.network.b.b;
import com.tencent.mm.network.u;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.net.HttpURLConnection;

public final class a
  implements com.tencent.mm.ao.a.c.b
{
  public a()
  {
    GMTrace.i(11541113995264L, 85988);
    GMTrace.o(11541113995264L, 85988);
  }
  
  /* Error */
  public final com.tencent.mm.ao.a.d.b ks(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 45
    //   3: ldc 47
    //   5: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 49	com/tencent/mm/network/b$b
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 52	com/tencent/mm/network/b$b:<init>	(Ljava/lang/String;)V
    //   16: astore 5
    //   18: aload 5
    //   20: getfield 56	com/tencent/mm/network/b$b:ip	Ljava/lang/String;
    //   23: invokestatic 62	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   26: ifne +774 -> 800
    //   29: aload 5
    //   31: getfield 56	com/tencent/mm/network/b$b:ip	Ljava/lang/String;
    //   34: astore_3
    //   35: aload 5
    //   37: getfield 56	com/tencent/mm/network/b$b:ip	Ljava/lang/String;
    //   40: astore 4
    //   42: aload 5
    //   44: getfield 66	com/tencent/mm/network/b$b:hgk	I
    //   47: istore_2
    //   48: aload_1
    //   49: aload 5
    //   51: invokestatic 70	com/tencent/mm/plugin/emoji/d/a$a:c	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/ao/a/d/b;
    //   54: astore 5
    //   56: ldc2_w 45
    //   59: ldc 47
    //   61: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   64: aload 5
    //   66: areturn
    //   67: astore 5
    //   69: ldc 72
    //   71: astore_3
    //   72: ldc 72
    //   74: astore 4
    //   76: iconst_0
    //   77: istore_2
    //   78: ldc 74
    //   80: ldc 76
    //   82: iconst_5
    //   83: anewarray 4	java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload_1
    //   89: aastore
    //   90: dup
    //   91: iconst_1
    //   92: aload_3
    //   93: aastore
    //   94: dup
    //   95: iconst_2
    //   96: aload 4
    //   98: aastore
    //   99: dup
    //   100: iconst_3
    //   101: iload_2
    //   102: invokestatic 82	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   105: aastore
    //   106: dup
    //   107: iconst_4
    //   108: aload 5
    //   110: invokestatic 86	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   113: aastore
    //   114: invokestatic 92	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: getstatic 98	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   120: ldc2_w 99
    //   123: ldc2_w 101
    //   126: lconst_1
    //   127: iconst_0
    //   128: invokevirtual 105	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   131: new 107	com/tencent/mm/ao/a/d/b
    //   134: dup
    //   135: aconst_null
    //   136: aconst_null
    //   137: invokespecial 110	com/tencent/mm/ao/a/d/b:<init>	([BLjava/lang/String;)V
    //   140: astore_1
    //   141: ldc2_w 45
    //   144: ldc 47
    //   146: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   149: aload_1
    //   150: areturn
    //   151: astore 5
    //   153: ldc 72
    //   155: astore_3
    //   156: ldc 72
    //   158: astore 4
    //   160: iconst_0
    //   161: istore_2
    //   162: ldc 74
    //   164: ldc 76
    //   166: iconst_5
    //   167: anewarray 4	java/lang/Object
    //   170: dup
    //   171: iconst_0
    //   172: aload_1
    //   173: aastore
    //   174: dup
    //   175: iconst_1
    //   176: aload_3
    //   177: aastore
    //   178: dup
    //   179: iconst_2
    //   180: aload 4
    //   182: aastore
    //   183: dup
    //   184: iconst_3
    //   185: iload_2
    //   186: invokestatic 82	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   189: aastore
    //   190: dup
    //   191: iconst_4
    //   192: aload 5
    //   194: invokestatic 86	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   197: aastore
    //   198: invokestatic 92	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: getstatic 98	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   204: ldc2_w 99
    //   207: lconst_0
    //   208: lconst_1
    //   209: iconst_0
    //   210: invokevirtual 105	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   213: goto -82 -> 131
    //   216: astore 5
    //   218: ldc 72
    //   220: astore_3
    //   221: ldc 72
    //   223: astore 4
    //   225: iconst_0
    //   226: istore_2
    //   227: ldc 74
    //   229: ldc 76
    //   231: iconst_5
    //   232: anewarray 4	java/lang/Object
    //   235: dup
    //   236: iconst_0
    //   237: aload_1
    //   238: aastore
    //   239: dup
    //   240: iconst_1
    //   241: aload_3
    //   242: aastore
    //   243: dup
    //   244: iconst_2
    //   245: aload 4
    //   247: aastore
    //   248: dup
    //   249: iconst_3
    //   250: iload_2
    //   251: invokestatic 82	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   254: aastore
    //   255: dup
    //   256: iconst_4
    //   257: aload 5
    //   259: invokestatic 86	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   262: aastore
    //   263: invokestatic 92	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   266: getstatic 98	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   269: ldc2_w 99
    //   272: lconst_1
    //   273: lconst_1
    //   274: iconst_0
    //   275: invokevirtual 105	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   278: goto -147 -> 131
    //   281: astore 5
    //   283: ldc 72
    //   285: astore_3
    //   286: ldc 72
    //   288: astore 4
    //   290: iconst_0
    //   291: istore_2
    //   292: ldc 74
    //   294: ldc 76
    //   296: iconst_5
    //   297: anewarray 4	java/lang/Object
    //   300: dup
    //   301: iconst_0
    //   302: aload_1
    //   303: aastore
    //   304: dup
    //   305: iconst_1
    //   306: aload_3
    //   307: aastore
    //   308: dup
    //   309: iconst_2
    //   310: aload 4
    //   312: aastore
    //   313: dup
    //   314: iconst_3
    //   315: iload_2
    //   316: invokestatic 82	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   319: aastore
    //   320: dup
    //   321: iconst_4
    //   322: aload 5
    //   324: invokestatic 86	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   327: aastore
    //   328: invokestatic 92	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   331: getstatic 98	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   334: ldc2_w 99
    //   337: ldc2_w 111
    //   340: lconst_1
    //   341: iconst_0
    //   342: invokevirtual 105	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   345: goto -214 -> 131
    //   348: astore 5
    //   350: ldc 72
    //   352: astore_3
    //   353: ldc 72
    //   355: astore 4
    //   357: iconst_0
    //   358: istore_2
    //   359: ldc 74
    //   361: ldc 76
    //   363: iconst_5
    //   364: anewarray 4	java/lang/Object
    //   367: dup
    //   368: iconst_0
    //   369: aload_1
    //   370: aastore
    //   371: dup
    //   372: iconst_1
    //   373: aload_3
    //   374: aastore
    //   375: dup
    //   376: iconst_2
    //   377: aload 4
    //   379: aastore
    //   380: dup
    //   381: iconst_3
    //   382: iload_2
    //   383: invokestatic 82	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   386: aastore
    //   387: dup
    //   388: iconst_4
    //   389: aload 5
    //   391: invokestatic 86	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   394: aastore
    //   395: invokestatic 92	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   398: getstatic 98	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   401: ldc2_w 99
    //   404: ldc2_w 113
    //   407: lconst_1
    //   408: iconst_0
    //   409: invokevirtual 105	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   412: goto -281 -> 131
    //   415: astore 5
    //   417: ldc 72
    //   419: astore_3
    //   420: ldc 72
    //   422: astore 4
    //   424: iconst_0
    //   425: istore_2
    //   426: ldc 74
    //   428: ldc 76
    //   430: iconst_5
    //   431: anewarray 4	java/lang/Object
    //   434: dup
    //   435: iconst_0
    //   436: aload_1
    //   437: aastore
    //   438: dup
    //   439: iconst_1
    //   440: aload_3
    //   441: aastore
    //   442: dup
    //   443: iconst_2
    //   444: aload 4
    //   446: aastore
    //   447: dup
    //   448: iconst_3
    //   449: iload_2
    //   450: invokestatic 82	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   453: aastore
    //   454: dup
    //   455: iconst_4
    //   456: aload 5
    //   458: invokestatic 86	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   461: aastore
    //   462: invokestatic 92	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   465: getstatic 98	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   468: ldc2_w 99
    //   471: ldc2_w 115
    //   474: lconst_1
    //   475: iconst_0
    //   476: invokevirtual 105	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   479: goto -348 -> 131
    //   482: astore 5
    //   484: ldc 72
    //   486: astore_3
    //   487: ldc 72
    //   489: astore 4
    //   491: iconst_0
    //   492: istore_2
    //   493: ldc 74
    //   495: ldc 76
    //   497: iconst_5
    //   498: anewarray 4	java/lang/Object
    //   501: dup
    //   502: iconst_0
    //   503: aload_1
    //   504: aastore
    //   505: dup
    //   506: iconst_1
    //   507: aload_3
    //   508: aastore
    //   509: dup
    //   510: iconst_2
    //   511: aload 4
    //   513: aastore
    //   514: dup
    //   515: iconst_3
    //   516: iload_2
    //   517: invokestatic 82	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   520: aastore
    //   521: dup
    //   522: iconst_4
    //   523: aload 5
    //   525: invokestatic 86	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   528: aastore
    //   529: invokestatic 92	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   532: getstatic 98	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   535: ldc2_w 99
    //   538: ldc2_w 117
    //   541: lconst_1
    //   542: iconst_0
    //   543: invokevirtual 105	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   546: goto -415 -> 131
    //   549: astore 5
    //   551: ldc 72
    //   553: astore_3
    //   554: ldc 72
    //   556: astore 4
    //   558: iconst_0
    //   559: istore_2
    //   560: ldc 74
    //   562: ldc 76
    //   564: iconst_5
    //   565: anewarray 4	java/lang/Object
    //   568: dup
    //   569: iconst_0
    //   570: aload_1
    //   571: aastore
    //   572: dup
    //   573: iconst_1
    //   574: aload_3
    //   575: aastore
    //   576: dup
    //   577: iconst_2
    //   578: aload 4
    //   580: aastore
    //   581: dup
    //   582: iconst_3
    //   583: iload_2
    //   584: invokestatic 82	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   587: aastore
    //   588: dup
    //   589: iconst_4
    //   590: aload 5
    //   592: invokestatic 86	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   595: aastore
    //   596: invokestatic 92	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   599: getstatic 98	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   602: ldc2_w 99
    //   605: ldc2_w 119
    //   608: lconst_1
    //   609: iconst_0
    //   610: invokevirtual 105	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   613: goto -482 -> 131
    //   616: astore 5
    //   618: ldc 72
    //   620: astore 4
    //   622: iconst_0
    //   623: istore_2
    //   624: goto -64 -> 560
    //   627: astore 5
    //   629: iconst_0
    //   630: istore_2
    //   631: goto -71 -> 560
    //   634: astore 5
    //   636: goto -76 -> 560
    //   639: astore 5
    //   641: ldc 72
    //   643: astore 4
    //   645: iconst_0
    //   646: istore_2
    //   647: goto -154 -> 493
    //   650: astore 5
    //   652: iconst_0
    //   653: istore_2
    //   654: goto -161 -> 493
    //   657: astore 5
    //   659: goto -166 -> 493
    //   662: astore 5
    //   664: ldc 72
    //   666: astore 4
    //   668: iconst_0
    //   669: istore_2
    //   670: goto -244 -> 426
    //   673: astore 5
    //   675: iconst_0
    //   676: istore_2
    //   677: goto -251 -> 426
    //   680: astore 5
    //   682: goto -256 -> 426
    //   685: astore 5
    //   687: ldc 72
    //   689: astore 4
    //   691: iconst_0
    //   692: istore_2
    //   693: goto -334 -> 359
    //   696: astore 5
    //   698: iconst_0
    //   699: istore_2
    //   700: goto -341 -> 359
    //   703: astore 5
    //   705: goto -346 -> 359
    //   708: astore 5
    //   710: ldc 72
    //   712: astore 4
    //   714: iconst_0
    //   715: istore_2
    //   716: goto -424 -> 292
    //   719: astore 5
    //   721: iconst_0
    //   722: istore_2
    //   723: goto -431 -> 292
    //   726: astore 5
    //   728: goto -436 -> 292
    //   731: astore 5
    //   733: ldc 72
    //   735: astore 4
    //   737: iconst_0
    //   738: istore_2
    //   739: goto -512 -> 227
    //   742: astore 5
    //   744: iconst_0
    //   745: istore_2
    //   746: goto -519 -> 227
    //   749: astore 5
    //   751: goto -524 -> 227
    //   754: astore 5
    //   756: ldc 72
    //   758: astore 4
    //   760: iconst_0
    //   761: istore_2
    //   762: goto -600 -> 162
    //   765: astore 5
    //   767: iconst_0
    //   768: istore_2
    //   769: goto -607 -> 162
    //   772: astore 5
    //   774: goto -612 -> 162
    //   777: astore 5
    //   779: ldc 72
    //   781: astore 4
    //   783: iconst_0
    //   784: istore_2
    //   785: goto -707 -> 78
    //   788: astore 5
    //   790: iconst_0
    //   791: istore_2
    //   792: goto -714 -> 78
    //   795: astore 5
    //   797: goto -719 -> 78
    //   800: ldc 72
    //   802: astore_3
    //   803: goto -768 -> 35
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	806	0	this	a
    //   0	806	1	paramString	String
    //   47	745	2	i	int
    //   34	769	3	str1	String
    //   40	742	4	str2	String
    //   16	49	5	localObject	Object
    //   67	42	5	localProtocolException1	java.net.ProtocolException
    //   151	42	5	localInterruptedException1	InterruptedException
    //   216	42	5	localUnknownHostException1	java.net.UnknownHostException
    //   281	42	5	localSSLHandshakeException1	javax.net.ssl.SSLHandshakeException
    //   348	42	5	localSocketException1	java.net.SocketException
    //   415	42	5	localSocketTimeoutException1	java.net.SocketTimeoutException
    //   482	42	5	localIOException1	java.io.IOException
    //   549	42	5	localException1	Exception
    //   616	1	5	localException2	Exception
    //   627	1	5	localException3	Exception
    //   634	1	5	localException4	Exception
    //   639	1	5	localIOException2	java.io.IOException
    //   650	1	5	localIOException3	java.io.IOException
    //   657	1	5	localIOException4	java.io.IOException
    //   662	1	5	localSocketTimeoutException2	java.net.SocketTimeoutException
    //   673	1	5	localSocketTimeoutException3	java.net.SocketTimeoutException
    //   680	1	5	localSocketTimeoutException4	java.net.SocketTimeoutException
    //   685	1	5	localSocketException2	java.net.SocketException
    //   696	1	5	localSocketException3	java.net.SocketException
    //   703	1	5	localSocketException4	java.net.SocketException
    //   708	1	5	localSSLHandshakeException2	javax.net.ssl.SSLHandshakeException
    //   719	1	5	localSSLHandshakeException3	javax.net.ssl.SSLHandshakeException
    //   726	1	5	localSSLHandshakeException4	javax.net.ssl.SSLHandshakeException
    //   731	1	5	localUnknownHostException2	java.net.UnknownHostException
    //   742	1	5	localUnknownHostException3	java.net.UnknownHostException
    //   749	1	5	localUnknownHostException4	java.net.UnknownHostException
    //   754	1	5	localInterruptedException2	InterruptedException
    //   765	1	5	localInterruptedException3	InterruptedException
    //   772	1	5	localInterruptedException4	InterruptedException
    //   777	1	5	localProtocolException2	java.net.ProtocolException
    //   788	1	5	localProtocolException3	java.net.ProtocolException
    //   795	1	5	localProtocolException4	java.net.ProtocolException
    // Exception table:
    //   from	to	target	type
    //   8	35	67	java/net/ProtocolException
    //   8	35	151	java/lang/InterruptedException
    //   8	35	216	java/net/UnknownHostException
    //   8	35	281	javax/net/ssl/SSLHandshakeException
    //   8	35	348	java/net/SocketException
    //   8	35	415	java/net/SocketTimeoutException
    //   8	35	482	java/io/IOException
    //   8	35	549	java/lang/Exception
    //   35	42	616	java/lang/Exception
    //   42	48	627	java/lang/Exception
    //   48	56	634	java/lang/Exception
    //   35	42	639	java/io/IOException
    //   42	48	650	java/io/IOException
    //   48	56	657	java/io/IOException
    //   35	42	662	java/net/SocketTimeoutException
    //   42	48	673	java/net/SocketTimeoutException
    //   48	56	680	java/net/SocketTimeoutException
    //   35	42	685	java/net/SocketException
    //   42	48	696	java/net/SocketException
    //   48	56	703	java/net/SocketException
    //   35	42	708	javax/net/ssl/SSLHandshakeException
    //   42	48	719	javax/net/ssl/SSLHandshakeException
    //   48	56	726	javax/net/ssl/SSLHandshakeException
    //   35	42	731	java/net/UnknownHostException
    //   42	48	742	java/net/UnknownHostException
    //   48	56	749	java/net/UnknownHostException
    //   35	42	754	java/lang/InterruptedException
    //   42	48	765	java/lang/InterruptedException
    //   48	56	772	java/lang/InterruptedException
    //   35	42	777	java/net/ProtocolException
    //   42	48	788	java/net/ProtocolException
    //   48	56	795	java/net/ProtocolException
  }
  
  static final class a
  {
    private static u b(String paramString, b.b paramb)
    {
      GMTrace.i(11541382430720L, 85990);
      paramb = com.tencent.mm.network.b.a(paramString, paramb);
      paramString = "";
      if (at.AU())
      {
        int i = d.tJC;
        at.AR();
        paramString = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d", new Object[] { Integer.valueOf(i), o.getString(c.ww()), Integer.valueOf(am.getNetTypeForStat(ab.getContext())), Integer.valueOf(am.getStrength(ab.getContext())) });
      }
      w.d("MicroMsg.emoji.EmojiDownloader.DefaultHttpClientFactory", "referer %s ", new Object[] { paramString });
      paramb.setRequestMethod("GET");
      paramb.setRequestProperty("referer", paramString);
      paramb.setConnectTimeout(15000);
      paramb.setReadTimeout(20000);
      GMTrace.o(11541382430720L, 85990);
      return paramb;
    }
    
    public static com.tencent.mm.ao.a.d.b c(String paramString, b.b paramb)
    {
      GMTrace.i(11541516648448L, 85991);
      u localu2 = b(paramString, paramb);
      if (localu2 == null) {
        w.i("MicroMsg.emoji.EmojiDownloader.DefaultHttpClientFactory", "open connection failed.");
      }
      u localu1 = localu2;
      b.b localb = paramb;
      if (localu2.getResponseCode() == 302) {}
      for (;;)
      {
        try
        {
          w.i("MicroMsg.emoji.EmojiDownloader.DefaultHttpClientFactory", "302 redirect: %s", new Object[] { paramString });
          String str = localu2.getHeaderField("location");
          localu1 = localu2;
          localb = paramb;
          if (!bg.nm(str)) {
            localb = new b.b(str);
          }
          int i;
          w.printErrStackTrace("MicroMsg.emoji.EmojiDownloader.DefaultHttpClientFactory", localException1, "httpURLConnectionGet 302 redirect", new Object[0]);
        }
        catch (Exception localException1)
        {
          try
          {
            localu2.hhh.disconnect();
            localu1 = b(str, localb);
            if (com.tencent.mm.network.b.a(localu1) == 0) {
              break;
            }
            i = localu1.getResponseCode();
            w.e("MicroMsg.emoji.EmojiDownloader.DefaultHttpClientFactory", "checkHttpConnection failed! url:%s urlIP:%s dnsServerIP:%s dnsType:%d retCode:%d", new Object[] { paramString, localb.ip, localb.ip, Integer.valueOf(localb.hgk), Integer.valueOf(i) });
            switch (i)
            {
            default: 
              g.ork.a(315L, 12L, 1L, false);
              GMTrace.o(11541516648448L, 85991);
              return null;
            }
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              paramb = (b.b)localObject;
              Object localObject = localException2;
            }
          }
          localException1 = localException1;
        }
        localu1 = localu2;
        localObject = paramb;
        continue;
        g.ork.a(315L, 8L, 1L, false);
        continue;
        g.ork.a(315L, 9L, 1L, false);
        continue;
        g.ork.a(315L, 10L, 1L, false);
        continue;
        g.ork.a(315L, 11L, 1L, false);
      }
      paramb = localu1.getInputStream();
      if (paramb == null)
      {
        w.d("MicroMsg.emoji.EmojiDownloader.DefaultHttpClientFactory", "getInputStream failed. url:%s", new Object[] { paramString });
        GMTrace.o(11541516648448L, 85991);
        return null;
      }
      paramString = localu1.hhh.getContentType();
      paramb = e.a(paramb, false);
      localu1.hhh.disconnect();
      paramString = new com.tencent.mm.ao.a.d.b(paramb, paramString);
      GMTrace.o(11541516648448L, 85991);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
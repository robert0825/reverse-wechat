package com.tencent.mm.pluginsdk.j.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.j.a.c.d;
import com.tencent.mm.pluginsdk.j.a.c.f;
import com.tencent.mm.pluginsdk.j.a.c.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Iterator;
import javax.net.ssl.SSLContext;

public final class j
{
  private static final Class[] trj;
  private static final Class[] trk;
  private static final Class[] trl;
  private boolean tri;
  
  static
  {
    GMTrace.i(871475707904L, 6493);
    trj = new Class[] { InterruptedException.class };
    trk = new Class[] { UnknownHostException.class, IllegalArgumentException.class, MalformedURLException.class, IOException.class, FileNotFoundException.class, com.tencent.mm.pluginsdk.j.a.c.a.class, d.class, g.class };
    trl = new Class[] { SocketException.class, SocketTimeoutException.class };
    GMTrace.o(871475707904L, 6493);
  }
  
  j()
  {
    GMTrace.i(870401966080L, 6485);
    this.tri = false;
    GMTrace.o(870401966080L, 6485);
  }
  
  private static SSLContext MO(String paramString)
  {
    GMTrace.i(870938836992L, 6489);
    try
    {
      paramString = SSLContext.getInstance(paramString);
      GMTrace.o(870938836992L, 6489);
      return paramString;
    }
    catch (Exception paramString)
    {
      GMTrace.o(870938836992L, 6489);
    }
    return null;
  }
  
  private static l a(e parame, Exception paramException)
  {
    GMTrace.i(871207272448L, 6491);
    int i = -1;
    Object localObject = paramException;
    if ((paramException instanceof f))
    {
      i = ((f)paramException).httpStatusCode;
      localObject = ((f)paramException).tqV;
    }
    w.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: download failed, caused by %s", new Object[] { parame.bJY(), localObject });
    parame = new l(parame, (Exception)localObject, i, 3);
    GMTrace.o(871207272448L, 6491);
    return parame;
  }
  
  /* Error */
  private static l a(e parame, HttpURLConnection paramHttpURLConnection, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc2_w 110
    //   3: sipush 6490
    //   6: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc 88
    //   11: ldc 113
    //   13: iconst_1
    //   14: anewarray 4	java/lang/Object
    //   17: dup
    //   18: iconst_0
    //   19: aload_0
    //   20: invokeinterface 96 1 0
    //   25: aastore
    //   26: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   29: aconst_null
    //   30: astore 21
    //   32: aconst_null
    //   33: astore 30
    //   35: aconst_null
    //   36: astore 31
    //   38: aconst_null
    //   39: astore 32
    //   41: aconst_null
    //   42: astore 33
    //   44: aconst_null
    //   45: astore 23
    //   47: aconst_null
    //   48: astore 34
    //   50: aconst_null
    //   51: astore 29
    //   53: aconst_null
    //   54: astore 25
    //   56: aconst_null
    //   57: astore 26
    //   59: aconst_null
    //   60: astore 27
    //   62: aconst_null
    //   63: astore 28
    //   65: aconst_null
    //   66: astore 24
    //   68: iconst_m1
    //   69: istore_3
    //   70: iload_3
    //   71: istore 4
    //   73: aload 34
    //   75: astore 20
    //   77: aload 21
    //   79: astore 22
    //   81: aload_1
    //   82: invokevirtual 119	java/net/HttpURLConnection:getResponseCode	()I
    //   85: istore 11
    //   87: iload_3
    //   88: istore 4
    //   90: aload 34
    //   92: astore 20
    //   94: aload 21
    //   96: astore 22
    //   98: aload_1
    //   99: invokevirtual 122	java/net/HttpURLConnection:getContentLength	()I
    //   102: istore 12
    //   104: iload_3
    //   105: istore 4
    //   107: aload 34
    //   109: astore 20
    //   111: aload 21
    //   113: astore 22
    //   115: aload_1
    //   116: invokevirtual 125	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   119: astore 36
    //   121: iload_3
    //   122: istore 4
    //   124: aload 34
    //   126: astore 20
    //   128: aload 21
    //   130: astore 22
    //   132: aload_1
    //   133: invokevirtual 128	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
    //   136: astore 35
    //   138: iload_3
    //   139: istore 4
    //   141: aload 34
    //   143: astore 20
    //   145: aload 21
    //   147: astore 22
    //   149: ldc -126
    //   151: aload_1
    //   152: ldc -124
    //   154: invokevirtual 136	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   157: invokevirtual 142	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   160: ifeq +201 -> 361
    //   163: iconst_1
    //   164: istore 14
    //   166: iload_3
    //   167: istore 4
    //   169: aload 34
    //   171: astore 20
    //   173: aload 21
    //   175: astore 22
    //   177: ldc 88
    //   179: ldc -112
    //   181: bipush 7
    //   183: anewarray 4	java/lang/Object
    //   186: dup
    //   187: iconst_0
    //   188: aload_0
    //   189: invokeinterface 96 1 0
    //   194: aastore
    //   195: dup
    //   196: iconst_1
    //   197: iload 11
    //   199: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   202: aastore
    //   203: dup
    //   204: iconst_2
    //   205: iload 12
    //   207: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   210: aastore
    //   211: dup
    //   212: iconst_3
    //   213: aload 36
    //   215: aastore
    //   216: dup
    //   217: iconst_4
    //   218: aload 35
    //   220: aastore
    //   221: dup
    //   222: iconst_5
    //   223: iload 14
    //   225: invokestatic 155	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   228: aastore
    //   229: dup
    //   230: bipush 6
    //   232: aload_1
    //   233: invokevirtual 159	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   236: invokestatic 165	com/tencent/mm/pluginsdk/j/a/e/b:ae	(Ljava/util/Map;)Ljava/lang/String;
    //   239: aastore
    //   240: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   243: iload_3
    //   244: istore 4
    //   246: aload 34
    //   248: astore 20
    //   250: aload 21
    //   252: astore 22
    //   254: aload_0
    //   255: invokeinterface 168 1 0
    //   260: invokestatic 174	com/tencent/mm/pluginsdk/j/a/e/a:DI	(Ljava/lang/String;)J
    //   263: lstore 16
    //   265: iload 12
    //   267: ifne +1646 -> 1913
    //   270: sipush 206
    //   273: iload 11
    //   275: if_icmpne +1638 -> 1913
    //   278: lload 16
    //   280: lconst_0
    //   281: lcmp
    //   282: ifle +1631 -> 1913
    //   285: iload_3
    //   286: istore 4
    //   288: aload 34
    //   290: astore 20
    //   292: aload 21
    //   294: astore 22
    //   296: ldc 88
    //   298: ldc -80
    //   300: iconst_1
    //   301: anewarray 4	java/lang/Object
    //   304: dup
    //   305: iconst_0
    //   306: aload_0
    //   307: invokeinterface 96 1 0
    //   312: aastore
    //   313: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   316: iload_3
    //   317: istore 4
    //   319: aload 34
    //   321: astore 20
    //   323: aload 21
    //   325: astore 22
    //   327: new 103	com/tencent/mm/pluginsdk/j/a/d/l
    //   330: dup
    //   331: aload_0
    //   332: lload 16
    //   334: aload 35
    //   336: invokespecial 179	com/tencent/mm/pluginsdk/j/a/d/l:<init>	(Lcom/tencent/mm/pluginsdk/j/a/d/e;JLjava/lang/String;)V
    //   339: astore 21
    //   341: aconst_null
    //   342: invokestatic 183	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   345: aconst_null
    //   346: invokestatic 183	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   349: ldc2_w 110
    //   352: sipush 6490
    //   355: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   358: aload 21
    //   360: areturn
    //   361: iload_3
    //   362: istore 4
    //   364: aload 34
    //   366: astore 20
    //   368: aload 21
    //   370: astore 22
    //   372: aload_1
    //   373: ldc -71
    //   375: invokevirtual 136	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   378: astore 37
    //   380: aload 37
    //   382: ifnull +1525 -> 1907
    //   385: iload_3
    //   386: istore 4
    //   388: aload 34
    //   390: astore 20
    //   392: aload 21
    //   394: astore 22
    //   396: aload 37
    //   398: ldc -126
    //   400: invokevirtual 189	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   403: ifeq +1504 -> 1907
    //   406: iconst_1
    //   407: istore 14
    //   409: goto -243 -> 166
    //   412: iload_3
    //   413: istore 4
    //   415: aload 34
    //   417: astore 20
    //   419: aload 21
    //   421: astore 22
    //   423: aload_0
    //   424: invokeinterface 193 1 0
    //   429: ifne +103 -> 532
    //   432: iload_3
    //   433: istore 4
    //   435: aload 34
    //   437: astore 20
    //   439: aload 21
    //   441: astore 22
    //   443: ldc 88
    //   445: ldc -61
    //   447: iconst_1
    //   448: anewarray 4	java/lang/Object
    //   451: dup
    //   452: iconst_0
    //   453: aload_0
    //   454: invokeinterface 96 1 0
    //   459: aastore
    //   460: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   463: iload_3
    //   464: istore 4
    //   466: aload 34
    //   468: astore 20
    //   470: aload 21
    //   472: astore 22
    //   474: new 40	com/tencent/mm/pluginsdk/j/a/c/d
    //   477: dup
    //   478: invokespecial 196	com/tencent/mm/pluginsdk/j/a/c/d:<init>	()V
    //   481: athrow
    //   482: astore_0
    //   483: aload 23
    //   485: astore 22
    //   487: aload 24
    //   489: astore 20
    //   491: iload_3
    //   492: istore 4
    //   494: aload_0
    //   495: athrow
    //   496: astore_0
    //   497: iload 4
    //   499: istore_3
    //   500: aload 22
    //   502: invokestatic 183	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   505: aload 20
    //   507: invokestatic 183	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   510: iload_3
    //   511: ifle +19 -> 530
    //   514: getstatic 202	com/tencent/mm/y/ak$a:gmY	Lcom/tencent/mm/y/ak$e;
    //   517: ifnull +13 -> 530
    //   520: getstatic 202	com/tencent/mm/y/ak$a:gmY	Lcom/tencent/mm/y/ak$e;
    //   523: iload_3
    //   524: iconst_0
    //   525: invokeinterface 208 3 0
    //   530: aload_0
    //   531: athrow
    //   532: iload 12
    //   534: ifne +36 -> 570
    //   537: iload_3
    //   538: istore 4
    //   540: aload 34
    //   542: astore 20
    //   544: aload 21
    //   546: astore 22
    //   548: new 42	com/tencent/mm/pluginsdk/j/a/c/g
    //   551: dup
    //   552: invokespecial 209	com/tencent/mm/pluginsdk/j/a/c/g:<init>	()V
    //   555: athrow
    //   556: astore_0
    //   557: aload 30
    //   559: astore 22
    //   561: aload 25
    //   563: astore 20
    //   565: iload_3
    //   566: istore 4
    //   568: aload_0
    //   569: athrow
    //   570: iload_3
    //   571: istore 4
    //   573: aload 34
    //   575: astore 20
    //   577: aload 21
    //   579: astore 22
    //   581: aload_0
    //   582: invokeinterface 212 1 0
    //   587: ifne +102 -> 689
    //   590: iload 12
    //   592: ifge +97 -> 689
    //   595: iload_3
    //   596: istore 4
    //   598: aload 34
    //   600: astore 20
    //   602: aload 21
    //   604: astore 22
    //   606: new 46	java/net/SocketException
    //   609: dup
    //   610: invokespecial 213	java/net/SocketException:<init>	()V
    //   613: athrow
    //   614: astore 21
    //   616: aload 31
    //   618: astore_1
    //   619: aload 26
    //   621: astore 23
    //   623: iload_3
    //   624: istore 4
    //   626: aload 23
    //   628: astore 20
    //   630: aload_1
    //   631: astore 22
    //   633: ldc 88
    //   635: ldc -41
    //   637: iconst_1
    //   638: anewarray 4	java/lang/Object
    //   641: dup
    //   642: iconst_0
    //   643: aload_0
    //   644: invokeinterface 96 1 0
    //   649: aastore
    //   650: invokestatic 218	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   653: iload_3
    //   654: istore 4
    //   656: aload 23
    //   658: astore 20
    //   660: aload_1
    //   661: astore 22
    //   663: ldc 88
    //   665: aload 21
    //   667: ldc -36
    //   669: iconst_0
    //   670: anewarray 4	java/lang/Object
    //   673: invokestatic 224	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   676: iload_3
    //   677: istore 4
    //   679: aload 23
    //   681: astore 20
    //   683: aload_1
    //   684: astore 22
    //   686: aload 21
    //   688: athrow
    //   689: iload 12
    //   691: ifle +118 -> 809
    //   694: iload 12
    //   696: i2l
    //   697: lstore 18
    //   699: iload_3
    //   700: istore 4
    //   702: aload 34
    //   704: astore 20
    //   706: aload 21
    //   708: astore 22
    //   710: aload_0
    //   711: lload 18
    //   713: invokeinterface 228 3 0
    //   718: ifne +91 -> 809
    //   721: iload_3
    //   722: istore 4
    //   724: aload 34
    //   726: astore 20
    //   728: aload 21
    //   730: astore 22
    //   732: new 38	com/tencent/mm/pluginsdk/j/a/c/a
    //   735: dup
    //   736: invokespecial 229	com/tencent/mm/pluginsdk/j/a/c/a:<init>	()V
    //   739: athrow
    //   740: astore 21
    //   742: aload 32
    //   744: astore_1
    //   745: aload 27
    //   747: astore 23
    //   749: iload_3
    //   750: istore 4
    //   752: aload 23
    //   754: astore 20
    //   756: aload_1
    //   757: astore 22
    //   759: ldc 88
    //   761: new 231	java/lang/StringBuilder
    //   764: dup
    //   765: invokespecial 232	java/lang/StringBuilder:<init>	()V
    //   768: aload_0
    //   769: invokeinterface 96 1 0
    //   774: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   777: ldc -18
    //   779: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   782: aload 21
    //   784: invokevirtual 241	java/net/SocketException:getMessage	()Ljava/lang/String;
    //   787: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   790: invokevirtual 244	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   793: invokestatic 247	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   796: iload_3
    //   797: istore 4
    //   799: aload 23
    //   801: astore 20
    //   803: aload_1
    //   804: astore 22
    //   806: aload 21
    //   808: athrow
    //   809: sipush 416
    //   812: iload 11
    //   814: if_icmpne +41 -> 855
    //   817: iload_3
    //   818: istore 4
    //   820: aload 34
    //   822: astore 20
    //   824: aload 21
    //   826: astore 22
    //   828: new 249	com/tencent/mm/pluginsdk/j/a/c/b
    //   831: dup
    //   832: iload 12
    //   834: i2l
    //   835: lload 16
    //   837: invokespecial 252	com/tencent/mm/pluginsdk/j/a/c/b:<init>	(JJ)V
    //   840: athrow
    //   841: astore_0
    //   842: aload 33
    //   844: astore 22
    //   846: aload 28
    //   848: astore 20
    //   850: iload_3
    //   851: istore 4
    //   853: aload_0
    //   854: athrow
    //   855: iload_3
    //   856: istore 4
    //   858: aload 34
    //   860: astore 20
    //   862: aload 21
    //   864: astore 22
    //   866: new 254	java/io/BufferedInputStream
    //   869: dup
    //   870: aload_1
    //   871: invokevirtual 258	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   874: invokespecial 261	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   877: astore 21
    //   879: aload 21
    //   881: astore 20
    //   883: aload 21
    //   885: astore 23
    //   887: aload 36
    //   889: invokestatic 266	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   892: ifne +37 -> 929
    //   895: aload 21
    //   897: astore 20
    //   899: aload 21
    //   901: astore 23
    //   903: aload 36
    //   905: ldc_w 268
    //   908: invokevirtual 271	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   911: ifeq +18 -> 929
    //   914: aload 21
    //   916: astore 23
    //   918: new 273	java/util/zip/GZIPInputStream
    //   921: dup
    //   922: aload 21
    //   924: invokespecial 274	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   927: astore 20
    //   929: aload 20
    //   931: astore 23
    //   933: aload_0
    //   934: invokeinterface 168 1 0
    //   939: astore 21
    //   941: aload 20
    //   943: astore 23
    //   945: aload_0
    //   946: invokeinterface 96 1 0
    //   951: astore 22
    //   953: iload_2
    //   954: ifeq +990 -> 1944
    //   957: iload 14
    //   959: ifeq +985 -> 1944
    //   962: iconst_1
    //   963: istore 15
    //   965: aload 20
    //   967: astore 23
    //   969: ldc 88
    //   971: ldc_w 276
    //   974: iconst_2
    //   975: anewarray 4	java/lang/Object
    //   978: dup
    //   979: iconst_0
    //   980: aload 22
    //   982: aastore
    //   983: dup
    //   984: iconst_1
    //   985: aload 21
    //   987: aastore
    //   988: invokestatic 279	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   991: aload 20
    //   993: astore 23
    //   995: aload 21
    //   997: invokestatic 266	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   1000: ifeq +30 -> 1030
    //   1003: aload 20
    //   1005: astore 23
    //   1007: new 36	java/io/FileNotFoundException
    //   1010: dup
    //   1011: ldc_w 281
    //   1014: iconst_1
    //   1015: anewarray 4	java/lang/Object
    //   1018: dup
    //   1019: iconst_0
    //   1020: aload 22
    //   1022: aastore
    //   1023: invokestatic 285	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1026: invokespecial 288	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   1029: athrow
    //   1030: aload 20
    //   1032: astore 23
    //   1034: new 290	java/io/BufferedOutputStream
    //   1037: dup
    //   1038: new 292	java/io/FileOutputStream
    //   1041: dup
    //   1042: aload 21
    //   1044: iload 15
    //   1046: invokespecial 295	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   1049: invokespecial 298	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   1052: astore 21
    //   1054: iload_3
    //   1055: istore 4
    //   1057: iload_3
    //   1058: istore 5
    //   1060: iload_3
    //   1061: istore 6
    //   1063: iload_3
    //   1064: istore 7
    //   1066: iload_3
    //   1067: istore 8
    //   1069: iload_3
    //   1070: istore 9
    //   1072: iload_3
    //   1073: istore 10
    //   1075: ldc 88
    //   1077: ldc_w 300
    //   1080: iconst_3
    //   1081: anewarray 4	java/lang/Object
    //   1084: dup
    //   1085: iconst_0
    //   1086: aload_0
    //   1087: invokeinterface 96 1 0
    //   1092: aastore
    //   1093: dup
    //   1094: iconst_1
    //   1095: iload_2
    //   1096: invokestatic 155	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1099: aastore
    //   1100: dup
    //   1101: iconst_2
    //   1102: iload 14
    //   1104: invokestatic 155	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1107: aastore
    //   1108: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1111: iload_3
    //   1112: istore 4
    //   1114: iload_3
    //   1115: istore 5
    //   1117: iload_3
    //   1118: istore 6
    //   1120: iload_3
    //   1121: istore 7
    //   1123: iload_3
    //   1124: istore 8
    //   1126: iload_3
    //   1127: istore 9
    //   1129: iload_3
    //   1130: istore 10
    //   1132: sipush 16384
    //   1135: newarray <illegal type>
    //   1137: astore 22
    //   1139: iconst_0
    //   1140: istore_3
    //   1141: iload_3
    //   1142: istore 4
    //   1144: iload_3
    //   1145: istore 5
    //   1147: iload_3
    //   1148: istore 6
    //   1150: iload_3
    //   1151: istore 7
    //   1153: iload_3
    //   1154: istore 8
    //   1156: iload_3
    //   1157: istore 9
    //   1159: iload_3
    //   1160: istore 10
    //   1162: aload 20
    //   1164: aload 22
    //   1166: iconst_0
    //   1167: sipush 16384
    //   1170: invokevirtual 306	java/io/InputStream:read	([BII)I
    //   1173: istore 13
    //   1175: iload 13
    //   1177: iconst_m1
    //   1178: if_icmpeq +66 -> 1244
    //   1181: iload_3
    //   1182: istore 4
    //   1184: iload_3
    //   1185: istore 5
    //   1187: iload_3
    //   1188: istore 6
    //   1190: iload_3
    //   1191: istore 7
    //   1193: iload_3
    //   1194: istore 8
    //   1196: iload_3
    //   1197: istore 9
    //   1199: iload_3
    //   1200: istore 10
    //   1202: aload 21
    //   1204: aload 22
    //   1206: iconst_0
    //   1207: iload 13
    //   1209: invokevirtual 312	java/io/OutputStream:write	([BII)V
    //   1212: iload_3
    //   1213: iload 13
    //   1215: iadd
    //   1216: istore_3
    //   1217: iload_3
    //   1218: istore 4
    //   1220: iload_3
    //   1221: istore 5
    //   1223: iload_3
    //   1224: istore 6
    //   1226: iload_3
    //   1227: istore 7
    //   1229: iload_3
    //   1230: istore 8
    //   1232: iload_3
    //   1233: istore 9
    //   1235: iload_3
    //   1236: istore 10
    //   1238: invokestatic 315	com/tencent/mm/pluginsdk/j/a/d/j:bKo	()V
    //   1241: goto -100 -> 1141
    //   1244: iload_3
    //   1245: istore 4
    //   1247: iload_3
    //   1248: istore 5
    //   1250: iload_3
    //   1251: istore 6
    //   1253: iload_3
    //   1254: istore 7
    //   1256: iload_3
    //   1257: istore 8
    //   1259: iload_3
    //   1260: istore 9
    //   1262: iload_3
    //   1263: istore 10
    //   1265: ldc 88
    //   1267: ldc_w 317
    //   1270: iconst_2
    //   1271: anewarray 4	java/lang/Object
    //   1274: dup
    //   1275: iconst_0
    //   1276: aload_0
    //   1277: invokeinterface 96 1 0
    //   1282: aastore
    //   1283: dup
    //   1284: iconst_1
    //   1285: iload_3
    //   1286: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1289: aastore
    //   1290: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1293: iload_3
    //   1294: istore 4
    //   1296: iload_3
    //   1297: istore 5
    //   1299: iload_3
    //   1300: istore 6
    //   1302: iload_3
    //   1303: istore 7
    //   1305: iload_3
    //   1306: istore 8
    //   1308: iload_3
    //   1309: istore 9
    //   1311: iload_3
    //   1312: istore 10
    //   1314: aload 21
    //   1316: invokevirtual 320	java/io/OutputStream:flush	()V
    //   1319: iload_3
    //   1320: istore 4
    //   1322: iload_3
    //   1323: istore 5
    //   1325: iload_3
    //   1326: istore 6
    //   1328: iload_3
    //   1329: istore 7
    //   1331: iload_3
    //   1332: istore 8
    //   1334: iload_3
    //   1335: istore 9
    //   1337: iload_3
    //   1338: istore 10
    //   1340: ldc 88
    //   1342: ldc_w 322
    //   1345: iconst_1
    //   1346: anewarray 4	java/lang/Object
    //   1349: dup
    //   1350: iconst_0
    //   1351: aload_0
    //   1352: invokeinterface 96 1 0
    //   1357: aastore
    //   1358: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1361: iload_3
    //   1362: istore 4
    //   1364: iload_3
    //   1365: istore 5
    //   1367: iload_3
    //   1368: istore 6
    //   1370: iload_3
    //   1371: istore 7
    //   1373: iload_3
    //   1374: istore 8
    //   1376: iload_3
    //   1377: istore 9
    //   1379: iload_3
    //   1380: istore 10
    //   1382: aload_0
    //   1383: invokeinterface 212 1 0
    //   1388: ifeq +87 -> 1475
    //   1391: iload_3
    //   1392: istore 4
    //   1394: iload_3
    //   1395: istore 5
    //   1397: iload_3
    //   1398: istore 6
    //   1400: iload_3
    //   1401: istore 7
    //   1403: iload_3
    //   1404: istore 8
    //   1406: iload_3
    //   1407: istore 9
    //   1409: iload_3
    //   1410: istore 10
    //   1412: new 103	com/tencent/mm/pluginsdk/j/a/d/l
    //   1415: dup
    //   1416: aload_0
    //   1417: aload_0
    //   1418: invokeinterface 168 1 0
    //   1423: invokestatic 174	com/tencent/mm/pluginsdk/j/a/e/a:DI	(Ljava/lang/String;)J
    //   1426: aload 35
    //   1428: invokespecial 179	com/tencent/mm/pluginsdk/j/a/d/l:<init>	(Lcom/tencent/mm/pluginsdk/j/a/d/e;JLjava/lang/String;)V
    //   1431: astore 22
    //   1433: aload 20
    //   1435: invokestatic 183	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   1438: aload 21
    //   1440: invokestatic 183	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   1443: iload_3
    //   1444: ifle +19 -> 1463
    //   1447: getstatic 202	com/tencent/mm/y/ak$a:gmY	Lcom/tencent/mm/y/ak$e;
    //   1450: ifnull +13 -> 1463
    //   1453: getstatic 202	com/tencent/mm/y/ak$a:gmY	Lcom/tencent/mm/y/ak$e;
    //   1456: iload_3
    //   1457: iconst_0
    //   1458: invokeinterface 208 3 0
    //   1463: ldc2_w 110
    //   1466: sipush 6490
    //   1469: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1472: aload 22
    //   1474: areturn
    //   1475: iload_3
    //   1476: istore 4
    //   1478: iload_3
    //   1479: istore 5
    //   1481: iload_3
    //   1482: istore 6
    //   1484: iload_3
    //   1485: istore 7
    //   1487: iload_3
    //   1488: istore 8
    //   1490: iload_3
    //   1491: istore 9
    //   1493: iload_3
    //   1494: istore 10
    //   1496: new 103	com/tencent/mm/pluginsdk/j/a/d/l
    //   1499: dup
    //   1500: aload_0
    //   1501: iload 12
    //   1503: i2l
    //   1504: aload 35
    //   1506: invokespecial 179	com/tencent/mm/pluginsdk/j/a/d/l:<init>	(Lcom/tencent/mm/pluginsdk/j/a/d/e;JLjava/lang/String;)V
    //   1509: astore 22
    //   1511: aload 20
    //   1513: invokestatic 183	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   1516: aload 21
    //   1518: invokestatic 183	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   1521: iload_3
    //   1522: ifle +19 -> 1541
    //   1525: getstatic 202	com/tencent/mm/y/ak$a:gmY	Lcom/tencent/mm/y/ak$e;
    //   1528: ifnull +13 -> 1541
    //   1531: getstatic 202	com/tencent/mm/y/ak$a:gmY	Lcom/tencent/mm/y/ak$e;
    //   1534: iload_3
    //   1535: iconst_0
    //   1536: invokeinterface 208 3 0
    //   1541: ldc2_w 110
    //   1544: sipush 6490
    //   1547: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1550: aload 22
    //   1552: areturn
    //   1553: astore 22
    //   1555: aconst_null
    //   1556: astore 20
    //   1558: aconst_null
    //   1559: astore 21
    //   1561: iconst_m1
    //   1562: istore_3
    //   1563: iconst_m1
    //   1564: istore 4
    //   1566: aload 20
    //   1568: invokestatic 183	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   1571: aload_1
    //   1572: invokevirtual 325	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   1575: astore_1
    //   1576: ldc 88
    //   1578: ldc_w 327
    //   1581: iconst_2
    //   1582: anewarray 4	java/lang/Object
    //   1585: dup
    //   1586: iconst_0
    //   1587: aload_0
    //   1588: invokeinterface 96 1 0
    //   1593: aastore
    //   1594: dup
    //   1595: iconst_1
    //   1596: aload 22
    //   1598: aastore
    //   1599: invokestatic 218	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1602: new 78	com/tencent/mm/pluginsdk/j/a/c/f
    //   1605: dup
    //   1606: iload 4
    //   1608: aload 22
    //   1610: invokespecial 330	com/tencent/mm/pluginsdk/j/a/c/f:<init>	(ILjava/io/IOException;)V
    //   1613: athrow
    //   1614: astore_0
    //   1615: aload 21
    //   1617: astore 20
    //   1619: aload_1
    //   1620: astore 22
    //   1622: goto -1122 -> 500
    //   1625: astore_0
    //   1626: aload 29
    //   1628: astore 20
    //   1630: aload 21
    //   1632: astore 22
    //   1634: goto -1134 -> 500
    //   1637: astore_0
    //   1638: aload 20
    //   1640: astore 22
    //   1642: aload 29
    //   1644: astore 20
    //   1646: goto -1146 -> 500
    //   1649: astore_0
    //   1650: aload 20
    //   1652: astore 22
    //   1654: iload 4
    //   1656: istore_3
    //   1657: aload 21
    //   1659: astore 20
    //   1661: goto -1161 -> 500
    //   1664: astore_0
    //   1665: aload 20
    //   1667: astore 22
    //   1669: aload 21
    //   1671: astore 20
    //   1673: goto -1173 -> 500
    //   1676: astore 22
    //   1678: aconst_null
    //   1679: astore 20
    //   1681: aconst_null
    //   1682: astore 21
    //   1684: iconst_m1
    //   1685: istore_3
    //   1686: iload 11
    //   1688: istore 4
    //   1690: goto -124 -> 1566
    //   1693: astore 22
    //   1695: aconst_null
    //   1696: astore 21
    //   1698: iconst_m1
    //   1699: istore_3
    //   1700: iload 11
    //   1702: istore 4
    //   1704: aload 23
    //   1706: astore 20
    //   1708: goto -142 -> 1566
    //   1711: astore 22
    //   1713: iload 5
    //   1715: istore_3
    //   1716: iload 11
    //   1718: istore 4
    //   1720: goto -154 -> 1566
    //   1723: astore_0
    //   1724: aload 28
    //   1726: astore 20
    //   1728: aload 21
    //   1730: astore 22
    //   1732: goto -882 -> 850
    //   1735: astore_0
    //   1736: aload 20
    //   1738: astore 22
    //   1740: aload 28
    //   1742: astore 20
    //   1744: goto -894 -> 850
    //   1747: astore_0
    //   1748: aload 20
    //   1750: astore 22
    //   1752: iload 6
    //   1754: istore_3
    //   1755: aload 21
    //   1757: astore 20
    //   1759: goto -909 -> 850
    //   1762: astore 20
    //   1764: aload 21
    //   1766: astore_1
    //   1767: aload 20
    //   1769: astore 21
    //   1771: aload 27
    //   1773: astore 23
    //   1775: goto -1026 -> 749
    //   1778: astore 21
    //   1780: aload 20
    //   1782: astore_1
    //   1783: aload 27
    //   1785: astore 23
    //   1787: goto -1038 -> 749
    //   1790: astore 22
    //   1792: aload 21
    //   1794: astore 23
    //   1796: aload 20
    //   1798: astore_1
    //   1799: aload 22
    //   1801: astore 21
    //   1803: iload 7
    //   1805: istore_3
    //   1806: goto -1057 -> 749
    //   1809: astore 20
    //   1811: aload 21
    //   1813: astore_1
    //   1814: aload 20
    //   1816: astore 21
    //   1818: aload 26
    //   1820: astore 23
    //   1822: goto -1199 -> 623
    //   1825: astore 21
    //   1827: aload 20
    //   1829: astore_1
    //   1830: aload 26
    //   1832: astore 23
    //   1834: goto -1211 -> 623
    //   1837: astore 22
    //   1839: aload 21
    //   1841: astore 23
    //   1843: aload 20
    //   1845: astore_1
    //   1846: aload 22
    //   1848: astore 21
    //   1850: iload 8
    //   1852: istore_3
    //   1853: goto -1230 -> 623
    //   1856: astore_0
    //   1857: aload 25
    //   1859: astore 20
    //   1861: aload 21
    //   1863: astore 22
    //   1865: goto -1300 -> 565
    //   1868: astore_0
    //   1869: aload 20
    //   1871: astore 22
    //   1873: aload 25
    //   1875: astore 20
    //   1877: goto -1312 -> 565
    //   1880: astore_0
    //   1881: aload 20
    //   1883: astore 22
    //   1885: iload 9
    //   1887: istore_3
    //   1888: aload 21
    //   1890: astore 20
    //   1892: goto -1327 -> 565
    //   1895: astore_0
    //   1896: aload 24
    //   1898: astore 20
    //   1900: aload 21
    //   1902: astore 22
    //   1904: goto -1413 -> 491
    //   1907: iconst_0
    //   1908: istore 14
    //   1910: goto -1744 -> 166
    //   1913: sipush 301
    //   1916: iload 11
    //   1918: if_icmpeq -1506 -> 412
    //   1921: sipush 302
    //   1924: iload 11
    //   1926: if_icmpne -1394 -> 532
    //   1929: goto -1517 -> 412
    //   1932: astore_0
    //   1933: aload 20
    //   1935: astore 22
    //   1937: aload 24
    //   1939: astore 20
    //   1941: goto -1450 -> 491
    //   1944: iconst_0
    //   1945: istore 15
    //   1947: goto -982 -> 965
    //   1950: astore_0
    //   1951: aload 20
    //   1953: astore 22
    //   1955: iload 10
    //   1957: istore_3
    //   1958: aload 21
    //   1960: astore 20
    //   1962: goto -1471 -> 491
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1965	0	parame	e
    //   0	1965	1	paramHttpURLConnection	HttpURLConnection
    //   0	1965	2	paramBoolean	boolean
    //   69	1889	3	i	int
    //   71	1648	4	j	int
    //   1058	656	5	k	int
    //   1061	692	6	m	int
    //   1064	740	7	n	int
    //   1067	784	8	i1	int
    //   1070	816	9	i2	int
    //   1073	883	10	i3	int
    //   85	1842	11	i4	int
    //   102	1400	12	i5	int
    //   1173	43	13	i6	int
    //   164	1745	14	bool1	boolean
    //   963	983	15	bool2	boolean
    //   263	573	16	l1	long
    //   697	15	18	l2	long
    //   75	1683	20	localObject1	Object
    //   1762	35	20	localSocketException1	SocketException
    //   1809	35	20	localSSLHandshakeException1	javax.net.ssl.SSLHandshakeException
    //   1859	102	20	localObject2	Object
    //   30	573	21	locall	l
    //   614	115	21	localSSLHandshakeException2	javax.net.ssl.SSLHandshakeException
    //   740	123	21	localSocketException2	SocketException
    //   877	893	21	localObject3	Object
    //   1778	15	21	localSocketException3	SocketException
    //   1801	16	21	localObject4	Object
    //   1825	15	21	localSSLHandshakeException3	javax.net.ssl.SSLHandshakeException
    //   1848	111	21	localObject5	Object
    //   79	1472	22	localObject6	Object
    //   1553	56	22	localIOException1	IOException
    //   1620	48	22	localObject7	Object
    //   1676	1	22	localIOException2	IOException
    //   1693	1	22	localIOException3	IOException
    //   1711	1	22	localIOException4	IOException
    //   1730	21	22	localObject8	Object
    //   1790	10	22	localSocketException4	SocketException
    //   1837	10	22	localSSLHandshakeException4	javax.net.ssl.SSLHandshakeException
    //   1863	91	22	localObject9	Object
    //   45	1797	23	localObject10	Object
    //   66	1872	24	localObject11	Object
    //   54	1820	25	localObject12	Object
    //   57	1774	26	localObject13	Object
    //   60	1724	27	localObject14	Object
    //   63	1678	28	localObject15	Object
    //   51	1592	29	localObject16	Object
    //   33	525	30	localObject17	Object
    //   36	581	31	localObject18	Object
    //   39	704	32	localObject19	Object
    //   42	801	33	localObject20	Object
    //   48	811	34	localObject21	Object
    //   136	1369	35	str1	String
    //   119	785	36	str2	String
    //   378	19	37	str3	String
    // Exception table:
    //   from	to	target	type
    //   81	87	482	java/lang/InterruptedException
    //   98	104	482	java/lang/InterruptedException
    //   115	121	482	java/lang/InterruptedException
    //   132	138	482	java/lang/InterruptedException
    //   149	163	482	java/lang/InterruptedException
    //   177	243	482	java/lang/InterruptedException
    //   254	265	482	java/lang/InterruptedException
    //   296	316	482	java/lang/InterruptedException
    //   327	341	482	java/lang/InterruptedException
    //   372	380	482	java/lang/InterruptedException
    //   396	406	482	java/lang/InterruptedException
    //   423	432	482	java/lang/InterruptedException
    //   443	463	482	java/lang/InterruptedException
    //   474	482	482	java/lang/InterruptedException
    //   548	556	482	java/lang/InterruptedException
    //   581	590	482	java/lang/InterruptedException
    //   606	614	482	java/lang/InterruptedException
    //   710	721	482	java/lang/InterruptedException
    //   732	740	482	java/lang/InterruptedException
    //   828	841	482	java/lang/InterruptedException
    //   866	879	482	java/lang/InterruptedException
    //   81	87	496	finally
    //   98	104	496	finally
    //   115	121	496	finally
    //   132	138	496	finally
    //   149	163	496	finally
    //   177	243	496	finally
    //   254	265	496	finally
    //   296	316	496	finally
    //   327	341	496	finally
    //   372	380	496	finally
    //   396	406	496	finally
    //   423	432	496	finally
    //   443	463	496	finally
    //   474	482	496	finally
    //   494	496	496	finally
    //   548	556	496	finally
    //   568	570	496	finally
    //   581	590	496	finally
    //   606	614	496	finally
    //   633	653	496	finally
    //   663	676	496	finally
    //   686	689	496	finally
    //   710	721	496	finally
    //   732	740	496	finally
    //   759	796	496	finally
    //   806	809	496	finally
    //   828	841	496	finally
    //   853	855	496	finally
    //   866	879	496	finally
    //   81	87	556	java/net/UnknownHostException
    //   98	104	556	java/net/UnknownHostException
    //   115	121	556	java/net/UnknownHostException
    //   132	138	556	java/net/UnknownHostException
    //   149	163	556	java/net/UnknownHostException
    //   177	243	556	java/net/UnknownHostException
    //   254	265	556	java/net/UnknownHostException
    //   296	316	556	java/net/UnknownHostException
    //   327	341	556	java/net/UnknownHostException
    //   372	380	556	java/net/UnknownHostException
    //   396	406	556	java/net/UnknownHostException
    //   423	432	556	java/net/UnknownHostException
    //   443	463	556	java/net/UnknownHostException
    //   474	482	556	java/net/UnknownHostException
    //   548	556	556	java/net/UnknownHostException
    //   581	590	556	java/net/UnknownHostException
    //   606	614	556	java/net/UnknownHostException
    //   710	721	556	java/net/UnknownHostException
    //   732	740	556	java/net/UnknownHostException
    //   828	841	556	java/net/UnknownHostException
    //   866	879	556	java/net/UnknownHostException
    //   81	87	614	javax/net/ssl/SSLHandshakeException
    //   98	104	614	javax/net/ssl/SSLHandshakeException
    //   115	121	614	javax/net/ssl/SSLHandshakeException
    //   132	138	614	javax/net/ssl/SSLHandshakeException
    //   149	163	614	javax/net/ssl/SSLHandshakeException
    //   177	243	614	javax/net/ssl/SSLHandshakeException
    //   254	265	614	javax/net/ssl/SSLHandshakeException
    //   296	316	614	javax/net/ssl/SSLHandshakeException
    //   327	341	614	javax/net/ssl/SSLHandshakeException
    //   372	380	614	javax/net/ssl/SSLHandshakeException
    //   396	406	614	javax/net/ssl/SSLHandshakeException
    //   423	432	614	javax/net/ssl/SSLHandshakeException
    //   443	463	614	javax/net/ssl/SSLHandshakeException
    //   474	482	614	javax/net/ssl/SSLHandshakeException
    //   548	556	614	javax/net/ssl/SSLHandshakeException
    //   581	590	614	javax/net/ssl/SSLHandshakeException
    //   606	614	614	javax/net/ssl/SSLHandshakeException
    //   710	721	614	javax/net/ssl/SSLHandshakeException
    //   732	740	614	javax/net/ssl/SSLHandshakeException
    //   828	841	614	javax/net/ssl/SSLHandshakeException
    //   866	879	614	javax/net/ssl/SSLHandshakeException
    //   81	87	740	java/net/SocketException
    //   98	104	740	java/net/SocketException
    //   115	121	740	java/net/SocketException
    //   132	138	740	java/net/SocketException
    //   149	163	740	java/net/SocketException
    //   177	243	740	java/net/SocketException
    //   254	265	740	java/net/SocketException
    //   296	316	740	java/net/SocketException
    //   327	341	740	java/net/SocketException
    //   372	380	740	java/net/SocketException
    //   396	406	740	java/net/SocketException
    //   423	432	740	java/net/SocketException
    //   443	463	740	java/net/SocketException
    //   474	482	740	java/net/SocketException
    //   548	556	740	java/net/SocketException
    //   581	590	740	java/net/SocketException
    //   606	614	740	java/net/SocketException
    //   710	721	740	java/net/SocketException
    //   732	740	740	java/net/SocketException
    //   828	841	740	java/net/SocketException
    //   866	879	740	java/net/SocketException
    //   81	87	841	java/net/SocketTimeoutException
    //   98	104	841	java/net/SocketTimeoutException
    //   115	121	841	java/net/SocketTimeoutException
    //   132	138	841	java/net/SocketTimeoutException
    //   149	163	841	java/net/SocketTimeoutException
    //   177	243	841	java/net/SocketTimeoutException
    //   254	265	841	java/net/SocketTimeoutException
    //   296	316	841	java/net/SocketTimeoutException
    //   327	341	841	java/net/SocketTimeoutException
    //   372	380	841	java/net/SocketTimeoutException
    //   396	406	841	java/net/SocketTimeoutException
    //   423	432	841	java/net/SocketTimeoutException
    //   443	463	841	java/net/SocketTimeoutException
    //   474	482	841	java/net/SocketTimeoutException
    //   548	556	841	java/net/SocketTimeoutException
    //   581	590	841	java/net/SocketTimeoutException
    //   606	614	841	java/net/SocketTimeoutException
    //   710	721	841	java/net/SocketTimeoutException
    //   732	740	841	java/net/SocketTimeoutException
    //   828	841	841	java/net/SocketTimeoutException
    //   866	879	841	java/net/SocketTimeoutException
    //   81	87	1553	java/io/IOException
    //   1576	1614	1614	finally
    //   887	895	1625	finally
    //   903	914	1625	finally
    //   918	929	1625	finally
    //   933	941	1637	finally
    //   945	953	1637	finally
    //   969	991	1637	finally
    //   995	1003	1637	finally
    //   1007	1030	1637	finally
    //   1034	1054	1637	finally
    //   1075	1111	1649	finally
    //   1132	1139	1649	finally
    //   1162	1175	1649	finally
    //   1202	1212	1649	finally
    //   1238	1241	1649	finally
    //   1265	1293	1649	finally
    //   1314	1319	1649	finally
    //   1340	1361	1649	finally
    //   1382	1391	1649	finally
    //   1412	1433	1649	finally
    //   1496	1511	1649	finally
    //   1566	1576	1664	finally
    //   98	104	1676	java/io/IOException
    //   115	121	1676	java/io/IOException
    //   132	138	1676	java/io/IOException
    //   149	163	1676	java/io/IOException
    //   177	243	1676	java/io/IOException
    //   254	265	1676	java/io/IOException
    //   296	316	1676	java/io/IOException
    //   327	341	1676	java/io/IOException
    //   372	380	1676	java/io/IOException
    //   396	406	1676	java/io/IOException
    //   423	432	1676	java/io/IOException
    //   443	463	1676	java/io/IOException
    //   474	482	1676	java/io/IOException
    //   548	556	1676	java/io/IOException
    //   581	590	1676	java/io/IOException
    //   606	614	1676	java/io/IOException
    //   710	721	1676	java/io/IOException
    //   732	740	1676	java/io/IOException
    //   828	841	1676	java/io/IOException
    //   866	879	1676	java/io/IOException
    //   887	895	1693	java/io/IOException
    //   903	914	1693	java/io/IOException
    //   918	929	1693	java/io/IOException
    //   933	941	1693	java/io/IOException
    //   945	953	1693	java/io/IOException
    //   969	991	1693	java/io/IOException
    //   995	1003	1693	java/io/IOException
    //   1007	1030	1693	java/io/IOException
    //   1034	1054	1693	java/io/IOException
    //   1075	1111	1711	java/io/IOException
    //   1132	1139	1711	java/io/IOException
    //   1162	1175	1711	java/io/IOException
    //   1202	1212	1711	java/io/IOException
    //   1238	1241	1711	java/io/IOException
    //   1265	1293	1711	java/io/IOException
    //   1314	1319	1711	java/io/IOException
    //   1340	1361	1711	java/io/IOException
    //   1382	1391	1711	java/io/IOException
    //   1412	1433	1711	java/io/IOException
    //   1496	1511	1711	java/io/IOException
    //   887	895	1723	java/net/SocketTimeoutException
    //   903	914	1723	java/net/SocketTimeoutException
    //   918	929	1723	java/net/SocketTimeoutException
    //   933	941	1735	java/net/SocketTimeoutException
    //   945	953	1735	java/net/SocketTimeoutException
    //   969	991	1735	java/net/SocketTimeoutException
    //   995	1003	1735	java/net/SocketTimeoutException
    //   1007	1030	1735	java/net/SocketTimeoutException
    //   1034	1054	1735	java/net/SocketTimeoutException
    //   1075	1111	1747	java/net/SocketTimeoutException
    //   1132	1139	1747	java/net/SocketTimeoutException
    //   1162	1175	1747	java/net/SocketTimeoutException
    //   1202	1212	1747	java/net/SocketTimeoutException
    //   1238	1241	1747	java/net/SocketTimeoutException
    //   1265	1293	1747	java/net/SocketTimeoutException
    //   1314	1319	1747	java/net/SocketTimeoutException
    //   1340	1361	1747	java/net/SocketTimeoutException
    //   1382	1391	1747	java/net/SocketTimeoutException
    //   1412	1433	1747	java/net/SocketTimeoutException
    //   1496	1511	1747	java/net/SocketTimeoutException
    //   887	895	1762	java/net/SocketException
    //   903	914	1762	java/net/SocketException
    //   918	929	1762	java/net/SocketException
    //   933	941	1778	java/net/SocketException
    //   945	953	1778	java/net/SocketException
    //   969	991	1778	java/net/SocketException
    //   995	1003	1778	java/net/SocketException
    //   1007	1030	1778	java/net/SocketException
    //   1034	1054	1778	java/net/SocketException
    //   1075	1111	1790	java/net/SocketException
    //   1132	1139	1790	java/net/SocketException
    //   1162	1175	1790	java/net/SocketException
    //   1202	1212	1790	java/net/SocketException
    //   1238	1241	1790	java/net/SocketException
    //   1265	1293	1790	java/net/SocketException
    //   1314	1319	1790	java/net/SocketException
    //   1340	1361	1790	java/net/SocketException
    //   1382	1391	1790	java/net/SocketException
    //   1412	1433	1790	java/net/SocketException
    //   1496	1511	1790	java/net/SocketException
    //   887	895	1809	javax/net/ssl/SSLHandshakeException
    //   903	914	1809	javax/net/ssl/SSLHandshakeException
    //   918	929	1809	javax/net/ssl/SSLHandshakeException
    //   933	941	1825	javax/net/ssl/SSLHandshakeException
    //   945	953	1825	javax/net/ssl/SSLHandshakeException
    //   969	991	1825	javax/net/ssl/SSLHandshakeException
    //   995	1003	1825	javax/net/ssl/SSLHandshakeException
    //   1007	1030	1825	javax/net/ssl/SSLHandshakeException
    //   1034	1054	1825	javax/net/ssl/SSLHandshakeException
    //   1075	1111	1837	javax/net/ssl/SSLHandshakeException
    //   1132	1139	1837	javax/net/ssl/SSLHandshakeException
    //   1162	1175	1837	javax/net/ssl/SSLHandshakeException
    //   1202	1212	1837	javax/net/ssl/SSLHandshakeException
    //   1238	1241	1837	javax/net/ssl/SSLHandshakeException
    //   1265	1293	1837	javax/net/ssl/SSLHandshakeException
    //   1314	1319	1837	javax/net/ssl/SSLHandshakeException
    //   1340	1361	1837	javax/net/ssl/SSLHandshakeException
    //   1382	1391	1837	javax/net/ssl/SSLHandshakeException
    //   1412	1433	1837	javax/net/ssl/SSLHandshakeException
    //   1496	1511	1837	javax/net/ssl/SSLHandshakeException
    //   887	895	1856	java/net/UnknownHostException
    //   903	914	1856	java/net/UnknownHostException
    //   918	929	1856	java/net/UnknownHostException
    //   933	941	1868	java/net/UnknownHostException
    //   945	953	1868	java/net/UnknownHostException
    //   969	991	1868	java/net/UnknownHostException
    //   995	1003	1868	java/net/UnknownHostException
    //   1007	1030	1868	java/net/UnknownHostException
    //   1034	1054	1868	java/net/UnknownHostException
    //   1075	1111	1880	java/net/UnknownHostException
    //   1132	1139	1880	java/net/UnknownHostException
    //   1162	1175	1880	java/net/UnknownHostException
    //   1202	1212	1880	java/net/UnknownHostException
    //   1238	1241	1880	java/net/UnknownHostException
    //   1265	1293	1880	java/net/UnknownHostException
    //   1314	1319	1880	java/net/UnknownHostException
    //   1340	1361	1880	java/net/UnknownHostException
    //   1382	1391	1880	java/net/UnknownHostException
    //   1412	1433	1880	java/net/UnknownHostException
    //   1496	1511	1880	java/net/UnknownHostException
    //   887	895	1895	java/lang/InterruptedException
    //   903	914	1895	java/lang/InterruptedException
    //   918	929	1895	java/lang/InterruptedException
    //   933	941	1932	java/lang/InterruptedException
    //   945	953	1932	java/lang/InterruptedException
    //   969	991	1932	java/lang/InterruptedException
    //   995	1003	1932	java/lang/InterruptedException
    //   1007	1030	1932	java/lang/InterruptedException
    //   1034	1054	1932	java/lang/InterruptedException
    //   1075	1111	1950	java/lang/InterruptedException
    //   1132	1139	1950	java/lang/InterruptedException
    //   1162	1175	1950	java/lang/InterruptedException
    //   1202	1212	1950	java/lang/InterruptedException
    //   1238	1241	1950	java/lang/InterruptedException
    //   1265	1293	1950	java/lang/InterruptedException
    //   1314	1319	1950	java/lang/InterruptedException
    //   1340	1361	1950	java/lang/InterruptedException
    //   1382	1391	1950	java/lang/InterruptedException
    //   1412	1433	1950	java/lang/InterruptedException
    //   1496	1511	1950	java/lang/InterruptedException
  }
  
  private static void a(e parame, HttpURLConnection paramHttpURLConnection)
  {
    GMTrace.i(15697837031424L, 116958);
    w.d("MicroMsg.ResDownloader.NetworkPerformer", "%s: add http headers", new Object[] { parame.bJY() });
    Object localObject = parame.bKl();
    if ((localObject != null) && (((Collection)localObject).size() > 0))
    {
      localObject = ((Collection)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        b localb = (b)((Iterator)localObject).next();
        paramHttpURLConnection.addRequestProperty(localb.name, localb.value);
      }
    }
    paramHttpURLConnection.setRequestMethod(parame.bKk());
    if ("GET".equalsIgnoreCase(parame.bKk())) {
      paramHttpURLConnection.setDoOutput(false);
    }
    paramHttpURLConnection.setConnectTimeout(parame.getConnectTimeout());
    paramHttpURLConnection.setReadTimeout(parame.getReadTimeout());
    paramHttpURLConnection.setUseCaches(false);
    if (parame.SN()) {
      paramHttpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
    }
    for (;;)
    {
      localObject = System.getProperty("http.agent");
      if (!bg.nm((String)localObject)) {
        paramHttpURLConnection.setRequestProperty("User-agent", (String)localObject);
      }
      if (!parame.SR()) {
        break;
      }
      paramHttpURLConnection.setInstanceFollowRedirects(true);
      GMTrace.o(15697837031424L, 116958);
      return;
      paramHttpURLConnection.setRequestProperty("Accept-Encoding", "identity");
    }
    paramHttpURLConnection.setInstanceFollowRedirects(false);
    GMTrace.o(15697837031424L, 116958);
  }
  
  private static l b(e parame, Exception paramException)
  {
    int j = 0;
    GMTrace.i(871341490176L, 6492);
    if ((paramException instanceof ProtocolException))
    {
      w.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: Protocol not support, the protocol: %s", new Object[] { parame.bJY(), parame.bKk() });
      parame = a(parame, paramException);
      GMTrace.o(871341490176L, 6492);
      return parame;
    }
    if ((paramException instanceof com.tencent.mm.pluginsdk.j.a.c.b))
    {
      w.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: %s [%s]", new Object[] { parame.bJY(), paramException.getClass().getSimpleName(), paramException.getMessage() });
      com.tencent.mm.pluginsdk.j.a.e.a.OS(parame.getFilePath());
      GMTrace.o(871341490176L, 6492);
      return null;
    }
    Class[] arrayOfClass = trj;
    int k = arrayOfClass.length;
    int i = 0;
    while (i < k)
    {
      if (arrayOfClass[i].equals(paramException.getClass()))
      {
        w.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: download canceled, caused by %s", new Object[] { parame.bJY(), paramException });
        parame = new l(parame, paramException, 4);
        GMTrace.o(871341490176L, 6492);
        return parame;
      }
      i += 1;
    }
    arrayOfClass = trl;
    k = arrayOfClass.length;
    i = 0;
    while (i < k)
    {
      if (arrayOfClass[i].equals(paramException.getClass()))
      {
        GMTrace.o(871341490176L, 6492);
        return null;
      }
      i += 1;
    }
    arrayOfClass = trk;
    k = arrayOfClass.length;
    i = j;
    while (i < k)
    {
      if (arrayOfClass[i].equals(paramException.getClass()))
      {
        parame = a(parame, paramException);
        GMTrace.o(871341490176L, 6492);
        return parame;
      }
      i += 1;
    }
    parame = a(parame, paramException);
    GMTrace.o(871341490176L, 6492);
    return parame;
  }
  
  private static void bKo()
  {
    GMTrace.i(870670401536L, 6487);
    if (Thread.interrupted()) {
      throw new InterruptedException(Thread.currentThread().getName() + " has interrupted by someone!");
    }
    GMTrace.o(870670401536L, 6487);
  }
  
  /* Error */
  final l a(e parame)
  {
    // Byte code:
    //   0: ldc2_w 467
    //   3: sipush 6486
    //   6: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: ifnonnull +22 -> 32
    //   13: ldc 88
    //   15: ldc_w 470
    //   18: invokestatic 472	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: ldc2_w 467
    //   24: sipush 6486
    //   27: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: aconst_null
    //   31: areturn
    //   32: aload_1
    //   33: invokeinterface 168 1 0
    //   38: invokestatic 266	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   41: ifeq +45 -> 86
    //   44: ldc 88
    //   46: ldc_w 474
    //   49: iconst_1
    //   50: anewarray 4	java/lang/Object
    //   53: dup
    //   54: iconst_0
    //   55: aload_1
    //   56: invokeinterface 96 1 0
    //   61: aastore
    //   62: invokestatic 218	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   65: ldc2_w 467
    //   68: sipush 6486
    //   71: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   74: aconst_null
    //   75: areturn
    //   76: aload 5
    //   78: ifnull +8 -> 86
    //   81: aload 5
    //   83: invokevirtual 477	java/net/HttpURLConnection:disconnect	()V
    //   86: aload_1
    //   87: invokeinterface 480 1 0
    //   92: ifne +13 -> 105
    //   95: aload_1
    //   96: invokeinterface 168 1 0
    //   101: invokestatic 442	com/tencent/mm/pluginsdk/j/a/e/a:OS	(Ljava/lang/String;)Z
    //   104: pop
    //   105: invokestatic 315	com/tencent/mm/pluginsdk/j/a/d/j:bKo	()V
    //   108: new 482	java/net/URL
    //   111: dup
    //   112: aload_1
    //   113: invokeinterface 485 1 0
    //   118: invokespecial 486	java/net/URL:<init>	(Ljava/lang/String;)V
    //   121: astore 5
    //   123: aload 5
    //   125: invokevirtual 490	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   128: checkcast 115	java/net/HttpURLConnection
    //   131: astore 7
    //   133: ldc 88
    //   135: ldc_w 492
    //   138: iconst_2
    //   139: anewarray 4	java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload_1
    //   145: invokeinterface 96 1 0
    //   150: aastore
    //   151: dup
    //   152: iconst_1
    //   153: aload_1
    //   154: invokeinterface 485 1 0
    //   159: aastore
    //   160: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: invokestatic 315	com/tencent/mm/pluginsdk/j/a/d/j:bKo	()V
    //   166: aload_1
    //   167: aload 7
    //   169: invokestatic 494	com/tencent/mm/pluginsdk/j/a/d/j:a	(Lcom/tencent/mm/pluginsdk/j/a/d/e;Ljava/net/HttpURLConnection;)V
    //   172: invokestatic 315	com/tencent/mm/pluginsdk/j/a/d/j:bKo	()V
    //   175: aload_1
    //   176: invokeinterface 168 1 0
    //   181: invokestatic 174	com/tencent/mm/pluginsdk/j/a/e/a:DI	(Ljava/lang/String;)J
    //   184: lstore_2
    //   185: ldc 88
    //   187: ldc_w 496
    //   190: iconst_2
    //   191: anewarray 4	java/lang/Object
    //   194: dup
    //   195: iconst_0
    //   196: aload_1
    //   197: invokeinterface 96 1 0
    //   202: aastore
    //   203: dup
    //   204: iconst_1
    //   205: lload_2
    //   206: invokestatic 501	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   209: aastore
    //   210: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   213: lload_2
    //   214: lconst_0
    //   215: lcmp
    //   216: ifne +278 -> 494
    //   219: iconst_0
    //   220: istore 4
    //   222: ldc 88
    //   224: ldc_w 503
    //   227: iconst_2
    //   228: anewarray 4	java/lang/Object
    //   231: dup
    //   232: iconst_0
    //   233: aload_1
    //   234: invokeinterface 96 1 0
    //   239: aastore
    //   240: dup
    //   241: iconst_1
    //   242: iload 4
    //   244: invokestatic 155	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   247: aastore
    //   248: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: invokestatic 315	com/tencent/mm/pluginsdk/j/a/d/j:bKo	()V
    //   254: ldc_w 505
    //   257: aload 5
    //   259: invokevirtual 508	java/net/URL:getProtocol	()Ljava/lang/String;
    //   262: invokevirtual 271	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   265: ifeq +78 -> 343
    //   268: aload 7
    //   270: checkcast 510	javax/net/ssl/HttpsURLConnection
    //   273: astore 8
    //   275: ldc_w 512
    //   278: invokestatic 514	com/tencent/mm/pluginsdk/j/a/d/j:MO	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   281: astore 6
    //   283: aload 6
    //   285: astore 5
    //   287: aload 6
    //   289: ifnonnull +25 -> 314
    //   292: ldc_w 516
    //   295: invokestatic 514	com/tencent/mm/pluginsdk/j/a/d/j:MO	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   298: astore 6
    //   300: aload 6
    //   302: astore 5
    //   304: aload 6
    //   306: ifnonnull +8 -> 314
    //   309: invokestatic 520	javax/net/ssl/SSLContext:getDefault	()Ljavax/net/ssl/SSLContext;
    //   312: astore 5
    //   314: aload 5
    //   316: ifnull +215 -> 531
    //   319: aload 5
    //   321: aconst_null
    //   322: aconst_null
    //   323: new 522	java/security/SecureRandom
    //   326: dup
    //   327: invokespecial 523	java/security/SecureRandom:<init>	()V
    //   330: invokevirtual 527	javax/net/ssl/SSLContext:init	([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    //   333: aload 8
    //   335: aload 5
    //   337: invokevirtual 531	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   340: invokevirtual 535	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   343: invokestatic 315	com/tencent/mm/pluginsdk/j/a/d/j:bKo	()V
    //   346: ldc 88
    //   348: ldc_w 537
    //   351: iconst_2
    //   352: anewarray 4	java/lang/Object
    //   355: dup
    //   356: iconst_0
    //   357: aload_1
    //   358: invokeinterface 96 1 0
    //   363: aastore
    //   364: dup
    //   365: iconst_1
    //   366: aload_1
    //   367: invokeinterface 373 1 0
    //   372: aastore
    //   373: invokestatic 279	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   376: ldc_w 539
    //   379: aload_1
    //   380: invokeinterface 373 1 0
    //   385: invokevirtual 142	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   388: ifeq +66 -> 454
    //   391: aconst_null
    //   392: invokestatic 543	com/tencent/mm/sdk/platformtools/bg:bq	([B)Z
    //   395: ifne +59 -> 454
    //   398: aload 7
    //   400: iconst_1
    //   401: invokevirtual 382	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   404: aload 7
    //   406: ldc_w 545
    //   409: aload_1
    //   410: invokeinterface 548 1 0
    //   415: invokevirtual 406	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   418: aload 7
    //   420: aconst_null
    //   421: arraylength
    //   422: invokevirtual 551	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   425: new 553	java/io/DataOutputStream
    //   428: dup
    //   429: aload 7
    //   431: invokevirtual 557	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   434: invokespecial 558	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   437: astore 6
    //   439: aload 6
    //   441: astore 5
    //   443: aload 6
    //   445: aconst_null
    //   446: invokevirtual 561	java/io/DataOutputStream:write	([B)V
    //   449: aload 6
    //   451: invokevirtual 564	java/io/DataOutputStream:close	()V
    //   454: invokestatic 315	com/tencent/mm/pluginsdk/j/a/d/j:bKo	()V
    //   457: aload_1
    //   458: aload 7
    //   460: iload 4
    //   462: invokestatic 566	com/tencent/mm/pluginsdk/j/a/d/j:a	(Lcom/tencent/mm/pluginsdk/j/a/d/e;Ljava/net/HttpURLConnection;Z)Lcom/tencent/mm/pluginsdk/j/a/d/l;
    //   465: astore 5
    //   467: aload 7
    //   469: invokevirtual 477	java/net/HttpURLConnection:disconnect	()V
    //   472: aload 7
    //   474: ifnull +8 -> 482
    //   477: aload 7
    //   479: invokevirtual 477	java/net/HttpURLConnection:disconnect	()V
    //   482: ldc2_w 467
    //   485: sipush 6486
    //   488: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   491: aload 5
    //   493: areturn
    //   494: aload 7
    //   496: ldc_w 568
    //   499: new 231	java/lang/StringBuilder
    //   502: dup
    //   503: ldc_w 570
    //   506: invokespecial 571	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   509: lload_2
    //   510: invokevirtual 574	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   513: ldc_w 576
    //   516: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   519: invokevirtual 244	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   522: invokevirtual 370	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   525: iconst_1
    //   526: istore 4
    //   528: goto -306 -> 222
    //   531: aload 8
    //   533: aload_1
    //   534: invokeinterface 579 1 0
    //   539: new 581	android/net/SSLSessionCache
    //   542: dup
    //   543: invokestatic 587	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   546: invokespecial 590	android/net/SSLSessionCache:<init>	(Landroid/content/Context;)V
    //   549: invokestatic 595	android/net/SSLCertificateSocketFactory:getDefault	(ILandroid/net/SSLSessionCache;)Ljavax/net/ssl/SSLSocketFactory;
    //   552: invokevirtual 535	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   555: goto -212 -> 343
    //   558: astore 6
    //   560: aload 7
    //   562: astore 5
    //   564: aload_1
    //   565: aload 6
    //   567: invokestatic 597	com/tencent/mm/pluginsdk/j/a/d/j:b	(Lcom/tencent/mm/pluginsdk/j/a/d/e;Ljava/lang/Exception;)Lcom/tencent/mm/pluginsdk/j/a/d/l;
    //   570: astore 7
    //   572: aload 7
    //   574: ifnonnull +254 -> 828
    //   577: ldc 88
    //   579: ldc_w 599
    //   582: iconst_1
    //   583: anewarray 4	java/lang/Object
    //   586: dup
    //   587: iconst_0
    //   588: aload_1
    //   589: invokeinterface 96 1 0
    //   594: aastore
    //   595: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   598: aload_1
    //   599: invokeinterface 602 1 0
    //   604: ifne -528 -> 76
    //   607: ldc 88
    //   609: ldc_w 604
    //   612: iconst_1
    //   613: anewarray 4	java/lang/Object
    //   616: dup
    //   617: iconst_0
    //   618: aload_1
    //   619: invokeinterface 96 1 0
    //   624: aastore
    //   625: invokestatic 101	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   628: aload_1
    //   629: aload 6
    //   631: invokestatic 429	com/tencent/mm/pluginsdk/j/a/d/j:a	(Lcom/tencent/mm/pluginsdk/j/a/d/e;Ljava/lang/Exception;)Lcom/tencent/mm/pluginsdk/j/a/d/l;
    //   634: astore_1
    //   635: aload 5
    //   637: ifnull +8 -> 645
    //   640: aload 5
    //   642: invokevirtual 477	java/net/HttpURLConnection:disconnect	()V
    //   645: ldc2_w 467
    //   648: sipush 6486
    //   651: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   654: aload_1
    //   655: areturn
    //   656: astore 5
    //   658: ldc 88
    //   660: ldc_w 606
    //   663: iconst_1
    //   664: anewarray 4	java/lang/Object
    //   667: dup
    //   668: iconst_0
    //   669: aload_1
    //   670: invokeinterface 96 1 0
    //   675: aastore
    //   676: invokestatic 218	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   679: ldc 88
    //   681: aload 5
    //   683: ldc -36
    //   685: iconst_0
    //   686: anewarray 4	java/lang/Object
    //   689: invokestatic 224	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   692: goto -238 -> 454
    //   695: astore_1
    //   696: aload 7
    //   698: astore 5
    //   700: aload 5
    //   702: ifnull +8 -> 710
    //   705: aload 5
    //   707: invokevirtual 477	java/net/HttpURLConnection:disconnect	()V
    //   710: aload_1
    //   711: athrow
    //   712: astore 8
    //   714: aconst_null
    //   715: astore 6
    //   717: aload 6
    //   719: astore 5
    //   721: ldc 88
    //   723: ldc_w 608
    //   726: iconst_1
    //   727: anewarray 4	java/lang/Object
    //   730: dup
    //   731: iconst_0
    //   732: aload_1
    //   733: invokeinterface 96 1 0
    //   738: aastore
    //   739: invokestatic 218	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   742: aload 6
    //   744: astore 5
    //   746: ldc 88
    //   748: aload 8
    //   750: ldc -36
    //   752: iconst_0
    //   753: anewarray 4	java/lang/Object
    //   756: invokestatic 224	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   759: aload 6
    //   761: astore 5
    //   763: aload 8
    //   765: athrow
    //   766: astore 8
    //   768: aload 5
    //   770: astore 6
    //   772: aload 8
    //   774: astore 5
    //   776: aload 6
    //   778: ifnull +8 -> 786
    //   781: aload 6
    //   783: invokevirtual 564	java/io/DataOutputStream:close	()V
    //   786: aload 5
    //   788: athrow
    //   789: astore 6
    //   791: ldc 88
    //   793: ldc_w 606
    //   796: iconst_1
    //   797: anewarray 4	java/lang/Object
    //   800: dup
    //   801: iconst_0
    //   802: aload_1
    //   803: invokeinterface 96 1 0
    //   808: aastore
    //   809: invokestatic 218	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   812: ldc 88
    //   814: aload 6
    //   816: ldc -36
    //   818: iconst_0
    //   819: anewarray 4	java/lang/Object
    //   822: invokestatic 224	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   825: goto -39 -> 786
    //   828: aload 5
    //   830: ifnull +8 -> 838
    //   833: aload 5
    //   835: invokevirtual 477	java/net/HttpURLConnection:disconnect	()V
    //   838: ldc2_w 467
    //   841: sipush 6486
    //   844: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   847: aload 7
    //   849: areturn
    //   850: astore 5
    //   852: aload 6
    //   854: astore 5
    //   856: goto -542 -> 314
    //   859: astore_1
    //   860: goto -378 -> 482
    //   863: astore 5
    //   865: goto -220 -> 645
    //   868: astore_1
    //   869: goto -31 -> 838
    //   872: astore 5
    //   874: goto -788 -> 86
    //   877: astore 5
    //   879: goto -169 -> 710
    //   882: astore_1
    //   883: aconst_null
    //   884: astore 5
    //   886: goto -186 -> 700
    //   889: astore_1
    //   890: goto -190 -> 700
    //   893: astore 6
    //   895: aconst_null
    //   896: astore 5
    //   898: goto -334 -> 564
    //   901: astore 5
    //   903: aconst_null
    //   904: astore 6
    //   906: goto -130 -> 776
    //   909: astore 8
    //   911: goto -194 -> 717
    //   914: astore 5
    //   916: goto -385 -> 531
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	919	0	this	j
    //   0	919	1	parame	e
    //   184	326	2	l	long
    //   220	307	4	bool	boolean
    //   76	565	5	localObject1	Object
    //   656	26	5	localIOException1	IOException
    //   698	136	5	localObject2	Object
    //   850	1	5	localException1	Exception
    //   854	1	5	localObject3	Object
    //   863	1	5	localException2	Exception
    //   872	1	5	localException3	Exception
    //   877	1	5	localException4	Exception
    //   884	13	5	localObject4	Object
    //   901	1	5	localObject5	Object
    //   914	1	5	localException5	Exception
    //   281	169	6	localObject6	Object
    //   558	72	6	localException6	Exception
    //   715	67	6	localObject7	Object
    //   789	64	6	localIOException2	IOException
    //   893	1	6	localException7	Exception
    //   904	1	6	localObject8	Object
    //   131	717	7	localObject9	Object
    //   273	259	8	localHttpsURLConnection	javax.net.ssl.HttpsURLConnection
    //   712	52	8	localIOException3	IOException
    //   766	7	8	localObject10	Object
    //   909	1	8	localIOException4	IOException
    // Exception table:
    //   from	to	target	type
    //   133	213	558	java/lang/Exception
    //   222	283	558	java/lang/Exception
    //   292	300	558	java/lang/Exception
    //   343	425	558	java/lang/Exception
    //   449	454	558	java/lang/Exception
    //   454	472	558	java/lang/Exception
    //   494	525	558	java/lang/Exception
    //   531	555	558	java/lang/Exception
    //   658	692	558	java/lang/Exception
    //   781	786	558	java/lang/Exception
    //   786	789	558	java/lang/Exception
    //   791	825	558	java/lang/Exception
    //   449	454	656	java/io/IOException
    //   133	213	695	finally
    //   222	283	695	finally
    //   292	300	695	finally
    //   309	314	695	finally
    //   319	343	695	finally
    //   343	425	695	finally
    //   449	454	695	finally
    //   454	472	695	finally
    //   494	525	695	finally
    //   531	555	695	finally
    //   658	692	695	finally
    //   781	786	695	finally
    //   786	789	695	finally
    //   791	825	695	finally
    //   425	439	712	java/io/IOException
    //   443	449	766	finally
    //   721	742	766	finally
    //   746	759	766	finally
    //   763	766	766	finally
    //   781	786	789	java/io/IOException
    //   309	314	850	java/lang/Exception
    //   477	482	859	java/lang/Exception
    //   640	645	863	java/lang/Exception
    //   833	838	868	java/lang/Exception
    //   81	86	872	java/lang/Exception
    //   705	710	877	java/lang/Exception
    //   86	105	882	finally
    //   105	133	882	finally
    //   564	572	889	finally
    //   577	635	889	finally
    //   86	105	893	java/lang/Exception
    //   105	133	893	java/lang/Exception
    //   425	439	901	finally
    //   443	449	909	java/io/IOException
    //   319	343	914	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
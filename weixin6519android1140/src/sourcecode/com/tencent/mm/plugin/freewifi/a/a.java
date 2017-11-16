package com.tencent.mm.plugin.freewifi.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.h;
import com.tencent.mm.plugin.freewifi.h.b;
import java.net.HttpURLConnection;

public final class a
{
  private static final int lpr;
  private static final int lps;
  
  static
  {
    GMTrace.i(7257689423872L, 54074);
    lpr = h.b.lop.aAw();
    lps = h.b.lop.aAx();
    GMTrace.o(7257689423872L, 54074);
  }
  
  public a()
  {
    GMTrace.i(7257018335232L, 54069);
    GMTrace.o(7257018335232L, 54069);
  }
  
  /* Error */
  public static void a(String paramString, a parama)
  {
    // Byte code:
    //   0: ldc2_w 59
    //   3: ldc 61
    //   5: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc 63
    //   10: ldc 65
    //   12: iconst_1
    //   13: anewarray 4	java/lang/Object
    //   16: dup
    //   17: iconst_0
    //   18: aload_0
    //   19: aastore
    //   20: invokestatic 70	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   23: aload_0
    //   24: invokestatic 76	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   27: ifeq +12 -> 39
    //   30: ldc2_w 59
    //   33: ldc 61
    //   35: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   38: return
    //   39: aconst_null
    //   40: astore_2
    //   41: aconst_null
    //   42: astore 4
    //   44: new 78	java/net/URL
    //   47: dup
    //   48: aload_0
    //   49: invokespecial 81	java/net/URL:<init>	(Ljava/lang/String;)V
    //   52: invokevirtual 85	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   55: checkcast 87	java/net/HttpURLConnection
    //   58: astore_0
    //   59: aload_0
    //   60: ifnull +46 -> 106
    //   63: aload_0
    //   64: getstatic 38	com/tencent/mm/plugin/freewifi/a/a:lpr	I
    //   67: invokevirtual 91	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   70: aload_0
    //   71: getstatic 43	com/tencent/mm/plugin/freewifi/a/a:lps	I
    //   74: invokevirtual 94	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   77: aload_0
    //   78: ldc 96
    //   80: getstatic 30	com/tencent/mm/plugin/freewifi/h$b:lop	Lcom/tencent/mm/plugin/freewifi/h;
    //   83: invokevirtual 100	com/tencent/mm/plugin/freewifi/h:getUserAgent	()Ljava/lang/String;
    //   86: invokevirtual 104	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   89: aload_0
    //   90: iconst_0
    //   91: invokevirtual 108	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   94: aload_0
    //   95: iconst_0
    //   96: invokevirtual 111	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   99: aload_1
    //   100: aload_0
    //   101: invokeinterface 115 2 0
    //   106: aload_0
    //   107: ifnull +76 -> 183
    //   110: aload_0
    //   111: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
    //   114: ldc2_w 59
    //   117: ldc 61
    //   119: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   122: return
    //   123: astore_2
    //   124: aload_1
    //   125: aload_2
    //   126: invokeinterface 122 2 0
    //   131: goto -25 -> 106
    //   134: astore_3
    //   135: aload_0
    //   136: astore_2
    //   137: aload_1
    //   138: aload_3
    //   139: invokeinterface 122 2 0
    //   144: aload_0
    //   145: ifnull +38 -> 183
    //   148: aload_0
    //   149: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
    //   152: ldc2_w 59
    //   155: ldc 61
    //   157: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   160: return
    //   161: astore_2
    //   162: aload_1
    //   163: aload_2
    //   164: invokeinterface 122 2 0
    //   169: goto -63 -> 106
    //   172: astore_1
    //   173: aload_0
    //   174: ifnull +7 -> 181
    //   177: aload_0
    //   178: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
    //   181: aload_1
    //   182: athrow
    //   183: ldc2_w 59
    //   186: ldc 61
    //   188: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   191: return
    //   192: astore_1
    //   193: aload_2
    //   194: astore_0
    //   195: goto -22 -> 173
    //   198: astore_3
    //   199: aload 4
    //   201: astore_0
    //   202: goto -67 -> 135
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	205	0	paramString	String
    //   0	205	1	parama	a
    //   40	1	2	localObject1	Object
    //   123	3	2	localIOException	java.io.IOException
    //   136	1	2	str	String
    //   161	33	2	localException1	Exception
    //   134	5	3	localException2	Exception
    //   198	1	3	localException3	Exception
    //   42	158	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   99	106	123	java/io/IOException
    //   63	99	134	java/lang/Exception
    //   124	131	134	java/lang/Exception
    //   162	169	134	java/lang/Exception
    //   99	106	161	java/lang/Exception
    //   63	99	172	finally
    //   99	106	172	finally
    //   124	131	172	finally
    //   162	169	172	finally
    //   44	59	192	finally
    //   137	144	192	finally
    //   44	59	198	java/lang/Exception
  }
  
  /* Error */
  public static void a(String paramString1, String paramString2, a parama)
  {
    // Byte code:
    //   0: ldc2_w 124
    //   3: ldc 126
    //   5: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc 63
    //   10: ldc -128
    //   12: iconst_2
    //   13: anewarray 4	java/lang/Object
    //   16: dup
    //   17: iconst_0
    //   18: aload_0
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: aload_1
    //   23: aastore
    //   24: invokestatic 70	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: aload_0
    //   28: invokestatic 76	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   31: ifne +10 -> 41
    //   34: aload_1
    //   35: invokestatic 76	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
    //   38: ifeq +12 -> 50
    //   41: ldc2_w 124
    //   44: ldc 126
    //   46: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   49: return
    //   50: aload_1
    //   51: ifnull +12 -> 63
    //   54: ldc -126
    //   56: aload_1
    //   57: invokevirtual 135	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   60: ifeq +184 -> 244
    //   63: ldc -126
    //   65: astore_1
    //   66: ldc 63
    //   68: ldc -119
    //   70: iconst_2
    //   71: anewarray 4	java/lang/Object
    //   74: dup
    //   75: iconst_0
    //   76: aload_0
    //   77: aastore
    //   78: dup
    //   79: iconst_1
    //   80: aload_1
    //   81: aastore
    //   82: invokestatic 70	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: aconst_null
    //   86: astore 6
    //   88: new 78	java/net/URL
    //   91: dup
    //   92: aload_0
    //   93: invokespecial 81	java/net/URL:<init>	(Ljava/lang/String;)V
    //   96: invokevirtual 85	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   99: checkcast 87	java/net/HttpURLConnection
    //   102: astore_0
    //   103: aload_0
    //   104: ifnull +123 -> 227
    //   107: aload_0
    //   108: getstatic 38	com/tencent/mm/plugin/freewifi/a/a:lpr	I
    //   111: invokevirtual 91	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   114: aload_0
    //   115: getstatic 43	com/tencent/mm/plugin/freewifi/a/a:lps	I
    //   118: invokevirtual 94	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   121: aload_0
    //   122: ldc 96
    //   124: getstatic 30	com/tencent/mm/plugin/freewifi/h$b:lop	Lcom/tencent/mm/plugin/freewifi/h;
    //   127: invokevirtual 100	com/tencent/mm/plugin/freewifi/h:getUserAgent	()Ljava/lang/String;
    //   130: invokevirtual 104	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   133: aload_0
    //   134: iconst_0
    //   135: invokevirtual 111	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   138: aload_0
    //   139: iconst_1
    //   140: invokevirtual 140	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   143: aload_0
    //   144: ldc -114
    //   146: invokevirtual 145	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   149: aload_0
    //   150: ldc -109
    //   152: ldc -107
    //   154: invokevirtual 104	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   157: aload_0
    //   158: ldc -105
    //   160: ldc -103
    //   162: invokevirtual 104	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   165: aload_0
    //   166: iconst_0
    //   167: invokevirtual 108	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   170: aload_1
    //   171: ldc -101
    //   173: invokestatic 161	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   176: invokevirtual 165	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   179: astore_1
    //   180: aload_0
    //   181: ldc -89
    //   183: aload_1
    //   184: arraylength
    //   185: invokestatic 173	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   188: invokevirtual 104	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   191: new 175	java/io/DataOutputStream
    //   194: dup
    //   195: aload_0
    //   196: invokevirtual 179	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   199: invokespecial 182	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   202: astore 6
    //   204: aload 6
    //   206: aload_1
    //   207: invokevirtual 186	java/io/DataOutputStream:write	([B)V
    //   210: aload 6
    //   212: invokevirtual 189	java/io/DataOutputStream:flush	()V
    //   215: aload 6
    //   217: invokevirtual 192	java/io/DataOutputStream:close	()V
    //   220: aload_2
    //   221: aload_0
    //   222: invokeinterface 115 2 0
    //   227: aload_0
    //   228: ifnull +368 -> 596
    //   231: aload_0
    //   232: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
    //   235: ldc2_w 124
    //   238: ldc 126
    //   240: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   243: return
    //   244: ldc -126
    //   246: astore 6
    //   248: aload_1
    //   249: ldc -62
    //   251: invokevirtual 198	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   254: astore 10
    //   256: iconst_1
    //   257: istore_3
    //   258: aload 6
    //   260: astore_1
    //   261: iload_3
    //   262: bipush 10
    //   264: if_icmpgt +267 -> 531
    //   267: new 200	java/lang/StringBuilder
    //   270: dup
    //   271: ldc -54
    //   273: invokespecial 203	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   276: iload_3
    //   277: invokevirtual 207	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   280: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   283: astore 11
    //   285: new 200	java/lang/StringBuilder
    //   288: dup
    //   289: ldc -45
    //   291: invokespecial 203	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   294: iload_3
    //   295: invokevirtual 207	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   298: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   301: astore 12
    //   303: aload 10
    //   305: arraylength
    //   306: istore 5
    //   308: aconst_null
    //   309: astore 7
    //   311: aconst_null
    //   312: astore 6
    //   314: iconst_0
    //   315: istore 4
    //   317: iload 4
    //   319: iload 5
    //   321: if_icmpge +120 -> 441
    //   324: aload 10
    //   326: iload 4
    //   328: aaload
    //   329: astore 13
    //   331: aload 13
    //   333: aload 11
    //   335: invokevirtual 215	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   338: iflt +47 -> 385
    //   341: aload 13
    //   343: ldc -39
    //   345: invokevirtual 198	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   348: arraylength
    //   349: iconst_2
    //   350: if_icmpne +35 -> 385
    //   353: aload 13
    //   355: ldc -39
    //   357: invokevirtual 198	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   360: iconst_1
    //   361: aaload
    //   362: astore 9
    //   364: aload 7
    //   366: astore 8
    //   368: iload 4
    //   370: iconst_1
    //   371: iadd
    //   372: istore 4
    //   374: aload 8
    //   376: astore 7
    //   378: aload 9
    //   380: astore 6
    //   382: goto -65 -> 317
    //   385: aload 7
    //   387: astore 8
    //   389: aload 6
    //   391: astore 9
    //   393: aload 13
    //   395: aload 12
    //   397: invokevirtual 215	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   400: iflt -32 -> 368
    //   403: aload 7
    //   405: astore 8
    //   407: aload 6
    //   409: astore 9
    //   411: aload 13
    //   413: ldc -39
    //   415: invokevirtual 198	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   418: arraylength
    //   419: iconst_2
    //   420: if_icmpne -52 -> 368
    //   423: aload 13
    //   425: ldc -39
    //   427: invokevirtual 198	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   430: iconst_1
    //   431: aaload
    //   432: astore 8
    //   434: aload 6
    //   436: astore 9
    //   438: goto -70 -> 368
    //   441: aload 6
    //   443: ifnull +88 -> 531
    //   446: aload 7
    //   448: ifnull +83 -> 531
    //   451: iload_3
    //   452: iconst_1
    //   453: if_icmpne +40 -> 493
    //   456: new 200	java/lang/StringBuilder
    //   459: dup
    //   460: invokespecial 218	java/lang/StringBuilder:<init>	()V
    //   463: aload_1
    //   464: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: aload 6
    //   469: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   472: ldc -39
    //   474: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: aload 7
    //   479: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   482: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   485: astore_1
    //   486: iload_3
    //   487: iconst_1
    //   488: iadd
    //   489: istore_3
    //   490: goto -229 -> 261
    //   493: new 200	java/lang/StringBuilder
    //   496: dup
    //   497: invokespecial 218	java/lang/StringBuilder:<init>	()V
    //   500: aload_1
    //   501: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   504: ldc -62
    //   506: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: aload 6
    //   511: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: ldc -39
    //   516: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   519: aload 7
    //   521: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   527: astore_1
    //   528: goto -42 -> 486
    //   531: goto -465 -> 66
    //   534: astore_1
    //   535: aload_2
    //   536: aload_1
    //   537: invokeinterface 122 2 0
    //   542: goto -315 -> 227
    //   545: astore_1
    //   546: aload_2
    //   547: aload_1
    //   548: invokeinterface 122 2 0
    //   553: aload_0
    //   554: ifnull +42 -> 596
    //   557: aload_0
    //   558: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
    //   561: ldc2_w 124
    //   564: ldc 126
    //   566: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   569: return
    //   570: astore_1
    //   571: aload_2
    //   572: aload_1
    //   573: invokeinterface 122 2 0
    //   578: goto -351 -> 227
    //   581: astore_2
    //   582: aload_0
    //   583: astore_1
    //   584: aload_2
    //   585: astore_0
    //   586: aload_1
    //   587: ifnull +7 -> 594
    //   590: aload_1
    //   591: invokevirtual 118	java/net/HttpURLConnection:disconnect	()V
    //   594: aload_0
    //   595: athrow
    //   596: ldc2_w 124
    //   599: ldc 126
    //   601: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   604: return
    //   605: astore_0
    //   606: aload 6
    //   608: astore_1
    //   609: goto -23 -> 586
    //   612: astore_2
    //   613: aload_0
    //   614: astore_1
    //   615: aload_2
    //   616: astore_0
    //   617: goto -31 -> 586
    //   620: astore_1
    //   621: aconst_null
    //   622: astore_0
    //   623: goto -77 -> 546
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	626	0	paramString1	String
    //   0	626	1	paramString2	String
    //   0	626	2	parama	a
    //   257	233	3	i	int
    //   315	58	4	j	int
    //   306	16	5	k	int
    //   86	521	6	localObject1	Object
    //   309	211	7	localObject2	Object
    //   366	67	8	localObject3	Object
    //   362	75	9	localObject4	Object
    //   254	71	10	arrayOfString	String[]
    //   283	51	11	str1	String
    //   301	95	12	str2	String
    //   329	95	13	str3	String
    // Exception table:
    //   from	to	target	type
    //   220	227	534	java/io/IOException
    //   107	220	545	java/lang/Exception
    //   535	542	545	java/lang/Exception
    //   571	578	545	java/lang/Exception
    //   220	227	570	java/lang/Exception
    //   107	220	581	finally
    //   220	227	581	finally
    //   535	542	581	finally
    //   571	578	581	finally
    //   88	103	605	finally
    //   546	553	612	finally
    //   88	103	620	java/lang/Exception
  }
  
  public static a aAK()
  {
    GMTrace.i(7257152552960L, 54070);
    a locala = b.lpt;
    GMTrace.o(7257152552960L, 54070);
    return locala;
  }
  
  public static abstract interface a
  {
    public abstract void d(HttpURLConnection paramHttpURLConnection);
    
    public abstract void g(Exception paramException);
  }
  
  private static final class b
  {
    public static a lpt;
    
    static
    {
      GMTrace.i(7258226294784L, 54078);
      lpt = new a();
      GMTrace.o(7258226294784L, 54078);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
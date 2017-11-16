package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

public final class bz
{
  public static boolean gpw;
  private static bz gpz;
  private ArrayList<String> gpx;
  private String gpy;
  
  static
  {
    GMTrace.i(13484855132160L, 100470);
    gpw = false;
    gpz = null;
    GMTrace.o(13484855132160L, 100470);
  }
  
  /* Error */
  public bz(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 38	java/lang/Object:<init>	()V
    //   4: ldc2_w 39
    //   7: ldc 41
    //   9: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_0
    //   13: new 43	java/util/ArrayList
    //   16: dup
    //   17: invokespecial 44	java/util/ArrayList:<init>	()V
    //   20: putfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   23: aload_0
    //   24: ldc 48
    //   26: putfield 50	com/tencent/mm/y/bz:gpy	Ljava/lang/String;
    //   29: aload_0
    //   30: new 52	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   37: aload_1
    //   38: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: ldc 59
    //   43: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: putfield 50	com/tencent/mm/y/bz:gpy	Ljava/lang/String;
    //   52: new 65	java/io/RandomAccessFile
    //   55: dup
    //   56: aload_0
    //   57: getfield 50	com/tencent/mm/y/bz:gpy	Ljava/lang/String;
    //   60: ldc 67
    //   62: invokespecial 70	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   65: astore 6
    //   67: aload 6
    //   69: astore_1
    //   70: aload 6
    //   72: invokevirtual 74	java/io/RandomAccessFile:length	()J
    //   75: lstore 4
    //   77: aload 6
    //   79: astore_1
    //   80: ldc 76
    //   82: ldc 78
    //   84: iconst_4
    //   85: anewarray 4	java/lang/Object
    //   88: dup
    //   89: iconst_0
    //   90: lload 4
    //   92: invokestatic 84	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   95: aastore
    //   96: dup
    //   97: iconst_1
    //   98: iload_2
    //   99: invokestatic 89	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   102: aastore
    //   103: dup
    //   104: iconst_2
    //   105: getstatic 95	com/tencent/mm/protocal/d:tJC	I
    //   108: invokestatic 100	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   111: aastore
    //   112: dup
    //   113: iconst_3
    //   114: aload_0
    //   115: getfield 50	com/tencent/mm/y/bz:gpy	Ljava/lang/String;
    //   118: aastore
    //   119: invokestatic 105	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   122: lload 4
    //   124: lconst_0
    //   125: lcmp
    //   126: ifle +12 -> 138
    //   129: lload 4
    //   131: ldc2_w 106
    //   134: lcmp
    //   135: ifle +269 -> 404
    //   138: aload 6
    //   140: astore_1
    //   141: aload 6
    //   143: lconst_0
    //   144: invokevirtual 111	java/io/RandomAccessFile:seek	(J)V
    //   147: iload_2
    //   148: ifne +69 -> 217
    //   151: aload 6
    //   153: astore_1
    //   154: ldc 113
    //   156: iconst_1
    //   157: anewarray 4	java/lang/Object
    //   160: dup
    //   161: iconst_0
    //   162: ldc 114
    //   164: invokestatic 100	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   167: aastore
    //   168: invokestatic 120	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   171: astore 7
    //   173: aload 6
    //   175: astore_1
    //   176: aload 6
    //   178: new 52	java/lang/StringBuilder
    //   181: dup
    //   182: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   185: aload 7
    //   187: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: ldc 122
    //   192: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   198: invokevirtual 126	java/lang/String:getBytes	()[B
    //   201: invokevirtual 130	java/io/RandomAccessFile:write	([B)V
    //   204: aload 6
    //   206: astore_1
    //   207: aload_0
    //   208: getfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   211: aload 7
    //   213: invokevirtual 134	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   216: pop
    //   217: aload 6
    //   219: astore_1
    //   220: ldc 113
    //   222: iconst_1
    //   223: anewarray 4	java/lang/Object
    //   226: dup
    //   227: iconst_0
    //   228: getstatic 95	com/tencent/mm/protocal/d:tJC	I
    //   231: invokestatic 100	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   234: aastore
    //   235: invokestatic 120	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   238: astore 7
    //   240: aload 6
    //   242: astore_1
    //   243: aload_0
    //   244: getfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   247: invokevirtual 138	java/util/ArrayList:size	()I
    //   250: ifeq +30 -> 280
    //   253: aload 6
    //   255: astore_1
    //   256: aload 7
    //   258: aload_0
    //   259: getfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   262: aload_0
    //   263: getfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   266: invokevirtual 138	java/util/ArrayList:size	()I
    //   269: iconst_1
    //   270: isub
    //   271: invokevirtual 142	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   274: invokevirtual 145	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   277: ifne +503 -> 780
    //   280: aload 6
    //   282: astore_1
    //   283: iconst_1
    //   284: putstatic 26	com/tencent/mm/y/bz:gpw	Z
    //   287: aload 6
    //   289: astore_1
    //   290: aload_0
    //   291: getfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   294: aload 7
    //   296: invokevirtual 134	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   299: pop
    //   300: aload 6
    //   302: astore_1
    //   303: aload 6
    //   305: lload 4
    //   307: invokevirtual 111	java/io/RandomAccessFile:seek	(J)V
    //   310: aload 6
    //   312: astore_1
    //   313: aload 6
    //   315: new 52	java/lang/StringBuilder
    //   318: dup
    //   319: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   322: aload 7
    //   324: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: ldc 122
    //   329: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   335: invokevirtual 126	java/lang/String:getBytes	()[B
    //   338: invokevirtual 130	java/io/RandomAccessFile:write	([B)V
    //   341: goto +439 -> 780
    //   344: aload 6
    //   346: astore_1
    //   347: iload_3
    //   348: aload_0
    //   349: getfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   352: invokevirtual 138	java/util/ArrayList:size	()I
    //   355: if_icmpge +268 -> 623
    //   358: aload 6
    //   360: astore_1
    //   361: new 52	java/lang/StringBuilder
    //   364: dup
    //   365: invokespecial 53	java/lang/StringBuilder:<init>	()V
    //   368: aload 7
    //   370: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: aload_0
    //   374: getfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   377: iload_3
    //   378: invokevirtual 142	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   381: checkcast 116	java/lang/String
    //   384: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: ldc -109
    //   389: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   395: astore 7
    //   397: iload_3
    //   398: iconst_1
    //   399: iadd
    //   400: istore_3
    //   401: goto -57 -> 344
    //   404: aload 6
    //   406: astore_1
    //   407: aload 6
    //   409: invokevirtual 150	java/io/RandomAccessFile:getFilePointer	()J
    //   412: lload 4
    //   414: lcmp
    //   415: ifge -198 -> 217
    //   418: aload 6
    //   420: astore_1
    //   421: aload 6
    //   423: invokevirtual 153	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   426: ldc 48
    //   428: invokestatic 159	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   431: astore 7
    //   433: aload 6
    //   435: astore_1
    //   436: aload 7
    //   438: invokevirtual 161	java/lang/String:length	()I
    //   441: bipush 8
    //   443: if_icmpeq +107 -> 550
    //   446: aload 6
    //   448: astore_1
    //   449: ldc 76
    //   451: ldc -93
    //   453: iconst_2
    //   454: anewarray 4	java/lang/Object
    //   457: dup
    //   458: iconst_0
    //   459: aload 7
    //   461: invokevirtual 161	java/lang/String:length	()I
    //   464: invokestatic 100	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   467: aastore
    //   468: dup
    //   469: iconst_1
    //   470: aload_0
    //   471: getfield 50	com/tencent/mm/y/bz:gpy	Ljava/lang/String;
    //   474: aastore
    //   475: invokestatic 166	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   478: goto -74 -> 404
    //   481: astore 7
    //   483: aload 6
    //   485: astore_1
    //   486: ldc 76
    //   488: aload 7
    //   490: ldc -88
    //   492: iconst_1
    //   493: anewarray 4	java/lang/Object
    //   496: dup
    //   497: iconst_0
    //   498: ldc 48
    //   500: aastore
    //   501: invokestatic 172	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   504: aload 6
    //   506: invokevirtual 175	java/io/RandomAccessFile:close	()V
    //   509: getstatic 28	com/tencent/mm/y/bz:gpz	Lcom/tencent/mm/y/bz;
    //   512: ifnull +29 -> 541
    //   515: getstatic 28	com/tencent/mm/y/bz:gpz	Lcom/tencent/mm/y/bz;
    //   518: aload_0
    //   519: if_acmpeq +22 -> 541
    //   522: getstatic 28	com/tencent/mm/y/bz:gpz	Lcom/tencent/mm/y/bz;
    //   525: getfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   528: invokevirtual 138	java/util/ArrayList:size	()I
    //   531: aload_0
    //   532: getfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   535: invokevirtual 138	java/util/ArrayList:size	()I
    //   538: if_icmplt +193 -> 731
    //   541: ldc2_w 39
    //   544: ldc 41
    //   546: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   549: return
    //   550: aload 6
    //   552: astore_1
    //   553: aload 7
    //   555: ldc -79
    //   557: invokevirtual 181	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   560: ifne +47 -> 607
    //   563: aload 6
    //   565: astore_1
    //   566: ldc 76
    //   568: ldc -73
    //   570: iconst_2
    //   571: anewarray 4	java/lang/Object
    //   574: dup
    //   575: iconst_0
    //   576: aload 7
    //   578: aastore
    //   579: dup
    //   580: iconst_1
    //   581: aload_0
    //   582: getfield 50	com/tencent/mm/y/bz:gpy	Ljava/lang/String;
    //   585: aastore
    //   586: invokestatic 166	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   589: goto -185 -> 404
    //   592: astore 7
    //   594: aload_1
    //   595: astore 6
    //   597: aload 7
    //   599: astore_1
    //   600: aload 6
    //   602: invokevirtual 175	java/io/RandomAccessFile:close	()V
    //   605: aload_1
    //   606: athrow
    //   607: aload 6
    //   609: astore_1
    //   610: aload_0
    //   611: getfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   614: aload 7
    //   616: invokevirtual 134	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   619: pop
    //   620: goto -216 -> 404
    //   623: aload 6
    //   625: astore_1
    //   626: ldc 76
    //   628: ldc -71
    //   630: iconst_3
    //   631: anewarray 4	java/lang/Object
    //   634: dup
    //   635: iconst_0
    //   636: getstatic 26	com/tencent/mm/y/bz:gpw	Z
    //   639: invokestatic 89	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   642: aastore
    //   643: dup
    //   644: iconst_1
    //   645: aload 7
    //   647: aastore
    //   648: dup
    //   649: iconst_2
    //   650: aload_0
    //   651: getfield 50	com/tencent/mm/y/bz:gpy	Ljava/lang/String;
    //   654: aastore
    //   655: invokestatic 105	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   658: aload 6
    //   660: invokevirtual 175	java/io/RandomAccessFile:close	()V
    //   663: goto -154 -> 509
    //   666: astore_1
    //   667: ldc 76
    //   669: aload_1
    //   670: ldc -69
    //   672: iconst_1
    //   673: anewarray 4	java/lang/Object
    //   676: dup
    //   677: iconst_0
    //   678: ldc 48
    //   680: aastore
    //   681: invokestatic 172	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   684: goto -175 -> 509
    //   687: astore_1
    //   688: ldc 76
    //   690: aload_1
    //   691: ldc -69
    //   693: iconst_1
    //   694: anewarray 4	java/lang/Object
    //   697: dup
    //   698: iconst_0
    //   699: ldc 48
    //   701: aastore
    //   702: invokestatic 172	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   705: goto -196 -> 509
    //   708: astore 6
    //   710: ldc 76
    //   712: aload 6
    //   714: ldc -69
    //   716: iconst_1
    //   717: anewarray 4	java/lang/Object
    //   720: dup
    //   721: iconst_0
    //   722: ldc 48
    //   724: aastore
    //   725: invokestatic 172	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   728: goto -123 -> 605
    //   731: getstatic 28	com/tencent/mm/y/bz:gpz	Lcom/tencent/mm/y/bz;
    //   734: aload_0
    //   735: getfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   738: putfield 46	com/tencent/mm/y/bz:gpx	Ljava/util/ArrayList;
    //   741: aload_0
    //   742: getfield 50	com/tencent/mm/y/bz:gpy	Ljava/lang/String;
    //   745: getstatic 28	com/tencent/mm/y/bz:gpz	Lcom/tencent/mm/y/bz;
    //   748: getfield 50	com/tencent/mm/y/bz:gpy	Ljava/lang/String;
    //   751: iconst_0
    //   752: invokestatic 193	com/tencent/mm/sdk/platformtools/j:r	(Ljava/lang/String;Ljava/lang/String;Z)Z
    //   755: pop
    //   756: ldc2_w 39
    //   759: ldc 41
    //   761: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   764: return
    //   765: astore_1
    //   766: aconst_null
    //   767: astore 6
    //   769: goto -169 -> 600
    //   772: astore 7
    //   774: aconst_null
    //   775: astore 6
    //   777: goto -294 -> 483
    //   780: ldc 48
    //   782: astore 7
    //   784: iconst_0
    //   785: istore_3
    //   786: goto -442 -> 344
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	789	0	this	bz
    //   0	789	1	paramString	String
    //   0	789	2	paramBoolean	boolean
    //   347	439	3	i	int
    //   75	338	4	l	long
    //   65	594	6	localObject1	Object
    //   708	5	6	localException1	Exception
    //   767	9	6	localObject2	Object
    //   171	289	7	str1	String
    //   481	96	7	localException2	Exception
    //   592	54	7	localObject3	Object
    //   772	1	7	localException3	Exception
    //   782	1	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   70	77	481	java/lang/Exception
    //   80	122	481	java/lang/Exception
    //   141	147	481	java/lang/Exception
    //   154	173	481	java/lang/Exception
    //   176	204	481	java/lang/Exception
    //   207	217	481	java/lang/Exception
    //   220	240	481	java/lang/Exception
    //   243	253	481	java/lang/Exception
    //   256	280	481	java/lang/Exception
    //   283	287	481	java/lang/Exception
    //   290	300	481	java/lang/Exception
    //   303	310	481	java/lang/Exception
    //   313	341	481	java/lang/Exception
    //   347	358	481	java/lang/Exception
    //   361	397	481	java/lang/Exception
    //   407	418	481	java/lang/Exception
    //   421	433	481	java/lang/Exception
    //   436	446	481	java/lang/Exception
    //   449	478	481	java/lang/Exception
    //   553	563	481	java/lang/Exception
    //   566	589	481	java/lang/Exception
    //   610	620	481	java/lang/Exception
    //   626	658	481	java/lang/Exception
    //   70	77	592	finally
    //   80	122	592	finally
    //   141	147	592	finally
    //   154	173	592	finally
    //   176	204	592	finally
    //   207	217	592	finally
    //   220	240	592	finally
    //   243	253	592	finally
    //   256	280	592	finally
    //   283	287	592	finally
    //   290	300	592	finally
    //   303	310	592	finally
    //   313	341	592	finally
    //   347	358	592	finally
    //   361	397	592	finally
    //   407	418	592	finally
    //   421	433	592	finally
    //   436	446	592	finally
    //   449	478	592	finally
    //   486	504	592	finally
    //   553	563	592	finally
    //   566	589	592	finally
    //   610	620	592	finally
    //   626	658	592	finally
    //   658	663	666	java/lang/Exception
    //   504	509	687	java/lang/Exception
    //   600	605	708	java/lang/Exception
    //   29	67	765	finally
    //   29	67	772	java/lang/Exception
  }
  
  public static String BV()
  {
    GMTrace.i(13484720914432L, 100469);
    if (gpz != null)
    {
      bz localbz = gpz;
      if (4 >= localbz.gpx.size()) {}
      String str;
      for (int i = 0;; i = localbz.gpx.size() - 4)
      {
        str = "";
        while (i < localbz.gpx.size())
        {
          str = str + (String)localbz.gpx.get(i) + ";";
          i += 1;
        }
      }
      GMTrace.o(13484720914432L, 100469);
      return str;
    }
    GMTrace.o(13484720914432L, 100469);
    return "";
  }
  
  public static void ha(String paramString)
  {
    GMTrace.i(13484586696704L, 100468);
    gpz = new bz(paramString, true);
    GMTrace.o(13484586696704L, 100468);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
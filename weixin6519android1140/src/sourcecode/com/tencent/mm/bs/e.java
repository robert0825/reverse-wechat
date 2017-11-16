package com.tencent.mm.bs;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.a;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e
{
  private static f veA;
  private static b veB;
  private static d veC;
  private static String veD;
  private static boolean veE;
  private static boolean veF;
  private static ArrayList<Integer> veG;
  private static final List<String> vey;
  private static e vez;
  
  static
  {
    GMTrace.i(370977800192L, 2764);
    vey = Arrays.asList(new String[] { "zh_CN" });
    veD = "";
    veE = false;
    veF = true;
    veG = new ArrayList();
    GMTrace.o(370977800192L, 2764);
  }
  
  private e()
  {
    GMTrace.i(369367187456L, 2752);
    GMTrace.o(369367187456L, 2752);
  }
  
  private static int a(DataInputStream paramDataInputStream, SparseArray<b.a> paramSparseArray, int paramInt1, int paramInt2)
  {
    GMTrace.i(370709364736L, 2762);
    try
    {
      int m = paramDataInputStream.readByte();
      if (m < 0)
      {
        GMTrace.o(370709364736L, 2762);
        return 0;
      }
      int[] arrayOfInt1 = new int[m];
      int[] arrayOfInt2 = new int[m];
      int j = 0;
      int k = 0;
      int i = paramInt2;
      paramInt2 = k;
      while (paramInt2 < m)
      {
        arrayOfInt1[paramInt2] = paramDataInputStream.readByte();
        arrayOfInt2[paramInt2] = i;
        k = paramDataInputStream.readShort();
        j += k;
        i += k;
        paramInt2 += 1;
      }
      paramSparseArray.append(paramInt1, new b.a(paramInt1, arrayOfInt1, arrayOfInt2));
      GMTrace.o(370709364736L, 2762);
      return j;
    }
    catch (IOException paramDataInputStream)
    {
      w.e("MicroMsg.language.StringResouces", "exception:%s", new Object[] { bg.f(paramDataInputStream) });
      GMTrace.o(370709364736L, 2762);
    }
    return 0;
  }
  
  /* Error */
  private static void a(android.content.res.AssetManager paramAssetManager, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 114
    //   3: sipush 2755
    //   6: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokestatic 119	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   13: ifeq +20 -> 33
    //   16: ldc 96
    //   18: ldc 121
    //   20: invokestatic 125	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: ldc2_w 114
    //   26: sipush 2755
    //   29: invokestatic 63	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   32: return
    //   33: aload_1
    //   34: getstatic 49	com/tencent/mm/bs/e:veD	Ljava/lang/String;
    //   37: invokevirtual 129	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   40: ifeq +28 -> 68
    //   43: ldc 96
    //   45: ldc -125
    //   47: iconst_1
    //   48: anewarray 4	java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: aload_1
    //   54: aastore
    //   55: invokestatic 133	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   58: ldc2_w 114
    //   61: sipush 2755
    //   64: invokestatic 63	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   67: return
    //   68: aload_1
    //   69: ldc -121
    //   71: invokevirtual 139	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   74: istore_2
    //   75: aload_1
    //   76: astore 11
    //   78: iload_2
    //   79: ifle +48 -> 127
    //   82: aload_1
    //   83: iconst_0
    //   84: iload_2
    //   85: invokevirtual 143	java/lang/String:substring	(II)Ljava/lang/String;
    //   88: astore 10
    //   90: aload_1
    //   91: astore 11
    //   93: aload 10
    //   95: ldc -111
    //   97: invokevirtual 148	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   100: ifne +27 -> 127
    //   103: ldc 96
    //   105: ldc -106
    //   107: iconst_2
    //   108: anewarray 4	java/lang/Object
    //   111: dup
    //   112: iconst_0
    //   113: aload_1
    //   114: aastore
    //   115: dup
    //   116: iconst_1
    //   117: aload 10
    //   119: aastore
    //   120: invokestatic 153	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: aload 10
    //   125: astore 11
    //   127: invokestatic 156	com/tencent/mm/bs/e:clean	()V
    //   130: aload 11
    //   132: putstatic 49	com/tencent/mm/bs/e:veD	Ljava/lang/String;
    //   135: ldc 96
    //   137: ldc -98
    //   139: invokestatic 160	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: invokestatic 166	java/lang/System:currentTimeMillis	()J
    //   145: lstore 8
    //   147: aload_0
    //   148: new 168	java/lang/StringBuilder
    //   151: dup
    //   152: ldc -86
    //   154: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   157: aload 11
    //   159: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: ldc -78
    //   164: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   170: invokevirtual 188	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   173: astore_0
    //   174: new 75	java/io/DataInputStream
    //   177: dup
    //   178: aload_0
    //   179: invokespecial 191	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   182: astore 12
    //   184: aload 12
    //   186: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   189: pop
    //   190: aload 12
    //   192: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   195: pop
    //   196: aload 12
    //   198: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   201: istore 5
    //   203: ldc 96
    //   205: new 168	java/lang/StringBuilder
    //   208: dup
    //   209: ldc -59
    //   211: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   214: iload 5
    //   216: invokevirtual 200	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   219: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   222: invokestatic 160	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   225: new 202	android/util/SparseIntArray
    //   228: dup
    //   229: iload 5
    //   231: invokespecial 205	android/util/SparseIntArray:<init>	(I)V
    //   234: astore_1
    //   235: aload 12
    //   237: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   240: istore 4
    //   242: iconst_0
    //   243: istore_2
    //   244: iconst_0
    //   245: istore_3
    //   246: iload_2
    //   247: iload 5
    //   249: if_icmpge +35 -> 284
    //   252: iload 4
    //   254: aload 12
    //   256: invokevirtual 83	java/io/DataInputStream:readShort	()S
    //   259: iadd
    //   260: istore 4
    //   262: aload_1
    //   263: iload 4
    //   265: iload_3
    //   266: invokevirtual 208	android/util/SparseIntArray:append	(II)V
    //   269: iload_3
    //   270: aload 12
    //   272: invokevirtual 83	java/io/DataInputStream:readShort	()S
    //   275: iadd
    //   276: istore_3
    //   277: iload_2
    //   278: iconst_1
    //   279: iadd
    //   280: istore_2
    //   281: goto -35 -> 246
    //   284: aload_1
    //   285: aload 12
    //   287: iload_3
    //   288: invokestatic 213	com/tencent/mm/bs/f:a	(Landroid/util/SparseIntArray;Ljava/io/InputStream;I)Lcom/tencent/mm/bs/f;
    //   291: putstatic 215	com/tencent/mm/bs/e:veA	Lcom/tencent/mm/bs/f;
    //   294: iconst_0
    //   295: istore_2
    //   296: aload 12
    //   298: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   301: istore 5
    //   303: ldc 96
    //   305: ldc -39
    //   307: iconst_1
    //   308: anewarray 4	java/lang/Object
    //   311: dup
    //   312: iconst_0
    //   313: iload 5
    //   315: invokestatic 223	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   318: aastore
    //   319: invokestatic 133	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   322: iload 5
    //   324: ifle +67 -> 391
    //   327: new 90	android/util/SparseArray
    //   330: dup
    //   331: iload 5
    //   333: invokespecial 224	android/util/SparseArray:<init>	(I)V
    //   336: astore_1
    //   337: aload 12
    //   339: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   342: istore 4
    //   344: iconst_0
    //   345: istore_3
    //   346: iload_2
    //   347: iload 5
    //   349: if_icmpge +32 -> 381
    //   352: iload 4
    //   354: aload 12
    //   356: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   359: iadd
    //   360: istore 4
    //   362: iload_3
    //   363: aload 12
    //   365: aload_1
    //   366: iload 4
    //   368: iload_3
    //   369: invokestatic 226	com/tencent/mm/bs/e:a	(Ljava/io/DataInputStream;Landroid/util/SparseArray;II)I
    //   372: iadd
    //   373: istore_3
    //   374: iload_2
    //   375: iconst_1
    //   376: iadd
    //   377: istore_2
    //   378: goto -32 -> 346
    //   381: aload_1
    //   382: aload 12
    //   384: iload_3
    //   385: invokestatic 231	com/tencent/mm/bs/b:a	(Landroid/util/SparseArray;Ljava/io/InputStream;I)Lcom/tencent/mm/bs/b;
    //   388: putstatic 233	com/tencent/mm/bs/e:veB	Lcom/tencent/mm/bs/b;
    //   391: aload 12
    //   393: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   396: istore 6
    //   398: aload 12
    //   400: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   403: istore 4
    //   405: ldc 96
    //   407: ldc -21
    //   409: iconst_1
    //   410: anewarray 4	java/lang/Object
    //   413: dup
    //   414: iconst_0
    //   415: iload 6
    //   417: invokestatic 223	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   420: aastore
    //   421: invokestatic 133	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   424: iload 6
    //   426: ifle +117 -> 543
    //   429: new 90	android/util/SparseArray
    //   432: dup
    //   433: iload 6
    //   435: invokespecial 224	android/util/SparseArray:<init>	(I)V
    //   438: astore_1
    //   439: iconst_0
    //   440: istore_3
    //   441: iconst_0
    //   442: istore_2
    //   443: iload_2
    //   444: iload 6
    //   446: if_icmpge +87 -> 533
    //   449: aload 12
    //   451: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   454: iload 4
    //   456: iadd
    //   457: istore 5
    //   459: aload 12
    //   461: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   464: istore 7
    //   466: iload 7
    //   468: newarray <illegal type>
    //   470: astore 10
    //   472: iconst_0
    //   473: istore 4
    //   475: iload 4
    //   477: iload 7
    //   479: if_icmpge +26 -> 505
    //   482: aload 10
    //   484: iload 4
    //   486: iload_3
    //   487: iastore
    //   488: iload_3
    //   489: aload 12
    //   491: invokevirtual 83	java/io/DataInputStream:readShort	()S
    //   494: iadd
    //   495: istore_3
    //   496: iload 4
    //   498: iconst_1
    //   499: iadd
    //   500: istore 4
    //   502: goto -27 -> 475
    //   505: aload_1
    //   506: iload 5
    //   508: new 237	com/tencent/mm/bs/d$a
    //   511: dup
    //   512: iload 5
    //   514: aload 10
    //   516: invokespecial 240	com/tencent/mm/bs/d$a:<init>	(I[I)V
    //   519: invokevirtual 94	android/util/SparseArray:append	(ILjava/lang/Object;)V
    //   522: iload_2
    //   523: iconst_1
    //   524: iadd
    //   525: istore_2
    //   526: iload 5
    //   528: istore 4
    //   530: goto -87 -> 443
    //   533: aload_1
    //   534: aload 12
    //   536: iload_3
    //   537: invokestatic 246	com/tencent/mm/bs/d:b	(Landroid/util/SparseArray;Ljava/io/InputStream;I)Lcom/tencent/mm/bs/d;
    //   540: putstatic 248	com/tencent/mm/bs/e:veC	Lcom/tencent/mm/bs/d;
    //   543: aload_0
    //   544: ifnull +7 -> 551
    //   547: aload_0
    //   548: invokevirtual 253	java/io/InputStream:close	()V
    //   551: aload 12
    //   553: invokevirtual 254	java/io/DataInputStream:close	()V
    //   556: ldc 96
    //   558: new 168	java/lang/StringBuilder
    //   561: dup
    //   562: ldc_w 256
    //   565: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   568: invokestatic 166	java/lang/System:currentTimeMillis	()J
    //   571: lload 8
    //   573: lsub
    //   574: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   577: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   580: invokestatic 160	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   583: ldc2_w 114
    //   586: sipush 2755
    //   589: invokestatic 63	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   592: return
    //   593: astore_0
    //   594: ldc 96
    //   596: ldc 98
    //   598: iconst_1
    //   599: anewarray 4	java/lang/Object
    //   602: dup
    //   603: iconst_0
    //   604: aload_0
    //   605: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   608: aastore
    //   609: invokestatic 110	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   612: goto -61 -> 551
    //   615: astore_0
    //   616: ldc 96
    //   618: ldc 98
    //   620: iconst_1
    //   621: anewarray 4	java/lang/Object
    //   624: dup
    //   625: iconst_0
    //   626: aload_0
    //   627: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   630: aastore
    //   631: invokestatic 110	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   634: goto -78 -> 556
    //   637: astore 10
    //   639: aconst_null
    //   640: astore_1
    //   641: aconst_null
    //   642: astore_0
    //   643: ldc 96
    //   645: aload 10
    //   647: ldc_w 261
    //   650: iconst_1
    //   651: anewarray 4	java/lang/Object
    //   654: dup
    //   655: iconst_0
    //   656: aload 11
    //   658: aastore
    //   659: invokestatic 265	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   662: aload_1
    //   663: ifnull +7 -> 670
    //   666: aload_1
    //   667: invokevirtual 253	java/io/InputStream:close	()V
    //   670: aload_0
    //   671: ifnull -115 -> 556
    //   674: aload_0
    //   675: invokevirtual 254	java/io/DataInputStream:close	()V
    //   678: goto -122 -> 556
    //   681: astore_0
    //   682: ldc 96
    //   684: ldc 98
    //   686: iconst_1
    //   687: anewarray 4	java/lang/Object
    //   690: dup
    //   691: iconst_0
    //   692: aload_0
    //   693: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   696: aastore
    //   697: invokestatic 110	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   700: goto -144 -> 556
    //   703: astore_1
    //   704: ldc 96
    //   706: ldc 98
    //   708: iconst_1
    //   709: anewarray 4	java/lang/Object
    //   712: dup
    //   713: iconst_0
    //   714: aload_1
    //   715: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   718: aastore
    //   719: invokestatic 110	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   722: goto -52 -> 670
    //   725: astore_1
    //   726: aconst_null
    //   727: astore_0
    //   728: aconst_null
    //   729: astore 10
    //   731: aload_0
    //   732: ifnull +7 -> 739
    //   735: aload_0
    //   736: invokevirtual 253	java/io/InputStream:close	()V
    //   739: aload 10
    //   741: ifnull +8 -> 749
    //   744: aload 10
    //   746: invokevirtual 254	java/io/DataInputStream:close	()V
    //   749: aload_1
    //   750: athrow
    //   751: astore_0
    //   752: ldc 96
    //   754: ldc 98
    //   756: iconst_1
    //   757: anewarray 4	java/lang/Object
    //   760: dup
    //   761: iconst_0
    //   762: aload_0
    //   763: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   766: aastore
    //   767: invokestatic 110	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   770: goto -31 -> 739
    //   773: astore_0
    //   774: ldc 96
    //   776: ldc 98
    //   778: iconst_1
    //   779: anewarray 4	java/lang/Object
    //   782: dup
    //   783: iconst_0
    //   784: aload_0
    //   785: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   788: aastore
    //   789: invokestatic 110	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   792: goto -43 -> 749
    //   795: astore_1
    //   796: aconst_null
    //   797: astore 10
    //   799: goto -68 -> 731
    //   802: astore_1
    //   803: aload 12
    //   805: astore 10
    //   807: goto -76 -> 731
    //   810: astore 10
    //   812: aload_1
    //   813: astore 11
    //   815: aload 10
    //   817: astore_1
    //   818: aload_0
    //   819: astore 10
    //   821: aload 11
    //   823: astore_0
    //   824: goto -93 -> 731
    //   827: astore 10
    //   829: aconst_null
    //   830: astore 12
    //   832: aload_0
    //   833: astore_1
    //   834: aload 12
    //   836: astore_0
    //   837: goto -194 -> 643
    //   840: astore 10
    //   842: aload_0
    //   843: astore_1
    //   844: aload 12
    //   846: astore_0
    //   847: goto -204 -> 643
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	850	0	paramAssetManager	android.content.res.AssetManager
    //   0	850	1	paramString	String
    //   74	452	2	i	int
    //   245	292	3	j	int
    //   240	289	4	k	int
    //   201	326	5	m	int
    //   396	51	6	n	int
    //   464	16	7	i1	int
    //   145	427	8	l	long
    //   88	427	10	localObject1	Object
    //   637	9	10	localIOException1	IOException
    //   729	77	10	localObject2	Object
    //   810	6	10	localObject3	Object
    //   819	1	10	localAssetManager	android.content.res.AssetManager
    //   827	1	10	localIOException2	IOException
    //   840	1	10	localIOException3	IOException
    //   76	746	11	localObject4	Object
    //   182	663	12	localDataInputStream	DataInputStream
    // Exception table:
    //   from	to	target	type
    //   547	551	593	java/io/IOException
    //   551	556	615	java/io/IOException
    //   147	174	637	java/io/IOException
    //   674	678	681	java/io/IOException
    //   666	670	703	java/io/IOException
    //   147	174	725	finally
    //   735	739	751	java/io/IOException
    //   744	749	773	java/io/IOException
    //   174	184	795	finally
    //   184	242	802	finally
    //   252	277	802	finally
    //   284	294	802	finally
    //   296	322	802	finally
    //   327	344	802	finally
    //   352	374	802	finally
    //   381	391	802	finally
    //   391	424	802	finally
    //   429	439	802	finally
    //   449	472	802	finally
    //   488	496	802	finally
    //   505	522	802	finally
    //   533	543	802	finally
    //   643	662	810	finally
    //   174	184	827	java/io/IOException
    //   184	242	840	java/io/IOException
    //   252	277	840	java/io/IOException
    //   284	294	840	java/io/IOException
    //   296	322	840	java/io/IOException
    //   327	344	840	java/io/IOException
    //   352	374	840	java/io/IOException
    //   381	391	840	java/io/IOException
    //   391	424	840	java/io/IOException
    //   429	439	840	java/io/IOException
    //   449	472	840	java/io/IOException
    //   488	496	840	java/io/IOException
    //   505	522	840	java/io/IOException
    //   533	543	840	java/io/IOException
  }
  
  public static boolean bOC()
  {
    GMTrace.i(15683341516800L, 116850);
    boolean bool = veF;
    GMTrace.o(15683341516800L, 116850);
    return bool;
  }
  
  public static e bOD()
  {
    GMTrace.i(369232969728L, 2751);
    try
    {
      if (vez == null) {
        vez = new e();
      }
      e locale = vez;
      GMTrace.o(369232969728L, 2751);
      return locale;
    }
    finally {}
  }
  
  public static boolean bOE()
  {
    GMTrace.i(369904058368L, 2756);
    if ((!veF) || (!veE)) {
      if ((veG == null) || (veG.isEmpty())) {
        break label53;
      }
    }
    label53:
    for (int i = 1; i != 0; i = 0)
    {
      GMTrace.o(369904058368L, 2756);
      return true;
    }
    GMTrace.o(369904058368L, 2756);
    return false;
  }
  
  private static void clean()
  {
    GMTrace.i(369501405184L, 2753);
    Object localObject;
    if (veA != null)
    {
      localObject = veA;
      if (((f)localObject).veH != null) {
        ((f)localObject).veH.clear();
      }
      if (((f)localObject).veI != null) {
        ((f)localObject).veI = null;
      }
    }
    if (veB != null)
    {
      localObject = veB;
      if (((b)localObject).veq != null) {
        ((b)localObject).veq.clear();
      }
      if (((b)localObject).jkV != null) {
        ((b)localObject).jkV = null;
      }
    }
    if (veC != null)
    {
      localObject = veC;
      if (((d)localObject).vew != null) {
        ((d)localObject).vew.clear();
      }
      if (((d)localObject).jkV != null) {
        ((d)localObject).jkV = null;
      }
    }
    GMTrace.o(369501405184L, 2753);
  }
  
  public static CharSequence d(int paramInt, CharSequence paramCharSequence)
  {
    GMTrace.i(370843582464L, 2763);
    if (paramCharSequence == null)
    {
      GMTrace.o(370843582464L, 2763);
      return paramCharSequence;
    }
    if ((veG == null) || (veG.isEmpty()))
    {
      GMTrace.o(370843582464L, 2763);
      return paramCharSequence;
    }
    if (veG.contains(Integer.valueOf(paramInt)))
    {
      paramCharSequence = a.n(paramCharSequence.toString(), g.n("lucky".getBytes()).substring(0, 16));
      GMTrace.o(370843582464L, 2763);
      return paramCharSequence;
    }
    GMTrace.o(370843582464L, 2763);
    return paramCharSequence;
  }
  
  /* Error */
  public static e eh(android.content.Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 337
    //   3: sipush 2754
    //   6: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokevirtual 344	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   13: ifnonnull +22 -> 35
    //   16: ldc 96
    //   18: ldc_w 346
    //   21: invokestatic 348	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: ldc2_w 337
    //   27: sipush 2754
    //   30: invokestatic 63	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   33: aconst_null
    //   34: areturn
    //   35: aload_0
    //   36: invokevirtual 352	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   39: astore 8
    //   41: aload 8
    //   43: ifnull +187 -> 230
    //   46: invokestatic 354	com/tencent/mm/bs/e:bOD	()Lcom/tencent/mm/bs/e;
    //   49: pop
    //   50: ldc 96
    //   52: ldc_w 356
    //   55: invokestatic 160	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: getstatic 60	com/tencent/mm/bs/e:veG	Ljava/util/ArrayList;
    //   61: ifnonnull +13 -> 74
    //   64: new 55	java/util/ArrayList
    //   67: dup
    //   68: invokespecial 58	java/util/ArrayList:<init>	()V
    //   71: putstatic 60	com/tencent/mm/bs/e:veG	Ljava/util/ArrayList;
    //   74: getstatic 60	com/tencent/mm/bs/e:veG	Ljava/util/ArrayList;
    //   77: invokevirtual 357	java/util/ArrayList:clear	()V
    //   80: invokestatic 166	java/lang/System:currentTimeMillis	()J
    //   83: lstore_2
    //   84: aconst_null
    //   85: astore 7
    //   87: aload 8
    //   89: ldc_w 359
    //   92: invokevirtual 188	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   95: astore 5
    //   97: new 75	java/io/DataInputStream
    //   100: dup
    //   101: aload 5
    //   103: invokespecial 191	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   106: astore 6
    //   108: aload 6
    //   110: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   113: invokestatic 223	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   116: astore 7
    //   118: ldc 96
    //   120: ldc_w 361
    //   123: iconst_1
    //   124: anewarray 4	java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: aload 7
    //   131: aastore
    //   132: invokestatic 153	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: iconst_0
    //   136: istore_1
    //   137: iload_1
    //   138: aload 7
    //   140: invokevirtual 364	java/lang/Integer:intValue	()I
    //   143: if_icmpge +46 -> 189
    //   146: aload 6
    //   148: invokevirtual 195	java/io/DataInputStream:readInt	()I
    //   151: invokestatic 223	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   154: astore 9
    //   156: getstatic 60	com/tencent/mm/bs/e:veG	Ljava/util/ArrayList;
    //   159: aload 9
    //   161: invokevirtual 367	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   164: pop
    //   165: ldc 96
    //   167: ldc_w 369
    //   170: iconst_1
    //   171: anewarray 4	java/lang/Object
    //   174: dup
    //   175: iconst_0
    //   176: aload 9
    //   178: aastore
    //   179: invokestatic 153	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   182: iload_1
    //   183: iconst_1
    //   184: iadd
    //   185: istore_1
    //   186: goto -49 -> 137
    //   189: aload 5
    //   191: ifnull +8 -> 199
    //   194: aload 5
    //   196: invokevirtual 253	java/io/InputStream:close	()V
    //   199: aload 6
    //   201: invokevirtual 254	java/io/DataInputStream:close	()V
    //   204: ldc 96
    //   206: new 168	java/lang/StringBuilder
    //   209: dup
    //   210: ldc_w 371
    //   213: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   216: invokestatic 166	java/lang/System:currentTimeMillis	()J
    //   219: lload_2
    //   220: lsub
    //   221: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   224: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   227: invokestatic 160	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   230: aload 8
    //   232: ifnull +13 -> 245
    //   235: invokestatic 354	com/tencent/mm/bs/e:bOD	()Lcom/tencent/mm/bs/e;
    //   238: pop
    //   239: getstatic 53	com/tencent/mm/bs/e:veF	Z
    //   242: ifne +227 -> 469
    //   245: ldc2_w 337
    //   248: sipush 2754
    //   251: invokestatic 63	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   254: aconst_null
    //   255: areturn
    //   256: astore 5
    //   258: ldc 96
    //   260: ldc 98
    //   262: iconst_1
    //   263: anewarray 4	java/lang/Object
    //   266: dup
    //   267: iconst_0
    //   268: aload 5
    //   270: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   273: aastore
    //   274: invokestatic 110	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: goto -78 -> 199
    //   280: astore 5
    //   282: ldc 96
    //   284: ldc 98
    //   286: iconst_1
    //   287: anewarray 4	java/lang/Object
    //   290: dup
    //   291: iconst_0
    //   292: aload 5
    //   294: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   297: aastore
    //   298: invokestatic 110	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   301: goto -97 -> 204
    //   304: astore 5
    //   306: aconst_null
    //   307: astore 6
    //   309: aconst_null
    //   310: astore 5
    //   312: ldc 96
    //   314: ldc_w 373
    //   317: invokestatic 125	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   320: aload 6
    //   322: ifnull +8 -> 330
    //   325: aload 6
    //   327: invokevirtual 253	java/io/InputStream:close	()V
    //   330: aload 5
    //   332: ifnull -128 -> 204
    //   335: aload 5
    //   337: invokevirtual 254	java/io/DataInputStream:close	()V
    //   340: goto -136 -> 204
    //   343: astore 5
    //   345: ldc 96
    //   347: ldc 98
    //   349: iconst_1
    //   350: anewarray 4	java/lang/Object
    //   353: dup
    //   354: iconst_0
    //   355: aload 5
    //   357: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   360: aastore
    //   361: invokestatic 110	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   364: goto -160 -> 204
    //   367: astore 6
    //   369: ldc 96
    //   371: ldc 98
    //   373: iconst_1
    //   374: anewarray 4	java/lang/Object
    //   377: dup
    //   378: iconst_0
    //   379: aload 6
    //   381: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   384: aastore
    //   385: invokestatic 110	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: goto -58 -> 330
    //   391: astore_0
    //   392: aconst_null
    //   393: astore 5
    //   395: aload 7
    //   397: astore 6
    //   399: aload 5
    //   401: ifnull +8 -> 409
    //   404: aload 5
    //   406: invokevirtual 253	java/io/InputStream:close	()V
    //   409: aload 6
    //   411: ifnull +8 -> 419
    //   414: aload 6
    //   416: invokevirtual 254	java/io/DataInputStream:close	()V
    //   419: aload_0
    //   420: athrow
    //   421: astore 5
    //   423: ldc 96
    //   425: ldc 98
    //   427: iconst_1
    //   428: anewarray 4	java/lang/Object
    //   431: dup
    //   432: iconst_0
    //   433: aload 5
    //   435: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   438: aastore
    //   439: invokestatic 110	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   442: goto -33 -> 409
    //   445: astore 5
    //   447: ldc 96
    //   449: ldc 98
    //   451: iconst_1
    //   452: anewarray 4	java/lang/Object
    //   455: dup
    //   456: iconst_0
    //   457: aload 5
    //   459: invokestatic 104	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   462: aastore
    //   463: invokestatic 110	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   466: goto -47 -> 419
    //   469: aload_0
    //   470: invokestatic 378	com/tencent/mm/sdk/platformtools/ab:bPU	()Ljava/lang/String;
    //   473: iconst_0
    //   474: invokevirtual 382	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   477: invokestatic 387	com/tencent/mm/sdk/platformtools/v:d	(Landroid/content/SharedPreferences;)Ljava/lang/String;
    //   480: astore 5
    //   482: aload 5
    //   484: invokestatic 119	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   487: ifne +14 -> 501
    //   490: aload 5
    //   492: ldc_w 389
    //   495: invokevirtual 148	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   498: ifeq +76 -> 574
    //   501: invokestatic 395	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   504: astore 5
    //   506: aload_0
    //   507: aload 5
    //   509: invokestatic 398	com/tencent/mm/sdk/platformtools/v:a	(Landroid/content/Context;Ljava/util/Locale;)V
    //   512: aload 5
    //   514: astore_0
    //   515: aload_0
    //   516: invokevirtual 399	java/util/Locale:toString	()Ljava/lang/String;
    //   519: astore_0
    //   520: invokestatic 354	com/tencent/mm/bs/e:bOD	()Lcom/tencent/mm/bs/e;
    //   523: pop
    //   524: getstatic 45	com/tencent/mm/bs/e:vey	Ljava/util/List;
    //   527: aload_0
    //   528: invokeinterface 402 2 0
    //   533: ifeq +50 -> 583
    //   536: iconst_0
    //   537: istore 4
    //   539: iload 4
    //   541: putstatic 51	com/tencent/mm/bs/e:veE	Z
    //   544: iload 4
    //   546: ifeq +43 -> 589
    //   549: invokestatic 354	com/tencent/mm/bs/e:bOD	()Lcom/tencent/mm/bs/e;
    //   552: pop
    //   553: aload 8
    //   555: aload_0
    //   556: invokestatic 404	com/tencent/mm/bs/e:a	(Landroid/content/res/AssetManager;Ljava/lang/String;)V
    //   559: invokestatic 354	com/tencent/mm/bs/e:bOD	()Lcom/tencent/mm/bs/e;
    //   562: astore_0
    //   563: ldc2_w 337
    //   566: sipush 2754
    //   569: invokestatic 63	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   572: aload_0
    //   573: areturn
    //   574: aload 5
    //   576: invokestatic 408	com/tencent/mm/sdk/platformtools/v:RN	(Ljava/lang/String;)Ljava/util/Locale;
    //   579: astore_0
    //   580: goto -65 -> 515
    //   583: iconst_1
    //   584: istore 4
    //   586: goto -47 -> 539
    //   589: invokestatic 156	com/tencent/mm/bs/e:clean	()V
    //   592: aload_0
    //   593: putstatic 49	com/tencent/mm/bs/e:veD	Ljava/lang/String;
    //   596: ldc2_w 337
    //   599: sipush 2754
    //   602: invokestatic 63	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   605: aconst_null
    //   606: areturn
    //   607: astore_0
    //   608: aload 7
    //   610: astore 6
    //   612: goto -213 -> 399
    //   615: astore_0
    //   616: goto -217 -> 399
    //   619: astore_0
    //   620: aload 6
    //   622: astore 7
    //   624: aload 5
    //   626: astore 6
    //   628: aload 7
    //   630: astore 5
    //   632: goto -233 -> 399
    //   635: astore 6
    //   637: aconst_null
    //   638: astore 7
    //   640: aload 5
    //   642: astore 6
    //   644: aload 7
    //   646: astore 5
    //   648: goto -336 -> 312
    //   651: astore 7
    //   653: aload 5
    //   655: astore 7
    //   657: aload 6
    //   659: astore 5
    //   661: aload 7
    //   663: astore 6
    //   665: goto -353 -> 312
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	668	0	paramContext	android.content.Context
    //   136	50	1	i	int
    //   83	137	2	l	long
    //   537	48	4	bool	boolean
    //   95	100	5	localInputStream	java.io.InputStream
    //   256	13	5	localIOException1	IOException
    //   280	13	5	localIOException2	IOException
    //   304	1	5	localIOException3	IOException
    //   310	26	5	localObject1	Object
    //   343	13	5	localIOException4	IOException
    //   393	12	5	localObject2	Object
    //   421	13	5	localIOException5	IOException
    //   445	13	5	localIOException6	IOException
    //   480	180	5	localObject3	Object
    //   106	220	6	localDataInputStream	DataInputStream
    //   367	13	6	localIOException7	IOException
    //   397	230	6	localObject4	Object
    //   635	1	6	localIOException8	IOException
    //   642	22	6	localObject5	Object
    //   85	560	7	localObject6	Object
    //   651	1	7	localIOException9	IOException
    //   655	7	7	localObject7	Object
    //   39	515	8	localAssetManager	android.content.res.AssetManager
    //   154	23	9	localInteger	Integer
    // Exception table:
    //   from	to	target	type
    //   194	199	256	java/io/IOException
    //   199	204	280	java/io/IOException
    //   87	97	304	java/io/IOException
    //   335	340	343	java/io/IOException
    //   325	330	367	java/io/IOException
    //   87	97	391	finally
    //   404	409	421	java/io/IOException
    //   414	419	445	java/io/IOException
    //   97	108	607	finally
    //   108	135	615	finally
    //   137	182	615	finally
    //   312	320	619	finally
    //   97	108	635	java/io/IOException
    //   108	135	651	java/io/IOException
    //   137	182	651	java/io/IOException
  }
  
  public static String getQuantityString(int paramInt1, int paramInt2)
  {
    GMTrace.i(370306711552L, 2759);
    if (veB == null)
    {
      GMTrace.o(370306711552L, 2759);
      return null;
    }
    String str = veB.getQuantityString(paramInt1, paramInt2, new Object[0]);
    GMTrace.o(370306711552L, 2759);
    return str;
  }
  
  public static String getQuantityString(int paramInt1, int paramInt2, Object... paramVarArgs)
  {
    GMTrace.i(370440929280L, 2760);
    if (veB == null)
    {
      GMTrace.o(370440929280L, 2760);
      return null;
    }
    paramVarArgs = veB.getQuantityString(paramInt1, paramInt2, paramVarArgs);
    GMTrace.o(370440929280L, 2760);
    return paramVarArgs;
  }
  
  public static String getString(int paramInt)
  {
    GMTrace.i(370172493824L, 2758);
    if (veA == null)
    {
      GMTrace.o(370172493824L, 2758);
      return null;
    }
    String str = veA.getString(paramInt);
    GMTrace.o(370172493824L, 2758);
    return str;
  }
  
  public static String[] getStringArray(int paramInt)
  {
    int i = 0;
    GMTrace.i(370575147008L, 2761);
    if (veC == null)
    {
      GMTrace.o(370575147008L, 2761);
      return null;
    }
    d locald = veC;
    int j = locald.vew.indexOfKey(paramInt);
    if (j < 0)
    {
      GMTrace.o(370575147008L, 2761);
      return null;
    }
    d.a locala;
    String[] arrayOfString;
    if (j < locald.vew.size() - 1)
    {
      paramInt = ((d.a)locald.vew.valueAt(j + 1)).vex[0];
      locala = (d.a)locald.vew.valueAt(j);
      j = locala.vex.length;
      if (j <= 0) {
        break label235;
      }
      arrayOfString = new String[j];
      label122:
      if (i >= j) {
        break label224;
      }
      if (i >= j - 1) {
        break label190;
      }
      arrayOfString[i] = new String(locald.jkV, locala.vex[i], locala.vex[(i + 1)] - locala.vex[i]);
    }
    for (;;)
    {
      i += 1;
      break label122;
      paramInt = locald.jkV.length;
      break;
      label190:
      arrayOfString[i] = new String(locald.jkV, locala.vex[i], paramInt - locala.vex[i]);
    }
    for (;;)
    {
      label224:
      GMTrace.o(370575147008L, 2761);
      return arrayOfString;
      label235:
      arrayOfString = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bs\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
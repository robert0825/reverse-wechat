package com.tencent.mm.plugin.emoji.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.bd;
import com.tencent.mm.sdk.b.c;

public final class b
  extends c<bd>
{
  public b()
  {
    GMTrace.i(11358175232000L, 84625);
    this.vhf = bd.class.getName().hashCode();
    GMTrace.o(11358175232000L, 84625);
  }
  
  /* Error */
  private static boolean a(bd parambd)
  {
    // Byte code:
    //   0: ldc2_w 45
    //   3: ldc 47
    //   5: invokestatic 18	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: instanceof 20
    //   12: ifeq +331 -> 343
    //   15: aload_0
    //   16: getfield 51	com/tencent/mm/g/a/bd:eCr	Lcom/tencent/mm/g/a/bd$a;
    //   19: getfield 56	com/tencent/mm/g/a/bd$a:eCs	I
    //   22: bipush 33
    //   24: if_icmpne +446 -> 470
    //   27: new 58	java/io/File
    //   30: dup
    //   31: aload_0
    //   32: getfield 51	com/tencent/mm/g/a/bd:eCr	Lcom/tencent/mm/g/a/bd$a;
    //   35: getfield 62	com/tencent/mm/g/a/bd$a:filePath	Ljava/lang/String;
    //   38: invokespecial 65	java/io/File:<init>	(Ljava/lang/String;)V
    //   41: astore 9
    //   43: aload 9
    //   45: invokevirtual 69	java/io/File:exists	()Z
    //   48: ifeq +412 -> 460
    //   51: ldc 71
    //   53: ldc 73
    //   55: iconst_1
    //   56: anewarray 75	java/lang/Object
    //   59: dup
    //   60: iconst_0
    //   61: aload 9
    //   63: invokevirtual 79	java/io/File:getAbsoluteFile	()Ljava/io/File;
    //   66: aastore
    //   67: invokestatic 84	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: new 58	java/io/File
    //   73: dup
    //   74: invokestatic 89	com/tencent/mm/aj/a:GJ	()Ljava/lang/String;
    //   77: ldc 91
    //   79: invokespecial 94	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   82: astore 10
    //   84: new 58	java/io/File
    //   87: dup
    //   88: aload 10
    //   90: ldc 96
    //   92: invokespecial 99	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   95: astore 11
    //   97: aload 10
    //   99: invokevirtual 102	java/io/File:mkdirs	()Z
    //   102: pop
    //   103: aload 9
    //   105: invokevirtual 105	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   108: aload 11
    //   110: invokevirtual 105	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   113: invokestatic 110	com/tencent/mm/a/e:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   116: pop2
    //   117: aload 11
    //   119: invokevirtual 105	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   122: aload 10
    //   124: invokevirtual 105	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   127: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:eV	(Ljava/lang/String;Ljava/lang/String;)I
    //   130: istore 4
    //   132: iconst_1
    //   133: istore_3
    //   134: iconst_1
    //   135: istore_2
    //   136: iconst_1
    //   137: istore_1
    //   138: iload 4
    //   140: iflt +149 -> 289
    //   143: aconst_null
    //   144: astore 5
    //   146: new 118	java/io/FileInputStream
    //   149: dup
    //   150: new 58	java/io/File
    //   153: dup
    //   154: aload 10
    //   156: ldc 120
    //   158: invokespecial 99	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   161: invokespecial 123	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   164: astore 6
    //   166: new 125	java/io/InputStreamReader
    //   169: dup
    //   170: aload 6
    //   172: invokespecial 128	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   175: astore 7
    //   177: new 130	java/io/BufferedReader
    //   180: dup
    //   181: aload 7
    //   183: invokespecial 133	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   186: astore_0
    //   187: ldc -121
    //   189: astore 5
    //   191: iload_2
    //   192: istore_1
    //   193: aload_0
    //   194: invokevirtual 138	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   197: astore 8
    //   199: aload 8
    //   201: ifnull +30 -> 231
    //   204: iload_2
    //   205: istore_1
    //   206: new 140	java/lang/StringBuilder
    //   209: dup
    //   210: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   213: aload 5
    //   215: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: aload 8
    //   220: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: astore 5
    //   228: goto -37 -> 191
    //   231: iload_2
    //   232: istore_1
    //   233: new 150	org/json/JSONObject
    //   236: dup
    //   237: aload 5
    //   239: invokespecial 151	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   242: ldc -103
    //   244: invokevirtual 157	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   247: istore_2
    //   248: iload_2
    //   249: istore_1
    //   250: ldc 71
    //   252: ldc -97
    //   254: iconst_2
    //   255: anewarray 75	java/lang/Object
    //   258: dup
    //   259: iconst_0
    //   260: aload 5
    //   262: aastore
    //   263: dup
    //   264: iconst_1
    //   265: iload_2
    //   266: invokestatic 165	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   269: aastore
    //   270: invokestatic 168	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   273: aload 6
    //   275: invokestatic 171	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   278: aload 7
    //   280: invokestatic 173	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   283: aload_0
    //   284: invokestatic 173	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   287: iload_2
    //   288: istore_1
    //   289: aload 10
    //   291: invokestatic 177	com/tencent/mm/a/e:f	(Ljava/io/File;)Z
    //   294: pop
    //   295: aload 11
    //   297: invokevirtual 180	java/io/File:getPath	()Ljava/lang/String;
    //   300: invokestatic 186	com/tencent/mm/loader/stub/b:deleteFile	(Ljava/lang/String;)Z
    //   303: pop
    //   304: getstatic 189	com/tencent/mm/aj/a:gBU	I
    //   307: iload_1
    //   308: if_icmpge +122 -> 430
    //   311: ldc 71
    //   313: ldc -65
    //   315: iconst_2
    //   316: anewarray 75	java/lang/Object
    //   319: dup
    //   320: iconst_0
    //   321: getstatic 189	com/tencent/mm/aj/a:gBU	I
    //   324: invokestatic 165	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   327: aastore
    //   328: dup
    //   329: iconst_1
    //   330: iload_1
    //   331: invokestatic 165	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   334: aastore
    //   335: invokestatic 84	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   338: aload 9
    //   340: invokestatic 194	com/tencent/mm/aj/a:m	(Ljava/io/File;)V
    //   343: ldc2_w 45
    //   346: ldc 47
    //   348: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   351: iconst_0
    //   352: ireturn
    //   353: astore 7
    //   355: aconst_null
    //   356: astore 8
    //   358: aconst_null
    //   359: astore_0
    //   360: aload 5
    //   362: astore 6
    //   364: aload 8
    //   366: astore 5
    //   368: iload_3
    //   369: istore_1
    //   370: ldc 71
    //   372: aload 7
    //   374: aload 7
    //   376: invokevirtual 197	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   379: iconst_0
    //   380: anewarray 75	java/lang/Object
    //   383: invokestatic 201	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   386: aload 6
    //   388: invokestatic 171	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   391: aload 5
    //   393: invokestatic 173	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   396: aload_0
    //   397: invokestatic 173	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   400: goto -111 -> 289
    //   403: astore 5
    //   405: aconst_null
    //   406: astore 6
    //   408: aconst_null
    //   409: astore 7
    //   411: aconst_null
    //   412: astore_0
    //   413: aload 6
    //   415: invokestatic 171	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   418: aload 7
    //   420: invokestatic 173	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   423: aload_0
    //   424: invokestatic 173	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   427: aload 5
    //   429: athrow
    //   430: ldc 71
    //   432: ldc -53
    //   434: iconst_2
    //   435: anewarray 75	java/lang/Object
    //   438: dup
    //   439: iconst_0
    //   440: getstatic 189	com/tencent/mm/aj/a:gBU	I
    //   443: invokestatic 165	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   446: aastore
    //   447: dup
    //   448: iconst_1
    //   449: iload_1
    //   450: invokestatic 165	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   453: aastore
    //   454: invokestatic 84	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   457: goto -114 -> 343
    //   460: ldc 71
    //   462: ldc -51
    //   464: invokestatic 208	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   467: goto -124 -> 343
    //   470: aload_0
    //   471: getfield 51	com/tencent/mm/g/a/bd:eCr	Lcom/tencent/mm/g/a/bd$a;
    //   474: getfield 56	com/tencent/mm/g/a/bd$a:eCs	I
    //   477: bipush 37
    //   479: if_icmpne -136 -> 343
    //   482: aload_0
    //   483: getfield 51	com/tencent/mm/g/a/bd:eCr	Lcom/tencent/mm/g/a/bd$a;
    //   486: getfield 211	com/tencent/mm/g/a/bd$a:eCt	I
    //   489: iconst_1
    //   490: if_icmpne +97 -> 587
    //   493: invokestatic 217	com/tencent/mm/plugin/emoji/e/i:aqL	()Lcom/tencent/mm/plugin/emoji/e/i;
    //   496: aload_0
    //   497: getstatic 223	com/tencent/mm/plugin/emoji/e/i$a:kiW	Lcom/tencent/mm/plugin/emoji/e/i$a;
    //   500: invokevirtual 226	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bd;Lcom/tencent/mm/plugin/emoji/e/i$a;)Z
    //   503: ifeq +74 -> 577
    //   506: aload_0
    //   507: getstatic 223	com/tencent/mm/plugin/emoji/e/i$a:kiW	Lcom/tencent/mm/plugin/emoji/e/i$a;
    //   510: getstatic 229	com/tencent/mm/plugin/emoji/e/i:kiA	Ljava/lang/String;
    //   513: invokestatic 232	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bd;Lcom/tencent/mm/plugin/emoji/e/i$a;Ljava/lang/String;)Z
    //   516: ifeq +51 -> 567
    //   519: new 58	java/io/File
    //   522: dup
    //   523: new 58	java/io/File
    //   526: dup
    //   527: invokestatic 235	com/tencent/mm/plugin/emoji/e/i:aqM	()Ljava/lang/String;
    //   530: getstatic 229	com/tencent/mm/plugin/emoji/e/i:kiA	Ljava/lang/String;
    //   533: invokespecial 94	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   536: getstatic 238	com/tencent/mm/plugin/emoji/e/i:kiL	Ljava/lang/String;
    //   539: invokespecial 99	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   542: astore_0
    //   543: aload_0
    //   544: invokevirtual 69	java/io/File:exists	()Z
    //   547: ifeq +10 -> 557
    //   550: aload_0
    //   551: invokestatic 241	com/tencent/mm/plugin/emoji/e/i:u	(Ljava/io/File;)V
    //   554: goto -211 -> 343
    //   557: ldc -13
    //   559: ldc -11
    //   561: invokestatic 247	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   564: goto -221 -> 343
    //   567: ldc -13
    //   569: ldc -7
    //   571: invokestatic 247	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   574: goto -231 -> 343
    //   577: ldc -13
    //   579: ldc -5
    //   581: invokestatic 247	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   584: goto -241 -> 343
    //   587: aload_0
    //   588: getfield 51	com/tencent/mm/g/a/bd:eCr	Lcom/tencent/mm/g/a/bd$a;
    //   591: getfield 211	com/tencent/mm/g/a/bd$a:eCt	I
    //   594: iconst_2
    //   595: if_icmpne +193 -> 788
    //   598: invokestatic 217	com/tencent/mm/plugin/emoji/e/i:aqL	()Lcom/tencent/mm/plugin/emoji/e/i;
    //   601: aload_0
    //   602: getstatic 254	com/tencent/mm/plugin/emoji/e/i$a:kiX	Lcom/tencent/mm/plugin/emoji/e/i$a;
    //   605: invokevirtual 226	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bd;Lcom/tencent/mm/plugin/emoji/e/i$a;)Z
    //   608: ifne +9 -> 617
    //   611: invokestatic 257	com/tencent/mm/plugin/emoji/e/i:aqN	()Z
    //   614: ifeq +163 -> 777
    //   617: aload_0
    //   618: getstatic 254	com/tencent/mm/plugin/emoji/e/i$a:kiX	Lcom/tencent/mm/plugin/emoji/e/i$a;
    //   621: getstatic 260	com/tencent/mm/plugin/emoji/e/i:kiB	Ljava/lang/String;
    //   624: invokestatic 232	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bd;Lcom/tencent/mm/plugin/emoji/e/i$a;Ljava/lang/String;)Z
    //   627: ifeq +139 -> 766
    //   630: new 58	java/io/File
    //   633: dup
    //   634: invokestatic 235	com/tencent/mm/plugin/emoji/e/i:aqM	()Ljava/lang/String;
    //   637: getstatic 260	com/tencent/mm/plugin/emoji/e/i:kiB	Ljava/lang/String;
    //   640: invokespecial 94	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   643: astore 6
    //   645: invokestatic 265	com/tencent/mm/plugin/emoji/e/n:aqV	()Ljava/lang/String;
    //   648: astore 5
    //   650: aload 5
    //   652: invokestatic 268	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   655: ifeq +57 -> 712
    //   658: getstatic 271	com/tencent/mm/plugin/emoji/e/i:kiM	Ljava/lang/String;
    //   661: astore_0
    //   662: ldc -13
    //   664: ldc_w 273
    //   667: invokestatic 247	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   670: new 58	java/io/File
    //   673: dup
    //   674: aload 6
    //   676: aload_0
    //   677: invokespecial 99	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   680: astore 5
    //   682: aload 5
    //   684: invokevirtual 69	java/io/File:exists	()Z
    //   687: ifeq +68 -> 755
    //   690: aload 5
    //   692: invokestatic 276	com/tencent/mm/plugin/emoji/e/i:v	(Ljava/io/File;)V
    //   695: invokestatic 282	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   698: pop
    //   699: invokestatic 288	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   702: getstatic 294	com/tencent/mm/storage/w$a:vqu	Lcom/tencent/mm/storage/w$a;
    //   705: aload_0
    //   706: invokevirtual 299	com/tencent/mm/storage/t:a	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)V
    //   709: goto -366 -> 343
    //   712: aload 5
    //   714: astore_0
    //   715: new 58	java/io/File
    //   718: dup
    //   719: aload 6
    //   721: aload 5
    //   723: invokespecial 99	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   726: invokevirtual 69	java/io/File:exists	()Z
    //   729: ifne +7 -> 736
    //   732: getstatic 271	com/tencent/mm/plugin/emoji/e/i:kiM	Ljava/lang/String;
    //   735: astore_0
    //   736: ldc -13
    //   738: ldc_w 301
    //   741: iconst_1
    //   742: anewarray 75	java/lang/Object
    //   745: dup
    //   746: iconst_0
    //   747: aload_0
    //   748: aastore
    //   749: invokestatic 84	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   752: goto -82 -> 670
    //   755: ldc -13
    //   757: ldc_w 303
    //   760: invokestatic 247	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   763: goto -420 -> 343
    //   766: ldc -13
    //   768: ldc_w 305
    //   771: invokestatic 247	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   774: goto -431 -> 343
    //   777: ldc -13
    //   779: ldc_w 307
    //   782: invokestatic 247	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   785: goto -442 -> 343
    //   788: aload_0
    //   789: getfield 51	com/tencent/mm/g/a/bd:eCr	Lcom/tencent/mm/g/a/bd$a;
    //   792: getfield 211	com/tencent/mm/g/a/bd$a:eCt	I
    //   795: iconst_3
    //   796: if_icmpne +100 -> 896
    //   799: invokestatic 217	com/tencent/mm/plugin/emoji/e/i:aqL	()Lcom/tencent/mm/plugin/emoji/e/i;
    //   802: aload_0
    //   803: getstatic 310	com/tencent/mm/plugin/emoji/e/i$a:kiY	Lcom/tencent/mm/plugin/emoji/e/i$a;
    //   806: invokevirtual 226	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bd;Lcom/tencent/mm/plugin/emoji/e/i$a;)Z
    //   809: ifeq +76 -> 885
    //   812: aload_0
    //   813: getstatic 310	com/tencent/mm/plugin/emoji/e/i$a:kiY	Lcom/tencent/mm/plugin/emoji/e/i$a;
    //   816: getstatic 313	com/tencent/mm/plugin/emoji/e/i:kiC	Ljava/lang/String;
    //   819: invokestatic 232	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bd;Lcom/tencent/mm/plugin/emoji/e/i$a;Ljava/lang/String;)Z
    //   822: ifeq +52 -> 874
    //   825: new 58	java/io/File
    //   828: dup
    //   829: new 58	java/io/File
    //   832: dup
    //   833: invokestatic 235	com/tencent/mm/plugin/emoji/e/i:aqM	()Ljava/lang/String;
    //   836: getstatic 313	com/tencent/mm/plugin/emoji/e/i:kiC	Ljava/lang/String;
    //   839: invokespecial 94	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   842: getstatic 316	com/tencent/mm/plugin/emoji/e/i:kiN	Ljava/lang/String;
    //   845: invokespecial 99	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   848: astore_0
    //   849: aload_0
    //   850: invokevirtual 69	java/io/File:exists	()Z
    //   853: ifeq +10 -> 863
    //   856: aload_0
    //   857: invokestatic 319	com/tencent/mm/plugin/emoji/e/i:w	(Ljava/io/File;)V
    //   860: goto -517 -> 343
    //   863: ldc -13
    //   865: ldc_w 321
    //   868: invokestatic 247	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   871: goto -528 -> 343
    //   874: ldc -13
    //   876: ldc_w 323
    //   879: invokestatic 247	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   882: goto -539 -> 343
    //   885: ldc -13
    //   887: ldc_w 325
    //   890: invokestatic 247	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   893: goto -550 -> 343
    //   896: aload_0
    //   897: getfield 51	com/tencent/mm/g/a/bd:eCr	Lcom/tencent/mm/g/a/bd$a;
    //   900: getfield 211	com/tencent/mm/g/a/bd$a:eCt	I
    //   903: iconst_5
    //   904: if_icmpne +89 -> 993
    //   907: invokestatic 217	com/tencent/mm/plugin/emoji/e/i:aqL	()Lcom/tencent/mm/plugin/emoji/e/i;
    //   910: aload_0
    //   911: getstatic 328	com/tencent/mm/plugin/emoji/e/i$a:kja	Lcom/tencent/mm/plugin/emoji/e/i$a;
    //   914: invokevirtual 226	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bd;Lcom/tencent/mm/plugin/emoji/e/i$a;)Z
    //   917: ifeq -574 -> 343
    //   920: aload_0
    //   921: getstatic 328	com/tencent/mm/plugin/emoji/e/i$a:kja	Lcom/tencent/mm/plugin/emoji/e/i$a;
    //   924: getstatic 331	com/tencent/mm/plugin/emoji/e/i:kiD	Ljava/lang/String;
    //   927: invokestatic 232	com/tencent/mm/plugin/emoji/e/i:a	(Lcom/tencent/mm/g/a/bd;Lcom/tencent/mm/plugin/emoji/e/i$a;Ljava/lang/String;)Z
    //   930: ifeq +52 -> 982
    //   933: new 58	java/io/File
    //   936: dup
    //   937: new 58	java/io/File
    //   940: dup
    //   941: invokestatic 235	com/tencent/mm/plugin/emoji/e/i:aqM	()Ljava/lang/String;
    //   944: getstatic 331	com/tencent/mm/plugin/emoji/e/i:kiD	Ljava/lang/String;
    //   947: invokespecial 94	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   950: getstatic 334	com/tencent/mm/plugin/emoji/e/i:kiO	Ljava/lang/String;
    //   953: invokespecial 99	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   956: astore_0
    //   957: aload_0
    //   958: invokevirtual 69	java/io/File:exists	()Z
    //   961: ifeq +10 -> 971
    //   964: aload_0
    //   965: invokestatic 337	com/tencent/mm/plugin/emoji/e/i:x	(Ljava/io/File;)V
    //   968: goto -625 -> 343
    //   971: ldc -13
    //   973: ldc_w 339
    //   976: invokestatic 247	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   979: goto -636 -> 343
    //   982: ldc -13
    //   984: ldc_w 339
    //   987: invokestatic 247	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   990: goto -647 -> 343
    //   993: aload_0
    //   994: getfield 51	com/tencent/mm/g/a/bd:eCr	Lcom/tencent/mm/g/a/bd$a;
    //   997: getfield 211	com/tencent/mm/g/a/bd$a:eCt	I
    //   1000: iconst_4
    //   1001: if_icmpne -658 -> 343
    //   1004: invokestatic 217	com/tencent/mm/plugin/emoji/e/i:aqL	()Lcom/tencent/mm/plugin/emoji/e/i;
    //   1007: pop
    //   1008: ldc -13
    //   1010: ldc_w 341
    //   1013: invokestatic 343	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1016: aload_0
    //   1017: invokestatic 345	com/tencent/mm/plugin/emoji/e/i:b	(Lcom/tencent/mm/g/a/bd;)Z
    //   1020: ifeq -677 -> 343
    //   1023: invokestatic 351	com/tencent/mm/bt/b:bRv	()Lcom/tencent/mm/bt/b;
    //   1026: pop
    //   1027: aload_0
    //   1028: getfield 51	com/tencent/mm/g/a/bd:eCr	Lcom/tencent/mm/g/a/bd$a;
    //   1031: getfield 62	com/tencent/mm/g/a/bd$a:filePath	Ljava/lang/String;
    //   1034: astore_0
    //   1035: invokestatic 354	com/tencent/mm/bt/b:bRw	()V
    //   1038: aload_0
    //   1039: getstatic 357	com/tencent/mm/bt/b:vnk	Ljava/lang/String;
    //   1042: invokestatic 363	com/tencent/mm/sdk/platformtools/j:eR	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1045: pop
    //   1046: invokestatic 351	com/tencent/mm/bt/b:bRv	()Lcom/tencent/mm/bt/b;
    //   1049: invokevirtual 366	com/tencent/mm/bt/b:init	()V
    //   1052: goto -709 -> 343
    //   1055: astore 5
    //   1057: aconst_null
    //   1058: astore 7
    //   1060: aconst_null
    //   1061: astore_0
    //   1062: goto -649 -> 413
    //   1065: astore 5
    //   1067: aconst_null
    //   1068: astore_0
    //   1069: goto -656 -> 413
    //   1072: astore 5
    //   1074: goto -661 -> 413
    //   1077: astore 8
    //   1079: aload 5
    //   1081: astore 7
    //   1083: aload 8
    //   1085: astore 5
    //   1087: goto -674 -> 413
    //   1090: astore 7
    //   1092: aconst_null
    //   1093: astore_0
    //   1094: aconst_null
    //   1095: astore 5
    //   1097: iload_3
    //   1098: istore_1
    //   1099: goto -729 -> 370
    //   1102: astore 8
    //   1104: aconst_null
    //   1105: astore_0
    //   1106: aload 7
    //   1108: astore 5
    //   1110: iload_3
    //   1111: istore_1
    //   1112: aload 8
    //   1114: astore 7
    //   1116: goto -746 -> 370
    //   1119: astore 8
    //   1121: aload 7
    //   1123: astore 5
    //   1125: aload 8
    //   1127: astore 7
    //   1129: goto -759 -> 370
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1132	0	parambd	bd
    //   137	975	1	i	int
    //   135	153	2	j	int
    //   133	978	3	k	int
    //   130	9	4	m	int
    //   144	248	5	localObject1	Object
    //   403	25	5	localObject2	Object
    //   648	74	5	localObject3	Object
    //   1055	1	5	localObject4	Object
    //   1065	1	5	localObject5	Object
    //   1072	8	5	localObject6	Object
    //   1085	39	5	localObject7	Object
    //   164	556	6	localObject8	Object
    //   175	104	7	localInputStreamReader	java.io.InputStreamReader
    //   353	22	7	localException1	Exception
    //   409	673	7	localObject9	Object
    //   1090	17	7	localException2	Exception
    //   1114	14	7	localObject10	Object
    //   197	168	8	str	String
    //   1077	7	8	localObject11	Object
    //   1102	11	8	localException3	Exception
    //   1119	7	8	localException4	Exception
    //   41	298	9	localFile1	java.io.File
    //   82	208	10	localFile2	java.io.File
    //   95	201	11	localFile3	java.io.File
    // Exception table:
    //   from	to	target	type
    //   146	166	353	java/lang/Exception
    //   146	166	403	finally
    //   166	177	1055	finally
    //   177	187	1065	finally
    //   193	199	1072	finally
    //   206	228	1072	finally
    //   233	248	1072	finally
    //   250	273	1072	finally
    //   370	386	1077	finally
    //   166	177	1090	java/lang/Exception
    //   177	187	1102	java/lang/Exception
    //   193	199	1119	java/lang/Exception
    //   206	228	1119	java/lang/Exception
    //   233	248	1119	java/lang/Exception
    //   250	273	1119	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
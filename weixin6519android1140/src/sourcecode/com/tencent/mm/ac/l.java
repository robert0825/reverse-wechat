package com.tencent.mm.ac;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.blq;
import com.tencent.mm.protocal.c.blr;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eMk;
  private com.tencent.mm.ad.e fUd;
  private int gsL;
  private int gsM;
  private int gsN;
  private String gtd;
  private String gte;
  private String gtf;
  
  public l(int paramInt, String paramString)
  {
    GMTrace.i(375138549760L, 2795);
    this.gtf = com.tencent.mm.y.q.zE();
    if (paramInt == 2) {
      this.gtf = x.Tt(this.gtf);
    }
    n.Dh();
    this.gtd = d.t(this.gtf, true);
    String str = this.gtd + ".tmp";
    if (V(paramString, str) == 0)
    {
      this.eMk = str;
      this.gsN = paramInt;
      n.Dh();
      this.gte = g.n(FileOp.c(d.t(this.gtf, true), 0, -1));
      this.gsL = 0;
      this.gsM = 0;
    }
    GMTrace.o(375138549760L, 2795);
  }
  
  /* Error */
  private static int V(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 105
    //   3: ldc 107
    //   5: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 113	com/tencent/mm/sdk/platformtools/d:RB	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   12: astore 11
    //   14: aload 11
    //   16: getfield 118	android/graphics/BitmapFactory$Options:outHeight	I
    //   19: sipush 640
    //   22: if_icmpge +63 -> 85
    //   25: aload 11
    //   27: getfield 121	android/graphics/BitmapFactory$Options:outWidth	I
    //   30: sipush 640
    //   33: if_icmpge +52 -> 85
    //   36: aload_0
    //   37: aload_1
    //   38: invokestatic 124	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   41: pop2
    //   42: ldc 126
    //   44: ldc -128
    //   46: iconst_2
    //   47: anewarray 130	java/lang/Object
    //   50: dup
    //   51: iconst_0
    //   52: aload 11
    //   54: getfield 118	android/graphics/BitmapFactory$Options:outHeight	I
    //   57: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   60: aastore
    //   61: dup
    //   62: iconst_1
    //   63: aload 11
    //   65: getfield 121	android/graphics/BitmapFactory$Options:outWidth	I
    //   68: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   71: aastore
    //   72: invokestatic 141	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: ldc2_w 105
    //   78: ldc 107
    //   80: invokestatic 99	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   83: iconst_0
    //   84: ireturn
    //   85: bipush 50
    //   87: istore 4
    //   89: invokestatic 147	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   92: invokestatic 153	com/tencent/mm/sdk/platformtools/am:isWifi	(Landroid/content/Context;)Z
    //   95: ifeq +427 -> 522
    //   98: ldc -101
    //   100: invokestatic 161	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   103: checkcast 155	com/tencent/mm/plugin/zero/b/a
    //   106: invokeinterface 165 1 0
    //   111: ldc -89
    //   113: invokevirtual 172	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   116: bipush 50
    //   118: invokestatic 178	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   121: istore 5
    //   123: iload 5
    //   125: istore 4
    //   127: iconst_0
    //   128: istore 7
    //   130: iconst_0
    //   131: istore 6
    //   133: iload 6
    //   135: istore 5
    //   137: invokestatic 147	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   140: invokestatic 153	com/tencent/mm/sdk/platformtools/am:isWifi	(Landroid/content/Context;)Z
    //   143: ifeq +493 -> 636
    //   146: iload 6
    //   148: istore 5
    //   150: ldc -101
    //   152: invokestatic 161	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   155: checkcast 155	com/tencent/mm/plugin/zero/b/a
    //   158: invokeinterface 165 1 0
    //   163: ldc -76
    //   165: invokevirtual 172	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   168: astore 10
    //   170: iload 6
    //   172: istore 5
    //   174: aload 10
    //   176: ldc -74
    //   178: invokevirtual 188	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   181: istore 8
    //   183: iload 7
    //   185: istore 5
    //   187: iconst_m1
    //   188: iload 8
    //   190: if_icmpeq +557 -> 747
    //   193: iload 6
    //   195: istore 5
    //   197: aload 10
    //   199: iconst_0
    //   200: iload 8
    //   202: invokevirtual 192	java/lang/String:substring	(II)Ljava/lang/String;
    //   205: invokestatic 195	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   208: invokevirtual 199	java/lang/Integer:intValue	()I
    //   211: istore 6
    //   213: iload 6
    //   215: istore 5
    //   217: aload 10
    //   219: iload 8
    //   221: iconst_1
    //   222: iadd
    //   223: invokevirtual 202	java/lang/String:substring	(I)Ljava/lang/String;
    //   226: invokestatic 195	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   229: invokevirtual 199	java/lang/Integer:intValue	()I
    //   232: istore 7
    //   234: iload 6
    //   236: istore 8
    //   238: iload 8
    //   240: ifgt +519 -> 759
    //   243: iload 7
    //   245: ifgt +514 -> 759
    //   248: iconst_0
    //   249: istore 6
    //   251: sipush 1080
    //   254: istore 5
    //   256: aload 11
    //   258: getfield 121	android/graphics/BitmapFactory$Options:outWidth	I
    //   261: aload 11
    //   263: getfield 118	android/graphics/BitmapFactory$Options:outHeight	I
    //   266: if_icmple +552 -> 818
    //   269: aload 11
    //   271: getfield 121	android/graphics/BitmapFactory$Options:outWidth	I
    //   274: istore 7
    //   276: aload 11
    //   278: getfield 121	android/graphics/BitmapFactory$Options:outWidth	I
    //   281: aload 11
    //   283: getfield 118	android/graphics/BitmapFactory$Options:outHeight	I
    //   286: if_icmpge +542 -> 828
    //   289: aload 11
    //   291: getfield 121	android/graphics/BitmapFactory$Options:outWidth	I
    //   294: istore 8
    //   296: ldc 126
    //   298: ldc -52
    //   300: iconst_5
    //   301: anewarray 130	java/lang/Object
    //   304: dup
    //   305: iconst_0
    //   306: iload 6
    //   308: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   311: aastore
    //   312: dup
    //   313: iconst_1
    //   314: iload 5
    //   316: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   319: aastore
    //   320: dup
    //   321: iconst_2
    //   322: iload 4
    //   324: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   327: aastore
    //   328: dup
    //   329: iconst_3
    //   330: aload 11
    //   332: getfield 121	android/graphics/BitmapFactory$Options:outWidth	I
    //   335: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   338: aastore
    //   339: dup
    //   340: iconst_4
    //   341: aload 11
    //   343: getfield 118	android/graphics/BitmapFactory$Options:outHeight	I
    //   346: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   349: aastore
    //   350: invokestatic 141	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   353: iload 5
    //   355: ifle +483 -> 838
    //   358: iload 8
    //   360: iload 5
    //   362: idiv
    //   363: istore 7
    //   365: aload 11
    //   367: getfield 118	android/graphics/BitmapFactory$Options:outHeight	I
    //   370: iload 5
    //   372: imul
    //   373: iload 8
    //   375: idiv
    //   376: istore 6
    //   378: iload 5
    //   380: aload 11
    //   382: getfield 121	android/graphics/BitmapFactory$Options:outWidth	I
    //   385: imul
    //   386: iload 8
    //   388: idiv
    //   389: istore 5
    //   391: iload 6
    //   393: istore 9
    //   395: iload 5
    //   397: istore 8
    //   399: iload 6
    //   401: iload 5
    //   403: imul
    //   404: ldc -51
    //   406: if_icmple +33 -> 439
    //   409: ldc2_w 206
    //   412: iload 6
    //   414: iload 5
    //   416: imul
    //   417: i2d
    //   418: ddiv
    //   419: invokestatic 213	java/lang/Math:sqrt	(D)D
    //   422: dstore_2
    //   423: iload 6
    //   425: i2d
    //   426: dload_2
    //   427: ddiv
    //   428: d2i
    //   429: istore 9
    //   431: iload 5
    //   433: i2d
    //   434: dload_2
    //   435: ddiv
    //   436: d2i
    //   437: istore 8
    //   439: new 115	android/graphics/BitmapFactory$Options
    //   442: dup
    //   443: invokespecial 214	android/graphics/BitmapFactory$Options:<init>	()V
    //   446: astore 10
    //   448: aload 10
    //   450: getstatic 220	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   453: putfield 223	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   456: iload 7
    //   458: iconst_2
    //   459: if_icmplt +10 -> 469
    //   462: aload 10
    //   464: iload 7
    //   466: putfield 226	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   469: aload_0
    //   470: aload 10
    //   472: invokestatic 230	com/tencent/mm/sdk/platformtools/d:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   475: astore 12
    //   477: aload 12
    //   479: ifnonnull +407 -> 886
    //   482: ldc 126
    //   484: ldc -24
    //   486: iconst_1
    //   487: anewarray 130	java/lang/Object
    //   490: dup
    //   491: iconst_0
    //   492: aload 10
    //   494: getfield 226	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   497: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   500: aastore
    //   501: invokestatic 235	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   504: invokestatic 240	com/tencent/mm/compatible/util/g:tA	()I
    //   507: istore 4
    //   509: ldc2_w 105
    //   512: ldc 107
    //   514: invokestatic 99	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   517: iconst_0
    //   518: iload 4
    //   520: isub
    //   521: ireturn
    //   522: invokestatic 147	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   525: invokestatic 243	com/tencent/mm/sdk/platformtools/am:is2G	(Landroid/content/Context;)Z
    //   528: ifeq +35 -> 563
    //   531: ldc -101
    //   533: invokestatic 161	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   536: checkcast 155	com/tencent/mm/plugin/zero/b/a
    //   539: invokeinterface 165 1 0
    //   544: ldc -11
    //   546: invokevirtual 172	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   549: bipush 50
    //   551: invokestatic 178	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   554: istore 5
    //   556: iload 5
    //   558: istore 4
    //   560: goto -433 -> 127
    //   563: invokestatic 147	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   566: invokestatic 248	com/tencent/mm/sdk/platformtools/am:is3G	(Landroid/content/Context;)Z
    //   569: ifeq +35 -> 604
    //   572: ldc -101
    //   574: invokestatic 161	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   577: checkcast 155	com/tencent/mm/plugin/zero/b/a
    //   580: invokeinterface 165 1 0
    //   585: ldc -6
    //   587: invokevirtual 172	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   590: bipush 50
    //   592: invokestatic 178	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   595: istore 5
    //   597: iload 5
    //   599: istore 4
    //   601: goto -474 -> 127
    //   604: ldc -101
    //   606: invokestatic 161	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   609: checkcast 155	com/tencent/mm/plugin/zero/b/a
    //   612: invokeinterface 165 1 0
    //   617: ldc -4
    //   619: invokevirtual 172	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   622: bipush 50
    //   624: invokestatic 178	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   627: istore 5
    //   629: iload 5
    //   631: istore 4
    //   633: goto -506 -> 127
    //   636: iload 6
    //   638: istore 5
    //   640: invokestatic 147	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   643: invokestatic 243	com/tencent/mm/sdk/platformtools/am:is2G	(Landroid/content/Context;)Z
    //   646: ifeq +30 -> 676
    //   649: iload 6
    //   651: istore 5
    //   653: ldc -101
    //   655: invokestatic 161	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   658: checkcast 155	com/tencent/mm/plugin/zero/b/a
    //   661: invokeinterface 165 1 0
    //   666: ldc -2
    //   668: invokevirtual 172	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   671: astore 10
    //   673: goto -503 -> 170
    //   676: iload 6
    //   678: istore 5
    //   680: invokestatic 147	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   683: invokestatic 248	com/tencent/mm/sdk/platformtools/am:is3G	(Landroid/content/Context;)Z
    //   686: ifeq +31 -> 717
    //   689: iload 6
    //   691: istore 5
    //   693: ldc -101
    //   695: invokestatic 161	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   698: checkcast 155	com/tencent/mm/plugin/zero/b/a
    //   701: invokeinterface 165 1 0
    //   706: ldc_w 256
    //   709: invokevirtual 172	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   712: astore 10
    //   714: goto -544 -> 170
    //   717: iload 6
    //   719: istore 5
    //   721: ldc -101
    //   723: invokestatic 161	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   726: checkcast 155	com/tencent/mm/plugin/zero/b/a
    //   729: invokeinterface 165 1 0
    //   734: ldc_w 258
    //   737: invokevirtual 172	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   740: astore 10
    //   742: goto -572 -> 170
    //   745: astore 10
    //   747: sipush 1080
    //   750: istore 7
    //   752: iload 5
    //   754: istore 8
    //   756: goto -518 -> 238
    //   759: iload 7
    //   761: sipush 2160
    //   764: if_icmplt +14 -> 778
    //   767: iconst_0
    //   768: istore 6
    //   770: sipush 1080
    //   773: istore 5
    //   775: goto -519 -> 256
    //   778: iload 7
    //   780: istore 5
    //   782: iload 8
    //   784: istore 6
    //   786: iload 7
    //   788: ifgt -532 -> 256
    //   791: iload 7
    //   793: istore 5
    //   795: iload 8
    //   797: istore 6
    //   799: iload 8
    //   801: sipush 3240
    //   804: if_icmple -548 -> 256
    //   807: sipush 1620
    //   810: istore 6
    //   812: iconst_0
    //   813: istore 5
    //   815: goto -559 -> 256
    //   818: aload 11
    //   820: getfield 118	android/graphics/BitmapFactory$Options:outHeight	I
    //   823: istore 7
    //   825: goto -549 -> 276
    //   828: aload 11
    //   830: getfield 118	android/graphics/BitmapFactory$Options:outHeight	I
    //   833: istore 8
    //   835: goto -539 -> 296
    //   838: iload 7
    //   840: iload 6
    //   842: idiv
    //   843: istore 8
    //   845: aload 11
    //   847: getfield 118	android/graphics/BitmapFactory$Options:outHeight	I
    //   850: iload 6
    //   852: imul
    //   853: iload 7
    //   855: idiv
    //   856: istore 5
    //   858: iload 6
    //   860: aload 11
    //   862: getfield 121	android/graphics/BitmapFactory$Options:outWidth	I
    //   865: imul
    //   866: iload 7
    //   868: idiv
    //   869: istore 7
    //   871: iload 5
    //   873: istore 6
    //   875: iload 7
    //   877: istore 5
    //   879: iload 8
    //   881: istore 7
    //   883: goto -492 -> 391
    //   886: ldc 126
    //   888: ldc_w 260
    //   891: iconst_2
    //   892: anewarray 130	java/lang/Object
    //   895: dup
    //   896: iconst_0
    //   897: aload 12
    //   899: invokevirtual 265	android/graphics/Bitmap:getWidth	()I
    //   902: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   905: aastore
    //   906: dup
    //   907: iconst_1
    //   908: aload 12
    //   910: invokevirtual 268	android/graphics/Bitmap:getHeight	()I
    //   913: invokestatic 136	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   916: aastore
    //   917: invokestatic 271	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   920: iload 7
    //   922: iconst_1
    //   923: if_icmple +82 -> 1005
    //   926: aload 12
    //   928: iload 8
    //   930: iload 9
    //   932: iconst_1
    //   933: invokestatic 275	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   936: astore 10
    //   938: aload 12
    //   940: aload 10
    //   942: if_acmpeq +28 -> 970
    //   945: ldc 126
    //   947: ldc_w 277
    //   950: iconst_1
    //   951: anewarray 130	java/lang/Object
    //   954: dup
    //   955: iconst_0
    //   956: aload 12
    //   958: invokevirtual 278	java/lang/Object:toString	()Ljava/lang/String;
    //   961: aastore
    //   962: invokestatic 141	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   965: aload 12
    //   967: invokevirtual 281	android/graphics/Bitmap:recycle	()V
    //   970: aload 10
    //   972: astore 12
    //   974: aload 10
    //   976: ifnonnull +29 -> 1005
    //   979: ldc 126
    //   981: ldc_w 283
    //   984: invokestatic 286	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   987: invokestatic 240	com/tencent/mm/compatible/util/g:tA	()I
    //   990: istore 4
    //   992: ldc2_w 105
    //   995: ldc 107
    //   997: invokestatic 99	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1000: iconst_0
    //   1001: iload 4
    //   1003: isub
    //   1004: ireturn
    //   1005: aconst_null
    //   1006: astore 11
    //   1008: aconst_null
    //   1009: astore 10
    //   1011: aload_1
    //   1012: invokestatic 290	com/tencent/mm/modelsfs/FileOp:hA	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   1015: astore 13
    //   1017: aload 13
    //   1019: astore 10
    //   1021: aload 13
    //   1023: astore 11
    //   1025: aload 12
    //   1027: getstatic 296	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1030: iload 4
    //   1032: aload 13
    //   1034: invokevirtual 300	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   1037: pop
    //   1038: aload 13
    //   1040: ifnull +8 -> 1048
    //   1043: aload 13
    //   1045: invokevirtual 305	java/io/OutputStream:close	()V
    //   1048: ldc 126
    //   1050: ldc_w 307
    //   1053: iconst_3
    //   1054: anewarray 130	java/lang/Object
    //   1057: dup
    //   1058: iconst_0
    //   1059: aload 12
    //   1061: invokevirtual 278	java/lang/Object:toString	()Ljava/lang/String;
    //   1064: aastore
    //   1065: dup
    //   1066: iconst_1
    //   1067: aload_0
    //   1068: invokestatic 311	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   1071: invokestatic 316	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1074: aastore
    //   1075: dup
    //   1076: iconst_2
    //   1077: aload_1
    //   1078: invokestatic 311	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   1081: invokestatic 316	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1084: aastore
    //   1085: invokestatic 141	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1088: aload 12
    //   1090: invokevirtual 281	android/graphics/Bitmap:recycle	()V
    //   1093: ldc2_w 105
    //   1096: ldc 107
    //   1098: invokestatic 99	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1101: iconst_0
    //   1102: ireturn
    //   1103: astore_0
    //   1104: aload 10
    //   1106: astore 11
    //   1108: ldc 126
    //   1110: ldc_w 318
    //   1113: invokestatic 286	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1116: aload 10
    //   1118: astore 11
    //   1120: ldc 126
    //   1122: ldc_w 320
    //   1125: iconst_1
    //   1126: anewarray 130	java/lang/Object
    //   1129: dup
    //   1130: iconst_0
    //   1131: aload_0
    //   1132: invokestatic 324	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1135: aastore
    //   1136: invokestatic 235	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1139: aload 10
    //   1141: astore 11
    //   1143: ldc 126
    //   1145: ldc_w 277
    //   1148: iconst_1
    //   1149: anewarray 130	java/lang/Object
    //   1152: dup
    //   1153: iconst_0
    //   1154: aload 12
    //   1156: invokevirtual 278	java/lang/Object:toString	()Ljava/lang/String;
    //   1159: aastore
    //   1160: invokestatic 141	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1163: aload 10
    //   1165: astore 11
    //   1167: aload 12
    //   1169: invokevirtual 281	android/graphics/Bitmap:recycle	()V
    //   1172: aload 10
    //   1174: astore 11
    //   1176: invokestatic 240	com/tencent/mm/compatible/util/g:tA	()I
    //   1179: istore 4
    //   1181: aload 10
    //   1183: ifnull +8 -> 1191
    //   1186: aload 10
    //   1188: invokevirtual 305	java/io/OutputStream:close	()V
    //   1191: ldc2_w 105
    //   1194: ldc 107
    //   1196: invokestatic 99	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1199: iconst_0
    //   1200: iload 4
    //   1202: isub
    //   1203: ireturn
    //   1204: astore_0
    //   1205: aload 11
    //   1207: ifnull +8 -> 1215
    //   1210: aload 11
    //   1212: invokevirtual 305	java/io/OutputStream:close	()V
    //   1215: aload_0
    //   1216: athrow
    //   1217: astore 10
    //   1219: goto -171 -> 1048
    //   1222: astore_0
    //   1223: goto -32 -> 1191
    //   1226: astore_1
    //   1227: goto -12 -> 1215
    //   1230: astore 10
    //   1232: goto -1105 -> 127
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1235	0	paramString1	String
    //   0	1235	1	paramString2	String
    //   422	13	2	d	double
    //   87	1116	4	i	int
    //   121	757	5	j	int
    //   131	743	6	k	int
    //   128	796	7	m	int
    //   181	748	8	n	int
    //   393	538	9	i1	int
    //   168	573	10	localObject1	Object
    //   745	1	10	localException1	Exception
    //   936	251	10	localObject2	Object
    //   1217	1	10	localIOException	java.io.IOException
    //   1230	1	10	localException2	Exception
    //   12	1199	11	localObject3	Object
    //   475	693	12	localObject4	Object
    //   1015	29	13	localOutputStream	java.io.OutputStream
    // Exception table:
    //   from	to	target	type
    //   137	146	745	java/lang/Exception
    //   150	170	745	java/lang/Exception
    //   174	183	745	java/lang/Exception
    //   197	213	745	java/lang/Exception
    //   217	234	745	java/lang/Exception
    //   640	649	745	java/lang/Exception
    //   653	673	745	java/lang/Exception
    //   680	689	745	java/lang/Exception
    //   693	714	745	java/lang/Exception
    //   721	742	745	java/lang/Exception
    //   1011	1017	1103	java/lang/Exception
    //   1025	1038	1103	java/lang/Exception
    //   1011	1017	1204	finally
    //   1025	1038	1204	finally
    //   1108	1116	1204	finally
    //   1120	1139	1204	finally
    //   1143	1163	1204	finally
    //   1167	1172	1204	finally
    //   1176	1181	1204	finally
    //   1043	1048	1217	java/io/IOException
    //   1186	1191	1222	java/io/IOException
    //   1210	1215	1226	java/io/IOException
    //   89	123	1230	java/lang/Exception
    //   522	556	1230	java/lang/Exception
    //   563	597	1230	java/lang/Exception
    //   604	629	1230	java/lang/Exception
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(375272767488L, 2796);
    this.fUd = parame1;
    if ((this.eMk == null) || (this.eMk.length() == 0))
    {
      w.e("MicroMsg.NetSceneUploadHDHeadImg", "imgPath is null or length = 0");
      GMTrace.o(375272767488L, 2796);
      return -1;
    }
    if (!FileOp.aZ(this.eMk))
    {
      w.e("MicroMsg.NetSceneUploadHDHeadImg", "The img does not exist, imgPath = " + this.eMk);
      GMTrace.o(375272767488L, 2796);
      return -1;
    }
    if (this.gsL == 0) {
      this.gsL = ((int)FileOp.kX(this.eMk));
    }
    int i = Math.min(this.gsL - this.gsM, 8192);
    parame1 = FileOp.c(this.eMk, this.gsM, i);
    if (parame1 == null)
    {
      w.e("MicroMsg.NetSceneUploadHDHeadImg", "readFromFile error");
      GMTrace.o(375272767488L, 2796);
      return -1;
    }
    w.i("MicroMsg.NetSceneUploadHDHeadImg", "doScene uploadLen:%d, total: %d", new Object[] { Integer.valueOf(parame1.length), Integer.valueOf(this.gsL) });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new blq();
    ((b.a)localObject).gtG = new blr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadhdheadimg";
    ((b.a)localObject).gtE = 157;
    ((b.a)localObject).gtH = 46;
    ((b.a)localObject).gtI = 1000000046;
    localObject = ((b.a)localObject).DA();
    blq localblq = (blq)((b)localObject).gtC.gtK;
    localblq.tRC = this.gsL;
    localblq.tRD = this.gsM;
    localblq.uro = this.gsN;
    localblq.ues = new azp().be(parame1);
    localblq.uVB = this.gte;
    i = a(parame, (com.tencent.mm.network.q)localObject, this);
    GMTrace.o(375272767488L, 2796);
    return i;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(375406985216L, 2797);
    if ((this.eMk == null) || (this.eMk.length() == 0))
    {
      i = k.b.gun;
      GMTrace.o(375406985216L, 2797);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(375406985216L, 2797);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(375675420672L, 2799);
    paramArrayOfByte = (blr)((b)paramq).gtD.gtK;
    w.d("MicroMsg.NetSceneUploadHDHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 4) && (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneUploadHDHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(375675420672L, 2799);
      return;
    }
    if ((paramInt2 == 4) || (paramInt2 == 5))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      w.e("MicroMsg.NetSceneUploadHDHeadImg", "ErrType:" + paramInt2);
      GMTrace.o(375675420672L, 2799);
      return;
    }
    paramInt1 = paramq.AZ().tKs;
    if (paramInt1 == -4) {
      w.e("MicroMsg.NetSceneUploadHDHeadImg", "retcode == %d", new Object[] { Integer.valueOf(paramInt1) });
    }
    for (paramInt1 = 1; paramInt1 != 0; paramInt1 = 0)
    {
      w.e("MicroMsg.NetSceneUploadHDHeadImg", "handleCertainError");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(375675420672L, 2799);
      return;
    }
    this.gsM = paramArrayOfByte.tRD;
    if (this.gsM < this.gsL)
    {
      if (a(this.gtW, this.fUd) < 0)
      {
        w.e("MicroMsg.NetSceneUploadHDHeadImg", "doScene again failed");
        this.fUd.a(3, -1, "", this);
      }
      w.d("MicroMsg.NetSceneUploadHDHeadImg", "doScene again");
      GMTrace.o(375675420672L, 2799);
      return;
    }
    try
    {
      FileOp.al(this.eMk, this.gtd);
      com.tencent.mm.kernel.h.xy().xh().set(12297, paramArrayOfByte.uVC);
      n.Dh().d(this.gtf, com.tencent.mm.sdk.platformtools.d.RD(this.gtd));
      paramq = com.tencent.mm.y.q.zE();
      if (!bg.nm(paramq))
      {
        paramArrayOfByte = new h();
        paramArrayOfByte.username = paramq;
        paramArrayOfByte.bi(true);
        paramArrayOfByte.eQl = 32;
        paramArrayOfByte.fiZ = 3;
        paramArrayOfByte.eQl = 34;
        n.Di().a(paramArrayOfByte);
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(375675420672L, 2799);
      return;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.NetSceneUploadHDHeadImg", "rename temp file failed :" + paramString.getMessage());
      this.fUd.a(3, -1, "", this);
      GMTrace.o(375675420672L, 2799);
    }
  }
  
  protected final void cancel()
  {
    GMTrace.i(375809638400L, 2800);
    super.cancel();
    GMTrace.o(375809638400L, 2800);
  }
  
  public final int getType()
  {
    GMTrace.i(375943856128L, 2801);
    GMTrace.o(375943856128L, 2801);
    return 157;
  }
  
  protected final int vB()
  {
    GMTrace.i(375541202944L, 2798);
    GMTrace.o(375541202944L, 2798);
    return 200;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ac\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
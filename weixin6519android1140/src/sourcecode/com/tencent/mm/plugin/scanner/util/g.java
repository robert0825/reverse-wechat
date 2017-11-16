package com.tencent.mm.plugin.scanner.util;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.licence.model.LibCardRecog;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qbar.QbarNative;

public final class g
  extends b
{
  private int mCount;
  private boolean oAE;
  public boolean oAF;
  private boolean oAG;
  public boolean[] oAH;
  private boolean oAI;
  private boolean oAJ;
  private boolean oAK;
  private Bitmap oAL;
  private final Object oAM;
  
  public g(b.a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(parama);
    GMTrace.i(6163009634304L, 45918);
    this.mCount = 0;
    this.oAM = new Object();
    this.oAH = new boolean[4];
    this.oAE = false;
    this.oAF = paramBoolean1;
    this.oAG = paramBoolean2;
    w.d("MicroMsg.ScanBankCardDecoder", "isPortrait:%s, needRotate:%s", new Object[] { Boolean.valueOf(false), Boolean.valueOf(paramBoolean1) });
    GMTrace.o(6163009634304L, 45918);
  }
  
  /* Error */
  public final boolean a(byte[] paramArrayOfByte, android.graphics.Point paramPoint, android.graphics.Rect paramRect)
  {
    // Byte code:
    //   0: ldc2_w 75
    //   3: ldc 77
    //   5: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 42	com/tencent/mm/plugin/scanner/util/g:oAM	Ljava/lang/Object;
    //   12: astore 19
    //   14: aload 19
    //   16: monitorenter
    //   17: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   20: lstore 12
    //   22: ldc 52
    //   24: ldc 85
    //   26: iconst_2
    //   27: anewarray 37	java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: aload_2
    //   33: aastore
    //   34: dup
    //   35: iconst_1
    //   36: aload_3
    //   37: aastore
    //   38: invokestatic 66	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: iconst_1
    //   42: aload_0
    //   43: getfield 87	com/tencent/mm/plugin/scanner/util/g:oAI	Z
    //   46: if_icmpne +23 -> 69
    //   49: ldc 52
    //   51: ldc 89
    //   53: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: aload 19
    //   58: monitorexit
    //   59: ldc2_w 75
    //   62: ldc 77
    //   64: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   67: iconst_0
    //   68: ireturn
    //   69: aload_2
    //   70: getfield 97	android/graphics/Point:x	I
    //   73: i2f
    //   74: aload_3
    //   75: invokevirtual 103	android/graphics/Rect:width	()I
    //   78: i2f
    //   79: fdiv
    //   80: aload_2
    //   81: getfield 106	android/graphics/Point:y	I
    //   84: i2f
    //   85: aload_3
    //   86: invokevirtual 109	android/graphics/Rect:height	()I
    //   89: i2f
    //   90: fdiv
    //   91: invokestatic 115	java/lang/Math:min	(FF)F
    //   94: ldc 116
    //   96: invokestatic 115	java/lang/Math:min	(FF)F
    //   99: fstore 4
    //   101: aload_3
    //   102: invokevirtual 103	android/graphics/Rect:width	()I
    //   105: i2f
    //   106: fconst_1
    //   107: fload 4
    //   109: fconst_1
    //   110: fsub
    //   111: ldc 117
    //   113: fmul
    //   114: fadd
    //   115: fmul
    //   116: f2i
    //   117: iconst_4
    //   118: idiv
    //   119: iconst_4
    //   120: imul
    //   121: istore 5
    //   123: aload_3
    //   124: invokevirtual 109	android/graphics/Rect:height	()I
    //   127: i2f
    //   128: fload 4
    //   130: fmul
    //   131: f2i
    //   132: iconst_4
    //   133: idiv
    //   134: iconst_4
    //   135: imul
    //   136: istore 6
    //   138: ldc 52
    //   140: ldc 119
    //   142: iconst_3
    //   143: anewarray 37	java/lang/Object
    //   146: dup
    //   147: iconst_0
    //   148: fload 4
    //   150: invokestatic 124	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   153: aastore
    //   154: dup
    //   155: iconst_1
    //   156: iload 5
    //   158: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   161: aastore
    //   162: dup
    //   163: iconst_2
    //   164: iload 6
    //   166: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   169: aastore
    //   170: invokestatic 66	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: aload_0
    //   174: getfield 131	com/tencent/mm/plugin/scanner/util/g:oAJ	Z
    //   177: ifne +94 -> 271
    //   180: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   183: lstore 14
    //   185: iload 5
    //   187: iload 6
    //   189: bipush 8
    //   191: aload_0
    //   192: getfield 46	com/tencent/mm/plugin/scanner/util/g:oAE	Z
    //   195: invokestatic 137	com/tencent/qbar/QbarNative:focusedEngineForBankcardInit	(IIIZ)I
    //   198: istore 7
    //   200: ldc 52
    //   202: new 139	java/lang/StringBuilder
    //   205: dup
    //   206: ldc -115
    //   208: invokespecial 144	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   211: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   214: lload 14
    //   216: lsub
    //   217: invokevirtual 148	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   220: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   223: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   226: iload 7
    //   228: ifeq +38 -> 266
    //   231: ldc 52
    //   233: new 139	java/lang/StringBuilder
    //   236: dup
    //   237: ldc -102
    //   239: invokespecial 144	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   242: iload 7
    //   244: invokevirtual 157	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   247: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   250: invokestatic 160	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   253: aload 19
    //   255: monitorexit
    //   256: ldc2_w 75
    //   259: ldc 77
    //   261: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   264: iconst_0
    //   265: ireturn
    //   266: aload_0
    //   267: iconst_1
    //   268: putfield 131	com/tencent/mm/plugin/scanner/util/g:oAJ	Z
    //   271: aload_0
    //   272: getfield 162	com/tencent/mm/plugin/scanner/util/g:oAK	Z
    //   275: ifne +91 -> 366
    //   278: iconst_1
    //   279: aload_0
    //   280: getfield 131	com/tencent/mm/plugin/scanner/util/g:oAJ	Z
    //   283: if_icmpne +83 -> 366
    //   286: ldc 52
    //   288: ldc -92
    //   290: iconst_5
    //   291: anewarray 37	java/lang/Object
    //   294: dup
    //   295: iconst_0
    //   296: iload 5
    //   298: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   301: aastore
    //   302: dup
    //   303: iconst_1
    //   304: iload 6
    //   306: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   309: aastore
    //   310: dup
    //   311: iconst_2
    //   312: aload_3
    //   313: invokevirtual 103	android/graphics/Rect:width	()I
    //   316: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   319: aastore
    //   320: dup
    //   321: iconst_3
    //   322: aload_3
    //   323: invokevirtual 109	android/graphics/Rect:height	()I
    //   326: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   329: aastore
    //   330: dup
    //   331: iconst_4
    //   332: aload_0
    //   333: getfield 46	com/tencent/mm/plugin/scanner/util/g:oAE	Z
    //   336: invokestatic 60	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   339: aastore
    //   340: invokestatic 66	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   343: iload 5
    //   345: iload 6
    //   347: aload_0
    //   348: getfield 46	com/tencent/mm/plugin/scanner/util/g:oAE	Z
    //   351: invokestatic 170	com/tencent/mm/plugin/licence/model/LibCardRecog:recognizeBankCardInit	(IIZ)I
    //   354: ifne +476 -> 830
    //   357: iconst_1
    //   358: istore 16
    //   360: aload_0
    //   361: iload 16
    //   363: putfield 162	com/tencent/mm/plugin/scanner/util/g:oAK	Z
    //   366: aload_3
    //   367: getfield 173	android/graphics/Rect:left	I
    //   370: iload 5
    //   372: aload_3
    //   373: invokevirtual 103	android/graphics/Rect:width	()I
    //   376: isub
    //   377: iconst_2
    //   378: idiv
    //   379: isub
    //   380: istore 7
    //   382: aload_3
    //   383: getfield 176	android/graphics/Rect:top	I
    //   386: iload 6
    //   388: aload_3
    //   389: invokevirtual 109	android/graphics/Rect:height	()I
    //   392: isub
    //   393: iconst_2
    //   394: idiv
    //   395: isub
    //   396: istore 8
    //   398: ldc 52
    //   400: ldc -78
    //   402: iconst_3
    //   403: anewarray 37	java/lang/Object
    //   406: dup
    //   407: iconst_0
    //   408: iload 7
    //   410: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   413: aastore
    //   414: dup
    //   415: iconst_1
    //   416: iload 8
    //   418: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   421: aastore
    //   422: dup
    //   423: iconst_2
    //   424: aload_1
    //   425: arraylength
    //   426: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   429: aastore
    //   430: invokestatic 66	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   433: invokestatic 184	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   436: ldc -70
    //   438: invokevirtual 192	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   441: astore_3
    //   442: aload_3
    //   443: ifnull +184 -> 627
    //   446: aload_3
    //   447: ldc -62
    //   449: invokevirtual 200	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   452: ifeq +175 -> 627
    //   455: aload_0
    //   456: aload_0
    //   457: getfield 35	com/tencent/mm/plugin/scanner/util/g:mCount	I
    //   460: iconst_1
    //   461: iadd
    //   462: putfield 35	com/tencent/mm/plugin/scanner/util/g:mCount	I
    //   465: aload_2
    //   466: getfield 97	android/graphics/Point:x	I
    //   469: istore 9
    //   471: aload_2
    //   472: getfield 106	android/graphics/Point:y	I
    //   475: istore 10
    //   477: aload_0
    //   478: getfield 35	com/tencent/mm/plugin/scanner/util/g:mCount	I
    //   481: istore 11
    //   483: new 202	android/graphics/YuvImage
    //   486: dup
    //   487: aload_1
    //   488: bipush 17
    //   490: iload 9
    //   492: iload 10
    //   494: aconst_null
    //   495: invokespecial 205	android/graphics/YuvImage:<init>	([BIII[I)V
    //   498: astore_3
    //   499: ldc 52
    //   501: ldc -49
    //   503: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   506: new 209	java/io/ByteArrayOutputStream
    //   509: dup
    //   510: invokespecial 210	java/io/ByteArrayOutputStream:<init>	()V
    //   513: astore 20
    //   515: aload_3
    //   516: new 99	android/graphics/Rect
    //   519: dup
    //   520: iconst_0
    //   521: iconst_0
    //   522: iload 9
    //   524: iload 10
    //   526: invokespecial 213	android/graphics/Rect:<init>	(IIII)V
    //   529: bipush 100
    //   531: aload 20
    //   533: invokevirtual 217	android/graphics/YuvImage:compressToJpeg	(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z
    //   536: pop
    //   537: aload 20
    //   539: invokevirtual 221	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   542: astore 18
    //   544: aconst_null
    //   545: astore_3
    //   546: new 223	java/io/FileOutputStream
    //   549: dup
    //   550: new 225	java/io/File
    //   553: dup
    //   554: new 139	java/lang/StringBuilder
    //   557: dup
    //   558: invokespecial 226	java/lang/StringBuilder:<init>	()V
    //   561: invokestatic 232	com/tencent/mm/compatible/util/h:getExternalStorageDirectory	()Ljava/io/File;
    //   564: invokevirtual 235	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   567: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   570: ldc -16
    //   572: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   575: iload 11
    //   577: invokestatic 243	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   580: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   583: ldc -11
    //   585: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   588: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   591: invokespecial 246	java/io/File:<init>	(Ljava/lang/String;)V
    //   594: invokespecial 249	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   597: astore 17
    //   599: aload 17
    //   601: astore_3
    //   602: aload 17
    //   604: aload 18
    //   606: invokevirtual 253	java/io/FileOutputStream:write	([B)V
    //   609: aload 17
    //   611: astore_3
    //   612: aload 17
    //   614: invokevirtual 256	java/io/FileOutputStream:flush	()V
    //   617: aload 17
    //   619: invokevirtual 259	java/io/FileOutputStream:close	()V
    //   622: aload 20
    //   624: invokevirtual 260	java/io/ByteArrayOutputStream:close	()V
    //   627: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   630: lstore 14
    //   632: new 262	com/tencent/mm/plugin/licence/model/BankCardInfo
    //   635: dup
    //   636: aload_2
    //   637: getfield 97	android/graphics/Point:x	I
    //   640: aload_2
    //   641: getfield 106	android/graphics/Point:y	I
    //   644: invokespecial 265	com/tencent/mm/plugin/licence/model/BankCardInfo:<init>	(II)V
    //   647: astore_3
    //   648: aload_1
    //   649: aload_2
    //   650: getfield 106	android/graphics/Point:y	I
    //   653: aload_2
    //   654: getfield 97	android/graphics/Point:x	I
    //   657: iload 7
    //   659: iload 8
    //   661: iload 6
    //   663: iload 5
    //   665: aload_3
    //   666: aload_0
    //   667: getfield 44	com/tencent/mm/plugin/scanner/util/g:oAH	[Z
    //   670: invokestatic 269	com/tencent/mm/plugin/licence/model/LibCardRecog:recognizeBankCardProcess	([BIIIIIILcom/tencent/mm/plugin/licence/model/BankCardInfo;[Z)I
    //   673: istore 5
    //   675: ldc 52
    //   677: new 139	java/lang/StringBuilder
    //   680: dup
    //   681: ldc_w 271
    //   684: invokespecial 144	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   687: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   690: lload 14
    //   692: lsub
    //   693: invokevirtual 148	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   696: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   699: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   702: aload_0
    //   703: getfield 48	com/tencent/mm/plugin/scanner/util/g:oAF	Z
    //   706: ifne +59 -> 765
    //   709: aload_0
    //   710: getfield 44	com/tencent/mm/plugin/scanner/util/g:oAH	[Z
    //   713: iconst_0
    //   714: baload
    //   715: istore 16
    //   717: aload_0
    //   718: getfield 44	com/tencent/mm/plugin/scanner/util/g:oAH	[Z
    //   721: iconst_0
    //   722: aload_0
    //   723: getfield 44	com/tencent/mm/plugin/scanner/util/g:oAH	[Z
    //   726: iconst_2
    //   727: baload
    //   728: bastore
    //   729: aload_0
    //   730: getfield 44	com/tencent/mm/plugin/scanner/util/g:oAH	[Z
    //   733: iconst_2
    //   734: iload 16
    //   736: bastore
    //   737: aload_0
    //   738: getfield 44	com/tencent/mm/plugin/scanner/util/g:oAH	[Z
    //   741: iconst_1
    //   742: baload
    //   743: istore 16
    //   745: aload_0
    //   746: getfield 44	com/tencent/mm/plugin/scanner/util/g:oAH	[Z
    //   749: iconst_1
    //   750: aload_0
    //   751: getfield 44	com/tencent/mm/plugin/scanner/util/g:oAH	[Z
    //   754: iconst_3
    //   755: baload
    //   756: bastore
    //   757: aload_0
    //   758: getfield 44	com/tencent/mm/plugin/scanner/util/g:oAH	[Z
    //   761: iconst_3
    //   762: iload 16
    //   764: bastore
    //   765: ldc 52
    //   767: new 139	java/lang/StringBuilder
    //   770: dup
    //   771: ldc_w 273
    //   774: invokespecial 144	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   777: iload 5
    //   779: invokevirtual 157	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   782: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   785: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   788: iload 5
    //   790: iconst_1
    //   791: if_icmpeq +234 -> 1025
    //   794: ldc 52
    //   796: new 139	java/lang/StringBuilder
    //   799: dup
    //   800: ldc_w 275
    //   803: invokespecial 144	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   806: iload 5
    //   808: invokevirtual 157	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   811: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   814: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   817: aload 19
    //   819: monitorexit
    //   820: ldc2_w 75
    //   823: ldc 77
    //   825: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   828: iconst_0
    //   829: ireturn
    //   830: iconst_0
    //   831: istore 16
    //   833: goto -473 -> 360
    //   836: astore_3
    //   837: ldc 52
    //   839: aload_3
    //   840: ldc_w 277
    //   843: iconst_0
    //   844: anewarray 37	java/lang/Object
    //   847: invokestatic 281	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   850: goto -228 -> 622
    //   853: astore_1
    //   854: aload 19
    //   856: monitorexit
    //   857: aload_1
    //   858: athrow
    //   859: astore_3
    //   860: ldc 52
    //   862: aload_3
    //   863: ldc_w 277
    //   866: iconst_0
    //   867: anewarray 37	java/lang/Object
    //   870: invokestatic 281	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   873: goto -246 -> 627
    //   876: astore 18
    //   878: aconst_null
    //   879: astore 17
    //   881: aload 17
    //   883: astore_3
    //   884: ldc 52
    //   886: ldc_w 283
    //   889: iconst_1
    //   890: anewarray 37	java/lang/Object
    //   893: dup
    //   894: iconst_0
    //   895: aload 18
    //   897: invokevirtual 286	java/io/IOException:getMessage	()Ljava/lang/String;
    //   900: aastore
    //   901: invokestatic 288	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   904: aload 17
    //   906: astore_3
    //   907: ldc 52
    //   909: aload 18
    //   911: ldc_w 277
    //   914: iconst_0
    //   915: anewarray 37	java/lang/Object
    //   918: invokestatic 281	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   921: aload 17
    //   923: ifnull +8 -> 931
    //   926: aload 17
    //   928: invokevirtual 259	java/io/FileOutputStream:close	()V
    //   931: aload 20
    //   933: invokevirtual 260	java/io/ByteArrayOutputStream:close	()V
    //   936: goto -309 -> 627
    //   939: astore_3
    //   940: ldc 52
    //   942: aload_3
    //   943: ldc_w 277
    //   946: iconst_0
    //   947: anewarray 37	java/lang/Object
    //   950: invokestatic 281	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   953: goto -326 -> 627
    //   956: astore_3
    //   957: ldc 52
    //   959: aload_3
    //   960: ldc_w 277
    //   963: iconst_0
    //   964: anewarray 37	java/lang/Object
    //   967: invokestatic 281	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   970: goto -39 -> 931
    //   973: astore_1
    //   974: aload_3
    //   975: astore_2
    //   976: aload_2
    //   977: ifnull +7 -> 984
    //   980: aload_2
    //   981: invokevirtual 259	java/io/FileOutputStream:close	()V
    //   984: aload 20
    //   986: invokevirtual 260	java/io/ByteArrayOutputStream:close	()V
    //   989: aload_1
    //   990: athrow
    //   991: astore_2
    //   992: ldc 52
    //   994: aload_2
    //   995: ldc_w 277
    //   998: iconst_0
    //   999: anewarray 37	java/lang/Object
    //   1002: invokestatic 281	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1005: goto -21 -> 984
    //   1008: astore_2
    //   1009: ldc 52
    //   1011: aload_2
    //   1012: ldc_w 277
    //   1015: iconst_0
    //   1016: anewarray 37	java/lang/Object
    //   1019: invokestatic 281	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1022: goto -33 -> 989
    //   1025: new 290	android/graphics/BitmapFactory$Options
    //   1028: dup
    //   1029: invokespecial 291	android/graphics/BitmapFactory$Options:<init>	()V
    //   1032: astore_1
    //   1033: aload_1
    //   1034: iconst_1
    //   1035: putfield 294	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   1038: aload_0
    //   1039: aload_3
    //   1040: getfield 298	com/tencent/mm/plugin/licence/model/BankCardInfo:bitmapData	[B
    //   1043: iconst_0
    //   1044: aload_3
    //   1045: getfield 301	com/tencent/mm/plugin/licence/model/BankCardInfo:bitmapLen	I
    //   1048: aload_1
    //   1049: invokestatic 307	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   1052: getstatic 313	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   1055: iconst_1
    //   1056: invokevirtual 319	android/graphics/Bitmap:copy	(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
    //   1059: putfield 321	com/tencent/mm/plugin/scanner/util/g:oAL	Landroid/graphics/Bitmap;
    //   1062: aload_0
    //   1063: getfield 321	com/tencent/mm/plugin/scanner/util/g:oAL	Landroid/graphics/Bitmap;
    //   1066: ifnonnull +16 -> 1082
    //   1069: aload 19
    //   1071: monitorexit
    //   1072: ldc2_w 75
    //   1075: ldc 77
    //   1077: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1080: iconst_0
    //   1081: ireturn
    //   1082: aload_3
    //   1083: invokevirtual 325	com/tencent/mm/plugin/licence/model/BankCardInfo:getRectX	()[I
    //   1086: astore_1
    //   1087: aload_3
    //   1088: invokevirtual 328	com/tencent/mm/plugin/licence/model/BankCardInfo:getRectY	()[I
    //   1091: astore_2
    //   1092: aload_1
    //   1093: aload_3
    //   1094: invokevirtual 331	com/tencent/mm/plugin/licence/model/BankCardInfo:getCardNumLen	()I
    //   1097: iconst_1
    //   1098: isub
    //   1099: iaload
    //   1100: aload_1
    //   1101: iconst_0
    //   1102: iaload
    //   1103: isub
    //   1104: aload_1
    //   1105: iconst_1
    //   1106: iaload
    //   1107: aload_1
    //   1108: iconst_0
    //   1109: iaload
    //   1110: isub
    //   1111: iadd
    //   1112: istore 6
    //   1114: iload 6
    //   1116: i2f
    //   1117: ldc_w 332
    //   1120: fmul
    //   1121: f2i
    //   1122: istore 9
    //   1124: aload_1
    //   1125: iconst_0
    //   1126: iaload
    //   1127: i2f
    //   1128: iload 6
    //   1130: i2f
    //   1131: ldc_w 333
    //   1134: fmul
    //   1135: fsub
    //   1136: f2i
    //   1137: istore 5
    //   1139: iload 5
    //   1141: ifle +184 -> 1325
    //   1144: iload 6
    //   1146: iconst_2
    //   1147: imul
    //   1148: i2f
    //   1149: ldc_w 333
    //   1152: fmul
    //   1153: f2i
    //   1154: iload 6
    //   1156: iadd
    //   1157: istore 8
    //   1159: aload_2
    //   1160: iconst_0
    //   1161: iaload
    //   1162: i2f
    //   1163: aload_1
    //   1164: iconst_1
    //   1165: iaload
    //   1166: aload_1
    //   1167: iconst_0
    //   1168: iaload
    //   1169: isub
    //   1170: i2f
    //   1171: ldc_w 334
    //   1174: fmul
    //   1175: fconst_2
    //   1176: fdiv
    //   1177: fadd
    //   1178: iload 9
    //   1180: iconst_2
    //   1181: idiv
    //   1182: i2f
    //   1183: fsub
    //   1184: f2i
    //   1185: istore 6
    //   1187: iload 6
    //   1189: ifle +142 -> 1331
    //   1192: iload 8
    //   1194: istore 7
    //   1196: iload 5
    //   1198: iload 8
    //   1200: iadd
    //   1201: aload_3
    //   1202: getfield 336	com/tencent/mm/plugin/licence/model/BankCardInfo:width	I
    //   1205: if_icmple +12 -> 1217
    //   1208: aload_3
    //   1209: getfield 336	com/tencent/mm/plugin/licence/model/BankCardInfo:width	I
    //   1212: iload 5
    //   1214: isub
    //   1215: istore 7
    //   1217: iload 9
    //   1219: istore 8
    //   1221: iload 6
    //   1223: iload 9
    //   1225: iadd
    //   1226: aload_3
    //   1227: getfield 338	com/tencent/mm/plugin/licence/model/BankCardInfo:height	I
    //   1230: if_icmple +12 -> 1242
    //   1233: aload_3
    //   1234: getfield 338	com/tencent/mm/plugin/licence/model/BankCardInfo:height	I
    //   1237: iload 6
    //   1239: isub
    //   1240: istore 8
    //   1242: aload_0
    //   1243: aload_0
    //   1244: getfield 321	com/tencent/mm/plugin/scanner/util/g:oAL	Landroid/graphics/Bitmap;
    //   1247: iload 5
    //   1249: iload 6
    //   1251: iload 7
    //   1253: iload 8
    //   1255: invokestatic 342	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   1258: putfield 321	com/tencent/mm/plugin/scanner/util/g:oAL	Landroid/graphics/Bitmap;
    //   1261: iconst_3
    //   1262: putstatic 345	com/tencent/mm/plugin/scanner/util/g:oAc	I
    //   1265: aload_0
    //   1266: getfield 50	com/tencent/mm/plugin/scanner/util/g:oAG	Z
    //   1269: ifeq +68 -> 1337
    //   1272: aload_0
    //   1273: aload_3
    //   1274: invokevirtual 348	com/tencent/mm/plugin/licence/model/BankCardInfo:getCardNum	()Ljava/lang/String;
    //   1277: putfield 352	com/tencent/mm/plugin/scanner/util/g:oAb	Ljava/lang/String;
    //   1280: aload_0
    //   1281: iconst_1
    //   1282: putfield 87	com/tencent/mm/plugin/scanner/util/g:oAI	Z
    //   1285: ldc 52
    //   1287: new 139	java/lang/StringBuilder
    //   1290: dup
    //   1291: ldc_w 354
    //   1294: invokespecial 144	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1297: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   1300: lload 12
    //   1302: lsub
    //   1303: invokevirtual 148	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1306: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1309: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1312: aload 19
    //   1314: monitorexit
    //   1315: ldc2_w 75
    //   1318: ldc 77
    //   1320: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1323: iconst_1
    //   1324: ireturn
    //   1325: iconst_0
    //   1326: istore 5
    //   1328: goto -184 -> 1144
    //   1331: iconst_0
    //   1332: istore 6
    //   1334: goto -142 -> 1192
    //   1337: aload_0
    //   1338: aload_3
    //   1339: invokevirtual 348	com/tencent/mm/plugin/licence/model/BankCardInfo:getCardNum	()Ljava/lang/String;
    //   1342: aload_3
    //   1343: invokevirtual 331	com/tencent/mm/plugin/licence/model/BankCardInfo:getCardNumLen	()I
    //   1346: aload_1
    //   1347: invokestatic 358	com/tencent/mm/plugin/licence/model/LibCardRecog:recognizeBankCardSegmentNumber	(Ljava/lang/String;I[I)Ljava/lang/String;
    //   1350: putfield 352	com/tencent/mm/plugin/scanner/util/g:oAb	Ljava/lang/String;
    //   1353: goto -73 -> 1280
    //   1356: astore_1
    //   1357: aload_3
    //   1358: astore_2
    //   1359: goto -383 -> 976
    //   1362: astore 18
    //   1364: goto -483 -> 881
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1367	0	this	g
    //   0	1367	1	paramArrayOfByte	byte[]
    //   0	1367	2	paramPoint	android.graphics.Point
    //   0	1367	3	paramRect	android.graphics.Rect
    //   99	50	4	f	float
    //   121	1206	5	i	int
    //   136	1197	6	j	int
    //   198	1054	7	k	int
    //   396	858	8	m	int
    //   469	757	9	n	int
    //   475	50	10	i1	int
    //   481	95	11	i2	int
    //   20	1281	12	l1	long
    //   183	508	14	l2	long
    //   358	474	16	i3	int
    //   597	330	17	localFileOutputStream	java.io.FileOutputStream
    //   542	63	18	arrayOfByte	byte[]
    //   876	34	18	localIOException1	java.io.IOException
    //   1362	1	18	localIOException2	java.io.IOException
    //   12	1301	19	localObject	Object
    //   513	472	20	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   617	622	836	java/io/IOException
    //   17	59	853	finally
    //   69	226	853	finally
    //   231	256	853	finally
    //   266	271	853	finally
    //   271	357	853	finally
    //   360	366	853	finally
    //   366	442	853	finally
    //   446	544	853	finally
    //   617	622	853	finally
    //   622	627	853	finally
    //   627	765	853	finally
    //   765	788	853	finally
    //   794	820	853	finally
    //   837	850	853	finally
    //   854	857	853	finally
    //   860	873	853	finally
    //   926	931	853	finally
    //   931	936	853	finally
    //   940	953	853	finally
    //   957	970	853	finally
    //   980	984	853	finally
    //   984	989	853	finally
    //   989	991	853	finally
    //   992	1005	853	finally
    //   1009	1022	853	finally
    //   1025	1072	853	finally
    //   1082	1114	853	finally
    //   1159	1187	853	finally
    //   1196	1217	853	finally
    //   1221	1242	853	finally
    //   1242	1280	853	finally
    //   1280	1315	853	finally
    //   1337	1353	853	finally
    //   622	627	859	java/io/IOException
    //   546	599	876	java/io/IOException
    //   931	936	939	java/io/IOException
    //   926	931	956	java/io/IOException
    //   546	599	973	finally
    //   980	984	991	java/io/IOException
    //   984	989	1008	java/io/IOException
    //   602	609	1356	finally
    //   612	617	1356	finally
    //   884	904	1356	finally
    //   907	921	1356	finally
    //   602	609	1362	java/io/IOException
    //   612	617	1362	java/io/IOException
  }
  
  public final void bdl()
  {
    GMTrace.i(6163412287488L, 45921);
    releaseDecoder();
    GMTrace.o(6163412287488L, 45921);
  }
  
  public final Bitmap bdr()
  {
    GMTrace.i(19595117199360L, 145995);
    synchronized (this.oAM)
    {
      Bitmap localBitmap = this.oAL;
      GMTrace.o(19595117199360L, 145995);
      return localBitmap;
    }
  }
  
  public final void releaseDecoder()
  {
    GMTrace.i(6163278069760L, 45920);
    synchronized (this.oAM)
    {
      if (true == this.oAJ)
      {
        QbarNative.focusedEngineRelease();
        this.oAJ = false;
      }
      if (true == this.oAK) {
        LibCardRecog.recognizeBankCardRelease();
      }
      this.oAL = null;
      GMTrace.o(6163278069760L, 45920);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.e.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.e.b.g.a;
import com.tencent.mm.modelvoice.MediaRecorder;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class c
  implements a
{
  public static a.a ezB;
  private boolean ezA;
  public BlockingQueue<g.a> ezr;
  public boolean ezs;
  public String ezt;
  private int ezu;
  private byte[] ezv;
  private int ezw;
  private Object ezx;
  public a ezy;
  private int ezz;
  private FileOutputStream mFileOutputStream;
  private int mSampleRate;
  
  static
  {
    GMTrace.i(4468108165120L, 33290);
    ezB = new a.a();
    GMTrace.o(4468108165120L, 33290);
  }
  
  public c(int paramInt1, int paramInt2)
  {
    GMTrace.i(4467034423296L, 33282);
    this.ezr = new ArrayBlockingQueue(1024);
    this.ezs = false;
    this.ezu = 0;
    this.ezv = null;
    this.mSampleRate = 16000;
    this.ezw = 16000;
    this.ezx = new Object();
    this.ezy = null;
    this.ezA = false;
    this.mSampleRate = paramInt1;
    this.ezw = paramInt2;
    GMTrace.o(4467034423296L, 33282);
  }
  
  public final int a(g.a parama, int paramInt)
  {
    GMTrace.i(4467437076480L, 33285);
    paramInt = a(parama, 0, false);
    GMTrace.o(4467437076480L, 33285);
    return paramInt;
  }
  
  /* Error */
  public final int a(g.a parama, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc2_w 94
    //   3: ldc 96
    //   5: invokestatic 43	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 98	com/tencent/mm/compatible/util/g$a
    //   11: dup
    //   12: invokespecial 99	com/tencent/mm/compatible/util/g$a:<init>	()V
    //   15: astore 14
    //   17: aload_0
    //   18: getfield 74	com/tencent/mm/e/c/c:mSampleRate	I
    //   21: bipush 20
    //   23: imul
    //   24: iconst_2
    //   25: imul
    //   26: sipush 1000
    //   29: idiv
    //   30: i2s
    //   31: istore 4
    //   33: aload_0
    //   34: getfield 70	com/tencent/mm/e/c/c:ezu	I
    //   37: aload_1
    //   38: getfield 104	com/tencent/mm/e/b/g$a:eyw	I
    //   41: iadd
    //   42: istore 7
    //   44: iconst_0
    //   45: istore 6
    //   47: iload 4
    //   49: newarray <illegal type>
    //   51: astore 15
    //   53: aload_0
    //   54: getfield 82	com/tencent/mm/e/c/c:ezA	Z
    //   57: ifeq +434 -> 491
    //   60: bipush 6
    //   62: istore 5
    //   64: iload 5
    //   66: iload 4
    //   68: imul
    //   69: newarray <illegal type>
    //   71: astore 16
    //   73: ldc 106
    //   75: invokestatic 112	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   78: checkcast 106	com/tencent/mm/plugin/zero/b/a
    //   81: invokeinterface 116 1 0
    //   86: ldc 118
    //   88: invokevirtual 124	com/tencent/mm/k/e:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   91: astore 17
    //   93: aload 17
    //   95: invokestatic 130	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   98: ifne +983 -> 1081
    //   101: aload 17
    //   103: iconst_1
    //   104: invokestatic 134	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   107: iconst_1
    //   108: if_icmpne +389 -> 497
    //   111: iconst_1
    //   112: istore 11
    //   114: iload_3
    //   115: ifeq +6 -> 121
    //   118: iconst_0
    //   119: istore 11
    //   121: ldc -120
    //   123: ldc -118
    //   125: iconst_1
    //   126: anewarray 4	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: iload 11
    //   133: invokestatic 144	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   136: aastore
    //   137: invokestatic 150	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: iconst_0
    //   141: istore 5
    //   143: iload 7
    //   145: iload 4
    //   147: if_icmplt +688 -> 835
    //   150: aload_0
    //   151: getfield 70	com/tencent/mm/e/c/c:ezu	I
    //   154: ifle +401 -> 555
    //   157: aload_0
    //   158: getfield 72	com/tencent/mm/e/c/c:ezv	[B
    //   161: iconst_0
    //   162: aload 15
    //   164: iconst_0
    //   165: aload_0
    //   166: getfield 70	com/tencent/mm/e/c/c:ezu	I
    //   169: invokestatic 156	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   172: aload_1
    //   173: getfield 159	com/tencent/mm/e/b/g$a:buf	[B
    //   176: iconst_0
    //   177: aload 15
    //   179: aload_0
    //   180: getfield 70	com/tencent/mm/e/c/c:ezu	I
    //   183: iload 4
    //   185: aload_0
    //   186: getfield 70	com/tencent/mm/e/c/c:ezu	I
    //   189: isub
    //   190: invokestatic 156	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   193: iload 6
    //   195: iload 4
    //   197: aload_0
    //   198: getfield 70	com/tencent/mm/e/c/c:ezu	I
    //   201: isub
    //   202: iadd
    //   203: istore 6
    //   205: aload_0
    //   206: iconst_0
    //   207: putfield 70	com/tencent/mm/e/c/c:ezu	I
    //   210: iload 7
    //   212: iload 4
    //   214: isub
    //   215: istore 7
    //   217: iconst_1
    //   218: newarray <illegal type>
    //   220: astore 17
    //   222: aload_0
    //   223: getfield 78	com/tencent/mm/e/c/c:ezx	Ljava/lang/Object;
    //   226: astore 18
    //   228: aload 18
    //   230: monitorenter
    //   231: aload_0
    //   232: getfield 82	com/tencent/mm/e/c/c:ezA	Z
    //   235: ifeq +32 -> 267
    //   238: iload 7
    //   240: iload 4
    //   242: if_icmpge +382 -> 624
    //   245: aload_1
    //   246: getfield 162	com/tencent/mm/e/b/g$a:eyx	Z
    //   249: ifeq +375 -> 624
    //   252: sipush 201
    //   255: iconst_1
    //   256: invokestatic 168	com/tencent/mm/modelvoice/MediaRecorder:SetVoiceSilkControl	(II)I
    //   259: pop
    //   260: ldc -120
    //   262: ldc -86
    //   264: invokestatic 173	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   267: aload 15
    //   269: iload 4
    //   271: aload 16
    //   273: aload 17
    //   275: iload 11
    //   277: invokestatic 177	com/tencent/mm/modelvoice/MediaRecorder:SilkDoEnc	([BS[B[SZ)I
    //   280: istore 10
    //   282: aload 18
    //   284: monitorexit
    //   285: iconst_0
    //   286: istore 9
    //   288: iload 9
    //   290: istore 8
    //   292: iload_3
    //   293: ifeq +159 -> 452
    //   296: iload 9
    //   298: istore 8
    //   300: aload 17
    //   302: iconst_0
    //   303: saload
    //   304: bipush 10
    //   306: if_icmplt +146 -> 452
    //   309: iload 9
    //   311: istore 8
    //   313: aload 16
    //   315: iconst_0
    //   316: baload
    //   317: iconst_2
    //   318: if_icmpne +134 -> 452
    //   321: iload 9
    //   323: istore 8
    //   325: aload 16
    //   327: iconst_1
    //   328: baload
    //   329: bipush 35
    //   331: if_icmpne +121 -> 452
    //   334: iload 9
    //   336: istore 8
    //   338: aload 16
    //   340: iconst_2
    //   341: baload
    //   342: bipush 33
    //   344: if_icmpne +108 -> 452
    //   347: iload 9
    //   349: istore 8
    //   351: aload 16
    //   353: iconst_3
    //   354: baload
    //   355: bipush 83
    //   357: if_icmpne +95 -> 452
    //   360: iload 9
    //   362: istore 8
    //   364: aload 16
    //   366: iconst_4
    //   367: baload
    //   368: bipush 73
    //   370: if_icmpne +82 -> 452
    //   373: iload 9
    //   375: istore 8
    //   377: aload 16
    //   379: iconst_5
    //   380: baload
    //   381: bipush 76
    //   383: if_icmpne +69 -> 452
    //   386: iload 9
    //   388: istore 8
    //   390: aload 16
    //   392: bipush 6
    //   394: baload
    //   395: bipush 75
    //   397: if_icmpne +55 -> 452
    //   400: iload 9
    //   402: istore 8
    //   404: aload 16
    //   406: bipush 7
    //   408: baload
    //   409: bipush 95
    //   411: if_icmpne +41 -> 452
    //   414: iload 9
    //   416: istore 8
    //   418: aload 16
    //   420: bipush 8
    //   422: baload
    //   423: bipush 86
    //   425: if_icmpne +27 -> 452
    //   428: iload 9
    //   430: istore 8
    //   432: aload 16
    //   434: bipush 9
    //   436: baload
    //   437: bipush 51
    //   439: if_icmpne +13 -> 452
    //   442: ldc -120
    //   444: ldc -77
    //   446: invokestatic 173	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   449: iconst_1
    //   450: istore 8
    //   452: iload 10
    //   454: ifeq +187 -> 641
    //   457: aload_0
    //   458: iconst_0
    //   459: putfield 70	com/tencent/mm/e/c/c:ezu	I
    //   462: ldc -120
    //   464: ldc -75
    //   466: iconst_1
    //   467: anewarray 4	java/lang/Object
    //   470: dup
    //   471: iconst_0
    //   472: iload 10
    //   474: invokestatic 186	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   477: aastore
    //   478: invokestatic 189	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   481: ldc2_w 94
    //   484: ldc 96
    //   486: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   489: iconst_m1
    //   490: ireturn
    //   491: iconst_1
    //   492: istore 5
    //   494: goto -430 -> 64
    //   497: iconst_0
    //   498: istore 11
    //   500: goto -386 -> 114
    //   503: astore_1
    //   504: ldc -120
    //   506: ldc -65
    //   508: iconst_3
    //   509: anewarray 4	java/lang/Object
    //   512: dup
    //   513: iconst_0
    //   514: aload_0
    //   515: getfield 70	com/tencent/mm/e/c/c:ezu	I
    //   518: invokestatic 186	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   521: aastore
    //   522: dup
    //   523: iconst_1
    //   524: iload 4
    //   526: aload_0
    //   527: getfield 70	com/tencent/mm/e/c/c:ezu	I
    //   530: isub
    //   531: invokestatic 186	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   534: aastore
    //   535: dup
    //   536: iconst_2
    //   537: aload_1
    //   538: invokevirtual 195	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   541: aastore
    //   542: invokestatic 189	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   545: ldc2_w 94
    //   548: ldc 96
    //   550: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   553: iconst_m1
    //   554: ireturn
    //   555: aload_1
    //   556: getfield 159	com/tencent/mm/e/b/g$a:buf	[B
    //   559: iload 6
    //   561: aload 15
    //   563: iconst_0
    //   564: iload 4
    //   566: invokestatic 156	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   569: iload 6
    //   571: iload 4
    //   573: iadd
    //   574: istore 6
    //   576: goto -366 -> 210
    //   579: astore_1
    //   580: ldc -120
    //   582: ldc -59
    //   584: iconst_3
    //   585: anewarray 4	java/lang/Object
    //   588: dup
    //   589: iconst_0
    //   590: iload 6
    //   592: invokestatic 186	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   595: aastore
    //   596: dup
    //   597: iconst_1
    //   598: iload 4
    //   600: invokestatic 202	java/lang/Short:valueOf	(S)Ljava/lang/Short;
    //   603: aastore
    //   604: dup
    //   605: iconst_2
    //   606: aload_1
    //   607: invokevirtual 195	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   610: aastore
    //   611: invokestatic 189	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   614: ldc2_w 94
    //   617: ldc 96
    //   619: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   622: iconst_m1
    //   623: ireturn
    //   624: sipush 201
    //   627: iconst_0
    //   628: invokestatic 168	com/tencent/mm/modelvoice/MediaRecorder:SetVoiceSilkControl	(II)I
    //   631: pop
    //   632: goto -365 -> 267
    //   635: astore_1
    //   636: aload 18
    //   638: monitorexit
    //   639: aload_1
    //   640: athrow
    //   641: ldc -120
    //   643: ldc -52
    //   645: iconst_4
    //   646: anewarray 4	java/lang/Object
    //   649: dup
    //   650: iconst_0
    //   651: aload 17
    //   653: iconst_0
    //   654: saload
    //   655: invokestatic 202	java/lang/Short:valueOf	(S)Ljava/lang/Short;
    //   658: aastore
    //   659: dup
    //   660: iconst_1
    //   661: iload 4
    //   663: invokestatic 202	java/lang/Short:valueOf	(S)Ljava/lang/Short;
    //   666: aastore
    //   667: dup
    //   668: iconst_2
    //   669: aload_1
    //   670: getfield 162	com/tencent/mm/e/b/g$a:eyx	Z
    //   673: invokestatic 144	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   676: aastore
    //   677: dup
    //   678: iconst_3
    //   679: aload_1
    //   680: getfield 104	com/tencent/mm/e/b/g$a:eyw	I
    //   683: invokestatic 186	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   686: aastore
    //   687: invokestatic 207	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   690: iload 5
    //   692: istore 9
    //   694: aload 17
    //   696: iconst_0
    //   697: saload
    //   698: aload 16
    //   700: arraylength
    //   701: if_icmpge +98 -> 799
    //   704: iload 5
    //   706: istore 9
    //   708: aload 17
    //   710: iconst_0
    //   711: saload
    //   712: ifle +87 -> 799
    //   715: iload_3
    //   716: ifeq +56 -> 772
    //   719: iload 8
    //   721: ifeq +51 -> 772
    //   724: ldc -120
    //   726: ldc -47
    //   728: invokestatic 173	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   731: aload 16
    //   733: iconst_1
    //   734: aload 16
    //   736: arraylength
    //   737: invokestatic 215	java/util/Arrays:copyOfRange	([BII)[B
    //   740: astore 18
    //   742: aload_0
    //   743: getfield 217	com/tencent/mm/e/c/c:mFileOutputStream	Ljava/io/FileOutputStream;
    //   746: aload 18
    //   748: iconst_0
    //   749: aload 17
    //   751: iconst_0
    //   752: saload
    //   753: iconst_1
    //   754: isub
    //   755: invokevirtual 223	java/io/FileOutputStream:write	([BII)V
    //   758: iload 5
    //   760: aload 17
    //   762: iconst_0
    //   763: saload
    //   764: iconst_1
    //   765: isub
    //   766: iadd
    //   767: istore 5
    //   769: goto -626 -> 143
    //   772: aload_0
    //   773: getfield 217	com/tencent/mm/e/c/c:mFileOutputStream	Ljava/io/FileOutputStream;
    //   776: aload 16
    //   778: iconst_0
    //   779: aload 17
    //   781: iconst_0
    //   782: saload
    //   783: invokevirtual 223	java/io/FileOutputStream:write	([BII)V
    //   786: aload 17
    //   788: iconst_0
    //   789: saload
    //   790: istore 8
    //   792: iload 5
    //   794: iload 8
    //   796: iadd
    //   797: istore 9
    //   799: iload 9
    //   801: istore 5
    //   803: goto -660 -> 143
    //   806: astore_1
    //   807: ldc -120
    //   809: ldc -31
    //   811: iconst_1
    //   812: anewarray 4	java/lang/Object
    //   815: dup
    //   816: iconst_0
    //   817: aload_0
    //   818: getfield 227	com/tencent/mm/e/c/c:ezt	Ljava/lang/String;
    //   821: aastore
    //   822: invokestatic 189	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   825: ldc2_w 94
    //   828: ldc 96
    //   830: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   833: iconst_m1
    //   834: ireturn
    //   835: aload_0
    //   836: getfield 217	com/tencent/mm/e/c/c:mFileOutputStream	Ljava/io/FileOutputStream;
    //   839: invokevirtual 230	java/io/FileOutputStream:flush	()V
    //   842: aload_1
    //   843: getfield 159	com/tencent/mm/e/b/g$a:buf	[B
    //   846: iload 6
    //   848: aload_0
    //   849: getfield 72	com/tencent/mm/e/c/c:ezv	[B
    //   852: aload_0
    //   853: getfield 70	com/tencent/mm/e/c/c:ezu	I
    //   856: iload 7
    //   858: invokestatic 156	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   861: aload_0
    //   862: aload_0
    //   863: getfield 70	com/tencent/mm/e/c/c:ezu	I
    //   866: iload 7
    //   868: iadd
    //   869: putfield 70	com/tencent/mm/e/c/c:ezu	I
    //   872: aload 14
    //   874: invokevirtual 234	com/tencent/mm/compatible/util/g$a:tD	()J
    //   877: lstore 12
    //   879: iload_2
    //   880: iconst_1
    //   881: if_icmpne +42 -> 923
    //   884: getstatic 50	com/tencent/mm/e/c/c:ezB	Lcom/tencent/mm/e/c/a$a;
    //   887: astore_1
    //   888: aload_1
    //   889: aload_1
    //   890: getfield 238	com/tencent/mm/e/c/a$a:ezo	J
    //   893: aload_1
    //   894: getfield 241	com/tencent/mm/e/c/a$a:count	I
    //   897: i2l
    //   898: lmul
    //   899: lload 12
    //   901: ladd
    //   902: aload_1
    //   903: getfield 241	com/tencent/mm/e/c/a$a:count	I
    //   906: iconst_1
    //   907: iadd
    //   908: i2l
    //   909: ldiv
    //   910: putfield 238	com/tencent/mm/e/c/a$a:ezo	J
    //   913: aload_1
    //   914: aload_1
    //   915: getfield 241	com/tencent/mm/e/c/a$a:count	I
    //   918: iconst_1
    //   919: iadd
    //   920: putfield 241	com/tencent/mm/e/c/a$a:count	I
    //   923: ldc -120
    //   925: new 243	java/lang/StringBuilder
    //   928: dup
    //   929: ldc -11
    //   931: invokespecial 248	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   934: lload 12
    //   936: invokevirtual 252	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   939: ldc -2
    //   941: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   944: iload_2
    //   945: invokevirtual 260	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   948: ldc_w 262
    //   951: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   954: getstatic 50	com/tencent/mm/e/c/c:ezB	Lcom/tencent/mm/e/c/a$a;
    //   957: getfield 238	com/tencent/mm/e/c/a$a:ezo	J
    //   960: invokevirtual 252	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   963: ldc_w 264
    //   966: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   969: getstatic 50	com/tencent/mm/e/c/c:ezB	Lcom/tencent/mm/e/c/a$a;
    //   972: getfield 241	com/tencent/mm/e/c/a$a:count	I
    //   975: invokevirtual 260	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   978: invokevirtual 267	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   981: invokestatic 269	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   984: ldc2_w 94
    //   987: ldc 96
    //   989: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   992: iload 5
    //   994: ireturn
    //   995: astore_1
    //   996: ldc -120
    //   998: ldc_w 271
    //   1001: iconst_1
    //   1002: anewarray 4	java/lang/Object
    //   1005: dup
    //   1006: iconst_0
    //   1007: aload_0
    //   1008: getfield 227	com/tencent/mm/e/c/c:ezt	Ljava/lang/String;
    //   1011: aastore
    //   1012: invokestatic 189	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1015: ldc2_w 94
    //   1018: ldc 96
    //   1020: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1023: iconst_m1
    //   1024: ireturn
    //   1025: astore_1
    //   1026: ldc -120
    //   1028: ldc_w 273
    //   1031: iconst_4
    //   1032: anewarray 4	java/lang/Object
    //   1035: dup
    //   1036: iconst_0
    //   1037: iload 6
    //   1039: invokestatic 186	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1042: aastore
    //   1043: dup
    //   1044: iconst_1
    //   1045: aload_0
    //   1046: getfield 70	com/tencent/mm/e/c/c:ezu	I
    //   1049: invokestatic 186	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1052: aastore
    //   1053: dup
    //   1054: iconst_2
    //   1055: iload 7
    //   1057: invokestatic 186	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1060: aastore
    //   1061: dup
    //   1062: iconst_3
    //   1063: aload_1
    //   1064: invokevirtual 195	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1067: aastore
    //   1068: invokestatic 189	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1071: ldc2_w 94
    //   1074: ldc 96
    //   1076: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1079: iconst_m1
    //   1080: ireturn
    //   1081: iconst_1
    //   1082: istore 11
    //   1084: goto -970 -> 114
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1087	0	this	c
    //   0	1087	1	parama	g.a
    //   0	1087	2	paramInt	int
    //   0	1087	3	paramBoolean	boolean
    //   31	631	4	i	int
    //   62	7	5	j	int
    //   141	852	5	k	int
    //   45	529	6	m	int
    //   574	464	6	n	int
    //   42	173	7	i1	int
    //   215	841	7	i2	int
    //   290	507	8	i3	int
    //   286	514	9	i4	int
    //   280	193	10	i5	int
    //   112	971	11	bool	boolean
    //   877	58	12	l	long
    //   15	858	14	locala	com.tencent.mm.compatible.util.g.a
    //   51	511	15	arrayOfByte1	byte[]
    //   71	706	16	arrayOfByte2	byte[]
    //   91	696	17	localObject1	Object
    //   226	521	18	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   157	193	503	java/lang/Exception
    //   555	569	579	java/lang/Exception
    //   231	238	635	finally
    //   245	267	635	finally
    //   267	285	635	finally
    //   624	632	635	finally
    //   636	639	635	finally
    //   694	704	806	java/io/IOException
    //   724	758	806	java/io/IOException
    //   772	786	806	java/io/IOException
    //   835	842	995	java/io/IOException
    //   842	872	1025	java/lang/Exception
  }
  
  public final boolean bU(String paramString)
  {
    GMTrace.i(4467168641024L, 33283);
    w.i("MicroMsg.SilkWriter", "initWriter path: " + paramString);
    if (paramString == null)
    {
      w.e("MicroMsg.SilkWriter", "path is null");
      GMTrace.o(4467168641024L, 33283);
      return false;
    }
    this.ezt = paramString;
    for (;;)
    {
      try
      {
        this.mFileOutputStream = new FileOutputStream(this.ezt);
        i = l.sK();
        if ((i & 0x400) != 0)
        {
          this.ezz = 4;
          i = MediaRecorder.SilkEncInit(this.mSampleRate, this.ezw, this.ezz);
          if (i == 0) {
            break label208;
          }
          w.e("MicroMsg.SilkWriter", "initWriter SilkEncoderInit Error:%d", new Object[] { Integer.valueOf(i) });
          GMTrace.o(4467168641024L, 33283);
          return false;
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.SilkWriter", "initWriter FileOutputStream error:%s", new Object[] { paramString.getMessage() });
        GMTrace.o(4467168641024L, 33283);
        return false;
      }
      if ((i & 0x200) == 0) {
        break;
      }
      this.ezz = 2;
    }
    w.e("TAG", "initWriter cpuType error! silk don't support arm_v5!!!!");
    GMTrace.o(4467168641024L, 33283);
    return false;
    label208:
    this.ezv = new byte[this.mSampleRate * 20 * 2 / 1000];
    int i = -1;
    paramString = com.tencent.mm.y.c.c.Ct().er("100279");
    if (paramString.isValid()) {
      i = bg.getInt((String)paramString.bSg().get("isVoiceMsgOptOpen"), 0);
    }
    if (1 == i) {
      this.ezA = true;
    }
    if (i == 0) {
      this.ezA = false;
    }
    if (this.ezA)
    {
      MediaRecorder.SetVoiceSilkControl(200, 1);
      w.i("MicroMsg.SilkWriter", "Voice Message Compression Optimization is Open !");
    }
    for (;;)
    {
      GMTrace.o(4467168641024L, 33283);
      return true;
      MediaRecorder.SetVoiceSilkControl(200, 0);
      w.i("MicroMsg.SilkWriter", "Voice Message Compression Optimization is Close !");
    }
  }
  
  /* Error */
  public final void qI()
  {
    // Byte code:
    //   0: ldc2_w 346
    //   3: ldc_w 348
    //   6: invokestatic 43	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc -120
    //   11: ldc_w 350
    //   14: invokestatic 173	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: aload_0
    //   18: monitorenter
    //   19: aload_0
    //   20: iconst_1
    //   21: putfield 68	com/tencent/mm/e/c/c:ezs	Z
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_0
    //   27: getfield 80	com/tencent/mm/e/c/c:ezy	Lcom/tencent/mm/e/c/c$a;
    //   30: ifnull +10 -> 40
    //   33: aload_0
    //   34: getfield 80	com/tencent/mm/e/c/c:ezy	Lcom/tencent/mm/e/c/c$a;
    //   37: invokestatic 356	com/tencent/mm/sdk/f/e:N	(Ljava/lang/Runnable;)V
    //   40: aload_0
    //   41: getfield 78	com/tencent/mm/e/c/c:ezx	Ljava/lang/Object;
    //   44: astore_1
    //   45: aload_1
    //   46: monitorenter
    //   47: invokestatic 359	com/tencent/mm/modelvoice/MediaRecorder:SilkEncUnInit	()I
    //   50: pop
    //   51: aload_1
    //   52: monitorexit
    //   53: ldc -120
    //   55: new 243	java/lang/StringBuilder
    //   58: dup
    //   59: ldc_w 361
    //   62: invokespecial 248	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   65: aload_0
    //   66: getfield 227	com/tencent/mm/e/c/c:ezt	Ljava/lang/String;
    //   69: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: invokevirtual 267	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   75: invokestatic 173	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   78: aload_0
    //   79: getfield 217	com/tencent/mm/e/c/c:mFileOutputStream	Ljava/io/FileOutputStream;
    //   82: ifnull +15 -> 97
    //   85: aload_0
    //   86: getfield 217	com/tencent/mm/e/c/c:mFileOutputStream	Ljava/io/FileOutputStream;
    //   89: invokevirtual 364	java/io/FileOutputStream:close	()V
    //   92: aload_0
    //   93: aconst_null
    //   94: putfield 217	com/tencent/mm/e/c/c:mFileOutputStream	Ljava/io/FileOutputStream;
    //   97: ldc2_w 346
    //   100: ldc_w 348
    //   103: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   106: return
    //   107: astore_1
    //   108: aload_0
    //   109: monitorexit
    //   110: aload_1
    //   111: athrow
    //   112: astore_1
    //   113: ldc -120
    //   115: ldc_w 366
    //   118: iconst_1
    //   119: anewarray 4	java/lang/Object
    //   122: dup
    //   123: iconst_0
    //   124: aload_1
    //   125: invokestatic 370	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   128: aastore
    //   129: invokestatic 189	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: goto -92 -> 40
    //   135: astore_2
    //   136: aload_1
    //   137: monitorexit
    //   138: aload_2
    //   139: athrow
    //   140: astore_1
    //   141: ldc -120
    //   143: new 243	java/lang/StringBuilder
    //   146: dup
    //   147: ldc_w 372
    //   150: invokespecial 248	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   153: aload_0
    //   154: getfield 227	com/tencent/mm/e/c/c:ezt	Ljava/lang/String;
    //   157: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: ldc_w 374
    //   163: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: aload_1
    //   167: invokevirtual 195	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   170: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: invokevirtual 267	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: invokestatic 283	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   179: goto -87 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	c
    //   107	4	1	localObject2	Object
    //   112	25	1	localInterruptedException	InterruptedException
    //   140	27	1	localException	Exception
    //   135	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   19	26	107	finally
    //   108	110	107	finally
    //   33	40	112	java/lang/InterruptedException
    //   47	53	135	finally
    //   136	138	135	finally
    //   85	92	140	java/lang/Exception
  }
  
  public final boolean qJ()
  {
    GMTrace.i(14591614517248L, 108716);
    w.i("MicroMsg.SilkWriter", "resetWriter");
    synchronized (this.ezx)
    {
      MediaRecorder.SilkEncUnInit();
      int i = MediaRecorder.SilkEncInit(this.mSampleRate, this.ezw, this.ezz);
      if (i != 0)
      {
        w.e("MicroMsg.SilkWriter", "resetWriter SilkEncoderInit Error:%d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(14591614517248L, 108716);
        return false;
      }
    }
    GMTrace.o(14591614517248L, 108716);
    return true;
  }
  
  private final class a
    implements Runnable
  {
    public a()
    {
      GMTrace.i(4466631770112L, 33279);
      GMTrace.o(4466631770112L, 33279);
    }
    
    public final void run()
    {
      GMTrace.i(4466765987840L, 33280);
      w.i("MicroMsg.SilkWriter", "Silk Thread start run");
      int i;
      for (;;)
      {
        boolean bool;
        synchronized (c.this)
        {
          bool = c.this.ezs;
          w.d("MicroMsg.SilkWriter", "ThreadSilk in :" + bool + " cnt :" + c.this.ezr.size());
          if (bool) {
            if (c.this.ezr.isEmpty()) {
              break label284;
            }
          }
        }
        continue;
        i = c.this.ezr.size();
        if ((i > 10) || (bool))
        {
          w.w("MicroMsg.SilkWriter", "speed up silkcodec queue:" + i + " stop:" + bool);
          i = 0;
        }
      }
      for (;;)
      {
        int j = i;
        if (c.ezB.count >= 10)
        {
          j = i;
          if (c.ezB.ezo > 240L) {
            j = 0;
          }
        }
        c.this.a(localInterruptedException, j, false);
        break;
        if (i < 9)
        {
          i = 1;
          continue;
          label284:
          GMTrace.o(4466765987840L, 33280);
        }
        else
        {
          i = 1;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\e\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
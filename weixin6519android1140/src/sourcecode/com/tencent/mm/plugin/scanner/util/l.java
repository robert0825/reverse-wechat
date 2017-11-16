package com.tencent.mm.plugin.scanner.util;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.licence.model.LibCardRecog;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends b
{
  private final Object lock;
  private boolean[] oAH;
  private boolean oAI;
  private boolean oAK;
  private final int oBm;
  private Bitmap oBn;
  public Bitmap oBo;
  
  public l(b.a parama, int paramInt)
  {
    super(parama);
    GMTrace.i(6178981543936L, 46037);
    this.lock = new Object();
    this.oAI = false;
    this.oAK = false;
    this.oAH = new boolean[4];
    this.oBm = paramInt;
    GMTrace.o(6178981543936L, 46037);
  }
  
  private static void bdz()
  {
    GMTrace.i(6179518414848L, 46041);
    w.i("MicroMsg.ScanLicenceDecoder", "lib release");
    try
    {
      LibCardRecog.recognizeCardRelease();
      GMTrace.o(6179518414848L, 46041);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ScanLicenceDecoder", "lib release, exp = %s", new Object[] { localException });
      GMTrace.o(6179518414848L, 46041);
    }
  }
  
  /* Error */
  public final boolean a(byte[] paramArrayOfByte, android.graphics.Point paramPoint, android.graphics.Rect paramRect)
  {
    // Byte code:
    //   0: ldc2_w 79
    //   3: ldc 81
    //   5: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc 57
    //   10: ldc 83
    //   12: iconst_3
    //   13: anewarray 32	java/lang/Object
    //   16: dup
    //   17: iconst_0
    //   18: aload_2
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: aload_3
    //   23: aastore
    //   24: dup
    //   25: iconst_2
    //   26: aload_1
    //   27: arraylength
    //   28: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   31: aastore
    //   32: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   35: aload_0
    //   36: getfield 37	com/tencent/mm/plugin/scanner/util/l:lock	Ljava/lang/Object;
    //   39: astore 11
    //   41: aload 11
    //   43: monitorenter
    //   44: aload_0
    //   45: getfield 94	com/tencent/mm/plugin/scanner/util/l:oBn	Landroid/graphics/Bitmap;
    //   48: ifnull +27 -> 75
    //   51: aload_0
    //   52: getfield 94	com/tencent/mm/plugin/scanner/util/l:oBn	Landroid/graphics/Bitmap;
    //   55: invokevirtual 100	android/graphics/Bitmap:isRecycled	()Z
    //   58: ifne +17 -> 75
    //   61: ldc 57
    //   63: ldc 102
    //   65: invokestatic 104	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: aload_0
    //   69: getfield 94	com/tencent/mm/plugin/scanner/util/l:oBn	Landroid/graphics/Bitmap;
    //   72: invokevirtual 107	android/graphics/Bitmap:recycle	()V
    //   75: ldc 57
    //   77: ldc 109
    //   79: iconst_2
    //   80: anewarray 32	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload_2
    //   86: aastore
    //   87: dup
    //   88: iconst_1
    //   89: aload_3
    //   90: aastore
    //   91: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: aload_0
    //   95: getfield 39	com/tencent/mm/plugin/scanner/util/l:oAI	Z
    //   98: ifeq +23 -> 121
    //   101: ldc 57
    //   103: ldc 111
    //   105: invokestatic 104	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   108: aload 11
    //   110: monitorexit
    //   111: ldc2_w 79
    //   114: ldc 81
    //   116: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   119: iconst_0
    //   120: ireturn
    //   121: iconst_0
    //   122: istore 5
    //   124: iload 5
    //   126: iconst_4
    //   127: if_icmpge +20 -> 147
    //   130: aload_0
    //   131: getfield 43	com/tencent/mm/plugin/scanner/util/l:oAH	[Z
    //   134: iload 5
    //   136: iconst_0
    //   137: bastore
    //   138: iload 5
    //   140: iconst_1
    //   141: iadd
    //   142: istore 5
    //   144: goto -20 -> 124
    //   147: aload_2
    //   148: getfield 116	android/graphics/Point:x	I
    //   151: i2f
    //   152: aload_3
    //   153: invokevirtual 121	android/graphics/Rect:width	()I
    //   156: i2f
    //   157: fdiv
    //   158: aload_2
    //   159: getfield 124	android/graphics/Point:y	I
    //   162: i2f
    //   163: aload_3
    //   164: invokevirtual 127	android/graphics/Rect:height	()I
    //   167: i2f
    //   168: fdiv
    //   169: invokestatic 133	java/lang/Math:min	(FF)F
    //   172: fconst_1
    //   173: invokestatic 133	java/lang/Math:min	(FF)F
    //   176: fstore 4
    //   178: aload_3
    //   179: invokevirtual 121	android/graphics/Rect:width	()I
    //   182: istore 5
    //   184: aload_3
    //   185: invokevirtual 127	android/graphics/Rect:height	()I
    //   188: istore 6
    //   190: ldc 57
    //   192: ldc -121
    //   194: iconst_3
    //   195: anewarray 32	java/lang/Object
    //   198: dup
    //   199: iconst_0
    //   200: fload 4
    //   202: invokestatic 140	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   205: aastore
    //   206: dup
    //   207: iconst_1
    //   208: iload 5
    //   210: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   213: aastore
    //   214: dup
    //   215: iconst_2
    //   216: iload 6
    //   218: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   221: aastore
    //   222: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   225: aload_0
    //   226: getfield 41	com/tencent/mm/plugin/scanner/util/l:oAK	Z
    //   229: ifne +67 -> 296
    //   232: ldc 57
    //   234: ldc -114
    //   236: iconst_4
    //   237: anewarray 32	java/lang/Object
    //   240: dup
    //   241: iconst_0
    //   242: iload 5
    //   244: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   247: aastore
    //   248: dup
    //   249: iconst_1
    //   250: iload 6
    //   252: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   255: aastore
    //   256: dup
    //   257: iconst_2
    //   258: aload_3
    //   259: invokevirtual 121	android/graphics/Rect:width	()I
    //   262: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   265: aastore
    //   266: dup
    //   267: iconst_3
    //   268: aload_3
    //   269: invokevirtual 127	android/graphics/Rect:height	()I
    //   272: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   275: aastore
    //   276: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   279: iload 5
    //   281: iload 6
    //   283: aload_0
    //   284: getfield 45	com/tencent/mm/plugin/scanner/util/l:oBm	I
    //   287: invokestatic 146	com/tencent/mm/plugin/licence/model/LibCardRecog:recognizeCardInit	(III)I
    //   290: pop
    //   291: aload_0
    //   292: iconst_1
    //   293: putfield 41	com/tencent/mm/plugin/scanner/util/l:oAK	Z
    //   296: invokestatic 152	java/lang/System:currentTimeMillis	()J
    //   299: lstore 9
    //   301: new 154	com/tencent/mm/plugin/licence/model/CardInfo
    //   304: dup
    //   305: iload 5
    //   307: iload 6
    //   309: invokespecial 157	com/tencent/mm/plugin/licence/model/CardInfo:<init>	(II)V
    //   312: astore 12
    //   314: aload_3
    //   315: getfield 160	android/graphics/Rect:top	I
    //   318: istore 7
    //   320: aload_3
    //   321: getfield 163	android/graphics/Rect:left	I
    //   324: istore 8
    //   326: aload_1
    //   327: aload_2
    //   328: getfield 124	android/graphics/Point:y	I
    //   331: aload_2
    //   332: getfield 116	android/graphics/Point:x	I
    //   335: iload 8
    //   337: iload 7
    //   339: iload 6
    //   341: iload 5
    //   343: aload 12
    //   345: aload_0
    //   346: getfield 43	com/tencent/mm/plugin/scanner/util/l:oAH	[Z
    //   349: invokestatic 167	com/tencent/mm/plugin/licence/model/LibCardRecog:recognizeCardProcess	([BIIIIIILcom/tencent/mm/plugin/licence/model/CardInfo;[Z)I
    //   352: istore 5
    //   354: ldc 57
    //   356: ldc -87
    //   358: iconst_1
    //   359: anewarray 32	java/lang/Object
    //   362: dup
    //   363: iconst_0
    //   364: iload 5
    //   366: invokestatic 89	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   369: aastore
    //   370: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   373: ldc 57
    //   375: new 171	java/lang/StringBuilder
    //   378: dup
    //   379: ldc -83
    //   381: invokespecial 176	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   384: invokestatic 152	java/lang/System:currentTimeMillis	()J
    //   387: lload 9
    //   389: lsub
    //   390: invokevirtual 180	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   393: invokevirtual 184	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   396: invokestatic 104	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   399: ldc 57
    //   401: ldc -70
    //   403: iconst_1
    //   404: anewarray 32	java/lang/Object
    //   407: dup
    //   408: iconst_0
    //   409: aload_0
    //   410: getfield 43	com/tencent/mm/plugin/scanner/util/l:oAH	[Z
    //   413: invokestatic 191	java/util/Arrays:toString	([Z)Ljava/lang/String;
    //   416: aastore
    //   417: invokestatic 92	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   420: iload 5
    //   422: ifne +87 -> 509
    //   425: aload 11
    //   427: monitorexit
    //   428: ldc2_w 79
    //   431: ldc 81
    //   433: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   436: iconst_0
    //   437: ireturn
    //   438: astore_1
    //   439: ldc 57
    //   441: ldc -63
    //   443: iconst_1
    //   444: anewarray 32	java/lang/Object
    //   447: dup
    //   448: iconst_0
    //   449: aload_1
    //   450: aastore
    //   451: invokestatic 76	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   454: aload_0
    //   455: iconst_0
    //   456: putfield 41	com/tencent/mm/plugin/scanner/util/l:oAK	Z
    //   459: invokestatic 195	com/tencent/mm/plugin/scanner/util/l:bdz	()V
    //   462: aload 11
    //   464: monitorexit
    //   465: ldc2_w 79
    //   468: ldc 81
    //   470: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   473: iconst_0
    //   474: ireturn
    //   475: astore_1
    //   476: ldc 57
    //   478: ldc -59
    //   480: iconst_1
    //   481: anewarray 32	java/lang/Object
    //   484: dup
    //   485: iconst_0
    //   486: aload_1
    //   487: aastore
    //   488: invokestatic 76	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   491: aload_0
    //   492: iconst_0
    //   493: putfield 39	com/tencent/mm/plugin/scanner/util/l:oAI	Z
    //   496: aload 11
    //   498: monitorexit
    //   499: ldc2_w 79
    //   502: ldc 81
    //   504: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   507: iconst_0
    //   508: ireturn
    //   509: iconst_1
    //   510: iload 5
    //   512: if_icmpeq +49 -> 561
    //   515: iconst_0
    //   516: istore 5
    //   518: iload 5
    //   520: iconst_4
    //   521: if_icmpge +20 -> 541
    //   524: aload_0
    //   525: getfield 43	com/tencent/mm/plugin/scanner/util/l:oAH	[Z
    //   528: iload 5
    //   530: iconst_0
    //   531: bastore
    //   532: iload 5
    //   534: iconst_1
    //   535: iadd
    //   536: istore 5
    //   538: goto -20 -> 518
    //   541: ldc 57
    //   543: ldc -57
    //   545: invokestatic 104	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   548: aload 11
    //   550: monitorexit
    //   551: ldc2_w 79
    //   554: ldc 81
    //   556: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   559: iconst_0
    //   560: ireturn
    //   561: iconst_0
    //   562: istore 5
    //   564: iload 5
    //   566: iconst_4
    //   567: if_icmpge +20 -> 587
    //   570: aload_0
    //   571: getfield 43	com/tencent/mm/plugin/scanner/util/l:oAH	[Z
    //   574: iload 5
    //   576: iconst_1
    //   577: bastore
    //   578: iload 5
    //   580: iconst_1
    //   581: iadd
    //   582: istore 5
    //   584: goto -20 -> 564
    //   587: aload_0
    //   588: aload 12
    //   590: getfield 203	com/tencent/mm/plugin/licence/model/CardInfo:bitmapData	[B
    //   593: iconst_0
    //   594: aload 12
    //   596: getfield 206	com/tencent/mm/plugin/licence/model/CardInfo:bitmapLen	I
    //   599: invokestatic 212	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   602: putfield 94	com/tencent/mm/plugin/scanner/util/l:oBn	Landroid/graphics/Bitmap;
    //   605: aload_0
    //   606: aload_0
    //   607: getfield 94	com/tencent/mm/plugin/scanner/util/l:oBn	Landroid/graphics/Bitmap;
    //   610: getstatic 218	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   613: iconst_1
    //   614: invokevirtual 222	android/graphics/Bitmap:copy	(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
    //   617: putfield 224	com/tencent/mm/plugin/scanner/util/l:oBo	Landroid/graphics/Bitmap;
    //   620: aload_0
    //   621: iconst_1
    //   622: putfield 39	com/tencent/mm/plugin/scanner/util/l:oAI	Z
    //   625: aload 11
    //   627: monitorexit
    //   628: ldc2_w 79
    //   631: ldc 81
    //   633: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   636: iconst_1
    //   637: ireturn
    //   638: astore_1
    //   639: aload 11
    //   641: monitorexit
    //   642: aload_1
    //   643: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	644	0	this	l
    //   0	644	1	paramArrayOfByte	byte[]
    //   0	644	2	paramPoint	android.graphics.Point
    //   0	644	3	paramRect	android.graphics.Rect
    //   176	25	4	f	float
    //   122	461	5	i	int
    //   188	152	6	j	int
    //   318	20	7	k	int
    //   324	12	8	m	int
    //   299	89	9	l	long
    //   39	601	11	localObject	Object
    //   312	283	12	localCardInfo	com.tencent.mm.plugin.licence.model.CardInfo
    // Exception table:
    //   from	to	target	type
    //   279	296	438	java/lang/Exception
    //   326	354	475	java/lang/Exception
    //   44	75	638	finally
    //   75	111	638	finally
    //   130	138	638	finally
    //   147	279	638	finally
    //   279	296	638	finally
    //   296	326	638	finally
    //   326	354	638	finally
    //   354	420	638	finally
    //   425	428	638	finally
    //   439	465	638	finally
    //   476	499	638	finally
    //   524	532	638	finally
    //   541	551	638	finally
    //   570	578	638	finally
    //   587	628	638	finally
    //   639	642	638	finally
  }
  
  public final void bdl()
  {
    GMTrace.i(6179384197120L, 46040);
    this.oAI = false;
    GMTrace.o(6179384197120L, 46040);
  }
  
  public final boolean[] bdy()
  {
    GMTrace.i(19594982981632L, 145994);
    synchronized (this.lock)
    {
      boolean[] arrayOfBoolean = this.oAH;
      GMTrace.o(19594982981632L, 145994);
      return arrayOfBoolean;
    }
  }
  
  public final void releaseDecoder()
  {
    GMTrace.i(6179249979392L, 46039);
    if ((this.oBn != null) && (!this.oBn.isRecycled())) {
      this.oBn.recycle();
    }
    bdz();
    GMTrace.o(6179249979392L, 46039);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
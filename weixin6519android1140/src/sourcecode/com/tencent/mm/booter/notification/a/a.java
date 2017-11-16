package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.sdk.platformtools.d;

public final class a
{
  public Bitmap fLe;
  
  public a()
  {
    GMTrace.i(528817848320L, 3940);
    GMTrace.o(528817848320L, 3940);
  }
  
  public static Bitmap b(Context paramContext, Bitmap paramBitmap)
  {
    GMTrace.i(528952066048L, 3941);
    if ((paramContext == null) || (paramBitmap == null))
    {
      GMTrace.o(528952066048L, 3941);
      return null;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      int i = paramContext.getResources().getDimensionPixelSize(17104902) - paramContext.getResources().getDimensionPixelSize(R.f.aSA);
      paramContext = d.a(d.a(paramBitmap, i, i, false, false), false, paramContext.getResources().getDimensionPixelSize(R.f.aSz));
      GMTrace.o(528952066048L, 3941);
      return paramContext;
    }
    GMTrace.o(528952066048L, 3941);
    return paramBitmap;
  }
  
  /* Error */
  public static Bitmap u(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 69
    //   3: sipush 3942
    //   6: invokestatic 18	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokestatic 76	com/tencent/mm/platformtools/t:nm	(Ljava/lang/String;)Z
    //   13: ifeq +14 -> 27
    //   16: ldc2_w 69
    //   19: sipush 3942
    //   22: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   25: aconst_null
    //   26: areturn
    //   27: new 78	java/lang/StringBuilder
    //   30: dup
    //   31: invokespecial 79	java/lang/StringBuilder:<init>	()V
    //   34: aload_1
    //   35: ldc 81
    //   37: aload_0
    //   38: invokevirtual 87	java/lang/String:getBytes	()[B
    //   41: invokestatic 93	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   44: ldc 95
    //   46: iconst_1
    //   47: invokestatic 100	com/tencent/mm/sdk/platformtools/h:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   50: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: ldc 106
    //   55: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: astore 10
    //   63: iconst_1
    //   64: istore_3
    //   65: aconst_null
    //   66: astore 7
    //   68: aconst_null
    //   69: astore_1
    //   70: aconst_null
    //   71: astore 9
    //   73: aconst_null
    //   74: astore 8
    //   76: aconst_null
    //   77: astore 6
    //   79: new 112	java/io/File
    //   82: dup
    //   83: aload 10
    //   85: invokespecial 115	java/io/File:<init>	(Ljava/lang/String;)V
    //   88: astore_0
    //   89: aload_0
    //   90: invokevirtual 119	java/io/File:exists	()Z
    //   93: ifne +30 -> 123
    //   96: ldc 121
    //   98: ldc 123
    //   100: iconst_1
    //   101: anewarray 4	java/lang/Object
    //   104: dup
    //   105: iconst_0
    //   106: aload 10
    //   108: aastore
    //   109: invokestatic 129	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   112: ldc2_w 69
    //   115: sipush 3942
    //   118: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   121: aconst_null
    //   122: areturn
    //   123: aload_0
    //   124: invokevirtual 133	java/io/File:length	()J
    //   127: l2i
    //   128: istore_2
    //   129: iload_2
    //   130: ifle +15 -> 145
    //   133: iload_2
    //   134: ldc -122
    //   136: if_icmpeq +43 -> 179
    //   139: iload_2
    //   140: ldc -121
    //   142: if_icmpeq +37 -> 179
    //   145: ldc 121
    //   147: ldc -119
    //   149: iconst_2
    //   150: anewarray 4	java/lang/Object
    //   153: dup
    //   154: iconst_0
    //   155: iload_2
    //   156: invokestatic 143	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   159: aastore
    //   160: dup
    //   161: iconst_1
    //   162: aload 10
    //   164: aastore
    //   165: invokestatic 146	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   168: ldc2_w 69
    //   171: sipush 3942
    //   174: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   177: aconst_null
    //   178: areturn
    //   179: new 148	java/io/FileInputStream
    //   182: dup
    //   183: aload 10
    //   185: invokespecial 149	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   188: astore_0
    //   189: aload 9
    //   191: astore_1
    //   192: aload 8
    //   194: astore 7
    //   196: aload_0
    //   197: invokevirtual 153	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   200: astore 6
    //   202: aload 6
    //   204: astore_1
    //   205: aload 6
    //   207: astore 7
    //   209: ldc -122
    //   211: invokestatic 159	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   214: astore 8
    //   216: aload 6
    //   218: astore_1
    //   219: aload 6
    //   221: astore 7
    //   223: aload 6
    //   225: aload 8
    //   227: invokevirtual 165	java/nio/channels/FileChannel:read	(Ljava/nio/ByteBuffer;)I
    //   230: pop
    //   231: aload 6
    //   233: astore_1
    //   234: aload 6
    //   236: astore 7
    //   238: aload 8
    //   240: iconst_0
    //   241: invokevirtual 169	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   244: pop
    //   245: iload_2
    //   246: ldc -121
    //   248: if_icmpne +128 -> 376
    //   251: aload 6
    //   253: astore_1
    //   254: aload 6
    //   256: astore 7
    //   258: bipush 16
    //   260: invokestatic 159	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   263: astore 9
    //   265: aload 6
    //   267: astore_1
    //   268: aload 6
    //   270: astore 7
    //   272: aload 6
    //   274: aload 9
    //   276: invokevirtual 165	java/nio/channels/FileChannel:read	(Ljava/nio/ByteBuffer;)I
    //   279: pop
    //   280: aload 6
    //   282: astore_1
    //   283: aload 6
    //   285: astore 7
    //   287: aload 9
    //   289: iconst_0
    //   290: invokevirtual 173	java/nio/ByteBuffer:getLong	(I)J
    //   293: lstore 4
    //   295: lload 4
    //   297: lconst_1
    //   298: lcmp
    //   299: ifeq +75 -> 374
    //   302: aload 6
    //   304: astore_1
    //   305: aload 6
    //   307: astore 7
    //   309: ldc 121
    //   311: ldc -81
    //   313: iconst_3
    //   314: anewarray 4	java/lang/Object
    //   317: dup
    //   318: iconst_0
    //   319: lload 4
    //   321: invokestatic 180	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   324: aastore
    //   325: dup
    //   326: iconst_1
    //   327: iload_2
    //   328: invokestatic 143	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   331: aastore
    //   332: dup
    //   333: iconst_2
    //   334: aload 10
    //   336: aastore
    //   337: invokestatic 146	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   340: aload 6
    //   342: astore_1
    //   343: aload 6
    //   345: astore 7
    //   347: aload 6
    //   349: invokevirtual 183	java/nio/channels/FileChannel:close	()V
    //   352: aload 6
    //   354: astore_1
    //   355: aload 6
    //   357: astore 7
    //   359: aload_0
    //   360: invokevirtual 184	java/io/FileInputStream:close	()V
    //   363: ldc2_w 69
    //   366: sipush 3942
    //   369: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   372: aconst_null
    //   373: areturn
    //   374: iconst_0
    //   375: istore_3
    //   376: aload 6
    //   378: astore_1
    //   379: aload 6
    //   381: astore 7
    //   383: ldc 121
    //   385: ldc -70
    //   387: iconst_3
    //   388: anewarray 4	java/lang/Object
    //   391: dup
    //   392: iconst_0
    //   393: iload_2
    //   394: invokestatic 143	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   397: aastore
    //   398: dup
    //   399: iconst_1
    //   400: iload_3
    //   401: invokestatic 191	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   404: aastore
    //   405: dup
    //   406: iconst_2
    //   407: aload 10
    //   409: aastore
    //   410: invokestatic 194	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   413: aload 6
    //   415: astore_1
    //   416: aload 6
    //   418: astore 7
    //   420: aload 6
    //   422: invokevirtual 183	java/nio/channels/FileChannel:close	()V
    //   425: aload_0
    //   426: astore 6
    //   428: aload_0
    //   429: invokevirtual 184	java/io/FileInputStream:close	()V
    //   432: aconst_null
    //   433: astore_0
    //   434: aload_0
    //   435: astore 6
    //   437: bipush 96
    //   439: bipush 96
    //   441: getstatic 200	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   444: invokestatic 206	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   447: astore_1
    //   448: aload_0
    //   449: astore 6
    //   451: aload_1
    //   452: aload 8
    //   454: invokevirtual 210	android/graphics/Bitmap:copyPixelsFromBuffer	(Ljava/nio/Buffer;)V
    //   457: iload_3
    //   458: ifeq +60 -> 518
    //   461: aload_0
    //   462: astore 6
    //   464: aload_1
    //   465: bipush 9
    //   467: bipush 9
    //   469: bipush 78
    //   471: bipush 78
    //   473: invokestatic 213	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   476: astore 7
    //   478: aload_0
    //   479: astore 6
    //   481: ldc 121
    //   483: ldc -41
    //   485: iconst_1
    //   486: anewarray 4	java/lang/Object
    //   489: dup
    //   490: iconst_0
    //   491: aload_1
    //   492: invokevirtual 216	java/lang/Object:toString	()Ljava/lang/String;
    //   495: aastore
    //   496: invokestatic 218	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   499: aload_0
    //   500: astore 6
    //   502: aload_1
    //   503: invokevirtual 221	android/graphics/Bitmap:recycle	()V
    //   506: ldc2_w 69
    //   509: sipush 3942
    //   512: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   515: aload 7
    //   517: areturn
    //   518: ldc2_w 69
    //   521: sipush 3942
    //   524: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   527: aload_1
    //   528: areturn
    //   529: astore 8
    //   531: aload 7
    //   533: astore_1
    //   534: aload 6
    //   536: astore_0
    //   537: aload 8
    //   539: astore 6
    //   541: ldc 121
    //   543: ldc -33
    //   545: iconst_2
    //   546: anewarray 4	java/lang/Object
    //   549: dup
    //   550: iconst_0
    //   551: aload 6
    //   553: invokevirtual 226	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   556: aastore
    //   557: dup
    //   558: iconst_1
    //   559: aload 10
    //   561: aastore
    //   562: invokestatic 146	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   565: aload_0
    //   566: ifnull +7 -> 573
    //   569: aload_0
    //   570: invokevirtual 183	java/nio/channels/FileChannel:close	()V
    //   573: aload_1
    //   574: ifnull +7 -> 581
    //   577: aload_1
    //   578: invokevirtual 184	java/io/FileInputStream:close	()V
    //   581: ldc2_w 69
    //   584: sipush 3942
    //   587: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   590: aconst_null
    //   591: areturn
    //   592: astore 7
    //   594: aconst_null
    //   595: astore_0
    //   596: ldc 121
    //   598: ldc -28
    //   600: iconst_2
    //   601: anewarray 4	java/lang/Object
    //   604: dup
    //   605: iconst_0
    //   606: aload 7
    //   608: invokevirtual 229	java/lang/OutOfMemoryError:getMessage	()Ljava/lang/String;
    //   611: aastore
    //   612: dup
    //   613: iconst_1
    //   614: aload 10
    //   616: aastore
    //   617: invokestatic 146	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   620: aload_0
    //   621: astore 6
    //   623: aload_1
    //   624: astore_0
    //   625: aload 6
    //   627: astore_1
    //   628: goto -63 -> 565
    //   631: astore_0
    //   632: goto -51 -> 581
    //   635: astore 7
    //   637: goto -41 -> 596
    //   640: astore 7
    //   642: aconst_null
    //   643: astore_1
    //   644: aload 6
    //   646: astore_0
    //   647: goto -51 -> 596
    //   650: astore 6
    //   652: aload_0
    //   653: astore_1
    //   654: aload 7
    //   656: astore_0
    //   657: goto -116 -> 541
    //   660: astore 6
    //   662: aconst_null
    //   663: astore 7
    //   665: aload_0
    //   666: astore_1
    //   667: aload 7
    //   669: astore_0
    //   670: goto -129 -> 541
    //   673: astore 6
    //   675: aconst_null
    //   676: astore_0
    //   677: aconst_null
    //   678: astore_1
    //   679: goto -138 -> 541
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	682	0	paramString1	String
    //   0	682	1	paramString2	String
    //   128	266	2	i	int
    //   64	394	3	bool	boolean
    //   293	27	4	l	long
    //   77	568	6	localObject1	Object
    //   650	1	6	localException1	Exception
    //   660	1	6	localException2	Exception
    //   673	1	6	localException3	Exception
    //   66	466	7	localObject2	Object
    //   592	15	7	localOutOfMemoryError1	OutOfMemoryError
    //   635	1	7	localOutOfMemoryError2	OutOfMemoryError
    //   640	15	7	localOutOfMemoryError3	OutOfMemoryError
    //   663	5	7	localObject3	Object
    //   74	379	8	localByteBuffer1	java.nio.ByteBuffer
    //   529	9	8	localException4	Exception
    //   71	217	9	localByteBuffer2	java.nio.ByteBuffer
    //   61	554	10	str	String
    // Exception table:
    //   from	to	target	type
    //   79	112	529	java/lang/Exception
    //   123	129	529	java/lang/Exception
    //   145	168	529	java/lang/Exception
    //   179	189	529	java/lang/Exception
    //   79	112	592	java/lang/OutOfMemoryError
    //   123	129	592	java/lang/OutOfMemoryError
    //   145	168	592	java/lang/OutOfMemoryError
    //   179	189	592	java/lang/OutOfMemoryError
    //   569	573	631	java/lang/Exception
    //   577	581	631	java/lang/Exception
    //   196	202	635	java/lang/OutOfMemoryError
    //   209	216	635	java/lang/OutOfMemoryError
    //   223	231	635	java/lang/OutOfMemoryError
    //   238	245	635	java/lang/OutOfMemoryError
    //   258	265	635	java/lang/OutOfMemoryError
    //   272	280	635	java/lang/OutOfMemoryError
    //   287	295	635	java/lang/OutOfMemoryError
    //   309	340	635	java/lang/OutOfMemoryError
    //   347	352	635	java/lang/OutOfMemoryError
    //   359	363	635	java/lang/OutOfMemoryError
    //   383	413	635	java/lang/OutOfMemoryError
    //   420	425	635	java/lang/OutOfMemoryError
    //   428	432	640	java/lang/OutOfMemoryError
    //   437	448	640	java/lang/OutOfMemoryError
    //   451	457	640	java/lang/OutOfMemoryError
    //   464	478	640	java/lang/OutOfMemoryError
    //   481	499	640	java/lang/OutOfMemoryError
    //   502	506	640	java/lang/OutOfMemoryError
    //   196	202	650	java/lang/Exception
    //   209	216	650	java/lang/Exception
    //   223	231	650	java/lang/Exception
    //   238	245	650	java/lang/Exception
    //   258	265	650	java/lang/Exception
    //   272	280	650	java/lang/Exception
    //   287	295	650	java/lang/Exception
    //   309	340	650	java/lang/Exception
    //   347	352	650	java/lang/Exception
    //   359	363	650	java/lang/Exception
    //   383	413	650	java/lang/Exception
    //   420	425	650	java/lang/Exception
    //   428	432	660	java/lang/Exception
    //   437	448	673	java/lang/Exception
    //   451	457	673	java/lang/Exception
    //   464	478	673	java/lang/Exception
    //   481	499	673	java/lang/Exception
    //   502	506	673	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
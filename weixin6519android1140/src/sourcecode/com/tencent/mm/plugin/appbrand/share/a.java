package com.tencent.mm.plugin.appbrand.share;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b.e;

public final class a
  implements b.e
{
  private int mHeight;
  private int mWidth;
  
  public a(int paramInt1, int paramInt2)
  {
    GMTrace.i(18347831853056L, 136702);
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    GMTrace.o(18347831853056L, 136702);
  }
  
  /* Error */
  public final android.graphics.Bitmap e(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: ldc2_w 36
    //   3: ldc 38
    //   5: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: astore_2
    //   10: aload_1
    //   11: astore 4
    //   13: aload_1
    //   14: astore_3
    //   15: aload_1
    //   16: invokevirtual 44	java/io/InputStream:markSupported	()Z
    //   19: ifne +32 -> 51
    //   22: aload_1
    //   23: astore 4
    //   25: aload_1
    //   26: astore_3
    //   27: aload_1
    //   28: instanceof 46
    //   31: ifeq +173 -> 204
    //   34: aload_1
    //   35: astore 4
    //   37: aload_1
    //   38: astore_3
    //   39: new 48	com/tencent/mm/sdk/platformtools/i
    //   42: dup
    //   43: aload_1
    //   44: checkcast 46	java/io/FileInputStream
    //   47: invokespecial 51	com/tencent/mm/sdk/platformtools/i:<init>	(Ljava/io/FileInputStream;)V
    //   50: astore_2
    //   51: aload_2
    //   52: astore 4
    //   54: aload_2
    //   55: astore_3
    //   56: new 53	android/graphics/BitmapFactory$Options
    //   59: dup
    //   60: invokespecial 54	android/graphics/BitmapFactory$Options:<init>	()V
    //   63: astore_1
    //   64: aload_2
    //   65: astore 4
    //   67: aload_2
    //   68: astore_3
    //   69: aload_1
    //   70: iconst_1
    //   71: putfield 58	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   74: aload_2
    //   75: astore 4
    //   77: aload_2
    //   78: astore_3
    //   79: aload_2
    //   80: ldc 59
    //   82: invokevirtual 63	java/io/InputStream:mark	(I)V
    //   85: aload_2
    //   86: astore 4
    //   88: aload_2
    //   89: astore_3
    //   90: aload_2
    //   91: aconst_null
    //   92: aload_1
    //   93: invokestatic 69	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   96: astore 5
    //   98: aload_2
    //   99: astore 4
    //   101: aload_2
    //   102: astore_3
    //   103: aload_2
    //   104: invokevirtual 72	java/io/InputStream:reset	()V
    //   107: aload 5
    //   109: ifnull +13 -> 122
    //   112: aload_2
    //   113: astore 4
    //   115: aload_2
    //   116: astore_3
    //   117: aload 5
    //   119: invokevirtual 77	android/graphics/Bitmap:recycle	()V
    //   122: aload_2
    //   123: astore 4
    //   125: aload_2
    //   126: astore_3
    //   127: aload_1
    //   128: getfield 80	android/graphics/BitmapFactory$Options:outHeight	I
    //   131: ifle +15 -> 146
    //   134: aload_2
    //   135: astore 4
    //   137: aload_2
    //   138: astore_3
    //   139: aload_1
    //   140: getfield 83	android/graphics/BitmapFactory$Options:outWidth	I
    //   143: ifgt +92 -> 235
    //   146: aload_2
    //   147: astore 4
    //   149: aload_2
    //   150: astore_3
    //   151: ldc 85
    //   153: ldc 87
    //   155: iconst_3
    //   156: anewarray 4	java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: aload_2
    //   162: aastore
    //   163: dup
    //   164: iconst_1
    //   165: aload_1
    //   166: getfield 80	android/graphics/BitmapFactory$Options:outHeight	I
    //   169: invokestatic 93	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   172: aastore
    //   173: dup
    //   174: iconst_2
    //   175: aload_1
    //   176: getfield 83	android/graphics/BitmapFactory$Options:outWidth	I
    //   179: invokestatic 93	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   182: aastore
    //   183: invokestatic 98	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: aload_2
    //   187: ifnull +7 -> 194
    //   190: aload_2
    //   191: invokevirtual 101	java/io/InputStream:close	()V
    //   194: ldc2_w 36
    //   197: ldc 38
    //   199: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   202: aconst_null
    //   203: areturn
    //   204: aload_1
    //   205: astore_2
    //   206: aload_1
    //   207: astore 4
    //   209: aload_1
    //   210: astore_3
    //   211: aload_1
    //   212: invokevirtual 44	java/io/InputStream:markSupported	()Z
    //   215: ifne -164 -> 51
    //   218: aload_1
    //   219: astore 4
    //   221: aload_1
    //   222: astore_3
    //   223: new 103	java/io/BufferedInputStream
    //   226: dup
    //   227: aload_1
    //   228: invokespecial 106	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   231: astore_2
    //   232: goto -181 -> 51
    //   235: aload_2
    //   236: astore 4
    //   238: aload_2
    //   239: astore_3
    //   240: aload_1
    //   241: aload_1
    //   242: getfield 83	android/graphics/BitmapFactory$Options:outWidth	I
    //   245: i2d
    //   246: dconst_1
    //   247: dmul
    //   248: aload_0
    //   249: getfield 25	com/tencent/mm/plugin/appbrand/share/a:mWidth	I
    //   252: i2d
    //   253: ddiv
    //   254: d2i
    //   255: putfield 109	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   258: aload_2
    //   259: astore 4
    //   261: aload_2
    //   262: astore_3
    //   263: aload_1
    //   264: getfield 109	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   267: iconst_1
    //   268: if_icmpgt +13 -> 281
    //   271: aload_2
    //   272: astore 4
    //   274: aload_2
    //   275: astore_3
    //   276: aload_1
    //   277: iconst_1
    //   278: putfield 109	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   281: aload_2
    //   282: astore 4
    //   284: aload_2
    //   285: astore_3
    //   286: aload_1
    //   287: getfield 80	android/graphics/BitmapFactory$Options:outHeight	I
    //   290: aload_1
    //   291: getfield 83	android/graphics/BitmapFactory$Options:outWidth	I
    //   294: imul
    //   295: aload_1
    //   296: getfield 109	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   299: idiv
    //   300: aload_1
    //   301: getfield 109	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   304: idiv
    //   305: ldc 110
    //   307: if_icmple +60 -> 367
    //   310: aload_2
    //   311: astore 4
    //   313: aload_2
    //   314: astore_3
    //   315: aload_1
    //   316: aload_1
    //   317: getfield 109	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   320: iconst_1
    //   321: iadd
    //   322: putfield 109	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   325: goto -44 -> 281
    //   328: astore_1
    //   329: aload 4
    //   331: astore_3
    //   332: ldc 85
    //   334: ldc 112
    //   336: iconst_1
    //   337: anewarray 4	java/lang/Object
    //   340: dup
    //   341: iconst_0
    //   342: aload_1
    //   343: aastore
    //   344: invokestatic 98	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   347: aload 4
    //   349: ifnull +8 -> 357
    //   352: aload 4
    //   354: invokevirtual 101	java/io/InputStream:close	()V
    //   357: ldc2_w 36
    //   360: ldc 38
    //   362: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   365: aconst_null
    //   366: areturn
    //   367: aload_2
    //   368: astore 4
    //   370: aload_2
    //   371: astore_3
    //   372: aload_1
    //   373: iconst_0
    //   374: putfield 58	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   377: aload_2
    //   378: astore 4
    //   380: aload_2
    //   381: astore_3
    //   382: aload_1
    //   383: iconst_1
    //   384: putfield 115	android/graphics/BitmapFactory$Options:inMutable	Z
    //   387: aload_2
    //   388: astore 4
    //   390: aload_2
    //   391: astore_3
    //   392: aload_2
    //   393: iconst_0
    //   394: invokestatic 121	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
    //   397: new 123	android/graphics/Rect
    //   400: dup
    //   401: iconst_0
    //   402: iconst_0
    //   403: aload_1
    //   404: getfield 83	android/graphics/BitmapFactory$Options:outWidth	I
    //   407: aload_1
    //   408: getfield 83	android/graphics/BitmapFactory$Options:outWidth	I
    //   411: i2f
    //   412: fconst_1
    //   413: fmul
    //   414: aload_0
    //   415: getfield 27	com/tencent/mm/plugin/appbrand/share/a:mHeight	I
    //   418: i2f
    //   419: fmul
    //   420: aload_0
    //   421: getfield 25	com/tencent/mm/plugin/appbrand/share/a:mWidth	I
    //   424: i2f
    //   425: fdiv
    //   426: f2i
    //   427: invokespecial 126	android/graphics/Rect:<init>	(IIII)V
    //   430: aload_1
    //   431: invokevirtual 130	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   434: astore_1
    //   435: aload_2
    //   436: ifnull +7 -> 443
    //   439: aload_2
    //   440: invokevirtual 101	java/io/InputStream:close	()V
    //   443: ldc2_w 36
    //   446: ldc 38
    //   448: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   451: aload_1
    //   452: areturn
    //   453: astore_1
    //   454: aload_3
    //   455: ifnull +7 -> 462
    //   458: aload_3
    //   459: invokevirtual 101	java/io/InputStream:close	()V
    //   462: aload_1
    //   463: athrow
    //   464: astore_1
    //   465: goto -271 -> 194
    //   468: astore_2
    //   469: goto -26 -> 443
    //   472: astore_1
    //   473: goto -116 -> 357
    //   476: astore_2
    //   477: goto -15 -> 462
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	480	0	this	a
    //   0	480	1	paramInputStream	java.io.InputStream
    //   9	431	2	localObject1	Object
    //   468	1	2	localIOException1	java.io.IOException
    //   476	1	2	localIOException2	java.io.IOException
    //   14	445	3	localObject2	Object
    //   11	378	4	localObject3	Object
    //   96	22	5	localBitmap	android.graphics.Bitmap
    // Exception table:
    //   from	to	target	type
    //   15	22	328	java/io/IOException
    //   27	34	328	java/io/IOException
    //   39	51	328	java/io/IOException
    //   56	64	328	java/io/IOException
    //   69	74	328	java/io/IOException
    //   79	85	328	java/io/IOException
    //   90	98	328	java/io/IOException
    //   103	107	328	java/io/IOException
    //   117	122	328	java/io/IOException
    //   127	134	328	java/io/IOException
    //   139	146	328	java/io/IOException
    //   151	186	328	java/io/IOException
    //   211	218	328	java/io/IOException
    //   223	232	328	java/io/IOException
    //   240	258	328	java/io/IOException
    //   263	271	328	java/io/IOException
    //   276	281	328	java/io/IOException
    //   286	310	328	java/io/IOException
    //   315	325	328	java/io/IOException
    //   372	377	328	java/io/IOException
    //   382	387	328	java/io/IOException
    //   392	435	328	java/io/IOException
    //   15	22	453	finally
    //   27	34	453	finally
    //   39	51	453	finally
    //   56	64	453	finally
    //   69	74	453	finally
    //   79	85	453	finally
    //   90	98	453	finally
    //   103	107	453	finally
    //   117	122	453	finally
    //   127	134	453	finally
    //   139	146	453	finally
    //   151	186	453	finally
    //   211	218	453	finally
    //   223	232	453	finally
    //   240	258	453	finally
    //   263	271	453	finally
    //   276	281	453	finally
    //   286	310	453	finally
    //   315	325	453	finally
    //   332	347	453	finally
    //   372	377	453	finally
    //   382	387	453	finally
    //   392	435	453	finally
    //   190	194	464	java/io/IOException
    //   439	443	468	java/io/IOException
    //   352	357	472	java/io/IOException
    //   458	462	476	java/io/IOException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\share\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
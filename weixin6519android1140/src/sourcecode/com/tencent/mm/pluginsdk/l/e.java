package com.tencent.mm.pluginsdk.l;

import com.tencent.gmtrace.GMTrace;

public final class e
{
  /* Error */
  public static void a(android.graphics.Bitmap paramBitmap, android.graphics.Bitmap.CompressFormat paramCompressFormat, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 13
    //   3: sipush 6608
    //   6: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_2
    //   10: ifnull +10 -> 20
    //   13: aload_2
    //   14: invokevirtual 26	java/lang/String:length	()I
    //   17: ifgt +19 -> 36
    //   20: iconst_1
    //   21: istore_3
    //   22: iload_3
    //   23: ifeq +18 -> 41
    //   26: new 10	java/io/IOException
    //   29: dup
    //   30: ldc 28
    //   32: invokespecial 32	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   35: athrow
    //   36: iconst_0
    //   37: istore_3
    //   38: goto -16 -> 22
    //   41: new 34	java/io/File
    //   44: dup
    //   45: aload_2
    //   46: invokespecial 35	java/io/File:<init>	(Ljava/lang/String;)V
    //   49: astore_2
    //   50: aload_2
    //   51: invokevirtual 39	java/io/File:createNewFile	()Z
    //   54: pop
    //   55: new 41	java/io/FileOutputStream
    //   58: dup
    //   59: aload_2
    //   60: invokespecial 44	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   63: astore 4
    //   65: aload 4
    //   67: astore_2
    //   68: aload_0
    //   69: aload_1
    //   70: bipush 60
    //   72: aload 4
    //   74: invokevirtual 50	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   77: pop
    //   78: aload 4
    //   80: astore_2
    //   81: aload 4
    //   83: invokevirtual 54	java/io/FileOutputStream:flush	()V
    //   86: aload 4
    //   88: invokevirtual 57	java/io/FileOutputStream:close	()V
    //   91: ldc 59
    //   93: ldc 61
    //   95: iconst_1
    //   96: anewarray 4	java/lang/Object
    //   99: dup
    //   100: iconst_0
    //   101: aload_0
    //   102: invokevirtual 65	java/lang/Object:toString	()Ljava/lang/String;
    //   105: aastore
    //   106: invokestatic 70	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: aload_0
    //   110: invokevirtual 73	android/graphics/Bitmap:recycle	()V
    //   113: ldc2_w 13
    //   116: sipush 6608
    //   119: invokestatic 76	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   122: return
    //   123: astore_1
    //   124: ldc 59
    //   126: aload_1
    //   127: ldc 78
    //   129: iconst_0
    //   130: anewarray 4	java/lang/Object
    //   133: invokestatic 82	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: goto -45 -> 91
    //   139: astore_1
    //   140: aconst_null
    //   141: astore 4
    //   143: aload 4
    //   145: astore_2
    //   146: ldc 59
    //   148: aload_1
    //   149: ldc 78
    //   151: iconst_0
    //   152: anewarray 4	java/lang/Object
    //   155: invokestatic 82	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: aload 4
    //   160: ifnull +8 -> 168
    //   163: aload 4
    //   165: invokevirtual 57	java/io/FileOutputStream:close	()V
    //   168: ldc 59
    //   170: ldc 61
    //   172: iconst_1
    //   173: anewarray 4	java/lang/Object
    //   176: dup
    //   177: iconst_0
    //   178: aload_0
    //   179: invokevirtual 65	java/lang/Object:toString	()Ljava/lang/String;
    //   182: aastore
    //   183: invokestatic 70	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: aload_0
    //   187: invokevirtual 73	android/graphics/Bitmap:recycle	()V
    //   190: ldc2_w 13
    //   193: sipush 6608
    //   196: invokestatic 76	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   199: return
    //   200: astore_1
    //   201: ldc 59
    //   203: aload_1
    //   204: ldc 78
    //   206: iconst_0
    //   207: anewarray 4	java/lang/Object
    //   210: invokestatic 82	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   213: goto -45 -> 168
    //   216: astore_1
    //   217: aconst_null
    //   218: astore 4
    //   220: aload 4
    //   222: astore_2
    //   223: ldc 59
    //   225: aload_1
    //   226: ldc 78
    //   228: iconst_0
    //   229: anewarray 4	java/lang/Object
    //   232: invokestatic 82	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   235: aload 4
    //   237: ifnull +8 -> 245
    //   240: aload 4
    //   242: invokevirtual 57	java/io/FileOutputStream:close	()V
    //   245: ldc 59
    //   247: ldc 61
    //   249: iconst_1
    //   250: anewarray 4	java/lang/Object
    //   253: dup
    //   254: iconst_0
    //   255: aload_0
    //   256: invokevirtual 65	java/lang/Object:toString	()Ljava/lang/String;
    //   259: aastore
    //   260: invokestatic 70	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   263: aload_0
    //   264: invokevirtual 73	android/graphics/Bitmap:recycle	()V
    //   267: ldc2_w 13
    //   270: sipush 6608
    //   273: invokestatic 76	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   276: return
    //   277: astore_1
    //   278: ldc 59
    //   280: aload_1
    //   281: ldc 78
    //   283: iconst_0
    //   284: anewarray 4	java/lang/Object
    //   287: invokestatic 82	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   290: goto -45 -> 245
    //   293: astore_1
    //   294: aconst_null
    //   295: astore 4
    //   297: aload 4
    //   299: astore_2
    //   300: ldc 59
    //   302: aload_1
    //   303: ldc 78
    //   305: iconst_0
    //   306: anewarray 4	java/lang/Object
    //   309: invokestatic 82	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   312: aload 4
    //   314: ifnull +8 -> 322
    //   317: aload 4
    //   319: invokevirtual 57	java/io/FileOutputStream:close	()V
    //   322: ldc 59
    //   324: ldc 61
    //   326: iconst_1
    //   327: anewarray 4	java/lang/Object
    //   330: dup
    //   331: iconst_0
    //   332: aload_0
    //   333: invokevirtual 65	java/lang/Object:toString	()Ljava/lang/String;
    //   336: aastore
    //   337: invokestatic 70	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   340: aload_0
    //   341: invokevirtual 73	android/graphics/Bitmap:recycle	()V
    //   344: ldc2_w 13
    //   347: sipush 6608
    //   350: invokestatic 76	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   353: return
    //   354: astore_1
    //   355: ldc 59
    //   357: aload_1
    //   358: ldc 78
    //   360: iconst_0
    //   361: anewarray 4	java/lang/Object
    //   364: invokestatic 82	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   367: goto -45 -> 322
    //   370: astore_1
    //   371: aconst_null
    //   372: astore_2
    //   373: aload_2
    //   374: ifnull +7 -> 381
    //   377: aload_2
    //   378: invokevirtual 57	java/io/FileOutputStream:close	()V
    //   381: ldc 59
    //   383: ldc 61
    //   385: iconst_1
    //   386: anewarray 4	java/lang/Object
    //   389: dup
    //   390: iconst_0
    //   391: aload_0
    //   392: invokevirtual 65	java/lang/Object:toString	()Ljava/lang/String;
    //   395: aastore
    //   396: invokestatic 70	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   399: aload_0
    //   400: invokevirtual 73	android/graphics/Bitmap:recycle	()V
    //   403: aload_1
    //   404: athrow
    //   405: astore_2
    //   406: ldc 59
    //   408: aload_2
    //   409: ldc 78
    //   411: iconst_0
    //   412: anewarray 4	java/lang/Object
    //   415: invokestatic 82	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   418: goto -37 -> 381
    //   421: astore_1
    //   422: goto -49 -> 373
    //   425: astore_1
    //   426: goto -129 -> 297
    //   429: astore_1
    //   430: goto -210 -> 220
    //   433: astore_1
    //   434: goto -291 -> 143
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	437	0	paramBitmap	android.graphics.Bitmap
    //   0	437	1	paramCompressFormat	android.graphics.Bitmap.CompressFormat
    //   0	437	2	paramString	String
    //   21	17	3	i	int
    //   63	255	4	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   86	91	123	java/io/IOException
    //   55	65	139	java/io/FileNotFoundException
    //   163	168	200	java/io/IOException
    //   55	65	216	java/io/IOException
    //   240	245	277	java/io/IOException
    //   55	65	293	java/lang/Exception
    //   317	322	354	java/io/IOException
    //   55	65	370	finally
    //   377	381	405	java/io/IOException
    //   68	78	421	finally
    //   81	86	421	finally
    //   146	158	421	finally
    //   223	235	421	finally
    //   300	312	421	finally
    //   68	78	425	java/lang/Exception
    //   81	86	425	java/lang/Exception
    //   68	78	429	java/io/IOException
    //   81	86	429	java/io/IOException
    //   68	78	433	java/io/FileNotFoundException
    //   81	86	433	java/io/FileNotFoundException
  }
  
  public static String hB(int paramInt)
  {
    GMTrace.i(886776528896L, 6607);
    String str = String.format("%d:%02d", new Object[] { Long.valueOf(paramInt / 60L), Long.valueOf(paramInt % 60L) });
    GMTrace.o(886776528896L, 6607);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\pluginsdk\l\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
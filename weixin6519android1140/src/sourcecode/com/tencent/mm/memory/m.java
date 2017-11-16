package com.tencent.mm.memory;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends l
{
  private static int ghR;
  
  static
  {
    GMTrace.i(1284866310144L, 9573);
    ghR = -1;
    GMTrace.o(1284866310144L, 9573);
  }
  
  public m()
  {
    GMTrace.i(1284061003776L, 9567);
    GMTrace.o(1284061003776L, 9567);
  }
  
  /* Error */
  private static Bitmap a(java.io.InputStream paramInputStream, android.graphics.Rect paramRect, android.graphics.BitmapFactory.Options paramOptions, com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: ldc2_w 32
    //   3: sipush 9570
    //   6: invokestatic 16	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: getstatic 39	com/tencent/mm/memory/h:ghM	Lcom/tencent/mm/memory/h;
    //   12: invokevirtual 43	com/tencent/mm/memory/h:bE	()Ljava/lang/Object;
    //   15: checkcast 45	java/nio/ByteBuffer
    //   18: astore 4
    //   20: aload_2
    //   21: astore 5
    //   23: aload_2
    //   24: ifnonnull +12 -> 36
    //   27: new 47	android/graphics/BitmapFactory$Options
    //   30: dup
    //   31: invokespecial 48	android/graphics/BitmapFactory$Options:<init>	()V
    //   34: astore 5
    //   36: aload 4
    //   38: ifnull +13 -> 51
    //   41: aload 5
    //   43: aload 4
    //   45: invokevirtual 52	java/nio/ByteBuffer:array	()[B
    //   48: putfield 56	android/graphics/BitmapFactory$Options:inTempStorage	[B
    //   51: aload 5
    //   53: iconst_1
    //   54: putfield 60	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   57: aload_0
    //   58: aconst_null
    //   59: aload 5
    //   61: iconst_0
    //   62: invokestatic 66	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;
    //   65: pop
    //   66: aload 5
    //   68: getfield 69	android/graphics/BitmapFactory$Options:outWidth	I
    //   71: iconst_m1
    //   72: if_icmpeq +12 -> 84
    //   75: aload 5
    //   77: getfield 72	android/graphics/BitmapFactory$Options:outHeight	I
    //   80: iconst_m1
    //   81: if_icmpne +58 -> 139
    //   84: new 74	java/lang/IllegalArgumentException
    //   87: dup
    //   88: ldc 76
    //   90: invokespecial 79	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   93: athrow
    //   94: astore_1
    //   95: aload 4
    //   97: astore_0
    //   98: ldc 81
    //   100: ldc 83
    //   102: iconst_1
    //   103: anewarray 85	java/lang/Object
    //   106: dup
    //   107: iconst_0
    //   108: aload_1
    //   109: invokevirtual 89	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   112: aastore
    //   113: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: aload_0
    //   117: ifnull +11 -> 128
    //   120: getstatic 39	com/tencent/mm/memory/h:ghM	Lcom/tencent/mm/memory/h;
    //   123: aload_0
    //   124: invokevirtual 98	com/tencent/mm/memory/h:i	(Ljava/lang/Object;)Z
    //   127: pop
    //   128: ldc2_w 32
    //   131: sipush 9570
    //   134: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   137: aconst_null
    //   138: areturn
    //   139: ldc 81
    //   141: ldc 100
    //   143: iconst_1
    //   144: anewarray 85	java/lang/Object
    //   147: dup
    //   148: iconst_0
    //   149: aload 5
    //   151: getfield 104	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   154: aastore
    //   155: invokestatic 106	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: aload 5
    //   160: iconst_1
    //   161: putfield 109	android/graphics/BitmapFactory$Options:inDither	Z
    //   164: aload 5
    //   166: iconst_1
    //   167: putfield 112	android/graphics/BitmapFactory$Options:inMutable	Z
    //   170: aload 5
    //   172: iconst_1
    //   173: putfield 115	android/graphics/BitmapFactory$Options:inPurgeable	Z
    //   176: aload 5
    //   178: iconst_1
    //   179: putfield 118	android/graphics/BitmapFactory$Options:inInputShareable	Z
    //   182: aload 5
    //   184: iconst_0
    //   185: putfield 60	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   188: aload 5
    //   190: invokestatic 124	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/BitmapFactory$Options;)V
    //   193: aload_0
    //   194: invokestatic 128	com/tencent/mm/memory/m:d	(Ljava/io/InputStream;)V
    //   197: aload_0
    //   198: aload_1
    //   199: aload 5
    //   201: aload_3
    //   202: invokestatic 130	com/tencent/mm/memory/m:b	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   205: astore_0
    //   206: aload 4
    //   208: ifnull +12 -> 220
    //   211: getstatic 39	com/tencent/mm/memory/h:ghM	Lcom/tencent/mm/memory/h;
    //   214: aload 4
    //   216: invokevirtual 98	com/tencent/mm/memory/h:i	(Ljava/lang/Object;)Z
    //   219: pop
    //   220: ldc2_w 32
    //   223: sipush 9570
    //   226: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   229: aload_0
    //   230: areturn
    //   231: astore_1
    //   232: aconst_null
    //   233: astore_0
    //   234: aload_0
    //   235: ifnull +11 -> 246
    //   238: getstatic 39	com/tencent/mm/memory/h:ghM	Lcom/tencent/mm/memory/h;
    //   241: aload_0
    //   242: invokevirtual 98	com/tencent/mm/memory/h:i	(Ljava/lang/Object;)Z
    //   245: pop
    //   246: aload_1
    //   247: athrow
    //   248: astore_1
    //   249: aload 4
    //   251: astore_0
    //   252: goto -18 -> 234
    //   255: astore_1
    //   256: goto -22 -> 234
    //   259: astore_1
    //   260: aconst_null
    //   261: astore_0
    //   262: goto -164 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	265	0	paramInputStream	java.io.InputStream
    //   0	265	1	paramRect	android.graphics.Rect
    //   0	265	2	paramOptions	android.graphics.BitmapFactory.Options
    //   0	265	3	paramDecodeResultLogger	com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger
    //   18	232	4	localByteBuffer	java.nio.ByteBuffer
    //   21	179	5	localOptions	android.graphics.BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   27	36	94	java/lang/Exception
    //   41	51	94	java/lang/Exception
    //   51	84	94	java/lang/Exception
    //   84	94	94	java/lang/Exception
    //   139	206	94	java/lang/Exception
    //   9	20	231	finally
    //   27	36	248	finally
    //   41	51	248	finally
    //   51	84	248	finally
    //   84	94	248	finally
    //   139	206	248	finally
    //   98	116	255	finally
    //   9	20	259	java/lang/Exception
  }
  
  /* Error */
  private static Bitmap b(java.io.InputStream paramInputStream, android.graphics.Rect paramRect, android.graphics.BitmapFactory.Options paramOptions, com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: ldc2_w 131
    //   3: sipush 9571
    //   6: invokestatic 16	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: iconst_m1
    //   10: istore 4
    //   12: aconst_null
    //   13: astore 9
    //   15: aconst_null
    //   16: astore 8
    //   18: aload_0
    //   19: ifnull +175 -> 194
    //   22: iload 4
    //   24: istore 6
    //   26: aload 9
    //   28: astore 7
    //   30: aload_0
    //   31: invokevirtual 138	java/io/InputStream:available	()I
    //   34: istore 5
    //   36: iload 5
    //   38: istore 6
    //   40: aload 9
    //   42: astore 7
    //   44: iload 5
    //   46: istore 4
    //   48: getstatic 144	com/tencent/mm/memory/g:ghL	Lcom/tencent/mm/memory/g;
    //   51: iload 5
    //   53: invokestatic 150	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   56: invokevirtual 153	com/tencent/mm/memory/g:a	(Ljava/lang/Integer;)Ljava/lang/Object;
    //   59: checkcast 154	[B
    //   62: astore 9
    //   64: aload 9
    //   66: astore 7
    //   68: aload 9
    //   70: ifnonnull +13 -> 83
    //   73: aload 9
    //   75: astore 8
    //   77: iload 5
    //   79: newarray <illegal type>
    //   81: astore 7
    //   83: aload 7
    //   85: astore 8
    //   87: aload 7
    //   89: astore 9
    //   91: aload_0
    //   92: aload 7
    //   94: invokevirtual 158	java/io/InputStream:read	([B)I
    //   97: pop
    //   98: aload_1
    //   99: ifnonnull +72 -> 171
    //   102: aload 7
    //   104: astore 8
    //   106: aload 7
    //   108: astore 9
    //   110: aload 7
    //   112: iconst_0
    //   113: iload 5
    //   115: aload_2
    //   116: aload_3
    //   117: iconst_0
    //   118: iconst_0
    //   119: newarray <illegal type>
    //   121: invokestatic 162	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   124: astore_1
    //   125: aload 7
    //   127: astore 8
    //   129: aload 7
    //   131: astore 9
    //   133: aload_1
    //   134: invokestatic 166	com/tencent/mm/sdk/platformtools/MMBitmapFactory:pinBitmap	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   137: astore_1
    //   138: aload_0
    //   139: invokestatic 170	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   142: iload 5
    //   144: ifle +16 -> 160
    //   147: aload 7
    //   149: ifnull +11 -> 160
    //   152: getstatic 144	com/tencent/mm/memory/g:ghL	Lcom/tencent/mm/memory/g;
    //   155: aload 7
    //   157: invokevirtual 174	com/tencent/mm/memory/g:x	([B)V
    //   160: ldc2_w 131
    //   163: sipush 9571
    //   166: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   169: aload_1
    //   170: areturn
    //   171: aload 7
    //   173: astore 8
    //   175: aload 7
    //   177: astore 9
    //   179: aload 7
    //   181: iconst_0
    //   182: iload 5
    //   184: aload_1
    //   185: aload_2
    //   186: aload_3
    //   187: invokestatic 178	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeRegion	([BIILandroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   190: astore_1
    //   191: goto -66 -> 125
    //   194: aload_0
    //   195: invokestatic 170	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   198: ldc2_w 131
    //   201: sipush 9571
    //   204: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   207: aconst_null
    //   208: areturn
    //   209: astore_2
    //   210: iload 6
    //   212: istore 5
    //   214: aload 8
    //   216: astore_1
    //   217: aload_1
    //   218: astore 7
    //   220: iload 5
    //   222: istore 4
    //   224: ldc 81
    //   226: ldc -76
    //   228: iconst_1
    //   229: anewarray 85	java/lang/Object
    //   232: dup
    //   233: iconst_0
    //   234: aload_2
    //   235: invokevirtual 89	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   238: aastore
    //   239: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   242: aload_0
    //   243: invokestatic 170	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   246: iload 5
    //   248: ifle -50 -> 198
    //   251: aload_1
    //   252: ifnull -54 -> 198
    //   255: getstatic 144	com/tencent/mm/memory/g:ghL	Lcom/tencent/mm/memory/g;
    //   258: aload_1
    //   259: invokevirtual 174	com/tencent/mm/memory/g:x	([B)V
    //   262: goto -64 -> 198
    //   265: astore_1
    //   266: aload_0
    //   267: invokestatic 170	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   270: iload 4
    //   272: ifle +16 -> 288
    //   275: aload 7
    //   277: ifnull +11 -> 288
    //   280: getstatic 144	com/tencent/mm/memory/g:ghL	Lcom/tencent/mm/memory/g;
    //   283: aload 7
    //   285: invokevirtual 174	com/tencent/mm/memory/g:x	([B)V
    //   288: aload_1
    //   289: athrow
    //   290: astore_1
    //   291: aload 8
    //   293: astore 7
    //   295: iload 5
    //   297: istore 4
    //   299: goto -33 -> 266
    //   302: astore_2
    //   303: aload 9
    //   305: astore_1
    //   306: goto -89 -> 217
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	paramInputStream	java.io.InputStream
    //   0	309	1	paramRect	android.graphics.Rect
    //   0	309	2	paramOptions	android.graphics.BitmapFactory.Options
    //   0	309	3	paramDecodeResultLogger	com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger
    //   10	288	4	i	int
    //   34	262	5	j	int
    //   24	187	6	k	int
    //   28	266	7	localObject1	Object
    //   16	276	8	localObject2	Object
    //   13	291	9	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   30	36	209	java/lang/Exception
    //   48	64	209	java/lang/Exception
    //   30	36	265	finally
    //   48	64	265	finally
    //   224	242	265	finally
    //   77	83	290	finally
    //   91	98	290	finally
    //   110	125	290	finally
    //   133	138	290	finally
    //   179	191	290	finally
    //   77	83	302	java/lang/Exception
    //   91	98	302	java/lang/Exception
    //   110	125	302	java/lang/Exception
    //   133	138	302	java/lang/Exception
    //   179	191	302	java/lang/Exception
  }
  
  /* Error */
  public final Bitmap a(String paramString, android.graphics.BitmapFactory.Options paramOptions, com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: ldc2_w 182
    //   3: sipush 9568
    //   6: invokestatic 16	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokestatic 189	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   13: astore 4
    //   15: aload 4
    //   17: astore_1
    //   18: aload 4
    //   20: aconst_null
    //   21: aload_2
    //   22: aload_3
    //   23: invokestatic 191	com/tencent/mm/memory/m:a	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   26: astore_2
    //   27: aload 4
    //   29: invokestatic 170	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   32: ldc2_w 182
    //   35: sipush 9568
    //   38: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   41: aload_2
    //   42: areturn
    //   43: astore_2
    //   44: aconst_null
    //   45: astore 4
    //   47: aload 4
    //   49: astore_1
    //   50: ldc 81
    //   52: ldc -63
    //   54: iconst_1
    //   55: anewarray 85	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload_2
    //   61: invokevirtual 89	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   64: aastore
    //   65: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   68: aload 4
    //   70: invokestatic 170	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   73: ldc2_w 182
    //   76: sipush 9568
    //   79: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   82: aconst_null
    //   83: areturn
    //   84: astore_1
    //   85: aconst_null
    //   86: astore_3
    //   87: aload_1
    //   88: astore_2
    //   89: aload_3
    //   90: invokestatic 170	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   93: aload_2
    //   94: athrow
    //   95: astore_2
    //   96: aload_1
    //   97: astore_3
    //   98: goto -9 -> 89
    //   101: astore_2
    //   102: goto -55 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	m
    //   0	105	1	paramString	String
    //   0	105	2	paramOptions	android.graphics.BitmapFactory.Options
    //   0	105	3	paramDecodeResultLogger	com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger
    //   13	56	4	localInputStream	java.io.InputStream
    // Exception table:
    //   from	to	target	type
    //   9	15	43	java/lang/Exception
    //   9	15	84	finally
    //   18	27	95	finally
    //   50	68	95	finally
    //   18	27	101	java/lang/Exception
  }
  
  /* Error */
  public final Bitmap a(String paramString, android.graphics.Rect paramRect, android.graphics.BitmapFactory.Options paramOptions, com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: ldc2_w 195
    //   3: sipush 9569
    //   6: invokestatic 16	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokestatic 189	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   13: astore 5
    //   15: aload 5
    //   17: astore_1
    //   18: aload 5
    //   20: aload_2
    //   21: aload_3
    //   22: aload 4
    //   24: invokestatic 191	com/tencent/mm/memory/m:a	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   27: astore_2
    //   28: aload 5
    //   30: invokestatic 170	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   33: ldc2_w 195
    //   36: sipush 9569
    //   39: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   42: aload_2
    //   43: areturn
    //   44: astore_2
    //   45: aconst_null
    //   46: astore 5
    //   48: aload 5
    //   50: astore_1
    //   51: ldc 81
    //   53: ldc -63
    //   55: iconst_1
    //   56: anewarray 85	java/lang/Object
    //   59: dup
    //   60: iconst_0
    //   61: aload_2
    //   62: invokevirtual 89	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   65: aastore
    //   66: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: aload 5
    //   71: invokestatic 170	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   74: ldc2_w 195
    //   77: sipush 9569
    //   80: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   83: aconst_null
    //   84: areturn
    //   85: astore_1
    //   86: aconst_null
    //   87: astore_3
    //   88: aload_1
    //   89: astore_2
    //   90: aload_3
    //   91: invokestatic 170	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   94: aload_2
    //   95: athrow
    //   96: astore_2
    //   97: aload_1
    //   98: astore_3
    //   99: goto -9 -> 90
    //   102: astore_2
    //   103: goto -55 -> 48
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	m
    //   0	106	1	paramString	String
    //   0	106	2	paramRect	android.graphics.Rect
    //   0	106	3	paramOptions	android.graphics.BitmapFactory.Options
    //   0	106	4	paramDecodeResultLogger	com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger
    //   13	57	5	localInputStream	java.io.InputStream
    // Exception table:
    //   from	to	target	type
    //   9	15	44	java/lang/Exception
    //   9	15	85	finally
    //   18	28	96	finally
    //   51	69	96	finally
    //   18	28	102	java/lang/Exception
  }
  
  public final void h(Bitmap paramBitmap)
  {
    GMTrace.i(1284732092416L, 9572);
    if (paramBitmap != null) {}
    try
    {
      if (!paramBitmap.isRecycled())
      {
        w.i("MicroMsg.PurgeableBitmapFactory", "bitmap recycle %s", new Object[] { paramBitmap.toString() });
        paramBitmap.recycle();
      }
      GMTrace.o(1284732092416L, 9572);
      return;
    }
    catch (Exception paramBitmap)
    {
      w.e("MicroMsg.PurgeableBitmapFactory", "recycle error: %s", new Object[] { paramBitmap.getMessage() });
      GMTrace.o(1284732092416L, 9572);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\memory\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
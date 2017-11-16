package com.tencent.mm.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.w;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class j
  extends l
{
  public j()
  {
    GMTrace.i(1285805834240L, 9580);
    GMTrace.o(1285805834240L, 9580);
  }
  
  /* Error */
  private Bitmap a(InputStream paramInputStream, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: ldc2_w 25
    //   3: sipush 9581
    //   6: invokestatic 16	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: getstatic 32	com/tencent/mm/memory/h:ghM	Lcom/tencent/mm/memory/h;
    //   12: invokevirtual 36	com/tencent/mm/memory/h:bE	()Ljava/lang/Object;
    //   15: checkcast 38	java/nio/ByteBuffer
    //   18: astore 4
    //   20: aload_1
    //   21: aconst_null
    //   22: aload_1
    //   23: aload_2
    //   24: aload 4
    //   26: iconst_0
    //   27: aconst_null
    //   28: invokestatic 41	com/tencent/mm/memory/j:a	(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Ljava/nio/ByteBuffer;ZLandroid/graphics/Rect;)Landroid/graphics/BitmapFactory$Options;
    //   31: aload_3
    //   32: invokestatic 44	com/tencent/mm/memory/j:a	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   35: astore_1
    //   36: aload 4
    //   38: ifnull +101 -> 139
    //   41: getstatic 32	com/tencent/mm/memory/h:ghM	Lcom/tencent/mm/memory/h;
    //   44: aload 4
    //   46: invokevirtual 47	com/tencent/mm/memory/h:i	(Ljava/lang/Object;)Z
    //   49: pop
    //   50: ldc2_w 25
    //   53: sipush 9581
    //   56: invokestatic 19	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   59: aload_1
    //   60: areturn
    //   61: astore_2
    //   62: aconst_null
    //   63: astore_1
    //   64: ldc 49
    //   66: ldc 51
    //   68: iconst_1
    //   69: anewarray 53	java/lang/Object
    //   72: dup
    //   73: iconst_0
    //   74: aload_2
    //   75: invokevirtual 57	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   78: aastore
    //   79: invokestatic 63	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   82: aload_1
    //   83: ifnull +51 -> 134
    //   86: getstatic 32	com/tencent/mm/memory/h:ghM	Lcom/tencent/mm/memory/h;
    //   89: aload_1
    //   90: invokevirtual 47	com/tencent/mm/memory/h:i	(Ljava/lang/Object;)Z
    //   93: pop
    //   94: aconst_null
    //   95: astore_1
    //   96: goto -46 -> 50
    //   99: astore_2
    //   100: aconst_null
    //   101: astore_1
    //   102: aload_1
    //   103: ifnull +11 -> 114
    //   106: getstatic 32	com/tencent/mm/memory/h:ghM	Lcom/tencent/mm/memory/h;
    //   109: aload_1
    //   110: invokevirtual 47	com/tencent/mm/memory/h:i	(Ljava/lang/Object;)Z
    //   113: pop
    //   114: aload_2
    //   115: athrow
    //   116: astore_2
    //   117: aload 4
    //   119: astore_1
    //   120: goto -18 -> 102
    //   123: astore_2
    //   124: goto -22 -> 102
    //   127: astore_2
    //   128: aload 4
    //   130: astore_1
    //   131: goto -67 -> 64
    //   134: aconst_null
    //   135: astore_1
    //   136: goto -86 -> 50
    //   139: goto -89 -> 50
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	j
    //   0	142	1	paramInputStream	InputStream
    //   0	142	2	paramOptions	BitmapFactory.Options
    //   0	142	3	paramDecodeResultLogger	MMBitmapFactory.DecodeResultLogger
    //   18	111	4	localByteBuffer	ByteBuffer
    // Exception table:
    //   from	to	target	type
    //   9	20	61	java/lang/Exception
    //   9	20	99	finally
    //   20	36	116	finally
    //   64	82	123	finally
    //   20	36	127	java/lang/Exception
  }
  
  private static Bitmap a(InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    localObject = null;
    GMTrace.i(1286476922880L, 9585);
    for (;;)
    {
      try
      {
        d(paramInputStream);
        paramInputStream.mark(25165824);
        if (paramRect != null) {}
      }
      catch (Exception paramRect)
      {
        Bitmap localBitmap;
        String str;
        int k;
        int m;
        int n;
        paramInputStream = null;
        w.e("MicroMsg.InBitmapFactory", "decodeInternal error: %s", new Object[] { paramRect.getMessage() });
        paramOptions = paramInputStream;
        continue;
        i = 0;
        continue;
        j = 0;
        continue;
        paramInputStream = MMBitmapFactory.decodeRegion(paramInputStream, paramRect, paramOptions, paramDecodeResultLogger);
        continue;
        paramInputStream = (InputStream)localObject;
        continue;
      }
      try
      {
        localBitmap = MMBitmapFactory.decodeStream(paramInputStream, null, paramOptions, paramDecodeResultLogger, 0, new int[0]);
        localObject = localBitmap;
        if (localObject != null) {
          continue;
        }
      }
      catch (Exception localException)
      {
        str = localException.getMessage();
        k = paramOptions.outWidth;
        m = paramOptions.outHeight;
        n = paramOptions.inSampleSize;
        if (paramOptions.inBitmap == null) {}
      }
      try
      {
        w.i("MicroMsg.InBitmapFactory", "decode again");
        d(paramInputStream);
        paramOptions.inBitmap = null;
        if (paramRect == null)
        {
          paramInputStream = MMBitmapFactory.decodeStream(paramInputStream, null, paramOptions, paramDecodeResultLogger, 0, new int[0]);
          paramOptions = paramInputStream;
          if (paramRect != null)
          {
            paramOptions = paramInputStream;
            if (paramInputStream != null) {
              paramOptions = paramInputStream;
            }
          }
        }
      }
      catch (Exception paramRect)
      {
        int i;
        int j;
        paramInputStream = (InputStream)localObject;
        continue;
      }
      try
      {
        if (paramInputStream.getWidth() > paramRect.right - paramRect.left)
        {
          paramOptions = paramInputStream;
          if (paramInputStream.getHeight() > paramRect.bottom - paramRect.top)
          {
            w.i("MicroMsg.InBitmapFactory", "fuck region decode size not match, clip it, reqWidth: %s, reqHeight: %s, resultWidth: %s, resultHeight: %s", new Object[] { Integer.valueOf(paramRect.right - paramRect.left), Integer.valueOf(paramRect.bottom - paramRect.top), Integer.valueOf(paramInputStream.getWidth()), Integer.valueOf(paramInputStream.getHeight()) });
            paramOptions = Bitmap.createBitmap(paramInputStream, 0, 0, paramRect.right - paramRect.left, paramRect.bottom - paramRect.top);
          }
        }
        if (paramOptions != null) {
          w.i("MicroMsg.InBitmapFactory", "finish decode, decodedBitmap: %s, width: %s, height: %s", new Object[] { paramOptions, Integer.valueOf(paramOptions.getWidth()), Integer.valueOf(paramOptions.getHeight()) });
        }
        GMTrace.o(1286476922880L, 9585);
        return paramOptions;
      }
      catch (Exception paramRect)
      {
        continue;
      }
      localBitmap = MMBitmapFactory.decodeRegion(paramInputStream, paramRect, paramOptions, paramDecodeResultLogger);
      localObject = localBitmap;
      continue;
      i = paramOptions.inBitmap.getWidth();
      if (paramOptions.inBitmap == null) {
        continue;
      }
      j = paramOptions.inBitmap.getHeight();
      w.printErrStackTrace("MicroMsg.InBitmapFactory", localException, "decode with inBitmap error: %s, outWidth: %s, outHeight: %s, sampleSize: %s, reuseBitmapWidth: %s, reuseBitmapHeight: %s", new Object[] { str, Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i), Integer.valueOf(j) });
    }
  }
  
  @TargetApi(19)
  private static BitmapFactory.Options a(InputStream paramInputStream, BitmapFactory.Options paramOptions, ByteBuffer paramByteBuffer, boolean paramBoolean, Rect paramRect)
  {
    GMTrace.i(1286342705152L, 9584);
    BitmapFactory.Options localOptions = paramOptions;
    if (paramOptions == null) {
      localOptions = new BitmapFactory.Options();
    }
    if (paramByteBuffer != null) {
      localOptions.inTempStorage = paramByteBuffer.array();
    }
    localOptions.inJustDecodeBounds = true;
    MMBitmapFactory.decodeStream(paramInputStream, null, localOptions, 0);
    if ((localOptions.outWidth == -1) || (localOptions.outHeight == -1)) {
      throw new IllegalArgumentException("cannot get the bitmap size!");
    }
    localOptions.inJustDecodeBounds = false;
    localOptions.inDither = true;
    int i = localOptions.outWidth;
    int j = localOptions.outHeight;
    label210:
    boolean bool;
    if (paramRect == null)
    {
      w.i("MicroMsg.InBitmapFactory", "options.outWidth: %s, options.outHeight: %s, sampleSize: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localOptions.inSampleSize) });
      if (!paramBoolean) {
        break label417;
      }
      paramInputStream = c.ghE;
      paramOptions = c.ghE;
      paramOptions = (Bitmap)paramInputStream.b(c.c(Integer.valueOf(i * j)));
      paramInputStream = paramOptions;
      if (paramOptions != null)
      {
        paramInputStream = paramOptions;
        if (com.tencent.mm.compatible.util.d.et(19))
        {
          paramOptions.reconfigure(i, j, Bitmap.Config.ARGB_8888);
          paramInputStream = paramOptions;
        }
      }
      if ((paramInputStream != null) && (!paramInputStream.isRecycled())) {
        break label444;
      }
      bool = true;
      label224:
      if (paramInputStream == null) {
        break label450;
      }
      i = paramInputStream.getWidth();
      label234:
      if (paramInputStream == null) {
        break label456;
      }
    }
    label417:
    label444:
    label450:
    label456:
    for (j = paramInputStream.getHeight();; j = 0)
    {
      w.i("MicroMsg.InBitmapFactory", "bitmapToReuse: %s, isRecycle: %s, isRegionDecode: %s, width: %s, height: %s", new Object[] { paramInputStream, Boolean.valueOf(bool), Boolean.valueOf(paramBoolean), Integer.valueOf(i), Integer.valueOf(j) });
      if ((paramInputStream != null) && (paramInputStream.isMutable()) && (!paramInputStream.isRecycled())) {
        localOptions.inBitmap = paramInputStream;
      }
      localOptions.inMutable = true;
      com.tencent.mm.sdk.platformtools.d.b(localOptions);
      w.i("MicroMsg.InBitmapFactory", "mimetype: %s", new Object[] { localOptions.outMimeType });
      GMTrace.o(1286342705152L, 9584);
      return localOptions;
      i = paramRect.right - paramRect.left;
      j = paramRect.bottom - paramRect.top;
      w.i("MicroMsg.InBitmapFactory", "region decode, width: %s, height: %s, rect: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), paramRect });
      break;
      paramInputStream = c.ghE;
      paramOptions = c.ghE;
      paramInputStream = paramInputStream.d(c.c(Integer.valueOf(j * i)));
      break label210;
      bool = false;
      break label224;
      i = 0;
      break label234;
    }
  }
  
  /* Error */
  public final Bitmap a(String paramString, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: ldc2_w 252
    //   6: sipush 9582
    //   9: invokestatic 16	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_1
    //   13: invokestatic 259	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   16: astore 4
    //   18: aload 4
    //   20: astore_1
    //   21: aload_0
    //   22: aload 4
    //   24: aload_2
    //   25: aload_3
    //   26: invokespecial 261	com/tencent/mm/memory/j:a	(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   29: astore_2
    //   30: aload_2
    //   31: astore_1
    //   32: aload 4
    //   34: invokestatic 265	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   37: ldc2_w 252
    //   40: sipush 9582
    //   43: invokestatic 19	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   46: aload_1
    //   47: areturn
    //   48: astore_2
    //   49: aconst_null
    //   50: astore 4
    //   52: aload 4
    //   54: astore_1
    //   55: ldc 49
    //   57: aload_2
    //   58: ldc 51
    //   60: iconst_1
    //   61: anewarray 53	java/lang/Object
    //   64: dup
    //   65: iconst_0
    //   66: aload_2
    //   67: invokevirtual 57	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   70: aastore
    //   71: invokestatic 151	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   74: aload 4
    //   76: invokestatic 265	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   79: aload 5
    //   81: astore_1
    //   82: goto -45 -> 37
    //   85: astore_1
    //   86: aconst_null
    //   87: astore_3
    //   88: aload_1
    //   89: astore_2
    //   90: aload_3
    //   91: invokestatic 265	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   94: aload_2
    //   95: athrow
    //   96: astore_2
    //   97: aload_1
    //   98: astore_3
    //   99: goto -9 -> 90
    //   102: astore_2
    //   103: goto -51 -> 52
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	j
    //   0	106	1	paramString	String
    //   0	106	2	paramOptions	BitmapFactory.Options
    //   0	106	3	paramDecodeResultLogger	MMBitmapFactory.DecodeResultLogger
    //   16	59	4	localInputStream	InputStream
    //   1	79	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   12	18	48	java/lang/Exception
    //   12	18	85	finally
    //   21	30	96	finally
    //   55	74	96	finally
    //   21	30	102	java/lang/Exception
  }
  
  /* Error */
  public final Bitmap a(String paramString, Rect paramRect, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    // Byte code:
    //   0: ldc2_w 267
    //   3: sipush 9583
    //   6: invokestatic 16	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aconst_null
    //   10: astore 6
    //   12: aconst_null
    //   13: astore 5
    //   15: aload_1
    //   16: invokestatic 259	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   19: astore_1
    //   20: getstatic 32	com/tencent/mm/memory/h:ghM	Lcom/tencent/mm/memory/h;
    //   23: invokevirtual 36	com/tencent/mm/memory/h:bE	()Ljava/lang/Object;
    //   26: checkcast 38	java/nio/ByteBuffer
    //   29: astore 5
    //   31: aload_1
    //   32: aload_2
    //   33: aload_1
    //   34: aload_3
    //   35: aload 5
    //   37: iconst_1
    //   38: aload_2
    //   39: invokestatic 41	com/tencent/mm/memory/j:a	(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Ljava/nio/ByteBuffer;ZLandroid/graphics/Rect;)Landroid/graphics/BitmapFactory$Options;
    //   42: aload 4
    //   44: invokestatic 44	com/tencent/mm/memory/j:a	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Landroid/graphics/Bitmap;
    //   47: astore_2
    //   48: aload 5
    //   50: ifnull +12 -> 62
    //   53: getstatic 32	com/tencent/mm/memory/h:ghM	Lcom/tencent/mm/memory/h;
    //   56: aload 5
    //   58: invokevirtual 47	com/tencent/mm/memory/h:i	(Ljava/lang/Object;)Z
    //   61: pop
    //   62: aload_1
    //   63: invokestatic 265	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   66: aload_2
    //   67: astore_1
    //   68: ldc2_w 267
    //   71: sipush 9583
    //   74: invokestatic 19	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   77: aload_1
    //   78: areturn
    //   79: astore_1
    //   80: aconst_null
    //   81: astore_3
    //   82: aload 5
    //   84: astore_2
    //   85: ldc 49
    //   87: ldc 51
    //   89: iconst_1
    //   90: anewarray 53	java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: aload_1
    //   96: invokevirtual 57	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   99: aastore
    //   100: invokestatic 63	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: aload_3
    //   104: ifnull +11 -> 115
    //   107: getstatic 32	com/tencent/mm/memory/h:ghM	Lcom/tencent/mm/memory/h;
    //   110: aload_3
    //   111: invokevirtual 47	com/tencent/mm/memory/h:i	(Ljava/lang/Object;)Z
    //   114: pop
    //   115: aload_2
    //   116: invokestatic 265	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   119: aconst_null
    //   120: astore_1
    //   121: goto -53 -> 68
    //   124: astore_1
    //   125: aconst_null
    //   126: astore_3
    //   127: aload 6
    //   129: astore_2
    //   130: aload_3
    //   131: ifnull +11 -> 142
    //   134: getstatic 32	com/tencent/mm/memory/h:ghM	Lcom/tencent/mm/memory/h;
    //   137: aload_3
    //   138: invokevirtual 47	com/tencent/mm/memory/h:i	(Ljava/lang/Object;)Z
    //   141: pop
    //   142: aload_2
    //   143: invokestatic 265	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   146: aload_1
    //   147: athrow
    //   148: astore 4
    //   150: aload_1
    //   151: astore_2
    //   152: aconst_null
    //   153: astore_3
    //   154: aload 4
    //   156: astore_1
    //   157: goto -27 -> 130
    //   160: astore 4
    //   162: aload_1
    //   163: astore_2
    //   164: aload 5
    //   166: astore_3
    //   167: aload 4
    //   169: astore_1
    //   170: goto -40 -> 130
    //   173: astore_1
    //   174: goto -44 -> 130
    //   177: astore 4
    //   179: aload_1
    //   180: astore_2
    //   181: aconst_null
    //   182: astore_3
    //   183: aload 4
    //   185: astore_1
    //   186: goto -101 -> 85
    //   189: astore 4
    //   191: aload_1
    //   192: astore_2
    //   193: aload 5
    //   195: astore_3
    //   196: aload 4
    //   198: astore_1
    //   199: goto -114 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	this	j
    //   0	202	1	paramString	String
    //   0	202	2	paramRect	Rect
    //   0	202	3	paramOptions	BitmapFactory.Options
    //   0	202	4	paramDecodeResultLogger	MMBitmapFactory.DecodeResultLogger
    //   13	181	5	localByteBuffer	ByteBuffer
    //   10	118	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   15	20	79	java/lang/Exception
    //   15	20	124	finally
    //   20	31	148	finally
    //   31	48	160	finally
    //   85	103	173	finally
    //   20	31	177	java/lang/Exception
    //   31	48	189	java/lang/Exception
  }
  
  public final void h(Bitmap paramBitmap)
  {
    GMTrace.i(1286611140608L, 9586);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled())) {
      c.ghE.g(paramBitmap);
    }
    GMTrace.o(1286611140608L, 9586);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\memory\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
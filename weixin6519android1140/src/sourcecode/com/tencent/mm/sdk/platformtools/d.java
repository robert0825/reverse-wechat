package com.tencent.mm.sdk.platformtools;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.b;
import com.tencent.mm.a.e;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.pointers.PInt;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private static DisplayMetrics hjd;
  public static boolean vhn;
  
  static
  {
    GMTrace.i(13759733039104L, 102518);
    hjd = null;
    GMTrace.o(13759733039104L, 102518);
  }
  
  public d()
  {
    GMTrace.i(20316000616448L, 151366);
    GMTrace.o(20316000616448L, 151366);
  }
  
  public static Bitmap Ag(int paramInt)
  {
    GMTrace.i(13752753717248L, 102466);
    Bitmap localBitmap = a(paramInt, null, false, 0.0F, 0, 0);
    GMTrace.o(13752753717248L, 102466);
    return localBitmap;
  }
  
  public static Bitmap Ah(int paramInt)
  {
    GMTrace.i(13752887934976L, 102467);
    Bitmap localBitmap = a(paramInt, null, false, 1.25F, 0, 0);
    GMTrace.o(13752887934976L, 102467);
    return localBitmap;
  }
  
  public static Bitmap N(Bitmap paramBitmap)
  {
    float f1 = 2.5F;
    GMTrace.i(13752351064064L, 102463);
    float f2;
    int i;
    int j;
    if (paramBitmap.getHeight() >= paramBitmap.getWidth())
    {
      f2 = paramBitmap.getHeight() / paramBitmap.getWidth();
      if (f2 <= 2.0F)
      {
        i = (int)(paramBitmap.getWidth() * 120.0D / paramBitmap.getHeight());
        j = 120;
        w.d("MicroMsg.BitmapUtil", "bitmap decoded size=" + paramBitmap.getWidth() + "x" + paramBitmap.getHeight());
        Bitmap localBitmap2 = Bitmap.createScaledBitmap(paramBitmap, i, j, true);
        Bitmap localBitmap1 = paramBitmap;
        if (localBitmap2 != null)
        {
          localBitmap1 = paramBitmap;
          if (paramBitmap != localBitmap2)
          {
            w.i("MicroMsg.BitmapUtil", "extractThumeNail bitmap recycle. %s", new Object[] { paramBitmap });
            paramBitmap.recycle();
            localBitmap1 = localBitmap2;
          }
        }
        GMTrace.o(13752351064064L, 102463);
        return localBitmap1;
      }
      if (f2 <= 2.5D) {
        break label319;
      }
      paramBitmap = Bitmap.createBitmap(paramBitmap, 0, (paramBitmap.getHeight() - (int)(paramBitmap.getWidth() * 2.5F)) / 2, paramBitmap.getWidth(), (int)(paramBitmap.getWidth() * 2.5F));
    }
    for (;;)
    {
      j = (int)(f1 * 56.0F);
      i = 56;
      break;
      f2 = paramBitmap.getWidth() / paramBitmap.getHeight();
      if (f2 <= 2.0F)
      {
        j = (int)(paramBitmap.getHeight() * 120.0D / paramBitmap.getWidth());
        i = 120;
        break;
      }
      if (f2 > 2.5D) {
        paramBitmap = Bitmap.createBitmap(paramBitmap, (paramBitmap.getWidth() - (int)(paramBitmap.getHeight() * 2.5F)) / 2, 0, (int)(paramBitmap.getHeight() * 2.5F), paramBitmap.getHeight());
      }
      for (;;)
      {
        j = 56;
        i = (int)(f1 * 56.0F);
        break;
        f1 = f2;
      }
      label319:
      f1 = f2;
    }
  }
  
  public static byte[] O(Bitmap paramBitmap)
  {
    GMTrace.i(13758122426368L, 102506);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(13758122426368L, 102506);
      return new byte[0];
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    paramBitmap = localByteArrayOutputStream.toByteArray();
    try
    {
      localByteArrayOutputStream.close();
      GMTrace.o(13758122426368L, 102506);
      return paramBitmap;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.BitmapUtil", localException, "", new Object[0]);
      }
    }
  }
  
  public static byte[] P(Bitmap paramBitmap)
  {
    GMTrace.i(13758256644096L, 102507);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(13758256644096L, 102507);
      return new byte[0];
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    paramBitmap = localByteArrayOutputStream.toByteArray();
    try
    {
      localByteArrayOutputStream.close();
      GMTrace.o(13758256644096L, 102507);
      return paramBitmap;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.BitmapUtil", localException, "", new Object[0]);
      }
    }
  }
  
  public static Bitmap Q(Bitmap paramBitmap)
  {
    GMTrace.i(13759464603648L, 102516);
    int i = paramBitmap.getHeight();
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), i, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    ColorMatrix localColorMatrix = new ColorMatrix();
    localColorMatrix.setSaturation(0.0F);
    localPaint.setColorFilter(new ColorMatrixColorFilter(localColorMatrix));
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
    GMTrace.o(13759464603648L, 102516);
    return localBitmap;
  }
  
  public static Bitmap R(Bitmap paramBitmap)
  {
    GMTrace.i(13759598821376L, 102517);
    int i = paramBitmap.getHeight();
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), i, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    ColorMatrix localColorMatrix = new ColorMatrix();
    localColorMatrix.set(new float[] { 0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F });
    localPaint.setColorFilter(new ColorMatrixColorFilter(localColorMatrix));
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
    GMTrace.o(13759598821376L, 102517);
    return localBitmap;
  }
  
  /* Error */
  public static BitmapFactory.Options RB(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 212
    //   3: ldc -42
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 220	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   12: ifeq +20 -> 32
    //   15: ldc 64
    //   17: ldc -34
    //   19: invokestatic 225	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: ldc2_w 212
    //   25: ldc -42
    //   27: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: aconst_null
    //   31: areturn
    //   32: new 227	android/graphics/BitmapFactory$Options
    //   35: dup
    //   36: invokespecial 228	android/graphics/BitmapFactory$Options:<init>	()V
    //   39: astore_3
    //   40: aload_3
    //   41: iconst_1
    //   42: putfield 231	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   45: aload_3
    //   46: invokestatic 235	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/BitmapFactory$Options;)V
    //   49: aload_0
    //   50: invokestatic 241	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   53: astore_0
    //   54: aload_0
    //   55: aconst_null
    //   56: aload_3
    //   57: aconst_null
    //   58: iconst_0
    //   59: iconst_0
    //   60: newarray <illegal type>
    //   62: invokestatic 247	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   65: astore_1
    //   66: aload_1
    //   67: ifnull +22 -> 89
    //   70: ldc 64
    //   72: ldc -7
    //   74: iconst_1
    //   75: anewarray 4	java/lang/Object
    //   78: dup
    //   79: iconst_0
    //   80: aload_1
    //   81: aastore
    //   82: invokestatic 99	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: aload_1
    //   86: invokevirtual 102	android/graphics/Bitmap:recycle	()V
    //   89: aload_0
    //   90: ifnull +7 -> 97
    //   93: aload_0
    //   94: invokevirtual 252	java/io/InputStream:close	()V
    //   97: ldc2_w 212
    //   100: ldc -42
    //   102: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   105: aload_3
    //   106: areturn
    //   107: astore_2
    //   108: aconst_null
    //   109: astore_1
    //   110: aload_1
    //   111: astore_0
    //   112: ldc 64
    //   114: aload_2
    //   115: ldc -2
    //   117: iconst_0
    //   118: anewarray 4	java/lang/Object
    //   121: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: aload_1
    //   125: ifnull -28 -> 97
    //   128: aload_1
    //   129: invokevirtual 252	java/io/InputStream:close	()V
    //   132: goto -35 -> 97
    //   135: astore_0
    //   136: goto -39 -> 97
    //   139: astore_2
    //   140: aconst_null
    //   141: astore_1
    //   142: aload_1
    //   143: astore_0
    //   144: ldc 64
    //   146: aload_2
    //   147: ldc -2
    //   149: iconst_0
    //   150: anewarray 4	java/lang/Object
    //   153: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: aload_1
    //   157: ifnull -60 -> 97
    //   160: aload_1
    //   161: invokevirtual 252	java/io/InputStream:close	()V
    //   164: goto -67 -> 97
    //   167: astore_0
    //   168: goto -71 -> 97
    //   171: astore_1
    //   172: aconst_null
    //   173: astore_0
    //   174: aload_0
    //   175: ifnull +7 -> 182
    //   178: aload_0
    //   179: invokevirtual 252	java/io/InputStream:close	()V
    //   182: aload_1
    //   183: athrow
    //   184: astore_0
    //   185: goto -88 -> 97
    //   188: astore_0
    //   189: goto -7 -> 182
    //   192: astore_1
    //   193: goto -19 -> 174
    //   196: astore_1
    //   197: goto -23 -> 174
    //   200: astore_2
    //   201: aload_0
    //   202: astore_1
    //   203: goto -61 -> 142
    //   206: astore_2
    //   207: aload_0
    //   208: astore_1
    //   209: goto -99 -> 110
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	paramString	String
    //   65	96	1	localBitmap	Bitmap
    //   171	12	1	localObject1	Object
    //   192	1	1	localObject2	Object
    //   196	1	1	localObject3	Object
    //   202	7	1	str	String
    //   107	8	2	localFileNotFoundException1	FileNotFoundException
    //   139	8	2	localOutOfMemoryError1	OutOfMemoryError
    //   200	1	2	localOutOfMemoryError2	OutOfMemoryError
    //   206	1	2	localFileNotFoundException2	FileNotFoundException
    //   39	67	3	localOptions	BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   49	54	107	java/io/FileNotFoundException
    //   128	132	135	java/io/IOException
    //   49	54	139	java/lang/OutOfMemoryError
    //   160	164	167	java/io/IOException
    //   49	54	171	finally
    //   93	97	184	java/io/IOException
    //   178	182	188	java/io/IOException
    //   54	66	192	finally
    //   70	89	192	finally
    //   112	124	196	finally
    //   144	156	196	finally
    //   54	66	200	java/lang/OutOfMemoryError
    //   70	89	200	java/lang/OutOfMemoryError
    //   54	66	206	java/io/FileNotFoundException
    //   70	89	206	java/io/FileNotFoundException
  }
  
  public static int RC(String paramString)
  {
    GMTrace.i(13750606233600L, 102450);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    Object localObject = null;
    try
    {
      paramString = MMBitmapFactory.decodeStream(FileOp.openRead(paramString), null, localOptions, 0);
      if (paramString != null)
      {
        w.i("MicroMsg.BitmapUtil", "isLongPicture bitmap recycle. %s", new Object[] { paramString });
        paramString.recycle();
      }
      float f1 = localOptions.outWidth / localOptions.outHeight;
      float f2 = localOptions.outHeight / localOptions.outWidth;
      if (f1 >= 2.0F)
      {
        GMTrace.o(13750606233600L, 102450);
        return 1;
      }
      if (f2 >= 2.0F)
      {
        GMTrace.o(13750606233600L, 102450);
        return 2;
      }
      GMTrace.o(13750606233600L, 102450);
      return -1;
    }
    catch (FileNotFoundException paramString)
    {
      for (;;)
      {
        paramString = (String)localObject;
      }
    }
  }
  
  public static Bitmap RD(String paramString)
  {
    GMTrace.i(13752485281792L, 102464);
    paramString = cF(paramString, 1);
    GMTrace.o(13752485281792L, 102464);
    return paramString;
  }
  
  public static Bitmap T(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(13751948410880L, 102460);
    paramString = a(paramString, paramInt1, paramInt2, true, false, 1);
    GMTrace.o(13751948410880L, 102460);
    return paramString;
  }
  
  public static Bitmap U(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(13753424805888L, 102471);
    paramString = a(paramString, paramInt1, paramInt2, null, 1, new int[0]);
    GMTrace.o(13753424805888L, 102471);
    return paramString;
  }
  
  public static Bitmap V(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(13756646031360L, 102495);
    paramString = a(0, paramString, true, 0.0F, paramInt1, paramInt2);
    GMTrace.o(13756646031360L, 102495);
    return paramString;
  }
  
  public static Bitmap X(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(13750203580416L, 102447);
    Bitmap localBitmap = a(paramInt2, paramInt3, Bitmap.Config.ARGB_8888, false);
    new Canvas(localBitmap).drawColor(paramInt1);
    GMTrace.o(13750203580416L, 102447);
    return localBitmap;
  }
  
  public static Bitmap Y(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(13753022152704L, 102468);
    Bitmap localBitmap = a(paramInt1, null, false, 0.0F, paramInt2, paramInt3);
    GMTrace.o(13753022152704L, 102468);
    return localBitmap;
  }
  
  public static int a(boolean paramBoolean, String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, b paramb)
  {
    GMTrace.i(13751814193152L, 102459);
    Bitmap localBitmap = a(paramString1, paramInt1, paramInt2, false, null, 0);
    if (localBitmap == null)
    {
      GMTrace.o(13751814193152L, 102459);
      return -1;
    }
    paramInt1 = 0;
    Exif localExif = new Exif();
    try
    {
      paramInt2 = localExif.parseFromFile(paramString1);
      w.e("EXIFTEST", "parseFromFile ret = " + paramInt2);
      paramInt2 = localExif.getOrientationInDegree();
      paramInt1 = paramInt2;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        try
        {
          paramInt1 = n.a(paramString1, paramInt3, paramString2);
          w.i("MicroMsg.BitmapUtil", "dkimgopt compressByQualityOptim ret:%d  [%d,%d,%d] path:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramString1.getWidth()), Integer.valueOf(paramString1.getHeight()), paramString2 });
          GMTrace.o(13751814193152L, 102459);
          return paramInt1;
        }
        catch (IOException paramString1)
        {
          w.e("MicroMsg.BitmapUtil", "create thumbnail from orig failed: " + paramString2);
          GMTrace.o(13751814193152L, 102459);
        }
        localIOException = localIOException;
        w.printErrStackTrace("MicroMsg.BitmapUtil", localIOException, "Can't read EXIF from " + paramString1, new Object[0]);
      }
      a(paramString1, paramInt3, paramCompressFormat, paramString2, true);
      GMTrace.o(13751814193152L, 102459);
      return 1;
    }
    paramString1 = b(localBitmap, paramInt1);
    if (paramb != null) {
      paramb.ov();
    }
    if (paramBoolean) {}
    return -2;
  }
  
  private static Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig, boolean paramBoolean)
  {
    Object localObject = null;
    GMTrace.i(13753961676800L, 102475);
    try
    {
      paramConfig = Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
      GMTrace.o(13753961676800L, 102475);
      return paramConfig;
    }
    catch (Throwable paramConfig)
    {
      for (;;)
      {
        if (paramBoolean)
        {
          GMTrace.o(13753961676800L, 102475);
          return null;
        }
        try
        {
          paramConfig = bPv();
          int j = paramInt1;
          int i = paramInt2;
          if (paramInt1 > paramConfig.widthPixels)
          {
            j = paramInt1;
            i = paramInt2;
            if (paramInt2 > paramConfig.heightPixels)
            {
              j = paramConfig.widthPixels;
              i = paramConfig.heightPixels;
            }
          }
          paramConfig = Bitmap.createBitmap(j, i, Bitmap.Config.RGB_565);
        }
        catch (Throwable paramConfig)
        {
          paramConfig = (Bitmap.Config)localObject;
        }
      }
    }
  }
  
  private static Bitmap a(int paramInt1, String paramString, boolean paramBoolean, float paramFloat, int paramInt2, int paramInt3)
  {
    GMTrace.i(13755572289536L, 102487);
    paramString = a(paramInt1, paramString, null, null, paramBoolean, paramFloat, paramInt2, paramInt3, null, 1, new int[0]);
    GMTrace.o(13755572289536L, 102487);
    return paramString;
  }
  
  private static Bitmap a(int paramInt1, String paramString, byte[] paramArrayOfByte, Uri paramUri, boolean paramBoolean, float paramFloat, int paramInt2, int paramInt3, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, int paramInt4, int... paramVarArgs)
  {
    GMTrace.i(13755706507264L, 102488);
    int n = 0;
    int m = 0;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    for (j = 1; (paramInt2 < 0) || (paramInt3 < 0); j = 0)
    {
      GMTrace.o(13755706507264L, 102488);
      return null;
    }
    k = n;
    try
    {
      BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
      if (paramFloat != 0.0F)
      {
        k = n;
        localOptions2.inDensity = ((int)(160.0F * paramFloat));
      }
      BitmapFactory.Options localOptions1 = localOptions2;
      int i = m;
      if (j == 0)
      {
        k = n;
        localOptions2.inJustDecodeBounds = true;
        k = n;
        a(localOptions2, paramArrayOfByte, paramString, paramUri, paramBoolean, paramInt1, paramDecodeResultLogger, paramInt4, paramVarArgs);
        k = n;
        int i1 = localOptions2.outWidth;
        k = n;
        int i2 = localOptions2.outHeight;
        k = n;
        localOptions2 = new BitmapFactory.Options();
        k = n;
        localOptions2.inPreferredConfig = Bitmap.Config.ARGB_8888;
        if (i1 <= paramInt2)
        {
          localOptions1 = localOptions2;
          i = m;
          if (i2 <= paramInt3) {}
        }
        else
        {
          k = n;
          localOptions2.inSampleSize = ((int)Math.max(i1 / paramInt2, i2 / paramInt3));
          k = n;
          i = localOptions2.inSampleSize;
          localOptions1 = localOptions2;
        }
      }
      k = i;
      b(localOptions1);
      k = i;
      paramDecodeResultLogger = a(localOptions1, paramArrayOfByte, paramString, paramUri, paramBoolean, paramInt1, paramDecodeResultLogger, paramInt4, paramVarArgs);
      paramString = paramDecodeResultLogger;
    }
    catch (Throwable paramDecodeResultLogger)
    {
      for (;;)
      {
        paramDecodeResultLogger = new BitmapFactory.Options();
        if (paramFloat != 0.0F) {
          paramDecodeResultLogger.inDensity = ((int)(160.0F * paramFloat));
        }
        paramDecodeResultLogger.inPreferredConfig = Bitmap.Config.RGB_565;
        if ((j == 0) && (k != 0)) {
          paramDecodeResultLogger.inSampleSize = k;
        }
        b(paramDecodeResultLogger);
        try
        {
          paramString = a(paramDecodeResultLogger, paramArrayOfByte, paramString, paramUri, paramBoolean, paramInt1, null, paramInt4, paramVarArgs);
        }
        catch (Throwable paramString)
        {
          paramString = null;
        }
      }
    }
    GMTrace.o(13755706507264L, 102488);
    return paramString;
  }
  
  public static Bitmap a(Bitmap paramBitmap, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(13756780249088L, 102496);
    if (paramBitmap == null)
    {
      GMTrace.o(13756780249088L, 102496);
      return null;
    }
    if ((paramFloat1 > 0.999D) && (paramFloat1 < 1.001D) && (paramFloat2 > 0.999D) && (paramFloat2 < 1.001D))
    {
      GMTrace.o(13756780249088L, 102496);
      return paramBitmap;
    }
    Object localObject = new Matrix();
    ((Matrix)localObject).reset();
    if ((paramFloat1 < 0.999D) || (paramFloat1 > 1.001D) || (paramFloat2 < 0.999D) || (paramFloat2 > 1.001D)) {
      ((Matrix)localObject).postScale(paramFloat1, paramFloat2);
    }
    localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
    StringBuilder localStringBuilder = new StringBuilder("resultBmp is null: ");
    if (localObject == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.BitmapUtil", bool + "  degree:0.0");
      if (paramBitmap != localObject)
      {
        w.i("MicroMsg.BitmapUtil", "rotateAndScale bitmap recycle asdfasdjfjasdfjsadfjdsa. %s", new Object[] { paramBitmap });
        paramBitmap.recycle();
      }
      GMTrace.o(13756780249088L, 102496);
      return (Bitmap)localObject;
    }
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(13759061950464L, 102513);
    if ((paramBitmap == null) || (paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0))
    {
      GMTrace.o(13759061950464L, 102513);
      return null;
    }
    long l = System.currentTimeMillis();
    Bitmap localBitmap = a(paramInt2, paramInt3, Bitmap.Config.ARGB_8888, false);
    Canvas localCanvas = new Canvas(localBitmap);
    w.d("MicroMsg.BitmapUtil", "bm size w %d h %d target w %d h %d", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    localCanvas.drawBitmap(paramBitmap, null, new Rect(0, 0, paramInt2, paramInt3), new Paint());
    w.d("MicroMsg.BitmapUtil", "create nine patch bitmap " + (System.currentTimeMillis() - l));
    paramBitmap = b(localBitmap, paramInt1);
    GMTrace.o(13759061950464L, 102513);
    return paramBitmap;
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(13757585555456L, 102502);
    if (paramBitmap == null)
    {
      GMTrace.o(13757585555456L, 102502);
      return null;
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f2 = Math.max(paramInt1 / i, paramInt2 / j);
    float f1 = i * f2;
    f2 = j * f2;
    float f3 = (paramInt1 - f1) / 2.0F;
    float f4 = (paramInt2 - f2) / 2.0F;
    RectF localRectF = new RectF(f3, f4, f1 + f3, f2 + f4);
    Bitmap.Config localConfig = paramBitmap.getConfig();
    Object localObject = localConfig;
    if (localConfig == null)
    {
      w.w("MicroMsg.BitmapUtil", "get center crop bitmap, config is null");
      localObject = Bitmap.Config.ARGB_8888;
    }
    try
    {
      localObject = Bitmap.createBitmap(paramInt1, paramInt2, (Bitmap.Config)localObject);
      new Canvas((Bitmap)localObject).drawBitmap(paramBitmap, null, localRectF, null);
      if (paramBoolean)
      {
        w.i("MicroMsg.BitmapUtil", "getCenterCropBitmap bitmap recycle %s", new Object[] { paramBitmap });
        paramBitmap.recycle();
      }
      GMTrace.o(13757585555456L, 102502);
      return (Bitmap)localObject;
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.RGB_565);
      }
      catch (Throwable localThrowable2)
      {
        w.e("MicroMsg.BitmapUtil", "BitmapUtil decode getCenterCropBitmap fail");
        GMTrace.o(13757585555456L, 102502);
      }
    }
    return paramBitmap;
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13756511813632L, 102494);
    if (paramBitmap == null)
    {
      w.e("MicroMsg.BitmapUtil", "extractThumbNail bitmap is null.");
      GMTrace.o(13756511813632L, 102494);
      return null;
    }
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      w.e("MicroMsg.BitmapUtil", "extractThumbNail height:" + paramInt1 + " width:" + paramInt2);
      GMTrace.o(13756511813632L, 102494);
      return null;
    }
    Object localObject = new BitmapFactory.Options();
    b((BitmapFactory.Options)localObject);
    ((BitmapFactory.Options)localObject).outHeight = paramBitmap.getHeight();
    ((BitmapFactory.Options)localObject).outWidth = paramBitmap.getWidth();
    w.i("MicroMsg.BitmapUtil", "extractThumbNail: round=" + paramInt2 + "x" + paramInt1 + ", crop=" + paramBoolean1 + ", recycle=" + paramBoolean2);
    double d2 = ((BitmapFactory.Options)localObject).outHeight * 1.0D / paramInt1;
    double d3 = ((BitmapFactory.Options)localObject).outWidth * 1.0D / paramInt2;
    w.d("MicroMsg.BitmapUtil", "extractThumbNail: extract beX = " + d3 + ", beY = " + d2);
    double d1;
    if (paramBoolean1) {
      if (d2 > d3) {
        d1 = d3;
      }
    }
    for (;;)
    {
      ((BitmapFactory.Options)localObject).inSampleSize = ((int)d1);
      if (((BitmapFactory.Options)localObject).inSampleSize <= 1) {}
      for (((BitmapFactory.Options)localObject).inSampleSize = 1; ((BitmapFactory.Options)localObject).outHeight * ((BitmapFactory.Options)localObject).outWidth / ((BitmapFactory.Options)localObject).inSampleSize / ((BitmapFactory.Options)localObject).inSampleSize > 2764800; ((BitmapFactory.Options)localObject).inSampleSize += 1) {}
      d1 = d2;
      continue;
      if (d2 < d3) {
        d1 = d3;
      } else {
        d1 = d2;
      }
    }
    int j;
    int i;
    Bitmap localBitmap;
    if (paramBoolean1) {
      if (d2 > d3)
      {
        j = (int)Math.ceil(paramInt2 * 1.0D * ((BitmapFactory.Options)localObject).outHeight / ((BitmapFactory.Options)localObject).outWidth);
        i = paramInt2;
        ((BitmapFactory.Options)localObject).inJustDecodeBounds = false;
        w.i("MicroMsg.BitmapUtil", "bitmap required size=" + i + "x" + j + ", orig=" + ((BitmapFactory.Options)localObject).outWidth + "x" + ((BitmapFactory.Options)localObject).outHeight + ", sample=" + ((BitmapFactory.Options)localObject).inSampleSize);
        localBitmap = Bitmap.createScaledBitmap(paramBitmap, i, j, true);
        if (localBitmap == null) {
          break label846;
        }
        localObject = localBitmap;
        if (paramBoolean2)
        {
          localObject = localBitmap;
          if (paramBitmap != localBitmap)
          {
            w.i("MicroMsg.BitmapUtil", "extractThumbNail bitmap recycle asdfjasjdfja asdfasd. %s", new Object[] { paramBitmap });
            paramBitmap.recycle();
          }
        }
      }
    }
    label846:
    for (localObject = localBitmap;; localObject = paramBitmap)
    {
      if (paramBoolean1)
      {
        i = paramInt2;
        if (((Bitmap)localObject).getWidth() < paramInt2)
        {
          w.e("MicroMsg.BitmapUtil", "bmw < width %d %d", new Object[] { Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(paramInt2) });
          i = ((Bitmap)localObject).getWidth();
        }
        paramInt2 = paramInt1;
        if (((Bitmap)localObject).getHeight() < paramInt1)
        {
          w.e("MicroMsg.BitmapUtil", "bmh < height %d %d", new Object[] { Integer.valueOf(((Bitmap)localObject).getHeight()), Integer.valueOf(paramInt1) });
          paramInt2 = ((Bitmap)localObject).getHeight();
        }
        paramBitmap = Bitmap.createBitmap((Bitmap)localObject, ((Bitmap)localObject).getWidth() - i >> 1, ((Bitmap)localObject).getHeight() - paramInt2 >> 1, i, paramInt2);
        if (paramBitmap == null)
        {
          GMTrace.o(13756511813632L, 102494);
          return (Bitmap)localObject;
          i = (int)Math.ceil(paramInt1 * 1.0D * ((BitmapFactory.Options)localObject).outWidth / ((BitmapFactory.Options)localObject).outHeight);
          j = paramInt1;
          break;
          if (d2 < d3)
          {
            j = (int)Math.ceil(paramInt2 * 1.0D * ((BitmapFactory.Options)localObject).outHeight / ((BitmapFactory.Options)localObject).outWidth);
            i = paramInt2;
            break;
          }
          i = (int)Math.ceil(paramInt1 * 1.0D * ((BitmapFactory.Options)localObject).outWidth / ((BitmapFactory.Options)localObject).outHeight);
          j = paramInt1;
          break;
        }
        if ((paramBoolean2) && (localObject != paramBitmap))
        {
          w.i("MicroMsg.BitmapUtil", "extractThumbNail bitmap recycle ajdfjajsdfjdsajjfsad. %s", new Object[] { localObject });
          ((Bitmap)localObject).recycle();
        }
        w.d("MicroMsg.BitmapUtil", "bitmap croped size=" + paramBitmap.getWidth() + "x" + paramBitmap.getHeight());
      }
      for (;;)
      {
        GMTrace.o(13756511813632L, 102494);
        return paramBitmap;
        paramBitmap = (Bitmap)localObject;
      }
    }
  }
  
  public static Bitmap a(Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    GMTrace.i(13757853990912L, 102504);
    paramBitmap = a(paramBitmap, paramBoolean, paramFloat, false);
    GMTrace.o(13757853990912L, 102504);
    return paramBitmap;
  }
  
  public static Bitmap a(Bitmap paramBitmap, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    GMTrace.i(13757719773184L, 102503);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      w.e("MicroMsg.BitmapUtil", "getRoundedCornerBitmap in bitmap is null");
      GMTrace.o(13757719773184L, 102503);
      return null;
    }
    Bitmap localBitmap = a(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888, paramBoolean2);
    if (localBitmap == null)
    {
      GMTrace.o(13757719773184L, 102503);
      return null;
    }
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    Rect localRect = new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
    RectF localRectF = new RectF(localRect);
    localPaint.setAntiAlias(true);
    localPaint.setDither(true);
    localPaint.setFilterBitmap(true);
    localCanvas.drawARGB(0, 0, 0, 0);
    localPaint.setColor(-4144960);
    localCanvas.drawRoundRect(localRectF, paramFloat, paramFloat, localPaint);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    localCanvas.drawBitmap(paramBitmap, localRect, localRect, localPaint);
    if (paramBoolean1)
    {
      w.i("MicroMsg.BitmapUtil", "getRoundedCornerBitmap bitmap recycle %s", new Object[] { paramBitmap });
      paramBitmap.recycle();
    }
    GMTrace.o(13757719773184L, 102503);
    return localBitmap;
  }
  
  /* Error */
  private static Bitmap a(BitmapFactory.Options paramOptions, byte[] paramArrayOfByte, String paramString, Uri paramUri, boolean paramBoolean, int paramInt1, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, int paramInt2, int... paramVarArgs)
  {
    // Byte code:
    //   0: ldc2_w 598
    //   3: ldc_w 600
    //   6: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokestatic 604	com/tencent/mm/sdk/platformtools/bg:bq	([B)Z
    //   13: ifeq +30 -> 43
    //   16: aload_2
    //   17: invokestatic 220	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   20: ifeq +23 -> 43
    //   23: aload_3
    //   24: ifnonnull +19 -> 43
    //   27: iload 5
    //   29: ifgt +14 -> 43
    //   32: ldc2_w 598
    //   35: ldc_w 600
    //   38: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   41: aconst_null
    //   42: areturn
    //   43: aload_1
    //   44: invokestatic 604	com/tencent/mm/sdk/platformtools/bg:bq	([B)Z
    //   47: ifne +37 -> 84
    //   50: iconst_1
    //   51: istore 9
    //   53: iload 9
    //   55: ifeq +35 -> 90
    //   58: aload_1
    //   59: iconst_0
    //   60: aload_1
    //   61: arraylength
    //   62: aload_0
    //   63: aload 6
    //   65: iload 7
    //   67: aload 8
    //   69: invokestatic 608	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   72: astore_0
    //   73: ldc2_w 598
    //   76: ldc_w 600
    //   79: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   82: aload_0
    //   83: areturn
    //   84: iconst_0
    //   85: istore 9
    //   87: goto -34 -> 53
    //   90: iload 5
    //   92: ifle +19 -> 111
    //   95: invokestatic 614	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   98: invokevirtual 620	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   101: iload 5
    //   103: aload_0
    //   104: invokestatic 626	com/tencent/mm/compatible/f/a:decodeResource	(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   107: astore_0
    //   108: goto -35 -> 73
    //   111: aconst_null
    //   112: astore_1
    //   113: iload 4
    //   115: ifeq +62 -> 177
    //   118: aload_2
    //   119: invokestatic 220	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   122: istore 4
    //   124: iload 4
    //   126: ifeq +14 -> 140
    //   129: ldc2_w 598
    //   132: ldc_w 600
    //   135: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   138: aconst_null
    //   139: areturn
    //   140: invokestatic 614	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   143: invokevirtual 630	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   146: aload_2
    //   147: invokevirtual 635	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   150: astore_2
    //   151: aload_2
    //   152: astore_1
    //   153: aload_1
    //   154: aconst_null
    //   155: aload_0
    //   156: aload 6
    //   158: iload 7
    //   160: aload 8
    //   162: invokestatic 247	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   165: astore_0
    //   166: aload_1
    //   167: ifnull +63 -> 230
    //   170: aload_1
    //   171: invokevirtual 252	java/io/InputStream:close	()V
    //   174: goto -101 -> 73
    //   177: aload_3
    //   178: ifnull +19 -> 197
    //   181: invokestatic 614	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   184: invokevirtual 639	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   187: aload_3
    //   188: invokevirtual 645	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   191: astore_2
    //   192: aload_2
    //   193: astore_1
    //   194: goto -41 -> 153
    //   197: aload_2
    //   198: invokestatic 241	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   201: astore_2
    //   202: aload_2
    //   203: astore_1
    //   204: goto -51 -> 153
    //   207: astore_1
    //   208: goto -135 -> 73
    //   211: astore_0
    //   212: aload_1
    //   213: ifnull +7 -> 220
    //   216: aload_1
    //   217: invokevirtual 252	java/io/InputStream:close	()V
    //   220: aload_0
    //   221: athrow
    //   222: astore_1
    //   223: goto -3 -> 220
    //   226: astore_0
    //   227: goto -15 -> 212
    //   230: goto -157 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	233	0	paramOptions	BitmapFactory.Options
    //   0	233	1	paramArrayOfByte	byte[]
    //   0	233	2	paramString	String
    //   0	233	3	paramUri	Uri
    //   0	233	4	paramBoolean	boolean
    //   0	233	5	paramInt1	int
    //   0	233	6	paramDecodeResultLogger	MMBitmapFactory.DecodeResultLogger
    //   0	233	7	paramInt2	int
    //   0	233	8	paramVarArgs	int[]
    //   51	35	9	i	int
    // Exception table:
    //   from	to	target	type
    //   170	174	207	java/io/IOException
    //   118	124	211	finally
    //   140	151	211	finally
    //   181	192	211	finally
    //   197	202	211	finally
    //   216	220	222	java/io/IOException
    //   153	166	226	finally
  }
  
  public static Bitmap a(InputStream paramInputStream, float paramFloat)
  {
    GMTrace.i(13755169636352L, 102484);
    paramInputStream = a(paramInputStream, paramFloat, 0, 0);
    GMTrace.o(13755169636352L, 102484);
    return paramInputStream;
  }
  
  public static Bitmap a(InputStream paramInputStream, float paramFloat, int paramInt1, int paramInt2)
  {
    GMTrace.i(13755035418624L, 102483);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    if (paramFloat != 0.0F) {
      localOptions.inDensity = ((int)(160.0F * paramFloat));
    }
    Object localObject;
    int i;
    if (paramInt1 == 0)
    {
      localObject = paramInputStream;
      if (paramInt2 == 0) {}
    }
    else
    {
      i = paramInt1;
      if (paramInt1 == 0) {
        i = Integer.MAX_VALUE;
      }
      paramInt1 = paramInt2;
      if (paramInt2 == 0) {
        paramInt1 = Integer.MAX_VALUE;
      }
      if (!(paramInputStream instanceof FileInputStream)) {
        break label201;
      }
      localObject = new i((FileInputStream)paramInputStream);
    }
    for (;;)
    {
      ((InputStream)localObject).mark(25165824);
      localOptions.inJustDecodeBounds = true;
      MMBitmapFactory.decodeStream((InputStream)localObject, null, localOptions);
      paramInt2 = localOptions.outWidth;
      int j = localOptions.outHeight;
      if ((paramInt2 > i) || (j > paramInt1)) {
        localOptions.inSampleSize = ((int)Math.max(paramInt2 / i, j / paramInt1));
      }
      localOptions.inJustDecodeBounds = false;
      try
      {
        ((InputStream)localObject).reset();
        localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
        b(localOptions);
      }
      catch (IOException paramInputStream)
      {
        try
        {
          paramInputStream = MMBitmapFactory.decodeStream((InputStream)localObject, null, localOptions);
          GMTrace.o(13755035418624L, 102483);
          return paramInputStream;
          label201:
          localObject = paramInputStream;
          if (paramInputStream.markSupported()) {
            continue;
          }
          localObject = new BufferedInputStream(paramInputStream, 65536);
          continue;
          paramInputStream = paramInputStream;
          w.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "Failed seeking InputStream.", new Object[0]);
        }
        catch (OutOfMemoryError paramInputStream)
        {
          for (;;)
          {
            localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
            b(localOptions);
            try
            {
              paramInputStream = MMBitmapFactory.decodeStream((InputStream)localObject, null, localOptions);
            }
            catch (OutOfMemoryError paramInputStream)
            {
              w.e("MicroMsg.BitmapUtil", "decodeStream OutOfMemoryError return null");
              paramInputStream = null;
            }
          }
        }
      }
    }
  }
  
  @TargetApi(11)
  private static Bitmap a(InputStream paramInputStream, int paramInt1, int paramInt2, boolean paramBoolean, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, int paramInt3)
  {
    GMTrace.i(13756109160448L, 102491);
    if ((paramInt2 <= 0) || (paramInt1 <= 0))
    {
      w.e("MicroMsg.BitmapUtil", "extractThumbNail height:" + paramInt2 + " width:" + paramInt1);
      GMTrace.o(13756109160448L, 102491);
      return null;
    }
    if (!paramInputStream.markSupported())
    {
      if ((paramInputStream instanceof FileInputStream)) {
        paramInputStream = new i((FileInputStream)paramInputStream);
      }
      for (;;)
      {
        BitmapFactory.Options localOptions = new BitmapFactory.Options();
        try
        {
          localOptions.inJustDecodeBounds = true;
          paramInputStream.mark(8388608);
          Bitmap localBitmap = MMBitmapFactory.decodeStream(paramInputStream, null, localOptions, paramDecodeResultLogger, paramInt3, new int[0]);
          paramInputStream.reset();
          if (localBitmap != null)
          {
            w.i("MicroMsg.BitmapUtil", "extractThumeNail bitmap recycle, adsf. %s", new Object[] { localBitmap });
            localBitmap.recycle();
          }
          if ((localOptions.outHeight <= 0) || (localOptions.outWidth <= 0))
          {
            w.e("MicroMsg.BitmapUtil", "decode[%s] error, outHeight[%d] outWidth[%d]", new Object[] { paramInputStream, Integer.valueOf(localOptions.outHeight), Integer.valueOf(localOptions.outWidth) });
            GMTrace.o(13756109160448L, 102491);
            return null;
            if (paramInputStream.markSupported()) {
              break label1180;
            }
            paramInputStream = new BufferedInputStream(paramInputStream);
          }
          else
          {
            w.i("MicroMsg.BitmapUtil", "extractThumbNail: round=" + paramInt1 + "x" + paramInt2 + ", crop=" + paramBoolean);
            d2 = localOptions.outHeight * 1.0D / paramInt2;
            d3 = localOptions.outWidth * 1.0D / paramInt1;
            w.d("MicroMsg.BitmapUtil", "extractThumbNail: extract beX = " + d3 + ", beY = " + d2);
            if (!paramBoolean) {
              break label467;
            }
            if (d2 <= d3) {
              break label460;
            }
            d1 = d3;
          }
        }
        catch (OutOfMemoryError paramInputStream)
        {
          double d2;
          double d3;
          for (;;)
          {
            w.e("MicroMsg.BitmapUtil", "decode bitmap failed: " + paramInputStream.getMessage());
            GMTrace.o(13756109160448L, 102491);
            return null;
            d1 = d2;
            continue;
            if (d2 < d3) {
              d1 = d3;
            } else {
              d1 = d2;
            }
          }
          if (!paramBoolean) {
            break label706;
          }
          if (d2 <= d3) {
            break label672;
          }
          double d1 = paramInt1;
          j = (int)Math.ceil(d1 * 1.0D * localOptions.outHeight / localOptions.outWidth);
          i = paramInt1;
          break label1183;
          localOptions.inJustDecodeBounds = false;
          if (Build.VERSION.SDK_INT < 11) {
            break label555;
          }
          localOptions.inMutable = true;
          w.i("MicroMsg.BitmapUtil", "bitmap required size=" + i + "x" + j + ", orig=" + localOptions.outWidth + "x" + localOptions.outHeight + ", sample=" + localOptions.inSampleSize);
          b(localOptions);
          paramInputStream = MMBitmapFactory.decodeStream(paramInputStream, null, localOptions, paramDecodeResultLogger, paramInt3, new int[0]);
          if (paramInputStream != null) {
            break label774;
          }
          w.e("MicroMsg.BitmapUtil", "bitmap decode failed");
          GMTrace.o(13756109160448L, 102491);
          return null;
          d1 = paramInt2;
          i = (int)Math.ceil(d1 * 1.0D * localOptions.outWidth / localOptions.outHeight);
          j = paramInt2;
          break label1183;
          if (d2 >= d3) {
            break label744;
          }
          j = (int)Math.ceil(paramInt1 * 1.0D * localOptions.outHeight / localOptions.outWidth);
          i = paramInt1;
          break label1183;
          i = (int)Math.ceil(paramInt2 * 1.0D * localOptions.outWidth / localOptions.outHeight);
          j = paramInt2;
          break label1183;
          w.d("MicroMsg.BitmapUtil", "bitmap decoded size=" + paramInputStream.getWidth() + "x" + paramInputStream.getHeight());
          paramDecodeResultLogger = Bitmap.createScaledBitmap(paramInputStream, i, j, true);
          if ((paramInputStream == paramDecodeResultLogger) || (paramDecodeResultLogger == null)) {
            break label1177;
          }
          w.i("MicroMsg.BitmapUtil", "extractThumbNail bitmap recycle adsfad. %s", new Object[] { paramInputStream });
          paramInputStream.recycle();
          paramInputStream = paramDecodeResultLogger;
          if (!paramBoolean) {
            break label1174;
          }
          paramInt3 = paramInt1;
          if (paramInputStream.getWidth() >= paramInt1) {
            break label905;
          }
          w.e("MicroMsg.BitmapUtil", "bmw < width %d %d", new Object[] { Integer.valueOf(paramInputStream.getWidth()), Integer.valueOf(paramInt1) });
          paramInt3 = paramInputStream.getWidth();
          i = paramInt2;
          if (paramInputStream.getHeight() >= paramInt2) {
            break label951;
          }
          w.e("MicroMsg.BitmapUtil", "bmh < height %d %d", new Object[] { Integer.valueOf(paramInputStream.getHeight()), Integer.valueOf(paramInt2) });
          i = paramInputStream.getHeight();
          paramInt2 = paramInputStream.getWidth() - paramInt3 >> 1;
          m = paramInputStream.getHeight() - i >> 1;
          if (paramInt2 < 0) {
            break label988;
          }
          j = m;
          k = paramInt2;
          if (m >= 0) {
            break label1047;
          }
          w.e("MicroMsg.BitmapUtil", "fix crop image error %d %d %d %d", new Object[] { Integer.valueOf(paramInputStream.getWidth()), Integer.valueOf(paramInputStream.getHeight()), Integer.valueOf(paramInt3), Integer.valueOf(i) });
          paramInt1 = paramInt2;
          if (paramInt2 >= 0) {
            break label1208;
          }
          paramInt1 = 0;
          break label1208;
          paramDecodeResultLogger = Bitmap.createBitmap(paramInputStream, k, j, paramInt3, i);
          if (paramDecodeResultLogger != null) {
            break label1077;
          }
          GMTrace.o(13756109160448L, 102491);
          return paramInputStream;
          if (paramDecodeResultLogger == paramInputStream) {
            break label1171;
          }
          w.i("MicroMsg.BitmapUtil", "extractThumbNail bitmap recycle adsfaasdfad. %s", new Object[] { paramInputStream });
          paramInputStream.recycle();
          paramInputStream = paramDecodeResultLogger;
          w.d("MicroMsg.BitmapUtil", "bitmap croped size=" + paramInputStream.getWidth() + "x" + paramInputStream.getHeight());
          GMTrace.o(13756109160448L, 102491);
          return paramInputStream;
        }
        catch (IOException paramInputStream)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.BitmapUtil", paramInputStream, "Failed decode bitmap", new Object[0]);
            continue;
            continue;
          }
        }
      }
      localOptions.inSampleSize = ((int)d1);
      if (localOptions.inSampleSize <= 1) {}
      for (localOptions.inSampleSize = 1; localOptions.outHeight * localOptions.outWidth / localOptions.inSampleSize / localOptions.inSampleSize > 2764800; localOptions.inSampleSize += 1) {}
    }
    for (;;)
    {
      label460:
      label467:
      label555:
      label672:
      label706:
      label744:
      label774:
      label905:
      label951:
      int m;
      label988:
      label1047:
      label1077:
      label1171:
      label1174:
      label1177:
      label1180:
      break;
      label1183:
      if (j > 0) {}
      for (;;)
      {
        if (i <= 0) {
          break label1202;
        }
        break;
        j = 1;
      }
      label1202:
      int i = 1;
      continue;
      label1208:
      int j = m;
      int k = paramInt1;
      if (m < 0)
      {
        j = 0;
        k = paramInt1;
      }
    }
  }
  
  public static Bitmap a(String paramString, float paramFloat, int paramInt)
  {
    GMTrace.i(13753290588160L, 102470);
    paramString = a(paramString, 0, 0, paramFloat, null, paramInt, new int[0]);
    GMTrace.o(13753290588160L, 102470);
    return paramString;
  }
  
  private static Bitmap a(String paramString, int paramInt1, int paramInt2, float paramFloat, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, int paramInt3, int... paramVarArgs)
  {
    GMTrace.i(13753693241344L, 102473);
    paramString = a(0, paramString, null, null, false, paramFloat, paramInt1, paramInt2, paramDecodeResultLogger, paramInt3, paramVarArgs);
    GMTrace.o(13753693241344L, 102473);
    return paramString;
  }
  
  public static Bitmap a(String paramString, int paramInt1, int paramInt2, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, int paramInt3, int... paramVarArgs)
  {
    GMTrace.i(13753559023616L, 102472);
    paramString = a(paramString, paramInt1, paramInt2, 0.0F, paramDecodeResultLogger, paramInt3, paramVarArgs);
    GMTrace.o(13753559023616L, 102472);
    return paramString;
  }
  
  /* Error */
  public static Bitmap a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger, int paramInt3)
  {
    // Byte code:
    //   0: ldc2_w 737
    //   3: ldc_w 739
    //   6: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokestatic 220	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   13: ifeq +22 -> 35
    //   16: ldc 64
    //   18: ldc_w 741
    //   21: invokestatic 225	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: ldc2_w 737
    //   27: ldc_w 739
    //   30: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   33: aconst_null
    //   34: areturn
    //   35: aconst_null
    //   36: astore 6
    //   38: aconst_null
    //   39: astore 7
    //   41: aload_0
    //   42: invokestatic 241	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   45: astore_0
    //   46: aload_0
    //   47: iload_2
    //   48: iload_1
    //   49: iload_3
    //   50: aload 4
    //   52: iload 5
    //   54: invokestatic 743	com/tencent/mm/sdk/platformtools/d:a	(Ljava/io/InputStream;IIZLcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I)Landroid/graphics/Bitmap;
    //   57: astore 4
    //   59: aload_0
    //   60: ifnull +7 -> 67
    //   63: aload_0
    //   64: invokevirtual 252	java/io/InputStream:close	()V
    //   67: ldc2_w 737
    //   70: ldc_w 739
    //   73: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   76: aload 4
    //   78: areturn
    //   79: astore 4
    //   81: aload 7
    //   83: astore_0
    //   84: aload_0
    //   85: astore 6
    //   87: ldc 64
    //   89: aload 4
    //   91: ldc_w 745
    //   94: iconst_0
    //   95: anewarray 4	java/lang/Object
    //   98: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: aload_0
    //   102: ifnull +7 -> 109
    //   105: aload_0
    //   106: invokevirtual 252	java/io/InputStream:close	()V
    //   109: ldc2_w 737
    //   112: ldc_w 739
    //   115: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   118: aconst_null
    //   119: areturn
    //   120: astore_0
    //   121: aload 6
    //   123: astore 4
    //   125: aload 4
    //   127: ifnull +8 -> 135
    //   130: aload 4
    //   132: invokevirtual 252	java/io/InputStream:close	()V
    //   135: aload_0
    //   136: athrow
    //   137: astore_0
    //   138: goto -71 -> 67
    //   141: astore_0
    //   142: goto -33 -> 109
    //   145: astore 4
    //   147: goto -12 -> 135
    //   150: astore 6
    //   152: aload_0
    //   153: astore 4
    //   155: aload 6
    //   157: astore_0
    //   158: goto -33 -> 125
    //   161: astore 4
    //   163: goto -79 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	paramString	String
    //   0	166	1	paramInt1	int
    //   0	166	2	paramInt2	int
    //   0	166	3	paramBoolean	boolean
    //   0	166	4	paramDecodeResultLogger	MMBitmapFactory.DecodeResultLogger
    //   0	166	5	paramInt3	int
    //   36	86	6	str	String
    //   150	6	6	localObject1	Object
    //   39	43	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   41	46	79	java/io/FileNotFoundException
    //   41	46	120	finally
    //   87	101	120	finally
    //   63	67	137	java/io/IOException
    //   105	109	141	java/io/IOException
    //   130	135	145	java/io/IOException
    //   46	59	150	finally
    //   46	59	161	java/io/FileNotFoundException
  }
  
  public static Bitmap a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, int paramInt3)
  {
    GMTrace.i(13752082628608L, 102461);
    Bitmap localBitmap = a(paramString, paramInt1, paramInt2, false, null, paramInt3);
    if (localBitmap == null)
    {
      GMTrace.o(13752082628608L, 102461);
      return null;
    }
    Exif localExif = new Exif();
    try
    {
      paramInt1 = localExif.parseFromFile(paramString);
      w.e("EXIFTEST", "parseFromFile ret = " + paramInt1);
      paramInt1 = localExif.getOrientationInDegree();
      w.d("MicroMsg.BitmapUtil", "degress:%d", new Object[] { Integer.valueOf(paramInt1) });
      paramString = b(localBitmap, paramInt1);
      GMTrace.o(13752082628608L, 102461);
      return paramString;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.BitmapUtil", localIOException, "Can't read EXIF from " + paramString, new Object[0]);
        paramInt1 = 0;
      }
    }
  }
  
  /* Error */
  public static Bitmap a(String paramString, BitmapFactory.Options paramOptions, int paramInt, int... paramVarArgs)
  {
    // Byte code:
    //   0: ldc2_w 752
    //   3: ldc_w 754
    //   6: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: ifnonnull +134 -> 144
    //   13: new 227	android/graphics/BitmapFactory$Options
    //   16: dup
    //   17: invokespecial 228	android/graphics/BitmapFactory$Options:<init>	()V
    //   20: astore 4
    //   22: aload_0
    //   23: invokestatic 241	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   26: astore_1
    //   27: aload 4
    //   29: invokestatic 235	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/BitmapFactory$Options;)V
    //   32: aload_1
    //   33: aconst_null
    //   34: aload 4
    //   36: aconst_null
    //   37: iload_2
    //   38: aload_3
    //   39: invokestatic 247	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   42: astore_3
    //   43: aload_1
    //   44: ifnull +7 -> 51
    //   47: aload_1
    //   48: invokevirtual 252	java/io/InputStream:close	()V
    //   51: ldc2_w 752
    //   54: ldc_w 754
    //   57: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   60: aload_3
    //   61: areturn
    //   62: astore_3
    //   63: aconst_null
    //   64: astore_1
    //   65: ldc 64
    //   67: ldc_w 756
    //   70: iconst_2
    //   71: anewarray 4	java/lang/Object
    //   74: dup
    //   75: iconst_0
    //   76: aload_0
    //   77: aastore
    //   78: dup
    //   79: iconst_1
    //   80: aload_3
    //   81: invokevirtual 757	java/io/IOException:getMessage	()Ljava/lang/String;
    //   84: aastore
    //   85: invokestatic 538	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   88: aload_1
    //   89: ifnull +7 -> 96
    //   92: aload_1
    //   93: invokevirtual 252	java/io/InputStream:close	()V
    //   96: ldc2_w 752
    //   99: ldc_w 754
    //   102: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   105: aconst_null
    //   106: areturn
    //   107: astore_0
    //   108: aconst_null
    //   109: astore_1
    //   110: aload_1
    //   111: ifnull +7 -> 118
    //   114: aload_1
    //   115: invokevirtual 252	java/io/InputStream:close	()V
    //   118: aload_0
    //   119: athrow
    //   120: astore_0
    //   121: goto -70 -> 51
    //   124: astore_0
    //   125: goto -29 -> 96
    //   128: astore_1
    //   129: goto -11 -> 118
    //   132: astore_0
    //   133: goto -23 -> 110
    //   136: astore_0
    //   137: goto -27 -> 110
    //   140: astore_3
    //   141: goto -76 -> 65
    //   144: aload_1
    //   145: astore 4
    //   147: goto -125 -> 22
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	paramString	String
    //   0	150	1	paramOptions	BitmapFactory.Options
    //   0	150	2	paramInt	int
    //   0	150	3	paramVarArgs	int[]
    //   20	126	4	localOptions	BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   22	27	62	java/io/IOException
    //   22	27	107	finally
    //   47	51	120	java/io/IOException
    //   92	96	124	java/io/IOException
    //   114	118	128	java/io/IOException
    //   27	43	132	finally
    //   65	88	136	finally
    //   27	43	140	java/io/IOException
  }
  
  public static Bitmap a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int... paramVarArgs)
  {
    GMTrace.i(13754364329984L, 102478);
    if (bg.bq(paramArrayOfByte))
    {
      w.w("MicroMsg.BitmapUtil", "error input: data is null");
      GMTrace.o(13754364329984L, 102478);
      return null;
    }
    if ((paramInt1 < 0) || (paramInt2 < 0))
    {
      w.w("MicroMsg.BitmapUtil", "error input: targetWidth %d, targetHeight %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(13754364329984L, 102478);
      return null;
    }
    paramArrayOfByte = a(0, null, paramArrayOfByte, null, false, 0.0F, paramInt1, paramInt2, null, 0, paramVarArgs);
    GMTrace.o(13754364329984L, 102478);
    return paramArrayOfByte;
  }
  
  public static void a(Bitmap paramBitmap, int paramInt, Bitmap.CompressFormat paramCompressFormat, OutputStream paramOutputStream, boolean paramBoolean)
  {
    GMTrace.i(13757317120000L, 102500);
    paramBitmap.compress(paramCompressFormat, paramInt, paramOutputStream);
    if (paramBoolean)
    {
      w.i("MicroMsg.BitmapUtil", "saveBitmapToStream bitmap recycle. %s", new Object[] { paramBitmap });
      paramBitmap.recycle();
    }
    GMTrace.o(13757317120000L, 102500);
  }
  
  public static void a(Bitmap paramBitmap, int paramInt, Bitmap.CompressFormat paramCompressFormat, String paramString, boolean paramBoolean)
  {
    GMTrace.i(13757451337728L, 102501);
    if (bg.nm(paramString)) {
      throw new IOException("saveBitmapToImage pathName null or nil");
    }
    w.d("MicroMsg.BitmapUtil", "saving to " + paramString);
    localObject2 = null;
    Object localObject1 = null;
    FileOp.la(FileOp.kZ(paramString));
    try
    {
      OutputStream localOutputStream = FileOp.hA(paramString);
      localObject1 = localOutputStream;
      localObject2 = localOutputStream;
      a(paramBitmap, paramInt, paramCompressFormat, localOutputStream, paramBoolean);
      if (localOutputStream != null) {
        try
        {
          localOutputStream.close();
          GMTrace.o(13757451337728L, 102501);
          return;
        }
        catch (IOException paramBitmap)
        {
          GMTrace.o(13757451337728L, 102501);
          return;
        }
      }
      try
      {
        ((OutputStream)localObject2).close();
        throw paramBitmap;
        GMTrace.o(13757451337728L, 102501);
        return;
      }
      catch (IOException paramCompressFormat)
      {
        for (;;) {}
      }
    }
    catch (Exception paramBitmap)
    {
      localObject2 = localObject1;
      w.printErrStackTrace("MicroMsg.BitmapUtil", paramBitmap, "saveBitmapToImage failed: %s", new Object[] { paramString });
      localObject2 = localObject1;
      throw new IOException(paramBitmap);
    }
    finally
    {
      if (localObject2 == null) {}
    }
  }
  
  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2)
  {
    GMTrace.i(13750472015872L, 102449);
    boolean bool = a(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, false);
    GMTrace.o(13750472015872L, 102449);
    return bool;
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, int paramInt4, PInt paramPInt1, PInt paramPInt2)
  {
    GMTrace.i(13750874669056L, 102452);
    paramString1 = c(paramString1, 2000, 2000, paramInt4, 0, 1);
    try
    {
      paramPInt1.value = paramString1.getWidth();
      paramPInt2.value = paramString1.getHeight();
      a(paramString1, 90, paramCompressFormat, paramString2, true);
      GMTrace.o(13750874669056L, 102452);
      return true;
    }
    catch (IOException paramString1)
    {
      w.e("MicroMsg.BitmapUtil", "create thumbnail from orig failed: " + paramString2);
      GMTrace.o(13750874669056L, 102452);
    }
    return false;
  }
  
  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, String paramString3)
  {
    GMTrace.i(13750337798144L, 102448);
    boolean bool = a(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2 + paramString3, false);
    GMTrace.o(13750337798144L, 102448);
    return bool;
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(13751143104512L, 102454);
    paramBoolean = a(false, paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, false, new PInt(), new PInt());
    GMTrace.o(13751143104512L, 102454);
    return paramBoolean;
  }
  
  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, String paramString2, PInt paramPInt1, PInt paramPInt2)
  {
    GMTrace.i(13751545757696L, 102457);
    boolean bool = a(false, paramString1, paramInt1, paramInt2, paramCompressFormat, 80, paramString2, true, paramPInt1, paramPInt2, true);
    GMTrace.o(13751545757696L, 102457);
    return bool;
  }
  
  public static boolean a(String paramString1, int paramInt1, Bitmap.CompressFormat paramCompressFormat, int paramInt2, String paramString2)
  {
    GMTrace.i(13757048684544L, 102498);
    paramString1 = cF(paramString1, 1);
    if (paramString1 == null)
    {
      w.e("MicroMsg.BitmapUtil", "rotate: create bitmap fialed");
      GMTrace.o(13757048684544L, 102498);
      return false;
    }
    float f1 = paramString1.getWidth();
    float f2 = paramString1.getHeight();
    Object localObject = new Matrix();
    ((Matrix)localObject).setRotate(paramInt1, f1 / 2.0F, f2 / 2.0F);
    localObject = Bitmap.createBitmap(paramString1, 0, 0, (int)f1, (int)f2, (Matrix)localObject, true);
    if (paramString1 != localObject)
    {
      w.i("MicroMsg.BitmapUtil", "rotate bitmap recycle adjfjads fadsj fsadjf dsa. %s", new Object[] { paramString1.toString() });
      paramString1.recycle();
    }
    try
    {
      a((Bitmap)localObject, paramInt2, paramCompressFormat, paramString2, true);
      GMTrace.o(13757048684544L, 102498);
      return true;
    }
    catch (IOException paramString1)
    {
      w.printErrStackTrace("MicroMsg.BitmapUtil", paramString1, "create thumbnail from orig failed: " + paramString2, new Object[0]);
      GMTrace.o(13757048684544L, 102498);
    }
    return false;
  }
  
  public static boolean a(String paramString1, int paramInt, Bitmap.CompressFormat paramCompressFormat, String paramString2, String paramString3)
  {
    GMTrace.i(13757182902272L, 102499);
    boolean bool = a(paramString1, paramInt, paramCompressFormat, 90, paramString2 + paramString3);
    GMTrace.o(13757182902272L, 102499);
    return bool;
  }
  
  public static boolean a(String paramString1, Bitmap.CompressFormat paramCompressFormat, String paramString2, int paramInt)
  {
    GMTrace.i(13750740451328L, 102451);
    boolean bool = a(paramString1, 2000, 2000, paramCompressFormat, 90, paramString2, paramInt, new PInt(), new PInt());
    GMTrace.o(13750740451328L, 102451);
    return bool;
  }
  
  private static boolean a(boolean paramBoolean1, String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, boolean paramBoolean2, PInt paramPInt1, PInt paramPInt2)
  {
    GMTrace.i(13751411539968L, 102456);
    paramBoolean1 = a(false, paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, paramBoolean2, paramPInt1, paramPInt2, false);
    GMTrace.o(13751411539968L, 102456);
    return paramBoolean1;
  }
  
  private static boolean a(boolean paramBoolean1, String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, boolean paramBoolean2, PInt paramPInt1, PInt paramPInt2, boolean paramBoolean3)
  {
    GMTrace.i(13751679975424L, 102458);
    Bitmap localBitmap = e(paramString1, paramInt1, paramInt2, paramBoolean3);
    if (localBitmap == null)
    {
      GMTrace.o(13751679975424L, 102458);
      return false;
    }
    if (paramBoolean2)
    {
      paramInt1 = 0;
      Exif localExif = new Exif();
      try
      {
        paramInt2 = localExif.parseFromFile(paramString1);
        w.e("EXIFTEST", "parseFromFile ret = " + paramInt2);
        paramInt2 = localExif.getOrientationInDegree();
        paramInt1 = paramInt2;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.BitmapUtil", localIOException, "Can't read EXIF from " + paramString1, new Object[0]);
        }
        GMTrace.o(13751679975424L, 102458);
        return false;
      }
    }
    for (paramString1 = b(localBitmap, paramInt1);; paramString1 = localBitmap)
    {
      try
      {
        paramPInt1.value = paramString1.getWidth();
        paramPInt2.value = paramString1.getHeight();
        if (paramBoolean1)
        {
          paramInt1 = n.a(paramString1, paramInt3, paramString2);
          w.i("MicroMsg.BitmapUtil", "dkimgopt compressByQualityOptim ret:%d  [%d,%d,%d] path:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramString1.getWidth()), Integer.valueOf(paramString1.getHeight()), paramString2 });
          if (paramInt1 == 1)
          {
            GMTrace.o(13751679975424L, 102458);
            return true;
          }
        }
      }
      catch (IOException paramString1)
      {
        w.e("MicroMsg.BitmapUtil", "create thumbnail from orig failed: " + paramString2);
        GMTrace.o(13751679975424L, 102458);
        return false;
      }
      a(paramString1, paramInt3, paramCompressFormat, paramString2, true);
      GMTrace.o(13751679975424L, 102458);
      return true;
    }
  }
  
  public static Bitmap b(Bitmap paramBitmap, float paramFloat)
  {
    GMTrace.i(13756914466816L, 102497);
    if (paramFloat % 360.0F == 0.0F)
    {
      GMTrace.o(13756914466816L, 102497);
      return paramBitmap;
    }
    Object localObject = new Matrix();
    ((Matrix)localObject).reset();
    ((Matrix)localObject).setRotate(paramFloat, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2);
    for (;;)
    {
      try
      {
        localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
        StringBuilder localStringBuilder = new StringBuilder("resultBmp is null: ");
        if (localObject == null)
        {
          bool = true;
          w.d("MicroMsg.BitmapUtil", bool + "  degree:" + paramFloat);
          if (paramBitmap != localObject)
          {
            w.i("MicroMsg.BitmapUtil", "rotate bitmap recycle ajsdfasdf adsf. %s", new Object[] { paramBitmap });
            paramBitmap.recycle();
          }
          GMTrace.o(13756914466816L, 102497);
          return (Bitmap)localObject;
        }
      }
      catch (Throwable localThrowable)
      {
        w.d("MicroMsg.BitmapUtil", "createBitmap failed : %s ", new Object[] { bg.f(localThrowable) });
        GMTrace.o(13756914466816L, 102497);
        return paramBitmap;
      }
      boolean bool = false;
    }
  }
  
  public static Bitmap b(Bitmap paramBitmap, int paramInt)
  {
    GMTrace.i(13758659297280L, 102510);
    w.d("MicroMsg.BitmapUtil", "begin createChattingImage");
    long l1 = System.currentTimeMillis();
    if (paramBitmap == null)
    {
      w.w("MicroMsg.BitmapUtil", "sourceBitmap is null .");
      GMTrace.o(13758659297280L, 102510);
      return null;
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    if ((i <= 0) || (j <= 0))
    {
      w.w("MicroMsg.BitmapUtil", "sourceBitmap width or height is 0.");
      GMTrace.o(13758659297280L, 102510);
      return null;
    }
    long l2 = System.currentTimeMillis();
    Bitmap localBitmap;
    try
    {
      localBitmap = a(i, j, Bitmap.Config.ARGB_8888, false);
      localObject = (NinePatchDrawable)ab.getContext().getResources().getDrawable(paramInt);
      ((NinePatchDrawable)localObject).setBounds(0, 0, i, j);
      ((NinePatchDrawable)localObject).draw(new Canvas(localBitmap));
      w.d("MicroMsg.BitmapUtil", "create nine patch bitmap " + (System.currentTimeMillis() - l2));
      if (localBitmap == null)
      {
        w.e("MicroMsg.BitmapUtil", "[createChattingImage] maskBitmap is null.");
        GMTrace.o(13758659297280L, 102510);
        return null;
      }
    }
    catch (Exception paramBitmap)
    {
      w.e("MicroMsg.BitmapUtil", "[createChattingImage] create nine pathc bitmap faild.");
      GMTrace.o(13758659297280L, 102510);
      return null;
    }
    paramInt = localBitmap.getWidth();
    int k = localBitmap.getHeight();
    if ((paramInt <= 0) || (k <= 0))
    {
      w.w("MicroMsg.BitmapUtil", "maskBitmap width or height is 0.");
      GMTrace.o(13758659297280L, 102510);
      return null;
    }
    if ((k != j) || (paramInt != i))
    {
      w.e("MicroMsg.BitmapUtil", "maskHeiht maskWidth != height width.");
      GMTrace.o(13758659297280L, 102510);
      return null;
    }
    Object localObject = new int[i * j];
    int[] arrayOfInt = new int[paramInt * k];
    paramBitmap.getPixels((int[])localObject, 0, i, 0, 0, i, j);
    localBitmap.getPixels(arrayOfInt, 0, i, 0, 0, i, j);
    l2 = System.currentTimeMillis();
    paramInt = 0;
    for (;;)
    {
      try
      {
        if (paramInt < arrayOfInt.length)
        {
          if (arrayOfInt[paramInt] == -16777216) {
            break label502;
          }
          if (arrayOfInt[paramInt] == 0) {
            localObject[paramInt] = 0;
          } else if (arrayOfInt[paramInt] != -1) {
            localObject[paramInt] &= arrayOfInt[paramInt];
          }
        }
      }
      catch (Exception paramBitmap)
      {
        w.e("MicroMsg.BitmapUtil", paramBitmap.toString());
        w.d("MicroMsg.BitmapUtil", "meger pixels  " + (System.currentTimeMillis() - l2));
        l2 = System.currentTimeMillis();
        localBitmap.setPixels((int[])localObject, 0, i, 0, 0, i, j);
        w.d("MicroMsg.BitmapUtil", "setPixels " + (System.currentTimeMillis() - l2));
        w.d("MicroMsg.BitmapUtil", "createTime" + (System.currentTimeMillis() - l1));
        GMTrace.o(13758659297280L, 102510);
        return localBitmap;
      }
      label502:
      paramInt += 1;
    }
  }
  
  public static void b(BitmapFactory.Options paramOptions)
  {
    GMTrace.i(13755974942720L, 102490);
    if ((Build.VERSION.SDK_INT < 14) && (!vhn)) {
      try
      {
        BitmapFactory.Options.class.getField("inNativeAlloc").setBoolean(paramOptions, true);
        GMTrace.o(13755974942720L, 102490);
        return;
      }
      catch (Exception paramOptions)
      {
        w.printErrStackTrace("MicroMsg.BitmapUtil", paramOptions, "", new Object[0]);
        vhn = true;
      }
    }
    GMTrace.o(13755974942720L, 102490);
  }
  
  public static boolean b(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2)
  {
    GMTrace.i(13751277322240L, 102455);
    boolean bool = a(false, paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, true, new PInt(), new PInt());
    GMTrace.o(13751277322240L, 102455);
    return bool;
  }
  
  public static boolean b(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, String paramString2, PInt paramPInt1, PInt paramPInt2)
  {
    GMTrace.i(13752216846336L, 102462);
    if (bg.nm(paramString1))
    {
      w.w("MicroMsg.BitmapUtil", "file path is null.");
      GMTrace.o(13752216846336L, 102462);
      return false;
    }
    if (!FileOp.aZ(paramString1))
    {
      w.w("MicroMsg.BitmapUtil", "file did not exists.");
      GMTrace.o(13752216846336L, 102462);
      return false;
    }
    int i = 0;
    Exif localExif = new Exif();
    try
    {
      int j = localExif.parseFromFile(paramString1);
      w.e("EXIFTEST", "parseFromFile ret = " + j);
      j = localExif.getOrientationInDegree();
      i = j;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.BitmapUtil", localIOException, "Can't read EXIF from " + paramString1, new Object[0]);
        continue;
        paramString1 = b(e(paramString1, paramInt1, paramInt2, true), i);
      }
      try
      {
        paramPInt1.value = paramString1.getWidth();
        paramPInt2.value = paramString1.getHeight();
        a(paramString1, 80, paramCompressFormat, paramString2, true);
        GMTrace.o(13752216846336L, 102462);
        return true;
      }
      catch (IOException paramString1)
      {
        w.e("MicroMsg.BitmapUtil", "create thumbnail from orig failed: " + paramString2);
        GMTrace.o(13752216846336L, 102462);
      }
    }
    w.d("MicroMsg.BitmapUtil", "degress:%d", new Object[] { Integer.valueOf(i) });
    if ((i == 90) || (i == 270))
    {
      paramString1 = b(e(paramString1, paramInt2, paramInt1, true), i);
      if (paramString1 != null) {
        break label230;
      }
      GMTrace.o(13752216846336L, 102462);
      return false;
    }
    label230:
    return false;
  }
  
  public static DisplayMetrics bPv()
  {
    GMTrace.i(13755438071808L, 102486);
    if (hjd == null) {
      hjd = ab.getContext().getResources().getDisplayMetrics();
    }
    DisplayMetrics localDisplayMetrics = hjd;
    GMTrace.o(13755438071808L, 102486);
    return localDisplayMetrics;
  }
  
  public static Bitmap bg(byte[] paramArrayOfByte)
  {
    GMTrace.i(13754498547712L, 102479);
    paramArrayOfByte = decodeByteArray(paramArrayOfByte, 0, 0);
    GMTrace.o(13754498547712L, 102479);
    return paramArrayOfByte;
  }
  
  public static boolean bg(int paramInt1, int paramInt2)
  {
    GMTrace.i(13749800927232L, 102444);
    if (paramInt2 > paramInt1 * 2.0D)
    {
      GMTrace.o(13749800927232L, 102444);
      return true;
    }
    GMTrace.o(13749800927232L, 102444);
    return false;
  }
  
  public static Bitmap bh(byte[] paramArrayOfByte)
  {
    GMTrace.i(13754632765440L, 102480);
    paramArrayOfByte = a(paramArrayOfByte, 0, 0, 0, new int[0]);
    GMTrace.o(13754632765440L, 102480);
    return paramArrayOfByte;
  }
  
  public static boolean bh(int paramInt1, int paramInt2)
  {
    GMTrace.i(13749935144960L, 102445);
    if (paramInt1 > paramInt2 * 2.0D)
    {
      GMTrace.o(13749935144960L, 102445);
      return true;
    }
    GMTrace.o(13749935144960L, 102445);
    return false;
  }
  
  public static Bitmap c(Bitmap paramBitmap, float paramFloat)
  {
    GMTrace.i(13759330385920L, 102515);
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.drawARGB(0, 0, 0, 0);
    Paint localPaint = new Paint();
    localPaint.setAlpha((int)(255.0F * paramFloat));
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
    GMTrace.o(13759330385920L, 102515);
    return localBitmap;
  }
  
  public static Bitmap c(Bitmap paramBitmap, int paramInt)
  {
    GMTrace.i(13759196168192L, 102514);
    if (paramBitmap == null)
    {
      w.w("MicroMsg.BitmapUtil", "fastblur: but sentBitmap is null");
      GMTrace.o(13759196168192L, 102514);
      return null;
    }
    paramBitmap = paramBitmap.copy(paramBitmap.getConfig(), true);
    if (paramInt <= 0)
    {
      GMTrace.o(13759196168192L, 102514);
      return null;
    }
    int i13 = paramBitmap.getWidth();
    int i14 = paramBitmap.getHeight();
    int[] arrayOfInt1 = new int[i13 * i14];
    w.e("pix", i13 + " " + i14 + " " + arrayOfInt1.length);
    paramBitmap.getPixels(arrayOfInt1, 0, i13, 0, 0, i13, i14);
    int i19 = i13 - 1;
    int i15 = i14 - 1;
    int i16 = i13 * i14;
    int i17 = paramInt + paramInt + 1;
    int[] arrayOfInt2 = new int[i16];
    int[] arrayOfInt3 = new int[i16];
    int[] arrayOfInt4 = new int[i16];
    int[] arrayOfInt5 = new int[Math.max(i13, i14)];
    int i = i17 + 1 >> 1;
    int j = i * i;
    int[] arrayOfInt6 = new int[j * 256];
    i = 0;
    while (i < j * 256)
    {
      arrayOfInt6[i] = (i / j);
      i += 1;
    }
    int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { i17, 3 });
    int i18 = paramInt + 1;
    int i7 = 0;
    int i6 = 0;
    i = 0;
    int i5;
    int i8;
    int i2;
    int i3;
    int i4;
    int m;
    int n;
    int i1;
    int k;
    int i9;
    int[] arrayOfInt7;
    int i11;
    int i12;
    int i10;
    while (i7 < i14)
    {
      i5 = 0;
      i8 = -paramInt;
      j = 0;
      i2 = 0;
      i3 = 0;
      i4 = 0;
      m = 0;
      n = 0;
      i1 = 0;
      k = 0;
      if (i8 <= paramInt)
      {
        i9 = arrayOfInt1[(Math.min(i19, Math.max(i8, 0)) + i)];
        arrayOfInt7 = arrayOfInt[(i8 + paramInt)];
        arrayOfInt7[0] = ((0xFF0000 & i9) >> 16);
        arrayOfInt7[1] = ((0xFF00 & i9) >> 8);
        arrayOfInt7[2] = (i9 & 0xFF);
        i9 = i18 - Math.abs(i8);
        m += arrayOfInt7[0] * i9;
        n += arrayOfInt7[1] * i9;
        i1 += i9 * arrayOfInt7[2];
        if (i8 > 0)
        {
          i5 += arrayOfInt7[0];
          k += arrayOfInt7[1];
          j += arrayOfInt7[2];
        }
        for (;;)
        {
          i8 += 1;
          break;
          i2 += arrayOfInt7[0];
          i3 += arrayOfInt7[1];
          i4 += arrayOfInt7[2];
        }
      }
      i11 = paramInt;
      i9 = i5;
      i12 = 0;
      i5 = i4;
      i8 = j;
      i10 = k;
      j = i11;
      i4 = m;
      k = i5;
      m = i3;
      i3 = i2;
      i5 = i8;
      i8 = i10;
      i2 = i12;
      while (i2 < i13)
      {
        arrayOfInt2[i] = arrayOfInt6[i4];
        arrayOfInt3[i] = arrayOfInt6[n];
        arrayOfInt4[i] = arrayOfInt6[i1];
        arrayOfInt7 = arrayOfInt[((j - paramInt + i17) % i17)];
        i12 = arrayOfInt7[0];
        i11 = arrayOfInt7[1];
        i10 = arrayOfInt7[2];
        if (i7 == 0) {
          arrayOfInt5[i2] = Math.min(i2 + paramInt + 1, i19);
        }
        int i20 = arrayOfInt1[(arrayOfInt5[i2] + i6)];
        arrayOfInt7[0] = ((0xFF0000 & i20) >> 16);
        arrayOfInt7[1] = ((0xFF00 & i20) >> 8);
        arrayOfInt7[2] = (i20 & 0xFF);
        i9 += arrayOfInt7[0];
        i8 += arrayOfInt7[1];
        i5 += arrayOfInt7[2];
        i4 = i4 - i3 + i9;
        n = n - m + i8;
        i1 = i1 - k + i5;
        j = (j + 1) % i17;
        arrayOfInt7 = arrayOfInt[(j % i17)];
        i3 = i3 - i12 + arrayOfInt7[0];
        m = m - i11 + arrayOfInt7[1];
        k = k - i10 + arrayOfInt7[2];
        i9 -= arrayOfInt7[0];
        i8 -= arrayOfInt7[1];
        i5 -= arrayOfInt7[2];
        i += 1;
        i2 += 1;
      }
      i7 += 1;
      i6 += i13;
    }
    i = 0;
    while (i < i13)
    {
      m = 0;
      k = -paramInt;
      i6 = -paramInt;
      j = 0;
      i4 = 0;
      i2 = 0;
      n = 0;
      i5 = 0;
      i3 = 0;
      i1 = 0;
      i7 = k * i13;
      k = 0;
      if (i6 <= paramInt)
      {
        i8 = Math.max(0, i7) + i;
        arrayOfInt7 = arrayOfInt[(i6 + paramInt)];
        arrayOfInt7[0] = arrayOfInt2[i8];
        arrayOfInt7[1] = arrayOfInt3[i8];
        arrayOfInt7[2] = arrayOfInt4[i8];
        i9 = i18 - Math.abs(i6);
        i5 += arrayOfInt2[i8] * i9;
        i3 += arrayOfInt3[i8] * i9;
        i8 = i1 + arrayOfInt4[i8] * i9;
        if (i6 > 0)
        {
          m += arrayOfInt7[0];
          k += arrayOfInt7[1];
          j += arrayOfInt7[2];
        }
        for (;;)
        {
          i1 = i7;
          if (i6 < i15) {
            i1 = i7 + i13;
          }
          i6 += 1;
          i7 = i1;
          i1 = i8;
          break;
          i4 += arrayOfInt7[0];
          i2 += arrayOfInt7[1];
          n += arrayOfInt7[2];
        }
      }
      i6 = paramInt;
      i9 = i;
      i11 = 0;
      i8 = m;
      i7 = k;
      i10 = j;
      j = i9;
      m = i6;
      k = i11;
      i6 = i10;
      while (k < i14)
      {
        arrayOfInt1[j] = (0xFF000000 & arrayOfInt1[j] | arrayOfInt6[i5] << 16 | arrayOfInt6[i3] << 8 | arrayOfInt6[i1]);
        arrayOfInt7 = arrayOfInt[((m - paramInt + i17) % i17)];
        i11 = arrayOfInt7[0];
        i10 = arrayOfInt7[1];
        i9 = arrayOfInt7[2];
        if (i == 0) {
          arrayOfInt5[k] = (Math.min(k + i18, i15) * i13);
        }
        i12 = arrayOfInt5[k] + i;
        arrayOfInt7[0] = arrayOfInt2[i12];
        arrayOfInt7[1] = arrayOfInt3[i12];
        arrayOfInt7[2] = arrayOfInt4[i12];
        i8 += arrayOfInt7[0];
        i7 += arrayOfInt7[1];
        i6 += arrayOfInt7[2];
        i5 = i5 - i4 + i8;
        i3 = i3 - i2 + i7;
        i1 = i1 - n + i6;
        m = (m + 1) % i17;
        arrayOfInt7 = arrayOfInt[m];
        i4 = i4 - i11 + arrayOfInt7[0];
        i2 = i2 - i10 + arrayOfInt7[1];
        n = n - i9 + arrayOfInt7[2];
        i8 -= arrayOfInt7[0];
        i7 -= arrayOfInt7[1];
        i6 -= arrayOfInt7[2];
        j += i13;
        k += 1;
      }
      i += 1;
    }
    w.e("pix", i13 + " " + i14 + " " + i16);
    paramBitmap.setPixels(arrayOfInt1, 0, i13, 0, 0, i13, i14);
    GMTrace.o(13759196168192L, 102514);
    return paramBitmap;
  }
  
  public static Bitmap c(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(13751008886784L, 102453);
    Object localObject;
    float f2;
    float f1;
    Bitmap localBitmap;
    if (paramInt3 == 1)
    {
      paramString = a(paramString, 56, paramInt2, true, null, paramInt5);
      localObject = paramString;
      if (paramString == null) {
        break label260;
      }
      f2 = paramString.getWidth() / paramString.getHeight();
      f1 = f2;
      if (f2 > 2.5F) {
        f1 = 2.5F;
      }
      localBitmap = Bitmap.createBitmap(paramString, (paramString.getWidth() - (int)(56.0F * f1)) / 2, 0, (int)(f1 * 56.0F), 56);
      localObject = paramString;
      paramString = localBitmap;
    }
    for (;;)
    {
      if (localObject != paramString)
      {
        w.i("MicroMsg.BitmapUtil", "createLongPictureThumbNail bitmap recycle. %s", new Object[] { localObject });
        ((Bitmap)localObject).recycle();
      }
      if (paramString == null)
      {
        GMTrace.o(13751008886784L, 102453);
        return null;
        if (paramInt3 != 2) {
          break label265;
        }
        localBitmap = a(paramString, paramInt1, 56, true, null, paramInt5);
        localObject = localBitmap;
        if (localBitmap != null)
        {
          f2 = localBitmap.getHeight() / localBitmap.getWidth();
          f1 = f2;
          if (f2 > 2.5F) {
            f1 = 2.5F;
          }
          paramString = Bitmap.createBitmap(localBitmap, 0, (localBitmap.getHeight() - (int)(56.0F * f1)) / 2, 56, (int)(f1 * 56.0F));
          localObject = localBitmap;
        }
      }
      else
      {
        localObject = paramString;
        if (paramInt4 != 0) {
          localObject = b(paramString, paramInt4);
        }
        GMTrace.o(13751008886784L, 102453);
        return (Bitmap)localObject;
      }
      label260:
      paramString = null;
      continue;
      label265:
      localObject = null;
      paramString = null;
    }
  }
  
  public static void c(String paramString, PInt paramPInt1, PInt paramPInt2)
  {
    Object localObject = null;
    GMTrace.i(13758390861824L, 102508);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    b(localOptions);
    try
    {
      paramString = MMBitmapFactory.decodeStream(FileOp.openRead(paramString), null, localOptions, 0);
      if (paramString != null)
      {
        w.i("MicroMsg.BitmapUtil", "getRent bitmap recycle %s", new Object[] { paramString });
        paramString.recycle();
      }
      paramPInt1.value = localOptions.outWidth;
      paramPInt2.value = localOptions.outHeight;
      GMTrace.o(13758390861824L, 102508);
      return;
    }
    catch (FileNotFoundException paramString)
    {
      for (;;)
      {
        paramString = (String)localObject;
      }
    }
  }
  
  public static Bitmap cF(String paramString, int paramInt)
  {
    GMTrace.i(13752619499520L, 102465);
    paramString = a(paramString, 0, 0, 0.0F, null, paramInt, new int[0]);
    GMTrace.o(13752619499520L, 102465);
    return paramString;
  }
  
  public static Bitmap cY(View paramView)
  {
    GMTrace.i(13758525079552L, 102509);
    if (paramView == null)
    {
      GMTrace.o(13758525079552L, 102509);
      return null;
    }
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Drawable localDrawable = paramView.getBackground();
    if (localDrawable != null) {
      localDrawable.draw(localCanvas);
    }
    paramView.draw(localCanvas);
    GMTrace.o(13758525079552L, 102509);
    return localBitmap;
  }
  
  public static Bitmap cZ(View paramView)
  {
    GMTrace.i(17561718620160L, 130845);
    if (paramView == null)
    {
      GMTrace.o(17561718620160L, 130845);
      return null;
    }
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Object localObject1 = paramView.getBackground();
    if (localObject1 != null) {
      ((Drawable)localObject1).draw(localCanvas);
    }
    paramView.draw(localCanvas);
    paramView = h(paramView, (int)paramView.getX(), (int)paramView.getY());
    if (paramView.size() > 0)
    {
      paramView = paramView.iterator();
      while (paramView.hasNext())
      {
        localObject1 = (r)paramView.next();
        if ((localObject1 != null) && (((r)localObject1).vhD != null))
        {
          Object localObject2 = ((r)localObject1).vhD;
          localObject2 = ((TextureView)localObject2).getBitmap(((TextureView)localObject2).getWidth(), ((TextureView)localObject2).getHeight());
          if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled())) {
            w.e("MicroMsg.BitmapUtil", "get thumb bitmap null or is recycled");
          } else {
            localCanvas.drawBitmap((Bitmap)localObject2, ((r)localObject1).left, ((r)localObject1).top, null);
          }
        }
      }
    }
    GMTrace.o(17561718620160L, 130845);
    return localBitmap;
  }
  
  public static Bitmap createBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    GMTrace.i(15695555330048L, 116941);
    paramConfig = a(paramInt1, paramInt2, paramConfig, false);
    GMTrace.o(15695555330048L, 116941);
    return paramConfig;
  }
  
  public static Bitmap d(String paramString, float paramFloat)
  {
    GMTrace.i(13753156370432L, 102469);
    paramString = a(paramString, paramFloat, 1);
    GMTrace.o(13753156370432L, 102469);
    return paramString;
  }
  
  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(13754230112256L, 102477);
    paramArrayOfByte = a(paramArrayOfByte, paramInt1, paramInt2, 0, new int[0]);
    GMTrace.o(13754230112256L, 102477);
    return paramArrayOfByte;
  }
  
  public static Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions)
  {
    GMTrace.i(13754766983168L, 102481);
    paramString = a(paramString, paramOptions, 1, new int[0]);
    GMTrace.o(13754766983168L, 102481);
    return paramString;
  }
  
  public static Bitmap decodeStream(InputStream paramInputStream)
  {
    GMTrace.i(13755303854080L, 102485);
    paramInputStream = a(paramInputStream, 0.0F, 0, 0);
    GMTrace.o(13755303854080L, 102485);
    return paramInputStream;
  }
  
  public static Bitmap e(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(13756243378176L, 102492);
    paramString = a(paramString, paramInt1, paramInt2, paramBoolean, null, 0);
    GMTrace.o(13756243378176L, 102492);
    return paramString;
  }
  
  private static List<r> h(View paramView, int paramInt1, int paramInt2)
  {
    GMTrace.i(19013283348480L, 141660);
    ArrayList localArrayList = new ArrayList();
    if ((paramView instanceof TextureView))
    {
      r localr = new r();
      localr.vhD = ((TextureView)paramView);
      localr.left = paramInt1;
      localr.top = paramInt2;
      localArrayList.add(localr);
    }
    for (;;)
    {
      GMTrace.o(19013283348480L, 141660);
      return localArrayList;
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int i = 0;
        while (i < paramView.getChildCount())
        {
          localArrayList.addAll(h(paramView.getChildAt(i), (int)(paramView.getX() + paramInt1), (int)(paramView.getY() + paramInt2)));
          i += 1;
        }
      }
    }
  }
  
  public static Bitmap i(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(13758927732736L, 102512);
    if ((paramString == null) || (paramString.equals("")) || (paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0))
    {
      w.w("MicroMsg.BitmapUtil", "createLocation fail. srcResId or maskResId is null,or width/height <0");
      GMTrace.o(13758927732736L, 102512);
      return null;
    }
    paramString = decodeByteArray(e.d(paramString, 0, -1), 0, 0);
    if ((paramString == null) || (paramString.isRecycled()))
    {
      GMTrace.o(13758927732736L, 102512);
      return null;
    }
    long l = System.currentTimeMillis();
    Bitmap localBitmap = a(paramInt2, paramInt3, Bitmap.Config.ARGB_8888, false);
    Canvas localCanvas = new Canvas(localBitmap);
    w.d("MicroMsg.BitmapUtil", "bm size w %d h %d target w %d h %d", new Object[] { Integer.valueOf(paramString.getWidth()), Integer.valueOf(paramString.getHeight()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    localCanvas.drawBitmap(paramString, null, new Rect(0, 0, paramInt2, paramInt3), new Paint());
    w.d("MicroMsg.BitmapUtil", "create nine patch bitmap " + (System.currentTimeMillis() - l));
    paramString = b(localBitmap, paramInt1);
    GMTrace.o(13758927732736L, 102512);
    return paramString;
  }
  
  public static Bitmap k(Uri paramUri)
  {
    GMTrace.i(13753827459072L, 102474);
    paramUri = a(0, null, null, paramUri, false, 0.0F, 0, 0, null, 1, new int[0]);
    GMTrace.o(13753827459072L, 102474);
    return paramUri;
  }
  
  public static Bitmap t(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(13758793515008L, 102511);
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0) || (paramInt4 < 0))
    {
      w.w("MicroMsg.BitmapUtil", "createLocation fail. srcResId or maskResId is null,or width/height <0");
      GMTrace.o(13758793515008L, 102511);
      return null;
    }
    long l = System.currentTimeMillis();
    Bitmap localBitmap = a(paramInt3, paramInt4, Bitmap.Config.ARGB_8888, false);
    NinePatchDrawable localNinePatchDrawable = (NinePatchDrawable)ab.getContext().getResources().getDrawable(paramInt1);
    localNinePatchDrawable.setBounds(0, 0, paramInt3, paramInt4);
    localNinePatchDrawable.draw(new Canvas(localBitmap));
    w.d("MicroMsg.BitmapUtil", "create nine patch bitmap " + (System.currentTimeMillis() - l));
    localBitmap = b(localBitmap, paramInt2);
    GMTrace.o(13758793515008L, 102511);
    return localBitmap;
  }
  
  public static Bitmap t(Drawable paramDrawable)
  {
    GMTrace.i(13757988208640L, 102505);
    if ((paramDrawable instanceof BitmapDrawable))
    {
      paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
      GMTrace.o(13757988208640L, 102505);
      return paramDrawable;
    }
    Bitmap localBitmap = a(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888, false);
    Canvas localCanvas = new Canvas(localBitmap);
    paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
    paramDrawable.draw(localCanvas);
    GMTrace.o(13757988208640L, 102505);
    return localBitmap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
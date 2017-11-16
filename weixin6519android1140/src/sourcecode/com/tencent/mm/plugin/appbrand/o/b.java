package com.tencent.mm.plugin.appbrand.o;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.l;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.OutputStream;

public enum b
{
  static
  {
    GMTrace.i(10005126316032L, 74544);
    iGq = new b[0];
    GMTrace.o(10005126316032L, 74544);
  }
  
  public static boolean a(BitmapFactory.Options paramOptions)
  {
    GMTrace.i(18964964966400L, 141300);
    if (paramOptions == null)
    {
      GMTrace.o(18964964966400L, 141300);
      return false;
    }
    paramOptions = paramOptions.outMimeType;
    if (paramOptions == null)
    {
      GMTrace.o(18964964966400L, 141300);
      return false;
    }
    paramOptions = paramOptions.toLowerCase();
    if (paramOptions.indexOf("jpg") >= 0)
    {
      GMTrace.o(18964964966400L, 141300);
      return true;
    }
    if (paramOptions.indexOf("jpeg") >= 0)
    {
      GMTrace.o(18964964966400L, 141300);
      return true;
    }
    GMTrace.o(18964964966400L, 141300);
    return false;
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Bitmap.CompressFormat paramCompressFormat, int paramInt5, String paramString2)
  {
    GMTrace.i(10004857880576L, 74542);
    localObject4 = null;
    localObject3 = localObject4;
    try
    {
      w.i("MicroMsg.AppBrandImgUtil", "createThumbNailUnScale, srcWidth: %s, srcHeight: %s, width: %s, height: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4), Integer.valueOf(paramInt3) });
      localObject3 = localObject4;
      localObject2 = new BitmapFactory.Options();
      localObject3 = localObject4;
      localObject5 = new MMBitmapFactory.DecodeResultLogger();
      localObject3 = localObject4;
      d2 = paramInt2 * 1.0D / paramInt3;
      localObject3 = localObject4;
      d3 = paramInt1 * 1.0D / paramInt4;
      if ((paramInt1 != paramInt4) || (paramInt2 != paramInt3)) {
        break label168;
      }
      localObject3 = localObject4;
      localObject2 = b(paramString1, (BitmapFactory.Options)localObject2, (MMBitmapFactory.DecodeResultLogger)localObject5);
    }
    catch (IOException paramString1)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject5;
        double d2;
        double d3;
        label168:
        label192:
        Object localObject1;
        w.printErrStackTrace("MicroMsg.AppBrandImgUtil", paramString1, "create thumbnail from orig failed: %s", new Object[] { paramString2 });
        if (localObject3 != null) {}
        do
        {
          try
          {
            ((OutputStream)localObject3).close();
            GMTrace.o(10004857880576L, 74542);
            return false;
            d1 = d2;
            break label192;
            localObject3 = localObject4;
            w.i("MicroMsg.AppBrandImgUtil", "createThumbNailUnScale, sampleSize: %s", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject2).inSampleSize) });
            localObject3 = localObject4;
            localObject2 = b(paramString1, (BitmapFactory.Options)localObject2, (MMBitmapFactory.DecodeResultLogger)localObject5);
            break;
            localObject3 = localObject4;
            w.i("MicroMsg.AppBrandImgUtil", "createThumbNailUnScale, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()) });
            if (d2 < d3)
            {
              localObject3 = localObject4;
              paramInt1 = (int)Math.ceil(paramInt4 * 1.0D * paramInt2 / paramInt1);
              paramInt2 = paramInt4;
            }
            for (;;)
            {
              localObject3 = localObject4;
              int i = BackwardSupportUtil.ExifHelper.Rz(paramString1);
              if (i != 90)
              {
                paramInt4 = paramInt2;
                paramString1 = (String)localObject2;
                paramInt3 = paramInt1;
                if (i != 270) {}
              }
              else
              {
                localObject3 = localObject4;
                paramString1 = d.b((Bitmap)localObject2, i);
                paramInt3 = paramInt2;
                paramInt4 = paramInt1;
              }
              localObject3 = localObject4;
              localObject5 = Bitmap.createScaledBitmap(paramString1, paramInt4, paramInt3, true);
              if (localObject5 == null) {
                break;
              }
              localObject2 = localObject5;
              if (paramString1 != localObject5)
              {
                localObject3 = localObject4;
                l.yn().h(paramString1);
                localObject2 = localObject5;
              }
              localObject3 = localObject4;
              w.i("MicroMsg.AppBrandImgUtil", "createThumbNailUnScalebyUpload, degree %d, bm.width: %s, bm.height: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(((Bitmap)localObject2).getWidth()), Integer.valueOf(((Bitmap)localObject2).getHeight()) });
              localObject3 = localObject4;
              paramString1 = FileOp.hA(paramString2);
              localObject3 = paramString1;
              d.a((Bitmap)localObject2, paramInt5, paramCompressFormat, paramString1, false);
              localObject3 = paramString1;
              l.yn().h((Bitmap)localObject2);
              localObject3 = paramString1;
              paramString1.close();
              GMTrace.o(10004857880576L, 74542);
              return true;
              d1 = paramInt3 * 1.0D * paramInt1 / paramInt2;
              localObject3 = localObject4;
              d1 = Math.ceil(d1);
              paramInt2 = (int)d1;
              paramInt1 = paramInt3;
            }
          }
          catch (IOException paramString1)
          {
            for (;;)
            {
              continue;
              localObject2 = paramString1;
            }
          }
        } while (d2 >= d3);
        double d1 = d3;
      }
    }
    localObject3 = localObject4;
    w.i("MicroMsg.AppBrandImgUtil", "createThumbNailUnScale, result bm: %s", new Object[] { localObject2 });
    if (localObject2 == null)
    {
      GMTrace.o(10004857880576L, 74542);
      return false;
      localObject3 = localObject4;
      ((BitmapFactory.Options)localObject2).inSampleSize = 1;
      if (paramInt2 > paramInt3) {
        break label660;
      }
      if (paramInt1 > paramInt4)
      {
        break label660;
        localObject3 = localObject4;
        ((BitmapFactory.Options)localObject2).inSampleSize = ((int)localObject1);
        localObject3 = localObject4;
        if (((BitmapFactory.Options)localObject2).inSampleSize <= 1) {
          localObject3 = localObject4;
        }
      }
      for (((BitmapFactory.Options)localObject2).inSampleSize = 1;; ((BitmapFactory.Options)localObject2).inSampleSize += 1)
      {
        localObject3 = localObject4;
        if (paramInt2 * paramInt1 / ((BitmapFactory.Options)localObject2).inSampleSize / ((BitmapFactory.Options)localObject2).inSampleSize <= 2764800) {
          break;
        }
        localObject3 = localObject4;
      }
    }
  }
  
  private static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2)
  {
    GMTrace.i(10004589445120L, 74540);
    BitmapFactory.Options localOptions = d.RB(paramString1);
    if ((localOptions == null) || (localOptions.outWidth <= 0) || (localOptions.outHeight <= 0))
    {
      GMTrace.o(10004589445120L, 74540);
      return false;
    }
    boolean bool = a(paramString1, localOptions.outWidth, localOptions.outHeight, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2);
    GMTrace.o(10004589445120L, 74540);
    return bool;
  }
  
  private static Bitmap b(String paramString, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(10004723662848L, 74541);
    long l = System.currentTimeMillis();
    try
    {
      paramString = l.yn().a(paramString, paramOptions, paramDecodeResultLogger);
      w.d("MicroMsg.AppBrandImgUtil", "decodeWithRotateByExif used %dms bitmap: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramString });
      GMTrace.o(10004723662848L, 74541);
      return paramString;
    }
    catch (OutOfMemoryError paramString)
    {
      com.tencent.mm.bw.b.bVF();
      w.e("MicroMsg.AppBrandImgUtil", "OutOfMemoryError e " + paramString.getMessage());
      GMTrace.o(10004723662848L, 74541);
    }
    return null;
  }
  
  /* Error */
  public static boolean bp(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 224
    //   3: ldc -30
    //   5: invokestatic 18	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: invokestatic 230	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   12: l2i
    //   13: istore 8
    //   15: aload_1
    //   16: invokestatic 162	com/tencent/mm/sdk/platformtools/d:RB	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   19: astore 13
    //   21: aload 13
    //   23: ifnonnull +28 -> 51
    //   26: ldc 57
    //   28: ldc -24
    //   30: iconst_1
    //   31: anewarray 61	java/lang/Object
    //   34: dup
    //   35: iconst_0
    //   36: aload_1
    //   37: aastore
    //   38: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: ldc2_w 224
    //   44: ldc -30
    //   46: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   49: iconst_0
    //   50: ireturn
    //   51: aload 13
    //   53: ifnull +392 -> 445
    //   56: aload 13
    //   58: getfield 35	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   61: astore 14
    //   63: ldc 57
    //   65: new 200	java/lang/StringBuilder
    //   68: dup
    //   69: ldc -22
    //   71: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   74: aload 14
    //   76: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokestatic 236	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: aload 14
    //   87: ifnull +358 -> 445
    //   90: aload 14
    //   92: invokevirtual 41	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   95: astore 14
    //   97: aload 14
    //   99: ldc 43
    //   101: invokevirtual 47	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   104: iflt +308 -> 412
    //   107: iconst_1
    //   108: istore 9
    //   110: aload 13
    //   112: invokestatic 238	com/tencent/mm/plugin/appbrand/o/b:a	(Landroid/graphics/BitmapFactory$Options;)Z
    //   115: istore 10
    //   117: iconst_m1
    //   118: istore 4
    //   120: iload 10
    //   122: ifeq +1645 -> 1767
    //   125: aload_1
    //   126: invokestatic 243	com/tencent/mm/sdk/platformtools/MMNativeJpeg:queryQuality	(Ljava/lang/String;)I
    //   129: istore_3
    //   130: iload_3
    //   131: istore 4
    //   133: iload_3
    //   134: bipush 70
    //   136: if_icmpge +1631 -> 1767
    //   139: iload_3
    //   140: istore 4
    //   142: iload_3
    //   143: bipush 25
    //   145: if_icmple +1622 -> 1767
    //   148: iload_3
    //   149: istore 4
    //   151: iload_3
    //   152: istore 5
    //   154: iconst_0
    //   155: istore 6
    //   157: iconst_0
    //   158: istore_3
    //   159: iconst_0
    //   160: istore 7
    //   162: iload 10
    //   164: ifeq +315 -> 479
    //   167: iload 6
    //   169: istore_3
    //   170: aload_1
    //   171: invokestatic 249	com/tencent/mm/compatible/util/Exif:fromFile	(Ljava/lang/String;)Lcom/tencent/mm/compatible/util/Exif;
    //   174: astore 14
    //   176: iload 7
    //   178: istore_3
    //   179: aload 14
    //   181: ifnull +45 -> 226
    //   184: iload 6
    //   186: istore_3
    //   187: aload 14
    //   189: invokevirtual 252	com/tencent/mm/compatible/util/Exif:getOrientationInDegree	()I
    //   192: sipush 360
    //   195: irem
    //   196: istore 6
    //   198: iload 6
    //   200: istore_3
    //   201: ldc 57
    //   203: ldc -2
    //   205: iconst_1
    //   206: anewarray 61	java/lang/Object
    //   209: dup
    //   210: iconst_0
    //   211: aload 14
    //   213: invokevirtual 252	com/tencent/mm/compatible/util/Exif:getOrientationInDegree	()I
    //   216: invokestatic 67	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   219: aastore
    //   220: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   223: iload 6
    //   225: istore_3
    //   226: iload_3
    //   227: istore 6
    //   229: ldc 57
    //   231: new 200	java/lang/StringBuilder
    //   234: dup
    //   235: ldc_w 256
    //   238: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   241: aload 13
    //   243: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   246: invokevirtual 259	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   249: ldc_w 261
    //   252: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: aload 13
    //   257: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   260: invokevirtual 259	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   263: ldc_w 261
    //   266: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: iload 9
    //   271: invokevirtual 264	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   274: ldc_w 266
    //   277: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: iload 4
    //   282: invokevirtual 259	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   285: ldc_w 268
    //   288: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: iload 6
    //   293: invokevirtual 259	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   296: ldc_w 270
    //   299: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: iload 8
    //   304: invokevirtual 259	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   307: ldc_w 272
    //   310: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   316: invokestatic 274	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   319: aload 13
    //   321: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   324: aload 13
    //   326: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   329: iconst_2
    //   330: imul
    //   331: if_icmpge +18 -> 349
    //   334: aload 13
    //   336: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   339: aload 13
    //   341: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   344: iconst_2
    //   345: imul
    //   346: if_icmplt +538 -> 884
    //   349: aload 13
    //   351: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   354: aload 13
    //   356: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   359: imul
    //   360: ldc_w 275
    //   363: if_icmpgt +521 -> 884
    //   366: iload 8
    //   368: ldc_w 276
    //   371: if_icmpge +124 -> 495
    //   374: iload 9
    //   376: ifeq +119 -> 495
    //   379: iload 6
    //   381: ifne +114 -> 495
    //   384: ldc 57
    //   386: ldc_w 278
    //   389: invokestatic 274	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   392: aload_1
    //   393: aload_0
    //   394: invokestatic 281	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   397: lconst_0
    //   398: lcmp
    //   399: iflt +86 -> 485
    //   402: ldc2_w 224
    //   405: ldc -30
    //   407: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   410: iconst_1
    //   411: ireturn
    //   412: aload 14
    //   414: ldc 49
    //   416: invokevirtual 47	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   419: iflt +9 -> 428
    //   422: iconst_1
    //   423: istore 9
    //   425: goto -315 -> 110
    //   428: aload 14
    //   430: ldc_w 283
    //   433: invokevirtual 47	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   436: iflt +9 -> 445
    //   439: iconst_1
    //   440: istore 9
    //   442: goto -332 -> 110
    //   445: iconst_0
    //   446: istore 9
    //   448: goto -338 -> 110
    //   451: astore 14
    //   453: ldc 57
    //   455: new 200	java/lang/StringBuilder
    //   458: dup
    //   459: ldc_w 285
    //   462: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   465: aload 14
    //   467: invokevirtual 286	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   470: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   476: invokestatic 219	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   479: iload_3
    //   480: istore 6
    //   482: goto -253 -> 229
    //   485: ldc2_w 224
    //   488: ldc -30
    //   490: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   493: iconst_0
    //   494: ireturn
    //   495: new 31	android/graphics/BitmapFactory$Options
    //   498: dup
    //   499: invokespecial 75	android/graphics/BitmapFactory$Options:<init>	()V
    //   502: astore 16
    //   504: aload 16
    //   506: invokestatic 289	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/BitmapFactory$Options;)V
    //   509: aconst_null
    //   510: astore 13
    //   512: aconst_null
    //   513: astore 14
    //   515: aload_1
    //   516: invokestatic 293	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   519: astore 15
    //   521: aload 15
    //   523: astore 14
    //   525: aload 15
    //   527: astore 13
    //   529: aload 15
    //   531: invokevirtual 299	java/io/InputStream:markSupported	()Z
    //   534: ifne +1226 -> 1760
    //   537: aload 15
    //   539: astore 14
    //   541: aload 15
    //   543: astore 13
    //   545: aload 15
    //   547: instanceof 301
    //   550: ifeq +1210 -> 1760
    //   553: aload 15
    //   555: astore 14
    //   557: aload 15
    //   559: astore 13
    //   561: new 303	com/tencent/mm/sdk/platformtools/i
    //   564: dup
    //   565: aload 15
    //   567: checkcast 301	java/io/FileInputStream
    //   570: invokespecial 306	com/tencent/mm/sdk/platformtools/i:<init>	(Ljava/io/FileInputStream;)V
    //   573: astore 15
    //   575: aload 15
    //   577: astore 13
    //   579: aload 13
    //   581: ldc_w 307
    //   584: invokevirtual 311	java/io/InputStream:mark	(I)V
    //   587: aload 13
    //   589: aconst_null
    //   590: aload 16
    //   592: new 77	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger
    //   595: dup
    //   596: invokespecial 78	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:<init>	()V
    //   599: iconst_0
    //   600: iconst_0
    //   601: newarray <illegal type>
    //   603: invokestatic 317	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;I[I)Landroid/graphics/Bitmap;
    //   606: astore 14
    //   608: aload 13
    //   610: invokevirtual 320	java/io/InputStream:reset	()V
    //   613: aload 14
    //   615: ifnonnull +23 -> 638
    //   618: aload 13
    //   620: ifnull +8 -> 628
    //   623: aload 13
    //   625: invokevirtual 321	java/io/InputStream:close	()V
    //   628: ldc2_w 224
    //   631: ldc -30
    //   633: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   636: iconst_0
    //   637: ireturn
    //   638: iload 6
    //   640: i2f
    //   641: fstore_2
    //   642: aload 14
    //   644: fload_2
    //   645: invokestatic 129	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    //   648: iload 5
    //   650: getstatic 327	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   653: aload_0
    //   654: iconst_1
    //   655: invokestatic 330	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   658: iload 9
    //   660: ifeq +139 -> 799
    //   663: iload 6
    //   665: ifne +134 -> 799
    //   668: aload_0
    //   669: invokestatic 230	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   672: lstore 11
    //   674: ldc 57
    //   676: ldc_w 332
    //   679: iconst_3
    //   680: anewarray 61	java/lang/Object
    //   683: dup
    //   684: iconst_0
    //   685: iload 8
    //   687: invokestatic 67	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   690: aastore
    //   691: dup
    //   692: iconst_1
    //   693: lload 11
    //   695: invokestatic 190	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   698: aastore
    //   699: dup
    //   700: iconst_2
    //   701: bipush 10
    //   703: invokestatic 67	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   706: aastore
    //   707: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   710: iload 8
    //   712: i2l
    //   713: lload 11
    //   715: lsub
    //   716: ldc2_w 333
    //   719: lmul
    //   720: iload 8
    //   722: bipush 10
    //   724: imul
    //   725: i2l
    //   726: lcmp
    //   727: ifge +52 -> 779
    //   730: aload_0
    //   731: invokestatic 338	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   734: pop
    //   735: aload_1
    //   736: aload_0
    //   737: invokestatic 281	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   740: lstore 11
    //   742: lload 11
    //   744: lconst_0
    //   745: lcmp
    //   746: iflt +27 -> 773
    //   749: iconst_1
    //   750: istore 9
    //   752: aload 13
    //   754: ifnull +8 -> 762
    //   757: aload 13
    //   759: invokevirtual 321	java/io/InputStream:close	()V
    //   762: ldc2_w 224
    //   765: ldc -30
    //   767: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   770: iload 9
    //   772: ireturn
    //   773: iconst_0
    //   774: istore 9
    //   776: goto -24 -> 752
    //   779: aload 13
    //   781: ifnull +8 -> 789
    //   784: aload 13
    //   786: invokevirtual 321	java/io/InputStream:close	()V
    //   789: ldc2_w 224
    //   792: ldc -30
    //   794: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   797: iconst_1
    //   798: ireturn
    //   799: aload 13
    //   801: ifnull +8 -> 809
    //   804: aload 13
    //   806: invokevirtual 321	java/io/InputStream:close	()V
    //   809: ldc2_w 224
    //   812: ldc -30
    //   814: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   817: iconst_1
    //   818: ireturn
    //   819: astore_0
    //   820: aload 14
    //   822: astore 13
    //   824: ldc 57
    //   826: aload_0
    //   827: new 200	java/lang/StringBuilder
    //   830: dup
    //   831: ldc_w 340
    //   834: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   837: aload_1
    //   838: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   841: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   844: iconst_0
    //   845: anewarray 61	java/lang/Object
    //   848: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   851: aload 14
    //   853: ifnull +8 -> 861
    //   856: aload 14
    //   858: invokevirtual 321	java/io/InputStream:close	()V
    //   861: ldc2_w 224
    //   864: ldc -30
    //   866: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   869: iconst_0
    //   870: ireturn
    //   871: astore_0
    //   872: aload 13
    //   874: ifnull +8 -> 882
    //   877: aload 13
    //   879: invokevirtual 321	java/io/InputStream:close	()V
    //   882: aload_0
    //   883: athrow
    //   884: iload 8
    //   886: ldc_w 341
    //   889: if_icmpge +51 -> 940
    //   892: iload 9
    //   894: ifeq +46 -> 940
    //   897: iload 6
    //   899: ifne +41 -> 940
    //   902: ldc 57
    //   904: ldc_w 343
    //   907: invokestatic 274	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   910: aload_1
    //   911: aload_0
    //   912: invokestatic 281	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   915: lconst_0
    //   916: lcmp
    //   917: iflt +13 -> 930
    //   920: ldc2_w 224
    //   923: ldc -30
    //   925: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   928: iconst_1
    //   929: ireturn
    //   930: ldc2_w 224
    //   933: ldc -30
    //   935: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   938: iconst_0
    //   939: ireturn
    //   940: aload 13
    //   942: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   945: sipush 960
    //   948: if_icmpgt +14 -> 962
    //   951: aload 13
    //   953: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   956: sipush 640
    //   959: if_icmple +25 -> 984
    //   962: aload 13
    //   964: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   967: sipush 960
    //   970: if_icmpgt +324 -> 1294
    //   973: aload 13
    //   975: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   978: sipush 640
    //   981: if_icmpgt +313 -> 1294
    //   984: ldc 57
    //   986: ldc_w 345
    //   989: iconst_3
    //   990: anewarray 61	java/lang/Object
    //   993: dup
    //   994: iconst_0
    //   995: iload 8
    //   997: invokestatic 67	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1000: aastore
    //   1001: dup
    //   1002: iconst_1
    //   1003: aload 13
    //   1005: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1008: invokestatic 67	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1011: aastore
    //   1012: dup
    //   1013: iconst_2
    //   1014: aload 13
    //   1016: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1019: invokestatic 67	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1022: aastore
    //   1023: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1026: aload_1
    //   1027: invokestatic 230	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   1030: ldc2_w 346
    //   1033: lcmp
    //   1034: ifge +109 -> 1143
    //   1037: iload 9
    //   1039: ifeq +49 -> 1088
    //   1042: ldc 57
    //   1044: ldc_w 349
    //   1047: iconst_1
    //   1048: anewarray 61	java/lang/Object
    //   1051: dup
    //   1052: iconst_0
    //   1053: aload_1
    //   1054: aastore
    //   1055: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1058: aload_1
    //   1059: aload_0
    //   1060: invokestatic 281	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   1063: lconst_0
    //   1064: lcmp
    //   1065: iflt +13 -> 1078
    //   1068: ldc2_w 224
    //   1071: ldc -30
    //   1073: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1076: iconst_1
    //   1077: ireturn
    //   1078: ldc2_w 224
    //   1081: ldc -30
    //   1083: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1086: iconst_0
    //   1087: ireturn
    //   1088: aload 13
    //   1090: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1093: sipush 150
    //   1096: if_icmpge +47 -> 1143
    //   1099: aload 13
    //   1101: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1104: sipush 150
    //   1107: if_icmpge +36 -> 1143
    //   1110: aload_1
    //   1111: aload 13
    //   1113: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1116: aload 13
    //   1118: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1121: getstatic 352	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   1124: iload 5
    //   1126: aload_0
    //   1127: invokestatic 354	com/tencent/mm/plugin/appbrand/o/b:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;)Z
    //   1130: istore 9
    //   1132: ldc2_w 224
    //   1135: ldc -30
    //   1137: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1140: iload 9
    //   1142: ireturn
    //   1143: aload_1
    //   1144: aload 13
    //   1146: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1149: aload 13
    //   1151: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1154: getstatic 327	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1157: iload 5
    //   1159: aload_0
    //   1160: invokestatic 354	com/tencent/mm/plugin/appbrand/o/b:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;)Z
    //   1163: istore 10
    //   1165: iload 9
    //   1167: ifeq +116 -> 1283
    //   1170: iload 6
    //   1172: ifne +111 -> 1283
    //   1175: aload_0
    //   1176: invokestatic 230	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   1179: lstore 11
    //   1181: ldc 57
    //   1183: ldc_w 332
    //   1186: iconst_3
    //   1187: anewarray 61	java/lang/Object
    //   1190: dup
    //   1191: iconst_0
    //   1192: iload 8
    //   1194: invokestatic 67	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1197: aastore
    //   1198: dup
    //   1199: iconst_1
    //   1200: lload 11
    //   1202: invokestatic 190	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1205: aastore
    //   1206: dup
    //   1207: iconst_2
    //   1208: bipush 10
    //   1210: invokestatic 67	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1213: aastore
    //   1214: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1217: iload 8
    //   1219: i2l
    //   1220: lload 11
    //   1222: lsub
    //   1223: ldc2_w 333
    //   1226: lmul
    //   1227: iload 8
    //   1229: bipush 10
    //   1231: imul
    //   1232: i2l
    //   1233: lcmp
    //   1234: ifge +38 -> 1272
    //   1237: aload_0
    //   1238: invokestatic 338	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   1241: pop
    //   1242: aload_1
    //   1243: aload_0
    //   1244: invokestatic 281	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   1247: lconst_0
    //   1248: lcmp
    //   1249: iflt +13 -> 1262
    //   1252: ldc2_w 224
    //   1255: ldc -30
    //   1257: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1260: iconst_1
    //   1261: ireturn
    //   1262: ldc2_w 224
    //   1265: ldc -30
    //   1267: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1270: iconst_0
    //   1271: ireturn
    //   1272: ldc2_w 224
    //   1275: ldc -30
    //   1277: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1280: iload 10
    //   1282: ireturn
    //   1283: ldc2_w 224
    //   1286: ldc -30
    //   1288: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1291: iload 10
    //   1293: ireturn
    //   1294: aload 13
    //   1296: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1299: aload 13
    //   1301: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1304: if_icmplt +345 -> 1649
    //   1307: sipush 960
    //   1310: istore_3
    //   1311: aload 13
    //   1313: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1316: aload 13
    //   1318: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1321: if_icmplt +335 -> 1656
    //   1324: sipush 640
    //   1327: istore 4
    //   1329: aload 13
    //   1331: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1334: aload 13
    //   1336: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1339: iconst_2
    //   1340: imul
    //   1341: if_icmpge +18 -> 1359
    //   1344: aload 13
    //   1346: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1349: aload 13
    //   1351: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1354: iconst_2
    //   1355: imul
    //   1356: if_icmplt +391 -> 1747
    //   1359: ldc 57
    //   1361: new 200	java/lang/StringBuilder
    //   1364: dup
    //   1365: ldc_w 356
    //   1368: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1371: aload 13
    //   1373: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1376: invokevirtual 259	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1379: ldc_w 261
    //   1382: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1385: aload 13
    //   1387: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1390: invokevirtual 259	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1393: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1396: invokestatic 274	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1399: aload 13
    //   1401: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1404: ifgt +9 -> 1413
    //   1407: aload 13
    //   1409: iconst_1
    //   1410: putfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1413: aload 13
    //   1415: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1418: ifgt +9 -> 1427
    //   1421: aload 13
    //   1423: iconst_1
    //   1424: putfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1427: aload 13
    //   1429: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1432: aload 13
    //   1434: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1437: if_icmple +227 -> 1664
    //   1440: aload 13
    //   1442: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1445: aload 13
    //   1447: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1450: idiv
    //   1451: istore_3
    //   1452: iload_3
    //   1453: istore 7
    //   1455: iload_3
    //   1456: ifne +6 -> 1462
    //   1459: iconst_1
    //   1460: istore 7
    //   1462: ldc_w 275
    //   1465: iload 7
    //   1467: idiv
    //   1468: i2d
    //   1469: invokestatic 359	java/lang/Math:sqrt	(D)D
    //   1472: d2i
    //   1473: istore_3
    //   1474: aload 13
    //   1476: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1479: aload 13
    //   1481: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1484: if_icmple +195 -> 1679
    //   1487: iload_3
    //   1488: iload 7
    //   1490: imul
    //   1491: istore 4
    //   1493: ldc 57
    //   1495: new 200	java/lang/StringBuilder
    //   1498: dup
    //   1499: ldc_w 361
    //   1502: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1505: iload 4
    //   1507: invokevirtual 259	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1510: ldc_w 261
    //   1513: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1516: iload_3
    //   1517: invokevirtual 259	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1520: ldc_w 261
    //   1523: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1526: iload 7
    //   1528: invokevirtual 259	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1531: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1534: invokestatic 274	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1537: aload_1
    //   1538: iload_3
    //   1539: iload 4
    //   1541: getstatic 327	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   1544: iload 5
    //   1546: aload_0
    //   1547: invokestatic 354	com/tencent/mm/plugin/appbrand/o/b:a	(Ljava/lang/String;IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;)Z
    //   1550: istore 10
    //   1552: iload 9
    //   1554: ifeq +146 -> 1700
    //   1557: iload 6
    //   1559: ifne +141 -> 1700
    //   1562: aload_0
    //   1563: invokestatic 230	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   1566: lstore 11
    //   1568: ldc 57
    //   1570: ldc_w 332
    //   1573: iconst_3
    //   1574: anewarray 61	java/lang/Object
    //   1577: dup
    //   1578: iconst_0
    //   1579: iload 8
    //   1581: invokestatic 67	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1584: aastore
    //   1585: dup
    //   1586: iconst_1
    //   1587: lload 11
    //   1589: invokestatic 190	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1592: aastore
    //   1593: dup
    //   1594: iconst_2
    //   1595: bipush 10
    //   1597: invokestatic 67	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1600: aastore
    //   1601: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1604: iload 8
    //   1606: i2l
    //   1607: lload 11
    //   1609: lsub
    //   1610: ldc2_w 333
    //   1613: lmul
    //   1614: iload 8
    //   1616: bipush 10
    //   1618: imul
    //   1619: i2l
    //   1620: lcmp
    //   1621: ifge +79 -> 1700
    //   1624: aload_0
    //   1625: invokestatic 338	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   1628: pop
    //   1629: aload_1
    //   1630: aload_0
    //   1631: invokestatic 281	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   1634: lconst_0
    //   1635: lcmp
    //   1636: iflt +54 -> 1690
    //   1639: ldc2_w 224
    //   1642: ldc -30
    //   1644: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1647: iconst_1
    //   1648: ireturn
    //   1649: sipush 640
    //   1652: istore_3
    //   1653: goto -342 -> 1311
    //   1656: sipush 960
    //   1659: istore 4
    //   1661: goto -332 -> 1329
    //   1664: aload 13
    //   1666: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
    //   1669: aload 13
    //   1671: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
    //   1674: idiv
    //   1675: istore_3
    //   1676: goto -224 -> 1452
    //   1679: iload_3
    //   1680: istore 4
    //   1682: iload_3
    //   1683: iload 7
    //   1685: imul
    //   1686: istore_3
    //   1687: goto -194 -> 1493
    //   1690: ldc2_w 224
    //   1693: ldc -30
    //   1695: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1698: iconst_0
    //   1699: ireturn
    //   1700: ldc2_w 224
    //   1703: ldc -30
    //   1705: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1708: iload 10
    //   1710: ireturn
    //   1711: astore_0
    //   1712: goto -1084 -> 628
    //   1715: astore_0
    //   1716: goto -954 -> 762
    //   1719: astore_0
    //   1720: goto -931 -> 789
    //   1723: astore_0
    //   1724: goto -915 -> 809
    //   1727: astore_0
    //   1728: goto -867 -> 861
    //   1731: astore_1
    //   1732: goto -850 -> 882
    //   1735: astore_0
    //   1736: goto -864 -> 872
    //   1739: astore_0
    //   1740: aload 13
    //   1742: astore 14
    //   1744: goto -924 -> 820
    //   1747: iload_3
    //   1748: istore 7
    //   1750: iload 4
    //   1752: istore_3
    //   1753: iload 7
    //   1755: istore 4
    //   1757: goto -220 -> 1537
    //   1760: aload 15
    //   1762: astore 13
    //   1764: goto -1185 -> 579
    //   1767: bipush 70
    //   1769: istore 5
    //   1771: goto -1617 -> 154
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1774	0	paramString1	String
    //   0	1774	1	paramString2	String
    //   641	4	2	f	float
    //   129	1624	3	i	int
    //   118	1638	4	j	int
    //   152	1618	5	k	int
    //   155	1403	6	m	int
    //   160	1594	7	n	int
    //   13	1606	8	i1	int
    //   108	1445	9	bool1	boolean
    //   115	1594	10	bool2	boolean
    //   672	936	11	l	long
    //   19	1744	13	localObject1	Object
    //   61	368	14	localObject2	Object
    //   451	15	14	localException	Exception
    //   513	1230	14	localObject3	Object
    //   519	1242	15	localObject4	Object
    //   502	89	16	localOptions	BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   170	176	451	java/lang/Exception
    //   187	198	451	java/lang/Exception
    //   201	223	451	java/lang/Exception
    //   515	521	819	java/io/IOException
    //   529	537	819	java/io/IOException
    //   545	553	819	java/io/IOException
    //   561	575	819	java/io/IOException
    //   515	521	871	finally
    //   529	537	871	finally
    //   545	553	871	finally
    //   561	575	871	finally
    //   824	851	871	finally
    //   623	628	1711	java/io/IOException
    //   757	762	1715	java/io/IOException
    //   784	789	1719	java/io/IOException
    //   804	809	1723	java/io/IOException
    //   856	861	1727	java/io/IOException
    //   877	882	1731	java/io/IOException
    //   579	613	1735	finally
    //   642	658	1735	finally
    //   668	710	1735	finally
    //   730	742	1735	finally
    //   579	613	1739	java/io/IOException
    //   642	658	1739	java/io/IOException
    //   668	710	1739	java/io/IOException
    //   730	742	1739	java/io/IOException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\o\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.facedetect.model;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.Base64;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult;
import com.tencent.mm.plugin.facedetect.a.d;
import com.tencent.mm.pluginsdk.j.a.b.m;
import com.tencent.mm.protocal.c.gs;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.as;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class n
{
  public static String a(FaceProNative.FaceResult paramFaceResult)
  {
    GMTrace.i(5876052131840L, 43780);
    if ((paramFaceResult == null) || (paramFaceResult.result != 0))
    {
      w.e("MicroMsg.FaceUtils", "alvinluo face result is null or result code not 0");
      GMTrace.o(5876052131840L, 43780);
      return null;
    }
    try
    {
      String str = awv() + File.separator + "release_out.fd";
      gs localgs = new gs();
      localgs.tVs = com.tencent.mm.bm.b.aX(paramFaceResult.sidedata);
      localgs.tVt = com.tencent.mm.bm.b.aX(paramFaceResult.data);
      paramFaceResult = localgs.toByteArray();
      try
      {
        if (FileOp.lb(str)) {
          FileOp.j(str, paramFaceResult);
        }
        for (;;)
        {
          GMTrace.o(5876052131840L, 43780);
          return str;
          w.e("MicroMsg.FaceUtils", "hy: create file failed!");
        }
      }
      catch (Exception paramFaceResult)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.FaceUtils", paramFaceResult, "hy: err in save debug jpeg", new Object[0]);
        }
      }
      return null;
    }
    catch (Exception paramFaceResult)
    {
      w.printErrStackTrace("MicroMsg.FaceUtils", paramFaceResult, "", new Object[0]);
      GMTrace.o(5876052131840L, 43780);
    }
  }
  
  public static boolean awu()
  {
    GMTrace.i(5876857438208L, 43786);
    Object localObject2 = aww();
    Object localObject1 = awx();
    boolean bool1;
    if ((bg.nm((String)localObject2)) || (bg.nm((String)localObject1)))
    {
      w.w("MicroMsg.FaceUtils", "hy: not valid model path. start ");
      bool1 = false;
      if (!bool1)
      {
        w.i("MicroMsg.FaceUtils", "hy: trigger start download model file");
        com.tencent.mm.kernel.h.wS().a(new m(42), 0);
      }
      GMTrace.o(5876857438208L, 43786);
      return bool1;
    }
    localObject2 = new File((String)localObject2);
    localObject1 = new File((String)localObject1);
    if ((!((File)localObject2).exists()) && (!ns(0))) {
      w.e("MicroMsg.FaceUtils", "hy: no detect model in storage and sdcard");
    }
    for (boolean bool2 = false;; bool2 = true)
    {
      bool1 = bool2;
      if (((File)localObject1).exists()) {
        break;
      }
      bool1 = bool2;
      if (ns(1)) {
        break;
      }
      w.e("MicroMsg.FaceUtils", "hy: no alignment model in storage and sdcard");
      bool1 = false;
      break;
    }
  }
  
  public static String awv()
  {
    GMTrace.i(5876991655936L, 43787);
    if (a.kSw) {}
    for (String str = com.tencent.mm.compatible.util.h.getExternalStorageDirectory().getAbsolutePath() + File.separator + "face_detect";; str = ab.getContext().getFilesDir().getParent() + File.separator + "face_detect")
    {
      File localFile = new File(str);
      if (!localFile.exists())
      {
        w.i("MicroMsg.FaceUtils", "hy: face dir not exist. mk dir");
        localFile.mkdirs();
      }
      GMTrace.o(5876991655936L, 43787);
      return str;
    }
  }
  
  public static String aww()
  {
    GMTrace.i(5877125873664L, 43788);
    String str = awv() + File.separator + "ufdmtcc.bin";
    GMTrace.o(5877125873664L, 43788);
    return str;
  }
  
  public static String awx()
  {
    GMTrace.i(5877260091392L, 43789);
    String str = awv() + File.separator + "ufat.bin";
    GMTrace.o(5877260091392L, 43789);
    return str;
  }
  
  public static boolean b(Bitmap paramBitmap, String paramString)
  {
    GMTrace.i(5876320567296L, 43782);
    if (paramBitmap == null) {}
    try
    {
      w.w("MicroMsg.FaceUtils", "hy: bm is null. abort");
      GMTrace.o(5876320567296L, 43782);
      return false;
    }
    catch (Exception paramBitmap)
    {
      Object localObject1;
      Object localObject2;
      w.printErrStackTrace("MicroMsg.FaceUtils", paramBitmap, "hy: err in encrypt", new Object[0]);
      GMTrace.o(5876320567296L, 43782);
    }
    if (bg.nm(paramString))
    {
      w.i("MicroMsg.FaceUtils", "hy: username is null or nil. return");
      GMTrace.o(5876320567296L, 43782);
      return false;
    }
    localObject1 = new File(a.a.kSy);
    if (!((File)localObject1).exists()) {
      ((File)localObject1).mkdirs();
    }
    localObject1 = a.a.kSy + aa.RP(paramString);
    localObject2 = new File((String)localObject1);
    if (!((File)localObject2).exists())
    {
      w.i("MicroMsg.FaceUtils", "hy: last file already exists. del");
      ((File)localObject2).createNewFile();
    }
    localObject2 = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 85, (OutputStream)localObject2);
    paramBitmap = ((ByteArrayOutputStream)localObject2).toByteArray();
    ((ByteArrayOutputStream)localObject2).close();
    if (paramBitmap != null)
    {
      paramBitmap = a.g(paramBitmap, xz(paramString));
      if (paramBitmap.length <= 0)
      {
        w.w("MicroMsg.FaceUtils", "hy: enc err. return null");
        GMTrace.o(5876320567296L, 43782);
        return false;
      }
      FileOp.j((String)localObject1, paramBitmap);
      GMTrace.o(5876320567296L, 43782);
      return true;
    }
    w.w("MicroMsg.FaceUtils", "hy: nothing in stream");
    GMTrace.o(5876320567296L, 43782);
    return false;
    return false;
  }
  
  public static Bitmap m(final String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(5877662744576L, 43792);
    long l1 = System.currentTimeMillis();
    int i;
    Object localObject;
    if (paramBitmap == null)
    {
      paramBitmap = null;
      w.i("MicroMsg.FaceUtils", "hy: blur using %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
      i = 1;
      localObject = paramBitmap;
      if (paramBitmap == null)
      {
        w.w("MicroMsg.FaceUtils", "hy: null on blur. use default");
        i = 0;
        localObject = xy(paramString);
        if (localObject == null) {
          break label1603;
        }
      }
    }
    for (;;)
    {
      if (i != 0) {
        com.tencent.mm.sdk.f.e.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5873501995008L, 43761);
            long l = bg.Pw();
            n.b(this.kTP, paramString);
            w.i("MicroMsg.FaceUtils", "hy: saving blur bm using: %d ms", new Object[] { Long.valueOf(bg.aI(l)) });
            GMTrace.o(5873501995008L, 43761);
          }
        }, "FaceUtils_SaveFile");
      }
      GMTrace.o(5877662744576L, 43792);
      return (Bitmap)localObject;
      long l2 = System.currentTimeMillis();
      paramBitmap = Bitmap.createScaledBitmap(paramBitmap, Math.round(paramBitmap.getWidth() * 0.1F), Math.round(paramBitmap.getHeight() * 0.1F), false);
      paramBitmap = paramBitmap.copy(paramBitmap.getConfig(), true);
      int i13 = paramBitmap.getWidth();
      int i14 = paramBitmap.getHeight();
      localObject = new int[i13 * i14];
      w.e("pix", i13 + " " + i14 + " " + localObject.length);
      paramBitmap.getPixels((int[])localObject, 0, i13, 0, 0, i13, i14);
      int i17 = i13 - 1;
      int i15 = i14 - 1;
      int i16 = i13 * i14;
      int[] arrayOfInt1 = new int[i16];
      int[] arrayOfInt2 = new int[i16];
      int[] arrayOfInt3 = new int[i16];
      int[] arrayOfInt4 = new int[Math.max(i13, i14)];
      int[] arrayOfInt5 = new int[246016];
      i = 0;
      while (i < 246016)
      {
        arrayOfInt5[i] = (i / 961);
        i += 1;
      }
      int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { 61, 3 });
      int i6 = 0;
      int i5 = 0;
      int i7 = 0;
      int i1;
      int m;
      int i2;
      int i3;
      int i4;
      int j;
      int k;
      int i8;
      int n;
      int i9;
      int[] arrayOfInt6;
      int i12;
      int i10;
      int i11;
      for (;;)
      {
        if (i6 >= i14) {
          break label947;
        }
        i1 = 0;
        if (b.bY(l2))
        {
          paramBitmap = null;
          break;
        }
        m = 0;
        i2 = 0;
        i3 = 0;
        i4 = 0;
        i = 0;
        j = 0;
        k = 0;
        i8 = -30;
        n = 0;
        if (i8 <= 30)
        {
          i9 = localObject[(Math.min(i17, Math.max(i8, 0)) + i7)];
          arrayOfInt6 = arrayOfInt[(i8 + 30)];
          arrayOfInt6[0] = ((0xFF0000 & i9) >> 16);
          arrayOfInt6[1] = ((0xFF00 & i9) >> 8);
          arrayOfInt6[2] = (i9 & 0xFF);
          i9 = 31 - Math.abs(i8);
          i += arrayOfInt6[0] * i9;
          j += arrayOfInt6[1] * i9;
          k += i9 * arrayOfInt6[2];
          if (i8 > 0)
          {
            i1 += arrayOfInt6[0];
            n += arrayOfInt6[1];
            m += arrayOfInt6[2];
          }
          for (;;)
          {
            i8 += 1;
            break;
            i2 += arrayOfInt6[0];
            i3 += arrayOfInt6[1];
            i4 += arrayOfInt6[2];
          }
        }
        i12 = 30;
        if (b.bY(l2))
        {
          paramBitmap = null;
          break;
        }
        i8 = i3;
        i9 = m;
        i10 = n;
        i11 = 0;
        m = i12;
        n = j;
        i3 = i;
        i = i4;
        j = i8;
        i4 = i9;
        i8 = i10;
        i9 = i1;
        i1 = i11;
        while (i1 < i13)
        {
          arrayOfInt1[i7] = arrayOfInt5[i3];
          arrayOfInt2[i7] = arrayOfInt5[n];
          arrayOfInt3[i7] = arrayOfInt5[k];
          arrayOfInt6 = arrayOfInt[((m - 30 + 61) % 61)];
          i12 = arrayOfInt6[0];
          i11 = arrayOfInt6[1];
          i10 = arrayOfInt6[2];
          if (i6 == 0) {
            arrayOfInt4[i1] = Math.min(i1 + 30 + 1, i17);
          }
          int i18 = localObject[(arrayOfInt4[i1] + i5)];
          arrayOfInt6[0] = ((0xFF0000 & i18) >> 16);
          arrayOfInt6[1] = ((0xFF00 & i18) >> 8);
          arrayOfInt6[2] = (i18 & 0xFF);
          i9 += arrayOfInt6[0];
          i8 += arrayOfInt6[1];
          i4 += arrayOfInt6[2];
          i3 = i3 - i2 + i9;
          n = n - j + i8;
          k = k - i + i4;
          m = (m + 1) % 61;
          arrayOfInt6 = arrayOfInt[(m % 61)];
          i2 = i2 - i12 + arrayOfInt6[0];
          j = j - i11 + arrayOfInt6[1];
          i = i - i10 + arrayOfInt6[2];
          i9 -= arrayOfInt6[0];
          i8 -= arrayOfInt6[1];
          i4 -= arrayOfInt6[2];
          i7 += 1;
          i1 += 1;
        }
        i6 += 1;
        i5 += i13;
      }
      label947:
      i = 0;
      for (;;)
      {
        if (i >= i13) {
          break label1542;
        }
        m = 0;
        if (b.bY(l2))
        {
          paramBitmap = null;
          break;
        }
        j = 0;
        i4 = 0;
        i2 = 0;
        n = 0;
        i5 = 0;
        i3 = 0;
        i1 = 0;
        i6 = -30;
        i7 = i13 * -30;
        k = 0;
        if (i6 <= 30)
        {
          i8 = Math.max(0, i7) + i;
          arrayOfInt6 = arrayOfInt[(i6 + 30)];
          arrayOfInt6[0] = arrayOfInt1[i8];
          arrayOfInt6[1] = arrayOfInt2[i8];
          arrayOfInt6[2] = arrayOfInt3[i8];
          i9 = 31 - Math.abs(i6);
          i5 += arrayOfInt1[i8] * i9;
          i3 += arrayOfInt2[i8] * i9;
          i8 = i1 + arrayOfInt3[i8] * i9;
          if (i6 > 0)
          {
            m += arrayOfInt6[0];
            k += arrayOfInt6[1];
            j += arrayOfInt6[2];
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
            i4 += arrayOfInt6[0];
            i2 += arrayOfInt6[1];
            n += arrayOfInt6[2];
          }
        }
        if (b.bY(l2))
        {
          paramBitmap = null;
          break;
        }
        i10 = 30;
        i6 = i;
        i11 = 0;
        i8 = m;
        i7 = k;
        i9 = j;
        m = i10;
        k = i6;
        j = i11;
        i6 = i9;
        while (j < i14)
        {
          localObject[k] = (0xFF000000 & localObject[k] | arrayOfInt5[i5] << 16 | arrayOfInt5[i3] << 8 | arrayOfInt5[i1]);
          arrayOfInt6 = arrayOfInt[((m - 30 + 61) % 61)];
          i11 = arrayOfInt6[0];
          i10 = arrayOfInt6[1];
          i9 = arrayOfInt6[2];
          if (i == 0) {
            arrayOfInt4[j] = (Math.min(j + 31, i15) * i13);
          }
          i12 = arrayOfInt4[j] + i;
          arrayOfInt6[0] = arrayOfInt1[i12];
          arrayOfInt6[1] = arrayOfInt2[i12];
          arrayOfInt6[2] = arrayOfInt3[i12];
          i8 += arrayOfInt6[0];
          i7 += arrayOfInt6[1];
          i6 += arrayOfInt6[2];
          i5 = i5 - i4 + i8;
          i3 = i3 - i2 + i7;
          i1 = i1 - n + i6;
          m = (m + 1) % 61;
          arrayOfInt6 = arrayOfInt[m];
          i4 = i4 - i11 + arrayOfInt6[0];
          i2 = i2 - i10 + arrayOfInt6[1];
          n = n - i9 + arrayOfInt6[2];
          i8 -= arrayOfInt6[0];
          i7 -= arrayOfInt6[1];
          i6 -= arrayOfInt6[2];
          k += i13;
          j += 1;
        }
        i += 1;
      }
      label1542:
      w.e("pix", i13 + " " + i14 + " " + i16);
      paramBitmap.setPixels((int[])localObject, 0, i13, 0, 0, i13, i14);
      break;
      label1603:
      localObject = d.Ag(a.d.kPl);
    }
  }
  
  /* Error */
  public static void n(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 402
    //   3: ldc_w 404
    //   6: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc 29
    //   11: ldc_w 406
    //   14: iconst_2
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: aload_1
    //   21: aastore
    //   22: dup
    //   23: iconst_1
    //   24: aload_2
    //   25: aastore
    //   26: invokestatic 296	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   29: new 56	java/io/File
    //   32: dup
    //   33: aload_2
    //   34: invokespecial 157	java/io/File:<init>	(Ljava/lang/String;)V
    //   37: astore 4
    //   39: aload_0
    //   40: invokevirtual 410	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   43: aload_1
    //   44: invokevirtual 416	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   47: astore_0
    //   48: new 418	java/io/FileOutputStream
    //   51: dup
    //   52: aload 4
    //   54: invokespecial 421	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   57: astore_2
    //   58: sipush 1024
    //   61: newarray <illegal type>
    //   63: astore 5
    //   65: aload_0
    //   66: aload 5
    //   68: invokevirtual 427	java/io/InputStream:read	([B)I
    //   71: istore_3
    //   72: iload_3
    //   73: iconst_m1
    //   74: if_icmpeq +62 -> 136
    //   77: aload_2
    //   78: aload 5
    //   80: iconst_0
    //   81: iload_3
    //   82: invokevirtual 431	java/io/FileOutputStream:write	([BII)V
    //   85: goto -20 -> 65
    //   88: astore 4
    //   90: aload_0
    //   91: astore_1
    //   92: aload_2
    //   93: astore_0
    //   94: aload 4
    //   96: astore_2
    //   97: ldc 29
    //   99: aload_2
    //   100: ldc_w 433
    //   103: iconst_0
    //   104: anewarray 4	java/lang/Object
    //   107: invokestatic 110	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aload_1
    //   111: ifnull +7 -> 118
    //   114: aload_1
    //   115: invokevirtual 434	java/io/InputStream:close	()V
    //   118: aload_0
    //   119: ifnull +7 -> 126
    //   122: aload_0
    //   123: invokevirtual 435	java/io/FileOutputStream:close	()V
    //   126: ldc2_w 402
    //   129: ldc_w 404
    //   132: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   135: return
    //   136: aload_2
    //   137: invokevirtual 438	java/io/FileOutputStream:flush	()V
    //   140: ldc 29
    //   142: ldc_w 440
    //   145: iconst_2
    //   146: anewarray 4	java/lang/Object
    //   149: dup
    //   150: iconst_0
    //   151: aload_1
    //   152: aastore
    //   153: dup
    //   154: iconst_1
    //   155: aload 4
    //   157: invokevirtual 443	java/io/File:length	()J
    //   160: invokestatic 293	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   163: aastore
    //   164: invokestatic 296	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   167: aload_0
    //   168: ifnull +7 -> 175
    //   171: aload_0
    //   172: invokevirtual 434	java/io/InputStream:close	()V
    //   175: aload_2
    //   176: invokevirtual 435	java/io/FileOutputStream:close	()V
    //   179: ldc2_w 402
    //   182: ldc_w 404
    //   185: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   188: return
    //   189: astore_0
    //   190: ldc2_w 402
    //   193: ldc_w 404
    //   196: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   199: return
    //   200: astore_0
    //   201: ldc2_w 402
    //   204: ldc_w 404
    //   207: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   210: return
    //   211: astore_1
    //   212: aconst_null
    //   213: astore_0
    //   214: aconst_null
    //   215: astore_2
    //   216: aload_0
    //   217: ifnull +7 -> 224
    //   220: aload_0
    //   221: invokevirtual 434	java/io/InputStream:close	()V
    //   224: aload_2
    //   225: ifnull +7 -> 232
    //   228: aload_2
    //   229: invokevirtual 435	java/io/FileOutputStream:close	()V
    //   232: aload_1
    //   233: athrow
    //   234: astore_0
    //   235: goto -3 -> 232
    //   238: astore_1
    //   239: aconst_null
    //   240: astore_2
    //   241: goto -25 -> 216
    //   244: astore_1
    //   245: goto -29 -> 216
    //   248: astore_2
    //   249: aload_1
    //   250: astore 4
    //   252: aload_2
    //   253: astore_1
    //   254: aload_0
    //   255: astore_2
    //   256: aload 4
    //   258: astore_0
    //   259: goto -43 -> 216
    //   262: astore_2
    //   263: aconst_null
    //   264: astore_1
    //   265: aconst_null
    //   266: astore_0
    //   267: goto -170 -> 97
    //   270: astore_2
    //   271: aconst_null
    //   272: astore 4
    //   274: aload_0
    //   275: astore_1
    //   276: aload 4
    //   278: astore_0
    //   279: goto -182 -> 97
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	282	0	paramContext	Context
    //   0	282	1	paramString1	String
    //   0	282	2	paramString2	String
    //   71	11	3	i	int
    //   37	16	4	localFile	File
    //   88	68	4	localException	Exception
    //   250	27	4	str	String
    //   63	16	5	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   58	65	88	java/lang/Exception
    //   65	72	88	java/lang/Exception
    //   77	85	88	java/lang/Exception
    //   136	167	88	java/lang/Exception
    //   171	175	189	java/lang/Exception
    //   175	179	189	java/lang/Exception
    //   114	118	200	java/lang/Exception
    //   122	126	200	java/lang/Exception
    //   29	48	211	finally
    //   220	224	234	java/lang/Exception
    //   228	232	234	java/lang/Exception
    //   48	58	238	finally
    //   58	65	244	finally
    //   65	72	244	finally
    //   77	85	244	finally
    //   136	167	244	finally
    //   97	110	248	finally
    //   29	48	262	java/lang/Exception
    //   48	58	270	java/lang/Exception
  }
  
  public static boolean n(Activity paramActivity)
  {
    GMTrace.i(5876589002752L, 43784);
    boolean bool1 = com.tencent.mm.pluginsdk.h.a.aS(paramActivity, "android.permission.CAMERA");
    boolean bool2 = com.tencent.mm.pluginsdk.h.a.aS(paramActivity, "android.permission.RECORD_AUDIO");
    w.d("MicroMsg.FaceUtils", "summerper checkPermission checkCamera[%b], checkAudio[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), bg.bQW(), paramActivity });
    ArrayList localArrayList = new ArrayList();
    if (!bool1) {
      localArrayList.add("android.permission.CAMERA");
    }
    if (!bool2) {
      localArrayList.add("android.permission.RECORD_AUDIO");
    }
    if ((!bool1) || (!bool2))
    {
      w.i("MicroMsg.FaceUtils", "hy: above 23 and no permission. requesting...");
      android.support.v4.app.a.a(paramActivity, (String[])localArrayList.toArray(new String[localArrayList.size()]), 23);
      GMTrace.o(5876589002752L, 43784);
      return false;
    }
    GMTrace.o(5876589002752L, 43784);
    return true;
  }
  
  private static boolean ns(int paramInt)
  {
    GMTrace.i(5877394309120L, 43790);
    String str = "";
    switch (paramInt)
    {
    }
    while (bg.nm(str))
    {
      w.w("MicroMsg.FaceUtils", "hy: no such path for type: %d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(5877394309120L, 43790);
      return false;
      str = as.gnb.B("LAST_LOGIN_FACE_MODEL_SDCARD_PATH_DETECT", "");
      continue;
      str = as.gnb.B("LAST_LOGIN_FACE_MODEL_SDCARD_PATH_ALIGNMENT", "");
    }
    if (new File(str).exists())
    {
      File localFile = new File(nt(paramInt));
      if (localFile.exists()) {
        localFile.delete();
      }
      com.tencent.mm.a.e.o(str, nt(paramInt));
      GMTrace.o(5877394309120L, 43790);
      return true;
    }
    w.e("MicroMsg.FaceUtils", "originFile file not exist");
    GMTrace.o(5877394309120L, 43790);
    return false;
  }
  
  public static String nt(int paramInt)
  {
    GMTrace.i(5877528526848L, 43791);
    switch (paramInt)
    {
    default: 
      GMTrace.o(5877528526848L, 43791);
      return "";
    case 0: 
      str = aww();
      GMTrace.o(5877528526848L, 43791);
      return str;
    }
    String str = awx();
    GMTrace.o(5877528526848L, 43791);
    return str;
  }
  
  public static void o(Activity paramActivity)
  {
    GMTrace.i(5876723220480L, 43785);
    paramActivity.getWindow().setFlags(1024, 1024);
    GMTrace.o(5876723220480L, 43785);
  }
  
  public static String xA(String paramString)
  {
    GMTrace.i(5877796962304L, 43793);
    paramString = g.n((bg.Pw() + ", " + paramString).getBytes());
    GMTrace.o(5877796962304L, 43793);
    return paramString;
  }
  
  public static Bitmap xy(String paramString)
  {
    GMTrace.i(5876186349568L, 43781);
    try
    {
      if (bg.nm(paramString))
      {
        w.i("MicroMsg.FaceUtils", "hy: username is null or nil. return");
        GMTrace.o(5876186349568L, 43781);
        return null;
      }
      Object localObject = a.a.kSy + aa.RP(paramString);
      if (!new File((String)localObject).exists())
      {
        w.w("MicroMsg.FaceUtils", "hy: no last file. return");
        GMTrace.o(5876186349568L, 43781);
        return null;
      }
      localObject = FileOp.c((String)localObject, 0, -1);
      if (localObject != null)
      {
        paramString = a.g((byte[])localObject, xz(paramString));
        if (paramString.length <= 0)
        {
          w.w("MicroMsg.FaceUtils", "hy: decrypt err. return null");
          GMTrace.o(5876186349568L, 43781);
          return null;
        }
        paramString = com.tencent.mm.compatible.f.a.decodeByteArray(paramString, 0, paramString.length);
        GMTrace.o(5876186349568L, 43781);
        return paramString;
      }
      w.w("MicroMsg.FaceUtils", "hy: nothing in file");
      GMTrace.o(5876186349568L, 43781);
      return null;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.FaceUtils", paramString, "hy: err in encrypt", new Object[0]);
      GMTrace.o(5876186349568L, 43781);
    }
    return null;
  }
  
  private static String xz(String paramString)
  {
    GMTrace.i(5876454785024L, 43783);
    paramString = Base64.encodeToString((paramString + paramString.hashCode()).getBytes(), 0);
    GMTrace.o(5876454785024L, 43783);
    return paramString;
  }
  
  public static final class a
  {
    public static byte[] g(byte[] paramArrayOfByte, String paramString)
    {
      int n = 0;
      GMTrace.i(5861825052672L, 43674);
      byte[] arrayOfByte2 = paramString.getBytes();
      byte[] arrayOfByte1 = new byte['Ā'];
      int j = 0;
      while (j < 256)
      {
        arrayOfByte1[j] = ((byte)j);
        j += 1;
      }
      int k;
      int m;
      if ((arrayOfByte2 == null) || (arrayOfByte2.length == 0))
      {
        paramString = null;
        arrayOfByte1 = new byte[paramArrayOfByte.length];
        if (paramString != null)
        {
          k = 0;
          m = 0;
          j = n;
        }
      }
      else
      {
        while (j < paramArrayOfByte.length)
        {
          m = m + 1 & 0xFF;
          k = k + (paramString[m] & 0xFF) & 0xFF;
          int i = paramString[m];
          paramString[m] = paramString[k];
          paramString[k] = i;
          n = paramString[m];
          int i1 = paramString[k];
          int i2 = paramArrayOfByte[j];
          arrayOfByte1[j] = ((byte)(paramString[((n & 0xFF) + (i1 & 0xFF) & 0xFF)] ^ i2));
          j += 1;
          continue;
          k = 0;
          m = 0;
          j = 0;
          for (;;)
          {
            paramString = arrayOfByte1;
            if (k >= 256) {
              break;
            }
            m = m + ((arrayOfByte2[j] & 0xFF) + (arrayOfByte1[k] & 0xFF)) & 0xFF;
            i = arrayOfByte1[k];
            arrayOfByte1[k] = arrayOfByte1[m];
            arrayOfByte1[m] = i;
            j = (j + 1) % arrayOfByte2.length;
            k += 1;
          }
        }
      }
      GMTrace.o(5861825052672L, 43674);
      return arrayOfByte1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

public class MMNativeJpeg
{
  public static final int FAKE_PARTIAL_PROGRESSIVE_QUALITY = 25;
  public static final String TAG = "MMJPEG.JAVA";
  
  public MMNativeJpeg()
  {
    GMTrace.i(13770738892800L, 102600);
    GMTrace.o(13770738892800L, 102600);
  }
  
  /* Error */
  public static boolean Convert2Baseline(String paramString, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 35
    //   3: ldc 37
    //   5: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 41	com/tencent/mm/sdk/platformtools/MMNativeJpeg:isProgressive	(Ljava/lang/String;)Z
    //   12: ifne +28 -> 40
    //   15: ldc 11
    //   17: ldc 43
    //   19: iconst_1
    //   20: anewarray 4	java/lang/Object
    //   23: dup
    //   24: iconst_0
    //   25: aload_0
    //   26: aastore
    //   27: invokestatic 49	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: ldc2_w 35
    //   33: ldc 37
    //   35: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   38: iconst_1
    //   39: ireturn
    //   40: aconst_null
    //   41: astore 7
    //   43: aconst_null
    //   44: astore 4
    //   46: aconst_null
    //   47: astore 6
    //   49: aload 4
    //   51: astore_3
    //   52: aload_0
    //   53: invokestatic 55	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   56: astore 8
    //   58: aload 8
    //   60: astore 5
    //   62: aload 8
    //   64: ifnonnull +22 -> 86
    //   67: aload 4
    //   69: astore_3
    //   70: ldc 11
    //   72: ldc 57
    //   74: invokestatic 60	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: aload 4
    //   79: astore_3
    //   80: aload_0
    //   81: invokestatic 63	com/tencent/mm/sdk/platformtools/MMNativeJpeg:decodeAsBitmap	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   84: astore 5
    //   86: aload 5
    //   88: ifnull +104 -> 192
    //   91: aload 4
    //   93: astore_3
    //   94: new 65	java/lang/StringBuilder
    //   97: dup
    //   98: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   101: aload_0
    //   102: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: ldc 72
    //   107: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: astore 8
    //   115: aload 4
    //   117: astore_3
    //   118: getstatic 82	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   121: astore 9
    //   123: aload 4
    //   125: astore_3
    //   126: new 84	java/io/FileOutputStream
    //   129: dup
    //   130: aload 8
    //   132: invokespecial 87	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   135: astore 4
    //   137: aload 4
    //   139: astore_3
    //   140: aload 5
    //   142: aload 9
    //   144: iload_1
    //   145: aload 4
    //   147: invokevirtual 93	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   150: ifeq +44 -> 194
    //   153: ldc 11
    //   155: ldc 95
    //   157: iconst_1
    //   158: anewarray 4	java/lang/Object
    //   161: dup
    //   162: iconst_0
    //   163: aload 8
    //   165: aastore
    //   166: invokestatic 97	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: aload 8
    //   171: aload_0
    //   172: iconst_1
    //   173: invokestatic 103	com/tencent/mm/sdk/platformtools/j:r	(Ljava/lang/String;Ljava/lang/String;Z)Z
    //   176: istore_2
    //   177: aload 4
    //   179: invokevirtual 106	java/io/FileOutputStream:close	()V
    //   182: ldc2_w 35
    //   185: ldc 37
    //   187: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   190: iload_2
    //   191: ireturn
    //   192: aconst_null
    //   193: astore_3
    //   194: aload_3
    //   195: ifnull +7 -> 202
    //   198: aload_3
    //   199: invokevirtual 106	java/io/FileOutputStream:close	()V
    //   202: ldc2_w 35
    //   205: ldc 37
    //   207: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   210: iconst_0
    //   211: ireturn
    //   212: astore 4
    //   214: aload 6
    //   216: astore_0
    //   217: aload_0
    //   218: astore_3
    //   219: ldc 11
    //   221: ldc 108
    //   223: iconst_1
    //   224: anewarray 4	java/lang/Object
    //   227: dup
    //   228: iconst_0
    //   229: aload 4
    //   231: invokestatic 112	com/tencent/mm/sdk/platformtools/MMNativeJpeg:exception2String	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   234: aastore
    //   235: invokestatic 49	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   238: aload_0
    //   239: ifnull -37 -> 202
    //   242: aload_0
    //   243: invokevirtual 106	java/io/FileOutputStream:close	()V
    //   246: goto -44 -> 202
    //   249: astore_0
    //   250: goto -48 -> 202
    //   253: astore_0
    //   254: aload 7
    //   256: astore_0
    //   257: aload_0
    //   258: astore_3
    //   259: ldc 11
    //   261: ldc 114
    //   263: invokestatic 116	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   266: aload_0
    //   267: ifnull -65 -> 202
    //   270: aload_0
    //   271: invokevirtual 106	java/io/FileOutputStream:close	()V
    //   274: goto -72 -> 202
    //   277: astore_0
    //   278: goto -76 -> 202
    //   281: astore_0
    //   282: aload_3
    //   283: ifnull +7 -> 290
    //   286: aload_3
    //   287: invokevirtual 106	java/io/FileOutputStream:close	()V
    //   290: aload_0
    //   291: athrow
    //   292: astore_0
    //   293: goto -111 -> 182
    //   296: astore_0
    //   297: goto -95 -> 202
    //   300: astore_3
    //   301: goto -11 -> 290
    //   304: astore_0
    //   305: aload 4
    //   307: astore_3
    //   308: goto -26 -> 282
    //   311: astore_0
    //   312: aload 4
    //   314: astore_0
    //   315: goto -58 -> 257
    //   318: astore_3
    //   319: aload 4
    //   321: astore_0
    //   322: aload_3
    //   323: astore 4
    //   325: goto -108 -> 217
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	328	0	paramString	String
    //   0	328	1	paramInt	int
    //   176	15	2	bool	boolean
    //   51	236	3	localObject1	Object
    //   300	1	3	localException1	Exception
    //   307	1	3	localException2	Exception
    //   318	5	3	localException3	Exception
    //   44	134	4	localFileOutputStream	java.io.FileOutputStream
    //   212	108	4	localException4	Exception
    //   323	1	4	localObject2	Object
    //   60	81	5	localObject3	Object
    //   47	168	6	localObject4	Object
    //   41	214	7	localObject5	Object
    //   56	114	8	localObject6	Object
    //   121	22	9	localCompressFormat	android.graphics.Bitmap.CompressFormat
    // Exception table:
    //   from	to	target	type
    //   52	58	212	java/lang/Exception
    //   70	77	212	java/lang/Exception
    //   80	86	212	java/lang/Exception
    //   94	115	212	java/lang/Exception
    //   118	123	212	java/lang/Exception
    //   126	137	212	java/lang/Exception
    //   242	246	249	java/lang/Exception
    //   52	58	253	java/lang/OutOfMemoryError
    //   70	77	253	java/lang/OutOfMemoryError
    //   80	86	253	java/lang/OutOfMemoryError
    //   94	115	253	java/lang/OutOfMemoryError
    //   118	123	253	java/lang/OutOfMemoryError
    //   126	137	253	java/lang/OutOfMemoryError
    //   270	274	277	java/lang/Exception
    //   52	58	281	finally
    //   70	77	281	finally
    //   80	86	281	finally
    //   94	115	281	finally
    //   118	123	281	finally
    //   126	137	281	finally
    //   219	238	281	finally
    //   259	266	281	finally
    //   177	182	292	java/lang/Exception
    //   198	202	296	java/lang/Exception
    //   286	290	300	java/lang/Exception
    //   140	177	304	finally
    //   140	177	311	java/lang/OutOfMemoryError
    //   140	177	318	java/lang/Exception
  }
  
  public static void Destroy()
  {
    GMTrace.i(13771007328256L, 102602);
    GMTrace.o(13771007328256L, 102602);
  }
  
  public static boolean IsJpegFile(String paramString)
  {
    GMTrace.i(13772081070080L, 102610);
    try
    {
      if (mmjpeg.queryParams(paramString) == null)
      {
        w.e("MMJPEG.JAVA", "IsJpegFile : can't query jpeg parames.");
        GMTrace.o(13772081070080L, 102610);
        return false;
      }
    }
    catch (Exception paramString)
    {
      w.e("MMJPEG.JAVA", "IsJpegFile exception:%s", new Object[] { exception2String(paramString) });
      GMTrace.o(13772081070080L, 102610);
      return false;
    }
    GMTrace.o(13772081070080L, 102610);
    return true;
  }
  
  private static boolean checkAndroidVersion()
  {
    GMTrace.i(13771141545984L, 102603);
    if (Build.VERSION.SDK_INT < 11)
    {
      w.i("MMJPEG.JAVA", "early version before android 3.0  unsupported.");
      GMTrace.o(13771141545984L, 102603);
      return false;
    }
    GMTrace.o(13771141545984L, 102603);
    return true;
  }
  
  private static boolean checkFileExist(String paramString)
  {
    GMTrace.i(13771275763712L, 102604);
    try
    {
      boolean bool = new File(paramString).exists();
      GMTrace.o(13771275763712L, 102604);
      return bool;
    }
    catch (Exception paramString)
    {
      w.e("MMJPEG.JAVA", "checkfileexist. exception:%s", new Object[] { exception2String(paramString) });
      GMTrace.o(13771275763712L, 102604);
    }
    return false;
  }
  
  public static boolean convertToProgressive(String paramString, int paramInt)
  {
    GMTrace.i(13771678416896L, 102607);
    if (!checkAndroidVersion())
    {
      GMTrace.o(13771678416896L, 102607);
      return false;
    }
    try
    {
      String str = paramString + ".prog.dat";
      w.d("MMJPEG.JAVA", "convert %s to %s use progressive.quality:%d", new Object[] { paramString, str, Integer.valueOf(paramInt) });
      paramInt = mmjpeg.convertToProgressive(paramString, str);
      if (paramInt != 0)
      {
        w.e("MMJPEG.JAVA", "convert failed. error:%d", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(13771678416896L, 102607);
        return false;
      }
      boolean bool = j.r(str, paramString, true);
      w.i("MMJPEG.JAVA", "convert ret:%b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(13771678416896L, 102607);
      return bool;
    }
    catch (Exception paramString)
    {
      w.e("MMJPEG.JAVA", "convertToProgressive exception:%s", new Object[] { exception2String(paramString) });
      GMTrace.o(13771678416896L, 102607);
    }
    return false;
  }
  
  public static Bitmap decodeAsBitmap(String paramString)
  {
    GMTrace.i(13771812634624L, 102608);
    w.v("MMJPEG.JAVA", "decodeAsBitmap:%s", new Object[] { paramString });
    try
    {
      Object localObject = mmjpeg.queryParams(paramString);
      if (localObject == null)
      {
        w.e("MMJPEG.JAVA", "can't query jpeg parames.");
        GMTrace.o(13771812634624L, 102608);
        return null;
      }
      localObject = Bitmap.createBitmap(((JpegParams)localObject).Width, ((JpegParams)localObject).Height, Bitmap.Config.ARGB_8888);
      if (mmjpeg.decodeToBitmap(paramString, (Bitmap)localObject))
      {
        w.i("MMJPEG.JAVA", "decode bitmap successed.");
        GMTrace.o(13771812634624L, 102608);
        return (Bitmap)localObject;
      }
      w.e("MMJPEG.JAVA", "can't decode to bmp.");
      GMTrace.o(13771812634624L, 102608);
      return null;
    }
    catch (Exception paramString)
    {
      w.e("MMJPEG.JAVA", "decodeAsBitmap exception:%s", new Object[] { exception2String(paramString) });
      GMTrace.o(13771812634624L, 102608);
      return null;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      w.e("MMJPEG.JAVA", "decodeAsBitmap OOM:%s", new Object[] { paramString });
      GMTrace.o(13771812634624L, 102608);
    }
    return null;
  }
  
  private static String exception2String(Throwable paramThrowable)
  {
    GMTrace.i(13770873110528L, 102601);
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    paramThrowable = localStringWriter.toString();
    GMTrace.o(13770873110528L, 102601);
    return paramThrowable;
  }
  
  public static boolean isProgressive(String paramString)
  {
    GMTrace.i(13771544199168L, 102606);
    w.v("MMJPEG.JAVA", "isProgressive:%s", new Object[] { paramString });
    if (!checkAndroidVersion())
    {
      GMTrace.o(13771544199168L, 102606);
      return false;
    }
    if (!checkFileExist(paramString))
    {
      GMTrace.o(13771544199168L, 102606);
      return false;
    }
    w.d("MMJPEG.JAVA", "check progressive for file:%s", new Object[] { paramString });
    try
    {
      int i = mmjpeg.isProgressiveFile(paramString);
      if ((1 != i) && (i != 0))
      {
        w.e("MMJPEG.JAVA", "check failed. error:%d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(13771544199168L, 102606);
        return false;
      }
      w.i("MMJPEG.JAVA", "file:%s progressive:%d", new Object[] { paramString, Integer.valueOf(i) });
      if (i == 1)
      {
        GMTrace.o(13771544199168L, 102606);
        return true;
      }
      GMTrace.o(13771544199168L, 102606);
      return false;
    }
    catch (Exception paramString)
    {
      w.e("MMJPEG.JAVA", "isProgressive exception:%s", new Object[] { exception2String(paramString) });
      GMTrace.o(13771544199168L, 102606);
    }
    return false;
  }
  
  public static int queryQuality(String paramString)
  {
    GMTrace.i(13771409981440L, 102605);
    if (!checkAndroidVersion())
    {
      GMTrace.o(13771409981440L, 102605);
      return 0;
    }
    if (!checkFileExist(paramString))
    {
      GMTrace.o(13771409981440L, 102605);
      return 0;
    }
    try
    {
      int i = mmjpeg.queryQuality(paramString);
      w.i("MMJPEG.JAVA", "after query quality:%d", new Object[] { Integer.valueOf(i) });
      if ((i < 10000) && (i >= 24))
      {
        GMTrace.o(13771409981440L, 102605);
        return i;
      }
      i = mmjpeg.isProgressiveFile(paramString);
      if (1 == i)
      {
        GMTrace.o(13771409981440L, 102605);
        return 25;
      }
      w.w("MMJPEG.JAVA", "invalid jpeg file or too small quality.");
      GMTrace.o(13771409981440L, 102605);
      return 0;
    }
    catch (Exception paramString)
    {
      w.e("MMJPEG.JAVA", "queryQuality failed. exception:%s", new Object[] { exception2String(paramString) });
      GMTrace.o(13771409981440L, 102605);
      return 0;
    }
    catch (IncompatibleClassChangeError paramString)
    {
      w.printErrStackTrace("MicroMsg.Crash", paramString, "May cause dvmFindCatchBlock crash!", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(paramString));
    }
    catch (Error paramString)
    {
      w.e("MMJPEG.JAVA", "queryQuality error. java.lang.UnsatisfiedLinkError: queryQuality, %s", new Object[] { paramString.toString() });
      GMTrace.o(13771409981440L, 102605);
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\MMNativeJpeg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
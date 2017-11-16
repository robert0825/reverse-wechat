package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public final class o
{
  public static boolean RF(String paramString)
  {
    GMTrace.i(13743358476288L, 102396);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.ImgUtil", "isImgFile, invalid argument");
      GMTrace.o(13743358476288L, 102396);
      return false;
    }
    if (paramString.length() < 3)
    {
      GMTrace.o(13743358476288L, 102396);
      return false;
    }
    if (!new File(paramString).exists())
    {
      GMTrace.o(13743358476288L, 102396);
      return false;
    }
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = false;
    localOptions.inSampleSize = RG(paramString);
    MMBitmapFactory.DecodeResultLogger localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
    paramString = MMBitmapFactory.decodeFile(paramString, localOptions, localDecodeResultLogger, 0, new int[0]);
    if (paramString != null)
    {
      w.i("MicroMsg.ImgUtil", "bitmap recycle %s", new Object[] { paramString });
      paramString.recycle();
    }
    if ((localOptions.outWidth > 0) && (localOptions.outHeight > 0) && (localDecodeResultLogger.getDecodeResult() == 0))
    {
      GMTrace.o(13743358476288L, 102396);
      return true;
    }
    GMTrace.o(13743358476288L, 102396);
    return false;
  }
  
  /* Error */
  private static int RG(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: ldc2_w 95
    //   6: ldc 97
    //   8: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: invokestatic 103	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   15: astore 4
    //   17: aload 4
    //   19: ifnonnull +110 -> 129
    //   22: aload 4
    //   24: astore_3
    //   25: ldc 23
    //   27: ldc 105
    //   29: invokestatic 108	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   32: aload 5
    //   34: astore_3
    //   35: aload_3
    //   36: ifnull +200 -> 236
    //   39: aload_3
    //   40: iconst_0
    //   41: iaload
    //   42: istore_1
    //   43: aload_3
    //   44: iconst_1
    //   45: iaload
    //   46: istore_2
    //   47: aload 4
    //   49: astore_3
    //   50: ldc 23
    //   52: ldc 110
    //   54: iconst_3
    //   55: anewarray 4	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload_0
    //   61: aastore
    //   62: dup
    //   63: iconst_1
    //   64: iload_1
    //   65: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   68: aastore
    //   69: dup
    //   70: iconst_2
    //   71: iload_2
    //   72: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   75: aastore
    //   76: invokestatic 119	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   79: aload 4
    //   81: astore_3
    //   82: iload_1
    //   83: iload_2
    //   84: invokestatic 123	com/tencent/mm/sdk/platformtools/o:ea	(II)I
    //   87: istore_1
    //   88: aload 4
    //   90: astore_3
    //   91: ldc 23
    //   93: ldc 125
    //   95: iconst_1
    //   96: anewarray 4	java/lang/Object
    //   99: dup
    //   100: iconst_0
    //   101: iload_1
    //   102: invokestatic 116	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   105: aastore
    //   106: invokestatic 119	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: aload 4
    //   111: ifnull +8 -> 119
    //   114: aload 4
    //   116: invokevirtual 130	java/io/InputStream:close	()V
    //   119: ldc2_w 95
    //   122: ldc 97
    //   124: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   127: iload_1
    //   128: ireturn
    //   129: aload 4
    //   131: astore_3
    //   132: new 46	android/graphics/BitmapFactory$Options
    //   135: dup
    //   136: invokespecial 49	android/graphics/BitmapFactory$Options:<init>	()V
    //   139: astore 6
    //   141: aload 4
    //   143: astore_3
    //   144: aload 6
    //   146: iconst_1
    //   147: putfield 53	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   150: aload 4
    //   152: astore_3
    //   153: aload 4
    //   155: aconst_null
    //   156: aload 6
    //   158: invokestatic 134	com/tencent/mm/sdk/platformtools/MMBitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   161: pop
    //   162: aload 4
    //   164: astore_3
    //   165: iconst_2
    //   166: newarray <illegal type>
    //   168: astore 5
    //   170: aload 4
    //   172: astore_3
    //   173: aload 5
    //   175: iconst_0
    //   176: aload 6
    //   178: getfield 83	android/graphics/BitmapFactory$Options:outWidth	I
    //   181: iastore
    //   182: aload 4
    //   184: astore_3
    //   185: aload 5
    //   187: iconst_1
    //   188: aload 6
    //   190: getfield 86	android/graphics/BitmapFactory$Options:outHeight	I
    //   193: iastore
    //   194: aload 5
    //   196: astore_3
    //   197: goto -162 -> 35
    //   200: astore_0
    //   201: aload 4
    //   203: astore_3
    //   204: ldc 23
    //   206: aload_0
    //   207: ldc -120
    //   209: iconst_0
    //   210: anewarray 4	java/lang/Object
    //   213: invokestatic 140	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   216: aload 4
    //   218: ifnull +8 -> 226
    //   221: aload 4
    //   223: invokevirtual 130	java/io/InputStream:close	()V
    //   226: ldc2_w 95
    //   229: ldc 97
    //   231: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   234: iconst_1
    //   235: ireturn
    //   236: aload 4
    //   238: astore_3
    //   239: ldc 23
    //   241: ldc -114
    //   243: invokestatic 108	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   246: aload 4
    //   248: ifnull +8 -> 256
    //   251: aload 4
    //   253: invokevirtual 130	java/io/InputStream:close	()V
    //   256: ldc2_w 95
    //   259: ldc 97
    //   261: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   264: iconst_1
    //   265: ireturn
    //   266: astore_0
    //   267: aconst_null
    //   268: astore_3
    //   269: aload_3
    //   270: ifnull +7 -> 277
    //   273: aload_3
    //   274: invokevirtual 130	java/io/InputStream:close	()V
    //   277: aload_0
    //   278: athrow
    //   279: astore_0
    //   280: goto -161 -> 119
    //   283: astore_0
    //   284: goto -28 -> 256
    //   287: astore_0
    //   288: goto -62 -> 226
    //   291: astore_3
    //   292: goto -15 -> 277
    //   295: astore_0
    //   296: goto -27 -> 269
    //   299: astore_0
    //   300: aconst_null
    //   301: astore 4
    //   303: goto -102 -> 201
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	306	0	paramString	String
    //   42	86	1	i	int
    //   46	38	2	j	int
    //   24	250	3	localObject	Object
    //   291	1	3	localIOException	IOException
    //   15	287	4	localInputStream	InputStream
    //   1	194	5	arrayOfInt	int[]
    //   139	50	6	localOptions	BitmapFactory.Options
    // Exception table:
    //   from	to	target	type
    //   25	32	200	java/io/FileNotFoundException
    //   50	79	200	java/io/FileNotFoundException
    //   82	88	200	java/io/FileNotFoundException
    //   91	109	200	java/io/FileNotFoundException
    //   132	141	200	java/io/FileNotFoundException
    //   144	150	200	java/io/FileNotFoundException
    //   153	162	200	java/io/FileNotFoundException
    //   165	170	200	java/io/FileNotFoundException
    //   173	182	200	java/io/FileNotFoundException
    //   185	194	200	java/io/FileNotFoundException
    //   239	246	200	java/io/FileNotFoundException
    //   11	17	266	finally
    //   114	119	279	java/io/IOException
    //   251	256	283	java/io/IOException
    //   221	226	287	java/io/IOException
    //   273	277	291	java/io/IOException
    //   25	32	295	finally
    //   50	79	295	finally
    //   82	88	295	finally
    //   91	109	295	finally
    //   132	141	295	finally
    //   144	150	295	finally
    //   153	162	295	finally
    //   165	170	295	finally
    //   173	182	295	finally
    //   185	194	295	finally
    //   204	216	295	finally
    //   239	246	295	finally
    //   11	17	299	java/io/FileNotFoundException
  }
  
  /* Error */
  public static boolean RH(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 146
    //   3: ldc -108
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 150	java/io/FileInputStream
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 151	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   16: astore_0
    //   17: bipush 6
    //   19: newarray <illegal type>
    //   21: astore 4
    //   23: aload_0
    //   24: aload 4
    //   26: invokevirtual 155	java/io/InputStream:read	([B)I
    //   29: pop
    //   30: ldc -99
    //   32: astore_3
    //   33: iconst_0
    //   34: istore_1
    //   35: iload_1
    //   36: bipush 6
    //   38: if_icmpge +33 -> 71
    //   41: new 159	java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial 160	java/lang/StringBuilder:<init>	()V
    //   48: aload_3
    //   49: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: aload 4
    //   54: iload_1
    //   55: baload
    //   56: i2c
    //   57: invokevirtual 167	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   60: invokevirtual 171	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: astore_3
    //   64: iload_1
    //   65: iconst_1
    //   66: iadd
    //   67: istore_1
    //   68: goto -33 -> 35
    //   71: aload_3
    //   72: ldc -83
    //   74: invokevirtual 176	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   77: istore_2
    //   78: iload_2
    //   79: ifne +17 -> 96
    //   82: aload_0
    //   83: invokevirtual 130	java/io/InputStream:close	()V
    //   86: ldc2_w 146
    //   89: ldc -108
    //   91: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   94: iconst_0
    //   95: ireturn
    //   96: aload_0
    //   97: invokevirtual 130	java/io/InputStream:close	()V
    //   100: ldc2_w 146
    //   103: ldc -108
    //   105: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   108: iconst_1
    //   109: ireturn
    //   110: astore_0
    //   111: aconst_null
    //   112: astore_0
    //   113: aload_0
    //   114: ifnull +7 -> 121
    //   117: aload_0
    //   118: invokevirtual 130	java/io/InputStream:close	()V
    //   121: ldc2_w 146
    //   124: ldc -108
    //   126: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   129: iconst_0
    //   130: ireturn
    //   131: astore_3
    //   132: aconst_null
    //   133: astore_0
    //   134: aload_0
    //   135: ifnull +7 -> 142
    //   138: aload_0
    //   139: invokevirtual 130	java/io/InputStream:close	()V
    //   142: aload_3
    //   143: athrow
    //   144: astore_0
    //   145: goto -59 -> 86
    //   148: astore_0
    //   149: goto -49 -> 100
    //   152: astore_0
    //   153: goto -32 -> 121
    //   156: astore_0
    //   157: goto -15 -> 142
    //   160: astore_3
    //   161: goto -27 -> 134
    //   164: astore_3
    //   165: goto -52 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	paramString	String
    //   34	34	1	i	int
    //   77	2	2	bool	boolean
    //   32	40	3	str	String
    //   131	12	3	localObject1	Object
    //   160	1	3	localObject2	Object
    //   164	1	3	localException	Exception
    //   21	32	4	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   8	17	110	java/lang/Exception
    //   8	17	131	finally
    //   82	86	144	java/io/IOException
    //   96	100	148	java/io/IOException
    //   117	121	152	java/io/IOException
    //   138	142	156	java/io/IOException
    //   17	30	160	finally
    //   41	64	160	finally
    //   71	78	160	finally
    //   17	30	164	java/lang/Exception
    //   41	64	164	java/lang/Exception
    //   71	78	164	java/lang/Exception
  }
  
  /* Error */
  public static boolean RI(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 178
    //   3: ldc -76
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 150	java/io/FileInputStream
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 151	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   16: astore_0
    //   17: bipush 8
    //   19: newarray <illegal type>
    //   21: astore 4
    //   23: aload_0
    //   24: aload 4
    //   26: invokevirtual 155	java/io/InputStream:read	([B)I
    //   29: pop
    //   30: ldc -99
    //   32: astore_3
    //   33: iconst_0
    //   34: istore_1
    //   35: iload_1
    //   36: bipush 8
    //   38: if_icmpge +33 -> 71
    //   41: new 159	java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial 160	java/lang/StringBuilder:<init>	()V
    //   48: aload_3
    //   49: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: aload 4
    //   54: iload_1
    //   55: baload
    //   56: i2c
    //   57: invokevirtual 167	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   60: invokevirtual 171	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: astore_3
    //   64: iload_1
    //   65: iconst_1
    //   66: iadd
    //   67: istore_1
    //   68: goto -33 -> 35
    //   71: aload_3
    //   72: ldc -74
    //   74: invokevirtual 176	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   77: istore_2
    //   78: iload_2
    //   79: ifne +17 -> 96
    //   82: aload_0
    //   83: invokevirtual 130	java/io/InputStream:close	()V
    //   86: ldc2_w 178
    //   89: ldc -76
    //   91: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   94: iconst_0
    //   95: ireturn
    //   96: aload_0
    //   97: invokevirtual 130	java/io/InputStream:close	()V
    //   100: ldc2_w 178
    //   103: ldc -76
    //   105: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   108: iconst_1
    //   109: ireturn
    //   110: astore_0
    //   111: aconst_null
    //   112: astore_0
    //   113: aload_0
    //   114: ifnull +7 -> 121
    //   117: aload_0
    //   118: invokevirtual 130	java/io/InputStream:close	()V
    //   121: ldc2_w 178
    //   124: ldc -76
    //   126: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   129: iconst_0
    //   130: ireturn
    //   131: astore_3
    //   132: aconst_null
    //   133: astore_0
    //   134: aload_0
    //   135: ifnull +7 -> 142
    //   138: aload_0
    //   139: invokevirtual 130	java/io/InputStream:close	()V
    //   142: aload_3
    //   143: athrow
    //   144: astore_0
    //   145: goto -59 -> 86
    //   148: astore_0
    //   149: goto -49 -> 100
    //   152: astore_0
    //   153: goto -32 -> 121
    //   156: astore_0
    //   157: goto -15 -> 142
    //   160: astore_3
    //   161: goto -27 -> 134
    //   164: astore_3
    //   165: goto -52 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	paramString	String
    //   34	34	1	i	int
    //   77	2	2	bool	boolean
    //   32	40	3	str	String
    //   131	12	3	localObject1	Object
    //   160	1	3	localObject2	Object
    //   164	1	3	localException	Exception
    //   21	32	4	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   8	17	110	java/lang/Exception
    //   8	17	131	finally
    //   82	86	144	java/io/IOException
    //   96	100	148	java/io/IOException
    //   117	121	152	java/io/IOException
    //   138	142	156	java/io/IOException
    //   17	30	160	finally
    //   41	64	160	finally
    //   71	78	160	finally
    //   17	30	164	java/lang/Exception
    //   41	64	164	java/lang/Exception
    //   71	78	164	java/lang/Exception
  }
  
  public static boolean a(String paramString, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(13743492694016L, 102397);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.ImgUtil", "isImgFile, invalid argument");
      paramDecodeResultLogger.setDecodeResult(1005);
      GMTrace.o(13743492694016L, 102397);
      return false;
    }
    if (paramString.length() < 3)
    {
      paramDecodeResultLogger.setDecodeResult(1005);
      GMTrace.o(13743492694016L, 102397);
      return false;
    }
    if (!new File(paramString).exists())
    {
      paramDecodeResultLogger.setDecodeResult(1005);
      GMTrace.o(13743492694016L, 102397);
      return false;
    }
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = false;
    localOptions.inSampleSize = RG(paramString);
    long l = System.currentTimeMillis();
    paramString = MMBitmapFactory.decodeFile(paramString, localOptions, paramDecodeResultLogger, 0, new int[0]);
    w.v("MicroMsg.ImgUtil", "hy: isImgFile decode using: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    if (paramString != null)
    {
      w.i("MicroMsg.ImgUtil", "bitmap recycle %s", new Object[] { paramString });
      paramString.recycle();
    }
    if ((localOptions.outWidth > 0) && (localOptions.outHeight > 0) && (paramDecodeResultLogger.getDecodeResult() == 0))
    {
      GMTrace.o(13743492694016L, 102397);
      return true;
    }
    GMTrace.o(13743492694016L, 102397);
    return false;
  }
  
  public static boolean bi(byte[] paramArrayOfByte)
  {
    GMTrace.i(13743626911744L, 102398);
    if (paramArrayOfByte == null)
    {
      GMTrace.o(13743626911744L, 102398);
      return false;
    }
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    paramArrayOfByte = "";
    int i = 0;
    while (i < 6) {
      try
      {
        paramArrayOfByte = paramArrayOfByte + (char)localByteArrayInputStream.read();
        i += 1;
      }
      catch (IOException paramArrayOfByte)
      {
        GMTrace.o(13743626911744L, 102398);
        return false;
      }
    }
    try
    {
      localByteArrayInputStream.close();
      if (!paramArrayOfByte.startsWith("GIF"))
      {
        GMTrace.o(13743626911744L, 102398);
        return false;
      }
      GMTrace.o(13743626911744L, 102398);
      return true;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static boolean bj(byte[] paramArrayOfByte)
  {
    GMTrace.i(13743895347200L, 102400);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 4))
    {
      GMTrace.o(13743895347200L, 102400);
      return false;
    }
    if ((paramArrayOfByte[1] == 80) && (paramArrayOfByte[2] == 78) && (paramArrayOfByte[3] == 71))
    {
      GMTrace.o(13743895347200L, 102400);
      return true;
    }
    if ((paramArrayOfByte[0] == 71) && (paramArrayOfByte[1] == 73) && (paramArrayOfByte[2] == 70))
    {
      GMTrace.o(13743895347200L, 102400);
      return true;
    }
    if ((paramArrayOfByte[6] == 74) && (paramArrayOfByte[7] == 70) && (paramArrayOfByte[8] == 73) && (paramArrayOfByte[9] == 70))
    {
      GMTrace.o(13743895347200L, 102400);
      return true;
    }
    if ((paramArrayOfByte[0] == 119) && (paramArrayOfByte[1] == 120) && (paramArrayOfByte[2] == 103) && (paramArrayOfByte[3] == 102))
    {
      GMTrace.o(13743895347200L, 102400);
      return true;
    }
    GMTrace.o(13743895347200L, 102400);
    return false;
  }
  
  public static boolean bk(byte[] paramArrayOfByte)
  {
    GMTrace.i(20315866398720L, 151365);
    if (paramArrayOfByte == null)
    {
      GMTrace.o(20315866398720L, 151365);
      return false;
    }
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    paramArrayOfByte = "";
    int i = 0;
    while (i < 8) {
      try
      {
        paramArrayOfByte = paramArrayOfByte + (char)localByteArrayInputStream.read();
        i += 1;
      }
      catch (IOException paramArrayOfByte)
      {
        GMTrace.o(20315866398720L, 151365);
        return false;
      }
    }
    try
    {
      localByteArrayInputStream.close();
      if (!paramArrayOfByte.startsWith("wxgf"))
      {
        GMTrace.o(20315866398720L, 151365);
        return false;
      }
      GMTrace.o(20315866398720L, 151365);
      return true;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  private static int ea(int paramInt1, int paramInt2)
  {
    GMTrace.i(20378948730880L, 151835);
    paramInt1 = Math.max(paramInt1, paramInt2);
    paramInt2 = 1;
    while (paramInt1 > 64)
    {
      paramInt2 *= 2;
      paramInt1 /= paramInt2;
    }
    GMTrace.o(20378948730880L, 151835);
    return paramInt2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
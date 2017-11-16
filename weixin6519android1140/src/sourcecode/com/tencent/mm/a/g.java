package com.tencent.mm.a;

import com.tencent.gmtrace.GMTrace;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;

public final class g
{
  /* Error */
  private static String a(File paramFile, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc2_w 11
    //   3: ldc 13
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokevirtual 25	java/io/File:exists	()Z
    //   12: ifne +13 -> 25
    //   15: ldc2_w 11
    //   18: ldc 13
    //   20: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   23: aconst_null
    //   24: areturn
    //   25: new 30	java/io/FileInputStream
    //   28: dup
    //   29: aload_0
    //   30: invokespecial 34	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: astore_0
    //   34: aload_0
    //   35: iconst_0
    //   36: sipush 256
    //   39: invokestatic 37	com/tencent/mm/a/g:a	(Ljava/io/InputStream;II)Ljava/lang/String;
    //   42: astore_3
    //   43: aload_0
    //   44: invokevirtual 41	java/io/FileInputStream:close	()V
    //   47: aload_0
    //   48: invokevirtual 41	java/io/FileInputStream:close	()V
    //   51: ldc2_w 11
    //   54: ldc 13
    //   56: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   59: aload_3
    //   60: areturn
    //   61: astore_0
    //   62: aconst_null
    //   63: astore_0
    //   64: aload_0
    //   65: ifnull +7 -> 72
    //   68: aload_0
    //   69: invokevirtual 41	java/io/FileInputStream:close	()V
    //   72: ldc2_w 11
    //   75: ldc 13
    //   77: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   80: aconst_null
    //   81: areturn
    //   82: astore_3
    //   83: aconst_null
    //   84: astore_0
    //   85: aload_0
    //   86: ifnull +7 -> 93
    //   89: aload_0
    //   90: invokevirtual 41	java/io/FileInputStream:close	()V
    //   93: aload_3
    //   94: athrow
    //   95: astore_0
    //   96: goto -45 -> 51
    //   99: astore_0
    //   100: goto -28 -> 72
    //   103: astore_0
    //   104: goto -11 -> 93
    //   107: astore_3
    //   108: goto -23 -> 85
    //   111: astore_3
    //   112: goto -48 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	paramFile	File
    //   0	115	1	paramInt1	int
    //   0	115	2	paramInt2	int
    //   42	18	3	str	String
    //   82	12	3	localObject1	Object
    //   107	1	3	localObject2	Object
    //   111	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   25	34	61	java/lang/Exception
    //   25	34	82	finally
    //   47	51	95	java/io/IOException
    //   68	72	99	java/io/IOException
    //   89	93	103	java/io/IOException
    //   34	47	107	finally
    //   34	47	111	java/lang/Exception
  }
  
  public static final String a(InputStream paramInputStream, int paramInt)
  {
    int i = 0;
    GMTrace.i(13992063926272L, 104249);
    if ((paramInputStream == null) || (paramInt <= 0))
    {
      GMTrace.o(13992063926272L, 104249);
      return null;
    }
    StringBuilder localStringBuilder;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localStringBuilder = new StringBuilder(32);
      byte[] arrayOfByte = new byte[paramInt];
      for (;;)
      {
        paramInt = paramInputStream.read(arrayOfByte);
        if (paramInt == -1) {
          break;
        }
        localMessageDigest.update(arrayOfByte, 0, paramInt);
      }
      paramInputStream = localMessageDigest.digest();
    }
    catch (Exception paramInputStream)
    {
      GMTrace.o(13992063926272L, 104249);
      return null;
    }
    paramInt = i;
    while (paramInt < paramInputStream.length)
    {
      localStringBuilder.append(Integer.toString((paramInputStream[paramInt] & 0xFF) + 256, 16).substring(1));
      paramInt += 1;
    }
    paramInputStream = localStringBuilder.toString();
    GMTrace.o(13992063926272L, 104249);
    return paramInputStream;
  }
  
  public static final String a(InputStream paramInputStream, int paramInt1, int paramInt2)
  {
    GMTrace.i(13991795490816L, 104247);
    paramInputStream = a(paramInputStream, 102400, paramInt1, paramInt2);
    GMTrace.o(13991795490816L, 104247);
    return paramInputStream;
  }
  
  private static String a(InputStream paramInputStream, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    GMTrace.i(13991929708544L, 104248);
    if ((paramInputStream == null) || (paramInt2 < 0) || (paramInt3 <= 0))
    {
      GMTrace.o(13991929708544L, 104248);
      return null;
    }
    long l = paramInt2;
    try
    {
      l = paramInputStream.skip(l);
      if (l < paramInt2)
      {
        GMTrace.o(13991929708544L, 104248);
        return null;
      }
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      StringBuilder localStringBuilder = new StringBuilder(32);
      byte[] arrayOfByte = new byte[102400];
      paramInt1 = 0;
      for (;;)
      {
        paramInt2 = paramInputStream.read(arrayOfByte);
        if ((paramInt2 == -1) || (paramInt1 >= paramInt3)) {
          break;
        }
        if (paramInt1 + paramInt2 <= paramInt3)
        {
          localMessageDigest.update(arrayOfByte, 0, paramInt2);
          paramInt1 += paramInt2;
        }
        else
        {
          localMessageDigest.update(arrayOfByte, 0, paramInt3 - paramInt1);
          paramInt1 = paramInt3;
        }
      }
      paramInputStream = localMessageDigest.digest();
      paramInt1 = i;
      while (paramInt1 < paramInputStream.length)
      {
        localStringBuilder.append(Integer.toString((paramInputStream[paramInt1] & 0xFF) + 256, 16).substring(1));
        paramInt1 += 1;
      }
      paramInputStream = localStringBuilder.toString();
      GMTrace.o(13991929708544L, 104248);
      return paramInputStream;
    }
    catch (Exception paramInputStream)
    {
      GMTrace.o(13991929708544L, 104248);
    }
    return null;
  }
  
  public static String bg(String paramString)
  {
    GMTrace.i(13992198144000L, 104250);
    if (paramString == null)
    {
      GMTrace.o(13992198144000L, 104250);
      return null;
    }
    paramString = new File(paramString);
    if (paramString.exists())
    {
      paramString = h(paramString);
      GMTrace.o(13992198144000L, 104250);
      return paramString;
    }
    GMTrace.o(13992198144000L, 104250);
    return null;
  }
  
  public static String bh(String paramString)
  {
    GMTrace.i(13992466579456L, 104252);
    if (paramString == null)
    {
      GMTrace.o(13992466579456L, 104252);
      return null;
    }
    paramString = new File(paramString);
    if (paramString.exists())
    {
      paramString = a(paramString, 0, 256);
      GMTrace.o(13992466579456L, 104252);
      return paramString;
    }
    GMTrace.o(13992466579456L, 104252);
    return null;
  }
  
  /* Error */
  public static String h(File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 125
    //   3: lstore_1
    //   4: ldc2_w 127
    //   7: ldc -127
    //   9: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_0
    //   13: ifnull +10 -> 23
    //   16: aload_0
    //   17: invokevirtual 25	java/io/File:exists	()Z
    //   20: ifne +13 -> 33
    //   23: ldc2_w 127
    //   26: ldc -127
    //   28: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   31: aconst_null
    //   32: areturn
    //   33: new 30	java/io/FileInputStream
    //   36: dup
    //   37: aload_0
    //   38: invokespecial 34	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   41: astore_3
    //   42: ldc2_w 125
    //   45: aload_0
    //   46: invokevirtual 133	java/io/File:length	()J
    //   49: lcmp
    //   50: ifgt +28 -> 78
    //   53: aload_3
    //   54: lload_1
    //   55: l2i
    //   56: invokestatic 135	com/tencent/mm/a/g:a	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   59: astore_0
    //   60: aload_3
    //   61: invokevirtual 41	java/io/FileInputStream:close	()V
    //   64: aload_3
    //   65: invokevirtual 41	java/io/FileInputStream:close	()V
    //   68: ldc2_w 127
    //   71: ldc -127
    //   73: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   76: aload_0
    //   77: areturn
    //   78: aload_0
    //   79: invokevirtual 133	java/io/File:length	()J
    //   82: lstore_1
    //   83: goto -30 -> 53
    //   86: astore_0
    //   87: aconst_null
    //   88: astore_0
    //   89: aload_0
    //   90: ifnull +7 -> 97
    //   93: aload_0
    //   94: invokevirtual 41	java/io/FileInputStream:close	()V
    //   97: ldc2_w 127
    //   100: ldc -127
    //   102: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   105: aconst_null
    //   106: areturn
    //   107: astore_0
    //   108: aconst_null
    //   109: astore_3
    //   110: aload_3
    //   111: ifnull +7 -> 118
    //   114: aload_3
    //   115: invokevirtual 41	java/io/FileInputStream:close	()V
    //   118: aload_0
    //   119: athrow
    //   120: astore_3
    //   121: goto -53 -> 68
    //   124: astore_0
    //   125: goto -28 -> 97
    //   128: astore_3
    //   129: goto -11 -> 118
    //   132: astore_0
    //   133: goto -23 -> 110
    //   136: astore_0
    //   137: aload_3
    //   138: astore_0
    //   139: goto -50 -> 89
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	paramFile	File
    //   3	80	1	l	long
    //   41	74	3	localFileInputStream	java.io.FileInputStream
    //   120	1	3	localIOException1	java.io.IOException
    //   128	10	3	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   33	42	86	java/lang/Exception
    //   33	42	107	finally
    //   64	68	120	java/io/IOException
    //   93	97	124	java/io/IOException
    //   114	118	128	java/io/IOException
    //   42	53	132	finally
    //   53	64	132	finally
    //   78	83	132	finally
    //   42	53	136	java/lang/Exception
    //   53	64	136	java/lang/Exception
    //   78	83	136	java/lang/Exception
  }
  
  public static final String n(byte[] paramArrayOfByte)
  {
    int i = 0;
    GMTrace.i(13991527055360L, 104245);
    char[] arrayOfChar = new char[16];
    char[] tmp18_16 = arrayOfChar;
    tmp18_16[0] = 48;
    char[] tmp23_18 = tmp18_16;
    tmp23_18[1] = 49;
    char[] tmp28_23 = tmp23_18;
    tmp28_23[2] = 50;
    char[] tmp33_28 = tmp28_23;
    tmp33_28[3] = 51;
    char[] tmp38_33 = tmp33_28;
    tmp38_33[4] = 52;
    char[] tmp43_38 = tmp38_33;
    tmp43_38[5] = 53;
    char[] tmp48_43 = tmp43_38;
    tmp48_43[6] = 54;
    char[] tmp54_48 = tmp48_43;
    tmp54_48[7] = 55;
    char[] tmp60_54 = tmp54_48;
    tmp60_54[8] = 56;
    char[] tmp66_60 = tmp60_54;
    tmp66_60[9] = 57;
    char[] tmp72_66 = tmp66_60;
    tmp72_66[10] = 97;
    char[] tmp78_72 = tmp72_66;
    tmp78_72[11] = 98;
    char[] tmp84_78 = tmp78_72;
    tmp84_78[12] = 99;
    char[] tmp90_84 = tmp84_78;
    tmp90_84[13] = 100;
    char[] tmp96_90 = tmp90_84;
    tmp96_90[14] = 101;
    char[] tmp102_96 = tmp96_90;
    tmp102_96[15] = 102;
    tmp102_96;
    for (;;)
    {
      Object localObject;
      int k;
      int j;
      try
      {
        localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramArrayOfByte);
        paramArrayOfByte = ((MessageDigest)localObject).digest();
        k = paramArrayOfByte.length;
        localObject = new char[k * 2];
        j = 0;
      }
      catch (Exception paramArrayOfByte)
      {
        GMTrace.o(13991527055360L, 104245);
        return null;
      }
      paramArrayOfByte = new String((char[])localObject);
      GMTrace.o(13991527055360L, 104245);
      return paramArrayOfByte;
      while (i < k)
      {
        int m = paramArrayOfByte[i];
        int n = j + 1;
        localObject[j] = arrayOfChar[(m >>> 4 & 0xF)];
        j = n + 1;
        localObject[n] = arrayOfChar[(m & 0xF)];
        i += 1;
      }
    }
  }
  
  public static final byte[] o(byte[] paramArrayOfByte)
  {
    GMTrace.i(13991661273088L, 104246);
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte);
      paramArrayOfByte = localMessageDigest.digest();
      GMTrace.o(13991661273088L, 104246);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      GMTrace.o(13991661273088L, 104246);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
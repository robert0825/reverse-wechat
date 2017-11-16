package com.tencent.mm.c;

import com.tencent.gmtrace.GMTrace;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;

public final class g
{
  /* Error */
  public static String a(File paramFile, int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 11
    //   3: ldc 13
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokevirtual 25	java/io/File:exists	()Z
    //   12: ifeq +7 -> 19
    //   15: iload_1
    //   16: ifgt +13 -> 29
    //   19: ldc2_w 11
    //   22: ldc 13
    //   24: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   27: aconst_null
    //   28: areturn
    //   29: new 30	java/io/FileInputStream
    //   32: dup
    //   33: aload_0
    //   34: invokespecial 34	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   37: astore_0
    //   38: aload_0
    //   39: iconst_0
    //   40: iload_1
    //   41: aload_2
    //   42: invokestatic 37	com/tencent/mm/c/g:a	(Ljava/io/InputStream;II[B)Ljava/lang/String;
    //   45: astore_2
    //   46: aload_0
    //   47: invokevirtual 41	java/io/FileInputStream:close	()V
    //   50: aload_0
    //   51: invokevirtual 41	java/io/FileInputStream:close	()V
    //   54: ldc2_w 11
    //   57: ldc 13
    //   59: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   62: aload_2
    //   63: areturn
    //   64: astore_0
    //   65: aconst_null
    //   66: astore_0
    //   67: aload_0
    //   68: ifnull +7 -> 75
    //   71: aload_0
    //   72: invokevirtual 41	java/io/FileInputStream:close	()V
    //   75: ldc2_w 11
    //   78: ldc 13
    //   80: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   83: aconst_null
    //   84: areturn
    //   85: astore_2
    //   86: aconst_null
    //   87: astore_0
    //   88: aload_0
    //   89: ifnull +7 -> 96
    //   92: aload_0
    //   93: invokevirtual 41	java/io/FileInputStream:close	()V
    //   96: aload_2
    //   97: athrow
    //   98: astore_0
    //   99: goto -45 -> 54
    //   102: astore_0
    //   103: goto -28 -> 75
    //   106: astore_0
    //   107: goto -11 -> 96
    //   110: astore_2
    //   111: goto -23 -> 88
    //   114: astore_2
    //   115: goto -48 -> 67
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	paramFile	File
    //   0	118	1	paramInt	int
    //   0	118	2	paramArrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   29	38	64	java/lang/Exception
    //   29	38	85	finally
    //   50	54	98	java/io/IOException
    //   71	75	102	java/io/IOException
    //   92	96	106	java/io/IOException
    //   38	50	110	finally
    //   38	50	114	java/lang/Exception
  }
  
  private static String a(InputStream paramInputStream, int paramInt)
  {
    int i = 0;
    GMTrace.i(14019981213696L, 104457);
    if (paramInt <= 0)
    {
      GMTrace.o(14019981213696L, 104457);
      return null;
    }
    for (;;)
    {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        StringBuilder localStringBuilder = new StringBuilder(32);
        byte[] arrayOfByte = new byte[paramInt];
        paramInt = paramInputStream.read(arrayOfByte);
        if (paramInt == -1)
        {
          paramInputStream = localMessageDigest.digest();
          paramInt = i;
          if (paramInt >= paramInputStream.length)
          {
            paramInputStream = localStringBuilder.toString();
            GMTrace.o(14019981213696L, 104457);
            return paramInputStream;
          }
        }
        else
        {
          localMessageDigest.update(arrayOfByte, 0, paramInt);
          continue;
        }
        localStringBuilder.append(Integer.toString((paramInputStream[paramInt] & 0xFF) + 256, 16).substring(1));
      }
      catch (Exception paramInputStream)
      {
        GMTrace.o(14019981213696L, 104457);
        return null;
      }
      paramInt += 1;
    }
  }
  
  private static String a(InputStream paramInputStream, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    int i = 0;
    GMTrace.i(14019846995968L, 104456);
    if (paramInt2 <= 0)
    {
      GMTrace.o(14019846995968L, 104456);
      return null;
    }
    try
    {
      long l = paramInputStream.skip(0L);
      if (l < 0L)
      {
        GMTrace.o(14019846995968L, 104456);
        return null;
      }
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      StringBuilder localStringBuilder = new StringBuilder(32);
      byte[] arrayOfByte = new byte[102400];
      paramInt1 = 0;
      int j = paramInputStream.read(arrayOfByte);
      if ((j == -1) || (paramInt1 >= paramInt2))
      {
        if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0)) {
          localMessageDigest.update(paramArrayOfByte);
        }
        paramInputStream = localMessageDigest.digest();
        paramInt1 = i;
      }
      for (;;)
      {
        if (paramInt1 >= paramInputStream.length)
        {
          paramInputStream = localStringBuilder.toString();
          GMTrace.o(14019846995968L, 104456);
          return paramInputStream;
          if (paramInt1 + j <= paramInt2)
          {
            localMessageDigest.update(arrayOfByte, 0, j);
            paramInt1 += j;
            break;
          }
          localMessageDigest.update(arrayOfByte, 0, paramInt2 - paramInt1);
          paramInt1 = paramInt2;
          break;
        }
        localStringBuilder.append(Integer.toString((paramInputStream[paramInt1] & 0xFF) + 256, 16).substring(1));
        paramInt1 += 1;
      }
      return null;
    }
    catch (Exception paramInputStream)
    {
      GMTrace.o(14019846995968L, 104456);
    }
  }
  
  public static String bg(String paramString)
  {
    GMTrace.i(14020115431424L, 104458);
    if (paramString == null)
    {
      GMTrace.o(14020115431424L, 104458);
      return null;
    }
    paramString = new File(paramString);
    if (paramString.exists())
    {
      paramString = h(paramString);
      GMTrace.o(14020115431424L, 104458);
      return paramString;
    }
    GMTrace.o(14020115431424L, 104458);
    return null;
  }
  
  /* Error */
  private static String h(File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 116
    //   3: lstore_1
    //   4: ldc2_w 118
    //   7: ldc 120
    //   9: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_0
    //   13: invokevirtual 25	java/io/File:exists	()Z
    //   16: ifne +13 -> 29
    //   19: ldc2_w 118
    //   22: ldc 120
    //   24: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   27: aconst_null
    //   28: areturn
    //   29: new 30	java/io/FileInputStream
    //   32: dup
    //   33: aload_0
    //   34: invokespecial 34	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   37: astore_3
    //   38: ldc2_w 116
    //   41: aload_0
    //   42: invokevirtual 124	java/io/File:length	()J
    //   45: lcmp
    //   46: ifgt +28 -> 74
    //   49: aload_3
    //   50: lload_1
    //   51: l2i
    //   52: invokestatic 126	com/tencent/mm/c/g:a	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   55: astore_0
    //   56: aload_3
    //   57: invokevirtual 41	java/io/FileInputStream:close	()V
    //   60: aload_3
    //   61: invokevirtual 41	java/io/FileInputStream:close	()V
    //   64: ldc2_w 118
    //   67: ldc 120
    //   69: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   72: aload_0
    //   73: areturn
    //   74: aload_0
    //   75: invokevirtual 124	java/io/File:length	()J
    //   78: lstore_1
    //   79: goto -30 -> 49
    //   82: astore_0
    //   83: aconst_null
    //   84: astore_0
    //   85: aload_0
    //   86: ifnull +7 -> 93
    //   89: aload_0
    //   90: invokevirtual 41	java/io/FileInputStream:close	()V
    //   93: ldc2_w 118
    //   96: ldc 120
    //   98: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   101: aconst_null
    //   102: areturn
    //   103: astore_0
    //   104: aconst_null
    //   105: astore_3
    //   106: aload_3
    //   107: ifnull +7 -> 114
    //   110: aload_3
    //   111: invokevirtual 41	java/io/FileInputStream:close	()V
    //   114: aload_0
    //   115: athrow
    //   116: astore_3
    //   117: goto -53 -> 64
    //   120: astore_0
    //   121: goto -28 -> 93
    //   124: astore_3
    //   125: goto -11 -> 114
    //   128: astore_0
    //   129: goto -23 -> 106
    //   132: astore_0
    //   133: aload_3
    //   134: astore_0
    //   135: goto -50 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	paramFile	File
    //   3	76	1	l	long
    //   37	74	3	localFileInputStream	java.io.FileInputStream
    //   116	1	3	localIOException1	java.io.IOException
    //   124	10	3	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   29	38	82	java/lang/Exception
    //   29	38	103	finally
    //   60	64	116	java/io/IOException
    //   89	93	120	java/io/IOException
    //   110	114	124	java/io/IOException
    //   38	49	128	finally
    //   49	60	128	finally
    //   74	79	128	finally
    //   38	49	132	java/lang/Exception
    //   49	60	132	java/lang/Exception
    //   74	79	132	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
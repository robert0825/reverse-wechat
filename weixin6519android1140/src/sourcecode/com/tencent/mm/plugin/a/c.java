package com.tencent.mm.plugin.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.RandomAccessFile;
import java.util.Arrays;

public final class c
{
  public static long J(byte[] paramArrayOfByte)
  {
    GMTrace.i(16392279556096L, 122132);
    long l1 = paramArrayOfByte[0];
    long l2 = paramArrayOfByte[1];
    long l3 = paramArrayOfByte[2];
    long l4 = paramArrayOfByte[3];
    long l5 = paramArrayOfByte[4];
    long l6 = paramArrayOfByte[5];
    long l7 = paramArrayOfByte[6];
    long l8 = paramArrayOfByte[7];
    GMTrace.o(16392279556096L, 122132);
    return (l1 & 0xFF) << 56 | (l2 & 0xFF) << 48 | (l3 & 0xFF) << 40 | (l4 & 0xFF) << 32 | (l5 & 0xFF) << 24 | (l6 & 0xFF) << 16 | (l7 & 0xFF) << 8 | l8 & 0xFF;
  }
  
  public static a a(RandomAccessFile paramRandomAccessFile, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(16392413773824L, 122133);
    try
    {
      i = paramRandomAccessFile.read(paramArrayOfByte);
      if (i >= 8)
      {
        j = l(paramArrayOfByte, 0);
        k = l(paramArrayOfByte, 4);
        if (k == paramInt)
        {
          l = paramRandomAccessFile.getFilePointer() - i;
          if (k == a.hlO) {}
          for (paramRandomAccessFile = new i(j, l, k, 0L);; paramRandomAccessFile = new e(j, l, k, 0L))
          {
            GMTrace.o(16392413773824L, 122133);
            return paramRandomAccessFile;
            if (k != a.hlP) {
              break;
            }
          }
        }
      }
    }
    catch (Exception paramRandomAccessFile)
    {
      for (;;)
      {
        int i;
        int j;
        int k;
        long l;
        w.printErrStackTrace("MicroMsg.AtomUtil", paramRandomAccessFile, "", new Object[0]);
        w.e("MicroMsg.AtomUtil", "find Atom error: " + paramRandomAccessFile.toString());
        paramRandomAccessFile = null;
        continue;
        if (k == a.hlR)
        {
          paramRandomAccessFile = new h(j, l, k, 0L);
        }
        else
        {
          paramRandomAccessFile = new a(j, l, k, 0L);
          continue;
          if ((k == a.hlM) || (k == a.hlQ)) {
            i = paramRandomAccessFile.read(paramArrayOfByte);
          } else if (a(paramRandomAccessFile, j - 8)) {
            i = paramRandomAccessFile.read(paramArrayOfByte);
          } else {
            paramRandomAccessFile = null;
          }
        }
      }
    }
  }
  
  public static boolean a(RandomAccessFile paramRandomAccessFile, long paramLong)
  {
    GMTrace.i(16392547991552L, 122134);
    long l = 0L;
    while (paramLong > 2147483647L)
    {
      l += paramRandomAccessFile.skipBytes(Integer.MAX_VALUE);
      paramLong -= 2147483647L;
    }
    l += paramRandomAccessFile.skipBytes((int)paramLong);
    if (l != paramLong)
    {
      w.w("MicroMsg.AtomUtil", "can not skip.skip: " + paramLong + " trueSkip : " + l);
      GMTrace.o(16392547991552L, 122134);
      return false;
    }
    GMTrace.o(16392547991552L, 122134);
    return true;
  }
  
  public static int l(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(16392011120640L, 122130);
    int j = paramInt + 1;
    paramInt = paramArrayOfByte[paramInt];
    int i = j + 1;
    j = paramArrayOfByte[j];
    int k = paramArrayOfByte[i];
    i = paramArrayOfByte[(i + 1)];
    GMTrace.o(16392011120640L, 122130);
    return (j & 0xFF) << 16 | (paramInt & 0xFF) << 24 | (k & 0xFF) << 8 | i & 0xFF;
  }
  
  public static long m(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(16392145338368L, 122131);
    byte[] arrayOfByte = new byte[8];
    Arrays.fill(arrayOfByte, (byte)0);
    System.arraycopy(paramArrayOfByte, paramInt, arrayOfByte, 4, 4);
    long l = J(arrayOfByte);
    GMTrace.o(16392145338368L, 122131);
    return l;
  }
  
  public static boolean nm(String paramString)
  {
    GMTrace.i(16391742685184L, 122128);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(16391742685184L, 122128);
      return true;
    }
    GMTrace.o(16391742685184L, 122128);
    return false;
  }
  
  /* Error */
  public static boolean np(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 163
    //   3: ldc -91
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 167	com/tencent/mm/plugin/a/c:nm	(Ljava/lang/String;)Z
    //   12: ifeq +13 -> 25
    //   15: ldc2_w 163
    //   18: ldc -91
    //   20: invokestatic 18	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   23: iconst_0
    //   24: ireturn
    //   25: new 169	java/io/FileInputStream
    //   28: dup
    //   29: aload_0
    //   30: invokespecial 170	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   33: astore 4
    //   35: aload 4
    //   37: astore_0
    //   38: bipush 8
    //   40: newarray <illegal type>
    //   42: astore 5
    //   44: aload 4
    //   46: astore_0
    //   47: aload 4
    //   49: aload 5
    //   51: iconst_0
    //   52: bipush 8
    //   54: invokevirtual 175	java/io/InputStream:read	([BII)I
    //   57: istore_1
    //   58: iload_1
    //   59: bipush 8
    //   61: if_icmpge +34 -> 95
    //   64: aload 4
    //   66: invokevirtual 179	java/io/InputStream:close	()V
    //   69: ldc2_w 163
    //   72: ldc -91
    //   74: invokestatic 18	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   77: iconst_0
    //   78: ireturn
    //   79: astore_0
    //   80: ldc 62
    //   82: aload_0
    //   83: ldc 64
    //   85: iconst_0
    //   86: anewarray 4	java/lang/Object
    //   89: invokestatic 70	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: goto -23 -> 69
    //   95: aload 4
    //   97: astore_0
    //   98: aload 5
    //   100: iconst_0
    //   101: invokestatic 38	com/tencent/mm/plugin/a/c:l	([BI)I
    //   104: istore_1
    //   105: aload 4
    //   107: astore_0
    //   108: aload 5
    //   110: iconst_4
    //   111: invokestatic 38	com/tencent/mm/plugin/a/c:l	([BI)I
    //   114: istore_2
    //   115: aload 4
    //   117: astore_0
    //   118: getstatic 182	com/tencent/mm/plugin/a/a:hlo	I
    //   121: istore_3
    //   122: iload_2
    //   123: iload_3
    //   124: if_icmpne +38 -> 162
    //   127: iload_1
    //   128: ifle +34 -> 162
    //   131: aload 4
    //   133: invokevirtual 179	java/io/InputStream:close	()V
    //   136: ldc2_w 163
    //   139: ldc -91
    //   141: invokestatic 18	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   144: iconst_1
    //   145: ireturn
    //   146: astore_0
    //   147: ldc 62
    //   149: aload_0
    //   150: ldc 64
    //   152: iconst_0
    //   153: anewarray 4	java/lang/Object
    //   156: invokestatic 70	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: goto -23 -> 136
    //   162: aload 4
    //   164: invokevirtual 179	java/io/InputStream:close	()V
    //   167: ldc2_w 163
    //   170: ldc -91
    //   172: invokestatic 18	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   175: iconst_0
    //   176: ireturn
    //   177: astore_0
    //   178: ldc 62
    //   180: aload_0
    //   181: ldc 64
    //   183: iconst_0
    //   184: anewarray 4	java/lang/Object
    //   187: invokestatic 70	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: goto -23 -> 167
    //   193: astore 5
    //   195: aconst_null
    //   196: astore 4
    //   198: aload 4
    //   200: astore_0
    //   201: ldc 62
    //   203: aload 5
    //   205: ldc 64
    //   207: iconst_0
    //   208: anewarray 4	java/lang/Object
    //   211: invokestatic 70	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   214: aload 4
    //   216: ifnull +8 -> 224
    //   219: aload 4
    //   221: invokevirtual 179	java/io/InputStream:close	()V
    //   224: ldc2_w 163
    //   227: ldc -91
    //   229: invokestatic 18	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   232: iconst_0
    //   233: ireturn
    //   234: astore_0
    //   235: ldc 62
    //   237: aload_0
    //   238: ldc 64
    //   240: iconst_0
    //   241: anewarray 4	java/lang/Object
    //   244: invokestatic 70	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   247: goto -23 -> 224
    //   250: astore 4
    //   252: aconst_null
    //   253: astore_0
    //   254: aload_0
    //   255: ifnull +7 -> 262
    //   258: aload_0
    //   259: invokevirtual 179	java/io/InputStream:close	()V
    //   262: aload 4
    //   264: athrow
    //   265: astore_0
    //   266: ldc 62
    //   268: aload_0
    //   269: ldc 64
    //   271: iconst_0
    //   272: anewarray 4	java/lang/Object
    //   275: invokestatic 70	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   278: goto -16 -> 262
    //   281: astore 4
    //   283: goto -29 -> 254
    //   286: astore 5
    //   288: goto -90 -> 198
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	291	0	paramString	String
    //   57	71	1	i	int
    //   114	11	2	j	int
    //   121	4	3	k	int
    //   33	187	4	localFileInputStream	java.io.FileInputStream
    //   250	13	4	localObject1	Object
    //   281	1	4	localObject2	Object
    //   42	67	5	arrayOfByte	byte[]
    //   193	11	5	localException1	Exception
    //   286	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   64	69	79	java/io/IOException
    //   131	136	146	java/io/IOException
    //   162	167	177	java/io/IOException
    //   25	35	193	java/lang/Exception
    //   219	224	234	java/io/IOException
    //   25	35	250	finally
    //   258	262	265	java/io/IOException
    //   38	44	281	finally
    //   47	58	281	finally
    //   98	105	281	finally
    //   108	115	281	finally
    //   118	122	281	finally
    //   201	214	281	finally
    //   38	44	286	java/lang/Exception
    //   47	58	286	java/lang/Exception
    //   98	105	286	java/lang/Exception
    //   108	115	286	java/lang/Exception
    //   118	122	286	java/lang/Exception
  }
  
  public static int nq(String paramString)
  {
    int i = 0;
    GMTrace.i(16391876902912L, 122129);
    int k = paramString.length();
    int j = 0;
    while (i < k)
    {
      j = j << 8 | paramString.charAt(i);
      i += 1;
    }
    GMTrace.o(16391876902912L, 122129);
    return j;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
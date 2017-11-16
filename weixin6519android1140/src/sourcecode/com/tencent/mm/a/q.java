package com.tencent.mm.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Inflater;

public final class q
{
  /* Error */
  public static byte[] l(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 13
    //   3: ldc 15
    //   5: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 23	java/util/zip/Deflater
    //   11: dup
    //   12: invokespecial 27	java/util/zip/Deflater:<init>	()V
    //   15: astore 4
    //   17: aload 4
    //   19: invokevirtual 30	java/util/zip/Deflater:reset	()V
    //   22: aload 4
    //   24: aload_0
    //   25: invokevirtual 34	java/util/zip/Deflater:setInput	([B)V
    //   28: aload 4
    //   30: invokevirtual 37	java/util/zip/Deflater:finish	()V
    //   33: new 39	java/io/ByteArrayOutputStream
    //   36: dup
    //   37: aload_0
    //   38: arraylength
    //   39: invokespecial 42	java/io/ByteArrayOutputStream:<init>	(I)V
    //   42: astore_2
    //   43: aload_2
    //   44: astore_1
    //   45: sipush 1024
    //   48: newarray <illegal type>
    //   50: astore_3
    //   51: aload_2
    //   52: astore_1
    //   53: aload 4
    //   55: invokevirtual 46	java/util/zip/Deflater:finished	()Z
    //   58: ifne +62 -> 120
    //   61: aload_2
    //   62: astore_1
    //   63: aload_2
    //   64: aload_3
    //   65: iconst_0
    //   66: aload 4
    //   68: aload_3
    //   69: invokevirtual 50	java/util/zip/Deflater:deflate	([B)I
    //   72: invokevirtual 54	java/io/ByteArrayOutputStream:write	([BII)V
    //   75: goto -24 -> 51
    //   78: astore_3
    //   79: aload_2
    //   80: astore_1
    //   81: ldc 56
    //   83: aload_3
    //   84: ldc 58
    //   86: iconst_0
    //   87: anewarray 4	java/lang/Object
    //   90: invokestatic 64	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: aload_0
    //   94: astore_1
    //   95: aload_2
    //   96: ifnull +9 -> 105
    //   99: aload_2
    //   100: invokevirtual 67	java/io/ByteArrayOutputStream:close	()V
    //   103: aload_0
    //   104: astore_1
    //   105: aload 4
    //   107: invokevirtual 70	java/util/zip/Deflater:end	()V
    //   110: ldc2_w 13
    //   113: ldc 15
    //   115: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   118: aload_1
    //   119: areturn
    //   120: aload_2
    //   121: astore_1
    //   122: aload_2
    //   123: invokevirtual 77	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   126: astore_3
    //   127: aload_3
    //   128: astore_1
    //   129: aload_2
    //   130: invokevirtual 67	java/io/ByteArrayOutputStream:close	()V
    //   133: goto -28 -> 105
    //   136: astore_0
    //   137: ldc 56
    //   139: aload_0
    //   140: ldc 58
    //   142: iconst_0
    //   143: anewarray 4	java/lang/Object
    //   146: invokestatic 64	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: goto -44 -> 105
    //   152: astore_1
    //   153: ldc 56
    //   155: aload_1
    //   156: ldc 58
    //   158: iconst_0
    //   159: anewarray 4	java/lang/Object
    //   162: invokestatic 64	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aload_0
    //   166: astore_1
    //   167: goto -62 -> 105
    //   170: astore_1
    //   171: aconst_null
    //   172: astore_1
    //   173: new 10	java/lang/OutOfMemoryError
    //   176: dup
    //   177: new 79	java/lang/StringBuilder
    //   180: dup
    //   181: ldc 81
    //   183: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   186: aload_0
    //   187: arraylength
    //   188: invokevirtual 88	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   191: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   194: invokespecial 93	java/lang/OutOfMemoryError:<init>	(Ljava/lang/String;)V
    //   197: athrow
    //   198: astore_0
    //   199: aload_1
    //   200: ifnull +7 -> 207
    //   203: aload_1
    //   204: invokevirtual 67	java/io/ByteArrayOutputStream:close	()V
    //   207: aload_0
    //   208: athrow
    //   209: astore_1
    //   210: ldc 56
    //   212: aload_1
    //   213: ldc 58
    //   215: iconst_0
    //   216: anewarray 4	java/lang/Object
    //   219: invokestatic 64	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   222: goto -15 -> 207
    //   225: astore_0
    //   226: aconst_null
    //   227: astore_1
    //   228: goto -29 -> 199
    //   231: astore_1
    //   232: aload_2
    //   233: astore_1
    //   234: goto -61 -> 173
    //   237: astore_3
    //   238: aconst_null
    //   239: astore_2
    //   240: goto -161 -> 79
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	243	0	paramArrayOfByte	byte[]
    //   44	85	1	localObject1	Object
    //   152	4	1	localIOException1	IOException
    //   166	1	1	arrayOfByte1	byte[]
    //   170	1	1	localOutOfMemoryError1	OutOfMemoryError
    //   172	32	1	localObject2	Object
    //   209	4	1	localIOException2	IOException
    //   227	1	1	localObject3	Object
    //   231	1	1	localOutOfMemoryError2	OutOfMemoryError
    //   233	1	1	localByteArrayOutputStream1	ByteArrayOutputStream
    //   42	198	2	localByteArrayOutputStream2	ByteArrayOutputStream
    //   50	19	3	arrayOfByte2	byte[]
    //   78	6	3	localException1	Exception
    //   126	2	3	arrayOfByte3	byte[]
    //   237	1	3	localException2	Exception
    //   15	91	4	localDeflater	java.util.zip.Deflater
    // Exception table:
    //   from	to	target	type
    //   45	51	78	java/lang/Exception
    //   53	61	78	java/lang/Exception
    //   63	75	78	java/lang/Exception
    //   122	127	78	java/lang/Exception
    //   129	133	136	java/io/IOException
    //   99	103	152	java/io/IOException
    //   33	43	170	java/lang/OutOfMemoryError
    //   45	51	198	finally
    //   53	61	198	finally
    //   63	75	198	finally
    //   81	93	198	finally
    //   122	127	198	finally
    //   173	198	198	finally
    //   203	207	209	java/io/IOException
    //   33	43	225	finally
    //   45	51	231	java/lang/OutOfMemoryError
    //   53	61	231	java/lang/OutOfMemoryError
    //   63	75	231	java/lang/OutOfMemoryError
    //   122	127	231	java/lang/OutOfMemoryError
    //   33	43	237	java/lang/Exception
  }
  
  public static byte[] q(byte[] paramArrayOfByte)
  {
    GMTrace.i(13853417013248L, 103216);
    Inflater localInflater = new Inflater();
    localInflater.reset();
    localInflater.setInput(paramArrayOfByte);
    Object localObject = null;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfByte.length);
    try
    {
      byte[] arrayOfByte = new byte['Ѐ'];
      while (!localInflater.finished()) {
        localByteArrayOutputStream.write(arrayOfByte, 0, localInflater.inflate(arrayOfByte));
      }
      return paramArrayOfByte;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.Zlib", localException, "exception when loop read byte", new Object[0]);
      try
      {
        localByteArrayOutputStream.close();
        for (;;)
        {
          localInflater.end();
          if (localException == null) {
            break;
          }
          throw new Exception(localException);
          arrayOfByte = localByteArrayOutputStream.toByteArray();
          paramArrayOfByte = arrayOfByte;
          try
          {
            localByteArrayOutputStream.close();
          }
          catch (IOException localIOException2)
          {
            w.printErrStackTrace("MicroMsg.Zlib", localIOException2, "", new Object[0]);
          }
        }
      }
      catch (IOException localIOException3)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.Zlib", localIOException3, "", new Object[0]);
        }
      }
    }
    finally
    {
      try
      {
        localByteArrayOutputStream.close();
        throw paramArrayOfByte;
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.Zlib", localIOException1, "", new Object[0]);
        }
      }
      GMTrace.o(13853417013248L, 103216);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
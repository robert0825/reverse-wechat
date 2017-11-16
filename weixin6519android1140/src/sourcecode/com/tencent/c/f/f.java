package com.tencent.c.f;

import java.io.Closeable;

public final class f
{
  /* Error */
  public static String J(java.io.File paramFile)
  {
    // Byte code:
    //   0: ldc 10
    //   2: astore_1
    //   3: aconst_null
    //   4: astore_2
    //   5: new 12	java/io/BufferedReader
    //   8: dup
    //   9: new 14	java/io/FileReader
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 18	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   17: invokespecial 21	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   20: astore_0
    //   21: aload_0
    //   22: invokevirtual 25	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   25: astore_2
    //   26: aload_2
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull +9 -> 38
    //   32: aload_0
    //   33: invokestatic 29	com/tencent/c/f/f:b	(Ljava/io/Closeable;)V
    //   36: aload_1
    //   37: areturn
    //   38: aload_0
    //   39: invokestatic 29	com/tencent/c/f/f:b	(Ljava/io/Closeable;)V
    //   42: aload_1
    //   43: areturn
    //   44: astore_0
    //   45: aconst_null
    //   46: astore_0
    //   47: aload_0
    //   48: ifnull -12 -> 36
    //   51: aload_0
    //   52: invokestatic 29	com/tencent/c/f/f:b	(Ljava/io/Closeable;)V
    //   55: ldc 10
    //   57: areturn
    //   58: astore_0
    //   59: aload_2
    //   60: astore_1
    //   61: aload_1
    //   62: ifnull +7 -> 69
    //   65: aload_1
    //   66: invokestatic 29	com/tencent/c/f/f:b	(Ljava/io/Closeable;)V
    //   69: aload_0
    //   70: athrow
    //   71: astore_2
    //   72: aload_0
    //   73: astore_1
    //   74: aload_2
    //   75: astore_0
    //   76: goto -15 -> 61
    //   79: astore_2
    //   80: goto -33 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	paramFile	java.io.File
    //   2	72	1	localObject1	Object
    //   4	56	2	str	String
    //   71	4	2	localObject2	Object
    //   79	1	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   5	21	44	java/lang/Throwable
    //   5	21	58	finally
    //   21	26	71	finally
    //   21	26	79	java/lang/Throwable
  }
  
  /* Error */
  public static byte[] K(java.io.File paramFile)
  {
    // Byte code:
    //   0: new 36	java/io/RandomAccessFile
    //   3: dup
    //   4: aload_0
    //   5: ldc 38
    //   7: invokespecial 41	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   10: astore 4
    //   12: aload 4
    //   14: astore_0
    //   15: aload 4
    //   17: invokevirtual 45	java/io/RandomAccessFile:length	()J
    //   20: lstore_2
    //   21: lload_2
    //   22: l2i
    //   23: istore_1
    //   24: iload_1
    //   25: i2l
    //   26: lload_2
    //   27: lcmp
    //   28: ifeq +38 -> 66
    //   31: aload 4
    //   33: astore_0
    //   34: new 34	java/io/IOException
    //   37: dup
    //   38: ldc 10
    //   40: invokespecial 48	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   43: athrow
    //   44: astore_0
    //   45: aload 4
    //   47: astore_0
    //   48: iconst_0
    //   49: newarray <illegal type>
    //   51: astore 5
    //   53: aload 4
    //   55: ifnull +8 -> 63
    //   58: aload 4
    //   60: invokevirtual 52	java/io/RandomAccessFile:close	()V
    //   63: aload 5
    //   65: areturn
    //   66: aload 4
    //   68: astore_0
    //   69: iload_1
    //   70: newarray <illegal type>
    //   72: astore 5
    //   74: aload 4
    //   76: astore_0
    //   77: aload 4
    //   79: aload 5
    //   81: invokevirtual 56	java/io/RandomAccessFile:readFully	([B)V
    //   84: aload 4
    //   86: invokevirtual 52	java/io/RandomAccessFile:close	()V
    //   89: aload 5
    //   91: areturn
    //   92: astore_0
    //   93: aload 5
    //   95: areturn
    //   96: astore 4
    //   98: aconst_null
    //   99: astore_0
    //   100: aload_0
    //   101: ifnull +7 -> 108
    //   104: aload_0
    //   105: invokevirtual 52	java/io/RandomAccessFile:close	()V
    //   108: aload 4
    //   110: athrow
    //   111: astore_0
    //   112: aload 5
    //   114: areturn
    //   115: astore_0
    //   116: goto -8 -> 108
    //   119: astore 4
    //   121: goto -21 -> 100
    //   124: astore_0
    //   125: aconst_null
    //   126: astore 4
    //   128: goto -83 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	paramFile	java.io.File
    //   23	47	1	i	int
    //   20	7	2	l	long
    //   10	75	4	localRandomAccessFile	java.io.RandomAccessFile
    //   96	13	4	localObject1	Object
    //   119	1	4	localObject2	Object
    //   126	1	4	localObject3	Object
    //   51	62	5	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   15	21	44	java/lang/Throwable
    //   34	44	44	java/lang/Throwable
    //   69	74	44	java/lang/Throwable
    //   77	84	44	java/lang/Throwable
    //   84	89	92	java/io/IOException
    //   0	12	96	finally
    //   58	63	111	java/io/IOException
    //   104	108	115	java/io/IOException
    //   15	21	119	finally
    //   34	44	119	finally
    //   48	53	119	finally
    //   69	74	119	finally
    //   77	84	119	finally
    //   0	12	124	java/lang/Throwable
  }
  
  public static void b(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (Throwable paramCloseable) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\f\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
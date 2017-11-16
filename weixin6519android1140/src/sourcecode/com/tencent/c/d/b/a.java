package com.tencent.c.d.b;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class a
{
  private static final byte[] xRC = { 127, 69, 76, 70 };
  
  public static boolean XQ(String paramString)
  {
    byte[] arrayOfByte = new byte[xRC.length];
    try
    {
      localFileInputStream = new FileInputStream(paramString);
      try
      {
        if (localFileInputStream.read(arrayOfByte, 0, xRC.length) == arrayOfByte.length) {
          break label70;
        }
        throw new IOException("Read bytes less than " + arrayOfByte.length);
      }
      finally {}
    }
    finally
    {
      for (;;)
      {
        int i;
        FileInputStream localFileInputStream = null;
      }
    }
    b.b(localFileInputStream);
    throw paramString;
    label70:
    i = 0;
    while (i < xRC.length)
    {
      int j = xRC[i];
      int k = arrayOfByte[i];
      if (j != k)
      {
        b.b(localFileInputStream);
        return false;
      }
      i += 1;
    }
    b.b(localFileInputStream);
    return true;
  }
  
  /* Error */
  public static byte[] XS(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 19	java/io/FileInputStream
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 23	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   10: astore_0
    //   11: new 55	java/io/ByteArrayOutputStream
    //   14: dup
    //   15: aload_0
    //   16: invokevirtual 59	java/io/FileInputStream:available	()I
    //   19: invokespecial 62	java/io/ByteArrayOutputStream:<init>	(I)V
    //   22: astore_3
    //   23: aload_0
    //   24: aload_3
    //   25: invokestatic 65	com/tencent/c/d/b/b:b	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   28: pop2
    //   29: aload_3
    //   30: invokevirtual 69	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   33: astore_1
    //   34: aload_1
    //   35: ifnull +13 -> 48
    //   38: aload_0
    //   39: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   42: aload_3
    //   43: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   46: aload_1
    //   47: areturn
    //   48: ldc 71
    //   50: invokevirtual 76	java/lang/String:getBytes	()[B
    //   53: astore_1
    //   54: goto -16 -> 38
    //   57: astore_0
    //   58: aconst_null
    //   59: astore_1
    //   60: aload_2
    //   61: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   64: aload_1
    //   65: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   68: aload_0
    //   69: athrow
    //   70: astore_3
    //   71: aconst_null
    //   72: astore_1
    //   73: aload_0
    //   74: astore_2
    //   75: aload_3
    //   76: astore_0
    //   77: goto -17 -> 60
    //   80: astore_1
    //   81: aload_0
    //   82: astore_2
    //   83: aload_1
    //   84: astore_0
    //   85: aload_3
    //   86: astore_1
    //   87: goto -27 -> 60
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	paramString	String
    //   33	40	1	arrayOfByte	byte[]
    //   80	4	1	localObject1	Object
    //   86	1	1	localObject2	Object
    //   1	82	2	localObject3	Object
    //   22	21	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   70	16	3	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   2	11	57	finally
    //   11	23	70	finally
    //   23	34	80	finally
    //   48	54	80	finally
  }
  
  /* Error */
  public static byte[] dp(String paramString, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: new 82	java/io/File
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 83	java/io/File:<init>	(Ljava/lang/String;)V
    //   10: astore_0
    //   11: aload_0
    //   12: invokevirtual 87	java/io/File:exists	()Z
    //   15: ifne +5 -> 20
    //   18: aconst_null
    //   19: areturn
    //   20: new 19	java/io/FileInputStream
    //   23: dup
    //   24: aload_0
    //   25: invokespecial 90	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   28: astore_0
    //   29: iload_1
    //   30: newarray <illegal type>
    //   32: astore 5
    //   34: aload_0
    //   35: aload 5
    //   37: iload_2
    //   38: iload_1
    //   39: iload_2
    //   40: isub
    //   41: invokevirtual 91	java/io/FileInputStream:read	([BII)I
    //   44: istore 4
    //   46: iload_2
    //   47: istore_3
    //   48: iload 4
    //   50: iconst_m1
    //   51: if_icmpeq +15 -> 66
    //   54: iload_2
    //   55: iload 4
    //   57: iadd
    //   58: istore_3
    //   59: iload_3
    //   60: istore_2
    //   61: iload_3
    //   62: iload_1
    //   63: if_icmplt -29 -> 34
    //   66: iload_3
    //   67: ifne +9 -> 76
    //   70: aload_0
    //   71: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   74: aconst_null
    //   75: areturn
    //   76: iload_3
    //   77: iload_1
    //   78: if_icmpge +59 -> 137
    //   81: iload_3
    //   82: newarray <illegal type>
    //   84: astore 6
    //   86: aload 5
    //   88: iconst_0
    //   89: aload 6
    //   91: iconst_0
    //   92: iload_3
    //   93: invokestatic 97	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   96: aload 6
    //   98: astore 5
    //   100: aload_0
    //   101: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   104: aload 5
    //   106: areturn
    //   107: astore_0
    //   108: aconst_null
    //   109: astore_0
    //   110: aload_0
    //   111: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   114: aconst_null
    //   115: areturn
    //   116: astore 5
    //   118: aconst_null
    //   119: astore_0
    //   120: aload_0
    //   121: invokestatic 51	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   124: aload 5
    //   126: athrow
    //   127: astore 5
    //   129: goto -9 -> 120
    //   132: astore 5
    //   134: goto -24 -> 110
    //   137: goto -37 -> 100
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	140	0	paramString	String
    //   0	140	1	paramInt	int
    //   1	60	2	i	int
    //   47	46	3	j	int
    //   44	14	4	k	int
    //   32	73	5	localObject1	Object
    //   116	9	5	localObject2	Object
    //   127	1	5	localObject3	Object
    //   132	1	5	localThrowable	Throwable
    //   84	13	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   20	29	107	java/lang/Throwable
    //   20	29	116	finally
    //   29	34	127	finally
    //   34	46	127	finally
    //   81	96	127	finally
    //   29	34	132	java/lang/Throwable
    //   34	46	132	java/lang/Throwable
    //   81	96	132	java/lang/Throwable
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\d\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
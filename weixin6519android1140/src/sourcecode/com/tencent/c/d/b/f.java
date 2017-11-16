package com.tencent.c.d.b;

public final class f
{
  private static Boolean xRI = null;
  private static final Object xRJ = new Object();
  
  /* Error */
  public static boolean cnw()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_0
    //   3: istore_0
    //   4: getstatic 17	com/tencent/c/d/b/f:xRJ	Ljava/lang/Object;
    //   7: astore 5
    //   9: aload 5
    //   11: monitorenter
    //   12: getstatic 12	com/tencent/c/d/b/f:xRI	Ljava/lang/Boolean;
    //   15: ifnonnull +73 -> 88
    //   18: getstatic 28	android/os/Build$VERSION:SDK_INT	I
    //   21: bipush 17
    //   23: if_icmplt +112 -> 135
    //   26: new 30	java/io/File
    //   29: dup
    //   30: ldc 32
    //   32: invokespecial 35	java/io/File:<init>	(Ljava/lang/String;)V
    //   35: invokevirtual 38	java/io/File:exists	()Z
    //   38: istore_1
    //   39: iload_1
    //   40: ifeq +95 -> 135
    //   43: new 40	java/io/FileInputStream
    //   46: dup
    //   47: ldc 32
    //   49: invokespecial 41	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   52: astore_2
    //   53: aload_2
    //   54: invokevirtual 47	java/io/InputStream:read	()I
    //   57: bipush 49
    //   59: if_icmpne +5 -> 64
    //   62: iconst_1
    //   63: istore_0
    //   64: aload_2
    //   65: invokestatic 53	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   68: iload_0
    //   69: invokestatic 59	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   72: astore_2
    //   73: aload_2
    //   74: astore_3
    //   75: aload_2
    //   76: ifnonnull +8 -> 84
    //   79: iconst_0
    //   80: invokestatic 59	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   83: astore_3
    //   84: aload_3
    //   85: putstatic 12	com/tencent/c/d/b/f:xRI	Ljava/lang/Boolean;
    //   88: getstatic 12	com/tencent/c/d/b/f:xRI	Ljava/lang/Boolean;
    //   91: invokevirtual 62	java/lang/Boolean:booleanValue	()Z
    //   94: istore_0
    //   95: aload 5
    //   97: monitorexit
    //   98: iload_0
    //   99: ireturn
    //   100: aload_2
    //   101: invokestatic 53	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   104: aconst_null
    //   105: astore_2
    //   106: goto -33 -> 73
    //   109: aload_3
    //   110: invokestatic 53	com/tencent/c/d/b/b:b	(Ljava/io/Closeable;)V
    //   113: aload_2
    //   114: athrow
    //   115: astore_2
    //   116: aload 5
    //   118: monitorexit
    //   119: aload_2
    //   120: athrow
    //   121: astore 4
    //   123: aload_2
    //   124: astore_3
    //   125: aload 4
    //   127: astore_2
    //   128: goto -19 -> 109
    //   131: astore_3
    //   132: goto -32 -> 100
    //   135: aconst_null
    //   136: astore_2
    //   137: goto -64 -> 73
    //   140: astore_2
    //   141: aconst_null
    //   142: astore_2
    //   143: goto -43 -> 100
    //   146: astore_2
    //   147: goto -38 -> 109
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	96	0	bool1	boolean
    //   38	2	1	bool2	boolean
    //   52	62	2	localObject1	Object
    //   115	9	2	localObject2	Object
    //   127	10	2	localObject3	Object
    //   140	1	2	localException1	Exception
    //   142	1	2	localObject4	Object
    //   146	1	2	localObject5	Object
    //   1	124	3	localObject6	Object
    //   131	1	3	localException2	Exception
    //   121	5	4	localObject7	Object
    //   7	110	5	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   12	39	115	finally
    //   64	73	115	finally
    //   79	84	115	finally
    //   84	88	115	finally
    //   88	98	115	finally
    //   100	104	115	finally
    //   109	115	115	finally
    //   116	119	115	finally
    //   53	62	121	finally
    //   53	62	131	java/lang/Exception
    //   43	53	140	java/lang/Exception
    //   43	53	146	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\d\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
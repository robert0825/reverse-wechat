package com.tencent.mm.pluginsdk.j.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public final class a
{
  public static long DI(String paramString)
  {
    GMTrace.i(841947807744L, 6273);
    if (bg.nm(paramString))
    {
      GMTrace.o(841947807744L, 6273);
      return 0L;
    }
    paramString = new File(paramString);
    if (paramString.isFile())
    {
      long l = paramString.length();
      GMTrace.o(841947807744L, 6273);
      return l;
    }
    GMTrace.o(841947807744L, 6273);
    return 0L;
  }
  
  /* Error */
  public static byte[] OR(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 45
    //   3: sipush 6275
    //   6: invokestatic 14	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 48	java/io/FileInputStream
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 49	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   17: astore_0
    //   18: new 51	java/io/ByteArrayOutputStream
    //   21: dup
    //   22: invokespecial 54	java/io/ByteArrayOutputStream:<init>	()V
    //   25: astore 4
    //   27: aload 4
    //   29: astore_3
    //   30: aload_0
    //   31: astore_2
    //   32: sipush 4096
    //   35: newarray <illegal type>
    //   37: astore 5
    //   39: aload 4
    //   41: astore_3
    //   42: aload_0
    //   43: astore_2
    //   44: aload_0
    //   45: aload 5
    //   47: invokevirtual 58	java/io/FileInputStream:read	([B)I
    //   50: istore_1
    //   51: iload_1
    //   52: iconst_m1
    //   53: if_icmpeq +60 -> 113
    //   56: aload 4
    //   58: astore_3
    //   59: aload_0
    //   60: astore_2
    //   61: aload 4
    //   63: aload 5
    //   65: iconst_0
    //   66: iload_1
    //   67: invokevirtual 62	java/io/ByteArrayOutputStream:write	([BII)V
    //   70: goto -31 -> 39
    //   73: astore 5
    //   75: aload 4
    //   77: astore_3
    //   78: aload_0
    //   79: astore_2
    //   80: ldc 64
    //   82: aload 5
    //   84: ldc 66
    //   86: iconst_0
    //   87: anewarray 4	java/lang/Object
    //   90: invokestatic 72	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: aload_0
    //   94: invokestatic 76	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   97: aload 4
    //   99: invokestatic 76	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   102: ldc2_w 45
    //   105: sipush 6275
    //   108: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   111: aconst_null
    //   112: areturn
    //   113: aload 4
    //   115: astore_3
    //   116: aload_0
    //   117: astore_2
    //   118: aload 4
    //   120: invokevirtual 79	java/io/ByteArrayOutputStream:flush	()V
    //   123: aload 4
    //   125: astore_3
    //   126: aload_0
    //   127: astore_2
    //   128: aload 4
    //   130: invokevirtual 83	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   133: astore 5
    //   135: aload_0
    //   136: invokestatic 76	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   139: aload 4
    //   141: invokestatic 76	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   144: ldc2_w 45
    //   147: sipush 6275
    //   150: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   153: aload 5
    //   155: areturn
    //   156: astore 5
    //   158: aconst_null
    //   159: astore 4
    //   161: aconst_null
    //   162: astore_0
    //   163: aload 4
    //   165: astore_3
    //   166: aload_0
    //   167: astore_2
    //   168: ldc 64
    //   170: aload 5
    //   172: ldc 66
    //   174: iconst_0
    //   175: anewarray 4	java/lang/Object
    //   178: invokestatic 72	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: aload_0
    //   182: invokestatic 76	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   185: aload 4
    //   187: invokestatic 76	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   190: goto -88 -> 102
    //   193: astore 4
    //   195: aconst_null
    //   196: astore_3
    //   197: aconst_null
    //   198: astore_0
    //   199: aload_0
    //   200: invokestatic 76	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   203: aload_3
    //   204: invokestatic 76	com/tencent/mm/pluginsdk/j/a/e/a:f	(Ljava/io/Closeable;)V
    //   207: aload 4
    //   209: athrow
    //   210: astore 4
    //   212: aconst_null
    //   213: astore_3
    //   214: goto -15 -> 199
    //   217: astore 4
    //   219: aload_2
    //   220: astore_0
    //   221: goto -22 -> 199
    //   224: astore 5
    //   226: aconst_null
    //   227: astore 4
    //   229: goto -66 -> 163
    //   232: astore 5
    //   234: goto -71 -> 163
    //   237: astore 5
    //   239: aconst_null
    //   240: astore 4
    //   242: aconst_null
    //   243: astore_0
    //   244: goto -169 -> 75
    //   247: astore 5
    //   249: aconst_null
    //   250: astore 4
    //   252: goto -177 -> 75
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	255	0	paramString	String
    //   50	17	1	i	int
    //   31	189	2	str	String
    //   29	185	3	localByteArrayOutputStream1	java.io.ByteArrayOutputStream
    //   25	161	4	localByteArrayOutputStream2	java.io.ByteArrayOutputStream
    //   193	15	4	localObject1	Object
    //   210	1	4	localObject2	Object
    //   217	1	4	localObject3	Object
    //   227	24	4	localObject4	Object
    //   37	27	5	arrayOfByte1	byte[]
    //   73	10	5	localFileNotFoundException1	java.io.FileNotFoundException
    //   133	21	5	arrayOfByte2	byte[]
    //   156	15	5	localIOException1	IOException
    //   224	1	5	localIOException2	IOException
    //   232	1	5	localIOException3	IOException
    //   237	1	5	localFileNotFoundException2	java.io.FileNotFoundException
    //   247	1	5	localFileNotFoundException3	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   32	39	73	java/io/FileNotFoundException
    //   44	51	73	java/io/FileNotFoundException
    //   61	70	73	java/io/FileNotFoundException
    //   118	123	73	java/io/FileNotFoundException
    //   128	135	73	java/io/FileNotFoundException
    //   9	18	156	java/io/IOException
    //   9	18	193	finally
    //   18	27	210	finally
    //   32	39	217	finally
    //   44	51	217	finally
    //   61	70	217	finally
    //   80	93	217	finally
    //   118	123	217	finally
    //   128	135	217	finally
    //   168	181	217	finally
    //   18	27	224	java/io/IOException
    //   32	39	232	java/io/IOException
    //   44	51	232	java/io/IOException
    //   61	70	232	java/io/IOException
    //   118	123	232	java/io/IOException
    //   128	135	232	java/io/IOException
    //   9	18	237	java/io/FileNotFoundException
    //   18	27	247	java/io/FileNotFoundException
  }
  
  public static boolean OS(String paramString)
  {
    GMTrace.i(842484678656L, 6277);
    if (bg.nm(paramString))
    {
      GMTrace.o(842484678656L, 6277);
      return false;
    }
    paramString = new File(paramString);
    if ((!paramString.exists()) || (paramString.delete()))
    {
      GMTrace.o(842484678656L, 6277);
      return true;
    }
    GMTrace.o(842484678656L, 6277);
    return false;
  }
  
  public static boolean aZ(String paramString)
  {
    GMTrace.i(20285801627648L, 151141);
    if (bg.nm(paramString))
    {
      GMTrace.o(20285801627648L, 151141);
      return false;
    }
    paramString = new File(paramString);
    if ((paramString.exists()) && (paramString.isFile()))
    {
      GMTrace.o(20285801627648L, 151141);
      return true;
    }
    GMTrace.o(20285801627648L, 151141);
    return false;
  }
  
  public static void f(Closeable paramCloseable)
  {
    GMTrace.i(842350460928L, 6276);
    if (paramCloseable == null)
    {
      GMTrace.o(842350460928L, 6276);
      return;
    }
    try
    {
      paramCloseable.close();
      GMTrace.o(842350460928L, 6276);
      return;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.ResDownloaderFileUtils", localIOException, "", new Object[0]);
      w.e("MicroMsg.ResDownloaderFileUtils", String.format("%s close failed (%s)", new Object[] { paramCloseable.getClass().getSimpleName(), localIOException.getMessage() }));
      GMTrace.o(842350460928L, 6276);
    }
  }
  
  /* Error */
  public static boolean u(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 131
    //   3: sipush 6274
    //   6: invokestatic 14	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokestatic 136	com/tencent/mm/sdk/platformtools/bg:bq	([B)Z
    //   13: ifeq +14 -> 27
    //   16: ldc2_w 131
    //   19: sipush 6274
    //   22: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   25: iconst_0
    //   26: ireturn
    //   27: new 25	java/io/File
    //   30: dup
    //   31: aload_0
    //   32: invokespecial 29	java/io/File:<init>	(Ljava/lang/String;)V
    //   35: astore_0
    //   36: aload_0
    //   37: invokevirtual 92	java/io/File:delete	()Z
    //   40: pop
    //   41: aload_0
    //   42: invokevirtual 140	java/io/File:getParentFile	()Ljava/io/File;
    //   45: invokevirtual 143	java/io/File:mkdirs	()Z
    //   48: pop
    //   49: aconst_null
    //   50: astore_2
    //   51: aconst_null
    //   52: astore_3
    //   53: new 145	java/io/FileOutputStream
    //   56: dup
    //   57: aload_0
    //   58: invokespecial 148	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   61: astore_0
    //   62: aload_0
    //   63: astore_2
    //   64: aload_0
    //   65: aload_1
    //   66: invokevirtual 151	java/io/FileOutputStream:write	([B)V
    //   69: aload_0
    //   70: invokevirtual 152	java/io/FileOutputStream:flush	()V
    //   73: aload_0
    //   74: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   77: ldc2_w 131
    //   80: sipush 6274
    //   83: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   86: iconst_1
    //   87: ireturn
    //   88: astore_0
    //   89: ldc 64
    //   91: aload_0
    //   92: ldc 66
    //   94: iconst_0
    //   95: anewarray 4	java/lang/Object
    //   98: invokestatic 72	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: goto -24 -> 77
    //   104: astore_1
    //   105: aconst_null
    //   106: astore_0
    //   107: aload_0
    //   108: astore_2
    //   109: ldc 64
    //   111: aload_1
    //   112: ldc 66
    //   114: iconst_0
    //   115: anewarray 4	java/lang/Object
    //   118: invokestatic 72	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: aload_0
    //   122: ifnull +11 -> 133
    //   125: aload_0
    //   126: invokevirtual 152	java/io/FileOutputStream:flush	()V
    //   129: aload_0
    //   130: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   133: ldc2_w 131
    //   136: sipush 6274
    //   139: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   142: iconst_0
    //   143: ireturn
    //   144: astore_0
    //   145: ldc 64
    //   147: aload_0
    //   148: ldc 66
    //   150: iconst_0
    //   151: anewarray 4	java/lang/Object
    //   154: invokestatic 72	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: goto -24 -> 133
    //   160: astore_1
    //   161: aload_3
    //   162: astore_0
    //   163: aload_0
    //   164: astore_2
    //   165: ldc 64
    //   167: aload_1
    //   168: ldc 66
    //   170: iconst_0
    //   171: anewarray 4	java/lang/Object
    //   174: invokestatic 72	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   177: aload_0
    //   178: ifnull -45 -> 133
    //   181: aload_0
    //   182: invokevirtual 152	java/io/FileOutputStream:flush	()V
    //   185: aload_0
    //   186: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   189: goto -56 -> 133
    //   192: astore_0
    //   193: ldc 64
    //   195: aload_0
    //   196: ldc 66
    //   198: iconst_0
    //   199: anewarray 4	java/lang/Object
    //   202: invokestatic 72	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: goto -72 -> 133
    //   208: astore_0
    //   209: aload_2
    //   210: ifnull +11 -> 221
    //   213: aload_2
    //   214: invokevirtual 152	java/io/FileOutputStream:flush	()V
    //   217: aload_2
    //   218: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   221: aload_0
    //   222: athrow
    //   223: astore_1
    //   224: ldc 64
    //   226: aload_1
    //   227: ldc 66
    //   229: iconst_0
    //   230: anewarray 4	java/lang/Object
    //   233: invokestatic 72	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   236: goto -15 -> 221
    //   239: astore_0
    //   240: goto -31 -> 209
    //   243: astore_1
    //   244: goto -81 -> 163
    //   247: astore_1
    //   248: goto -141 -> 107
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	paramString	String
    //   0	251	1	paramArrayOfByte	byte[]
    //   50	168	2	str	String
    //   52	110	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   69	77	88	java/io/IOException
    //   53	62	104	java/io/FileNotFoundException
    //   125	133	144	java/io/IOException
    //   53	62	160	java/io/IOException
    //   181	189	192	java/io/IOException
    //   53	62	208	finally
    //   165	177	208	finally
    //   213	221	223	java/io/IOException
    //   64	69	239	finally
    //   109	121	239	finally
    //   64	69	243	java/io/IOException
    //   64	69	247	java/io/FileNotFoundException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
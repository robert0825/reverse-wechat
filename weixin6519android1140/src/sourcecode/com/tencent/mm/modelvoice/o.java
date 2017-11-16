package com.tencent.mm.modelvoice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import junit.framework.Assert;

public final class o
{
  public static int e(String paramString, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(536736694272L, 3999);
    if (bg.nm(paramString))
    {
      GMTrace.o(536736694272L, 3999);
      return -1;
    }
    w.d("MicroMsg.VoiceFile", "fileName " + paramString);
    if (f(paramString, paramInt, paramBoolean))
    {
      GMTrace.o(536736694272L, 3999);
      return 0;
    }
    if (g(paramString, paramInt, paramBoolean))
    {
      GMTrace.o(536736694272L, 3999);
      return 2;
    }
    GMTrace.o(536736694272L, 3999);
    return 1;
  }
  
  /* Error */
  private static boolean f(String paramString, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc2_w 60
    //   3: sipush 4000
    //   6: invokestatic 14	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: iload_2
    //   10: ifeq +82 -> 92
    //   13: ldc 25
    //   15: new 27	java/lang/StringBuilder
    //   18: dup
    //   19: ldc 63
    //   21: invokespecial 33	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   24: aload_0
    //   25: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: invokevirtual 41	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   31: invokestatic 47	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: new 65	java/io/RandomAccessFile
    //   37: dup
    //   38: aload_0
    //   39: ldc 67
    //   41: invokespecial 69	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   44: astore_3
    //   45: aload_3
    //   46: astore_0
    //   47: bipush 6
    //   49: newarray <illegal type>
    //   51: astore 4
    //   53: aload_3
    //   54: astore_0
    //   55: aload_3
    //   56: aload 4
    //   58: iconst_0
    //   59: bipush 6
    //   61: invokevirtual 73	java/io/RandomAccessFile:read	([BII)I
    //   64: iconst_m1
    //   65: if_icmpne +61 -> 126
    //   68: aload_3
    //   69: astore_0
    //   70: ldc 25
    //   72: ldc 75
    //   74: invokestatic 77	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: aload_3
    //   78: invokevirtual 81	java/io/RandomAccessFile:close	()V
    //   81: ldc2_w 60
    //   84: sipush 4000
    //   87: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   90: iconst_0
    //   91: ireturn
    //   92: iload_1
    //   93: ifne +261 -> 354
    //   96: aload_0
    //   97: invokestatic 87	com/tencent/mm/modelvoice/q:getFullPath	(Ljava/lang/String;)Ljava/lang/String;
    //   100: astore_0
    //   101: goto -88 -> 13
    //   104: astore_0
    //   105: ldc 25
    //   107: ldc 89
    //   109: iconst_1
    //   110: anewarray 4	java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: aload_0
    //   116: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   119: aastore
    //   120: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: goto -42 -> 81
    //   126: aload_3
    //   127: astore_0
    //   128: new 97	java/lang/String
    //   131: dup
    //   132: aload 4
    //   134: invokespecial 100	java/lang/String:<init>	([B)V
    //   137: astore 5
    //   139: aload_3
    //   140: astore_0
    //   141: ldc 25
    //   143: ldc 102
    //   145: iconst_3
    //   146: anewarray 4	java/lang/Object
    //   149: dup
    //   150: iconst_0
    //   151: aload 4
    //   153: invokestatic 106	com/tencent/mm/sdk/platformtools/bg:bp	([B)Ljava/lang/String;
    //   156: aastore
    //   157: dup
    //   158: iconst_1
    //   159: aload 5
    //   161: aastore
    //   162: dup
    //   163: iconst_2
    //   164: ldc 108
    //   166: aastore
    //   167: invokestatic 110	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   170: aload_3
    //   171: astore_0
    //   172: aload 5
    //   174: ldc 108
    //   176: invokevirtual 113	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   179: istore_2
    //   180: iload_2
    //   181: ifeq +40 -> 221
    //   184: aload_3
    //   185: invokevirtual 81	java/io/RandomAccessFile:close	()V
    //   188: ldc2_w 60
    //   191: sipush 4000
    //   194: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   197: iconst_1
    //   198: ireturn
    //   199: astore_0
    //   200: ldc 25
    //   202: ldc 89
    //   204: iconst_1
    //   205: anewarray 4	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: aload_0
    //   211: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   214: aastore
    //   215: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: goto -30 -> 188
    //   221: aload_3
    //   222: invokevirtual 81	java/io/RandomAccessFile:close	()V
    //   225: ldc2_w 60
    //   228: sipush 4000
    //   231: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   234: iconst_0
    //   235: ireturn
    //   236: astore_0
    //   237: ldc 25
    //   239: ldc 89
    //   241: iconst_1
    //   242: anewarray 4	java/lang/Object
    //   245: dup
    //   246: iconst_0
    //   247: aload_0
    //   248: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   251: aastore
    //   252: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   255: goto -30 -> 225
    //   258: astore 4
    //   260: aconst_null
    //   261: astore_3
    //   262: aload_3
    //   263: astore_0
    //   264: ldc 25
    //   266: aload 4
    //   268: ldc 115
    //   270: iconst_0
    //   271: anewarray 4	java/lang/Object
    //   274: invokestatic 119	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: aload_3
    //   278: ifnull -53 -> 225
    //   281: aload_3
    //   282: invokevirtual 81	java/io/RandomAccessFile:close	()V
    //   285: goto -60 -> 225
    //   288: astore_0
    //   289: ldc 25
    //   291: ldc 89
    //   293: iconst_1
    //   294: anewarray 4	java/lang/Object
    //   297: dup
    //   298: iconst_0
    //   299: aload_0
    //   300: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   303: aastore
    //   304: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   307: goto -82 -> 225
    //   310: astore_3
    //   311: aconst_null
    //   312: astore_0
    //   313: aload_0
    //   314: ifnull +7 -> 321
    //   317: aload_0
    //   318: invokevirtual 81	java/io/RandomAccessFile:close	()V
    //   321: aload_3
    //   322: athrow
    //   323: astore_0
    //   324: ldc 25
    //   326: ldc 89
    //   328: iconst_1
    //   329: anewarray 4	java/lang/Object
    //   332: dup
    //   333: iconst_0
    //   334: aload_0
    //   335: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   338: aastore
    //   339: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   342: goto -21 -> 321
    //   345: astore_3
    //   346: goto -33 -> 313
    //   349: astore 4
    //   351: goto -89 -> 262
    //   354: aconst_null
    //   355: astore_0
    //   356: goto -343 -> 13
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	359	0	paramString	String
    //   0	359	1	paramInt	int
    //   0	359	2	paramBoolean	boolean
    //   44	238	3	localRandomAccessFile	java.io.RandomAccessFile
    //   310	12	3	localObject1	Object
    //   345	1	3	localObject2	Object
    //   51	101	4	arrayOfByte	byte[]
    //   258	9	4	localException1	Exception
    //   349	1	4	localException2	Exception
    //   137	36	5	str	String
    // Exception table:
    //   from	to	target	type
    //   77	81	104	java/io/IOException
    //   184	188	199	java/io/IOException
    //   221	225	236	java/io/IOException
    //   34	45	258	java/lang/Exception
    //   281	285	288	java/io/IOException
    //   34	45	310	finally
    //   317	321	323	java/io/IOException
    //   47	53	345	finally
    //   55	68	345	finally
    //   70	77	345	finally
    //   128	139	345	finally
    //   141	170	345	finally
    //   172	180	345	finally
    //   264	277	345	finally
    //   47	53	349	java/lang/Exception
    //   55	68	349	java/lang/Exception
    //   70	77	349	java/lang/Exception
    //   128	139	349	java/lang/Exception
    //   141	170	349	java/lang/Exception
    //   172	180	349	java/lang/Exception
  }
  
  /* Error */
  public static boolean g(String paramString, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc2_w 120
    //   3: sipush 4001
    //   6: invokestatic 14	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: iload_2
    //   10: ifeq +85 -> 95
    //   13: ldc 25
    //   15: new 27	java/lang/StringBuilder
    //   18: dup
    //   19: ldc 123
    //   21: invokespecial 33	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   24: aload_0
    //   25: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: invokevirtual 41	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   31: invokestatic 47	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: aconst_null
    //   35: astore 4
    //   37: new 65	java/io/RandomAccessFile
    //   40: dup
    //   41: aload_0
    //   42: ldc 67
    //   44: invokespecial 69	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: astore_3
    //   48: aload_3
    //   49: astore_0
    //   50: bipush 9
    //   52: newarray <illegal type>
    //   54: astore 4
    //   56: aload_3
    //   57: astore_0
    //   58: aload_3
    //   59: lconst_1
    //   60: invokevirtual 127	java/io/RandomAccessFile:seek	(J)V
    //   63: aload_3
    //   64: astore_0
    //   65: aload_3
    //   66: aload 4
    //   68: iconst_0
    //   69: bipush 9
    //   71: invokevirtual 73	java/io/RandomAccessFile:read	([BII)I
    //   74: istore_1
    //   75: iload_1
    //   76: iconst_m1
    //   77: if_icmpne +83 -> 160
    //   80: aload_3
    //   81: invokevirtual 81	java/io/RandomAccessFile:close	()V
    //   84: ldc2_w 120
    //   87: sipush 4001
    //   90: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   93: iconst_0
    //   94: ireturn
    //   95: iload_1
    //   96: ifne +11 -> 107
    //   99: aload_0
    //   100: invokestatic 87	com/tencent/mm/modelvoice/q:getFullPath	(Ljava/lang/String;)Ljava/lang/String;
    //   103: astore_0
    //   104: goto -91 -> 13
    //   107: iload_1
    //   108: iconst_1
    //   109: if_icmpne +278 -> 387
    //   112: ldc 25
    //   114: ldc -127
    //   116: iconst_1
    //   117: anewarray 4	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_0
    //   123: aastore
    //   124: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: ldc2_w 120
    //   130: sipush 4001
    //   133: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   136: iconst_0
    //   137: ireturn
    //   138: astore_0
    //   139: ldc 25
    //   141: ldc 89
    //   143: iconst_1
    //   144: anewarray 4	java/lang/Object
    //   147: dup
    //   148: iconst_0
    //   149: aload_0
    //   150: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   153: aastore
    //   154: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: goto -73 -> 84
    //   160: aload_3
    //   161: astore_0
    //   162: new 97	java/lang/String
    //   165: dup
    //   166: aload 4
    //   168: invokespecial 100	java/lang/String:<init>	([B)V
    //   171: astore 5
    //   173: aload_3
    //   174: astore_0
    //   175: ldc 25
    //   177: ldc -125
    //   179: iconst_3
    //   180: anewarray 4	java/lang/Object
    //   183: dup
    //   184: iconst_0
    //   185: aload 4
    //   187: invokestatic 106	com/tencent/mm/sdk/platformtools/bg:bp	([B)Ljava/lang/String;
    //   190: aastore
    //   191: dup
    //   192: iconst_1
    //   193: aload 5
    //   195: aastore
    //   196: dup
    //   197: iconst_2
    //   198: ldc -123
    //   200: aastore
    //   201: invokestatic 110	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   204: aload_3
    //   205: astore_0
    //   206: aload 5
    //   208: ldc -123
    //   210: invokevirtual 113	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   213: istore_2
    //   214: iload_2
    //   215: ifeq +40 -> 255
    //   218: aload_3
    //   219: invokevirtual 81	java/io/RandomAccessFile:close	()V
    //   222: ldc2_w 120
    //   225: sipush 4001
    //   228: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   231: iconst_1
    //   232: ireturn
    //   233: astore_0
    //   234: ldc 25
    //   236: ldc 89
    //   238: iconst_1
    //   239: anewarray 4	java/lang/Object
    //   242: dup
    //   243: iconst_0
    //   244: aload_0
    //   245: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   248: aastore
    //   249: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   252: goto -30 -> 222
    //   255: aload_3
    //   256: invokevirtual 81	java/io/RandomAccessFile:close	()V
    //   259: ldc2_w 120
    //   262: sipush 4001
    //   265: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   268: iconst_0
    //   269: ireturn
    //   270: astore_0
    //   271: ldc 25
    //   273: ldc 89
    //   275: iconst_1
    //   276: anewarray 4	java/lang/Object
    //   279: dup
    //   280: iconst_0
    //   281: aload_0
    //   282: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   285: aastore
    //   286: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   289: goto -30 -> 259
    //   292: astore_0
    //   293: aconst_null
    //   294: astore_3
    //   295: aload_3
    //   296: astore_0
    //   297: ldc 25
    //   299: ldc -121
    //   301: invokestatic 47	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   304: aload_3
    //   305: ifnull -46 -> 259
    //   308: aload_3
    //   309: invokevirtual 81	java/io/RandomAccessFile:close	()V
    //   312: goto -53 -> 259
    //   315: astore_0
    //   316: ldc 25
    //   318: ldc 89
    //   320: iconst_1
    //   321: anewarray 4	java/lang/Object
    //   324: dup
    //   325: iconst_0
    //   326: aload_0
    //   327: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   330: aastore
    //   331: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   334: goto -75 -> 259
    //   337: astore_0
    //   338: aload 4
    //   340: astore_3
    //   341: aload_3
    //   342: ifnull +7 -> 349
    //   345: aload_3
    //   346: invokevirtual 81	java/io/RandomAccessFile:close	()V
    //   349: aload_0
    //   350: athrow
    //   351: astore_3
    //   352: ldc 25
    //   354: ldc 89
    //   356: iconst_1
    //   357: anewarray 4	java/lang/Object
    //   360: dup
    //   361: iconst_0
    //   362: aload_3
    //   363: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   366: aastore
    //   367: invokestatic 95	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   370: goto -21 -> 349
    //   373: astore 4
    //   375: aload_0
    //   376: astore_3
    //   377: aload 4
    //   379: astore_0
    //   380: goto -39 -> 341
    //   383: astore_0
    //   384: goto -89 -> 295
    //   387: aconst_null
    //   388: astore_0
    //   389: goto -376 -> 13
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	392	0	paramString	String
    //   0	392	1	paramInt	int
    //   0	392	2	paramBoolean	boolean
    //   47	299	3	localObject1	Object
    //   351	12	3	localIOException	java.io.IOException
    //   376	1	3	str1	String
    //   35	304	4	arrayOfByte	byte[]
    //   373	5	4	localObject2	Object
    //   171	36	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   80	84	138	java/io/IOException
    //   218	222	233	java/io/IOException
    //   255	259	270	java/io/IOException
    //   37	48	292	java/lang/Exception
    //   308	312	315	java/io/IOException
    //   37	48	337	finally
    //   345	349	351	java/io/IOException
    //   50	56	373	finally
    //   58	63	373	finally
    //   65	75	373	finally
    //   162	173	373	finally
    //   175	204	373	finally
    //   206	214	373	finally
    //   297	304	373	finally
    //   50	56	383	java/lang/Exception
    //   58	63	383	java/lang/Exception
    //   65	75	383	java/lang/Exception
    //   162	173	383	java/lang/Exception
    //   175	204	383	java/lang/Exception
    //   206	214	383	java/lang/Exception
  }
  
  public static int mH(String paramString)
  {
    GMTrace.i(536602476544L, 3998);
    if (bg.nm(paramString))
    {
      GMTrace.o(536602476544L, 3998);
      return -1;
    }
    w.d("MicroMsg.VoiceFile", "fileName " + paramString);
    if (f(paramString, 0, false))
    {
      GMTrace.o(536602476544L, 3998);
      return 0;
    }
    if (g(paramString, 0, false))
    {
      GMTrace.o(536602476544L, 3998);
      return 2;
    }
    GMTrace.o(536602476544L, 3998);
    return 1;
  }
  
  private static int mI(String paramString)
  {
    GMTrace.i(537273565184L, 4003);
    if (paramString.length() >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      paramString = new File(paramString);
      if (paramString.exists()) {
        break;
      }
      GMTrace.o(537273565184L, 4003);
      return 0;
    }
    int i = (int)paramString.length() - 6;
    if (i <= 0)
    {
      GMTrace.o(537273565184L, 4003);
      return 0;
    }
    GMTrace.o(537273565184L, 4003);
    return i;
  }
  
  public static int mm(String paramString)
  {
    boolean bool2 = true;
    boolean bool1 = true;
    GMTrace.i(537139347456L, 4002);
    switch (mH(paramString))
    {
    default: 
      i = mI(q.getFullPath(paramString));
      GMTrace.o(537139347456L, 4002);
      return i;
    case 0: 
      i = mI(q.getFullPath(paramString));
      GMTrace.o(537139347456L, 4002);
      return i;
    case 1: 
      paramString = q.getFullPath(paramString);
      if (paramString.length() >= 0) {}
      for (;;)
      {
        Assert.assertTrue(bool1);
        paramString = new File(paramString);
        if (paramString.exists()) {
          break;
        }
        GMTrace.o(537139347456L, 4002);
        return 0;
        bool1 = false;
      }
      i = (int)paramString.length();
      if (i <= 0)
      {
        GMTrace.o(537139347456L, 4002);
        return 0;
      }
      GMTrace.o(537139347456L, 4002);
      return i;
    }
    paramString = q.getFullPath(paramString);
    if (paramString.length() >= 0) {}
    for (bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      paramString = new File(paramString);
      if (paramString.exists()) {
        break;
      }
      GMTrace.o(537139347456L, 4002);
      return 0;
    }
    int i = (int)paramString.length();
    if (i <= 0)
    {
      GMTrace.o(537139347456L, 4002);
      return 0;
    }
    GMTrace.o(537139347456L, 4002);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
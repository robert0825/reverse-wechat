package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.gmtrace.GMTrace;
import java.io.File;
import java.io.IOException;

public final class j
{
  /* Error */
  private static boolean a(java.io.InputStream paramInputStream, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: iconst_0
    //   4: istore 6
    //   6: ldc2_w 11
    //   9: ldc 13
    //   11: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   14: aload_0
    //   15: invokevirtual 25	java/io/InputStream:available	()I
    //   18: istore_3
    //   19: new 27	java/io/FileOutputStream
    //   22: dup
    //   23: aload_1
    //   24: iload_2
    //   25: invokespecial 31	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   28: astore 12
    //   30: aload 12
    //   32: astore 11
    //   34: sipush 16384
    //   37: newarray <illegal type>
    //   39: astore 13
    //   41: aload 12
    //   43: astore 11
    //   45: aload_0
    //   46: aload 13
    //   48: invokevirtual 35	java/io/InputStream:read	([B)I
    //   51: istore 4
    //   53: iload 4
    //   55: iconst_m1
    //   56: if_icmpeq +77 -> 133
    //   59: aload 12
    //   61: astore 11
    //   63: aload 12
    //   65: aload 13
    //   67: iconst_0
    //   68: iload 4
    //   70: invokevirtual 39	java/io/FileOutputStream:write	([BII)V
    //   73: goto -32 -> 41
    //   76: astore 11
    //   78: aload 12
    //   80: astore_1
    //   81: aload 11
    //   83: astore 12
    //   85: aload_1
    //   86: astore 11
    //   88: ldc 41
    //   90: aload 12
    //   92: ldc 43
    //   94: iconst_0
    //   95: anewarray 4	java/lang/Object
    //   98: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: aload_0
    //   102: ifnull +7 -> 109
    //   105: aload_0
    //   106: invokevirtual 53	java/io/InputStream:close	()V
    //   109: iload 6
    //   111: istore_2
    //   112: aload_1
    //   113: ifnull +10 -> 123
    //   116: aload_1
    //   117: invokevirtual 54	java/io/FileOutputStream:close	()V
    //   120: iload 6
    //   122: istore_2
    //   123: ldc2_w 11
    //   126: ldc 13
    //   128: invokestatic 57	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   131: iload_2
    //   132: ireturn
    //   133: iload_2
    //   134: ifeq +31 -> 165
    //   137: iload 5
    //   139: istore_2
    //   140: iload_2
    //   141: istore 5
    //   143: aload_0
    //   144: ifnull +10 -> 154
    //   147: aload_0
    //   148: invokevirtual 53	java/io/InputStream:close	()V
    //   151: iload_2
    //   152: istore 5
    //   154: aload 12
    //   156: invokevirtual 54	java/io/FileOutputStream:close	()V
    //   159: iload 5
    //   161: istore_2
    //   162: goto -39 -> 123
    //   165: aload 12
    //   167: astore 11
    //   169: new 59	java/io/File
    //   172: dup
    //   173: aload_1
    //   174: invokespecial 62	java/io/File:<init>	(Ljava/lang/String;)V
    //   177: astore_1
    //   178: aload 12
    //   180: astore 11
    //   182: aload_1
    //   183: invokevirtual 66	java/io/File:exists	()Z
    //   186: ifeq +28 -> 214
    //   189: iload_3
    //   190: i2l
    //   191: lstore 7
    //   193: aload 12
    //   195: astore 11
    //   197: aload_1
    //   198: invokevirtual 70	java/io/File:length	()J
    //   201: lstore 9
    //   203: iload 5
    //   205: istore_2
    //   206: lload 7
    //   208: lload 9
    //   210: lcmp
    //   211: ifeq -71 -> 140
    //   214: iconst_0
    //   215: istore_2
    //   216: goto -76 -> 140
    //   219: astore_0
    //   220: ldc 41
    //   222: aload_0
    //   223: ldc 43
    //   225: iconst_0
    //   226: anewarray 4	java/lang/Object
    //   229: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   232: iconst_0
    //   233: istore 5
    //   235: goto -81 -> 154
    //   238: astore_0
    //   239: ldc 41
    //   241: aload_0
    //   242: ldc 43
    //   244: iconst_0
    //   245: anewarray 4	java/lang/Object
    //   248: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: iload 6
    //   253: istore_2
    //   254: goto -131 -> 123
    //   257: astore_0
    //   258: ldc 41
    //   260: aload_0
    //   261: ldc 43
    //   263: iconst_0
    //   264: anewarray 4	java/lang/Object
    //   267: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   270: goto -161 -> 109
    //   273: astore_0
    //   274: ldc 41
    //   276: aload_0
    //   277: ldc 43
    //   279: iconst_0
    //   280: anewarray 4	java/lang/Object
    //   283: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   286: iload 6
    //   288: istore_2
    //   289: goto -166 -> 123
    //   292: astore_1
    //   293: aconst_null
    //   294: astore 11
    //   296: aload_0
    //   297: ifnull +7 -> 304
    //   300: aload_0
    //   301: invokevirtual 53	java/io/InputStream:close	()V
    //   304: aload 11
    //   306: ifnull +8 -> 314
    //   309: aload 11
    //   311: invokevirtual 54	java/io/FileOutputStream:close	()V
    //   314: aload_1
    //   315: athrow
    //   316: astore_0
    //   317: ldc 41
    //   319: aload_0
    //   320: ldc 43
    //   322: iconst_0
    //   323: anewarray 4	java/lang/Object
    //   326: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   329: goto -25 -> 304
    //   332: astore_0
    //   333: ldc 41
    //   335: aload_0
    //   336: ldc 43
    //   338: iconst_0
    //   339: anewarray 4	java/lang/Object
    //   342: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   345: goto -31 -> 314
    //   348: astore_1
    //   349: goto -53 -> 296
    //   352: astore 12
    //   354: aconst_null
    //   355: astore_1
    //   356: goto -271 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	359	0	paramInputStream	java.io.InputStream
    //   0	359	1	paramString	String
    //   0	359	2	paramBoolean	boolean
    //   18	172	3	i	int
    //   51	18	4	j	int
    //   1	233	5	bool1	boolean
    //   4	283	6	bool2	boolean
    //   191	16	7	l1	long
    //   201	8	9	l2	long
    //   32	30	11	localObject1	Object
    //   76	6	11	localException1	Exception
    //   86	224	11	localObject2	Object
    //   28	166	12	localObject3	Object
    //   352	1	12	localException2	Exception
    //   39	27	13	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   34	41	76	java/lang/Exception
    //   45	53	76	java/lang/Exception
    //   63	73	76	java/lang/Exception
    //   169	178	76	java/lang/Exception
    //   182	189	76	java/lang/Exception
    //   197	203	76	java/lang/Exception
    //   147	151	219	java/io/IOException
    //   154	159	238	java/io/IOException
    //   105	109	257	java/io/IOException
    //   116	120	273	java/io/IOException
    //   14	30	292	finally
    //   300	304	316	java/io/IOException
    //   309	314	332	java/io/IOException
    //   34	41	348	finally
    //   45	53	348	finally
    //   63	73	348	finally
    //   88	101	348	finally
    //   169	178	348	finally
    //   182	189	348	finally
    //   197	203	348	finally
    //   14	30	352	java/lang/Exception
  }
  
  /* Error */
  public static boolean eR(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 4
    //   6: iconst_1
    //   7: istore_3
    //   8: ldc2_w 74
    //   11: ldc 76
    //   13: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   16: aload_0
    //   17: invokestatic 82	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   20: ifne +10 -> 30
    //   23: aload_1
    //   24: invokestatic 82	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   27: ifeq +20 -> 47
    //   30: ldc 41
    //   32: ldc 84
    //   34: invokestatic 88	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: ldc2_w 74
    //   40: ldc 76
    //   42: invokestatic 57	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   45: iconst_0
    //   46: ireturn
    //   47: aload_0
    //   48: aload_1
    //   49: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   52: ifeq +13 -> 65
    //   55: ldc2_w 74
    //   58: ldc 76
    //   60: invokestatic 57	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   63: iconst_1
    //   64: ireturn
    //   65: new 96	java/io/FileInputStream
    //   68: dup
    //   69: aload_0
    //   70: invokespecial 97	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   73: astore_0
    //   74: new 27	java/io/FileOutputStream
    //   77: dup
    //   78: aload_1
    //   79: invokespecial 98	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   82: astore_1
    //   83: sipush 16384
    //   86: newarray <illegal type>
    //   88: astore 4
    //   90: aload_0
    //   91: aload 4
    //   93: invokevirtual 99	java/io/FileInputStream:read	([B)I
    //   96: istore_2
    //   97: iload_2
    //   98: iconst_m1
    //   99: if_icmpeq +64 -> 163
    //   102: aload_1
    //   103: aload 4
    //   105: iconst_0
    //   106: iload_2
    //   107: invokevirtual 39	java/io/FileOutputStream:write	([BII)V
    //   110: goto -20 -> 90
    //   113: astore 5
    //   115: aload_0
    //   116: astore 4
    //   118: aload 5
    //   120: astore_0
    //   121: ldc 41
    //   123: aload_0
    //   124: ldc 43
    //   126: iconst_0
    //   127: anewarray 4	java/lang/Object
    //   130: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: aload 4
    //   135: ifnull +8 -> 143
    //   138: aload 4
    //   140: invokevirtual 100	java/io/FileInputStream:close	()V
    //   143: aload_1
    //   144: ifnull +208 -> 352
    //   147: aload_1
    //   148: invokevirtual 54	java/io/FileOutputStream:close	()V
    //   151: iconst_0
    //   152: istore_3
    //   153: ldc2_w 74
    //   156: ldc 76
    //   158: invokestatic 57	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   161: iload_3
    //   162: ireturn
    //   163: aload_0
    //   164: invokevirtual 100	java/io/FileInputStream:close	()V
    //   167: aload_1
    //   168: invokevirtual 54	java/io/FileOutputStream:close	()V
    //   171: goto -18 -> 153
    //   174: astore_0
    //   175: ldc 41
    //   177: aload_0
    //   178: ldc 43
    //   180: iconst_0
    //   181: anewarray 4	java/lang/Object
    //   184: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: iconst_0
    //   188: istore_3
    //   189: goto -36 -> 153
    //   192: astore_0
    //   193: ldc 41
    //   195: aload_0
    //   196: ldc 43
    //   198: iconst_0
    //   199: anewarray 4	java/lang/Object
    //   202: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: iconst_0
    //   206: istore_3
    //   207: goto -40 -> 167
    //   210: astore_0
    //   211: ldc 41
    //   213: aload_0
    //   214: ldc 43
    //   216: iconst_0
    //   217: anewarray 4	java/lang/Object
    //   220: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   223: goto -80 -> 143
    //   226: astore_0
    //   227: ldc 41
    //   229: aload_0
    //   230: ldc 43
    //   232: iconst_0
    //   233: anewarray 4	java/lang/Object
    //   236: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: iconst_0
    //   240: istore_3
    //   241: goto -88 -> 153
    //   244: astore_0
    //   245: aconst_null
    //   246: astore_1
    //   247: aload 5
    //   249: astore 4
    //   251: aload 4
    //   253: ifnull +8 -> 261
    //   256: aload 4
    //   258: invokevirtual 100	java/io/FileInputStream:close	()V
    //   261: aload_1
    //   262: ifnull +7 -> 269
    //   265: aload_1
    //   266: invokevirtual 54	java/io/FileOutputStream:close	()V
    //   269: aload_0
    //   270: athrow
    //   271: astore 4
    //   273: ldc 41
    //   275: aload 4
    //   277: ldc 43
    //   279: iconst_0
    //   280: anewarray 4	java/lang/Object
    //   283: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   286: goto -25 -> 261
    //   289: astore_1
    //   290: ldc 41
    //   292: aload_1
    //   293: ldc 43
    //   295: iconst_0
    //   296: anewarray 4	java/lang/Object
    //   299: invokestatic 49	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   302: goto -33 -> 269
    //   305: astore 5
    //   307: aconst_null
    //   308: astore_1
    //   309: aload_0
    //   310: astore 4
    //   312: aload 5
    //   314: astore_0
    //   315: goto -64 -> 251
    //   318: astore 5
    //   320: aload_0
    //   321: astore 4
    //   323: aload 5
    //   325: astore_0
    //   326: goto -75 -> 251
    //   329: astore_0
    //   330: goto -79 -> 251
    //   333: astore_0
    //   334: aconst_null
    //   335: astore_1
    //   336: goto -215 -> 121
    //   339: astore 5
    //   341: aconst_null
    //   342: astore_1
    //   343: aload_0
    //   344: astore 4
    //   346: aload 5
    //   348: astore_0
    //   349: goto -228 -> 121
    //   352: iconst_0
    //   353: istore_3
    //   354: goto -201 -> 153
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	357	0	paramString1	String
    //   0	357	1	paramString2	String
    //   96	11	2	i	int
    //   7	347	3	bool	boolean
    //   4	253	4	localObject1	Object
    //   271	5	4	localIOException	IOException
    //   310	35	4	str	String
    //   1	1	5	localObject2	Object
    //   113	135	5	localException1	Exception
    //   305	8	5	localObject3	Object
    //   318	6	5	localObject4	Object
    //   339	8	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   83	90	113	java/lang/Exception
    //   90	97	113	java/lang/Exception
    //   102	110	113	java/lang/Exception
    //   167	171	174	java/io/IOException
    //   163	167	192	java/io/IOException
    //   138	143	210	java/io/IOException
    //   147	151	226	java/io/IOException
    //   65	74	244	finally
    //   256	261	271	java/io/IOException
    //   265	269	289	java/io/IOException
    //   74	83	305	finally
    //   83	90	318	finally
    //   90	97	318	finally
    //   102	110	318	finally
    //   121	133	329	finally
    //   65	74	333	java/lang/Exception
    //   74	83	339	java/lang/Exception
  }
  
  public static boolean r(String paramString1, String paramString2, boolean paramBoolean)
  {
    int i = 0;
    GMTrace.i(13919183699968L, 103706);
    if (bg.nm(paramString1))
    {
      GMTrace.o(13919183699968L, 103706);
      return false;
    }
    Object localObject = new File(paramString1);
    if (!((File)localObject).exists())
    {
      GMTrace.o(13919183699968L, 103706);
      return false;
    }
    File localFile = new File(paramString2);
    if (((File)localObject).isFile())
    {
      if ((!localFile.isFile()) && (localFile.exists()))
      {
        GMTrace.o(13919183699968L, 103706);
        return false;
      }
      eR(paramString1, paramString2);
      if (paramBoolean) {
        ((File)localObject).delete();
      }
    }
    for (;;)
    {
      GMTrace.o(13919183699968L, 103706);
      return true;
      if (((File)localObject).isDirectory())
      {
        if (!localFile.exists()) {
          localFile.mkdir();
        }
        if (!localFile.isDirectory())
        {
          GMTrace.o(13919183699968L, 103706);
          return false;
        }
        localObject = ((File)localObject).list();
        while (i < localObject.length)
        {
          r(paramString1 + "/" + localObject[i], paramString2 + "/" + localObject[i], paramBoolean);
          i += 1;
        }
      }
    }
  }
  
  public static boolean z(Context paramContext, String paramString1, String paramString2)
  {
    int i = 0;
    GMTrace.i(13919317917696L, 103707);
    boolean bool;
    try
    {
      bool = a(paramContext.getAssets().open(paramString1), paramString2, false);
      GMTrace.o(13919317917696L, 103707);
      return bool;
    }
    catch (IOException localIOException)
    {
      w.e("MicroMsg.SDK.FilesCopy", "copy assets file srcpath=%s to=%s failed, try pattern now", new Object[] { paramString1, paramString2 });
    }
    for (;;)
    {
      String str = paramString1 + "." + i;
      try
      {
        bool = a(paramContext.getAssets().open(str), paramString2, true);
        if (bool) {
          break label113;
        }
      }
      catch (IOException paramContext)
      {
        for (;;) {}
      }
      GMTrace.o(13919317917696L, 103707);
      return true;
      label113:
      w.d("MicroMsg.SDK.FilesCopy", "copy pattern %s", new Object[] { str });
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
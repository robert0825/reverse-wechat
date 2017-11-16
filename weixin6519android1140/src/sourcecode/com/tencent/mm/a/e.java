package com.tencent.mm.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public final class e
{
  public static int a(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    GMTrace.i(13859859464192L, 103264);
    int i = a(paramString1, paramString2 + paramString3, paramArrayOfByte);
    GMTrace.o(13859859464192L, 103264);
    return i;
  }
  
  /* Error */
  public static int a(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 41
    //   3: ldc 43
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_2
    //   9: ifnonnull +14 -> 23
    //   12: ldc2_w 41
    //   15: ldc 43
    //   17: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   20: bipush -2
    //   22: ireturn
    //   23: aconst_null
    //   24: astore 4
    //   26: aconst_null
    //   27: astore 5
    //   29: aload 4
    //   31: astore_3
    //   32: new 45	java/io/File
    //   35: dup
    //   36: aload_0
    //   37: invokespecial 48	java/io/File:<init>	(Ljava/lang/String;)V
    //   40: astore 6
    //   42: aload 4
    //   44: astore_3
    //   45: aload 6
    //   47: invokevirtual 52	java/io/File:exists	()Z
    //   50: ifne +12 -> 62
    //   53: aload 4
    //   55: astore_3
    //   56: aload 6
    //   58: invokevirtual 55	java/io/File:mkdirs	()Z
    //   61: pop
    //   62: aload 4
    //   64: astore_3
    //   65: new 45	java/io/File
    //   68: dup
    //   69: new 17	java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial 21	java/lang/StringBuilder:<init>	()V
    //   76: aload_0
    //   77: invokevirtual 25	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: aload_1
    //   81: invokevirtual 25	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: invokevirtual 29	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: invokespecial 48	java/io/File:<init>	(Ljava/lang/String;)V
    //   90: astore 6
    //   92: aload 4
    //   94: astore_3
    //   95: aload 6
    //   97: invokevirtual 52	java/io/File:exists	()Z
    //   100: ifne +12 -> 112
    //   103: aload 4
    //   105: astore_3
    //   106: aload 6
    //   108: invokevirtual 58	java/io/File:createNewFile	()Z
    //   111: pop
    //   112: aload 4
    //   114: astore_3
    //   115: new 60	java/io/BufferedOutputStream
    //   118: dup
    //   119: new 62	java/io/FileOutputStream
    //   122: dup
    //   123: aload 6
    //   125: iconst_1
    //   126: invokespecial 65	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   129: invokespecial 68	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   132: astore 4
    //   134: aload 4
    //   136: aload_2
    //   137: invokevirtual 72	java/io/BufferedOutputStream:write	([B)V
    //   140: aload 4
    //   142: invokevirtual 75	java/io/BufferedOutputStream:flush	()V
    //   145: aload 4
    //   147: invokevirtual 78	java/io/BufferedOutputStream:close	()V
    //   150: ldc2_w 41
    //   153: ldc 43
    //   155: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   158: iconst_0
    //   159: ireturn
    //   160: astore_3
    //   161: ldc 80
    //   163: aload_3
    //   164: ldc 82
    //   166: iconst_0
    //   167: anewarray 4	java/lang/Object
    //   170: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: ldc 80
    //   175: ldc 90
    //   177: iconst_5
    //   178: anewarray 4	java/lang/Object
    //   181: dup
    //   182: iconst_0
    //   183: aload_3
    //   184: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   187: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   190: aastore
    //   191: dup
    //   192: iconst_1
    //   193: aload_3
    //   194: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   197: aastore
    //   198: dup
    //   199: iconst_2
    //   200: aload_0
    //   201: aastore
    //   202: dup
    //   203: iconst_3
    //   204: aload_1
    //   205: aastore
    //   206: dup
    //   207: iconst_4
    //   208: aload_2
    //   209: arraylength
    //   210: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   213: aastore
    //   214: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   217: goto -67 -> 150
    //   220: astore_3
    //   221: aload 5
    //   223: astore 4
    //   225: aload_3
    //   226: astore 5
    //   228: aload 4
    //   230: astore_3
    //   231: ldc 80
    //   233: aload 5
    //   235: ldc 82
    //   237: iconst_0
    //   238: anewarray 4	java/lang/Object
    //   241: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   244: aload 4
    //   246: astore_3
    //   247: ldc 80
    //   249: ldc 114
    //   251: iconst_5
    //   252: anewarray 4	java/lang/Object
    //   255: dup
    //   256: iconst_0
    //   257: aload 5
    //   259: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   262: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   265: aastore
    //   266: dup
    //   267: iconst_1
    //   268: aload 5
    //   270: invokevirtual 115	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   273: aastore
    //   274: dup
    //   275: iconst_2
    //   276: aload_0
    //   277: aastore
    //   278: dup
    //   279: iconst_3
    //   280: aload_1
    //   281: aastore
    //   282: dup
    //   283: iconst_4
    //   284: aload_2
    //   285: arraylength
    //   286: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   289: aastore
    //   290: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   293: aload 4
    //   295: ifnull +8 -> 303
    //   298: aload 4
    //   300: invokevirtual 78	java/io/BufferedOutputStream:close	()V
    //   303: ldc2_w 41
    //   306: ldc 43
    //   308: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   311: iconst_m1
    //   312: ireturn
    //   313: astore_3
    //   314: ldc 80
    //   316: aload_3
    //   317: ldc 82
    //   319: iconst_0
    //   320: anewarray 4	java/lang/Object
    //   323: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   326: ldc 80
    //   328: ldc 90
    //   330: iconst_5
    //   331: anewarray 4	java/lang/Object
    //   334: dup
    //   335: iconst_0
    //   336: aload_3
    //   337: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   340: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   343: aastore
    //   344: dup
    //   345: iconst_1
    //   346: aload_3
    //   347: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   350: aastore
    //   351: dup
    //   352: iconst_2
    //   353: aload_0
    //   354: aastore
    //   355: dup
    //   356: iconst_3
    //   357: aload_1
    //   358: aastore
    //   359: dup
    //   360: iconst_4
    //   361: aload_2
    //   362: arraylength
    //   363: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   366: aastore
    //   367: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   370: goto -67 -> 303
    //   373: astore 5
    //   375: aload_3
    //   376: astore 4
    //   378: aload 5
    //   380: astore_3
    //   381: aload 4
    //   383: ifnull +8 -> 391
    //   386: aload 4
    //   388: invokevirtual 78	java/io/BufferedOutputStream:close	()V
    //   391: aload_3
    //   392: athrow
    //   393: astore 4
    //   395: ldc 80
    //   397: aload 4
    //   399: ldc 82
    //   401: iconst_0
    //   402: anewarray 4	java/lang/Object
    //   405: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   408: ldc 80
    //   410: ldc 90
    //   412: iconst_5
    //   413: anewarray 4	java/lang/Object
    //   416: dup
    //   417: iconst_0
    //   418: aload 4
    //   420: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   423: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   426: aastore
    //   427: dup
    //   428: iconst_1
    //   429: aload 4
    //   431: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   434: aastore
    //   435: dup
    //   436: iconst_2
    //   437: aload_0
    //   438: aastore
    //   439: dup
    //   440: iconst_3
    //   441: aload_1
    //   442: aastore
    //   443: dup
    //   444: iconst_4
    //   445: aload_2
    //   446: arraylength
    //   447: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   450: aastore
    //   451: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   454: goto -63 -> 391
    //   457: astore_3
    //   458: goto -77 -> 381
    //   461: astore 5
    //   463: goto -235 -> 228
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	466	0	paramString1	String
    //   0	466	1	paramString2	String
    //   0	466	2	paramArrayOfByte	byte[]
    //   31	84	3	localObject1	Object
    //   160	34	3	localIOException1	IOException
    //   220	6	3	localException1	Exception
    //   230	17	3	localObject2	Object
    //   313	63	3	localIOException2	IOException
    //   380	12	3	localObject3	Object
    //   457	1	3	localObject4	Object
    //   24	363	4	localObject5	Object
    //   393	37	4	localIOException3	IOException
    //   27	242	5	localObject6	Object
    //   373	6	5	localObject7	Object
    //   461	1	5	localException2	Exception
    //   40	84	6	localFile	File
    // Exception table:
    //   from	to	target	type
    //   145	150	160	java/io/IOException
    //   32	42	220	java/lang/Exception
    //   45	53	220	java/lang/Exception
    //   56	62	220	java/lang/Exception
    //   65	92	220	java/lang/Exception
    //   95	103	220	java/lang/Exception
    //   106	112	220	java/lang/Exception
    //   115	134	220	java/lang/Exception
    //   298	303	313	java/io/IOException
    //   32	42	373	finally
    //   45	53	373	finally
    //   56	62	373	finally
    //   65	92	373	finally
    //   95	103	373	finally
    //   106	112	373	finally
    //   115	134	373	finally
    //   231	244	373	finally
    //   247	293	373	finally
    //   386	391	393	java/io/IOException
    //   134	145	457	finally
    //   134	145	461	java/lang/Exception
  }
  
  /* Error */
  public static int a(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 117
    //   3: ldc 119
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: ifnull +16 -> 25
    //   12: aload_1
    //   13: arraylength
    //   14: ifeq +11 -> 25
    //   17: aload_1
    //   18: arraylength
    //   19: iload_2
    //   20: iconst_0
    //   21: iadd
    //   22: if_icmpge +14 -> 36
    //   25: ldc2_w 117
    //   28: ldc 119
    //   30: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   33: bipush -2
    //   35: ireturn
    //   36: new 62	java/io/FileOutputStream
    //   39: dup
    //   40: aload_0
    //   41: iconst_1
    //   42: invokespecial 122	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   45: astore 4
    //   47: aload 4
    //   49: astore_3
    //   50: aload 4
    //   52: aload_1
    //   53: iconst_0
    //   54: iload_2
    //   55: invokevirtual 125	java/io/FileOutputStream:write	([BII)V
    //   58: aload 4
    //   60: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   63: ldc2_w 117
    //   66: ldc 119
    //   68: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   71: iconst_0
    //   72: ireturn
    //   73: astore_3
    //   74: ldc 80
    //   76: aload_3
    //   77: ldc 82
    //   79: iconst_0
    //   80: anewarray 4	java/lang/Object
    //   83: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   86: ldc 80
    //   88: ldc -128
    //   90: bipush 6
    //   92: anewarray 4	java/lang/Object
    //   95: dup
    //   96: iconst_0
    //   97: aload_3
    //   98: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   101: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   104: aastore
    //   105: dup
    //   106: iconst_1
    //   107: aload_3
    //   108: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   111: aastore
    //   112: dup
    //   113: iconst_2
    //   114: aload_0
    //   115: aastore
    //   116: dup
    //   117: iconst_3
    //   118: aload_1
    //   119: arraylength
    //   120: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   123: aastore
    //   124: dup
    //   125: iconst_4
    //   126: iconst_0
    //   127: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   130: aastore
    //   131: dup
    //   132: iconst_5
    //   133: iload_2
    //   134: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   137: aastore
    //   138: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: goto -78 -> 63
    //   144: astore 5
    //   146: aconst_null
    //   147: astore 4
    //   149: aload 4
    //   151: astore_3
    //   152: ldc 80
    //   154: aload 5
    //   156: ldc 82
    //   158: iconst_0
    //   159: anewarray 4	java/lang/Object
    //   162: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aload 4
    //   167: astore_3
    //   168: ldc 80
    //   170: ldc -126
    //   172: bipush 6
    //   174: anewarray 4	java/lang/Object
    //   177: dup
    //   178: iconst_0
    //   179: aload 5
    //   181: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   184: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   187: aastore
    //   188: dup
    //   189: iconst_1
    //   190: aload 5
    //   192: invokevirtual 115	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   195: aastore
    //   196: dup
    //   197: iconst_2
    //   198: aload_0
    //   199: aastore
    //   200: dup
    //   201: iconst_3
    //   202: aload_1
    //   203: arraylength
    //   204: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   207: aastore
    //   208: dup
    //   209: iconst_4
    //   210: iconst_0
    //   211: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   214: aastore
    //   215: dup
    //   216: iconst_5
    //   217: iload_2
    //   218: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   221: aastore
    //   222: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   225: aload 4
    //   227: ifnull +8 -> 235
    //   230: aload 4
    //   232: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   235: ldc2_w 117
    //   238: ldc 119
    //   240: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   243: iconst_m1
    //   244: ireturn
    //   245: astore_3
    //   246: ldc 80
    //   248: aload_3
    //   249: ldc 82
    //   251: iconst_0
    //   252: anewarray 4	java/lang/Object
    //   255: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   258: ldc 80
    //   260: ldc -128
    //   262: bipush 6
    //   264: anewarray 4	java/lang/Object
    //   267: dup
    //   268: iconst_0
    //   269: aload_3
    //   270: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   273: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   276: aastore
    //   277: dup
    //   278: iconst_1
    //   279: aload_3
    //   280: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   283: aastore
    //   284: dup
    //   285: iconst_2
    //   286: aload_0
    //   287: aastore
    //   288: dup
    //   289: iconst_3
    //   290: aload_1
    //   291: arraylength
    //   292: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   295: aastore
    //   296: dup
    //   297: iconst_4
    //   298: iconst_0
    //   299: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   302: aastore
    //   303: dup
    //   304: iconst_5
    //   305: iload_2
    //   306: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   309: aastore
    //   310: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   313: goto -78 -> 235
    //   316: astore 4
    //   318: aconst_null
    //   319: astore_3
    //   320: aload_3
    //   321: ifnull +7 -> 328
    //   324: aload_3
    //   325: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   328: aload 4
    //   330: athrow
    //   331: astore_3
    //   332: ldc 80
    //   334: aload_3
    //   335: ldc 82
    //   337: iconst_0
    //   338: anewarray 4	java/lang/Object
    //   341: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   344: ldc 80
    //   346: ldc -128
    //   348: bipush 6
    //   350: anewarray 4	java/lang/Object
    //   353: dup
    //   354: iconst_0
    //   355: aload_3
    //   356: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   359: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   362: aastore
    //   363: dup
    //   364: iconst_1
    //   365: aload_3
    //   366: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   369: aastore
    //   370: dup
    //   371: iconst_2
    //   372: aload_0
    //   373: aastore
    //   374: dup
    //   375: iconst_3
    //   376: aload_1
    //   377: arraylength
    //   378: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   381: aastore
    //   382: dup
    //   383: iconst_4
    //   384: iconst_0
    //   385: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   388: aastore
    //   389: dup
    //   390: iconst_5
    //   391: iload_2
    //   392: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   395: aastore
    //   396: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   399: goto -71 -> 328
    //   402: astore 4
    //   404: goto -84 -> 320
    //   407: astore 5
    //   409: goto -260 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	412	0	paramString	String
    //   0	412	1	paramArrayOfByte	byte[]
    //   0	412	2	paramInt	int
    //   49	1	3	localFileOutputStream1	java.io.FileOutputStream
    //   73	35	3	localIOException1	IOException
    //   151	17	3	localFileOutputStream2	java.io.FileOutputStream
    //   245	35	3	localIOException2	IOException
    //   319	6	3	localObject1	Object
    //   331	35	3	localIOException3	IOException
    //   45	186	4	localFileOutputStream3	java.io.FileOutputStream
    //   316	13	4	localObject2	Object
    //   402	1	4	localObject3	Object
    //   144	47	5	localException1	Exception
    //   407	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   58	63	73	java/io/IOException
    //   36	47	144	java/lang/Exception
    //   230	235	245	java/io/IOException
    //   36	47	316	finally
    //   324	328	331	java/io/IOException
    //   50	58	402	finally
    //   152	165	402	finally
    //   168	225	402	finally
    //   50	58	407	java/lang/Exception
  }
  
  public static void a(OutputStream paramOutputStream)
  {
    GMTrace.i(13862409601024L, 103283);
    if (paramOutputStream != null) {}
    try
    {
      paramOutputStream.close();
      GMTrace.o(13862409601024L, 103283);
      return;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.FileOperation", localIOException, "", new Object[0]);
      w.w("MicroMsg.FileOperation", "file op closeOutputStream e type:%s, e msg:%s, stream:%s", new Object[] { localIOException.getClass().getSimpleName(), localIOException.getMessage(), paramOutputStream });
      GMTrace.o(13862409601024L, 103283);
    }
  }
  
  public static void a(Reader paramReader)
  {
    GMTrace.i(13862543818752L, 103284);
    if (paramReader != null) {}
    try
    {
      paramReader.close();
      GMTrace.o(13862543818752L, 103284);
      return;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.FileOperation", localIOException, "", new Object[0]);
      w.w("MicroMsg.FileOperation", "file op closeReader e type:%s, e msg:%s, reader:%s", new Object[] { localIOException.getClass().getSimpleName(), localIOException.getMessage(), paramReader });
      GMTrace.o(13862543818752L, 103284);
    }
  }
  
  public static int aY(String paramString)
  {
    GMTrace.i(13860798988288L, 103271);
    if (paramString == null)
    {
      GMTrace.o(13860798988288L, 103271);
      return 0;
    }
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      GMTrace.o(13860798988288L, 103271);
      return 0;
    }
    int i = (int)paramString.length();
    GMTrace.o(13860798988288L, 103271);
    return i;
  }
  
  public static final boolean aZ(String paramString)
  {
    GMTrace.i(13861201641472L, 103274);
    if (paramString == null)
    {
      GMTrace.o(13861201641472L, 103274);
      return false;
    }
    if (new File(paramString).exists())
    {
      GMTrace.o(13861201641472L, 103274);
      return true;
    }
    GMTrace.o(13861201641472L, 103274);
    return false;
  }
  
  /* Error */
  public static int b(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 163
    //   3: ldc -91
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: ifnonnull +14 -> 23
    //   12: ldc2_w 163
    //   15: ldc -91
    //   17: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   20: bipush -2
    //   22: ireturn
    //   23: aload_1
    //   24: arraylength
    //   25: iload_2
    //   26: iconst_0
    //   27: iadd
    //   28: if_icmpge +14 -> 42
    //   31: ldc2_w 163
    //   34: ldc -91
    //   36: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   39: bipush -3
    //   41: ireturn
    //   42: new 62	java/io/FileOutputStream
    //   45: dup
    //   46: aload_0
    //   47: iconst_0
    //   48: invokespecial 122	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   51: astore 4
    //   53: aload 4
    //   55: astore_3
    //   56: aload 4
    //   58: aload_1
    //   59: iconst_0
    //   60: iload_2
    //   61: invokevirtual 125	java/io/FileOutputStream:write	([BII)V
    //   64: aload 4
    //   66: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   69: ldc2_w 163
    //   72: ldc -91
    //   74: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   77: iconst_0
    //   78: ireturn
    //   79: astore_3
    //   80: ldc 80
    //   82: aload_3
    //   83: ldc 82
    //   85: iconst_0
    //   86: anewarray 4	java/lang/Object
    //   89: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: ldc 80
    //   94: ldc -89
    //   96: bipush 6
    //   98: anewarray 4	java/lang/Object
    //   101: dup
    //   102: iconst_0
    //   103: aload_3
    //   104: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   107: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   110: aastore
    //   111: dup
    //   112: iconst_1
    //   113: aload_3
    //   114: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   117: aastore
    //   118: dup
    //   119: iconst_2
    //   120: aload_0
    //   121: aastore
    //   122: dup
    //   123: iconst_3
    //   124: aload_1
    //   125: arraylength
    //   126: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   129: aastore
    //   130: dup
    //   131: iconst_4
    //   132: iconst_0
    //   133: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   136: aastore
    //   137: dup
    //   138: iconst_5
    //   139: iload_2
    //   140: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   143: aastore
    //   144: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: goto -78 -> 69
    //   150: astore 5
    //   152: aconst_null
    //   153: astore 4
    //   155: aload 4
    //   157: astore_3
    //   158: ldc 80
    //   160: aload 5
    //   162: ldc 82
    //   164: iconst_0
    //   165: anewarray 4	java/lang/Object
    //   168: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   171: aload 4
    //   173: astore_3
    //   174: ldc 80
    //   176: ldc -87
    //   178: bipush 6
    //   180: anewarray 4	java/lang/Object
    //   183: dup
    //   184: iconst_0
    //   185: aload 5
    //   187: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   190: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   193: aastore
    //   194: dup
    //   195: iconst_1
    //   196: aload 5
    //   198: invokevirtual 115	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   201: aastore
    //   202: dup
    //   203: iconst_2
    //   204: aload_0
    //   205: aastore
    //   206: dup
    //   207: iconst_3
    //   208: aload_1
    //   209: arraylength
    //   210: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   213: aastore
    //   214: dup
    //   215: iconst_4
    //   216: iconst_0
    //   217: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   220: aastore
    //   221: dup
    //   222: iconst_5
    //   223: iload_2
    //   224: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   227: aastore
    //   228: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   231: aload 4
    //   233: ifnull +8 -> 241
    //   236: aload 4
    //   238: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   241: ldc2_w 163
    //   244: ldc -91
    //   246: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   249: iconst_m1
    //   250: ireturn
    //   251: astore_3
    //   252: ldc 80
    //   254: aload_3
    //   255: ldc 82
    //   257: iconst_0
    //   258: anewarray 4	java/lang/Object
    //   261: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   264: ldc 80
    //   266: ldc -89
    //   268: bipush 6
    //   270: anewarray 4	java/lang/Object
    //   273: dup
    //   274: iconst_0
    //   275: aload_3
    //   276: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   279: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   282: aastore
    //   283: dup
    //   284: iconst_1
    //   285: aload_3
    //   286: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   289: aastore
    //   290: dup
    //   291: iconst_2
    //   292: aload_0
    //   293: aastore
    //   294: dup
    //   295: iconst_3
    //   296: aload_1
    //   297: arraylength
    //   298: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   301: aastore
    //   302: dup
    //   303: iconst_4
    //   304: iconst_0
    //   305: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   308: aastore
    //   309: dup
    //   310: iconst_5
    //   311: iload_2
    //   312: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   315: aastore
    //   316: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   319: goto -78 -> 241
    //   322: astore 4
    //   324: aconst_null
    //   325: astore_3
    //   326: aload_3
    //   327: ifnull +7 -> 334
    //   330: aload_3
    //   331: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   334: aload 4
    //   336: athrow
    //   337: astore_3
    //   338: ldc 80
    //   340: aload_3
    //   341: ldc 82
    //   343: iconst_0
    //   344: anewarray 4	java/lang/Object
    //   347: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   350: ldc 80
    //   352: ldc -89
    //   354: bipush 6
    //   356: anewarray 4	java/lang/Object
    //   359: dup
    //   360: iconst_0
    //   361: aload_3
    //   362: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   365: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   368: aastore
    //   369: dup
    //   370: iconst_1
    //   371: aload_3
    //   372: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   375: aastore
    //   376: dup
    //   377: iconst_2
    //   378: aload_0
    //   379: aastore
    //   380: dup
    //   381: iconst_3
    //   382: aload_1
    //   383: arraylength
    //   384: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   387: aastore
    //   388: dup
    //   389: iconst_4
    //   390: iconst_0
    //   391: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   394: aastore
    //   395: dup
    //   396: iconst_5
    //   397: iload_2
    //   398: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   401: aastore
    //   402: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   405: goto -71 -> 334
    //   408: astore 4
    //   410: goto -84 -> 326
    //   413: astore 5
    //   415: goto -260 -> 155
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	418	0	paramString	String
    //   0	418	1	paramArrayOfByte	byte[]
    //   0	418	2	paramInt	int
    //   55	1	3	localFileOutputStream1	java.io.FileOutputStream
    //   79	35	3	localIOException1	IOException
    //   157	17	3	localFileOutputStream2	java.io.FileOutputStream
    //   251	35	3	localIOException2	IOException
    //   325	6	3	localObject1	Object
    //   337	35	3	localIOException3	IOException
    //   51	186	4	localFileOutputStream3	java.io.FileOutputStream
    //   322	13	4	localObject2	Object
    //   408	1	4	localObject3	Object
    //   150	47	5	localException1	Exception
    //   413	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   64	69	79	java/io/IOException
    //   42	53	150	java/lang/Exception
    //   236	241	251	java/io/IOException
    //   42	53	322	finally
    //   330	334	337	java/io/IOException
    //   56	64	408	finally
    //   158	171	408	finally
    //   174	231	408	finally
    //   56	64	413	java/lang/Exception
  }
  
  public static void b(InputStream paramInputStream)
  {
    GMTrace.i(13862275383296L, 103282);
    if (paramInputStream != null) {}
    try
    {
      paramInputStream.close();
      GMTrace.o(13862275383296L, 103282);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.FileOperation", localException, "", new Object[0]);
      w.w("MicroMsg.FileOperation", "file op closeInputStream e type:%s, e msg:%s, stream:%s", new Object[] { localException.getClass().getSimpleName(), localException.getMessage(), paramInputStream });
      GMTrace.o(13862275383296L, 103282);
    }
  }
  
  /* Error */
  public static final boolean b(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc2_w 180
    //   5: ldc -74
    //   7: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: invokevirtual 52	java/io/File:exists	()Z
    //   14: ifeq +630 -> 644
    //   17: aload_0
    //   18: invokevirtual 185	java/io/File:isDirectory	()Z
    //   21: ifeq +84 -> 105
    //   24: aload_1
    //   25: invokevirtual 52	java/io/File:exists	()Z
    //   28: ifne +8 -> 36
    //   31: aload_1
    //   32: invokevirtual 188	java/io/File:mkdir	()Z
    //   35: pop
    //   36: aload_0
    //   37: invokevirtual 192	java/io/File:listFiles	()[Ljava/io/File;
    //   40: astore 4
    //   42: iconst_0
    //   43: istore_3
    //   44: iload_2
    //   45: aload 4
    //   47: arraylength
    //   48: if_icmpge +47 -> 95
    //   51: aload 4
    //   53: iload_2
    //   54: aaload
    //   55: astore 5
    //   57: aload 5
    //   59: new 45	java/io/File
    //   62: dup
    //   63: aload_1
    //   64: invokevirtual 195	java/io/File:getPath	()Ljava/lang/String;
    //   67: aload 5
    //   69: invokevirtual 198	java/io/File:getName	()Ljava/lang/String;
    //   72: invokespecial 201	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   75: invokestatic 203	com/tencent/mm/a/e:b	(Ljava/io/File;Ljava/io/File;)Z
    //   78: istore_3
    //   79: iload_3
    //   80: ifeq +8 -> 88
    //   83: aload_0
    //   84: invokevirtual 206	java/io/File:delete	()Z
    //   87: pop
    //   88: iload_2
    //   89: iconst_1
    //   90: iadd
    //   91: istore_2
    //   92: goto -48 -> 44
    //   95: ldc2_w 180
    //   98: ldc -74
    //   100: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   103: iload_3
    //   104: ireturn
    //   105: new 208	java/io/FileInputStream
    //   108: dup
    //   109: aload_0
    //   110: invokespecial 211	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   113: astore 4
    //   115: new 62	java/io/FileOutputStream
    //   118: dup
    //   119: aload_1
    //   120: invokespecial 212	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   123: astore 5
    //   125: ldc -43
    //   127: newarray <illegal type>
    //   129: astore 6
    //   131: aload 4
    //   133: aload 6
    //   135: invokevirtual 217	java/io/InputStream:read	([B)I
    //   138: istore_2
    //   139: iload_2
    //   140: iconst_m1
    //   141: if_icmpeq +106 -> 247
    //   144: aload 5
    //   146: aload 6
    //   148: iconst_0
    //   149: iload_2
    //   150: invokevirtual 218	java/io/OutputStream:write	([BII)V
    //   153: goto -22 -> 131
    //   156: astore 7
    //   158: aload 4
    //   160: astore 6
    //   162: aload 7
    //   164: astore 4
    //   166: ldc 80
    //   168: aload 4
    //   170: ldc 82
    //   172: iconst_0
    //   173: anewarray 4	java/lang/Object
    //   176: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: ldc 80
    //   181: ldc -36
    //   183: iconst_4
    //   184: anewarray 4	java/lang/Object
    //   187: dup
    //   188: iconst_0
    //   189: aload 4
    //   191: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   194: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   197: aastore
    //   198: dup
    //   199: iconst_1
    //   200: aload 4
    //   202: invokevirtual 115	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   205: aastore
    //   206: dup
    //   207: iconst_2
    //   208: aload_0
    //   209: aastore
    //   210: dup
    //   211: iconst_3
    //   212: aload_1
    //   213: aastore
    //   214: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   217: aload 6
    //   219: ifnull +8 -> 227
    //   222: aload 6
    //   224: invokevirtual 176	java/io/InputStream:close	()V
    //   227: aload 5
    //   229: ifnull +8 -> 237
    //   232: aload 5
    //   234: invokevirtual 136	java/io/OutputStream:close	()V
    //   237: ldc2_w 180
    //   240: ldc -74
    //   242: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   245: iconst_0
    //   246: ireturn
    //   247: aload 5
    //   249: invokevirtual 221	java/io/OutputStream:flush	()V
    //   252: aload_0
    //   253: invokevirtual 206	java/io/File:delete	()Z
    //   256: pop
    //   257: aload 4
    //   259: invokevirtual 176	java/io/InputStream:close	()V
    //   262: aload 5
    //   264: invokevirtual 136	java/io/OutputStream:close	()V
    //   267: ldc2_w 180
    //   270: ldc -74
    //   272: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   275: iconst_1
    //   276: ireturn
    //   277: astore 4
    //   279: ldc 80
    //   281: aload 4
    //   283: ldc 82
    //   285: iconst_0
    //   286: anewarray 4	java/lang/Object
    //   289: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   292: ldc 80
    //   294: ldc -33
    //   296: iconst_4
    //   297: anewarray 4	java/lang/Object
    //   300: dup
    //   301: iconst_0
    //   302: aload 4
    //   304: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   307: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   310: aastore
    //   311: dup
    //   312: iconst_1
    //   313: aload 4
    //   315: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   318: aastore
    //   319: dup
    //   320: iconst_2
    //   321: aload_0
    //   322: aastore
    //   323: dup
    //   324: iconst_3
    //   325: aload_1
    //   326: aastore
    //   327: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   330: goto -68 -> 262
    //   333: astore 4
    //   335: ldc 80
    //   337: aload 4
    //   339: ldc 82
    //   341: iconst_0
    //   342: anewarray 4	java/lang/Object
    //   345: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   348: ldc 80
    //   350: ldc -31
    //   352: iconst_4
    //   353: anewarray 4	java/lang/Object
    //   356: dup
    //   357: iconst_0
    //   358: aload 4
    //   360: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   363: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   366: aastore
    //   367: dup
    //   368: iconst_1
    //   369: aload 4
    //   371: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   374: aastore
    //   375: dup
    //   376: iconst_2
    //   377: aload_0
    //   378: aastore
    //   379: dup
    //   380: iconst_3
    //   381: aload_1
    //   382: aastore
    //   383: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   386: goto -119 -> 267
    //   389: astore 4
    //   391: ldc 80
    //   393: aload 4
    //   395: ldc 82
    //   397: iconst_0
    //   398: anewarray 4	java/lang/Object
    //   401: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   404: ldc 80
    //   406: ldc -33
    //   408: iconst_4
    //   409: anewarray 4	java/lang/Object
    //   412: dup
    //   413: iconst_0
    //   414: aload 4
    //   416: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   419: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   422: aastore
    //   423: dup
    //   424: iconst_1
    //   425: aload 4
    //   427: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   430: aastore
    //   431: dup
    //   432: iconst_2
    //   433: aload_0
    //   434: aastore
    //   435: dup
    //   436: iconst_3
    //   437: aload_1
    //   438: aastore
    //   439: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   442: goto -215 -> 227
    //   445: astore 4
    //   447: ldc 80
    //   449: aload 4
    //   451: ldc 82
    //   453: iconst_0
    //   454: anewarray 4	java/lang/Object
    //   457: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   460: ldc 80
    //   462: ldc -31
    //   464: iconst_4
    //   465: anewarray 4	java/lang/Object
    //   468: dup
    //   469: iconst_0
    //   470: aload 4
    //   472: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   475: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   478: aastore
    //   479: dup
    //   480: iconst_1
    //   481: aload 4
    //   483: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   486: aastore
    //   487: dup
    //   488: iconst_2
    //   489: aload_0
    //   490: aastore
    //   491: dup
    //   492: iconst_3
    //   493: aload_1
    //   494: aastore
    //   495: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   498: goto -261 -> 237
    //   501: astore 4
    //   503: aconst_null
    //   504: astore 6
    //   506: aconst_null
    //   507: astore 5
    //   509: aload 6
    //   511: ifnull +8 -> 519
    //   514: aload 6
    //   516: invokevirtual 176	java/io/InputStream:close	()V
    //   519: aload 5
    //   521: ifnull +8 -> 529
    //   524: aload 5
    //   526: invokevirtual 136	java/io/OutputStream:close	()V
    //   529: aload 4
    //   531: athrow
    //   532: astore 6
    //   534: ldc 80
    //   536: aload 6
    //   538: ldc 82
    //   540: iconst_0
    //   541: anewarray 4	java/lang/Object
    //   544: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   547: ldc 80
    //   549: ldc -33
    //   551: iconst_4
    //   552: anewarray 4	java/lang/Object
    //   555: dup
    //   556: iconst_0
    //   557: aload 6
    //   559: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   562: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   565: aastore
    //   566: dup
    //   567: iconst_1
    //   568: aload 6
    //   570: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   573: aastore
    //   574: dup
    //   575: iconst_2
    //   576: aload_0
    //   577: aastore
    //   578: dup
    //   579: iconst_3
    //   580: aload_1
    //   581: aastore
    //   582: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   585: goto -66 -> 519
    //   588: astore 5
    //   590: ldc 80
    //   592: aload 5
    //   594: ldc 82
    //   596: iconst_0
    //   597: anewarray 4	java/lang/Object
    //   600: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   603: ldc 80
    //   605: ldc -31
    //   607: iconst_4
    //   608: anewarray 4	java/lang/Object
    //   611: dup
    //   612: iconst_0
    //   613: aload 5
    //   615: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   618: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   621: aastore
    //   622: dup
    //   623: iconst_1
    //   624: aload 5
    //   626: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   629: aastore
    //   630: dup
    //   631: iconst_2
    //   632: aload_0
    //   633: aastore
    //   634: dup
    //   635: iconst_3
    //   636: aload_1
    //   637: aastore
    //   638: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   641: goto -112 -> 529
    //   644: ldc2_w 180
    //   647: ldc -74
    //   649: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   652: iconst_0
    //   653: ireturn
    //   654: astore 7
    //   656: aconst_null
    //   657: astore 5
    //   659: aload 4
    //   661: astore 6
    //   663: aload 7
    //   665: astore 4
    //   667: goto -158 -> 509
    //   670: astore 7
    //   672: aload 4
    //   674: astore 6
    //   676: aload 7
    //   678: astore 4
    //   680: goto -171 -> 509
    //   683: astore 4
    //   685: goto -176 -> 509
    //   688: astore 4
    //   690: aconst_null
    //   691: astore 6
    //   693: aconst_null
    //   694: astore 5
    //   696: goto -530 -> 166
    //   699: astore 7
    //   701: aconst_null
    //   702: astore 5
    //   704: aload 4
    //   706: astore 6
    //   708: aload 7
    //   710: astore 4
    //   712: goto -546 -> 166
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	715	0	paramFile1	File
    //   0	715	1	paramFile2	File
    //   1	149	2	i	int
    //   43	61	3	bool	boolean
    //   40	218	4	localObject1	Object
    //   277	37	4	localIOException1	IOException
    //   333	37	4	localIOException2	IOException
    //   389	37	4	localIOException3	IOException
    //   445	37	4	localIOException4	IOException
    //   501	159	4	localObject2	Object
    //   665	14	4	localObject3	Object
    //   683	1	4	localObject4	Object
    //   688	17	4	localException1	Exception
    //   710	1	4	localObject5	Object
    //   55	470	5	localObject6	Object
    //   588	37	5	localIOException5	IOException
    //   657	46	5	localObject7	Object
    //   129	386	6	localObject8	Object
    //   532	37	6	localIOException6	IOException
    //   661	46	6	localObject9	Object
    //   156	7	7	localException2	Exception
    //   654	10	7	localObject10	Object
    //   670	7	7	localObject11	Object
    //   699	10	7	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   125	131	156	java/lang/Exception
    //   131	139	156	java/lang/Exception
    //   144	153	156	java/lang/Exception
    //   247	257	156	java/lang/Exception
    //   257	262	277	java/io/IOException
    //   262	267	333	java/io/IOException
    //   222	227	389	java/io/IOException
    //   232	237	445	java/io/IOException
    //   105	115	501	finally
    //   514	519	532	java/io/IOException
    //   524	529	588	java/io/IOException
    //   115	125	654	finally
    //   125	131	670	finally
    //   131	139	670	finally
    //   144	153	670	finally
    //   247	257	670	finally
    //   166	217	683	finally
    //   105	115	688	java/lang/Exception
    //   115	125	699	java/lang/Exception
  }
  
  public static boolean ba(String paramString)
  {
    GMTrace.i(18998787833856L, 141552);
    boolean bool = f(new File(paramString));
    GMTrace.o(18998787833856L, 141552);
    return bool;
  }
  
  public static final String bb(String paramString)
  {
    GMTrace.i(13861604294656L, 103277);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(13861604294656L, 103277);
      return "";
    }
    paramString = new File(paramString).getName();
    int i = paramString.lastIndexOf('.');
    if ((i <= 0) || (i == paramString.length() - 1))
    {
      GMTrace.o(13861604294656L, 103277);
      return "";
    }
    paramString = paramString.substring(i + 1);
    GMTrace.o(13861604294656L, 103277);
    return paramString;
  }
  
  public static final String bc(String paramString)
  {
    GMTrace.i(13861738512384L, 103278);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(13861738512384L, 103278);
      return "";
    }
    String str = new File(paramString).getName();
    int i = str.lastIndexOf('.');
    if (i < 0)
    {
      GMTrace.o(13861738512384L, 103278);
      return paramString;
    }
    if (i == 0)
    {
      GMTrace.o(13861738512384L, 103278);
      return "";
    }
    paramString = str.substring(0, i);
    GMTrace.o(13861738512384L, 103278);
    return paramString;
  }
  
  public static final boolean bd(String paramString)
  {
    GMTrace.i(13861872730112L, 103279);
    if (bg.nm(paramString))
    {
      GMTrace.o(13861872730112L, 103279);
      return false;
    }
    Object localObject = new File(paramString);
    if ((((File)localObject).exists()) && (((File)localObject).isDirectory()))
    {
      GMTrace.o(13861872730112L, 103279);
      return true;
    }
    String[] arrayOfString = paramString.split("/");
    if ((arrayOfString == null) || (arrayOfString.length < 2))
    {
      GMTrace.o(13861872730112L, 103279);
      return false;
    }
    localObject = "/";
    int i = 0;
    while (i < arrayOfString.length)
    {
      paramString = (String)localObject;
      if (!bg.nm(arrayOfString[i]))
      {
        localObject = (String)localObject + "/" + arrayOfString[i];
        File localFile = new File((String)localObject);
        if ((localFile.isFile()) && (!localFile.renameTo(new File((String)localObject + "_mmbak"))))
        {
          GMTrace.o(13861872730112L, 103279);
          return false;
        }
        paramString = (String)localObject;
        if (!localFile.exists())
        {
          paramString = (String)localObject;
          if (!localFile.mkdir())
          {
            GMTrace.o(13861872730112L, 103279);
            return false;
          }
        }
      }
      i += 1;
      localObject = paramString;
    }
    GMTrace.o(13861872730112L, 103279);
    return true;
  }
  
  /* Error */
  public static String be(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 283
    //   3: ldc_w 285
    //   6: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 287	java/lang/StringBuffer
    //   12: dup
    //   13: invokespecial 288	java/lang/StringBuffer:<init>	()V
    //   16: astore 4
    //   18: new 290	java/io/BufferedReader
    //   21: dup
    //   22: new 292	java/io/FileReader
    //   25: dup
    //   26: aload_0
    //   27: invokespecial 293	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   30: invokespecial 295	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   33: astore_3
    //   34: aload_3
    //   35: astore_2
    //   36: sipush 1024
    //   39: newarray <illegal type>
    //   41: astore 5
    //   43: aload_3
    //   44: astore_2
    //   45: aload_3
    //   46: aload 5
    //   48: invokevirtual 298	java/io/BufferedReader:read	([C)I
    //   51: istore_1
    //   52: iload_1
    //   53: iconst_m1
    //   54: if_icmpeq +97 -> 151
    //   57: aload_3
    //   58: astore_2
    //   59: aload 4
    //   61: aload 5
    //   63: iconst_0
    //   64: iload_1
    //   65: invokestatic 301	java/lang/String:valueOf	([CII)Ljava/lang/String;
    //   68: invokevirtual 304	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   71: pop
    //   72: goto -29 -> 43
    //   75: astore 4
    //   77: aload_3
    //   78: astore_2
    //   79: ldc 80
    //   81: aload 4
    //   83: ldc 82
    //   85: iconst_0
    //   86: anewarray 4	java/lang/Object
    //   89: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: aload_3
    //   93: astore_2
    //   94: ldc 80
    //   96: ldc_w 306
    //   99: iconst_3
    //   100: anewarray 4	java/lang/Object
    //   103: dup
    //   104: iconst_0
    //   105: aload 4
    //   107: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   110: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   113: aastore
    //   114: dup
    //   115: iconst_1
    //   116: aload 4
    //   118: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   121: aastore
    //   122: dup
    //   123: iconst_2
    //   124: aload_0
    //   125: aastore
    //   126: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aload_3
    //   130: astore_2
    //   131: aload 4
    //   133: athrow
    //   134: astore 4
    //   136: aload_2
    //   137: astore_3
    //   138: aload 4
    //   140: astore_2
    //   141: aload_3
    //   142: ifnull +7 -> 149
    //   145: aload_3
    //   146: invokevirtual 307	java/io/BufferedReader:close	()V
    //   149: aload_2
    //   150: athrow
    //   151: aload_3
    //   152: invokevirtual 307	java/io/BufferedReader:close	()V
    //   155: aload 4
    //   157: invokevirtual 308	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   160: astore_0
    //   161: ldc2_w 283
    //   164: ldc_w 285
    //   167: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   170: aload_0
    //   171: areturn
    //   172: astore_2
    //   173: ldc 80
    //   175: aload_2
    //   176: ldc 82
    //   178: iconst_0
    //   179: anewarray 4	java/lang/Object
    //   182: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   185: ldc 80
    //   187: ldc_w 310
    //   190: iconst_3
    //   191: anewarray 4	java/lang/Object
    //   194: dup
    //   195: iconst_0
    //   196: aload_2
    //   197: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   200: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   203: aastore
    //   204: dup
    //   205: iconst_1
    //   206: aload_2
    //   207: invokevirtual 115	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   210: aastore
    //   211: dup
    //   212: iconst_2
    //   213: aload_0
    //   214: aastore
    //   215: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: goto -63 -> 155
    //   221: astore_3
    //   222: ldc 80
    //   224: aload_3
    //   225: ldc 82
    //   227: iconst_0
    //   228: anewarray 4	java/lang/Object
    //   231: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: ldc 80
    //   236: ldc_w 310
    //   239: iconst_3
    //   240: anewarray 4	java/lang/Object
    //   243: dup
    //   244: iconst_0
    //   245: aload_3
    //   246: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   249: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   252: aastore
    //   253: dup
    //   254: iconst_1
    //   255: aload_3
    //   256: invokevirtual 115	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   259: aastore
    //   260: dup
    //   261: iconst_2
    //   262: aload_0
    //   263: aastore
    //   264: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   267: goto -118 -> 149
    //   270: astore_2
    //   271: aconst_null
    //   272: astore_3
    //   273: goto -132 -> 141
    //   276: astore 4
    //   278: aconst_null
    //   279: astore_3
    //   280: goto -203 -> 77
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	283	0	paramString	String
    //   51	14	1	i	int
    //   35	115	2	localObject1	Object
    //   172	35	2	localException1	Exception
    //   270	1	2	localObject2	Object
    //   33	119	3	localObject3	Object
    //   221	35	3	localException2	Exception
    //   272	8	3	localObject4	Object
    //   16	44	4	localStringBuffer	StringBuffer
    //   75	57	4	localIOException1	IOException
    //   134	22	4	localObject5	Object
    //   276	1	4	localIOException2	IOException
    //   41	21	5	arrayOfChar	char[]
    // Exception table:
    //   from	to	target	type
    //   36	43	75	java/io/IOException
    //   45	52	75	java/io/IOException
    //   59	72	75	java/io/IOException
    //   36	43	134	finally
    //   45	52	134	finally
    //   59	72	134	finally
    //   79	92	134	finally
    //   94	129	134	finally
    //   131	134	134	finally
    //   151	155	172	java/lang/Exception
    //   145	149	221	java/lang/Exception
    //   18	34	270	finally
    //   18	34	276	java/io/IOException
  }
  
  public static void bf(String paramString)
  {
    GMTrace.i(13862678036480L, 103285);
    File localFile = new File(paramString).getParentFile();
    if ((!localFile.exists()) && ((!localFile.mkdirs()) || (!localFile.isDirectory()))) {
      w.e("MicroMsg.FileOperation", "mkParentDir mkdir error. %s", new Object[] { paramString });
    }
    GMTrace.o(13862678036480L, 103285);
  }
  
  public static void c(String... paramVarArgs)
  {
    GMTrace.i(13862812254208L, 103286);
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      String str = paramVarArgs[i];
      File localFile = new File(str);
      if ((!localFile.exists()) && ((!localFile.mkdirs()) || (!localFile.isDirectory()))) {
        w.e("MicroMsg.FileOperation", "batchMkDirs mkdir error. %s", new Object[] { str });
      }
      i += 1;
    }
    GMTrace.o(13862812254208L, 103286);
  }
  
  /* Error */
  public static byte[] c(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aconst_null
    //   4: astore 5
    //   6: ldc2_w 332
    //   9: ldc_w 334
    //   12: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   15: aload_0
    //   16: ifnonnull +14 -> 30
    //   19: ldc2_w 332
    //   22: ldc_w 334
    //   25: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   28: aconst_null
    //   29: areturn
    //   30: new 45	java/io/File
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 48	java/io/File:<init>	(Ljava/lang/String;)V
    //   38: astore 4
    //   40: aload 4
    //   42: invokevirtual 52	java/io/File:exists	()Z
    //   45: ifne +14 -> 59
    //   48: ldc2_w 332
    //   51: ldc_w 334
    //   54: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   57: aconst_null
    //   58: areturn
    //   59: iload_2
    //   60: istore_3
    //   61: iload_2
    //   62: iconst_m1
    //   63: if_icmpne +10 -> 73
    //   66: aload 4
    //   68: invokevirtual 156	java/io/File:length	()J
    //   71: l2i
    //   72: istore_3
    //   73: iload_1
    //   74: ifge +14 -> 88
    //   77: ldc2_w 332
    //   80: ldc_w 334
    //   83: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   86: aconst_null
    //   87: areturn
    //   88: iload_3
    //   89: ifgt +14 -> 103
    //   92: ldc2_w 332
    //   95: ldc_w 334
    //   98: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   101: aconst_null
    //   102: areturn
    //   103: iload_1
    //   104: iload_3
    //   105: iadd
    //   106: aload 4
    //   108: invokevirtual 156	java/io/File:length	()J
    //   111: l2i
    //   112: if_icmple +14 -> 126
    //   115: ldc2_w 332
    //   118: ldc_w 334
    //   121: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   124: aconst_null
    //   125: areturn
    //   126: new 336	java/io/RandomAccessFile
    //   129: dup
    //   130: aload_0
    //   131: ldc_w 338
    //   134: invokespecial 339	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   137: astore 6
    //   139: aload 6
    //   141: astore 4
    //   143: aload 7
    //   145: astore 5
    //   147: iload_3
    //   148: newarray <illegal type>
    //   150: astore 7
    //   152: aload 6
    //   154: astore 4
    //   156: aload 7
    //   158: astore 5
    //   160: aload 6
    //   162: iload_1
    //   163: i2l
    //   164: invokevirtual 343	java/io/RandomAccessFile:seek	(J)V
    //   167: aload 6
    //   169: astore 4
    //   171: aload 7
    //   173: astore 5
    //   175: aload 6
    //   177: aload 7
    //   179: invokevirtual 346	java/io/RandomAccessFile:readFully	([B)V
    //   182: aload 6
    //   184: invokevirtual 347	java/io/RandomAccessFile:close	()V
    //   187: ldc2_w 332
    //   190: ldc_w 334
    //   193: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   196: aload 7
    //   198: areturn
    //   199: astore 4
    //   201: ldc 80
    //   203: aload 4
    //   205: ldc 82
    //   207: iconst_0
    //   208: anewarray 4	java/lang/Object
    //   211: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   214: ldc 80
    //   216: ldc_w 349
    //   219: iconst_5
    //   220: anewarray 4	java/lang/Object
    //   223: dup
    //   224: iconst_0
    //   225: aload 4
    //   227: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   230: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   233: aastore
    //   234: dup
    //   235: iconst_1
    //   236: aload 4
    //   238: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   241: aastore
    //   242: dup
    //   243: iconst_2
    //   244: aload_0
    //   245: aastore
    //   246: dup
    //   247: iconst_3
    //   248: iload_1
    //   249: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   252: aastore
    //   253: dup
    //   254: iconst_4
    //   255: iload_3
    //   256: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   259: aastore
    //   260: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   263: goto -76 -> 187
    //   266: astore 7
    //   268: aconst_null
    //   269: astore 6
    //   271: aload 6
    //   273: astore 4
    //   275: ldc 80
    //   277: aload 7
    //   279: ldc 82
    //   281: iconst_0
    //   282: anewarray 4	java/lang/Object
    //   285: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: aload 6
    //   290: astore 4
    //   292: ldc 80
    //   294: ldc_w 351
    //   297: iconst_5
    //   298: anewarray 4	java/lang/Object
    //   301: dup
    //   302: iconst_0
    //   303: aload 7
    //   305: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   308: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   311: aastore
    //   312: dup
    //   313: iconst_1
    //   314: aload 7
    //   316: invokevirtual 115	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   319: aastore
    //   320: dup
    //   321: iconst_2
    //   322: aload_0
    //   323: aastore
    //   324: dup
    //   325: iconst_3
    //   326: iload_1
    //   327: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   330: aastore
    //   331: dup
    //   332: iconst_4
    //   333: iload_3
    //   334: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   337: aastore
    //   338: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   341: aload 5
    //   343: astore 7
    //   345: aload 6
    //   347: ifnull -160 -> 187
    //   350: aload 6
    //   352: invokevirtual 347	java/io/RandomAccessFile:close	()V
    //   355: aload 5
    //   357: astore 7
    //   359: goto -172 -> 187
    //   362: astore 4
    //   364: ldc 80
    //   366: aload 4
    //   368: ldc 82
    //   370: iconst_0
    //   371: anewarray 4	java/lang/Object
    //   374: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   377: ldc 80
    //   379: ldc_w 349
    //   382: iconst_5
    //   383: anewarray 4	java/lang/Object
    //   386: dup
    //   387: iconst_0
    //   388: aload 4
    //   390: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   393: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   396: aastore
    //   397: dup
    //   398: iconst_1
    //   399: aload 4
    //   401: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   404: aastore
    //   405: dup
    //   406: iconst_2
    //   407: aload_0
    //   408: aastore
    //   409: dup
    //   410: iconst_3
    //   411: iload_1
    //   412: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   415: aastore
    //   416: dup
    //   417: iconst_4
    //   418: iload_3
    //   419: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   422: aastore
    //   423: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   426: aload 5
    //   428: astore 7
    //   430: goto -243 -> 187
    //   433: astore 5
    //   435: aconst_null
    //   436: astore 4
    //   438: aload 4
    //   440: ifnull +8 -> 448
    //   443: aload 4
    //   445: invokevirtual 347	java/io/RandomAccessFile:close	()V
    //   448: aload 5
    //   450: athrow
    //   451: astore 4
    //   453: ldc 80
    //   455: aload 4
    //   457: ldc 82
    //   459: iconst_0
    //   460: anewarray 4	java/lang/Object
    //   463: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   466: ldc 80
    //   468: ldc_w 349
    //   471: iconst_5
    //   472: anewarray 4	java/lang/Object
    //   475: dup
    //   476: iconst_0
    //   477: aload 4
    //   479: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   482: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   485: aastore
    //   486: dup
    //   487: iconst_1
    //   488: aload 4
    //   490: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   493: aastore
    //   494: dup
    //   495: iconst_2
    //   496: aload_0
    //   497: aastore
    //   498: dup
    //   499: iconst_3
    //   500: iload_1
    //   501: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   504: aastore
    //   505: dup
    //   506: iconst_4
    //   507: iload_3
    //   508: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   511: aastore
    //   512: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   515: goto -67 -> 448
    //   518: astore 5
    //   520: goto -82 -> 438
    //   523: astore 7
    //   525: goto -254 -> 271
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	528	0	paramString	String
    //   0	528	1	paramInt1	int
    //   0	528	2	paramInt2	int
    //   60	448	3	i	int
    //   38	132	4	localObject1	Object
    //   199	38	4	localIOException1	IOException
    //   273	18	4	localObject2	Object
    //   362	38	4	localIOException2	IOException
    //   436	8	4	localObject3	Object
    //   451	38	4	localIOException3	IOException
    //   4	423	5	arrayOfByte1	byte[]
    //   433	16	5	localObject4	Object
    //   518	1	5	localObject5	Object
    //   137	214	6	localRandomAccessFile	java.io.RandomAccessFile
    //   1	196	7	arrayOfByte2	byte[]
    //   266	49	7	localException1	Exception
    //   343	86	7	localObject6	Object
    //   523	1	7	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   182	187	199	java/io/IOException
    //   126	139	266	java/lang/Exception
    //   350	355	362	java/io/IOException
    //   126	139	433	finally
    //   443	448	451	java/io/IOException
    //   147	152	518	finally
    //   160	167	518	finally
    //   175	182	518	finally
    //   275	288	518	finally
    //   292	341	518	finally
    //   147	152	523	java/lang/Exception
    //   160	167	523	java/lang/Exception
    //   175	182	523	java/lang/Exception
  }
  
  /* Error */
  public static int d(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 354
    //   3: ldc_w 356
    //   6: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: ifnull +8 -> 18
    //   13: aload_1
    //   14: arraylength
    //   15: ifne +15 -> 30
    //   18: ldc2_w 354
    //   21: ldc_w 356
    //   24: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   27: bipush -2
    //   29: ireturn
    //   30: new 62	java/io/FileOutputStream
    //   33: dup
    //   34: aload_0
    //   35: iconst_1
    //   36: invokespecial 122	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   39: astore_3
    //   40: aload_3
    //   41: astore_2
    //   42: aload_3
    //   43: aload_1
    //   44: iconst_0
    //   45: aload_1
    //   46: arraylength
    //   47: invokevirtual 125	java/io/FileOutputStream:write	([BII)V
    //   50: aload_3
    //   51: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   54: ldc2_w 354
    //   57: ldc_w 356
    //   60: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   63: iconst_0
    //   64: ireturn
    //   65: astore_2
    //   66: ldc 80
    //   68: aload_2
    //   69: ldc 82
    //   71: iconst_0
    //   72: anewarray 4	java/lang/Object
    //   75: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   78: ldc 80
    //   80: ldc_w 358
    //   83: iconst_4
    //   84: anewarray 4	java/lang/Object
    //   87: dup
    //   88: iconst_0
    //   89: aload_2
    //   90: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   93: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   96: aastore
    //   97: dup
    //   98: iconst_1
    //   99: aload_2
    //   100: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   103: aastore
    //   104: dup
    //   105: iconst_2
    //   106: aload_0
    //   107: aastore
    //   108: dup
    //   109: iconst_3
    //   110: aload_1
    //   111: arraylength
    //   112: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   115: aastore
    //   116: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: goto -65 -> 54
    //   122: astore 4
    //   124: aconst_null
    //   125: astore_3
    //   126: aload_3
    //   127: astore_2
    //   128: ldc 80
    //   130: aload 4
    //   132: ldc 82
    //   134: iconst_0
    //   135: anewarray 4	java/lang/Object
    //   138: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: aload_3
    //   142: astore_2
    //   143: ldc 80
    //   145: ldc_w 360
    //   148: iconst_4
    //   149: anewarray 4	java/lang/Object
    //   152: dup
    //   153: iconst_0
    //   154: aload 4
    //   156: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   159: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   162: aastore
    //   163: dup
    //   164: iconst_1
    //   165: aload 4
    //   167: invokevirtual 115	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   170: aastore
    //   171: dup
    //   172: iconst_2
    //   173: aload_0
    //   174: aastore
    //   175: dup
    //   176: iconst_3
    //   177: aload_1
    //   178: arraylength
    //   179: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   182: aastore
    //   183: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: aload_3
    //   187: ifnull +7 -> 194
    //   190: aload_3
    //   191: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   194: ldc2_w 354
    //   197: ldc_w 356
    //   200: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   203: iconst_m1
    //   204: ireturn
    //   205: astore_2
    //   206: ldc 80
    //   208: aload_2
    //   209: ldc 82
    //   211: iconst_0
    //   212: anewarray 4	java/lang/Object
    //   215: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: ldc 80
    //   220: ldc_w 358
    //   223: iconst_4
    //   224: anewarray 4	java/lang/Object
    //   227: dup
    //   228: iconst_0
    //   229: aload_2
    //   230: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   233: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   236: aastore
    //   237: dup
    //   238: iconst_1
    //   239: aload_2
    //   240: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   243: aastore
    //   244: dup
    //   245: iconst_2
    //   246: aload_0
    //   247: aastore
    //   248: dup
    //   249: iconst_3
    //   250: aload_1
    //   251: arraylength
    //   252: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   255: aastore
    //   256: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: goto -65 -> 194
    //   262: astore_3
    //   263: aconst_null
    //   264: astore_2
    //   265: aload_2
    //   266: ifnull +7 -> 273
    //   269: aload_2
    //   270: invokevirtual 126	java/io/FileOutputStream:close	()V
    //   273: aload_3
    //   274: athrow
    //   275: astore_2
    //   276: ldc 80
    //   278: aload_2
    //   279: ldc 82
    //   281: iconst_0
    //   282: anewarray 4	java/lang/Object
    //   285: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: ldc 80
    //   290: ldc_w 358
    //   293: iconst_4
    //   294: anewarray 4	java/lang/Object
    //   297: dup
    //   298: iconst_0
    //   299: aload_2
    //   300: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   303: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   306: aastore
    //   307: dup
    //   308: iconst_1
    //   309: aload_2
    //   310: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   313: aastore
    //   314: dup
    //   315: iconst_2
    //   316: aload_0
    //   317: aastore
    //   318: dup
    //   319: iconst_3
    //   320: aload_1
    //   321: arraylength
    //   322: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   325: aastore
    //   326: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   329: goto -56 -> 273
    //   332: astore_3
    //   333: goto -68 -> 265
    //   336: astore 4
    //   338: goto -212 -> 126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	341	0	paramString	String
    //   0	341	1	paramArrayOfByte	byte[]
    //   41	1	2	localFileOutputStream1	java.io.FileOutputStream
    //   65	35	2	localIOException1	IOException
    //   127	16	2	localFileOutputStream2	java.io.FileOutputStream
    //   205	35	2	localIOException2	IOException
    //   264	6	2	localObject1	Object
    //   275	35	2	localIOException3	IOException
    //   39	152	3	localFileOutputStream3	java.io.FileOutputStream
    //   262	12	3	localObject2	Object
    //   332	1	3	localObject3	Object
    //   122	44	4	localException1	Exception
    //   336	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   50	54	65	java/io/IOException
    //   30	40	122	java/lang/Exception
    //   190	194	205	java/io/IOException
    //   30	40	262	finally
    //   269	273	275	java/io/IOException
    //   42	50	332	finally
    //   128	141	332	finally
    //   143	186	332	finally
    //   42	50	336	java/lang/Exception
  }
  
  /* Error */
  public static byte[] d(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc2_w 361
    //   3: ldc_w 363
    //   6: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: ifnonnull +14 -> 24
    //   13: ldc2_w 361
    //   16: ldc_w 363
    //   19: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   22: aconst_null
    //   23: areturn
    //   24: new 45	java/io/File
    //   27: dup
    //   28: aload_0
    //   29: invokespecial 48	java/io/File:<init>	(Ljava/lang/String;)V
    //   32: astore 6
    //   34: aload 6
    //   36: invokevirtual 52	java/io/File:exists	()Z
    //   39: ifne +14 -> 53
    //   42: ldc2_w 361
    //   45: ldc_w 363
    //   48: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: aconst_null
    //   52: areturn
    //   53: iload_2
    //   54: iconst_m1
    //   55: if_icmpne +473 -> 528
    //   58: aload 6
    //   60: invokevirtual 156	java/io/File:length	()J
    //   63: l2i
    //   64: istore_2
    //   65: iload_1
    //   66: ifge +14 -> 80
    //   69: ldc2_w 361
    //   72: ldc_w 363
    //   75: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   78: aconst_null
    //   79: areturn
    //   80: iload_2
    //   81: ifgt +14 -> 95
    //   84: ldc2_w 361
    //   87: ldc_w 363
    //   90: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   93: aconst_null
    //   94: areturn
    //   95: iload_2
    //   96: istore_3
    //   97: iload_1
    //   98: iload_2
    //   99: iadd
    //   100: aload 6
    //   102: invokevirtual 156	java/io/File:length	()J
    //   105: l2i
    //   106: if_icmple +12 -> 118
    //   109: aload 6
    //   111: invokevirtual 156	java/io/File:length	()J
    //   114: l2i
    //   115: iload_1
    //   116: isub
    //   117: istore_3
    //   118: new 336	java/io/RandomAccessFile
    //   121: dup
    //   122: aload_0
    //   123: ldc_w 338
    //   126: invokespecial 339	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   129: astore 9
    //   131: aload 9
    //   133: astore 7
    //   135: iload_3
    //   136: newarray <illegal type>
    //   138: astore 6
    //   140: iload_1
    //   141: i2l
    //   142: lstore 4
    //   144: aload 9
    //   146: astore 7
    //   148: aload 9
    //   150: lload 4
    //   152: invokevirtual 343	java/io/RandomAccessFile:seek	(J)V
    //   155: aload 9
    //   157: astore 7
    //   159: aload 9
    //   161: aload 6
    //   163: invokevirtual 346	java/io/RandomAccessFile:readFully	([B)V
    //   166: aload 9
    //   168: invokevirtual 347	java/io/RandomAccessFile:close	()V
    //   171: aload 6
    //   173: astore_0
    //   174: ldc2_w 361
    //   177: ldc_w 363
    //   180: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   183: aload_0
    //   184: areturn
    //   185: astore 7
    //   187: ldc 80
    //   189: aload 7
    //   191: ldc 82
    //   193: iconst_0
    //   194: anewarray 4	java/lang/Object
    //   197: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: ldc 80
    //   202: ldc_w 365
    //   205: iconst_5
    //   206: anewarray 4	java/lang/Object
    //   209: dup
    //   210: iconst_0
    //   211: aload 7
    //   213: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   216: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   219: aastore
    //   220: dup
    //   221: iconst_1
    //   222: aload 7
    //   224: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   227: aastore
    //   228: dup
    //   229: iconst_2
    //   230: aload_0
    //   231: aastore
    //   232: dup
    //   233: iconst_3
    //   234: iload_1
    //   235: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   238: aastore
    //   239: dup
    //   240: iconst_4
    //   241: iload_3
    //   242: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   245: aastore
    //   246: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   249: aload 6
    //   251: astore_0
    //   252: goto -78 -> 174
    //   255: astore 8
    //   257: aconst_null
    //   258: astore 9
    //   260: aconst_null
    //   261: astore 6
    //   263: aload 9
    //   265: astore 7
    //   267: ldc 80
    //   269: aload 8
    //   271: ldc 82
    //   273: iconst_0
    //   274: anewarray 4	java/lang/Object
    //   277: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   280: aload 9
    //   282: astore 7
    //   284: ldc 80
    //   286: ldc_w 367
    //   289: iconst_5
    //   290: anewarray 4	java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload 8
    //   297: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   300: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   303: aastore
    //   304: dup
    //   305: iconst_1
    //   306: aload 8
    //   308: invokevirtual 115	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   311: aastore
    //   312: dup
    //   313: iconst_2
    //   314: aload_0
    //   315: aastore
    //   316: dup
    //   317: iconst_3
    //   318: iload_1
    //   319: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   322: aastore
    //   323: dup
    //   324: iconst_4
    //   325: iload_3
    //   326: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   329: aastore
    //   330: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   333: aload 9
    //   335: ifnull +187 -> 522
    //   338: aload 9
    //   340: invokevirtual 347	java/io/RandomAccessFile:close	()V
    //   343: aload 6
    //   345: astore_0
    //   346: goto -172 -> 174
    //   349: astore 7
    //   351: ldc 80
    //   353: aload 7
    //   355: ldc 82
    //   357: iconst_0
    //   358: anewarray 4	java/lang/Object
    //   361: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   364: ldc 80
    //   366: ldc_w 365
    //   369: iconst_5
    //   370: anewarray 4	java/lang/Object
    //   373: dup
    //   374: iconst_0
    //   375: aload 7
    //   377: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   380: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   383: aastore
    //   384: dup
    //   385: iconst_1
    //   386: aload 7
    //   388: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   391: aastore
    //   392: dup
    //   393: iconst_2
    //   394: aload_0
    //   395: aastore
    //   396: dup
    //   397: iconst_3
    //   398: iload_1
    //   399: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   402: aastore
    //   403: dup
    //   404: iconst_4
    //   405: iload_3
    //   406: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   409: aastore
    //   410: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   413: aload 6
    //   415: astore_0
    //   416: goto -242 -> 174
    //   419: astore 6
    //   421: aconst_null
    //   422: astore 7
    //   424: aload 7
    //   426: ifnull +8 -> 434
    //   429: aload 7
    //   431: invokevirtual 347	java/io/RandomAccessFile:close	()V
    //   434: aload 6
    //   436: athrow
    //   437: astore 7
    //   439: ldc 80
    //   441: aload 7
    //   443: ldc 82
    //   445: iconst_0
    //   446: anewarray 4	java/lang/Object
    //   449: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   452: ldc 80
    //   454: ldc_w 365
    //   457: iconst_5
    //   458: anewarray 4	java/lang/Object
    //   461: dup
    //   462: iconst_0
    //   463: aload 7
    //   465: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   468: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   471: aastore
    //   472: dup
    //   473: iconst_1
    //   474: aload 7
    //   476: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   479: aastore
    //   480: dup
    //   481: iconst_2
    //   482: aload_0
    //   483: aastore
    //   484: dup
    //   485: iconst_3
    //   486: iload_1
    //   487: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   490: aastore
    //   491: dup
    //   492: iconst_4
    //   493: iload_3
    //   494: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   497: aastore
    //   498: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   501: goto -67 -> 434
    //   504: astore 6
    //   506: goto -82 -> 424
    //   509: astore 8
    //   511: aconst_null
    //   512: astore 6
    //   514: goto -251 -> 263
    //   517: astore 8
    //   519: goto -256 -> 263
    //   522: aload 6
    //   524: astore_0
    //   525: goto -351 -> 174
    //   528: goto -463 -> 65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	531	0	paramString	String
    //   0	531	1	paramInt1	int
    //   0	531	2	paramInt2	int
    //   96	398	3	i	int
    //   142	9	4	l	long
    //   32	382	6	localObject1	Object
    //   419	16	6	localObject2	Object
    //   504	1	6	localObject3	Object
    //   512	11	6	localObject4	Object
    //   133	25	7	localRandomAccessFile1	java.io.RandomAccessFile
    //   185	38	7	localIOException1	IOException
    //   265	18	7	localRandomAccessFile2	java.io.RandomAccessFile
    //   349	38	7	localIOException2	IOException
    //   422	8	7	localObject5	Object
    //   437	38	7	localIOException3	IOException
    //   255	52	8	localException1	Exception
    //   509	1	8	localException2	Exception
    //   517	1	8	localException3	Exception
    //   129	210	9	localRandomAccessFile3	java.io.RandomAccessFile
    // Exception table:
    //   from	to	target	type
    //   166	171	185	java/io/IOException
    //   118	131	255	java/lang/Exception
    //   338	343	349	java/io/IOException
    //   118	131	419	finally
    //   429	434	437	java/io/IOException
    //   135	140	504	finally
    //   148	155	504	finally
    //   159	166	504	finally
    //   267	280	504	finally
    //   284	333	504	finally
    //   135	140	509	java/lang/Exception
    //   148	155	517	java/lang/Exception
    //   159	166	517	java/lang/Exception
  }
  
  public static final boolean f(File paramFile)
  {
    int i = 0;
    GMTrace.i(13861335859200L, 103275);
    if ((paramFile == null) || (!paramFile.exists()))
    {
      GMTrace.o(13861335859200L, 103275);
      return false;
    }
    if (paramFile.isFile()) {
      paramFile.delete();
    }
    for (;;)
    {
      paramFile.delete();
      GMTrace.o(13861335859200L, 103275);
      return true;
      if (paramFile.isDirectory())
      {
        File[] arrayOfFile = paramFile.listFiles();
        if (arrayOfFile != null) {
          while (i < arrayOfFile.length)
          {
            f(arrayOfFile[i]);
            i += 1;
          }
        }
      }
    }
  }
  
  public static final boolean g(File paramFile)
  {
    GMTrace.i(13861470076928L, 103276);
    boolean bool = b.g(paramFile);
    GMTrace.o(13861470076928L, 103276);
    return bool;
  }
  
  public static final boolean g(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(14906086653952L, 111059);
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null))
    {
      GMTrace.o(14906086653952L, 111059);
      return false;
    }
    paramString2 = new File(paramString1 + paramString2);
    paramString1 = new File(paramString1 + paramString3);
    if (paramString2.exists())
    {
      boolean bool = paramString2.renameTo(paramString1);
      GMTrace.o(14906086653952L, 111059);
      return bool;
    }
    GMTrace.o(14906086653952L, 111059);
    return false;
  }
  
  /* Error */
  public static long o(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 5
    //   6: ldc2_w 384
    //   9: ldc_w 386
    //   12: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   15: new 208	java/io/FileInputStream
    //   18: dup
    //   19: aload_0
    //   20: invokespecial 387	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   23: invokevirtual 391	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   26: astore 4
    //   28: new 62	java/io/FileOutputStream
    //   31: dup
    //   32: aload_1
    //   33: invokespecial 392	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   36: invokevirtual 393	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   39: astore 5
    //   41: aload 5
    //   43: aload 4
    //   45: lconst_0
    //   46: aload 4
    //   48: invokevirtual 398	java/nio/channels/FileChannel:size	()J
    //   51: invokevirtual 402	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   54: pop2
    //   55: aload 4
    //   57: invokevirtual 398	java/nio/channels/FileChannel:size	()J
    //   60: lstore_2
    //   61: aload 4
    //   63: ifnull +8 -> 71
    //   66: aload 4
    //   68: invokevirtual 403	java/nio/channels/FileChannel:close	()V
    //   71: aload 5
    //   73: ifnull +8 -> 81
    //   76: aload 5
    //   78: invokevirtual 403	java/nio/channels/FileChannel:close	()V
    //   81: ldc2_w 384
    //   84: ldc_w 386
    //   87: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   90: lload_2
    //   91: lreturn
    //   92: astore 6
    //   94: aconst_null
    //   95: astore 4
    //   97: ldc 80
    //   99: aload 6
    //   101: ldc 82
    //   103: iconst_0
    //   104: anewarray 4	java/lang/Object
    //   107: invokestatic 88	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: ldc 80
    //   112: ldc_w 405
    //   115: iconst_4
    //   116: anewarray 4	java/lang/Object
    //   119: dup
    //   120: iconst_0
    //   121: aload 6
    //   123: invokevirtual 94	java/lang/Object:getClass	()Ljava/lang/Class;
    //   126: invokevirtual 99	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   129: aastore
    //   130: dup
    //   131: iconst_1
    //   132: aload 6
    //   134: invokevirtual 115	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: aload_0
    //   141: aastore
    //   142: dup
    //   143: iconst_3
    //   144: aload_1
    //   145: aastore
    //   146: invokestatic 112	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: aload 5
    //   151: ifnull +8 -> 159
    //   154: aload 5
    //   156: invokevirtual 403	java/nio/channels/FileChannel:close	()V
    //   159: aload 4
    //   161: ifnull +8 -> 169
    //   164: aload 4
    //   166: invokevirtual 403	java/nio/channels/FileChannel:close	()V
    //   169: ldc2_w 384
    //   172: ldc_w 386
    //   175: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   178: ldc2_w 406
    //   181: lreturn
    //   182: astore_0
    //   183: aconst_null
    //   184: astore 4
    //   186: aload 6
    //   188: astore 5
    //   190: aload 5
    //   192: ifnull +8 -> 200
    //   195: aload 5
    //   197: invokevirtual 403	java/nio/channels/FileChannel:close	()V
    //   200: aload 4
    //   202: ifnull +8 -> 210
    //   205: aload 4
    //   207: invokevirtual 403	java/nio/channels/FileChannel:close	()V
    //   210: aload_0
    //   211: athrow
    //   212: astore_0
    //   213: goto -142 -> 71
    //   216: astore_0
    //   217: goto -136 -> 81
    //   220: astore_0
    //   221: goto -62 -> 159
    //   224: astore_0
    //   225: goto -56 -> 169
    //   228: astore_1
    //   229: goto -29 -> 200
    //   232: astore_1
    //   233: goto -23 -> 210
    //   236: astore_0
    //   237: aload 4
    //   239: astore 5
    //   241: aconst_null
    //   242: astore 4
    //   244: goto -54 -> 190
    //   247: astore_0
    //   248: aload 4
    //   250: astore_1
    //   251: aload 5
    //   253: astore 4
    //   255: aload_1
    //   256: astore 5
    //   258: goto -68 -> 190
    //   261: astore_0
    //   262: goto -72 -> 190
    //   265: astore 6
    //   267: aload 4
    //   269: astore 5
    //   271: aconst_null
    //   272: astore 4
    //   274: goto -177 -> 97
    //   277: astore 6
    //   279: aload 4
    //   281: astore 7
    //   283: aload 5
    //   285: astore 4
    //   287: aload 7
    //   289: astore 5
    //   291: goto -194 -> 97
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	294	0	paramString1	String
    //   0	294	1	paramString2	String
    //   60	31	2	l	long
    //   26	260	4	localObject1	Object
    //   4	286	5	localObject2	Object
    //   1	1	6	localObject3	Object
    //   92	95	6	localException1	Exception
    //   265	1	6	localException2	Exception
    //   277	1	6	localException3	Exception
    //   281	7	7	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   15	28	92	java/lang/Exception
    //   15	28	182	finally
    //   66	71	212	java/io/IOException
    //   76	81	216	java/io/IOException
    //   154	159	220	java/io/IOException
    //   164	169	224	java/io/IOException
    //   195	200	228	java/io/IOException
    //   205	210	232	java/io/IOException
    //   28	41	236	finally
    //   41	61	247	finally
    //   97	149	261	finally
    //   28	41	265	java/lang/Exception
    //   41	61	277	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package org.xwalk.core;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

class XWalkDecompressor
{
  private static final int LZMA_OUTSIZE = 8;
  private static final int LZMA_PROP_SIZE = 5;
  private static final String[] MANDATORY_LIBRARIES = { "libxwalkcore.so" };
  private static final String[] MANDATORY_RESOURCES = XWalkEnvironment.MANDATORY_RESOURCES;
  private static final int STREAM_BUFFER_SIZE = 1048576;
  private static final String TAG = "XWalkLib";
  
  public static void copyApkToLocal(String paramString1, String paramString2)
  {
    Log.d("XWalkLib", "Copy to local from Apk " + paramString1);
    try
    {
      paramString1 = new FileInputStream(new File(paramString1));
      paramString2 = new File(paramString2);
      if (paramString2.exists()) {
        paramString2.delete();
      }
      paramString2 = new FileOutputStream(paramString2);
      byte[] arrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        int i = paramString1.read(arrayOfByte);
        if (i <= 0) {
          break;
        }
        paramString2.write(arrayOfByte, 0, i);
      }
      paramString1.close();
    }
    catch (Exception paramString1)
    {
      Log.e("copyApkToLocal error:", paramString1.getMessage());
      return;
    }
    paramString2.close();
  }
  
  /* Error */
  public static boolean decompressDownloadFullZip(String paramString, int paramInt)
  {
    // Byte code:
    //   0: ldc 21
    //   2: new 44	java/lang/StringBuilder
    //   5: dup
    //   6: ldc 108
    //   8: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: aload_0
    //   12: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: ldc 110
    //   17: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: iload_1
    //   21: invokevirtual 113	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   24: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: invokestatic 116	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: invokestatic 122	android/os/SystemClock:uptimeMillis	()J
    //   33: lstore_3
    //   34: new 124	java/util/zip/ZipFile
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 125	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   42: astore 5
    //   44: aload 5
    //   46: astore_0
    //   47: aload 5
    //   49: invokevirtual 129	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   52: astore 7
    //   54: aload 5
    //   56: astore_0
    //   57: aload 7
    //   59: invokeinterface 134 1 0
    //   64: ifeq +309 -> 373
    //   67: aload 5
    //   69: astore_0
    //   70: aload 7
    //   72: invokeinterface 138 1 0
    //   77: checkcast 140	java/util/zip/ZipEntry
    //   80: astore 6
    //   82: aload 5
    //   84: astore_0
    //   85: aload 5
    //   87: aload 6
    //   89: invokevirtual 144	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   92: astore 8
    //   94: aload 5
    //   96: astore_0
    //   97: aload 6
    //   99: invokevirtual 147	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   102: ldc -107
    //   104: invokestatic 155	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   107: astore 6
    //   109: aload 5
    //   111: astore_0
    //   112: ldc 21
    //   114: new 44	java/lang/StringBuilder
    //   117: dup
    //   118: ldc -99
    //   120: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   123: aload 6
    //   125: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: invokestatic 116	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: aload 5
    //   136: astore_0
    //   137: aload 6
    //   139: ldc -97
    //   141: invokevirtual 163	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   144: ifeq +125 -> 269
    //   147: aload 5
    //   149: astore_0
    //   150: new 66	java/io/File
    //   153: dup
    //   154: iload_1
    //   155: invokestatic 167	org/xwalk/core/XWalkEnvironment:getDownloadApkPath	(I)Ljava/lang/String;
    //   158: invokespecial 67	java/io/File:<init>	(Ljava/lang/String;)V
    //   161: astore 6
    //   163: aload 5
    //   165: astore_0
    //   166: aload 6
    //   168: invokevirtual 74	java/io/File:exists	()Z
    //   171: ifne +156 -> 327
    //   174: aload 5
    //   176: astore_0
    //   177: aload 6
    //   179: invokevirtual 171	java/io/File:getParentFile	()Ljava/io/File;
    //   182: astore 9
    //   184: aload 5
    //   186: astore_0
    //   187: aload 9
    //   189: invokevirtual 74	java/io/File:exists	()Z
    //   192: ifne +12 -> 204
    //   195: aload 5
    //   197: astore_0
    //   198: aload 9
    //   200: invokevirtual 174	java/io/File:mkdirs	()Z
    //   203: pop
    //   204: aload 5
    //   206: astore_0
    //   207: new 79	java/io/FileOutputStream
    //   210: dup
    //   211: aload 6
    //   213: invokespecial 80	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   216: astore 6
    //   218: aload 5
    //   220: astore_0
    //   221: ldc 17
    //   223: newarray <illegal type>
    //   225: astore 9
    //   227: aload 5
    //   229: astore_0
    //   230: aload 8
    //   232: aload 9
    //   234: invokevirtual 177	java/io/InputStream:read	([B)I
    //   237: istore_2
    //   238: iload_2
    //   239: iconst_m1
    //   240: if_icmpeq +114 -> 354
    //   243: aload 5
    //   245: astore_0
    //   246: aload 6
    //   248: aload 9
    //   250: iconst_0
    //   251: iload_2
    //   252: invokevirtual 180	java/io/OutputStream:write	([BII)V
    //   255: aload 5
    //   257: astore_0
    //   258: aload 8
    //   260: aload 9
    //   262: invokevirtual 177	java/io/InputStream:read	([B)I
    //   265: istore_2
    //   266: goto -28 -> 238
    //   269: aload 5
    //   271: astore_0
    //   272: new 66	java/io/File
    //   275: dup
    //   276: iload_1
    //   277: aload 6
    //   279: invokestatic 184	org/xwalk/core/XWalkEnvironment:getExtractedCoreFile	(ILjava/lang/String;)Ljava/lang/String;
    //   282: invokespecial 67	java/io/File:<init>	(Ljava/lang/String;)V
    //   285: astore 6
    //   287: goto -124 -> 163
    //   290: astore 6
    //   292: aload 5
    //   294: astore_0
    //   295: ldc 21
    //   297: new 44	java/lang/StringBuilder
    //   300: dup
    //   301: ldc -70
    //   303: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   306: aload 6
    //   308: invokevirtual 189	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   311: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   317: invokestatic 96	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   320: aload 5
    //   322: invokevirtual 190	java/util/zip/ZipFile:close	()V
    //   325: iconst_0
    //   326: ireturn
    //   327: aload 5
    //   329: astore_0
    //   330: aload 6
    //   332: invokevirtual 77	java/io/File:delete	()Z
    //   335: pop
    //   336: goto -132 -> 204
    //   339: astore 6
    //   341: aload_0
    //   342: astore 5
    //   344: aload 6
    //   346: astore_0
    //   347: aload 5
    //   349: invokevirtual 190	java/util/zip/ZipFile:close	()V
    //   352: aload_0
    //   353: athrow
    //   354: aload 5
    //   356: astore_0
    //   357: aload 6
    //   359: invokevirtual 191	java/io/OutputStream:close	()V
    //   362: aload 5
    //   364: astore_0
    //   365: aload 8
    //   367: invokevirtual 192	java/io/InputStream:close	()V
    //   370: goto -316 -> 54
    //   373: aload 5
    //   375: invokevirtual 190	java/util/zip/ZipFile:close	()V
    //   378: invokestatic 197	java/lang/System:gc	()V
    //   381: ldc 21
    //   383: new 44	java/lang/StringBuilder
    //   386: dup
    //   387: ldc -57
    //   389: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   392: invokestatic 122	android/os/SystemClock:uptimeMillis	()J
    //   395: lload_3
    //   396: lsub
    //   397: invokevirtual 202	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   400: ldc -52
    //   402: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   405: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   408: invokestatic 62	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   411: iconst_1
    //   412: ireturn
    //   413: astore_0
    //   414: goto -36 -> 378
    //   417: astore_0
    //   418: goto -40 -> 378
    //   421: astore_0
    //   422: goto -97 -> 325
    //   425: astore_0
    //   426: goto -101 -> 325
    //   429: astore 5
    //   431: goto -79 -> 352
    //   434: astore 5
    //   436: goto -84 -> 352
    //   439: astore_0
    //   440: aconst_null
    //   441: astore 5
    //   443: goto -96 -> 347
    //   446: astore 6
    //   448: aconst_null
    //   449: astore 5
    //   451: goto -159 -> 292
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	454	0	paramString	String
    //   0	454	1	paramInt	int
    //   237	29	2	i	int
    //   33	363	3	l	long
    //   42	332	5	localObject1	Object
    //   429	1	5	localIOException1	IOException
    //   434	1	5	localNullPointerException	NullPointerException
    //   441	9	5	localObject2	Object
    //   80	206	6	localObject3	Object
    //   290	41	6	localIOException2	IOException
    //   339	19	6	localObject4	Object
    //   446	1	6	localIOException3	IOException
    //   52	19	7	localEnumeration	java.util.Enumeration
    //   92	274	8	localInputStream	InputStream
    //   182	79	9	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   47	54	290	java/io/IOException
    //   57	67	290	java/io/IOException
    //   70	82	290	java/io/IOException
    //   85	94	290	java/io/IOException
    //   97	109	290	java/io/IOException
    //   112	134	290	java/io/IOException
    //   137	147	290	java/io/IOException
    //   150	163	290	java/io/IOException
    //   166	174	290	java/io/IOException
    //   177	184	290	java/io/IOException
    //   187	195	290	java/io/IOException
    //   198	204	290	java/io/IOException
    //   207	218	290	java/io/IOException
    //   221	227	290	java/io/IOException
    //   230	238	290	java/io/IOException
    //   246	255	290	java/io/IOException
    //   258	266	290	java/io/IOException
    //   272	287	290	java/io/IOException
    //   330	336	290	java/io/IOException
    //   357	362	290	java/io/IOException
    //   365	370	290	java/io/IOException
    //   47	54	339	finally
    //   57	67	339	finally
    //   70	82	339	finally
    //   85	94	339	finally
    //   97	109	339	finally
    //   112	134	339	finally
    //   137	147	339	finally
    //   150	163	339	finally
    //   166	174	339	finally
    //   177	184	339	finally
    //   187	195	339	finally
    //   198	204	339	finally
    //   207	218	339	finally
    //   221	227	339	finally
    //   230	238	339	finally
    //   246	255	339	finally
    //   258	266	339	finally
    //   272	287	339	finally
    //   295	320	339	finally
    //   330	336	339	finally
    //   357	362	339	finally
    //   365	370	339	finally
    //   373	378	413	java/io/IOException
    //   373	378	417	java/lang/NullPointerException
    //   320	325	421	java/io/IOException
    //   320	325	425	java/lang/NullPointerException
    //   347	352	429	java/io/IOException
    //   347	352	434	java/lang/NullPointerException
    //   34	44	439	finally
    //   34	44	446	java/io/IOException
  }
  
  /* Error */
  public static boolean decompressDownloadPatchZip(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 21
    //   2: new 44	java/lang/StringBuilder
    //   5: dup
    //   6: ldc -48
    //   8: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: aload_0
    //   12: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   18: invokestatic 62	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: invokestatic 122	android/os/SystemClock:uptimeMillis	()J
    //   24: lstore_3
    //   25: new 124	java/util/zip/ZipFile
    //   28: dup
    //   29: aload_0
    //   30: invokespecial 125	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   33: astore 5
    //   35: aload 5
    //   37: astore_0
    //   38: aload 5
    //   40: invokevirtual 129	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   43: astore 6
    //   45: aload 5
    //   47: astore_0
    //   48: aload 6
    //   50: invokeinterface 134 1 0
    //   55: ifeq +243 -> 298
    //   58: aload 5
    //   60: astore_0
    //   61: aload 6
    //   63: invokeinterface 138 1 0
    //   68: checkcast 140	java/util/zip/ZipEntry
    //   71: astore 8
    //   73: aload 5
    //   75: astore_0
    //   76: aload 5
    //   78: aload 8
    //   80: invokevirtual 144	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   83: astore 7
    //   85: aload 5
    //   87: astore_0
    //   88: new 66	java/io/File
    //   91: dup
    //   92: aload_1
    //   93: aload 8
    //   95: invokevirtual 147	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   98: ldc -107
    //   100: invokestatic 155	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   103: invokespecial 210	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: astore 8
    //   108: aload 5
    //   110: astore_0
    //   111: aload 8
    //   113: invokevirtual 74	java/io/File:exists	()Z
    //   116: ifne +98 -> 214
    //   119: aload 5
    //   121: astore_0
    //   122: aload 8
    //   124: invokevirtual 171	java/io/File:getParentFile	()Ljava/io/File;
    //   127: astore 9
    //   129: aload 5
    //   131: astore_0
    //   132: aload 9
    //   134: invokevirtual 74	java/io/File:exists	()Z
    //   137: ifne +12 -> 149
    //   140: aload 5
    //   142: astore_0
    //   143: aload 9
    //   145: invokevirtual 174	java/io/File:mkdirs	()Z
    //   148: pop
    //   149: aload 5
    //   151: astore_0
    //   152: new 79	java/io/FileOutputStream
    //   155: dup
    //   156: aload 8
    //   158: invokespecial 80	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   161: astore 8
    //   163: aload 5
    //   165: astore_0
    //   166: ldc 17
    //   168: newarray <illegal type>
    //   170: astore 9
    //   172: aload 5
    //   174: astore_0
    //   175: aload 7
    //   177: aload 9
    //   179: invokevirtual 177	java/io/InputStream:read	([B)I
    //   182: istore_2
    //   183: iload_2
    //   184: iconst_m1
    //   185: if_icmpeq +81 -> 266
    //   188: aload 5
    //   190: astore_0
    //   191: aload 8
    //   193: aload 9
    //   195: iconst_0
    //   196: iload_2
    //   197: invokevirtual 180	java/io/OutputStream:write	([BII)V
    //   200: aload 5
    //   202: astore_0
    //   203: aload 7
    //   205: aload 9
    //   207: invokevirtual 177	java/io/InputStream:read	([B)I
    //   210: istore_2
    //   211: goto -28 -> 183
    //   214: aload 5
    //   216: astore_0
    //   217: aload 8
    //   219: invokevirtual 77	java/io/File:delete	()Z
    //   222: pop
    //   223: goto -74 -> 149
    //   226: astore_0
    //   227: aload 5
    //   229: astore_1
    //   230: aload_0
    //   231: astore 5
    //   233: aload_1
    //   234: astore_0
    //   235: ldc 21
    //   237: new 44	java/lang/StringBuilder
    //   240: dup
    //   241: ldc -70
    //   243: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   246: aload 5
    //   248: invokevirtual 189	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   251: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   257: invokestatic 96	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   260: aload_1
    //   261: invokevirtual 190	java/util/zip/ZipFile:close	()V
    //   264: iconst_0
    //   265: ireturn
    //   266: aload 5
    //   268: astore_0
    //   269: aload 8
    //   271: invokevirtual 191	java/io/OutputStream:close	()V
    //   274: aload 5
    //   276: astore_0
    //   277: aload 7
    //   279: invokevirtual 192	java/io/InputStream:close	()V
    //   282: goto -237 -> 45
    //   285: astore 5
    //   287: aload_0
    //   288: astore_1
    //   289: aload 5
    //   291: astore_0
    //   292: aload_1
    //   293: invokevirtual 190	java/util/zip/ZipFile:close	()V
    //   296: aload_0
    //   297: athrow
    //   298: aload 5
    //   300: invokevirtual 190	java/util/zip/ZipFile:close	()V
    //   303: invokestatic 197	java/lang/System:gc	()V
    //   306: ldc 21
    //   308: new 44	java/lang/StringBuilder
    //   311: dup
    //   312: ldc -57
    //   314: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   317: invokestatic 122	android/os/SystemClock:uptimeMillis	()J
    //   320: lload_3
    //   321: lsub
    //   322: invokevirtual 202	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   325: ldc -52
    //   327: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   333: invokestatic 62	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   336: iconst_1
    //   337: ireturn
    //   338: astore_0
    //   339: goto -36 -> 303
    //   342: astore_0
    //   343: goto -40 -> 303
    //   346: astore_0
    //   347: goto -83 -> 264
    //   350: astore_0
    //   351: goto -87 -> 264
    //   354: astore_1
    //   355: goto -59 -> 296
    //   358: astore_1
    //   359: goto -63 -> 296
    //   362: astore_0
    //   363: aconst_null
    //   364: astore_1
    //   365: goto -73 -> 292
    //   368: astore 5
    //   370: aconst_null
    //   371: astore_1
    //   372: goto -139 -> 233
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	375	0	paramString1	String
    //   0	375	1	paramString2	String
    //   182	29	2	i	int
    //   24	297	3	l	long
    //   33	242	5	localObject1	Object
    //   285	14	5	localObject2	Object
    //   368	1	5	localIOException	IOException
    //   43	19	6	localEnumeration	java.util.Enumeration
    //   83	195	7	localInputStream	InputStream
    //   71	199	8	localObject3	Object
    //   127	79	9	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   38	45	226	java/io/IOException
    //   48	58	226	java/io/IOException
    //   61	73	226	java/io/IOException
    //   76	85	226	java/io/IOException
    //   88	108	226	java/io/IOException
    //   111	119	226	java/io/IOException
    //   122	129	226	java/io/IOException
    //   132	140	226	java/io/IOException
    //   143	149	226	java/io/IOException
    //   152	163	226	java/io/IOException
    //   166	172	226	java/io/IOException
    //   175	183	226	java/io/IOException
    //   191	200	226	java/io/IOException
    //   203	211	226	java/io/IOException
    //   217	223	226	java/io/IOException
    //   269	274	226	java/io/IOException
    //   277	282	226	java/io/IOException
    //   38	45	285	finally
    //   48	58	285	finally
    //   61	73	285	finally
    //   76	85	285	finally
    //   88	108	285	finally
    //   111	119	285	finally
    //   122	129	285	finally
    //   132	140	285	finally
    //   143	149	285	finally
    //   152	163	285	finally
    //   166	172	285	finally
    //   175	183	285	finally
    //   191	200	285	finally
    //   203	211	285	finally
    //   217	223	285	finally
    //   235	260	285	finally
    //   269	274	285	finally
    //   277	282	285	finally
    //   298	303	338	java/io/IOException
    //   298	303	342	java/lang/NullPointerException
    //   260	264	346	java/io/IOException
    //   260	264	350	java/lang/NullPointerException
    //   292	296	354	java/io/IOException
    //   292	296	358	java/lang/NullPointerException
    //   25	35	362	finally
    //   25	35	368	java/io/IOException
  }
  
  /* Error */
  public static void extractLzmaToFile(InputStream paramInputStream, File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: iconst_0
    //   4: istore_2
    //   5: new 214	java/io/BufferedInputStream
    //   8: dup
    //   9: aload_0
    //   10: invokespecial 217	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   13: astore 6
    //   15: new 219	java/io/BufferedOutputStream
    //   18: dup
    //   19: new 79	java/io/FileOutputStream
    //   22: dup
    //   23: aload_1
    //   24: invokespecial 80	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   27: invokespecial 222	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   30: astore 7
    //   32: iconst_5
    //   33: newarray <illegal type>
    //   35: astore_0
    //   36: aload 6
    //   38: aload_0
    //   39: iconst_0
    //   40: iconst_5
    //   41: invokevirtual 225	java/io/InputStream:read	([BII)I
    //   44: iconst_5
    //   45: if_icmpeq +59 -> 104
    //   48: new 104	java/io/IOException
    //   51: dup
    //   52: ldc -29
    //   54: invokespecial 228	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   57: athrow
    //   58: astore 8
    //   60: aload 7
    //   62: astore_0
    //   63: aload 8
    //   65: astore 7
    //   67: aload_1
    //   68: invokevirtual 231	java/io/File:isFile	()Z
    //   71: ifeq +8 -> 79
    //   74: aload_1
    //   75: invokevirtual 77	java/io/File:delete	()Z
    //   78: pop
    //   79: aload 7
    //   81: athrow
    //   82: astore 7
    //   84: aload_0
    //   85: astore_1
    //   86: aload 7
    //   88: astore_0
    //   89: aload_1
    //   90: invokevirtual 234	java/io/OutputStream:flush	()V
    //   93: aload_1
    //   94: invokevirtual 191	java/io/OutputStream:close	()V
    //   97: aload 6
    //   99: invokevirtual 192	java/io/InputStream:close	()V
    //   102: aload_0
    //   103: athrow
    //   104: new 236	e/a/b/a
    //   107: dup
    //   108: invokespecial 237	e/a/b/a:<init>	()V
    //   111: astore 8
    //   113: aload 8
    //   115: aload_0
    //   116: invokevirtual 241	e/a/b/a:cc	([B)Z
    //   119: ifne +166 -> 285
    //   122: new 104	java/io/IOException
    //   125: dup
    //   126: ldc -13
    //   128: invokespecial 228	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   131: athrow
    //   132: iload_2
    //   133: bipush 8
    //   135: if_icmpge +23 -> 158
    //   138: aload 6
    //   140: invokevirtual 246	java/io/InputStream:read	()I
    //   143: istore_3
    //   144: iload_3
    //   145: ifge +146 -> 291
    //   148: ldc 21
    //   150: ldc -8
    //   152: invokestatic 251	org/xwalk/core/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   155: goto +136 -> 291
    //   158: aload 8
    //   160: aload 6
    //   162: aload 7
    //   164: lload 4
    //   166: invokevirtual 255	e/a/b/a:a	(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z
    //   169: ifne +14 -> 183
    //   172: new 104	java/io/IOException
    //   175: dup
    //   176: ldc_w 257
    //   179: invokespecial 228	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   182: athrow
    //   183: aload 7
    //   185: invokevirtual 234	java/io/OutputStream:flush	()V
    //   188: aload 7
    //   190: invokevirtual 191	java/io/OutputStream:close	()V
    //   193: aload 6
    //   195: invokevirtual 192	java/io/InputStream:close	()V
    //   198: return
    //   199: astore_0
    //   200: goto -12 -> 188
    //   203: astore_0
    //   204: goto -16 -> 188
    //   207: astore_0
    //   208: goto -15 -> 193
    //   211: astore_0
    //   212: goto -19 -> 193
    //   215: astore_0
    //   216: return
    //   217: astore_0
    //   218: return
    //   219: astore 7
    //   221: goto -128 -> 93
    //   224: astore 7
    //   226: goto -133 -> 93
    //   229: astore_1
    //   230: goto -133 -> 97
    //   233: astore_1
    //   234: goto -137 -> 97
    //   237: astore_1
    //   238: goto -136 -> 102
    //   241: astore_1
    //   242: goto -140 -> 102
    //   245: astore_0
    //   246: aconst_null
    //   247: astore_1
    //   248: aconst_null
    //   249: astore 6
    //   251: goto -162 -> 89
    //   254: astore_0
    //   255: aconst_null
    //   256: astore_1
    //   257: goto -168 -> 89
    //   260: astore 7
    //   262: aconst_null
    //   263: astore_0
    //   264: aload 8
    //   266: astore 6
    //   268: goto -201 -> 67
    //   271: astore 7
    //   273: aconst_null
    //   274: astore_0
    //   275: goto -208 -> 67
    //   278: astore_0
    //   279: aload 7
    //   281: astore_1
    //   282: goto -193 -> 89
    //   285: lconst_0
    //   286: lstore 4
    //   288: goto -156 -> 132
    //   291: lload 4
    //   293: iload_3
    //   294: i2l
    //   295: iload_2
    //   296: bipush 8
    //   298: imul
    //   299: lshl
    //   300: lor
    //   301: lstore 4
    //   303: iload_2
    //   304: iconst_1
    //   305: iadd
    //   306: istore_2
    //   307: goto -175 -> 132
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	310	0	paramInputStream	InputStream
    //   0	310	1	paramFile	File
    //   4	303	2	i	int
    //   143	151	3	j	int
    //   164	1	4	localObject1	Object
    //   286	16	4	l	long
    //   13	254	6	localObject2	Object
    //   30	50	7	localObject3	Object
    //   82	107	7	localOutputStream	java.io.OutputStream
    //   219	1	7	localIOException1	IOException
    //   224	1	7	localNullPointerException	NullPointerException
    //   260	1	7	localIOException2	IOException
    //   271	9	7	localIOException3	IOException
    //   1	1	8	localObject4	Object
    //   58	6	8	localIOException4	IOException
    //   111	154	8	locala	e.a.b.a
    // Exception table:
    //   from	to	target	type
    //   32	58	58	java/io/IOException
    //   104	132	58	java/io/IOException
    //   138	144	58	java/io/IOException
    //   148	155	58	java/io/IOException
    //   158	183	58	java/io/IOException
    //   67	79	82	finally
    //   79	82	82	finally
    //   183	188	199	java/io/IOException
    //   183	188	203	java/lang/NullPointerException
    //   188	193	207	java/io/IOException
    //   188	193	211	java/lang/NullPointerException
    //   193	198	215	java/io/IOException
    //   193	198	217	java/lang/NullPointerException
    //   89	93	219	java/io/IOException
    //   89	93	224	java/lang/NullPointerException
    //   93	97	229	java/io/IOException
    //   93	97	233	java/lang/NullPointerException
    //   97	102	237	java/io/IOException
    //   97	102	241	java/lang/NullPointerException
    //   5	15	245	finally
    //   15	32	254	finally
    //   5	15	260	java/io/IOException
    //   15	32	271	java/io/IOException
    //   32	58	278	finally
    //   104	132	278	finally
    //   138	144	278	finally
    //   148	155	278	finally
    //   158	183	278	finally
  }
  
  /* Error */
  public static boolean extractResource(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 21
    //   2: new 44	java/lang/StringBuilder
    //   5: dup
    //   6: ldc_w 260
    //   9: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   12: aload_0
    //   13: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   19: invokestatic 116	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: invokestatic 122	android/os/SystemClock:uptimeMillis	()J
    //   25: lstore 4
    //   27: new 124	java/util/zip/ZipFile
    //   30: dup
    //   31: aload_0
    //   32: invokespecial 125	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   35: astore 7
    //   37: aload 7
    //   39: astore_0
    //   40: getstatic 34	org/xwalk/core/XWalkDecompressor:MANDATORY_RESOURCES	[Ljava/lang/String;
    //   43: astore 8
    //   45: aload 7
    //   47: astore_0
    //   48: aload 8
    //   50: arraylength
    //   51: istore_3
    //   52: iconst_0
    //   53: istore_2
    //   54: iload_2
    //   55: iload_3
    //   56: if_icmpge +272 -> 328
    //   59: aload 8
    //   61: iload_2
    //   62: aaload
    //   63: astore 9
    //   65: aload 7
    //   67: astore_0
    //   68: aload 9
    //   70: invokestatic 264	org/xwalk/core/XWalkDecompressor:isNativeLibrary	(Ljava/lang/String;)Z
    //   73: ifeq +90 -> 163
    //   76: aload 7
    //   78: astore_0
    //   79: aload 7
    //   81: new 44	java/lang/StringBuilder
    //   84: dup
    //   85: ldc_w 266
    //   88: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   91: getstatic 269	java/io/File:separator	Ljava/lang/String;
    //   94: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: ldc_w 271
    //   100: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: getstatic 269	java/io/File:separator	Ljava/lang/String;
    //   106: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: aload 9
    //   111: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   117: invokevirtual 275	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   120: astore 6
    //   122: aload 6
    //   124: ifnonnull +102 -> 226
    //   127: aload 7
    //   129: astore_0
    //   130: ldc 21
    //   132: new 44	java/lang/StringBuilder
    //   135: dup
    //   136: invokespecial 276	java/lang/StringBuilder:<init>	()V
    //   139: aload 9
    //   141: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: ldc_w 278
    //   147: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokestatic 96	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   156: aload 7
    //   158: invokevirtual 190	java/util/zip/ZipFile:close	()V
    //   161: iconst_0
    //   162: ireturn
    //   163: aload 7
    //   165: astore_0
    //   166: aload 9
    //   168: invokestatic 281	org/xwalk/core/XWalkDecompressor:isAsset	(Ljava/lang/String;)Z
    //   171: ifeq +40 -> 211
    //   174: aload 7
    //   176: astore_0
    //   177: aload 7
    //   179: new 44	java/lang/StringBuilder
    //   182: dup
    //   183: ldc_w 283
    //   186: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   189: getstatic 269	java/io/File:separator	Ljava/lang/String;
    //   192: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: aload 9
    //   197: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   203: invokevirtual 275	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   206: astore 6
    //   208: goto -86 -> 122
    //   211: aload 7
    //   213: astore_0
    //   214: aload 7
    //   216: aload 9
    //   218: invokevirtual 275	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   221: astore 6
    //   223: goto -101 -> 122
    //   226: aload 7
    //   228: astore_0
    //   229: ldc 21
    //   231: new 44	java/lang/StringBuilder
    //   234: dup
    //   235: ldc_w 285
    //   238: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   241: aload 9
    //   243: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   249: invokestatic 62	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   252: aload 7
    //   254: astore_0
    //   255: new 66	java/io/File
    //   258: dup
    //   259: aload_1
    //   260: aload 9
    //   262: invokespecial 210	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   265: astore 10
    //   267: aload 7
    //   269: astore_0
    //   270: aload 10
    //   272: invokevirtual 231	java/io/File:isFile	()Z
    //   275: ifeq +23 -> 298
    //   278: aload 7
    //   280: astore_0
    //   281: aload 10
    //   283: invokevirtual 74	java/io/File:exists	()Z
    //   286: ifeq +12 -> 298
    //   289: aload 7
    //   291: astore_0
    //   292: aload 10
    //   294: invokevirtual 77	java/io/File:delete	()Z
    //   297: pop
    //   298: aload 7
    //   300: astore_0
    //   301: aload 7
    //   303: aload 6
    //   305: invokevirtual 144	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   308: new 66	java/io/File
    //   311: dup
    //   312: aload_1
    //   313: aload 9
    //   315: invokespecial 210	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   318: invokestatic 288	org/xwalk/core/XWalkDecompressor:extractStreamToFile	(Ljava/io/InputStream;Ljava/io/File;)V
    //   321: iload_2
    //   322: iconst_1
    //   323: iadd
    //   324: istore_2
    //   325: goto -271 -> 54
    //   328: aload 7
    //   330: invokevirtual 190	java/util/zip/ZipFile:close	()V
    //   333: invokestatic 197	java/lang/System:gc	()V
    //   336: ldc 21
    //   338: new 44	java/lang/StringBuilder
    //   341: dup
    //   342: ldc_w 290
    //   345: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   348: invokestatic 122	android/os/SystemClock:uptimeMillis	()J
    //   351: lload 4
    //   353: lsub
    //   354: invokevirtual 202	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   357: ldc -52
    //   359: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   365: invokestatic 62	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   368: iconst_1
    //   369: ireturn
    //   370: astore 6
    //   372: aconst_null
    //   373: astore_1
    //   374: aload_1
    //   375: astore_0
    //   376: ldc 21
    //   378: new 44	java/lang/StringBuilder
    //   381: dup
    //   382: ldc_w 292
    //   385: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   388: aload 6
    //   390: invokevirtual 189	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   393: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   399: invokestatic 96	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   402: aload_1
    //   403: invokevirtual 190	java/util/zip/ZipFile:close	()V
    //   406: iconst_0
    //   407: ireturn
    //   408: astore_0
    //   409: iconst_0
    //   410: ireturn
    //   411: astore_1
    //   412: aconst_null
    //   413: astore_0
    //   414: aload_0
    //   415: invokevirtual 190	java/util/zip/ZipFile:close	()V
    //   418: aload_1
    //   419: athrow
    //   420: astore_0
    //   421: iconst_0
    //   422: ireturn
    //   423: astore_0
    //   424: iconst_0
    //   425: ireturn
    //   426: astore_0
    //   427: goto -94 -> 333
    //   430: astore_0
    //   431: goto -98 -> 333
    //   434: astore_0
    //   435: iconst_0
    //   436: ireturn
    //   437: astore_0
    //   438: goto -20 -> 418
    //   441: astore_0
    //   442: goto -24 -> 418
    //   445: astore_1
    //   446: goto -32 -> 414
    //   449: astore 6
    //   451: aload 7
    //   453: astore_1
    //   454: goto -80 -> 374
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	457	0	paramString1	String
    //   0	457	1	paramString2	String
    //   53	272	2	i	int
    //   51	6	3	j	int
    //   25	327	4	l	long
    //   120	184	6	localZipEntry	ZipEntry
    //   370	19	6	localIOException1	IOException
    //   449	1	6	localIOException2	IOException
    //   35	417	7	localZipFile	ZipFile
    //   43	17	8	arrayOfString	String[]
    //   63	251	9	str	String
    //   265	28	10	localFile	File
    // Exception table:
    //   from	to	target	type
    //   27	37	370	java/io/IOException
    //   402	406	408	java/io/IOException
    //   27	37	411	finally
    //   156	161	420	java/io/IOException
    //   156	161	423	java/lang/NullPointerException
    //   328	333	426	java/io/IOException
    //   328	333	430	java/lang/NullPointerException
    //   402	406	434	java/lang/NullPointerException
    //   414	418	437	java/io/IOException
    //   414	418	441	java/lang/NullPointerException
    //   40	45	445	finally
    //   48	52	445	finally
    //   68	76	445	finally
    //   79	122	445	finally
    //   130	156	445	finally
    //   166	174	445	finally
    //   177	208	445	finally
    //   214	223	445	finally
    //   229	252	445	finally
    //   255	267	445	finally
    //   270	278	445	finally
    //   281	289	445	finally
    //   292	298	445	finally
    //   301	321	445	finally
    //   376	402	445	finally
    //   40	45	449	java/io/IOException
    //   48	52	449	java/io/IOException
    //   68	76	449	java/io/IOException
    //   79	122	449	java/io/IOException
    //   130	156	449	java/io/IOException
    //   166	174	449	java/io/IOException
    //   177	208	449	java/io/IOException
    //   214	223	449	java/io/IOException
    //   229	252	449	java/io/IOException
    //   255	267	449	java/io/IOException
    //   270	278	449	java/io/IOException
    //   281	289	449	java/io/IOException
    //   292	298	449	java/io/IOException
    //   301	321	449	java/io/IOException
  }
  
  /* Error */
  private static void extractStreamToFile(InputStream paramInputStream, File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 295	java/io/InputStream:available	()I
    //   4: pop
    //   5: new 79	java/io/FileOutputStream
    //   8: dup
    //   9: aload_1
    //   10: invokespecial 80	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   13: astore 4
    //   15: aload 4
    //   17: astore_3
    //   18: ldc 17
    //   20: newarray <illegal type>
    //   22: astore 5
    //   24: aload 4
    //   26: astore_3
    //   27: aload_0
    //   28: aload 5
    //   30: invokevirtual 177	java/io/InputStream:read	([B)I
    //   33: istore_2
    //   34: iload_2
    //   35: iflt +59 -> 94
    //   38: aload 4
    //   40: astore_3
    //   41: aload 4
    //   43: aload 5
    //   45: iconst_0
    //   46: iload_2
    //   47: invokevirtual 180	java/io/OutputStream:write	([BII)V
    //   50: goto -26 -> 24
    //   53: astore 5
    //   55: aload 4
    //   57: astore_3
    //   58: aload_1
    //   59: invokevirtual 231	java/io/File:isFile	()Z
    //   62: ifeq +11 -> 73
    //   65: aload 4
    //   67: astore_3
    //   68: aload_1
    //   69: invokevirtual 77	java/io/File:delete	()Z
    //   72: pop
    //   73: aload 4
    //   75: astore_3
    //   76: aload 5
    //   78: athrow
    //   79: astore_1
    //   80: aload_3
    //   81: invokevirtual 234	java/io/OutputStream:flush	()V
    //   84: aload_3
    //   85: invokevirtual 191	java/io/OutputStream:close	()V
    //   88: aload_0
    //   89: invokevirtual 192	java/io/InputStream:close	()V
    //   92: aload_1
    //   93: athrow
    //   94: aload 4
    //   96: invokevirtual 234	java/io/OutputStream:flush	()V
    //   99: aload 4
    //   101: invokevirtual 191	java/io/OutputStream:close	()V
    //   104: aload_0
    //   105: invokevirtual 192	java/io/InputStream:close	()V
    //   108: return
    //   109: astore_1
    //   110: goto -11 -> 99
    //   113: astore_1
    //   114: goto -15 -> 99
    //   117: astore_1
    //   118: goto -14 -> 104
    //   121: astore_1
    //   122: goto -18 -> 104
    //   125: astore_0
    //   126: return
    //   127: astore_0
    //   128: return
    //   129: astore 4
    //   131: goto -47 -> 84
    //   134: astore 4
    //   136: goto -52 -> 84
    //   139: astore_3
    //   140: goto -52 -> 88
    //   143: astore_3
    //   144: goto -56 -> 88
    //   147: astore_0
    //   148: goto -56 -> 92
    //   151: astore_0
    //   152: goto -60 -> 92
    //   155: astore_1
    //   156: aconst_null
    //   157: astore_3
    //   158: goto -78 -> 80
    //   161: astore 5
    //   163: aconst_null
    //   164: astore 4
    //   166: goto -111 -> 55
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	paramInputStream	InputStream
    //   0	169	1	paramFile	File
    //   33	14	2	i	int
    //   17	68	3	localFileOutputStream1	FileOutputStream
    //   139	1	3	localIOException1	IOException
    //   143	1	3	localNullPointerException1	NullPointerException
    //   157	1	3	localObject1	Object
    //   13	87	4	localFileOutputStream2	FileOutputStream
    //   129	1	4	localIOException2	IOException
    //   134	1	4	localNullPointerException2	NullPointerException
    //   164	1	4	localObject2	Object
    //   22	22	5	arrayOfByte	byte[]
    //   53	24	5	localIOException3	IOException
    //   161	1	5	localIOException4	IOException
    // Exception table:
    //   from	to	target	type
    //   18	24	53	java/io/IOException
    //   27	34	53	java/io/IOException
    //   41	50	53	java/io/IOException
    //   18	24	79	finally
    //   27	34	79	finally
    //   41	50	79	finally
    //   58	65	79	finally
    //   68	73	79	finally
    //   76	79	79	finally
    //   94	99	109	java/io/IOException
    //   94	99	113	java/lang/NullPointerException
    //   99	104	117	java/io/IOException
    //   99	104	121	java/lang/NullPointerException
    //   104	108	125	java/io/IOException
    //   104	108	127	java/lang/NullPointerException
    //   80	84	129	java/io/IOException
    //   80	84	134	java/lang/NullPointerException
    //   84	88	139	java/io/IOException
    //   84	88	143	java/lang/NullPointerException
    //   88	92	147	java/io/IOException
    //   88	92	151	java/lang/NullPointerException
    //   0	15	155	finally
    //   0	15	161	java/io/IOException
  }
  
  private static boolean isAsset(String paramString)
  {
    return (paramString.endsWith(".dat")) || (paramString.endsWith(".pak"));
  }
  
  private static boolean isNativeLibrary(String paramString)
  {
    return paramString.endsWith(".so");
  }
  
  private static InputStream openRawResource(String paramString)
  {
    Context localContext = XWalkEnvironment.getApplicationContext();
    Resources localResources = localContext.getResources();
    return localResources.openRawResource(localResources.getIdentifier(paramString.split("\\.")[0], "raw", localContext.getPackageName()));
  }
  
  private static class DecompressResourceTask
    implements Callable<Boolean>
  {
    File mDestFile;
    ZipEntry mZipEntry;
    ZipFile mZipFile;
    
    DecompressResourceTask(ZipFile paramZipFile, ZipEntry paramZipEntry, File paramFile)
    {
      this.mZipFile = paramZipFile;
      this.mZipEntry = paramZipEntry;
      this.mDestFile = paramFile;
    }
    
    public Boolean call()
    {
      try
      {
        Log.d("XWalkLib", "Decompressing " + this.mZipEntry.getName());
        XWalkDecompressor.extractLzmaToFile(this.mZipFile.getInputStream(this.mZipEntry), this.mDestFile);
        return Boolean.valueOf(true);
      }
      catch (IOException localIOException)
      {
        Log.e("XWalkLib", localIOException.getLocalizedMessage());
      }
      return Boolean.valueOf(false);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\org\xwalk\core\XWalkDecompressor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.pluginsdk.l;

import android.webkit.MimeTypeMap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class d
{
  private static String OV(String paramString)
  {
    GMTrace.i(19000801099776L, 141567);
    if (bg.nm(paramString))
    {
      GMTrace.o(19000801099776L, 141567);
      return "";
    }
    String str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(paramString);
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      paramString = paramString.split("/");
      str1 = str2;
      if (paramString != null)
      {
        str1 = str2;
        if (paramString.length > 1) {
          str1 = paramString[1];
        }
      }
    }
    paramString = "." + str1;
    GMTrace.o(19000801099776L, 141567);
    return paramString;
  }
  
  /* Error */
  public static final String a(android.content.ContentResolver paramContentResolver, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: ldc2_w 69
    //   3: ldc 71
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: ifnonnull +13 -> 22
    //   12: ldc2_w 69
    //   15: ldc 71
    //   17: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   20: aconst_null
    //   21: areturn
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual 77	android/content/ContentResolver:getType	(Landroid/net/Uri;)Ljava/lang/String;
    //   27: astore 5
    //   29: aload_0
    //   30: aload_1
    //   31: invokestatic 80	com/tencent/mm/pluginsdk/l/d:b	(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;
    //   34: astore 4
    //   36: aload 4
    //   38: astore_3
    //   39: aload 4
    //   41: invokestatic 21	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   44: ifeq +24 -> 68
    //   47: new 49	java/lang/StringBuilder
    //   50: dup
    //   51: ldc 82
    //   53: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   56: aload 5
    //   58: invokestatic 84	com/tencent/mm/pluginsdk/l/d:OV	(Ljava/lang/String;)Ljava/lang/String;
    //   61: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: astore_3
    //   68: new 86	java/io/File
    //   71: dup
    //   72: getstatic 92	com/tencent/mm/compatible/util/e:fRX	Ljava/lang/String;
    //   75: aload_3
    //   76: invokespecial 95	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: astore 5
    //   81: aload 5
    //   83: invokevirtual 98	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   86: invokestatic 103	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
    //   89: ifeq +12 -> 101
    //   92: aload 5
    //   94: invokevirtual 98	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   97: invokestatic 106	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   100: pop
    //   101: new 108	java/io/FileOutputStream
    //   104: dup
    //   105: aload 5
    //   107: invokespecial 111	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   110: astore_3
    //   111: aload_0
    //   112: aload_1
    //   113: invokevirtual 115	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   116: astore_0
    //   117: aload_0
    //   118: ifnonnull +21 -> 139
    //   121: aload_0
    //   122: invokestatic 120	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   125: aload_3
    //   126: invokestatic 123	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
    //   129: ldc2_w 69
    //   132: ldc 71
    //   134: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   137: aconst_null
    //   138: areturn
    //   139: aload_0
    //   140: astore 4
    //   142: aload_3
    //   143: astore_1
    //   144: sipush 1024
    //   147: newarray <illegal type>
    //   149: astore 6
    //   151: aload_0
    //   152: astore 4
    //   154: aload_3
    //   155: astore_1
    //   156: aload_0
    //   157: aload 6
    //   159: invokevirtual 129	java/io/InputStream:read	([B)I
    //   162: istore_2
    //   163: iload_2
    //   164: ifle +57 -> 221
    //   167: aload_0
    //   168: astore 4
    //   170: aload_3
    //   171: astore_1
    //   172: aload_3
    //   173: aload 6
    //   175: iconst_0
    //   176: iload_2
    //   177: invokevirtual 133	java/io/FileOutputStream:write	([BII)V
    //   180: goto -29 -> 151
    //   183: astore 5
    //   185: aload_0
    //   186: astore 4
    //   188: aload_3
    //   189: astore_1
    //   190: ldc -121
    //   192: aload 5
    //   194: ldc -119
    //   196: iconst_0
    //   197: anewarray 4	java/lang/Object
    //   200: invokestatic 143	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: aload_0
    //   204: invokestatic 120	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   207: aload_3
    //   208: invokestatic 123	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
    //   211: ldc2_w 69
    //   214: ldc 71
    //   216: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   219: aconst_null
    //   220: areturn
    //   221: aload_0
    //   222: astore 4
    //   224: aload_3
    //   225: astore_1
    //   226: aload 5
    //   228: invokevirtual 98	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   231: astore 5
    //   233: aload_0
    //   234: invokestatic 120	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   237: aload_3
    //   238: invokestatic 123	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
    //   241: ldc2_w 69
    //   244: ldc 71
    //   246: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   249: aload 5
    //   251: areturn
    //   252: astore_0
    //   253: aconst_null
    //   254: astore 4
    //   256: aconst_null
    //   257: astore_1
    //   258: aload 4
    //   260: invokestatic 120	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   263: aload_1
    //   264: invokestatic 123	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
    //   267: aload_0
    //   268: athrow
    //   269: astore_0
    //   270: aconst_null
    //   271: astore 4
    //   273: aload_3
    //   274: astore_1
    //   275: goto -17 -> 258
    //   278: astore_0
    //   279: goto -21 -> 258
    //   282: astore 5
    //   284: aconst_null
    //   285: astore_0
    //   286: aconst_null
    //   287: astore_3
    //   288: goto -103 -> 185
    //   291: astore 5
    //   293: aconst_null
    //   294: astore_0
    //   295: goto -110 -> 185
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	298	0	paramContentResolver	android.content.ContentResolver
    //   0	298	1	paramUri	android.net.Uri
    //   162	15	2	i	int
    //   38	250	3	localObject1	Object
    //   34	238	4	localObject2	Object
    //   27	79	5	localObject3	Object
    //   183	44	5	localException1	Exception
    //   231	19	5	str	String
    //   282	1	5	localException2	Exception
    //   291	1	5	localException3	Exception
    //   149	25	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   144	151	183	java/lang/Exception
    //   156	163	183	java/lang/Exception
    //   172	180	183	java/lang/Exception
    //   226	233	183	java/lang/Exception
    //   101	111	252	finally
    //   111	117	269	finally
    //   144	151	278	finally
    //   156	163	278	finally
    //   172	180	278	finally
    //   190	203	278	finally
    //   226	233	278	finally
    //   101	111	282	java/lang/Exception
    //   111	117	291	java/lang/Exception
  }
  
  /* Error */
  public static final String a(android.content.ContentResolver paramContentResolver, android.net.Uri paramUri, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 145
    //   3: ldc -109
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: ifnonnull +13 -> 22
    //   12: ldc2_w 145
    //   15: ldc -109
    //   17: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   20: aconst_null
    //   21: areturn
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual 77	android/content/ContentResolver:getType	(Landroid/net/Uri;)Ljava/lang/String;
    //   27: astore_3
    //   28: new 86	java/io/File
    //   31: dup
    //   32: invokestatic 153	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   35: invokevirtual 159	android/content/Context:getCacheDir	()Ljava/io/File;
    //   38: new 49	java/lang/StringBuilder
    //   41: dup
    //   42: ldc -95
    //   44: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   47: iload_2
    //   48: invokevirtual 164	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   51: aload_3
    //   52: invokestatic 84	com/tencent/mm/pluginsdk/l/d:OV	(Ljava/lang/String;)Ljava/lang/String;
    //   55: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: invokespecial 167	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   64: invokevirtual 98	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   67: astore 5
    //   69: aload 5
    //   71: invokestatic 103	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
    //   74: ifeq +9 -> 83
    //   77: aload 5
    //   79: invokestatic 106	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   82: pop
    //   83: new 108	java/io/FileOutputStream
    //   86: dup
    //   87: aload 5
    //   89: invokespecial 168	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   92: astore_3
    //   93: aload_0
    //   94: aload_1
    //   95: invokevirtual 115	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   98: astore_0
    //   99: aload_0
    //   100: ifnonnull +21 -> 121
    //   103: aload_0
    //   104: invokestatic 120	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   107: aload_3
    //   108: invokestatic 123	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
    //   111: ldc2_w 145
    //   114: ldc -109
    //   116: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   119: aconst_null
    //   120: areturn
    //   121: aload_0
    //   122: astore 4
    //   124: aload_3
    //   125: astore_1
    //   126: sipush 1024
    //   129: newarray <illegal type>
    //   131: astore 6
    //   133: aload_0
    //   134: astore 4
    //   136: aload_3
    //   137: astore_1
    //   138: aload_0
    //   139: aload 6
    //   141: invokevirtual 129	java/io/InputStream:read	([B)I
    //   144: istore_2
    //   145: iload_2
    //   146: ifle +57 -> 203
    //   149: aload_0
    //   150: astore 4
    //   152: aload_3
    //   153: astore_1
    //   154: aload_3
    //   155: aload 6
    //   157: iconst_0
    //   158: iload_2
    //   159: invokevirtual 133	java/io/FileOutputStream:write	([BII)V
    //   162: goto -29 -> 133
    //   165: astore 5
    //   167: aload_0
    //   168: astore 4
    //   170: aload_3
    //   171: astore_1
    //   172: ldc -121
    //   174: aload 5
    //   176: ldc -119
    //   178: iconst_0
    //   179: anewarray 4	java/lang/Object
    //   182: invokestatic 143	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   185: aload_0
    //   186: invokestatic 120	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   189: aload_3
    //   190: invokestatic 123	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
    //   193: ldc2_w 145
    //   196: ldc -109
    //   198: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   201: aconst_null
    //   202: areturn
    //   203: aload_0
    //   204: invokestatic 120	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   207: aload_3
    //   208: invokestatic 123	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
    //   211: ldc2_w 145
    //   214: ldc -109
    //   216: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   219: aload 5
    //   221: areturn
    //   222: astore_0
    //   223: aconst_null
    //   224: astore 4
    //   226: aconst_null
    //   227: astore_1
    //   228: aload 4
    //   230: invokestatic 120	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   233: aload_1
    //   234: invokestatic 123	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
    //   237: aload_0
    //   238: athrow
    //   239: astore_0
    //   240: aconst_null
    //   241: astore 4
    //   243: aload_3
    //   244: astore_1
    //   245: goto -17 -> 228
    //   248: astore_0
    //   249: goto -21 -> 228
    //   252: astore 5
    //   254: aconst_null
    //   255: astore_0
    //   256: aconst_null
    //   257: astore_3
    //   258: goto -91 -> 167
    //   261: astore 5
    //   263: aconst_null
    //   264: astore_0
    //   265: goto -98 -> 167
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	268	0	paramContentResolver	android.content.ContentResolver
    //   0	268	1	paramUri	android.net.Uri
    //   0	268	2	paramInt	int
    //   27	231	3	localObject	Object
    //   122	120	4	localContentResolver	android.content.ContentResolver
    //   67	21	5	str	String
    //   165	55	5	localException1	Exception
    //   252	1	5	localException2	Exception
    //   261	1	5	localException3	Exception
    //   131	25	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   126	133	165	java/lang/Exception
    //   138	145	165	java/lang/Exception
    //   154	162	165	java/lang/Exception
    //   83	93	222	finally
    //   93	99	239	finally
    //   126	133	248	finally
    //   138	145	248	finally
    //   154	162	248	finally
    //   172	185	248	finally
    //   83	93	252	java/lang/Exception
    //   93	99	261	java/lang/Exception
  }
  
  /* Error */
  private static String b(android.content.ContentResolver paramContentResolver, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: ldc2_w 169
    //   3: ldc -85
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: aload_1
    //   10: iconst_1
    //   11: anewarray 37	java/lang/String
    //   14: dup
    //   15: iconst_0
    //   16: ldc -83
    //   18: aastore
    //   19: aconst_null
    //   20: aconst_null
    //   21: aconst_null
    //   22: invokevirtual 177	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   25: astore_0
    //   26: aload_0
    //   27: ifnull +163 -> 190
    //   30: aload_0
    //   31: astore_2
    //   32: aload_0
    //   33: invokeinterface 183 1 0
    //   38: ifeq +152 -> 190
    //   41: aload_0
    //   42: astore_2
    //   43: new 86	java/io/File
    //   46: dup
    //   47: aload_0
    //   48: iconst_0
    //   49: invokeinterface 187 2 0
    //   54: invokespecial 188	java/io/File:<init>	(Ljava/lang/String;)V
    //   57: invokevirtual 191	java/io/File:getName	()Ljava/lang/String;
    //   60: astore_3
    //   61: aload_3
    //   62: astore_1
    //   63: aload_1
    //   64: astore_2
    //   65: aload_0
    //   66: ifnull +11 -> 77
    //   69: aload_0
    //   70: invokeinterface 195 1 0
    //   75: aload_1
    //   76: astore_2
    //   77: ldc2_w 169
    //   80: ldc -85
    //   82: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   85: aload_2
    //   86: areturn
    //   87: astore_3
    //   88: aconst_null
    //   89: astore_0
    //   90: aload_0
    //   91: astore_2
    //   92: ldc -121
    //   94: aload_3
    //   95: ldc -59
    //   97: iconst_0
    //   98: anewarray 4	java/lang/Object
    //   101: invokestatic 143	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   104: aload_0
    //   105: astore_2
    //   106: aload_1
    //   107: invokevirtual 200	android/net/Uri:toString	()Ljava/lang/String;
    //   110: ldc -54
    //   112: invokestatic 208	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   115: ldc 43
    //   117: invokevirtual 47	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   120: astore_1
    //   121: aload_0
    //   122: astore_2
    //   123: aload_1
    //   124: aload_1
    //   125: arraylength
    //   126: iconst_1
    //   127: isub
    //   128: aaload
    //   129: astore_1
    //   130: aload_1
    //   131: astore_2
    //   132: aload_0
    //   133: ifnull -56 -> 77
    //   136: aload_0
    //   137: invokeinterface 195 1 0
    //   142: aload_1
    //   143: astore_2
    //   144: goto -67 -> 77
    //   147: astore_1
    //   148: aload_0
    //   149: astore_2
    //   150: ldc -121
    //   152: aload_1
    //   153: ldc -46
    //   155: iconst_0
    //   156: anewarray 4	java/lang/Object
    //   159: invokestatic 143	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   162: aconst_null
    //   163: astore_1
    //   164: goto -34 -> 130
    //   167: astore_0
    //   168: aconst_null
    //   169: astore_2
    //   170: aload_2
    //   171: ifnull +9 -> 180
    //   174: aload_2
    //   175: invokeinterface 195 1 0
    //   180: aload_0
    //   181: athrow
    //   182: astore_0
    //   183: goto -13 -> 170
    //   186: astore_3
    //   187: goto -97 -> 90
    //   190: aconst_null
    //   191: astore_1
    //   192: goto -129 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	195	0	paramContentResolver	android.content.ContentResolver
    //   0	195	1	paramUri	android.net.Uri
    //   31	144	2	localObject	Object
    //   60	2	3	str	String
    //   87	8	3	localException1	Exception
    //   186	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   8	26	87	java/lang/Exception
    //   106	121	147	java/lang/Exception
    //   123	130	147	java/lang/Exception
    //   8	26	167	finally
    //   32	41	182	finally
    //   43	61	182	finally
    //   92	104	182	finally
    //   106	121	182	finally
    //   123	130	182	finally
    //   150	162	182	finally
    //   32	41	186	java/lang/Exception
    //   43	61	186	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\l\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
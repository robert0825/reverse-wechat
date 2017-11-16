package com.tencent.mapsdk.rastercore.tile;

import java.util.Locale;

public final class c
{
  private static String a = Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
  
  /* Error */
  public static byte[] a(java.net.URL paramURL)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 4
    //   6: aload_0
    //   7: ifnonnull +5 -> 12
    //   10: aconst_null
    //   11: areturn
    //   12: invokestatic 46	android/net/Proxy:getDefaultHost	()Ljava/lang/String;
    //   15: ifnull +506 -> 521
    //   18: new 48	java/net/Proxy
    //   21: dup
    //   22: getstatic 54	java/net/Proxy$Type:HTTP	Ljava/net/Proxy$Type;
    //   25: new 56	java/net/InetSocketAddress
    //   28: dup
    //   29: invokestatic 46	android/net/Proxy:getDefaultHost	()Ljava/lang/String;
    //   32: invokestatic 60	android/net/Proxy:getDefaultPort	()I
    //   35: invokespecial 63	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   38: invokespecial 66	java/net/Proxy:<init>	(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
    //   41: astore_1
    //   42: aload_1
    //   43: ifnull +171 -> 214
    //   46: aload_0
    //   47: aload_1
    //   48: invokevirtual 72	java/net/URL:openConnection	(Ljava/net/Proxy;)Ljava/net/URLConnection;
    //   51: checkcast 74	java/net/HttpURLConnection
    //   54: astore_0
    //   55: aload_0
    //   56: sipush 5000
    //   59: invokevirtual 78	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   62: aload_0
    //   63: sipush 15000
    //   66: invokevirtual 81	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   69: aload_0
    //   70: ldc 83
    //   72: ldc 85
    //   74: invokevirtual 89	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: aload_0
    //   78: ldc 91
    //   80: ldc 93
    //   82: invokevirtual 89	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: aload_0
    //   86: ldc 95
    //   88: getstatic 37	com/tencent/mapsdk/rastercore/tile/c:a	Ljava/lang/String;
    //   91: invokevirtual 89	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: aload_0
    //   95: invokevirtual 98	java/net/HttpURLConnection:getResponseCode	()I
    //   98: sipush 200
    //   101: if_icmpne +411 -> 512
    //   104: aload_0
    //   105: invokevirtual 102	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   108: astore_1
    //   109: aload_0
    //   110: invokevirtual 105	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
    //   113: invokevirtual 110	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   116: invokevirtual 113	java/lang/String:trim	()Ljava/lang/String;
    //   119: ldc 115
    //   121: invokevirtual 119	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   124: ifeq +101 -> 225
    //   127: new 121	java/io/InputStreamReader
    //   130: dup
    //   131: aload_1
    //   132: invokespecial 124	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   135: astore_3
    //   136: new 126	java/io/BufferedReader
    //   139: dup
    //   140: aload_3
    //   141: invokespecial 129	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   144: astore 4
    //   146: aload 4
    //   148: invokevirtual 132	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   151: invokevirtual 110	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   154: invokevirtual 113	java/lang/String:trim	()Ljava/lang/String;
    //   157: astore_2
    //   158: aload_2
    //   159: ifnull +348 -> 507
    //   162: aload_2
    //   163: ldc -122
    //   165: invokevirtual 138	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   168: ifeq +339 -> 507
    //   171: iconst_1
    //   172: newarray <illegal type>
    //   174: astore_2
    //   175: aload_2
    //   176: iconst_0
    //   177: iconst_m1
    //   178: bastore
    //   179: aload_2
    //   180: astore 5
    //   182: aload_1
    //   183: astore_2
    //   184: aload 4
    //   186: astore_1
    //   187: aload 5
    //   189: astore 4
    //   191: aload_0
    //   192: ifnull +7 -> 199
    //   195: aload_0
    //   196: invokevirtual 141	java/net/HttpURLConnection:disconnect	()V
    //   199: aload_1
    //   200: invokestatic 146	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
    //   203: aload_3
    //   204: invokestatic 146	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
    //   207: aload_2
    //   208: invokestatic 146	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
    //   211: aload 4
    //   213: areturn
    //   214: aload_0
    //   215: invokevirtual 149	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   218: checkcast 74	java/net/HttpURLConnection
    //   221: astore_0
    //   222: goto -167 -> 55
    //   225: ldc -105
    //   227: aload_0
    //   228: ldc -103
    //   230: invokevirtual 157	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   233: invokevirtual 161	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   236: ifeq +268 -> 504
    //   239: new 163	java/util/zip/GZIPInputStream
    //   242: dup
    //   243: aload_1
    //   244: invokespecial 164	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   247: astore_2
    //   248: aload_2
    //   249: astore_1
    //   250: aload_1
    //   251: invokestatic 167	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/InputStream;)[B
    //   254: astore 6
    //   256: aload 6
    //   258: iconst_0
    //   259: aload 6
    //   261: arraylength
    //   262: invokestatic 173	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   265: pop
    //   266: aconst_null
    //   267: astore_3
    //   268: aload_1
    //   269: astore_2
    //   270: aconst_null
    //   271: astore_1
    //   272: aload 6
    //   274: astore 4
    //   276: goto -85 -> 191
    //   279: astore_2
    //   280: new 10	java/lang/StringBuilder
    //   283: dup
    //   284: ldc -81
    //   286: invokespecial 178	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   289: aload_2
    //   290: invokevirtual 181	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   293: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: pop
    //   297: aconst_null
    //   298: astore_3
    //   299: aload_1
    //   300: astore_2
    //   301: aconst_null
    //   302: astore_1
    //   303: goto -112 -> 191
    //   306: astore_0
    //   307: aconst_null
    //   308: astore_0
    //   309: aconst_null
    //   310: astore_1
    //   311: aconst_null
    //   312: astore_2
    //   313: aconst_null
    //   314: astore_3
    //   315: aload_3
    //   316: ifnull +7 -> 323
    //   319: aload_3
    //   320: invokevirtual 141	java/net/HttpURLConnection:disconnect	()V
    //   323: aload_0
    //   324: invokestatic 146	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
    //   327: aload_1
    //   328: invokestatic 146	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
    //   331: aload_2
    //   332: invokestatic 146	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
    //   335: aconst_null
    //   336: areturn
    //   337: astore_2
    //   338: aconst_null
    //   339: astore_3
    //   340: aconst_null
    //   341: astore_1
    //   342: aconst_null
    //   343: astore_0
    //   344: aload 5
    //   346: astore 4
    //   348: aload_0
    //   349: ifnull +7 -> 356
    //   352: aload_0
    //   353: invokevirtual 141	java/net/HttpURLConnection:disconnect	()V
    //   356: aload 4
    //   358: invokestatic 146	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
    //   361: aload_3
    //   362: invokestatic 146	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
    //   365: aload_1
    //   366: invokestatic 146	com/tencent/mapsdk/rastercore/d$a:a	(Ljava/io/Closeable;)V
    //   369: aload_2
    //   370: athrow
    //   371: astore_2
    //   372: aconst_null
    //   373: astore_3
    //   374: aconst_null
    //   375: astore_1
    //   376: aload 5
    //   378: astore 4
    //   380: goto -32 -> 348
    //   383: astore_2
    //   384: aconst_null
    //   385: astore_3
    //   386: aload 5
    //   388: astore 4
    //   390: goto -42 -> 348
    //   393: astore_2
    //   394: aload 5
    //   396: astore 4
    //   398: goto -50 -> 348
    //   401: astore_2
    //   402: goto -54 -> 348
    //   405: astore_2
    //   406: aconst_null
    //   407: astore_3
    //   408: aload 5
    //   410: astore 4
    //   412: goto -64 -> 348
    //   415: astore_1
    //   416: aconst_null
    //   417: astore 4
    //   419: aconst_null
    //   420: astore_1
    //   421: aconst_null
    //   422: astore_2
    //   423: aload_0
    //   424: astore_3
    //   425: aload 4
    //   427: astore_0
    //   428: goto -113 -> 315
    //   431: astore_2
    //   432: aconst_null
    //   433: astore 5
    //   435: aconst_null
    //   436: astore 4
    //   438: aload_1
    //   439: astore_2
    //   440: aload_0
    //   441: astore_3
    //   442: aload 5
    //   444: astore_0
    //   445: aload 4
    //   447: astore_1
    //   448: goto -133 -> 315
    //   451: astore_2
    //   452: aconst_null
    //   453: astore 5
    //   455: aload_1
    //   456: astore_2
    //   457: aload_0
    //   458: astore 4
    //   460: aload 5
    //   462: astore_0
    //   463: aload_3
    //   464: astore_1
    //   465: aload 4
    //   467: astore_3
    //   468: goto -153 -> 315
    //   471: astore_2
    //   472: aload_1
    //   473: astore_2
    //   474: aload_0
    //   475: astore 5
    //   477: aload 4
    //   479: astore_0
    //   480: aload_3
    //   481: astore_1
    //   482: aload 5
    //   484: astore_3
    //   485: goto -170 -> 315
    //   488: astore_2
    //   489: aconst_null
    //   490: astore 4
    //   492: aload_1
    //   493: astore_2
    //   494: aload_0
    //   495: astore_3
    //   496: aconst_null
    //   497: astore_1
    //   498: aload 4
    //   500: astore_0
    //   501: goto -186 -> 315
    //   504: goto -254 -> 250
    //   507: aconst_null
    //   508: astore_2
    //   509: goto -330 -> 179
    //   512: aconst_null
    //   513: astore_1
    //   514: aconst_null
    //   515: astore_3
    //   516: aconst_null
    //   517: astore_2
    //   518: goto -327 -> 191
    //   521: aconst_null
    //   522: astore_1
    //   523: goto -481 -> 42
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	526	0	paramURL	java.net.URL
    //   41	335	1	localObject1	Object
    //   415	1	1	localException1	Exception
    //   420	103	1	localObject2	Object
    //   157	113	2	localObject3	Object
    //   279	11	2	localException2	Exception
    //   300	32	2	localObject4	Object
    //   337	33	2	localObject5	Object
    //   371	1	2	localObject6	Object
    //   383	1	2	localObject7	Object
    //   393	1	2	localObject8	Object
    //   401	1	2	localObject9	Object
    //   405	1	2	localObject10	Object
    //   422	1	2	localObject11	Object
    //   431	1	2	localException3	Exception
    //   439	1	2	localObject12	Object
    //   451	1	2	localException4	Exception
    //   456	1	2	localObject13	Object
    //   471	1	2	localException5	Exception
    //   473	1	2	localObject14	Object
    //   488	1	2	localException6	Exception
    //   493	25	2	localObject15	Object
    //   135	381	3	localObject16	Object
    //   4	495	4	localObject17	Object
    //   1	482	5	localObject18	Object
    //   254	19	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   256	266	279	java/lang/Exception
    //   12	42	306	java/lang/Exception
    //   46	55	306	java/lang/Exception
    //   214	222	306	java/lang/Exception
    //   12	42	337	finally
    //   46	55	337	finally
    //   214	222	337	finally
    //   55	109	371	finally
    //   109	136	383	finally
    //   225	248	383	finally
    //   136	146	393	finally
    //   146	158	401	finally
    //   162	175	401	finally
    //   250	256	405	finally
    //   256	266	405	finally
    //   280	297	405	finally
    //   55	109	415	java/lang/Exception
    //   109	136	431	java/lang/Exception
    //   225	248	431	java/lang/Exception
    //   136	146	451	java/lang/Exception
    //   146	158	471	java/lang/Exception
    //   162	175	471	java/lang/Exception
    //   250	256	488	java/lang/Exception
    //   280	297	488	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
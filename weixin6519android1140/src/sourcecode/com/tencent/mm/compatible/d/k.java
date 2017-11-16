package com.tencent.mm.compatible.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import java.util.Map;

public final class k
{
  private static k fQk;
  private boolean fQj;
  private String filePath;
  private Map<Integer, Object> values;
  
  static
  {
    GMTrace.i(13800401010688L, 102821);
    fQk = null;
    GMTrace.o(13800401010688L, 102821);
  }
  
  /* Error */
  private k(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: invokespecial 38	java/lang/Object:<init>	()V
    //   9: ldc2_w 39
    //   12: ldc 41
    //   14: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   17: aload_0
    //   18: iconst_0
    //   19: putfield 43	com/tencent/mm/compatible/d/k:fQj	Z
    //   22: aload_0
    //   23: ldc 45
    //   25: putfield 47	com/tencent/mm/compatible/d/k:filePath	Ljava/lang/String;
    //   28: aload_0
    //   29: aload_1
    //   30: putfield 47	com/tencent/mm/compatible/d/k:filePath	Ljava/lang/String;
    //   33: new 49	java/io/File
    //   36: dup
    //   37: aload_0
    //   38: getfield 47	com/tencent/mm/compatible/d/k:filePath	Ljava/lang/String;
    //   41: invokespecial 51	java/io/File:<init>	(Ljava/lang/String;)V
    //   44: astore_1
    //   45: aload_1
    //   46: invokevirtual 55	java/io/File:exists	()Z
    //   49: ifne +8 -> 57
    //   52: aload_1
    //   53: invokevirtual 58	java/io/File:createNewFile	()Z
    //   56: pop
    //   57: aload_1
    //   58: invokevirtual 62	java/io/File:length	()J
    //   61: lconst_0
    //   62: lcmp
    //   63: ifne +28 -> 91
    //   66: aload_0
    //   67: new 64	java/util/HashMap
    //   70: dup
    //   71: invokespecial 65	java/util/HashMap:<init>	()V
    //   74: putfield 67	com/tencent/mm/compatible/d/k:values	Ljava/util/Map;
    //   77: aload_0
    //   78: iconst_0
    //   79: putfield 43	com/tencent/mm/compatible/d/k:fQj	Z
    //   82: ldc2_w 39
    //   85: ldc 41
    //   87: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   90: return
    //   91: new 69	java/io/FileInputStream
    //   94: dup
    //   95: aload_1
    //   96: invokespecial 72	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   99: astore_2
    //   100: new 74	java/io/ObjectInputStream
    //   103: dup
    //   104: aload_2
    //   105: invokespecial 77	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   108: astore_1
    //   109: aload_0
    //   110: aload_1
    //   111: invokevirtual 81	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   114: checkcast 83	java/util/Map
    //   117: putfield 67	com/tencent/mm/compatible/d/k:values	Ljava/util/Map;
    //   120: aload_1
    //   121: invokevirtual 86	java/io/ObjectInputStream:close	()V
    //   124: aload_2
    //   125: invokevirtual 87	java/io/FileInputStream:close	()V
    //   128: aload_2
    //   129: invokevirtual 87	java/io/FileInputStream:close	()V
    //   132: aload_1
    //   133: invokevirtual 86	java/io/ObjectInputStream:close	()V
    //   136: goto -59 -> 77
    //   139: astore_1
    //   140: ldc 89
    //   142: aload_1
    //   143: ldc 45
    //   145: iconst_0
    //   146: anewarray 4	java/lang/Object
    //   149: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   152: goto -75 -> 77
    //   155: astore_2
    //   156: ldc 89
    //   158: aload_2
    //   159: ldc 45
    //   161: iconst_0
    //   162: anewarray 4	java/lang/Object
    //   165: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   168: goto -36 -> 132
    //   171: astore_3
    //   172: aconst_null
    //   173: astore_1
    //   174: aload 4
    //   176: astore_2
    //   177: aload_0
    //   178: new 64	java/util/HashMap
    //   181: dup
    //   182: invokespecial 65	java/util/HashMap:<init>	()V
    //   185: putfield 67	com/tencent/mm/compatible/d/k:values	Ljava/util/Map;
    //   188: ldc 89
    //   190: aload_3
    //   191: ldc 45
    //   193: iconst_0
    //   194: anewarray 4	java/lang/Object
    //   197: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: aload_1
    //   201: ifnull +7 -> 208
    //   204: aload_1
    //   205: invokevirtual 87	java/io/FileInputStream:close	()V
    //   208: aload_2
    //   209: ifnull -132 -> 77
    //   212: aload_2
    //   213: invokevirtual 86	java/io/ObjectInputStream:close	()V
    //   216: goto -139 -> 77
    //   219: astore_1
    //   220: ldc 89
    //   222: aload_1
    //   223: ldc 45
    //   225: iconst_0
    //   226: anewarray 4	java/lang/Object
    //   229: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   232: goto -155 -> 77
    //   235: astore_1
    //   236: ldc 89
    //   238: aload_1
    //   239: ldc 45
    //   241: iconst_0
    //   242: anewarray 4	java/lang/Object
    //   245: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   248: goto -40 -> 208
    //   251: astore_1
    //   252: aconst_null
    //   253: astore_2
    //   254: aload_2
    //   255: ifnull +7 -> 262
    //   258: aload_2
    //   259: invokevirtual 87	java/io/FileInputStream:close	()V
    //   262: aload_3
    //   263: ifnull +7 -> 270
    //   266: aload_3
    //   267: invokevirtual 86	java/io/ObjectInputStream:close	()V
    //   270: aload_1
    //   271: athrow
    //   272: astore_2
    //   273: ldc 89
    //   275: aload_2
    //   276: ldc 45
    //   278: iconst_0
    //   279: anewarray 4	java/lang/Object
    //   282: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   285: goto -23 -> 262
    //   288: astore_2
    //   289: ldc 89
    //   291: aload_2
    //   292: ldc 45
    //   294: iconst_0
    //   295: anewarray 4	java/lang/Object
    //   298: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   301: goto -31 -> 270
    //   304: astore_1
    //   305: goto -51 -> 254
    //   308: astore 4
    //   310: aload_1
    //   311: astore_3
    //   312: aload 4
    //   314: astore_1
    //   315: goto -61 -> 254
    //   318: astore_3
    //   319: aload_1
    //   320: astore 4
    //   322: aload_3
    //   323: astore_1
    //   324: aload_2
    //   325: astore_3
    //   326: aload 4
    //   328: astore_2
    //   329: goto -75 -> 254
    //   332: astore_3
    //   333: aload_2
    //   334: astore_1
    //   335: aload 4
    //   337: astore_2
    //   338: goto -161 -> 177
    //   341: astore_3
    //   342: aload_2
    //   343: astore 4
    //   345: aload_1
    //   346: astore_2
    //   347: aload 4
    //   349: astore_1
    //   350: goto -173 -> 177
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	353	0	this	k
    //   0	353	1	paramString	String
    //   99	30	2	localFileInputStream	java.io.FileInputStream
    //   155	4	2	localIOException1	java.io.IOException
    //   176	83	2	localObject1	Object
    //   272	4	2	localIOException2	java.io.IOException
    //   288	37	2	localIOException3	java.io.IOException
    //   328	19	2	localObject2	Object
    //   1	1	3	localObject3	Object
    //   171	96	3	localException1	Exception
    //   311	1	3	str	String
    //   318	5	3	localObject4	Object
    //   325	1	3	localObject5	Object
    //   332	1	3	localException2	Exception
    //   341	1	3	localException3	Exception
    //   3	172	4	localObject6	Object
    //   308	5	4	localObject7	Object
    //   320	28	4	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   132	136	139	java/io/IOException
    //   128	132	155	java/io/IOException
    //   33	57	171	java/lang/Exception
    //   57	77	171	java/lang/Exception
    //   91	100	171	java/lang/Exception
    //   212	216	219	java/io/IOException
    //   204	208	235	java/io/IOException
    //   33	57	251	finally
    //   57	77	251	finally
    //   91	100	251	finally
    //   258	262	272	java/io/IOException
    //   266	270	288	java/io/IOException
    //   100	109	304	finally
    //   109	128	308	finally
    //   177	200	318	finally
    //   100	109	332	java/lang/Exception
    //   109	128	341	java/lang/Exception
  }
  
  public static k sI()
  {
    try
    {
      GMTrace.i(13799595704320L, 102815);
      if (fQk == null) {
        fQk = new k(e.ghv + "CompatibleInfo.cfg");
      }
      k localk = fQk;
      GMTrace.o(13799595704320L, 102815);
      return localk;
    }
    finally {}
  }
  
  /* Error */
  private void sJ()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc2_w 121
    //   7: ldc 123
    //   9: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: new 125	java/io/FileOutputStream
    //   15: dup
    //   16: aload_0
    //   17: getfield 47	com/tencent/mm/compatible/d/k:filePath	Ljava/lang/String;
    //   20: invokespecial 126	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   23: astore_3
    //   24: new 128	java/io/ObjectOutputStream
    //   27: dup
    //   28: aload_3
    //   29: invokespecial 131	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   32: astore_1
    //   33: aload_1
    //   34: aload_0
    //   35: getfield 67	com/tencent/mm/compatible/d/k:values	Ljava/util/Map;
    //   38: invokevirtual 135	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   41: aload_1
    //   42: invokevirtual 136	java/io/ObjectOutputStream:close	()V
    //   45: aload_3
    //   46: invokevirtual 139	java/io/FileOutputStream:flush	()V
    //   49: aload_3
    //   50: invokevirtual 140	java/io/FileOutputStream:close	()V
    //   53: aload_3
    //   54: invokevirtual 140	java/io/FileOutputStream:close	()V
    //   57: aload_1
    //   58: invokevirtual 136	java/io/ObjectOutputStream:close	()V
    //   61: ldc2_w 121
    //   64: ldc 123
    //   66: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   69: aload_0
    //   70: monitorexit
    //   71: return
    //   72: astore_2
    //   73: ldc 89
    //   75: aload_2
    //   76: ldc 45
    //   78: iconst_0
    //   79: anewarray 4	java/lang/Object
    //   82: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: goto -28 -> 57
    //   88: astore_1
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_1
    //   92: athrow
    //   93: astore_1
    //   94: ldc 89
    //   96: aload_1
    //   97: ldc 45
    //   99: iconst_0
    //   100: anewarray 4	java/lang/Object
    //   103: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   106: ldc2_w 121
    //   109: ldc 123
    //   111: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   114: goto -45 -> 69
    //   117: astore_3
    //   118: aconst_null
    //   119: astore_1
    //   120: ldc 89
    //   122: aload_3
    //   123: ldc 45
    //   125: iconst_0
    //   126: anewarray 4	java/lang/Object
    //   129: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: aload_2
    //   133: ifnull +7 -> 140
    //   136: aload_2
    //   137: invokevirtual 140	java/io/FileOutputStream:close	()V
    //   140: aload_1
    //   141: ifnull +113 -> 254
    //   144: aload_1
    //   145: invokevirtual 136	java/io/ObjectOutputStream:close	()V
    //   148: ldc2_w 121
    //   151: ldc 123
    //   153: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   156: goto -87 -> 69
    //   159: astore_2
    //   160: ldc 89
    //   162: aload_2
    //   163: ldc 45
    //   165: iconst_0
    //   166: anewarray 4	java/lang/Object
    //   169: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: goto -32 -> 140
    //   175: astore_1
    //   176: ldc 89
    //   178: aload_1
    //   179: ldc 45
    //   181: iconst_0
    //   182: anewarray 4	java/lang/Object
    //   185: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   188: ldc2_w 121
    //   191: ldc 123
    //   193: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   196: goto -127 -> 69
    //   199: astore_2
    //   200: aconst_null
    //   201: astore_1
    //   202: aconst_null
    //   203: astore_3
    //   204: aload_3
    //   205: ifnull +7 -> 212
    //   208: aload_3
    //   209: invokevirtual 140	java/io/FileOutputStream:close	()V
    //   212: aload_1
    //   213: ifnull +7 -> 220
    //   216: aload_1
    //   217: invokevirtual 136	java/io/ObjectOutputStream:close	()V
    //   220: aload_2
    //   221: athrow
    //   222: astore_3
    //   223: ldc 89
    //   225: aload_3
    //   226: ldc 45
    //   228: iconst_0
    //   229: anewarray 4	java/lang/Object
    //   232: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   235: goto -23 -> 212
    //   238: astore_1
    //   239: ldc 89
    //   241: aload_1
    //   242: ldc 45
    //   244: iconst_0
    //   245: anewarray 4	java/lang/Object
    //   248: invokestatic 95	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: goto -31 -> 220
    //   254: ldc2_w 121
    //   257: ldc 123
    //   259: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   262: goto -193 -> 69
    //   265: astore_2
    //   266: aconst_null
    //   267: astore_1
    //   268: goto -64 -> 204
    //   271: astore_2
    //   272: goto -68 -> 204
    //   275: astore 4
    //   277: aload_2
    //   278: astore_3
    //   279: aload 4
    //   281: astore_2
    //   282: goto -78 -> 204
    //   285: astore 4
    //   287: aconst_null
    //   288: astore_1
    //   289: aload_3
    //   290: astore_2
    //   291: aload 4
    //   293: astore_3
    //   294: goto -174 -> 120
    //   297: astore 4
    //   299: aload_3
    //   300: astore_2
    //   301: aload 4
    //   303: astore_3
    //   304: goto -184 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	307	0	this	k
    //   32	26	1	localObjectOutputStream	java.io.ObjectOutputStream
    //   88	4	1	localObject1	Object
    //   93	4	1	localIOException1	java.io.IOException
    //   119	26	1	localObject2	Object
    //   175	4	1	localIOException2	java.io.IOException
    //   201	16	1	localObject3	Object
    //   238	4	1	localIOException3	java.io.IOException
    //   267	22	1	localObject4	Object
    //   1	1	2	localObject5	Object
    //   72	65	2	localIOException4	java.io.IOException
    //   159	4	2	localIOException5	java.io.IOException
    //   199	22	2	localObject6	Object
    //   265	1	2	localObject7	Object
    //   271	7	2	localObject8	Object
    //   281	20	2	localObject9	Object
    //   23	31	3	localFileOutputStream	java.io.FileOutputStream
    //   117	6	3	localIOException6	java.io.IOException
    //   203	6	3	localObject10	Object
    //   222	4	3	localIOException7	java.io.IOException
    //   278	26	3	localObject11	Object
    //   275	5	4	localObject12	Object
    //   285	7	4	localIOException8	java.io.IOException
    //   297	5	4	localIOException9	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   53	57	72	java/io/IOException
    //   4	12	88	finally
    //   53	57	88	finally
    //   57	61	88	finally
    //   61	69	88	finally
    //   73	85	88	finally
    //   94	114	88	finally
    //   136	140	88	finally
    //   144	148	88	finally
    //   148	156	88	finally
    //   160	172	88	finally
    //   176	196	88	finally
    //   208	212	88	finally
    //   216	220	88	finally
    //   220	222	88	finally
    //   223	235	88	finally
    //   239	251	88	finally
    //   254	262	88	finally
    //   57	61	93	java/io/IOException
    //   12	24	117	java/io/IOException
    //   136	140	159	java/io/IOException
    //   144	148	175	java/io/IOException
    //   12	24	199	finally
    //   208	212	222	java/io/IOException
    //   216	220	238	java/io/IOException
    //   24	33	265	finally
    //   33	53	271	finally
    //   120	132	275	finally
    //   24	33	285	java/io/IOException
    //   33	53	297	java/io/IOException
  }
  
  public final Object eo(int paramInt)
  {
    GMTrace.i(13800132575232L, 102819);
    Object localObject = this.values.get(Integer.valueOf(paramInt));
    if (localObject == null)
    {
      GMTrace.o(13800132575232L, 102819);
      return null;
    }
    GMTrace.o(13800132575232L, 102819);
    return localObject;
  }
  
  public final Object get(int paramInt)
  {
    GMTrace.i(13799998357504L, 102818);
    Object localObject = this.values.get(Integer.valueOf(paramInt));
    GMTrace.o(13799998357504L, 102818);
    return localObject;
  }
  
  public final void set(int paramInt, Object paramObject)
  {
    try
    {
      GMTrace.i(13799864139776L, 102817);
      this.values.put(Integer.valueOf(paramInt), paramObject);
      if (!this.fQj) {
        sJ();
      }
      GMTrace.o(13799864139776L, 102817);
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\d\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
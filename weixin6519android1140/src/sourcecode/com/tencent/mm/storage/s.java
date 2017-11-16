package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class s
{
  private boolean fQj;
  private String filePath;
  private Map<Integer, Object> values;
  public boolean vpt;
  public boolean vpu;
  
  public s(String paramString)
  {
    GMTrace.i(13537871134720L, 100865);
    this.fQj = false;
    this.filePath = "";
    this.vpt = false;
    this.vpu = false;
    if (!new File(paramString).exists()) {
      w.e("MicroMsg.ConfigFileStorage", "ConfigFileStorage not exit path[%s]", new Object[] { paramString });
    }
    this.filePath = paramString;
    bSw();
    this.fQj = false;
    GMTrace.o(13537871134720L, 100865);
  }
  
  /* Error */
  private void bSw()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: monitorenter
    //   8: ldc2_w 65
    //   11: ldc 67
    //   13: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   16: new 39	java/io/File
    //   19: dup
    //   20: aload_0
    //   21: getfield 33	com/tencent/mm/storage/s:filePath	Ljava/lang/String;
    //   24: invokespecial 41	java/io/File:<init>	(Ljava/lang/String;)V
    //   27: astore_2
    //   28: aload_2
    //   29: invokevirtual 45	java/io/File:exists	()Z
    //   32: ifne +33 -> 65
    //   35: aload_2
    //   36: invokevirtual 70	java/io/File:createNewFile	()Z
    //   39: istore_1
    //   40: ldc 47
    //   42: ldc 72
    //   44: iconst_2
    //   45: anewarray 4	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: aload_0
    //   51: getfield 33	com/tencent/mm/storage/s:filePath	Ljava/lang/String;
    //   54: aastore
    //   55: dup
    //   56: iconst_1
    //   57: iload_1
    //   58: invokestatic 78	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   61: aastore
    //   62: invokestatic 81	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   65: aload_2
    //   66: invokevirtual 85	java/io/File:length	()J
    //   69: lconst_0
    //   70: lcmp
    //   71: ifne +43 -> 114
    //   74: aload_0
    //   75: new 87	java/util/HashMap
    //   78: dup
    //   79: invokespecial 88	java/util/HashMap:<init>	()V
    //   82: putfield 90	com/tencent/mm/storage/s:values	Ljava/util/Map;
    //   85: ldc 47
    //   87: ldc 92
    //   89: iconst_1
    //   90: anewarray 4	java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: aload_0
    //   96: getfield 33	com/tencent/mm/storage/s:filePath	Ljava/lang/String;
    //   99: aastore
    //   100: invokestatic 81	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: ldc2_w 65
    //   106: ldc 67
    //   108: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   111: aload_0
    //   112: monitorexit
    //   113: return
    //   114: new 94	java/io/FileInputStream
    //   117: dup
    //   118: aload_2
    //   119: invokespecial 97	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   122: astore_3
    //   123: new 99	java/io/ObjectInputStream
    //   126: dup
    //   127: aload_3
    //   128: invokespecial 102	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   131: astore_2
    //   132: aload_0
    //   133: aload_2
    //   134: invokevirtual 106	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   137: checkcast 108	java/util/Map
    //   140: putfield 90	com/tencent/mm/storage/s:values	Ljava/util/Map;
    //   143: ldc 47
    //   145: ldc 110
    //   147: iconst_1
    //   148: anewarray 4	java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload_0
    //   154: getfield 90	com/tencent/mm/storage/s:values	Ljava/util/Map;
    //   157: invokeinterface 114 1 0
    //   162: invokestatic 119	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: aastore
    //   166: invokestatic 121	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: aload_0
    //   170: iconst_0
    //   171: putfield 35	com/tencent/mm/storage/s:vpt	Z
    //   174: aload_2
    //   175: invokevirtual 124	java/io/ObjectInputStream:close	()V
    //   178: aload_3
    //   179: invokevirtual 125	java/io/FileInputStream:close	()V
    //   182: ldc2_w 65
    //   185: ldc 67
    //   187: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   190: goto -79 -> 111
    //   193: astore_2
    //   194: aload_0
    //   195: monitorexit
    //   196: aload_2
    //   197: athrow
    //   198: astore_2
    //   199: ldc2_w 65
    //   202: ldc 67
    //   204: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   207: goto -96 -> 111
    //   210: astore 4
    //   212: aconst_null
    //   213: astore_2
    //   214: aload 5
    //   216: astore_3
    //   217: aload_0
    //   218: new 87	java/util/HashMap
    //   221: dup
    //   222: invokespecial 88	java/util/HashMap:<init>	()V
    //   225: putfield 90	com/tencent/mm/storage/s:values	Ljava/util/Map;
    //   228: ldc 47
    //   230: aload 4
    //   232: ldc 127
    //   234: iconst_0
    //   235: anewarray 4	java/lang/Object
    //   238: invokestatic 131	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   241: aload_0
    //   242: iconst_1
    //   243: putfield 35	com/tencent/mm/storage/s:vpt	Z
    //   246: aload_3
    //   247: ifnull +7 -> 254
    //   250: aload_3
    //   251: invokevirtual 124	java/io/ObjectInputStream:close	()V
    //   254: aload_2
    //   255: ifnull +7 -> 262
    //   258: aload_2
    //   259: invokevirtual 125	java/io/FileInputStream:close	()V
    //   262: ldc2_w 65
    //   265: ldc 67
    //   267: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   270: goto -159 -> 111
    //   273: astore_2
    //   274: ldc2_w 65
    //   277: ldc 67
    //   279: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   282: goto -171 -> 111
    //   285: astore_2
    //   286: aconst_null
    //   287: astore_3
    //   288: aload 4
    //   290: ifnull +8 -> 298
    //   293: aload 4
    //   295: invokevirtual 124	java/io/ObjectInputStream:close	()V
    //   298: aload_3
    //   299: ifnull +7 -> 306
    //   302: aload_3
    //   303: invokevirtual 125	java/io/FileInputStream:close	()V
    //   306: aload_2
    //   307: athrow
    //   308: astore_3
    //   309: goto -3 -> 306
    //   312: astore_2
    //   313: goto -25 -> 288
    //   316: astore 5
    //   318: aload_2
    //   319: astore 4
    //   321: aload 5
    //   323: astore_2
    //   324: goto -36 -> 288
    //   327: astore 4
    //   329: aload_2
    //   330: astore 5
    //   332: aload 4
    //   334: astore_2
    //   335: aload_3
    //   336: astore 4
    //   338: aload 5
    //   340: astore_3
    //   341: goto -53 -> 288
    //   344: astore 4
    //   346: aload_3
    //   347: astore_2
    //   348: aload 5
    //   350: astore_3
    //   351: goto -134 -> 217
    //   354: astore 4
    //   356: aload_3
    //   357: astore 5
    //   359: aload_2
    //   360: astore_3
    //   361: aload 5
    //   363: astore_2
    //   364: goto -147 -> 217
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	367	0	this	s
    //   39	19	1	bool	boolean
    //   27	148	2	localObject1	Object
    //   193	4	2	localObject2	Object
    //   198	1	2	localException1	Exception
    //   213	46	2	localObject3	Object
    //   273	1	2	localException2	Exception
    //   285	22	2	localObject4	Object
    //   312	7	2	localObject5	Object
    //   323	41	2	localObject6	Object
    //   122	181	3	localObject7	Object
    //   308	28	3	localException3	Exception
    //   340	21	3	localObject8	Object
    //   1	1	4	localObject9	Object
    //   210	84	4	localException4	Exception
    //   319	1	4	localObject10	Object
    //   327	6	4	localObject11	Object
    //   336	1	4	localObject12	Object
    //   344	1	4	localException5	Exception
    //   354	1	4	localException6	Exception
    //   4	211	5	localObject13	Object
    //   316	6	5	localObject14	Object
    //   330	32	5	localObject15	Object
    // Exception table:
    //   from	to	target	type
    //   8	16	193	finally
    //   103	111	193	finally
    //   174	182	193	finally
    //   182	190	193	finally
    //   199	207	193	finally
    //   250	254	193	finally
    //   258	262	193	finally
    //   262	270	193	finally
    //   274	282	193	finally
    //   293	298	193	finally
    //   302	306	193	finally
    //   306	308	193	finally
    //   174	182	198	java/lang/Exception
    //   16	65	210	java/lang/Exception
    //   65	103	210	java/lang/Exception
    //   114	123	210	java/lang/Exception
    //   250	254	273	java/lang/Exception
    //   258	262	273	java/lang/Exception
    //   16	65	285	finally
    //   65	103	285	finally
    //   114	123	285	finally
    //   293	298	308	java/lang/Exception
    //   302	306	308	java/lang/Exception
    //   123	132	312	finally
    //   132	174	316	finally
    //   217	246	327	finally
    //   123	132	344	java/lang/Exception
    //   132	174	354	java/lang/Exception
  }
  
  /* Error */
  private void sJ()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: monitorenter
    //   5: ldc2_w 135
    //   8: ldc -119
    //   10: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: invokestatic 142	com/tencent/mm/sdk/platformtools/bg:Pv	()J
    //   16: lstore_1
    //   17: new 144	java/io/FileOutputStream
    //   20: dup
    //   21: aload_0
    //   22: getfield 33	com/tencent/mm/storage/s:filePath	Ljava/lang/String;
    //   25: invokespecial 145	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   28: astore 5
    //   30: new 147	java/io/ObjectOutputStream
    //   33: dup
    //   34: aload 5
    //   36: invokespecial 150	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   39: astore_3
    //   40: aload_3
    //   41: aload_0
    //   42: getfield 90	com/tencent/mm/storage/s:values	Ljava/util/Map;
    //   45: invokevirtual 154	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   48: aload 5
    //   50: invokevirtual 157	java/io/FileOutputStream:flush	()V
    //   53: aload_0
    //   54: iconst_0
    //   55: putfield 37	com/tencent/mm/storage/s:vpu	Z
    //   58: ldc 47
    //   60: ldc -97
    //   62: iconst_2
    //   63: anewarray 4	java/lang/Object
    //   66: dup
    //   67: iconst_0
    //   68: aload_0
    //   69: getfield 90	com/tencent/mm/storage/s:values	Ljava/util/Map;
    //   72: invokeinterface 163 1 0
    //   77: invokeinterface 169 1 0
    //   82: arraylength
    //   83: invokestatic 119	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   86: aastore
    //   87: dup
    //   88: iconst_1
    //   89: lload_1
    //   90: invokestatic 173	com/tencent/mm/sdk/platformtools/bg:aH	(J)J
    //   93: invokestatic 178	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   96: aastore
    //   97: invokestatic 181	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   100: aload_3
    //   101: invokevirtual 182	java/io/ObjectOutputStream:close	()V
    //   104: aload 5
    //   106: invokevirtual 183	java/io/FileOutputStream:close	()V
    //   109: ldc2_w 135
    //   112: ldc -119
    //   114: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   117: aload_0
    //   118: monitorexit
    //   119: return
    //   120: astore_3
    //   121: ldc2_w 135
    //   124: ldc -119
    //   126: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   129: goto -12 -> 117
    //   132: astore_3
    //   133: aload_0
    //   134: monitorexit
    //   135: aload_3
    //   136: athrow
    //   137: astore 5
    //   139: aconst_null
    //   140: astore_3
    //   141: ldc 47
    //   143: ldc -71
    //   145: iconst_1
    //   146: anewarray 4	java/lang/Object
    //   149: dup
    //   150: iconst_0
    //   151: aload 5
    //   153: invokestatic 189	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   156: aastore
    //   157: invokestatic 55	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   160: ldc 47
    //   162: aload 5
    //   164: ldc -65
    //   166: iconst_0
    //   167: anewarray 4	java/lang/Object
    //   170: invokestatic 131	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: aload_0
    //   174: iconst_1
    //   175: putfield 37	com/tencent/mm/storage/s:vpu	Z
    //   178: aload_3
    //   179: ifnull +7 -> 186
    //   182: aload_3
    //   183: invokevirtual 182	java/io/ObjectOutputStream:close	()V
    //   186: aload 4
    //   188: ifnull +8 -> 196
    //   191: aload 4
    //   193: invokevirtual 183	java/io/FileOutputStream:close	()V
    //   196: ldc2_w 135
    //   199: ldc -119
    //   201: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   204: goto -87 -> 117
    //   207: astore_3
    //   208: ldc2_w 135
    //   211: ldc -119
    //   213: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   216: goto -99 -> 117
    //   219: astore 4
    //   221: aconst_null
    //   222: astore_3
    //   223: aconst_null
    //   224: astore 5
    //   226: aload_3
    //   227: ifnull +7 -> 234
    //   230: aload_3
    //   231: invokevirtual 182	java/io/ObjectOutputStream:close	()V
    //   234: aload 5
    //   236: ifnull +8 -> 244
    //   239: aload 5
    //   241: invokevirtual 183	java/io/FileOutputStream:close	()V
    //   244: aload 4
    //   246: athrow
    //   247: astore_3
    //   248: goto -4 -> 244
    //   251: astore 4
    //   253: aconst_null
    //   254: astore_3
    //   255: goto -29 -> 226
    //   258: astore 4
    //   260: goto -34 -> 226
    //   263: astore 6
    //   265: aload 4
    //   267: astore 5
    //   269: aload 6
    //   271: astore 4
    //   273: goto -47 -> 226
    //   276: astore 6
    //   278: aconst_null
    //   279: astore_3
    //   280: aload 5
    //   282: astore 4
    //   284: aload 6
    //   286: astore 5
    //   288: goto -147 -> 141
    //   291: astore 6
    //   293: aload 5
    //   295: astore 4
    //   297: aload 6
    //   299: astore 5
    //   301: goto -160 -> 141
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	304	0	this	s
    //   16	74	1	l	long
    //   39	62	3	localObjectOutputStream	java.io.ObjectOutputStream
    //   120	1	3	localException1	Exception
    //   132	4	3	localObject1	Object
    //   140	43	3	localObject2	Object
    //   207	1	3	localException2	Exception
    //   222	9	3	localObject3	Object
    //   247	1	3	localException3	Exception
    //   254	26	3	localObject4	Object
    //   1	191	4	localObject5	Object
    //   219	26	4	localObject6	Object
    //   251	1	4	localObject7	Object
    //   258	8	4	localObject8	Object
    //   271	25	4	localObject9	Object
    //   28	77	5	localFileOutputStream	java.io.FileOutputStream
    //   137	26	5	localIOException1	java.io.IOException
    //   224	76	5	localObject10	Object
    //   263	7	6	localObject11	Object
    //   276	9	6	localIOException2	java.io.IOException
    //   291	7	6	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   100	109	120	java/lang/Exception
    //   5	13	132	finally
    //   100	109	132	finally
    //   109	117	132	finally
    //   121	129	132	finally
    //   182	186	132	finally
    //   191	196	132	finally
    //   196	204	132	finally
    //   208	216	132	finally
    //   230	234	132	finally
    //   239	244	132	finally
    //   244	247	132	finally
    //   13	30	137	java/io/IOException
    //   182	186	207	java/lang/Exception
    //   191	196	207	java/lang/Exception
    //   13	30	219	finally
    //   230	234	247	java/lang/Exception
    //   239	244	247	java/lang/Exception
    //   30	40	251	finally
    //   40	100	258	finally
    //   141	178	263	finally
    //   30	40	276	java/io/IOException
    //   40	100	291	java/io/IOException
  }
  
  /* Error */
  public final int Ar(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 194
    //   5: ldc -60
    //   7: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: iload_1
    //   12: invokevirtual 200	com/tencent/mm/storage/s:get	(I)Ljava/lang/Object;
    //   15: checkcast 116	java/lang/Integer
    //   18: astore_2
    //   19: aload_2
    //   20: ifnonnull +17 -> 37
    //   23: iconst_0
    //   24: istore_1
    //   25: ldc2_w 194
    //   28: ldc -60
    //   30: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   33: aload_0
    //   34: monitorexit
    //   35: iload_1
    //   36: ireturn
    //   37: aload_2
    //   38: invokevirtual 203	java/lang/Integer:intValue	()I
    //   41: istore_1
    //   42: ldc2_w 194
    //   45: ldc -60
    //   47: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   50: goto -17 -> 33
    //   53: astore_2
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_2
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	s
    //   0	58	1	paramInt	int
    //   18	20	2	localInteger	Integer
    //   53	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	19	53	finally
    //   25	33	53	finally
    //   37	50	53	finally
  }
  
  public final void bPz()
  {
    try
    {
      GMTrace.i(13538408005632L, 100869);
      this.fQj = true;
      GMTrace.o(13538408005632L, 100869);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void bSv()
  {
    try
    {
      GMTrace.i(13538542223360L, 100870);
      this.fQj = false;
      sJ();
      GMTrace.o(13538542223360L, 100870);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Object get(int paramInt)
  {
    try
    {
      GMTrace.i(13538139570176L, 100867);
      Object localObject1 = this.values.get(Integer.valueOf(paramInt));
      GMTrace.o(13538139570176L, 100867);
      return localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  /* Error */
  public final Object get(int paramInt, Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 221
    //   5: ldc -33
    //   7: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 90	com/tencent/mm/storage/s:values	Ljava/util/Map;
    //   14: iload_1
    //   15: invokestatic 119	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   18: invokeinterface 219 2 0
    //   23: astore_3
    //   24: aload_3
    //   25: ifnonnull +15 -> 40
    //   28: ldc2_w 221
    //   31: ldc -33
    //   33: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: areturn
    //   40: ldc2_w 221
    //   43: ldc -33
    //   45: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   48: aload_3
    //   49: astore_2
    //   50: goto -14 -> 36
    //   53: astore_2
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_2
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	s
    //   0	58	1	paramInt	int
    //   0	58	2	paramObject	Object
    //   23	26	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	24	53	finally
    //   28	36	53	finally
    //   40	48	53	finally
  }
  
  /* Error */
  public long getLong(int paramInt, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 226
    //   5: ldc -28
    //   7: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: iload_1
    //   12: invokevirtual 200	com/tencent/mm/storage/s:get	(I)Ljava/lang/Object;
    //   15: checkcast 175	java/lang/Long
    //   18: astore 4
    //   20: aload 4
    //   22: ifnonnull +15 -> 37
    //   25: ldc2_w 226
    //   28: ldc -28
    //   30: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   33: aload_0
    //   34: monitorexit
    //   35: lload_2
    //   36: lreturn
    //   37: aload 4
    //   39: invokevirtual 231	java/lang/Long:longValue	()J
    //   42: lstore_2
    //   43: ldc2_w 226
    //   46: ldc -28
    //   48: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: goto -18 -> 33
    //   54: astore 4
    //   56: aload_0
    //   57: monitorexit
    //   58: aload 4
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	s
    //   0	61	1	paramInt	int
    //   0	61	2	paramLong	long
    //   18	20	4	localLong	Long
    //   54	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	20	54	finally
    //   25	33	54	finally
    //   37	51	54	finally
  }
  
  public final void reset()
  {
    try
    {
      GMTrace.i(16767283888128L, 124926);
      w.i("MicroMsg.ConfigFileStorage", "ConfigFileStorage reset ");
      File localFile = new File(this.filePath);
      if (localFile.exists()) {
        localFile.delete();
      }
      this.values = new HashMap();
      GMTrace.o(16767283888128L, 124926);
      return;
    }
    finally {}
  }
  
  public final void set(int paramInt, Object paramObject)
  {
    try
    {
      GMTrace.i(13538005352448L, 100866);
      this.values.put(Integer.valueOf(paramInt), paramObject);
      if (!this.fQj) {
        sJ();
      }
      GMTrace.o(13538005352448L, 100866);
      return;
    }
    finally {}
  }
  
  public final void setInt(int paramInt1, int paramInt2)
  {
    try
    {
      GMTrace.i(13538944876544L, 100873);
      set(paramInt1, Integer.valueOf(paramInt2));
      GMTrace.o(13538944876544L, 100873);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void setLong(int paramInt, long paramLong)
  {
    try
    {
      GMTrace.i(13539213312000L, 100875);
      set(paramInt, Long.valueOf(paramLong));
      GMTrace.o(13539213312000L, 100875);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
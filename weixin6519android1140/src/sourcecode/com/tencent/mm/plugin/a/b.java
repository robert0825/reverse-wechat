package com.tencent.mm.plugin.a;

import com.tencent.gmtrace.GMTrace;

public final class b
{
  public long hmQ;
  public long hmR;
  public long hmS;
  public a hmT;
  
  public b()
  {
    GMTrace.i(16390534725632L, 122119);
    this.hmQ = -1L;
    this.hmR = -1L;
    this.hmS = -1L;
    this.hmT = null;
    GMTrace.o(16390534725632L, 122119);
  }
  
  /* Error */
  private a i(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: ldc2_w 41
    //   3: ldc 43
    //   5: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: lconst_0
    //   9: lconst_0
    //   10: lcmp
    //   11: ifge +20 -> 31
    //   14: ldc 45
    //   16: ldc 47
    //   18: invokestatic 53	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: ldc2_w 41
    //   24: ldc 43
    //   26: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   29: aconst_null
    //   30: areturn
    //   31: aconst_null
    //   32: astore 8
    //   34: aload_1
    //   35: lconst_0
    //   36: invokevirtual 59	java/io/InputStream:skip	(J)J
    //   39: lstore 4
    //   41: lload 4
    //   43: lconst_0
    //   44: lcmp
    //   45: ifge +13 -> 58
    //   48: ldc2_w 41
    //   51: ldc 43
    //   53: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   56: aconst_null
    //   57: areturn
    //   58: lconst_0
    //   59: lstore 4
    //   61: bipush 8
    //   63: newarray <illegal type>
    //   65: astore 10
    //   67: aload_1
    //   68: aload 10
    //   70: iconst_0
    //   71: bipush 8
    //   73: invokevirtual 63	java/io/InputStream:read	([BII)I
    //   76: istore_2
    //   77: iload_2
    //   78: bipush 8
    //   80: if_icmplt +227 -> 307
    //   83: aload 10
    //   85: iconst_0
    //   86: invokestatic 69	com/tencent/mm/plugin/a/c:l	([BI)I
    //   89: istore_2
    //   90: aload 10
    //   92: iconst_4
    //   93: invokestatic 69	com/tencent/mm/plugin/a/c:l	([BI)I
    //   96: istore_3
    //   97: lconst_0
    //   98: lstore 6
    //   100: iload_2
    //   101: iconst_1
    //   102: if_icmpne +24 -> 126
    //   105: aload_1
    //   106: aload 10
    //   108: iconst_0
    //   109: bipush 8
    //   111: invokevirtual 63	java/io/InputStream:read	([BII)I
    //   114: bipush 8
    //   116: if_icmplt +191 -> 307
    //   119: aload 10
    //   121: invokestatic 72	com/tencent/mm/plugin/a/c:J	([B)J
    //   124: lstore 6
    //   126: aload_0
    //   127: aload 8
    //   129: putfield 33	com/tencent/mm/plugin/a/b:hmT	Lcom/tencent/mm/plugin/a/a;
    //   132: new 74	com/tencent/mm/plugin/a/a
    //   135: dup
    //   136: iload_2
    //   137: lload 4
    //   139: iload_3
    //   140: lload 6
    //   142: invokespecial 77	com/tencent/mm/plugin/a/a:<init>	(IJIJ)V
    //   145: astore 9
    //   147: aload 9
    //   149: astore 8
    //   151: aload 9
    //   153: invokevirtual 81	com/tencent/mm/plugin/a/a:Pz	()Z
    //   156: ifne +120 -> 276
    //   159: aload 9
    //   161: astore 8
    //   163: aload 9
    //   165: invokevirtual 84	com/tencent/mm/plugin/a/a:PA	()Z
    //   168: ifne +108 -> 276
    //   171: iload_2
    //   172: iconst_1
    //   173: if_icmple +50 -> 223
    //   176: iload_2
    //   177: bipush 8
    //   179: isub
    //   180: i2l
    //   181: lstore 6
    //   183: lload 4
    //   185: iload_2
    //   186: i2l
    //   187: ladd
    //   188: lstore 4
    //   190: aload 9
    //   192: astore 8
    //   194: aload_1
    //   195: lload 6
    //   197: invokevirtual 59	java/io/InputStream:skip	(J)J
    //   200: lload 6
    //   202: lcmp
    //   203: iflt +73 -> 276
    //   206: aload_1
    //   207: aload 10
    //   209: iconst_0
    //   210: bipush 8
    //   212: invokevirtual 63	java/io/InputStream:read	([BII)I
    //   215: istore_2
    //   216: aload 9
    //   218: astore 8
    //   220: goto -143 -> 77
    //   223: aload 9
    //   225: astore 8
    //   227: lload 6
    //   229: lconst_0
    //   230: lcmp
    //   231: ifle +45 -> 276
    //   234: lload 4
    //   236: lload 6
    //   238: ladd
    //   239: lstore 4
    //   241: lload 6
    //   243: ldc2_w 85
    //   246: lsub
    //   247: ldc2_w 85
    //   250: lsub
    //   251: lstore 6
    //   253: goto -63 -> 190
    //   256: astore 8
    //   258: aconst_null
    //   259: astore_1
    //   260: ldc 45
    //   262: aload 8
    //   264: ldc 88
    //   266: iconst_0
    //   267: anewarray 4	java/lang/Object
    //   270: invokestatic 92	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   273: aload_1
    //   274: astore 8
    //   276: ldc2_w 41
    //   279: ldc 43
    //   281: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   284: aload 8
    //   286: areturn
    //   287: astore 8
    //   289: aload 9
    //   291: astore_1
    //   292: goto -32 -> 260
    //   295: astore 9
    //   297: aload 8
    //   299: astore_1
    //   300: aload 9
    //   302: astore 8
    //   304: goto -44 -> 260
    //   307: goto -31 -> 276
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	310	0	this	b
    //   0	310	1	paramInputStream	java.io.InputStream
    //   76	140	2	i	int
    //   96	44	3	j	int
    //   39	201	4	l1	long
    //   98	154	6	l2	long
    //   32	194	8	localObject1	Object
    //   256	7	8	localException1	Exception
    //   274	11	8	localInputStream	java.io.InputStream
    //   287	11	8	localException2	Exception
    //   302	1	8	localObject2	Object
    //   145	145	9	locala	a
    //   295	6	9	localException3	Exception
    //   65	143	10	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   34	41	256	java/lang/Exception
    //   61	77	256	java/lang/Exception
    //   151	159	287	java/lang/Exception
    //   163	171	287	java/lang/Exception
    //   194	216	287	java/lang/Exception
    //   83	97	295	java/lang/Exception
    //   105	126	295	java/lang/Exception
    //   126	147	295	java/lang/Exception
  }
  
  /* Error */
  public final long no(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 97
    //   3: ldc 99
    //   5: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: invokestatic 103	com/tencent/mm/plugin/a/c:nm	(Ljava/lang/String;)Z
    //   12: ifeq +22 -> 34
    //   15: ldc 45
    //   17: ldc 105
    //   19: invokestatic 53	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: ldc2_w 97
    //   25: ldc 99
    //   27: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: ldc2_w 24
    //   33: lreturn
    //   34: new 107	java/io/File
    //   37: dup
    //   38: aload_1
    //   39: invokespecial 110	java/io/File:<init>	(Ljava/lang/String;)V
    //   42: astore 12
    //   44: ldc2_w 24
    //   47: lstore 6
    //   49: ldc2_w 24
    //   52: lstore 4
    //   54: new 112	java/io/FileInputStream
    //   57: dup
    //   58: aload_1
    //   59: invokespecial 113	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   62: astore 10
    //   64: lload 6
    //   66: lstore_2
    //   67: aload_0
    //   68: aload 12
    //   70: invokevirtual 117	java/io/File:length	()J
    //   73: putfield 31	com/tencent/mm/plugin/a/b:hmS	J
    //   76: lload 6
    //   78: lstore_2
    //   79: aload_0
    //   80: aload 10
    //   82: invokespecial 119	com/tencent/mm/plugin/a/b:i	(Ljava/io/InputStream;)Lcom/tencent/mm/plugin/a/a;
    //   85: astore 11
    //   87: aload 11
    //   89: ifnonnull +112 -> 201
    //   92: lload 6
    //   94: lstore_2
    //   95: ldc 45
    //   97: ldc 121
    //   99: invokestatic 53	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   102: ldc2_w 24
    //   105: lstore_2
    //   106: aload 10
    //   108: invokevirtual 124	java/io/InputStream:close	()V
    //   111: lload_2
    //   112: lstore 8
    //   114: lload 4
    //   116: lstore 6
    //   118: aload_0
    //   119: lload 8
    //   121: putfield 27	com/tencent/mm/plugin/a/b:hmQ	J
    //   124: aload_0
    //   125: lload 6
    //   127: putfield 29	com/tencent/mm/plugin/a/b:hmR	J
    //   130: ldc 45
    //   132: new 126	java/lang/StringBuilder
    //   135: dup
    //   136: ldc -128
    //   138: invokespecial 129	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   141: lload 8
    //   143: invokevirtual 133	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   146: ldc -121
    //   148: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload_0
    //   152: getfield 29	com/tencent/mm/plugin/a/b:hmR	J
    //   155: invokevirtual 133	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   158: ldc -116
    //   160: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: aload 12
    //   165: invokevirtual 117	java/io/File:length	()J
    //   168: ldc2_w 141
    //   171: ldiv
    //   172: invokevirtual 133	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   175: ldc -112
    //   177: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: aload_1
    //   181: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: invokestatic 150	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   190: ldc2_w 97
    //   193: ldc 99
    //   195: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   198: lload 8
    //   200: lreturn
    //   201: lload 6
    //   203: lstore_2
    //   204: aload 11
    //   206: invokevirtual 81	com/tencent/mm/plugin/a/a:Pz	()Z
    //   209: ifeq +33 -> 242
    //   212: lload 6
    //   214: lstore_2
    //   215: aload 11
    //   217: getfield 153	com/tencent/mm/plugin/a/a:hmP	J
    //   220: lstore 6
    //   222: lload 6
    //   224: lstore_2
    //   225: aload 11
    //   227: invokevirtual 156	com/tencent/mm/plugin/a/a:getSize	()J
    //   230: lstore 8
    //   232: lload 6
    //   234: lstore_2
    //   235: lload 8
    //   237: lstore 4
    //   239: goto -133 -> 106
    //   242: lload 6
    //   244: lstore_2
    //   245: aload 11
    //   247: invokevirtual 84	com/tencent/mm/plugin/a/a:PA	()Z
    //   250: ifeq +20 -> 270
    //   253: lload 6
    //   255: lstore_2
    //   256: ldc 45
    //   258: ldc -98
    //   260: invokestatic 53	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   263: ldc2_w 24
    //   266: lstore_2
    //   267: goto -161 -> 106
    //   270: lload 6
    //   272: lstore_2
    //   273: aload 11
    //   275: invokevirtual 156	com/tencent/mm/plugin/a/a:getSize	()J
    //   278: lconst_0
    //   279: lcmp
    //   280: ifle +165 -> 445
    //   283: lload 6
    //   285: lstore_2
    //   286: aload 11
    //   288: invokevirtual 161	com/tencent/mm/plugin/a/a:PB	()J
    //   291: lstore 6
    //   293: lload 6
    //   295: lstore_2
    //   296: goto -190 -> 106
    //   299: astore 10
    //   301: ldc 45
    //   303: aload 10
    //   305: ldc 88
    //   307: iconst_0
    //   308: anewarray 4	java/lang/Object
    //   311: invokestatic 92	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   314: lload 4
    //   316: lstore 6
    //   318: lload_2
    //   319: lstore 8
    //   321: goto -203 -> 118
    //   324: astore 11
    //   326: aconst_null
    //   327: astore 10
    //   329: ldc2_w 24
    //   332: lstore_2
    //   333: ldc 45
    //   335: aload 11
    //   337: ldc 88
    //   339: iconst_0
    //   340: anewarray 4	java/lang/Object
    //   343: invokestatic 92	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   346: lload 4
    //   348: lstore 6
    //   350: lload_2
    //   351: lstore 8
    //   353: aload 10
    //   355: ifnull -237 -> 118
    //   358: aload 10
    //   360: invokevirtual 124	java/io/InputStream:close	()V
    //   363: lload 4
    //   365: lstore 6
    //   367: lload_2
    //   368: lstore 8
    //   370: goto -252 -> 118
    //   373: astore 10
    //   375: ldc 45
    //   377: aload 10
    //   379: ldc 88
    //   381: iconst_0
    //   382: anewarray 4	java/lang/Object
    //   385: invokestatic 92	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: lload 4
    //   390: lstore 6
    //   392: lload_2
    //   393: lstore 8
    //   395: goto -277 -> 118
    //   398: astore_1
    //   399: aconst_null
    //   400: astore 10
    //   402: aload 10
    //   404: ifnull +8 -> 412
    //   407: aload 10
    //   409: invokevirtual 124	java/io/InputStream:close	()V
    //   412: aload_1
    //   413: athrow
    //   414: astore 10
    //   416: ldc 45
    //   418: aload 10
    //   420: ldc 88
    //   422: iconst_0
    //   423: anewarray 4	java/lang/Object
    //   426: invokestatic 92	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   429: goto -17 -> 412
    //   432: astore_1
    //   433: goto -31 -> 402
    //   436: astore_1
    //   437: goto -35 -> 402
    //   440: astore 11
    //   442: goto -109 -> 333
    //   445: ldc2_w 24
    //   448: lstore_2
    //   449: goto -343 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	452	0	this	b
    //   0	452	1	paramString	String
    //   66	383	2	l1	long
    //   52	337	4	l2	long
    //   47	344	6	l3	long
    //   112	282	8	l4	long
    //   62	45	10	localFileInputStream	java.io.FileInputStream
    //   299	5	10	localIOException1	java.io.IOException
    //   327	32	10	localObject1	Object
    //   373	5	10	localIOException2	java.io.IOException
    //   400	8	10	localObject2	Object
    //   414	5	10	localIOException3	java.io.IOException
    //   85	202	11	locala	a
    //   324	12	11	localException1	Exception
    //   440	1	11	localException2	Exception
    //   42	122	12	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   106	111	299	java/io/IOException
    //   54	64	324	java/lang/Exception
    //   358	363	373	java/io/IOException
    //   54	64	398	finally
    //   407	412	414	java/io/IOException
    //   67	76	432	finally
    //   79	87	432	finally
    //   95	102	432	finally
    //   204	212	432	finally
    //   215	222	432	finally
    //   225	232	432	finally
    //   245	253	432	finally
    //   256	263	432	finally
    //   273	283	432	finally
    //   286	293	432	finally
    //   333	346	436	finally
    //   67	76	440	java/lang/Exception
    //   79	87	440	java/lang/Exception
    //   95	102	440	java/lang/Exception
    //   204	212	440	java/lang/Exception
    //   215	222	440	java/lang/Exception
    //   225	232	440	java/lang/Exception
    //   245	253	440	java/lang/Exception
    //   256	263	440	java/lang/Exception
    //   273	283	440	java/lang/Exception
    //   286	293	440	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
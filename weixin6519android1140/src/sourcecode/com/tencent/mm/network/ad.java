package com.tencent.mm.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class ad
{
  public static final String hhR;
  private static long hhS;
  private static long lastUpdateTime;
  
  static
  {
    GMTrace.i(13655043211264L, 101738);
    hhR = e.ghx + "/tencent/noop.dat";
    lastUpdateTime = 0L;
    Object localObject = ab.getContext().getSharedPreferences("noop_prefs", 0);
    int i = ((SharedPreferences)localObject).getInt("noop_strategy", 1);
    if (1 == i)
    {
      hhS = 270L;
      new StringBuilder("getNoopIntervalInMs use hard code noop:").append(hhS);
      l = hhS * 1000L;
    }
    for (;;)
    {
      hhS = l / 1000L;
      GMTrace.o(13655043211264L, 101738);
      return;
      if (3 != i) {
        break;
      }
      l = ((SharedPreferences)localObject).getLong("noop_min_interval", 270L);
      if ((l >= 180L) && (l <= 3600L))
      {
        hhS = l;
        l *= 1000L;
      }
      else
      {
        hhS = 270L;
        new StringBuilder("getNoopIntervalInMs use wx noop:").append(hhS);
        l = hhS * 1000L;
      }
    }
    long l = System.currentTimeMillis() / 1000L;
    if (l - lastUpdateTime > 3600L)
    {
      localObject = Pe();
      if ((localObject[0] < 180L) || (localObject[0] > 3600L)) {
        break label268;
      }
    }
    label268:
    for (hhS = localObject[0];; hhS = 270L)
    {
      lastUpdateTime = l;
      new StringBuilder("getNoopIntervalInMs use sync noop:").append(hhS);
      l = hhS * 1000L;
      break;
    }
  }
  
  /* Error */
  private static long[] Pe()
  {
    // Byte code:
    //   0: ldc2_w 111
    //   3: ldc 113
    //   5: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: iconst_2
    //   9: newarray <illegal type>
    //   11: astore 6
    //   13: aload 6
    //   15: dup
    //   16: iconst_0
    //   17: lconst_0
    //   18: lastore
    //   19: dup
    //   20: iconst_1
    //   21: lconst_0
    //   22: lastore
    //   23: pop
    //   24: new 115	java/io/File
    //   27: dup
    //   28: getstatic 42	com/tencent/mm/network/ad:hhR	Ljava/lang/String;
    //   31: invokespecial 116	java/io/File:<init>	(Ljava/lang/String;)V
    //   34: astore_3
    //   35: aload_3
    //   36: invokevirtual 120	java/io/File:exists	()Z
    //   39: ifne +14 -> 53
    //   42: ldc2_w 111
    //   45: ldc 113
    //   47: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   50: aload 6
    //   52: areturn
    //   53: new 122	java/io/DataInputStream
    //   56: dup
    //   57: new 124	java/io/FileInputStream
    //   60: dup
    //   61: aload_3
    //   62: invokespecial 127	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   65: invokespecial 130	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   68: astore 4
    //   70: aload 4
    //   72: astore_3
    //   73: aload 4
    //   75: invokevirtual 134	java/io/DataInputStream:readInt	()I
    //   78: istore_0
    //   79: iload_0
    //   80: i2l
    //   81: ldc2_w 90
    //   84: lcmp
    //   85: iflt +12 -> 97
    //   88: iload_0
    //   89: i2l
    //   90: ldc2_w 92
    //   93: lcmp
    //   94: ifle +27 -> 121
    //   97: aload 4
    //   99: astore_3
    //   100: aload 4
    //   102: invokevirtual 137	java/io/DataInputStream:close	()V
    //   105: aload 4
    //   107: invokevirtual 137	java/io/DataInputStream:close	()V
    //   110: ldc2_w 111
    //   113: ldc 113
    //   115: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   118: aload 6
    //   120: areturn
    //   121: iload_0
    //   122: i2l
    //   123: lstore_1
    //   124: aload 6
    //   126: iconst_0
    //   127: lload_1
    //   128: lastore
    //   129: aload 4
    //   131: astore_3
    //   132: aload 4
    //   134: invokevirtual 134	java/io/DataInputStream:readInt	()I
    //   137: istore_0
    //   138: aload 4
    //   140: astore_3
    //   141: iload_0
    //   142: i2l
    //   143: invokestatic 101	java/lang/System:currentTimeMillis	()J
    //   146: ldc2_w 79
    //   149: ldiv
    //   150: lcmp
    //   151: ifle +27 -> 178
    //   154: aload 4
    //   156: astore_3
    //   157: aload 4
    //   159: invokevirtual 137	java/io/DataInputStream:close	()V
    //   162: aload 4
    //   164: invokevirtual 137	java/io/DataInputStream:close	()V
    //   167: ldc2_w 111
    //   170: ldc 113
    //   172: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   175: aload 6
    //   177: areturn
    //   178: iload_0
    //   179: i2l
    //   180: lstore_1
    //   181: aload 6
    //   183: iconst_1
    //   184: lload_1
    //   185: lastore
    //   186: aload 4
    //   188: astore_3
    //   189: aload 4
    //   191: invokevirtual 137	java/io/DataInputStream:close	()V
    //   194: aload 4
    //   196: invokevirtual 137	java/io/DataInputStream:close	()V
    //   199: ldc2_w 111
    //   202: ldc 113
    //   204: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   207: aload 6
    //   209: areturn
    //   210: astore 5
    //   212: aconst_null
    //   213: astore 4
    //   215: aload 4
    //   217: astore_3
    //   218: new 22	java/lang/StringBuilder
    //   221: dup
    //   222: ldc -117
    //   224: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   227: aload 5
    //   229: invokevirtual 143	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   232: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   235: pop
    //   236: aload 4
    //   238: ifnull +8 -> 246
    //   241: aload 4
    //   243: invokevirtual 137	java/io/DataInputStream:close	()V
    //   246: ldc2_w 111
    //   249: ldc 113
    //   251: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   254: aload 6
    //   256: areturn
    //   257: astore 4
    //   259: aconst_null
    //   260: astore_3
    //   261: aload_3
    //   262: ifnull +7 -> 269
    //   265: aload_3
    //   266: invokevirtual 137	java/io/DataInputStream:close	()V
    //   269: aload 4
    //   271: athrow
    //   272: astore_3
    //   273: goto -163 -> 110
    //   276: astore_3
    //   277: goto -110 -> 167
    //   280: astore_3
    //   281: goto -82 -> 199
    //   284: astore_3
    //   285: goto -39 -> 246
    //   288: astore_3
    //   289: goto -20 -> 269
    //   292: astore 4
    //   294: goto -33 -> 261
    //   297: astore 5
    //   299: goto -84 -> 215
    // Local variable table:
    //   start	length	slot	name	signature
    //   78	101	0	i	int
    //   123	62	1	l	long
    //   34	232	3	localObject1	Object
    //   272	1	3	localException1	Exception
    //   276	1	3	localException2	Exception
    //   280	1	3	localException3	Exception
    //   284	1	3	localException4	Exception
    //   288	1	3	localException5	Exception
    //   68	174	4	localDataInputStream	java.io.DataInputStream
    //   257	13	4	localObject2	Object
    //   292	1	4	localObject3	Object
    //   210	18	5	localException6	Exception
    //   297	1	5	localException7	Exception
    //   11	244	6	arrayOfLong	long[]
    // Exception table:
    //   from	to	target	type
    //   53	70	210	java/lang/Exception
    //   53	70	257	finally
    //   105	110	272	java/lang/Exception
    //   162	167	276	java/lang/Exception
    //   194	199	280	java/lang/Exception
    //   241	246	284	java/lang/Exception
    //   265	269	288	java/lang/Exception
    //   73	79	292	finally
    //   100	105	292	finally
    //   132	138	292	finally
    //   141	154	292	finally
    //   157	162	292	finally
    //   189	194	292	finally
    //   218	236	292	finally
    //   73	79	297	java/lang/Exception
    //   100	105	297	java/lang/Exception
    //   132	138	297	java/lang/Exception
    //   141	154	297	java/lang/Exception
    //   157	162	297	java/lang/Exception
    //   189	194	297	java/lang/Exception
  }
  
  /* Error */
  public static void g(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: ldc2_w 149
    //   3: ldc -105
    //   5: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 22	java/lang/StringBuilder
    //   11: dup
    //   12: ldc -103
    //   14: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   17: lload_0
    //   18: invokevirtual 78	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   21: ldc -101
    //   23: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: lload_2
    //   27: invokevirtual 78	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: lload_2
    //   32: lconst_0
    //   33: lcmp
    //   34: ifgt +139 -> 173
    //   37: lload_0
    //   38: lconst_0
    //   39: lcmp
    //   40: ifgt +40 -> 80
    //   43: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   46: ldc 52
    //   48: iconst_0
    //   49: invokevirtual 58	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   52: invokeinterface 159 1 0
    //   57: ldc 60
    //   59: iconst_1
    //   60: invokeinterface 165 3 0
    //   65: invokeinterface 168 1 0
    //   70: pop
    //   71: ldc2_w 149
    //   74: ldc -105
    //   76: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   79: return
    //   80: lload_0
    //   81: ldc2_w 90
    //   84: lcmp
    //   85: iflt +56 -> 141
    //   88: lload_0
    //   89: ldc2_w 92
    //   92: lcmp
    //   93: ifgt +48 -> 141
    //   96: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   99: ldc 52
    //   101: iconst_0
    //   102: invokevirtual 58	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   105: invokeinterface 159 1 0
    //   110: ldc 60
    //   112: iconst_3
    //   113: invokeinterface 165 3 0
    //   118: ldc 85
    //   120: lload_0
    //   121: invokeinterface 172 4 0
    //   126: invokeinterface 168 1 0
    //   131: pop
    //   132: ldc2_w 149
    //   135: ldc -105
    //   137: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   140: return
    //   141: new 22	java/lang/StringBuilder
    //   144: dup
    //   145: ldc -82
    //   147: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   150: lload_0
    //   151: invokevirtual 78	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   154: ldc -80
    //   156: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: lload_2
    //   160: invokevirtual 78	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: ldc2_w 149
    //   167: ldc -105
    //   169: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   172: return
    //   173: invokestatic 50	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   176: ldc 52
    //   178: iconst_0
    //   179: invokevirtual 58	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   182: invokeinterface 159 1 0
    //   187: ldc 60
    //   189: iconst_2
    //   190: invokeinterface 165 3 0
    //   195: invokeinterface 168 1 0
    //   200: pop
    //   201: lload_0
    //   202: ldc2_w 90
    //   205: lcmp
    //   206: iflt +11 -> 217
    //   209: lload_0
    //   210: ldc2_w 92
    //   213: lcmp
    //   214: ifle +12 -> 226
    //   217: ldc2_w 149
    //   220: ldc -105
    //   222: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   225: return
    //   226: invokestatic 101	java/lang/System:currentTimeMillis	()J
    //   229: ldc2_w 79
    //   232: ldiv
    //   233: lload_2
    //   234: lcmp
    //   235: ifge +12 -> 247
    //   238: ldc2_w 149
    //   241: ldc -105
    //   243: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   246: return
    //   247: new 115	java/io/File
    //   250: dup
    //   251: getstatic 42	com/tencent/mm/network/ad:hhR	Ljava/lang/String;
    //   254: invokespecial 116	java/io/File:<init>	(Ljava/lang/String;)V
    //   257: astore 8
    //   259: aload 8
    //   261: invokevirtual 120	java/io/File:exists	()Z
    //   264: ifeq +39 -> 303
    //   267: invokestatic 105	com/tencent/mm/network/ad:Pe	()[J
    //   270: astore 8
    //   272: aload 8
    //   274: iconst_1
    //   275: laload
    //   276: lconst_0
    //   277: lcmp
    //   278: ifle +46 -> 324
    //   281: aload 8
    //   283: iconst_1
    //   284: laload
    //   285: lstore 5
    //   287: lload 5
    //   289: lload_2
    //   290: lcmp
    //   291: iflt +33 -> 324
    //   294: ldc2_w 149
    //   297: ldc -105
    //   299: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   302: return
    //   303: aload 8
    //   305: invokevirtual 179	java/io/File:createNewFile	()Z
    //   308: istore 7
    //   310: iload 7
    //   312: ifne +12 -> 324
    //   315: ldc2_w 149
    //   318: ldc -105
    //   320: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   323: return
    //   324: aconst_null
    //   325: astore 9
    //   327: aconst_null
    //   328: astore 10
    //   330: aload 9
    //   332: astore 8
    //   334: new 115	java/io/File
    //   337: dup
    //   338: getstatic 42	com/tencent/mm/network/ad:hhR	Ljava/lang/String;
    //   341: invokespecial 116	java/io/File:<init>	(Ljava/lang/String;)V
    //   344: astore 11
    //   346: aload 9
    //   348: astore 8
    //   350: aload 11
    //   352: invokevirtual 120	java/io/File:exists	()Z
    //   355: ifne +57 -> 412
    //   358: aload 9
    //   360: astore 8
    //   362: aload 11
    //   364: invokevirtual 179	java/io/File:createNewFile	()Z
    //   367: istore 7
    //   369: iload 7
    //   371: ifne +41 -> 412
    //   374: ldc2_w 149
    //   377: ldc -105
    //   379: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   382: return
    //   383: astore 8
    //   385: new 22	java/lang/StringBuilder
    //   388: dup
    //   389: ldc -75
    //   391: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   394: aload 8
    //   396: invokevirtual 143	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   399: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   402: pop
    //   403: ldc2_w 149
    //   406: ldc -105
    //   408: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   411: return
    //   412: aload 9
    //   414: astore 8
    //   416: new 183	java/io/DataOutputStream
    //   419: dup
    //   420: new 185	java/io/FileOutputStream
    //   423: dup
    //   424: aload 11
    //   426: invokespecial 186	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   429: invokespecial 189	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   432: astore 9
    //   434: lload_0
    //   435: l2i
    //   436: istore 4
    //   438: aload 9
    //   440: iload 4
    //   442: invokevirtual 193	java/io/DataOutputStream:writeInt	(I)V
    //   445: aload 9
    //   447: lload_2
    //   448: l2i
    //   449: invokevirtual 193	java/io/DataOutputStream:writeInt	(I)V
    //   452: aload 9
    //   454: invokevirtual 196	java/io/DataOutputStream:flush	()V
    //   457: aload 9
    //   459: invokevirtual 197	java/io/DataOutputStream:close	()V
    //   462: aload 9
    //   464: invokevirtual 197	java/io/DataOutputStream:close	()V
    //   467: ldc2_w 149
    //   470: ldc -105
    //   472: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   475: return
    //   476: astore 8
    //   478: ldc2_w 149
    //   481: ldc -105
    //   483: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   486: return
    //   487: astore 8
    //   489: aload 10
    //   491: astore 9
    //   493: aload 8
    //   495: astore 10
    //   497: aload 9
    //   499: astore 8
    //   501: new 22	java/lang/StringBuilder
    //   504: dup
    //   505: ldc -57
    //   507: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   510: aload 10
    //   512: invokevirtual 143	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   515: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   518: pop
    //   519: aload 9
    //   521: ifnull +8 -> 529
    //   524: aload 9
    //   526: invokevirtual 197	java/io/DataOutputStream:close	()V
    //   529: ldc2_w 149
    //   532: ldc -105
    //   534: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   537: return
    //   538: astore 8
    //   540: ldc2_w 149
    //   543: ldc -105
    //   545: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   548: return
    //   549: astore 10
    //   551: aload 8
    //   553: astore 9
    //   555: aload 10
    //   557: astore 8
    //   559: aload 9
    //   561: ifnull +8 -> 569
    //   564: aload 9
    //   566: invokevirtual 197	java/io/DataOutputStream:close	()V
    //   569: aload 8
    //   571: athrow
    //   572: astore 9
    //   574: goto -5 -> 569
    //   577: astore 8
    //   579: goto -20 -> 559
    //   582: astore 10
    //   584: goto -87 -> 497
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	587	0	paramLong1	long
    //   0	587	2	paramLong2	long
    //   436	5	4	i	int
    //   285	3	5	l	long
    //   308	62	7	bool	boolean
    //   257	104	8	localObject1	Object
    //   383	12	8	localException1	Exception
    //   414	1	8	localObject2	Object
    //   476	1	8	localException2	Exception
    //   487	7	8	localException3	Exception
    //   499	1	8	localObject3	Object
    //   538	14	8	localException4	Exception
    //   557	13	8	localObject4	Object
    //   577	1	8	localObject5	Object
    //   325	240	9	localObject6	Object
    //   572	1	9	localException5	Exception
    //   328	183	10	localException6	Exception
    //   549	7	10	localObject7	Object
    //   582	1	10	localException7	Exception
    //   344	81	11	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   247	272	383	java/lang/Exception
    //   303	310	383	java/lang/Exception
    //   374	382	383	java/lang/Exception
    //   467	475	383	java/lang/Exception
    //   478	486	383	java/lang/Exception
    //   529	537	383	java/lang/Exception
    //   540	548	383	java/lang/Exception
    //   569	572	383	java/lang/Exception
    //   462	467	476	java/lang/Exception
    //   334	346	487	java/lang/Exception
    //   350	358	487	java/lang/Exception
    //   362	369	487	java/lang/Exception
    //   416	434	487	java/lang/Exception
    //   524	529	538	java/lang/Exception
    //   334	346	549	finally
    //   350	358	549	finally
    //   362	369	549	finally
    //   416	434	549	finally
    //   501	519	549	finally
    //   564	569	572	java/lang/Exception
    //   438	462	577	finally
    //   438	462	582	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.a;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.w;
import java.io.RandomAccessFile;
import java.util.List;

public final class f
{
  private long duration;
  private String filePath;
  private long hnk;
  private long hnn;
  private long[] hno;
  public int hnp;
  private List<g> hnq;
  private List<Pair> hnr;
  
  public f()
  {
    GMTrace.i(16390937378816L, 122122);
    GMTrace.o(16390937378816L, 122122);
  }
  
  private static i a(RandomAccessFile paramRandomAccessFile, byte[] paramArrayOfByte, long paramLong)
  {
    GMTrace.i(16391474249728L, 122126);
    w.d("MicroMsg.Mp4Parser", "start to find trak atom.");
    if (!c.a(paramRandomAccessFile, paramLong))
    {
      GMTrace.o(16391474249728L, 122126);
      return null;
    }
    paramRandomAccessFile = (i)c.a(paramRandomAccessFile, paramArrayOfByte, a.hlO);
    GMTrace.o(16391474249728L, 122126);
    return paramRandomAccessFile;
  }
  
  public final boolean a(int paramInt1, int paramInt2, PInt paramPInt1, PInt paramPInt2)
  {
    GMTrace.i(16391071596544L, 122123);
    if (this.hno == null)
    {
      GMTrace.o(16391071596544L, 122123);
      return false;
    }
    int i = paramInt1;
    if (paramInt1 < 0) {
      i = 0;
    }
    int j = this.hno.length;
    if (i < j)
    {
      paramInt1 = paramInt2;
      if (paramInt2 < j) {}
    }
    else
    {
      i = j - 2;
      paramInt1 = j - 1;
    }
    long l1 = this.hno[i];
    long l2 = this.hno[paramInt1];
    if (i == 0) {
      paramPInt1.value = 0;
    }
    for (paramPInt2.value = ((int)l2);; paramPInt2.value = ((int)l2 - (int)l1))
    {
      GMTrace.o(16391071596544L, 122123);
      return true;
      paramPInt1.value = ((int)l1);
    }
  }
  
  public final int bi(int paramInt1, int paramInt2)
  {
    int i = 0;
    GMTrace.i(16391205814272L, 122124);
    if (this.hno == null)
    {
      GMTrace.o(16391205814272L, 122124);
      return 0;
    }
    long l = paramInt1 + paramInt2;
    paramInt2 = 0;
    paramInt1 = i;
    i = paramInt2;
    if (paramInt1 < this.hno.length)
    {
      if (this.hno[paramInt1] == l) {
        i = paramInt1;
      }
    }
    else
    {
      label62:
      GMTrace.o(16391205814272L, 122124);
      return i;
    }
    if (this.hno[paramInt1] < l) {
      paramInt2 = paramInt1;
    }
    for (;;)
    {
      paramInt1 += 1;
      break;
      i = paramInt2;
      if (this.hno[paramInt1] > l) {
        break label62;
      }
    }
  }
  
  /* Error */
  public final boolean n(String paramString, long paramLong)
  {
    // Byte code:
    //   0: ldc2_w 89
    //   3: ldc 91
    //   5: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: aconst_null
    //   10: putfield 93	com/tencent/mm/plugin/a/f:filePath	Ljava/lang/String;
    //   13: aload_0
    //   14: aconst_null
    //   15: putfield 72	com/tencent/mm/plugin/a/f:hno	[J
    //   18: aload_0
    //   19: iconst_0
    //   20: putfield 95	com/tencent/mm/plugin/a/f:hnp	I
    //   23: aload_0
    //   24: lconst_0
    //   25: putfield 97	com/tencent/mm/plugin/a/f:duration	J
    //   28: aload_0
    //   29: lconst_0
    //   30: putfield 99	com/tencent/mm/plugin/a/f:hnk	J
    //   33: aload_0
    //   34: lconst_0
    //   35: putfield 101	com/tencent/mm/plugin/a/f:hnn	J
    //   38: aload_0
    //   39: aload_1
    //   40: putfield 93	com/tencent/mm/plugin/a/f:filePath	Ljava/lang/String;
    //   43: aload_0
    //   44: lload_2
    //   45: putfield 101	com/tencent/mm/plugin/a/f:hnn	J
    //   48: new 103	java/io/File
    //   51: dup
    //   52: aload_0
    //   53: getfield 93	com/tencent/mm/plugin/a/f:filePath	Ljava/lang/String;
    //   56: invokespecial 106	java/io/File:<init>	(Ljava/lang/String;)V
    //   59: astore_1
    //   60: aload_1
    //   61: invokevirtual 110	java/io/File:exists	()Z
    //   64: ifne +13 -> 77
    //   67: ldc2_w 89
    //   70: ldc 91
    //   72: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   75: iconst_0
    //   76: ireturn
    //   77: bipush 8
    //   79: newarray <illegal type>
    //   81: astore 7
    //   83: new 112	java/io/RandomAccessFile
    //   86: dup
    //   87: aload_1
    //   88: ldc 114
    //   90: invokespecial 117	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   93: astore 6
    //   95: aload 6
    //   97: astore_1
    //   98: aload 6
    //   100: aload 7
    //   102: aload_0
    //   103: getfield 101	com/tencent/mm/plugin/a/f:hnn	J
    //   106: invokestatic 119	com/tencent/mm/plugin/a/f:a	(Ljava/io/RandomAccessFile;[BJ)Lcom/tencent/mm/plugin/a/i;
    //   109: astore 5
    //   111: aload 5
    //   113: ifnull +325 -> 438
    //   116: aload 6
    //   118: astore_1
    //   119: ldc 43
    //   121: new 121	java/lang/StringBuilder
    //   124: dup
    //   125: ldc 123
    //   127: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   130: aload 5
    //   132: getfield 127	com/tencent/mm/plugin/a/a:hmP	J
    //   135: invokevirtual 131	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   138: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: invokestatic 51	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   144: aload 6
    //   146: astore_1
    //   147: aload 6
    //   149: aload 7
    //   151: invokestatic 139	com/tencent/mm/plugin/a/i:b	(Ljava/io/RandomAccessFile;[B)Lcom/tencent/mm/plugin/a/e;
    //   154: astore 8
    //   156: aload 8
    //   158: ifnull +295 -> 453
    //   161: aload 6
    //   163: astore_1
    //   164: aload 8
    //   166: aload 6
    //   168: aload 7
    //   170: invokevirtual 144	com/tencent/mm/plugin/a/e:a	(Ljava/io/RandomAccessFile;[B)Z
    //   173: ifeq +280 -> 453
    //   176: aload 6
    //   178: astore_1
    //   179: aload 8
    //   181: getfield 147	com/tencent/mm/plugin/a/e:hnl	J
    //   184: getstatic 150	com/tencent/mm/plugin/a/e:hnh	I
    //   187: i2l
    //   188: lcmp
    //   189: ifne +426 -> 615
    //   192: iconst_1
    //   193: istore 4
    //   195: iload 4
    //   197: ifne +58 -> 255
    //   200: aload 6
    //   202: astore_1
    //   203: aload 5
    //   205: invokevirtual 154	com/tencent/mm/plugin/a/i:PB	()J
    //   208: aload 6
    //   210: invokevirtual 157	java/io/RandomAccessFile:getFilePointer	()J
    //   213: lsub
    //   214: lstore_2
    //   215: aload 6
    //   217: astore_1
    //   218: ldc 43
    //   220: new 121	java/lang/StringBuilder
    //   223: dup
    //   224: ldc -97
    //   226: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   229: lload_2
    //   230: invokevirtual 131	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   233: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: invokestatic 51	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   239: aload 6
    //   241: astore_1
    //   242: aload 6
    //   244: aload 7
    //   246: lload_2
    //   247: invokestatic 119	com/tencent/mm/plugin/a/f:a	(Ljava/io/RandomAccessFile;[BJ)Lcom/tencent/mm/plugin/a/i;
    //   250: astore 5
    //   252: goto -141 -> 111
    //   255: aload 6
    //   257: astore_1
    //   258: aload_0
    //   259: aload 8
    //   261: getfield 160	com/tencent/mm/plugin/a/e:hnk	J
    //   264: putfield 99	com/tencent/mm/plugin/a/f:hnk	J
    //   267: aload 6
    //   269: astore_1
    //   270: aload_0
    //   271: aload 8
    //   273: getfield 161	com/tencent/mm/plugin/a/e:duration	J
    //   276: putfield 97	com/tencent/mm/plugin/a/f:duration	J
    //   279: aload 6
    //   281: astore_1
    //   282: ldc 43
    //   284: new 121	java/lang/StringBuilder
    //   287: dup
    //   288: ldc -93
    //   290: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   293: aload_0
    //   294: getfield 99	com/tencent/mm/plugin/a/f:hnk	J
    //   297: invokevirtual 131	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   300: ldc -91
    //   302: invokevirtual 168	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: aload_0
    //   306: getfield 97	com/tencent/mm/plugin/a/f:duration	J
    //   309: invokevirtual 131	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   312: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   315: invokestatic 51	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   318: aload 6
    //   320: astore_1
    //   321: aload 6
    //   323: aload 8
    //   325: getfield 171	com/tencent/mm/plugin/a/e:hnm	J
    //   328: invokevirtual 175	java/io/RandomAccessFile:seek	(J)V
    //   331: aload 6
    //   333: astore_1
    //   334: aload 6
    //   336: aload 7
    //   338: getstatic 178	com/tencent/mm/plugin/a/a:hlR	I
    //   341: invokestatic 64	com/tencent/mm/plugin/a/c:a	(Ljava/io/RandomAccessFile;[BI)Lcom/tencent/mm/plugin/a/a;
    //   344: checkcast 180	com/tencent/mm/plugin/a/h
    //   347: astore 5
    //   349: aload 5
    //   351: ifnull +87 -> 438
    //   354: aload 6
    //   356: astore_1
    //   357: aload 5
    //   359: aload_0
    //   360: getfield 97	com/tencent/mm/plugin/a/f:duration	J
    //   363: putfield 181	com/tencent/mm/plugin/a/h:duration	J
    //   366: aload 6
    //   368: astore_1
    //   369: aload 5
    //   371: aload_0
    //   372: getfield 99	com/tencent/mm/plugin/a/f:hnk	J
    //   375: putfield 182	com/tencent/mm/plugin/a/h:hnk	J
    //   378: aload 6
    //   380: astore_1
    //   381: aload 5
    //   383: aload 6
    //   385: invokevirtual 186	com/tencent/mm/plugin/a/h:c	(Ljava/io/RandomAccessFile;)V
    //   388: aload 6
    //   390: astore_1
    //   391: aload_0
    //   392: aload 5
    //   394: getfield 187	com/tencent/mm/plugin/a/h:hno	[J
    //   397: putfield 72	com/tencent/mm/plugin/a/f:hno	[J
    //   400: aload 6
    //   402: astore_1
    //   403: aload_0
    //   404: aload_0
    //   405: getfield 72	com/tencent/mm/plugin/a/f:hno	[J
    //   408: arraylength
    //   409: iconst_2
    //   410: isub
    //   411: putfield 95	com/tencent/mm/plugin/a/f:hnp	I
    //   414: aload 6
    //   416: astore_1
    //   417: aload_0
    //   418: aload 5
    //   420: getfield 189	com/tencent/mm/plugin/a/h:hnq	Ljava/util/List;
    //   423: putfield 190	com/tencent/mm/plugin/a/f:hnq	Ljava/util/List;
    //   426: aload 6
    //   428: astore_1
    //   429: aload_0
    //   430: aload 5
    //   432: getfield 192	com/tencent/mm/plugin/a/h:hnr	Ljava/util/List;
    //   435: putfield 193	com/tencent/mm/plugin/a/f:hnr	Ljava/util/List;
    //   438: aload 6
    //   440: invokevirtual 196	java/io/RandomAccessFile:close	()V
    //   443: ldc2_w 89
    //   446: ldc 91
    //   448: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   451: iconst_1
    //   452: ireturn
    //   453: aload 6
    //   455: astore_1
    //   456: ldc 43
    //   458: ldc -58
    //   460: invokestatic 201	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   463: aconst_null
    //   464: astore 5
    //   466: goto -355 -> 111
    //   469: astore_1
    //   470: ldc 43
    //   472: aload_1
    //   473: ldc -53
    //   475: iconst_0
    //   476: anewarray 4	java/lang/Object
    //   479: invokestatic 207	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   482: goto -39 -> 443
    //   485: astore 7
    //   487: aconst_null
    //   488: astore 5
    //   490: aload 5
    //   492: astore_1
    //   493: ldc 43
    //   495: aload 7
    //   497: ldc -53
    //   499: iconst_0
    //   500: anewarray 4	java/lang/Object
    //   503: invokestatic 207	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   506: aload 5
    //   508: astore_1
    //   509: ldc 43
    //   511: new 121	java/lang/StringBuilder
    //   514: dup
    //   515: ldc -47
    //   517: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   520: aload 7
    //   522: invokevirtual 210	java/lang/Exception:toString	()Ljava/lang/String;
    //   525: invokevirtual 168	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   528: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   531: invokestatic 213	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   534: aload 5
    //   536: ifnull +8 -> 544
    //   539: aload 5
    //   541: invokevirtual 196	java/io/RandomAccessFile:close	()V
    //   544: ldc2_w 89
    //   547: ldc 91
    //   549: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   552: iconst_0
    //   553: ireturn
    //   554: astore_1
    //   555: ldc 43
    //   557: aload_1
    //   558: ldc -53
    //   560: iconst_0
    //   561: anewarray 4	java/lang/Object
    //   564: invokestatic 207	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   567: goto -23 -> 544
    //   570: astore 5
    //   572: aconst_null
    //   573: astore_1
    //   574: aload_1
    //   575: ifnull +7 -> 582
    //   578: aload_1
    //   579: invokevirtual 196	java/io/RandomAccessFile:close	()V
    //   582: aload 5
    //   584: athrow
    //   585: astore_1
    //   586: ldc 43
    //   588: aload_1
    //   589: ldc -53
    //   591: iconst_0
    //   592: anewarray 4	java/lang/Object
    //   595: invokestatic 207	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   598: goto -16 -> 582
    //   601: astore 5
    //   603: goto -29 -> 574
    //   606: astore 7
    //   608: aload 6
    //   610: astore 5
    //   612: goto -122 -> 490
    //   615: iconst_0
    //   616: istore 4
    //   618: goto -423 -> 195
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	621	0	this	f
    //   0	621	1	paramString	String
    //   0	621	2	paramLong	long
    //   193	424	4	i	int
    //   109	431	5	localObject1	Object
    //   570	13	5	localObject2	Object
    //   601	1	5	localObject3	Object
    //   610	1	5	localRandomAccessFile1	RandomAccessFile
    //   93	516	6	localRandomAccessFile2	RandomAccessFile
    //   81	256	7	arrayOfByte	byte[]
    //   485	36	7	localException1	Exception
    //   606	1	7	localException2	Exception
    //   154	170	8	locale	e
    // Exception table:
    //   from	to	target	type
    //   438	443	469	java/io/IOException
    //   77	95	485	java/lang/Exception
    //   539	544	554	java/io/IOException
    //   77	95	570	finally
    //   578	582	585	java/io/IOException
    //   98	111	601	finally
    //   119	144	601	finally
    //   147	156	601	finally
    //   164	176	601	finally
    //   179	192	601	finally
    //   203	215	601	finally
    //   218	239	601	finally
    //   242	252	601	finally
    //   258	267	601	finally
    //   270	279	601	finally
    //   282	318	601	finally
    //   321	331	601	finally
    //   334	349	601	finally
    //   357	366	601	finally
    //   369	378	601	finally
    //   381	388	601	finally
    //   391	400	601	finally
    //   403	414	601	finally
    //   417	426	601	finally
    //   429	438	601	finally
    //   456	463	601	finally
    //   493	506	601	finally
    //   509	534	601	finally
    //   98	111	606	java/lang/Exception
    //   119	144	606	java/lang/Exception
    //   147	156	606	java/lang/Exception
    //   164	176	606	java/lang/Exception
    //   179	192	606	java/lang/Exception
    //   203	215	606	java/lang/Exception
    //   218	239	606	java/lang/Exception
    //   242	252	606	java/lang/Exception
    //   258	267	606	java/lang/Exception
    //   270	279	606	java/lang/Exception
    //   282	318	606	java/lang/Exception
    //   321	331	606	java/lang/Exception
    //   334	349	606	java/lang/Exception
    //   357	366	606	java/lang/Exception
    //   369	378	606	java/lang/Exception
    //   381	388	606	java/lang/Exception
    //   391	400	606	java/lang/Exception
    //   403	414	606	java/lang/Exception
    //   417	426	606	java/lang/Exception
    //   429	438	606	java/lang/Exception
    //   456	463	606	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
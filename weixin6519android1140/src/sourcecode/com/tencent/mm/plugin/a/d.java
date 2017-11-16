package com.tencent.mm.plugin.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.w;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

public final class d
{
  private static final int hmU;
  private static final int hmV;
  private static final int hmW;
  private static final int hmX;
  private static final int hmY;
  private static final int hmZ;
  private static final int hna;
  private static final int hnb;
  private static final int hnc;
  private static final int hnd;
  private static final int hne;
  private static final int hnf;
  private static final int hng;
  
  static
  {
    GMTrace.i(16390400507904L, 122118);
    hmU = K(new byte[] { 102, 114, 101, 101 });
    hmV = K(new byte[] { 106, 117, 110, 107 });
    hmW = K(new byte[] { 109, 100, 97, 116 });
    hmX = K(new byte[] { 109, 111, 111, 118 });
    hmY = K(new byte[] { 112, 110, 111, 116 });
    hmZ = K(new byte[] { 115, 107, 105, 112 });
    hna = K(new byte[] { 119, 105, 100, 101 });
    hnb = K(new byte[] { 80, 73, 67, 84 });
    hnc = K(new byte[] { 102, 116, 121, 112 });
    hnd = K(new byte[] { 117, 117, 105, 100 });
    hne = K(new byte[] { 99, 109, 111, 118 });
    hnf = K(new byte[] { 115, 116, 99, 111 });
    hng = K(new byte[] { 99, 111, 54, 52 });
    GMTrace.o(16390400507904L, 122118);
  }
  
  private static int K(byte[] paramArrayOfByte)
  {
    GMTrace.i(16389595201536L, 122112);
    int i = ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.BIG_ENDIAN).getInt();
    GMTrace.o(16389595201536L, 122112);
    return i;
  }
  
  private static boolean a(FileChannel paramFileChannel, ByteBuffer paramByteBuffer)
  {
    GMTrace.i(16389863636992L, 122114);
    paramByteBuffer.clear();
    int i = paramFileChannel.read(paramByteBuffer);
    paramByteBuffer.flip();
    if (i == paramByteBuffer.capacity())
    {
      GMTrace.o(16389863636992L, 122114);
      return true;
    }
    GMTrace.o(16389863636992L, 122114);
    return false;
  }
  
  private static boolean a(FileChannel paramFileChannel1, FileChannel paramFileChannel2, PInt paramPInt)
  {
    GMTrace.i(16390266290176L, 122117);
    int k = 0;
    long l2 = 0L;
    Object localObject1 = null;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
    long l3 = 0L;
    int i = 0;
    int j = 0;
    long l4 = -1L;
    long l1;
    int m;
    int n;
    Object localObject2;
    for (;;)
    {
      if (a(paramFileChannel1, localByteBuffer))
      {
        l1 = 0xFFFFFFFF & localByteBuffer.getInt();
        m = localByteBuffer.getInt();
        if (m == hnc)
        {
          k = 1;
          i = 1;
          n = aJ(l1);
          localObject1 = ByteBuffer.allocate(n).order(ByteOrder.BIG_ENDIAN);
          localByteBuffer.rewind();
          ((ByteBuffer)localObject1).put(localByteBuffer);
          localObject2 = localObject1;
          if (paramFileChannel1.read((ByteBuffer)localObject1) >= n - 8)
          {
            ((ByteBuffer)localObject1).flip();
            l3 = paramFileChannel1.position();
            k = m;
            l2 = l1;
            if (l1 >= 8L) {
              continue;
            }
            w.w("MicroMsg.FastStart", "atom size less 8, it error mp4.");
            GMTrace.o(16390266290176L, 122117);
            return false;
          }
        }
        else if (m == hmX)
        {
          l2 = paramFileChannel1.position();
          if (j == 0)
          {
            w.d("MicroMsg.FastStart", "it moov before mdat, needn't fast start");
            paramPInt.value = 1;
            GMTrace.o(16390266290176L, 122117);
            return false;
          }
          w.d("MicroMsg.FastStart", "it moov after mdat, need fast start");
          j = 1;
          l4 = l2 - 8L;
          l2 = l1;
          k = m;
        }
      }
    }
    for (;;)
    {
      if ((i == 0) || (j == 0))
      {
        w.w("MicroMsg.FastStart", "it can not find moov or ftyp");
        GMTrace.o(16390266290176L, 122117);
        return false;
        if (m == hmW) {
          j = 1;
        }
        if (l1 == 1L)
        {
          localByteBuffer.clear();
          k = i;
          localObject2 = localObject1;
          if (!a(paramFileChannel1, localByteBuffer)) {
            break label889;
          }
          l1 = localByteBuffer.getLong();
          if (l1 < 0L) {
            throw new Exception("uint64 value is too large");
          }
          paramFileChannel1.position(paramFileChannel1.position() + l1 - 16L);
          break;
        }
        paramFileChannel1.position(paramFileChannel1.position() + l1 - 8L);
        break;
      }
      if ((k != hmX) || (l4 < 0L))
      {
        w.w("MicroMsg.FastStart", "it can not find moov atom");
        GMTrace.o(16390266290176L, 122117);
        return false;
      }
      j = aJ(l2);
      paramPInt = ByteBuffer.allocate(j).order(ByteOrder.BIG_ENDIAN);
      paramPInt.clear();
      i = paramFileChannel1.read(paramPInt, l4);
      paramPInt.flip();
      if (i == paramPInt.capacity()) {}
      for (i = 1; i == 0; i = 0)
      {
        w.w("MicroMsg.FastStart", "failed to read moov atom");
        GMTrace.o(16390266290176L, 122117);
        return false;
      }
      if (paramPInt.getInt(12) == hne)
      {
        w.w("MicroMsg.FastStart", "this utility does not support compressed moov atoms yet");
        GMTrace.o(16390266290176L, 122117);
        return false;
      }
      while (paramPInt.remaining() >= 8)
      {
        k = paramPInt.position();
        i = paramPInt.getInt(k + 4);
        if ((i != hnf) && (i != hng))
        {
          paramPInt.position(paramPInt.position() + 1);
        }
        else
        {
          if ((paramPInt.getInt(k) & 0xFFFFFFFF) > paramPInt.remaining())
          {
            w.w("MicroMsg.FastStart", "bad atom size");
            GMTrace.o(16390266290176L, 122117);
            return false;
          }
          paramPInt.position(k + 12);
          if (paramPInt.remaining() < 4)
          {
            w.w("MicroMsg.FastStart", "malformed atom");
            GMTrace.o(16390266290176L, 122117);
            return false;
          }
          k = aJ(paramPInt.getInt());
          if (i == hnf)
          {
            if (paramPInt.remaining() < k * 4)
            {
              w.w("MicroMsg.FastStart", "bad atom size/element count");
              GMTrace.o(16390266290176L, 122117);
              return false;
            }
            i = 0;
            while (i < k)
            {
              m = paramPInt.getInt(paramPInt.position());
              n = m + j;
              if ((m < 0) && (n >= 0))
              {
                GMTrace.o(16390266290176L, 122117);
                return false;
              }
              paramPInt.putInt(n);
              i += 1;
            }
          }
          else if (i == hng)
          {
            if (paramPInt.remaining() < k * 8)
            {
              w.w("MicroMsg.FastStart", "bad atom size/element count");
              GMTrace.o(16390266290176L, 122117);
              return false;
            }
            i = 0;
            while (i < k)
            {
              paramPInt.putLong(paramPInt.getLong(paramPInt.position()) + j);
              i += 1;
            }
          }
        }
      }
      paramFileChannel1.position(l3);
      if (localObject1 != null)
      {
        ((ByteBuffer)localObject1).rewind();
        paramFileChannel2.write((ByteBuffer)localObject1);
      }
      paramPInt.rewind();
      paramFileChannel2.write(paramPInt);
      paramFileChannel1.transferTo(l3, l4 - l3, paramFileChannel2);
      paramFileChannel1.transferTo(l4 + j, paramFileChannel1.size() - l4 - j, paramFileChannel2);
      GMTrace.o(16390266290176L, 122117);
      return true;
      label889:
      j = 0;
      i = k;
      localObject1 = localObject2;
      k = m;
      l2 = l1;
      continue;
      j = 0;
    }
  }
  
  private static int aJ(long paramLong)
  {
    GMTrace.i(16389729419264L, 122113);
    if ((paramLong > 2147483647L) || (paramLong < 0L)) {
      throw new Exception("uint32 value is too large");
    }
    int i = (int)paramLong;
    GMTrace.o(16389729419264L, 122113);
    return i;
  }
  
  /* Error */
  private static boolean as(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: ldc2_w 261
    //   6: ldc_w 263
    //   9: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: new 265	java/io/File
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 266	java/io/File:<init>	(Ljava/lang/String;)V
    //   20: astore 6
    //   22: new 265	java/io/File
    //   25: dup
    //   26: aload_1
    //   27: invokespecial 266	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: astore 8
    //   32: aload 6
    //   34: invokevirtual 269	java/io/File:length	()J
    //   37: aload 8
    //   39: invokevirtual 269	java/io/File:length	()J
    //   42: lcmp
    //   43: ifeq +22 -> 65
    //   46: ldc -91
    //   48: ldc_w 271
    //   51: invokestatic 173	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: ldc2_w 261
    //   57: ldc_w 263
    //   60: invokestatic 87	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   63: iconst_0
    //   64: ireturn
    //   65: new 273	com/tencent/mm/plugin/a/b
    //   68: dup
    //   69: invokespecial 275	com/tencent/mm/plugin/a/b:<init>	()V
    //   72: aload_0
    //   73: invokevirtual 279	com/tencent/mm/plugin/a/b:no	(Ljava/lang/String;)J
    //   76: lstore 4
    //   78: new 281	com/tencent/mm/plugin/a/f
    //   81: dup
    //   82: invokespecial 282	com/tencent/mm/plugin/a/f:<init>	()V
    //   85: astore 10
    //   87: aload 10
    //   89: aload_0
    //   90: lload 4
    //   92: invokevirtual 286	com/tencent/mm/plugin/a/f:n	(Ljava/lang/String;J)Z
    //   95: pop
    //   96: aload 10
    //   98: getfield 289	com/tencent/mm/plugin/a/f:hnp	I
    //   101: istore_3
    //   102: new 273	com/tencent/mm/plugin/a/b
    //   105: dup
    //   106: invokespecial 275	com/tencent/mm/plugin/a/b:<init>	()V
    //   109: aload_1
    //   110: invokevirtual 279	com/tencent/mm/plugin/a/b:no	(Ljava/lang/String;)J
    //   113: lstore 4
    //   115: new 281	com/tencent/mm/plugin/a/f
    //   118: dup
    //   119: invokespecial 282	com/tencent/mm/plugin/a/f:<init>	()V
    //   122: astore 9
    //   124: aload 9
    //   126: aload_1
    //   127: lload 4
    //   129: invokevirtual 286	com/tencent/mm/plugin/a/f:n	(Ljava/lang/String;J)Z
    //   132: pop
    //   133: aload 9
    //   135: getfield 289	com/tencent/mm/plugin/a/f:hnp	I
    //   138: istore_2
    //   139: iload_2
    //   140: iload_3
    //   141: if_icmpeq +22 -> 163
    //   144: ldc -91
    //   146: ldc_w 291
    //   149: invokestatic 173	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   152: ldc2_w 261
    //   155: ldc_w 263
    //   158: invokestatic 87	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   161: iconst_0
    //   162: ireturn
    //   163: ldc -91
    //   165: new 293	java/lang/StringBuilder
    //   168: dup
    //   169: ldc_w 295
    //   172: invokespecial 296	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   175: iload_3
    //   176: invokevirtual 300	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   179: ldc_w 302
    //   182: invokevirtual 305	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: iload_2
    //   186: invokevirtual 300	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   189: invokevirtual 309	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   192: invokestatic 178	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   195: new 311	java/util/Random
    //   198: dup
    //   199: invokespecial 312	java/util/Random:<init>	()V
    //   202: iload_2
    //   203: iconst_1
    //   204: isub
    //   205: invokevirtual 315	java/util/Random:nextInt	(I)I
    //   208: iconst_1
    //   209: iadd
    //   210: istore_3
    //   211: iload_3
    //   212: iconst_1
    //   213: iadd
    //   214: iload_2
    //   215: if_icmple +91 -> 306
    //   218: new 180	com/tencent/mm/pointers/PInt
    //   221: dup
    //   222: invokespecial 316	com/tencent/mm/pointers/PInt:<init>	()V
    //   225: astore_1
    //   226: new 180	com/tencent/mm/pointers/PInt
    //   229: dup
    //   230: invokespecial 316	com/tencent/mm/pointers/PInt:<init>	()V
    //   233: astore 11
    //   235: aload 10
    //   237: iload_3
    //   238: iload_2
    //   239: aload_1
    //   240: aload 11
    //   242: invokevirtual 319	com/tencent/mm/plugin/a/f:a	(IILcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Z
    //   245: pop
    //   246: new 180	com/tencent/mm/pointers/PInt
    //   249: dup
    //   250: invokespecial 316	com/tencent/mm/pointers/PInt:<init>	()V
    //   253: astore_0
    //   254: new 180	com/tencent/mm/pointers/PInt
    //   257: dup
    //   258: invokespecial 316	com/tencent/mm/pointers/PInt:<init>	()V
    //   261: astore 10
    //   263: aload 9
    //   265: iload_3
    //   266: iload_2
    //   267: aload_0
    //   268: aload 10
    //   270: invokevirtual 319	com/tencent/mm/plugin/a/f:a	(IILcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Z
    //   273: pop
    //   274: aload 10
    //   276: getfield 183	com/tencent/mm/pointers/PInt:value	I
    //   279: aload 11
    //   281: getfield 183	com/tencent/mm/pointers/PInt:value	I
    //   284: if_icmpeq +29 -> 313
    //   287: ldc -91
    //   289: ldc_w 321
    //   292: invokestatic 173	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   295: ldc2_w 261
    //   298: ldc_w 263
    //   301: invokestatic 87	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   304: iconst_0
    //   305: ireturn
    //   306: iload_3
    //   307: iconst_1
    //   308: iadd
    //   309: istore_2
    //   310: goto -92 -> 218
    //   313: new 323	java/io/FileInputStream
    //   316: dup
    //   317: aload 6
    //   319: invokespecial 326	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   322: astore 6
    //   324: aload 6
    //   326: aload_1
    //   327: getfield 183	com/tencent/mm/pointers/PInt:value	I
    //   330: i2l
    //   331: invokevirtual 330	java/io/FileInputStream:skip	(J)J
    //   334: pop2
    //   335: sipush 4096
    //   338: newarray <illegal type>
    //   340: astore 7
    //   342: aload 6
    //   344: aload 7
    //   346: invokevirtual 332	java/io/FileInputStream:read	([B)I
    //   349: pop
    //   350: new 323	java/io/FileInputStream
    //   353: dup
    //   354: aload 8
    //   356: invokespecial 326	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   359: astore_1
    //   360: aload_1
    //   361: aload_0
    //   362: getfield 183	com/tencent/mm/pointers/PInt:value	I
    //   365: i2l
    //   366: invokevirtual 330	java/io/FileInputStream:skip	(J)J
    //   369: pop2
    //   370: sipush 4096
    //   373: newarray <illegal type>
    //   375: astore_0
    //   376: aload 6
    //   378: aload_0
    //   379: invokevirtual 332	java/io/FileInputStream:read	([B)I
    //   382: pop
    //   383: aload 7
    //   385: aload_0
    //   386: invokestatic 338	java/util/Arrays:equals	([B[B)Z
    //   389: ifeq +31 -> 420
    //   392: ldc -91
    //   394: ldc_w 340
    //   397: invokestatic 173	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   400: aload 6
    //   402: invokevirtual 343	java/io/FileInputStream:close	()V
    //   405: aload_1
    //   406: invokevirtual 343	java/io/FileInputStream:close	()V
    //   409: ldc2_w 261
    //   412: ldc_w 263
    //   415: invokestatic 87	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   418: iconst_0
    //   419: ireturn
    //   420: aload 6
    //   422: invokevirtual 343	java/io/FileInputStream:close	()V
    //   425: aload_1
    //   426: invokevirtual 343	java/io/FileInputStream:close	()V
    //   429: ldc2_w 261
    //   432: ldc_w 263
    //   435: invokestatic 87	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   438: iconst_1
    //   439: ireturn
    //   440: astore 6
    //   442: aconst_null
    //   443: astore_0
    //   444: aload 7
    //   446: astore_1
    //   447: ldc -91
    //   449: new 293	java/lang/StringBuilder
    //   452: dup
    //   453: ldc_w 345
    //   456: invokespecial 296	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   459: aload 6
    //   461: invokevirtual 346	java/lang/Exception:toString	()Ljava/lang/String;
    //   464: invokevirtual 305	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: invokevirtual 309	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   470: invokestatic 173	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   473: aload_1
    //   474: ifnull +7 -> 481
    //   477: aload_1
    //   478: invokevirtual 343	java/io/FileInputStream:close	()V
    //   481: aload_0
    //   482: ifnull -53 -> 429
    //   485: aload_0
    //   486: invokevirtual 343	java/io/FileInputStream:close	()V
    //   489: goto -60 -> 429
    //   492: astore_0
    //   493: goto -64 -> 429
    //   496: astore_0
    //   497: aconst_null
    //   498: astore_1
    //   499: aconst_null
    //   500: astore 6
    //   502: aload 6
    //   504: ifnull +8 -> 512
    //   507: aload 6
    //   509: invokevirtual 343	java/io/FileInputStream:close	()V
    //   512: aload_1
    //   513: ifnull +7 -> 520
    //   516: aload_1
    //   517: invokevirtual 343	java/io/FileInputStream:close	()V
    //   520: aload_0
    //   521: athrow
    //   522: astore_0
    //   523: goto -118 -> 405
    //   526: astore_0
    //   527: goto -118 -> 409
    //   530: astore_0
    //   531: goto -106 -> 425
    //   534: astore_0
    //   535: goto -106 -> 429
    //   538: astore_1
    //   539: goto -58 -> 481
    //   542: astore 6
    //   544: goto -32 -> 512
    //   547: astore_1
    //   548: goto -28 -> 520
    //   551: astore_0
    //   552: aconst_null
    //   553: astore_1
    //   554: goto -52 -> 502
    //   557: astore_0
    //   558: goto -56 -> 502
    //   561: astore 8
    //   563: aload_0
    //   564: astore 6
    //   566: aload_1
    //   567: astore 7
    //   569: aload 8
    //   571: astore_0
    //   572: aload 6
    //   574: astore_1
    //   575: aload 7
    //   577: astore 6
    //   579: goto -77 -> 502
    //   582: astore 7
    //   584: aconst_null
    //   585: astore_0
    //   586: aload 6
    //   588: astore_1
    //   589: aload 7
    //   591: astore 6
    //   593: goto -146 -> 447
    //   596: astore 7
    //   598: aload_1
    //   599: astore_0
    //   600: aload 6
    //   602: astore_1
    //   603: aload 7
    //   605: astore 6
    //   607: goto -160 -> 447
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	610	0	paramString1	String
    //   0	610	1	paramString2	String
    //   138	172	2	i	int
    //   101	208	3	j	int
    //   76	52	4	l	long
    //   20	401	6	localObject1	Object
    //   440	20	6	localException1	Exception
    //   500	8	6	localObject2	Object
    //   542	1	6	localIOException	IOException
    //   564	42	6	localObject3	Object
    //   1	575	7	localObject4	Object
    //   582	8	7	localException2	Exception
    //   596	8	7	localException3	Exception
    //   30	325	8	localFile	java.io.File
    //   561	9	8	localObject5	Object
    //   122	142	9	localf	f
    //   85	190	10	localObject6	Object
    //   233	47	11	localPInt	PInt
    // Exception table:
    //   from	to	target	type
    //   313	324	440	java/lang/Exception
    //   485	489	492	java/io/IOException
    //   313	324	496	finally
    //   400	405	522	java/io/IOException
    //   405	409	526	java/io/IOException
    //   420	425	530	java/io/IOException
    //   425	429	534	java/io/IOException
    //   477	481	538	java/io/IOException
    //   507	512	542	java/io/IOException
    //   516	520	547	java/io/IOException
    //   324	360	551	finally
    //   360	400	557	finally
    //   447	473	561	finally
    //   324	360	582	java/lang/Exception
    //   360	400	596	java/lang/Exception
  }
  
  /* Error */
  public static boolean b(String paramString1, String paramString2, PInt paramPInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: aconst_null
    //   4: astore 7
    //   6: ldc2_w 349
    //   9: ldc_w 351
    //   12: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   15: new 265	java/io/File
    //   18: dup
    //   19: aload_0
    //   20: invokespecial 266	java/io/File:<init>	(Ljava/lang/String;)V
    //   23: astore 5
    //   25: new 265	java/io/File
    //   28: dup
    //   29: aload_1
    //   30: invokespecial 266	java/io/File:<init>	(Ljava/lang/String;)V
    //   33: astore 9
    //   35: new 323	java/io/FileInputStream
    //   38: dup
    //   39: aload 5
    //   41: invokespecial 326	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   44: astore 5
    //   46: aload 5
    //   48: invokevirtual 355	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   51: astore 10
    //   53: new 357	java/io/FileOutputStream
    //   56: dup
    //   57: aload 9
    //   59: invokespecial 358	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   62: astore 6
    //   64: aload 10
    //   66: aload 6
    //   68: invokevirtual 359	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   71: aload_2
    //   72: invokestatic 361	com/tencent/mm/plugin/a/d:a	(Ljava/nio/channels/FileChannel;Ljava/nio/channels/FileChannel;Lcom/tencent/mm/pointers/PInt;)Z
    //   75: istore_3
    //   76: iload_3
    //   77: istore 4
    //   79: iload_3
    //   80: ifeq +10 -> 90
    //   83: aload_0
    //   84: aload_1
    //   85: invokestatic 363	com/tencent/mm/plugin/a/d:as	(Ljava/lang/String;Ljava/lang/String;)Z
    //   88: istore 4
    //   90: aload 5
    //   92: invokestatic 366	com/tencent/mm/plugin/a/d:d	(Ljava/io/Closeable;)V
    //   95: aload 6
    //   97: invokestatic 366	com/tencent/mm/plugin/a/d:d	(Ljava/io/Closeable;)V
    //   100: iload 4
    //   102: ifne +9 -> 111
    //   105: aload 9
    //   107: invokevirtual 370	java/io/File:delete	()Z
    //   110: pop
    //   111: ldc2_w 349
    //   114: ldc_w 351
    //   117: invokestatic 87	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   120: iload 4
    //   122: ireturn
    //   123: astore_1
    //   124: aconst_null
    //   125: astore_0
    //   126: iconst_0
    //   127: istore_3
    //   128: aload 7
    //   130: astore_2
    //   131: ldc -91
    //   133: new 293	java/lang/StringBuilder
    //   136: dup
    //   137: ldc_w 345
    //   140: invokespecial 296	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   143: aload_1
    //   144: invokevirtual 346	java/lang/Exception:toString	()Ljava/lang/String;
    //   147: invokevirtual 305	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 309	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokestatic 173	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   156: aload_0
    //   157: invokestatic 366	com/tencent/mm/plugin/a/d:d	(Ljava/io/Closeable;)V
    //   160: aload_2
    //   161: invokestatic 366	com/tencent/mm/plugin/a/d:d	(Ljava/io/Closeable;)V
    //   164: iload_3
    //   165: istore 4
    //   167: goto -67 -> 100
    //   170: astore_1
    //   171: aconst_null
    //   172: astore_0
    //   173: aload 8
    //   175: astore_2
    //   176: aload_0
    //   177: invokestatic 366	com/tencent/mm/plugin/a/d:d	(Ljava/io/Closeable;)V
    //   180: aload_2
    //   181: invokestatic 366	com/tencent/mm/plugin/a/d:d	(Ljava/io/Closeable;)V
    //   184: aload_1
    //   185: athrow
    //   186: astore_1
    //   187: aload 5
    //   189: astore_0
    //   190: aload 8
    //   192: astore_2
    //   193: goto -17 -> 176
    //   196: astore_1
    //   197: aload 6
    //   199: astore_2
    //   200: aload 5
    //   202: astore_0
    //   203: goto -27 -> 176
    //   206: astore_1
    //   207: goto -31 -> 176
    //   210: astore_1
    //   211: aload 5
    //   213: astore_0
    //   214: iconst_0
    //   215: istore_3
    //   216: aload 7
    //   218: astore_2
    //   219: goto -88 -> 131
    //   222: astore_1
    //   223: aload 6
    //   225: astore_2
    //   226: aload 5
    //   228: astore_0
    //   229: iconst_0
    //   230: istore_3
    //   231: goto -100 -> 131
    //   234: astore_1
    //   235: aload 6
    //   237: astore_2
    //   238: aload 5
    //   240: astore_0
    //   241: goto -110 -> 131
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	244	0	paramString1	String
    //   0	244	1	paramString2	String
    //   0	244	2	paramPInt	PInt
    //   75	156	3	bool1	boolean
    //   77	89	4	bool2	boolean
    //   23	216	5	localObject1	Object
    //   62	174	6	localFileOutputStream	java.io.FileOutputStream
    //   4	213	7	localObject2	Object
    //   1	190	8	localObject3	Object
    //   33	73	9	localFile	java.io.File
    //   51	14	10	localFileChannel	FileChannel
    // Exception table:
    //   from	to	target	type
    //   35	46	123	java/lang/Exception
    //   35	46	170	finally
    //   46	64	186	finally
    //   64	76	196	finally
    //   83	90	196	finally
    //   131	156	206	finally
    //   46	64	210	java/lang/Exception
    //   64	76	222	java/lang/Exception
    //   83	90	234	java/lang/Exception
  }
  
  private static void d(Closeable paramCloseable)
  {
    GMTrace.i(16389997854720L, 122115);
    if (paramCloseable != null) {
      try
      {
        paramCloseable.close();
        GMTrace.o(16389997854720L, 122115);
        return;
      }
      catch (IOException paramCloseable)
      {
        w.w("MicroMsg.FastStart", "Failed to close file: ");
      }
    }
    GMTrace.o(16389997854720L, 122115);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
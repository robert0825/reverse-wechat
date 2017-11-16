package com.tencent.mm.e.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b
{
  DataOutputStream ezp;
  int ezq;
  public String mFilePath;
  
  public b(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(4468242382848L, 33291);
    this.mFilePath = paramString;
    paramString = new File(paramString);
    try
    {
      paramString.createNewFile();
      this.ezp = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(paramString)));
      paramString = ByteBuffer.allocate(44);
      paramString.order(ByteOrder.LITTLE_ENDIAN);
      paramString.putInt(1179011410);
      paramString.putInt(0);
      paramString.putInt(1163280727);
      paramString.putInt(544501094);
      paramString.putInt(16);
      paramString.putShort((short)1);
      paramString.putShort((short)paramInt1);
      paramString.putInt(paramInt2);
      paramString.putInt(paramInt2 * paramInt1 * 2);
      paramString.putShort((short)(paramInt1 * 2));
      paramString.putShort((short)16);
      paramString.putInt(1635017060);
      paramString.putInt(0);
      this.ezq = 44;
      this.ezp.write(paramString.array());
      GMTrace.o(4468242382848L, 33291);
      return;
    }
    catch (IOException paramString)
    {
      w.e("MicroMsg.PcmWriter", "create file failed: " + paramString.getMessage());
      GMTrace.o(4468242382848L, 33291);
    }
  }
  
  public final boolean h(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(4468376600576L, 33292);
    if (this.ezp == null)
    {
      GMTrace.o(4468376600576L, 33292);
      return false;
    }
    try
    {
      this.ezp.write(paramArrayOfByte, 0, paramInt);
      this.ezq += paramInt;
      GMTrace.o(4468376600576L, 33292);
      return true;
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("MicroMsg.PcmWriter", "write to file failed: " + paramArrayOfByte.getMessage());
      GMTrace.o(4468376600576L, 33292);
    }
    return false;
  }
  
  /* Error */
  public final void qK()
  {
    // Byte code:
    //   0: ldc2_w 134
    //   3: ldc -120
    //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 52	com/tencent/mm/e/c/b:ezp	Ljava/io/DataOutputStream;
    //   12: invokevirtual 139	java/io/DataOutputStream:close	()V
    //   15: new 141	java/io/RandomAccessFile
    //   18: dup
    //   19: aload_0
    //   20: getfield 28	com/tencent/mm/e/c/b:mFilePath	Ljava/lang/String;
    //   23: ldc -113
    //   25: invokespecial 145	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   28: astore_2
    //   29: aload_2
    //   30: astore_1
    //   31: aload_2
    //   32: ldc2_w 146
    //   35: invokevirtual 151	java/io/RandomAccessFile:seek	(J)V
    //   38: aload_2
    //   39: astore_1
    //   40: iconst_4
    //   41: invokestatic 58	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   44: astore_3
    //   45: aload_2
    //   46: astore_1
    //   47: aload_3
    //   48: getstatic 64	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   51: invokevirtual 68	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   54: pop
    //   55: aload_2
    //   56: astore_1
    //   57: aload_3
    //   58: aload_0
    //   59: getfield 81	com/tencent/mm/e/c/b:ezq	I
    //   62: bipush 8
    //   64: isub
    //   65: invokevirtual 72	java/nio/ByteBuffer:putInt	(I)Ljava/nio/ByteBuffer;
    //   68: pop
    //   69: aload_2
    //   70: astore_1
    //   71: aload_2
    //   72: aload_3
    //   73: invokevirtual 85	java/nio/ByteBuffer:array	()[B
    //   76: invokevirtual 152	java/io/RandomAccessFile:write	([B)V
    //   79: aload_2
    //   80: astore_1
    //   81: aload_3
    //   82: invokevirtual 156	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   85: pop
    //   86: aload_2
    //   87: astore_1
    //   88: aload_3
    //   89: aload_0
    //   90: getfield 81	com/tencent/mm/e/c/b:ezq	I
    //   93: bipush 42
    //   95: isub
    //   96: invokevirtual 72	java/nio/ByteBuffer:putInt	(I)Ljava/nio/ByteBuffer;
    //   99: pop
    //   100: aload_2
    //   101: astore_1
    //   102: aload_2
    //   103: ldc2_w 157
    //   106: invokevirtual 151	java/io/RandomAccessFile:seek	(J)V
    //   109: aload_2
    //   110: astore_1
    //   111: aload_2
    //   112: aload_3
    //   113: invokevirtual 85	java/nio/ByteBuffer:array	()[B
    //   116: invokevirtual 152	java/io/RandomAccessFile:write	([B)V
    //   119: aload_2
    //   120: invokevirtual 159	java/io/RandomAccessFile:close	()V
    //   123: ldc2_w 134
    //   126: ldc -120
    //   128: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   131: return
    //   132: astore_1
    //   133: ldc 94
    //   135: new 96	java/lang/StringBuilder
    //   138: dup
    //   139: ldc -95
    //   141: invokespecial 99	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   144: aload_1
    //   145: invokevirtual 103	java/io/IOException:getMessage	()Ljava/lang/String;
    //   148: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   154: invokestatic 116	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   157: goto -142 -> 15
    //   160: astore_1
    //   161: ldc 94
    //   163: aload_1
    //   164: ldc -93
    //   166: iconst_0
    //   167: anewarray 4	java/lang/Object
    //   170: invokestatic 167	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: ldc2_w 134
    //   176: ldc -120
    //   178: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   181: return
    //   182: astore_3
    //   183: aconst_null
    //   184: astore_2
    //   185: aload_2
    //   186: astore_1
    //   187: ldc 94
    //   189: aload_3
    //   190: ldc -93
    //   192: iconst_0
    //   193: anewarray 4	java/lang/Object
    //   196: invokestatic 167	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: aload_2
    //   200: ifnull +123 -> 323
    //   203: aload_2
    //   204: invokevirtual 159	java/io/RandomAccessFile:close	()V
    //   207: ldc2_w 134
    //   210: ldc -120
    //   212: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   215: return
    //   216: astore_1
    //   217: ldc 94
    //   219: aload_1
    //   220: ldc -93
    //   222: iconst_0
    //   223: anewarray 4	java/lang/Object
    //   226: invokestatic 167	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: ldc2_w 134
    //   232: ldc -120
    //   234: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   237: return
    //   238: astore_3
    //   239: aconst_null
    //   240: astore_2
    //   241: aload_2
    //   242: astore_1
    //   243: ldc 94
    //   245: aload_3
    //   246: ldc -93
    //   248: iconst_0
    //   249: anewarray 4	java/lang/Object
    //   252: invokestatic 167	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   255: aload_2
    //   256: ifnull +67 -> 323
    //   259: aload_2
    //   260: invokevirtual 159	java/io/RandomAccessFile:close	()V
    //   263: ldc2_w 134
    //   266: ldc -120
    //   268: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   271: return
    //   272: astore_1
    //   273: ldc 94
    //   275: aload_1
    //   276: ldc -93
    //   278: iconst_0
    //   279: anewarray 4	java/lang/Object
    //   282: invokestatic 167	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   285: ldc2_w 134
    //   288: ldc -120
    //   290: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   293: return
    //   294: astore_2
    //   295: aconst_null
    //   296: astore_1
    //   297: aload_1
    //   298: ifnull +7 -> 305
    //   301: aload_1
    //   302: invokevirtual 159	java/io/RandomAccessFile:close	()V
    //   305: aload_2
    //   306: athrow
    //   307: astore_1
    //   308: ldc 94
    //   310: aload_1
    //   311: ldc -93
    //   313: iconst_0
    //   314: anewarray 4	java/lang/Object
    //   317: invokestatic 167	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   320: goto -15 -> 305
    //   323: ldc2_w 134
    //   326: ldc -120
    //   328: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   331: return
    //   332: astore_2
    //   333: goto -36 -> 297
    //   336: astore_3
    //   337: goto -96 -> 241
    //   340: astore_3
    //   341: goto -156 -> 185
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	344	0	this	b
    //   30	81	1	localRandomAccessFile1	java.io.RandomAccessFile
    //   132	13	1	localIOException1	IOException
    //   160	4	1	localIOException2	IOException
    //   186	1	1	localRandomAccessFile2	java.io.RandomAccessFile
    //   216	4	1	localIOException3	IOException
    //   242	1	1	localRandomAccessFile3	java.io.RandomAccessFile
    //   272	4	1	localIOException4	IOException
    //   296	6	1	localObject1	Object
    //   307	4	1	localIOException5	IOException
    //   28	232	2	localRandomAccessFile4	java.io.RandomAccessFile
    //   294	12	2	localObject2	Object
    //   332	1	2	localObject3	Object
    //   44	69	3	localByteBuffer	ByteBuffer
    //   182	8	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   238	8	3	localIOException6	IOException
    //   336	1	3	localIOException7	IOException
    //   340	1	3	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   8	15	132	java/io/IOException
    //   119	123	160	java/io/IOException
    //   15	29	182	java/io/FileNotFoundException
    //   203	207	216	java/io/IOException
    //   15	29	238	java/io/IOException
    //   259	263	272	java/io/IOException
    //   15	29	294	finally
    //   301	305	307	java/io/IOException
    //   31	38	332	finally
    //   40	45	332	finally
    //   47	55	332	finally
    //   57	69	332	finally
    //   71	79	332	finally
    //   81	86	332	finally
    //   88	100	332	finally
    //   102	109	332	finally
    //   111	119	332	finally
    //   187	199	332	finally
    //   243	255	332	finally
    //   31	38	336	java/io/IOException
    //   40	45	336	java/io/IOException
    //   47	55	336	java/io/IOException
    //   57	69	336	java/io/IOException
    //   71	79	336	java/io/IOException
    //   81	86	336	java/io/IOException
    //   88	100	336	java/io/IOException
    //   102	109	336	java/io/IOException
    //   111	119	336	java/io/IOException
    //   31	38	340	java/io/FileNotFoundException
    //   40	45	340	java/io/FileNotFoundException
    //   47	55	340	java/io/FileNotFoundException
    //   57	69	340	java/io/FileNotFoundException
    //   71	79	340	java/io/FileNotFoundException
    //   81	86	340	java/io/FileNotFoundException
    //   88	100	340	java/io/FileNotFoundException
    //   102	109	340	java/io/FileNotFoundException
    //   111	119	340	java/io/FileNotFoundException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\e\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.backup.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.n;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

public final class c
{
  public static String S(byte[] paramArrayOfByte)
  {
    GMTrace.i(14812805332992L, 110364);
    String str = "";
    int i;
    if (paramArrayOfByte.length > 100) {
      i = paramArrayOfByte.length - 100;
    }
    while (i < paramArrayOfByte.length)
    {
      str = str + Integer.toHexString(paramArrayOfByte[i] & 0xFF) + " ";
      i += 1;
      continue;
      i = 0;
    }
    w.e("MicroMsg.BackupPacker", "dump errBuf: %s", new Object[] { str });
    GMTrace.o(14812805332992L, 110364);
    return str;
  }
  
  public static int a(byte[] paramArrayOfByte1, int paramInt1, short paramShort1, short paramShort2, int paramInt2, byte[] paramArrayOfByte2)
  {
    GMTrace.i(14812671115264L, 110363);
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      localByteArrayOutputStream.write(paramArrayOfByte1);
      localByteArrayOutputStream.write(n.cS(paramInt1));
      localByteArrayOutputStream.write(new byte[] { (byte)(paramShort1 >> 8 & 0xFF), (byte)(paramShort1 & 0xFF) });
      localByteArrayOutputStream.write(new byte[] { (byte)(paramShort2 >> 8 & 0xFF), (byte)(paramShort2 & 0xFF) });
      localByteArrayOutputStream.write(n.cS(paramInt2));
      localByteArrayOutputStream.write(n.cS(0));
      localByteArrayOutputStream.write(paramArrayOfByte2);
      paramArrayOfByte1 = new CRC32();
      paramArrayOfByte1.update(localByteArrayOutputStream.toByteArray());
      long l = paramArrayOfByte1.getValue();
      paramInt1 = (int)l;
      GMTrace.o(14812671115264L, 110363);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte1)
    {
      w.printErrStackTrace("MicroMsg.BackupPacker", paramArrayOfByte1, "", new Object[0]);
      GMTrace.o(14812671115264L, 110363);
    }
    return 0;
  }
  
  /* Error */
  public static void a(byte[] paramArrayOfByte, int paramInt1, short paramShort, com.tencent.mm.pointers.PByteArray paramPByteArray, int paramInt2)
  {
    // Byte code:
    //   0: ldc2_w 93
    //   3: ldc 95
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 62	java/io/ByteArrayOutputStream
    //   11: dup
    //   12: invokespecial 63	java/io/ByteArrayOutputStream:<init>	()V
    //   15: astore 6
    //   17: aload_0
    //   18: astore 7
    //   20: iload_2
    //   21: iconst_1
    //   22: if_icmpeq +11 -> 33
    //   25: iload_2
    //   26: iconst_2
    //   27: if_icmpne +213 -> 240
    //   30: aload_0
    //   31: astore 7
    //   33: aload 6
    //   35: astore 5
    //   37: aload 6
    //   39: ldc 97
    //   41: invokevirtual 102	java/lang/String:getBytes	()[B
    //   44: invokevirtual 67	java/io/ByteArrayOutputStream:write	([B)V
    //   47: aload 6
    //   49: astore 5
    //   51: aload 6
    //   53: iload_1
    //   54: invokestatic 73	com/tencent/mm/a/n:cS	(I)[B
    //   57: invokevirtual 67	java/io/ByteArrayOutputStream:write	([B)V
    //   60: aload 6
    //   62: astore 5
    //   64: aload 6
    //   66: iconst_2
    //   67: newarray <illegal type>
    //   69: dup
    //   70: iconst_0
    //   71: iconst_0
    //   72: bastore
    //   73: dup
    //   74: iconst_1
    //   75: iconst_1
    //   76: bastore
    //   77: invokevirtual 67	java/io/ByteArrayOutputStream:write	([B)V
    //   80: aload 6
    //   82: astore 5
    //   84: aload 6
    //   86: iconst_2
    //   87: newarray <illegal type>
    //   89: dup
    //   90: iconst_0
    //   91: iload_2
    //   92: bipush 8
    //   94: ishr
    //   95: sipush 255
    //   98: iand
    //   99: i2b
    //   100: bastore
    //   101: dup
    //   102: iconst_1
    //   103: iload_2
    //   104: sipush 255
    //   107: iand
    //   108: i2b
    //   109: bastore
    //   110: invokevirtual 67	java/io/ByteArrayOutputStream:write	([B)V
    //   113: aload 6
    //   115: astore 5
    //   117: aload 6
    //   119: aload 7
    //   121: arraylength
    //   122: bipush 20
    //   124: iadd
    //   125: invokestatic 73	com/tencent/mm/a/n:cS	(I)[B
    //   128: invokevirtual 67	java/io/ByteArrayOutputStream:write	([B)V
    //   131: aload 6
    //   133: astore 5
    //   135: aload 6
    //   137: iconst_0
    //   138: invokestatic 73	com/tencent/mm/a/n:cS	(I)[B
    //   141: invokevirtual 67	java/io/ByteArrayOutputStream:write	([B)V
    //   144: aload 6
    //   146: astore 5
    //   148: aload 6
    //   150: aload 7
    //   152: invokevirtual 67	java/io/ByteArrayOutputStream:write	([B)V
    //   155: aload 6
    //   157: astore 5
    //   159: aload_3
    //   160: aload 6
    //   162: invokevirtual 80	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   165: putfield 108	com/tencent/mm/pointers/PByteArray:value	[B
    //   168: iload 4
    //   170: iconst_1
    //   171: if_icmpne +50 -> 221
    //   174: aload 6
    //   176: astore 5
    //   178: new 75	java/util/zip/CRC32
    //   181: dup
    //   182: invokespecial 76	java/util/zip/CRC32:<init>	()V
    //   185: astore_0
    //   186: aload 6
    //   188: astore 5
    //   190: aload_0
    //   191: aload_3
    //   192: getfield 108	com/tencent/mm/pointers/PByteArray:value	[B
    //   195: invokevirtual 83	java/util/zip/CRC32:update	([B)V
    //   198: aload 6
    //   200: astore 5
    //   202: aload_0
    //   203: invokevirtual 87	java/util/zip/CRC32:getValue	()J
    //   206: l2i
    //   207: invokestatic 73	com/tencent/mm/a/n:cS	(I)[B
    //   210: iconst_0
    //   211: aload_3
    //   212: getfield 108	com/tencent/mm/pointers/PByteArray:value	[B
    //   215: bipush 16
    //   217: iconst_4
    //   218: invokestatic 114	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   221: aload 6
    //   223: invokevirtual 117	java/io/ByteArrayOutputStream:reset	()V
    //   226: aload 6
    //   228: invokevirtual 120	java/io/ByteArrayOutputStream:close	()V
    //   231: ldc2_w 93
    //   234: ldc 95
    //   236: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   239: return
    //   240: aload 6
    //   242: astore 5
    //   244: aload_0
    //   245: invokestatic 125	com/tencent/mm/plugin/backup/a/e:aem	()[B
    //   248: invokestatic 131	com/tencent/mm/a/k:b	([B[B)[B
    //   251: astore 7
    //   253: goto -220 -> 33
    //   256: astore_0
    //   257: ldc2_w 93
    //   260: ldc 95
    //   262: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   265: return
    //   266: astore_3
    //   267: aconst_null
    //   268: astore_0
    //   269: aload_0
    //   270: astore 5
    //   272: ldc 41
    //   274: aload_3
    //   275: ldc 17
    //   277: iconst_0
    //   278: anewarray 4	java/lang/Object
    //   281: invokestatic 91	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: aload_0
    //   285: ifnull +51 -> 336
    //   288: aload_0
    //   289: invokevirtual 117	java/io/ByteArrayOutputStream:reset	()V
    //   292: aload_0
    //   293: invokevirtual 120	java/io/ByteArrayOutputStream:close	()V
    //   296: ldc2_w 93
    //   299: ldc 95
    //   301: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   304: return
    //   305: astore_0
    //   306: ldc2_w 93
    //   309: ldc 95
    //   311: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   314: return
    //   315: astore_0
    //   316: aconst_null
    //   317: astore 5
    //   319: aload 5
    //   321: ifnull +13 -> 334
    //   324: aload 5
    //   326: invokevirtual 117	java/io/ByteArrayOutputStream:reset	()V
    //   329: aload 5
    //   331: invokevirtual 120	java/io/ByteArrayOutputStream:close	()V
    //   334: aload_0
    //   335: athrow
    //   336: ldc2_w 93
    //   339: ldc 95
    //   341: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   344: return
    //   345: astore_3
    //   346: goto -12 -> 334
    //   349: astore_0
    //   350: goto -31 -> 319
    //   353: astore_3
    //   354: aload 6
    //   356: astore_0
    //   357: goto -88 -> 269
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	360	0	paramArrayOfByte	byte[]
    //   0	360	1	paramInt1	int
    //   0	360	2	paramShort	short
    //   0	360	3	paramPByteArray	com.tencent.mm.pointers.PByteArray
    //   0	360	4	paramInt2	int
    //   35	295	5	localObject	Object
    //   15	340	6	localByteArrayOutputStream	ByteArrayOutputStream
    //   18	234	7	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   221	231	256	java/io/IOException
    //   8	17	266	java/io/IOException
    //   288	296	305	java/io/IOException
    //   8	17	315	finally
    //   324	334	345	java/io/IOException
    //   37	47	349	finally
    //   51	60	349	finally
    //   64	80	349	finally
    //   84	113	349	finally
    //   117	131	349	finally
    //   135	144	349	finally
    //   148	155	349	finally
    //   159	168	349	finally
    //   178	186	349	finally
    //   190	198	349	finally
    //   202	221	349	finally
    //   244	253	349	finally
    //   272	284	349	finally
    //   37	47	353	java/io/IOException
    //   51	60	353	java/io/IOException
    //   64	80	353	java/io/IOException
    //   84	113	353	java/io/IOException
    //   117	131	353	java/io/IOException
    //   135	144	353	java/io/IOException
    //   148	155	353	java/io/IOException
    //   159	168	353	java/io/IOException
    //   178	186	353	java/io/IOException
    //   190	198	353	java/io/IOException
    //   202	221	353	java/io/IOException
    //   244	253	353	java/io/IOException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
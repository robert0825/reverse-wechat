package com.tencent.mm.plugin.exdevice.j;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public final class b
{
  public static boolean a(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    GMTrace.i(11115106926592L, 82814);
    if ((bg.bq(paramArrayOfByte1)) || (bg.bq(paramArrayOfByte2)) || (paramArrayOfByte2.length + paramInt > paramArrayOfByte1.length) || (paramInt < 0) || (paramInt >= paramArrayOfByte1.length))
    {
      GMTrace.o(11115106926592L, 82814);
      return false;
    }
    int i = 0;
    while ((i < paramArrayOfByte2.length) && (paramArrayOfByte2[i] == paramArrayOfByte1[(i + paramInt)])) {
      i += 1;
    }
    if (i != paramArrayOfByte2.length)
    {
      GMTrace.o(11115106926592L, 82814);
      return false;
    }
    GMTrace.o(11115106926592L, 82814);
    return true;
  }
  
  /* Error */
  public static byte[] aW(Object paramObject)
  {
    // Byte code:
    //   0: ldc2_w 30
    //   3: ldc 32
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 34	java/io/ByteArrayOutputStream
    //   11: dup
    //   12: invokespecial 38	java/io/ByteArrayOutputStream:<init>	()V
    //   15: astore 4
    //   17: new 40	java/io/ObjectOutputStream
    //   20: dup
    //   21: aload 4
    //   23: invokespecial 43	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   26: astore_3
    //   27: aload_3
    //   28: astore_1
    //   29: aload_3
    //   30: aload_0
    //   31: invokevirtual 47	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   34: aload_3
    //   35: astore_1
    //   36: aload_3
    //   37: invokevirtual 50	java/io/ObjectOutputStream:flush	()V
    //   40: aload_3
    //   41: astore_1
    //   42: aload 4
    //   44: invokevirtual 54	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   47: astore_0
    //   48: aload_0
    //   49: ifnonnull +12 -> 61
    //   52: aload_3
    //   53: astore_1
    //   54: ldc 56
    //   56: ldc 58
    //   58: invokestatic 64	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: aload_3
    //   62: invokevirtual 67	java/io/ObjectOutputStream:close	()V
    //   65: aload 4
    //   67: invokevirtual 68	java/io/ByteArrayOutputStream:close	()V
    //   70: ldc2_w 30
    //   73: ldc 32
    //   75: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   78: aload_0
    //   79: areturn
    //   80: astore_1
    //   81: ldc 56
    //   83: aload_1
    //   84: ldc 70
    //   86: iconst_0
    //   87: anewarray 4	java/lang/Object
    //   90: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: goto -28 -> 65
    //   96: astore_1
    //   97: ldc 56
    //   99: aload_1
    //   100: ldc 70
    //   102: iconst_0
    //   103: anewarray 4	java/lang/Object
    //   106: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: goto -39 -> 70
    //   112: astore_2
    //   113: aconst_null
    //   114: astore_3
    //   115: aconst_null
    //   116: astore_0
    //   117: aload_3
    //   118: astore_1
    //   119: ldc 56
    //   121: new 76	java/lang/StringBuilder
    //   124: dup
    //   125: ldc 78
    //   127: invokespecial 81	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   130: aload_2
    //   131: invokevirtual 85	java/io/IOException:getMessage	()Ljava/lang/String;
    //   134: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: invokestatic 64	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   143: aload_3
    //   144: astore_1
    //   145: ldc 56
    //   147: aload_2
    //   148: ldc 70
    //   150: iconst_0
    //   151: anewarray 4	java/lang/Object
    //   154: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: aload_3
    //   158: ifnull +7 -> 165
    //   161: aload_3
    //   162: invokevirtual 67	java/io/ObjectOutputStream:close	()V
    //   165: aload 4
    //   167: invokevirtual 68	java/io/ByteArrayOutputStream:close	()V
    //   170: ldc2_w 30
    //   173: ldc 32
    //   175: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   178: aload_0
    //   179: areturn
    //   180: astore_1
    //   181: ldc 56
    //   183: aload_1
    //   184: ldc 70
    //   186: iconst_0
    //   187: anewarray 4	java/lang/Object
    //   190: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   193: goto -28 -> 165
    //   196: astore_1
    //   197: ldc 56
    //   199: aload_1
    //   200: ldc 70
    //   202: iconst_0
    //   203: anewarray 4	java/lang/Object
    //   206: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   209: goto -39 -> 170
    //   212: astore_0
    //   213: aconst_null
    //   214: astore_1
    //   215: aload_1
    //   216: ifnull +7 -> 223
    //   219: aload_1
    //   220: invokevirtual 67	java/io/ObjectOutputStream:close	()V
    //   223: aload 4
    //   225: invokevirtual 68	java/io/ByteArrayOutputStream:close	()V
    //   228: aload_0
    //   229: athrow
    //   230: astore_1
    //   231: ldc 56
    //   233: aload_1
    //   234: ldc 70
    //   236: iconst_0
    //   237: anewarray 4	java/lang/Object
    //   240: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   243: goto -20 -> 223
    //   246: astore_1
    //   247: ldc 56
    //   249: aload_1
    //   250: ldc 70
    //   252: iconst_0
    //   253: anewarray 4	java/lang/Object
    //   256: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: goto -31 -> 228
    //   262: astore_0
    //   263: goto -48 -> 215
    //   266: astore_2
    //   267: aconst_null
    //   268: astore_0
    //   269: goto -152 -> 117
    //   272: astore_2
    //   273: goto -156 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	paramObject	Object
    //   28	26	1	localObjectOutputStream1	java.io.ObjectOutputStream
    //   80	4	1	localIOException1	java.io.IOException
    //   96	4	1	localIOException2	java.io.IOException
    //   118	27	1	localObjectOutputStream2	java.io.ObjectOutputStream
    //   180	4	1	localIOException3	java.io.IOException
    //   196	4	1	localIOException4	java.io.IOException
    //   214	6	1	localObject	Object
    //   230	4	1	localIOException5	java.io.IOException
    //   246	4	1	localIOException6	java.io.IOException
    //   112	36	2	localIOException7	java.io.IOException
    //   266	1	2	localIOException8	java.io.IOException
    //   272	1	2	localIOException9	java.io.IOException
    //   26	136	3	localObjectOutputStream3	java.io.ObjectOutputStream
    //   15	209	4	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   61	65	80	java/io/IOException
    //   65	70	96	java/io/IOException
    //   17	27	112	java/io/IOException
    //   161	165	180	java/io/IOException
    //   165	170	196	java/io/IOException
    //   17	27	212	finally
    //   219	223	230	java/io/IOException
    //   223	228	246	java/io/IOException
    //   29	34	262	finally
    //   36	40	262	finally
    //   42	48	262	finally
    //   54	61	262	finally
    //   119	143	262	finally
    //   145	157	262	finally
    //   29	34	266	java/io/IOException
    //   36	40	266	java/io/IOException
    //   42	48	266	java/io/IOException
    //   54	61	272	java/io/IOException
  }
  
  public static String al(byte[] paramArrayOfByte)
  {
    GMTrace.i(11113496313856L, 82802);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(11113496313856L, 82802);
      return null;
    }
    paramArrayOfByte = w(paramArrayOfByte, paramArrayOfByte.length);
    GMTrace.o(11113496313856L, 82802);
    return paramArrayOfByte;
  }
  
  public static long am(byte[] paramArrayOfByte)
  {
    GMTrace.i(11113764749312L, 82804);
    long l = 0L;
    int i = 0;
    while (i < 8)
    {
      l |= (paramArrayOfByte[i] & 0xFF) << (7 - i << 3);
      i += 1;
    }
    GMTrace.o(11113764749312L, 82804);
    return l;
  }
  
  public static UUID an(byte[] paramArrayOfByte)
  {
    GMTrace.i(11114972708864L, 82813);
    w.d("MicroMsg.exdevice.Util", "parseUUIDFromByteArray, uuid byte array = %s", new Object[] { al(paramArrayOfByte) });
    if (bg.bq(paramArrayOfByte))
    {
      w.e("MicroMsg.exdevice.Util", "aUUIDByteArray is null or nil");
      GMTrace.o(11114972708864L, 82813);
      return null;
    }
    if (16 != paramArrayOfByte.length)
    {
      w.e("MicroMsg.exdevice.Util", "the length (%d) of this byte array is not 16", new Object[] { Integer.valueOf(paramArrayOfByte.length) });
      GMTrace.o(11114972708864L, 82813);
      return null;
    }
    ByteBuffer localByteBuffer1 = ByteBuffer.allocate(8);
    ByteBuffer localByteBuffer2 = ByteBuffer.allocate(8);
    try
    {
      localByteBuffer1.put(paramArrayOfByte, 0, 8);
      localByteBuffer1.flip();
      localByteBuffer2.put(paramArrayOfByte, 8, 8);
      localByteBuffer2.flip();
      paramArrayOfByte = new UUID(localByteBuffer1.getLong(), localByteBuffer2.getLong());
      w.d("MicroMsg.exdevice.Util", "parse successful, string of uuid = %s", new Object[] { paramArrayOfByte.toString() });
      GMTrace.o(11114972708864L, 82813);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("MicroMsg.exdevice.Util", "%s", new Object[] { paramArrayOfByte.getMessage() });
      GMTrace.o(11114972708864L, 82813);
    }
    return null;
  }
  
  /* Error */
  public static Object ao(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc2_w 171
    //   5: ldc -83
    //   7: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: ifnonnull +13 -> 24
    //   14: ldc2_w 171
    //   17: ldc -83
    //   19: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   22: aconst_null
    //   23: areturn
    //   24: new 175	java/io/ByteArrayInputStream
    //   27: dup
    //   28: aload_0
    //   29: invokespecial 178	java/io/ByteArrayInputStream:<init>	([B)V
    //   32: astore 4
    //   34: new 180	java/io/ObjectInputStream
    //   37: dup
    //   38: aload 4
    //   40: invokespecial 183	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   43: astore_1
    //   44: aload_1
    //   45: astore_0
    //   46: aload_1
    //   47: invokevirtual 187	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   50: astore_2
    //   51: aload_2
    //   52: astore_0
    //   53: aload_1
    //   54: invokevirtual 188	java/io/ObjectInputStream:close	()V
    //   57: aload 4
    //   59: invokevirtual 189	java/io/ByteArrayInputStream:close	()V
    //   62: ldc2_w 171
    //   65: ldc -83
    //   67: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   70: aload_0
    //   71: areturn
    //   72: astore_1
    //   73: ldc 56
    //   75: aload_1
    //   76: ldc 70
    //   78: iconst_0
    //   79: anewarray 4	java/lang/Object
    //   82: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: goto -28 -> 57
    //   88: astore_1
    //   89: ldc 56
    //   91: aload_1
    //   92: ldc 70
    //   94: iconst_0
    //   95: anewarray 4	java/lang/Object
    //   98: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: goto -39 -> 62
    //   104: astore_2
    //   105: aconst_null
    //   106: astore_1
    //   107: aload_1
    //   108: astore_0
    //   109: ldc 56
    //   111: new 76	java/lang/StringBuilder
    //   114: dup
    //   115: ldc -65
    //   117: invokespecial 81	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   120: aload_2
    //   121: invokevirtual 192	java/io/StreamCorruptedException:getMessage	()Ljava/lang/String;
    //   124: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: invokestatic 64	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   133: aload_1
    //   134: astore_0
    //   135: ldc 56
    //   137: aload_2
    //   138: ldc 70
    //   140: iconst_0
    //   141: anewarray 4	java/lang/Object
    //   144: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: aload_1
    //   148: ifnull +7 -> 155
    //   151: aload_1
    //   152: invokevirtual 188	java/io/ObjectInputStream:close	()V
    //   155: aload 4
    //   157: invokevirtual 189	java/io/ByteArrayInputStream:close	()V
    //   160: aload_3
    //   161: astore_0
    //   162: goto -100 -> 62
    //   165: astore_0
    //   166: ldc 56
    //   168: aload_0
    //   169: ldc 70
    //   171: iconst_0
    //   172: anewarray 4	java/lang/Object
    //   175: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: aload_3
    //   179: astore_0
    //   180: goto -118 -> 62
    //   183: astore_0
    //   184: ldc 56
    //   186: aload_0
    //   187: ldc 70
    //   189: iconst_0
    //   190: anewarray 4	java/lang/Object
    //   193: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   196: goto -41 -> 155
    //   199: astore_2
    //   200: aconst_null
    //   201: astore_1
    //   202: aload_1
    //   203: astore_0
    //   204: ldc 56
    //   206: new 76	java/lang/StringBuilder
    //   209: dup
    //   210: ldc -62
    //   212: invokespecial 81	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   215: aload_2
    //   216: invokevirtual 85	java/io/IOException:getMessage	()Ljava/lang/String;
    //   219: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   225: invokestatic 64	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   228: aload_1
    //   229: astore_0
    //   230: ldc 56
    //   232: aload_2
    //   233: ldc 70
    //   235: iconst_0
    //   236: anewarray 4	java/lang/Object
    //   239: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   242: aload_1
    //   243: ifnull +7 -> 250
    //   246: aload_1
    //   247: invokevirtual 188	java/io/ObjectInputStream:close	()V
    //   250: aload 4
    //   252: invokevirtual 189	java/io/ByteArrayInputStream:close	()V
    //   255: aload_3
    //   256: astore_0
    //   257: goto -195 -> 62
    //   260: astore_0
    //   261: ldc 56
    //   263: aload_0
    //   264: ldc 70
    //   266: iconst_0
    //   267: anewarray 4	java/lang/Object
    //   270: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   273: aload_3
    //   274: astore_0
    //   275: goto -213 -> 62
    //   278: astore_0
    //   279: ldc 56
    //   281: aload_0
    //   282: ldc 70
    //   284: iconst_0
    //   285: anewarray 4	java/lang/Object
    //   288: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   291: goto -41 -> 250
    //   294: astore_2
    //   295: aconst_null
    //   296: astore_1
    //   297: aload_1
    //   298: astore_0
    //   299: ldc 56
    //   301: new 76	java/lang/StringBuilder
    //   304: dup
    //   305: ldc -60
    //   307: invokespecial 81	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   310: aload_2
    //   311: invokevirtual 197	java/lang/ClassNotFoundException:getMessage	()Ljava/lang/String;
    //   314: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   320: invokestatic 64	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   323: aload_1
    //   324: astore_0
    //   325: ldc 56
    //   327: aload_2
    //   328: ldc 70
    //   330: iconst_0
    //   331: anewarray 4	java/lang/Object
    //   334: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   337: aload_1
    //   338: ifnull +7 -> 345
    //   341: aload_1
    //   342: invokevirtual 188	java/io/ObjectInputStream:close	()V
    //   345: aload 4
    //   347: invokevirtual 189	java/io/ByteArrayInputStream:close	()V
    //   350: aload_3
    //   351: astore_0
    //   352: goto -290 -> 62
    //   355: astore_0
    //   356: ldc 56
    //   358: aload_0
    //   359: ldc 70
    //   361: iconst_0
    //   362: anewarray 4	java/lang/Object
    //   365: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   368: aload_3
    //   369: astore_0
    //   370: goto -308 -> 62
    //   373: astore_0
    //   374: ldc 56
    //   376: aload_0
    //   377: ldc 70
    //   379: iconst_0
    //   380: anewarray 4	java/lang/Object
    //   383: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   386: goto -41 -> 345
    //   389: astore_1
    //   390: aconst_null
    //   391: astore_0
    //   392: aload_0
    //   393: ifnull +7 -> 400
    //   396: aload_0
    //   397: invokevirtual 188	java/io/ObjectInputStream:close	()V
    //   400: aload 4
    //   402: invokevirtual 189	java/io/ByteArrayInputStream:close	()V
    //   405: aload_1
    //   406: athrow
    //   407: astore_0
    //   408: ldc 56
    //   410: aload_0
    //   411: ldc 70
    //   413: iconst_0
    //   414: anewarray 4	java/lang/Object
    //   417: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   420: goto -20 -> 400
    //   423: astore_0
    //   424: ldc 56
    //   426: aload_0
    //   427: ldc 70
    //   429: iconst_0
    //   430: anewarray 4	java/lang/Object
    //   433: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   436: goto -31 -> 405
    //   439: astore_1
    //   440: goto -48 -> 392
    //   443: astore_2
    //   444: goto -147 -> 297
    //   447: astore_2
    //   448: goto -246 -> 202
    //   451: astore_2
    //   452: goto -345 -> 107
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	455	0	paramArrayOfByte	byte[]
    //   43	11	1	localObjectInputStream	java.io.ObjectInputStream
    //   72	4	1	localIOException1	java.io.IOException
    //   88	4	1	localIOException2	java.io.IOException
    //   106	236	1	localObject1	Object
    //   389	17	1	localObject2	Object
    //   439	1	1	localObject3	Object
    //   50	2	2	localObject4	Object
    //   104	34	2	localStreamCorruptedException1	java.io.StreamCorruptedException
    //   199	34	2	localIOException3	java.io.IOException
    //   294	34	2	localClassNotFoundException1	ClassNotFoundException
    //   443	1	2	localClassNotFoundException2	ClassNotFoundException
    //   447	1	2	localIOException4	java.io.IOException
    //   451	1	2	localStreamCorruptedException2	java.io.StreamCorruptedException
    //   1	368	3	localObject5	Object
    //   32	369	4	localByteArrayInputStream	java.io.ByteArrayInputStream
    // Exception table:
    //   from	to	target	type
    //   53	57	72	java/io/IOException
    //   57	62	88	java/io/IOException
    //   34	44	104	java/io/StreamCorruptedException
    //   155	160	165	java/io/IOException
    //   151	155	183	java/io/IOException
    //   34	44	199	java/io/IOException
    //   250	255	260	java/io/IOException
    //   246	250	278	java/io/IOException
    //   34	44	294	java/lang/ClassNotFoundException
    //   345	350	355	java/io/IOException
    //   341	345	373	java/io/IOException
    //   34	44	389	finally
    //   396	400	407	java/io/IOException
    //   400	405	423	java/io/IOException
    //   46	51	439	finally
    //   109	133	439	finally
    //   135	147	439	finally
    //   204	228	439	finally
    //   230	242	439	finally
    //   299	323	439	finally
    //   325	337	439	finally
    //   46	51	443	java/lang/ClassNotFoundException
    //   46	51	447	java/io/IOException
    //   46	51	451	java/io/StreamCorruptedException
  }
  
  public static String avf()
  {
    i = 7;
    GMTrace.i(11113898967040L, 82805);
    String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    Calendar localCalendar = Calendar.getInstance();
    for (;;)
    {
      try
      {
        j = bg.getInt(String.valueOf(localCalendar.get(7)), 0);
        if (j != 1) {
          continue;
        }
      }
      catch (Exception localException)
      {
        int j;
        w.e("MicroMsg.exdevice.Util", "parse day failed : %s", new Object[] { localException.getMessage() });
        i = 0;
        continue;
      }
      str = str + i;
      GMTrace.o(11113898967040L, 82805);
      return str;
      i = j - 1;
    }
  }
  
  public static long avg()
  {
    GMTrace.i(11114435837952L, 82809);
    String str = g.ut().getValue("DeviceAutoSyncDuration");
    if (!bg.nm(str)) {}
    for (;;)
    {
      try
      {
        l = Long.parseLong(str);
        l *= 1000L;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.exdevice.Util", "parse string to time out long failed : %s", new Object[] { localException.getMessage() });
        l = 60000L;
        continue;
        GMTrace.o(11114435837952L, 82809);
        return l;
      }
      w.i("MicroMsg.exdevice.Util", "now sync time out is %d", new Object[] { Long.valueOf(l) });
      if (l == 0L)
      {
        GMTrace.o(11114435837952L, 82809);
        return 60000L;
      }
      long l = 60000L;
    }
  }
  
  public static String bS(long paramLong)
  {
    int j = 0;
    GMTrace.i(11113362096128L, 82801);
    Object localObject = new byte[6];
    int i = 0;
    while (i < 6)
    {
      localObject[i] = ((byte)(int)(paramLong >> 40 - (i << 3)));
      i += 1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    i = j;
    while (i < 6)
    {
      if (i != 0) {
        localStringBuilder.append(":");
      }
      j = localObject[i] & 0xFF;
      if (j < 16) {
        localStringBuilder.append("0");
      }
      localStringBuilder.append(Integer.toHexString(j));
      i += 1;
    }
    localObject = localStringBuilder.toString().toUpperCase(Locale.US);
    GMTrace.o(11113362096128L, 82801);
    return (String)localObject;
  }
  
  public static String bT(long paramLong)
  {
    int j = 0;
    GMTrace.i(11114033184768L, 82806);
    Object localObject = new byte[6];
    int i = 0;
    while (i < 6)
    {
      localObject[i] = ((byte)(int)(paramLong >> 40 - (i << 3)));
      i += 1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    i = j;
    while (i < 6)
    {
      j = localObject[i] & 0xFF;
      if (j < 16) {
        localStringBuilder.append("0");
      }
      localStringBuilder.append(Integer.toHexString(j));
      i += 1;
    }
    localObject = localStringBuilder.toString().toUpperCase(Locale.US);
    GMTrace.o(11114033184768L, 82806);
    return (String)localObject;
  }
  
  public static boolean cd(String paramString1, String paramString2)
  {
    GMTrace.i(11114704273408L, 82811);
    w.i("MicroMsg.exdevice.Util", "isDeviceInDeviceList, device = %s, device list = %s", new Object[] { paramString1, paramString2 });
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(11114704273408L, 82811);
      return false;
    }
    try
    {
      paramString2 = paramString2.split("\\|");
      if (paramString2 == null)
      {
        w.e("MicroMsg.exdevice.Util", "null == deviceArray");
        GMTrace.o(11114704273408L, 82811);
        return false;
      }
    }
    catch (Exception paramString1)
    {
      w.e("MicroMsg.exdevice.Util", "aDeviceList.split failed, %s", new Object[] { paramString1.getMessage() });
      GMTrace.o(11114704273408L, 82811);
      return false;
    }
    int j = paramString2.length;
    int i = 0;
    while (i < j)
    {
      if (paramString2[i].equalsIgnoreCase(paramString1))
      {
        GMTrace.o(11114704273408L, 82811);
        return true;
      }
      i += 1;
    }
    GMTrace.o(11114704273408L, 82811);
    return false;
  }
  
  public static String ce(String paramString1, String paramString2)
  {
    GMTrace.i(11114838491136L, 82812);
    w.i("MicroMsg.exdevice.Util", "moveDevicefromDeviceList, device = %s, device list = %s", new Object[] { paramString1, paramString2 });
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      w.w("MicroMsg.exdevice.Util", "parameters is null or nil");
      GMTrace.o(11114838491136L, 82812);
      return null;
    }
    String[] arrayOfString;
    try
    {
      arrayOfString = paramString2.split("\\|");
      if (arrayOfString == null)
      {
        w.e("MicroMsg.exdevice.Util", "null == strArray");
        GMTrace.o(11114838491136L, 82812);
        return null;
      }
    }
    catch (Exception paramString1)
    {
      w.e("MicroMsg.exdevice.Util", "aDeviceList.split failed!!!, %s", new Object[] { paramString1.getMessage() });
      GMTrace.o(11114838491136L, 82812);
      return null;
    }
    String str1 = new String();
    int k = arrayOfString.length;
    int i = 0;
    int j = 0;
    if (i < k)
    {
      String str2 = arrayOfString[i];
      if (!str2.equalsIgnoreCase(paramString1))
      {
        str1 = str1 + str2;
        str1 = str1 + "|";
      }
      for (;;)
      {
        i += 1;
        break;
        j = 1;
      }
    }
    if (j == 0)
    {
      w.e("MicroMsg.exdevice.Util", "remove failed!!!, this device is not in the list");
      GMTrace.o(11114838491136L, 82812);
      return null;
    }
    w.i("MicroMsg.exdevice.Util", "add device to device list successful, new device list = %s", new Object[] { paramString2 });
    GMTrace.o(11114838491136L, 82812);
    return str1;
  }
  
  public static int w(Context paramContext, int paramInt)
  {
    int i = 0;
    GMTrace.i(11115509579776L, 82817);
    if (paramContext != null) {}
    for (;;)
    {
      try
      {
        Rect localRect = new Rect();
        ((Activity)paramContext).getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
        i = ((Activity)paramContext).getWindow().getDecorView().getHeight();
        if (i - localRect.height() >= 0)
        {
          int j = localRect.height();
          i -= j;
          if (i <= 0)
          {
            GMTrace.o(11115509579776L, 82817);
            return paramInt;
          }
        }
        else
        {
          i = localRect.top;
          continue;
        }
        paramInt = i;
      }
      catch (Exception paramContext)
      {
        w.i("MicroMsg.exdevice.Util", "getStatusHeight err: %s", new Object[] { paramContext.toString() });
      }
      finally
      {
        GMTrace.o(11115509579776L, 82817);
        return paramInt;
      }
    }
  }
  
  public static String w(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(11113630531584L, 82803);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(11113630531584L, 82803);
      return null;
    }
    int i = paramInt;
    if (paramArrayOfByte.length < paramInt)
    {
      w.w("MicroMsg.exdevice.Util", "data length is shorter then print command length");
      i = paramArrayOfByte.length;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    paramInt = 0;
    while (paramInt < i)
    {
      int j = paramArrayOfByte[paramInt] & 0xFF;
      if (j < 16) {
        localStringBuilder.append("0");
      }
      localStringBuilder.append(Integer.toHexString(j));
      paramInt += 1;
    }
    paramArrayOfByte = localStringBuilder.toString().toUpperCase(Locale.US);
    GMTrace.o(11113630531584L, 82803);
    return paramArrayOfByte;
  }
  
  public static long xh(String paramString)
  {
    GMTrace.i(11113227878400L, 82800);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.exdevice.Util", "mac string is null or nil");
      GMTrace.o(11113227878400L, 82800);
      return 0L;
    }
    paramString = paramString.toUpperCase(Locale.US).split(":");
    Byte[] arrayOfByte = new Byte[paramString.length];
    int n = paramString.length;
    int j = 0;
    int i = 0;
    int k;
    if (j < n)
    {
      Object localObject = paramString[j];
      if ((byte)((String)localObject).charAt(0) >= 65)
      {
        k = ((String)localObject).charAt(0) - 'A' + 10 << 4;
        label106:
        if ((byte)((String)localObject).charAt(1) < 65) {
          break label170;
        }
      }
      label170:
      for (m = ((String)localObject).charAt(1) - 'A' + 10;; m = ((String)localObject).charAt(1) - '0')
      {
        arrayOfByte[i] = Byte.valueOf((byte)(k | m));
        j += 1;
        i += 1;
        break;
        k = ((String)localObject).charAt(0) - '0' << 4;
        break label106;
      }
    }
    i = paramString.length;
    int m = arrayOfByte.length;
    long l1 = 0L;
    j = 0;
    i -= 1;
    while (j < m)
    {
      long l2 = arrayOfByte[j].longValue();
      j += 1;
      k = i - 1;
      l1 = (l2 & 0xFF) << (i << 3) | l1;
      i = k;
    }
    GMTrace.o(11113227878400L, 82800);
    return l1;
  }
  
  public static String xi(String paramString)
  {
    GMTrace.i(11114167402496L, 82807);
    if ((paramString == null) || (12 != paramString.length()))
    {
      w.e("MicroMsg.exdevice.Util", "%s is not server string mac", new Object[] { paramString });
      GMTrace.o(11114167402496L, 82807);
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder("");
    int i = 0;
    while (i < paramString.length())
    {
      localStringBuilder.append(paramString.charAt(i));
      if ((i % 2 != 0) && (i < paramString.length() - 1)) {
        localStringBuilder.append(":");
      }
      i += 1;
    }
    w.i("MicroMsg.exdevice.Util", "%s to %s is ok", new Object[] { paramString, localStringBuilder.toString() });
    paramString = localStringBuilder.toString();
    GMTrace.o(11114167402496L, 82807);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\exdevice\j\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
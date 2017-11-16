package oicq.wlogin_sdk.request;

import android.content.Context;
import java.security.SecureRandom;
import oicq.wlogin_sdk.a.f;
import oicq.wlogin_sdk.a.g;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.tools.ErrMsg;
import oicq.wlogin_sdk.tools.util;

public final class i
{
  public static byte[] yrT = new byte[0];
  public Context _context = null;
  public long _uin = 0L;
  public SecureRandom yrI = new SecureRandom();
  public byte[] yrJ = util.ctp();
  public byte[] yrK = null;
  public byte[] yrL = new byte[16];
  public f yrM = new f();
  public g yrN = new g();
  public long yrO = 0L;
  public int yrP = 0;
  public long yrQ = -1L;
  public int yrR = 0;
  byte[] yrS = new byte[0];
  byte[] yrU = new byte[0];
  int yrV = 0;
  byte[] yrW = new byte[0];
  byte[] yrX = new byte[0];
  byte[] yrY = new byte[0];
  byte[] yrZ = new byte[0];
  byte[] ysa = new byte[0];
  byte[] ysb = new byte[0];
  int ysc = 0;
  int ysd = 0;
  int yse = 0;
  int ysf = 0;
  byte[] ysg = new byte[0];
  ErrMsg ysh = new ErrMsg();
  byte[] ysi = new byte[0];
  byte[] ysj = new byte[4];
  byte[] ysk = new byte[0];
  c ysl = null;
  
  public static long ctg()
  {
    return System.currentTimeMillis() / 1000L;
  }
  
  public final WloginSigInfo D(long paramLong1, long paramLong2)
  {
    try
    {
      util.fL("get_siginfo", "uin=" + paramLong1 + "appid=522017402");
      WloginSigInfo localWloginSigInfo = this.ysl.D(paramLong1, 522017402L);
      if (localWloginSigInfo != null) {}
      return localWloginSigInfo;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final int a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, byte[] paramArrayOfByte6, byte[] paramArrayOfByte7, byte[] paramArrayOfByte8, byte[] paramArrayOfByte9, byte[] paramArrayOfByte10, byte[] paramArrayOfByte11, byte[] paramArrayOfByte12, byte[] paramArrayOfByte13, byte[] paramArrayOfByte14, byte[] paramArrayOfByte15, byte[] paramArrayOfByte16, byte[][] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 150	java/lang/StringBuilder
    //   5: dup
    //   6: ldc -74
    //   8: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: lload_1
    //   12: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   15: ldc -72
    //   17: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: lload_3
    //   21: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   24: ldc -72
    //   26: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: lload 5
    //   31: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   34: ldc -72
    //   36: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: lload 7
    //   41: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   44: ldc -72
    //   46: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: lload 9
    //   51: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   54: ldc -72
    //   56: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: lload 11
    //   61: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   64: ldc -72
    //   66: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload 13
    //   71: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   74: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   77: ldc -72
    //   79: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: aload 14
    //   84: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   87: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   90: ldc -72
    //   92: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: aload 15
    //   97: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   100: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   103: ldc -72
    //   105: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: aload 16
    //   110: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   113: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   116: ldc -72
    //   118: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: aload 17
    //   123: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   126: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   129: ldc -72
    //   131: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload 18
    //   136: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   139: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   142: ldc -72
    //   144: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: aload 19
    //   149: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   152: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   155: ldc -72
    //   157: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: aload 20
    //   162: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   165: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   168: ldc -72
    //   170: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: aload 21
    //   175: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   178: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   181: ldc -72
    //   183: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: aload 22
    //   188: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   191: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   194: ldc -72
    //   196: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: aload 23
    //   201: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   204: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   207: ldc -72
    //   209: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: aload 24
    //   214: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   217: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   220: ldc -72
    //   222: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: aload 25
    //   227: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   230: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   233: ldc -72
    //   235: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: aload 26
    //   240: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   243: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   246: ldc -72
    //   248: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: aload 27
    //   253: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   256: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   259: ldc -72
    //   261: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: aload 28
    //   266: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   269: invokevirtual 159	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   272: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   275: invokestatic 191	oicq/wlogin_sdk/tools/util:Zk	(Ljava/lang/String;)V
    //   278: ldc -63
    //   280: astore 31
    //   282: iconst_0
    //   283: istore 30
    //   285: iload 30
    //   287: aload 29
    //   289: arraylength
    //   290: if_icmplt +81 -> 371
    //   293: new 150	java/lang/StringBuilder
    //   296: dup
    //   297: ldc -61
    //   299: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   302: aload 31
    //   304: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: invokestatic 191	oicq/wlogin_sdk/tools/util:Zk	(Ljava/lang/String;)V
    //   313: aload_0
    //   314: getfield 135	oicq/wlogin_sdk/request/i:ysl	Loicq/wlogin_sdk/request/c;
    //   317: lload_1
    //   318: lload_3
    //   319: lload 5
    //   321: lload 7
    //   323: lload 9
    //   325: lload 11
    //   327: aload 13
    //   329: aload 14
    //   331: aload 15
    //   333: aload 16
    //   335: aload 17
    //   337: aload 18
    //   339: aload 19
    //   341: aload 20
    //   343: aload 21
    //   345: aload 22
    //   347: aload 23
    //   349: aload 24
    //   351: aload 25
    //   353: aload 26
    //   355: aload 27
    //   357: aload 28
    //   359: aload 29
    //   361: invokevirtual 197	oicq/wlogin_sdk/request/c:a	(JJJJJJ[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[[B)I
    //   364: istore 30
    //   366: aload_0
    //   367: monitorexit
    //   368: iload 30
    //   370: ireturn
    //   371: new 150	java/lang/StringBuilder
    //   374: dup
    //   375: aload 31
    //   377: invokestatic 203	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   380: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   383: ldc -51
    //   385: iconst_2
    //   386: anewarray 4	java/lang/Object
    //   389: dup
    //   390: iconst_0
    //   391: iload 30
    //   393: invokestatic 210	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   396: aastore
    //   397: dup
    //   398: iconst_1
    //   399: aload 29
    //   401: iload 30
    //   403: aaload
    //   404: invokestatic 188	oicq/wlogin_sdk/tools/util:ca	([B)J
    //   407: invokestatic 215	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   410: aastore
    //   411: invokestatic 219	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   414: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   417: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   420: astore 31
    //   422: iload 30
    //   424: iconst_1
    //   425: iadd
    //   426: istore 30
    //   428: goto -143 -> 285
    //   431: astore 13
    //   433: aload_0
    //   434: monitorexit
    //   435: aload 13
    //   437: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	438	0	this	i
    //   0	438	1	paramLong1	long
    //   0	438	3	paramLong2	long
    //   0	438	5	paramLong3	long
    //   0	438	7	paramLong4	long
    //   0	438	9	paramLong5	long
    //   0	438	11	paramLong6	long
    //   0	438	13	paramArrayOfByte1	byte[]
    //   0	438	14	paramArrayOfByte2	byte[]
    //   0	438	15	paramArrayOfByte3	byte[]
    //   0	438	16	paramArrayOfByte4	byte[]
    //   0	438	17	paramArrayOfByte5	byte[]
    //   0	438	18	paramArrayOfByte6	byte[]
    //   0	438	19	paramArrayOfByte7	byte[]
    //   0	438	20	paramArrayOfByte8	byte[]
    //   0	438	21	paramArrayOfByte9	byte[]
    //   0	438	22	paramArrayOfByte10	byte[]
    //   0	438	23	paramArrayOfByte11	byte[]
    //   0	438	24	paramArrayOfByte12	byte[]
    //   0	438	25	paramArrayOfByte13	byte[]
    //   0	438	26	paramArrayOfByte14	byte[]
    //   0	438	27	paramArrayOfByte15	byte[]
    //   0	438	28	paramArrayOfByte16	byte[]
    //   0	438	29	paramArrayOfByte	byte[][]
    //   283	144	30	i	int
    //   280	141	31	str	String
    // Exception table:
    //   from	to	target	type
    //   2	278	431	finally
    //   285	366	431	finally
    //   371	422	431	finally
  }
  
  public final void i(Long paramLong)
  {
    try
    {
      this.ysl.i(paramLong);
      return;
    }
    finally
    {
      paramLong = finally;
      throw paramLong;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\request\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
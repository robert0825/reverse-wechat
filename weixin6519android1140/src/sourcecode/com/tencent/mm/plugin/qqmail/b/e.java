package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class e
{
  public static int nSd;
  private int fMw;
  public String nSe;
  
  static
  {
    GMTrace.i(5458366562304L, 40668);
    nSd = 100;
    GMTrace.o(5458366562304L, 40668);
  }
  
  public e(String paramString, int paramInt)
  {
    GMTrace.i(5457024385024L, 40658);
    this.nSe = null;
    this.fMw = nSd;
    w.i("Msg.Plugin.HttpRequestCache", "HttpRequestCache constructor, path = " + paramString + ", maxCount = " + paramInt);
    this.nSe = paramString;
    paramString = new File(this.nSe);
    if (!paramString.exists()) {
      paramString.mkdir();
    }
    if (paramInt > 0) {}
    for (;;)
    {
      this.fMw = paramInt;
      GMTrace.o(5457024385024L, 40658);
      return;
      paramInt = nSd;
    }
  }
  
  private static byte[] ET(String paramString)
  {
    GMTrace.i(5457561255936L, 40662);
    paramString = g.n(paramString.toString().getBytes()).substring(8, 16).getBytes();
    GMTrace.o(5457561255936L, 40662);
    return paramString;
  }
  
  private static byte[] decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(5457963909120L, 40665);
    try
    {
      paramArrayOfByte2 = new DESKeySpec(paramArrayOfByte2);
      paramArrayOfByte2 = SecretKeyFactory.getInstance("DES").generateSecret(paramArrayOfByte2);
      Cipher localCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
      localCipher.init(2, paramArrayOfByte2, new IvParameterSpec("12345678".getBytes()));
      paramArrayOfByte1 = localCipher.doFinal(paramArrayOfByte1);
      GMTrace.o(5457963909120L, 40665);
      return paramArrayOfByte1;
    }
    catch (Exception paramArrayOfByte1)
    {
      for (;;)
      {
        w.printErrStackTrace("Msg.Plugin.HttpRequestCache", paramArrayOfByte1, "", new Object[0]);
        paramArrayOfByte1 = null;
      }
    }
  }
  
  private static byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(5457829691392L, 40664);
    try
    {
      paramArrayOfByte2 = new DESKeySpec(paramArrayOfByte2);
      paramArrayOfByte2 = SecretKeyFactory.getInstance("DES").generateSecret(paramArrayOfByte2);
      Cipher localCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
      localCipher.init(1, paramArrayOfByte2, new IvParameterSpec("12345678".getBytes()));
      paramArrayOfByte1 = localCipher.doFinal(paramArrayOfByte1);
      GMTrace.o(5457829691392L, 40664);
      return paramArrayOfByte1;
    }
    catch (Exception paramArrayOfByte1)
    {
      for (;;)
      {
        w.printErrStackTrace("Msg.Plugin.HttpRequestCache", paramArrayOfByte1, "", new Object[0]);
        paramArrayOfByte1 = null;
      }
    }
  }
  
  private static String j(String paramString, Map<String, String> paramMap)
  {
    GMTrace.i(5457427038208L, 40661);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString);
    if (paramMap != null)
    {
      paramString = paramMap.entrySet().iterator();
      while (paramString.hasNext())
      {
        Object localObject = (Map.Entry)paramString.next();
        paramMap = (String)((Map.Entry)localObject).getKey();
        localObject = (String)((Map.Entry)localObject).getValue();
        localStringBuffer.append(paramMap);
        localStringBuffer.append((String)localObject);
      }
    }
    paramString = g.n(localStringBuffer.toString().getBytes());
    GMTrace.o(5457427038208L, 40661);
    return paramString;
  }
  
  /* Error */
  public static boolean q(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 198
    //   3: ldc -56
    //   5: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 202	java/io/FileOutputStream
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 203	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   16: astore_2
    //   17: aload_2
    //   18: astore_0
    //   19: aload_2
    //   20: aload_1
    //   21: invokevirtual 206	java/io/FileOutputStream:write	([B)V
    //   24: aload_2
    //   25: astore_0
    //   26: aload_2
    //   27: invokevirtual 209	java/io/FileOutputStream:flush	()V
    //   30: aload_2
    //   31: invokevirtual 212	java/io/FileOutputStream:close	()V
    //   34: ldc2_w 198
    //   37: ldc -56
    //   39: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   42: iconst_1
    //   43: ireturn
    //   44: astore_0
    //   45: ldc 39
    //   47: aload_0
    //   48: ldc -114
    //   50: iconst_0
    //   51: anewarray 4	java/lang/Object
    //   54: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   57: goto -23 -> 34
    //   60: astore_3
    //   61: aconst_null
    //   62: astore_1
    //   63: aload_1
    //   64: astore_0
    //   65: ldc 39
    //   67: aload_3
    //   68: ldc -114
    //   70: iconst_0
    //   71: anewarray 4	java/lang/Object
    //   74: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   77: aload_1
    //   78: ifnull +7 -> 85
    //   81: aload_1
    //   82: invokevirtual 212	java/io/FileOutputStream:close	()V
    //   85: ldc2_w 198
    //   88: ldc -56
    //   90: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   93: iconst_0
    //   94: ireturn
    //   95: astore_0
    //   96: ldc 39
    //   98: aload_0
    //   99: ldc -114
    //   101: iconst_0
    //   102: anewarray 4	java/lang/Object
    //   105: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   108: goto -23 -> 85
    //   111: astore_1
    //   112: aconst_null
    //   113: astore_0
    //   114: aload_0
    //   115: ifnull +7 -> 122
    //   118: aload_0
    //   119: invokevirtual 212	java/io/FileOutputStream:close	()V
    //   122: aload_1
    //   123: athrow
    //   124: astore_0
    //   125: ldc 39
    //   127: aload_0
    //   128: ldc -114
    //   130: iconst_0
    //   131: anewarray 4	java/lang/Object
    //   134: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: goto -15 -> 122
    //   140: astore_1
    //   141: goto -27 -> 114
    //   144: astore_3
    //   145: aload_2
    //   146: astore_1
    //   147: goto -84 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	paramString	String
    //   0	150	1	paramArrayOfByte	byte[]
    //   16	130	2	localFileOutputStream	java.io.FileOutputStream
    //   60	8	3	localException1	Exception
    //   144	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   30	34	44	java/io/IOException
    //   8	17	60	java/lang/Exception
    //   81	85	95	java/io/IOException
    //   8	17	111	finally
    //   118	122	124	java/io/IOException
    //   19	24	140	finally
    //   26	30	140	finally
    //   65	77	140	finally
    //   19	24	144	java/lang/Exception
    //   26	30	144	java/lang/Exception
  }
  
  /* Error */
  public static byte[] readFromFile(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 214
    //   3: ldc -40
    //   5: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 66	java/io/File
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 67	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: astore_0
    //   17: aload_0
    //   18: invokevirtual 71	java/io/File:exists	()Z
    //   21: istore_3
    //   22: iload_3
    //   23: ifne +13 -> 36
    //   26: ldc2_w 214
    //   29: ldc -40
    //   31: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: aconst_null
    //   35: areturn
    //   36: aload_0
    //   37: invokevirtual 220	java/io/File:length	()J
    //   40: l2i
    //   41: istore_1
    //   42: new 222	java/io/FileInputStream
    //   45: dup
    //   46: aload_0
    //   47: invokespecial 225	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   50: astore 4
    //   52: aload 4
    //   54: astore_0
    //   55: iload_1
    //   56: newarray <illegal type>
    //   58: astore 5
    //   60: aload 4
    //   62: astore_0
    //   63: aload 4
    //   65: aload 5
    //   67: invokevirtual 229	java/io/FileInputStream:read	([B)I
    //   70: istore_2
    //   71: iload_2
    //   72: iload_1
    //   73: if_icmpeq +34 -> 107
    //   76: aload 4
    //   78: invokevirtual 230	java/io/FileInputStream:close	()V
    //   81: ldc2_w 214
    //   84: ldc -40
    //   86: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   89: aconst_null
    //   90: areturn
    //   91: astore_0
    //   92: ldc 39
    //   94: aload_0
    //   95: ldc -114
    //   97: iconst_0
    //   98: anewarray 4	java/lang/Object
    //   101: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   104: goto -23 -> 81
    //   107: aload 4
    //   109: invokevirtual 230	java/io/FileInputStream:close	()V
    //   112: ldc2_w 214
    //   115: ldc -40
    //   117: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   120: aload 5
    //   122: areturn
    //   123: astore_0
    //   124: ldc 39
    //   126: aload_0
    //   127: ldc -114
    //   129: iconst_0
    //   130: anewarray 4	java/lang/Object
    //   133: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: goto -24 -> 112
    //   139: astore 5
    //   141: aconst_null
    //   142: astore 4
    //   144: aload 4
    //   146: astore_0
    //   147: ldc 39
    //   149: aload 5
    //   151: ldc -114
    //   153: iconst_0
    //   154: anewarray 4	java/lang/Object
    //   157: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   160: aload 4
    //   162: ifnull +8 -> 170
    //   165: aload 4
    //   167: invokevirtual 230	java/io/FileInputStream:close	()V
    //   170: ldc2_w 214
    //   173: ldc -40
    //   175: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   178: aconst_null
    //   179: areturn
    //   180: astore_0
    //   181: ldc 39
    //   183: aload_0
    //   184: ldc -114
    //   186: iconst_0
    //   187: anewarray 4	java/lang/Object
    //   190: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   193: goto -23 -> 170
    //   196: astore 4
    //   198: aconst_null
    //   199: astore_0
    //   200: aload_0
    //   201: ifnull +7 -> 208
    //   204: aload_0
    //   205: invokevirtual 230	java/io/FileInputStream:close	()V
    //   208: aload 4
    //   210: athrow
    //   211: astore_0
    //   212: ldc 39
    //   214: aload_0
    //   215: ldc -114
    //   217: iconst_0
    //   218: anewarray 4	java/lang/Object
    //   221: invokestatic 146	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   224: goto -16 -> 208
    //   227: astore 4
    //   229: goto -29 -> 200
    //   232: astore 5
    //   234: goto -90 -> 144
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	237	0	paramString	String
    //   41	33	1	i	int
    //   70	4	2	j	int
    //   21	2	3	bool	boolean
    //   50	116	4	localFileInputStream	java.io.FileInputStream
    //   196	13	4	localObject1	Object
    //   227	1	4	localObject2	Object
    //   58	63	5	arrayOfByte	byte[]
    //   139	11	5	localException1	Exception
    //   232	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   76	81	91	java/io/IOException
    //   107	112	123	java/io/IOException
    //   8	22	139	java/lang/Exception
    //   36	52	139	java/lang/Exception
    //   165	170	180	java/io/IOException
    //   8	22	196	finally
    //   36	52	196	finally
    //   204	208	211	java/io/IOException
    //   55	60	227	finally
    //   63	71	227	finally
    //   147	160	227	finally
    //   55	60	232	java/lang/Exception
    //   63	71	232	java/lang/Exception
  }
  
  public final boolean a(String paramString, Map<String, String> paramMap, byte[] paramArrayOfByte)
  {
    GMTrace.i(5457292820480L, 40660);
    if ((paramString == null) || (paramString.length() == 0) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      w.e("Msg.Plugin.HttpRequestCache", "setCache, invalid argument");
      GMTrace.o(5457292820480L, 40660);
      return false;
    }
    aYs();
    paramString = j(paramString, paramMap);
    paramMap = encrypt(paramArrayOfByte, ET(paramString));
    if (paramMap == null)
    {
      w.e("Msg.Plugin.HttpRequestCache", "encrypt fail, cipherText is null");
      GMTrace.o(5457292820480L, 40660);
      return false;
    }
    boolean bool = q(this.nSe + paramString, paramMap);
    GMTrace.o(5457292820480L, 40660);
    return bool;
  }
  
  public final void aYs()
  {
    int j = 0;
    GMTrace.i(5457695473664L, 40663);
    Object localObject = new File(this.nSe).list();
    if (localObject != null) {}
    for (int i = localObject.length; i < this.fMw; i = 0)
    {
      GMTrace.o(5457695473664L, 40663);
      return;
    }
    String[] arrayOfString = new File(this.nSe).list();
    localObject = null;
    int k = arrayOfString.length;
    i = j;
    while (i < k)
    {
      localObject = new File(arrayOfString[i]);
      ((File)localObject).lastModified();
      i += 1;
    }
    if (((File)localObject).exists()) {
      ((File)localObject).delete();
    }
    GMTrace.o(5457695473664L, 40663);
  }
  
  public final byte[] i(String paramString, Map<String, String> paramMap)
  {
    GMTrace.i(5457158602752L, 40659);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("Msg.Plugin.HttpRequestCache", "getCache, invalid argument");
      GMTrace.o(5457158602752L, 40659);
      return null;
    }
    paramString = j(paramString, paramMap);
    paramMap = readFromFile(this.nSe + paramString);
    if (paramMap == null)
    {
      w.i("Msg.Plugin.HttpRequestCache", "readFromFile fail, cipherText is null, read error or cache not exist");
      GMTrace.o(5457158602752L, 40659);
      return null;
    }
    paramString = decrypt(paramMap, ET(paramString));
    if (paramString == null)
    {
      w.e("Msg.Plugin.HttpRequestCache", "decrypt fail, plaintText is null");
      GMTrace.o(5457158602752L, 40659);
      return null;
    }
    GMTrace.o(5457158602752L, 40659);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
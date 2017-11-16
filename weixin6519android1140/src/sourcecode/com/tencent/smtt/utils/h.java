package com.tencent.smtt.utils;

import java.io.OutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class h
{
  private static OutputStream xXd = null;
  
  /* Error */
  public static void a(java.io.File paramFile, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: ldc 2
    //   5: monitorenter
    //   6: aload_1
    //   7: aload_3
    //   8: invokestatic 19	com/tencent/smtt/utils/h:fA	(Ljava/lang/String;Ljava/lang/String;)[B
    //   11: astore 4
    //   13: aload 5
    //   15: astore_1
    //   16: aload 4
    //   18: ifnull +8 -> 26
    //   21: aconst_null
    //   22: astore_3
    //   23: aload 4
    //   25: astore_1
    //   26: aload_0
    //   27: invokevirtual 25	java/io/File:getParentFile	()Ljava/io/File;
    //   30: invokevirtual 29	java/io/File:mkdirs	()Z
    //   33: pop
    //   34: aload_0
    //   35: invokevirtual 32	java/io/File:isFile	()Z
    //   38: ifeq +31 -> 69
    //   41: aload_0
    //   42: invokevirtual 35	java/io/File:exists	()Z
    //   45: ifeq +24 -> 69
    //   48: aload_0
    //   49: invokevirtual 39	java/io/File:length	()J
    //   52: ldc2_w 40
    //   55: lcmp
    //   56: ifle +13 -> 69
    //   59: aload_0
    //   60: invokevirtual 44	java/io/File:delete	()Z
    //   63: pop
    //   64: aload_0
    //   65: invokevirtual 47	java/io/File:createNewFile	()Z
    //   68: pop
    //   69: getstatic 10	com/tencent/smtt/utils/h:xXd	Ljava/io/OutputStream;
    //   72: ifnonnull +22 -> 94
    //   75: new 49	java/io/BufferedOutputStream
    //   78: dup
    //   79: new 51	java/io/FileOutputStream
    //   82: dup
    //   83: aload_0
    //   84: iconst_1
    //   85: invokespecial 55	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   88: invokespecial 58	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   91: putstatic 10	com/tencent/smtt/utils/h:xXd	Ljava/io/OutputStream;
    //   94: aload_3
    //   95: ifnull +31 -> 126
    //   98: getstatic 10	com/tencent/smtt/utils/h:xXd	Ljava/io/OutputStream;
    //   101: aload_3
    //   102: invokevirtual 64	java/lang/String:getBytes	()[B
    //   105: invokevirtual 70	java/io/OutputStream:write	([B)V
    //   108: getstatic 10	com/tencent/smtt/utils/h:xXd	Ljava/io/OutputStream;
    //   111: astore_0
    //   112: aload_0
    //   113: ifnull +9 -> 122
    //   116: getstatic 10	com/tencent/smtt/utils/h:xXd	Ljava/io/OutputStream;
    //   119: invokevirtual 73	java/io/OutputStream:flush	()V
    //   122: ldc 2
    //   124: monitorexit
    //   125: return
    //   126: getstatic 10	com/tencent/smtt/utils/h:xXd	Ljava/io/OutputStream;
    //   129: aload_2
    //   130: invokevirtual 70	java/io/OutputStream:write	([B)V
    //   133: getstatic 10	com/tencent/smtt/utils/h:xXd	Ljava/io/OutputStream;
    //   136: aload_1
    //   137: invokevirtual 70	java/io/OutputStream:write	([B)V
    //   140: getstatic 10	com/tencent/smtt/utils/h:xXd	Ljava/io/OutputStream;
    //   143: iconst_2
    //   144: newarray <illegal type>
    //   146: dup
    //   147: iconst_0
    //   148: ldc 74
    //   150: bastore
    //   151: dup
    //   152: iconst_1
    //   153: ldc 74
    //   155: bastore
    //   156: invokevirtual 70	java/io/OutputStream:write	([B)V
    //   159: goto -51 -> 108
    //   162: astore_0
    //   163: getstatic 10	com/tencent/smtt/utils/h:xXd	Ljava/io/OutputStream;
    //   166: astore_0
    //   167: aload_0
    //   168: ifnull -46 -> 122
    //   171: getstatic 10	com/tencent/smtt/utils/h:xXd	Ljava/io/OutputStream;
    //   174: invokevirtual 73	java/io/OutputStream:flush	()V
    //   177: goto -55 -> 122
    //   180: astore_0
    //   181: goto -59 -> 122
    //   184: astore_0
    //   185: getstatic 10	com/tencent/smtt/utils/h:xXd	Ljava/io/OutputStream;
    //   188: astore_1
    //   189: aload_1
    //   190: ifnull +9 -> 199
    //   193: getstatic 10	com/tencent/smtt/utils/h:xXd	Ljava/io/OutputStream;
    //   196: invokevirtual 73	java/io/OutputStream:flush	()V
    //   199: aload_0
    //   200: athrow
    //   201: astore_0
    //   202: ldc 2
    //   204: monitorexit
    //   205: aload_0
    //   206: athrow
    //   207: astore_1
    //   208: goto -9 -> 199
    //   211: astore_0
    //   212: goto -90 -> 122
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	paramFile	java.io.File
    //   0	215	1	paramString1	String
    //   0	215	2	paramArrayOfByte	byte[]
    //   0	215	3	paramString2	String
    //   11	13	4	arrayOfByte	byte[]
    //   1	13	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   26	69	162	java/lang/Throwable
    //   69	94	162	java/lang/Throwable
    //   98	108	162	java/lang/Throwable
    //   126	159	162	java/lang/Throwable
    //   171	177	180	java/lang/Throwable
    //   26	69	184	finally
    //   69	94	184	finally
    //   98	108	184	finally
    //   126	159	184	finally
    //   6	13	201	finally
    //   108	112	201	finally
    //   116	122	201	finally
    //   163	167	201	finally
    //   171	177	201	finally
    //   185	189	201	finally
    //   193	199	201	finally
    //   199	201	201	finally
    //   193	199	207	java/lang/Throwable
    //   116	122	211	java/lang/Throwable
  }
  
  public static String cph()
  {
    return String.valueOf(System.currentTimeMillis());
  }
  
  private static byte[] fA(String paramString1, String paramString2)
  {
    try
    {
      paramString2 = paramString2.getBytes("UTF-8");
      Cipher localCipher = Cipher.getInstance("RC4");
      localCipher.init(1, new SecretKeySpec(paramString1.getBytes("UTF-8"), "RC4"));
      paramString1 = localCipher.update(paramString2);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      new StringBuilder("encrypt exception:").append(paramString1.getMessage());
    }
    return null;
  }
  
  private static byte[] fB(String paramString1, String paramString2)
  {
    try
    {
      paramString2 = paramString2.getBytes("UTF-8");
      Cipher localCipher = Cipher.getInstance("RC4");
      localCipher.init(1, new SecretKeySpec(paramString1.getBytes("UTF-8"), "RC4"));
      paramString1 = localCipher.update(paramString2);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      new StringBuilder("encrypt exception:").append(paramString1.getMessage());
    }
    return null;
  }
  
  public static byte[] fC(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = fB(paramString1, paramString2);
      paramString2 = String.format("%03d", new Object[] { Integer.valueOf(paramString1.length) });
      byte[] arrayOfByte = new byte[paramString1.length + 3];
      arrayOfByte[0] = ((byte)paramString2.charAt(0));
      arrayOfByte[1] = ((byte)paramString2.charAt(1));
      arrayOfByte[2] = ((byte)paramString2.charAt(2));
      System.arraycopy(paramString1, 0, arrayOfByte, 3, paramString1.length);
      return arrayOfByte;
    }
    catch (Exception paramString1) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
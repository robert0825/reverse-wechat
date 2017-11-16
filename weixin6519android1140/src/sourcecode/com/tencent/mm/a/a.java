package com.tencent.mm.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class a
{
  /* Error */
  private static boolean a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: ldc2_w 9
    //   9: ldc 11
    //   11: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   14: aload_1
    //   15: invokestatic 23	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   18: ifeq +13 -> 31
    //   21: new 25	java/security/InvalidParameterException
    //   24: dup
    //   25: ldc 27
    //   27: invokespecial 31	java/security/InvalidParameterException:<init>	(Ljava/lang/String;)V
    //   30: athrow
    //   31: new 33	java/io/File
    //   34: dup
    //   35: aload_2
    //   36: invokespecial 34	java/io/File:<init>	(Ljava/lang/String;)V
    //   39: astore_2
    //   40: new 33	java/io/File
    //   43: dup
    //   44: aload_3
    //   45: invokespecial 34	java/io/File:<init>	(Ljava/lang/String;)V
    //   48: astore_3
    //   49: aload_2
    //   50: invokevirtual 38	java/io/File:exists	()Z
    //   53: ifeq +212 -> 265
    //   56: aload_2
    //   57: invokevirtual 41	java/io/File:isFile	()Z
    //   60: ifeq +205 -> 265
    //   63: aload_3
    //   64: invokevirtual 45	java/io/File:getParentFile	()Ljava/io/File;
    //   67: invokevirtual 38	java/io/File:exists	()Z
    //   70: ifne +11 -> 81
    //   73: aload_3
    //   74: invokevirtual 45	java/io/File:getParentFile	()Ljava/io/File;
    //   77: invokevirtual 48	java/io/File:mkdirs	()Z
    //   80: pop
    //   81: aload_3
    //   82: invokevirtual 51	java/io/File:createNewFile	()Z
    //   85: pop
    //   86: new 53	java/io/FileInputStream
    //   89: dup
    //   90: aload_2
    //   91: invokespecial 56	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   94: astore_2
    //   95: new 58	java/io/FileOutputStream
    //   98: dup
    //   99: aload_3
    //   100: invokespecial 59	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   103: astore_3
    //   104: aload_0
    //   105: invokevirtual 65	java/lang/String:getBytes	()[B
    //   108: iconst_0
    //   109: invokestatic 71	android/util/Base64:decode	([BI)[B
    //   112: astore_0
    //   113: new 73	javax/crypto/spec/SecretKeySpec
    //   116: dup
    //   117: aload_0
    //   118: ldc 75
    //   120: invokespecial 78	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   123: astore 6
    //   125: aload_1
    //   126: invokestatic 84	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   129: astore_1
    //   130: aload_1
    //   131: iconst_2
    //   132: aload 6
    //   134: new 86	javax/crypto/spec/IvParameterSpec
    //   137: dup
    //   138: aload_0
    //   139: aload_0
    //   140: arraylength
    //   141: invokestatic 91	java/util/Arrays:copyOf	([BI)[B
    //   144: invokespecial 94	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   147: invokevirtual 98	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   150: new 100	javax/crypto/CipherOutputStream
    //   153: dup
    //   154: aload_3
    //   155: aload_1
    //   156: invokespecial 103	javax/crypto/CipherOutputStream:<init>	(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
    //   159: astore_0
    //   160: sipush 1024
    //   163: newarray <illegal type>
    //   165: astore_1
    //   166: aload_2
    //   167: aload_1
    //   168: invokevirtual 107	java/io/FileInputStream:read	([B)I
    //   171: istore 4
    //   173: iload 4
    //   175: iconst_m1
    //   176: if_icmpeq +67 -> 243
    //   179: aload_0
    //   180: aload_1
    //   181: iconst_0
    //   182: iload 4
    //   184: invokevirtual 111	javax/crypto/CipherOutputStream:write	([BII)V
    //   187: aload_0
    //   188: invokevirtual 115	javax/crypto/CipherOutputStream:flush	()V
    //   191: goto -25 -> 166
    //   194: astore 5
    //   196: aload_2
    //   197: astore_1
    //   198: aload 5
    //   200: astore_2
    //   201: aload_2
    //   202: athrow
    //   203: astore 6
    //   205: aload_1
    //   206: astore_2
    //   207: aload_3
    //   208: astore_1
    //   209: aload_0
    //   210: astore 5
    //   212: aload 6
    //   214: astore_0
    //   215: aload 5
    //   217: ifnull +8 -> 225
    //   220: aload 5
    //   222: invokevirtual 118	javax/crypto/CipherOutputStream:close	()V
    //   225: aload_1
    //   226: ifnull +7 -> 233
    //   229: aload_1
    //   230: invokevirtual 119	java/io/FileOutputStream:close	()V
    //   233: aload_2
    //   234: ifnull +7 -> 241
    //   237: aload_2
    //   238: invokevirtual 120	java/io/FileInputStream:close	()V
    //   241: aload_0
    //   242: athrow
    //   243: aload_0
    //   244: invokevirtual 118	javax/crypto/CipherOutputStream:close	()V
    //   247: aload_3
    //   248: invokevirtual 119	java/io/FileOutputStream:close	()V
    //   251: aload_2
    //   252: invokevirtual 120	java/io/FileInputStream:close	()V
    //   255: ldc2_w 9
    //   258: ldc 11
    //   260: invokestatic 123	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   263: iconst_1
    //   264: ireturn
    //   265: ldc2_w 9
    //   268: ldc 11
    //   270: invokestatic 123	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   273: iconst_0
    //   274: ireturn
    //   275: astore_0
    //   276: aconst_null
    //   277: astore_1
    //   278: aconst_null
    //   279: astore_2
    //   280: goto -65 -> 215
    //   283: astore_0
    //   284: aconst_null
    //   285: astore_1
    //   286: goto -71 -> 215
    //   289: astore_0
    //   290: aload_3
    //   291: astore_1
    //   292: goto -77 -> 215
    //   295: astore_1
    //   296: aload_0
    //   297: astore 5
    //   299: aload_1
    //   300: astore_0
    //   301: aload_3
    //   302: astore_1
    //   303: goto -88 -> 215
    //   306: astore_2
    //   307: aconst_null
    //   308: astore_0
    //   309: aconst_null
    //   310: astore_1
    //   311: aload 6
    //   313: astore_3
    //   314: goto -113 -> 201
    //   317: astore_3
    //   318: aconst_null
    //   319: astore_0
    //   320: aload_2
    //   321: astore_1
    //   322: aload_3
    //   323: astore_2
    //   324: aload 6
    //   326: astore_3
    //   327: goto -126 -> 201
    //   330: astore 5
    //   332: aconst_null
    //   333: astore_0
    //   334: aload_2
    //   335: astore_1
    //   336: aload 5
    //   338: astore_2
    //   339: goto -138 -> 201
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	342	0	paramString1	String
    //   0	342	1	paramString2	String
    //   0	342	2	paramString3	String
    //   0	342	3	paramString4	String
    //   171	12	4	i	int
    //   1	1	5	localObject1	Object
    //   194	5	5	localException1	Exception
    //   210	88	5	str	String
    //   330	7	5	localException2	Exception
    //   4	129	6	localSecretKeySpec	SecretKeySpec
    //   203	122	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   160	166	194	java/lang/Exception
    //   166	173	194	java/lang/Exception
    //   179	191	194	java/lang/Exception
    //   201	203	203	finally
    //   86	95	275	finally
    //   95	104	283	finally
    //   104	160	289	finally
    //   160	166	295	finally
    //   166	173	295	finally
    //   179	191	295	finally
    //   86	95	306	java/lang/Exception
    //   95	104	317	java/lang/Exception
    //   104	160	330	java/lang/Exception
  }
  
  private static byte[] aW(String paramString)
  {
    GMTrace.i(13858651504640L, 103255);
    if (paramString.length() <= 0)
    {
      GMTrace.o(13858651504640L, 103255);
      return null;
    }
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    int i = 0;
    while (i < paramString.length() / 2)
    {
      arrayOfByte[i] = ((byte)(Integer.parseInt(paramString.substring(i * 2, i * 2 + 1), 16) * 16 + Integer.parseInt(paramString.substring(i * 2 + 1, i * 2 + 2), 16)));
      i += 1;
    }
    GMTrace.o(13858651504640L, 103255);
    return arrayOfByte;
  }
  
  private static byte[] b(byte[] paramArrayOfByte, String paramString)
  {
    GMTrace.i(13858919940096L, 103257);
    try
    {
      paramString = new SecretKeySpec(paramString.getBytes(), "AES");
      Cipher localCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      localCipher.init(2, paramString);
      paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
      GMTrace.o(13858919940096L, 103257);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("MicroMsg.AESUtils", bg.f(paramArrayOfByte));
      GMTrace.o(13858919940096L, 103257);
    }
    return null;
  }
  
  public static boolean f(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(13858517286912L, 103254);
    boolean bool = a(paramString1, "AES/CBC/PKCS7Padding", paramString2, paramString3);
    GMTrace.o(13858517286912L, 103254);
    return bool;
  }
  
  public static String n(String paramString1, String paramString2)
  {
    GMTrace.i(13858785722368L, 103256);
    if (bg.nm(paramString1))
    {
      GMTrace.o(13858785722368L, 103256);
      return "";
    }
    try
    {
      paramString2 = new String(b(aW(paramString1), paramString2));
      paramString1 = paramString2;
    }
    catch (Exception paramString2)
    {
      for (;;)
      {
        w.e("MicroMsg.AESUtils", bg.f(paramString2));
      }
    }
    GMTrace.o(13858785722368L, 103256);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
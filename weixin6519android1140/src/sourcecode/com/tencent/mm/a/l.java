package com.tencent.mm.a;

import com.tencent.gmtrace.GMTrace;
import java.security.PublicKey;
import javax.crypto.Cipher;

public final class l
{
  public static byte[] a(byte[] paramArrayOfByte, PublicKey paramPublicKey)
  {
    GMTrace.i(13853685448704L, 103218);
    Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    localCipher.init(2, paramPublicKey);
    paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
    GMTrace.o(13853685448704L, 103218);
    return paramArrayOfByte;
  }
  
  /* Error */
  public static PublicKey l(android.content.Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 40
    //   3: ldc 42
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aconst_null
    //   9: astore_2
    //   10: aload_0
    //   11: invokevirtual 48	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   14: invokevirtual 54	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   17: aload_1
    //   18: invokevirtual 60	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   21: astore_0
    //   22: aload_0
    //   23: astore_2
    //   24: aload_0
    //   25: invokevirtual 66	java/io/InputStream:available	()I
    //   28: newarray <illegal type>
    //   30: astore_1
    //   31: aload_0
    //   32: astore_2
    //   33: aload_0
    //   34: aload_1
    //   35: invokevirtual 70	java/io/InputStream:read	([B)I
    //   38: pop
    //   39: aload_0
    //   40: astore_2
    //   41: aload_0
    //   42: invokevirtual 74	java/io/InputStream:close	()V
    //   45: aload_0
    //   46: ifnull +7 -> 53
    //   49: aload_0
    //   50: invokevirtual 74	java/io/InputStream:close	()V
    //   53: new 76	java/security/spec/X509EncodedKeySpec
    //   56: dup
    //   57: new 78	java/lang/String
    //   60: dup
    //   61: aload_1
    //   62: invokespecial 82	java/lang/String:<init>	([B)V
    //   65: ldc 84
    //   67: ldc 86
    //   69: invokevirtual 90	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   72: ldc 92
    //   74: ldc 86
    //   76: invokevirtual 90	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   79: ldc 94
    //   81: ldc 86
    //   83: invokevirtual 90	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   86: iconst_0
    //   87: invokestatic 100	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   90: invokespecial 101	java/security/spec/X509EncodedKeySpec:<init>	([B)V
    //   93: astore_0
    //   94: ldc 103
    //   96: invokestatic 108	java/security/KeyFactory:getInstance	(Ljava/lang/String;)Ljava/security/KeyFactory;
    //   99: aload_0
    //   100: invokevirtual 112	java/security/KeyFactory:generatePublic	(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   103: astore_0
    //   104: ldc2_w 40
    //   107: ldc 42
    //   109: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   112: aload_0
    //   113: areturn
    //   114: astore_0
    //   115: aload_2
    //   116: ifnull +7 -> 123
    //   119: aload_2
    //   120: invokevirtual 74	java/io/InputStream:close	()V
    //   123: aload_0
    //   124: athrow
    //   125: astore_0
    //   126: goto -73 -> 53
    //   129: astore_1
    //   130: goto -7 -> 123
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	paramContext	android.content.Context
    //   0	133	1	paramString	String
    //   9	111	2	localContext	android.content.Context
    // Exception table:
    //   from	to	target	type
    //   10	22	114	finally
    //   24	31	114	finally
    //   33	39	114	finally
    //   41	45	114	finally
    //   49	53	125	java/io/IOException
    //   119	123	129	java/io/IOException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
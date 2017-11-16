package com.tencent.liteav.basic.serverconfig;

import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public final class RSAUtils
{
  private static String RSA = "RSA";
  
  public static byte[] decryptData(byte[] paramArrayOfByte, PrivateKey paramPrivateKey)
  {
    Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    localCipher.init(2, paramPrivateKey);
    int j = paramArrayOfByte.length;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    if (j - i > 0)
    {
      if (j - i >= localCipher.getBlockSize()) {}
      for (paramPrivateKey = localCipher.doFinal(paramArrayOfByte, i, localCipher.getBlockSize());; paramPrivateKey = localCipher.doFinal(paramArrayOfByte, i, j - i))
      {
        localByteArrayOutputStream.write(paramPrivateKey);
        i = localCipher.getBlockSize() + i;
        break;
      }
    }
    paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.close();
    return paramArrayOfByte;
  }
  
  public static byte[] encryptData(byte[] paramArrayOfByte, PublicKey paramPublicKey)
  {
    Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    localCipher.init(1, paramPublicKey);
    int j = paramArrayOfByte.length;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    if (j - i > 0)
    {
      if (j - i > localCipher.getBlockSize()) {}
      for (paramPublicKey = localCipher.doFinal(paramArrayOfByte, i, localCipher.getBlockSize());; paramPublicKey = localCipher.doFinal(paramArrayOfByte, i, j - i))
      {
        localByteArrayOutputStream.write(paramPublicKey, 0, paramPublicKey.length);
        i = localCipher.getBlockSize() + i;
        break;
      }
    }
    paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.close();
    return paramArrayOfByte;
  }
  
  public static PrivateKey getPrivateKey(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new PKCS8EncodedKeySpec(paramArrayOfByte);
    return KeyFactory.getInstance(RSA).generatePrivate(paramArrayOfByte);
  }
  
  public static PublicKey getPublicKey(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new X509EncodedKeySpec(paramArrayOfByte);
    return KeyFactory.getInstance(RSA).generatePublic(paramArrayOfByte);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\serverconfig\RSAUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
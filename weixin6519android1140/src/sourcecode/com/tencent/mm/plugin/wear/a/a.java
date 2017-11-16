package com.tencent.mm.plugin.wear.a;

import com.tencent.gmtrace.GMTrace;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class a
{
  public static final byte[] bBE()
  {
    GMTrace.i(9216999817216L, 68672);
    try
    {
      Object localObject = KeyGenerator.getInstance("AES");
      ((KeyGenerator)localObject).init(128);
      localObject = ((KeyGenerator)localObject).generateKey().getEncoded();
      GMTrace.o(9216999817216L, 68672);
      return (byte[])localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      GMTrace.o(9216999817216L, 68672);
    }
    return null;
  }
  
  public static final byte[] f(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(9216865599488L, 68671);
    paramArrayOfByte2 = new SecretKeySpec(paramArrayOfByte2, "AES");
    Cipher localCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
    localCipher.init(1, paramArrayOfByte2);
    paramArrayOfByte1 = localCipher.doFinal(paramArrayOfByte1);
    GMTrace.o(9216865599488L, 68671);
    return paramArrayOfByte1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
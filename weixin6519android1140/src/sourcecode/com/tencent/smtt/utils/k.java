package com.tencent.smtt.utils;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Security;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;

public final class k
{
  private static final char[] xYC = "0123456789abcdef".toCharArray();
  private static k xYD;
  private String xYE;
  private String xYF;
  String xYG;
  
  private k()
  {
    int i = new Random().nextInt(89999999);
    int j = new Random().nextInt(89999999);
    this.xYG = String.valueOf(i + 10000000);
    this.xYE = (this.xYG + String.valueOf(j + 10000000));
  }
  
  public static String Ym(String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes();
    paramString = null;
    try
    {
      localObject = Cipher.getInstance("RSA/ECB/NoPadding");
      paramString = (String)localObject;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        try
        {
          Object localObject;
          cpm();
          Cipher localCipher = Cipher.getInstance("RSA/ECB/NoPadding");
          paramString = localCipher;
        }
        catch (Exception localException2) {}
      }
    }
    localObject = new X509EncodedKeySpec(Base64.decode("MCwwDQYJKoZIhvcNAQEBBQADGwAwGAIRAMRB/Q0hTCD+XtnQhpQJefUCAwEAAQ==".getBytes(), 0));
    paramString.init(1, KeyFactory.getInstance("RSA").generatePublic((KeySpec)localObject));
    return bytesToHex(paramString.doFinal(arrayOfByte));
  }
  
  private static String bytesToHex(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length * 2];
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      arrayOfChar[(i * 2)] = xYC[(j >>> 4)];
      arrayOfChar[(i * 2 + 1)] = xYC[(j & 0xF)];
      i += 1;
    }
    return new String(arrayOfChar);
  }
  
  public static k cpl()
  {
    try
    {
      if (xYD == null) {
        xYD = new k();
      }
      k localk = xYD;
      return localk;
    }
    finally {}
  }
  
  private static void cpm()
  {
    Security.addProvider((Provider)Class.forName("com.android.org.bouncycastle.jce.provider.BouncyCastleProvider", true, ClassLoader.getSystemClassLoader()).newInstance());
  }
  
  public final String cpn()
  {
    byte[] arrayOfByte;
    if (this.xYF == null)
    {
      arrayOfByte = this.xYE.getBytes();
      localObject1 = null;
    }
    try
    {
      localObject2 = Cipher.getInstance("RSA/ECB/NoPadding");
      localObject1 = localObject2;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        try
        {
          Object localObject2;
          cpm();
          Cipher localCipher = Cipher.getInstance("RSA/ECB/NoPadding");
          localObject1 = localCipher;
        }
        catch (Exception localException2) {}
      }
    }
    localObject2 = new X509EncodedKeySpec(Base64.decode("MCwwDQYJKoZIhvcNAQEBBQADGwAwGAIRAMRB/Q0hTCD+XtnQhpQJefUCAwEAAQ==".getBytes(), 0));
    ((Cipher)localObject1).init(1, KeyFactory.getInstance("RSA").generatePublic((KeySpec)localObject2));
    this.xYF = bytesToHex(((Cipher)localObject1).doFinal(arrayOfByte));
    return this.xYF;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
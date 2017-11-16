package com.tencent.mm.plugin.card.b;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class e
{
  private static String ad(byte[] paramArrayOfByte)
  {
    GMTrace.i(18904432771072L, 140849);
    if (paramArrayOfByte == null)
    {
      GMTrace.o(18904432771072L, 140849);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      localStringBuilder.append("0123456789ABCDEF".charAt(paramArrayOfByte[i] >> 4 & 0xF)).append("0123456789ABCDEF".charAt(paramArrayOfByte[i] & 0xF));
      i += 1;
    }
    paramArrayOfByte = localStringBuilder.toString();
    GMTrace.o(18904432771072L, 140849);
    return paramArrayOfByte;
  }
  
  private static byte[] ae(byte[] paramArrayOfByte)
  {
    GMTrace.i(18904701206528L, 140851);
    KeyGenerator localKeyGenerator = KeyGenerator.getInstance("AES");
    SecureRandom localSecureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
    localSecureRandom.setSeed(paramArrayOfByte);
    localKeyGenerator.init(128, localSecureRandom);
    paramArrayOfByte = localKeyGenerator.generateKey().getEncoded();
    GMTrace.o(18904701206528L, 140851);
    return paramArrayOfByte;
  }
  
  public static String bG(String paramString1, String paramString2)
  {
    GMTrace.i(18904164335616L, 140847);
    if ((paramString2 == null) || (paramString2.length() <= 0))
    {
      GMTrace.o(18904164335616L, 140847);
      return null;
    }
    at.AR();
    int i = c.ww();
    paramString1 = "CbW9HMPiil38ldOjZp5WkwlIfzvLwiX6_" + i + "_" + paramString1;
    try
    {
      Object localObject = ae(paramString1.getBytes());
      paramString1 = uu(paramString2);
      paramString2 = new SecretKeySpec((byte[])localObject, "AES");
      localObject = Cipher.getInstance("AES");
      ((Cipher)localObject).init(2, paramString2);
      paramString1 = new String(((Cipher)localObject).doFinal(paramString1));
      GMTrace.o(18904164335616L, 140847);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", paramString1, "", new Object[0]);
        paramString1 = null;
      }
    }
  }
  
  public static String bH(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    GMTrace.i(18904298553344L, 140848);
    if ((paramString2 == null) || (paramString2.length() <= 0))
    {
      GMTrace.o(18904298553344L, 140848);
      return null;
    }
    at.AR();
    int i = c.ww();
    paramString1 = "CbW9HMPiil38ldOjZp5WkwlIfzvLwiX6_" + i + "_" + paramString1;
    try
    {
      Object localObject2 = ae(paramString1.getBytes());
      paramString1 = paramString2.getBytes();
      paramString2 = new SecretKeySpec((byte[])localObject2, "AES");
      localObject2 = Cipher.getInstance("AES");
      ((Cipher)localObject2).init(1, paramString2);
      paramString1 = ad(((Cipher)localObject2).doFinal(paramString1));
      GMTrace.o(18904298553344L, 140848);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", paramString1, "", new Object[0]);
        paramString1 = (String)localObject1;
      }
    }
  }
  
  public static String bI(String paramString1, String paramString2)
  {
    GMTrace.i(18904835424256L, 140852);
    if ((paramString1 == null) || (paramString1.length() <= 0))
    {
      GMTrace.o(18904835424256L, 140852);
      return null;
    }
    long l = System.currentTimeMillis() / 1000L;
    StringBuilder localStringBuilder2 = new StringBuilder();
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder2.append(paramString1);
    localStringBuilder2.append("&");
    localStringBuilder2.append(l);
    localStringBuilder2.append("&");
    localStringBuilder2.append(paramString2);
    try
    {
      paramString2 = bJ(localStringBuilder2.toString(), paramString2);
      localStringBuilder1.append(paramString1);
      localStringBuilder1.append("&");
      localStringBuilder1.append(l);
      localStringBuilder1.append("&");
      localStringBuilder1.append(paramString2);
      paramString1 = localStringBuilder1.toString();
      GMTrace.o(18904835424256L, 140852);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", paramString1, "", new Object[0]);
      }
    }
  }
  
  private static String bJ(String paramString1, String paramString2)
  {
    GMTrace.i(18904969641984L, 140853);
    try
    {
      Mac localMac = Mac.getInstance("HmacSHA256");
      localMac.init(new SecretKeySpec(paramString2.getBytes(), "HmacSHA256"));
      paramString1 = Base64.encodeToString(localMac.doFinal(paramString1.getBytes()), 2);
      w.i("MicroMsg.CardDymanicQrcodeOfflineHelper", "hash is: " + paramString1);
      GMTrace.o(18904969641984L, 140853);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", paramString1, "", new Object[0]);
      GMTrace.o(18904969641984L, 140853);
    }
    return "";
  }
  
  private static byte[] uu(String paramString)
  {
    GMTrace.i(18904566988800L, 140850);
    int j = paramString.length() / 2;
    byte[] arrayOfByte = new byte[j];
    int i = 0;
    while (i < j)
    {
      arrayOfByte[i] = Integer.valueOf(paramString.substring(i * 2, i * 2 + 2), 16).byteValue();
      i += 1;
    }
    GMTrace.o(18904566988800L, 140850);
    return arrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
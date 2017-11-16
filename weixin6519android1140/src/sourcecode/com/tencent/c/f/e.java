package com.tencent.c.f;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class e
{
  public static byte[] bC(byte[] paramArrayOfByte)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte);
      paramArrayOfByte = localMessageDigest.digest();
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      return null;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
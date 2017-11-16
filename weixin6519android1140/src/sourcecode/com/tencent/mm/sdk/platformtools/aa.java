package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class aa
{
  protected static char[] vii;
  protected static ThreadLocal<MessageDigest> vij;
  
  static
  {
    GMTrace.i(13951932825600L, 103950);
    vii = new char[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    vij = new ThreadLocal()
    {
      private static MessageDigest bPQ()
      {
        GMTrace.i(13932202819584L, 103803);
        try
        {
          MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
          GMTrace.o(13932202819584L, 103803);
          return localMessageDigest;
        }
        catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
        {
          throw new RuntimeException("Initialize MD5 failed.", localNoSuchAlgorithmException);
        }
      }
    };
    GMTrace.o(13951932825600L, 103950);
  }
  
  public static String RP(String paramString)
  {
    GMTrace.i(13951664390144L, 103948);
    paramString = bn(paramString.getBytes());
    GMTrace.o(13951664390144L, 103948);
    return paramString;
  }
  
  public static String bn(byte[] paramArrayOfByte)
  {
    GMTrace.i(13951798607872L, 103949);
    paramArrayOfByte = ((MessageDigest)vij.get()).digest(paramArrayOfByte);
    int j = paramArrayOfByte.length;
    StringBuffer localStringBuffer = new StringBuffer(j * 2);
    int i = 0;
    while (i < j + 0)
    {
      int k = paramArrayOfByte[i];
      char c1 = vii[((k & 0xF0) >> 4)];
      char c2 = vii[(k & 0xF)];
      localStringBuffer.append(c1);
      localStringBuffer.append(c2);
      i += 1;
    }
    paramArrayOfByte = localStringBuffer.toString();
    GMTrace.o(13951798607872L, 103949);
    return paramArrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
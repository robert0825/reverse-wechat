package com.tencent.mm.compatible.util;

import com.tencent.gmtrace.GMTrace;
import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.AccessController;
import java.util.BitSet;

public final class p
{
  static BitSet fSA;
  static String fSB;
  
  static
  {
    GMTrace.i(13780402569216L, 102672);
    fSB = null;
    fSA = new BitSet(256);
    int i = 97;
    while (i <= 122)
    {
      fSA.set(i);
      i += 1;
    }
    i = 65;
    while (i <= 90)
    {
      fSA.set(i);
      i += 1;
    }
    i = 48;
    while (i <= 57)
    {
      fSA.set(i);
      i += 1;
    }
    fSA.set(45);
    fSA.set(95);
    fSA.set(46);
    fSA.set(42);
    fSB = (String)AccessController.doPrivileged(new i("file.encoding"));
    GMTrace.o(13780402569216L, 102672);
  }
  
  @Deprecated
  public static String encode(String paramString)
  {
    GMTrace.i(13780134133760L, 102670);
    Object localObject = null;
    try
    {
      paramString = encode(paramString, fSB);
      GMTrace.o(13780134133760L, 102670);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        paramString = (String)localObject;
      }
    }
  }
  
  public static String encode(String paramString1, String paramString2)
  {
    GMTrace.i(13780268351488L, 102671);
    int j = 0;
    StringBuffer localStringBuffer = new StringBuffer(paramString1.length());
    CharArrayWriter localCharArrayWriter = new CharArrayWriter();
    if (paramString2 == null) {
      throw new NullPointerException("charsetName");
    }
    for (;;)
    {
      Charset localCharset;
      int k;
      try
      {
        localCharset = Charset.forName(paramString2);
        i = 0;
        if (i >= paramString1.length()) {
          break;
        }
        k = paramString1.charAt(i);
        if (fSA.get(k))
        {
          if (k == 32) {
            j = 1;
          }
          localStringBuffer.append((char)k);
          i += 1;
          continue;
        }
        j = k;
      }
      catch (IllegalCharsetNameException paramString1)
      {
        throw new UnsupportedEncodingException(paramString2);
      }
      catch (UnsupportedCharsetException paramString1)
      {
        throw new UnsupportedEncodingException(paramString2);
      }
      int m;
      do
      {
        localCharArrayWriter.write(j);
        k = i;
        if (j >= 55296)
        {
          k = i;
          if (j <= 56319)
          {
            k = i;
            if (i + 1 < paramString1.length())
            {
              j = paramString1.charAt(i + 1);
              k = i;
              if (j >= 56320)
              {
                k = i;
                if (j <= 57343)
                {
                  localCharArrayWriter.write(j);
                  k = i + 1;
                }
              }
            }
          }
        }
        k += 1;
        if (k >= paramString1.length()) {
          break;
        }
        paramString2 = fSA;
        m = paramString1.charAt(k);
        j = m;
        i = k;
      } while (!paramString2.get(m));
      localCharArrayWriter.flush();
      String str = new String(localCharArrayWriter.toCharArray());
      new o();
      byte[] arrayOfByte = str.getBytes(localCharset);
      paramString2 = arrayOfByte;
      if (arrayOfByte == null) {
        paramString2 = str.getBytes();
      }
      int i = 0;
      while (i < paramString2.length)
      {
        localStringBuffer.append('%');
        char c2 = Character.forDigit(paramString2[i] >> 4 & 0xF, 16);
        char c1 = c2;
        if (Character.isLetter(c2)) {
          c1 = (char)(c2 - ' ');
        }
        localStringBuffer.append(c1);
        c2 = Character.forDigit(paramString2[i] & 0xF, 16);
        c1 = c2;
        if (Character.isLetter(c2)) {
          c1 = (char)(c2 - ' ');
        }
        localStringBuffer.append(c1);
        i += 1;
      }
      localCharArrayWriter.reset();
      j = 1;
      i = k;
    }
    if (j != 0)
    {
      paramString1 = localStringBuffer.toString();
      GMTrace.o(13780268351488L, 102671);
      return paramString1;
    }
    GMTrace.o(13780268351488L, 102671);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\util\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
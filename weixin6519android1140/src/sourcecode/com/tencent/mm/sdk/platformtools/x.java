package com.tencent.mm.sdk.platformtools;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.k;
import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;

public final class x
{
  private static final Pattern vhY;
  private byte[] key;
  private final y<String, String> vhZ;
  public final bd vib;
  
  static
  {
    GMTrace.i(13935021391872L, 103824);
    char c = (char)("⍆[0-9]+@".charAt(0) ^ 0xDCBA);
    vhY = Pattern.compile(c + "⍆[0-9]+@".substring(1));
    GMTrace.o(13935021391872L, 103824);
  }
  
  public x(String paramString)
  {
    GMTrace.i(13934752956416L, 103822);
    this.vhZ = new y(256);
    try
    {
      this.key = paramString.getBytes("UTF-8");
      this.vib = new bd(paramString);
      GMTrace.o(13934752956416L, 103822);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        this.key = paramString.getBytes();
      }
    }
  }
  
  public final String cG(String paramString, int paramInt)
  {
    GMTrace.i(13934887174144L, 103823);
    String str = paramString.substring(0, paramInt);
    if (this.vhZ.bE(str))
    {
      paramString = (String)this.vhZ.get(str);
      GMTrace.o(13934887174144L, 103823);
      return paramString;
    }
    paramInt = paramString.indexOf('@', 1);
    int i = paramInt + 1;
    paramString = paramString.substring(i, Integer.parseInt(paramString.substring(1, paramInt)) + i);
    try
    {
      paramString = new String(k.a(Base64.decode(paramString, 0), this.key), "UTF-8");
      this.vhZ.put(str, paramString);
      GMTrace.o(13934887174144L, 103823);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.LogDecryptor", paramString, "", new Object[0]);
      paramString = "[TD]" + str;
      GMTrace.o(13934887174144L, 103823);
    }
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
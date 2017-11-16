package com.tencent.mm.platformtools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class SpellMap
{
  public static HashMap<String, String> hjt;
  
  static
  {
    GMTrace.i(16767954976768L, 124931);
    hjt = new HashMap();
    GMTrace.o(16767954976768L, 124931);
  }
  
  public SpellMap()
  {
    GMTrace.i(13454656143360L, 100245);
    GMTrace.o(13454656143360L, 100245);
  }
  
  public static String f(char paramChar)
  {
    GMTrace.i(13454790361088L, 100246);
    int j = g(paramChar);
    if (j < 65536)
    {
      GMTrace.o(13454790361088L, 100246);
      return String.valueOf(paramChar);
    }
    int i = j >> 16;
    j &= 0xFF;
    if ((i < 129) || (i > 253)) {
      str = null;
    }
    while (str == null)
    {
      GMTrace.o(13454790361088L, 100246);
      return null;
      if ((j < 63) || (j > 254)) {
        str = null;
      } else {
        str = spellGetJni(i - 129, j - 63);
      }
    }
    String[] arrayOfString = str.split(",");
    if ((arrayOfString == null) || (arrayOfString.length < 2))
    {
      GMTrace.o(13454790361088L, 100246);
      return str;
    }
    String str = arrayOfString[0];
    GMTrace.o(13454790361088L, 100246);
    return str;
  }
  
  private static int g(char paramChar)
  {
    GMTrace.i(13454924578816L, 100247);
    if (paramChar <= '')
    {
      GMTrace.o(13454924578816L, 100247);
      return paramChar;
    }
    try
    {
      byte[] arrayOfByte = String.valueOf(paramChar).getBytes("GBK");
      if ((arrayOfByte == null) || (arrayOfByte.length > 2) || (arrayOfByte.length <= 0))
      {
        GMTrace.o(13454924578816L, 100247);
        return 0;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      GMTrace.o(13454924578816L, 100247);
      return 0;
    }
    int i;
    if (localUnsupportedEncodingException.length == 1)
    {
      i = localUnsupportedEncodingException[0];
      GMTrace.o(13454924578816L, 100247);
      return i;
    }
    if (localUnsupportedEncodingException.length == 2)
    {
      i = localUnsupportedEncodingException[0];
      int j = localUnsupportedEncodingException[1];
      GMTrace.o(13454924578816L, 100247);
      return (i + 256 << 16) + (j + 256);
    }
    GMTrace.o(13454924578816L, 100247);
    return 0;
  }
  
  public static final String nj(String paramString)
  {
    GMTrace.i(16767820759040L, 124930);
    StringBuffer localStringBuffer = new StringBuffer();
    paramString = paramString.toCharArray();
    int j = paramString.length;
    int i = 0;
    if (i < j)
    {
      char c = paramString[i];
      if (c > '㐀')
      {
        String str = (String)hjt.get(String.valueOf(c));
        if (!bg.nm(str)) {
          localStringBuffer.append(str);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuffer.append(c);
      }
    }
    paramString = localStringBuffer.toString();
    GMTrace.o(16767820759040L, 124930);
    return paramString;
  }
  
  public static native String spellGetJni(int paramInt1, int paramInt2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\SpellMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
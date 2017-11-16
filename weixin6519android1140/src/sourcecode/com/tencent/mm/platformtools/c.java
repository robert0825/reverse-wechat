package com.tencent.mm.platformtools;

import com.tencent.gmtrace.GMTrace;

public final class c
{
  public static String nb(String paramString)
  {
    GMTrace.i(13454387707904L, 100243);
    if ((paramString == null) || ("".equals(paramString.trim())))
    {
      GMTrace.o(13454387707904L, 100243);
      return paramString;
    }
    paramString = paramString.toCharArray();
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    int j = paramString.length;
    while (i < j)
    {
      String str = SpellMap.f(paramString[i]);
      if (str != null) {
        localStringBuffer.append(str);
      }
      i += 1;
    }
    paramString = localStringBuffer.toString();
    GMTrace.o(13454387707904L, 100243);
    return paramString;
  }
  
  public static String nc(String paramString)
  {
    GMTrace.i(13454521925632L, 100244);
    if ((paramString == null) || ("".equals(paramString.trim())))
    {
      GMTrace.o(13454521925632L, 100244);
      return paramString;
    }
    paramString = paramString.toCharArray();
    StringBuffer localStringBuffer = new StringBuffer();
    int j = paramString.length;
    int i = 0;
    while (i < j)
    {
      if (!Character.isSpace(paramString[i]))
      {
        String str = SpellMap.f(paramString[i]);
        if ((str != null) && (str.length() > 0)) {
          localStringBuffer.append(str.charAt(0));
        }
      }
      i += 1;
    }
    paramString = localStringBuffer.toString().toUpperCase();
    GMTrace.o(13454521925632L, 100244);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
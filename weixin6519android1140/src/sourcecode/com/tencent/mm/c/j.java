package com.tencent.mm.c;

import com.tencent.gmtrace.GMTrace;

public final class j
{
  public static int bu(String paramString)
  {
    GMTrace.i(14019578560512L, 104454);
    if (paramString != null) {}
    try
    {
      if (paramString.length() <= 0)
      {
        GMTrace.o(14019578560512L, 104454);
        return 0;
      }
      int i = Integer.parseInt(paramString);
      GMTrace.o(14019578560512L, 104454);
      return i;
    }
    catch (NumberFormatException paramString)
    {
      GMTrace.o(14019578560512L, 104454);
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
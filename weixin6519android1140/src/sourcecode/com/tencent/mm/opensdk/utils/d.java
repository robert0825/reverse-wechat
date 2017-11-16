package com.tencent.mm.opensdk.utils;

import com.tencent.gmtrace.GMTrace;

public final class d
{
  public static boolean a(String paramString)
  {
    GMTrace.i(14619129151488L, 108921);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(14619129151488L, 108921);
      return true;
    }
    GMTrace.o(14619129151488L, 108921);
    return false;
  }
  
  public static int b(String paramString)
  {
    GMTrace.i(16293495308288L, 121396);
    if (paramString != null) {}
    try
    {
      if (paramString.length() <= 0)
      {
        GMTrace.o(16293495308288L, 121396);
        return 0;
      }
      int i = Integer.parseInt(paramString);
      GMTrace.o(16293495308288L, 121396);
      return i;
    }
    catch (Exception paramString)
    {
      GMTrace.o(16293495308288L, 121396);
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\utils\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
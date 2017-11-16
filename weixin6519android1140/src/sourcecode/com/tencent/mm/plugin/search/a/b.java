package com.tencent.mm.plugin.search.a;

import com.tencent.gmtrace.GMTrace;

public final class b
{
  private static String[] lwz;
  
  static
  {
    GMTrace.i(11803107000320L, 87940);
    lwz = new String[] { "wxid_", "wx_", "gh_" };
    GMTrace.o(11803107000320L, 87940);
  }
  
  public static boolean Gc(String paramString)
  {
    GMTrace.i(11802838564864L, 87938);
    if (paramString == null)
    {
      GMTrace.o(11802838564864L, 87938);
      return false;
    }
    if ((paramString.length() < 20) && (paramString.matches("^[0-9]+$")))
    {
      GMTrace.o(11802838564864L, 87938);
      return true;
    }
    GMTrace.o(11802838564864L, 87938);
    return false;
  }
  
  public static boolean Gd(String paramString)
  {
    GMTrace.i(11802972782592L, 87939);
    if (paramString == null)
    {
      GMTrace.o(11802972782592L, 87939);
      return false;
    }
    if ((paramString.length() < 20) && (paramString.matches("^[A-Za-z0-9\\-_]+$")))
    {
      GMTrace.o(11802972782592L, 87939);
      return true;
    }
    GMTrace.o(11802972782592L, 87939);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
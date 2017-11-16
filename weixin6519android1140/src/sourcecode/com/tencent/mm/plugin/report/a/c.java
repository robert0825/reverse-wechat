package com.tencent.mm.plugin.report.a;

import com.tencent.gmtrace.GMTrace;

public final class c
{
  public static boolean oqh;
  public static boolean oqi;
  public static boolean oqj;
  public static boolean oqk;
  
  static
  {
    GMTrace.i(13108374405120L, 97665);
    oqh = false;
    oqi = true;
    oqj = true;
    oqk = true;
    GMTrace.o(13108374405120L, 97665);
  }
  
  public static void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    GMTrace.i(13108240187392L, 97664);
    oqh = paramBoolean1;
    oqi = paramBoolean2;
    oqj = paramBoolean3;
    oqk = paramBoolean4;
    GMTrace.o(13108240187392L, 97664);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
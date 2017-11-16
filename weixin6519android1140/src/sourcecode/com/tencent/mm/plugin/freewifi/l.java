package com.tencent.mm.plugin.freewifi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;

public final class l
{
  public static void b(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(7267084664832L, 54144);
    if (paramBoolean)
    {
      g.ork.i(12651, new Object[] { Integer.valueOf(4), paramString1, Integer.valueOf(1), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
      GMTrace.o(7267084664832L, 54144);
      return;
    }
    g.ork.i(12651, new Object[] { Integer.valueOf(4), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
    GMTrace.o(7267084664832L, 54144);
  }
  
  public static void c(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(7267218882560L, 54145);
    if (paramBoolean)
    {
      g.ork.i(12651, new Object[] { Integer.valueOf(5), paramString1, Integer.valueOf(1), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
      GMTrace.o(7267218882560L, 54145);
      return;
    }
    g.ork.i(12651, new Object[] { Integer.valueOf(5), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
    GMTrace.o(7267218882560L, 54145);
  }
  
  public static void p(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(7266682011648L, 54141);
    g.ork.i(12651, new Object[] { Integer.valueOf(1), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
    GMTrace.o(7266682011648L, 54141);
  }
  
  public static void q(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(7266816229376L, 54142);
    g.ork.i(12651, new Object[] { Integer.valueOf(2), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
    GMTrace.o(7266816229376L, 54142);
  }
  
  public static void r(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(7266950447104L, 54143);
    g.ork.i(12651, new Object[] { Integer.valueOf(3), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
    GMTrace.o(7266950447104L, 54143);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.appbrand.n;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.sdk.platformtools.bg;

public final class e
{
  public static <T extends a> boolean a(T paramT1, T paramT2)
  {
    GMTrace.i(20014950252544L, 149123);
    if ((paramT1 == null) && (paramT2 == null)) {
      throw new IllegalArgumentException("both null!!!");
    }
    if (paramT1 == null)
    {
      GMTrace.o(20014950252544L, 149123);
      return false;
    }
    if (paramT2 == null)
    {
      GMTrace.o(20014950252544L, 149123);
      return false;
    }
    try
    {
      boolean bool = bg.isEqual(paramT1.toByteArray(), paramT2.toByteArray());
      GMTrace.o(20014950252544L, 149123);
      return bool;
    }
    catch (Exception paramT1)
    {
      GMTrace.o(20014950252544L, 149123);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\n\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.fps_lighter.e;

import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.TimeUnit;

public final class a
{
  public static int b(long paramLong, float paramFloat)
  {
    GMTrace.i(16095524159488L, 119921);
    int i = 0;
    paramLong = TimeUnit.MILLISECONDS.convert(paramLong, TimeUnit.NANOSECONDS);
    if ((float)paramLong > paramFloat) {
      i = (int)Math.floor((float)paramLong / paramFloat);
    }
    GMTrace.o(16095524159488L, 119921);
    return i;
  }
  
  public static a nL(int paramInt)
  {
    GMTrace.i(16095658377216L, 119922);
    a locala = a.lnL;
    if (paramInt >= 16) {
      locala = a.lnJ;
    }
    for (;;)
    {
      GMTrace.o(16095658377216L, 119922);
      return locala;
      if (paramInt >= 8) {
        locala = a.lnK;
      } else if (paramInt >= 4) {
        locala = a.lnI;
      } else if (paramInt > 1) {
        locala = a.lnH;
      }
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(5217982611456L, 38877);
      lnH = new a("GOOD", 0);
      lnI = new a("SLIGHT", 1);
      lnJ = new a("BAD", 2);
      lnK = new a("MEDIUM", 3);
      lnL = new a("BEST", 4);
      lnM = new a[] { lnH, lnI, lnJ, lnK, lnL };
      GMTrace.o(5217982611456L, 38877);
    }
    
    private a()
    {
      GMTrace.i(5217848393728L, 38876);
      GMTrace.o(5217848393728L, 38876);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
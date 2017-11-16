package com.tencent.mm.plugin.messenger.foundation.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ae;

public final class a
{
  public static long a(ae paramae, int paramInt, long paramLong)
  {
    GMTrace.i(13369830539264L, 99613);
    if (paramae == null)
    {
      GMTrace.o(13369830539264L, 99613);
      return 0L;
    }
    if (paramLong != 0L) {}
    for (;;)
    {
      switch (paramInt)
      {
      default: 
        paramLong = a(paramae, paramLong);
        GMTrace.o(13369830539264L, 99613);
        return paramLong;
        paramLong = bg.Pv();
      }
    }
    paramLong = a(paramae, paramLong);
    GMTrace.o(13369830539264L, 99613);
    return paramLong | 0x4000000000000000;
    paramLong = a(paramae, paramLong);
    GMTrace.o(13369830539264L, 99613);
    return paramLong & 0xBFFFFFFFFFFFFFFF;
    paramLong = a(paramae, paramLong);
    GMTrace.o(13369830539264L, 99613);
    return paramLong & 0x4000000000000000;
    paramLong = a(paramae, paramLong);
    GMTrace.o(13369830539264L, 99613);
    return paramLong | 0x1000000000000000;
    paramLong = a(paramae, paramLong);
    GMTrace.o(13369830539264L, 99613);
    return paramLong & 0xEFFFFFFFFFFFFFFF;
    paramLong = a(paramae, paramLong);
    GMTrace.o(13369830539264L, 99613);
    return paramLong & 0x1000000000000000;
  }
  
  public static long a(ae paramae, long paramLong)
  {
    GMTrace.i(13369964756992L, 99614);
    long l = paramae.field_flag;
    GMTrace.o(13369964756992L, 99614);
    return l & 0xFF00000000000000 | 0xFFFFFFFFFFFFFF & paramLong;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\messenger\foundation\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
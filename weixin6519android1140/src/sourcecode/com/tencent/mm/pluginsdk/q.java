package com.tencent.mm.pluginsdk;

import com.tencent.gmtrace.GMTrace;

public final class q
{
  public static float at(float paramFloat)
  {
    GMTrace.i(886105440256L, 6602);
    if (paramFloat > 0.0F)
    {
      GMTrace.o(886105440256L, 6602);
      return paramFloat % 360.0F;
    }
    float f = ((int)paramFloat * -1 / 360 + 1) * 360;
    GMTrace.o(886105440256L, 6602);
    return (f + paramFloat) % 360.0F;
  }
  
  public static double d(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    GMTrace.i(885971222528L, 6601);
    paramDouble1 = 3.141592653589793D * paramDouble1 / 180.0D;
    paramDouble3 = 3.141592653589793D * paramDouble3 / 180.0D;
    paramDouble2 = (paramDouble2 - paramDouble4) * 3.141592653589793D / 180.0D;
    paramDouble4 = Math.pow(Math.sin((paramDouble1 - paramDouble3) / 2.0D), 2.0D);
    paramDouble1 = Math.round(Math.asin(Math.sqrt(Math.cos(paramDouble1) * Math.cos(paramDouble3) * Math.pow(Math.sin(paramDouble2 / 2.0D), 2.0D) + paramDouble4)) * 2.0D * 6378137.0D * 10000.0D) / 10000L;
    GMTrace.o(885971222528L, 6601);
    return paramDouble1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\pluginsdk\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
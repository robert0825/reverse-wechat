package com.tencent.mm.plugin.appbrand.menu;

import com.tencent.gmtrace.GMTrace;

public final class l
  extends Enum<l>
{
  static
  {
    GMTrace.i(15559324336128L, 115926);
    isn = 1;
    iso = 2;
    isp = 3;
    isq = 4;
    isr = 5;
    iss = 6;
    ist = 7;
    isu = 8;
    isv = 9;
    isw = 10;
    isx = 11;
    isy = 12;
    isz = new int[] { isn, iso, isp, isq, isr, iss, ist, isu, isv, isw, isx, isy };
    GMTrace.o(15559324336128L, 115926);
  }
  
  public static int jc(int paramInt)
  {
    GMTrace.i(15559190118400L, 115925);
    int[] arrayOfInt = (int[])isz.clone();
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = arrayOfInt[i];
      if (k - 1 == paramInt)
      {
        GMTrace.o(15559190118400L, 115925);
        return k;
      }
      i += 1;
    }
    GMTrace.o(15559190118400L, 115925);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\menu\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
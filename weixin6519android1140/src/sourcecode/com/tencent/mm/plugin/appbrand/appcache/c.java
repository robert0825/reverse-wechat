package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.a;

public abstract interface c
{
  public static final int[] hIx;
  public static final int[] hIy;
  
  static
  {
    GMTrace.i(17655134158848L, 131541);
    hIx = new int[] { 0, 10002, 10102 };
    hIy = new int[] { 1, 2, 999, 10000, 10001, 10100, 10101 };
    GMTrace.o(17655134158848L, 131541);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(10606958608384L, 79028);
      hIz = new a[0];
      GMTrace.o(10606958608384L, 79028);
    }
    
    public static boolean fI(int paramInt)
    {
      GMTrace.i(17654999941120L, 131540);
      boolean bool = a.b(c.hIy, paramInt);
      GMTrace.o(17654999941120L, 131540);
      return bool;
    }
    
    public static boolean hX(int paramInt)
    {
      GMTrace.i(17654865723392L, 131539);
      boolean bool = a.b(c.hIx, paramInt);
      GMTrace.o(17654865723392L, 131539);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
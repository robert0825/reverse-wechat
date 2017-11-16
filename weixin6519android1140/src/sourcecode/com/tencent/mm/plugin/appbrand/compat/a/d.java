package com.tencent.mm.plugin.appbrand.compat.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.c.a;

public abstract interface d
  extends a
{
  public abstract void a(a parama);
  
  public abstract void b(a parama);
  
  public static abstract interface a
  {
    public abstract void a(double paramDouble1, double paramDouble2, d.b paramb, double paramDouble3, double paramDouble4, double paramDouble5);
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(20036693524480L, 149285);
      hPv = new b("GPS", 0);
      hPw = new b("NETWORK", 1);
      hPx = new b[] { hPv, hPw };
      GMTrace.o(20036693524480L, 149285);
    }
    
    private b()
    {
      GMTrace.i(20036425089024L, 149283);
      GMTrace.o(20036425089024L, 149283);
    }
    
    public static b pc(String paramString)
    {
      GMTrace.i(20036559306752L, 149284);
      if ("gps".equals(paramString))
      {
        paramString = hPv;
        GMTrace.o(20036559306752L, 149284);
        return paramString;
      }
      paramString = hPw;
      GMTrace.o(20036559306752L, 149284);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
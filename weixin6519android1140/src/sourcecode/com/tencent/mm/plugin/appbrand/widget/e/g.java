package com.tencent.mm.plugin.appbrand.widget.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;

public final class g
{
  public static double iRp;
  final double iRq;
  
  static
  {
    GMTrace.i(15432488583168L, 114981);
    iRp = 6378137.0D;
    GMTrace.o(15432488583168L, 114981);
  }
  
  public g()
  {
    GMTrace.i(15432220147712L, 114979);
    this.iRq = (6.283185307179586D * iRp);
    GMTrace.o(15432220147712L, 114979);
  }
  
  public final f c(b.f paramf)
  {
    GMTrace.i(19862076260352L, 147984);
    double d1 = paramf.Ui() / 360.0D;
    double d2 = Math.sin(Math.toRadians(paramf.Uh()));
    d2 = Math.log((1.0D + d2) / (1.0D - d2)) * 0.5D / -6.283185307179586D;
    paramf = new f((d1 + 0.5D) * this.iRq, (d2 + 0.5D) * this.iRq);
    GMTrace.o(19862076260352L, 147984);
    return paramf;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\e\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
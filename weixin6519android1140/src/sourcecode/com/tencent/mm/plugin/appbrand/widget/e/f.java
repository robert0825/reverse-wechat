package com.tencent.mm.plugin.appbrand.widget.e;

import com.tencent.gmtrace.GMTrace;

public final class f
{
  public final double x;
  public final double y;
  
  public f(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(15434904502272L, 114999);
    this.x = paramDouble1;
    this.y = paramDouble2;
    GMTrace.o(15434904502272L, 114999);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(15435038720000L, 115000);
    if (!(paramObject instanceof f))
    {
      GMTrace.o(15435038720000L, 115000);
      return false;
    }
    if ((this.x == ((f)paramObject).x) && (this.y == ((f)paramObject).y))
    {
      GMTrace.o(15435038720000L, 115000);
      return true;
    }
    GMTrace.o(15435038720000L, 115000);
    return false;
  }
  
  public final String toString()
  {
    GMTrace.i(15435172937728L, 115001);
    String str = "Point{x=" + this.x + ", y=" + this.y + '}';
    GMTrace.o(15435172937728L, 115001);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
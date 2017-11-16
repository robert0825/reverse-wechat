package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;

final class f
  implements b.f
{
  final LatLng hPc;
  
  f(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(19486535057408L, 145186);
    this.hPc = new LatLng(paramDouble1, paramDouble2);
    GMTrace.o(19486535057408L, 145186);
  }
  
  f(LatLng paramLatLng)
  {
    GMTrace.i(19486669275136L, 145187);
    if (paramLatLng != null)
    {
      this.hPc = paramLatLng;
      GMTrace.o(19486669275136L, 145187);
      return;
    }
    this.hPc = new LatLng(0.0D, 0.0D);
    GMTrace.o(19486669275136L, 145187);
  }
  
  static LatLng a(b.f paramf)
  {
    GMTrace.i(19486803492864L, 145188);
    if ((paramf instanceof f))
    {
      paramf = ((f)paramf).hPc;
      GMTrace.o(19486803492864L, 145188);
      return paramf;
    }
    paramf = new LatLng(paramf.Uh(), paramf.Ui());
    GMTrace.o(19486803492864L, 145188);
    return paramf;
  }
  
  public final double Uh()
  {
    GMTrace.i(19486266621952L, 145184);
    double d = this.hPc.getLatitude();
    GMTrace.o(19486266621952L, 145184);
    return d;
  }
  
  public final double Ui()
  {
    GMTrace.i(19486400839680L, 145185);
    double d = this.hPc.getLongitude();
    GMTrace.o(19486400839680L, 145185);
    return d;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
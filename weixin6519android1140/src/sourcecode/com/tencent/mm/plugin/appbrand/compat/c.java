package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mm.plugin.appbrand.compat.a.b.c;

final class c
  implements b.c
{
  final CircleOptions hOR;
  
  c()
  {
    GMTrace.i(19487877234688L, 145196);
    this.hOR = new CircleOptions();
    GMTrace.o(19487877234688L, 145196);
  }
  
  public final void d(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(19488011452416L, 145197);
    this.hOR.center(new LatLng(paramDouble1, paramDouble2));
    GMTrace.o(19488011452416L, 145197);
  }
  
  public final void ii(int paramInt)
  {
    GMTrace.i(19488145670144L, 145198);
    this.hOR.radius(paramInt);
    GMTrace.o(19488145670144L, 145198);
  }
  
  public final void ij(int paramInt)
  {
    GMTrace.i(19488279887872L, 145199);
    this.hOR.strokeColor(paramInt);
    GMTrace.o(19488279887872L, 145199);
  }
  
  public final void ik(int paramInt)
  {
    GMTrace.i(19488414105600L, 145200);
    this.hOR.strokeWidth(paramInt);
    GMTrace.o(19488414105600L, 145200);
  }
  
  public final void il(int paramInt)
  {
    GMTrace.i(19488548323328L, 145201);
    this.hOR.fillColor(paramInt);
    GMTrace.o(19488548323328L, 145201);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
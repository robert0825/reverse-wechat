package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mapsdk.raster.model.VisibleRegion;
import com.tencent.mm.plugin.appbrand.compat.a.b.g;
import com.tencent.mm.plugin.appbrand.compat.a.b.r;

final class l
  implements b.r
{
  final VisibleRegion hPk;
  
  l(VisibleRegion paramVisibleRegion)
  {
    GMTrace.i(19483448049664L, 145163);
    this.hPk = paramVisibleRegion;
    GMTrace.o(19483448049664L, 145163);
  }
  
  public final b.g Ul()
  {
    GMTrace.i(19483582267392L, 145164);
    e locale = new e(this.hPk.getLatLngBounds());
    GMTrace.o(19483582267392L, 145164);
    return locale;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
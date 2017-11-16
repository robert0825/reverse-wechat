package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mapsdk.rastercore.d.a;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.q;
import com.tencent.mm.plugin.appbrand.compat.a.b.r;

final class j
  implements b.q
{
  final com.tencent.tencentmap.mapsdk.map.f hPh;
  
  j(com.tencent.tencentmap.mapsdk.map.f paramf)
  {
    GMTrace.i(19497272475648L, 145266);
    this.hPh = paramf;
    GMTrace.o(19497272475648L, 145266);
  }
  
  public final b.r Uk()
  {
    GMTrace.i(19497406693376L, 145267);
    l locall = new l(this.hPh.cpY());
    GMTrace.o(19497406693376L, 145267);
    return locall;
  }
  
  public final double a(b.f paramf1, b.f paramf2)
  {
    GMTrace.i(19497540911104L, 145268);
    double d = d.a.a(f.a(paramf1), f.a(paramf2));
    GMTrace.o(19497540911104L, 145268);
    return d;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
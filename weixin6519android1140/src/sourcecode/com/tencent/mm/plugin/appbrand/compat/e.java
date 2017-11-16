package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.g;

final class e
  implements b.g
{
  final LatLngBounds hPb;
  
  e(LatLngBounds paramLatLngBounds)
  {
    GMTrace.i(19498883088384L, 145278);
    this.hPb = paramLatLngBounds;
    GMTrace.o(19498883088384L, 145278);
  }
  
  public final b.f Uf()
  {
    GMTrace.i(19499017306112L, 145279);
    Object localObject = this.hPb.getSouthwest();
    localObject = new f(((LatLng)localObject).getLatitude(), ((LatLng)localObject).getLongitude());
    GMTrace.o(19499017306112L, 145279);
    return (b.f)localObject;
  }
  
  public final b.f Ug()
  {
    GMTrace.i(19499151523840L, 145280);
    Object localObject = this.hPb.getNortheast();
    localObject = new f(((LatLng)localObject).getLatitude(), ((LatLng)localObject).getLongitude());
    GMTrace.o(19499151523840L, 145280);
    return (b.f)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
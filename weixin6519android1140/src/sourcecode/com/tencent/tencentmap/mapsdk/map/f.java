package com.tencent.tencentmap.mapsdk.map;

import android.graphics.Point;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.mapsdk.raster.model.LatLngBounds.Builder;
import com.tencent.mapsdk.raster.model.VisibleRegion;
import com.tencent.mapsdk.rastercore.d.b;
import com.tencent.mapsdk.rastercore.d.c;
import com.tencent.mapsdk.rastercore.d.e;

public final class f
{
  private e mapContext;
  public c ybR;
  
  public f(e parame)
  {
    this.mapContext = parame;
    this.ybR = parame.b();
  }
  
  private LatLng f(Point paramPoint)
  {
    return this.ybR.a(paramPoint.x, paramPoint.y);
  }
  
  public final VisibleRegion cpY()
  {
    int i = this.mapContext.c().getWidth();
    int j = this.mapContext.c().getHeight();
    LatLng localLatLng1 = f(new Point(0, 0));
    LatLng localLatLng2 = f(new Point(i, 0));
    LatLng localLatLng3 = f(new Point(0, j));
    LatLng localLatLng4 = f(new Point(i, j));
    return new VisibleRegion(localLatLng3, localLatLng4, localLatLng1, localLatLng2, LatLngBounds.builder().include(localLatLng3).include(localLatLng4).include(localLatLng1).include(localLatLng2).build());
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tencentmap\mapsdk\map\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
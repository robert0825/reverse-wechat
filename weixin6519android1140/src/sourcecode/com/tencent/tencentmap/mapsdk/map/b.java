package com.tencent.tencentmap.mapsdk.map;

import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.CameraPosition.Builder;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.mapsdk.rastercore.c.h;
import com.tencent.mapsdk.rastercore.d.a;

public final class b
{
  public static a a(LatLng paramLatLng, float paramFloat)
  {
    return new a(d.a.a(CameraPosition.builder().target(paramLatLng).zoom(paramFloat).build()));
  }
  
  public static a a(LatLngBounds paramLatLngBounds, int paramInt)
  {
    return new a(d.a.a(paramLatLngBounds, 0, 0, paramInt));
  }
  
  public static a aD(float paramFloat)
  {
    h localh = new h();
    localh.a(paramFloat);
    return new a(localh);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tencentmap\mapsdk\map\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
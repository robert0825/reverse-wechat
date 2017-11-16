package com.tencent.mapsdk.rastercore.tile.b;

import com.tencent.mapsdk.raster.model.TileProvider;
import com.tencent.mapsdk.rastercore.d.a.1;
import com.tencent.mapsdk.rastercore.tile.MapTile.MapSource;
import java.util.Map;
import java.util.WeakHashMap;

public final class c
{
  private static Map<MapTile.MapSource, TileProvider> a = new WeakHashMap();
  
  public static TileProvider a(com.tencent.mapsdk.rastercore.d.e parame, MapTile.MapSource paramMapSource)
  {
    if (parame.f().a() > 1) {}
    for (int i = 2;; i = 1)
    {
      parame = (TileProvider)a.get(paramMapSource);
      if (parame == null) {
        break;
      }
      return parame;
    }
    switch (1.a[paramMapSource.ordinal()])
    {
    default: 
      return null;
    case 1: 
      parame = new e(i);
    }
    for (;;)
    {
      a.put(paramMapSource, parame);
      return parame;
      parame = new b(i);
      continue;
      parame = new d(i);
      continue;
      parame = new f(i);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
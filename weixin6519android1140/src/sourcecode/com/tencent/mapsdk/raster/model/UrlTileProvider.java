package com.tencent.mapsdk.raster.model;

import com.tencent.mapsdk.rastercore.tile.MapTile.MapSource;
import com.tencent.mapsdk.rastercore.tile.c;
import java.net.URL;

public abstract class UrlTileProvider
  implements TileProvider
{
  public final Tile getTile(int paramInt1, int paramInt2, int paramInt3, MapTile.MapSource paramMapSource, Object... paramVarArgs)
  {
    paramMapSource = getTileUrl(paramInt1, paramInt2, paramInt3, paramVarArgs);
    if (paramMapSource == null) {
      return null;
    }
    return new Tile(paramInt1, paramInt2, paramInt3, c.a(paramMapSource));
  }
  
  public abstract URL getTileUrl(int paramInt1, int paramInt2, int paramInt3, Object... paramVarArgs);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\raster\model\UrlTileProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
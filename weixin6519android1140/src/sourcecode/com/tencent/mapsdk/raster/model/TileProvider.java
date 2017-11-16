package com.tencent.mapsdk.raster.model;

import com.tencent.mapsdk.rastercore.tile.MapTile.MapSource;

public abstract interface TileProvider
{
  public static final Tile NO_TILE = new Tile(-1, -1, -1, null);
  
  public abstract Tile getTile(int paramInt1, int paramInt2, int paramInt3, MapTile.MapSource paramMapSource, Object... paramVarArgs);
  
  public abstract int getTileHeight();
  
  public abstract int getTileWidth();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\raster\model\TileProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mapsdk.rastercore.tile.b;

import com.tencent.mapsdk.raster.model.UrlTileProvider;

public abstract class a
  extends UrlTileProvider
{
  public a(int paramInt) {}
  
  protected static int a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 % paramInt2;
    paramInt1 = i;
    if (i * paramInt2 < 0) {
      paramInt1 = i + paramInt2;
    }
    return paramInt1;
  }
  
  public int getTileHeight()
  {
    return 256;
  }
  
  public int getTileWidth()
  {
    return 256;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
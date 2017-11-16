package com.tencent.mapsdk.raster.model;

public final class TileOverlayOptions
{
  private boolean diskCacheEnabled = true;
  private TileProvider tileProvider;
  private boolean visible = true;
  private float zIndex = 1.0F;
  
  public final TileOverlayOptions diskCacheEnabled(boolean paramBoolean)
  {
    this.diskCacheEnabled = paramBoolean;
    return this;
  }
  
  public final boolean getDiskCacheEnabled()
  {
    return this.diskCacheEnabled;
  }
  
  public final TileProvider getTileProvider()
  {
    return this.tileProvider;
  }
  
  public final float getZIndex()
  {
    return this.zIndex;
  }
  
  public final boolean isVisible()
  {
    return this.visible;
  }
  
  public final TileOverlayOptions tileProvider(TileProvider paramTileProvider)
  {
    this.tileProvider = paramTileProvider;
    return this;
  }
  
  public final TileOverlayOptions visible(boolean paramBoolean)
  {
    this.visible = paramBoolean;
    return this;
  }
  
  public final TileOverlayOptions zIndex(float paramFloat)
  {
    this.zIndex = paramFloat;
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\raster\model\TileOverlayOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
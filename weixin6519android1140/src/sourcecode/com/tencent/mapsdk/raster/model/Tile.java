package com.tencent.mapsdk.raster.model;

public final class Tile
{
  private final byte[] data;
  private final int x;
  private final int y;
  private final int zoom;
  
  public Tile(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this.x = paramInt1;
    this.y = paramInt2;
    this.zoom = paramInt3;
    this.data = paramArrayOfByte;
  }
  
  public final byte[] getData()
  {
    return this.data;
  }
  
  public final int getX()
  {
    return this.x;
  }
  
  public final int getY()
  {
    return this.y;
  }
  
  public final int getZoom()
  {
    return this.zoom;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\raster\model\Tile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
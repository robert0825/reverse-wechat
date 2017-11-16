package com.tencent.mapsdk.raster.model;

import com.tencent.mapsdk.rastercore.e.a.f;

public final class TileOverlay
  implements IOverlay
{
  private f delegate;
  
  public TileOverlay(f paramf)
  {
    this.delegate = paramf;
  }
  
  public final void clearTileCache() {}
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    while (!(paramObject instanceof TileOverlay)) {
      return false;
    }
    paramObject = (TileOverlay)paramObject;
    return this.delegate.equals(((TileOverlay)paramObject).delegate);
  }
  
  public final String getId()
  {
    return this.delegate.d();
  }
  
  public final int hashCode()
  {
    return this.delegate.hashCode();
  }
  
  public final boolean isVisible()
  {
    return this.delegate.e();
  }
  
  public final void remove()
  {
    this.delegate.b();
  }
  
  public final void setVisible(boolean paramBoolean)
  {
    this.delegate.a(paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mapsdk\raster\model\TileOverlay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
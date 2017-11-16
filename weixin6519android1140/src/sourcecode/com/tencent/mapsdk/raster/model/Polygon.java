package com.tencent.mapsdk.raster.model;

import com.tencent.mapsdk.rastercore.e.c;
import java.util.List;

public final class Polygon
  implements IOverlay
{
  private c polygonDelegate;
  
  public Polygon(c paramc)
  {
    this.polygonDelegate = paramc;
  }
  
  public final boolean contains(LatLng paramLatLng)
  {
    return this.polygonDelegate.a(paramLatLng);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Polygon)) {
      return false;
    }
    return this.polygonDelegate.equalsRemote(((Polygon)paramObject).polygonDelegate);
  }
  
  public final int getFillColor()
  {
    return this.polygonDelegate.b();
  }
  
  public final String getId()
  {
    return this.polygonDelegate.getId();
  }
  
  public final List<LatLng> getPoints()
  {
    return this.polygonDelegate.c();
  }
  
  public final int getStrokeColor()
  {
    return this.polygonDelegate.d();
  }
  
  public final float getStrokeWidth()
  {
    return this.polygonDelegate.a();
  }
  
  public final float getZIndex()
  {
    return this.polygonDelegate.getZIndex();
  }
  
  public final int hashCode()
  {
    return this.polygonDelegate.hashCodeRemote();
  }
  
  public final boolean isVisible()
  {
    return this.polygonDelegate.isVisible();
  }
  
  public final void remove()
  {
    this.polygonDelegate.remove();
  }
  
  public final void setFillColor(int paramInt)
  {
    this.polygonDelegate.a(paramInt);
  }
  
  public final void setPoints(List<LatLng> paramList)
  {
    this.polygonDelegate.a(paramList);
  }
  
  public final void setStrokeColor(int paramInt)
  {
    this.polygonDelegate.b(paramInt);
  }
  
  public final void setStrokeWidth(float paramFloat)
  {
    this.polygonDelegate.a(paramFloat);
  }
  
  public final void setVisible(boolean paramBoolean)
  {
    this.polygonDelegate.setVisible(paramBoolean);
  }
  
  public final void setZIndex(float paramFloat)
  {
    this.polygonDelegate.setZIndex(paramFloat);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\raster\model\Polygon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
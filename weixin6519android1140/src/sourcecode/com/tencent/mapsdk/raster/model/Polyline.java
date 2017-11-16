package com.tencent.mapsdk.raster.model;

import com.tencent.mapsdk.rastercore.e.d;
import java.util.List;

public class Polyline
  implements IOverlay
{
  private final d polylineDelegate;
  
  public Polyline(d paramd)
  {
    this.polylineDelegate = paramd;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Polyline)) {
      return false;
    }
    return this.polylineDelegate.equalsRemote(((Polyline)paramObject).polylineDelegate);
  }
  
  public int getColor()
  {
    return this.polylineDelegate.b();
  }
  
  public String getId()
  {
    return this.polylineDelegate.getId();
  }
  
  public List<LatLng> getPoints()
  {
    return this.polylineDelegate.c();
  }
  
  public float getWidth()
  {
    return this.polylineDelegate.a();
  }
  
  public float getZIndex()
  {
    return this.polylineDelegate.getZIndex();
  }
  
  public final int hashCode()
  {
    return this.polylineDelegate.hashCodeRemote();
  }
  
  public boolean isDottedLine()
  {
    return this.polylineDelegate.d();
  }
  
  public boolean isGeodesic()
  {
    return this.polylineDelegate.e();
  }
  
  public boolean isVisible()
  {
    return this.polylineDelegate.isVisible();
  }
  
  public void remove()
  {
    this.polylineDelegate.remove();
  }
  
  public void setColor(int paramInt)
  {
    this.polylineDelegate.a(paramInt);
  }
  
  public void setDottedLine(boolean paramBoolean)
  {
    this.polylineDelegate.a(paramBoolean);
  }
  
  public void setGeodesic(boolean paramBoolean)
  {
    if (this.polylineDelegate.e() != paramBoolean)
    {
      List localList = getPoints();
      this.polylineDelegate.b(paramBoolean);
      setPoints(localList);
    }
  }
  
  public void setPoints(List<LatLng> paramList)
  {
    this.polylineDelegate.a(paramList);
  }
  
  public void setVisible(boolean paramBoolean)
  {
    this.polylineDelegate.setVisible(paramBoolean);
  }
  
  public void setWidth(float paramFloat)
  {
    this.polylineDelegate.a(paramFloat);
  }
  
  public void setZIndex(float paramFloat)
  {
    this.polylineDelegate.setZIndex(paramFloat);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\raster\model\Polyline.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
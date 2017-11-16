package com.tencent.mapsdk.raster.model;

import android.os.RemoteException;
import com.tencent.mapsdk.rastercore.tile.a.b;

public final class GroundOverlay
  implements IOverlay
{
  private b iGroundOverlayDelegate$14ec2531;
  
  public GroundOverlay(b paramb)
  {
    this.iGroundOverlayDelegate$14ec2531 = paramb;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof GroundOverlay)) {
      return false;
    }
    try
    {
      throw new RemoteException();
    }
    catch (RemoteException paramObject) {}
    return false;
  }
  
  public final float getBearing()
  {
    return this.iGroundOverlayDelegate$14ec2531.e();
  }
  
  protected final LatLngBounds getBounds()
  {
    return this.iGroundOverlayDelegate$14ec2531.d();
  }
  
  protected final float getHeight()
  {
    return this.iGroundOverlayDelegate$14ec2531.c();
  }
  
  public final String getId()
  {
    return this.iGroundOverlayDelegate$14ec2531.getId();
  }
  
  protected final LatLng getPosition()
  {
    return this.iGroundOverlayDelegate$14ec2531.a();
  }
  
  protected final float getTransparency()
  {
    return this.iGroundOverlayDelegate$14ec2531.f();
  }
  
  protected final float getWidth()
  {
    return this.iGroundOverlayDelegate$14ec2531.b();
  }
  
  public final float getZIndex()
  {
    return this.iGroundOverlayDelegate$14ec2531.getZIndex();
  }
  
  public final int hashCode()
  {
    return this.iGroundOverlayDelegate$14ec2531.hashCode();
  }
  
  public final boolean isVisible()
  {
    return this.iGroundOverlayDelegate$14ec2531.isVisible();
  }
  
  public final void remove()
  {
    this.iGroundOverlayDelegate$14ec2531.remove();
  }
  
  public final void setAnchor(float paramFloat1, float paramFloat2)
  {
    this.iGroundOverlayDelegate$14ec2531.b(paramFloat1, paramFloat2);
  }
  
  public final void setBearing(float paramFloat)
  {
    this.iGroundOverlayDelegate$14ec2531.b(paramFloat);
  }
  
  protected final void setDimensions(float paramFloat)
  {
    this.iGroundOverlayDelegate$14ec2531.a(paramFloat);
  }
  
  protected final void setDimensions(float paramFloat1, float paramFloat2)
  {
    this.iGroundOverlayDelegate$14ec2531.a(paramFloat1, paramFloat2);
  }
  
  protected final void setImage(BitmapDescriptor paramBitmapDescriptor)
  {
    this.iGroundOverlayDelegate$14ec2531.a(paramBitmapDescriptor);
  }
  
  protected final void setPosition(LatLng paramLatLng)
  {
    this.iGroundOverlayDelegate$14ec2531.a(paramLatLng);
  }
  
  protected final void setPositionFromBounds(LatLngBounds paramLatLngBounds)
  {
    this.iGroundOverlayDelegate$14ec2531.a(paramLatLngBounds);
  }
  
  protected final void setTransparency(float paramFloat)
  {
    this.iGroundOverlayDelegate$14ec2531.c(paramFloat);
  }
  
  public final void setVisible(boolean paramBoolean)
  {
    this.iGroundOverlayDelegate$14ec2531.setVisible(paramBoolean);
  }
  
  public final void setZIndex(float paramFloat)
  {
    this.iGroundOverlayDelegate$14ec2531.setZIndex(paramFloat);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\raster\model\GroundOverlay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
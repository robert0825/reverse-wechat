package com.tencent.tencentmap.mapsdk.map;

import android.graphics.Canvas;
import com.tencent.mapsdk.rastercore.d.a;
import com.tencent.mapsdk.rastercore.e.b;

public final class e
  implements b
{
  protected String id = getId();
  protected boolean isVisible = true;
  protected com.tencent.mapsdk.rastercore.d.e mapContext;
  protected MapView ybN;
  protected a ybO;
  protected float zIndex = 0.0F;
  
  public final void a(MapView paramMapView)
  {
    this.ybN = paramMapView;
    this.mapContext = paramMapView.getMapContext();
    this.ybO = this.mapContext.e();
  }
  
  public final boolean checkInBounds()
  {
    return false;
  }
  
  public final void destroy() {}
  
  public final void draw(Canvas paramCanvas) {}
  
  public final boolean equalsRemote(b paramb)
  {
    return (equals(paramb)) || (paramb.getId().equals(getId()));
  }
  
  public final String getId()
  {
    if (this.id == null) {
      this.id = a.a("Overlay");
    }
    return this.id;
  }
  
  public final float getZIndex()
  {
    return this.zIndex;
  }
  
  public final int hashCodeRemote()
  {
    return 0;
  }
  
  public final boolean isVisible()
  {
    return this.isVisible;
  }
  
  public final void remove()
  {
    this.ybO.b(getId());
  }
  
  public final void setVisible(boolean paramBoolean)
  {
    this.isVisible = paramBoolean;
    this.mapContext.a(false, false);
  }
  
  public final void setZIndex(float paramFloat)
  {
    this.zIndex = paramFloat;
    this.ybO.c();
    this.mapContext.a(false, false);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tencentmap\mapsdk\map\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
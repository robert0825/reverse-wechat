package com.tencent.mapsdk.rastercore.c;

import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.rastercore.d.a;
import com.tencent.mapsdk.rastercore.d.b;
import com.tencent.mapsdk.rastercore.d.e;

public final class c
  extends a
{
  private CameraPosition d;
  
  public final void a(CameraPosition paramCameraPosition)
  {
    this.d = paramCameraPosition;
  }
  
  public final void a(e parame)
  {
    parame = parame.c();
    if (this.a) {
      parame.a(d.a.a(this.d.getTarget()), this.b, this.c);
    }
    for (;;)
    {
      if (this.d.getZoom() > 0.0F) {
        parame.b(this.d.getZoom(), false, this.c);
      }
      return;
      parame.b(d.a.a(this.d.getTarget()));
    }
  }
  
  public final boolean a()
  {
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
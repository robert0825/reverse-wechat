package com.tencent.mapsdk.rastercore.c;

import android.graphics.Point;
import android.graphics.PointF;
import com.tencent.mapsdk.rastercore.d.b;

public final class e
  extends a
{
  private float d;
  private Point e;
  
  public final void a(float paramFloat)
  {
    this.d = paramFloat;
  }
  
  public final void a(Point paramPoint)
  {
    this.e = paramPoint;
  }
  
  public final void a(com.tencent.mapsdk.rastercore.d.e parame)
  {
    if (this.e != null)
    {
      PointF localPointF = new PointF(this.e.x, this.e.y);
      parame.c().a(this.d, localPointF, this.a, this.c);
      return;
    }
    parame.c().a(this.d, this.a, this.c);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
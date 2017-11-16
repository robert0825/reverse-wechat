package com.tencent.mapsdk.rastercore.a;

import android.graphics.PointF;
import com.tencent.mapsdk.rastercore.d.b;
import com.tencent.mapsdk.rastercore.d.e;

public final class c
  extends a
{
  private PointF d;
  private double e;
  private double f;
  
  public c(e parame, double paramDouble, PointF paramPointF, long paramLong, com.tencent.tencentmap.mapsdk.map.c paramc)
  {
    super(parame, paramLong, paramc);
    this.e = paramDouble;
    this.d = paramPointF;
  }
  
  protected final void a(float paramFloat)
  {
    this.b.a(this.f * paramFloat, this.d, false, null);
  }
  
  protected final void c()
  {
    double d1 = this.b.c();
    this.f = (this.e - d1);
    new StringBuilder("newZoom:").append(this.e).append(",oldZoom=").append(d1);
  }
  
  protected final void d()
  {
    this.b.a(this.e, this.d, false, 0L, null);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
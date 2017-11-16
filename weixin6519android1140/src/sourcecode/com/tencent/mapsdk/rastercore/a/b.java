package com.tencent.mapsdk.rastercore.a;

import com.tencent.mapsdk.rastercore.d.e;

public final class b
  extends a
{
  private com.tencent.mapsdk.rastercore.b.c d;
  private com.tencent.mapsdk.rastercore.b.c e;
  private double f;
  private double g;
  
  public b(e parame, com.tencent.mapsdk.rastercore.b.c paramc, long paramLong, com.tencent.tencentmap.mapsdk.map.c paramc1)
  {
    super(parame, paramLong, paramc1);
    this.e = paramc;
  }
  
  protected final void a(float paramFloat)
  {
    double d1 = this.f;
    double d2 = paramFloat;
    double d3 = this.g;
    double d4 = paramFloat;
    this.d.b(d1 * d2 + this.d.b());
    this.d.a(d3 * d4 + this.d.a());
    this.b.b(this.d);
  }
  
  protected final void c()
  {
    this.d = this.b.b();
    this.f = (this.e.b() - this.d.b());
    this.g = (this.e.a() - this.d.a());
  }
  
  protected final void d()
  {
    this.b.b(this.e);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
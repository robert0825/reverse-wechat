package com.tencent.mapsdk.rastercore.b;

import com.tencent.mapsdk.rastercore.f.a;

public final class b
{
  private c a;
  private c b;
  
  public b(c paramc1, c paramc2)
  {
    paramc1 = new a().a(paramc1).a(paramc2);
    this.a = new c(paramc1.c, paramc1.a);
    this.b = new c(paramc1.d, paramc1.b);
  }
  
  public final c a()
  {
    return this.a;
  }
  
  public final c b()
  {
    return this.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof b)) {
        return false;
      }
      paramObject = (b)paramObject;
    } while ((this.a.equals(((b)paramObject).a)) && (this.b.equals(((b)paramObject).b)));
    return false;
  }
  
  public final int hashCode()
  {
    return a.a(new Object[] { this.a, this.b });
  }
  
  public final String toString()
  {
    return a.a(new String[] { a.a("southwest", this.a), a.a("northeast", this.b) });
  }
  
  public static final class a
  {
    public double a = Double.MAX_VALUE;
    public double b = -1.7976931348623157E308D;
    public double c = Double.MAX_VALUE;
    public double d = -1.7976931348623157E308D;
    
    public final a a(c paramc)
    {
      this.a = Math.min(this.a, paramc.a());
      this.b = Math.max(this.b, paramc.a());
      this.d = Math.max(this.d, paramc.b());
      this.c = Math.min(this.c, paramc.b());
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
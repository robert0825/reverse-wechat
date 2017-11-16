package c.t.m.g;

import android.location.Location;

public final class dg
  extends di
{
  public final Location a;
  public final long b;
  public final int c;
  private int d;
  private int e;
  
  public dg(Location paramLocation, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramLocation;
    this.b = paramLong;
    this.d = paramInt1;
    this.c = paramInt2;
    this.e = paramInt3;
  }
  
  public dg(dg paramdg)
  {
    if (paramdg.a == null) {}
    for (Location localLocation = null;; localLocation = new Location(paramdg.a))
    {
      this.a = localLocation;
      this.b = paramdg.b;
      this.d = paramdg.d;
      this.c = paramdg.c;
      this.e = paramdg.e;
      return;
    }
  }
  
  public final String toString()
  {
    return "TxGpsInfo [location=" + this.a + ", gpsTime=" + this.b + ", visbleSatelliteNum=" + this.d + ", usedSatelliteNum=" + this.c + ", gpsStatus=" + this.e + "]";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
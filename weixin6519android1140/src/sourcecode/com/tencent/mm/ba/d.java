package com.tencent.mm.ba;

import com.tencent.gmtrace.GMTrace;

public final class d
{
  String gSW;
  double gSX;
  double latitude;
  double longitude;
  
  public d()
  {
    GMTrace.i(4403415220224L, 32808);
    GMTrace.o(4403415220224L, 32808);
  }
  
  public final String toString()
  {
    GMTrace.i(4403549437952L, 32809);
    String str = "gspType:" + this.gSW + " longitude: " + this.longitude + " latitude: " + this.latitude + " distance: " + this.gSX;
    GMTrace.o(4403549437952L, 32809);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ba\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
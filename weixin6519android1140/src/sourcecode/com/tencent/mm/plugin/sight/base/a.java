package com.tencent.mm.plugin.sight.base;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class a
{
  public int gBk;
  public int height;
  public int ljb;
  public int ncj;
  public int oRA;
  public int videoBitrate;
  public int width;
  
  public a()
  {
    GMTrace.i(9370544898048L, 69816);
    this.ljb = 0;
    this.videoBitrate = 0;
    this.width = 0;
    this.height = 0;
    this.ncj = 0;
    this.oRA = 0;
    this.gBk = 0;
    GMTrace.o(9370544898048L, 69816);
  }
  
  public final int bgg()
  {
    GMTrace.i(9370679115776L, 69817);
    int i = bg.eN(this.ljb);
    GMTrace.o(9370679115776L, 69817);
    return i;
  }
  
  public final String toString()
  {
    GMTrace.i(9370813333504L, 69818);
    String str = "[ videoDuration: " + this.ljb + " videoBitrate: " + this.videoBitrate + " width: " + this.width + " height: " + this.height + " frameRate: " + this.ncj + " audioChannel: " + this.oRA + " audioBitrate: " + this.gBk + "]";
    GMTrace.o(9370813333504L, 69818);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\sight\base\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
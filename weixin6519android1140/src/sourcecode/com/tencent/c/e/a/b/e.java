package com.tencent.c.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class e
  extends JceStruct
{
  static ArrayList<g> xSM;
  public int action = 0;
  public double lat = 0.0D;
  public int xRK = 0;
  public long xSJ = 0L;
  public ArrayList<g> xSK = null;
  public double xSL = 0.0D;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.xSJ = paramJceInputStream.read(this.xSJ, 0, true);
    if (xSM == null)
    {
      xSM = new ArrayList();
      g localg = new g();
      xSM.add(localg);
    }
    this.xSK = ((ArrayList)paramJceInputStream.read(xSM, 1, true));
    this.xRK = paramJceInputStream.read(this.xRK, 2, false);
    this.action = paramJceInputStream.read(this.action, 3, false);
    this.lat = paramJceInputStream.read(this.lat, 4, false);
    this.xSL = paramJceInputStream.read(this.xSL, 5, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.xSJ, 0);
    paramJceOutputStream.write(this.xSK, 1);
    if (this.xRK != 0) {
      paramJceOutputStream.write(this.xRK, 2);
    }
    if (this.action != 0) {
      paramJceOutputStream.write(this.action, 3);
    }
    if (this.lat != 0.0D) {
      paramJceOutputStream.write(this.lat, 4);
    }
    if (this.xSL != 0.0D) {
      paramJceOutputStream.write(this.xSL, 5);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
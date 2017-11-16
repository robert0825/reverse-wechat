package com.tencent.c.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class d
  extends JceStruct
{
  public int bZf = 0;
  public String gxw = "";
  public String model = "";
  public String platform = "";
  public String xRv = "";
  public String xRw = "";
  public int xRx = 0;
  public String xRy = "";
  
  public final JceStruct newInit()
  {
    return new d();
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.xRv = paramJceInputStream.readString(0, false);
    this.xRw = paramJceInputStream.readString(1, false);
    this.gxw = paramJceInputStream.readString(2, false);
    this.model = paramJceInputStream.readString(3, false);
    this.xRx = paramJceInputStream.read(this.xRx, 4, false);
    this.xRy = paramJceInputStream.readString(5, false);
    this.platform = paramJceInputStream.readString(6, false);
    this.bZf = paramJceInputStream.read(this.bZf, 7, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.xRv != null) {
      paramJceOutputStream.write(this.xRv, 0);
    }
    if (this.xRw != null) {
      paramJceOutputStream.write(this.xRw, 1);
    }
    if (this.gxw != null) {
      paramJceOutputStream.write(this.gxw, 2);
    }
    if (this.model != null) {
      paramJceOutputStream.write(this.model, 3);
    }
    if (this.xRx != 0) {
      paramJceOutputStream.write(this.xRx, 4);
    }
    if (this.xRy != null) {
      paramJceOutputStream.write(this.xRy, 5);
    }
    if (this.platform != null) {
      paramJceOutputStream.write(this.platform, 6);
    }
    if (this.bZf != 0) {
      paramJceOutputStream.write(this.bZf, 7);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\c\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
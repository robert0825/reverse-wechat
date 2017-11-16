package com.tencent.c.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class b
  extends JceStruct
{
  public String esG = "";
  public int xSF = 0;
  public float xSG = 0.0F;
  public String xSy = "";
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.xSy = paramJceInputStream.readString(0, true);
    this.xSF = paramJceInputStream.read(this.xSF, 1, true);
    this.xSG = paramJceInputStream.read(this.xSG, 2, true);
    this.esG = paramJceInputStream.readString(3, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.xSy, 0);
    paramJceOutputStream.write(this.xSF, 1);
    paramJceOutputStream.write(this.xSG, 2);
    if (this.esG != null) {
      paramJceOutputStream.write(this.esG, 3);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
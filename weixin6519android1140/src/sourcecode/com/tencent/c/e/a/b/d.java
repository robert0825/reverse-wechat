package com.tencent.c.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class d
  extends JceStruct
{
  static b xSI;
  public int errorCode = 0;
  public b xSH = null;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.errorCode = paramJceInputStream.read(this.errorCode, 0, true);
    if (xSI == null) {
      xSI = new b();
    }
    this.xSH = ((b)paramJceInputStream.read(xSI, 1, false));
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.errorCode, 0);
    if (this.xSH != null) {
      paramJceOutputStream.write(this.xSH, 1);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
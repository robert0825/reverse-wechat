package com.tencent.c.c.a;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class a
  extends JceStruct
{
  public int xQk = 0;
  public int xQl = 0;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.xQk = paramJceInputStream.read(this.xQk, 0, true);
    this.xQl = paramJceInputStream.read(this.xQl, 1, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.xQk, 0);
    paramJceOutputStream.write(this.xQl, 1);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
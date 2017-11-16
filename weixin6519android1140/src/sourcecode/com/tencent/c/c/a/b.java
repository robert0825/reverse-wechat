package com.tencent.c.c.a;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class b
  extends JceStruct
{
  public int xQm = 0;
  public int xQn = 0;
  public int xQo = 0;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.xQm = paramJceInputStream.read(this.xQm, 1, true);
    this.xQn = paramJceInputStream.read(this.xQn, 2, true);
    this.xQo = paramJceInputStream.read(this.xQo, 3, true);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.xQm, 1);
    paramJceOutputStream.write(this.xQn, 2);
    paramJceOutputStream.write(this.xQo, 3);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\c\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
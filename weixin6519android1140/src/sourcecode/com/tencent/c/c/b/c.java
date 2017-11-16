package com.tencent.c.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class c
  extends JceStruct
{
  static byte[] xRt;
  static byte[] xRu;
  public int gBq = 0;
  public int requestType = 0;
  public int xQB = 0;
  public int xRk = 0;
  public int xRl = 0;
  public int xRm = 0;
  public byte[] xRn = null;
  public int xRo = 0;
  public long xRp = 0L;
  public byte[] xRq = null;
  public int xRr = 0;
  public int xRs = 0;
  
  static
  {
    byte[] arrayOfByte = (byte[])new byte[1];
    xRt = arrayOfByte;
    ((byte[])arrayOfByte)[0] = 0;
    arrayOfByte = (byte[])new byte[1];
    xRu = arrayOfByte;
    ((byte[])arrayOfByte)[0] = 0;
  }
  
  public final JceStruct newInit()
  {
    return new c();
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.xRk = paramJceInputStream.read(this.xRk, 0, false);
    this.xQB = paramJceInputStream.read(this.xQB, 1, false);
    this.requestType = paramJceInputStream.read(this.requestType, 2, false);
    this.xRl = paramJceInputStream.read(this.xRl, 3, false);
    this.xRm = paramJceInputStream.read(this.xRm, 4, false);
    this.xRn = ((byte[])paramJceInputStream.read(xRt, 5, false));
    this.xRo = paramJceInputStream.read(this.xRo, 6, false);
    this.gBq = paramJceInputStream.read(this.gBq, 7, false);
    this.xRp = paramJceInputStream.read(this.xRp, 8, false);
    this.xRq = ((byte[])paramJceInputStream.read(xRu, 9, false));
    this.xRr = paramJceInputStream.read(this.xRr, 10, false);
    this.xRs = paramJceInputStream.read(this.xRs, 11, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.xRk != 0) {
      paramJceOutputStream.write(this.xRk, 0);
    }
    paramJceOutputStream.write(this.xQB, 1);
    paramJceOutputStream.write(this.requestType, 2);
    if (this.xRl != 0) {
      paramJceOutputStream.write(this.xRl, 3);
    }
    if (this.xRm != 0) {
      paramJceOutputStream.write(this.xRm, 4);
    }
    if (this.xRn != null) {
      paramJceOutputStream.write(this.xRn, 5);
    }
    if (this.xRo != 0) {
      paramJceOutputStream.write(this.xRo, 6);
    }
    if (this.gBq != 0) {
      paramJceOutputStream.write(this.gBq, 7);
    }
    if (this.xRp != 0L) {
      paramJceOutputStream.write(this.xRp, 8);
    }
    if (this.xRq != null) {
      paramJceOutputStream.write(this.xRq, 9);
    }
    if (this.xRr != 0) {
      paramJceOutputStream.write(this.xRr, 10);
    }
    if (this.xRs != 0) {
      paramJceOutputStream.write(this.xRs, 11);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\c\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
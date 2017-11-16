package com.tencent.c.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class b
  extends JceStruct
{
  static byte[] xRg;
  static byte[] xRh;
  static ArrayList<Integer> xRi;
  static ArrayList<byte[]> xRj;
  public int xQN = 0;
  public byte[] xQO = null;
  public String xQP = "";
  public byte[] xQQ = null;
  public long xQR = 0L;
  public String xQS = "";
  public int xQT = 0;
  public String xQU = "";
  public int xQV = 0;
  public String xQW = "";
  public int xQX = 0;
  public int xQY = 0;
  public int xQZ = 0;
  public ArrayList<Integer> xRa = null;
  public int xRb = 0;
  public boolean xRc = false;
  public int xRd = 0;
  public int xRe = 0;
  public ArrayList<byte[]> xRf = null;
  
  static
  {
    byte[] arrayOfByte = (byte[])new byte[1];
    xRg = arrayOfByte;
    ((byte[])arrayOfByte)[0] = 0;
    arrayOfByte = (byte[])new byte[1];
    xRh = arrayOfByte;
    ((byte[])arrayOfByte)[0] = 0;
    xRi = new ArrayList();
    xRi.add(Integer.valueOf(0));
    xRj = new ArrayList();
    arrayOfByte = (byte[])new byte[1];
    ((byte[])arrayOfByte)[0] = 0;
    xRj.add(arrayOfByte);
  }
  
  public final JceStruct newInit()
  {
    return new b();
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.xQN = paramJceInputStream.read(this.xQN, 0, true);
    this.xQO = ((byte[])paramJceInputStream.read(xRg, 1, false));
    this.xQP = paramJceInputStream.readString(2, false);
    this.xQQ = ((byte[])paramJceInputStream.read(xRh, 3, false));
    this.xQR = paramJceInputStream.read(this.xQR, 4, false);
    this.xQS = paramJceInputStream.readString(5, false);
    this.xQT = paramJceInputStream.read(this.xQT, 6, false);
    this.xQU = paramJceInputStream.readString(7, false);
    this.xQV = paramJceInputStream.read(this.xQV, 8, false);
    this.xQW = paramJceInputStream.readString(9, false);
    this.xQX = paramJceInputStream.read(this.xQX, 10, false);
    this.xQY = paramJceInputStream.read(this.xQY, 11, false);
    this.xQZ = paramJceInputStream.read(this.xQZ, 12, false);
    this.xRa = ((ArrayList)paramJceInputStream.read(xRi, 13, false));
    this.xRb = paramJceInputStream.read(this.xRb, 14, false);
    this.xRc = paramJceInputStream.read(this.xRc, 15, false);
    this.xRd = paramJceInputStream.read(this.xRd, 16, false);
    this.xRe = paramJceInputStream.read(this.xRe, 17, false);
    this.xRf = ((ArrayList)paramJceInputStream.read(xRj, 18, false));
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.xQN, 0);
    if (this.xQO != null) {
      paramJceOutputStream.write(this.xQO, 1);
    }
    if (this.xQP != null) {
      paramJceOutputStream.write(this.xQP, 2);
    }
    if (this.xQQ != null) {
      paramJceOutputStream.write(this.xQQ, 3);
    }
    if (this.xQR != 0L) {
      paramJceOutputStream.write(this.xQR, 4);
    }
    if (this.xQS != null) {
      paramJceOutputStream.write(this.xQS, 5);
    }
    if (this.xQT != 0) {
      paramJceOutputStream.write(this.xQT, 6);
    }
    if (this.xQU != null) {
      paramJceOutputStream.write(this.xQU, 7);
    }
    if (this.xQV != 0) {
      paramJceOutputStream.write(this.xQV, 8);
    }
    if (this.xQW != null) {
      paramJceOutputStream.write(this.xQW, 9);
    }
    paramJceOutputStream.write(this.xQX, 10);
    if (this.xQY != 0) {
      paramJceOutputStream.write(this.xQY, 11);
    }
    if (this.xQZ != 0) {
      paramJceOutputStream.write(this.xQZ, 12);
    }
    if (this.xRa != null) {
      paramJceOutputStream.write(this.xRa, 13);
    }
    if (this.xRb != 0) {
      paramJceOutputStream.write(this.xRb, 14);
    }
    paramJceOutputStream.write(this.xRc, 15);
    if (this.xRd != 0) {
      paramJceOutputStream.write(this.xRd, 16);
    }
    paramJceOutputStream.write(this.xRe, 17);
    if (this.xRf != null) {
      paramJceOutputStream.write(this.xRf, 18);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\c\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
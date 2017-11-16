package com.tencent.c.c.a;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class c
  extends JceStruct
{
  static b xQG = new b();
  public String guid = "";
  public String imei = "";
  public String imsi = "";
  public String ip = "";
  public String jxX = "";
  public String lOv = "";
  public double latitude = 0.0D;
  public double longitude = 0.0D;
  public String pCr = "";
  public String xQA = "";
  public int xQB = 0;
  public String xQC = "";
  public String xQD = "";
  public String xQE = "";
  public String xQF = "";
  public String xQp = "";
  public String xQq = "";
  public String xQr = "";
  public int xQs = 0;
  public int xQt = 0;
  public b xQu = null;
  public int xQv = 0;
  public int xQw = 0;
  public int xQx = 0;
  public int xQy = 0;
  public short xQz = 0;
  public String xcd = "";
  
  public final JceStruct newInit()
  {
    return new c();
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.imei = paramJceInputStream.readString(0, true);
    this.xcd = paramJceInputStream.readString(1, false);
    this.jxX = paramJceInputStream.readString(2, false);
    this.ip = paramJceInputStream.readString(3, false);
    this.xQp = paramJceInputStream.readString(4, false);
    this.xQq = paramJceInputStream.readString(5, false);
    this.xQr = paramJceInputStream.readString(6, false);
    this.xQs = paramJceInputStream.read(this.xQs, 7, false);
    this.xQt = paramJceInputStream.read(this.xQt, 8, false);
    this.xQu = ((b)paramJceInputStream.read(xQG, 9, false));
    this.guid = paramJceInputStream.readString(10, false);
    this.imsi = paramJceInputStream.readString(11, false);
    this.xQv = paramJceInputStream.read(this.xQv, 12, false);
    this.xQw = paramJceInputStream.read(this.xQw, 13, false);
    this.xQx = paramJceInputStream.read(this.xQx, 14, false);
    this.xQy = paramJceInputStream.read(this.xQy, 15, false);
    this.lOv = paramJceInputStream.readString(16, false);
    this.xQz = paramJceInputStream.read(this.xQz, 17, false);
    this.longitude = paramJceInputStream.read(this.longitude, 18, false);
    this.latitude = paramJceInputStream.read(this.latitude, 19, false);
    this.xQA = paramJceInputStream.readString(20, false);
    this.xQB = paramJceInputStream.read(this.xQB, 21, false);
    this.xQC = paramJceInputStream.readString(22, false);
    this.xQD = paramJceInputStream.readString(23, false);
    this.pCr = paramJceInputStream.readString(24, false);
    this.xQE = paramJceInputStream.readString(25, false);
    this.xQF = paramJceInputStream.readString(26, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.imei, 0);
    if (this.xcd != null) {
      paramJceOutputStream.write(this.xcd, 1);
    }
    if (this.jxX != null) {
      paramJceOutputStream.write(this.jxX, 2);
    }
    if (this.ip != null) {
      paramJceOutputStream.write(this.ip, 3);
    }
    if (this.xQp != null) {
      paramJceOutputStream.write(this.xQp, 4);
    }
    if (this.xQq != null) {
      paramJceOutputStream.write(this.xQq, 5);
    }
    if (this.xQr != null) {
      paramJceOutputStream.write(this.xQr, 6);
    }
    if (this.xQs != 0) {
      paramJceOutputStream.write(this.xQs, 7);
    }
    if (this.xQt != 0) {
      paramJceOutputStream.write(this.xQt, 8);
    }
    if (this.xQu != null) {
      paramJceOutputStream.write(this.xQu, 9);
    }
    if (this.guid != null) {
      paramJceOutputStream.write(this.guid, 10);
    }
    if (this.imsi != null) {
      paramJceOutputStream.write(this.imsi, 11);
    }
    if (this.xQv != 0) {
      paramJceOutputStream.write(this.xQv, 12);
    }
    if (this.xQw != 0) {
      paramJceOutputStream.write(this.xQw, 13);
    }
    if (this.xQx != 0) {
      paramJceOutputStream.write(this.xQx, 14);
    }
    if (this.xQy != 0) {
      paramJceOutputStream.write(this.xQy, 15);
    }
    if (this.lOv != null) {
      paramJceOutputStream.write(this.lOv, 16);
    }
    if (this.xQz != 0) {
      paramJceOutputStream.write(this.xQz, 17);
    }
    if (this.longitude != 0.0D) {
      paramJceOutputStream.write(this.longitude, 18);
    }
    if (this.latitude != 0.0D) {
      paramJceOutputStream.write(this.latitude, 19);
    }
    if (this.xQA != null) {
      paramJceOutputStream.write(this.xQA, 20);
    }
    if (this.xQB != 0) {
      paramJceOutputStream.write(this.xQB, 21);
    }
    if (this.xQC != null) {
      paramJceOutputStream.write(this.xQC, 22);
    }
    if (this.xQD != null) {
      paramJceOutputStream.write(this.xQD, 23);
    }
    if (this.pCr != null) {
      paramJceOutputStream.write(this.pCr, 24);
    }
    if (this.xQE != null) {
      paramJceOutputStream.write(this.xQE, 25);
    }
    if (this.xQF != null) {
      paramJceOutputStream.write(this.xQF, 26);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\c\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
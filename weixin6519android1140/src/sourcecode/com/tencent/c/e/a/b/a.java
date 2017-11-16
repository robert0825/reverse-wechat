package com.tencent.c.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class a
  extends JceStruct
{
  static ArrayList<e> xSE;
  public int ePH = 0;
  public String esG = "";
  public String gxw = "";
  public String imei = "";
  public String imsi = "";
  public String model = "";
  public int requestType = 0;
  public int sdkVer = 0;
  public int xNS = 0;
  public String xQp = "";
  public int xSA = 0;
  public String xSB = "";
  public String xSC = "";
  public int xSD = 0;
  public long xSx = 0L;
  public String xSy = "";
  public ArrayList<e> xSz = null;
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.xSx = paramJceInputStream.read(this.xSx, 0, true);
    this.xSy = paramJceInputStream.readString(1, true);
    if (xSE == null)
    {
      xSE = new ArrayList();
      e locale = new e();
      xSE.add(locale);
    }
    this.xSz = ((ArrayList)paramJceInputStream.read(xSE, 2, true));
    this.xSA = paramJceInputStream.read(this.xSA, 3, true);
    this.xQp = paramJceInputStream.readString(4, true);
    this.ePH = paramJceInputStream.read(this.ePH, 5, true);
    this.requestType = paramJceInputStream.read(this.requestType, 6, true);
    this.xSB = paramJceInputStream.readString(7, true);
    this.imei = paramJceInputStream.readString(8, false);
    this.imsi = paramJceInputStream.readString(9, false);
    this.gxw = paramJceInputStream.readString(10, false);
    this.model = paramJceInputStream.readString(11, false);
    this.xSC = paramJceInputStream.readString(12, false);
    this.xSD = paramJceInputStream.read(this.xSD, 13, false);
    this.sdkVer = paramJceInputStream.read(this.sdkVer, 14, false);
    this.esG = paramJceInputStream.readString(15, false);
    this.xNS = paramJceInputStream.read(this.xNS, 16, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.xSx, 0);
    paramJceOutputStream.write(this.xSy, 1);
    paramJceOutputStream.write(this.xSz, 2);
    paramJceOutputStream.write(this.xSA, 3);
    paramJceOutputStream.write(this.xQp, 4);
    paramJceOutputStream.write(this.ePH, 5);
    paramJceOutputStream.write(this.requestType, 6);
    paramJceOutputStream.write(this.xSB, 7);
    if (this.imei != null) {
      paramJceOutputStream.write(this.imei, 8);
    }
    if (this.imsi != null) {
      paramJceOutputStream.write(this.imsi, 9);
    }
    if (this.gxw != null) {
      paramJceOutputStream.write(this.gxw, 10);
    }
    if (this.model != null) {
      paramJceOutputStream.write(this.model, 11);
    }
    if (this.xSC != null) {
      paramJceOutputStream.write(this.xSC, 12);
    }
    if (this.xSD != 0) {
      paramJceOutputStream.write(this.xSD, 13);
    }
    if (this.sdkVer != 0) {
      paramJceOutputStream.write(this.sdkVer, 14);
    }
    if (this.esG != null) {
      paramJceOutputStream.write(this.esG, 15);
    }
    paramJceOutputStream.write(this.xNS, 16);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
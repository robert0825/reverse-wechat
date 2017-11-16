package com.tencent.mm.plugin.location.ui.impl;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.protocal.c.ary;

public final class f
{
  public double aED;
  public double aEE;
  public String mDN;
  public String mDO;
  public String mDP;
  public String mDQ;
  public String mDR;
  public String mDS;
  public String mDT;
  public String mDU;
  public String mDV;
  public String mDW;
  public Addr mDX;
  public String mDY;
  public String mDZ;
  public int mEa;
  public String mName;
  public int type;
  
  public f()
  {
    GMTrace.i(9678440366080L, 72110);
    this.mEa = -1;
    GMTrace.o(9678440366080L, 72110);
  }
  
  public f(ary paramary, String paramString)
  {
    GMTrace.i(14285195444224L, 106433);
    this.mEa = -1;
    this.mName = paramary.lPi;
    this.mDN = paramary.uHS;
    this.aEE = paramary.tWm;
    this.aED = paramary.tWn;
    this.mDO = paramary.uHT;
    this.mDP = paramary.nuV;
    this.mDQ = paramary.uHU;
    this.mDR = paramary.gCy;
    this.mDS = paramary.gCz;
    this.mDT = paramary.ufq;
    this.mDU = paramary.ufr;
    this.mDV = paramary.uHV;
    this.mDY = paramString;
    this.mDX = new Addr();
    this.mDX.gEy = this.mDN;
    this.mDX.gEA = this.mDS;
    this.mDX.gEB = this.mDS;
    this.mDX.gEC = this.mDT;
    this.mDX.gEE = this.mDV;
    this.mDX.gEH = this.mName;
    this.mDX.gEz = this.mDR;
    this.mDX.gEK = ((float)paramary.tWm);
    this.mDX.gEJ = ((float)paramary.tWn);
    this.type = 0;
    GMTrace.o(14285195444224L, 106433);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\impl\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
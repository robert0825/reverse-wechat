package com.tencent.mm.plugin.voip.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.voip.b.a;

public final class h
{
  long beginTime;
  int qGA;
  int qGB;
  int qGC;
  int qGD;
  int qGE;
  public long qGF;
  long qGG;
  long qGH;
  long qGI;
  long qGJ;
  public long qGK;
  long qGL;
  long qGM;
  long qGN;
  public int qGe;
  public int qGf;
  public int qGg;
  public int qGh;
  byte qGi;
  byte qGj;
  byte qGk;
  byte qGl;
  byte qGm;
  byte qGn;
  byte qGo;
  int qGp;
  public int qGq;
  public int qGr;
  public int qGs;
  public int qGt;
  public int qGu;
  public int qGv;
  public int qGw;
  int qGx;
  int qGy;
  int qGz;
  
  public h()
  {
    GMTrace.i(5301063385088L, 39496);
    this.beginTime = 0L;
    reset();
    bub();
    GMTrace.o(5301063385088L, 39496);
  }
  
  public final void bua()
  {
    GMTrace.i(5301197602816L, 39497);
    if (this.qGK == 0L) {}
    for (this.qGA = 0;; this.qGA = ((int)(System.currentTimeMillis() - this.qGK)))
    {
      a.dV("MicroMsg.VoipDailReport", "devin:answerInvite current:" + System.currentTimeMillis());
      a.dV("MicroMsg.VoipDailReport", "devin:answerInvite:" + this.qGA);
      GMTrace.o(5301197602816L, 39497);
      return;
    }
  }
  
  public final void bub()
  {
    GMTrace.i(5301466038272L, 39499);
    this.qGF = 0L;
    this.qGJ = 0L;
    this.qGK = 0L;
    this.qGL = 0L;
    this.qGM = 0L;
    this.qGN = 0L;
    this.qGG = 0L;
    this.qGH = 0L;
    this.qGI = 0L;
    this.qGq = 0;
    this.qGr = 0;
    this.qGs = 0;
    this.qGt = 0;
    this.qGu = 0;
    this.qGv = 0;
    this.qGw = 0;
    this.qGx = 0;
    this.qGy = 0;
    this.qGz = 0;
    this.qGA = 0;
    this.qGB = 0;
    this.qGC = 0;
    this.qGD = 0;
    this.qGE = 0;
    GMTrace.o(5301466038272L, 39499);
  }
  
  public final String buc()
  {
    GMTrace.i(5301600256000L, 39500);
    String str = "," + this.qGo;
    GMTrace.o(5301600256000L, 39500);
    return str;
  }
  
  public final void reset()
  {
    GMTrace.i(5301331820544L, 39498);
    this.beginTime = 0L;
    this.qGe = 0;
    this.qGf = 0;
    this.qGg = 0;
    this.qGh = 0;
    this.qGi = 0;
    this.qGj = 0;
    this.qGk = 0;
    this.qGl = 0;
    this.qGm = 0;
    this.qGn = 0;
    this.qGo = 0;
    this.qGp = 0;
    GMTrace.o(5301331820544L, 39498);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
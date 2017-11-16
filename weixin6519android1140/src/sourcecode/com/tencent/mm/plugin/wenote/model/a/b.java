package com.tencent.mm.plugin.wenote.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;

public abstract class b
{
  public String lhq;
  public boolean scH;
  public int scI;
  public int scJ;
  public WXRTEditText scK;
  public WXRTEditText scL;
  public WXRTEditText scM;
  public boolean scN;
  public boolean scO;
  public boolean scP;
  public int scQ;
  public int scR;
  
  public b()
  {
    GMTrace.i(17251944103936L, 128537);
    this.lhq = "";
    this.scH = false;
    this.scI = 0;
    this.scJ = -1;
    this.scN = false;
    this.scO = false;
    this.scP = false;
    this.scQ = 0;
    this.scR = 0;
    GMTrace.o(17251944103936L, 128537);
  }
  
  public abstract String bGS();
  
  public String bGT()
  {
    GMTrace.i(17252346757120L, 128540);
    GMTrace.o(17252346757120L, 128540);
    return "";
  }
  
  public int getType()
  {
    GMTrace.i(17252078321664L, 128538);
    GMTrace.o(17252078321664L, 128538);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
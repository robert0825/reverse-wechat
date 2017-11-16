package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.protocal.c.bcv;
import com.tencent.mm.protocal.c.bcw;

public final class l
  extends c
{
  public l(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(7247891529728L, 54001);
    aBl();
    bcv localbcv = (bcv)this.fUa.gtC.gtK;
    localbcv.appId = paramString1;
    localbcv.luj = paramInt;
    localbcv.eEU = paramString2;
    GMTrace.o(7247891529728L, 54001);
  }
  
  protected final void aBl()
  {
    GMTrace.i(7247623094272L, 53999);
    b.a locala = new b.a();
    locala.gtF = new bcv();
    locala.gtG = new bcw();
    locala.uri = "/cgi-bin/mmo2o-bin/setpcloginuserInfo";
    locala.gtE = 1761;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7247623094272L, 53999);
  }
  
  public final int getType()
  {
    GMTrace.i(7247757312000L, 54000);
    GMTrace.o(7247757312000L, 54000);
    return 1761;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\d\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */